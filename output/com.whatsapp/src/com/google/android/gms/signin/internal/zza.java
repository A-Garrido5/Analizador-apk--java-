// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zza implements Parcelable$Creator
{
    static void zza(final AuthAccountResult authAccountResult, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, authAccountResult.zzCY);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzfY(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zziO(n);
    }
    
    public AuthAccountResult zzfY(final Parcel parcel) {
        final int i = zze$zza.a;
        final int zzab = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int zzg = 0;
    Label_0119:
        while (true) {
            Label_0058: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0058;
                }
                final int zzaa = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                Label_0099: {
                    switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(zzaa)) {
                        default: {
                            break Label_0099;
                        }
                        case 1: {
                            break Label_0099;
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
                                    break Label_0119;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                                if (i != 0) {
                                    continue Block_4;
                                }
                            }
                            continue Label_0119;
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
        return new AuthAccountResult(zzg);
    }
    
    public AuthAccountResult[] zziO(final int n) {
        return new AuthAccountResult[n];
    }
}
