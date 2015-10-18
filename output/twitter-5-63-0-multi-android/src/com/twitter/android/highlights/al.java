// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.database.Cursor;

public abstract class al extends af
{
    public final String q;
    public final String r;
    protected final Cursor s;
    
    public al(final String s, final long n, final mx mx, final boolean b, final String s2, final String s3, final String q, final String r, final Cursor s4) {
        super(s, n, 8, mx, b, s2, s3);
        this.q = q;
        this.r = r;
        this.s = s4;
    }
}
