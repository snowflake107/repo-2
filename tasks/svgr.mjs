import path from 'path';
import Stream from "stream";

import {transform} from '@svgr/core';
import camelcase from 'camelcase';
import gulpUtil from 'gulp-util';

const { PluginError } = gulpUtil;

const PLUGIN_NAME = "svgr"

const svgoCommonPlugins = [
  { name: 'removeTitle' },
  { name: 'preset-default' },
  { name: 'removeStyleElement' },
  { name: 'removeEmptyContainers' },
  { name: 'sortAttrs' },
  { name: 'removeUselessDefs' },
  { name: 'removeEmptyText' },
  { name: 'removeEditorsNSData' },
  { name: 'removeEmptyAttrs' },
  { name: 'removeHiddenElems' },
  {
    name: 'removeAttrs',
    params: {
      attrs: [
        'id',
        'class',
        'data-name',
        'fill',
        'width',
        'height',
        'fill-rule',
      ],
    }
  },
  {
    name: 'addAttributesToSVGElement',
    params: {
      attributes: [
        {
          'aria-hidden': true,
        },
      ],
    }
  }
];

export default function svgrPipe (options) {
  const sizeMapping = {
    sm: '1rem',
    lg: '1.5rem',
    xl: '2rem',
  };
    const stream = new Stream.Transform({
      objectMode: true
    });


  
    // eslint-disable-next-line no-underscore-dangle, consistent-return
    stream._transform = function streamTransform (file, encoding, cb) {
      if (file.isNull()) {
        return cb(null, file);
      }
  
      if (file.isStream()) {
        return cb(new PluginError(PLUGIN_NAME, 'Streaming not supported'));
      }
      
        
      if (file.isBuffer()) {
        const componentName = path.basename(file.path).replace(".svg", "").concat("-icon"); // eg world--apac-icon
        transform(
            file.contents.toString(),
            { 
              icon: sizeMapping[options.size],
              plugins: ['@svgr/plugin-svgo', '@svgr/plugin-jsx', '@svgr/plugin-prettier'],
              svgoConfig: { plugins: svgoCommonPlugins },
              typescript: true,
              jsxRuntimeImport: {source: "react", defaultSpecifier: "React"},
            },
            { componentName: camelcase(componentName, {pascalCase: true})},
        ).then(jsCode => {
            // eslint-disable-next-line no-param-reassign
            file.contents = Buffer.from(jsCode);
            return cb(null, file);
        })
      } else {
        return cb(new PluginError(PLUGIN_NAME, 'Data type not supported'));
      }
    };
  
    return stream;
  };