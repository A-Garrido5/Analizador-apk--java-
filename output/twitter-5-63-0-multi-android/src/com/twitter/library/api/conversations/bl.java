// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.database.sqlite.SQLiteDatabase;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

public class bl extends f
{
    public bl(final long n, final String s, final long n2, final long n3) {
        super(n, s, n2, n3);
    }
    
    public static bl b(final JsonParser jsonParser) {
        long o = -1L;
        String r = null;
        long o2 = 0L;
        JsonToken jsonToken = jsonParser.a();
        long o3 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bm.a[jsonToken.ordinal()]) {
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
                    if ("user_id".equals(e)) {
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
        return new bl(o3, r, o2, o);
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
    }
    
    public int d() {
        return 9;
    }
}
