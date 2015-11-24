// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

public class ay
{
    public final long a;
    public final long b;
    
    public ay(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    protected static ay a(final JsonParser jsonParser) {
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        long o2 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (az.a[jsonToken.ordinal()]) {
                case 1: {
                    final String e = jsonParser.e();
                    if ("user_id".equals(e)) {
                        o = jsonParser.o();
                        break;
                    }
                    if ("join_time".equals(e)) {
                        o2 = jsonParser.o();
                        break;
                    }
                    break;
                }
                case 2:
                case 3: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (o > 0L) {
            return new ay(o, o2);
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            if (this.a != ((ay)o).a) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return (int)(this.a ^ this.a >>> 32);
    }
}
