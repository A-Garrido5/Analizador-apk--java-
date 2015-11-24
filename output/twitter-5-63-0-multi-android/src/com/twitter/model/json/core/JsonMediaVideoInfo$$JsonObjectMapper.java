// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.Iterator;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaVideoInfo$$JsonObjectMapper extends JsonMapper
{
    public static JsonMediaVideoInfo _parse(final JsonParser jsonParser) {
        JsonMediaVideoInfo jsonMediaVideoInfo = new JsonMediaVideoInfo();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonMediaVideoInfo = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonMediaVideoInfo, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonMediaVideoInfo;
    }
    
    public static void _serialize(final JsonMediaVideoInfo jsonMediaVideoInfo, final JsonGenerator jsonGenerator, final boolean b) {
        int i = 0;
        if (b) {
            jsonGenerator.c();
        }
        final int[] a = jsonMediaVideoInfo.a;
        if (a != null) {
            jsonGenerator.a("aspect_ratio");
            jsonGenerator.a();
            for (int length = a.length, j = 0; j < length; ++j) {
                jsonGenerator.b(a[j]);
            }
            jsonGenerator.b();
        }
        jsonGenerator.a("duration_millis", jsonMediaVideoInfo.b);
        final JsonMediaVideoVariant[] c = jsonMediaVideoInfo.c;
        if (c != null) {
            jsonGenerator.a("variants");
            jsonGenerator.a();
            while (i < c.length) {
                final JsonMediaVideoVariant jsonMediaVideoVariant = c[i];
                if (jsonMediaVideoVariant != null) {
                    JsonMediaVideoVariant$$JsonObjectMapper._serialize(jsonMediaVideoVariant, jsonGenerator, true);
                }
                ++i;
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonMediaVideoInfo jsonMediaVideoInfo, final String s, final JsonParser jsonParser) {
        if ("aspect_ratio".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonMediaVideoInfo.a = null;
                return;
            }
            final ArrayList<Integer> list = new ArrayList<Integer>();
            while (jsonParser.a() != JsonToken.e) {
                list.add(jsonParser.n());
            }
            final int[] a = new int[list.size()];
            final Iterator<Object> iterator = list.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final int intValue = iterator.next();
                final int n2 = n + 1;
                a[n] = intValue;
                n = n2;
            }
            jsonMediaVideoInfo.a = a;
        }
        else {
            if ("duration_millis".equals(s)) {
                jsonMediaVideoInfo.b = (float)jsonParser.p();
                return;
            }
            if ("variants".equals(s)) {
                if (jsonParser.d() == JsonToken.d) {
                    final ArrayList<JsonMediaVideoVariant> list2 = new ArrayList<JsonMediaVideoVariant>();
                    while (jsonParser.a() != JsonToken.e) {
                        final JsonMediaVideoVariant parse = JsonMediaVideoVariant$$JsonObjectMapper._parse(jsonParser);
                        if (parse != null) {
                            list2.add(parse);
                        }
                    }
                    jsonMediaVideoInfo.c = list2.toArray(new JsonMediaVideoVariant[list2.size()]);
                    return;
                }
                jsonMediaVideoInfo.c = null;
            }
        }
    }
    
    @Override
    public JsonMediaVideoInfo parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonMediaVideoInfo jsonMediaVideoInfo, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonMediaVideoInfo, jsonGenerator, b);
    }
}
