// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMoment$$JsonObjectMapper extends JsonMapper
{
    public static JsonMoment _parse(final JsonParser jsonParser) {
        JsonMoment jsonMoment = new JsonMoment();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMoment = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMoment, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMoment;
    }
    
    public static void _serialize(final JsonMoment jsonMoment, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("can_subscribe", jsonMoment.g);
        jsonGenerator.a("description", jsonMoment.c);
        jsonGenerator.a("duration_string", jsonMoment.f);
        jsonGenerator.a("id", jsonMoment.a);
        jsonGenerator.a("is_live", jsonMoment.d);
        jsonGenerator.a("is_subscribed", jsonMoment.h);
        jsonGenerator.a("num_subscribers", jsonMoment.i);
        jsonGenerator.a("time_string", jsonMoment.e);
        jsonGenerator.a("title", jsonMoment.b);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMoment jsonMoment, final String s, final JsonParser jsonParser) {
        if ("can_subscribe".equals(s)) {
            jsonMoment.g = jsonParser.q();
        }
        else {
            if ("description".equals(s)) {
                jsonMoment.c = jsonParser.a((String)null);
                return;
            }
            if ("duration_string".equals(s)) {
                jsonMoment.f = jsonParser.a((String)null);
                return;
            }
            if ("id".equals(s)) {
                jsonMoment.a = jsonParser.o();
                return;
            }
            if ("is_live".equals(s)) {
                jsonMoment.d = jsonParser.q();
                return;
            }
            if ("is_subscribed".equals(s)) {
                jsonMoment.h = jsonParser.q();
                return;
            }
            if ("num_subscribers".equals(s)) {
                jsonMoment.i = jsonParser.n();
                return;
            }
            if ("time_string".equals(s)) {
                jsonMoment.e = jsonParser.a((String)null);
                return;
            }
            if ("title".equals(s)) {
                jsonMoment.b = jsonParser.a((String)null);
            }
        }
    }
    
    @Override
    public JsonMoment parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMoment jsonMoment, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMoment, jsonGenerator, b);
    }
}
