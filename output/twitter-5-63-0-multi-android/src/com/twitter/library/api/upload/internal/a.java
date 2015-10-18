// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.library.api.upload.p;
import com.twitter.library.media.model.MediaFile;
import com.twitter.util.n;
import com.twitter.library.service.ab;
import android.content.Context;

public abstract class a
{
    protected final Context a;
    protected final ab b;
    protected final n c;
    private final com.twitter.library.api.upload.n d;
    
    public a(final Context a, final ab b, final com.twitter.library.api.upload.n d, final n c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public abstract void a();
    
    protected void a(final int n, final int n2) {
        if (this.c != null) {
            final String string = Integer.toString(this.hashCode());
            nz nz;
            if (n >= n2) {
                nz = nz.b(string, 3);
            }
            else {
                nz = nz.a(string, 3, n * 10000 / n2);
            }
            this.c.a(nz);
        }
    }
    
    protected final void a(final MediaFile mediaFile, final int n, final Exception ex) {
        this.b(new p(mediaFile, n, ex));
    }
    
    protected void b(final p p) {
        this.d.a(p);
    }
}
