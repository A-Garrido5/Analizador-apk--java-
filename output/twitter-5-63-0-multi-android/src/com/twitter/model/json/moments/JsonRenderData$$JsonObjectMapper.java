// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRenderData$$JsonObjectMapper extends JsonMapper
{
    public static JsonRenderData _parse(final JsonParser jsonParser) {
        JsonRenderData jsonRenderData = new JsonRenderData();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonRenderData = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonRenderData, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonRenderData;
    }
    
    public static void _serialize(final JsonRenderData jsonRenderData, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonRenderData.a != null) {
            jsonGenerator.a("crop");
            JsonCropData$$JsonObjectMapper._serialize(jsonRenderData.a, jsonGenerator, true);
        }
        if (jsonRenderData.b != null) {
            jsonGenerator.a("theme");
            JsonThemeData$$JsonObjectMapper._serialize(jsonRenderData.b, jsonGenerator, true);
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonRenderData jsonRenderData, final String s, final JsonParser jsonParser) {
        if ("crop".equals(s)) {
            jsonRenderData.a = JsonCropData$$JsonObjectMapper._parse(jsonParser);
        }
        else if ("theme".equals(s)) {
            jsonRenderData.b = JsonThemeData$$JsonObjectMapper._parse(jsonParser);
        }
    }
    
    @Override
    public JsonRenderData parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonRenderData jsonRenderData, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonRenderData, jsonGenerator, b);
    }
}
