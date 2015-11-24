// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class bm
{
    public final String a;
    public final String b;
    
    public bm(final String a, final String b) {
        Label_0023: {
            if (b != null) {
                if (a != null) {
                    break Label_0023;
                }
            }
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.a = a;
        this.b = b;
    }
}
