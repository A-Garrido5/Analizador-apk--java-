// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.library.api.br;
import java.util.Map;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMomentModule$$JsonObjectMapper extends JsonMapper
{
    public static JsonMomentModule _parse(final JsonParser jsonParser) {
        JsonMomentModule jsonMomentModule = new JsonMomentModule();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMomentModule = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMomentModule, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMomentModule;
    }
    
    public static void _serialize(final JsonMomentModule jsonMomentModule, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonMomentModule.e != null) {
            jsonGenerator.a("cover_format");
            JsonMomentPage$$JsonObjectMapper._serialize(jsonMomentModule.e, jsonGenerator, true);
        }
        if (jsonMomentModule.f != null) {
            jsonGenerator.a("large_format");
            JsonMomentPage$$JsonObjectMapper._serialize(jsonMomentModule.f, jsonGenerator, true);
        }
        if (jsonMomentModule.a != null) {
            jsonGenerator.a("moment");
            JsonMoment$$JsonObjectMapper._serialize(jsonMomentModule.a, jsonGenerator, true);
        }
        final List c = jsonMomentModule.c;
        if (c != null) {
            jsonGenerator.a("pages");
            jsonGenerator.a();
            for (final JsonMomentPage jsonMomentPage : c) {
                if (jsonMomentPage != null) {
                    JsonMomentPage$$JsonObjectMapper._serialize(jsonMomentPage, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        if (jsonMomentModule.g != null) {
            jsonGenerator.a("thumbnail_format");
            JsonMomentPage$$JsonObjectMapper._serialize(jsonMomentModule.g, jsonGenerator, true);
        }
        jsonGenerator.a("total_pages", jsonMomentModule.d);
        final Map b2 = jsonMomentModule.b;
        if (b2 != null) {
            jsonGenerator.a("tweets");
            jsonGenerator.c();
            for (final Map.Entry<String, V> entry : b2.entrySet()) {
                jsonGenerator.a(entry.getKey().toString());
                if (entry.getValue() == null) {
                    jsonGenerator.e();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor(br.class).serialize(entry.getValue(), "lslocaltweetsElement", false, jsonGenerator);
                }
            }
            jsonGenerator.d();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMomentModule jsonMomentModule, final String s, final JsonParser jsonParser) {
        if ("cover_format".equals(s)) {
            jsonMomentModule.e = JsonMomentPage$$JsonObjectMapper._parse(jsonParser);
        }
        else {
            if ("large_format".equals(s)) {
                jsonMomentModule.f = JsonMomentPage$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("moment".equals(s)) {
                jsonMomentModule.a = JsonMoment$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("pages".equals(s)) {
                if (jsonParser.d() == JsonToken.d) {
                    final ArrayList<JsonMomentPage> c = new ArrayList<JsonMomentPage>();
                    while (jsonParser.a() != JsonToken.e) {
                        final JsonMomentPage parse = JsonMomentPage$$JsonObjectMapper._parse(jsonParser);
                        if (parse != null) {
                            c.add(parse);
                        }
                    }
                    jsonMomentModule.c = c;
                    return;
                }
                jsonMomentModule.c = null;
            }
            else {
                if ("thumbnail_format".equals(s)) {
                    jsonMomentModule.g = JsonMomentPage$$JsonObjectMapper._parse(jsonParser);
                    return;
                }
                if ("total_pages".equals(s)) {
                    jsonMomentModule.d = jsonParser.n();
                    return;
                }
                if ("tweets".equals(s)) {
                    if (jsonParser.d() == JsonToken.b) {
                        final HashMap<String, Object> b = new HashMap<String, Object>();
                        while (jsonParser.a() != JsonToken.c) {
                            final String g = jsonParser.g();
                            jsonParser.a();
                            if (jsonParser.d() == JsonToken.m) {
                                b.put(g, null);
                            }
                            else {
                                b.put(g, LoganSquare.typeConverterFor(br.class).parse(jsonParser));
                            }
                        }
                        jsonMomentModule.b = b;
                        return;
                    }
                    jsonMomentModule.b = null;
                }
            }
        }
    }
    
    @Override
    public JsonMomentModule parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMomentModule jsonMomentModule, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMomentModule, jsonGenerator, b);
    }
}
