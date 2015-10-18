// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare;

import java.io.OutputStream;
import java.util.List;
import java.io.InputStream;
import com.bluelinelabs.logansquare.typeconverters.DefaultCalendarConverter;
import java.util.Calendar;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.bluelinelabs.logansquare.typeconverters.DefaultDateConverter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.JsonFactory;

public class LoganSquare
{
    public static final JsonFactory JSON_FACTORY;
    private static final Map OBJECT_MAPPERS;
    private static final Map TYPE_CONVERTERS;
    
    static {
        OBJECT_MAPPERS = new HashMap();
        TYPE_CONVERTERS = new HashMap();
        registerTypeConverter(Date.class, new DefaultDateConverter());
        registerTypeConverter(Calendar.class, new DefaultCalendarConverter());
        JSON_FACTORY = new JsonFactory();
    }
    
    public static JsonMapper mapperFor(final Class clazz) {
        JsonMapper jsonMapper = LoganSquare.OBJECT_MAPPERS.get(clazz);
        if (jsonMapper != null) {
            return jsonMapper;
        }
        try {
            jsonMapper = (JsonMapper)Class.forName(clazz.getName() + "$$JsonObjectMapper").newInstance();
            LoganSquare.OBJECT_MAPPERS.put(clazz, jsonMapper);
            return jsonMapper;
        }
        catch (Exception ex) {
            throw new NoSuchMapperException(clazz, ex);
        }
    }
    
    public static Object parse(final InputStream inputStream, final Class clazz) {
        return mapperFor(clazz).parse(inputStream);
    }
    
    public static Object parse(final String s, final Class clazz) {
        return mapperFor(clazz).parse(s);
    }
    
    public static List parseList(final InputStream inputStream, final Class clazz) {
        return mapperFor(clazz).parseList(inputStream);
    }
    
    public static List parseList(final String s, final Class clazz) {
        return mapperFor(clazz).parseList(s);
    }
    
    public static Map parseMap(final InputStream inputStream, final Class clazz) {
        return mapperFor(clazz).parseMap(inputStream);
    }
    
    public static Map parseMap(final String s, final Class clazz) {
        return mapperFor(clazz).parseMap(s);
    }
    
    public static void registerTypeConverter(final Class clazz, final TypeConverter typeConverter) {
        LoganSquare.TYPE_CONVERTERS.put(clazz, typeConverter);
    }
    
    public static String serialize(final Object o) {
        return mapperFor(o.getClass()).serialize(o);
    }
    
    public static String serialize(final List list, final Class clazz) {
        return mapperFor(clazz).serialize(list);
    }
    
    public static String serialize(final Map map, final Class clazz) {
        return mapperFor(clazz).serialize(map);
    }
    
    public static void serialize(final Object o, final OutputStream outputStream) {
        mapperFor(o.getClass()).serialize(o, outputStream);
    }
    
    public static void serialize(final List list, final OutputStream outputStream, final Class clazz) {
        mapperFor(clazz).serialize(list, outputStream);
    }
    
    public static void serialize(final Map map, final OutputStream outputStream, final Class clazz) {
        mapperFor(clazz).serialize(map, outputStream);
    }
    
    public static TypeConverter typeConverterFor(final Class clazz) {
        final TypeConverter typeConverter = LoganSquare.TYPE_CONVERTERS.get(clazz);
        if (typeConverter == null) {
            throw new NoSuchTypeConverterException(clazz);
        }
        return typeConverter;
    }
}
