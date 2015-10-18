// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class D
{
    public static void a(final Q q, final aT at) {
        C.a(q.a, at.d, at.b);
        C.a(q.e, at.a, at.c);
        C.a(q.d, at.c, at.b);
        C.a(q.c, at.d, at.a);
    }
}
