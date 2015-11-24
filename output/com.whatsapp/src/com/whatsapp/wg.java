// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class wg
{
    public long a;
    public long b;
    public long c;
    public long d;
    
    public int a() {
        if (this.b > 0L) {
            return 8;
        }
        if (this.c > 0L) {
            return 13;
        }
        if (this.a > 0L) {
            return 5;
        }
        return 4;
    }
    
    public long a(final int n) {
        switch (n) {
            case 5: {
                if (this.a > 0L) {
                    return this.a;
                }
            }
            case 13: {
                if (this.c > 0L) {
                    return this.c;
                }
            }
            case 8: {
                if (this.b > 0L) {
                    return this.b;
                }
                break;
            }
        }
        return 0L;
    }
}
