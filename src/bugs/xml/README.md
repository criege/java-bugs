Exposes a bug in the JDK (tested with 1.6 and 1.7) that occurs
when processing XML 1.1 with SAX.

If you switch the XML version in fails.xml from "1.1" to "1.0"
the test passes.
