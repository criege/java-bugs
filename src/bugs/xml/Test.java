/*
 * Copyright (c) 2014 Riege Software. All rights reserved.
 * Use is subject to license terms.
 */
package bugs.xml;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Test {

    public static void main(String[] args) throws Exception {
        InputStream in = Test.class.getResourceAsStream("fails.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        saxParser.parse(in, new MyHandler());
    }

}
