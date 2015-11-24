// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzl implements Parcelable$Creator
{
    static void zza(final StreetViewPanoramaOrientation streetViewPanoramaOrientation, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, streetViewPanoramaOrientation.getVersionCode());
        zzb.zza(parcel, 2, streetViewPanoramaOrientation.tilt);
        zzb.zza(parcel, 3, streetViewPanoramaOrientation.bearing);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeW(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzhw(n);
    }
    
    public StreetViewPanoramaOrientation zzeW(final Parcel parcel) {
        float zzl = 0.0f;
        final int i = LatLng.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        float zzl2 = 0.0f;
    Label_0160:
        while (true) {
            Label_0074: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0074;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0141: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0141;
                        }
                        case 1: {
                            break Label_0141;
                        }
                        case 2: {
                            break Label_0141;
                        }
                        case 3: {
                            break Label_0141;
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
                                    break Label_0160;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = zza.zzg(parcel, zzaa);
                                if (i != 0) {
                                    zzl2 = zza.zzl(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzl = zza.zzl(parcel, zzaa);
                                    if (i != 0) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0160;
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
        return new StreetViewPanoramaOrientation(zzg, zzl2, zzl);
    }
    
    public StreetViewPanoramaOrientation[] zzhw(final int n) {
        return new StreetViewPanoramaOrientation[n];
    }
}
