// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.location.Location;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.MarkerOptions;
import android.os.IInterface;

public interface IGoogleMapDelegate extends IInterface
{
    zzi addMarker(final MarkerOptions p0);
    
    void animateCamera(final zzd p0);
    
    void clear();
    
    CameraPosition getCameraPosition();
    
    Location getMyLocation();
    
    IProjectionDelegate getProjection();
    
    IUiSettingsDelegate getUiSettings();
    
    boolean isTrafficEnabled();
    
    void moveCamera(final zzd p0);
    
    boolean setIndoorEnabled(final boolean p0);
    
    void setMapType(final int p0);
    
    void setMyLocationEnabled(final boolean p0);
    
    void setOnCameraChangeListener(final zzf p0);
    
    void setOnInfoWindowClickListener(final zzh p0);
    
    void setOnMapClickListener(final zzj p0);
    
    void setOnMarkerClickListener(final zzn p0);
    
    void setPadding(final int p0, final int p1, final int p2, final int p3);
    
    void setTrafficEnabled(final boolean p0);
    
    void stopAnimation();
}
