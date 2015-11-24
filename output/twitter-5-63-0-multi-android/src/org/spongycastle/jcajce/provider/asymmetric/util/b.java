// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.asymmetric.util;

import org.spongycastle.asn1.d;

public class b
{
    public static byte[] a(final zi zi) {
        try {
            return zi.a("DER");
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static byte[] a(final zm zm, final d d) {
        try {
            return a(new zo(zm, d));
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static byte[] a(final zo zo) {
        try {
            return zo.a("DER");
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static byte[] b(final zm zm, final d d) {
        try {
            return a(new zi(zm, d.a()));
        }
        catch (Exception ex) {
            return null;
        }
    }
}
