// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import java.util.Iterator;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.u;
import java.util.LinkedList;
import com.twitter.internal.android.service.y;

public final class l extends y
{
    private final LinkedList a;
    private long b;
    
    public l() {
        this.a = new LinkedList();
    }
    
    public l a(final y y) {
        this.a.add(y);
        return this;
    }
    
    @Override
    public boolean a(final u u, final x x) {
        for (final y y : this.a) {
            if (y.a(u, x)) {
                this.b = y.b(x);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean a(final x x) {
        for (final y y : this.a) {
            if (y.a(x)) {
                this.b = y.b(x);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public long b(final x x) {
        return this.b;
    }
}
