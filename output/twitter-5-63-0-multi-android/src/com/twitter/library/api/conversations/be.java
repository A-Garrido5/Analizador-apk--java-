// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

public class be extends f
{
    private final boolean a;
    
    public be(final long n, final String s, final long n2, final boolean a) {
        super(n, s, n2);
        this.a = a;
    }
    
    public static be a(final JsonParser jsonParser, final boolean b) {
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        String r = null;
        long o2 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bf.a[jsonToken.ordinal()]) {
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
        return new be(o2, r, o, b);
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("is_muted", this.a);
        sqLiteDatabase.update("conversations", contentValues, "conversation_id=?", new String[] { this.conversationId });
    }
    
    @Override
    protected int d() {
        if (this.a) {
            return 14;
        }
        return 15;
    }
}
