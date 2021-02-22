package com.journaldev.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidation {

    public static final String VALIDATE_S_AGAINST_S_RESULT_S = "Validate %s against %s. Result: %s";

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) throws IOException, SAXException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new File(xsdPath));
        Validator validator = schema.newValidator();
        validator.validate(new StreamSource(new File(xmlPath)));
        return true;
    }

    public static void checkXml(String xml, String xsd) {
        try {
            System.out.println(String.format(VALIDATE_S_AGAINST_S_RESULT_S, xml, xsd,
                    validateXMLSchema(App.RESOURCES_PATH + xsd, App.RESOURCES_PATH + xml)));
        } catch (IOException | SAXException e) {
            System.out.println(String.format(VALIDATE_S_AGAINST_S_RESULT_S, xml, xsd, false));
            System.out.println(String.format("[Exception: %s]\n", e.getMessage()));
        }
    }
}