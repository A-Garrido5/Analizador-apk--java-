// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.content.res.Configuration;
import android.content.res.Resources;

public final class zzle
{
    public static boolean zzb(final Resources resources) {
        if (resources != null) {
            boolean b;
            if ((0xF & resources.getConfiguration().screenLayout) > 3) {
                b = true;
            }
            else {
                b = false;
            }
            if ((zzlk.zzoR() && b) || zzc(resources)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean zzc(final Resources resources) {
        final Configuration configuration = resources.getConfiguration();
        final boolean zzoT = zzlk.zzoT();
        boolean b = false;
        if (zzoT) {
            final int n = 0xF & configuration.screenLayout;
            b = false;
            if (n <= 3) {
                final int smallestScreenWidthDp = configuration.smallestScreenWidthDp;
                b = false;
                if (smallestScreenWidthDp >= 600) {
                    b = true;
                }
            }
        }
        return b;
    }
}
