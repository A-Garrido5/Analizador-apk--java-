// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.internal.ac;

public final class af
{
    private final ac a;
    
    af(final ac a) {
        this.a = a;
    }
    
    public void a(final boolean b) {
        try {
            this.a.a(b);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void b(final boolean b) {
        try {
            this.a.b(b);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void c(final boolean b) {
        try {
            this.a.c(b);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void d(final boolean b) {
        try {
            this.a.g(b);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
