// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.dms;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUpdateConversationNameEntry$$JsonObjectMapper extends JsonMapper
{
    public static JsonUpdateConversationNameEntry _parse(final JsonParser jsonParser) {
        JsonUpdateConversationNameEntry jsonUpdateConversationNameEntry = new JsonUpdateConversationNameEntry();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonUpdateConversationNameEntry = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonUpdateConversationNameEntry, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonUpdateConversationNameEntry;
    }
    
    public static void _serialize(final JsonUpdateConversationNameEntry jsonUpdateConversationNameEntry, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("by_user_id", jsonUpdateConversationNameEntry.h);
        jsonGenerator.a("conversation_name", jsonUpdateConversationNameEntry.g);
        JsonConversationEntry$$JsonObjectMapper._serialize(jsonUpdateConversationNameEntry, jsonGenerator, false);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonUpdateConversationNameEntry jsonUpdateConversationNameEntry, final String s, final JsonParser jsonParser) {
        if ("by_user_id".equals(s)) {
            jsonUpdateConversationNameEntry.h = jsonParser.o();
            return;
        }
        if ("conversation_name".equals(s)) {
            jsonUpdateConversationNameEntry.g = jsonParser.a((String)null);
            return;
        }
        JsonConversationEntry$$JsonObjectMapper.parseField(jsonUpdateConversationNameEntry, s, jsonParser);
    }
    
    @Override
    public JsonUpdateConversationNameEntry parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonUpdateConversationNameEntry jsonUpdateConversationNameEntry, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonUpdateConversationNameEntry, jsonGenerator, b);
    }
}
