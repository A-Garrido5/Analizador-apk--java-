// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.twitter.model.json.core.JsonMediaSize$$JsonObjectMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMomentMedia$$JsonObjectMapper extends JsonMapper
{
    public static JsonMomentMedia _parse(final JsonParser jsonParser) {
        JsonMomentMedia jsonMomentMedia = new JsonMomentMedia();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMomentMedia = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMomentMedia, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMomentMedia;
    }
    
    public static void _serialize(final JsonMomentMedia jsonMomentMedia, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("media_id", jsonMomentMedia.a);
        if (jsonMomentMedia.b != null) {
            jsonGenerator.a("size");
            JsonMediaSize$$JsonObjectMapper._serialize(jsonMomentMedia.b, jsonGenerator, true);
        }
        jsonGenerator.a("url", jsonMomentMedia.c);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMomentMedia jsonMomentMedia, final String s, final JsonParser jsonParser) {
        if ("media_id".equals(s)) {
            jsonMomentMedia.a = jsonParser.o();
        }
        else {
            if ("size".equals(s)) {
                jsonMomentMedia.b = JsonMediaSize$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("url".equals(s)) {
                jsonMomentMedia.c = jsonParser.a((String)null);
            }
        }
    }
    
    @Override
    public JsonMomentMedia parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMomentMedia jsonMomentMedia, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMomentMedia, jsonGenerator, b);
    }
}
