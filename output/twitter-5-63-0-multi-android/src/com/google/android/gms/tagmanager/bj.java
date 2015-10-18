// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;

class bj implements b
{
    private a a;
    private a b;
    private Status c;
    private bl d;
    private bk e;
    private boolean f;
    private l g;
    
    @Override
    public void a() {
        synchronized (this) {
            if (this.f) {
                z.a("Releasing a released ContainerHolder.");
            }
            else {
                this.f = true;
                this.g.a(this);
                this.a.b();
                this.a = null;
                this.b = null;
                this.e = null;
                this.d = null;
            }
        }
    }
    
    public void a(final String s) {
        synchronized (this) {
            if (!this.f) {
                this.a.a(s);
            }
        }
    }
    
    @Override
    public Status b() {
        return this.c;
    }
    
    void b(final String s) {
        if (this.f) {
            z.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        }
        this.e.a(s);
    }
    
    public void c() {
        synchronized (this) {
            if (this.f) {
                z.a("Refreshing a released ContainerHolder.");
            }
            else {
                this.e.a();
            }
        }
    }
    
    String d() {
        if (this.f) {
            z.a("getContainerId called on a released ContainerHolder.");
            return "";
        }
        return this.a.a();
    }
    
    String e() {
        if (this.f) {
            z.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        }
        return this.e.b();
    }
}
