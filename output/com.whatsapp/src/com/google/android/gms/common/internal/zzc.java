// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzc implements Parcelable$Creator
{
    static void zza(final AuthAccountRequest authAccountRequest, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, authAccountRequest.zzCY);
        zzb.zza(parcel, 2, authAccountRequest.zzZO, false);
        zzb.zza(parcel, 3, (Parcelable[])authAccountRequest.zzZP, n, false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzU(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzbp(n);
    }
    
    public AuthAccountRequest zzU(final Parcel parcel) {
        Scope[] array = null;
        final boolean a = zzi.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        IBinder zzp = null;
    Label_0166:
        while (true) {
            Label_0074: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0074;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0141: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0141;
                        }
                        case 1: {
                            break Label_0141;
                        }
                        case 2: {
                            break Label_0141;
                        }
                        case 3: {
                            break Label_0141;
                        }
                    }
                    try {
                        while (true) {
                            zza.zzb(parcel, zzaa);
                            while (a) {
                                try {
                                    if (parcel.dataPosition() != zzab) {
                                        throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                    }
                                    break Label_0166;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = zza.zzg(parcel, zzaa);
                                if (a) {
                                    zzp = zza.zzp(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    array = (Scope[])zza.zzb(parcel, zzaa, Scope.CREATOR);
                                    if (a) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0166;
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
        return new AuthAccountRequest(zzg, zzp, array);
    }
    
    public AuthAccountRequest[] zzbp(final int n) {
        return new AuthAccountRequest[n];
    }
}
