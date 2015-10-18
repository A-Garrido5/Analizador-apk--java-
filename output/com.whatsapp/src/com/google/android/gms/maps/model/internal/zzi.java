// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import android.os.IInterface;

public interface zzi extends IInterface
{
    String getId();
    
    LatLng getPosition();
    
    int hashCodeRemote();
    
    void hideInfoWindow();
    
    void setPosition(final LatLng p0);
    
    void setVisible(final boolean p0);
    
    void showInfoWindow();
    
    boolean zzh(final zzi p0);
    
    void zzv(final zzd p0);
}
