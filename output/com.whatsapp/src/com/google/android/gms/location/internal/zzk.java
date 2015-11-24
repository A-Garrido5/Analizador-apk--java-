// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import java.util.List;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzk implements Parcelable$Creator
{
    static void zza(final LocationRequestInternal locationRequestInternal, final Parcel parcel, final int n) {
        final int c = zzj.c;
        final int zzac = zzb.zzac(parcel);
        try {
            zzb.zza(parcel, 1, (Parcelable)locationRequestInternal.zzamz, n, false);
            zzb.zzc(parcel, 1000, locationRequestInternal.getVersionCode());
            zzb.zza(parcel, 2, locationRequestInternal.zzazb);
            zzb.zza(parcel, 3, locationRequestInternal.zzazc);
            zzb.zza(parcel, 4, locationRequestInternal.zzazd);
            zzb.zzc(parcel, 5, locationRequestInternal.zzaze, false);
            zzb.zza(parcel, 6, locationRequestInternal.mTag, false);
            zzb.zzH(parcel, zzac);
            if (com.google.android.gms.location.internal.zzb.b) {
                zzj.c = c + 1;
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzek(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzgE(n);
    }
    
    public LocationRequestInternal zzek(final Parcel parcel) {
        LocationRequest locationRequest = null;
        final int i = zzj.c;
        final int zzab = zza.zzab(parcel);
        final List zzaza = LocationRequestInternal.zzaza;
        boolean zzc = true;
        boolean zzc2 = false;
        int zzg = 0;
        boolean zzc3 = true;
        List zzc4 = zzaza;
        String zzo = null;
        String s = null;
        int n = 0;
        List list = null;
        LocationRequest locationRequest2 = null;
        boolean b2 = false;
        boolean b3 = false;
    Label_0371:
        while (true) {
            Label_0201: {
                if (parcel.dataPosition() >= zzab) {
                    s = zzo;
                    n = zzg;
                    list = zzc4;
                    locationRequest2 = locationRequest;
                    final boolean b = zzc2;
                    b2 = zzc3;
                    b3 = b;
                    break Label_0201;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0324: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0324;
                        }
                        case 1: {
                            break Label_0324;
                        }
                        case 1000: {
                            break Label_0324;
                        }
                        case 2: {
                            break Label_0324;
                        }
                        case 3: {
                            break Label_0324;
                        }
                        case 4: {
                            break Label_0324;
                        }
                        case 5: {
                            break Label_0324;
                        }
                        case 6: {
                            break Label_0324;
                        }
                    }
                    while (true) {
                        List list2 = null;
                        boolean b4 = false;
                        boolean b5 = false;
                        boolean b6 = false;
                        LocationRequest locationRequest3 = null;
                        String s3 = null;
                    Label_0543:
                        while (true) {
                            Label_0483: {
                                Label_0453: {
                                    Label_0423: {
                                        Label_0393: {
                                            try {
                                                while (true) {
                                                    zza.zzb(parcel, zzaa);
                                                    final String s2 = zzo;
                                                    list2 = zzc4;
                                                    b4 = zzc3;
                                                    b5 = zzc;
                                                    b6 = zzc2;
                                                    locationRequest3 = locationRequest;
                                                    s3 = s2;
                                                    while (i != 0) {
                                                        s = s3;
                                                        final List list3 = list2;
                                                        n = zzg;
                                                        list = list3;
                                                        final boolean b7 = b5;
                                                        b3 = b6;
                                                        zzc = b7;
                                                        final LocationRequest locationRequest4 = locationRequest3;
                                                        b2 = b4;
                                                        locationRequest2 = locationRequest4;
                                                        try {
                                                            if (parcel.dataPosition() != zzab) {
                                                                throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                                            }
                                                            break Label_0371;
                                                        }
                                                        catch (zza$zza zza$zza) {
                                                            throw zza$zza;
                                                        }
                                                        locationRequest = (LocationRequest)zza.zza(parcel, zzaa, (Parcelable$Creator)LocationRequest.CREATOR);
                                                        if (i != 0) {
                                                            zzg = zza.zzg(parcel, zzaa);
                                                            if (i != 0) {
                                                                zzc2 = zza.zzc(parcel, zzaa);
                                                                if (i == 0) {
                                                                    break Label_0483;
                                                                }
                                                                zzc = zza.zzc(parcel, zzaa);
                                                                if (i == 0) {
                                                                    break Label_0453;
                                                                }
                                                                zzc3 = zza.zzc(parcel, zzaa);
                                                                if (i == 0) {
                                                                    break Label_0423;
                                                                }
                                                                zzc4 = zza.zzc(parcel, zzaa, (Parcelable$Creator)ClientIdentity.CREATOR);
                                                                if (i == 0) {
                                                                    break Label_0393;
                                                                }
                                                                zzo = zza.zzo(parcel, zzaa);
                                                                if (i != 0) {
                                                                    continue Label_0324;
                                                                }
                                                            }
                                                        }
                                                        final String s4 = zzo;
                                                        list2 = zzc4;
                                                        b4 = zzc3;
                                                        b5 = zzc;
                                                        b6 = zzc2;
                                                        locationRequest3 = locationRequest;
                                                        s3 = s4;
                                                    }
                                                    break Label_0543;
                                                }
                                            }
                                            catch (zza$zza zza$zza2) {
                                                throw zza$zza2;
                                            }
                                            break Label_0371;
                                        }
                                        final String s5 = zzo;
                                        list2 = zzc4;
                                        b4 = zzc3;
                                        b5 = zzc;
                                        b6 = zzc2;
                                        locationRequest3 = locationRequest;
                                        s3 = s5;
                                        continue;
                                    }
                                    final String s6 = zzo;
                                    list2 = zzc4;
                                    b4 = zzc3;
                                    b5 = zzc;
                                    b6 = zzc2;
                                    locationRequest3 = locationRequest;
                                    s3 = s6;
                                    continue;
                                }
                                final String s7 = zzo;
                                list2 = zzc4;
                                b4 = zzc3;
                                b5 = zzc;
                                b6 = zzc2;
                                locationRequest3 = locationRequest;
                                s3 = s7;
                                continue;
                            }
                            final String s8 = zzo;
                            list2 = zzc4;
                            b4 = zzc3;
                            b5 = zzc;
                            b6 = zzc2;
                            locationRequest3 = locationRequest;
                            s3 = s8;
                            continue;
                        }
                        final String s9 = s3;
                        locationRequest = locationRequest3;
                        zzc2 = b6;
                        zzc = b5;
                        zzc3 = b4;
                        zzc4 = list2;
                        zzo = s9;
                        break;
                    }
                }
            }
        }
        return new LocationRequestInternal(n, locationRequest2, b3, zzc, b2, list, s);
    }
    
    public LocationRequestInternal[] zzgE(final int n) {
        return new LocationRequestInternal[n];
    }
}
