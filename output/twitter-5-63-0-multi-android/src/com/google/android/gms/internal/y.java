// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Message;
import android.os.Handler;
import java.util.HashMap;
import android.content.Context;
import android.os.Handler$Callback;
import android.content.ServiceConnection;
import android.content.Intent;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

final class y
{
    final /* synthetic */ x a;
    private final String b;
    private final z c;
    private final HashSet d;
    private int e;
    private boolean f;
    private IBinder g;
    private ComponentName h;
    
    public y(final x a, final String b) {
        this.a = a;
        this.b = b;
        this.c = new z(this);
        this.d = new HashSet();
        this.e = 2;
    }
    
    public void a() {
        this.f = this.a.c.bindService(new Intent(this.b).setPackage("com.google.android.gms"), (ServiceConnection)this.c, 129);
        if (this.f) {
            this.e = 3;
            return;
        }
        this.a.c.unbindService((ServiceConnection)this.c);
    }
    
    public void a(final s s) {
        this.d.add(s);
    }
    
    public void b() {
        this.a.c.unbindService((ServiceConnection)this.c);
        this.f = false;
        this.e = 2;
    }
    
    public void b(final s s) {
        this.d.remove(s);
    }
    
    public String c() {
        return this.b;
    }
    
    public boolean c(final s s) {
        return this.d.contains(s);
    }
    
    public boolean d() {
        return this.f;
    }
    
    public int e() {
        return this.e;
    }
    
    public boolean f() {
        return this.d.isEmpty();
    }
    
    public IBinder g() {
        return this.g;
    }
    
    public ComponentName h() {
        return this.h;
    }
}
