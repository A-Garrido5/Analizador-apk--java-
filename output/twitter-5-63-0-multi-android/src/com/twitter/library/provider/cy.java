// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.content.Context;

public class cy
{
    private static final String[] a;
    
    static {
        a = new String[] { "value" };
    }
    
    public static String a(final Context context) {
        return a(context, "current_account", null);
    }
    
    private static String a(final Context context, final String s, String string) {
        final Cursor query = k.a(context).getReadableDatabase().query("user_values", cy.a, "name=?", new String[] { s }, (String)null, (String)null, (String)null);
        if (query != null) {
            if (query.moveToFirst()) {
                string = query.getString(0);
            }
            query.close();
        }
        return string;
    }
    
    public static void a(final Context context, final String s, final long n) {
        final b b = new b(context.getContentResolver());
        a(context, "current_account", s, b);
        a(context, "current_user_id", n, b);
        b.a();
    }
    
    private static void a(final Context context, final String s, final long n, final b b) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("value", n);
        k.a(context).a(s, contentValues, b);
    }
    
    private static void a(final Context context, final String s, final String s2, final b b) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("value", s2);
        k.a(context).a(s, contentValues, b);
    }
    
    public static long b(final Context context) {
        return b(context, "current_user_id", 0L);
    }
    
    private static long b(final Context context, final String s, long long1) {
        final Cursor query = k.a(context).getReadableDatabase().query("user_values", cy.a, "name=?", new String[] { s }, (String)null, (String)null, (String)null);
        if (query != null) {
            if (query.moveToFirst()) {
                long1 = query.getLong(0);
            }
            query.close();
        }
        return long1;
    }
}
