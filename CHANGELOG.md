# Changelog

## 0.1.0 (2024-10-16)


### Features

* **ai-explain:** add ai-explain api ([#262](https://github.com/snowflake107/repo-2/issues/262)) ([9785eab](https://github.com/snowflake107/repo-2/commit/9785eab520301f275e6489fda10d1cd77c40df51))
* **ai-help:** add parent short_title for duplicate source titles ([#428](https://github.com/snowflake107/repo-2/issues/428)) ([f523d52](https://github.com/snowflake107/repo-2/commit/f523d5273390f2465b396db1a969bb5baa18e78b))
* **ai-help:** bump GPT-3.5 Turbo model ([#429](https://github.com/snowflake107/repo-2/issues/429)) ([688e35d](https://github.com/snowflake107/repo-2/commit/688e35d8669ea3caa011c3847fb501fc338223c2))
* **ai-help:** bump GPT-4 Turbo model ([#411](https://github.com/snowflake107/repo-2/issues/411)) ([9c9038a](https://github.com/snowflake107/repo-2/commit/9c9038ab258ed5bae635885c56567b425757c619))
* **ai-help:** delete ai history after six months ([#437](https://github.com/snowflake107/repo-2/issues/437)) ([92541a5](https://github.com/snowflake107/repo-2/commit/92541a5af026d31868a3009ab2b35b618b2592cd))
* **ai-help:** log message metadata ([#424](https://github.com/snowflake107/repo-2/issues/424)) ([d035afa](https://github.com/snowflake107/repo-2/commit/d035afa782eb5934be5702c3c8ca173c503cf62e))
* **ai-help:** release 2.0 ([#373](https://github.com/snowflake107/repo-2/issues/373)) ([9499ee9](https://github.com/snowflake107/repo-2/commit/9499ee9a183bed6bf7389bd83494d1f065f916d2))
* **ai-help:** switch to markdown context ([#410](https://github.com/snowflake107/repo-2/issues/410)) ([6d71177](https://github.com/snowflake107/repo-2/commit/6d711779d2c635fe18965422838ae79417d07650))
* **ai-help:** switch to text-embedding-3-small model ([#459](https://github.com/snowflake107/repo-2/issues/459)) ([9b65676](https://github.com/snowflake107/repo-2/commit/9b656762c45bac86a4c8c48c1dbd0e9f82cf39b4))
* **ai-help:** upgrade from GPT-3.5 Turbo to GPT-4o mini ([#546](https://github.com/snowflake107/repo-2/issues/546)) ([0e57060](https://github.com/snowflake107/repo-2/commit/0e57060d7ecf9d5d27d0c8bc5d7eb279adedfeaa))
* **ai-help:** upgrade to GPT-4o model ([#500](https://github.com/snowflake107/repo-2/issues/500)) ([4c9c1e4](https://github.com/snowflake107/repo-2/commit/4c9c1e4c593b2eb414f744792981e76663369f8b))
* **ai-test:** add --no-subscription flag ([#413](https://github.com/snowflake107/repo-2/issues/413)) ([e6874e6](https://github.com/snowflake107/repo-2/commit/e6874e602d488df67d74c44591b42b0e5b486f8c))
* Allow skipping migrations with an environment variable ([8c16255](https://github.com/snowflake107/repo-2/commit/8c1625566b83019ba95a02758590d9ff23e8d70e))
* **info:** add an info endpoint ([#301](https://github.com/snowflake107/repo-2/issues/301)) ([9614323](https://github.com/snowflake107/repo-2/commit/9614323ad0087898775400f5bbb081436b8614d9))
* **newsletter:** support public double opt-in ([#187](https://github.com/snowflake107/repo-2/issues/187)) ([e83d4ad](https://github.com/snowflake107/repo-2/commit/e83d4adf54a77c800f3a438796a5974e55cc3f95))
* **playground:** playground back-end ([#222](https://github.com/snowflake107/repo-2/issues/222)) ([04a67ea](https://github.com/snowflake107/repo-2/commit/04a67ea8452ec7b19752ea94de7aa60acb5b4a54))
* **plus:** add AI Help backend ([#230](https://github.com/snowflake107/repo-2/issues/230)) ([064dedd](https://github.com/snowflake107/repo-2/commit/064deddaa5ebec95d2a53a4c8b46fab276db4c34))
* **plus:** user subscription transitions ([#415](https://github.com/snowflake107/repo-2/issues/415)) ([604b0e7](https://github.com/snowflake107/repo-2/commit/604b0e7e4672e49a3501987aa5faef6ef07686a2))
* **plus:** user subscription transitions ([#421](https://github.com/snowflake107/repo-2/issues/421)) ([5a307ca](https://github.com/snowflake107/repo-2/commit/5a307cac964a693657f40b9d59f02fc837ed4b88))
* **whoami:** add geo.country_iso field + use Google header ([#168](https://github.com/snowflake107/repo-2/issues/168)) ([1df9b4f](https://github.com/snowflake107/repo-2/commit/1df9b4fc85e9a44400bfb4dfe656a73bd963743e))
* **whoami:** expose new maintenance setting ([#185](https://github.com/snowflake107/repo-2/issues/185)) ([065b680](https://github.com/snowflake107/repo-2/commit/065b680880c321faf7b51eeed59b9264229447bd))


### Bug Fixes

* **ai-help:** add qa questions to trigger error ([#450](https://github.com/snowflake107/repo-2/issues/450)) ([7572e5b](https://github.com/snowflake107/repo-2/commit/7572e5b79b88a5f3a454bd9f542266b3957a71fd))
* **ai-help:** add related docs (negate missing) ([#257](https://github.com/snowflake107/repo-2/issues/257)) ([634bf40](https://github.com/snowflake107/repo-2/commit/634bf40d27d9a9f066e9cc1dc9378e020fb6f2d0))
* **ai-help:** artificial error triggers properly in the chat phase ([#452](https://github.com/snowflake107/repo-2/issues/452)) ([deb9d54](https://github.com/snowflake107/repo-2/commit/deb9d5443d4c9e338a6e16fdd94bb6f8bfecebda))
* **ai-help:** avoid spawning thread for history if history is disabled ([#438](https://github.com/snowflake107/repo-2/issues/438)) ([706ce23](https://github.com/snowflake107/repo-2/commit/706ce239d0deb4bbb8acb400806b2e7052c5da74))
* **ai-help:** configurable artificial error triggers ([#445](https://github.com/snowflake107/repo-2/issues/445)) ([9c53f66](https://github.com/snowflake107/repo-2/commit/9c53f66823d75b224d73212b8aa4b61dfa1d7945))
* **ai-help:** fix double decrement ([#550](https://github.com/snowflake107/repo-2/issues/550)) ([78fea88](https://github.com/snowflake107/repo-2/commit/78fea8894059648c6214647c1c3273f959057839))
* **ai-help:** reset user quota on openai api error ([#430](https://github.com/snowflake107/repo-2/issues/430)) ([cd6fdf8](https://github.com/snowflake107/repo-2/commit/cd6fdf8e34b7bc17379e03efa922b99b54f8091d))
* **ai-help:** use GPT-3.5 for free users ([#393](https://github.com/snowflake107/repo-2/issues/393)) ([94262d8](https://github.com/snowflake107/repo-2/commit/94262d845e124b8f5176b314920d7aa81ce57f87))
* **ai:** history fix ([#423](https://github.com/snowflake107/repo-2/issues/423)) ([83f95a5](https://github.com/snowflake107/repo-2/commit/83f95a51dd4f799777291b88044f268a5d5c24f7))
* Appease the linter ([c33e56f](https://github.com/snowflake107/repo-2/commit/c33e56f55dd6f135954fa944136e71aa83dba462))
* **auto-merge:** exclude pre-1.0.0 major changes ([#536](https://github.com/snowflake107/repo-2/issues/536)) ([dab5a4c](https://github.com/snowflake107/repo-2/commit/dab5a4c8f38c62d359e3b831451b5595230e3752))
* **ci:** check dependabot PR user instead of actor ([#552](https://github.com/snowflake107/repo-2/issues/552)) ([5b7fa3b](https://github.com/snowflake107/repo-2/commit/5b7fa3b513d9c2f56bc1f43d4b7649ebadc287ec))
* **clippy:** fix derivable_impls ([#188](https://github.com/snowflake107/repo-2/issues/188)) ([4860b43](https://github.com/snowflake107/repo-2/commit/4860b43556104a584df8775ab53821301c2a4087))
* correct `zh-CN` locale ([#102](https://github.com/snowflake107/repo-2/issues/102)) ([5578fd2](https://github.com/snowflake107/repo-2/commit/5578fd2130c53cfb31fa3b9f7ef587461e9d8eba))
* Do a little better at Rust ([b599e70](https://github.com/snowflake107/repo-2/commit/b599e7087109a4b46b68f21bf2b1b3ac2bf21e87))
* **errors:** Downgrade AI/Playground erors to 400 ([#304](https://github.com/snowflake107/repo-2/issues/304)) ([855094f](https://github.com/snowflake107/repo-2/commit/855094fde7d2dd2793d1f6060aad89dafc83e793))
* **newsletter:** validate email ([#454](https://github.com/snowflake107/repo-2/issues/454)) ([cd7c0f9](https://github.com/snowflake107/repo-2/commit/cd7c0f95460a061baa7688559aa89f73baf42ee4))
* **play:** don't panic on to short id ([#273](https://github.com/snowflake107/repo-2/issues/273)) ([46015de](https://github.com/snowflake107/repo-2/commit/46015de19d30f87b9e5ea3287f0c474243eaf1c5))
* **plus:** user subscription transitions ([#417](https://github.com/snowflake107/repo-2/issues/417)) ([47b5a0b](https://github.com/snowflake107/repo-2/commit/47b5a0b1d3d3bb8ed3267ccc4e9546c090fab33a))
* **settings:** sync dev template ([#116](https://github.com/snowflake107/repo-2/issues/116)) ([3c1189a](https://github.com/snowflake107/repo-2/commit/3c1189aeb63a7a7fa4ede41d58580a403aceb8fa))
* **tests:** add 10ms delay after we are done with stubr ([#408](https://github.com/snowflake107/repo-2/issues/408)) ([18d8fda](https://github.com/snowflake107/repo-2/commit/18d8fda52e2c419b9aeda7b3546704208d761f1f))
* **updates:** continue on release without date, not break ([#447](https://github.com/snowflake107/repo-2/issues/447)) ([c0949ca](https://github.com/snowflake107/repo-2/commit/c0949ca083be84d5f27bcee8feb8966162250e59))
* **workflows:** print deploy command with correct revision ([#60](https://github.com/snowflake107/repo-2/issues/60)) ([f2c5372](https://github.com/snowflake107/repo-2/commit/f2c5372e17add2e7d864b63963f82930680c133a))


### Enhancements

* **ai-help:** Don't answer if no refs ([#277](https://github.com/snowflake107/repo-2/issues/277)) ([5f9bb64](https://github.com/snowflake107/repo-2/commit/5f9bb647928659a775a8b632f08f04ddbd45a6fe))
* **ai-help:** format answers to off-topic questions ([#427](https://github.com/snowflake107/repo-2/issues/427)) ([a545d66](https://github.com/snowflake107/repo-2/commit/a545d66e1d91c9d0d76d89f85e459cc1fa34f5eb))
* **ai-help:** record embedding duration and model separately ([#458](https://github.com/snowflake107/repo-2/issues/458)) ([20760b2](https://github.com/snowflake107/repo-2/commit/20760b2676f85deb04797f29a1e075d9b42f4ccf))
* **ai-test:** skip prompts for which result exists ([#490](https://github.com/snowflake107/repo-2/issues/490)) ([38a4c2d](https://github.com/snowflake107/repo-2/commit/38a4c2d1eedfaf75d8e0f4e6b6527b1f0a7e2838))
* **release-please:** take enhance/chore commits into consideration ([#282](https://github.com/snowflake107/repo-2/issues/282)) ([f3dd4b1](https://github.com/snowflake107/repo-2/commit/f3dd4b14028695598ed8c4c98d2791994fb1afad))


### Build

* **deps:** bump actix-http from 3.3.1 to 3.4.0 ([#343](https://github.com/snowflake107/repo-2/issues/343)) ([4d5ba06](https://github.com/snowflake107/repo-2/commit/4d5ba06816d2467df5badf32d2e25afaf7402460))
* **deps:** bump actix-http from 3.7.0 to 3.8.0 ([#525](https://github.com/snowflake107/repo-2/issues/525)) ([3349f2a](https://github.com/snowflake107/repo-2/commit/3349f2a8e02d568cb56da071b8c62f9cbce753b5))
* **deps:** bump actix-identity from 0.7.0 to 0.7.1 ([#436](https://github.com/snowflake107/repo-2/issues/436)) ([ca549ce](https://github.com/snowflake107/repo-2/commit/ca549cec0198a7a320d02c503ddccb77bfccb3ee))
* **deps:** bump actix-rt from 2.8.0 to 2.9.0 ([#335](https://github.com/snowflake107/repo-2/issues/335)) ([e8ae3cc](https://github.com/snowflake107/repo-2/commit/e8ae3ccfa3991d27511c2009565a79be9f1f867e))
* **deps:** bump actix-rt from 2.9.0 to 2.10.0 ([#518](https://github.com/snowflake107/repo-2/issues/518)) ([bcfb35d](https://github.com/snowflake107/repo-2/commit/bcfb35d657bc3e4d8e85d4ae53290033645a1767))
* **deps:** bump actix-session/identity ([#366](https://github.com/snowflake107/repo-2/issues/366)) ([65df4aa](https://github.com/snowflake107/repo-2/commit/65df4aa72b1b0cc1ba5941e394a0e7173882bdfb))
* **deps:** bump actix-web from 4.3.1 to 4.4.0 ([#347](https://github.com/snowflake107/repo-2/issues/347)) ([c7d15c0](https://github.com/snowflake107/repo-2/commit/c7d15c0f0e75e0c3353da377458e4b62e4e0f1a8))
* **deps:** bump actix-web from 4.5.1 to 4.6.0 ([#506](https://github.com/snowflake107/repo-2/issues/506)) ([6fdf3dc](https://github.com/snowflake107/repo-2/commit/6fdf3dc3d05213e068ecd6f578f629b0dfde1751))
* **deps:** bump actix-web from 4.6.0 to 4.7.0 ([#519](https://github.com/snowflake107/repo-2/issues/519)) ([3935983](https://github.com/snowflake107/repo-2/commit/3935983124a11d882c6c165aade2a3b4bd65d8c8))
* **deps:** bump actix-web from 4.7.0 to 4.8.0 ([#526](https://github.com/snowflake107/repo-2/issues/526)) ([f9e78a2](https://github.com/snowflake107/repo-2/commit/f9e78a2f1ef1c593b71ed67ebcb311a9b9ea5958))
* **deps:** bump actix-web-httpauth from 0.8.0 to 0.8.1 ([#365](https://github.com/snowflake107/repo-2/issues/365)) ([8884871](https://github.com/snowflake107/repo-2/commit/8884871693f0ac659a4290ca3a861fad18ec0c68))
* **deps:** bump actix-web-httpauth from 0.8.1 to 0.8.2 ([#522](https://github.com/snowflake107/repo-2/issues/522)) ([44093e9](https://github.com/snowflake107/repo-2/commit/44093e9caadb2df8dacb2c9f62966a5194b430e2))
* **deps:** bump actix-web-lab from 0.20.2 to 0.22.0 ([#553](https://github.com/snowflake107/repo-2/issues/553)) ([a5f54f2](https://github.com/snowflake107/repo-2/commit/a5f54f287f1afc1975ed46aa0c95b9d4080c5e43))
* **deps:** bump aes-gcm from 0.10.2 to 0.10.3 ([#367](https://github.com/snowflake107/repo-2/issues/367)) ([ee52af9](https://github.com/snowflake107/repo-2/commit/ee52af92cb14c90b7c8aacbee283ab0deecf7f18))
* **deps:** bump anyhow from 1.0.69 to 1.0.71 ([#208](https://github.com/snowflake107/repo-2/issues/208)) ([80f07a4](https://github.com/snowflake107/repo-2/commit/80f07a410e7ad5120ebd6337619508387a8c8ea3))
* **deps:** bump anyhow from 1.0.71 to 1.0.72 ([#294](https://github.com/snowflake107/repo-2/issues/294)) ([2fcae17](https://github.com/snowflake107/repo-2/commit/2fcae17fe7e9f04cc126c0f45aa40793d5552f30))
* **deps:** bump anyhow from 1.0.74 to 1.0.75 ([#327](https://github.com/snowflake107/repo-2/issues/327)) ([26bc220](https://github.com/snowflake107/repo-2/commit/26bc22095e6a54063bb11d827d0ef21400fd3026))
* **deps:** bump anyhow from 1.0.80 to 1.0.82 ([#485](https://github.com/snowflake107/repo-2/issues/485)) ([dce448c](https://github.com/snowflake107/repo-2/commit/dce448c8a8998a04b81625aa3551d2eb57749092))
* **deps:** bump anyhow from 1.0.82 to 1.0.83 ([#497](https://github.com/snowflake107/repo-2/issues/497)) ([cdd4a56](https://github.com/snowflake107/repo-2/commit/cdd4a5618860a076f04b56a7f87dba2de2f1beb8))
* **deps:** bump anyhow from 1.0.83 to 1.0.86 ([#505](https://github.com/snowflake107/repo-2/issues/505)) ([7a0bdb8](https://github.com/snowflake107/repo-2/commit/7a0bdb8098babb1d52f8710c0f254f97f6006831))
* **deps:** bump async-openai from 0.11.0 to 0.11.1 ([#298](https://github.com/snowflake107/repo-2/issues/298)) ([9b1a23c](https://github.com/snowflake107/repo-2/commit/9b1a23cf7e463a4238d60519ff74da5b6c2348b8))
* **deps:** bump async-openai from 0.12.1 to 0.12.2 ([#307](https://github.com/snowflake107/repo-2/issues/307)) ([76c73f7](https://github.com/snowflake107/repo-2/commit/76c73f7c6fbf6221e54d5f676b3d4d30c1cf435f))
* **deps:** bump async-openai from 0.13.0 to 0.14.0 ([#333](https://github.com/snowflake107/repo-2/issues/333)) ([40c545a](https://github.com/snowflake107/repo-2/commit/40c545a20e1c555e7ed21a83cd19823e86bc80ce))
* **deps:** bump async-openai from 0.14.0 to 0.14.1 ([#354](https://github.com/snowflake107/repo-2/issues/354)) ([5666aa7](https://github.com/snowflake107/repo-2/commit/5666aa7af54cb92d209fe8a544974e5ead5efb90))
* **deps:** bump async-openai from 0.14.1 to 0.14.2 ([#361](https://github.com/snowflake107/repo-2/issues/361)) ([8767010](https://github.com/snowflake107/repo-2/commit/8767010ce9a1632d51169387cb4c4ae7589bbc90))
* **deps:** bump async-openai from 0.14.2 to 0.14.3 ([#368](https://github.com/snowflake107/repo-2/issues/368)) ([265429e](https://github.com/snowflake107/repo-2/commit/265429ec9a7a1396b5c643d799af88d8a8399aad))
* **deps:** bump base64 from 0.21.0 to 0.21.1 ([#213](https://github.com/snowflake107/repo-2/issues/213)) ([929b672](https://github.com/snowflake107/repo-2/commit/929b672596a37f23d1637c76ae4f17e5d336739c))
* **deps:** bump base64 from 0.21.1 to 0.21.2 ([#219](https://github.com/snowflake107/repo-2/issues/219)) ([29360da](https://github.com/snowflake107/repo-2/commit/29360dad40996429318fca8bc7fa1d91d14f8aba))
* **deps:** bump base64 from 0.21.2 to 0.21.3 ([#341](https://github.com/snowflake107/repo-2/issues/341)) ([38d08cf](https://github.com/snowflake107/repo-2/commit/38d08cf5eb0779e06de906c1778bc2b7aa5d2198))
* **deps:** bump base64 from 0.21.3 to 0.21.4 ([#356](https://github.com/snowflake107/repo-2/issues/356)) ([3fbaa45](https://github.com/snowflake107/repo-2/commit/3fbaa45e86065a3b6c2d75b476f8a7aea0d33d98))
* **deps:** bump base64 from 0.21.7 to 0.22.0 ([#435](https://github.com/snowflake107/repo-2/issues/435)) ([3e9fac4](https://github.com/snowflake107/repo-2/commit/3e9fac422ef638f688dbd3a7df3fbc2e3a0eeceb))
* **deps:** bump base64 from 0.22.0 to 0.22.1 ([#495](https://github.com/snowflake107/repo-2/issues/495)) ([75449ba](https://github.com/snowflake107/repo-2/commit/75449ba245e5b13e79f7c4e0e2b49f908f0ab6f3))
* **deps:** bump cadence from 0.29.0 to 0.29.1 ([#215](https://github.com/snowflake107/repo-2/issues/215)) ([a26f977](https://github.com/snowflake107/repo-2/commit/a26f977872cd98318bfcc5d4f4d5394764258646))
* **deps:** bump cadence from 1.1.0 to 1.2.0 ([#426](https://github.com/snowflake107/repo-2/issues/426)) ([0425bda](https://github.com/snowflake107/repo-2/commit/0425bda3bfadac4095225512d939ba64eec03686))
* **deps:** bump cadence from 1.2.0 to 1.3.0 ([#470](https://github.com/snowflake107/repo-2/issues/470)) ([7ffcfe8](https://github.com/snowflake107/repo-2/commit/7ffcfe8c82afcd6cf2f736f313821d5afb0b6c9a))
* **deps:** bump cadence from 1.3.0 to 1.4.0 ([#494](https://github.com/snowflake107/repo-2/issues/494)) ([ffb9c92](https://github.com/snowflake107/repo-2/commit/ffb9c92fbfb42e0cc158c9bd8d97fd240435b525))
* **deps:** bump chrono from 0.4.23 to 0.4.24 ([#209](https://github.com/snowflake107/repo-2/issues/209)) ([a64b9c4](https://github.com/snowflake107/repo-2/commit/a64b9c4fe32108d89ca05eedace47071f8e56c2e))
* **deps:** bump chrono from 0.4.24 to 0.4.25 ([#226](https://github.com/snowflake107/repo-2/issues/226)) ([0e87127](https://github.com/snowflake107/repo-2/commit/0e871279585b33daf410cf6625761e90002d8a72))
* **deps:** bump chrono from 0.4.25 to 0.4.26 ([#228](https://github.com/snowflake107/repo-2/issues/228)) ([b3b3cf0](https://github.com/snowflake107/repo-2/commit/b3b3cf0a4349531ed12a9713f7ef6b0bf6656a77))
* **deps:** bump chrono from 0.4.26 to 0.4.30 ([#349](https://github.com/snowflake107/repo-2/issues/349)) ([18682a7](https://github.com/snowflake107/repo-2/commit/18682a7ddc0d5e34b11056f46a1bace926b6bdb2))
* **deps:** bump chrono from 0.4.30 to 0.4.31 ([#363](https://github.com/snowflake107/repo-2/issues/363)) ([1f15861](https://github.com/snowflake107/repo-2/commit/1f15861ba33b9e383678009970c7627c95b0b436))
* **deps:** bump chrono from 0.4.34 to 0.4.37 ([#457](https://github.com/snowflake107/repo-2/issues/457)) ([6b79a11](https://github.com/snowflake107/repo-2/commit/6b79a11f4e09d20e5991b8d1921e8de5c773db20))
* **deps:** bump chrono from 0.4.37 to 0.4.38 ([#483](https://github.com/snowflake107/repo-2/issues/483)) ([24cc08f](https://github.com/snowflake107/repo-2/commit/24cc08f0f71ad7ffc1d7796be29e6f232580da94))
* **deps:** bump clap from 4.5.1 to 4.5.7 ([#520](https://github.com/snowflake107/repo-2/issues/520)) ([7292407](https://github.com/snowflake107/repo-2/commit/729240790edfafe34b3a6bea95be0e7b50a8e6f4))
* **deps:** bump clap from 4.5.7 to 4.5.8 ([#532](https://github.com/snowflake107/repo-2/issues/532)) ([af00939](https://github.com/snowflake107/repo-2/commit/af009392dbdf0f35d31905378e8136652793f3af))
* **deps:** bump clap from 4.5.8 to 4.5.9 ([#538](https://github.com/snowflake107/repo-2/issues/538)) ([9a708f8](https://github.com/snowflake107/repo-2/commit/9a708f8d557a8f70f07a7547356f5e4c472de422))
* **deps:** bump const_format from 0.2.30 to 0.2.31 ([#225](https://github.com/snowflake107/repo-2/issues/225)) ([af89d87](https://github.com/snowflake107/repo-2/commit/af89d87f67cb404b463652bc9c8580b440bc8803))
* **deps:** bump curve25519-dalek from 4.1.2 to 4.1.3 ([#523](https://github.com/snowflake107/repo-2/issues/523)) ([b8b988f](https://github.com/snowflake107/repo-2/commit/b8b988f07eadd53a677ca4ee77bb4ae062c83fed))
* **deps:** bump diesel from 2.0.3 to 2.0.4 ([#204](https://github.com/snowflake107/repo-2/issues/204)) ([2e0e4c9](https://github.com/snowflake107/repo-2/commit/2e0e4c9f6f16d8bed18b4cba532f25b7fcd38047))
* **deps:** bump diesel from 2.1.0 to 2.1.1 ([#339](https://github.com/snowflake107/repo-2/issues/339)) ([1896421](https://github.com/snowflake107/repo-2/commit/1896421d3e9c97f811ed3a412e469edd4e8dcd14))
* **deps:** bump diesel from 2.1.1 to 2.1.2 ([#369](https://github.com/snowflake107/repo-2/issues/369)) ([f450b64](https://github.com/snowflake107/repo-2/commit/f450b64a4b010e7ca85a168c234e64ae75fd2e53))
* **deps:** bump diesel from 2.1.2 to 2.1.4 ([#387](https://github.com/snowflake107/repo-2/issues/387)) ([18bb459](https://github.com/snowflake107/repo-2/commit/18bb459fe01369243c95f3071c9fe34e502ba5dd))
* **deps:** bump diesel from 2.1.4 to 2.1.5 ([#467](https://github.com/snowflake107/repo-2/issues/467)) ([58eef65](https://github.com/snowflake107/repo-2/commit/58eef652f74046ca9bf44363e73ce589692d3e78))
* **deps:** bump diesel from 2.1.5 to 2.1.6 ([#486](https://github.com/snowflake107/repo-2/issues/486)) ([29a21a7](https://github.com/snowflake107/repo-2/commit/29a21a7e482675b491f9f225a2875135287061cb))
* **deps:** bump diesel_migrations from 2.0.0 to 2.1.0 ([#224](https://github.com/snowflake107/repo-2/issues/224)) ([4177ef4](https://github.com/snowflake107/repo-2/commit/4177ef44a2601eec46621b18c03cfc6a1ee82f6c))
* **deps:** bump diesel_migrations from 2.1.0 to 2.2.0 ([#513](https://github.com/snowflake107/repo-2/issues/513)) ([9a5df54](https://github.com/snowflake107/repo-2/commit/9a5df5421192bd6ea2516cb4f27e474b2b293900))
* **deps:** bump diesel-derive-enum from 2.0.1 to 2.1.0 ([#229](https://github.com/snowflake107/repo-2/issues/229)) ([60de8bb](https://github.com/snowflake107/repo-2/commit/60de8bbfbcfcd1fa70a497ac6e62d1e503822886))
* **deps:** bump elasticsearch from 7.14.0-alpha.1 to 7.17.7-alpha.1 ([#297](https://github.com/snowflake107/repo-2/issues/297)) ([33cfc97](https://github.com/snowflake107/repo-2/commit/33cfc97713b5e281ba8381de6c9f916dc14bc51a))
* **deps:** bump form_urlencoded from 1.1.0 to 1.2.0 ([#233](https://github.com/snowflake107/repo-2/issues/233)) ([776ebad](https://github.com/snowflake107/repo-2/commit/776ebad8014523dce3b44c08bfdb060f7a7d6b6a))
* **deps:** bump futures from 0.3.26 to 0.3.28 ([#265](https://github.com/snowflake107/repo-2/issues/265)) ([03d6a08](https://github.com/snowflake107/repo-2/commit/03d6a08c32766846661d974fc4cd32846df9f8cb))
* **deps:** bump hostname from 0.3.1 to 0.4.0 ([#482](https://github.com/snowflake107/repo-2/issues/482)) ([99bde57](https://github.com/snowflake107/repo-2/commit/99bde57e3ed3c9ad9070758839887ffacf91f53f))
* **deps:** bump itertools from 0.10.5 to 0.11.0 ([#254](https://github.com/snowflake107/repo-2/issues/254)) ([d43021b](https://github.com/snowflake107/repo-2/commit/d43021b7f8a726f51b744b6f26fd7b4d89da479f))
* **deps:** bump itertools from 0.11.0 to 0.12.1 ([#412](https://github.com/snowflake107/repo-2/issues/412)) ([1359e6c](https://github.com/snowflake107/repo-2/commit/1359e6cc59cf4e46a1ead39746f7ab1b2063c01a))
* **deps:** bump itertools from 0.12.1 to 0.13.0 ([#504](https://github.com/snowflake107/repo-2/issues/504)) ([4da2943](https://github.com/snowflake107/repo-2/commit/4da2943e0487080e6997b61d6bf2da4e33c5bbd1))
* **deps:** bump jsonwebtoken from 9.2.0 to 9.3.0 ([#468](https://github.com/snowflake107/repo-2/issues/468)) ([dc62b60](https://github.com/snowflake107/repo-2/commit/dc62b60030be163b41f69aab3f64bd59e2ca1214))
* **deps:** bump octocrab from 0.25.0 to 0.25.1 ([#239](https://github.com/snowflake107/repo-2/issues/239)) ([df2b03c](https://github.com/snowflake107/repo-2/commit/df2b03c2211cb8203210ac270925b6443d383b67))
* **deps:** bump octocrab from 0.25.1 to 0.26.0 ([#289](https://github.com/snowflake107/repo-2/issues/289)) ([4c0c961](https://github.com/snowflake107/repo-2/commit/4c0c961b991e0e6b975391f32fdd07c6ffe43d8b))
* **deps:** bump octocrab from 0.26.0 to 0.27.0 ([#296](https://github.com/snowflake107/repo-2/issues/296)) ([afd7d04](https://github.com/snowflake107/repo-2/commit/afd7d04219d3ed274cbf4b995091efc8d32d6f8d))
* **deps:** bump octocrab from 0.27.0 to 0.28.0 ([#300](https://github.com/snowflake107/repo-2/issues/300)) ([453af5b](https://github.com/snowflake107/repo-2/commit/453af5b22d687c215d1708125c2a16633b106c5c))
* **deps:** bump octocrab from 0.28.0 to 0.29.1 ([#313](https://github.com/snowflake107/repo-2/issues/313)) ([7bc8019](https://github.com/snowflake107/repo-2/commit/7bc8019a966a104c74ff79279105fbcc35db3c5b))
* **deps:** bump octocrab from 0.29.1 to 0.29.2 ([#320](https://github.com/snowflake107/repo-2/issues/320)) ([6aa21fb](https://github.com/snowflake107/repo-2/commit/6aa21fb7814c1d820371da5b896be11764001416))
* **deps:** bump octocrab from 0.29.2 to 0.29.3 ([#324](https://github.com/snowflake107/repo-2/issues/324)) ([1d376d4](https://github.com/snowflake107/repo-2/commit/1d376d4b16ef3a6b4c60284f63c71de0e14d8833))
* **deps:** bump octocrab from 0.29.3 to 0.30.1 ([#351](https://github.com/snowflake107/repo-2/issues/351)) ([0ce7776](https://github.com/snowflake107/repo-2/commit/0ce77764d9ab70a9caf10cf7a347c5e8dbe32d26))
* **deps:** bump octocrab from 0.30.1 to 0.32.0 ([#389](https://github.com/snowflake107/repo-2/issues/389)) ([697a725](https://github.com/snowflake107/repo-2/commit/697a72568743d07aeb5527d1b87095f778abb321))
* **deps:** bump octocrab from 0.34.1 to 0.37.0 ([#456](https://github.com/snowflake107/repo-2/issues/456)) ([e5d7ab3](https://github.com/snowflake107/repo-2/commit/e5d7ab313dd89e9aedfdac7efd60bb20d5504bd4))
* **deps:** bump octocrab from 0.37.0 to 0.38.0 ([#479](https://github.com/snowflake107/repo-2/issues/479)) ([0a642bd](https://github.com/snowflake107/repo-2/commit/0a642bd084733baa7c317e3c7d840e906b22fa6e))
* **deps:** bump once_cell from 1.17.1 to 1.17.2 ([#227](https://github.com/snowflake107/repo-2/issues/227)) ([5a8bf2a](https://github.com/snowflake107/repo-2/commit/5a8bf2a8a6fbcd77ac75c48bc43c5706f1f1dc21))
* **deps:** bump once_cell from 1.17.2 to 1.18.0 ([#231](https://github.com/snowflake107/repo-2/issues/231)) ([b50c7f1](https://github.com/snowflake107/repo-2/commit/b50c7f1173b67ba7fab2b096b28110b639c41071))
* **deps:** bump openidconnect from 2.5.1 to 3.0.0 ([#199](https://github.com/snowflake107/repo-2/issues/199)) ([bb47aed](https://github.com/snowflake107/repo-2/commit/bb47aed918827b322201adffdd73ec1773fe2efb))
* **deps:** bump openidconnect from 3.0.0 to 3.1.1 ([#223](https://github.com/snowflake107/repo-2/issues/223)) ([1c2476a](https://github.com/snowflake107/repo-2/commit/1c2476a1ff9b92ea3a2169e0caf0bbecf4163d74))
* **deps:** bump openidconnect from 3.1.1 to 3.2.0 ([#234](https://github.com/snowflake107/repo-2/issues/234)) ([0c87082](https://github.com/snowflake107/repo-2/commit/0c87082abd4533ca92696735bbc0238c8d4db835))
* **deps:** bump openidconnect from 3.2.0 to 3.3.0 ([#288](https://github.com/snowflake107/repo-2/issues/288)) ([7427c10](https://github.com/snowflake107/repo-2/commit/7427c107c148d550bb9da73732c2aca601b7e165))
* **deps:** bump openidconnect from 3.3.0 to 3.3.1 ([#355](https://github.com/snowflake107/repo-2/issues/355)) ([4af2a21](https://github.com/snowflake107/repo-2/commit/4af2a21b30ed421b225f23f2c56a668d350e21b9))
* **deps:** bump openssl from 0.10.48 to 0.10.55 ([#252](https://github.com/snowflake107/repo-2/issues/252)) ([9caa8b2](https://github.com/snowflake107/repo-2/commit/9caa8b261ac7d2f0d468c1d9b53eb020bd87f2ba))
* **deps:** bump openssl from 0.10.56 to 0.10.63 ([#401](https://github.com/snowflake107/repo-2/issues/401)) ([467da23](https://github.com/snowflake107/repo-2/commit/467da236edcb19f3f56d3d66e19c342e9137a786))
* **deps:** bump openssl from 0.10.64 to 0.10.66 ([#543](https://github.com/snowflake107/repo-2/issues/543)) ([916ecad](https://github.com/snowflake107/repo-2/commit/916ecad2b5c11a50690c3b8904ec06f7cc3451fa))
* **deps:** bump pgvector from 0.2.2 to 0.3.2 ([#403](https://github.com/snowflake107/repo-2/issues/403)) ([cefcdcb](https://github.com/snowflake107/repo-2/commit/cefcdcb6635784c71e716466e5365426feb2279a))
* **deps:** bump pgvector from 0.3.2 to 0.3.3 ([#529](https://github.com/snowflake107/repo-2/issues/529)) ([948b9fd](https://github.com/snowflake107/repo-2/commit/948b9fdaf1d0b0068ba6e71595ce89ccffc48c80))
* **deps:** bump pgvector from 0.3.3 to 0.3.4 ([#542](https://github.com/snowflake107/repo-2/issues/542)) ([08eeb89](https://github.com/snowflake107/repo-2/commit/08eeb89936737f5fd32a9470f15099de5ca9ea79))
* **deps:** bump regex from 1.10.3 to 1.10.4 ([#465](https://github.com/snowflake107/repo-2/issues/465)) ([cd21515](https://github.com/snowflake107/repo-2/commit/cd215152688f0c85150dec211e22306723018f09))
* **deps:** bump regex from 1.10.4 to 1.10.5 ([#517](https://github.com/snowflake107/repo-2/issues/517)) ([d97221a](https://github.com/snowflake107/repo-2/commit/d97221a9768f5dfdd8621466650b8648a4be1ebe))
* **deps:** bump regex from 1.7.3 to 1.8.1 ([#210](https://github.com/snowflake107/repo-2/issues/210)) ([21c5bb6](https://github.com/snowflake107/repo-2/commit/21c5bb6e97a68f2f1f51894a3d913fa34bfca3c9))
* **deps:** bump regex from 1.8.1 to 1.8.2 ([#214](https://github.com/snowflake107/repo-2/issues/214)) ([18ea2b8](https://github.com/snowflake107/repo-2/commit/18ea2b8fe4726475126d32a670f5d61a1f0f5dee))
* **deps:** bump regex from 1.8.2 to 1.8.3 ([#221](https://github.com/snowflake107/repo-2/issues/221)) ([4ad74e1](https://github.com/snowflake107/repo-2/commit/4ad74e1b75c65757e72aa9e6b509b07e15909550))
* **deps:** bump regex from 1.8.3 to 1.8.4 ([#235](https://github.com/snowflake107/repo-2/issues/235)) ([670d841](https://github.com/snowflake107/repo-2/commit/670d8411abeb30d77bb4a461dbfea77ad8d78f82))
* **deps:** bump regex from 1.8.4 to 1.9.0 ([#276](https://github.com/snowflake107/repo-2/issues/276)) ([c99dfd2](https://github.com/snowflake107/repo-2/commit/c99dfd264f0d5d9ac890184e2fea74af1ec48e62))
* **deps:** bump regex from 1.9.0 to 1.9.1 ([#284](https://github.com/snowflake107/repo-2/issues/284)) ([cc55b73](https://github.com/snowflake107/repo-2/commit/cc55b731bca99955ad642ca1638a17bb54bf2467))
* **deps:** bump regex from 1.9.1 to 1.9.3 ([#316](https://github.com/snowflake107/repo-2/issues/316)) ([5e27eee](https://github.com/snowflake107/repo-2/commit/5e27eee627caa707afe5c93b87d7739a5e47f443))
* **deps:** bump regex from 1.9.3 to 1.9.4 ([#336](https://github.com/snowflake107/repo-2/issues/336)) ([edd98a0](https://github.com/snowflake107/repo-2/commit/edd98a02fdeb138832debb176b133a88b6a20789))
* **deps:** bump regex from 1.9.4 to 1.9.5 ([#352](https://github.com/snowflake107/repo-2/issues/352)) ([b67da20](https://github.com/snowflake107/repo-2/commit/b67da202cc54466c77db460c148f247d7494d079))
* **deps:** bump regex from 1.9.5 to 1.9.6 ([#372](https://github.com/snowflake107/repo-2/issues/372)) ([6accbbf](https://github.com/snowflake107/repo-2/commit/6accbbfb994cb80ad2302f2ce6c3ba16f75044b4))
* **deps:** bump regex from 1.9.6 to 1.10.3 ([#396](https://github.com/snowflake107/repo-2/issues/396)) ([6e90915](https://github.com/snowflake107/repo-2/commit/6e9091540429db004b67522cf8392f2aa2999046))
* **deps:** bump reqwest from 0.11.14 to 0.11.17 ([#190](https://github.com/snowflake107/repo-2/issues/190)) ([45efe7d](https://github.com/snowflake107/repo-2/commit/45efe7de7bfb5e71ae2a2e872e8fe73c87d1bcfb))
* **deps:** bump reqwest from 0.11.17 to 0.11.18 ([#206](https://github.com/snowflake107/repo-2/issues/206)) ([d4ba549](https://github.com/snowflake107/repo-2/commit/d4ba54944a6a9247cec12535114b9811615230f1))
* **deps:** bump reqwest from 0.11.18 to 0.11.19 ([#330](https://github.com/snowflake107/repo-2/issues/330)) ([5633429](https://github.com/snowflake107/repo-2/commit/5633429452c6edb7ebf8f2016a6b69a34691718a))
* **deps:** bump reqwest from 0.11.19 to 0.11.20 ([#334](https://github.com/snowflake107/repo-2/issues/334)) ([c1390e2](https://github.com/snowflake107/repo-2/commit/c1390e2a5847bc72be30c33aaaf647ad58412859))
* **deps:** bump reqwest from 0.11.20 to 0.11.23 ([#392](https://github.com/snowflake107/repo-2/issues/392)) ([d4f6f6b](https://github.com/snowflake107/repo-2/commit/d4f6f6b2bd454b71edc87ff548b8d7f2fab02cd8))
* **deps:** bump rustix from 0.37.23 to 0.37.27 ([#399](https://github.com/snowflake107/repo-2/issues/399)) ([76cf123](https://github.com/snowflake107/repo-2/commit/76cf12386d1e08d19bb17f42d894bbfe0567932d))
* **deps:** bump rustls from 0.21.10 to 0.21.11 ([#476](https://github.com/snowflake107/repo-2/issues/476)) ([fc1cf4d](https://github.com/snowflake107/repo-2/commit/fc1cf4d6b0ba3d0c31bdadb8fedd4d3130577f5d))
* **deps:** bump rustls-webpki from 0.101.3 to 0.101.4 ([#331](https://github.com/snowflake107/repo-2/issues/331)) ([f2b318b](https://github.com/snowflake107/repo-2/commit/f2b318bc403cf13848268263f555f5b9a20a7c77))
* **deps:** bump sentry from 0.30.0 to 0.31.0 ([#201](https://github.com/snowflake107/repo-2/issues/201)) ([5e4a6db](https://github.com/snowflake107/repo-2/commit/5e4a6db0a1e48e1b5ec35cb93eabfa8945c7d017))
* **deps:** bump sentry from 0.31.0 to 0.31.1 ([#212](https://github.com/snowflake107/repo-2/issues/212)) ([0d7339d](https://github.com/snowflake107/repo-2/commit/0d7339db4fbcc5e3786942bd662c2a5849978c0c))
* **deps:** bump sentry from 0.31.1 to 0.31.2 ([#217](https://github.com/snowflake107/repo-2/issues/217)) ([4b52d25](https://github.com/snowflake107/repo-2/commit/4b52d25210c08797f56caf90bdc8dc77f25c3065))
* **deps:** bump sentry from 0.31.2 to 0.31.3 ([#220](https://github.com/snowflake107/repo-2/issues/220)) ([76dd8c4](https://github.com/snowflake107/repo-2/commit/76dd8c4bc7d430d83b0fc7276b87ff791d4b51f4))
* **deps:** bump sentry from 0.31.3 to 0.31.4 ([#246](https://github.com/snowflake107/repo-2/issues/246)) ([adcc5c3](https://github.com/snowflake107/repo-2/commit/adcc5c39c8d968e3195e205bdad66a45b56d870d))
* **deps:** bump sentry from 0.31.4 to 0.31.5 ([#251](https://github.com/snowflake107/repo-2/issues/251)) ([b15dd09](https://github.com/snowflake107/repo-2/commit/b15dd097a70431f31ae43944684bb4699fbc7e52))
* **deps:** bump sentry from 0.31.5 to 0.31.6 ([#340](https://github.com/snowflake107/repo-2/issues/340)) ([c1ce301](https://github.com/snowflake107/repo-2/commit/c1ce301f15fa2a4c79f0b40f15edf2f10d9e3551))
* **deps:** bump sentry from 0.31.6 to 0.31.7 ([#359](https://github.com/snowflake107/repo-2/issues/359)) ([894626c](https://github.com/snowflake107/repo-2/commit/894626c90b815275a844bc460cc1e5125d83f6ea))
* **deps:** bump sentry from 0.32.2 to 0.32.3 ([#487](https://github.com/snowflake107/repo-2/issues/487)) ([62aa849](https://github.com/snowflake107/repo-2/commit/62aa84995a36708551f5417e0fd32144f20b5890))
* **deps:** bump sentry from 0.32.3 to 0.33.0 ([#509](https://github.com/snowflake107/repo-2/issues/509)) ([259eba8](https://github.com/snowflake107/repo-2/commit/259eba8b8cc2058b3fc38c580e276f00d2e1a176))
* **deps:** bump sentry from 0.33.0 to 0.34.0 ([#514](https://github.com/snowflake107/repo-2/issues/514)) ([3415659](https://github.com/snowflake107/repo-2/commit/3415659be02bd35e19be9488b9c576f45b555765))
* **deps:** bump sentry-actix from 0.30.0 to 0.31.0 ([#202](https://github.com/snowflake107/repo-2/issues/202)) ([a5b32ec](https://github.com/snowflake107/repo-2/commit/a5b32ecfbe0ca2cc596a530a0a5ea3667a9dee23))
* **deps:** bump sentry-actix from 0.31.0 to 0.31.1 ([#211](https://github.com/snowflake107/repo-2/issues/211)) ([16a6066](https://github.com/snowflake107/repo-2/commit/16a6066de7d6e99b730000f95cfdd318e73debe8))
* **deps:** bump sentry-actix from 0.31.1 to 0.31.2 ([#216](https://github.com/snowflake107/repo-2/issues/216)) ([416b826](https://github.com/snowflake107/repo-2/commit/416b82606c92cb01674c4a58a801302a56dd5aae))
* **deps:** bump sentry-actix from 0.31.2 to 0.31.3 ([#218](https://github.com/snowflake107/repo-2/issues/218)) ([f27b3dd](https://github.com/snowflake107/repo-2/commit/f27b3dda6bb01ea9189d4bdd1a5c71425a704222))
* **deps:** bump sentry-actix from 0.31.3 to 0.31.4 ([#247](https://github.com/snowflake107/repo-2/issues/247)) ([eda00fc](https://github.com/snowflake107/repo-2/commit/eda00fcdca2499b96e41cb79d34ec6a6e04a2ec8))
* **deps:** bump sentry-actix from 0.31.4 to 0.31.5 ([#249](https://github.com/snowflake107/repo-2/issues/249)) ([d917759](https://github.com/snowflake107/repo-2/commit/d917759cc1b3cb847205d8dfae9ba6cebfe13d71))
* **deps:** bump sentry-actix from 0.31.5 to 0.31.6 ([#344](https://github.com/snowflake107/repo-2/issues/344)) ([8ae193d](https://github.com/snowflake107/repo-2/commit/8ae193da13e7a84484ca5c906efe34e69ae0f012))
* **deps:** bump sentry-actix from 0.31.6 to 0.31.7 ([#358](https://github.com/snowflake107/repo-2/issues/358)) ([1536577](https://github.com/snowflake107/repo-2/commit/15365776136b57f1e9536478b0d4387818bf00a8))
* **deps:** bump sentry-actix from 0.32.2 to 0.32.3 ([#478](https://github.com/snowflake107/repo-2/issues/478)) ([55fcbc3](https://github.com/snowflake107/repo-2/commit/55fcbc3118a52b7fa0864c8aac0788f382f95b34))
* **deps:** bump sentry-actix from 0.32.3 to 0.33.0 ([#510](https://github.com/snowflake107/repo-2/issues/510)) ([1e48192](https://github.com/snowflake107/repo-2/commit/1e481924545db592c43ccaccdd572e791377ce72))
* **deps:** bump sentry-actix from 0.33.0 to 0.34.0 ([#515](https://github.com/snowflake107/repo-2/issues/515)) ([018a45b](https://github.com/snowflake107/repo-2/commit/018a45bbccbe7605ea284a25f95a9664975db0fe))
* **deps:** bump serde from 1.0.156 to 1.0.163 ([#207](https://github.com/snowflake107/repo-2/issues/207)) ([24909d1](https://github.com/snowflake107/repo-2/commit/24909d167792e5206134d6923cdd3c23ba97cbda))
* **deps:** bump serde from 1.0.163 to 1.0.164 ([#240](https://github.com/snowflake107/repo-2/issues/240)) ([acb43d1](https://github.com/snowflake107/repo-2/commit/acb43d1d1a41bf4620b29e290f816b5c7ccda923))
* **deps:** bump serde from 1.0.164 to 1.0.166 ([#270](https://github.com/snowflake107/repo-2/issues/270)) ([e863939](https://github.com/snowflake107/repo-2/commit/e863939bd4ba9b202d911c42f9f3cf55eb8702d5))
* **deps:** bump serde from 1.0.166 to 1.0.170 ([#285](https://github.com/snowflake107/repo-2/issues/285)) ([baa1fbd](https://github.com/snowflake107/repo-2/commit/baa1fbd29c87ad66078ab2097781b39cb20e4138))
* **deps:** bump serde from 1.0.170 to 1.0.171 ([#286](https://github.com/snowflake107/repo-2/issues/286)) ([4c60772](https://github.com/snowflake107/repo-2/commit/4c60772b0ebcc1160b02b4d5ebd8fb8727457653))
* **deps:** bump serde from 1.0.171 to 1.0.173 ([#299](https://github.com/snowflake107/repo-2/issues/299)) ([542b360](https://github.com/snowflake107/repo-2/commit/542b360ea770e6d1c0cd73794adfff0fdbc5b419))
* **deps:** bump serde from 1.0.173 to 1.0.174 ([#302](https://github.com/snowflake107/repo-2/issues/302)) ([c90d377](https://github.com/snowflake107/repo-2/commit/c90d377a6c59c1301f68249e48b7f43ef3a161c6))
* **deps:** bump serde from 1.0.174 to 1.0.175 ([#305](https://github.com/snowflake107/repo-2/issues/305)) ([54bfbc2](https://github.com/snowflake107/repo-2/commit/54bfbc22b9bac2894e5151c45c1482a7570dc052))
* **deps:** bump serde from 1.0.175 to 1.0.176 ([#306](https://github.com/snowflake107/repo-2/issues/306)) ([34a5430](https://github.com/snowflake107/repo-2/commit/34a543054c2fecda0907898e056d20b3437fda0a))
* **deps:** bump serde from 1.0.176 to 1.0.177 ([#310](https://github.com/snowflake107/repo-2/issues/310)) ([298ff15](https://github.com/snowflake107/repo-2/commit/298ff15870f9f5cc29608e555303a3f43eeaebce))
* **deps:** bump serde from 1.0.177 to 1.0.179 ([#311](https://github.com/snowflake107/repo-2/issues/311)) ([610296d](https://github.com/snowflake107/repo-2/commit/610296d0df703d7cde547bf232b45f16376bf256))
* **deps:** bump serde from 1.0.179 to 1.0.181 ([#314](https://github.com/snowflake107/repo-2/issues/314)) ([9117189](https://github.com/snowflake107/repo-2/commit/9117189ecbe1a8f7fbebbb6f971e4867ddfbb59a))
* **deps:** bump serde from 1.0.181 to 1.0.182 ([#315](https://github.com/snowflake107/repo-2/issues/315)) ([3fbf1b6](https://github.com/snowflake107/repo-2/commit/3fbf1b6fda686246f07293b1d59dd7b641eb9b3f))
* **deps:** bump serde from 1.0.182 to 1.0.183 ([#318](https://github.com/snowflake107/repo-2/issues/318)) ([52a0e1c](https://github.com/snowflake107/repo-2/commit/52a0e1cde63d53274f91198191fa672feae94f3b))
* **deps:** bump serde from 1.0.183 to 1.0.185 ([#329](https://github.com/snowflake107/repo-2/issues/329)) ([dc9f697](https://github.com/snowflake107/repo-2/commit/dc9f6971c01e224fcce13a98b06f2f5b20f8205a))
* **deps:** bump serde from 1.0.185 to 1.0.186 ([#332](https://github.com/snowflake107/repo-2/issues/332)) ([97ea93e](https://github.com/snowflake107/repo-2/commit/97ea93ef80341041df339af7b48b910926b45c28))
* **deps:** bump serde from 1.0.186 to 1.0.188 ([#337](https://github.com/snowflake107/repo-2/issues/337)) ([3ddbf18](https://github.com/snowflake107/repo-2/commit/3ddbf18ee13da229525680bfd37a786e16c755ab))
* **deps:** bump serde from 1.0.197 to 1.0.198 ([#481](https://github.com/snowflake107/repo-2/issues/481)) ([7557685](https://github.com/snowflake107/repo-2/commit/7557685acd4397dcb45eb1c6e1dfe41786c1c118))
* **deps:** bump serde from 1.0.198 to 1.0.199 ([#493](https://github.com/snowflake107/repo-2/issues/493)) ([999e16a](https://github.com/snowflake107/repo-2/commit/999e16aab65237e5514660379f33ebb397e95eb0))
* **deps:** bump serde from 1.0.199 to 1.0.200 ([#496](https://github.com/snowflake107/repo-2/issues/496)) ([e59c206](https://github.com/snowflake107/repo-2/commit/e59c20623de36a4fe1e3e53a0eb54686a8ec811b))
* **deps:** bump serde from 1.0.200 to 1.0.201 ([#499](https://github.com/snowflake107/repo-2/issues/499)) ([e54df1e](https://github.com/snowflake107/repo-2/commit/e54df1e85b4e022c73d11d899c4cb69023e95f00))
* **deps:** bump serde from 1.0.201 to 1.0.202 ([#501](https://github.com/snowflake107/repo-2/issues/501)) ([861f9fa](https://github.com/snowflake107/repo-2/commit/861f9fa778e1c4f708bdcd0b6beb2ea0a9f5169d))
* **deps:** bump serde from 1.0.202 to 1.0.203 ([#508](https://github.com/snowflake107/repo-2/issues/508)) ([f72a9ca](https://github.com/snowflake107/repo-2/commit/f72a9cab678b77c6f65b07e05b39d4762eebc08a))
* **deps:** bump serde from 1.0.203 to 1.0.204 ([#537](https://github.com/snowflake107/repo-2/issues/537)) ([35d5698](https://github.com/snowflake107/repo-2/commit/35d56989f21fa8206407a5fe27df7b154e91b6b8))
* **deps:** bump serde_json from 1.0.100 to 1.0.102 ([#287](https://github.com/snowflake107/repo-2/issues/287)) ([9fb3b14](https://github.com/snowflake107/repo-2/commit/9fb3b144c652d869094afb9ae1b44627e0cab693))
* **deps:** bump serde_json from 1.0.102 to 1.0.103 ([#290](https://github.com/snowflake107/repo-2/issues/290)) ([8658893](https://github.com/snowflake107/repo-2/commit/86588938621a8b09631a76153a516d2e82026c84))
* **deps:** bump serde_json from 1.0.103 to 1.0.104 ([#308](https://github.com/snowflake107/repo-2/issues/308)) ([7105c89](https://github.com/snowflake107/repo-2/commit/7105c89f03613aaa46fd9c4cc836b5a879f26df5))
* **deps:** bump serde_json from 1.0.104 to 1.0.105 ([#323](https://github.com/snowflake107/repo-2/issues/323)) ([ec610a1](https://github.com/snowflake107/repo-2/commit/ec610a11d86f4b97412b858c5384deec07f4aef2))
* **deps:** bump serde_json from 1.0.105 to 1.0.106 ([#353](https://github.com/snowflake107/repo-2/issues/353)) ([65b19cd](https://github.com/snowflake107/repo-2/commit/65b19cdf7576286e1f845b400887bee6d93cf0af))
* **deps:** bump serde_json from 1.0.106 to 1.0.107 ([#357](https://github.com/snowflake107/repo-2/issues/357)) ([61a2998](https://github.com/snowflake107/repo-2/commit/61a29980b18216bd2e41a81bb74c2782ac5d2710))
* **deps:** bump serde_json from 1.0.114 to 1.0.116 ([#489](https://github.com/snowflake107/repo-2/issues/489)) ([14e8603](https://github.com/snowflake107/repo-2/commit/14e860350f20013c1ca9fe1646fa63a4351c34e7))
* **deps:** bump serde_json from 1.0.116 to 1.0.117 ([#498](https://github.com/snowflake107/repo-2/issues/498)) ([0de3421](https://github.com/snowflake107/repo-2/commit/0de3421daf6c265a7a6b41323e30772e9f44820f))
* **deps:** bump serde_json from 1.0.117 to 1.0.118 ([#528](https://github.com/snowflake107/repo-2/issues/528)) ([be0a209](https://github.com/snowflake107/repo-2/commit/be0a20962c3a616023a3be5c6e298e4a7eee21e7))
* **deps:** bump serde_json from 1.0.118 to 1.0.119 ([#530](https://github.com/snowflake107/repo-2/issues/530)) ([35508ad](https://github.com/snowflake107/repo-2/commit/35508ad51ff286529db283f1729d97b4ee68626f))
* **deps:** bump serde_json from 1.0.119 to 1.0.120 ([#533](https://github.com/snowflake107/repo-2/issues/533)) ([8394c78](https://github.com/snowflake107/repo-2/commit/8394c7847562c5b4dde6aada20d3448237fca201))
* **deps:** bump serde_json from 1.0.94 to 1.0.96 ([#203](https://github.com/snowflake107/repo-2/issues/203)) ([6601327](https://github.com/snowflake107/repo-2/commit/66013279f5dda7dcb8a6ce01cab399c8379bf73b))
* **deps:** bump serde_json from 1.0.96 to 1.0.97 ([#250](https://github.com/snowflake107/repo-2/issues/250)) ([3437984](https://github.com/snowflake107/repo-2/commit/34379845604e9ed70381dc005c2c3903bafe6636))
* **deps:** bump serde_json from 1.0.96 to 1.0.99 ([#255](https://github.com/snowflake107/repo-2/issues/255)) ([8bfc556](https://github.com/snowflake107/repo-2/commit/8bfc556a851db7c6b108e60b41a352f897648ffb))
* **deps:** bump serde_json from 1.0.99 to 1.0.100 ([#272](https://github.com/snowflake107/repo-2/issues/272)) ([e683371](https://github.com/snowflake107/repo-2/commit/e683371a9ba3b3b6294c99b07480128e966e34bb))
* **deps:** bump serde_path_to_error from 0.1.11 to 0.1.12 ([#269](https://github.com/snowflake107/repo-2/issues/269)) ([b24a8e4](https://github.com/snowflake107/repo-2/commit/b24a8e40a8fd61d1a4ae719f2f9eec395ece6c4e))
* **deps:** bump serde_path_to_error from 0.1.12 to 0.1.13 ([#275](https://github.com/snowflake107/repo-2/issues/275)) ([67eb580](https://github.com/snowflake107/repo-2/commit/67eb5808fb8c8c1bea116b420d3b97795a505eab))
* **deps:** bump serde_path_to_error from 0.1.13 to 0.1.14 ([#292](https://github.com/snowflake107/repo-2/issues/292)) ([168bb8a](https://github.com/snowflake107/repo-2/commit/168bb8a1f368bc412d989b2ce93ddefccd4760e2))
* **deps:** bump serde_path_to_error from 0.1.15 to 0.1.16 ([#488](https://github.com/snowflake107/repo-2/issues/488)) ([641bd7b](https://github.com/snowflake107/repo-2/commit/641bd7b7f9c018e9405617e3ecdf91e4a615aeef))
* **deps:** bump serde_path_to_error from 0.1.9 to 0.1.11 ([#200](https://github.com/snowflake107/repo-2/issues/200)) ([6610c5b](https://github.com/snowflake107/repo-2/commit/6610c5b87b33711795c7ee14b6ed71aaf9248ce6))
* **deps:** bump serde_with from 2.2.0 to 3.0.0 ([#205](https://github.com/snowflake107/repo-2/issues/205)) ([fa8230e](https://github.com/snowflake107/repo-2/commit/fa8230e36e8e8bf74de4e747f094c794adcf5b1e))
* **deps:** bump serde_with from 3.0.0 to 3.1.0 ([#295](https://github.com/snowflake107/repo-2/issues/295)) ([ef00341](https://github.com/snowflake107/repo-2/commit/ef0034168d46b02f7bb1aad12f455f1690ecb062))
* **deps:** bump serde_with from 3.1.0 to 3.2.0 ([#317](https://github.com/snowflake107/repo-2/issues/317)) ([c6a22ca](https://github.com/snowflake107/repo-2/commit/c6a22ca08309c05fd66b5e11cf3eb87cc3652dfc))
* **deps:** bump serde_with from 3.2.0 to 3.3.0 ([#328](https://github.com/snowflake107/repo-2/issues/328)) ([1be8ec0](https://github.com/snowflake107/repo-2/commit/1be8ec0c94d17d7eb649d5f58ad0e795962521aa))
* **deps:** bump serde_with from 3.6.1 to 3.7.0 ([#484](https://github.com/snowflake107/repo-2/issues/484)) ([17d23f9](https://github.com/snowflake107/repo-2/commit/17d23f925073c2d300f35c5a4fd44e329c51973b))
* **deps:** bump serde_with from 3.7.0 to 3.8.0 ([#491](https://github.com/snowflake107/repo-2/issues/491)) ([6cf0431](https://github.com/snowflake107/repo-2/commit/6cf04316555ae5d96425a055be5431b8b0d610d8))
* **deps:** bump serde_with from 3.8.0 to 3.8.1 ([#492](https://github.com/snowflake107/repo-2/issues/492)) ([b96e4da](https://github.com/snowflake107/repo-2/commit/b96e4dac02055a5ecfa5ec076c06300b78f3c65a))
* **deps:** bump serde_with from 3.8.1 to 3.8.2 ([#531](https://github.com/snowflake107/repo-2/issues/531)) ([2595eb3](https://github.com/snowflake107/repo-2/commit/2595eb304c4f5a238c31846f5d49f2b1427f3345))
* **deps:** bump serde_with from 3.8.2 to 3.8.3 ([#535](https://github.com/snowflake107/repo-2/issues/535)) ([2be8735](https://github.com/snowflake107/repo-2/commit/2be8735008e0838d6edb03399f1c87973c56f2f3))
* **deps:** bump serde_with from 3.8.3 to 3.9.0 ([#540](https://github.com/snowflake107/repo-2/issues/540)) ([2b3d852](https://github.com/snowflake107/repo-2/commit/2b3d852e7883550ba3a0b05bd7ad6c1759176df9))
* **deps:** bump serde_yaml from 0.9.32 to 0.9.34+deprecated ([#471](https://github.com/snowflake107/repo-2/issues/471)) ([5ccd4f0](https://github.com/snowflake107/repo-2/commit/5ccd4f04442fe32441ab1c6ba819cdb0446342f1))
* **deps:** bump sha2 from 0.10.6 to 0.10.7 ([#264](https://github.com/snowflake107/repo-2/issues/264)) ([f7b9a7f](https://github.com/snowflake107/repo-2/commit/f7b9a7f0e6c716a3e85d88f254cab45f22e1cce9))
* **deps:** bump sha2 from 0.10.7 to 0.10.8 ([#370](https://github.com/snowflake107/repo-2/issues/370)) ([066a531](https://github.com/snowflake107/repo-2/commit/066a5317ce0079541578c886daff3467a4c77f40))
* **deps:** bump slog-async from 2.7.0 to 2.8.0 ([#338](https://github.com/snowflake107/repo-2/issues/338)) ([20e3172](https://github.com/snowflake107/repo-2/commit/20e3172879178d9f8257d26c2711884d2603a3b0))
* **deps:** bump sqlx from 0.6.3 to 0.7.1 ([#291](https://github.com/snowflake107/repo-2/issues/291)) ([c6f07ba](https://github.com/snowflake107/repo-2/commit/c6f07ba88c9ec31fe7a7125754813cc7b4bfc8a0))
* **deps:** bump sqlx from 0.7.1 to 0.7.2 ([#371](https://github.com/snowflake107/repo-2/issues/371)) ([c76b30e](https://github.com/snowflake107/repo-2/commit/c76b30e9825c80af53b63ccbe0a370908fb38dc7))
* **deps:** bump sqlx from 0.7.3 to 0.7.4 ([#473](https://github.com/snowflake107/repo-2/issues/473)) ([4940081](https://github.com/snowflake107/repo-2/commit/4940081be92dd3de75c6484d422bd419a095df70))
* **deps:** bump stubr from 0.5.1 to 0.6.1 ([#245](https://github.com/snowflake107/repo-2/issues/245)) ([ef60949](https://github.com/snowflake107/repo-2/commit/ef60949fbb17d8918c61867be73c3709806d6d88))
* **deps:** bump stubr from 0.6.1 to 0.6.2 ([#266](https://github.com/snowflake107/repo-2/issues/266)) ([c107cb1](https://github.com/snowflake107/repo-2/commit/c107cb197f183f6e1f6da4fb30c637716fc733af))
* **deps:** bump stubr-attributes from 0.5.1 to 0.6.0 ([#241](https://github.com/snowflake107/repo-2/issues/241)) ([00c4701](https://github.com/snowflake107/repo-2/commit/00c470148b9c13b78083d5eba4dfedcb113fcede))
* **deps:** bump stubr-attributes from 0.6.0 to 0.6.1 ([#244](https://github.com/snowflake107/repo-2/issues/244)) ([505afcd](https://github.com/snowflake107/repo-2/commit/505afcdfd46a11f838c134ae8b775dcee1c65ef6))
* **deps:** bump tiktoken-rs and async-openai ([#322](https://github.com/snowflake107/repo-2/issues/322)) ([c115ca0](https://github.com/snowflake107/repo-2/commit/c115ca0ed5295e54e4496845baada1d15a32dc3f))
* **deps:** bump tiktoken-rs from 0.5.3 to 0.5.4 ([#364](https://github.com/snowflake107/repo-2/issues/364)) ([94cc43a](https://github.com/snowflake107/repo-2/commit/94cc43a17f6d2ff543d4036b318b10c272ed5eeb))
* **deps:** bump tiktoken-rs from 0.5.8 to 0.5.9 ([#503](https://github.com/snowflake107/repo-2/issues/503)) ([953edfc](https://github.com/snowflake107/repo-2/commit/953edfc6795d9ff4e7f4f5c35a89b5ac338aeec2))
* **deps:** bump tokio from 1.36.0 to 1.37.0 ([#469](https://github.com/snowflake107/repo-2/issues/469)) ([63f51e0](https://github.com/snowflake107/repo-2/commit/63f51e079c0c9de070cb55af614cc9362817f2b7))
* **deps:** bump tokio from 1.37.0 to 1.38.0 ([#512](https://github.com/snowflake107/repo-2/issues/512)) ([679cf1d](https://github.com/snowflake107/repo-2/commit/679cf1d3d685ba93cd8ea14bdc22e6e8e8d81d21))
* **deps:** bump tokio from 1.38.0 to 1.40.0 ([#551](https://github.com/snowflake107/repo-2/issues/551)) ([eddb78b](https://github.com/snowflake107/repo-2/commit/eddb78b21da0a0366028fd8f31135fe1065ad3af))
* **deps:** bump unsafe-libyaml from 0.2.9 to 0.2.10 ([#395](https://github.com/snowflake107/repo-2/issues/395)) ([b0e5045](https://github.com/snowflake107/repo-2/commit/b0e50452ba7d32759ae58340699f8b31c97a6de4))
* **deps:** bump url from 2.3.1 to 2.4.0 ([#232](https://github.com/snowflake107/repo-2/issues/232)) ([9a03bca](https://github.com/snowflake107/repo-2/commit/9a03bcab6b12a0395b4c5f41dd049f3aa847de4c))
* **deps:** bump url from 2.4.0 to 2.4.1 ([#342](https://github.com/snowflake107/repo-2/issues/342)) ([6df9123](https://github.com/snowflake107/repo-2/commit/6df91238a3ba0c0becece37e10b921fb0591726b))
* **deps:** bump url from 2.5.0 to 2.5.1 ([#521](https://github.com/snowflake107/repo-2/issues/521)) ([2b1523f](https://github.com/snowflake107/repo-2/commit/2b1523f1f9e8ed1b3f8ff3232f98afbb07dc5a66))
* **deps:** bump url from 2.5.1 to 2.5.2 ([#524](https://github.com/snowflake107/repo-2/issues/524)) ([9cdccbf](https://github.com/snowflake107/repo-2/commit/9cdccbf71e3122702a2061ef15d36074eea44185))
* **deps:** bump uuid from 1.3.0 to 1.3.3 ([#192](https://github.com/snowflake107/repo-2/issues/192)) ([baa2a56](https://github.com/snowflake107/repo-2/commit/baa2a56012574b74b2e0e458454b1afe78bf9916))
* **deps:** bump uuid from 1.3.3 to 1.3.4 ([#243](https://github.com/snowflake107/repo-2/issues/243)) ([8eff0f5](https://github.com/snowflake107/repo-2/commit/8eff0f5daa50d57a992cf25643a38278c8c2c9b5))
* **deps:** bump uuid from 1.3.4 to 1.4.0 ([#260](https://github.com/snowflake107/repo-2/issues/260)) ([b878a50](https://github.com/snowflake107/repo-2/commit/b878a502988012447cad7f54b3e5e9150b74bb46))
* **deps:** bump uuid from 1.4.0 to 1.4.1 ([#293](https://github.com/snowflake107/repo-2/issues/293)) ([889c3fa](https://github.com/snowflake107/repo-2/commit/889c3fac4152585ddeee7d07b53c9b1470497203))
* **deps:** bump uuid from 1.7.0 to 1.8.0 ([#464](https://github.com/snowflake107/repo-2/issues/464)) ([da5eb6b](https://github.com/snowflake107/repo-2/commit/da5eb6b35c031086b22c0f687954bf7fc502e509))
* **deps:** bump uuid from 1.8.0 to 1.9.1 ([#527](https://github.com/snowflake107/repo-2/issues/527)) ([a2f6c24](https://github.com/snowflake107/repo-2/commit/a2f6c24ffd34c89a37ad384c4d9c7425a8b54e68))
* **deps:** bump uuid from 1.9.1 to 1.10.0 ([#539](https://github.com/snowflake107/repo-2/issues/539)) ([cb4b987](https://github.com/snowflake107/repo-2/commit/cb4b987885990a98fee454c3e2b1671b4bb8ddde))
* **deps:** bump validator from 0.16.0 to 0.16.1 ([#248](https://github.com/snowflake107/repo-2/issues/248)) ([3b114c2](https://github.com/snowflake107/repo-2/commit/3b114c2723ce65fd6e2e218895cf5db01be3f851))
* **deps:** bump validator from 0.16.1 to 0.18.0 ([#462](https://github.com/snowflake107/repo-2/issues/462)) ([d1d9200](https://github.com/snowflake107/repo-2/commit/d1d920013d8ebe6aa263186c4a2767dc0c539cb1))
* **deps:** bump validator from 0.18.0 to 0.18.1 ([#480](https://github.com/snowflake107/repo-2/issues/480)) ([f82c740](https://github.com/snowflake107/repo-2/commit/f82c7404f235e542f2c99495875888206c62174d))
* **deps:** bump whoami from 1.4.1 to 1.5.1 ([#461](https://github.com/snowflake107/repo-2/issues/461)) ([fe5b8dc](https://github.com/snowflake107/repo-2/commit/fe5b8dc7b4af2efd46c7d32fb92ec0c3bfb551e9))


### Miscellaneous

* **ai-help:** stop generating off-topic answer ([#455](https://github.com/snowflake107/repo-2/issues/455)) ([7dc8a6e](https://github.com/snowflake107/repo-2/commit/7dc8a6e906517732b5b1d07332d21bb2dd67df0b))
* **ai-help:** upgrade to gpt-4o-2024-08-06 ([#547](https://github.com/snowflake107/repo-2/issues/547)) ([d533eda](https://github.com/snowflake107/repo-2/commit/d533eda0191842e67a63d1e5d7c2831afc7261de))
* **deps:** bump rust from 1.76 to 1.81 ([#555](https://github.com/snowflake107/repo-2/issues/555)) ([9ef1fa5](https://github.com/snowflake107/repo-2/commit/9ef1fa53c00150b3d835a053f54321824c099719))
* **deps:** update minor depedency versions ([#418](https://github.com/snowflake107/repo-2/issues/418)) ([8994fc5](https://github.com/snowflake107/repo-2/commit/8994fc5d5ed88ef425da0e1b9e9fb73486e7e886))
* **deps:** update non-breaking major deps ([#419](https://github.com/snowflake107/repo-2/issues/419)) ([cda0c26](https://github.com/snowflake107/repo-2/commit/cda0c26a7d79a9b0f13b628f296c4a907d4f1605))
* **github:** add CODEOWNERS ([#385](https://github.com/snowflake107/repo-2/issues/385)) ([e89284e](https://github.com/snowflake107/repo-2/commit/e89284ed949378503cf4c3af498049ba36e9b62c))
* **k8s:** remove k8s config ([#238](https://github.com/snowflake107/repo-2/issues/238)) ([57b645c](https://github.com/snowflake107/repo-2/commit/57b645c1a1551804627d0290a1072f11d3e27d4e))
* **main:** release 1.1.0 ([#189](https://github.com/snowflake107/repo-2/issues/189)) ([2a357ac](https://github.com/snowflake107/repo-2/commit/2a357ac611f97bef867c48cd5ace8bdc5309f26a))
* **main:** release 1.10.0 ([#460](https://github.com/snowflake107/repo-2/issues/460)) ([e4d8b20](https://github.com/snowflake107/repo-2/commit/e4d8b206b1fd06221a32d190514a66c50ea8bb59))
* **main:** release 1.11.0 ([#502](https://github.com/snowflake107/repo-2/issues/502)) ([ccffddf](https://github.com/snowflake107/repo-2/commit/ccffddf1599b4b79eec353f0ce29b2db24be1bf4))
* **main:** release 1.11.1 ([#511](https://github.com/snowflake107/repo-2/issues/511)) ([ee22c84](https://github.com/snowflake107/repo-2/commit/ee22c842f1897e39fde36d7fa32387368df086f6))
* **main:** release 1.12.0 ([#534](https://github.com/snowflake107/repo-2/issues/534)) ([119d2b0](https://github.com/snowflake107/repo-2/commit/119d2b01d8f0b3c6bc169669da6cf99db6e4661c))
* **main:** release 1.12.1 ([#548](https://github.com/snowflake107/repo-2/issues/548)) ([671993b](https://github.com/snowflake107/repo-2/commit/671993b4862b4dd8f0fabfb793523730a5bbc198))
* **main:** release 1.2.0 ([#236](https://github.com/snowflake107/repo-2/issues/236)) ([5409df7](https://github.com/snowflake107/repo-2/commit/5409df734847a35c442415f1363c9c1bcb940344))
* **main:** release 1.3.0 ([#256](https://github.com/snowflake107/repo-2/issues/256)) ([f857786](https://github.com/snowflake107/repo-2/commit/f85778687d05eef29c4b999fb8c2a86858d76e46))
* **main:** release 1.3.1 ([#258](https://github.com/snowflake107/repo-2/issues/258)) ([848a8be](https://github.com/snowflake107/repo-2/commit/848a8be50d77ec6bb3b3f209e090e018e83b7394))
* **main:** release 1.4.0 ([#263](https://github.com/snowflake107/repo-2/issues/263)) ([73e7856](https://github.com/snowflake107/repo-2/commit/73e78566a900c45888a9c80f9efcbb09eb985858))
* **main:** release 1.4.1 ([#274](https://github.com/snowflake107/repo-2/issues/274)) ([9684f33](https://github.com/snowflake107/repo-2/commit/9684f33bd6d8446feb1ca97b6135cecbc56ac1b5))
* **main:** release 1.4.2 ([#283](https://github.com/snowflake107/repo-2/issues/283)) ([211e26c](https://github.com/snowflake107/repo-2/commit/211e26c77ee6e7a2b2fd6f7b2c1db106de7d496b))
* **main:** release 1.5.0 ([#303](https://github.com/snowflake107/repo-2/issues/303)) ([90d92b3](https://github.com/snowflake107/repo-2/commit/90d92b336cda4bfce4a7f514da05e4086f833d3a))
* **main:** release 1.5.1 ([#309](https://github.com/snowflake107/repo-2/issues/309)) ([8d95875](https://github.com/snowflake107/repo-2/commit/8d958758b93c5b56e59fe3742aa6ffb782cb9947))
* **main:** release 1.6.0 ([#386](https://github.com/snowflake107/repo-2/issues/386)) ([f7e9875](https://github.com/snowflake107/repo-2/commit/f7e98756a3f885f61de77b75a1dbd9feee5e69c9))
* **main:** release 1.6.1 ([#394](https://github.com/snowflake107/repo-2/issues/394)) ([2637def](https://github.com/snowflake107/repo-2/commit/2637defcb5f6c5b5ff39b6d3f9a10039adfd8dda))
* **main:** release 1.7.0 ([#398](https://github.com/snowflake107/repo-2/issues/398)) ([aaecf0d](https://github.com/snowflake107/repo-2/commit/aaecf0d46f4368fe38044f9fea118b992fdec487))
* **main:** release 1.8.0 ([#416](https://github.com/snowflake107/repo-2/issues/416)) ([6bead5c](https://github.com/snowflake107/repo-2/commit/6bead5cb958da736d94bb7df0b860521b0654617))
* **main:** release 1.9.0 ([#448](https://github.com/snowflake107/repo-2/issues/448)) ([9d2679f](https://github.com/snowflake107/repo-2/commit/9d2679f3f58d03f028bcf12256dc68f2fbb87618))
* **notifications:** remove notifications / watch support ([#171](https://github.com/snowflake107/repo-2/issues/171)) ([f43f7eb](https://github.com/snowflake107/repo-2/commit/f43f7ebb88a7668089296cde1a1f127623d03244))
* **release-please:** add Build section ([#463](https://github.com/snowflake107/repo-2/issues/463)) ([14ed4e9](https://github.com/snowflake107/repo-2/commit/14ed4e9be3792806cf61dcb9e13719d60828e366))
* **search:** increase cache_max_age to 1 day ([#110](https://github.com/snowflake107/repo-2/issues/110)) ([88b938e](https://github.com/snowflake107/repo-2/commit/88b938e3dab33818be401c8f651a01ab930e457e))
* **updates:** remove deprecated watched route + show param ([#169](https://github.com/snowflake107/repo-2/issues/169)) ([487ffe5](https://github.com/snowflake107/repo-2/commit/487ffe5bc892f1b97f8b7df6781a62c68b047bc1))
* **whoami:** capture error with sentry ([#179](https://github.com/snowflake107/repo-2/issues/179)) ([ce48cc0](https://github.com/snowflake107/repo-2/commit/ce48cc01c9a3c1f32675d2861bd2dbd39eedb19d))
* **workflows:** cache build artifacts ([#420](https://github.com/snowflake107/repo-2/issues/420)) ([d32d6cf](https://github.com/snowflake107/repo-2/commit/d32d6cf9f5d8349e650eef344a2494a3f3c9786e))
* **workflows:** enable RUST_BACKTRACE for tests ([#390](https://github.com/snowflake107/repo-2/issues/390)) ([3e7ab07](https://github.com/snowflake107/repo-2/commit/3e7ab0704d12fa99905ec872960faf7bb89f4dcc))

## [1.12.1](https://github.com/mdn/rumba/compare/v1.12.0...v1.12.1) (2024-09-04)


### Bug Fixes

* **ai-help:** fix double decrement ([#550](https://github.com/mdn/rumba/issues/550)) ([78fea88](https://github.com/mdn/rumba/commit/78fea8894059648c6214647c1c3273f959057839))
* **ci:** check dependabot PR user instead of actor ([#552](https://github.com/mdn/rumba/issues/552)) ([5b7fa3b](https://github.com/mdn/rumba/commit/5b7fa3b513d9c2f56bc1f43d4b7649ebadc287ec))


### Build

* **deps:** bump openssl from 0.10.64 to 0.10.66 ([#543](https://github.com/mdn/rumba/issues/543)) ([916ecad](https://github.com/mdn/rumba/commit/916ecad2b5c11a50690c3b8904ec06f7cc3451fa))


### Miscellaneous

* **ai-help:** upgrade to gpt-4o-2024-08-06 ([#547](https://github.com/mdn/rumba/issues/547)) ([d533eda](https://github.com/mdn/rumba/commit/d533eda0191842e67a63d1e5d7c2831afc7261de))

## [1.12.0](https://github.com/mdn/rumba/compare/v1.11.1...v1.12.0) (2024-08-02)


### Features

* **ai-help:** upgrade from GPT-3.5 Turbo to GPT-4o mini ([#546](https://github.com/mdn/rumba/issues/546)) ([0e57060](https://github.com/mdn/rumba/commit/0e57060d7ecf9d5d27d0c8bc5d7eb279adedfeaa))


### Bug Fixes

* **auto-merge:** exclude pre-1.0.0 major changes ([#536](https://github.com/mdn/rumba/issues/536)) ([dab5a4c](https://github.com/mdn/rumba/commit/dab5a4c8f38c62d359e3b831451b5595230e3752))


### Build

* **deps:** bump clap from 4.5.8 to 4.5.9 ([#538](https://github.com/mdn/rumba/issues/538)) ([9a708f8](https://github.com/mdn/rumba/commit/9a708f8d557a8f70f07a7547356f5e4c472de422))
* **deps:** bump serde from 1.0.203 to 1.0.204 ([#537](https://github.com/mdn/rumba/issues/537)) ([35d5698](https://github.com/mdn/rumba/commit/35d56989f21fa8206407a5fe27df7b154e91b6b8))
* **deps:** bump serde_json from 1.0.119 to 1.0.120 ([#533](https://github.com/mdn/rumba/issues/533)) ([8394c78](https://github.com/mdn/rumba/commit/8394c7847562c5b4dde6aada20d3448237fca201))
* **deps:** bump serde_with from 3.8.2 to 3.8.3 ([#535](https://github.com/mdn/rumba/issues/535)) ([2be8735](https://github.com/mdn/rumba/commit/2be8735008e0838d6edb03399f1c87973c56f2f3))
* **deps:** bump uuid from 1.9.1 to 1.10.0 ([#539](https://github.com/mdn/rumba/issues/539)) ([cb4b987](https://github.com/mdn/rumba/commit/cb4b987885990a98fee454c3e2b1671b4bb8ddde))

## [1.11.1](https://github.com/mdn/rumba/compare/v1.11.0...v1.11.1) (2024-07-01)


### Build

* **deps:** bump actix-http from 3.7.0 to 3.8.0 ([#525](https://github.com/mdn/rumba/issues/525)) ([3349f2a](https://github.com/mdn/rumba/commit/3349f2a8e02d568cb56da071b8c62f9cbce753b5))
* **deps:** bump actix-rt from 2.9.0 to 2.10.0 ([#518](https://github.com/mdn/rumba/issues/518)) ([bcfb35d](https://github.com/mdn/rumba/commit/bcfb35d657bc3e4d8e85d4ae53290033645a1767))
* **deps:** bump actix-web from 4.6.0 to 4.7.0 ([#519](https://github.com/mdn/rumba/issues/519)) ([3935983](https://github.com/mdn/rumba/commit/3935983124a11d882c6c165aade2a3b4bd65d8c8))
* **deps:** bump actix-web from 4.7.0 to 4.8.0 ([#526](https://github.com/mdn/rumba/issues/526)) ([f9e78a2](https://github.com/mdn/rumba/commit/f9e78a2f1ef1c593b71ed67ebcb311a9b9ea5958))
* **deps:** bump actix-web-httpauth from 0.8.1 to 0.8.2 ([#522](https://github.com/mdn/rumba/issues/522)) ([44093e9](https://github.com/mdn/rumba/commit/44093e9caadb2df8dacb2c9f62966a5194b430e2))
* **deps:** bump clap from 4.5.1 to 4.5.7 ([#520](https://github.com/mdn/rumba/issues/520)) ([7292407](https://github.com/mdn/rumba/commit/729240790edfafe34b3a6bea95be0e7b50a8e6f4))
* **deps:** bump clap from 4.5.7 to 4.5.8 ([#532](https://github.com/mdn/rumba/issues/532)) ([af00939](https://github.com/mdn/rumba/commit/af009392dbdf0f35d31905378e8136652793f3af))
* **deps:** bump curve25519-dalek from 4.1.2 to 4.1.3 ([#523](https://github.com/mdn/rumba/issues/523)) ([b8b988f](https://github.com/mdn/rumba/commit/b8b988f07eadd53a677ca4ee77bb4ae062c83fed))
* **deps:** bump pgvector from 0.3.2 to 0.3.3 ([#529](https://github.com/mdn/rumba/issues/529)) ([948b9fd](https://github.com/mdn/rumba/commit/948b9fdaf1d0b0068ba6e71595ce89ccffc48c80))
* **deps:** bump regex from 1.10.4 to 1.10.5 ([#517](https://github.com/mdn/rumba/issues/517)) ([d97221a](https://github.com/mdn/rumba/commit/d97221a9768f5dfdd8621466650b8648a4be1ebe))
* **deps:** bump sentry from 0.32.3 to 0.33.0 ([#509](https://github.com/mdn/rumba/issues/509)) ([259eba8](https://github.com/mdn/rumba/commit/259eba8b8cc2058b3fc38c580e276f00d2e1a176))
* **deps:** bump sentry from 0.33.0 to 0.34.0 ([#514](https://github.com/mdn/rumba/issues/514)) ([3415659](https://github.com/mdn/rumba/commit/3415659be02bd35e19be9488b9c576f45b555765))
* **deps:** bump sentry-actix from 0.32.3 to 0.33.0 ([#510](https://github.com/mdn/rumba/issues/510)) ([1e48192](https://github.com/mdn/rumba/commit/1e481924545db592c43ccaccdd572e791377ce72))
* **deps:** bump sentry-actix from 0.33.0 to 0.34.0 ([#515](https://github.com/mdn/rumba/issues/515)) ([018a45b](https://github.com/mdn/rumba/commit/018a45bbccbe7605ea284a25f95a9664975db0fe))
* **deps:** bump serde_json from 1.0.117 to 1.0.118 ([#528](https://github.com/mdn/rumba/issues/528)) ([be0a209](https://github.com/mdn/rumba/commit/be0a20962c3a616023a3be5c6e298e4a7eee21e7))
* **deps:** bump serde_json from 1.0.118 to 1.0.119 ([#530](https://github.com/mdn/rumba/issues/530)) ([35508ad](https://github.com/mdn/rumba/commit/35508ad51ff286529db283f1729d97b4ee68626f))
* **deps:** bump serde_with from 3.8.1 to 3.8.2 ([#531](https://github.com/mdn/rumba/issues/531)) ([2595eb3](https://github.com/mdn/rumba/commit/2595eb304c4f5a238c31846f5d49f2b1427f3345))
* **deps:** bump tokio from 1.37.0 to 1.38.0 ([#512](https://github.com/mdn/rumba/issues/512)) ([679cf1d](https://github.com/mdn/rumba/commit/679cf1d3d685ba93cd8ea14bdc22e6e8e8d81d21))
* **deps:** bump url from 2.5.0 to 2.5.1 ([#521](https://github.com/mdn/rumba/issues/521)) ([2b1523f](https://github.com/mdn/rumba/commit/2b1523f1f9e8ed1b3f8ff3232f98afbb07dc5a66))
* **deps:** bump url from 2.5.1 to 2.5.2 ([#524](https://github.com/mdn/rumba/issues/524)) ([9cdccbf](https://github.com/mdn/rumba/commit/9cdccbf71e3122702a2061ef15d36074eea44185))
* **deps:** bump uuid from 1.8.0 to 1.9.1 ([#527](https://github.com/mdn/rumba/issues/527)) ([a2f6c24](https://github.com/mdn/rumba/commit/a2f6c24ffd34c89a37ad384c4d9c7425a8b54e68))

## [1.11.0](https://github.com/mdn/rumba/compare/v1.10.0...v1.11.0) (2024-05-27)


### Features

* **ai-help:** upgrade to GPT-4o model ([#500](https://github.com/mdn/rumba/issues/500)) ([4c9c1e4](https://github.com/mdn/rumba/commit/4c9c1e4c593b2eb414f744792981e76663369f8b))


### Enhancements

* **ai-test:** skip prompts for which result exists ([#490](https://github.com/mdn/rumba/issues/490)) ([38a4c2d](https://github.com/mdn/rumba/commit/38a4c2d1eedfaf75d8e0f4e6b6527b1f0a7e2838))


### Build

* **deps:** bump actix-web from 4.5.1 to 4.6.0 ([#506](https://github.com/mdn/rumba/issues/506)) ([6fdf3dc](https://github.com/mdn/rumba/commit/6fdf3dc3d05213e068ecd6f578f629b0dfde1751))
* **deps:** bump anyhow from 1.0.83 to 1.0.86 ([#505](https://github.com/mdn/rumba/issues/505)) ([7a0bdb8](https://github.com/mdn/rumba/commit/7a0bdb8098babb1d52f8710c0f254f97f6006831))
* **deps:** bump itertools from 0.12.1 to 0.13.0 ([#504](https://github.com/mdn/rumba/issues/504)) ([4da2943](https://github.com/mdn/rumba/commit/4da2943e0487080e6997b61d6bf2da4e33c5bbd1))
* **deps:** bump serde from 1.0.201 to 1.0.202 ([#501](https://github.com/mdn/rumba/issues/501)) ([861f9fa](https://github.com/mdn/rumba/commit/861f9fa778e1c4f708bdcd0b6beb2ea0a9f5169d))
* **deps:** bump serde from 1.0.202 to 1.0.203 ([#508](https://github.com/mdn/rumba/issues/508)) ([f72a9ca](https://github.com/mdn/rumba/commit/f72a9cab678b77c6f65b07e05b39d4762eebc08a))
* **deps:** bump tiktoken-rs from 0.5.8 to 0.5.9 ([#503](https://github.com/mdn/rumba/issues/503)) ([953edfc](https://github.com/mdn/rumba/commit/953edfc6795d9ff4e7f4f5c35a89b5ac338aeec2))

## [1.10.0](https://github.com/mdn/rumba/compare/v1.9.0...v1.10.0) (2024-05-15)


### Features

* **ai-help:** switch to text-embedding-3-small model ([#459](https://github.com/mdn/rumba/issues/459)) ([9b65676](https://github.com/mdn/rumba/commit/9b656762c45bac86a4c8c48c1dbd0e9f82cf39b4))


### Build

* **deps:** bump anyhow from 1.0.80 to 1.0.82 ([#485](https://github.com/mdn/rumba/issues/485)) ([dce448c](https://github.com/mdn/rumba/commit/dce448c8a8998a04b81625aa3551d2eb57749092))
* **deps:** bump anyhow from 1.0.82 to 1.0.83 ([#497](https://github.com/mdn/rumba/issues/497)) ([cdd4a56](https://github.com/mdn/rumba/commit/cdd4a5618860a076f04b56a7f87dba2de2f1beb8))
* **deps:** bump base64 from 0.22.0 to 0.22.1 ([#495](https://github.com/mdn/rumba/issues/495)) ([75449ba](https://github.com/mdn/rumba/commit/75449ba245e5b13e79f7c4e0e2b49f908f0ab6f3))
* **deps:** bump cadence from 1.2.0 to 1.3.0 ([#470](https://github.com/mdn/rumba/issues/470)) ([7ffcfe8](https://github.com/mdn/rumba/commit/7ffcfe8c82afcd6cf2f736f313821d5afb0b6c9a))
* **deps:** bump cadence from 1.3.0 to 1.4.0 ([#494](https://github.com/mdn/rumba/issues/494)) ([ffb9c92](https://github.com/mdn/rumba/commit/ffb9c92fbfb42e0cc158c9bd8d97fd240435b525))
* **deps:** bump chrono from 0.4.34 to 0.4.37 ([#457](https://github.com/mdn/rumba/issues/457)) ([6b79a11](https://github.com/mdn/rumba/commit/6b79a11f4e09d20e5991b8d1921e8de5c773db20))
* **deps:** bump chrono from 0.4.37 to 0.4.38 ([#483](https://github.com/mdn/rumba/issues/483)) ([24cc08f](https://github.com/mdn/rumba/commit/24cc08f0f71ad7ffc1d7796be29e6f232580da94))
* **deps:** bump diesel from 2.1.4 to 2.1.5 ([#467](https://github.com/mdn/rumba/issues/467)) ([58eef65](https://github.com/mdn/rumba/commit/58eef652f74046ca9bf44363e73ce589692d3e78))
* **deps:** bump diesel from 2.1.5 to 2.1.6 ([#486](https://github.com/mdn/rumba/issues/486)) ([29a21a7](https://github.com/mdn/rumba/commit/29a21a7e482675b491f9f225a2875135287061cb))
* **deps:** bump hostname from 0.3.1 to 0.4.0 ([#482](https://github.com/mdn/rumba/issues/482)) ([99bde57](https://github.com/mdn/rumba/commit/99bde57e3ed3c9ad9070758839887ffacf91f53f))
* **deps:** bump jsonwebtoken from 9.2.0 to 9.3.0 ([#468](https://github.com/mdn/rumba/issues/468)) ([dc62b60](https://github.com/mdn/rumba/commit/dc62b60030be163b41f69aab3f64bd59e2ca1214))
* **deps:** bump octocrab from 0.34.1 to 0.37.0 ([#456](https://github.com/mdn/rumba/issues/456)) ([e5d7ab3](https://github.com/mdn/rumba/commit/e5d7ab313dd89e9aedfdac7efd60bb20d5504bd4))
* **deps:** bump octocrab from 0.37.0 to 0.38.0 ([#479](https://github.com/mdn/rumba/issues/479)) ([0a642bd](https://github.com/mdn/rumba/commit/0a642bd084733baa7c317e3c7d840e906b22fa6e))
* **deps:** bump pgvector from 0.2.2 to 0.3.2 ([#403](https://github.com/mdn/rumba/issues/403)) ([cefcdcb](https://github.com/mdn/rumba/commit/cefcdcb6635784c71e716466e5365426feb2279a))
* **deps:** bump regex from 1.10.3 to 1.10.4 ([#465](https://github.com/mdn/rumba/issues/465)) ([cd21515](https://github.com/mdn/rumba/commit/cd215152688f0c85150dec211e22306723018f09))
* **deps:** bump rustls from 0.21.10 to 0.21.11 ([#476](https://github.com/mdn/rumba/issues/476)) ([fc1cf4d](https://github.com/mdn/rumba/commit/fc1cf4d6b0ba3d0c31bdadb8fedd4d3130577f5d))
* **deps:** bump sentry from 0.32.2 to 0.32.3 ([#487](https://github.com/mdn/rumba/issues/487)) ([62aa849](https://github.com/mdn/rumba/commit/62aa84995a36708551f5417e0fd32144f20b5890))
* **deps:** bump sentry-actix from 0.32.2 to 0.32.3 ([#478](https://github.com/mdn/rumba/issues/478)) ([55fcbc3](https://github.com/mdn/rumba/commit/55fcbc3118a52b7fa0864c8aac0788f382f95b34))
* **deps:** bump serde from 1.0.197 to 1.0.198 ([#481](https://github.com/mdn/rumba/issues/481)) ([7557685](https://github.com/mdn/rumba/commit/7557685acd4397dcb45eb1c6e1dfe41786c1c118))
* **deps:** bump serde from 1.0.198 to 1.0.199 ([#493](https://github.com/mdn/rumba/issues/493)) ([999e16a](https://github.com/mdn/rumba/commit/999e16aab65237e5514660379f33ebb397e95eb0))
* **deps:** bump serde from 1.0.199 to 1.0.200 ([#496](https://github.com/mdn/rumba/issues/496)) ([e59c206](https://github.com/mdn/rumba/commit/e59c20623de36a4fe1e3e53a0eb54686a8ec811b))
* **deps:** bump serde from 1.0.200 to 1.0.201 ([#499](https://github.com/mdn/rumba/issues/499)) ([e54df1e](https://github.com/mdn/rumba/commit/e54df1e85b4e022c73d11d899c4cb69023e95f00))
* **deps:** bump serde_json from 1.0.114 to 1.0.116 ([#489](https://github.com/mdn/rumba/issues/489)) ([14e8603](https://github.com/mdn/rumba/commit/14e860350f20013c1ca9fe1646fa63a4351c34e7))
* **deps:** bump serde_json from 1.0.116 to 1.0.117 ([#498](https://github.com/mdn/rumba/issues/498)) ([0de3421](https://github.com/mdn/rumba/commit/0de3421daf6c265a7a6b41323e30772e9f44820f))
* **deps:** bump serde_path_to_error from 0.1.15 to 0.1.16 ([#488](https://github.com/mdn/rumba/issues/488)) ([641bd7b](https://github.com/mdn/rumba/commit/641bd7b7f9c018e9405617e3ecdf91e4a615aeef))
* **deps:** bump serde_with from 3.6.1 to 3.7.0 ([#484](https://github.com/mdn/rumba/issues/484)) ([17d23f9](https://github.com/mdn/rumba/commit/17d23f925073c2d300f35c5a4fd44e329c51973b))
* **deps:** bump serde_with from 3.7.0 to 3.8.0 ([#491](https://github.com/mdn/rumba/issues/491)) ([6cf0431](https://github.com/mdn/rumba/commit/6cf04316555ae5d96425a055be5431b8b0d610d8))
* **deps:** bump serde_with from 3.8.0 to 3.8.1 ([#492](https://github.com/mdn/rumba/issues/492)) ([b96e4da](https://github.com/mdn/rumba/commit/b96e4dac02055a5ecfa5ec076c06300b78f3c65a))
* **deps:** bump serde_yaml from 0.9.32 to 0.9.34+deprecated ([#471](https://github.com/mdn/rumba/issues/471)) ([5ccd4f0](https://github.com/mdn/rumba/commit/5ccd4f04442fe32441ab1c6ba819cdb0446342f1))
* **deps:** bump sqlx from 0.7.3 to 0.7.4 ([#473](https://github.com/mdn/rumba/issues/473)) ([4940081](https://github.com/mdn/rumba/commit/4940081be92dd3de75c6484d422bd419a095df70))
* **deps:** bump tokio from 1.36.0 to 1.37.0 ([#469](https://github.com/mdn/rumba/issues/469)) ([63f51e0](https://github.com/mdn/rumba/commit/63f51e079c0c9de070cb55af614cc9362817f2b7))
* **deps:** bump uuid from 1.7.0 to 1.8.0 ([#464](https://github.com/mdn/rumba/issues/464)) ([da5eb6b](https://github.com/mdn/rumba/commit/da5eb6b35c031086b22c0f687954bf7fc502e509))
* **deps:** bump validator from 0.16.1 to 0.18.0 ([#462](https://github.com/mdn/rumba/issues/462)) ([d1d9200](https://github.com/mdn/rumba/commit/d1d920013d8ebe6aa263186c4a2767dc0c539cb1))
* **deps:** bump validator from 0.18.0 to 0.18.1 ([#480](https://github.com/mdn/rumba/issues/480)) ([f82c740](https://github.com/mdn/rumba/commit/f82c7404f235e542f2c99495875888206c62174d))
* **deps:** bump whoami from 1.4.1 to 1.5.1 ([#461](https://github.com/mdn/rumba/issues/461)) ([fe5b8dc](https://github.com/mdn/rumba/commit/fe5b8dc7b4af2efd46c7d32fb92ec0c3bfb551e9))


### Miscellaneous

* **release-please:** add Build section ([#463](https://github.com/mdn/rumba/issues/463)) ([14ed4e9](https://github.com/mdn/rumba/commit/14ed4e9be3792806cf61dcb9e13719d60828e366))

## [1.9.0](https://github.com/mdn/rumba/compare/v1.8.0...v1.9.0) (2024-04-04)


### Features

* **ai-help:** delete ai history after six months ([#437](https://github.com/mdn/rumba/issues/437)) ([92541a5](https://github.com/mdn/rumba/commit/92541a5af026d31868a3009ab2b35b618b2592cd))
* **ai-help:** log message metadata ([#424](https://github.com/mdn/rumba/issues/424)) ([d035afa](https://github.com/mdn/rumba/commit/d035afa782eb5934be5702c3c8ca173c503cf62e))


### Bug Fixes

* **ai-help:** add qa questions to trigger error ([#450](https://github.com/mdn/rumba/issues/450)) ([7572e5b](https://github.com/mdn/rumba/commit/7572e5b79b88a5f3a454bd9f542266b3957a71fd))
* **ai-help:** artificial error triggers properly in the chat phase ([#452](https://github.com/mdn/rumba/issues/452)) ([deb9d54](https://github.com/mdn/rumba/commit/deb9d5443d4c9e338a6e16fdd94bb6f8bfecebda))
* **ai-help:** avoid spawning thread for history if history is disabled ([#438](https://github.com/mdn/rumba/issues/438)) ([706ce23](https://github.com/mdn/rumba/commit/706ce239d0deb4bbb8acb400806b2e7052c5da74))
* **ai-help:** configurable artificial error triggers ([#445](https://github.com/mdn/rumba/issues/445)) ([9c53f66](https://github.com/mdn/rumba/commit/9c53f66823d75b224d73212b8aa4b61dfa1d7945))
* **newsletter:** validate email ([#454](https://github.com/mdn/rumba/issues/454)) ([cd7c0f9](https://github.com/mdn/rumba/commit/cd7c0f95460a061baa7688559aa89f73baf42ee4))
* **updates:** continue on release without date, not break ([#447](https://github.com/mdn/rumba/issues/447)) ([c0949ca](https://github.com/mdn/rumba/commit/c0949ca083be84d5f27bcee8feb8966162250e59))


### Enhancements

* **ai-help:** record embedding duration and model separately ([#458](https://github.com/mdn/rumba/issues/458)) ([20760b2](https://github.com/mdn/rumba/commit/20760b2676f85deb04797f29a1e075d9b42f4ccf))


### Miscellaneous

* **ai-help:** stop generating off-topic answer ([#455](https://github.com/mdn/rumba/issues/455)) ([7dc8a6e](https://github.com/mdn/rumba/commit/7dc8a6e906517732b5b1d07332d21bb2dd67df0b))

## [1.8.0](https://github.com/mdn/rumba/compare/v1.7.0...v1.8.0) (2024-03-04)


### Features

* **ai-help:** add parent short_title for duplicate source titles ([#428](https://github.com/mdn/rumba/issues/428)) ([f523d52](https://github.com/mdn/rumba/commit/f523d5273390f2465b396db1a969bb5baa18e78b))
* **ai-help:** bump GPT-3.5 Turbo model ([#429](https://github.com/mdn/rumba/issues/429)) ([688e35d](https://github.com/mdn/rumba/commit/688e35d8669ea3caa011c3847fb501fc338223c2))
* **ai-test:** add --no-subscription flag ([#413](https://github.com/mdn/rumba/issues/413)) ([e6874e6](https://github.com/mdn/rumba/commit/e6874e602d488df67d74c44591b42b0e5b486f8c))
* **plus:** user subscription transitions ([#415](https://github.com/mdn/rumba/issues/415)) ([604b0e7](https://github.com/mdn/rumba/commit/604b0e7e4672e49a3501987aa5faef6ef07686a2))
* **plus:** user subscription transitions ([#421](https://github.com/mdn/rumba/issues/421)) ([5a307ca](https://github.com/mdn/rumba/commit/5a307cac964a693657f40b9d59f02fc837ed4b88))


### Bug Fixes

* **ai-help:** reset user quota on openai api error ([#430](https://github.com/mdn/rumba/issues/430)) ([cd6fdf8](https://github.com/mdn/rumba/commit/cd6fdf8e34b7bc17379e03efa922b99b54f8091d))
* **ai:** history fix ([#423](https://github.com/mdn/rumba/issues/423)) ([83f95a5](https://github.com/mdn/rumba/commit/83f95a51dd4f799777291b88044f268a5d5c24f7))
* **plus:** user subscription transitions ([#417](https://github.com/mdn/rumba/issues/417)) ([47b5a0b](https://github.com/mdn/rumba/commit/47b5a0b1d3d3bb8ed3267ccc4e9546c090fab33a))
* **tests:** add 10ms delay after we are done with stubr ([#408](https://github.com/mdn/rumba/issues/408)) ([18d8fda](https://github.com/mdn/rumba/commit/18d8fda52e2c419b9aeda7b3546704208d761f1f))


### Enhancements

* **ai-help:** format answers to off-topic questions ([#427](https://github.com/mdn/rumba/issues/427)) ([a545d66](https://github.com/mdn/rumba/commit/a545d66e1d91c9d0d76d89f85e459cc1fa34f5eb))


### Miscellaneous

* **deps:** update minor depedency versions ([#418](https://github.com/mdn/rumba/issues/418)) ([8994fc5](https://github.com/mdn/rumba/commit/8994fc5d5ed88ef425da0e1b9e9fb73486e7e886))
* **deps:** update non-breaking major deps ([#419](https://github.com/mdn/rumba/issues/419)) ([cda0c26](https://github.com/mdn/rumba/commit/cda0c26a7d79a9b0f13b628f296c4a907d4f1605))
* **workflows:** cache build artifacts ([#420](https://github.com/mdn/rumba/issues/420)) ([d32d6cf](https://github.com/mdn/rumba/commit/d32d6cf9f5d8349e650eef344a2494a3f3c9786e))

## [1.7.0](https://github.com/mdn/rumba/compare/v1.6.1...v1.7.0) (2024-01-31)


### Features

* **ai-help:** bump GPT-4 Turbo model ([#411](https://github.com/mdn/rumba/issues/411)) ([9c9038a](https://github.com/mdn/rumba/commit/9c9038ab258ed5bae635885c56567b425757c619))
* **ai-help:** switch to markdown context ([#410](https://github.com/mdn/rumba/issues/410)) ([6d71177](https://github.com/mdn/rumba/commit/6d711779d2c635fe18965422838ae79417d07650))


### Miscellaneous

* **workflows:** enable RUST_BACKTRACE for tests ([#390](https://github.com/mdn/rumba/issues/390)) ([3e7ab07](https://github.com/mdn/rumba/commit/3e7ab0704d12fa99905ec872960faf7bb89f4dcc))

## [1.6.1](https://github.com/mdn/rumba/compare/v1.6.0...v1.6.1) (2023-12-19)


### Bug Fixes

* **ai-help:** use GPT-3.5 for free users ([#393](https://github.com/mdn/rumba/issues/393)) ([94262d8](https://github.com/mdn/rumba/commit/94262d845e124b8f5176b314920d7aa81ce57f87))

## [1.6.0](https://github.com/mdn/rumba/compare/v1.5.1...v1.6.0) (2023-12-14)


### Features

* **ai-help:** release 2.0 ([#373](https://github.com/mdn/rumba/issues/373)) ([9499ee9](https://github.com/mdn/rumba/commit/9499ee9a183bed6bf7389bd83494d1f065f916d2))


### Miscellaneous

* **github:** add CODEOWNERS ([#385](https://github.com/mdn/rumba/issues/385)) ([e89284e](https://github.com/mdn/rumba/commit/e89284ed949378503cf4c3af498049ba36e9b62c))

## [1.5.1](https://github.com/mdn/rumba/compare/v1.5.0...v1.5.1) (2023-08-15)


### Bug Fixes

* **errors:** Downgrade AI/Playground erors to 400 ([#304](https://github.com/mdn/rumba/issues/304)) ([855094f](https://github.com/mdn/rumba/commit/855094fde7d2dd2793d1f6060aad89dafc83e793))

## [1.5.0](https://github.com/mdn/rumba/compare/v1.4.2...v1.5.0) (2023-07-24)


### Features

* **info:** add an info endpoint ([#301](https://github.com/mdn/rumba/issues/301)) ([9614323](https://github.com/mdn/rumba/commit/9614323ad0087898775400f5bbb081436b8614d9))

## [1.4.2](https://github.com/mdn/rumba/compare/v1.4.1...v1.4.2) (2023-07-07)


### Enhancements

* **ai-help:** Don't answer if no refs ([#277](https://github.com/mdn/rumba/issues/277)) ([5f9bb64](https://github.com/mdn/rumba/commit/5f9bb647928659a775a8b632f08f04ddbd45a6fe))
* **release-please:** take enhance/chore commits into consideration ([#282](https://github.com/mdn/rumba/issues/282)) ([f3dd4b1](https://github.com/mdn/rumba/commit/f3dd4b14028695598ed8c4c98d2791994fb1afad))

## [1.4.1](https://github.com/mdn/rumba/compare/v1.4.0...v1.4.1) (2023-07-05)


### Bug Fixes

* **play:** don't panic on to short id ([#273](https://github.com/mdn/rumba/issues/273)) ([46015de](https://github.com/mdn/rumba/commit/46015de19d30f87b9e5ea3287f0c474243eaf1c5))

## [1.4.0](https://github.com/mdn/rumba/compare/v1.3.1...v1.4.0) (2023-06-28)


### Features

* **ai-explain:** add ai-explain api ([#262](https://github.com/mdn/rumba/issues/262)) ([9785eab](https://github.com/mdn/rumba/commit/9785eab520301f275e6489fda10d1cd77c40df51))

## [1.3.1](https://github.com/mdn/rumba/compare/v1.3.0...v1.3.1) (2023-06-27)


### Bug Fixes

* **ai-help:** add related docs (negate missing) ([#257](https://github.com/mdn/rumba/issues/257)) ([634bf40](https://github.com/mdn/rumba/commit/634bf40d27d9a9f066e9cc1dc9378e020fb6f2d0))

## [1.3.0](https://github.com/mdn/rumba/compare/v1.2.0...v1.3.0) (2023-06-27)


### Features

* **plus:** add AI Help backend ([#230](https://github.com/mdn/rumba/issues/230)) ([064dedd](https://github.com/mdn/rumba/commit/064deddaa5ebec95d2a53a4c8b46fab276db4c34))

## [1.2.0](https://github.com/mdn/rumba/compare/v1.1.0...v1.2.0) (2023-06-19)


### Features

* **playground:** playground back-end ([#222](https://github.com/mdn/rumba/issues/222)) ([04a67ea](https://github.com/mdn/rumba/commit/04a67ea8452ec7b19752ea94de7aa60acb5b4a54))

## [1.1.0](https://github.com/mdn/rumba/compare/v1.0.0...v1.1.0) (2023-05-16)


### Features

* **newsletter:** support public double opt-in ([#187](https://github.com/mdn/rumba/issues/187)) ([e83d4ad](https://github.com/mdn/rumba/commit/e83d4adf54a77c800f3a438796a5974e55cc3f95))


### Bug Fixes

* **clippy:** fix derivable_impls ([#188](https://github.com/mdn/rumba/issues/188)) ([4860b43](https://github.com/mdn/rumba/commit/4860b43556104a584df8775ab53821301c2a4087))
