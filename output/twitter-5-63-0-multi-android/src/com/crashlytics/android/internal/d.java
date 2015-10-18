// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.Context;
import java.io.File;
import android.os.Build$VERSION;

final class d extends bc
{
    private /* synthetic */ c a;
    
    d(final c a) {
        this.a = a;
    }
    
    public final void a() {
        try {
            c.a(this.a);
        }
        catch (Exception ex) {
            cl.a().b().a("Crashlytics", "Problem encountered during Crashlytics initialization.", ex);
        }
    }
}
