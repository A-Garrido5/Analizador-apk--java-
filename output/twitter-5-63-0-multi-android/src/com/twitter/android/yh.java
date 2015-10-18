// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cv;
import com.twitter.library.provider.bf;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.provider.bg;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.content.Context;
import android.support.v4.app.LoaderManager$LoaderCallbacks;

public class yh implements LoaderManager$LoaderCallbacks
{
    private final Context a;
    private final LoaderManager b;
    private final yi c;
    private final int d;
    private long e;
    private String f;
    private long g;
    
    public yh(final Context a, final LoaderManager b, final yi c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void a(final long e, final String f, final long g) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.b.initLoader(this.d, null, this);
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        TwitterUser a = null;
        if (cursor != null) {
            final boolean moveToFirst = cursor.moveToFirst();
            a = null;
            if (moveToFirst) {
                a = bg.a(cursor);
            }
        }
        this.c.c(a);
    }
    
    public void b(final long e, final String f, final long g) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.b.restartLoader(this.d, null, this);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        Uri uri;
        String s;
        String[] array;
        if (this.f != null) {
            uri = bf.a.buildUpon().appendQueryParameter("ownerId", String.valueOf(this.g)).build();
            s = "username=? COLLATE NOCASE";
            array = new String[] { this.f };
        }
        else {
            uri = bf.b.buildUpon().appendEncodedPath(String.valueOf(this.e)).appendQueryParameter("ownerId", String.valueOf(this.g)).build();
            s = null;
            array = null;
        }
        return new CursorLoader(this.a, uri, cv.a, s, array, null);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
}
