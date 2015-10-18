// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare;

import java.util.Iterator;
import java.io.OutputStream;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Writer;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;
import com.fasterxml.jackson.core.JsonParser;

public abstract class JsonMapper
{
    public abstract Object parse(final JsonParser p0);
    
    public Object parse(final InputStream inputStream) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(inputStream);
        a.a();
        return this.parse(a);
    }
    
    public Object parse(final String s) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(s);
        a.a();
        return this.parse(a);
    }
    
    public Object parse(final byte[] array) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(array);
        a.a();
        return this.parse(a);
    }
    
    public Object parse(final char[] array) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(array);
        a.a();
        return this.parse(a);
    }
    
    public List parseList(final JsonParser jsonParser) {
        final ArrayList<Object> list = new ArrayList<Object>();
        if (jsonParser.d() == JsonToken.d) {
            while (jsonParser.a() != JsonToken.e) {
                final Object parse = this.parse(jsonParser);
                if (parse != null) {
                    list.add(parse);
                }
            }
        }
        return list;
    }
    
    public List parseList(final InputStream inputStream) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(inputStream);
        a.a();
        return this.parseList(a);
    }
    
    public List parseList(final String s) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(s);
        a.a();
        return this.parseList(a);
    }
    
    public List parseList(final byte[] array) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(array);
        a.a();
        return this.parseList(a);
    }
    
    public List parseList(final char[] array) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(array);
        a.a();
        return this.parseList(a);
    }
    
    public Map parseMap(final JsonParser jsonParser) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        while (jsonParser.a() != JsonToken.c) {
            final String g = jsonParser.g();
            jsonParser.a();
            if (jsonParser.d() == JsonToken.m) {
                hashMap.put(g, null);
            }
            else {
                hashMap.put(g, this.parse(jsonParser));
            }
        }
        return hashMap;
    }
    
    public Map parseMap(final InputStream inputStream) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(inputStream);
        a.a();
        return this.parseMap(a);
    }
    
    public Map parseMap(final String s) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(s);
        a.a();
        return this.parseMap(a);
    }
    
    public Map parseMap(final byte[] array) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(array);
        a.a();
        return this.parseMap(a);
    }
    
    public Map parseMap(final char[] array) {
        final JsonParser a = LoganSquare.JSON_FACTORY.a(array);
        a.a();
        return this.parseMap(a);
    }
    
    public String serialize(final Object o) {
        final StringWriter stringWriter = new StringWriter();
        final JsonGenerator a = LoganSquare.JSON_FACTORY.a(stringWriter);
        this.serialize(o, a, true);
        a.close();
        return stringWriter.toString();
    }
    
    public String serialize(final List list) {
        final StringWriter stringWriter = new StringWriter();
        final JsonGenerator a = LoganSquare.JSON_FACTORY.a(stringWriter);
        this.serialize(list, a);
        a.close();
        return stringWriter.toString();
    }
    
    public String serialize(final Map map) {
        final StringWriter stringWriter = new StringWriter();
        final JsonGenerator a = LoganSquare.JSON_FACTORY.a(stringWriter);
        this.serialize(map, a);
        a.close();
        return stringWriter.toString();
    }
    
    public abstract void serialize(final Object p0, final JsonGenerator p1, final boolean p2);
    
    public void serialize(final Object o, final OutputStream outputStream) {
        final JsonGenerator a = LoganSquare.JSON_FACTORY.a(outputStream);
        this.serialize(o, a, true);
        a.close();
    }
    
    public void serialize(final List list, final JsonGenerator jsonGenerator) {
        jsonGenerator.a();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.serialize(iterator.next(), jsonGenerator, true);
        }
        jsonGenerator.b();
    }
    
    public void serialize(final List list, final OutputStream outputStream) {
        final JsonGenerator a = LoganSquare.JSON_FACTORY.a(outputStream);
        this.serialize(list, a);
        a.close();
    }
    
    public void serialize(final Map map, final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            jsonGenerator.a(entry.getKey());
            if (entry.getValue() == null) {
                jsonGenerator.e();
            }
            else {
                this.serialize(entry.getValue(), jsonGenerator, true);
            }
        }
        jsonGenerator.d();
    }
    
    public void serialize(final Map map, final OutputStream outputStream) {
        final JsonGenerator a = LoganSquare.JSON_FACTORY.a(outputStream);
        this.serialize(map, a);
        a.close();
    }
}
