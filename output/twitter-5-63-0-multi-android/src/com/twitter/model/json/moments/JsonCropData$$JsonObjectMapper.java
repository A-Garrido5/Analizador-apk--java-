// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCropData$$JsonObjectMapper extends JsonMapper
{
    public static JsonCropData _parse(final JsonParser jsonParser) {
        JsonCropData jsonCropData = new JsonCropData();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonCropData = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonCropData, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonCropData;
    }
    
    public static void _serialize(final JsonCropData jsonCropData, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("height", jsonCropData.d);
        jsonGenerator.a("width", jsonCropData.c);
        jsonGenerator.a("x", jsonCropData.a);
        jsonGenerator.a("y", jsonCropData.b);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonCropData jsonCropData, final String s, final JsonParser jsonParser) {
        if ("height".equals(s)) {
            jsonCropData.d = jsonParser.n();
        }
        else {
            if ("width".equals(s)) {
                jsonCropData.c = jsonParser.n();
                return;
            }
            if ("x".equals(s)) {
                jsonCropData.a = jsonParser.n();
                return;
            }
            if ("y".equals(s)) {
                jsonCropData.b = jsonParser.n();
            }
        }
    }
    
    @Override
    public JsonCropData parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonCropData jsonCropData, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonCropData, jsonGenerator, b);
    }
}
