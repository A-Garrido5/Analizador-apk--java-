// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzl implements Parcelable$Creator
{
    static void zza(final LocationRequestUpdateData locationRequestUpdateData, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, locationRequestUpdateData.zzazf);
        zzb.zzc(parcel, 1000, locationRequestUpdateData.getVersionCode());
        zzb.zza(parcel, 2, (Parcelable)locationRequestUpdateData.zzazg, n, false);
        zzb.zza(parcel, 3, locationRequestUpdateData.zzuy(), false);
        zzb.zza(parcel, 4, (Parcelable)locationRequestUpdateData.mPendingIntent, n, false);
        zzb.zza(parcel, 5, locationRequestUpdateData.zzuz(), false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzel(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzgF(n);
    }
    
    public LocationRequestUpdateData zzel(final Parcel parcel) {
        LocationRequestInternal locationRequestInternal = null;
        final int c = zzj.c;
        final int zzab = zza.zzab(parcel);
        IBinder zzp = null;
        int zzg = 1;
        int zzg2 = 0;
        PendingIntent pendingIntent = null;
        IBinder zzp2 = null;
        IBinder binder = null;
        int n = 0;
        PendingIntent pendingIntent2 = null;
        int n2 = 0;
        IBinder binder2 = null;
        LocationRequestInternal locationRequestInternal2 = null;
    Label_0309:
        while (true) {
            Label_0161: {
                if (parcel.dataPosition() >= zzab) {
                    binder = zzp2;
                    n = zzg2;
                    pendingIntent2 = pendingIntent;
                    n2 = zzg;
                    binder2 = zzp;
                    locationRequestInternal2 = locationRequestInternal;
                    break Label_0161;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0278: {
                    LocationRequestInternal locationRequestInternal3 = null;
                    PendingIntent pendingIntent4 = null;
                    switch (zza.zzbA(zzaa)) {
                        case 1: {
                            break Label_0278;
                        }
                        case 1000: {
                            break Label_0278;
                        }
                        case 2: {
                            break Label_0278;
                        }
                        case 3: {
                            break Label_0278;
                        }
                        case 4: {
                            break Label_0278;
                        }
                        case 5: {
                            final PendingIntent pendingIntent3 = pendingIntent;
                            locationRequestInternal3 = locationRequestInternal;
                            pendingIntent4 = pendingIntent3;
                            break Label_0278;
                        }
                    }
                    while (true) {
                        PendingIntent pendingIntent5 = null;
                        IBinder binder4 = null;
                        IBinder binder5 = null;
                    Label_0418:
                        while (true) {
                            Label_0356: {
                                Label_0329: {
                                    try {
                                        while (true) {
                                            zza.zzb(parcel, zzaa);
                                            final IBinder binder3 = zzp2;
                                            pendingIntent5 = pendingIntent;
                                            binder4 = zzp;
                                            locationRequestInternal2 = locationRequestInternal;
                                            binder5 = binder3;
                                            if (c == 0) {
                                                break Label_0418;
                                            }
                                            binder = binder5;
                                            final PendingIntent pendingIntent6 = pendingIntent5;
                                            n = zzg2;
                                            pendingIntent2 = pendingIntent6;
                                            final int n3 = zzg;
                                            binder2 = binder4;
                                            n2 = n3;
                                            try {
                                                if (parcel.dataPosition() != zzab) {
                                                    throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                                }
                                                break;
                                            }
                                            catch (zza$zza zza$zza) {
                                                throw zza$zza;
                                            }
                                            zzg = zza.zzg(parcel, zzaa);
                                            if (c == 0) {
                                                break Label_0356;
                                            }
                                            zzg2 = zza.zzg(parcel, zzaa);
                                            if (c == 0) {
                                                break Label_0356;
                                            }
                                            locationRequestInternal = (LocationRequestInternal)zza.zza(parcel, zzaa, (Parcelable$Creator)LocationRequestInternal.CREATOR);
                                            if (c == 0) {
                                                break Label_0356;
                                            }
                                            zzp = zza.zzp(parcel, zzaa);
                                            if (c == 0) {
                                                break Label_0356;
                                            }
                                            locationRequestInternal3 = locationRequestInternal;
                                            pendingIntent4 = (PendingIntent)zza.zza(parcel, zzaa, PendingIntent.CREATOR);
                                            if (c == 0) {
                                                break Label_0329;
                                            }
                                            zzp2 = zza.zzp(parcel, zzaa);
                                            if (c == 0) {
                                                break Label_0329;
                                            }
                                            final PendingIntent pendingIntent7 = pendingIntent4;
                                            locationRequestInternal = locationRequestInternal3;
                                            pendingIntent = pendingIntent7;
                                        }
                                    }
                                    catch (zza$zza zza$zza2) {
                                        throw zza$zza2;
                                    }
                                    break Label_0309;
                                }
                                final IBinder binder6 = zzp2;
                                pendingIntent5 = pendingIntent4;
                                binder5 = binder6;
                                final IBinder binder7 = zzp;
                                locationRequestInternal2 = locationRequestInternal3;
                                binder4 = binder7;
                                continue;
                            }
                            final IBinder binder8 = zzp2;
                            pendingIntent5 = pendingIntent;
                            binder4 = zzp;
                            locationRequestInternal2 = locationRequestInternal;
                            binder5 = binder8;
                            continue;
                        }
                        final IBinder binder9 = binder5;
                        locationRequestInternal = locationRequestInternal2;
                        zzp = binder4;
                        pendingIntent = pendingIntent5;
                        zzp2 = binder9;
                        break;
                    }
                }
            }
        }
        return new LocationRequestUpdateData(n, n2, locationRequestInternal2, binder2, pendingIntent2, binder);
    }
    
    public LocationRequestUpdateData[] zzgF(final int n) {
        return new LocationRequestUpdateData[n];
    }
}
