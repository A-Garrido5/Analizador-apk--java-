// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.location.Location;
import android.util.Log;
import com.google.android.gms.location.g;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.p;
import android.os.Looper;
import android.content.Context;

public class cd extends bm
{
    private final ca e;
    private final bk f;
    private final com.google.android.gms.internal.e g;
    
    public cd(final Context context, final Looper looper, final String s, final p p7, final q q, final String s2, final String s3) {
        this(context, looper, s, p7, q, s2, s3, null);
    }
    
    public cd(final Context context, final Looper looper, final String s, final p p8, final q q, final String s2, final String s3, final String s4) {
        super(context, looper, p8, q, s2);
        this.e = new ca(context, this.d);
        this.f = bk.a(context, s3, s4, this.d);
        this.g = com.google.android.gms.internal.e.a(context, this.d);
    }
    
    public void a(final LocationRequest locationRequest, final g g, final Looper looper) {
        synchronized (this.e) {
            this.e.a(locationRequest, g, looper);
        }
    }
    
    public void a(final g g) {
        this.e.a(g);
    }
    
    @Override
    public void b() {
        synchronized (this.e) {
            Label_0030: {
                if (!this.c()) {
                    break Label_0030;
                }
                try {
                    this.e.b();
                    this.e.c();
                    super.b();
                }
                catch (Exception ex) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", (Throwable)ex);
                }
            }
        }
    }
    
    public Location j() {
        return this.e.a();
    }
}
