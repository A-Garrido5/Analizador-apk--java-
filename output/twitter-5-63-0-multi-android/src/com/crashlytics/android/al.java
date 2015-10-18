// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.cl;
import android.util.Log;
import com.crashlytics.android.internal.bd;

final class al
{
    private String a;
    private boolean b;
    
    public al(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final String s, final String s2) {
        if (bd.e(this.a) && this.b) {
            Log.e("Crashlytics", ".");
            Log.e("Crashlytics", ".     |  | ");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".   \\ |  | /");
            Log.e("Crashlytics", ".    \\    /");
            Log.e("Crashlytics", ".     \\  /");
            Log.e("Crashlytics", ".      \\/");
            Log.e("Crashlytics", ".");
            Log.e("Crashlytics", "This app relies on Crashlytics. Configure your build environment here: ");
            Log.e("Crashlytics", String.format("https://crashlytics.com/register/%s/android/%s", s, s2));
            Log.e("Crashlytics", ".");
            Log.e("Crashlytics", ".      /\\");
            Log.e("Crashlytics", ".     /  \\");
            Log.e("Crashlytics", ".    /    \\");
            Log.e("Crashlytics", ".   / |  | \\");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".");
            throw new CrashlyticsMissingDependencyException(s, s2);
        }
        if (!this.b) {
            cl.a().b().a("Crashlytics", "Configured not to require a build ID.");
        }
    }
}
