// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzv implements Parcelable$Creator
{
    static void zza(final ResolveAccountRequest resolveAccountRequest, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, resolveAccountRequest.zzCY);
        zzb.zza(parcel, 2, (Parcelable)resolveAccountRequest.getAccount(), n, false);
        zzb.zzc(parcel, 3, resolveAccountRequest.getSessionId());
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzX(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzbx(n);
    }
    
    public ResolveAccountRequest zzX(final Parcel parcel) {
        final boolean a = zzi.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        int zzg2 = 0;
        Account account = null;
        int n2 = 0;
        Account account2 = null;
        int n3 = 0;
    Label_0197:
        while (true) {
            Label_0230: {
                Label_0090: {
                    if (parcel.dataPosition() >= zzab) {
                        final int n = zzg;
                        n2 = zzg2;
                        account2 = account;
                        n3 = n;
                        break Label_0090;
                    }
                    final int zzaa = zza.zzaa(parcel);
                    Label_0161: {
                        switch (zza.zzbA(zzaa)) {
                            default: {
                                break Label_0161;
                            }
                            case 1: {
                                break Label_0161;
                            }
                            case 2: {
                                break Label_0161;
                            }
                            case 3: {
                                break Label_0161;
                            }
                        }
                        try {
                            while (true) {
                                zza.zzb(parcel, zzaa);
                                final int n4 = zzg;
                                n2 = zzg2;
                                account2 = account;
                                n3 = n4;
                                while (a) {
                                    try {
                                        if (parcel.dataPosition() != zzab) {
                                            throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                        }
                                        break Label_0197;
                                    }
                                    catch (zza$zza zza$zza) {
                                        throw zza$zza;
                                    }
                                    zzg2 = zza.zzg(parcel, zzaa);
                                    if (a) {
                                        account = (Account)zza.zza(parcel, zzaa, Account.CREATOR);
                                        if (a) {
                                            zzg = zza.zzg(parcel, zzaa);
                                            if (a) {
                                                continue Label_0161;
                                            }
                                        }
                                    }
                                    final int n5 = zzg;
                                    n2 = zzg2;
                                    account2 = account;
                                    n3 = n5;
                                }
                                break Label_0230;
                            }
                        }
                        catch (zza$zza zza$zza2) {
                            throw zza$zza2;
                        }
                    }
                }
                break;
            }
            final int n6 = n3;
            account = account2;
            zzg2 = n2;
            zzg = n6;
        }
        return new ResolveAccountRequest(n2, account2, n3);
    }
    
    public ResolveAccountRequest[] zzbx(final int n) {
        return new ResolveAccountRequest[n];
    }
}
