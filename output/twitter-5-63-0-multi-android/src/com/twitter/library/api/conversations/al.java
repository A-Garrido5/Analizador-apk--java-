// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.database.sqlite.SQLiteDatabase;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

public class al extends f
{
    protected al(final long n, final String s, final long n2) {
        super(n, s, n2);
    }
    
    public static al b(final JsonParser jsonParser) {
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        String r = null;
        long o2 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (am.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    final String e = jsonParser.e();
                    if ("id".equals(e)) {
                        o2 = jsonParser.o();
                        break;
                    }
                    if ("conversation_id".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    if ("time".equals(e)) {
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
        return new al(o2, r, o);
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        final String[] array = { this.conversationId };
        sqLiteDatabase.delete("conversations", "conversation_id=?", array);
        sqLiteDatabase.delete("conversation_entries", "conversation_id=?", array);
        sqLiteDatabase.delete("conversation_participants", "conversation_id=?", array);
    }
    
    @Override
    protected int d() {
        return 6;
    }
}
