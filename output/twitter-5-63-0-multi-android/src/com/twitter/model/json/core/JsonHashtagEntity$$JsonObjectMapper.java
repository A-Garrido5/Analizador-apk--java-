// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHashtagEntity$$JsonObjectMapper extends JsonMapper
{
    public static JsonHashtagEntity _parse(final JsonParser jsonParser) {
        JsonHashtagEntity jsonHashtagEntity = new JsonHashtagEntity();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonHashtagEntity = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonHashtagEntity, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonHashtagEntity;
    }
    
    public static void _serialize(final JsonHashtagEntity jsonHashtagEntity, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("text", jsonHashtagEntity.b);
        JsonEntity$$JsonObjectMapper._serialize(jsonHashtagEntity, jsonGenerator, false);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonHashtagEntity jsonHashtagEntity, final String s, final JsonParser jsonParser) {
        if ("text".equals(s)) {
            jsonHashtagEntity.b = jsonParser.a((String)null);
            return;
        }
        JsonEntity$$JsonObjectMapper.parseField(jsonHashtagEntity, s, jsonParser);
    }
    
    @Override
    public JsonHashtagEntity parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonHashtagEntity jsonHashtagEntity, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonHashtagEntity, jsonGenerator, b);
    }
}
