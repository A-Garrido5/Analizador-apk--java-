// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import de.greenrobot.event.m;
import android.net.NetworkInfo;

public final class vp
{
    private final long a;
    private final int b;
    private final boolean c;
    private final boolean d;
    
    public vp(final boolean d, final boolean c, final int b, final long a) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static vp a(final NetworkInfo networkInfo) {
        final long a = ((i_)m.b().a(i_.class)).a();
        if (networkInfo != null) {
            return new vp(networkInfo.isConnected(), networkInfo.isRoaming(), networkInfo.getType(), a);
        }
        return new vp(false, false, -1, a);
    }
    
    public boolean a() {
        return this.c;
    }
    
    public long b() {
        return this.a;
    }
    
    public boolean c() {
        return this.d;
    }
    
    public int d() {
        return this.b;
    }
}
