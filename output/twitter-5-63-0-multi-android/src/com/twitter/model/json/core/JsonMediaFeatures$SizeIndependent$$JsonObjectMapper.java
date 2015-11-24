// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaFeatures$SizeIndependent$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaFeatures$SizeIndependent _parse(final JsonParser jsonParser) {
        JsonMediaFeatures$SizeIndependent jsonMediaFeatures$SizeIndependent = new JsonMediaFeatures$SizeIndependent();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaFeatures$SizeIndependent = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaFeatures$SizeIndependent, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaFeatures$SizeIndependent;
    }
    
    public static void _serialize(final JsonMediaFeatures$SizeIndependent jsonMediaFeatures$SizeIndependent, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        final JsonMediaFeatures$SizeIndependent$Tag[] a = jsonMediaFeatures$SizeIndependent.a;
        if (a != null) {
            jsonGenerator.a("tags");
            jsonGenerator.a();
            for (final JsonMediaFeatures$SizeIndependent$Tag jsonMediaFeatures$SizeIndependent$Tag : a) {
                if (jsonMediaFeatures$SizeIndependent$Tag != null) {
                    JsonMediaFeatures$SizeIndependent$Tag$$JsonObjectMapper._serialize(jsonMediaFeatures$SizeIndependent$Tag, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaFeatures$SizeIndependent jsonMediaFeatures$SizeIndependent, final String s, final JsonParser jsonParser) {
        if ("tags".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonMediaFeatures$SizeIndependent.a = null;
                return;
            }
            final ArrayList<JsonMediaFeatures$SizeIndependent$Tag> list = new ArrayList<JsonMediaFeatures$SizeIndependent$Tag>();
            while (jsonParser.a() != JsonToken.e) {
                final JsonMediaFeatures$SizeIndependent$Tag parse = JsonMediaFeatures$SizeIndependent$Tag$$JsonObjectMapper._parse(jsonParser);
                if (parse != null) {
                    list.add(parse);
                }
            }
            jsonMediaFeatures$SizeIndependent.a = list.toArray(new JsonMediaFeatures$SizeIndependent$Tag[list.size()]);
        }
    }
    
    @Override
    public JsonMediaFeatures$SizeIndependent parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaFeatures$SizeIndependent jsonMediaFeatures$SizeIndependent, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaFeatures$SizeIndependent, jsonGenerator, b);
    }
}
