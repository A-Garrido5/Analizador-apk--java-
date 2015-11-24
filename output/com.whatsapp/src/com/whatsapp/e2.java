// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class e2 extends el
{
    public int b(final int n) {
        int n2 = 2;
        final int a = el.a;
        final int n3 = n % 100;
        final int n4 = n % 10;
        if (n4 != 1 || (n3 >= 11 && n3 <= 19)) {
            if (n4 >= n2 && n4 <= 9 && (n3 < 11 || n3 > 19)) {
                return 8;
            }
            final boolean h = DialogToastActivity.h;
            n2 = 0;
            if (h) {
                el.a = a + 1;
                return 0;
            }
        }
        return n2;
    }
}
