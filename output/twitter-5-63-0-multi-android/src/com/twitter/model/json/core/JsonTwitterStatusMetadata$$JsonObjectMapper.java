// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.ArrayList;
import com.twitter.model.json.search.JsonDiscoverSummaryContext$$JsonObjectMapper;
import com.twitter.model.json.search.JsonDiscoverStoryMetadata$$JsonObjectMapper;
import com.twitter.model.json.search.JsonSearchSocialProof$$JsonObjectMapper;
import com.twitter.model.json.search.JsonTwitterStatusReason$$JsonObjectMapper;
import com.twitter.model.json.search.JsonHighlightTimeRange$$JsonObjectMapper;
import com.twitter.model.json.search.JsonSearchHighlightContext$$JsonObjectMapper;
import com.twitter.model.json.search.JsonTwitterClusterMetadata$$JsonObjectMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterStatusMetadata$$JsonObjectMapper extends JsonMapper
{
    public static JsonTwitterStatusMetadata _parse(final JsonParser jsonParser) {
        JsonTwitterStatusMetadata jsonTwitterStatusMetadata = new JsonTwitterStatusMetadata();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonTwitterStatusMetadata = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonTwitterStatusMetadata, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonTwitterStatusMetadata;
    }
    
    public static void _serialize(final JsonTwitterStatusMetadata jsonTwitterStatusMetadata, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("auto_expand", jsonTwitterStatusMetadata.c);
        if (jsonTwitterStatusMetadata.k != null) {
            jsonGenerator.a("cluster");
            JsonTwitterClusterMetadata$$JsonObjectMapper._serialize(jsonTwitterStatusMetadata.k, jsonGenerator, true);
        }
        if (jsonTwitterStatusMetadata.g != null) {
            jsonGenerator.a("highlight_context");
            JsonSearchHighlightContext$$JsonObjectMapper._serialize(jsonTwitterStatusMetadata.g, jsonGenerator, true);
        }
        if (jsonTwitterStatusMetadata.j != null) {
            jsonGenerator.a("highlight_time_range");
            JsonHighlightTimeRange$$JsonObjectMapper._serialize(jsonTwitterStatusMetadata.j, jsonGenerator, true);
        }
        jsonGenerator.a("highlight_type", jsonTwitterStatusMetadata.b);
        final JsonEntity[] e = jsonTwitterStatusMetadata.e;
        if (e != null) {
            jsonGenerator.a("hit_highlights");
            jsonGenerator.a();
            for (final JsonEntity jsonEntity : e) {
                if (jsonEntity != null) {
                    JsonEntity$$JsonObjectMapper._serialize(jsonEntity, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        jsonGenerator.a("pinned_to_top", jsonTwitterStatusMetadata.d);
        if (jsonTwitterStatusMetadata.i != null) {
            jsonGenerator.a("reason");
            JsonTwitterStatusReason$$JsonObjectMapper._serialize(jsonTwitterStatusMetadata.i, jsonGenerator, true);
        }
        jsonGenerator.a("result_type", jsonTwitterStatusMetadata.a);
        if (jsonTwitterStatusMetadata.f != null) {
            jsonGenerator.a("social_context");
            JsonSearchSocialProof$$JsonObjectMapper._serialize(jsonTwitterStatusMetadata.f, jsonGenerator, true);
        }
        if (jsonTwitterStatusMetadata.l != null) {
            jsonGenerator.a("story");
            JsonDiscoverStoryMetadata$$JsonObjectMapper._serialize(jsonTwitterStatusMetadata.l, jsonGenerator, true);
        }
        if (jsonTwitterStatusMetadata.h != null) {
            jsonGenerator.a("summary_context");
            JsonDiscoverSummaryContext$$JsonObjectMapper._serialize(jsonTwitterStatusMetadata.h, jsonGenerator, true);
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonTwitterStatusMetadata jsonTwitterStatusMetadata, final String s, final JsonParser jsonParser) {
        if ("auto_expand".equals(s)) {
            jsonTwitterStatusMetadata.c = jsonParser.q();
        }
        else {
            if ("cluster".equals(s)) {
                jsonTwitterStatusMetadata.k = JsonTwitterClusterMetadata$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("highlight_context".equals(s)) {
                jsonTwitterStatusMetadata.g = JsonSearchHighlightContext$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("highlight_time_range".equals(s)) {
                jsonTwitterStatusMetadata.j = JsonHighlightTimeRange$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("highlight_type".equals(s)) {
                jsonTwitterStatusMetadata.b = jsonParser.a((String)null);
                return;
            }
            if ("hit_highlights".equals(s)) {
                if (jsonParser.d() == JsonToken.d) {
                    final ArrayList<JsonEntity> list = new ArrayList<JsonEntity>();
                    while (jsonParser.a() != JsonToken.e) {
                        final JsonEntity parse = JsonEntity$$JsonObjectMapper._parse(jsonParser);
                        if (parse != null) {
                            list.add(parse);
                        }
                    }
                    jsonTwitterStatusMetadata.e = list.toArray(new JsonEntity[list.size()]);
                    return;
                }
                jsonTwitterStatusMetadata.e = null;
            }
            else {
                if ("pinned_to_top".equals(s)) {
                    jsonTwitterStatusMetadata.d = jsonParser.q();
                    return;
                }
                if ("reason".equals(s)) {
                    jsonTwitterStatusMetadata.i = JsonTwitterStatusReason$$JsonObjectMapper._parse(jsonParser);
                    return;
                }
                if ("result_type".equals(s)) {
                    jsonTwitterStatusMetadata.a = jsonParser.a((String)null);
                    return;
                }
                if ("social_context".equals(s)) {
                    jsonTwitterStatusMetadata.f = JsonSearchSocialProof$$JsonObjectMapper._parse(jsonParser);
                    return;
                }
                if ("story".equals(s)) {
                    jsonTwitterStatusMetadata.l = JsonDiscoverStoryMetadata$$JsonObjectMapper._parse(jsonParser);
                    return;
                }
                if ("summary_context".equals(s)) {
                    jsonTwitterStatusMetadata.h = JsonDiscoverSummaryContext$$JsonObjectMapper._parse(jsonParser);
                }
            }
        }
    }
    
    @Override
    public JsonTwitterStatusMetadata parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonTwitterStatusMetadata jsonTwitterStatusMetadata, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonTwitterStatusMetadata, jsonGenerator, b);
    }
}
