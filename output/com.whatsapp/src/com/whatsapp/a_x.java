// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

class a_x implements Runnable
{
    final nr a;
    final String b;
    
    a_x(final nr a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        qp.a(App.S.e(this.b), this.a.j.c);
    }
}
