// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.ArrayList;

class ah5 implements Runnable
{
    final adq a;
    final ArrayList b;
    
    ah5(final adq a, final ArrayList b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        if (!this.a.isCancelled()) {
            for (final bi bi : this.b) {
                Label_0071: {
                    if (bi.c == 9) {
                        App.b(bi);
                        if (!i) {
                            break Label_0071;
                        }
                    }
                    if (bi.c == 11) {
                        App.d(bi);
                    }
                }
                if (i) {
                    break;
                }
            }
        }
    }
}
