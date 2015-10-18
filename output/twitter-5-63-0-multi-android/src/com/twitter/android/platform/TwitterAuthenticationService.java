// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class TwitterAuthenticationService extends Service
{
    private d a;
    
    public IBinder onBind(final Intent intent) {
        return this.a.getIBinder();
    }
    
    public void onCreate() {
        super.onCreate();
        this.a = new d((Context)this);
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.a = null;
    }
}
