// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class SpinnerCompat$SavedState$1 implements Parcelable$Creator
{
    public SpinnerCompat$SavedState createFromParcel(final Parcel parcel) {
        return new SpinnerCompat$SavedState(parcel, null);
    }
    
    public Object createFromParcel(final Parcel parcel) {
        return this.createFromParcel(parcel);
    }
    
    public SpinnerCompat$SavedState[] newArray(final int n) {
        return new SpinnerCompat$SavedState[n];
    }
    
    public Object[] newArray(final int n) {
        return this.newArray(n);
    }
}
