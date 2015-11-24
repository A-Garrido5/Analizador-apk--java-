// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import com.twitter.library.service.b;
import com.twitter.library.api.bd;
import com.twitter.internal.network.l;
import com.twitter.library.api.bh;
import com.twitter.library.api.bp;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.api.bm;
import com.twitter.library.api.bl;
import com.twitter.model.json.geo.JsonTwitterPlace;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.api.bk;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

public class o extends ad
{
    private bk c(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        bm bm = null;
        bm bm2 = null;
        TwitterPlace twitterPlace = null;
        JsonToken jsonToken = a;
        List list = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            bm f = null;
            bm bm3 = null;
            TwitterPlace twitterPlace2 = null;
            switch (p.a[jsonToken.ordinal()]) {
                default: {
                    f = bm;
                    bm3 = bm2;
                    twitterPlace2 = twitterPlace;
                    break;
                }
                case 1: {
                    if ("header".equals(e)) {
                        final JsonToken a2 = jsonParser.a();
                        List d = list;
                        TwitterPlace twitterPlace3 = twitterPlace;
                        for (JsonToken a3 = a2; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
                            final String e2 = jsonParser.e();
                            switch (p.a[a3.ordinal()]) {
                                case 1: {
                                    if ("place".equals(e2)) {
                                        twitterPlace3 = (TwitterPlace)wx.a(jsonParser, JsonTwitterPlace.class);
                                        break;
                                    }
                                    if ("attribution".equals(e2)) {
                                        d = this.d(jsonParser);
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
                        }
                        final List list2 = d;
                        f = bm;
                        bm3 = bm2;
                        twitterPlace2 = twitterPlace3;
                        list = list2;
                        break;
                    }
                    if ("media".equals(e)) {
                        final bm f2 = this.f(jsonParser);
                        twitterPlace2 = twitterPlace;
                        f = bm;
                        bm3 = f2;
                        break;
                    }
                    if ("tweets".equals(e)) {
                        f = this.f(jsonParser);
                        bm3 = bm2;
                        twitterPlace2 = twitterPlace;
                        break;
                    }
                    jsonParser.c();
                    f = bm;
                    bm3 = bm2;
                    twitterPlace2 = twitterPlace;
                    break;
                }
                case 2: {
                    jsonParser.c();
                    f = bm;
                    bm3 = bm2;
                    twitterPlace2 = twitterPlace;
                    break;
                }
            }
            final JsonToken a4 = jsonParser.a();
            twitterPlace = twitterPlace2;
            bm2 = bm3;
            bm = f;
            jsonToken = a4;
        }
        return new bk(new bl(twitterPlace, list), bm2, bm);
    }
    
    private List d(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<a> list = new ArrayList<a>();
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (p.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("foursquare".equals(e)) {
                        list.add(this.e(jsonParser));
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
        return list;
    }
    
    private a e(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (p.a[a2.ordinal()]) {
                case 3: {
                    if ("id".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return new a(g);
    }
    
    private bm f(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        ArrayList<bp> list = null;
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (p.a[jsonToken.ordinal()]) {
                case 3: {
                    if ("cursor".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("tweets".equals(e)) {
                        list = new ArrayList<bp>();
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                            if (jsonToken2 == JsonToken.b) {
                                list.add(bh.b(jsonParser, true, null));
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 1: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new bm(g, list);
    }
    
    @Override
    public void a(final l l) {
        final ArrayList list = (ArrayList)this.b();
        if (list != null && !list.isEmpty()) {
            l.j = list.get(0).a;
        }
    }
    
    @Override
    public b ax_() {
        return new b((List)this.b());
    }
    
    protected bk b(final JsonParser jsonParser) {
        return this.c(jsonParser);
    }
    
    protected ArrayList b(final JsonParser jsonParser, final int n) {
        return bh.G(jsonParser);
    }
}
