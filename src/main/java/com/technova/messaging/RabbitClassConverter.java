package com.technova.messaging;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.technova.Result;
import com.technova.exceptions.BaseException;
import org.springframework.stereotype.Component;

@Component
public class RabbitClassConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> Result<T> convert(Object response, Class<T> responseObject) {
        try {
            JavaType resultType = objectMapper.getTypeFactory()
                    .constructParametricType(Result.class, responseObject);
            return objectMapper.convertValue(response, resultType);
        } catch (Exception e) {
            return Result.error(new BaseException("Failed to process response: " + e.getMessage()));
        }
    }
}


