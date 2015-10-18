// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import android.os.Process;
import java.util.Iterator;
import java.util.Set;

class k extends q
{
    private final u a;
    private final Set b;
    
    public k(final u a, final Set b) {
        super(0);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final Iterator<s> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            final i a = iterator.next().b;
            if (a != null) {
                final a b = a.e;
                final x c = a.i;
                if (b == null || !b.a(this.a, c)) {
                    continue;
                }
                b.k();
            }
        }
    }
}
