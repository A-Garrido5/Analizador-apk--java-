// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class Toolbar$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public int expandedMenuItemId;
    public boolean isOverflowOpen;
    
    static {
        CREATOR = (Parcelable$Creator)new Toolbar$SavedState$1();
    }
    
    public Toolbar$SavedState(final Parcel parcel) {
        super(parcel);
        this.expandedMenuItemId = parcel.readInt();
        this.isOverflowOpen = (parcel.readInt() != 0);
    }
    
    public Toolbar$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.expandedMenuItemId);
        int n2;
        if (this.isOverflowOpen) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
