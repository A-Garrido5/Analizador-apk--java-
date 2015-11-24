// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import java.util.List;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzc implements Parcelable$Creator
{
    static void zza(final CheckServerAuthResult checkServerAuthResult, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, checkServerAuthResult.zzCY);
        zzb.zza(parcel, 2, checkServerAuthResult.zzaJY);
        zzb.zzc(parcel, 3, checkServerAuthResult.zzaJZ, false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzfZ(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zziP(n);
    }
    
    public CheckServerAuthResult zzfZ(final Parcel parcel) {
        boolean zzc = false;
        final int i = zze$zza.a;
        final int zzab = zza.zzab(parcel);
        List zzc2 = null;
        int zzg = 0;
    Label_0163:
        while (true) {
            Label_0074: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0074;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0140: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0140;
                        }
                        case 1: {
                            break Label_0140;
                        }
                        case 2: {
                            break Label_0140;
                        }
                        case 3: {
                            break Label_0140;
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
                                    break Label_0163;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = zza.zzg(parcel, zzaa);
                                if (i != 0) {
                                    zzc = zza.zzc(parcel, zzaa);
                                    if (i == 0) {
                                        continue;
                                    }
                                    zzc2 = zza.zzc(parcel, zzaa, Scope.CREATOR);
                                    if (i != 0) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0163;
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
        return new CheckServerAuthResult(zzg, zzc, zzc2);
    }
    
    public CheckServerAuthResult[] zziP(final int n) {
        return new CheckServerAuthResult[n];
    }
}
