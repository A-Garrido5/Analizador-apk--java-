// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.twitter.model.json.core.b;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.model.json.core.c;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSearchHighlightContext$$JsonObjectMapper extends JsonMapper
{
    protected static final c JSON_SOCIAL_PROOF_TYPE_CONVERTER;
    
    static {
        JSON_SOCIAL_PROOF_TYPE_CONVERTER = new c();
    }
    
    public static JsonSearchHighlightContext _parse(final JsonParser jsonParser) {
        JsonSearchHighlightContext jsonSearchHighlightContext = new JsonSearchHighlightContext();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonSearchHighlightContext = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonSearchHighlightContext, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonSearchHighlightContext;
    }
    
    public static void _serialize(final JsonSearchHighlightContext jsonSearchHighlightContext, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        final String[] b2 = jsonSearchHighlightContext.b;
        if (b2 != null) {
            jsonGenerator.a("matched_trends");
            jsonGenerator.a();
            for (int length = b2.length, i = 0; i < length; ++i) {
                jsonGenerator.b(b2[i]);
            }
            jsonGenerator.b();
        }
        if (jsonSearchHighlightContext.a != null) {
            JsonSearchHighlightContext$$JsonObjectMapper.JSON_SOCIAL_PROOF_TYPE_CONVERTER.serialize(jsonSearchHighlightContext.a, "type", true, jsonGenerator);
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonSearchHighlightContext jsonSearchHighlightContext, final String s, final JsonParser jsonParser) {
        if ("matched_trends".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonSearchHighlightContext.b = null;
                return;
            }
            final ArrayList<String> list = new ArrayList<String>();
            while (jsonParser.a() != JsonToken.e) {
                final String a = jsonParser.a((String)null);
                if (a != null) {
                    list.add(a);
                }
            }
            jsonSearchHighlightContext.b = list.toArray(new String[list.size()]);
        }
        else if ("type".equals(s)) {
            jsonSearchHighlightContext.a = (b)JsonSearchHighlightContext$$JsonObjectMapper.JSON_SOCIAL_PROOF_TYPE_CONVERTER.parse(jsonParser);
        }
    }
    
    @Override
    public JsonSearchHighlightContext parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonSearchHighlightContext jsonSearchHighlightContext, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonSearchHighlightContext, jsonGenerator, b);
    }
}
