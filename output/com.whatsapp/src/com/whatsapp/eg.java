// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class eg extends el
{
    public int b(final int n) {
        final int n2 = n % 100;
        if (n2 == 1) {
            return 2;
        }
        if (n2 == 2) {
            return 4;
        }
        if (n2 >= 3 && n2 <= 4) {
            return 8;
        }
        return 0;
    }
}
