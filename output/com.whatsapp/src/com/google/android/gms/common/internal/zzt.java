// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import java.util.Arrays;

public final class zzt
{
    public static boolean equal(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static int hashCode(final Object[] array) {
        return Arrays.hashCode(array);
    }
    
    public static zzt$zza zzt(final Object o) {
        return new zzt$zza(o, null);
    }
}
