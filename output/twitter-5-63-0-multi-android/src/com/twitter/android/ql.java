// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;

public class ql
{
    final /* synthetic */ ScrollingHeaderActivity a;
    private boolean b;
    private boolean c;
    
    protected ql(final ScrollingHeaderActivity a) {
        this.a = a;
    }
    
    private void a(final int n) {
        if (n + this.a.j() <= 0) {
            this.b(true);
        }
        else {
            this.b();
        }
        if (n + this.a.i() <= 0) {
            this.a(true);
            return;
        }
        this.c();
    }
    
    private void b(final boolean b) {
        if (!this.b) {
            final String b2 = this.a.b();
            if (!TextUtils.isEmpty((CharSequence)b2)) {
                this.a.M().a(b2, b);
                this.a.M().invalidate();
                this.b = true;
            }
        }
    }
    
    protected void a() {
        if (this.c) {
            this.c();
            this.a(false);
        }
    }
    
    public void a(final boolean b) {
        if (!this.c) {
            final String k_ = this.a.K_();
            if (!TextUtils.isEmpty((CharSequence)k_)) {
                this.a.a(k_, b);
                this.a.M().invalidate();
                this.c = true;
            }
        }
    }
    
    public void b() {
        this.a.M().a("", true);
        this.a.M().invalidate();
        this.b = false;
    }
    
    public void c() {
        this.a.a(null, true);
        this.a.M().invalidate();
        this.c = false;
    }
}
