package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.HashMap;
import java.util.Map;

public class SimpleHandler implements RequestHandler<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> handleRequest(Map<String, Object> event, Context context) {
        // Log the incoming event
        System.out.println("Received event: " + event);
        // Initialize headers
        Map<String, String> headers = new HashMap<>();
        // Copy Location header from incoming headers
        if (event.containsKey("header")) {
            Map<String, String> incomingHeaders = (Map<String, String>) event.get("header");
            if (incomingHeaders.containsKey("Location")) {
                headers.put("Location", incomingHeaders.get("Location"));
            }
        }
        // Copy query parameter "code" to bodyResponse if present
        Map<String, Object> bodyResponse = new HashMap<>(event);
        if (event.containsKey("queryStringParameters")) {
            Map<String, String> queryParams = (Map<String, String>) event.get("queryStringParameters");
            if (queryParams.containsKey("code")) {
                bodyResponse.put("code", queryParams.get("code"));
            }
        }
        // Construct response
        Map<String, Object> response = new HashMap<>();
        response.put("statusCode", 200);
        response.put("headers", headers);
        response.put("body", bodyResponse);
        // Log the response
        System.out.println("Sending response: " + response);
        return response;
    }
}