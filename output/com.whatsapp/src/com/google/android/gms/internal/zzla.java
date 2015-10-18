// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.common.internal.zzd;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

public class zzla
{
    public static boolean zzi(final Context context, final String s) {
        final PackageManager packageManager = context.getPackageManager();
        try {
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, 0);
            try {
                final int n = applicationInfo.flags & 0x200000;
                boolean b = false;
                if (n != 0) {
                    b = true;
                }
                return b;
            }
            catch (PackageManager$NameNotFoundException ex) {
                throw ex;
            }
        }
        catch (PackageManager$NameNotFoundException ex2) {
            return false;
        }
    }
    
    public static boolean zziW() {
        return zzd.zzZR && zzkf.isInitialized() && zzkf.zzmY() == Process.myUid();
    }
}
