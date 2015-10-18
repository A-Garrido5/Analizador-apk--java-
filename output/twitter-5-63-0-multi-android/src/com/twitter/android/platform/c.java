// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import com.twitter.android.util.AppEventTrack;
import android.content.Context;
import android.os.AsyncTask;

class c extends AsyncTask
{
    private final Context a;
    
    public c(final Context a) {
        this.a = a;
    }
    
    protected Void a(final String... array) {
        InstallReferralReceiver.a(this.a, array[0]);
        AppEventTrack.b(this.a, "com.android.vending.INSTALL_REFERRER");
        return null;
    }
}
