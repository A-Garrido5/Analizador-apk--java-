// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.util.l;
import com.twitter.library.media.model.MediaType;
import java.io.File;

public abstract class z
{
    public final File g;
    public final MediaType h;
    public final long i;
    public String j;
    public String k;
    public ae l;
    
    public z(final File g, final MediaType h) {
        this.g = g;
        this.i = g.lastModified();
        this.h = h;
    }
    
    public boolean a(final z z) {
        return this == z || (this.h.equals(z.h) && com.twitter.util.l.a(this.g, z.g) && this.i == z.i);
    }
    
    abstract String b();
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof z && this.a((z)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (0 + this.g.hashCode()) + (int)this.i;
    }
}
