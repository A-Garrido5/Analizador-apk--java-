// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzw implements Parcelable$Creator
{
    static void zza(final ResolveAccountResponse resolveAccountResponse, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, resolveAccountResponse.zzCY);
        zzb.zza(parcel, 2, resolveAccountResponse.zzZO, false);
        zzb.zza(parcel, 3, (Parcelable)resolveAccountResponse.zzoa(), n, false);
        zzb.zza(parcel, 4, resolveAccountResponse.zzob());
        zzb.zza(parcel, 5, resolveAccountResponse.zzoc());
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzY(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzby(n);
    }
    
    public ResolveAccountResponse zzY(final Parcel parcel) {
        IBinder zzp = null;
        final boolean a = zzi.a;
        final int zzab = zza.zzab(parcel);
        boolean zzc = false;
        boolean zzc2 = false;
        int zzg = 0;
        ConnectionResult connectionResult = null;
        boolean b = false;
        boolean b2 = false;
        ConnectionResult connectionResult2 = null;
        int n = 0;
        IBinder binder2 = null;
    Label_0283:
        while (true) {
            Label_0129: {
                if (parcel.dataPosition() >= zzab) {
                    b = zzc;
                    b2 = zzc2;
                    connectionResult2 = connectionResult;
                    final IBinder binder = zzp;
                    n = zzg;
                    binder2 = binder;
                    break Label_0129;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0244: {
                    int n2 = 0;
                    ConnectionResult connectionResult3 = null;
                    boolean b4 = false;
                    switch (zza.zzbA(zzaa)) {
                        case 1: {
                            break Label_0244;
                        }
                        case 2: {
                            break Label_0244;
                        }
                        case 3: {
                            break Label_0244;
                        }
                        case 4: {
                            break Label_0244;
                        }
                        case 5: {
                            final boolean b3 = zzc2;
                            n2 = zzg;
                            binder2 = zzp;
                            connectionResult3 = connectionResult;
                            b4 = b3;
                            break Label_0244;
                        }
                    }
                    while (true) {
                        int n3 = 0;
                        boolean b6 = false;
                    Label_0371:
                        while (true) {
                            Label_0393: {
                                Label_0301: {
                                    try {
                                        while (true) {
                                            zza.zzb(parcel, zzaa);
                                            final boolean b5 = zzc;
                                            n3 = zzg;
                                            binder2 = zzp;
                                            connectionResult3 = connectionResult;
                                            b6 = b5;
                                            if (!a) {
                                                break Label_0371;
                                            }
                                            b = b6;
                                            final boolean b7 = zzc2;
                                            connectionResult2 = connectionResult3;
                                            n = n3;
                                            b2 = b7;
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
                                            if (!a) {
                                                break Label_0301;
                                            }
                                            zzp = zza.zzp(parcel, zzaa);
                                            if (!a) {
                                                break Label_0301;
                                            }
                                            connectionResult = (ConnectionResult)zza.zza(parcel, zzaa, ConnectionResult.CREATOR);
                                            if (!a) {
                                                break Label_0301;
                                            }
                                            zzc2 = zza.zzc(parcel, zzaa);
                                            if (!a) {
                                                break Label_0301;
                                            }
                                            final boolean b8 = zzc2;
                                            n2 = zzg;
                                            binder2 = zzp;
                                            connectionResult3 = connectionResult;
                                            b4 = b8;
                                            zzc = zza.zzc(parcel, zzaa);
                                            if (!a) {
                                                break Label_0393;
                                            }
                                            final boolean b9 = b4;
                                            connectionResult = connectionResult3;
                                            zzp = binder2;
                                            zzg = n2;
                                            zzc2 = b9;
                                        }
                                    }
                                    catch (zza$zza zza$zza2) {
                                        throw zza$zza2;
                                    }
                                    break Label_0283;
                                }
                                final boolean b10 = zzc;
                                n3 = zzg;
                                binder2 = zzp;
                                connectionResult3 = connectionResult;
                                b6 = b10;
                                continue;
                            }
                            final boolean b11 = zzc;
                            n3 = n2;
                            zzc2 = b4;
                            b6 = b11;
                            continue;
                        }
                        final boolean b12 = b6;
                        connectionResult = connectionResult3;
                        zzp = binder2;
                        zzg = n3;
                        zzc = b12;
                        break;
                    }
                }
            }
        }
        return new ResolveAccountResponse(n, binder2, connectionResult2, b2, b);
    }
    
    public ResolveAccountResponse[] zzby(final int n) {
        return new ResolveAccountResponse[n];
    }
}
