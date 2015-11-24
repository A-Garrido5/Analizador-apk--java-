// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGuideResponse$$JsonObjectMapper extends JsonMapper
{
    public static JsonGuideResponse _parse(final JsonParser jsonParser) {
        JsonGuideResponse jsonGuideResponse = new JsonGuideResponse();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonGuideResponse = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonGuideResponse, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonGuideResponse;
    }
    
    public static void _serialize(final JsonGuideResponse jsonGuideResponse, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        final List a = jsonGuideResponse.a;
        if (a != null) {
            jsonGenerator.a("modules");
            jsonGenerator.a();
            for (final JsonGuideSection jsonGuideSection : a) {
                if (jsonGuideSection != null) {
                    JsonGuideSection$$JsonObjectMapper._serialize(jsonGuideSection, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonGuideResponse jsonGuideResponse, final String s, final JsonParser jsonParser) {
        if ("modules".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonGuideResponse.a = null;
                return;
            }
            final ArrayList<JsonGuideSection> a = new ArrayList<JsonGuideSection>();
            while (jsonParser.a() != JsonToken.e) {
                final JsonGuideSection parse = JsonGuideSection$$JsonObjectMapper._parse(jsonParser);
                if (parse != null) {
                    a.add(parse);
                }
            }
            jsonGuideResponse.a = a;
        }
    }
    
    @Override
    public JsonGuideResponse parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonGuideResponse jsonGuideResponse, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonGuideResponse, jsonGenerator, b);
    }
}
