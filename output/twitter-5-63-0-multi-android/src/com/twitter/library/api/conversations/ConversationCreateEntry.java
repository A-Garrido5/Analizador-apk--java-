// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.database.sqlite.SQLiteDatabase;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

public class ConversationCreateEntry extends BaseConversationEntry
{
    private static final long serialVersionUID = 943878770402928646L;
    
    public ConversationCreateEntry() {
    }
    
    protected ConversationCreateEntry(final long n, final String s, final long n2, final boolean b) {
        super(n, s, n2, -1L, b);
    }
    
    public static ConversationCreateEntry b(final JsonParser jsonParser) {
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        String r = null;
        boolean q = false;
        long o2 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (p.a[jsonToken.ordinal()]) {
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
                case 3: {
                    if ("affects_sort".equals(jsonParser.e())) {
                        q = jsonParser.q();
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new ConversationCreateEntry(o2, r, o, q);
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
    }
    
    @Override
    protected int d() {
        return 4;
    }
}
