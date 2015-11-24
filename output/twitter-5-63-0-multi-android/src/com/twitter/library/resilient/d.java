// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.resilient;

import android.content.Intent;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import org.json.JSONException;
import com.twitter.errorreporter.ErrorReporter;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;
import com.twitter.library.client.ay;
import com.twitter.library.client.az;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;

public class d extends sh
{
    private static d b;
    private final f c;
    
    protected d(final Context context) {
        super(context, "persistent_jobs.db", null, 1);
        this.c = new f(context);
        az.a(context).a(this.c);
    }
    
    private int a(final String s, final String... array) {
        while (true) {
            synchronized (this) {
                final Cursor query = this.getReadableDatabase().query("persistent_jobs", new String[] { "COUNT(*)" }, s, array, (String)null, (String)null, (String)null);
                if (query != null) {
                    try {
                        int int1;
                        if (query.moveToFirst()) {
                            int1 = query.getInt(0);
                        }
                        else {
                            int1 = 0;
                        }
                        return int1;
                    }
                    finally {
                        query.close();
                    }
                }
            }
            return 0;
        }
    }
    
    public static d a(final Context context) {
        synchronized (d.class) {
            if (d.b == null) {
                d.b = new d(context.getApplicationContext());
            }
            return d.b;
        }
    }
    
    private List b(final String s, final String[] array) {
        final ArrayList<c> list;
        Label_0158: {
            final Cursor query;
            synchronized (this) {
                list = new ArrayList<c>();
                query = this.getReadableDatabase().query("persistent_jobs", e.a, s, array, (String)null, (String)null, (String)null);
                if (query == null) {
                    break Label_0158;
                }
                try {
                    while (query.moveToNext()) {
                        try {
                            list.add(new c(query.getString(0), query.getString(1), query.getInt(2), query.getLong(3), query.getLong(4), query.getLong(5), query.getString(6)));
                        }
                        catch (JSONException ex) {
                            ErrorReporter.a((Throwable)ex);
                        }
                    }
                }
                finally {
                    query.close();
                }
            }
            query.close();
        }
        // monitorexit(this)
        return list;
    }
    
    public int a() {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("persistent_jobs", "created_at < (SELECT MIN( created_at ) FROM (SELECT created_at FROM persistent_jobs ORDER BY created_at DESC LIMIT 500 ));", (String[])null);
            writableDatabase.setTransactionSuccessful();
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final long n) {
        synchronized (this) {
            return this.a("user_id=?", Long.toString(n));
        }
    }
    
    public int a(final Context context, final long n) {
        synchronized (this) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                final int delete = writableDatabase.delete("persistent_jobs", "user_id=?", new String[] { Long.toString(n) });
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                this.b(context);
                return delete;
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    public List a(final long n, final String s) {
        synchronized (this) {
            return this.b("user_id=? AND type=?", new String[] { Long.toString(n), s });
        }
    }
    
    public void a(final Context context, final a a) {
        synchronized (this) {
            this.a(context, a, true);
        }
    }
    
    public void a(final Context context, final a a, final boolean b) {
        final c e;
        synchronized (this) {
            e = a.e();
            if (e == null) {
                throw new UnsupportedOperationException("Persistent Job Info not provided for: " + a.getClass().getName());
            }
        }
        this.a(context, e, b);
    }
    // monitorexit(this)
    
    public void a(final Context context, final c c, final boolean b) {
        synchronized (this) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("job_id", c.a);
                contentValues.put("type", c.b);
                contentValues.put("job_version", c.c);
                contentValues.put("user_id", c.d);
                contentValues.put("created_at", c.b());
                contentValues.put("executed_at", c.c());
                contentValues.put("content", c.a());
                if (writableDatabase.update("persistent_jobs", contentValues, "job_id =? ", new String[] { c.a }) == 0) {
                    writableDatabase.insert("persistent_jobs", (String)null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (b) {
                    final int a = this.a();
                    if (a > 0) {
                        ErrorReporter.a(new Exception("The persistent job queue overflowed by: " + a));
                    }
                }
                this.b(context);
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    public boolean a(final Context context, final c c) {
        synchronized (this) {
            return this.a(context, c.a);
        }
    }
    
    public boolean a(final Context context, final String s) {
        while (true) {
            boolean b = true;
            synchronized (this) {
                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    final int delete = writableDatabase.delete("persistent_jobs", "job_id=?", new String[] { s });
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    this.b(context);
                    if (delete > 0) {
                        return b;
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
            }
            b = false;
            return b;
        }
    }
    
    public int b() {
        synchronized (this) {
            return this.a(null, new String[0]);
        }
    }
    
    protected void b(final Context context) {
        synchronized (this) {
            final Intent intent = new Intent(context, (Class)PersistentJobsStickyService.class);
            intent.putExtra("startCondition", 1);
            context.startService(intent);
        }
    }
    
    public List c() {
        synchronized (this) {
            return this.b(null, null);
        }
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE persistent_jobs (_id INTEGER PRIMARY KEY,job_id TEXT,type TEXT,job_version INT,user_id INT,created_at INT,executed_at INT,content TEXT);");
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
