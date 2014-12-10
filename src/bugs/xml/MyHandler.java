package bugs.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName,
        Attributes attributes) throws SAXException
    {
        if ("code".equals(qName)) {
            String id = attributes.getValue("id");
            assert id.matches("[A-Z]{2}");
        }
    }

}
