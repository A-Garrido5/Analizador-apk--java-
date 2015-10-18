// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class StreetViewPanoramaOrientation implements SafeParcelable
{
    public static final zzl CREATOR;
    public final float bearing;
    public final float tilt;
    private final int zzCY;
    
    static {
        CREATOR = new zzl();
    }
    
    public StreetViewPanoramaOrientation(final float n, final float n2) {
        this(1, n, n2);
    }
    
    StreetViewPanoramaOrientation(final int zzCY, final float n, float n2) {
        zzu.zzb(-90.0f <= n && n <= 90.0f, "Tilt needs to be between -90 and 90 inclusive");
        this.zzCY = zzCY;
        this.tilt = 0.0f + n;
        if (n2 <= 0.0) {
            n2 = 360.0f + n2 % 360.0f;
        }
        this.bearing = n2 % 360.0f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof StreetViewPanoramaOrientation)) {
                return false;
            }
            final StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation)o;
            if (Float.floatToIntBits(this.tilt) != Float.floatToIntBits(streetViewPanoramaOrientation.tilt) || Float.floatToIntBits(this.bearing) != Float.floatToIntBits(streetViewPanoramaOrientation.bearing)) {
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
        return zzt.hashCode(new Object[] { this.tilt, this.bearing });
    }
    
    @Override
    public String toString() {
        return zzt.zzt(this).zzg("tilt", this.tilt).zzg("bearing", this.bearing).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzl.zza(this, parcel, n);
    }
}
