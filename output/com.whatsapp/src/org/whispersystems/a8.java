// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public final class a8
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
    
    public static Object a(final Object o, final Object o2) {
        if (o == null) {
            try {
                throw new NullPointerException(String.valueOf(o2));
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return o;
    }
}
