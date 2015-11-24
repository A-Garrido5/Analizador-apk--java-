// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaFeatures$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaFeatures _parse(final JsonParser jsonParser) {
        JsonMediaFeatures jsonMediaFeatures = new JsonMediaFeatures();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaFeatures = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaFeatures, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaFeatures;
    }
    
    public static void _serialize(final JsonMediaFeatures jsonMediaFeatures, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonMediaFeatures.b != null) {
            jsonGenerator.a("large");
            JsonMediaFeatures$SizeDependent$$JsonObjectMapper._serialize(jsonMediaFeatures.b, jsonGenerator, true);
        }
        if (jsonMediaFeatures.a != null) {
            jsonGenerator.a("all");
            JsonMediaFeatures$SizeIndependent$$JsonObjectMapper._serialize(jsonMediaFeatures.a, jsonGenerator, true);
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaFeatures jsonMediaFeatures, final String s, final JsonParser jsonParser) {
        if ("large".equals(s)) {
            jsonMediaFeatures.b = JsonMediaFeatures$SizeDependent$$JsonObjectMapper._parse(jsonParser);
        }
        else if ("all".equals(s)) {
            jsonMediaFeatures.a = JsonMediaFeatures$SizeIndependent$$JsonObjectMapper._parse(jsonParser);
        }
    }
    
    @Override
    public JsonMediaFeatures parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaFeatures jsonMediaFeatures, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaFeatures, jsonGenerator, b);
    }
}
