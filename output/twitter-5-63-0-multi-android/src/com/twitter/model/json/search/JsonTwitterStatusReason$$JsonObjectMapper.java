// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterStatusReason$$JsonObjectMapper extends JsonMapper
{
    public static JsonTwitterStatusReason _parse(final JsonParser jsonParser) {
        JsonTwitterStatusReason jsonTwitterStatusReason = new JsonTwitterStatusReason();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonTwitterStatusReason = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonTwitterStatusReason, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonTwitterStatusReason;
    }
    
    public static void _serialize(final JsonTwitterStatusReason jsonTwitterStatusReason, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("icon_type", jsonTwitterStatusReason.b);
        jsonGenerator.a("text", jsonTwitterStatusReason.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonTwitterStatusReason jsonTwitterStatusReason, final String s, final JsonParser jsonParser) {
        if ("icon_type".equals(s)) {
            jsonTwitterStatusReason.b = jsonParser.a((String)null);
        }
        else if ("text".equals(s)) {
            jsonTwitterStatusReason.a = jsonParser.a((String)null);
        }
    }
    
    @Override
    public JsonTwitterStatusReason parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonTwitterStatusReason jsonTwitterStatusReason, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonTwitterStatusReason, jsonGenerator, b);
    }
}
