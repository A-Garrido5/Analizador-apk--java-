// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class FragmentState$1 implements Parcelable$Creator
{
    public FragmentState createFromParcel(final Parcel parcel) {
        return new FragmentState(parcel);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.createFromParcel(parcel);
    }
    
    public FragmentState[] newArray(final int n) {
        return new FragmentState[n];
    }
    
    public Object[] newArray(final int n) {
        return this.newArray(n);
    }
}
