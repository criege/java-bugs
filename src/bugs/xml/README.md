Exposes a bug in the JDK (tested with 1.6 and 1.7) that occurs
when processing XML 1.1 with SAX.

If you switch the XML version in fails.xml from "1.1" to "1.0"
the test passes.

*When running the test make sure assertions are enabled, for
example by passing the "-ea" flag on the command line!*

*Update 2014-12-10*
The bug has been fixed as of Java 7u71 and (at least) 6u81.

