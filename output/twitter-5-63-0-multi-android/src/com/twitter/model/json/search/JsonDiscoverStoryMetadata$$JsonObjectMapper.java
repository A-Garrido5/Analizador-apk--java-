// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDiscoverStoryMetadata$$JsonObjectMapper extends JsonMapper
{
    public static JsonDiscoverStoryMetadata _parse(final JsonParser jsonParser) {
        JsonDiscoverStoryMetadata jsonDiscoverStoryMetadata = new JsonDiscoverStoryMetadata();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonDiscoverStoryMetadata = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonDiscoverStoryMetadata, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonDiscoverStoryMetadata;
    }
    
    public static void _serialize(final JsonDiscoverStoryMetadata jsonDiscoverStoryMetadata, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("source", jsonDiscoverStoryMetadata.a);
        jsonGenerator.a("type", jsonDiscoverStoryMetadata.b);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonDiscoverStoryMetadata jsonDiscoverStoryMetadata, final String s, final JsonParser jsonParser) {
        if ("source".equals(s)) {
            jsonDiscoverStoryMetadata.a = jsonParser.a((String)null);
        }
        else if ("type".equals(s)) {
            jsonDiscoverStoryMetadata.b = jsonParser.a((String)null);
        }
    }
    
    @Override
    public JsonDiscoverStoryMetadata parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonDiscoverStoryMetadata jsonDiscoverStoryMetadata, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonDiscoverStoryMetadata, jsonGenerator, b);
    }
}
