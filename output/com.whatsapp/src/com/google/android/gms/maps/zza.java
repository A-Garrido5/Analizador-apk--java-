// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zza implements Parcelable$Creator
{
    static void zza(final GoogleMapOptions googleMapOptions, final Parcel parcel, final int n) {
        final int a = MapView.a;
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, googleMapOptions.getVersionCode());
        zzb.zza(parcel, 2, googleMapOptions.zzvj());
        zzb.zza(parcel, 3, googleMapOptions.zzvk());
        zzb.zzc(parcel, 4, googleMapOptions.getMapType());
        zzb.zza(parcel, 5, (Parcelable)googleMapOptions.getCamera(), n, false);
        zzb.zza(parcel, 6, googleMapOptions.zzvl());
        zzb.zza(parcel, 7, googleMapOptions.zzvm());
        zzb.zza(parcel, 8, googleMapOptions.zzvn());
        zzb.zza(parcel, 9, googleMapOptions.zzvo());
        zzb.zza(parcel, 10, googleMapOptions.zzvp());
        zzb.zza(parcel, 11, googleMapOptions.zzvq());
        zzb.zza(parcel, 12, googleMapOptions.zzvr());
        zzb.zza(parcel, 14, googleMapOptions.zzvs());
        zzb.zzH(parcel, zzac);
        if (a != 0) {
            ++GoogleMap.a;
        }
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeI(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzhi(n);
    }
    
    public GoogleMapOptions zzeI(final Parcel parcel) {
        final int a = MapView.a;
        final int zzab = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        byte zze = -1;
        byte zze2 = -1;
        byte zze3 = -1;
        byte zze4 = -1;
        byte zze5 = -1;
        byte zze6 = -1;
        byte zze7 = -1;
        CameraPosition cameraPosition = null;
        int zzg = 0;
        byte zze8 = -1;
        byte zze9 = -1;
        int zzg2 = 0;
        byte zze10 = -1;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        CameraPosition cameraPosition2 = null;
        int n2 = 0;
        int n3 = 0;
        byte b10 = 0;
        byte b11 = 0;
    Label_0585:
        while (true) {
            Label_0238: {
                if (parcel.dataPosition() >= zzab) {
                    b = zze10;
                    b2 = zze7;
                    b3 = zze6;
                    b4 = zze5;
                    b5 = zze4;
                    b6 = zze3;
                    b7 = zze2;
                    b8 = zze;
                    cameraPosition2 = cameraPosition;
                    final int n = zzg;
                    n2 = zzg2;
                    n3 = n;
                    final byte b9 = zze9;
                    b10 = zze8;
                    b11 = b9;
                    break Label_0238;
                }
                final int zzaa = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                Label_0553: {
                    int n4 = 0;
                    byte b12 = 0;
                    int n5 = 0;
                    CameraPosition cameraPosition4 = null;
                    int n6 = 0;
                    byte b14 = 0;
                    int n7 = 0;
                    byte b16 = 0;
                    int n8 = 0;
                    byte b18 = 0;
                    int n9 = 0;
                    byte b20 = 0;
                    int n10 = 0;
                    byte b22 = 0;
                    int n11 = 0;
                    byte b24 = 0;
                    int n12 = 0;
                    byte b26 = 0;
                    switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(zzaa)) {
                        default: {
                            final CameraPosition cameraPosition3 = cameraPosition;
                            n4 = zzg2;
                            b12 = zze9;
                            b10 = zze8;
                            n5 = zzg;
                            cameraPosition4 = cameraPosition3;
                            break;
                        }
                        case 1: {
                            break Label_0553;
                        }
                        case 2: {
                            break Label_0553;
                        }
                        case 3: {
                            break Label_0553;
                        }
                        case 4: {
                            break Label_0553;
                        }
                        case 5: {
                            break Label_0553;
                        }
                        case 6: {
                            break Label_0553;
                        }
                        case 7: {
                            final byte b13 = zze;
                            n6 = zzg2;
                            b12 = zze9;
                            b10 = zze8;
                            n5 = zzg;
                            cameraPosition4 = cameraPosition;
                            b14 = b13;
                            break Label_0553;
                        }
                        case 8: {
                            final byte b15 = zze2;
                            n7 = zzg2;
                            b12 = zze9;
                            b10 = zze8;
                            n5 = zzg;
                            cameraPosition4 = cameraPosition;
                            b16 = b15;
                            break Label_0553;
                        }
                        case 9: {
                            final byte b17 = zze3;
                            n8 = zzg2;
                            b12 = zze9;
                            b10 = zze8;
                            n5 = zzg;
                            cameraPosition4 = cameraPosition;
                            b18 = b17;
                            break Label_0553;
                        }
                        case 10: {
                            final byte b19 = zze4;
                            n9 = zzg2;
                            b12 = zze9;
                            b10 = zze8;
                            n5 = zzg;
                            cameraPosition4 = cameraPosition;
                            b20 = b19;
                            break Label_0553;
                        }
                        case 11: {
                            final byte b21 = zze5;
                            n10 = zzg2;
                            b12 = zze9;
                            b10 = zze8;
                            n5 = zzg;
                            cameraPosition4 = cameraPosition;
                            b22 = b21;
                            break Label_0553;
                        }
                        case 12: {
                            final byte b23 = zze6;
                            n11 = zzg2;
                            b12 = zze9;
                            b10 = zze8;
                            n5 = zzg;
                            cameraPosition4 = cameraPosition;
                            b24 = b23;
                            break Label_0553;
                        }
                        case 14: {
                            final byte b25 = zze7;
                            n12 = zzg2;
                            b12 = zze9;
                            b10 = zze8;
                            n5 = zzg;
                            cameraPosition4 = cameraPosition;
                            b26 = b25;
                            break Label_0553;
                        }
                    }
                    while (true) {
                        int n13 = 0;
                        byte b28 = 0;
                    Label_0992:
                        while (true) {
                            Label_1137: {
                                Label_1118: {
                                    Label_1099: {
                                        Label_1080: {
                                            Label_1061: {
                                                Label_1042: {
                                                    Label_1023: {
                                                        Label_0681: {
                                                            Label_0650: {
                                                                Label_0619: {
                                                                    try {
                                                                        while (true) {
                                                                            com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzaa);
                                                                            final byte b27 = zze10;
                                                                            n13 = n4;
                                                                            b28 = b27;
                                                                            if (a == 0) {
                                                                                break Label_0992;
                                                                            }
                                                                            b = b28;
                                                                            final byte b29 = zze7;
                                                                            b3 = zze6;
                                                                            b4 = zze5;
                                                                            b5 = zze4;
                                                                            b6 = zze3;
                                                                            b7 = zze2;
                                                                            b8 = zze;
                                                                            cameraPosition2 = cameraPosition4;
                                                                            n2 = n13;
                                                                            b2 = b29;
                                                                            final byte b30 = b12;
                                                                            n3 = n5;
                                                                            b11 = b30;
                                                                            try {
                                                                                if (parcel.dataPosition() != zzab) {
                                                                                    throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                                                                }
                                                                                break;
                                                                            }
                                                                            catch (zza$zza zza$zza) {
                                                                                throw zza$zza;
                                                                            }
                                                                            zzg2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0619;
                                                                            }
                                                                            zze9 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0681;
                                                                            }
                                                                            zze8 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0650;
                                                                            }
                                                                            zzg = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0619;
                                                                            }
                                                                            cameraPosition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, zzaa, (Parcelable$Creator)CameraPosition.CREATOR);
                                                                            if (a == 0) {
                                                                                break Label_0619;
                                                                            }
                                                                            zze = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_0619;
                                                                            }
                                                                            final byte b31 = zze;
                                                                            n6 = zzg2;
                                                                            b12 = zze9;
                                                                            b10 = zze8;
                                                                            n5 = zzg;
                                                                            cameraPosition4 = cameraPosition;
                                                                            b14 = b31;
                                                                            zze2 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1137;
                                                                            }
                                                                            final byte b32 = zze2;
                                                                            n7 = n6;
                                                                            zze = b14;
                                                                            b16 = b32;
                                                                            zze3 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1118;
                                                                            }
                                                                            final byte b33 = zze3;
                                                                            n8 = n7;
                                                                            zze2 = b16;
                                                                            b18 = b33;
                                                                            zze4 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1099;
                                                                            }
                                                                            final byte b34 = zze4;
                                                                            n9 = n8;
                                                                            zze3 = b18;
                                                                            b20 = b34;
                                                                            zze5 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1080;
                                                                            }
                                                                            final byte b35 = zze5;
                                                                            n10 = n9;
                                                                            zze4 = b20;
                                                                            b22 = b35;
                                                                            zze6 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1061;
                                                                            }
                                                                            final byte b36 = zze6;
                                                                            n11 = n10;
                                                                            zze5 = b22;
                                                                            b24 = b36;
                                                                            zze7 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1042;
                                                                            }
                                                                            final byte b37 = zze7;
                                                                            n12 = n11;
                                                                            zze6 = b24;
                                                                            b26 = b37;
                                                                            zze10 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, zzaa);
                                                                            if (a == 0) {
                                                                                break Label_1023;
                                                                            }
                                                                            final byte b38 = b26;
                                                                            n4 = n12;
                                                                            zze7 = b38;
                                                                        }
                                                                    }
                                                                    catch (zza$zza zza$zza2) {
                                                                        throw zza$zza2;
                                                                    }
                                                                    break Label_0585;
                                                                }
                                                                final byte b39 = zze10;
                                                                n13 = zzg2;
                                                                b12 = zze9;
                                                                b10 = zze8;
                                                                n5 = zzg;
                                                                cameraPosition4 = cameraPosition;
                                                                b28 = b39;
                                                                continue;
                                                            }
                                                            final byte b40 = zze10;
                                                            n13 = zzg2;
                                                            b12 = zze9;
                                                            b10 = zze8;
                                                            n5 = zzg;
                                                            cameraPosition4 = cameraPosition;
                                                            b28 = b40;
                                                            continue;
                                                        }
                                                        final byte b41 = zze10;
                                                        n13 = zzg2;
                                                        b12 = zze9;
                                                        b10 = zze8;
                                                        n5 = zzg;
                                                        cameraPosition4 = cameraPosition;
                                                        b28 = b41;
                                                        continue;
                                                    }
                                                    final byte b42 = zze10;
                                                    n13 = n12;
                                                    zze7 = b26;
                                                    b28 = b42;
                                                    continue;
                                                }
                                                final byte b43 = zze10;
                                                n13 = n11;
                                                zze6 = b24;
                                                b28 = b43;
                                                continue;
                                            }
                                            final byte b44 = zze10;
                                            n13 = n10;
                                            zze5 = b22;
                                            b28 = b44;
                                            continue;
                                        }
                                        final byte b45 = zze10;
                                        n13 = n9;
                                        zze4 = b20;
                                        b28 = b45;
                                        continue;
                                    }
                                    final byte b46 = zze10;
                                    n13 = n8;
                                    zze3 = b18;
                                    b28 = b46;
                                    continue;
                                }
                                final byte b47 = zze10;
                                n13 = n7;
                                zze2 = b16;
                                b28 = b47;
                                continue;
                            }
                            final byte b48 = zze10;
                            n13 = n6;
                            zze = b14;
                            b28 = b48;
                            continue;
                        }
                        final byte b49 = b28;
                        cameraPosition = cameraPosition4;
                        zzg = n5;
                        zze8 = b10;
                        zze9 = b12;
                        zzg2 = n13;
                        zze10 = b49;
                        break;
                    }
                }
            }
        }
        return new GoogleMapOptions(n2, b11, b10, n3, cameraPosition2, b8, b7, b6, b5, b4, b3, b2, b);
    }
    
    public GoogleMapOptions[] zzhi(final int n) {
        return new GoogleMapOptions[n];
    }
}
