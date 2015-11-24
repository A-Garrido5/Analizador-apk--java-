// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import com.twitter.library.provider.z;
import com.twitter.errorreporter.a;
import com.twitter.util.f;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.cc;
import android.database.Cursor;

final class rk implements xy
{
    @Override
    public long a(final Cursor cursor) {
        return cursor.getLong(cc.f);
    }
    
    @Override
    public TwitterScribeItem a(final Cursor cursor, final int n) {
        return null;
    }
    
    @Override
    public String b(final Cursor cursor) {
        return cursor.getString(cc.g);
    }
    
    @Override
    public String c(final Cursor cursor) {
        return cursor.getString(cc.h);
    }
    
    @Override
    public String d(final Cursor cursor) {
        return cursor.getString(cc.i);
    }
    
    @Override
    public CharSequence e(final Cursor cursor) {
        String s = cursor.getString(cc.w);
        if (s == null) {
            s = cursor.getString(cc.v);
        }
        return s;
    }
    
    @Override
    public boolean f(final Cursor cursor) {
        return (0x2 & cursor.getInt(cc.j)) != 0x0;
    }
    
    @Override
    public boolean g(final Cursor cursor) {
        return (0x1 & cursor.getInt(cc.j)) != 0x0;
    }
    
    @Override
    public PromotedContent h(final Cursor cursor) {
        return (PromotedContent)f.a(cursor.getBlob(cc.l));
    }
    
    @Override
    public int i(final Cursor cursor) {
        return cursor.getInt(cc.k);
    }
    
    @Override
    public String j(final Cursor cursor) {
        return cursor.getString(cc.u);
    }
    
    @Override
    public int k(final Cursor cursor) {
        return cursor.getInt(cc.t);
    }
    
    @Override
    public boolean l(final Cursor cursor) {
        final Object a = f.a(cursor.getBlob(cc.e));
        Boolean b;
        if (a == null) {
            b = null;
        }
        else if (a instanceof Boolean) {
            b = (Boolean)a;
        }
        else {
            final a a2 = new a();
            final z z = (z)cursor;
            a2.a("start index: ", z.b());
            a2.a("end index: ", z.a());
            a2.a("current position: ", z.getPosition());
            a2.a("top is a type of: ", ((Boolean)a).getClass().getName());
            a2.a(new InvalidDataException("TLNA-1259: Cannot be cast to Boolean."));
            ErrorReporter.a(a2);
            b = null;
        }
        return b != null && b;
    }
}
