// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class ej extends el
{
    public int b(final int n) {
        final int n2 = n % 100;
        final int n3 = n % 10;
        if (n == 1) {
            return 2;
        }
        if (n3 >= 2 && n3 <= 4 && (n2 < 12 || n2 > 14) && (n2 < 22 || n2 > 24)) {
            return 8;
        }
        return 0;
    }
}
