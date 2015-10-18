// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CopresenceApiOptions implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public static int a;
    public static final CopresenceApiOptions zzayn;
    final int zzCY;
    public final boolean zzayo;
    public final String zzayp;
    
    static {
        CREATOR = (Parcelable$Creator)new zza();
        zzayn = new CopresenceApiOptions(true, null);
    }
    
    CopresenceApiOptions(final int zzCY, final boolean zzayo, final String zzayp) {
        this.zzCY = zzCY;
        this.zzayo = zzayo;
        this.zzayp = zzayp;
    }
    
    public CopresenceApiOptions(final boolean b, final String s) {
        this(1, b, s);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zza.zza(this, parcel, n);
    }
}
