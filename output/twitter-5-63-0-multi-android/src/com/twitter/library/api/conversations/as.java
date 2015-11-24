// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.database.sqlite.SQLiteDatabase;
import com.fasterxml.jackson.core.JsonParser;

public class as extends m
{
    public as(final o o) {
        super(o);
    }
    
    public static as c(final JsonParser jsonParser) {
        return new as(m.b(jsonParser));
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        at.a(sqLiteDatabase, this.conversationId, this.a);
    }
    
    @Override
    protected int d() {
        return 12;
    }
}
