// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.Collection;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import java.util.Map;

public class ag
{
    public final Map a;
    public final Map b;
    public final List c;
    
    protected ag(final Map a, final Map b, final List c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static ag a(final JsonParser jsonParser) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final ArrayList list = new ArrayList();
        JsonToken jsonToken = jsonParser.a();
        Object o = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (ah.a[jsonToken.ordinal()]) {
                case 3: {
                    o = jsonParser.g();
                    break;
                }
                case 1: {
                    if ("permissions".equals(o)) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            switch (ah.a[jsonToken2.ordinal()]) {
                                case 1: {
                                    if ("id_keys".equals(o)) {
                                        hashMap.putAll(c(jsonParser));
                                        break;
                                    }
                                    if ("screen_name_keys".equals(o)) {
                                        hashMap2.putAll(b(jsonParser));
                                        break;
                                    }
                                    jsonParser.c();
                                    break;
                                }
                                case 2: {
                                    jsonParser.c();
                                    break;
                                }
                                case 3: {
                                    o = jsonParser.g();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    if ("users".equals(o)) {
                        list.addAll(q.b(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new ag(hashMap, hashMap2, list);
    }
    
    private static Map b(final JsonParser jsonParser) {
        final HashMap<String, ad> hashMap = new HashMap<String, ad>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (ah.a[jsonToken.ordinal()]) {
                case 1: {
                    hashMap.put(jsonParser.e().toLowerCase(), ad.a(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return hashMap;
    }
    
    private static Map c(final JsonParser jsonParser) {
        final HashMap<Long, ad> hashMap = new HashMap<Long, ad>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (ah.a[jsonToken.ordinal()]) {
                case 1: {
                    hashMap.put(Long.valueOf(jsonParser.e()), ad.a(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return hashMap;
    }
}
