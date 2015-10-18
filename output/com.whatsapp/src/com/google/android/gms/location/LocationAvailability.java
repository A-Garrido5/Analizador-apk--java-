// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LocationAvailability implements SafeParcelable
{
    public static final LocationAvailabilityCreator CREATOR;
    private final int zzCY;
    int zzaxQ;
    int zzaxR;
    long zzaxS;
    int zzaxT;
    
    static {
        CREATOR = new LocationAvailabilityCreator();
    }
    
    LocationAvailability(final int zzCY, final int zzaxT, final int zzaxQ, final int zzaxR, final long zzaxS) {
        this.zzCY = zzCY;
        this.zzaxT = zzaxT;
        this.zzaxQ = zzaxQ;
        this.zzaxR = zzaxR;
        this.zzaxS = zzaxS;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof LocationAvailability) {
            final LocationAvailability locationAvailability = (LocationAvailability)o;
            if (this.zzaxT == locationAvailability.zzaxT && this.zzaxQ == locationAvailability.zzaxQ && this.zzaxR == locationAvailability.zzaxR && this.zzaxS == locationAvailability.zzaxS) {
                return true;
            }
        }
        return false;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[] { this.zzaxT, this.zzaxQ, this.zzaxR, this.zzaxS });
    }
    
    public boolean isLocationAvailable() {
        return this.zzaxT < 1000;
    }
    
    @Override
    public String toString() {
        return "LocationAvailability[isLocationAvailable: " + this.isLocationAvailable() + "]";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        LocationAvailabilityCreator.zza(this, parcel, n);
    }
}
