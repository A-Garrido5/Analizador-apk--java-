// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.model.json.search.JsonSearchSocialProof$$JsonObjectMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterUserMetadata$$JsonObjectMapper extends JsonMapper
{
    public static JsonTwitterUserMetadata _parse(final JsonParser jsonParser) {
        JsonTwitterUserMetadata jsonTwitterUserMetadata = new JsonTwitterUserMetadata();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonTwitterUserMetadata = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonTwitterUserMetadata, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonTwitterUserMetadata;
    }
    
    public static void _serialize(final JsonTwitterUserMetadata jsonTwitterUserMetadata, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("result_type", jsonTwitterUserMetadata.b);
        if (jsonTwitterUserMetadata.c != null) {
            jsonGenerator.a("social_context");
            JsonSearchSocialProof$$JsonObjectMapper._serialize(jsonTwitterUserMetadata.c, jsonGenerator, true);
        }
        jsonGenerator.a("title", jsonTwitterUserMetadata.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonTwitterUserMetadata jsonTwitterUserMetadata, final String s, final JsonParser jsonParser) {
        if ("result_type".equals(s)) {
            jsonTwitterUserMetadata.b = jsonParser.a((String)null);
        }
        else {
            if ("social_context".equals(s)) {
                jsonTwitterUserMetadata.c = JsonSearchSocialProof$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("title".equals(s)) {
                jsonTwitterUserMetadata.a = jsonParser.a((String)null);
            }
        }
    }
    
    @Override
    public JsonTwitterUserMetadata parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonTwitterUserMetadata jsonTwitterUserMetadata, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonTwitterUserMetadata, jsonGenerator, b);
    }
}
