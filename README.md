# bpk-svgs

[![Build Status](https://github.com/Skyscanner/bpk-svgs/workflows/Foundations%20CI/badge.svg)](https://github.com/Skyscanner/bpk-svgs/actions)

> Backpack's collection of SVGs.

## Installation

```sh
npm install @skyscanner/bpk-svgs --save-dev
```

## Usage

This package exposes Backpack SVGs in various formats:

- React components
  ```
  dist/js/icons/lg/*
  dist/js/icons/sm/*
  dist/js/spinners/*
  ```

- Sass variables containing datauri strings
  ```
  dist/scss/_elements.scss
  dist/scss/_icons-lg.scss
  dist/scss/_icons-no-color-lg.scss
  dist/scss/_icons-no-color-sm.scss
  dist/scss/_icons-sm.scss
  dist/scss/_spinners.scss
  ```

- An icon font
  ```
  dist/font/BpkIcon.ttf
  ```

## Contributing

To contribute please see [contributing.md](CONTRIBUTING.md).