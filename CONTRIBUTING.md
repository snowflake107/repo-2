# Contributing to bpk-svgs

You want to help us enable Skyscanner to create beautiful, coherent products at scale? That's awesome! :heart:

## Table of contents

* [Prerequisites](#prerequisites)
* [Getting started](#getting-started)
* [Adding a new component](#adding-a-new-component)
* [How to](#how-to)

## Prerequisites

### Licence

By contributing your code, you agree to license your contribution under the terms of the [APLv2](./LICENSE).

All files are released with the Apache 2.0 licence.

If you are adding a new file it should have a header comment containing licence information:

<details>
<summary>Show/hide licence header</summary>

```
Backpack - Skyscanner's Design System

Copyright 2016-<current year> Skyscanner Ltd

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

</details>

### Installing Node

bpk-svgs is developed using Node. The required Node version is specified in `.nvmrc`.

If you use [nvm](https://github.com/creationix/nvm) or [nave](https://github.com/isaacs/nave) to manage your Node environment, Backpack has built-in support for these. Just run `nvm use` to install the correct Node version.

## Getting started

### Getting the code

> Skyscanner employees only

Please ensure you have push rights to this repository, rather than forking the repository for contributions. Follow the "Engineering Contribution" guide in the Backpack space in Confluence to get access.

### Install dependencies

Run `npm install` to install dependencies from npm.

## Adding or updating icons

If you want to add or update icons, please discuss them with us first.

Once they're signed off, you can raise a request on our Backpack Requests board and attach the SVG files. If you're feeling heroic and want to make the PR yourself, just copy the correctly named SVG files to the `lg` and `sm` directories in `./src/icons/` and then run `npm run build`.

## How to

<details>
<summary>Create a pull request</summary>

For anything non-trivial, we strongly recommend speaking to somebody from Koala before starting work on a PR. It might even be something we're already working on. After this, follow the steps below.

1. If you are a Skyscanner employee, follow the "Engineering Contribution" guide in the Backpack space in Confluence to get push rights to this repository. Otherwise, you should [fork the repository](https://github.com/Skyscanner/bpk-svgs/fork).
2. Create a new branch.
3. Make your changes.
4. Commit and push your new branch.
5. Submit a [pull request](https://github.com/Skyscanner/bpk-svgs/pulls).
6. Notify someone in Koala squad or drop a note in #backpack.

</details>

<details>
<summary>Run linters manually</summary>

* `npm run lint` to lint JS.
* `npm run lint:js` to lint JS.
* `npm run lint:js:fix` to lint and try to automatically fix any errors.

</details>

<details>
<summary>Publish packages (Backpack squad members only)</summary>

- Publish the latest draft on the [releases pages](https://github.com/Skyscanner/bpk-svgs/releases)
- Ensure CI runs the release workflow successfully
- Once released verify the artifacts are available

</details>

## And finally..

If you have any questions at all, don't hesitate to get in touch. We love to talk all things Backpack and we look forward to seeing your contribution!
