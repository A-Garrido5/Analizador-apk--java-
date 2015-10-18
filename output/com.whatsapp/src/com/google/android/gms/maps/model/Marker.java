// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzi;

public final class Marker
{
    private final zzi zzaDr;
    
    public Marker(final zzi zzi) {
        this.zzaDr = (zzi)zzu.zzu(zzi);
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (!(o instanceof Marker)) {
                return false;
            }
        }
        catch (RemoteException ex) {
            throw ex;
        }
        try {
            return this.zzaDr.zzh(((Marker)o).zzaDr);
        }
        catch (RemoteException ex2) {
            throw new RuntimeRemoteException(ex2);
        }
    }
    
    public String getId() {
        try {
            return this.zzaDr.getId();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public LatLng getPosition() {
        try {
            return this.zzaDr.getPosition();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.zzaDr.hashCodeRemote();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void hideInfoWindow() {
        try {
            this.zzaDr.hideInfoWindow();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void setIcon(final BitmapDescriptor bitmapDescriptor) {
        try {
            this.zzaDr.zzv(bitmapDescriptor.zzvg());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void setPosition(final LatLng position) {
        try {
            this.zzaDr.setPosition(position);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void setVisible(final boolean visible) {
        try {
            this.zzaDr.setVisible(visible);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void showInfoWindow() {
        try {
            this.zzaDr.showInfoWindow();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
