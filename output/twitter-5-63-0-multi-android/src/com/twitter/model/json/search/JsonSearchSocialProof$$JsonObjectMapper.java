// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSearchSocialProof$$JsonObjectMapper extends JsonMapper
{
    public static JsonSearchSocialProof _parse(final JsonParser jsonParser) {
        JsonSearchSocialProof jsonSearchSocialProof = new JsonSearchSocialProof();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonSearchSocialProof = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonSearchSocialProof, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonSearchSocialProof;
    }
    
    public static void _serialize(final JsonSearchSocialProof jsonSearchSocialProof, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("followed_by", jsonSearchSocialProof.c);
        jsonGenerator.a("following", jsonSearchSocialProof.b);
        final Map a = jsonSearchSocialProof.a;
        if (a != null) {
            jsonGenerator.a("related_users");
            jsonGenerator.c();
            for (final Map.Entry<String, V> entry : a.entrySet()) {
                jsonGenerator.a(entry.getKey().toString());
                if (entry.getValue() == null) {
                    jsonGenerator.e();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonSearchSocialProof$Users$$JsonObjectMapper._serialize((JsonSearchSocialProof$Users)entry.getValue(), jsonGenerator, true);
                }
            }
            jsonGenerator.d();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonSearchSocialProof jsonSearchSocialProof, final String s, final JsonParser jsonParser) {
        if ("followed_by".equals(s)) {
            jsonSearchSocialProof.c = jsonParser.q();
        }
        else {
            if ("following".equals(s)) {
                jsonSearchSocialProof.b = jsonParser.q();
                return;
            }
            if ("related_users".equals(s)) {
                if (jsonParser.d() == JsonToken.b) {
                    final HashMap<String, JsonSearchSocialProof$Users> a = new HashMap<String, JsonSearchSocialProof$Users>();
                    while (jsonParser.a() != JsonToken.c) {
                        final String g = jsonParser.g();
                        jsonParser.a();
                        if (jsonParser.d() == JsonToken.m) {
                            a.put(g, null);
                        }
                        else {
                            a.put(g, JsonSearchSocialProof$Users$$JsonObjectMapper._parse(jsonParser));
                        }
                    }
                    jsonSearchSocialProof.a = a;
                    return;
                }
                jsonSearchSocialProof.a = null;
            }
        }
    }
    
    @Override
    public JsonSearchSocialProof parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonSearchSocialProof jsonSearchSocialProof, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonSearchSocialProof, jsonGenerator, b);
    }
}
