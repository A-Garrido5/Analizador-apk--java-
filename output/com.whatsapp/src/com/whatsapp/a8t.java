// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.facebook.rebound.l;
import com.facebook.rebound.m;
import com.facebook.rebound.r;

class a8t extends r
{
    final ps a;
    int b;
    
    a8t(final ps a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final m m) {
        final float n = (float)l.a(m.e(), 0.0, 1.0, 0.5, 1.0);
        ps.a(this.a).setScaleX(n);
        ps.a(this.a).setScaleY(n);
        if (this.b != 0) {
            final int n2 = (int)l.a(m.e(), 0.0, 1.0, 0.0, this.b);
            int n3 = ps.a(this.a).getWidth() / 4;
            if (App.W) {
                n3 = -n3;
            }
            ps.a(this.a).setTranslationX((float)(n3 + n2));
        }
    }
}
