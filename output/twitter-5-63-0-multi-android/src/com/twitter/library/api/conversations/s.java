// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.Iterator;
import android.database.Cursor;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;
import java.util.Collection;

public class s
{
    public final String a;
    public final int b;
    public final long c;
    public final Collection d;
    public final String e;
    public final boolean f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    
    private s(final String e, final int b, final long c, final Collection collection, final String a, final boolean f, final long g, final long h, final long i, final long j, final boolean k) {
        this.d = new HashSet();
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = a;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        if (collection != null) {
            this.d.addAll(collection);
        }
    }
    
    protected static s a(final JsonParser jsonParser, final String s) {
        JsonToken jsonToken = jsonParser.a();
        final u b = new u().b(s);
        Object g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (t.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    final String e = jsonParser.e();
                    if ("type".equals(e)) {
                        int n;
                        if ("GROUP_DM".equals(jsonParser.r())) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        b.a(n);
                        break;
                    }
                    if ("name".equals(e)) {
                        b.a(jsonParser.r());
                        break;
                    }
                    if ("conversation_id".equals(e)) {
                        b.b(jsonParser.r());
                        break;
                    }
                    if ("sort_event_id".equals(e)) {
                        b.b(jsonParser.o());
                        break;
                    }
                    if ("last_read_event_id".equals(e)) {
                        b.d(jsonParser.o());
                        break;
                    }
                    if ("min_entry_id".equals(e)) {
                        b.e(jsonParser.o());
                        break;
                    }
                    if ("created_by_user_id".equals(e)) {
                        b.a(jsonParser.o());
                        break;
                    }
                    if ("sort_timestamp".equals(e)) {
                        b.c(jsonParser.o());
                        break;
                    }
                    break;
                }
                case 3:
                case 4: {
                    final String e2 = jsonParser.e();
                    if ("notifications_disabled".equals(e2)) {
                        b.a(jsonParser.l());
                        break;
                    }
                    if ("read_only".equals(e2)) {
                        b.b(jsonParser.l());
                        break;
                    }
                    break;
                }
                case 5: {
                    jsonParser.c();
                    break;
                }
                case 6: {
                    g = jsonParser.g();
                    break;
                }
                case 7: {
                    if ("participants".equals(g)) {
                        b.a(a(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return b.a();
    }
    
    public static String a(final long n, final long[] array) {
        if (array.length == 1) {
            return ak.a(n, array[0]);
        }
        return "CONV_" + System.currentTimeMillis();
    }
    
    public static List a(final JsonParser jsonParser) {
        final ArrayList<ay> list = new ArrayList<ay>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (t.a[jsonToken.ordinal()]) {
                case 5: {
                    final ay a = ay.a(jsonParser);
                    if (a != null) {
                        list.add(a);
                        break;
                    }
                    break;
                }
                case 7: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
    
    public static boolean a(final String s) {
        return s != null && s.startsWith("CONV_");
    }
    
    public void a(final SQLiteDatabase sqLiteDatabase, final boolean b) {
        final String[] array = { this.a };
        final long h = this.h;
        final long g = this.g;
        final long j = this.j;
        final long g2 = this.g;
        final Cursor query = sqLiteDatabase.query("conversations", new String[] { "last_read_event_id", "sort_event_id", "sort_timestamp", "last_readable_event_id" }, "conversation_id=?", array, (String)null, (String)null, (String)null, (String)null);
        Label_0163: {
            if (query == null) {
                final long max = g2;
                final long max2 = j;
                final long max3 = g;
                final long max4 = h;
                break Label_0163;
            }
            while (true) {
                long max;
                long max2;
                long max3;
                long max4;
                ContentValues contentValues = null;
                int n;
                int n2;
                int n3;
                Label_0473_Outer:Label_0486_Outer:Label_0493_Outer:
                while (true) {
                    Label_0566: {
                        while (true) {
                        Label_0559:
                            while (true) {
                                Label_0532: {
                                    while (true) {
                                    Label_0526:
                                        while (true) {
                                            try {
                                                if (!query.moveToFirst()) {
                                                    break Label_0566;
                                                }
                                                max3 = Math.max(query.getLong(1), g);
                                                max2 = Math.max(query.getLong(2), j);
                                                max4 = Math.max(query.getLong(0), this.h);
                                                max = Math.max(query.getLong(3), g2);
                                                query.close();
                                                if (b) {
                                                    sqLiteDatabase.delete("conversation_participants", "conversation_id=?", array);
                                                    sqLiteDatabase.delete("conversations", "conversation_id=?", array);
                                                }
                                                contentValues = new ContentValues();
                                                contentValues.put("conversation_id", this.a);
                                                contentValues.put("type", this.b);
                                                contentValues.put("title", this.e);
                                                contentValues.put("is_muted", this.f);
                                                contentValues.put("is_hidden", false);
                                                contentValues.put("sort_event_id", max3);
                                                contentValues.put("last_read_event_id", max4);
                                                contentValues.put("sort_timestamp", max2);
                                                contentValues.put("last_readable_event_id", max);
                                                contentValues.put("min_event_id", this.i);
                                                contentValues.put("has_more", true);
                                                contentValues.put("read_only", this.k);
                                                if (b) {
                                                    n = 5;
                                                    sqLiteDatabase.insertWithOnConflict("conversations", (String)null, contentValues, n);
                                                    for (final ay ay : this.d) {
                                                        contentValues.clear();
                                                        contentValues.put("conversation_id", this.a);
                                                        contentValues.put("user_id", ay.a);
                                                        if (1 != this.b) {
                                                            break Label_0532;
                                                        }
                                                        contentValues.put("join_time", ay.b);
                                                        if (ay.a != this.c) {
                                                            break Label_0526;
                                                        }
                                                        n2 = 0;
                                                        contentValues.put("participant_type", n2);
                                                        if (!b) {
                                                            break Label_0559;
                                                        }
                                                        n3 = 5;
                                                        sqLiteDatabase.insertWithOnConflict("conversation_participants", (String)null, contentValues, n3);
                                                    }
                                                    break;
                                                }
                                            }
                                            finally {
                                                query.close();
                                            }
                                            n = 4;
                                            continue Label_0473_Outer;
                                        }
                                        n2 = 1;
                                        continue Label_0486_Outer;
                                    }
                                }
                                contentValues.put("join_time", 0);
                                contentValues.put("participant_type", 1);
                                continue Label_0493_Outer;
                            }
                            n3 = 4;
                            continue;
                        }
                    }
                    max = g2;
                    max2 = j;
                    max3 = g;
                    max4 = h;
                    continue;
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
