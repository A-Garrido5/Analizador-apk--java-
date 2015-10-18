// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.data;

import android.os.Bundle;
import android.database.CursorWindow;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza$zza;
import com.google.android.gms.common.internal.zzu;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zze implements Parcelable$Creator
{
    static void zza(final DataHolder dataHolder, final Parcel parcel, final int n) {
        final int a = DataHolder$zza.a;
        final int zzac = zzb.zzac(parcel);
        try {
            zzb.zza(parcel, 1, dataHolder.zzng(), false);
            zzb.zzc(parcel, 1000, dataHolder.getVersionCode());
            zzb.zza(parcel, 2, (Parcelable[])dataHolder.zznh(), n, false);
            zzb.zzc(parcel, 3, dataHolder.getStatusCode());
            zzb.zza(parcel, 4, dataHolder.zznb(), false);
            zzb.zzH(parcel, zzac);
            if (zzu.a != 0) {
                DataHolder$zza.a = a + 1;
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.zzS(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzbj(n);
    }
    
    public DataHolder zzS(final Parcel parcel) {
        CursorWindow[] array = null;
        final int i = DataHolder$zza.a;
        final int zzab = zza.zzab(parcel);
        int zzg = 0;
        String[] zzA = null;
        int zzg2 = 0;
        Bundle zzq = null;
        Bundle bundle = null;
        int n = 0;
        int n2 = 0;
        String[] array2 = null;
        CursorWindow[] array3 = null;
    Label_0288:
        while (true) {
            int n3 = 0;
            CursorWindow[] array4 = null;
            Bundle bundle3 = null;
            Label_0337: {
                Label_0149: {
                    if (parcel.dataPosition() >= zzab) {
                        bundle = zzq;
                        n = zzg2;
                        n2 = zzg;
                        array2 = zzA;
                        array3 = array;
                        break Label_0149;
                    }
                    final int zzaa = zza.zzaa(parcel);
                    Label_0253: {
                        switch (zza.zzbA(zzaa)) {
                            default: {
                                break Label_0253;
                            }
                            case 1: {
                                break Label_0253;
                            }
                            case 1000: {
                                break Label_0253;
                            }
                            case 2: {
                                break Label_0253;
                            }
                            case 3: {
                                break Label_0253;
                            }
                            case 4: {
                                break Label_0253;
                            }
                        }
                        try {
                            while (true) {
                                zza.zzb(parcel, zzaa);
                                final Bundle bundle2 = zzq;
                                n3 = zzg;
                                array4 = array;
                                bundle3 = bundle2;
                                while (i != 0) {
                                    bundle = bundle3;
                                    final int n4 = n3;
                                    n = zzg2;
                                    n2 = n4;
                                    final String[] array5 = zzA;
                                    array3 = array4;
                                    array2 = array5;
                                    try {
                                        if (parcel.dataPosition() != zzab) {
                                            throw new zza$zza("Overread allowed size end=" + zzab, parcel);
                                        }
                                        break Label_0288;
                                    }
                                    catch (zza$zza zza$zza) {
                                        throw zza$zza;
                                    }
                                    zzA = zza.zzA(parcel, zzaa);
                                    if (i != 0) {
                                        ++zzu.a;
                                        zzg2 = zza.zzg(parcel, zzaa);
                                        if (i != 0) {
                                            array = (CursorWindow[])zza.zzb(parcel, zzaa, CursorWindow.CREATOR);
                                            if (i != 0) {
                                                zzg = zza.zzg(parcel, zzaa);
                                                if (i != 0) {
                                                    zzq = zza.zzq(parcel, zzaa);
                                                    if (i != 0) {
                                                        continue Label_0253;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    final Bundle bundle4 = zzq;
                                    n3 = zzg;
                                    array4 = array;
                                    bundle3 = bundle4;
                                }
                                break Label_0337;
                            }
                        }
                        catch (zza$zza zza$zza2) {
                            throw zza$zza2;
                        }
                    }
                }
                break;
            }
            final Bundle bundle5 = bundle3;
            array = array4;
            zzg = n3;
            zzq = bundle5;
        }
        final DataHolder dataHolder = new DataHolder(n, array2, array3, n2, bundle);
        dataHolder.zznf();
        return dataHolder;
    }
    
    public DataHolder[] zzbj(final int n) {
        return new DataHolder[n];
    }
}
