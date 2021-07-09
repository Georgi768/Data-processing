package com.example.Api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public abstract class XmlJsonValidator {
    public XmlJsonValidator() {
    }

    public boolean validateJson(Object newObject, @RequestBody Object object, String schemaPath)
    {
        InputStream schemaStream = newObject.getClass().getClassLoader().getResourceAsStream(schemaPath);
        JsonSchema schema = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7).getSchema(schemaStream);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.valueToTree(object);
        Set<ValidationMessage> errors = schema.validate(jsonNode);

        String allMessages = "";
        for(ValidationMessage message : errors)
        {

            allMessages += message.toString() + "\n";
        }

        if(errors.size() > 0)
        {
            throw new RuntimeException("Fix your json" + allMessages);
        }
        return true;
    }

//    public void validateXML(@RequestBody Object object, String path) throws JAXBException, SAXException {
//        JAXBContext context = JAXBContext.newInstance(object.getClass());
//        Marshaller marshaller = context.createMarshaller();
//        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//        Schema schema = schemaFactory.newSchema(new File(path));
//        marshaller.setSchema(schema);
//        marshaller.setEventHandler(validationEvent -> {
//                System.out.println(validationEvent);
//                return true;
//        });
//        marshaller.marshal(object,System.out);
//    }
}
