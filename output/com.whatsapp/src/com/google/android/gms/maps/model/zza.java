// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zza implements Parcelable$Creator
{
    static void zza(final CameraPosition cameraPosition, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, cameraPosition.getVersionCode());
        zzb.zza(parcel, 2, (Parcelable)cameraPosition.target, n, false);
        zzb.zza(parcel, 3, cameraPosition.zoom);
        zzb.zza(parcel, 4, cameraPosition.tilt);
        zzb.zza(parcel, 5, cameraPosition.bearing);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeL(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzhl(n);
    }
    
    public CameraPosition zzeL(final Parcel parcel) {
        final int a = LatLng.a;
        final int zzab = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        float zzl = 0.0f;
        float zzl2 = 0.0f;
        LatLng latLng = null;
        int zzg = 0;
        float zzl3 = 0.0f;
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        LatLng latLng2 = null;
    Label_0289:
        while (true) {
            Label_0134: {
                if (parcel.dataPosition() >= zzab) {
                    n = zzl;
                    n2 = zzl2;
                    n3 = zzl3;
                    latLng2 = latLng;
                    break Label_0134;
                }
                final int zzaa = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                Label_0257: {
                    int n4 = 0;
                    LatLng latLng4 = null;
                    int n6 = 0;
                    float n7 = 0.0f;
                    switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(zzaa)) {
                        default: {
                            final LatLng latLng3 = latLng;
                            n4 = zzg;
                            latLng4 = latLng3;
                            break;
                        }
                        case 1: {
                            break Label_0257;
                        }
                        case 2: {
                            break Label_0257;
                        }
                        case 3: {
                            break Label_0257;
                        }
                        case 4: {
                            break Label_0257;
                        }
                        case 5: {
                            final float n5 = zzl2;
                            n6 = zzg;
                            latLng4 = latLng;
                            n7 = n5;
                            break Label_0257;
                        }
                    }
                    while (true) {
                        int n9 = 0;
                        float n10 = 0.0f;
                    Label_0364:
                        while (true) {
                            float n12 = 0.0f;
                            int n13 = 0;
                            Label_0402: {
                                Label_0383: {
                                    Label_0307: {
                                        try {
                                            while (true) {
                                                com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzaa);
                                                final float n8 = zzl;
                                                n9 = n4;
                                                n10 = n8;
                                                if (a == 0) {
                                                    break Label_0364;
                                                }
                                                n = n10;
                                                final float n11 = zzl2;
                                                n3 = zzl3;
                                                latLng2 = latLng4;
                                                zzg = n9;
                                                n2 = n11;
                                                try {
                                                    if (parcel.dataPosition() != zzab) {
                                                        throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                                    }
                                                    break;
                                                }
                                                catch (zza$zza zza$zza) {
                                                    throw zza$zza;
                                                }
                                                zzg = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                                                if (a == 0) {
                                                    break Label_0307;
                                                }
                                                latLng = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                                if (a == 0) {
                                                    break Label_0307;
                                                }
                                                zzl3 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzaa);
                                                if (a == 0) {
                                                    break Label_0307;
                                                }
                                                n12 = zzl3;
                                                n13 = zzg;
                                                latLng4 = latLng;
                                                zzl2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzaa);
                                                if (a == 0) {
                                                    break Label_0402;
                                                }
                                                final float n14 = zzl2;
                                                n6 = n13;
                                                zzl3 = n12;
                                                n7 = n14;
                                                zzl = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzaa);
                                                if (a == 0) {
                                                    break Label_0383;
                                                }
                                                final float n15 = n7;
                                                n4 = n6;
                                                zzl2 = n15;
                                            }
                                        }
                                        catch (zza$zza zza$zza2) {
                                            throw zza$zza2;
                                        }
                                        break Label_0289;
                                    }
                                    final float n16 = zzl;
                                    n9 = zzg;
                                    latLng4 = latLng;
                                    n10 = n16;
                                    continue;
                                }
                                final float n17 = zzl;
                                n9 = n6;
                                zzl2 = n7;
                                n10 = n17;
                                continue;
                            }
                            final float n18 = zzl;
                            n9 = n13;
                            zzl3 = n12;
                            n10 = n18;
                            continue;
                        }
                        final float n19 = n10;
                        latLng = latLng4;
                        zzg = n9;
                        zzl = n19;
                        break;
                    }
                }
            }
        }
        return new CameraPosition(zzg, latLng2, n3, n2, n);
    }
    
    public CameraPosition[] zzhl(final int n) {
        return new CameraPosition[n];
    }
}
