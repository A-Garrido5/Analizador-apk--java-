// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class LocationRequestCreator implements Parcelable$Creator
{
    static void zza(final LocationRequest locationRequest, final Parcel parcel, final int n) {
        final int a = LocationServices$zza.a;
        final int zzac = zzb.zzac(parcel);
        try {
            zzb.zzc(parcel, 1, locationRequest.mPriority);
            zzb.zzc(parcel, 1000, locationRequest.getVersionCode());
            zzb.zza(parcel, 2, locationRequest.zzaxU);
            zzb.zza(parcel, 3, locationRequest.zzaxV);
            zzb.zza(parcel, 4, locationRequest.zzamB);
            zzb.zza(parcel, 5, locationRequest.zzaxz);
            zzb.zzc(parcel, 6, locationRequest.zzaxW);
            zzb.zza(parcel, 7, locationRequest.zzaxX);
            zzb.zza(parcel, 8, locationRequest.zzaxY);
            zzb.zzH(parcel, zzac);
            if (com.google.android.gms.location.internal.zzb.b) {
                LocationServices$zza.a = a + 1;
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
    }
    
    public LocationRequest createFromParcel(final Parcel parcel) {
        final int i = LocationServices$zza.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        int zzg2 = 102;
        long zzi = 3600000L;
        long zzi2 = 600000L;
        boolean zzc = false;
        long zzi3 = Long.MAX_VALUE;
        int zzg3 = Integer.MAX_VALUE;
        float zzl = 0.0f;
        long zzi4 = 0L;
        long n = 0L;
        int n2 = 0;
        int n3 = 0;
        long n4 = 0L;
        long n5 = 0L;
        float n6 = 0.0f;
        int n7 = 0;
        boolean b = false;
        long n8 = 0L;
    Label_0347:
        while (true) {
            Label_0154: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0154;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0327: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0327;
                        }
                        case 1: {
                            break Label_0327;
                        }
                        case 1000: {
                            break Label_0327;
                        }
                        case 2: {
                            break Label_0327;
                        }
                        case 3: {
                            break Label_0327;
                        }
                        case 4: {
                            break Label_0327;
                        }
                        case 5: {
                            break Label_0327;
                        }
                        case 6: {
                            break Label_0327;
                        }
                        case 7: {
                            break Label_0327;
                        }
                        case 8: {
                            break Label_0327;
                        }
                    }
                    try {
                        while (true) {
                            zza.zzb(parcel, zzaa);
                            while (i != 0) {
                                n = zzi4;
                                n2 = zzg;
                                n3 = zzg3;
                                n4 = zzi3;
                                n5 = zzi;
                                n6 = zzl;
                                n7 = zzg2;
                                b = zzc;
                                n8 = zzi2;
                                try {
                                    if (parcel.dataPosition() != zzab) {
                                        throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                    }
                                    break Label_0347;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg2 = zza.zzg(parcel, zzaa);
                                if (i != 0) {
                                    zzg = zza.zzg(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzi = zza.zzi(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzi2 = zza.zzi(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzc = zza.zzc(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzi3 = zza.zzi(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzg3 = zza.zzg(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzl = zza.zzl(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzi4 = zza.zzi(parcel, zzaa);
                                    if (i != 0) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0347;
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
        return new LocationRequest(n2, n7, n5, n8, b, n4, n3, n6, n);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.createFromParcel(parcel);
    }
    
    public LocationRequest[] newArray(final int n) {
        return new LocationRequest[n];
    }
    
    public Object[] newArray(final int n) {
        return this.newArray(n);
    }
}
