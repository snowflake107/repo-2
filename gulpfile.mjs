// /*
//  * Backpack - Skyscanner's Design System
//  *
//  * Copyright 2016-2021 Skyscanner Ltd
//  *
//  * Licensed under the Apache License, Version 2.0 (the "License");
//  * you may not use this file except in compliance with the License.
//  * You may obtain a copy of the License at
//  *
//  *   http://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing, software
//  * distributed under the License is distributed on an "AS IS" BASIS,
//  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  * See the License for the specific language governing permissions and
//  * limitations under the License.
//  */

import { deleteAsync } from 'del';
import gulp from 'gulp';
import chmod from 'gulp-chmod';
import clone from 'gulp-clone';
import rename from 'gulp-rename';
import ts from 'gulp-typescript';
import ordered from 'ordered-read-streams';

import metadata from './tasks/metadata/index.mjs';
import svgr from './tasks/svgr.mjs';
import createIconMapping from './tasks/metadata/iconMapping.mjs';

gulp.task('clean', () => deleteAsync(['dist']));

const iconReactComponents = (type, size) => {
  let src;
  let dest;
  if (type === 'icons') {
    src = `src/${type}/${size}/*.svg`;
    dest = `dist/js/${type}/${size}`;
  }
  if (type === 'spinners') {
    src = `src/${type}/**/${size}.svg`;
    dest = `dist/js/${type}`;
  }

  if (src === undefined || dest === undefined) {
    throw new Error(`Unrecognised type: ${type}`);
  }

  const svgs = gulp.src(src).pipe(chmod(0o644));

  const tsResult = svgs
    .pipe(clone())
    .pipe(svgr({ size }))
    .pipe(rename({ extname: '.tsx' }))
    .pipe(
      ts({
        noImplicitAny: true,
        jsx: 'preserve',
        target: 'es2020',
        module: 'es2020',
        declaration: true,
        skipLibCheck: true,
        allowSyntheticDefaultImports: true,
      }),
    );

  return ordered([
    tsResult.dts.pipe(gulp.dest(dest)),
    tsResult.js.pipe(gulp.dest(dest)),
  ]);
};

gulp.task('spinners', () =>
  ordered([
    iconReactComponents('spinners', 'sm'),
    iconReactComponents('spinners', 'lg'),
    iconReactComponents('spinners', 'xl'),
  ]),
);

// /*
//   ICONS
// */

gulp.task('icons', () =>
  ordered([
    iconReactComponents('icons', 'sm'),
    iconReactComponents('icons', 'lg'),
  ]),
);

// copy-svgs ignores those in `xl` as we don't want to make them available to web consumers.
gulp.task('copy-svgs', () =>
  ordered([
    gulp
      .src(['src/**/*.svg', '!src/icons/xl/*.svg'])
      .pipe(gulp.dest('dist/svgs')),
    gulp.src(['src/icons/icons.js']).pipe(gulp.dest('dist/svgs')),
  ]),
);

gulp.task('create-metadata', () =>
  gulp.src('src/icons/lg/*.svg').pipe(metadata()).pipe(gulp.dest('dist')),
);

gulp.task('create-iconmapping', createIconMapping);

const allIcons = gulp.parallel('icons', 'copy-svgs');

const allSpinners = gulp.task('spinners');

gulp.task('default', gulp.series(gulp.parallel(allSpinners, allIcons, 'create-metadata'), 'create-iconmapping'));
