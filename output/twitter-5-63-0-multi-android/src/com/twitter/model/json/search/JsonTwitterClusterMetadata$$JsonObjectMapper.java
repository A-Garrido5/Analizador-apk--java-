// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterClusterMetadata$$JsonObjectMapper extends JsonMapper
{
    public static JsonTwitterClusterMetadata _parse(final JsonParser jsonParser) {
        JsonTwitterClusterMetadata jsonTwitterClusterMetadata = new JsonTwitterClusterMetadata();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonTwitterClusterMetadata = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonTwitterClusterMetadata, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonTwitterClusterMetadata;
    }
    
    public static void _serialize(final JsonTwitterClusterMetadata jsonTwitterClusterMetadata, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("cluster_id", jsonTwitterClusterMetadata.a);
        jsonGenerator.a("size", jsonTwitterClusterMetadata.e);
        jsonGenerator.a("subtitle", jsonTwitterClusterMetadata.d);
        jsonGenerator.a("timestamp", jsonTwitterClusterMetadata.f);
        jsonGenerator.a("title", jsonTwitterClusterMetadata.c);
        jsonGenerator.a("type", jsonTwitterClusterMetadata.b);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonTwitterClusterMetadata jsonTwitterClusterMetadata, final String s, final JsonParser jsonParser) {
        if ("cluster_id".equals(s)) {
            jsonTwitterClusterMetadata.a = jsonParser.a((String)null);
        }
        else {
            if ("size".equals(s)) {
                jsonTwitterClusterMetadata.e = jsonParser.o();
                return;
            }
            if ("subtitle".equals(s)) {
                jsonTwitterClusterMetadata.d = jsonParser.a((String)null);
                return;
            }
            if ("timestamp".equals(s)) {
                jsonTwitterClusterMetadata.f = jsonParser.o();
                return;
            }
            if ("title".equals(s)) {
                jsonTwitterClusterMetadata.c = jsonParser.a((String)null);
                return;
            }
            if ("type".equals(s)) {
                jsonTwitterClusterMetadata.b = jsonParser.a((String)null);
            }
        }
    }
    
    @Override
    public JsonTwitterClusterMetadata parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonTwitterClusterMetadata jsonTwitterClusterMetadata, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonTwitterClusterMetadata, jsonGenerator, b);
    }
}
