// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.util.Log;

public class i
{
    static void a(final u u) {
        if (!(u instanceof t)) {
            return;
        }
        try {
            ((t)u).a();
        }
        catch (RuntimeException ex) {
            Log.w("GoogleApi", "Unable to release " + u, (Throwable)ex);
        }
    }
}
