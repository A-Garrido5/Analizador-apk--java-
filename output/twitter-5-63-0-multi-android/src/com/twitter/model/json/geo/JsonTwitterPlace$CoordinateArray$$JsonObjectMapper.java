// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.geo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterPlace$CoordinateArray$$JsonObjectMapper extends JsonMapper
{
    public static JsonTwitterPlace$CoordinateArray _parse(final JsonParser jsonParser) {
        JsonTwitterPlace$CoordinateArray jsonTwitterPlace$CoordinateArray = new JsonTwitterPlace$CoordinateArray();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonTwitterPlace$CoordinateArray = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonTwitterPlace$CoordinateArray, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonTwitterPlace$CoordinateArray;
    }
    
    public static void _serialize(final JsonTwitterPlace$CoordinateArray jsonTwitterPlace$CoordinateArray, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        final List a = jsonTwitterPlace$CoordinateArray.a;
        if (a != null) {
            jsonGenerator.a("coordinates");
            jsonGenerator.a();
            for (final List<List> list : a) {
                if (list != null) {
                    jsonGenerator.a();
                    for (final List<Double> list2 : list) {
                        if (list2 != null) {
                            jsonGenerator.a();
                            final Iterator<Double> iterator3 = list2.iterator();
                            while (iterator3.hasNext()) {
                                jsonGenerator.a(iterator3.next());
                            }
                            jsonGenerator.b();
                        }
                    }
                    jsonGenerator.b();
                }
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonTwitterPlace$CoordinateArray jsonTwitterPlace$CoordinateArray, final String s, final JsonParser jsonParser) {
        if ("coordinates".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonTwitterPlace$CoordinateArray.a = null;
                return;
            }
            final ArrayList<ArrayList<ArrayList>> a = new ArrayList<ArrayList<ArrayList>>();
            while (jsonParser.a() != JsonToken.e) {
                ArrayList<ArrayList> list;
                if (jsonParser.d() == JsonToken.d) {
                    list = new ArrayList<ArrayList>();
                    while (jsonParser.a() != JsonToken.e) {
                        ArrayList<Double> list2;
                        if (jsonParser.d() == JsonToken.d) {
                            list2 = new ArrayList<Double>();
                            while (jsonParser.a() != JsonToken.e) {
                                Double value;
                                if (jsonParser.d() == JsonToken.m) {
                                    value = null;
                                }
                                else {
                                    value = jsonParser.p();
                                }
                                if (value != null) {
                                    list2.add(value);
                                }
                            }
                        }
                        else {
                            list2 = null;
                        }
                        if (list2 != null) {
                            list.add(list2);
                        }
                    }
                }
                else {
                    list = null;
                }
                if (list != null) {
                    a.add(list);
                }
            }
            jsonTwitterPlace$CoordinateArray.a = a;
        }
    }
    
    @Override
    public JsonTwitterPlace$CoordinateArray parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonTwitterPlace$CoordinateArray jsonTwitterPlace$CoordinateArray, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonTwitterPlace$CoordinateArray, jsonGenerator, b);
    }
}
