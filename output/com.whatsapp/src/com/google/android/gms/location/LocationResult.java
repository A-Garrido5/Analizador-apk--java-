// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import java.util.Iterator;
import android.location.Location;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LocationResult implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    static final List zzaxZ;
    private final int zzCY;
    private final List zzaya;
    
    static {
        zzaxZ = Collections.emptyList();
        CREATOR = (Parcelable$Creator)new zzf();
    }
    
    LocationResult(final int zzCY, final List zzaya) {
        this.zzCY = zzCY;
        this.zzaya = zzaya;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        final int a = LocationServices$zza.a;
        if (!(o instanceof LocationResult)) {
            return false;
        }
        final LocationResult locationResult = (LocationResult)o;
        if (locationResult.zzaya.size() != this.zzaya.size()) {
            return false;
        }
        final Iterator iterator = locationResult.zzaya.iterator();
        final Iterator<Location> iterator2 = this.zzaya.iterator();
        while (iterator.hasNext()) {
            if (iterator2.next().getTime() != iterator.next().getTime()) {
                return false;
            }
            if (a != 0) {
                break;
            }
        }
        return true;
    }
    
    public List getLocations() {
        return this.zzaya;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    @Override
    public int hashCode() {
        final int a = LocationServices$zza.a;
        final Iterator<Location> iterator = (Iterator<Location>)this.zzaya.iterator();
        int n = 17;
        while (iterator.hasNext()) {
            final long time = iterator.next().getTime();
            final int n2 = (int)(time ^ time >>> 32) + n * 31;
            if (a != 0) {
                return n2;
            }
            n = n2;
        }
        return n;
    }
    
    @Override
    public String toString() {
        return "LocationResult[locations: " + this.zzaya + "]";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzf.zza(this, parcel, n);
    }
}
