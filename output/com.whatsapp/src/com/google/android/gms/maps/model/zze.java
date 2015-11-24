// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zze implements Parcelable$Creator
{
    static void zza(final LatLng latLng, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, latLng.getVersionCode());
        zzb.zza(parcel, 2, latLng.latitude);
        zzb.zza(parcel, 3, latLng.longitude);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeP(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzhp(n);
    }
    
    public LatLng zzeP(final Parcel parcel) {
        double zzm = 0.0;
        final int i = LatLng.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        double zzm2 = zzm;
        double n = 0.0;
        int n2 = 0;
    Label_0171:
        while (true) {
            Label_0075: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0075;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0151: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0151;
                        }
                        case 1: {
                            break Label_0151;
                        }
                        case 2: {
                            break Label_0151;
                        }
                        case 3: {
                            break Label_0151;
                        }
                    }
                    try {
                        while (true) {
                            zza.zzb(parcel, zzaa);
                            while (i != 0) {
                                n = zzm;
                                n2 = zzg;
                                try {
                                    if (parcel.dataPosition() != zzab) {
                                        throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                    }
                                    break Label_0171;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = zza.zzg(parcel, zzaa);
                                if (i != 0) {
                                    zzm2 = zza.zzm(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzm = zza.zzm(parcel, zzaa);
                                    if (i != 0) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0171;
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
        return new LatLng(n2, zzm2, n);
    }
    
    public LatLng[] zzhp(final int n) {
        return new LatLng[n];
    }
}
