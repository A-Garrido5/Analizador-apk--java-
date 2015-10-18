// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.text.Collator;
import android.content.Context;
import java.util.Comparator;

public class mg implements Comparator
{
    private final Context a;
    
    public mg(final Context a) {
        this.a = a;
    }
    
    private static String a(final Context context, final a_9 a_9) {
        if (a_9 == null) {
            return null;
        }
        if (a_9.r != null && a_9.r.length() > 0) {
            return a_9.r;
        }
        return a_9.a(context);
    }
    
    public int a(final a_9 a_9, final a_9 a_10) {
        final String a = a(this.a, a_9);
        final String a2 = a(this.a, a_10);
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
            if (a_9.u != null || a_10.u != null) {
                if (a_9.u == null) {
                    return 1;
                }
                if (a_10.u == null) {
                    return -1;
                }
                return a_9.u.compareTo(a_10.u);
            }
        }
        return 0;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((a_9)o, (a_9)o2);
    }
}
