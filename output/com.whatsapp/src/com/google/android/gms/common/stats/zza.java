// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zza implements Parcelable$Creator
{
    static void zza(final ConnectionEvent connectionEvent, final Parcel parcel, final int n) {
        final boolean a = zzd.a;
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, connectionEvent.zzCY);
        zzb.zza(parcel, 2, connectionEvent.getTimeMillis());
        zzb.zza(parcel, 4, connectionEvent.zzoG(), false);
        zzb.zza(parcel, 5, connectionEvent.zzoH(), false);
        zzb.zza(parcel, 6, connectionEvent.zzoI(), false);
        zzb.zza(parcel, 7, connectionEvent.zzoJ(), false);
        zzb.zza(parcel, 8, connectionEvent.zzoK(), false);
        zzb.zza(parcel, 10, connectionEvent.zzoN());
        zzb.zza(parcel, 11, connectionEvent.zzoM());
        zzb.zzc(parcel, 12, connectionEvent.getEventType());
        zzb.zza(parcel, 13, connectionEvent.zzoL(), false);
        zzb.zzH(parcel, zzac);
        if (a) {
            ++zzu.a;
        }
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzam(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzbM(n);
    }
    
    public ConnectionEvent zzam(final Parcel parcel) {
        final boolean a = zzd.a;
        final int zzab = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int zzg = 0;
        long zzi = 0L;
        int zzg2 = 0;
        String zzo = null;
        String zzo2 = null;
        String zzo3 = null;
        String zzo4 = null;
        String zzo5 = null;
        String zzo6 = null;
        long zzi2 = 0L;
        long zzi3 = 0L;
        long n = 0L;
        long n2 = 0L;
        int n3 = 0;
        String s = null;
        long n4 = 0L;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        int n5 = 0;
    Label_0363:
        while (true) {
            Label_0138: {
                if (parcel.dataPosition() >= zzab) {
                    break Label_0138;
                }
                final int zzaa = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                Label_0343: {
                    switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(zzaa)) {
                        default: {
                            break Label_0343;
                        }
                        case 1: {
                            break Label_0343;
                        }
                        case 2: {
                            break Label_0343;
                        }
                        case 4: {
                            break Label_0343;
                        }
                        case 5: {
                            break Label_0343;
                        }
                        case 6: {
                            break Label_0343;
                        }
                        case 7: {
                            break Label_0343;
                        }
                        case 8: {
                            break Label_0343;
                        }
                        case 10: {
                            break Label_0343;
                        }
                        case 11: {
                            break Label_0343;
                        }
                        case 12: {
                            break Label_0343;
                        }
                        case 13: {
                            break Label_0343;
                        }
                    }
                    try {
                        while (true) {
                            com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzaa);
                            while (a) {
                                n = zzi3;
                                n2 = zzi2;
                                n3 = zzg;
                                s = zzo6;
                                n4 = zzi;
                                s2 = zzo3;
                                s3 = zzo2;
                                s4 = zzo;
                                s5 = zzo4;
                                s6 = zzo5;
                                n5 = zzg2;
                                try {
                                    if (parcel.dataPosition() != zzab) {
                                        throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                    }
                                    break Label_0363;
                                }
                                catch (zza$zza zza$zza) {
                                    throw zza$zza;
                                }
                                zzg = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                                if (a) {
                                    zzi = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzo = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzo2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzo3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzo4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzo5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzi2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzi3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzg2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzaa);
                                    if (!a) {
                                        continue;
                                    }
                                    zzo6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, zzaa);
                                    if (a) {
                                        continue Block_5;
                                    }
                                    continue;
                                }
                            }
                            continue Label_0363;
                            Block_5:;
                        }
                    }
                    catch (zza$zza zza$zza2) {
                        throw zza$zza2;
                    }
                }
            }
            break;
        }
        while (true) {
            final ConnectionEvent connectionEvent = new ConnectionEvent(n3, n4, n5, s4, s3, s2, s5, s6, s, n2, n);
            while (true) {
                Label_0429: {
                    try {
                        if (zzu.a != 0) {
                            if (!a) {
                                break Label_0429;
                            }
                            final boolean a2 = false;
                            zzd.a = a2;
                        }
                        return connectionEvent;
                    }
                    catch (zza$zza zza$zza3) {
                        try {
                            throw zza$zza3;
                        }
                        catch (zza$zza zza$zza4) {
                            throw zza$zza4;
                        }
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
    
    public ConnectionEvent[] zzbM(final int n) {
        return new ConnectionEvent[n];
    }
}
