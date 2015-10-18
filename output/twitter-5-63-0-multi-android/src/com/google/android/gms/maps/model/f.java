// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.ap;
import com.google.android.gms.maps.model.internal.w;

public final class f
{
    private final w a;
    
    public f(final w w) {
        this.a = (w)ap.a(w);
    }
    
    public void a() {
        try {
            this.a.a();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof f)) {
            return false;
        }
        try {
            return this.a.a(((f)o).a);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.a.k();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
