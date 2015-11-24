// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class aW
{
    static int[] a;
    
    static {
        aW.a = new int[] { -21827239, -5839606, -30745221, 13898782, 229458, 15978800, -12551817, -6495438, 29715968, 9444199 };
    }
    
    public static void a(final a4 a4, final Q q) {
        S.a(a4.a, q.e, q.a);
        i.a(a4.c, q.e, q.a);
        s.a(a4.d, q.d);
        C.a(a4.b, q.c, aW.a);
    }
}
