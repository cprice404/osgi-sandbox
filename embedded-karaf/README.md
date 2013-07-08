I was trying to figure out a way to basically pack up karaf as a single jar,
and then a deployment would consist of just a karaf bootstrapper + one
"bundle" jar for each custom service.

This looks like a dead end; the karaf distro really expects to be able to drop
a lot of files around on disk (bundles, config files).

Felix could be embedded more directly, but we'd end up needing to install a
bunch of the useful stuff that karaf provides anyway.  (Logging, security,
console?)

It's possible that for those features we could simply build the karaf stuff
into the uberjar, and programmatically load the services after we boot Felix,
though I'm not sure if there's an API for doing that separately from loading
"bundles", and I presume that you can't load a "bundle" from inside of a jar...

It might be possible to get a really minimal version of karaf, and then
re-package several of the karaf core bundles into a single "main" bundle; then
we'd potentially have a karaf boot uberjar, one karaf system bundle jar, plus
custom bundle jars.

-------------------------------------------------------------------
'kar' file format: "Basically, the kar format is a jar (so a zip file) which
contains a set of feature descriptor and bundle jar files.":

http://karaf.apache.org/manual/latest-2.3.x/users-guide/kar.html
