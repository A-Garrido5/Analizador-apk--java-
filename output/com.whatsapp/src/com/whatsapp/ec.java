// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class ec extends el
{
    public int b(final int n) {
        final int n2 = n % 100;
        if (n == 1) {
            return 2;
        }
        if (n == 0 || (n2 >= 2 && n2 <= 10)) {
            return 8;
        }
        if (n2 >= 11 && n2 <= 19) {
            return 16;
        }
        return 0;
    }
}
