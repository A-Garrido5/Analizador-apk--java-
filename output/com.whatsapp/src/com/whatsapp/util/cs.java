// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import android.widget.ImageView;
import java.util.Stack;

class cs
{
    private Stack a;
    final b b;
    
    cs(final b b) {
        this.b = b;
        this.a = new Stack();
    }
    
    static Stack a(final cs cs) {
        return cs.a;
    }
    
    public void a(final ImageView imageView) {
        final boolean l = Log.l;
        int i = 0;
        while (i < this.a.size()) {
            if (((as)this.a.get(i)).a == imageView) {
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
    
    public boolean a(final bi bi) {
        final boolean l = Log.l;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().d.a.equals(bi.a)) {
                return true;
            }
            if (l) {
                break;
            }
        }
        return false;
    }
}
