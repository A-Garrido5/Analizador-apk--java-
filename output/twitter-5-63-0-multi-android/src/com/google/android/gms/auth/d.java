// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import com.google.android.gms.internal.ii;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.e;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.df;
import java.io.IOException;
import android.content.ServiceConnection;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.ap;
import android.os.Bundle;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.ComponentName;

public final class d
{
    public static final String a;
    public static final String b;
    private static final ComponentName c;
    private static final ComponentName d;
    private static final Intent e;
    private static final Intent f;
    
    static {
        String a2;
        if (Build$VERSION.SDK_INT >= 11) {
            a2 = "callerUid";
        }
        else {
            a2 = "callerUid";
        }
        a = a2;
        String b2;
        if (Build$VERSION.SDK_INT >= 14) {
            b2 = "androidPackageName";
        }
        else {
            b2 = "androidPackageName";
        }
        b = b2;
        c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
        e = new Intent().setPackage("com.google.android.gms").setComponent(com.google.android.gms.auth.d.c);
        f = new Intent().setPackage("com.google.android.gms").setComponent(com.google.android.gms.auth.d.d);
    }
    
    public static String a(final Context context, final String s, final String s2) {
        return a(context, s, s2, new Bundle());
    }
    
    public static String a(final Context context, final String s, final String s2, final Bundle bundle) {
        final Context applicationContext = context.getApplicationContext();
        ap.c("Calling this from your main thread can lead to deadlock");
        a(applicationContext);
        if (bundle != null) {
            goto Label_0167;
        }
        final Bundle bundle2 = new Bundle();
        final String packageName = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", packageName);
        if (!bundle2.containsKey(com.google.android.gms.auth.d.b)) {
            bundle2.putString(com.google.android.gms.auth.d.b, packageName);
        }
        final f f = new f();
        if (!applicationContext.bindService(com.google.android.gms.auth.d.e, (ServiceConnection)f, 1)) {
            throw new IOException("Could not bind to service with the given context.");
        }
        try {
            if (df.a(f.a()).a(s, s2, bundle2) == null) {
                Log.w("GoogleAuthUtil", "Binder call returned null.");
                throw new GoogleAuthException("ServiceUnavailable");
            }
            goto Label_0180;
        }
        catch (RemoteException ex) {
            try {
                Log.i("GoogleAuthUtil", "GMS remote exception ", (Throwable)ex);
                throw new IOException("remote exception");
            }
            finally {
                applicationContext.unbindService((ServiceConnection)f);
            }
        }
        catch (InterruptedException ex2) {
            throw new GoogleAuthException("Interrupted");
        }
        final String s3;
        if (a(s3)) {
            throw new IOException(s3);
        }
        throw new GoogleAuthException(s3);
    }
    
    private static void a(final Context context) {
        try {
            com.google.android.gms.common.e.b(context);
        }
        catch (GooglePlayServicesRepairableException ex) {
            throw new GooglePlayServicesAvailabilityException(ex.a(), ex.getMessage(), ex.b());
        }
        catch (GooglePlayServicesNotAvailableException ex2) {
            throw new GoogleAuthException(ex2.getMessage());
        }
    }
    
    private static boolean a(final String s) {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }
    
    private static boolean b(final String s) {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || ii.r.a().equals(s) || ii.s.a().equals(s) || ii.t.a().equals(s) || ii.u.a().equals(s) || ii.v.a().equals(s) || ii.w.a().equals(s);
    }
}
