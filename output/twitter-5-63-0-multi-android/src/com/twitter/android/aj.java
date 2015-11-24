// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.service.j;
import com.twitter.library.service.h;
import android.os.IBinder;
import android.content.ComponentName;
import com.twitter.library.service.AuthTokenService;
import android.accounts.Account;
import android.content.ServiceConnection;

class aj implements ServiceConnection
{
    private final String a;
    private final String b;
    private final ak c;
    private final Account d;
    private AuthTokenService e;
    
    public aj(final String a, final String b, final ak c, final Account d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        (this.e = ((h)binder).a()).a(this.c, this.a, this.b, this.d.name);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        this.e = null;
    }
}
