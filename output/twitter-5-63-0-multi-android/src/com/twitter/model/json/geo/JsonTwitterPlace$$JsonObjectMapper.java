// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.geo;

import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.model.json.core.d;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterPlace$$JsonObjectMapper extends JsonMapper
{
    protected static final d JSON_TWITTER_PLACE_TYPE_CONVERTER;
    
    static {
        JSON_TWITTER_PLACE_TYPE_CONVERTER = new d();
    }
    
    public static JsonTwitterPlace _parse(final JsonParser jsonParser) {
        JsonTwitterPlace jsonTwitterPlace = new JsonTwitterPlace();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonTwitterPlace = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonTwitterPlace, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonTwitterPlace;
    }
    
    public static void _serialize(final JsonTwitterPlace jsonTwitterPlace, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        final Map k = jsonTwitterPlace.k;
        if (k != null) {
            jsonGenerator.a("attributes");
            jsonGenerator.c();
            for (final Map.Entry<String, V> entry : k.entrySet()) {
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
        if (jsonTwitterPlace.j != null) {
            jsonGenerator.a("bounding_box");
            JsonTwitterPlace$CoordinateArray$$JsonObjectMapper._serialize(jsonTwitterPlace.j, jsonGenerator, true);
        }
        final double[] i = jsonTwitterPlace.i;
        if (i != null) {
            jsonGenerator.a("centroid");
            jsonGenerator.a();
            for (int length = i.length, j = 0; j < length; ++j) {
                jsonGenerator.a(i[j]);
            }
            jsonGenerator.b();
        }
        final JsonTwitterPlace[] g = jsonTwitterPlace.g;
        if (g != null) {
            jsonGenerator.a("contained_within");
            jsonGenerator.a();
            for (final JsonTwitterPlace jsonTwitterPlace2 : g) {
                if (jsonTwitterPlace2 != null) {
                    _serialize(jsonTwitterPlace2, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        jsonGenerator.a("country", jsonTwitterPlace.e);
        jsonGenerator.a("country_code", jsonTwitterPlace.f);
        jsonGenerator.a("full_name", jsonTwitterPlace.a);
        jsonGenerator.a("id", jsonTwitterPlace.d);
        jsonGenerator.a("name", jsonTwitterPlace.b);
        if (jsonTwitterPlace.c != null) {
            JsonTwitterPlace$$JsonObjectMapper.JSON_TWITTER_PLACE_TYPE_CONVERTER.serialize(jsonTwitterPlace.c, "place_type", true, jsonGenerator);
        }
        final String[] h = jsonTwitterPlace.h;
        if (h != null) {
            jsonGenerator.a("polylines");
            jsonGenerator.a();
            for (int length3 = h.length, n = 0; n < length3; ++n) {
                jsonGenerator.b(h[n]);
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonTwitterPlace jsonTwitterPlace, final String s, final JsonParser jsonParser) {
        if ("attributes".equals(s)) {
            if (jsonParser.d() != JsonToken.b) {
                jsonTwitterPlace.k = null;
                return;
            }
            final HashMap<String, String> k = new HashMap<String, String>();
            while (jsonParser.a() != JsonToken.c) {
                final String g = jsonParser.g();
                jsonParser.a();
                if (jsonParser.d() == JsonToken.m) {
                    k.put(g, null);
                }
                else {
                    k.put(g, jsonParser.a((String)null));
                }
            }
            jsonTwitterPlace.k = k;
        }
        else {
            if ("bounding_box".equals(s)) {
                jsonTwitterPlace.j = JsonTwitterPlace$CoordinateArray$$JsonObjectMapper._parse(jsonParser);
                return;
            }
            if ("centroid".equals(s)) {
                if (jsonParser.d() == JsonToken.d) {
                    final ArrayList<Double> list = new ArrayList<Double>();
                    while (jsonParser.a() != JsonToken.e) {
                        list.add(jsonParser.p());
                    }
                    final double[] i = new double[list.size()];
                    final Iterator<Object> iterator = list.iterator();
                    int n = 0;
                    while (iterator.hasNext()) {
                        final double doubleValue = iterator.next();
                        final int n2 = n + 1;
                        i[n] = doubleValue;
                        n = n2;
                    }
                    jsonTwitterPlace.i = i;
                    return;
                }
                jsonTwitterPlace.i = null;
            }
            else if ("contained_within".equals(s)) {
                if (jsonParser.d() == JsonToken.d) {
                    final ArrayList<JsonTwitterPlace> list2 = new ArrayList<JsonTwitterPlace>();
                    while (jsonParser.a() != JsonToken.e) {
                        final JsonTwitterPlace parse = _parse(jsonParser);
                        if (parse != null) {
                            list2.add(parse);
                        }
                    }
                    jsonTwitterPlace.g = list2.toArray(new JsonTwitterPlace[list2.size()]);
                    return;
                }
                jsonTwitterPlace.g = null;
            }
            else {
                if ("country".equals(s)) {
                    jsonTwitterPlace.e = jsonParser.a((String)null);
                    return;
                }
                if ("country_code".equals(s)) {
                    jsonTwitterPlace.f = jsonParser.a((String)null);
                    return;
                }
                if ("full_name".equals(s)) {
                    jsonTwitterPlace.a = jsonParser.a((String)null);
                    return;
                }
                if ("id".equals(s)) {
                    jsonTwitterPlace.d = jsonParser.a((String)null);
                    return;
                }
                if ("name".equals(s)) {
                    jsonTwitterPlace.b = jsonParser.a((String)null);
                    return;
                }
                if ("place_type".equals(s)) {
                    jsonTwitterPlace.c = (TwitterPlace$PlaceType)JsonTwitterPlace$$JsonObjectMapper.JSON_TWITTER_PLACE_TYPE_CONVERTER.parse(jsonParser);
                    return;
                }
                if ("polylines".equals(s)) {
                    if (jsonParser.d() == JsonToken.d) {
                        final ArrayList<String> list3 = new ArrayList<String>();
                        while (jsonParser.a() != JsonToken.e) {
                            final String a = jsonParser.a((String)null);
                            if (a != null) {
                                list3.add(a);
                            }
                        }
                        jsonTwitterPlace.h = list3.toArray(new String[list3.size()]);
                        return;
                    }
                    jsonTwitterPlace.h = null;
                }
            }
        }
    }
    
    @Override
    public JsonTwitterPlace parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonTwitterPlace jsonTwitterPlace, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonTwitterPlace, jsonGenerator, b);
    }
}
