// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzb implements Parcelable$Creator
{
    static void zza(final ConnectionResult connectionResult, final Parcel parcel, final int n) {
        final int zzac = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, connectionResult.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 2, connectionResult.getErrorCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, (Parcelable)connectionResult.getResolution(), n, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzO(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzaS(n);
    }
    
    public ConnectionResult zzO(final Parcel parcel) {
        int zzg = 0;
        final boolean a = GooglePlayServicesUtil.a;
        final int zzab = zza.zzab(parcel);
        PendingIntent pendingIntent = null;
        int zzg2 = 0;
    Label_0166:
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
                                zzg2 = zza.zzg(parcel, zzaa);
                                if (a) {
                                    zzg = zza.zzg(parcel, zzaa);
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
        return new ConnectionResult(zzg2, zzg, pendingIntent);
    }
    
    public ConnectionResult[] zzaS(final int n) {
        return new ConnectionResult[n];
    }
}
