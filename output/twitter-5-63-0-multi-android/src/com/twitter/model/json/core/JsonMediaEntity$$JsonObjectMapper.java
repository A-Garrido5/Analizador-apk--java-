// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.MediaEntity$Type;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaEntity$$JsonObjectMapper extends JsonMapper
{
    protected static final a JSON_MEDIA_ENTITY_TYPE_CONVERTER;
    
    static {
        JSON_MEDIA_ENTITY_TYPE_CONVERTER = new a();
    }
    
    public static JsonMediaEntity _parse(final JsonParser jsonParser) {
        JsonMediaEntity jsonMediaEntity = new JsonMediaEntity();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaEntity = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaEntity, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaEntity;
    }
    
    public static void _serialize(final JsonMediaEntity jsonMediaEntity, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonMediaEntity.h != null) {
            jsonGenerator.a("features");
            JsonMediaFeatures$$JsonObjectMapper._serialize(jsonMediaEntity.h, jsonGenerator, true);
        }
        jsonGenerator.a("id", jsonMediaEntity.b);
        jsonGenerator.a("media_url", jsonMediaEntity.e);
        jsonGenerator.a("media_url_https", jsonMediaEntity.d);
        if (jsonMediaEntity.g != null) {
            jsonGenerator.a("sizes");
            JsonMediaSizes$$JsonObjectMapper._serialize(jsonMediaEntity.g, jsonGenerator, true);
        }
        jsonGenerator.a("source_status_id", jsonMediaEntity.f);
        if (jsonMediaEntity.c != null) {
            JsonMediaEntity$$JsonObjectMapper.JSON_MEDIA_ENTITY_TYPE_CONVERTER.serialize(jsonMediaEntity.c, "type", true, jsonGenerator);
        }
        if (jsonMediaEntity.i != null) {
            jsonGenerator.a("video_info");
            JsonMediaVideoInfo$$JsonObjectMapper._serialize(jsonMediaEntity.i, jsonGenerator, true);
        }
        JsonUrlEntity$$JsonObjectMapper._serialize(jsonMediaEntity, jsonGenerator, false);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaEntity jsonMediaEntity, final String s, final JsonParser jsonParser) {
        if ("features".equals(s)) {
            jsonMediaEntity.h = JsonMediaFeatures$$JsonObjectMapper._parse(jsonParser);
            return;
        }
        if ("id".equals(s)) {
            jsonMediaEntity.b = jsonParser.o();
            return;
        }
        if ("media_url".equals(s)) {
            jsonMediaEntity.e = jsonParser.a((String)null);
            return;
        }
        if ("media_url_https".equals(s)) {
            jsonMediaEntity.d = jsonParser.a((String)null);
            return;
        }
        if ("sizes".equals(s)) {
            jsonMediaEntity.g = JsonMediaSizes$$JsonObjectMapper._parse(jsonParser);
            return;
        }
        if ("source_status_id".equals(s)) {
            jsonMediaEntity.f = jsonParser.o();
            return;
        }
        if ("type".equals(s)) {
            jsonMediaEntity.c = (MediaEntity$Type)JsonMediaEntity$$JsonObjectMapper.JSON_MEDIA_ENTITY_TYPE_CONVERTER.parse(jsonParser);
            return;
        }
        if ("video_info".equals(s)) {
            jsonMediaEntity.i = JsonMediaVideoInfo$$JsonObjectMapper._parse(jsonParser);
            return;
        }
        JsonUrlEntity$$JsonObjectMapper.parseField(jsonMediaEntity, s, jsonParser);
    }
    
    @Override
    public JsonMediaEntity parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaEntity jsonMediaEntity, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaEntity, jsonGenerator, b);
    }
}
