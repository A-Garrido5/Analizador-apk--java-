// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMentionEntity$$JsonObjectMapper extends JsonMapper
{
    public static JsonMentionEntity _parse(final JsonParser jsonParser) {
        JsonMentionEntity jsonMentionEntity = new JsonMentionEntity();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMentionEntity = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMentionEntity, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMentionEntity;
    }
    
    public static void _serialize(final JsonMentionEntity jsonMentionEntity, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("name", jsonMentionEntity.d);
        jsonGenerator.a("screen_name", jsonMentionEntity.b);
        jsonGenerator.a("id", jsonMentionEntity.c);
        JsonEntity$$JsonObjectMapper._serialize(jsonMentionEntity, jsonGenerator, false);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMentionEntity jsonMentionEntity, final String s, final JsonParser jsonParser) {
        if ("name".equals(s)) {
            jsonMentionEntity.d = jsonParser.a((String)null);
            return;
        }
        if ("screen_name".equals(s)) {
            jsonMentionEntity.b = jsonParser.a((String)null);
            return;
        }
        if ("id".equals(s)) {
            jsonMentionEntity.c = jsonParser.o();
            return;
        }
        JsonEntity$$JsonObjectMapper.parseField(jsonMentionEntity, s, jsonParser);
    }
    
    @Override
    public JsonMentionEntity parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMentionEntity jsonMentionEntity, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMentionEntity, jsonGenerator, b);
    }
}
