// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline.wtf;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonStrings$$JsonObjectMapper extends JsonMapper
{
    public static JsonStrings _parse(final JsonParser jsonParser) {
        JsonStrings jsonStrings = new JsonStrings();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonStrings = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonStrings, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonStrings;
    }
    
    public static void _serialize(final JsonStrings jsonStrings, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("dismiss", jsonStrings.c);
        jsonGenerator.a("feedback", jsonStrings.d);
        jsonGenerator.a("header", jsonStrings.e);
        jsonGenerator.a("no", jsonStrings.b);
        jsonGenerator.a("show_more", jsonStrings.f);
        jsonGenerator.a("yes", jsonStrings.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonStrings jsonStrings, final String s, final JsonParser jsonParser) {
        if ("dismiss".equals(s)) {
            jsonStrings.c = jsonParser.a((String)null);
        }
        else {
            if ("feedback".equals(s)) {
                jsonStrings.d = jsonParser.a((String)null);
                return;
            }
            if ("header".equals(s)) {
                jsonStrings.e = jsonParser.a((String)null);
                return;
            }
            if ("no".equals(s)) {
                jsonStrings.b = jsonParser.a((String)null);
                return;
            }
            if ("show_more".equals(s)) {
                jsonStrings.f = jsonParser.a((String)null);
                return;
            }
            if ("yes".equals(s)) {
                jsonStrings.a = jsonParser.a((String)null);
            }
        }
    }
    
    @Override
    public JsonStrings parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonStrings jsonStrings, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonStrings, jsonGenerator, b);
    }
}
