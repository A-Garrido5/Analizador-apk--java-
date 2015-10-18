// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaSizes$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaSizes _parse(final JsonParser jsonParser) {
        JsonMediaSizes jsonMediaSizes = new JsonMediaSizes();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaSizes = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaSizes, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaSizes;
    }
    
    public static void _serialize(final JsonMediaSizes jsonMediaSizes, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonMediaSizes.a != null) {
            jsonGenerator.a("large");
            JsonMediaSize$$JsonObjectMapper._serialize(jsonMediaSizes.a, jsonGenerator, true);
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaSizes jsonMediaSizes, final String s, final JsonParser jsonParser) {
        if ("large".equals(s)) {
            jsonMediaSizes.a = JsonMediaSize$$JsonObjectMapper._parse(jsonParser);
        }
    }
    
    @Override
    public JsonMediaSizes parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaSizes jsonMediaSizes, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaSizes, jsonGenerator, b);
    }
}
