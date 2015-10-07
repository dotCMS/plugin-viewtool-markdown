# Github Flavored Markdown plugin

## Description
This dotCMS osgi plugin provides a github flavored markdown (gfm) compatible markdown parser (for the most part).  It is built off of the txtmark project  https://github.com/rjeschke/txtmark by René Jeschke.  It provides a viewtool that can be used in dotCMS to parse text/content for gfm.

###Usage
$markdown.parse("**Parse** *this* ~~string~~") will result in

**Parse** *this* ~~string~~

There are no dependices to install, all you need to do is upload the ./build/libs/plugin-viewtool-markdown-0.1.jar into your dynamic plugins screen and the viewtool should become active.



