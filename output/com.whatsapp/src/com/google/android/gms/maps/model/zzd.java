// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzd implements Parcelable$Creator
{
    static void zza(final LatLngBounds latLngBounds, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, latLngBounds.getVersionCode());
        zzb.zza(parcel, 2, (Parcelable)latLngBounds.southwest, n, false);
        zzb.zza(parcel, 3, (Parcelable)latLngBounds.northeast, n, false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeO(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzho(n);
    }
    
    public LatLngBounds zzeO(final Parcel parcel) {
        LatLng latLng = null;
        final int i = LatLng.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        LatLng latLng2 = null;
        LatLng latLng4 = null;
        LatLng latLng5 = null;
    Label_0186:
        while (true) {
            Label_0085: {
                if (parcel.dataPosition() >= zzab) {
                    final LatLng latLng3 = latLng2;
                    latLng4 = latLng;
                    latLng5 = latLng3;
                    break Label_0085;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0157: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            final LatLng latLng6 = latLng2;
                            latLng4 = latLng;
                            latLng5 = latLng6;
                            break;
                        }
                        case 1: {
                            break Label_0157;
                        }
                        case 2: {
                            break Label_0157;
                        }
                        case 3: {
                            break Label_0157;
                        }
                    }
                    while (true) {
                    Label_0228:
                        while (true) {
                            Label_0200: {
                                try {
                                    while (true) {
                                        zza.zzb(parcel, zzaa);
                                        while (i != 0) {
                                            try {
                                                if (parcel.dataPosition() != zzab) {
                                                    throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                                }
                                                break Label_0186;
                                            }
                                            catch (zza$zza zza$zza) {
                                                throw zza$zza;
                                            }
                                            zzg = zza.zzg(parcel, zzaa);
                                            if (i == 0) {
                                                break Label_0200;
                                            }
                                            latLng = (LatLng)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                            if (i == 0) {
                                                break Label_0200;
                                            }
                                            latLng4 = latLng;
                                            latLng5 = (LatLng)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                            if (i != 0) {
                                                continue Block_4;
                                            }
                                        }
                                        break Label_0228;
                                        Block_4:;
                                    }
                                }
                                catch (zza$zza zza$zza2) {
                                    throw zza$zza2;
                                }
                                break Label_0186;
                            }
                            final LatLng latLng7 = latLng2;
                            latLng4 = latLng;
                            latLng5 = latLng7;
                            continue;
                        }
                        final LatLng latLng8 = latLng5;
                        latLng = latLng4;
                        latLng2 = latLng8;
                        break;
                    }
                }
            }
        }
        return new LatLngBounds(zzg, latLng4, latLng5);
    }
    
    public LatLngBounds[] zzho(final int n) {
        return new LatLngBounds[n];
    }
}
