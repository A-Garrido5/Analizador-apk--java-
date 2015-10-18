// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSuggestsInfos$$JsonObjectMapper extends JsonMapper
{
    public static JsonSuggestsInfos _parse(final JsonParser jsonParser) {
        JsonSuggestsInfos jsonSuggestsInfos = new JsonSuggestsInfos();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonSuggestsInfos = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonSuggestsInfos, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonSuggestsInfos;
    }
    
    public static void _serialize(final JsonSuggestsInfos jsonSuggestsInfos, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonSuggestsInfos.a != null) {
            jsonGenerator.a("module");
            JsonSuggestsInfo$$JsonObjectMapper._serialize(jsonSuggestsInfos.a, jsonGenerator, true);
        }
        final Map b2 = jsonSuggestsInfos.b;
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
                    JsonSuggestsInfo$$JsonObjectMapper._serialize((JsonSuggestsInfo)entry.getValue(), jsonGenerator, true);
                }
            }
            jsonGenerator.d();
        }
        final Map c = jsonSuggestsInfos.c;
        if (c != null) {
            jsonGenerator.a("users");
            jsonGenerator.c();
            for (final Map.Entry<String, V> entry2 : c.entrySet()) {
                jsonGenerator.a(entry2.getKey().toString());
                if (entry2.getValue() == null) {
                    jsonGenerator.e();
                }
                else {
                    if (entry2.getValue() == null) {
                        continue;
                    }
                    JsonSuggestsInfo$$JsonObjectMapper._serialize((JsonSuggestsInfo)entry2.getValue(), jsonGenerator, true);
                }
            }
            jsonGenerator.d();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonSuggestsInfos jsonSuggestsInfos, final String s, final JsonParser jsonParser) {
        if ("module".equals(s)) {
            jsonSuggestsInfos.a = JsonSuggestsInfo$$JsonObjectMapper._parse(jsonParser);
        }
        else if ("tweets".equals(s)) {
            if (jsonParser.d() == JsonToken.b) {
                final HashMap<String, JsonSuggestsInfo> b = new HashMap<String, JsonSuggestsInfo>();
                while (jsonParser.a() != JsonToken.c) {
                    final String g = jsonParser.g();
                    jsonParser.a();
                    if (jsonParser.d() == JsonToken.m) {
                        b.put(g, null);
                    }
                    else {
                        b.put(g, JsonSuggestsInfo$$JsonObjectMapper._parse(jsonParser));
                    }
                }
                jsonSuggestsInfos.b = b;
                return;
            }
            jsonSuggestsInfos.b = null;
        }
        else if ("users".equals(s)) {
            if (jsonParser.d() == JsonToken.b) {
                final HashMap<String, JsonSuggestsInfo> c = new HashMap<String, JsonSuggestsInfo>();
                while (jsonParser.a() != JsonToken.c) {
                    final String g2 = jsonParser.g();
                    jsonParser.a();
                    if (jsonParser.d() == JsonToken.m) {
                        c.put(g2, null);
                    }
                    else {
                        c.put(g2, JsonSuggestsInfo$$JsonObjectMapper._parse(jsonParser));
                    }
                }
                jsonSuggestsInfos.c = c;
                return;
            }
            jsonSuggestsInfos.c = null;
        }
    }
    
    @Override
    public JsonSuggestsInfos parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonSuggestsInfos jsonSuggestsInfos, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonSuggestsInfos, jsonGenerator, b);
    }
}
