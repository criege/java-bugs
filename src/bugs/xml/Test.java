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
        System.out.println(System.getProperty("java.version"));
        InputStream in = null;
        try {
            in = Test.class.getResourceAsStream("fails.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(in, new MyHandler());
            System.out.println("Bug is not present.");
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

}
