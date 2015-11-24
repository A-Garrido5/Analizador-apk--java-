// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ImageView;
import java.util.Stack;

final class a2r
{
    private final Stack a;
    
    private a2r() {
        this.a = new Stack();
    }
    
    a2r(final a9h a9h) {
        this();
    }
    
    static Stack a(final a2r a2r) {
        return a2r.a;
    }
    
    public void a(final ImageView imageView) {
        final boolean i = App.I;
        int j = 0;
        while (j < this.a.size()) {
            if (((wn)this.a.get(j)).b == imageView) {
                this.a.remove(j);
                if (!i) {
                    continue;
                }
            }
            final int n = j + 1;
            if (i) {
                break;
            }
            j = n;
        }
    }
}
