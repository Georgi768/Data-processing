package com.example.Api;

import com.example.Api.WorldHappines.WorldHappinessController;
import com.example.Api.WorldHappines.Worldhappiness;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.InputStream;
import java.util.Set;

public abstract class XmlJsonValidator {
    public XmlJsonValidator() {
    }

    public boolean validateJson(@RequestBody Object object, String schemaPath)
    {
        InputStream schemaStream = WorldHappinessController.class.getClassLoader().getResourceAsStream(schemaPath);
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
}
