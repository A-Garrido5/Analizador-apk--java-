// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.GoogleMap;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzf implements Parcelable$Creator
{
    static void zza(final MarkerOptions markerOptions, final Parcel parcel, final int n) {
        final int a = LatLng.a;
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, markerOptions.getVersionCode());
        zzb.zza(parcel, 2, (Parcelable)markerOptions.getPosition(), n, false);
        zzb.zza(parcel, 3, markerOptions.getTitle(), false);
        zzb.zza(parcel, 4, markerOptions.getSnippet(), false);
        zzb.zza(parcel, 5, markerOptions.zzvJ(), false);
        zzb.zza(parcel, 6, markerOptions.getAnchorU());
        zzb.zza(parcel, 7, markerOptions.getAnchorV());
        zzb.zza(parcel, 8, markerOptions.isDraggable());
        zzb.zza(parcel, 9, markerOptions.isVisible());
        zzb.zza(parcel, 10, markerOptions.isFlat());
        zzb.zza(parcel, 11, markerOptions.getRotation());
        zzb.zza(parcel, 12, markerOptions.getInfoWindowAnchorU());
        zzb.zza(parcel, 13, markerOptions.getInfoWindowAnchorV());
        zzb.zza(parcel, 14, markerOptions.getAlpha());
        zzb.zzH(parcel, zzac);
        if (a != 0) {
            ++GoogleMap.a;
        }
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeQ(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzhq(n);
    }
    
    public MarkerOptions zzeQ(final Parcel parcel) {
        final int a = LatLng.a;
        final int zzab = zza.zzab(parcel);
        String zzo = null;
        String zzo2 = null;
        IBinder binder = null;
        float zzl = 0.0f;
        float zzl2 = 0.0f;
        boolean zzc = false;
        boolean zzc2 = false;
        boolean zzc3 = false;
        float zzl3 = 0.0f;
        float zzl4 = 0.5f;
        float zzl5 = 0.0f;
        LatLng latLng = null;
        int zzg = 0;
        float zzl6 = 1.0f;
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        float n4 = 0.0f;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        float n5 = 0.0f;
        float n6 = 0.0f;
        IBinder binder2 = null;
        int n7 = 0;
        String s = null;
        LatLng latLng2 = null;
    Label_0621:
        while (true) {
            Label_0234: {
                if (parcel.dataPosition() >= zzab) {
                    n = zzl6;
                    n2 = zzl5;
                    n3 = zzl4;
                    n4 = zzl3;
                    b = zzc3;
                    b2 = zzc2;
                    b3 = zzc;
                    n5 = zzl2;
                    n6 = zzl;
                    binder2 = binder;
                    n7 = zzg;
                    s = zzo2;
                    latLng2 = latLng;
                    break Label_0234;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0589: {
                    int n8 = 0;
                    LatLng latLng4 = null;
                    String s2 = null;
                    String s3 = null;
                    LatLng latLng5 = null;
                    IBinder zzp = null;
                    int n10 = 0;
                    float n11 = 0.0f;
                    int n13 = 0;
                    float n14 = 0.0f;
                    int n15 = 0;
                    boolean b5 = false;
                    int n16 = 0;
                    boolean b7 = false;
                    int n17 = 0;
                    boolean b9 = false;
                    int n19 = 0;
                    float n20 = 0.0f;
                    int n22 = 0;
                    float n23 = 0.0f;
                    int n25 = 0;
                    float n26 = 0.0f;
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            final LatLng latLng3 = latLng;
                            n8 = zzg;
                            latLng4 = latLng3;
                            break;
                        }
                        case 1: {
                            break Label_0589;
                        }
                        case 2: {
                            break Label_0589;
                        }
                        case 3: {
                            break Label_0589;
                        }
                        case 4: {
                            break Label_0589;
                        }
                        case 5: {
                            break Label_0589;
                        }
                        case 6: {
                            final IBinder binder3 = binder;
                            s2 = zzo2;
                            s3 = zzo;
                            latLng5 = latLng;
                            zzp = binder3;
                            break Label_0589;
                        }
                        case 7: {
                            final float n9 = zzl;
                            n10 = zzg;
                            latLng4 = latLng;
                            n11 = n9;
                            break Label_0589;
                        }
                        case 8: {
                            final float n12 = zzl2;
                            n13 = zzg;
                            latLng4 = latLng;
                            n14 = n12;
                            break Label_0589;
                        }
                        case 9: {
                            final boolean b4 = zzc;
                            n15 = zzg;
                            latLng4 = latLng;
                            b5 = b4;
                            break Label_0589;
                        }
                        case 10: {
                            final boolean b6 = zzc2;
                            n16 = zzg;
                            latLng4 = latLng;
                            b7 = b6;
                            break Label_0589;
                        }
                        case 11: {
                            final boolean b8 = zzc3;
                            n17 = zzg;
                            latLng4 = latLng;
                            b9 = b8;
                            break Label_0589;
                        }
                        case 12: {
                            final float n18 = zzl3;
                            n19 = zzg;
                            latLng4 = latLng;
                            n20 = n18;
                            break Label_0589;
                        }
                        case 13: {
                            final float n21 = zzl4;
                            n22 = zzg;
                            latLng4 = latLng;
                            n23 = n21;
                            break Label_0589;
                        }
                        case 14: {
                            final float n24 = zzl5;
                            n25 = zzg;
                            latLng4 = latLng;
                            n26 = n24;
                            break Label_0589;
                        }
                    }
                    while (true) {
                        int n28 = 0;
                        float n29 = 0.0f;
                    Label_0937:
                        while (true) {
                            Label_1089: {
                                Label_1070: {
                                    Label_1051: {
                                        Label_1032: {
                                            Label_1013: {
                                                Label_0994: {
                                                    Label_0975: {
                                                        Label_0956: {
                                                            Label_0688: {
                                                                Label_0657: {
                                                                    try {
                                                                        while (true) {
                                                                            zza.zzb(parcel, zzaa);
                                                                            final float n27 = zzl6;
                                                                            n28 = n8;
                                                                            n29 = n27;
                                                                            if (a == 0) {
                                                                                break Label_0937;
                                                                            }
                                                                            n = n29;
                                                                            final float n30 = zzl5;
                                                                            n3 = zzl4;
                                                                            n4 = zzl3;
                                                                            b = zzc3;
                                                                            b2 = zzc2;
                                                                            b3 = zzc;
                                                                            n5 = zzl2;
                                                                            n6 = zzl;
                                                                            binder2 = binder;
                                                                            n7 = n28;
                                                                            n2 = n30;
                                                                            final LatLng latLng6 = latLng4;
                                                                            s = zzo2;
                                                                            latLng2 = latLng6;
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
                                                                                break Label_0688;
                                                                            }
                                                                            latLng = (LatLng)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                                                            if (a == 0) {
                                                                                break Label_0688;
                                                                            }
                                                                            zzo = zza.zzo(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0688;
                                                                            }
                                                                            zzo2 = zza.zzo(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0688;
                                                                            }
                                                                            s2 = zzo2;
                                                                            s3 = zzo;
                                                                            latLng5 = latLng;
                                                                            zzp = zza.zzp(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0657;
                                                                            }
                                                                            zzl = zza.zzl(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0657;
                                                                            }
                                                                            final float n31 = zzl;
                                                                            n10 = zzg;
                                                                            latLng4 = latLng5;
                                                                            zzo = s3;
                                                                            zzo2 = s2;
                                                                            binder = zzp;
                                                                            n11 = n31;
                                                                            zzl2 = zza.zzl(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1089;
                                                                            }
                                                                            final float n32 = zzl2;
                                                                            n13 = n10;
                                                                            zzl = n11;
                                                                            n14 = n32;
                                                                            zzc = zza.zzc(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1070;
                                                                            }
                                                                            final boolean b10 = zzc;
                                                                            n15 = n13;
                                                                            zzl2 = n14;
                                                                            b5 = b10;
                                                                            zzc2 = zza.zzc(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1051;
                                                                            }
                                                                            final boolean b11 = zzc2;
                                                                            n16 = n15;
                                                                            zzc = b5;
                                                                            b7 = b11;
                                                                            zzc3 = zza.zzc(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1032;
                                                                            }
                                                                            final boolean b12 = zzc3;
                                                                            n17 = n16;
                                                                            zzc2 = b7;
                                                                            b9 = b12;
                                                                            zzl3 = zza.zzl(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1013;
                                                                            }
                                                                            final float n33 = zzl3;
                                                                            n19 = n17;
                                                                            zzc3 = b9;
                                                                            n20 = n33;
                                                                            zzl4 = zza.zzl(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0994;
                                                                            }
                                                                            final float n34 = zzl4;
                                                                            n22 = n19;
                                                                            zzl3 = n20;
                                                                            n23 = n34;
                                                                            zzl5 = zza.zzl(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0975;
                                                                            }
                                                                            final float n35 = zzl5;
                                                                            n25 = n22;
                                                                            zzl4 = n23;
                                                                            n26 = n35;
                                                                            zzl6 = zza.zzl(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0956;
                                                                            }
                                                                            final float n36 = n26;
                                                                            n8 = n25;
                                                                            zzl5 = n36;
                                                                        }
                                                                    }
                                                                    catch (zza$zza zza$zza2) {
                                                                        throw zza$zza2;
                                                                    }
                                                                    break Label_0621;
                                                                }
                                                                final float n37 = zzl6;
                                                                n28 = zzg;
                                                                latLng4 = latLng5;
                                                                zzo = s3;
                                                                zzo2 = s2;
                                                                binder = zzp;
                                                                n29 = n37;
                                                                continue;
                                                            }
                                                            final float n38 = zzl6;
                                                            n28 = zzg;
                                                            latLng4 = latLng;
                                                            n29 = n38;
                                                            continue;
                                                        }
                                                        final float n39 = zzl6;
                                                        n28 = n25;
                                                        zzl5 = n26;
                                                        n29 = n39;
                                                        continue;
                                                    }
                                                    final float n40 = zzl6;
                                                    n28 = n22;
                                                    zzl4 = n23;
                                                    n29 = n40;
                                                    continue;
                                                }
                                                final float n41 = zzl6;
                                                n28 = n19;
                                                zzl3 = n20;
                                                n29 = n41;
                                                continue;
                                            }
                                            final float n42 = zzl6;
                                            n28 = n17;
                                            zzc3 = b9;
                                            n29 = n42;
                                            continue;
                                        }
                                        final float n43 = zzl6;
                                        n28 = n16;
                                        zzc2 = b7;
                                        n29 = n43;
                                        continue;
                                    }
                                    final float n44 = zzl6;
                                    n28 = n15;
                                    zzc = b5;
                                    n29 = n44;
                                    continue;
                                }
                                final float n45 = zzl6;
                                n28 = n13;
                                zzl2 = n14;
                                n29 = n45;
                                continue;
                            }
                            final float n46 = zzl6;
                            n28 = n10;
                            zzl = n11;
                            n29 = n46;
                            continue;
                        }
                        final float n47 = n29;
                        latLng = latLng4;
                        zzg = n28;
                        zzl6 = n47;
                        break;
                    }
                }
            }
        }
        return new MarkerOptions(n7, latLng2, zzo, s, binder2, n6, n5, b3, b2, b, n4, n3, n2, n);
    }
    
    public MarkerOptions[] zzhq(final int n) {
        return new MarkerOptions[n];
    }
}
