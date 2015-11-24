// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import com.google.android.gms.common.internal.zzu;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public class zza
{
    public static String[] zzA(final Parcel parcel, final int n) {
        final int zza = zza(parcel, n);
        final int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        final String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(zza + dataPosition);
        return stringArray;
    }
    
    public static int zza(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return 0xFFFF & n >> 16;
        }
        return parcel.readInt();
    }
    
    public static Parcelable zza(final Parcel parcel, final int n, final Parcelable$Creator parcelable$Creator) {
        final int zza = zza(parcel, n);
        final int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(zza + dataPosition);
        return parcelable;
    }
    
    private static void zza(final Parcel parcel, final int n, final int n2) {
        final int zza = zza(parcel, n);
        if (zza != n2) {
            try {
                throw new zza$zza("Expected size " + n2 + " got " + zza + " (0x" + Integer.toHexString(zza) + ")", parcel);
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
    }
    
    private static void zza(final Parcel parcel, final int n, final int n2, final int n3) {
        if (n2 != n3) {
            try {
                throw new zza$zza("Expected size " + n3 + " got " + n2 + " (0x" + Integer.toHexString(n2) + ")", parcel);
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
    }
    
    public static int zzaa(final Parcel parcel) {
        return parcel.readInt();
    }
    
    public static int zzab(final Parcel parcel) {
        final int a = zza$zza.a;
        final int zzaa = zzaa(parcel);
        final int zza = zza(parcel, zzaa);
        final int dataPosition = parcel.dataPosition();
        try {
            if (zzbA(zzaa) != 20293) {
                throw new zza$zza("Expected object header. Got 0x" + Integer.toHexString(zzaa), parcel);
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
        final int n = dataPosition + zza;
        while (true) {
            if (n >= dataPosition) {
                try {
                    if (n > parcel.dataSize()) {
                        throw new zza$zza("Size read is invalid start=" + dataPosition + " end=" + n, parcel);
                    }
                }
                catch (zza$zza zza$zza2) {
                    throw zza$zza2;
                }
                if (a != 0) {
                    ++zzu.a;
                }
                return n;
            }
            continue;
        }
    }
    
    public static void zzb(final Parcel parcel, final int n) {
        parcel.setDataPosition(zza(parcel, n) + parcel.dataPosition());
    }
    
    public static Object[] zzb(final Parcel parcel, final int n, final Parcelable$Creator parcelable$Creator) {
        final int zza = zza(parcel, n);
        final int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray(parcelable$Creator);
        parcel.setDataPosition(zza + dataPosition);
        return typedArray;
    }
    
    public static int zzbA(final int n) {
        return 0xFFFF & n;
    }
    
    public static ArrayList zzc(final Parcel parcel, final int n, final Parcelable$Creator parcelable$Creator) {
        final int zza = zza(parcel, n);
        final int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList(parcelable$Creator);
        parcel.setDataPosition(zza + dataPosition);
        return typedArrayList;
    }
    
    public static boolean zzc(final Parcel parcel, final int n) {
        try {
            zza(parcel, n, 4);
            if (parcel.readInt() != 0) {
                return true;
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
        return false;
    }
    
    public static byte zze(final Parcel parcel, final int n) {
        zza(parcel, n, 4);
        return (byte)parcel.readInt();
    }
    
    public static int zzg(final Parcel parcel, final int n) {
        zza(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static Integer zzh(final Parcel parcel, final int n) {
        final int zza = zza(parcel, n);
        if (zza == 0) {
            return null;
        }
        zza(parcel, n, zza, 4);
        return parcel.readInt();
    }
    
    public static long zzi(final Parcel parcel, final int n) {
        zza(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static float zzl(final Parcel parcel, final int n) {
        zza(parcel, n, 4);
        return parcel.readFloat();
    }
    
    public static double zzm(final Parcel parcel, final int n) {
        zza(parcel, n, 8);
        return parcel.readDouble();
    }
    
    public static String zzo(final Parcel parcel, final int n) {
        final int zza = zza(parcel, n);
        final int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(zza + dataPosition);
        return string;
    }
    
    public static IBinder zzp(final Parcel parcel, final int n) {
        final int zza = zza(parcel, n);
        final int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(zza + dataPosition);
        return strongBinder;
    }
    
    public static Bundle zzq(final Parcel parcel, final int n) {
        final int zza = zza(parcel, n);
        final int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(zza + dataPosition);
        return bundle;
    }
}
