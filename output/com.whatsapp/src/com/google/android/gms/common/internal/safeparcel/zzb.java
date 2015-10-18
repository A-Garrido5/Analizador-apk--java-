// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal.safeparcel;

import java.util.List;
import android.os.Parcelable;
import android.os.IBinder;
import android.os.Bundle;
import android.os.Parcel;

public class zzb
{
    private static int zzF(final Parcel parcel, final int n) {
        parcel.writeInt(0xFFFF0000 | n);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    private static void zzG(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        final int n2 = dataPosition - n;
        parcel.setDataPosition(n - 4);
        parcel.writeInt(n2);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void zzH(final Parcel parcel, final int n) {
        zzG(parcel, n);
    }
    
    public static void zza(final Parcel parcel, final int n, final byte b) {
        zzb(parcel, n, 4);
        parcel.writeInt((int)b);
    }
    
    public static void zza(final Parcel parcel, final int n, final double n2) {
        zzb(parcel, n, 8);
        parcel.writeDouble(n2);
    }
    
    public static void zza(final Parcel parcel, final int n, final float n2) {
        zzb(parcel, n, 4);
        parcel.writeFloat(n2);
    }
    
    public static void zza(final Parcel parcel, final int n, final long n2) {
        zzb(parcel, n, 8);
        parcel.writeLong(n2);
    }
    
    public static void zza(final Parcel parcel, final int n, final Bundle bundle, final boolean b) {
        if (bundle == null) {
            if (!b) {
                return;
            }
            try {
                zzb(parcel, n, 0);
                return;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
        final int zzF = zzF(parcel, n);
        parcel.writeBundle(bundle);
        zzG(parcel, zzF);
    }
    
    public static void zza(final Parcel parcel, final int n, final IBinder binder, final boolean b) {
        if (binder == null) {
            if (!b) {
                return;
            }
            try {
                zzb(parcel, n, 0);
                return;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
        final int zzF = zzF(parcel, n);
        parcel.writeStrongBinder(binder);
        zzG(parcel, zzF);
    }
    
    public static void zza(final Parcel parcel, final int n, final Parcelable parcelable, final int n2, final boolean b) {
        if (parcelable == null) {
            if (!b) {
                return;
            }
            try {
                zzb(parcel, n, 0);
                return;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
        final int zzF = zzF(parcel, n);
        parcelable.writeToParcel(parcel, n2);
        zzG(parcel, zzF);
    }
    
    public static void zza(final Parcel parcel, final int n, final Integer n2, final boolean b) {
        if (n2 == null) {
            if (!b) {
                return;
            }
            try {
                zzb(parcel, n, 0);
                return;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
        zzb(parcel, n, 4);
        parcel.writeInt((int)n2);
    }
    
    public static void zza(final Parcel parcel, final int n, final String s, final boolean b) {
        if (s == null) {
            if (!b) {
                return;
            }
            try {
                zzb(parcel, n, 0);
                return;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
        final int zzF = zzF(parcel, n);
        parcel.writeString(s);
        zzG(parcel, zzF);
    }
    
    public static void zza(final Parcel parcel, final int n, final boolean b) {
        while (true) {
            while (true) {
                try {
                    zzb(parcel, n, 4);
                    if (b) {
                        final int n2 = 1;
                        parcel.writeInt(n2);
                        return;
                    }
                }
                catch (zza$zza zza$zza) {
                    throw zza$zza;
                }
                final int n2 = 0;
                continue;
            }
        }
    }
    
    public static void zza(final Parcel parcel, final int n, final Parcelable[] array, final int n2, final boolean b) {
        int n3 = 0;
        final int a = zza$zza.a;
        if (array == null) {
            if (!b) {
                return;
            }
            try {
                zzb(parcel, n, 0);
                return;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
        final int zzF = zzF(parcel, n);
        final int length = array.length;
        parcel.writeInt(length);
        while (true) {
            Label_0089: {
                if (n3 >= length) {
                    break Label_0089;
                }
                final Parcelable parcelable = array[n3];
                Label_0074: {
                    if (parcelable != null) {
                        break Label_0074;
                    }
                    try {
                        parcel.writeInt(0);
                        if (a != 0) {
                            zza(parcel, parcelable, n2);
                        }
                        ++n3;
                        if (a != 0) {
                            zzG(parcel, zzF);
                            return;
                        }
                        continue;
                    }
                    catch (zza$zza zza$zza2) {
                        throw zza$zza2;
                    }
                }
            }
        }
    }
    
    public static void zza(final Parcel parcel, final int n, final String[] array, final boolean b) {
        if (array == null) {
            if (!b) {
                return;
            }
            try {
                zzb(parcel, n, 0);
                return;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
        final int zzF = zzF(parcel, n);
        parcel.writeStringArray(array);
        zzG(parcel, zzF);
    }
    
    private static void zza(final Parcel parcel, final Parcelable parcelable, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        final int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, n);
        final int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
    
    public static int zzac(final Parcel parcel) {
        return zzF(parcel, 20293);
    }
    
    private static void zzb(final Parcel parcel, final int n, final int n2) {
        Label_0029: {
            if (n2 < 65535) {
                break Label_0029;
            }
            final int n3 = 0xFFFF0000 | n;
            try {
                parcel.writeInt(n3);
                parcel.writeInt(n2);
                if (zza$zza.a != 0) {
                    parcel.writeInt(n | n2 << 16);
                }
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
    }
    
    public static void zzc(final Parcel parcel, final int n, final int n2) {
        zzb(parcel, n, 4);
        parcel.writeInt(n2);
    }
    
    public static void zzc(final Parcel parcel, final int n, final List list, final boolean b) {
        final int a = zza$zza.a;
        if (list == null) {
            if (!b) {
                return;
            }
            try {
                zzb(parcel, n, 0);
                return;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
        final int zzF = zzF(parcel, n);
        final int size = list.size();
        parcel.writeInt(size);
        int n2 = 0;
        while (true) {
            int n3 = 0;
            Label_0102: {
                if (n2 >= size) {
                    break Label_0102;
                }
                final Parcelable parcelable = list.get(n2);
                Label_0084: {
                    if (parcelable != null) {
                        break Label_0084;
                    }
                    try {
                        parcel.writeInt(0);
                        if (a != 0) {
                            zza(parcel, parcelable, 0);
                        }
                        n3 = n2 + 1;
                        if (a != 0) {
                            zzG(parcel, zzF);
                            return;
                        }
                    }
                    catch (zza$zza zza$zza2) {
                        throw zza$zza2;
                    }
                }
            }
            n2 = n3;
        }
    }
}
