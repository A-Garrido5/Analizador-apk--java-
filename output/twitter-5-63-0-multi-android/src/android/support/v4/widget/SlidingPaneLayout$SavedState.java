// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class SlidingPaneLayout$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean isOpen;
    
    static {
        CREATOR = (Parcelable$Creator)new SlidingPaneLayout$SavedState$1();
    }
    
    private SlidingPaneLayout$SavedState(final Parcel parcel) {
        super(parcel);
        this.isOpen = (parcel.readInt() != 0);
    }
    
    SlidingPaneLayout$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        int n2;
        if (this.isOpen) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
