// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.dms;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConversationEvent$$JsonObjectMapper extends JsonMapper
{
    public static JsonConversationEvent _parse(final JsonParser jsonParser) {
        JsonConversationEvent jsonConversationEvent = new JsonConversationEvent();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonConversationEvent = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonConversationEvent, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonConversationEvent;
    }
    
    public static void _serialize(final JsonConversationEvent jsonConversationEvent, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("affects_sort", jsonConversationEvent.f);
        jsonGenerator.a("conversation_id", jsonConversationEvent.c);
        jsonGenerator.a("time", jsonConversationEvent.d);
        jsonGenerator.a("id", jsonConversationEvent.b);
        jsonGenerator.a("sender_id", jsonConversationEvent.e);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonConversationEvent jsonConversationEvent, final String s, final JsonParser jsonParser) {
        if ("affects_sort".equals(s)) {
            jsonConversationEvent.f = jsonParser.q();
        }
        else {
            if ("conversation_id".equals(s)) {
                jsonConversationEvent.c = jsonParser.a((String)null);
                return;
            }
            if ("time".equals(s)) {
                jsonConversationEvent.d = jsonParser.o();
                return;
            }
            if ("id".equals(s)) {
                jsonConversationEvent.b = jsonParser.o();
                return;
            }
            if ("sender_id".equals(s)) {
                jsonConversationEvent.e = jsonParser.o();
            }
        }
    }
    
    @Override
    public JsonConversationEvent parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonConversationEvent jsonConversationEvent, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonConversationEvent, jsonGenerator, b);
    }
}
