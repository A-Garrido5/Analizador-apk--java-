// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaVideoVariant$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaVideoVariant _parse(final JsonParser jsonParser) {
        JsonMediaVideoVariant jsonMediaVideoVariant = new JsonMediaVideoVariant();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaVideoVariant = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaVideoVariant, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaVideoVariant;
    }
    
    public static void _serialize(final JsonMediaVideoVariant jsonMediaVideoVariant, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("bitrate", jsonMediaVideoVariant.c);
        jsonGenerator.a("content_type", jsonMediaVideoVariant.b);
        jsonGenerator.a("url", jsonMediaVideoVariant.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaVideoVariant jsonMediaVideoVariant, final String s, final JsonParser jsonParser) {
        if ("bitrate".equals(s)) {
            jsonMediaVideoVariant.c = jsonParser.n();
        }
        else {
            if ("content_type".equals(s)) {
                jsonMediaVideoVariant.b = jsonParser.a((String)null);
                return;
            }
            if ("url".equals(s)) {
                jsonMediaVideoVariant.a = jsonParser.a((String)null);
            }
        }
    }
    
    @Override
    public JsonMediaVideoVariant parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaVideoVariant jsonMediaVideoVariant, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaVideoVariant, jsonGenerator, b);
    }
}
