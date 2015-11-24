// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserName$$JsonObjectMapper extends JsonMapper
{
    public static JsonUserName _parse(final JsonParser jsonParser) {
        JsonUserName jsonUserName = new JsonUserName();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonUserName = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonUserName, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonUserName;
    }
    
    public static void _serialize(final JsonUserName jsonUserName, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("name", jsonUserName.a);
        jsonGenerator.a("screen_name", jsonUserName.b);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonUserName jsonUserName, final String s, final JsonParser jsonParser) {
        if ("name".equals(s)) {
            jsonUserName.a = jsonParser.a((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonUserName.b = jsonParser.a((String)null);
        }
    }
    
    @Override
    public JsonUserName parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonUserName jsonUserName, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonUserName, jsonGenerator, b);
    }
}
