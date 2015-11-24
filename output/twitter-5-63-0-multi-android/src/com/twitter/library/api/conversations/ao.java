// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.Iterator;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;

public class ao extends f
{
    public final List a;
    
    protected ao(final long n, final String s, final long n2, final List a) {
        super(n, s, n2);
        this.a = a;
    }
    
    public static ao b(final JsonParser jsonParser) {
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        String r = null;
        final ArrayList list = new ArrayList();
        long o2 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (ap.a[jsonToken.ordinal()]) {
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
                    jsonParser.c();
                    break;
                }
                case 4: {
                    if ("messages".equals(jsonParser.e())) {
                        list.addAll(c(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new ao(o2, r, o, list);
    }
    
    private static List c(final JsonParser jsonParser) {
        final ArrayList<Long> list = new ArrayList<Long>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (ap.a[jsonToken.ordinal()]) {
                case 3: {
                    final long d = d(jsonParser);
                    if (d > 0L) {
                        list.add(d);
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
    
    private static long d(final JsonParser jsonParser) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (ap.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    if ("message_create_event_id".equals(jsonParser.e())) {
                        return jsonParser.o();
                    }
                    break;
                }
                case 3:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return -1L;
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        final Iterator<Long> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            sqLiteDatabase.delete("conversation_entries", "entry_id=?", new String[] { String.valueOf((long)iterator.next()) });
        }
    }
    
    @Override
    protected int d() {
        return 7;
    }
}
