// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.safeparcel.zza;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzaa implements Parcelable$Creator
{
    static void zza(final ValidateAccountRequest validateAccountRequest, final Parcel parcel, final int n) {
        final int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, validateAccountRequest.zzCY);
        zzb.zzc(parcel, 2, validateAccountRequest.zzod());
        zzb.zza(parcel, 3, validateAccountRequest.zzZO, false);
        zzb.zza(parcel, 4, (Parcelable[])validateAccountRequest.zzoe(), n, false);
        zzb.zza(parcel, 5, validateAccountRequest.zzof(), false);
        zzb.zza(parcel, 6, validateAccountRequest.getCallingPackage(), false);
        zzb.zzH(parcel, zzac);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzZ(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzbz(n);
    }
    
    public ValidateAccountRequest zzZ(final Parcel parcel) {
        Scope[] array = null;
        final boolean a = zzi.a;
        final int zzab = zza.zzab(parcel);
        Bundle zzq = null;
        IBinder zzp = null;
        int zzg = 0;
        int zzg2 = 0;
        String zzo = null;
        String s = null;
        int n = 0;
        Bundle bundle = null;
        int n2 = 0;
        Scope[] array2 = null;
    Label_0280:
        while (true) {
            Bundle bundle2 = null;
            Scope[] array3 = null;
            String s3 = null;
            Label_0322: {
                Label_0137: {
                    if (parcel.dataPosition() >= zzab) {
                        s = zzo;
                        n = zzg2;
                        bundle = zzq;
                        n2 = zzg;
                        array2 = array;
                        break Label_0137;
                    }
                    final int zzaa = zza.zzaa(parcel);
                    Label_0245: {
                        switch (zza.zzbA(zzaa)) {
                            default: {
                                break Label_0245;
                            }
                            case 1: {
                                break Label_0245;
                            }
                            case 2: {
                                break Label_0245;
                            }
                            case 3: {
                                break Label_0245;
                            }
                            case 4: {
                                break Label_0245;
                            }
                            case 5: {
                                break Label_0245;
                            }
                            case 6: {
                                break Label_0245;
                            }
                        }
                        try {
                            while (true) {
                                zza.zzb(parcel, zzaa);
                                final String s2 = zzo;
                                bundle2 = zzq;
                                array3 = array;
                                s3 = s2;
                                while (a) {
                                    s = s3;
                                    final Bundle bundle3 = bundle2;
                                    n = zzg2;
                                    bundle = bundle3;
                                    final int n3 = zzg;
                                    array2 = array3;
                                    n2 = n3;
                                    try {
                                        if (parcel.dataPosition() != zzab) {
                                            throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                        }
                                        break Label_0280;
                                    }
                                    catch (zza$zza zza$zza) {
                                        throw zza$zza;
                                    }
                                    zzg2 = zza.zzg(parcel, zzaa);
                                    if (a) {
                                        zzg = zza.zzg(parcel, zzaa);
                                        if (a) {
                                            zzp = zza.zzp(parcel, zzaa);
                                            if (a) {
                                                array = (Scope[])zza.zzb(parcel, zzaa, Scope.CREATOR);
                                                if (a) {
                                                    zzq = zza.zzq(parcel, zzaa);
                                                    if (a) {
                                                        zzo = zza.zzo(parcel, zzaa);
                                                        if (a) {
                                                            continue Label_0245;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    final String s4 = zzo;
                                    bundle2 = zzq;
                                    array3 = array;
                                    s3 = s4;
                                }
                                break Label_0322;
                            }
                        }
                        catch (zza$zza zza$zza2) {
                            throw zza$zza2;
                        }
                    }
                }
                break;
            }
            final String s5 = s3;
            array = array3;
            zzq = bundle2;
            zzo = s5;
        }
        return new ValidateAccountRequest(n, n2, zzp, array2, bundle, s);
    }
    
    public ValidateAccountRequest[] zzbz(final int n) {
        return new ValidateAccountRequest[n];
    }
}
