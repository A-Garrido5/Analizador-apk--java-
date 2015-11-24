// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class FragmentManagerState$1 implements Parcelable$Creator
{
    public FragmentManagerState createFromParcel(final Parcel parcel) {
        return new FragmentManagerState(parcel);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.createFromParcel(parcel);
    }
    
    public FragmentManagerState[] newArray(final int n) {
        return new FragmentManagerState[n];
    }
    
    public Object[] newArray(final int n) {
        return this.newArray(n);
    }
}
