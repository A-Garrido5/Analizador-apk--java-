// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.os.ParcelableCompat;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

public class StoriesViewPager$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    private int a;
    private Parcelable b;
    private ClassLoader c;
    
    static {
        CREATOR = ParcelableCompat.newCreator(new n());
    }
    
    StoriesViewPager$SavedState(final Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        if (classLoader == null) {
            classLoader = this.getClass().getClassLoader();
        }
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(classLoader);
        this.c = classLoader;
    }
    
    public StoriesViewPager$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, n);
    }
}
