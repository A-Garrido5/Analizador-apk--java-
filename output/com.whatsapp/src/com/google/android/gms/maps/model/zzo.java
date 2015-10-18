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

public class zzo implements Parcelable$Creator
{
    static void zza(final VisibleRegion visibleRegion, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, visibleRegion.getVersionCode());
        zzb.zza(parcel, 2, (Parcelable)visibleRegion.nearLeft, n, false);
        zzb.zza(parcel, 3, (Parcelable)visibleRegion.nearRight, n, false);
        zzb.zza(parcel, 4, (Parcelable)visibleRegion.farLeft, n, false);
        zzb.zza(parcel, 5, (Parcelable)visibleRegion.farRight, n, false);
        zzb.zza(parcel, 6, (Parcelable)visibleRegion.latLngBounds, n, false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeZ(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzhz(n);
    }
    
    public VisibleRegion zzeZ(final Parcel parcel) {
        LatLng latLng = null;
        final int a = LatLng.a;
        final int zzab = zza.zzab(parcel);
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        int zzg = 0;
        LatLngBounds latLngBounds = null;
        LatLngBounds latLngBounds2 = null;
        int n = 0;
        LatLng latLng5 = null;
        LatLng latLng6 = null;
        LatLng latLng8 = null;
        LatLng latLng9 = null;
    Label_0335:
        while (true) {
            Label_0145: {
                if (parcel.dataPosition() >= zzab) {
                    latLngBounds2 = latLngBounds;
                    n = zzg;
                    latLng5 = latLng2;
                    latLng6 = latLng;
                    final LatLng latLng7 = latLng4;
                    latLng8 = latLng3;
                    latLng9 = latLng7;
                    break Label_0145;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0298: {
                    LatLng latLng10 = null;
                    LatLng latLng11 = null;
                    LatLng latLng12 = null;
                    switch (zza.zzbA(zzaa)) {
                        case 1: {
                            break Label_0298;
                        }
                        case 2: {
                            break Label_0298;
                        }
                        case 3: {
                            break Label_0298;
                        }
                        case 4: {
                            latLng10 = latLng;
                            break Label_0298;
                        }
                        case 5: {
                            latLng11 = latLng;
                            break Label_0298;
                        }
                        case 6: {
                            latLng12 = latLng;
                            break Label_0298;
                        }
                    }
                    while (true) {
                        LatLng latLng13 = null;
                        LatLng latLng14 = null;
                        LatLng latLng15 = null;
                        LatLngBounds latLngBounds4 = null;
                    Label_0514:
                        while (true) {
                            Label_0540: {
                                Label_0440: {
                                    LatLng latLng18 = null;
                                    Label_0417: {
                                        LatLng latLng19 = null;
                                        Label_0386: {
                                            LatLng latLng20 = null;
                                            Label_0355: {
                                                try {
                                                    while (true) {
                                                        zza.zzb(parcel, zzaa);
                                                        final LatLngBounds latLngBounds3 = latLngBounds;
                                                        latLng13 = latLng2;
                                                        latLng14 = latLng3;
                                                        latLng9 = latLng4;
                                                        latLng15 = latLng;
                                                        latLngBounds4 = latLngBounds3;
                                                        if (a == 0) {
                                                            break Label_0514;
                                                        }
                                                        latLngBounds2 = latLngBounds4;
                                                        final LatLng latLng16 = latLng13;
                                                        n = zzg;
                                                        latLng5 = latLng16;
                                                        final LatLng latLng17 = latLng15;
                                                        latLng8 = latLng14;
                                                        latLng6 = latLng17;
                                                        try {
                                                            if (parcel.dataPosition() != zzab) {
                                                                throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                                            }
                                                            break;
                                                        }
                                                        catch (zza$zza zza$zza) {
                                                            throw zza$zza;
                                                        }
                                                        zzg = zza.zzg(parcel, zzaa);
                                                        if (a == 0) {
                                                            break Label_0440;
                                                        }
                                                        latLng = (LatLng)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                                        if (a == 0) {
                                                            break Label_0440;
                                                        }
                                                        latLng15 = latLng;
                                                        latLng18 = (LatLng)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                                        if (a == 0) {
                                                            break Label_0417;
                                                        }
                                                        latLng10 = latLng15;
                                                        latLng4 = latLng18;
                                                        latLng19 = (LatLng)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                                        if (a == 0) {
                                                            break Label_0386;
                                                        }
                                                        latLng11 = latLng10;
                                                        latLng3 = latLng19;
                                                        latLng20 = (LatLng)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                                        if (a == 0) {
                                                            break Label_0355;
                                                        }
                                                        latLng12 = latLng11;
                                                        latLng2 = latLng20;
                                                        latLngBounds4 = (LatLngBounds)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLngBounds.CREATOR);
                                                        if (a == 0) {
                                                            break Label_0540;
                                                        }
                                                        final LatLngBounds latLngBounds5 = latLngBounds4;
                                                        latLng = latLng12;
                                                        latLngBounds = latLngBounds5;
                                                    }
                                                }
                                                catch (zza$zza zza$zza2) {
                                                    throw zza$zza2;
                                                }
                                                break Label_0335;
                                            }
                                            final LatLngBounds latLngBounds6 = latLngBounds;
                                            latLng13 = latLng20;
                                            latLngBounds4 = latLngBounds6;
                                            final LatLng latLng21 = latLng3;
                                            latLng9 = latLng4;
                                            latLng15 = latLng11;
                                            latLng14 = latLng21;
                                            continue;
                                        }
                                        final LatLngBounds latLngBounds7 = latLngBounds;
                                        latLng13 = latLng2;
                                        latLng14 = latLng19;
                                        latLngBounds4 = latLngBounds7;
                                        final LatLng latLng22 = latLng4;
                                        latLng15 = latLng10;
                                        latLng9 = latLng22;
                                        continue;
                                    }
                                    final LatLngBounds latLngBounds8 = latLngBounds;
                                    latLng13 = latLng2;
                                    latLng14 = latLng3;
                                    latLng9 = latLng18;
                                    latLngBounds4 = latLngBounds8;
                                    continue;
                                }
                                final LatLngBounds latLngBounds9 = latLngBounds;
                                latLng13 = latLng2;
                                latLng14 = latLng3;
                                latLng9 = latLng4;
                                latLng15 = latLng;
                                latLngBounds4 = latLngBounds9;
                                continue;
                            }
                            final LatLng latLng23 = latLng2;
                            latLng14 = latLng3;
                            latLng9 = latLng4;
                            latLng15 = latLng12;
                            latLng13 = latLng23;
                            continue;
                        }
                        final LatLngBounds latLngBounds10 = latLngBounds4;
                        latLng = latLng15;
                        latLng4 = latLng9;
                        latLng3 = latLng14;
                        latLng2 = latLng13;
                        latLngBounds = latLngBounds10;
                        break;
                    }
                }
            }
        }
        return new VisibleRegion(n, latLng6, latLng9, latLng8, latLng5, latLngBounds2);
    }
    
    public VisibleRegion[] zzhz(final int n) {
        return new VisibleRegion[n];
    }
}
