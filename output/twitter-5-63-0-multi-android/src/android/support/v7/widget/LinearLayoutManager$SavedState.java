// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

class LinearLayoutManager$SavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    boolean mAnchorLayoutFromEnd;
    int mAnchorOffset;
    int mAnchorPosition;
    
    static {
        CREATOR = (Parcelable$Creator)new LinearLayoutManager$SavedState$1();
    }
    
    public LinearLayoutManager$SavedState() {
    }
    
    LinearLayoutManager$SavedState(final Parcel parcel) {
        boolean mAnchorLayoutFromEnd = true;
        this.mAnchorPosition = parcel.readInt();
        this.mAnchorOffset = parcel.readInt();
        if (parcel.readInt() != (mAnchorLayoutFromEnd ? 1 : 0)) {
            mAnchorLayoutFromEnd = false;
        }
        this.mAnchorLayoutFromEnd = mAnchorLayoutFromEnd;
    }
    
    public LinearLayoutManager$SavedState(final LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.mAnchorPosition = linearLayoutManager$SavedState.mAnchorPosition;
        this.mAnchorOffset = linearLayoutManager$SavedState.mAnchorOffset;
        this.mAnchorLayoutFromEnd = linearLayoutManager$SavedState.mAnchorLayoutFromEnd;
    }
    
    public int describeContents() {
        return 0;
    }
    
    boolean hasValidAnchor() {
        return this.mAnchorPosition >= 0;
    }
    
    void invalidateAnchor() {
        this.mAnchorPosition = -1;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.mAnchorPosition);
        parcel.writeInt(this.mAnchorOffset);
        int n2;
        if (this.mAnchorLayoutFromEnd) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
