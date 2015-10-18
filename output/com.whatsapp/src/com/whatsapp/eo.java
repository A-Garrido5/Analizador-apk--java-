// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class eo extends el
{
    public int b(final int n) {
        final int n2 = n % 100;
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        if (n2 >= 3 && n2 <= 10) {
            return 8;
        }
        if (n2 >= 11 && n2 <= 99) {
            return 16;
        }
        return 0;
    }
}
