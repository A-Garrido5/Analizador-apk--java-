// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class ea extends el
{
    public int b(final int n) {
        int n2 = 2;
        if (n == 0) {
            n2 = 1;
        }
        else if (n <= 0 || n >= n2) {
            return 0;
        }
        return n2;
    }
}
