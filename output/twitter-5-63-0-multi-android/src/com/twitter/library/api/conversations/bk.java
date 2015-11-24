// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.database.Cursor;
import java.io.Serializable;
import android.content.ContentValues;
import com.twitter.util.f;
import com.twitter.library.provider.bg;
import android.database.sqlite.SQLiteDatabase;
import com.fasterxml.jackson.core.JsonParser;

public class bk extends ao
{
    private boolean b;
    
    protected bk(final ao ao, final boolean b) {
        super(ao.id, ao.conversationId, ao.date, ao.a);
        this.b = b;
    }
    
    public static bk a(final JsonParser jsonParser, final boolean b) {
        return new bk(ao.b(jsonParser), b);
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        final Cursor query = sqLiteDatabase.query("conversation_entries", new String[] { "entry_id", "data" }, "entry_id " + bg.a((Iterable)this.a), (String[])null, (String)null, (String)null, (String)null);
        if (query != null) {
            while (query.moveToNext()) {
                final long long1 = query.getLong(0);
                final DMMessageEntry dmMessageEntry = (DMMessageEntry)com.twitter.util.f.a(query.getBlob(1));
                if (dmMessageEntry != null) {
                    dmMessageEntry.isSpam = this.b;
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put("data", com.twitter.util.f.a(dmMessageEntry));
                    sqLiteDatabase.updateWithOnConflict("conversation_entries", contentValues, "entry_id=?", new String[] { String.valueOf(long1) }, 5);
                }
            }
            query.close();
        }
    }
    
    @Override
    protected int d() {
        return 16;
    }
}
