// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.a5;
import android.content.Context;

class a_f implements Runnable
{
    final App a;
    final Context b;
    
    a_f(final App a, final Context b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        a5.d(this.b);
    }
}
