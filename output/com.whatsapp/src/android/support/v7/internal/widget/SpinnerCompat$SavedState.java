// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

class SpinnerCompat$SavedState extends AbsSpinnerCompat$SavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean showDropdown;
    
    static {
        CREATOR = (Parcelable$Creator)new SpinnerCompat$SavedState$1();
    }
    
    private SpinnerCompat$SavedState(final Parcel parcel) {
        super(parcel);
        this.showDropdown = (parcel.readByte() != 0);
    }
    
    SpinnerCompat$SavedState(final Parcel parcel, final SpinnerCompat$1 spinnerCompat$1) {
        this(parcel);
    }
    
    SpinnerCompat$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        boolean b;
        if (this.showDropdown) {
            b = true;
        }
        else {
            b = false;
        }
        parcel.writeByte((byte)(byte)(b ? 1 : 0));
    }
}
