// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal.safeparcel;

import com.google.android.gms.common.internal.zzu;
import android.os.Parcel;

public class zza$zza extends RuntimeException
{
    public static int a;
    
    public zza$zza(final String s, final Parcel parcel) {
        final int a = zza$zza.a;
        super(s + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        if (zzu.a != 0) {
            zza$zza.a = a + 1;
        }
    }
}
