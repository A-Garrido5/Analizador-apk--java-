// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.os.Parcelable;
import android.database.DataSetObserver;

class AdapterViewCompat$AdapterDataSetObserver extends DataSetObserver
{
    private Parcelable mInstanceState;
    final AdapterViewCompat this$0;
    
    AdapterViewCompat$AdapterDataSetObserver(final AdapterViewCompat this$0) {
        this.this$0 = this$0;
        this.mInstanceState = null;
    }
    
    public void onChanged() {
        this.this$0.mDataChanged = true;
        this.this$0.mOldItemCount = this.this$0.mItemCount;
        this.this$0.mItemCount = this.this$0.getAdapter().getCount();
        Label_0112: {
            if (this.this$0.getAdapter().hasStableIds() && this.mInstanceState != null && this.this$0.mOldItemCount == 0 && this.this$0.mItemCount > 0) {
                AdapterViewCompat.access$000(this.this$0, this.mInstanceState);
                this.mInstanceState = null;
                if (AdapterViewCompat.a == 0) {
                    break Label_0112;
                }
            }
            this.this$0.rememberSyncState();
        }
        this.this$0.checkFocus();
        this.this$0.requestLayout();
    }
    
    public void onInvalidated() {
        this.this$0.mDataChanged = true;
        if (this.this$0.getAdapter().hasStableIds()) {
            this.mInstanceState = AdapterViewCompat.access$100(this.this$0);
        }
        this.this$0.mOldItemCount = this.this$0.mItemCount;
        this.this$0.mItemCount = 0;
        this.this$0.mSelectedPosition = -1;
        this.this$0.mSelectedRowId = Long.MIN_VALUE;
        this.this$0.mNextSelectedPosition = -1;
        this.this$0.mNextSelectedRowId = Long.MIN_VALUE;
        this.this$0.mNeedSync = false;
        this.this$0.checkFocus();
        this.this$0.requestLayout();
    }
}
