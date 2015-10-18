// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

public final class UiSettings
{
    private final IUiSettingsDelegate zzaCL;
    
    UiSettings(final IUiSettingsDelegate zzaCL) {
        this.zzaCL = zzaCL;
    }
    
    public void setCompassEnabled(final boolean compassEnabled) {
        try {
            this.zzaCL.setCompassEnabled(compassEnabled);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void setMyLocationButtonEnabled(final boolean myLocationButtonEnabled) {
        try {
            this.zzaCL.setMyLocationButtonEnabled(myLocationButtonEnabled);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void setZoomControlsEnabled(final boolean zoomControlsEnabled) {
        try {
            this.zzaCL.setZoomControlsEnabled(zoomControlsEnabled);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
