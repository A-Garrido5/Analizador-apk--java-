// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.widget.ImageView;
import java.util.Stack;

class bc
{
    private final Stack a;
    
    private bc() {
        this.a = new Stack();
    }
    
    bc(final c_ c_) {
        this();
    }
    
    static Stack a(final bc bc) {
        return bc.a;
    }
    
    public void a(final ImageView imageView) {
        final boolean l = Log.l;
        int i = 0;
        while (i < this.a.size()) {
            if (((bn)this.a.get(i)).a == imageView) {
                this.a.remove(i);
                if (!l) {
                    continue;
                }
            }
            final int n = i + 1;
            if (l) {
                break;
            }
            i = n;
        }
    }
}
