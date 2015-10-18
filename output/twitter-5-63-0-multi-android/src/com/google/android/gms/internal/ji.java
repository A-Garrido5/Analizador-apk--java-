// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class ji implements SafeParcelable
{
    private static final Object a;
    private static ClassLoader b;
    private static Integer c;
    private boolean d;
    
    static {
        a = new Object();
        ji.b = null;
        ji.c = null;
    }
    
    public ji() {
        this.d = false;
    }
}
