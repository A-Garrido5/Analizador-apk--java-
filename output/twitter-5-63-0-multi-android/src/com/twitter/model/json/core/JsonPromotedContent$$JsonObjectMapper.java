// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPromotedContent$$JsonObjectMapper extends JsonMapper
{
    public static JsonPromotedContent _parse(final JsonParser jsonParser) {
        JsonPromotedContent jsonPromotedContent = new JsonPromotedContent();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonPromotedContent = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonPromotedContent, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonPromotedContent;
    }
    
    public static void _serialize(final JsonPromotedContent jsonPromotedContent, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonPromotedContent.f != null) {
            jsonGenerator.a("advertiser");
            JsonPromotedContent$PromotedContentAdvertiser$$JsonObjectMapper._serialize(jsonPromotedContent.f, jsonGenerator, true);
        }
        jsonGenerator.a("advertiser_name", jsonPromotedContent.c);
        jsonGenerator.a("disclosure_type", jsonPromotedContent.b);
        final Map e = jsonPromotedContent.e;
        if (e != null) {
            jsonGenerator.a("experiment_values");
            jsonGenerator.c();
            for (final Map.Entry<String, V> entry : e.entrySet()) {
                jsonGenerator.a(entry.getKey().toString());
                if (entry.getValue() == null) {
                    jsonGenerator.e();
                }
                else {
                    jsonGenerator.b((String)entry.getValue());
                }
            }
            jsonGenerator.d();
        }
        jsonGenerator.a("impression_id", jsonPromotedContent.a);
        if (jsonPromotedContent.g != null) {
            jsonGenerator.a("promoted_trend");
            JsonPromotedContent$PromotedContentTrend$$JsonObjectMapper._serialize(jsonPromotedContent.g, jsonGenerator, true);
        }
        jsonGenerator.a("promoted_trend_id", jsonPromotedContent.d);
        final JsonUserName[] h = jsonPromotedContent.h;
        if (h != null) {
            jsonGenerator.a("social_context");
            jsonGenerator.a();
            for (final JsonUserName jsonUserName : h) {
                if (jsonUserName != null) {
                    JsonUserName$$JsonObjectMapper._serialize(jsonUserName, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonPromotedContent jsonPromotedContent, final String s, final JsonParser jsonParser) {
        if ("advertiser".equals(s)) {
            jsonPromotedContent.f = JsonPromotedContent$PromotedContentAdvertiser$$JsonObjectMapper._parse(jsonParser);
        }
        else {
            if ("advertiser_name".equals(s)) {
                jsonPromotedContent.c = jsonParser.a((String)null);
                return;
            }
            if ("disclosure_type".equals(s)) {
                jsonPromotedContent.b = jsonParser.a((String)null);
                return;
            }
            if ("experiment_values".equals(s)) {
                if (jsonParser.d() == JsonToken.b) {
                    final HashMap<String, String> e = new HashMap<String, String>();
                    while (jsonParser.a() != JsonToken.c) {
                        final String g = jsonParser.g();
                        jsonParser.a();
                        if (jsonParser.d() == JsonToken.m) {
                            e.put(g, null);
                        }
                        else {
                            e.put(g, jsonParser.a((String)null));
                        }
                    }
                    jsonPromotedContent.e = e;
                    return;
                }
                jsonPromotedContent.e = null;
            }
            else {
                if ("impression_id".equals(s)) {
                    jsonPromotedContent.a = jsonParser.a((String)null);
                    return;
                }
                if ("promoted_trend".equals(s)) {
                    jsonPromotedContent.g = JsonPromotedContent$PromotedContentTrend$$JsonObjectMapper._parse(jsonParser);
                    return;
                }
                if ("promoted_trend_id".equals(s)) {
                    jsonPromotedContent.d = jsonParser.o();
                    return;
                }
                if ("social_context".equals(s)) {
                    if (jsonParser.d() == JsonToken.d) {
                        final ArrayList<JsonUserName> list = new ArrayList<JsonUserName>();
                        while (jsonParser.a() != JsonToken.e) {
                            final JsonUserName parse = JsonUserName$$JsonObjectMapper._parse(jsonParser);
                            if (parse != null) {
                                list.add(parse);
                            }
                        }
                        jsonPromotedContent.h = list.toArray(new JsonUserName[list.size()]);
                        return;
                    }
                    jsonPromotedContent.h = null;
                }
            }
        }
    }
    
    @Override
    public JsonPromotedContent parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonPromotedContent jsonPromotedContent, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonPromotedContent, jsonGenerator, b);
    }
}
