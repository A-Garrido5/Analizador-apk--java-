// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubscriptionStatus$$JsonObjectMapper extends JsonMapper
{
    public static JsonSubscriptionStatus _parse(final JsonParser jsonParser) {
        JsonSubscriptionStatus jsonSubscriptionStatus = new JsonSubscriptionStatus();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonSubscriptionStatus = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonSubscriptionStatus, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonSubscriptionStatus;
    }
    
    public static void _serialize(final JsonSubscriptionStatus jsonSubscriptionStatus, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("is_subscribed", jsonSubscriptionStatus.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonSubscriptionStatus jsonSubscriptionStatus, final String s, final JsonParser jsonParser) {
        if ("is_subscribed".equals(s)) {
            jsonSubscriptionStatus.a = jsonParser.q();
        }
    }
    
    @Override
    public JsonSubscriptionStatus parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonSubscriptionStatus jsonSubscriptionStatus, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonSubscriptionStatus, jsonGenerator, b);
    }
}
