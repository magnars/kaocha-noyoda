# noyoda

> expected this, I did not

Don't talk like yoda. This [kaocha](https://github.com/lambdaisland/kaocha)
plugin lets you write `(is (= actual expected))`.

### Usage

Add `[kaocha-noyoda "2019-01-29"]` as a dev dependency, then enable the plugin:

```
#kaocha/v1
{:plugins [:noyoda.plugin/swap-actual-and-expected]}
```

Make sure you are using `[lambdaisland/kaocha "0.0-389"]` or newer.

Thanks to [Arne Brasseur](https://github.com/plexus) for all his work on Kaocha,
and for infusing it with such powerful extension mechanisms. If you find Kaocha
really useful in your work, consider supporting him via [Lambda
Island](https://lambdaisland.com/).

### License

Copyright © (iterate inc 2019) Magnar Sveen

Distributed under the Eclipse Public License, the same as Clojure.
