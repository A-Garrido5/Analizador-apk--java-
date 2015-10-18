// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonThemeData$$JsonObjectMapper extends JsonMapper
{
    public static JsonThemeData _parse(final JsonParser jsonParser) {
        JsonThemeData jsonThemeData = new JsonThemeData();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonThemeData = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonThemeData, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonThemeData;
    }
    
    public static void _serialize(final JsonThemeData jsonThemeData, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("bg", jsonThemeData.b);
        jsonGenerator.a("fg", jsonThemeData.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonThemeData jsonThemeData, final String s, final JsonParser jsonParser) {
        if ("bg".equals(s)) {
            jsonThemeData.b = jsonParser.n();
        }
        else if ("fg".equals(s)) {
            jsonThemeData.a = jsonParser.n();
        }
    }
    
    @Override
    public JsonThemeData parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonThemeData jsonThemeData, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonThemeData, jsonGenerator, b);
    }
}
