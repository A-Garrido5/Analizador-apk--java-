// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class u0
{
    public int a;
    public String b;
    public String c;
    public int d;
    public int e;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final u0 u0 = (u0)o;
            if (this.b != null) {
                return this.b.equals(u0.b);
            }
            if (u0.b != null) {
                return false;
            }
        }
        return true;
    }
}
