// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class LocationAvailabilityCreator implements Parcelable$Creator
{
    static void zza(final LocationAvailability locationAvailability, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, locationAvailability.zzaxQ);
        zzb.zzc(parcel, 1000, locationAvailability.getVersionCode());
        zzb.zzc(parcel, 2, locationAvailability.zzaxR);
        zzb.zza(parcel, 3, locationAvailability.zzaxS);
        zzb.zzc(parcel, 4, locationAvailability.zzaxT);
        zzb.zzH(parcel, zzac);
    }
    
    public LocationAvailability createFromParcel(final Parcel parcel) {
        int zzg = 1;
        final int i = LocationServices$zza.a;
        final int zzab = zza.zzab(parcel);
        long zzi = 0L;
        int zzg2 = 0;
        int zzg3 = 1000;
        int zzg4 = zzg;
        long n = 0L;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
    Label_0235:
        while (true) {
            Label_0106: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0106;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0215: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0215;
                        }
                        case 1: {
                            break Label_0215;
                        }
                        case 1000: {
                            break Label_0215;
                        }
                        case 2: {
                            break Label_0215;
                        }
                        case 3: {
                            break Label_0215;
                        }
                        case 4: {
                            break Label_0215;
                        }
                    }
                    try {
                        while (true) {
                            zza.zzb(parcel, zzaa);
                            while (i != 0) {
                                n = zzi;
                                n2 = zzg;
                                n3 = zzg2;
                                n4 = zzg3;
                                n5 = zzg4;
                                try {
                                    if (parcel.dataPosition() != zzab) {
                                        throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                    }
                                    break Label_0235;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg4 = zza.zzg(parcel, zzaa);
                                if (i != 0) {
                                    zzg2 = zza.zzg(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzg = zza.zzg(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzi = zza.zzi(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzg3 = zza.zzg(parcel, zzaa);
                                    if (i != 0) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0235;
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
        return new LocationAvailability(n3, n4, n5, n2, n);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.createFromParcel(parcel);
    }
    
    public LocationAvailability[] newArray(final int n) {
        return new LocationAvailability[n];
    }
    
    public Object[] newArray(final int n) {
        return this.newArray(n);
    }
}
