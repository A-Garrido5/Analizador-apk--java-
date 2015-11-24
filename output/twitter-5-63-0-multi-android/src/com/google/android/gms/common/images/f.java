// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.images;

import com.google.android.gms.internal.al;
import android.net.Uri;

final class f
{
    public final Uri a;
    
    public f(final Uri a) {
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof f && (this == o || al.a(((f)o).a, this.a));
    }
    
    @Override
    public int hashCode() {
        return al.a(new Object[] { this.a });
    }
}
