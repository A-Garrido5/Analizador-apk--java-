// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.content.Context;
import android.net.Uri;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;

public class k extends AsyncTaskLoader
{
    private Cursor a;
    private final Uri b;
    private final String[] c;
    private final String d;
    private final String[] e;
    private final String f;
    
    public k(final Context context, final Uri b, final String[] c, final String d, final String[] e, final String f) {
        super(context);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public Cursor a() {
        final Cursor query = this.getContext().getContentResolver().query(this.b, this.c, this.d, this.e, this.f);
        if (query != null) {
            query.getCount();
        }
        return query;
    }
    
    public void a(final Cursor a) {
        if (this.isReset()) {
            if (a != null) {
                a.close();
            }
        }
        else {
            final Cursor a2 = this.a;
            this.a = a;
            if (this.isStarted()) {
                super.deliverResult(a);
            }
            if (a2 != null && a2 != a && !a2.isClosed()) {
                a2.close();
            }
        }
    }
    
    public void b(final Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
    
    @Override
    protected void onReset() {
        super.onReset();
        this.onStopLoading();
        final Cursor a = this.a;
        if (a != null && !a.isClosed()) {
            a.close();
        }
        this.a = null;
    }
    
    @Override
    protected void onStartLoading() {
        if (this.a != null) {
            this.a(this.a);
            return;
        }
        this.forceLoad();
    }
    
    @Override
    protected void onStopLoading() {
        this.cancelLoad();
    }
}
