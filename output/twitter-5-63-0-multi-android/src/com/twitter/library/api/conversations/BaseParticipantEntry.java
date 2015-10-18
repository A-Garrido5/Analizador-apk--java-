// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.Collection;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collections;
import java.util.List;

public abstract class BaseParticipantEntry extends BaseConversationEntry
{
    private static final long serialVersionUID = -7991763974034395478L;
    public final List participants;
    
    protected BaseParticipantEntry() {
        this.participants = Collections.emptyList();
    }
    
    protected BaseParticipantEntry(final l l) {
        super(l.a, l.b, l.c, l.e, l.f);
        this.participants = l.d;
    }
    
    public static l b(final JsonParser jsonParser) {
        Object g = null;
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        final ArrayList list = new ArrayList();
        boolean q = false;
        long o2 = o;
        String r = null;
        long o3 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (j.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    final String e = jsonParser.e();
                    if ("id".equals(e)) {
                        o3 = jsonParser.o();
                        break;
                    }
                    if ("conversation_id".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    if ("time".equals(e)) {
                        o2 = jsonParser.o();
                        break;
                    }
                    if ("sender_id".equals(e)) {
                        o = jsonParser.o();
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("affects_sort".equals(jsonParser.e())) {
                        q = jsonParser.q();
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
                case 5: {
                    if ("participants".equals(g)) {
                        list.addAll(s.a(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 6: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new l(o3, r, o2, list, o, q);
    }
    
    public static List c(final JsonParser jsonParser) {
        final ArrayList<k> list = new ArrayList<k>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (j.a[jsonToken.ordinal()]) {
                case 2: {
                    list.add(new k(Long.parseLong(jsonParser.e()), jsonParser.n()));
                    break;
                }
                case 4:
                case 5: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
}
