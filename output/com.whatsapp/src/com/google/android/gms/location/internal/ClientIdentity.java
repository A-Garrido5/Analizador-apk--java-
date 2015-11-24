// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ClientIdentity implements SafeParcelable
{
    public static final zzc CREATOR;
    public final String packageName;
    public final int uid;
    private final int zzCY;
    
    static {
        CREATOR = new zzc();
    }
    
    ClientIdentity(final int zzCY, final int uid, final String packageName) {
        this.zzCY = zzCY;
        this.uid = uid;
        this.packageName = packageName;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof ClientIdentity) {
            final ClientIdentity clientIdentity = (ClientIdentity)o;
            if (clientIdentity.uid == this.uid && zzt.equal(clientIdentity.packageName, this.packageName)) {
                return true;
            }
        }
        return false;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    @Override
    public int hashCode() {
        return this.uid;
    }
    
    @Override
    public String toString() {
        return String.format("%d:%s", this.uid, this.packageName);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzc.zza(this, parcel, n);
    }
}
