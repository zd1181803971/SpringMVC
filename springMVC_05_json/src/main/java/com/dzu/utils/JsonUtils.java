package com.dzu.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

public class JsonUtils {
    public static  String getJson(Object object)  {
        return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }
    public static String getJson(Object object, String dataFormat)  {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat sdf = new SimpleDateFormat(dataFormat);

        try {
            return mapper.writeValueAsString(sdf.format(object));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}