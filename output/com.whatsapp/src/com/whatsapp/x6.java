// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import java.util.Comparator;

public class x6 implements Comparator
{
    private final Context a;
    
    public x6(final Context a) {
        this.a = a;
    }
    
    public int a(final a_9 a_9, final a_9 a_10) {
        if (!App.S.f(a_9.u)) {
            if (App.S.f(a_10.u)) {
                return -1;
            }
            final String a = a_9.a(this.a);
            final String a2 = a_10.a(this.a);
            final boolean b = a.length() > 0 && Character.isLetter(a.charAt(0)) && true;
            final int length = a2.length();
            boolean b2 = false;
            if (length > 0) {
                final boolean letter = Character.isLetter(a2.charAt(0));
                b2 = false;
                if (letter) {
                    b2 = true;
                }
            }
            if (b == b2) {
                return a.compareToIgnoreCase(a2);
            }
            if (b) {
                return -1;
            }
        }
        return 1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((a_9)o, (a_9)o2);
    }
}
