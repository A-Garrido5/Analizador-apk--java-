// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class ay
{
    public int a;
    public String b;
    
    public ay(final String b, final int a) {
        Label_0039: {
            if (b != null) {
                if (a == 1 || a == 2 || a == 3 || a == 4) {
                    break Label_0039;
                }
            }
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.b = b;
        this.a = a;
    }
}
