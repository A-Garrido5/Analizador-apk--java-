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

public final class JsonEntity$$JsonObjectMapper extends JsonMapper
{
    public static JsonEntity _parse(final JsonParser jsonParser) {
        JsonEntity jsonEntity = new JsonEntity();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonEntity = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonEntity, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonEntity;
    }
    
    public static void _serialize(final JsonEntity jsonEntity, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        final int[] a = jsonEntity.a;
        if (a != null) {
            jsonGenerator.a("indices");
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
    
    public static void parseField(final JsonEntity jsonEntity, final String s, final JsonParser jsonParser) {
        if ("indices".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonEntity.a = null;
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
            jsonEntity.a = a;
        }
    }
    
    @Override
    public JsonEntity parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonEntity jsonEntity, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonEntity, jsonGenerator, b);
    }
}
