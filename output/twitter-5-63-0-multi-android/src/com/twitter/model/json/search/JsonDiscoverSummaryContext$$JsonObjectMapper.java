// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.twitter.model.json.core.JsonUserName$$JsonObjectMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDiscoverSummaryContext$$JsonObjectMapper extends JsonMapper
{
    public static JsonDiscoverSummaryContext _parse(final JsonParser jsonParser) {
        JsonDiscoverSummaryContext jsonDiscoverSummaryContext = new JsonDiscoverSummaryContext();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonDiscoverSummaryContext = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonDiscoverSummaryContext, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonDiscoverSummaryContext;
    }
    
    public static void _serialize(final JsonDiscoverSummaryContext jsonDiscoverSummaryContext, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("favorite", jsonDiscoverSummaryContext.b);
        jsonGenerator.a("retweet", jsonDiscoverSummaryContext.c);
        jsonGenerator.a("top", jsonDiscoverSummaryContext.e);
        jsonGenerator.a("trending", jsonDiscoverSummaryContext.d);
        if (jsonDiscoverSummaryContext.a != null) {
            jsonGenerator.a("user");
            JsonUserName$$JsonObjectMapper._serialize(jsonDiscoverSummaryContext.a, jsonGenerator, true);
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonDiscoverSummaryContext jsonDiscoverSummaryContext, final String s, final JsonParser jsonParser) {
        if ("favorite".equals(s)) {
            jsonDiscoverSummaryContext.b = jsonParser.n();
        }
        else {
            if ("retweet".equals(s)) {
                jsonDiscoverSummaryContext.c = jsonParser.n();
                return;
            }
            if ("top".equals(s)) {
                jsonDiscoverSummaryContext.e = jsonParser.a((String)null);
                return;
            }
            if ("trending".equals(s)) {
                jsonDiscoverSummaryContext.d = jsonParser.a((String)null);
                return;
            }
            if ("user".equals(s)) {
                jsonDiscoverSummaryContext.a = JsonUserName$$JsonObjectMapper._parse(jsonParser);
            }
        }
    }
    
    @Override
    public JsonDiscoverSummaryContext parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonDiscoverSummaryContext jsonDiscoverSummaryContext, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonDiscoverSummaryContext, jsonGenerator, b);
    }
}
