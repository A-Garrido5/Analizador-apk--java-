// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class t
{
    public static void a(final aT at, final Q q, final U u) {
        final int[] array = new int[10];
        S.a(at.d, q.e, q.a);
        i.a(at.a, q.e, q.a);
        C.a(at.c, at.d, u.b);
        C.a(at.a, at.a, u.d);
        C.a(at.b, u.c, q.c);
        S.a(array, q.d, q.d);
        i.a(at.d, at.c, at.a);
        S.a(at.a, at.c, at.a);
        i.a(at.c, array, at.b);
        S.a(at.b, array, at.b);
    }
}
