// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.Collection;
import com.google.android.gms.internal.c;
import java.util.Map;
import java.util.Set;

abstract class t
{
    private final Set a;
    
    public abstract c a(final Map p0);
    
    public abstract boolean a();
    
    boolean a(final Set set) {
        return set.containsAll(this.a);
    }
    
    public Set b() {
        return this.a;
    }
}
