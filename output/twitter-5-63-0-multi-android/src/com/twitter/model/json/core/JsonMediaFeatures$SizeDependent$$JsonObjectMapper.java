// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaFeatures$SizeDependent$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaFeatures$SizeDependent _parse(final JsonParser jsonParser) {
        JsonMediaFeatures$SizeDependent jsonMediaFeatures$SizeDependent = new JsonMediaFeatures$SizeDependent();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaFeatures$SizeDependent = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaFeatures$SizeDependent, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaFeatures$SizeDependent;
    }
    
    public static void _serialize(final JsonMediaFeatures$SizeDependent jsonMediaFeatures$SizeDependent, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        final JsonMediaFeatures$SizeDependent$Face[] a = jsonMediaFeatures$SizeDependent.a;
        if (a != null) {
            jsonGenerator.a("faces");
            jsonGenerator.a();
            for (final JsonMediaFeatures$SizeDependent$Face jsonMediaFeatures$SizeDependent$Face : a) {
                if (jsonMediaFeatures$SizeDependent$Face != null) {
                    JsonMediaFeatures$SizeDependent$Face$$JsonObjectMapper._serialize(jsonMediaFeatures$SizeDependent$Face, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaFeatures$SizeDependent jsonMediaFeatures$SizeDependent, final String s, final JsonParser jsonParser) {
        if ("faces".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonMediaFeatures$SizeDependent.a = null;
                return;
            }
            final ArrayList<JsonMediaFeatures$SizeDependent$Face> list = new ArrayList<JsonMediaFeatures$SizeDependent$Face>();
            while (jsonParser.a() != JsonToken.e) {
                final JsonMediaFeatures$SizeDependent$Face parse = JsonMediaFeatures$SizeDependent$Face$$JsonObjectMapper._parse(jsonParser);
                if (parse != null) {
                    list.add(parse);
                }
            }
            jsonMediaFeatures$SizeDependent.a = list.toArray(new JsonMediaFeatures$SizeDependent$Face[list.size()]);
        }
    }
    
    @Override
    public JsonMediaFeatures$SizeDependent parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaFeatures$SizeDependent jsonMediaFeatures$SizeDependent, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaFeatures$SizeDependent, jsonGenerator, b);
    }
}
