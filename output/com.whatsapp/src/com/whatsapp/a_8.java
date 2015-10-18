// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.EnumSet;

final class a_8 implements Runnable
{
    final boolean a;
    final f8 b;
    final EnumSet c;
    final boolean d;
    final boolean e;
    final String f;
    final boolean g;
    
    a_8(final boolean d, final String f, final boolean a, final boolean e, final boolean g, final f8 b, final EnumSet c) {
        this.d = d;
        this.f = f;
        this.a = a;
        this.e = e;
        this.g = g;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        Label_0048: {
            if (!this.d) {
                break Label_0048;
            }
            synchronized (App.aK()) {
                App.b(this.f, this.a, this.e, this.g, this.b, this.c);
                // monitorexit(App.aK())
                if (App.I) {
                    App.b(this.f, this.a, this.e, this.g, this.b, this.c);
                }
            }
        }
    }
}
