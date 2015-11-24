// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrlEntity$$JsonObjectMapper extends JsonMapper
{
    public static JsonUrlEntity _parse(final JsonParser jsonParser) {
        JsonUrlEntity jsonUrlEntity = new JsonUrlEntity();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonUrlEntity = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonUrlEntity, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonUrlEntity;
    }
    
    public static void _serialize(final JsonUrlEntity jsonUrlEntity, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("display_url", jsonUrlEntity.l);
        jsonGenerator.a("expanded_url", jsonUrlEntity.k);
        jsonGenerator.a("url", jsonUrlEntity.m);
        jsonGenerator.a("url_https", jsonUrlEntity.j);
        JsonEntity$$JsonObjectMapper._serialize(jsonUrlEntity, jsonGenerator, false);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonUrlEntity jsonUrlEntity, final String s, final JsonParser jsonParser) {
        if ("display_url".equals(s)) {
            jsonUrlEntity.l = jsonParser.a((String)null);
            return;
        }
        if ("expanded_url".equals(s)) {
            jsonUrlEntity.k = jsonParser.a((String)null);
            return;
        }
        if ("url".equals(s)) {
            jsonUrlEntity.m = jsonParser.a((String)null);
            return;
        }
        if ("url_https".equals(s)) {
            jsonUrlEntity.j = jsonParser.a((String)null);
            return;
        }
        JsonEntity$$JsonObjectMapper.parseField(jsonUrlEntity, s, jsonParser);
    }
    
    @Override
    public JsonUrlEntity parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonUrlEntity jsonUrlEntity, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonUrlEntity, jsonGenerator, b);
    }
}
