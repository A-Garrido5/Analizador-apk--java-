// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.twitter.library.api.moments.MomentPageType;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMomentPage$$JsonObjectMapper extends JsonMapper
{
    protected static final b JSON_MOMENT_PAGE_TYPE_CONVERTER;
    
    static {
        JSON_MOMENT_PAGE_TYPE_CONVERTER = new b();
    }
    
    public static JsonMomentPage _parse(final JsonParser jsonParser) {
        JsonMomentPage jsonMomentPage = new JsonMomentPage();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMomentPage = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMomentPage, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMomentPage;
    }
    
    public static void _serialize(final JsonMomentPage jsonMomentPage, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonMomentPage.b != null) {
            jsonGenerator.a("media");
            JsonMomentMedia$$JsonObjectMapper._serialize(jsonMomentPage.b, jsonGenerator, true);
        }
        if (jsonMomentPage.c != null) {
            jsonGenerator.a("render");
            JsonRenderData$$JsonObjectMapper._serialize(jsonMomentPage.c, jsonGenerator, true);
        }
        jsonGenerator.a("tweet_id", jsonMomentPage.a);
        if (jsonMomentPage.d != null) {
            JsonMomentPage$$JsonObjectMapper.JSON_MOMENT_PAGE_TYPE_CONVERTER.serialize(jsonMomentPage.d, "type", true, jsonGenerator);
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMomentPage jsonMomentPage, final String s, final JsonParser jsonParser) {
        if ("media".equals(s)) {
            jsonMomentPage.b = JsonMomentMedia$$JsonObjectMapper._parse(jsonParser);
        }
        else {
            if ("render".equals(s)) {
                jsonMomentPage.c = JsonRenderData$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("tweet_id".equals(s)) {
                jsonMomentPage.a = jsonParser.o();
                return;
            }
            if ("type".equals(s)) {
                jsonMomentPage.d = (MomentPageType)JsonMomentPage$$JsonObjectMapper.JSON_MOMENT_PAGE_TYPE_CONVERTER.parse(jsonParser);
            }
        }
    }
    
    @Override
    public JsonMomentPage parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMomentPage jsonMomentPage, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMomentPage, jsonGenerator, b);
    }
}
