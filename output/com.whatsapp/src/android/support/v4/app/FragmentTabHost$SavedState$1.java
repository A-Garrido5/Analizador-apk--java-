// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class FragmentTabHost$SavedState$1 implements Parcelable$Creator
{
    public FragmentTabHost$SavedState createFromParcel(final Parcel parcel) {
        return new FragmentTabHost$SavedState(parcel, null);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.createFromParcel(parcel);
    }
    
    public FragmentTabHost$SavedState[] newArray(final int n) {
        return new FragmentTabHost$SavedState[n];
    }
    
    public Object[] newArray(final int n) {
        return this.newArray(n);
    }
}
