// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.errorreporter.a;
import com.twitter.library.api.bh;
import com.twitter.library.api.TwitterUser;
import java.util.Collection;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;

public class q implements y
{
    public final String a;
    public final DMPaginationStatus b;
    private final DMResponseSource c;
    private final List d;
    private final List e;
    private final List f;
    private final long g;
    private final long h;
    
    protected q(final DMResponseSource c, final List d, final List e, final List f, final DMPaginationStatus b, final long g, final String a, final long h) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = b;
        this.a = a;
    }
    
    public static q a(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (r.a[jsonToken.ordinal()]) {
                case 1: {
                    final DMResponseSource a = DMResponseSource.a(g);
                    if (a != null) {
                        return a(jsonParser, a);
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    g = jsonParser.g();
                    break;
                }
                case 3: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return null;
    }
    
    private static q a(final JsonParser jsonParser, final DMResponseSource dmResponseSource) {
        long o = -1L;
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final JsonToken a = jsonParser.a();
        String r = null;
        long o2 = o;
        DMPaginationStatus a2 = null;
        JsonToken a3 = a;
        Object g = null;
        while (a3 != null && a3 != JsonToken.c) {
            switch (com.twitter.library.api.conversations.r.a[a3.ordinal()]) {
                case 1: {
                    if ("users".equals(g)) {
                        list2.addAll(b(jsonParser));
                        break;
                    }
                    if ("conversations".equals(g)) {
                        list3.addAll(d(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("status".equals(g)) {
                        a2 = DMPaginationStatus.a(jsonParser.r());
                        break;
                    }
                    if ("min_entry_id".equals(g)) {
                        o2 = jsonParser.o();
                        break;
                    }
                    if ("cursor".equals(g)) {
                        r = jsonParser.r();
                        break;
                    }
                    if ("last_seen_event_id".equals(g)) {
                        o = jsonParser.o();
                        break;
                    }
                    break;
                }
                case 2: {
                    g = jsonParser.g();
                    break;
                }
                case 3: {
                    if ("entries".equals(g) || "requests".equals(g)) {
                        list.addAll(c(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            a3 = jsonParser.a();
        }
        return new q(dmResponseSource, list, list2, list3, a2, o2, r, o);
    }
    
    public static List b(final JsonParser jsonParser) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (r.a[jsonToken.ordinal()]) {
                case 1: {
                    final TwitterUser a = bh.a(jsonParser, true, null);
                    if (a != null) {
                        list.add(a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
    
    public static List c(final JsonParser jsonParser) {
        final ArrayList<f> list = new ArrayList<f>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (r.a[jsonToken.ordinal()]) {
                case 1: {
                    final f a = f.a(jsonParser);
                    if (a != null) {
                        list.add(a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
    
    public static List d(final JsonParser jsonParser) {
        final ArrayList<s> list = new ArrayList<s>();
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (r.a[a2.ordinal()]) {
                case 1: {
                    final s a3 = s.a(jsonParser, g);
                    if (a3 != null) {
                        list.add(a3);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    g = jsonParser.g();
                    break;
                }
            }
        }
        return list;
    }
    
    @Override
    public List a() {
        return this.d;
    }
    
    @Override
    public List b() {
        return this.e;
    }
    
    @Override
    public List c() {
        return this.f;
    }
    
    @Override
    public DMResponseSource d() {
        return this.c;
    }
    
    @Override
    public long e() {
        return this.g;
    }
    
    @Override
    public long f() {
        return this.h;
    }
}
