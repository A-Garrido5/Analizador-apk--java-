// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzb implements Parcelable$Creator
{
    static void zza(final StreetViewPanoramaOptions streetViewPanoramaOptions, final Parcel parcel, final int n) {
        final int a = MapView.a;
        final int zzac = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        try {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, streetViewPanoramaOptions.getVersionCode());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, (Parcelable)streetViewPanoramaOptions.getStreetViewPanoramaCamera(), n, false);
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, streetViewPanoramaOptions.getPanoramaId(), false);
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, (Parcelable)streetViewPanoramaOptions.getPosition(), n, false);
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, streetViewPanoramaOptions.getRadius(), false);
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, streetViewPanoramaOptions.zzvy());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, streetViewPanoramaOptions.zzvo());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 8, streetViewPanoramaOptions.zzvz());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 9, streetViewPanoramaOptions.zzvA());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 10, streetViewPanoramaOptions.zzvk());
            com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzac);
            if (GoogleMap.a != 0) {
                MapView.a = a + 1;
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzeJ(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzhj(n);
    }
    
    public StreetViewPanoramaOptions zzeJ(final Parcel parcel) {
        final int a = MapView.a;
        final int zzab = zza.zzab(parcel);
        String zzo = null;
        LatLng latLng = null;
        Integer n = null;
        byte zze = 0;
        byte zze2 = 0;
        byte zze3 = 0;
        byte zze4 = 0;
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        int zzg = 0;
        byte zze5 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        Integer n2 = null;
        int n3 = 0;
        LatLng latLng2 = null;
        StreetViewPanoramaCamera streetViewPanoramaCamera2 = null;
    Label_0479:
        while (true) {
            Label_0190: {
                if (parcel.dataPosition() >= zzab) {
                    b = zze5;
                    b2 = zze4;
                    b3 = zze3;
                    b4 = zze2;
                    b5 = zze;
                    n2 = n;
                    n3 = zzg;
                    latLng2 = latLng;
                    streetViewPanoramaCamera2 = streetViewPanoramaCamera;
                    break Label_0190;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0311: {
                    int n4 = 0;
                    StreetViewPanoramaCamera streetViewPanoramaCamera4 = null;
                    LatLng latLng3 = null;
                    String s = null;
                    StreetViewPanoramaCamera streetViewPanoramaCamera5 = null;
                    Integer zzh = null;
                    int n6 = 0;
                    byte b7 = 0;
                    int n7 = 0;
                    byte b9 = 0;
                    int n8 = 0;
                    byte b11 = 0;
                    int n9 = 0;
                    byte b13 = 0;
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            final StreetViewPanoramaCamera streetViewPanoramaCamera3 = streetViewPanoramaCamera;
                            n4 = zzg;
                            streetViewPanoramaCamera4 = streetViewPanoramaCamera3;
                            break;
                        }
                        case 1: {
                            break Label_0311;
                        }
                        case 2: {
                            break Label_0311;
                        }
                        case 3: {
                            break Label_0311;
                        }
                        case 4: {
                            break Label_0311;
                        }
                        case 6: {
                            final Integer n5 = n;
                            latLng3 = latLng;
                            s = zzo;
                            streetViewPanoramaCamera5 = streetViewPanoramaCamera;
                            zzh = n5;
                            break Label_0311;
                        }
                        case 7: {
                            final byte b6 = zze;
                            n6 = zzg;
                            streetViewPanoramaCamera4 = streetViewPanoramaCamera;
                            b7 = b6;
                            break Label_0311;
                        }
                        case 8: {
                            final byte b8 = zze2;
                            n7 = zzg;
                            streetViewPanoramaCamera4 = streetViewPanoramaCamera;
                            b9 = b8;
                            break Label_0311;
                        }
                        case 9: {
                            final byte b10 = zze3;
                            n8 = zzg;
                            streetViewPanoramaCamera4 = streetViewPanoramaCamera;
                            b11 = b10;
                            break Label_0311;
                        }
                        case 10: {
                            final byte b12 = zze4;
                            n9 = zzg;
                            streetViewPanoramaCamera4 = streetViewPanoramaCamera;
                            b13 = b12;
                            break Label_0311;
                        }
                        case 5: {
                            latLng3 = latLng;
                            s = zzo;
                            streetViewPanoramaCamera5 = streetViewPanoramaCamera;
                            break Label_0311;
                        }
                    }
                    while (true) {
                        int n10 = 0;
                        byte b15 = 0;
                    Label_0733:
                        while (true) {
                            Label_0809: {
                                Label_0790: {
                                    Label_0771: {
                                        Label_0752: {
                                            Label_0561: {
                                                StreetViewPanoramaCamera streetViewPanoramaCamera7 = null;
                                                LatLng latLng4 = null;
                                                Label_0538: {
                                                    Label_0507: {
                                                        try {
                                                            while (true) {
                                                                zza.zzb(parcel, zzaa);
                                                                final byte b14 = zze5;
                                                                n10 = n4;
                                                                b15 = b14;
                                                                if (a == 0) {
                                                                    break Label_0733;
                                                                }
                                                                b = b15;
                                                                final byte b16 = zze4;
                                                                b3 = zze3;
                                                                b4 = zze2;
                                                                b5 = zze;
                                                                n2 = n;
                                                                n3 = n10;
                                                                b2 = b16;
                                                                final StreetViewPanoramaCamera streetViewPanoramaCamera6 = streetViewPanoramaCamera4;
                                                                latLng2 = latLng;
                                                                streetViewPanoramaCamera2 = streetViewPanoramaCamera6;
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
                                                                    break Label_0561;
                                                                }
                                                                streetViewPanoramaCamera = (StreetViewPanoramaCamera)zza.zza(parcel, zzaa, (Parcelable$Creator)StreetViewPanoramaCamera.CREATOR);
                                                                if (a == 0) {
                                                                    break Label_0561;
                                                                }
                                                                zzo = zza.zzo(parcel, zzaa);
                                                                if (a == 0) {
                                                                    break Label_0561;
                                                                }
                                                                streetViewPanoramaCamera7 = streetViewPanoramaCamera;
                                                                latLng4 = (LatLng)zza.zza(parcel, zzaa, (Parcelable$Creator)LatLng.CREATOR);
                                                                if (a == 0) {
                                                                    break Label_0538;
                                                                }
                                                                latLng3 = latLng4;
                                                                final String s2 = zzo;
                                                                streetViewPanoramaCamera5 = streetViewPanoramaCamera7;
                                                                s = s2;
                                                                zzh = zza.zzh(parcel, zzaa);
                                                                if (a == 0) {
                                                                    break Label_0507;
                                                                }
                                                                zze = zza.zze(parcel, zzaa);
                                                                if (a == 0) {
                                                                    break Label_0507;
                                                                }
                                                                final byte b17 = zze;
                                                                n6 = zzg;
                                                                streetViewPanoramaCamera4 = streetViewPanoramaCamera5;
                                                                zzo = s;
                                                                latLng = latLng3;
                                                                n = zzh;
                                                                b7 = b17;
                                                                zze2 = zza.zze(parcel, zzaa);
                                                                if (a == 0) {
                                                                    break Label_0809;
                                                                }
                                                                final byte b18 = zze2;
                                                                n7 = n6;
                                                                zze = b7;
                                                                b9 = b18;
                                                                zze3 = zza.zze(parcel, zzaa);
                                                                if (a == 0) {
                                                                    break Label_0790;
                                                                }
                                                                final byte b19 = zze3;
                                                                n8 = n7;
                                                                zze2 = b9;
                                                                b11 = b19;
                                                                zze4 = zza.zze(parcel, zzaa);
                                                                if (a == 0) {
                                                                    break Label_0771;
                                                                }
                                                                final byte b20 = zze4;
                                                                n9 = n8;
                                                                zze3 = b11;
                                                                b13 = b20;
                                                                zze5 = zza.zze(parcel, zzaa);
                                                                if (a == 0) {
                                                                    break Label_0752;
                                                                }
                                                                final byte b21 = b13;
                                                                n4 = n9;
                                                                zze4 = b21;
                                                            }
                                                        }
                                                        catch (zza$zza zza$zza2) {
                                                            throw zza$zza2;
                                                        }
                                                        break Label_0479;
                                                    }
                                                    final byte b22 = zze5;
                                                    n10 = zzg;
                                                    streetViewPanoramaCamera4 = streetViewPanoramaCamera5;
                                                    zzo = s;
                                                    latLng = latLng3;
                                                    n = zzh;
                                                    b15 = b22;
                                                    continue;
                                                }
                                                final byte b23 = zze5;
                                                n10 = zzg;
                                                streetViewPanoramaCamera4 = streetViewPanoramaCamera7;
                                                latLng = latLng4;
                                                b15 = b23;
                                                continue;
                                            }
                                            final byte b24 = zze5;
                                            n10 = zzg;
                                            streetViewPanoramaCamera4 = streetViewPanoramaCamera;
                                            b15 = b24;
                                            continue;
                                        }
                                        final byte b25 = zze5;
                                        n10 = n9;
                                        zze4 = b13;
                                        b15 = b25;
                                        continue;
                                    }
                                    final byte b26 = zze5;
                                    n10 = n8;
                                    zze3 = b11;
                                    b15 = b26;
                                    continue;
                                }
                                final byte b27 = zze5;
                                n10 = n7;
                                zze2 = b9;
                                b15 = b27;
                                continue;
                            }
                            final byte b28 = zze5;
                            n10 = n6;
                            zze = b7;
                            b15 = b28;
                            continue;
                        }
                        final byte b29 = b15;
                        streetViewPanoramaCamera = streetViewPanoramaCamera4;
                        zzg = n10;
                        zze5 = b29;
                        break;
                    }
                }
            }
        }
        return new StreetViewPanoramaOptions(n3, streetViewPanoramaCamera2, zzo, latLng2, n2, b5, b4, b3, b2, b);
    }
    
    public StreetViewPanoramaOptions[] zzhj(final int n) {
        return new StreetViewPanoramaOptions[n];
    }
}
