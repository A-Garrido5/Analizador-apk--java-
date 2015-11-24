// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class i0 extends Handler
{
    final RegisterName a;
    
    i0(final RegisterName a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        if (RegisterName.k() != null && x1.b(RegisterName.k())) {
            if (x1.c(RegisterName.k())) {
                if (RegisterName.l(this.a) == null) {
                    return;
                }
                RegisterName.l(this.a).a(1);
                if (!i) {
                    return;
                }
            }
            this.a.removeDialog(0);
            Label_0105: {
                switch (x1.a(RegisterName.k())) {
                    case 1: {
                        this.a.showDialog(1);
                        if (i) {
                            break Label_0105;
                        }
                        break;
                    }
                    case 3: {
                        this.a.showDialog(109);
                    }
                }
            }
        }
    }
}
