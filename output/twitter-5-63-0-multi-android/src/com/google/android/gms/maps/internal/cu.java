// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Parcelable;
import android.os.Bundle;

public final class cu
{
    public static void a(final Bundle bundle, final String s, final Parcelable parcelable) {
        bundle.setClassLoader(cu.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(cu.class.getClassLoader());
        bundle2.putParcelable(s, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
