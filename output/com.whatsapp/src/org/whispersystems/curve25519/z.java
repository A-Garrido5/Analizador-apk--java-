// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class z
{
    public static void a(final aT at, final g g) {
        final int[] array = new int[10];
        A.a(at.d, g.c);
        A.a(at.c, g.a);
        aS.a(at.b, g.b);
        S.a(at.a, g.c, g.a);
        A.a(array, at.a);
        S.a(at.a, at.c, at.d);
        i.a(at.c, at.c, at.d);
        i.a(at.d, array, at.a);
        i.a(at.b, at.b, at.c);
    }
}
