// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import java.text.Collator;
import android.text.TextUtils;
import java.util.Comparator;

public class g implements Comparator
{
    private String a(final o o) {
        if (o == null) {
            return null;
        }
        if (TextUtils.isEmpty((CharSequence)o.a())) {
            return o.c();
        }
        return o.a();
    }
    
    public int a(final o o, final o o2) {
        final String a = this.a(o);
        final String a2 = this.a(o2);
        if (a != null || a2 != null) {
            if (a == null) {
                return 1;
            }
            if (a2 == null) {
                return -1;
            }
            final Collator instance = Collator.getInstance();
            instance.setStrength(0);
            instance.setDecomposition(1);
            final int compare = instance.compare(a, a2);
            if (compare != 0) {
                return compare;
            }
            if (o.e() != null || o2.e() != null) {
                if (o.e() == null) {
                    return 1;
                }
                if (o2.e() == null) {
                    return -1;
                }
                return o.e().compareTo(o2.e());
            }
        }
        return 0;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((o)o, (o)o2);
    }
}
