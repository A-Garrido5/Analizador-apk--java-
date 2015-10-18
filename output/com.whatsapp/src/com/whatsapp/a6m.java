// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import java.text.Collator;
import android.content.Context;
import java.util.Comparator;

public class a6m implements Comparator
{
    private final Context a;
    
    public a6m(final Context a) {
        this.a = a;
    }
    
    public int a(final a_9 a_9, final a_9 a_10) {
        bi c;
        if (App.ak.i(a_9.u)) {
            c = App.ak.C(a_9.u);
        }
        else {
            c = null;
        }
        final boolean i = App.ak.i(a_10.u);
        bi c2 = null;
        if (i) {
            c2 = App.ak.C(a_10.u);
        }
        if (c == null && c2 == null) {
            final Collator instance = Collator.getInstance();
            instance.setStrength(0);
            instance.setDecomposition(1);
            return instance.compare(a_9.a(this.a), a_10.a(this.a));
        }
        if (c == null) {
            return 1;
        }
        if (c2 == null) {
            return -1;
        }
        if (c.u == c2.u) {
            return a_9.a(this.a).compareTo(a_10.a(this.a));
        }
        if (c.u < c2.u) {
            return 1;
        }
        return -1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((a_9)o, (a_9)o2);
    }
}
