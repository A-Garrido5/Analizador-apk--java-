// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.Iterator;
import java.util.Collection;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;

public class aw implements y
{
    public final List a;
    private final List b;
    private final List c;
    private final List d;
    
    public aw(final List b, final List c, final List d, final List a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public static aw a(final JsonParser jsonParser) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final ArrayList list4 = new ArrayList();
        JsonToken jsonToken = jsonParser.a();
        Object g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (ax.a[jsonToken.ordinal()]) {
                case 1: {
                    g = jsonParser.g();
                    break;
                }
                case 2: {
                    if ("conversations".equals(g)) {
                        list2.addAll(q.d(jsonParser));
                        break;
                    }
                    if ("users".equals(g)) {
                        list.addAll(q.b(jsonParser));
                        break;
                    }
                    if ("failed_participants".equals(g)) {
                        list4.addAll(BaseParticipantEntry.c(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("entries".equals(g)) {
                        list3.addAll(q.c(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new aw(list, list2, list3, list4);
    }
    
    @Override
    public List a() {
        return this.d;
    }
    
    @Override
    public List b() {
        return this.b;
    }
    
    @Override
    public List c() {
        return this.c;
    }
    
    @Override
    public DMResponseSource d() {
        return DMResponseSource.e;
    }
    
    @Override
    public long e() {
        return -1L;
    }
    
    @Override
    public long f() {
        return -1L;
    }
    
    public DMMessageEntry g() {
        for (final f f : this.d) {
            if (f.d() == 0) {
                return (DMMessageEntry)f;
            }
        }
        return null;
    }
}
