// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class at extends m
{
    public at() {
    }
    
    public at(final o o) {
        super(o);
    }
    
    public static void a(final SQLiteDatabase sqLiteDatabase, final String s, final long n) {
        final ContentValues contentValues = new ContentValues();
        final StringBuilder sb = new StringBuilder();
        final ArrayList<String> list = new ArrayList<String>();
        if (s != null) {
            sb.append("conversation_id=?");
            sb.append(" AND ");
            list.add(s);
        }
        sb.append("last_read_event_id < ?");
        list.add(String.valueOf(n));
        contentValues.put("last_read_event_id", n);
        sqLiteDatabase.update("conversations", contentValues, sb.toString(), (String[])list.toArray(new String[list.size()]));
    }
    
    public static at c(final JsonParser jsonParser) {
        return new at(m.b(jsonParser));
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        a(sqLiteDatabase, null, this.a);
    }
    
    @Override
    protected int d() {
        return 13;
    }
}
