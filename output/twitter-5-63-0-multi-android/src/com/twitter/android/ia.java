// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;

public class ia
{
    private final FragmentActivity a;
    private final FragmentManager b;
    private final hz[] c;
    private final int d;
    private hz e;
    private int f;
    
    public ia(final FragmentActivity a, final int d, final hz[] c) {
        this.a = a;
        this.b = a.getSupportFragmentManager();
        this.d = d;
        this.c = c;
    }
    
    private void a(final hz e) {
        final FragmentManager b = this.b;
        final FragmentTransaction beginTransaction = b.beginTransaction();
        Fragment fragment;
        if (this.e == null) {
            fragment = b.findFragmentById(this.d);
        }
        else {
            fragment = this.e.a(this.a);
        }
        final Fragment a = e.a(this.a);
        if (fragment != a) {
            if (fragment != null && !fragment.isDetached()) {
                beginTransaction.detach(fragment);
            }
            if (a.isDetached()) {
                beginTransaction.attach(a);
            }
            else {
                beginTransaction.add(this.d, a, e.c);
            }
            beginTransaction.setTransition(4099);
            beginTransaction.commitAllowingStateLoss();
            b.executePendingTransactions();
        }
        e.d = true;
        this.e = e;
        ((td)a).ac_();
    }
    
    public String a() {
        if (this.e == null) {
            return null;
        }
        return this.e.c;
    }
    
    public boolean a(final int f) {
        final hz hz = this.c[f];
        if (hz == this.e) {
            return false;
        }
        this.a(hz);
        this.f = f;
        return true;
    }
    
    public boolean a(final String s) {
        if (this.e == null || !s.equals(this.e.c)) {
            final hz[] c = this.c;
            final int length = c.length;
            int i = 0;
            int f = 0;
            while (i < length) {
                final hz hz = c[i];
                if (s.equals(hz.c)) {
                    this.a(hz);
                    this.f = f;
                    return true;
                }
                ++f;
                ++i;
            }
        }
        return false;
    }
}
