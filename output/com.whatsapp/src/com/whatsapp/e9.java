// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class e9 extends el
{
    public int b(final int n) {
        boolean h = true;
        final int a = el.a;
        final int n2 = n % 100;
        final int n3 = n % 10;
        int n4;
        if (n3 == (h ? 1 : 0) && n2 != 11) {
            n4 = 2;
        }
        else {
            if (n3 >= 2 && n3 <= 4 && (n2 < 12 || n2 > 14)) {
                return 8;
            }
            if (n3 == 0 || (n3 >= 5 && n3 <= 9) || (n2 >= 11 && n2 <= 14)) {
                return 16;
            }
            n4 = 0;
            if (a != 0) {
                if (DialogToastActivity.h) {
                    h = false;
                }
                DialogToastActivity.h = h;
                return 0;
            }
        }
        return n4;
    }
}
