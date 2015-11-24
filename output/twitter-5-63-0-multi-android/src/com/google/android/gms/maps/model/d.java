// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.ap;
import com.google.android.gms.maps.model.internal.m;

public final class d
{
    private final m a;
    
    public d(final m m) {
        this.a = (m)ap.a(m);
    }
    
    public void a() {
        try {
            this.a.a();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void a(final double n) {
        try {
            this.a.a(n);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof d)) {
            return false;
        }
        try {
            return this.a.a(((d)o).a);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.a.j();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
