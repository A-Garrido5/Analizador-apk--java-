// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import java.util.List;
import android.location.Location;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzf implements Parcelable$Creator
{
    static void zza(final LocationResult locationResult, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, locationResult.getLocations(), false);
        zzb.zzc(parcel, 1000, locationResult.getVersionCode());
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzee(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzgw(n);
    }
    
    public LocationResult zzee(final Parcel parcel) {
        final int i = LocationServices$zza.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        List list = LocationResult.zzaxZ;
    Label_0150:
        while (true) {
            Label_0074: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0074;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0130: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0130;
                        }
                        case 1: {
                            break Label_0130;
                        }
                        case 1000: {
                            break Label_0130;
                        }
                    }
                    try {
                        while (true) {
                            zza.zzb(parcel, zzaa);
                            while (i != 0) {
                                try {
                                    if (parcel.dataPosition() != zzab) {
                                        throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                    }
                                    break Label_0150;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                list = zza.zzc(parcel, zzaa, Location.CREATOR);
                                if (i != 0) {
                                    zzg = zza.zzg(parcel, zzaa);
                                    if (i != 0) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0150;
                            Block_4:;
                        }
                    }
                    catch (zza$zza zza$zza2) {
                        throw zza$zza2;
                    }
                }
            }
            break;
        }
        return new LocationResult(zzg, list);
    }
    
    public LocationResult[] zzgw(final int n) {
        return new LocationResult[n];
    }
}
