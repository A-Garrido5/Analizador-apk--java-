// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import java.util.Comparator;

public class y_ implements Comparator
{
    private final Context a;
    
    public y_(final Context a) {
        this.a = a;
    }
    
    public int a(final a_9 a_9, final a_9 a_10) {
        int compareToIgnoreCase = 1;
        final String a = a_9.a(this.a);
        final String a2 = a_10.a(this.a);
        int n;
        if (a.length() > 0 && Character.isLetter(a.charAt(0))) {
            n = compareToIgnoreCase;
        }
        else {
            n = 0;
        }
        final int length = a2.length();
        int n2 = 0;
        if (length > 0) {
            final boolean letter = Character.isLetter(a2.charAt(0));
            n2 = 0;
            if (letter) {
                n2 = compareToIgnoreCase;
            }
        }
        if (n == n2) {
            compareToIgnoreCase = a.compareToIgnoreCase(a2);
        }
        else if (n != 0) {
            return -1;
        }
        return compareToIgnoreCase;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((a_9)o, (a_9)o2);
    }
}
