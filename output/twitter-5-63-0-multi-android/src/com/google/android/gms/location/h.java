// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.cd;
import com.google.android.gms.common.api.n;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bp;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

public class h
{
    public static final a a;
    public static d b;
    public static f c;
    private static final com.google.android.gms.common.api.h d;
    private static final com.google.android.gms.common.api.f e;
    
    static {
        d = new com.google.android.gms.common.api.h();
        e = new i();
        a = new a(h.e, h.d, new Scope[0]);
        h.b = new bp();
        h.c = new bt();
    }
    
    public static cd a(final n n) {
        boolean b = true;
        ap.b(n != null && b, (Object)"GoogleApiClient parameter is required.");
        final cd cd = (cd)n.a(h.d);
        if (cd == null) {
            b = false;
        }
        ap.a(b, (Object)"GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return cd;
    }
}
