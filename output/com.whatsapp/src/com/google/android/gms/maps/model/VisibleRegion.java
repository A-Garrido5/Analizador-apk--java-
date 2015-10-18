// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class VisibleRegion implements SafeParcelable
{
    public static final zzo CREATOR;
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;
    private final int zzCY;
    
    static {
        CREATOR = new zzo();
    }
    
    VisibleRegion(final int zzCY, final LatLng nearLeft, final LatLng nearRight, final LatLng farLeft, final LatLng farRight, final LatLngBounds latLngBounds) {
        this.zzCY = zzCY;
        this.nearLeft = nearLeft;
        this.nearRight = nearRight;
        this.farLeft = farLeft;
        this.farRight = farRight;
        this.latLngBounds = latLngBounds;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof VisibleRegion)) {
                return false;
            }
            final VisibleRegion visibleRegion = (VisibleRegion)o;
            if (!this.nearLeft.equals(visibleRegion.nearLeft) || !this.nearRight.equals(visibleRegion.nearRight) || !this.farLeft.equals(visibleRegion.farLeft) || !this.farRight.equals(visibleRegion.farRight) || !this.latLngBounds.equals(visibleRegion.latLngBounds)) {
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
        return zzt.hashCode(new Object[] { this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds });
    }
    
    @Override
    public String toString() {
        return zzt.zzt(this).zzg("nearLeft", this.nearLeft).zzg("nearRight", this.nearRight).zzg("farLeft", this.farLeft).zzg("farRight", this.farRight).zzg("latLngBounds", this.latLngBounds).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzo.zza(this, parcel, n);
    }
}
