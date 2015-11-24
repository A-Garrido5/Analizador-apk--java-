// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;
import java.util.ArrayList;

final class o1 extends oi
{
    @Override
    public void a(final String s) {
        final boolean i = App.I;
        boolean f = true;
        Label_0030: {
            if (App.ak.i(s)) {
                f = z8.f(s);
                if (!i) {
                    break Label_0030;
                }
            }
            z8.g(s);
        }
        if (f) {
            App.A();
            if (!i) {
                return;
            }
        }
        App.d(s);
    }
    
    @Override
    public void a(final String s, final ArrayList list) {
        if (App.x(s)) {
            gj.a(list);
        }
    }
    
    @Override
    public void a(final String s, final boolean b) {
        App.A();
    }
    
    @Override
    public void b(final String s) {
        if (App.ak.i(s)) {
            z8.f(s);
            App.A();
        }
    }
    
    @Override
    public void c(final String s) {
        z8.g(s);
        App.A();
    }
}
