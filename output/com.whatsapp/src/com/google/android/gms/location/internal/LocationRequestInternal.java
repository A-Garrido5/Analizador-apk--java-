// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import java.util.Collections;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LocationRequestInternal implements SafeParcelable
{
    public static final zzk CREATOR;
    static final List zzaza;
    final String mTag;
    private final int zzCY;
    LocationRequest zzamz;
    boolean zzazb;
    boolean zzazc;
    boolean zzazd;
    List zzaze;
    
    static {
        zzaza = Collections.emptyList();
        CREATOR = new zzk();
    }
    
    LocationRequestInternal(final int zzCY, final LocationRequest zzamz, final boolean zzazb, final boolean zzazc, final boolean zzazd, final List zzaze, final String mTag) {
        this.zzCY = zzCY;
        this.zzamz = zzamz;
        this.zzazb = zzazb;
        this.zzazc = zzazc;
        this.zzazd = zzazd;
        this.zzaze = zzaze;
        this.mTag = mTag;
    }
    
    public static LocationRequestInternal zza(final String s, final LocationRequest locationRequest) {
        return new LocationRequestInternal(1, locationRequest, false, true, true, LocationRequestInternal.zzaza, s);
    }
    
    public static LocationRequestInternal zzb(final LocationRequest locationRequest) {
        return zza(null, locationRequest);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof LocationRequestInternal) {
            final LocationRequestInternal locationRequestInternal = (LocationRequestInternal)o;
            if (zzt.equal(this.zzamz, locationRequestInternal.zzamz) && this.zzazb == locationRequestInternal.zzazb && this.zzazc == locationRequestInternal.zzazc && this.zzazd == locationRequestInternal.zzazd && zzt.equal(this.zzaze, locationRequestInternal.zzaze)) {
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
        return this.zzamz.hashCode();
    }
    
    @Override
    public String toString() {
        final int c = zzj.c;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.zzamz.toString());
        sb.append(" requestNlpDebugInfo=");
        sb.append(this.zzazb);
        sb.append(" restorePendingIntentListeners=");
        sb.append(this.zzazc);
        sb.append(" triggerUpdate=");
        sb.append(this.zzazd);
        sb.append(" clients=");
        sb.append(this.zzaze);
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        final String string = sb.toString();
        if (c != 0) {
            zzb.b = !zzb.b;
        }
        return string;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzk.zza(this, parcel, n);
    }
}
