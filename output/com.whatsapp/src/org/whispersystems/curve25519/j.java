// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class j
{
    public static void a(final aT at, final Q q, final a4 a4) {
        final int[] array = new int[10];
        S.a(at.d, q.e, q.a);
        i.a(at.a, q.e, q.a);
        C.a(at.c, at.d, a4.a);
        C.a(at.a, at.a, a4.c);
        C.a(at.b, a4.b, q.c);
        C.a(at.d, q.d, a4.d);
        S.a(array, at.d, at.d);
        i.a(at.d, at.c, at.a);
        S.a(at.a, at.c, at.a);
        S.a(at.c, array, at.b);
        i.a(at.b, array, at.b);
    }
}
