// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

class StaggeredGridLayoutManager$SavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    boolean mAnchorLayoutFromEnd;
    int mAnchorPosition;
    List mFullSpanItems;
    boolean mLastLayoutRTL;
    boolean mReverseLayout;
    int[] mSpanLookup;
    int mSpanLookupSize;
    int[] mSpanOffsets;
    int mSpanOffsetsSize;
    int mVisibleAnchorPosition;
    
    static {
        CREATOR = (Parcelable$Creator)new StaggeredGridLayoutManager$SavedState$1();
    }
    
    public StaggeredGridLayoutManager$SavedState() {
    }
    
    StaggeredGridLayoutManager$SavedState(final Parcel parcel) {
        boolean mLastLayoutRTL = true;
        this.mAnchorPosition = parcel.readInt();
        this.mVisibleAnchorPosition = parcel.readInt();
        this.mSpanOffsetsSize = parcel.readInt();
        if (this.mSpanOffsetsSize > 0) {
            parcel.readIntArray(this.mSpanOffsets = new int[this.mSpanOffsetsSize]);
        }
        this.mSpanLookupSize = parcel.readInt();
        if (this.mSpanLookupSize > 0) {
            parcel.readIntArray(this.mSpanLookup = new int[this.mSpanLookupSize]);
        }
        this.mReverseLayout = (parcel.readInt() == (mLastLayoutRTL ? 1 : 0) && mLastLayoutRTL);
        this.mAnchorLayoutFromEnd = (parcel.readInt() == (mLastLayoutRTL ? 1 : 0) && mLastLayoutRTL);
        if (parcel.readInt() != (mLastLayoutRTL ? 1 : 0)) {
            mLastLayoutRTL = false;
        }
        this.mLastLayoutRTL = mLastLayoutRTL;
        this.mFullSpanItems = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
    }
    
    public StaggeredGridLayoutManager$SavedState(final StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState) {
        this.mSpanOffsetsSize = staggeredGridLayoutManager$SavedState.mSpanOffsetsSize;
        this.mAnchorPosition = staggeredGridLayoutManager$SavedState.mAnchorPosition;
        this.mVisibleAnchorPosition = staggeredGridLayoutManager$SavedState.mVisibleAnchorPosition;
        this.mSpanOffsets = staggeredGridLayoutManager$SavedState.mSpanOffsets;
        this.mSpanLookupSize = staggeredGridLayoutManager$SavedState.mSpanLookupSize;
        this.mSpanLookup = staggeredGridLayoutManager$SavedState.mSpanLookup;
        this.mReverseLayout = staggeredGridLayoutManager$SavedState.mReverseLayout;
        this.mAnchorLayoutFromEnd = staggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd;
        this.mLastLayoutRTL = staggeredGridLayoutManager$SavedState.mLastLayoutRTL;
        this.mFullSpanItems = staggeredGridLayoutManager$SavedState.mFullSpanItems;
    }
    
    public int describeContents() {
        return 0;
    }
    
    void invalidateAnchorPositionInfo() {
        this.mSpanOffsets = null;
        this.mSpanOffsetsSize = 0;
        this.mAnchorPosition = -1;
        this.mVisibleAnchorPosition = -1;
    }
    
    void invalidateSpanInfo() {
        this.mSpanOffsets = null;
        this.mSpanOffsetsSize = 0;
        this.mSpanLookupSize = 0;
        this.mSpanLookup = null;
        this.mFullSpanItems = null;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeInt(this.mAnchorPosition);
        parcel.writeInt(this.mVisibleAnchorPosition);
        parcel.writeInt(this.mSpanOffsetsSize);
        if (this.mSpanOffsetsSize > 0) {
            parcel.writeIntArray(this.mSpanOffsets);
        }
        parcel.writeInt(this.mSpanLookupSize);
        if (this.mSpanLookupSize > 0) {
            parcel.writeIntArray(this.mSpanLookup);
        }
        int n3;
        if (this.mReverseLayout) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        int n4;
        if (this.mAnchorLayoutFromEnd) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeInt(n4);
        if (!this.mLastLayoutRTL) {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeList(this.mFullSpanItems);
    }
}
