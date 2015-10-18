// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

public abstract class m extends f
{
    public final long a;
    
    protected m() {
        this.a = 0L;
    }
    
    protected m(final o o) {
        super(o.a, o.b, o.c);
        this.a = o.d;
    }
    
    public static o b(final JsonParser jsonParser) {
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        String r = null;
        long o2 = o;
        long o3 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (n.a[jsonToken.ordinal()]) {
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
                    if ("last_read_event_id".equals(e)) {
                        o = jsonParser.o();
                        break;
                    }
                    break;
                }
                case 3:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new o(o3, r, o2, o);
    }
}
