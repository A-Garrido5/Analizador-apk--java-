// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class J
{
    public static Object a(final Object o) {
        if (o == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return o;
    }
    
    public static void a(final boolean b) {
        if (!b) {
            try {
                throw new IllegalArgumentException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
    }
}
