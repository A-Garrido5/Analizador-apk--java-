// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

class StaggeredGridLayoutManager$AnchorInfo
{
    boolean mInvalidateOffsets;
    boolean mLayoutFromEnd;
    int mOffset;
    int mPosition;
    final /* synthetic */ StaggeredGridLayoutManager this$0;
    
    private StaggeredGridLayoutManager$AnchorInfo(final StaggeredGridLayoutManager this$0) {
        this.this$0 = this$0;
    }
    
    void assignCoordinateFromPadding() {
        int mOffset;
        if (this.mLayoutFromEnd) {
            mOffset = this.this$0.mPrimaryOrientation.getEndAfterPadding();
        }
        else {
            mOffset = this.this$0.mPrimaryOrientation.getStartAfterPadding();
        }
        this.mOffset = mOffset;
    }
    
    void assignCoordinateFromPadding(final int n) {
        if (this.mLayoutFromEnd) {
            this.mOffset = this.this$0.mPrimaryOrientation.getEndAfterPadding() - n;
            return;
        }
        this.mOffset = n + this.this$0.mPrimaryOrientation.getStartAfterPadding();
    }
    
    void reset() {
        this.mPosition = -1;
        this.mOffset = Integer.MIN_VALUE;
        this.mLayoutFromEnd = false;
        this.mInvalidateOffsets = false;
    }
}
