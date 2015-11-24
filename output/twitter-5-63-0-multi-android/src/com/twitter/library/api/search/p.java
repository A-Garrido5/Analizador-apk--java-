// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.api.bh;
import java.util.List;
import com.twitter.library.service.b;
import com.twitter.library.api.bd;
import java.util.ArrayList;
import com.twitter.internal.network.l;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

public class p extends ad
{
    private o c(final JsonParser jsonParser) {
        String r = null;
        long n = -1L;
        boolean b = false;
        JsonToken a4;
        for (JsonToken a = jsonParser.a(); a != null && a != JsonToken.c; a = a4) {
            boolean b2 = false;
            String s = null;
            long n2 = 0L;
            Label_0082: {
                switch (q.a[a.ordinal()]) {
                    case 5: {
                        if ("personalized".equals(jsonParser.e())) {
                            b2 = true;
                            s = r;
                            n2 = n;
                            break Label_0082;
                        }
                        break;
                    }
                    case 2: {
                        if ("location".equals(jsonParser.e())) {
                            final JsonToken a2 = jsonParser.a();
                            long i = n;
                            for (JsonToken a3 = a2; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
                                switch (q.a[a3.ordinal()]) {
                                    case 3: {
                                        if ("name".equals(jsonParser.e())) {
                                            r = jsonParser.r();
                                            break;
                                        }
                                        break;
                                    }
                                    case 4: {
                                        if ("woeid".equals(jsonParser.e())) {
                                            i = jsonParser.i();
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
                            final boolean b3 = b;
                            final long n3 = i;
                            b2 = b3;
                            s = r;
                            n2 = n3;
                            break Label_0082;
                        }
                        jsonParser.c();
                        b2 = b;
                        s = r;
                        n2 = n;
                        break Label_0082;
                    }
                    case 1: {
                        jsonParser.c();
                        b2 = b;
                        s = r;
                        n2 = n;
                        break Label_0082;
                    }
                }
                b2 = b;
                s = r;
                n2 = n;
            }
            a4 = jsonParser.a();
            n = n2;
            b = b2;
            r = s;
        }
        return new o(r, n, b);
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
    
    protected n b(final JsonParser jsonParser) {
        o c = null;
        JsonToken jsonToken = jsonParser.a();
        ArrayList f = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (q.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("data".equals(jsonParser.e())) {
                        f = bh.f(jsonParser, this.d());
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("metadata".equals(jsonParser.e())) {
                        c = this.c(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new n(c, f);
    }
    
    protected ArrayList b(final JsonParser jsonParser, final int n) {
        return bh.G(jsonParser);
    }
}
