// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzh implements Parcelable$Creator
{
    static void zza(final GetServiceRequest getServiceRequest, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, getServiceRequest.version);
        zzb.zzc(parcel, 2, getServiceRequest.zzaad);
        zzb.zzc(parcel, 3, getServiceRequest.zzaae);
        zzb.zza(parcel, 4, getServiceRequest.zzaaf, false);
        zzb.zza(parcel, 5, getServiceRequest.zzaag, false);
        zzb.zza(parcel, 6, (Parcelable[])getServiceRequest.zzaah, n, false);
        zzb.zza(parcel, 7, getServiceRequest.zzaai, false);
        zzb.zza(parcel, 8, (Parcelable)getServiceRequest.zzaaj, n, false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzW(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzbr(n);
    }
    
    public GetServiceRequest zzW(final Parcel parcel) {
        final boolean a = zzi.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        int zzg2 = 0;
        int zzg3 = 0;
        String zzo = null;
        IBinder zzp = null;
        Scope[] array = null;
        Bundle zzq = null;
        Account account = null;
        Account account2 = null;
        int n = 0;
        Bundle bundle = null;
        int n2 = 0;
        Scope[] array2 = null;
        int n3 = 0;
        IBinder binder2 = null;
    Label_0339:
        while (true) {
            Label_0166: {
                if (parcel.dataPosition() >= zzab) {
                    account2 = account;
                    n = zzg;
                    bundle = zzq;
                    n2 = zzg2;
                    array2 = array;
                    final IBinder binder = zzp;
                    n3 = zzg3;
                    binder2 = binder;
                    break Label_0166;
                }
                final int zzaa = zza.zzaa(parcel);
                Label_0297: {
                    switch (zza.zzbA(zzaa)) {
                        default: {
                            break Label_0297;
                        }
                        case 1: {
                            break Label_0297;
                        }
                        case 2: {
                            break Label_0297;
                        }
                        case 3: {
                            break Label_0297;
                        }
                        case 4: {
                            break Label_0297;
                        }
                        case 5: {
                            break Label_0297;
                        }
                        case 6: {
                            break Label_0297;
                        }
                        case 7: {
                            break Label_0297;
                        }
                        case 8: {
                            break Label_0297;
                        }
                    }
                    while (true) {
                        Bundle bundle2 = null;
                        Scope[] array3 = null;
                        Account account4 = null;
                    Label_0417:
                        while (true) {
                            Scope[] array4 = null;
                            Label_0436: {
                                Label_0363: {
                                    try {
                                        while (true) {
                                            zza.zzb(parcel, zzaa);
                                            final Account account3 = account;
                                            bundle2 = zzq;
                                            array3 = array;
                                            account4 = account3;
                                            if (!a) {
                                                break Label_0417;
                                            }
                                            account2 = account4;
                                            final Bundle bundle3 = bundle2;
                                            n = zzg;
                                            bundle = bundle3;
                                            final IBinder binder3 = zzp;
                                            n3 = zzg3;
                                            binder2 = binder3;
                                            final int n4 = zzg2;
                                            array2 = array3;
                                            n2 = n4;
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
                                                break Label_0363;
                                            }
                                            zzg2 = zza.zzg(parcel, zzaa);
                                            if (!a) {
                                                break Label_0363;
                                            }
                                            zzg3 = zza.zzg(parcel, zzaa);
                                            if (!a) {
                                                break Label_0363;
                                            }
                                            zzo = zza.zzo(parcel, zzaa);
                                            if (!a) {
                                                break Label_0363;
                                            }
                                            zzp = zza.zzp(parcel, zzaa);
                                            if (!a) {
                                                break Label_0363;
                                            }
                                            array = (Scope[])zza.zzb(parcel, zzaa, Scope.CREATOR);
                                            if (!a) {
                                                break Label_0363;
                                            }
                                            zzq = zza.zzq(parcel, zzaa);
                                            if (!a) {
                                                break Label_0363;
                                            }
                                            array4 = array;
                                            account4 = (Account)zza.zza(parcel, zzaa, Account.CREATOR);
                                            if (!a) {
                                                break Label_0436;
                                            }
                                            final Account account5 = account4;
                                            array = array4;
                                            account = account5;
                                        }
                                    }
                                    catch (zza$zza zza$zza2) {
                                        throw zza$zza2;
                                    }
                                    break Label_0339;
                                }
                                final Account account6 = account;
                                bundle2 = zzq;
                                array3 = array;
                                account4 = account6;
                                continue;
                            }
                            final Bundle bundle4 = zzq;
                            array3 = array4;
                            bundle2 = bundle4;
                            continue;
                        }
                        final Account account7 = account4;
                        array = array3;
                        zzq = bundle2;
                        account = account7;
                        break;
                    }
                }
            }
        }
        return new GetServiceRequest(n, n2, n3, zzo, binder2, array2, bundle, account2);
    }
    
    public GetServiceRequest[] zzbr(final int n) {
        return new GetServiceRequest[n];
    }
}
