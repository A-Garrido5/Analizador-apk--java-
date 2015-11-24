// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzi implements Parcelable$Creator
{
    static void zza(final StreetViewPanoramaCamera streetViewPanoramaCamera, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, streetViewPanoramaCamera.getVersionCode());
        zzb.zza(parcel, 2, streetViewPanoramaCamera.zoom);
        zzb.zza(parcel, 3, streetViewPanoramaCamera.tilt);
        zzb.zza(parcel, 4, streetViewPanoramaCamera.bearing);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeT(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzht(n);
    }
    
    public StreetViewPanoramaCamera zzeT(final Parcel parcel) {
        float zzl = 0.0f;
        final int i = LatLng.a;
        final int zzab = zza.zzab(parcel);
        float zzl2 = 0.0f;
        int zzg = 0;
        float zzl3 = 0.0f;
    Label_0180:
        while (true) {
            Label_0082: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0082;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0161: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0161;
                        }
                        case 1: {
                            break Label_0161;
                        }
                        case 2: {
                            break Label_0161;
                        }
                        case 3: {
                            break Label_0161;
                        }
                        case 4: {
                            break Label_0161;
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
                                    break Label_0180;
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
                                    zzl3 = zza.zzl(parcel, zzaa);
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
                            continue Label_0180;
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
        return new StreetViewPanoramaCamera(zzg, zzl2, zzl3, zzl);
    }
    
    public StreetViewPanoramaCamera[] zzht(final int n) {
        return new StreetViewPanoramaCamera[n];
    }
}
