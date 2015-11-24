// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.bm;
import android.widget.Button;

class b1 implements Runnable
{
    final RegisterName a;
    
    b1(final RegisterName a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (RegisterName.i(this.a) != null) {
            ((Button)RegisterName.i(this.a).findViewById(2131755286)).setText(2131231372);
        }
        if (RegisterName.b(this.a) != null) {
            RegisterName.b(this.a).setVisibility(4);
        }
        bm.a(new f_(this));
    }
}
