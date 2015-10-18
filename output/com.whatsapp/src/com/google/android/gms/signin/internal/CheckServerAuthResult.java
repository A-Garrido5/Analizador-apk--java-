// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CheckServerAuthResult implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int zzCY;
    final boolean zzaJY;
    final List zzaJZ;
    
    static {
        CREATOR = (Parcelable$Creator)new zzc();
    }
    
    CheckServerAuthResult(final int zzCY, final boolean zzaJY, final List zzaJZ) {
        this.zzCY = zzCY;
        this.zzaJY = zzaJY;
        this.zzaJZ = zzaJZ;
    }
    
    public CheckServerAuthResult(final boolean b, final Set set) {
        this(1, b, zzf(set));
    }
    
    private static List zzf(final Set set) {
        if (set == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList((List<?>)new ArrayList<Object>(set));
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzc.zza(this, parcel, n);
    }
}
