// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import com.google.android.gms.internal.al;
import android.content.Intent;
import android.app.Activity;
import android.app.PendingIntent;

public final class a
{
    public static final a a;
    private final PendingIntent b;
    private final int c;
    
    static {
        a = new a(0, null);
    }
    
    public a(final int c, final PendingIntent b) {
        this.c = c;
        this.b = b;
    }
    
    private String e() {
        switch (this.c) {
            default: {
                return "unknown status code " + this.c;
            }
            case 0: {
                return "SUCCESS";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 13: {
                return "CANCELED";
            }
            case 14: {
                return "TIMEOUT";
            }
            case 15: {
                return "INTERRUPTED";
            }
        }
    }
    
    public void a(final Activity activity, final int n) {
        if (!this.a()) {
            return;
        }
        activity.startIntentSenderForResult(this.b.getIntentSender(), n, (Intent)null, 0, 0, 0);
    }
    
    public boolean a() {
        return this.c != 0 && this.b != null;
    }
    
    public boolean b() {
        return this.c == 0;
    }
    
    public int c() {
        return this.c;
    }
    
    public PendingIntent d() {
        return this.b;
    }
    
    @Override
    public String toString() {
        return al.a(this).a("statusCode", this.e()).a("resolution", this.b).toString();
    }
}
