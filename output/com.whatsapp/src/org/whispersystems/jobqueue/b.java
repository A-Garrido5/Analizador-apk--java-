// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

class b extends SQLiteOpenHelper
{
    public b(final Context context, final String s) {
        super(context, s, (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(n.a());
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
