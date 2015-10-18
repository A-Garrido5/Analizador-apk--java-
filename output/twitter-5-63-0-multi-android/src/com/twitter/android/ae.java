// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.database.Cursor;
import android.net.Uri;
import android.content.Context;
import com.twitter.library.util.k;

public class ae extends k
{
    private final long a;
    private final int b;
    private final int c;
    private final boolean d;
    
    public ae(final Context context, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final long a, final int b, final int c, final boolean d) {
        super(context, uri, array, s, array2, s2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public Cursor a() {
        return (Cursor)new ActivityCursor(super.a(), this.a, this.getContext(), this.b, this.c, this.d);
    }
}
