// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzc implements Parcelable$Creator
{
    static void zza(final ClientIdentity clientIdentity, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, clientIdentity.uid);
        zzb.zzc(parcel, 1000, clientIdentity.getVersionCode());
        zzb.zza(parcel, 2, clientIdentity.packageName, false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzej(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzgD(n);
    }
    
    public ClientIdentity zzej(final Parcel parcel) {
        int zzg = 0;
        final int i = zzj.c;
        final int zzab = zza.zzab(parcel);
        String zzo = null;
        int zzg2 = 0;
    Label_0168:
        while (true) {
            Label_0082: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0082;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0148: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0148;
                        }
                        case 1: {
                            break Label_0148;
                        }
                        case 1000: {
                            break Label_0148;
                        }
                        case 2: {
                            break Label_0148;
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
                                    break Label_0168;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = zza.zzg(parcel, zzaa);
                                if (i != 0) {
                                    zzg2 = zza.zzg(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzo = zza.zzo(parcel, zzaa);
                                    if (i != 0) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0168;
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
        return new ClientIdentity(zzg2, zzg, zzo);
    }
    
    public ClientIdentity[] zzgD(final int n) {
        return new ClientIdentity[n];
    }
}
