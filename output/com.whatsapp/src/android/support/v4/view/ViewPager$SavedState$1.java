// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

final class ViewPager$SavedState$1 implements ParcelableCompatCreatorCallbacks
{
    @Override
    public ViewPager$SavedState createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
        return new ViewPager$SavedState(parcel, classLoader);
    }
    
    @Override
    public Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
        return this.createFromParcel(parcel, classLoader);
    }
    
    @Override
    public ViewPager$SavedState[] newArray(final int n) {
        return new ViewPager$SavedState[n];
    }
    
    @Override
    public Object[] newArray(final int n) {
        return this.newArray(n);
    }
}
