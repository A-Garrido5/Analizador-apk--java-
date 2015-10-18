// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import android.view.View;
import android.widget.AbsListView;

public class d
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    public d() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = 0;
    }
    
    protected int a() {
        return this.c;
    }
    
    protected void a(final int a) {
        this.a = a;
    }
    
    protected void a(final AbsListView absListView, final int e, final boolean b, final int b2) {
        final View child = absListView.getChildAt(0);
        if (child != null) {
            final int e2 = this.e;
            int c = 0;
            if (e2 != -1) {
                if (this.e < e) {
                    c = -(this.d + this.f) + child.getTop();
                }
                else if (e < this.e) {
                    c = child.getHeight() + child.getTop() - this.f;
                }
                else {
                    c = child.getTop() - this.f;
                }
            }
            this.c = c;
            this.e = e;
            this.f = child.getTop();
            this.d = child.getHeight();
        }
        this.b = b2;
    }
    
    protected int b() {
        return this.e;
    }
    
    protected void b(final int a) {
        this.a = a;
    }
    
    protected int c() {
        return this.f;
    }
    
    protected void d() {
        this.c = 0;
    }
    
    protected int e() {
        return this.a;
    }
    
    protected int f() {
        return this.b;
    }
}
