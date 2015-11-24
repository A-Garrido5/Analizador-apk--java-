// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPromotedContent$PromotedContentTrend$$JsonObjectMapper extends JsonMapper
{
    public static JsonPromotedContent$PromotedContentTrend _parse(final JsonParser jsonParser) {
        JsonPromotedContent$PromotedContentTrend jsonPromotedContent$PromotedContentTrend = new JsonPromotedContent$PromotedContentTrend();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonPromotedContent$PromotedContentTrend = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonPromotedContent$PromotedContentTrend, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonPromotedContent$PromotedContentTrend;
    }
    
    public static void _serialize(final JsonPromotedContent$PromotedContentTrend jsonPromotedContent$PromotedContentTrend, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("id", jsonPromotedContent$PromotedContentTrend.a);
        jsonGenerator.a("name", jsonPromotedContent$PromotedContentTrend.b);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonPromotedContent$PromotedContentTrend jsonPromotedContent$PromotedContentTrend, final String s, final JsonParser jsonParser) {
        if ("id".equals(s)) {
            jsonPromotedContent$PromotedContentTrend.a = jsonParser.o();
        }
        else if ("name".equals(s)) {
            jsonPromotedContent$PromotedContentTrend.b = jsonParser.a((String)null);
        }
    }
    
    @Override
    public JsonPromotedContent$PromotedContentTrend parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonPromotedContent$PromotedContentTrend jsonPromotedContent$PromotedContentTrend, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonPromotedContent$PromotedContentTrend, jsonGenerator, b);
    }
}
