// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzk implements Parcelable$Creator
{
    static void zza(final Status status, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, status.getStatusCode());
        zzb.zzc(parcel, 1000, status.getVersionCode());
        zzb.zza(parcel, 2, status.getStatusMessage(), false);
        zzb.zza(parcel, 3, (Parcelable)status.zzmT(), n, false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzQ(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzba(n);
    }
    
    public Status zzQ(final Parcel parcel) {
        PendingIntent pendingIntent = null;
        final boolean a = Api.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        int zzg2 = 0;
        String zzo = null;
    Label_0198:
        while (true) {
            Label_0094: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0094;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0173: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0173;
                        }
                        case 1: {
                            break Label_0173;
                        }
                        case 1000: {
                            break Label_0173;
                        }
                        case 2: {
                            break Label_0173;
                        }
                        case 3: {
                            break Label_0173;
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
                                    break Label_0198;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = zza.zzg(parcel, zzaa);
                                if (a) {
                                    zzg2 = zza.zzg(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzo = zza.zzo(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    pendingIntent = (PendingIntent)zza.zza(parcel, zzaa, PendingIntent.CREATOR);
                                    if (a) {
                                        continue Block_4;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0198;
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
        return new Status(zzg2, zzg, zzo, pendingIntent);
    }
    
    public Status[] zzba(final int n) {
        return new Status[n];
    }
}
