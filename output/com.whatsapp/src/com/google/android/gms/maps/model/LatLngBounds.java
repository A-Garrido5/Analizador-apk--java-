// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLngBounds implements SafeParcelable
{
    public static final zzd CREATOR;
    public final LatLng northeast;
    public final LatLng southwest;
    private final int zzCY;
    
    static {
        CREATOR = new zzd();
    }
    
    LatLngBounds(final int zzCY, final LatLng southwest, final LatLng northeast) {
        zzu.zzb(southwest, "null southwest");
        zzu.zzb(northeast, "null northeast");
        zzu.zzb(northeast.latitude >= southwest.latitude, "southern latitude exceeds northern latitude (%s > %s)", new Object[] { southwest.latitude, northeast.latitude });
        this.zzCY = zzCY;
        this.southwest = southwest;
        this.northeast = northeast;
    }
    
    public LatLngBounds(final LatLng latLng, final LatLng latLng2) {
        this(1, latLng, latLng2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof LatLngBounds)) {
                return false;
            }
            final LatLngBounds latLngBounds = (LatLngBounds)o;
            if (!this.southwest.equals(latLngBounds.southwest) || !this.northeast.equals(latLngBounds.northeast)) {
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
        return zzt.hashCode(new Object[] { this.southwest, this.northeast });
    }
    
    @Override
    public String toString() {
        return zzt.zzt(this).zzg("southwest", this.southwest).zzg("northeast", this.northeast).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzd.zza(this, parcel, n);
    }
}
