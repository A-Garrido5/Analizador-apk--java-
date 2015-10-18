// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class e0 extends el
{
    public int b(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 10 == 1 && n % 100 != 11) {
            return 2;
        }
        return 0;
    }
}
