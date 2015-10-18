// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import android.net.Uri;

public class na implements rc
{
    private final Uri a;
    private final mn b;
    
    public na(final Uri a, final mn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a() {
        for (final gm gm : this.b.c()) {
            if (this.a.equals((Object)gm.c)) {
                gm.k = 0;
                this.b.notifyDataSetChanged();
                break;
            }
        }
    }
    
    @Override
    public void a(final int k) {
        for (final gm gm : this.b.c()) {
            if (this.a.equals((Object)gm.c)) {
                gm.k = k;
                this.b.notifyDataSetChanged();
                this.a(gm);
                break;
            }
        }
    }
    
    protected void a(final gm gm) {
    }
}
