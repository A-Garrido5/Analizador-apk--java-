// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class an
{
    private final List a;
    private final Object b;
    
    private an(final Object o) {
        this.b = ap.a(o);
        this.a = new ArrayList();
    }
    
    public an a(final String s, final Object o) {
        this.a.add((String)ap.a((Object)s) + "=" + String.valueOf(o));
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            append.append((String)this.a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
