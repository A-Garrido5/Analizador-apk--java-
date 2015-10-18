// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class ee extends el
{
    public int b(final int n) {
        final int n2 = n % 100;
        if (n == 1) {
            return 2;
        }
        if (n == 0 || (n2 >= 1 && n2 <= 19)) {
            return 8;
        }
        return 0;
    }
}
