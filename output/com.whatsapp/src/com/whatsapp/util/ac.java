// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import android.content.Context;

public class ac
{
    public static Signature[] a(final Context context) {
        final String packageName = context.getPackageName();
        if (context.getPackageManager() == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
}
