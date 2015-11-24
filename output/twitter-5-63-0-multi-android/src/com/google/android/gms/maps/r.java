// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import java.util.Iterator;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.maps.internal.cv;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.o;
import com.google.android.gms.dynamic.b;

class r extends b
{
    protected o a;
    private final ViewGroup b;
    private final Context c;
    private final GoogleMapOptions d;
    private final List e;
    
    r(final ViewGroup b, final Context c, final GoogleMapOptions d) {
        this.e = new ArrayList();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    protected void a(final o a) {
        this.a = a;
        this.g();
    }
    
    public void a(final t t) {
        if (this.a() != null) {
            ((p)this.a()).a(t);
            return;
        }
        this.e.add(t);
    }
    
    public void g() {
        if (this.a == null || this.a() != null) {
            goto Label_0126;
        }
        try {
            this.a.a(new p(this.b, cv.a(this.c).a(n.a(this.c), this.d)));
            final Iterator<t> iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((p)this.a()).a(iterator.next());
            }
            goto Label_0117;
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
        catch (GooglePlayServicesNotAvailableException ex2) {}
    }
}
