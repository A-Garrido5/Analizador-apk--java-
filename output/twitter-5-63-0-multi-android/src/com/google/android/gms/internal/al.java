// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.Arrays;

public final class al
{
    public static int a(final Object... array) {
        return Arrays.hashCode(array);
    }
    
    public static an a(final Object o) {
        return new an(o, null);
    }
    
    public static boolean a(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
}
