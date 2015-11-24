// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.copresence.internal;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zza implements Parcelable$Creator
{
    static void zza(final CopresenceApiOptions copresenceApiOptions, final Parcel parcel, final int n) {
        final int a = CopresenceApiOptions.a;
        final int zzac = zzb.zzac(parcel);
        try {
            zzb.zzc(parcel, 1, copresenceApiOptions.zzCY);
            zzb.zza(parcel, 2, copresenceApiOptions.zzayo);
            zzb.zza(parcel, 3, copresenceApiOptions.zzayp, false);
            zzb.zzH(parcel, zzac);
            if (com.google.android.gms.location.internal.zzb.b) {
                CopresenceApiOptions.a = a + 1;
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzei(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzgC(n);
    }
    
    public CopresenceApiOptions zzei(final Parcel parcel) {
        final int i = CopresenceApiOptions.a;
        final int zzab = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        String zzo = null;
        boolean zzc = false;
        int zzg = 0;
    Label_0188:
        while (true) {
            Label_0074: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0074;
                }
                final int zzaa = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                Label_0157: {
                    switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(zzaa)) {
                        default: {
                            break Label_0157;
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
                    try {
                        while (true) {
                            com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzaa);
                            while (i != 0) {
                                try {
                                    if (parcel.dataPosition() != zzab) {
                                        throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                    }
                                    break Label_0188;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                                if (i != 0) {
                                    while (true) {
                                        while (true) {
                                            try {
                                                if (com.google.android.gms.location.internal.zzb.b) {
                                                    final boolean b = false;
                                                    com.google.android.gms.location.internal.zzb.b = b;
                                                    zzc = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, zzaa);
                                                    if (i == 0) {
                                                        break;
                                                    }
                                                    zzo = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                                                    if (i != 0) {
                                                        continue Label_0157;
                                                    }
                                                    break;
                                                }
                                            }
                                            catch (zza$zza zza$zza2) {
                                                throw zza$zza2;
                                            }
                                            final boolean b = true;
                                            continue;
                                        }
                                    }
                                }
                            }
                            continue Label_0188;
                        }
                    }
                    catch (zza$zza zza$zza3) {
                        throw zza$zza3;
                    }
                }
            }
            break;
        }
        return new CopresenceApiOptions(zzg, zzc, zzo);
    }
    
    public CopresenceApiOptions[] zzgC(final int n) {
        return new CopresenceApiOptions[n];
    }
}
