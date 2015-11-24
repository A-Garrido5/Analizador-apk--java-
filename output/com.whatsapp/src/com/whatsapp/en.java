// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class en extends el
{
    public int b(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        if (n == 3) {
            return 8;
        }
        if (n == 6) {
            return 16;
        }
        return 0;
    }
}
