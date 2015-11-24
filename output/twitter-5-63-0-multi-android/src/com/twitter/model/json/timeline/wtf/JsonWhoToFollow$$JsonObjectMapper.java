// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline.wtf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import com.twitter.model.json.timeline.JsonSuggestsInfos$$JsonObjectMapper;
import java.util.Map;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonWhoToFollow$$JsonObjectMapper extends JsonMapper
{
    public static JsonWhoToFollow _parse(final JsonParser jsonParser) {
        JsonWhoToFollow jsonWhoToFollow = new JsonWhoToFollow();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonWhoToFollow = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonWhoToFollow, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonWhoToFollow;
    }
    
    public static void _serialize(final JsonWhoToFollow jsonWhoToFollow, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("wtf_type", jsonWhoToFollow.c);
        final Map d = jsonWhoToFollow.d;
        if (d != null) {
            jsonGenerator.a("social_proof");
            jsonGenerator.c();
            for (final Map.Entry<String, V> entry : d.entrySet()) {
                jsonGenerator.a(entry.getKey().toString());
                if (entry.getValue() == null) {
                    jsonGenerator.e();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonSocialProof$$JsonObjectMapper._serialize(entry.getValue(), jsonGenerator, true);
                }
            }
            jsonGenerator.d();
        }
        if (jsonWhoToFollow.e != null) {
            jsonGenerator.a("strings");
            JsonStrings$$JsonObjectMapper._serialize(jsonWhoToFollow.e, jsonGenerator, true);
        }
        if (jsonWhoToFollow.f != null) {
            jsonGenerator.a("suggests_info");
            JsonSuggestsInfos$$JsonObjectMapper._serialize(jsonWhoToFollow.f, jsonGenerator, true);
        }
        final Map b2 = jsonWhoToFollow.b;
        if (b2 != null) {
            jsonGenerator.a("tweets");
            jsonGenerator.c();
            for (final Map.Entry<String, V> entry2 : b2.entrySet()) {
                jsonGenerator.a(entry2.getKey().toString());
                if (entry2.getValue() == null) {
                    jsonGenerator.e();
                }
                else {
                    jsonGenerator.b((String)entry2.getValue());
                }
            }
            jsonGenerator.d();
        }
        final String[] a = jsonWhoToFollow.a;
        if (a != null) {
            jsonGenerator.a("users");
            jsonGenerator.a();
            for (int length = a.length, i = 0; i < length; ++i) {
                jsonGenerator.b(a[i]);
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonWhoToFollow jsonWhoToFollow, final String s, final JsonParser jsonParser) {
        if ("wtf_type".equals(s)) {
            jsonWhoToFollow.c = jsonParser.a((String)null);
        }
        else if ("social_proof".equals(s)) {
            if (jsonParser.d() == JsonToken.b) {
                final HashMap<String, JsonSocialProof> d = new HashMap<String, JsonSocialProof>();
                while (jsonParser.a() != JsonToken.c) {
                    final String g = jsonParser.g();
                    jsonParser.a();
                    if (jsonParser.d() == JsonToken.m) {
                        d.put(g, null);
                    }
                    else {
                        d.put(g, JsonSocialProof$$JsonObjectMapper._parse(jsonParser));
                    }
                }
                jsonWhoToFollow.d = d;
                return;
            }
            jsonWhoToFollow.d = null;
        }
        else {
            if ("strings".equals(s)) {
                jsonWhoToFollow.e = JsonStrings$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("suggests_info".equals(s)) {
                jsonWhoToFollow.f = JsonSuggestsInfos$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("tweets".equals(s)) {
                if (jsonParser.d() == JsonToken.b) {
                    final HashMap<String, String> b = new HashMap<String, String>();
                    while (jsonParser.a() != JsonToken.c) {
                        final String g2 = jsonParser.g();
                        jsonParser.a();
                        if (jsonParser.d() == JsonToken.m) {
                            b.put(g2, null);
                        }
                        else {
                            b.put(g2, jsonParser.a((String)null));
                        }
                    }
                    jsonWhoToFollow.b = b;
                    return;
                }
                jsonWhoToFollow.b = null;
            }
            else if ("users".equals(s)) {
                if (jsonParser.d() == JsonToken.d) {
                    final ArrayList<String> list = new ArrayList<String>();
                    while (jsonParser.a() != JsonToken.e) {
                        final String a = jsonParser.a((String)null);
                        if (a != null) {
                            list.add(a);
                        }
                    }
                    jsonWhoToFollow.a = list.toArray(new String[list.size()]);
                    return;
                }
                jsonWhoToFollow.a = null;
            }
        }
    }
    
    @Override
    public JsonWhoToFollow parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonWhoToFollow jsonWhoToFollow, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonWhoToFollow, jsonGenerator, b);
    }
}
