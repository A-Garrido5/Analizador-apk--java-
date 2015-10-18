// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzj implements Parcelable$Creator
{
    static void zza(final Scope scope, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, scope.zzCY);
        zzb.zza(parcel, 2, scope.zzmS(), false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzP(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzaZ(n);
    }
    
    public Scope zzP(final Parcel parcel) {
        final boolean a = Api.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        String zzo = null;
    Label_0139:
        while (true) {
            Label_0066: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0066;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0119: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0119;
                        }
                        case 1: {
                            break Label_0119;
                        }
                        case 2: {
                            break Label_0119;
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
                                    break Label_0139;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = zza.zzg(parcel, zzaa);
                                if (a) {
                                    zzo = zza.zzo(parcel, zzaa);
                                    if (a) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0139;
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
        return new Scope(zzg, zzo);
    }
    
    public Scope[] zzaZ(final int n) {
        return new Scope[n];
    }
}
