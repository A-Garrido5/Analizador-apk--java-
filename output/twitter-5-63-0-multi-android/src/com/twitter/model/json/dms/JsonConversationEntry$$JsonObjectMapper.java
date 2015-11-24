// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.dms;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConversationEntry$$JsonObjectMapper extends JsonMapper
{
    public static JsonConversationEntry _parse(final JsonParser jsonParser) {
        JsonConversationEntry jsonConversationEntry = new JsonConversationEntry();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonConversationEntry = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonConversationEntry, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonConversationEntry;
    }
    
    public static void _serialize(final JsonConversationEntry jsonConversationEntry, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("affects_sort", jsonConversationEntry.a);
        JsonConversationEvent$$JsonObjectMapper._serialize(jsonConversationEntry, jsonGenerator, false);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonConversationEntry jsonConversationEntry, final String s, final JsonParser jsonParser) {
        if ("affects_sort".equals(s)) {
            jsonConversationEntry.a = jsonParser.q();
            return;
        }
        JsonConversationEvent$$JsonObjectMapper.parseField(jsonConversationEntry, s, jsonParser);
    }
    
    @Override
    public JsonConversationEntry parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonConversationEntry jsonConversationEntry, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonConversationEntry, jsonGenerator, b);
    }
}
