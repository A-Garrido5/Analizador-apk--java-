// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.location.zzc$zza;
import com.google.android.gms.location.zzd$zza;
import android.os.IBinder;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzd;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LocationRequestUpdateData implements SafeParcelable
{
    public static final zzl CREATOR;
    PendingIntent mPendingIntent;
    private final int zzCY;
    int zzazf;
    LocationRequestInternal zzazg;
    zzd zzazh;
    zzc zzazi;
    
    static {
        CREATOR = new zzl();
    }
    
    LocationRequestUpdateData(final int zzCY, final int zzazf, final LocationRequestInternal zzazg, final IBinder binder, final PendingIntent mPendingIntent, final IBinder binder2) {
        this.zzCY = zzCY;
        this.zzazf = zzazf;
        this.zzazg = zzazg;
        zzd zzbT;
        if (binder == null) {
            zzbT = null;
        }
        else {
            zzbT = zzd$zza.zzbT(binder);
        }
        this.zzazh = zzbT;
        this.mPendingIntent = mPendingIntent;
        zzc zzbS = null;
        if (binder2 != null) {
            zzbS = zzc$zza.zzbS(binder2);
        }
        this.zzazi = zzbS;
    }
    
    public static LocationRequestUpdateData zza(final zzc zzc) {
        return new LocationRequestUpdateData(1, 2, null, null, null, zzc.asBinder());
    }
    
    public static LocationRequestUpdateData zzb(final LocationRequestInternal locationRequestInternal, final zzd zzd) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal, zzd.asBinder(), null, null);
    }
    
    public static LocationRequestUpdateData zzb(final zzd zzd) {
        return new LocationRequestUpdateData(1, 2, null, zzd.asBinder(), null, null);
    }
    
    public int describeContents() {
        return 0;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzl.zza(this, parcel, n);
    }
    
    IBinder zzuy() {
        if (this.zzazh == null) {
            return null;
        }
        return this.zzazh.asBinder();
    }
    
    IBinder zzuz() {
        if (this.zzazi == null) {
            return null;
        }
        return this.zzazi.asBinder();
    }
}
