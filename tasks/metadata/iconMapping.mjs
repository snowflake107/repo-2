/*
 * Backpack - Skyscanner's Design System
 *
 * Copyright 2016-2021 Skyscanner Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import fs from 'fs';
import path from 'path';

const createIconMapping = (cb) => {
  const iconMapping = {};
  const sm = fs
    .readdirSync('./src/icons/sm')
    .map((name) => `${path.basename(name, '.svg')}-sm`);
  const lg = fs
    .readdirSync('./src/icons/lg')
    .map((name) => path.basename(name, '.svg'));
  const xl = fs
    .readdirSync('./src/icons/xl')
    .map((name) => `${path.basename(name, '.svg')}-xl`);

  [sm, lg, xl].forEach((size) => {
    size.forEach((iconName) => {
      iconMapping[iconName] = iconName;
    });
  });

  fs.writeFileSync('./dist/iconMapping.json', JSON.stringify(iconMapping));
  cb();
};

export default createIconMapping;
