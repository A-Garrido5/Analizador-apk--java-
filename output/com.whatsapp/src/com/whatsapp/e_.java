// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.b6;
import com.whatsapp.protocol.bi;
import java.util.ArrayList;

class e_
{
    final CallsFragment a;
    private final ArrayList b;
    
    public e_(final CallsFragment a) {
        this.a = a;
        this.b = new ArrayList();
    }
    
    public e_(final CallsFragment a, final bi bi) {
        this.a = a;
        (this.b = new ArrayList()).add(bi);
    }
    
    static ArrayList a(final e_ e_) {
        return e_.b;
    }
    
    long a() {
        if (this.f()) {
            return 0L;
        }
        return App.i(this.b.get(0));
    }
    
    public boolean a(final bi bi) {
        final boolean b = this.b(bi);
        if (b) {
            this.b.add(bi);
        }
        return b;
    }
    
    public boolean a(final bi bi, final bi bi2) {
        if (bi.a.a.equals(bi2.a.a) && b6.b(bi.u, bi2.u)) {
            boolean b;
            if (!bi.a.b && bi.D == 0) {
                b = true;
            }
            else {
                b = false;
            }
            boolean b2;
            if (!bi2.a.b && bi2.D == 0) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b == b2;
        }
        return false;
    }
    
    aqd b() {
        if (this.f()) {
            return aqd.UNKNOWN;
        }
        final bi bi = this.b.get(0);
        if (bi.a.b) {
            return aqd.OUTGOING;
        }
        if (bi.D > 0) {
            return aqd.INCOMING;
        }
        return aqd.MISSED;
    }
    
    public boolean b(final bi bi) {
        return this.b.isEmpty() || this.a(bi, this.b.get(-1 + this.b.size()));
    }
    
    int c() {
        return this.b.size();
    }
    
    int d() {
        switch (ww.a[this.b().ordinal()]) {
            default: {
                return 0;
            }
            case 1: {
                return 2130837709;
            }
            case 2: {
                return 2130837707;
            }
            case 3: {
                return 2130837708;
            }
        }
    }
    
    a_9 e() {
        if (this.f()) {
            return null;
        }
        return App.S.e(this.b.get(0).a.a);
    }
    
    boolean f() {
        return this.b.isEmpty();
    }
    
    @Override
    public String toString() {
        if (this.f()) {
            return null;
        }
        return this.e().a((Context)this.a.getActivity());
    }
}
