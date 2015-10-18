// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.Locale;
import android.text.TextUtils;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

enum ad
{
    a("X86_32", 0), 
    b("X86_64", 1), 
    c("ARM_UNKNOWN", 2), 
    d("PPC", 3), 
    e("PPC64", 4), 
    f("ARMV6", 5), 
    g("ARMV7", 6), 
    h("UNKNOWN", 7), 
    i("ARMV7S", 8), 
    j("ARM64", 9);
    
    private static final Map k;
    
    static {
        (k = new HashMap(4)).put("armeabi-v7a", ad.g);
        ad.k.put("armeabi", ad.f);
        ad.k.put("x86", ad.a);
    }
    
    private ad(final String s, final int n) {
    }
    
    static ad a() {
        final String cpu_ABI = Build.CPU_ABI;
        ad h;
        if (TextUtils.isEmpty((CharSequence)cpu_ABI)) {
            cl.a().b().a("Crashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
            h = ad.h;
        }
        else {
            h = ad.k.get(cpu_ABI.toLowerCase(Locale.US));
            if (h == null) {
                return ad.h;
            }
        }
        return h;
    }
}
