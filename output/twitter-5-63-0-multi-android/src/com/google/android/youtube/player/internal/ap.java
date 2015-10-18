// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.IBinder;
import android.content.Context;

public final class ap extends aq implements e
{
    private final String b;
    private final String c;
    private final String d;
    private boolean e;
    
    public ap(final Context context, final String s, final String s2, final String s3, final az az, final ba ba) {
        super(context, az, ba);
        this.b = (String)com.google.android.youtube.player.internal.c.a((Object)s, "developerKey cannot be null");
        this.c = com.google.android.youtube.player.internal.c.a(s2, "callingPackage cannot be null or empty");
        this.d = com.google.android.youtube.player.internal.c.a(s3, "callingAppVersion cannot be null or empty");
    }
    
    private final void k() {
        this.i();
        if (this.e) {
            throw new IllegalStateException("Connection client has been released");
        }
    }
    
    @Override
    public final IBinder a() {
        this.k();
        try {
            return ((al)this.j()).a();
        }
        catch (RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    @Override
    protected final void a(final ac ac, final av av) {
        ac.a(av, 1000, this.c, this.d, this.b, null);
    }
    
    @Override
    public final void a(final boolean b) {
        if (!this.f()) {
            return;
        }
        while (true) {
            try {
                ((al)this.j()).a(b);
                this.e = true;
            }
            catch (RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    protected final String b() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }
    
    @Override
    protected final String c() {
        return "com.google.android.youtube.api.service.START";
    }
    
    @Override
    public final void d() {
        if (!this.e) {
            this.a(true);
        }
        super.d();
    }
}
