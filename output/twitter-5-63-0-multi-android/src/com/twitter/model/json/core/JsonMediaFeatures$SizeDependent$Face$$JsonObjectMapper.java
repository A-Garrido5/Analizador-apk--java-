// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaFeatures$SizeDependent$Face$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaFeatures$SizeDependent$Face _parse(final JsonParser jsonParser) {
        JsonMediaFeatures$SizeDependent$Face jsonMediaFeatures$SizeDependent$Face = new JsonMediaFeatures$SizeDependent$Face();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaFeatures$SizeDependent$Face = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaFeatures$SizeDependent$Face, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaFeatures$SizeDependent$Face;
    }
    
    public static void _serialize(final JsonMediaFeatures$SizeDependent$Face jsonMediaFeatures$SizeDependent$Face, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("h", jsonMediaFeatures$SizeDependent$Face.c);
        jsonGenerator.a("w", jsonMediaFeatures$SizeDependent$Face.d);
        jsonGenerator.a("x", jsonMediaFeatures$SizeDependent$Face.a);
        jsonGenerator.a("y", jsonMediaFeatures$SizeDependent$Face.b);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaFeatures$SizeDependent$Face jsonMediaFeatures$SizeDependent$Face, final String s, final JsonParser jsonParser) {
        if ("h".equals(s)) {
            jsonMediaFeatures$SizeDependent$Face.c = jsonParser.n();
        }
        else {
            if ("w".equals(s)) {
                jsonMediaFeatures$SizeDependent$Face.d = jsonParser.n();
                return;
            }
            if ("x".equals(s)) {
                jsonMediaFeatures$SizeDependent$Face.a = jsonParser.n();
                return;
            }
            if ("y".equals(s)) {
                jsonMediaFeatures$SizeDependent$Face.b = jsonParser.n();
            }
        }
    }
    
    @Override
    public JsonMediaFeatures$SizeDependent$Face parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaFeatures$SizeDependent$Face jsonMediaFeatures$SizeDependent$Face, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaFeatures$SizeDependent$Face, jsonGenerator, b);
    }
}
