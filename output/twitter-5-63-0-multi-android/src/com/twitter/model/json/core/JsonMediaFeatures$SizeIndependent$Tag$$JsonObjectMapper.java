// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaFeatures$SizeIndependent$Tag$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaFeatures$SizeIndependent$Tag _parse(final JsonParser jsonParser) {
        JsonMediaFeatures$SizeIndependent$Tag jsonMediaFeatures$SizeIndependent$Tag = new JsonMediaFeatures$SizeIndependent$Tag();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaFeatures$SizeIndependent$Tag = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaFeatures$SizeIndependent$Tag, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaFeatures$SizeIndependent$Tag;
    }
    
    public static void _serialize(final JsonMediaFeatures$SizeIndependent$Tag jsonMediaFeatures$SizeIndependent$Tag, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("name", jsonMediaFeatures$SizeIndependent$Tag.b);
        jsonGenerator.a("screen_name", jsonMediaFeatures$SizeIndependent$Tag.c);
        jsonGenerator.a("user_id", jsonMediaFeatures$SizeIndependent$Tag.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaFeatures$SizeIndependent$Tag jsonMediaFeatures$SizeIndependent$Tag, final String s, final JsonParser jsonParser) {
        if ("name".equals(s)) {
            jsonMediaFeatures$SizeIndependent$Tag.b = jsonParser.a((String)null);
        }
        else {
            if ("screen_name".equals(s)) {
                jsonMediaFeatures$SizeIndependent$Tag.c = jsonParser.a((String)null);
                return;
            }
            if ("user_id".equals(s)) {
                jsonMediaFeatures$SizeIndependent$Tag.a = jsonParser.o();
            }
        }
    }
    
    @Override
    public JsonMediaFeatures$SizeIndependent$Tag parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaFeatures$SizeIndependent$Tag jsonMediaFeatures$SizeIndependent$Tag, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaFeatures$SizeIndependent$Tag, jsonGenerator, b);
    }
}
