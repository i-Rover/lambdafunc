package org.example;

import RequestModel.PushMethodMainRequestModel;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SimpleHandler implements RequestHandler<PushMethodMainRequestModel, String> {
    private final ObjectMapper objectMaper;

    public SimpleHandler(ObjectMapper objectMaper) {
        this.objectMaper = objectMaper;
    }

    public String handleRequest(PushMethodMainRequestModel input, Context context){
        LambdaLogger logger = context.getLogger();
        logger.log("JDK Version: "+ System.getProperty("java.version"));
        try {
            return objectMaper.writeValueAsString(input);
        } catch (JsonProcessingException e) {
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
    }
}