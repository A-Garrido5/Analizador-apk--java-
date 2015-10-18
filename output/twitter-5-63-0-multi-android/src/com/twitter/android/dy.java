// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.provider.c;
import android.database.Cursor;
import android.net.Uri;
import android.content.Context;
import android.support.v4.content.CursorLoader;

public class dy extends CursorLoader
{
    private final long a;
    private final String b;
    
    public dy(final Context context, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final long a, final String b) {
        super(context, uri, array, s, array2, s2);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Cursor loadInBackground() {
        return (Cursor)new c(super.loadInBackground(), this.a, this.getContext(), this.b, true);
    }
}
