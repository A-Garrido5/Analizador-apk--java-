// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class zzt$zza
{
    private final Object zzGE;
    private final List zzabb;
    
    private zzt$zza(final Object o) {
        this.zzGE = zzu.zzu(o);
        this.zzabb = new ArrayList();
    }
    
    zzt$zza(final Object o, final zzt$1 zzt$1) {
        this(o);
    }
    
    @Override
    public String toString() {
        final boolean a = zzi.a;
        final StringBuilder append = new StringBuilder(100).append(this.zzGE.getClass().getSimpleName()).append('{');
        int n;
        for (int size = this.zzabb.size(), i = 0; i < size; i = n) {
            append.append((String)this.zzabb.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
            n = i + 1;
            if (a) {
                break;
            }
        }
        return append.append('}').toString();
    }
    
    public zzt$zza zzg(final String s, final Object o) {
        this.zzabb.add((String)zzu.zzu(s) + "=" + String.valueOf(o));
        return this;
    }
}
