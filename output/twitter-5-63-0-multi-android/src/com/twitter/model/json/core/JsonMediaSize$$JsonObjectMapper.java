// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaSize$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaSize _parse(final JsonParser jsonParser) {
        JsonMediaSize jsonMediaSize = new JsonMediaSize();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaSize = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaSize, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaSize;
    }
    
    public static void _serialize(final JsonMediaSize jsonMediaSize, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("h", jsonMediaSize.b);
        jsonGenerator.a("w", jsonMediaSize.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaSize jsonMediaSize, final String s, final JsonParser jsonParser) {
        if ("h".equals(s)) {
            jsonMediaSize.b = jsonParser.n();
        }
        else if ("w".equals(s)) {
            jsonMediaSize.a = jsonParser.n();
        }
    }
    
    @Override
    public JsonMediaSize parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaSize jsonMediaSize, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaSize, jsonGenerator, b);
    }
}
