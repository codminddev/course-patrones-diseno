package patrones.strategy.util;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;

public class XMLUserUtil {
    private static final String rolXPath = "Users/User[@userName='%s' and @password='%s']/@rol";
    
    public static String getRolByPrincipal(String userName, String password){
        InputStream file = null;
        try {
            file = XMLUserUtil.class.getClass().getResourceAsStream("/META-INF/UserFile.xml");
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file);
            XPath xPath = XPathFactory.newInstance().newXPath();
            
            String xpath = String.format(rolXPath, userName,password);
            String rol = xPath.compile(xpath).evaluate(xmlDocument);
            return rol;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try { file.close(); } catch (IOException ex) {}
        }
    }
}
