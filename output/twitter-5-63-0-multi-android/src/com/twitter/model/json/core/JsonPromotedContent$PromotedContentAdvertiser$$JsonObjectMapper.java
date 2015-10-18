// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPromotedContent$PromotedContentAdvertiser$$JsonObjectMapper extends JsonMapper
{
    public static JsonPromotedContent$PromotedContentAdvertiser _parse(final JsonParser jsonParser) {
        JsonPromotedContent$PromotedContentAdvertiser jsonPromotedContent$PromotedContentAdvertiser = new JsonPromotedContent$PromotedContentAdvertiser();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonPromotedContent$PromotedContentAdvertiser = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonPromotedContent$PromotedContentAdvertiser, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonPromotedContent$PromotedContentAdvertiser;
    }
    
    public static void _serialize(final JsonPromotedContent$PromotedContentAdvertiser jsonPromotedContent$PromotedContentAdvertiser, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("id", jsonPromotedContent$PromotedContentAdvertiser.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonPromotedContent$PromotedContentAdvertiser jsonPromotedContent$PromotedContentAdvertiser, final String s, final JsonParser jsonParser) {
        if ("id".equals(s)) {
            jsonPromotedContent$PromotedContentAdvertiser.a = jsonParser.o();
        }
    }
    
    @Override
    public JsonPromotedContent$PromotedContentAdvertiser parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonPromotedContent$PromotedContentAdvertiser jsonPromotedContent$PromotedContentAdvertiser, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonPromotedContent$PromotedContentAdvertiser, jsonGenerator, b);
    }
}
