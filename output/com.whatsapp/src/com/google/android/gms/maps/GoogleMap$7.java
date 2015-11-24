// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.internal.zzf$zza;

class GoogleMap$7 extends zzf$zza
{
    final GoogleMap$OnCameraChangeListener zzaBA;
    final GoogleMap zzaBs;
    
    GoogleMap$7(final GoogleMap zzaBs, final GoogleMap$OnCameraChangeListener zzaBA) {
        this.zzaBs = zzaBs;
        this.zzaBA = zzaBA;
    }
    
    public void onCameraChange(final CameraPosition cameraPosition) {
        this.zzaBA.onCameraChange(cameraPosition);
    }
}
