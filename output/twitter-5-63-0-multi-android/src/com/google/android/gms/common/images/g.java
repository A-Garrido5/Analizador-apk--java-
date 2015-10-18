// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.images;

import com.google.android.gms.internal.al;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public final class g extends e
{
    private WeakReference e;
    
    @Override
    protected void a(final Drawable drawable, final boolean b, final boolean b2, final boolean b3) {
        if (!b2) {
            final a a = (a)this.e.get();
            if (a != null) {
                a.a(this.a.a, drawable, b3);
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof g)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final g g = (g)o;
        final a a = (a)this.e.get();
        final a a2 = (a)g.e.get();
        return a2 != null && a != null && al.a(a2, a) && al.a(g.a, this.a);
    }
    
    @Override
    public int hashCode() {
        return al.a(new Object[] { this.a });
    }
}
