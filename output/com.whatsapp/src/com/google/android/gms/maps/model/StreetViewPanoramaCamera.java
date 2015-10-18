// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class StreetViewPanoramaCamera implements SafeParcelable
{
    public static final zzi CREATOR;
    public final float bearing;
    public final float tilt;
    public final float zoom;
    private final int zzCY;
    private StreetViewPanoramaOrientation zzaDE;
    
    static {
        CREATOR = new zzi();
    }
    
    StreetViewPanoramaCamera(final int zzCY, float zoom, final float n, final float n2) {
        zzu.zzb(-90.0f <= n && n <= 90.0f, "Tilt needs to be between -90 and 90 inclusive");
        this.zzCY = zzCY;
        if (zoom <= 0.0) {
            zoom = 0.0f;
        }
        this.zoom = zoom;
        this.tilt = n + 0.0f;
        float n3;
        if (n2 <= 0.0) {
            n3 = 360.0f + n2 % 360.0f;
        }
        else {
            n3 = n2;
        }
        this.bearing = n3 % 360.0f;
        this.zzaDE = new StreetViewPanoramaOrientation$Builder().tilt(n).bearing(n2).build();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof StreetViewPanoramaCamera)) {
                return false;
            }
            final StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera)o;
            if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(streetViewPanoramaCamera.zoom) || Float.floatToIntBits(this.tilt) != Float.floatToIntBits(streetViewPanoramaCamera.tilt) || Float.floatToIntBits(this.bearing) != Float.floatToIntBits(streetViewPanoramaCamera.bearing)) {
                return false;
            }
        }
        return true;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[] { this.zoom, this.tilt, this.bearing });
    }
    
    @Override
    public String toString() {
        return zzt.zzt(this).zzg("zoom", this.zoom).zzg("tilt", this.tilt).zzg("bearing", this.bearing).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzi.zza(this, parcel, n);
    }
}
