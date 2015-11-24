// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Iterator;
import android.view.View;
import android.support.v4.view.ViewCompat;

public class av
{
    private int a;
    private long b;
    private final ap c;
    private final ax d;
    
    public av(final ap c) {
        this.a = 8;
        this.b = 0L;
        this.d = new ax(this, null);
        this.c = c;
    }
    
    public void a() {
        Object e;
        if (this.c.d() == null) {
            e = null;
        }
        else {
            e = this.c.d().e();
        }
        if (e != null) {
            ((View)e).removeCallbacks((Runnable)this.d);
            ViewCompat.postOnAnimation((View)e, this.d);
        }
    }
    
    boolean a(final float n) {
        final Iterator<e> iterator = (Iterator<e>)this.c.f().iterator();
        boolean b = true;
    Label_0135_Outer:
        while (iterator.hasNext()) {
            final e e = iterator.next();
            final AnimatableParams a = e.a();
            while (true) {
                Label_0149: {
                    if (!a.n()) {
                        break Label_0149;
                    }
                    a.a(n);
                    a.x = (int)a.b().x;
                    a.y = (int)a.b().y;
                    e.b();
                    boolean b2;
                    if (a.h()) {
                        e.c();
                        a.l().run();
                        a.m();
                        if (!a.n()) {
                            break Label_0149;
                        }
                        b2 = false;
                    }
                    else {
                        b2 = false;
                    }
                    b = b2;
                    continue Label_0135_Outer;
                }
                boolean b2 = b;
                continue;
            }
        }
        return b;
    }
    
    public boolean b() {
        int n = 33;
        final int max = Math.max(1, this.a / 4);
        int n2;
        if (this.b == 0L) {
            this.b = System.currentTimeMillis() - max;
            n2 = max;
        }
        else {
            n2 = (int)(System.currentTimeMillis() - this.b);
        }
        if (n2 < max) {
            return false;
        }
        if (n2 <= n) {
            n = n2;
        }
        final boolean a = this.a(n);
        this.b += n;
        return a;
    }
    
    public void c() {
        this.b = 0L;
    }
}
