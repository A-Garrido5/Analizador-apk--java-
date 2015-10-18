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
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.support.v4.app.Fragment;
import com.google.android.gms.dynamic.o;
import com.google.android.gms.dynamic.b;

class ab extends b
{
    protected o a;
    private final Fragment b;
    private Activity c;
    private final List d;
    
    ab(final Fragment b) {
        this.d = new ArrayList();
        this.b = b;
    }
    
    private void a(final Activity c) {
        this.c = c;
        this.g();
    }
    
    @Override
    protected void a(final o a) {
        this.a = a;
        this.g();
    }
    
    public void g() {
        if (this.c == null || this.a == null || this.a() != null) {
            goto Label_0139;
        }
        try {
            s.a((Context)this.c);
            this.a.a(new z(this.b, cv.a((Context)this.c).b(n.a(this.c))));
            final Iterator<t> iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((z)this.a()).a(iterator.next());
            }
            goto Label_0130;
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
        catch (GooglePlayServicesNotAvailableException ex2) {}
    }
}
