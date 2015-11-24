// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import java.util.HashMap;

public class ScribeDatabaseHelper extends sh implements c
{
    public static final String[] b;
    public static final String c;
    private static final HashMap d;
    private final long e;
    
    static {
        b = new String[] { "category", "log", "request_id", "retry_count" };
        c = "CREATE TABLE scribe (_id INTEGER PRIMARY KEY,log_type TEXT DEFAULT \"" + ScribeDatabaseHelper$LogType.a.toString() + "\"," + "category" + " TEXT," + "log" + " BLOB," + "request_id" + " TEXT DEFAULT \"0\"," + "retry_count" + " INT DEFAULT 0);";
        d = new HashMap();
    }
    
    private ScribeDatabaseHelper(final Context context, final long e) {
        super(context, a(e), null, 2);
        this.e = e;
    }
    
    private long a(final ScribeDatabaseHelper$LogType scribeDatabaseHelper$LogType, final String s, final byte[] array) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("log_type", scribeDatabaseHelper$LogType.toString());
        if (s != null) {
            contentValues.put("category", s);
        }
        contentValues.put("log", array);
        contentValues.put("request_id", String.valueOf(0));
        contentValues.put("retry_count", 0);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final long insert = writableDatabase.insert("scribe", (String)null, contentValues);
            writableDatabase.setTransactionSuccessful();
            return insert;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public static ScribeDatabaseHelper a(final Context context, final long n) {
        synchronized (ScribeDatabaseHelper.class) {
            final String a = a(n);
            ScribeDatabaseHelper scribeDatabaseHelper = ScribeDatabaseHelper.d.get(a);
            if (scribeDatabaseHelper == null) {
                scribeDatabaseHelper = new ScribeDatabaseHelper(context.getApplicationContext(), n);
                ScribeDatabaseHelper.d.put(a, scribeDatabaseHelper);
                scribeDatabaseHelper.c();
            }
            return scribeDatabaseHelper;
        }
    }
    
    static String a(final long n) {
        return n + "-" + "scribe.db";
    }
    
    public static void b(final long n) {
        synchronized (ScribeDatabaseHelper.class) {
            final ScribeDatabaseHelper scribeDatabaseHelper = ScribeDatabaseHelper.d.remove(a(n));
            if (scribeDatabaseHelper != null) {
                scribeDatabaseHelper.close();
            }
        }
    }
    
    private void c() {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("request_id", String.valueOf(0));
            writableDatabase.update("scribe", contentValues, "request_id!=\"0\"", (String[])null);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public long a(final String s, final byte[] array) {
        return this.a(ScribeDatabaseHelper$LogType.b, s, array);
    }
    
    public long a(final byte[] array) {
        return this.a(ScribeDatabaseHelper$LogType.a, null, array);
    }
    
    @Override
    public void a() {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("scribe", "retry_count=?", new String[] { String.valueOf(5) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    @Override
    public void a(final String s) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("scribe", "request_id=?", new String[] { s });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    @Override
    public void a(final String s, final String s2, final String s3) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("request_id", s2);
            writableDatabase.update("scribe", contentValues, "log_type=? AND request_id=?", new String[] { s3, s });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final int n) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("UPDATE scribe SET request_id =?  where _id in (select _id from scribe where request_id =? and log_type =? order by _id LIMIT ?);", (Object[])new String[] { s2, s, s3, String.valueOf(n) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void b() {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("scribe", (String)null, (String[])null);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    @Override
    public void b(final String s) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("UPDATE scribe SET retry_count = retry_count + 1 WHERE request_id=?", (Object[])new String[] { s });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    @Override
    public Cursor c(final String s) {
        return this.getReadableDatabase().query("scribe", ScribeDatabaseHelper.b, "request_id=?", new String[] { s }, (String)null, (String)null, (String)null);
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ScribeDatabaseHelper.c);
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        if (n == 1) {
            sqLiteDatabase.execSQL("ALTER TABLE scribe ADD COLUMN log_type TEXT DEFAULT '" + ScribeDatabaseHelper$LogType.a.toString() + "';");
            sqLiteDatabase.execSQL("ALTER TABLE scribe ADD COLUMN category TEXT;");
        }
    }
}
