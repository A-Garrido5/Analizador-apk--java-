// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.r;
import com.google.android.gms.location.g;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.h;
import android.location.Location;
import com.google.android.gms.common.api.n;
import com.google.android.gms.location.d;

public class bp implements d
{
    @Override
    public Location a(final n n) {
        final cd a = h.a(n);
        try {
            return a.j();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    @Override
    public r a(final n n, final LocationRequest locationRequest, final g g) {
        return n.a(new bq(this, n, locationRequest, g));
    }
    
    @Override
    public r a(final n n, final g g) {
        return n.a(new br(this, n, g));
    }
}
