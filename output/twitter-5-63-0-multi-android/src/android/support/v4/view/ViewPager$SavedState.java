// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.os.ParcelableCompat;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class ViewPager$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    Parcelable adapterState;
    ClassLoader loader;
    int position;
    
    static {
        CREATOR = ParcelableCompat.newCreator(new ViewPager$SavedState$1());
    }
    
    ViewPager$SavedState(final Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        if (classLoader == null) {
            classLoader = this.getClass().getClassLoader();
        }
        this.position = parcel.readInt();
        this.adapterState = parcel.readParcelable(classLoader);
        this.loader = classLoader;
    }
    
    public ViewPager$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.position);
        parcel.writeParcelable(this.adapterState, n);
    }
}
