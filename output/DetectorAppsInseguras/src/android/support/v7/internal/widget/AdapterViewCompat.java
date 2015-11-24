// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.database.DataSetObserver;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View$OnClickListener;
import android.view.ViewDebug$CapturedViewProperty;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$LayoutParams;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewDebug$ExportedProperty;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

public abstract class AdapterViewCompat<T extends Adapter> extends ViewGroup
{
    public static final int INVALID_POSITION = -1;
    public static final long INVALID_ROW_ID = Long.MIN_VALUE;
    static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
    static final int ITEM_VIEW_TYPE_IGNORE = -1;
    static final int SYNC_FIRST_POSITION = 1;
    static final int SYNC_MAX_DURATION_MILLIS = 100;
    static final int SYNC_SELECTED_POSITION;
    boolean mBlockLayoutRequests;
    boolean mDataChanged;
    private boolean mDesiredFocusableInTouchModeState;
    private boolean mDesiredFocusableState;
    private View mEmptyView;
    @ViewDebug$ExportedProperty(category = "scrolling")
    int mFirstPosition;
    boolean mInLayout;
    @ViewDebug$ExportedProperty(category = "list")
    int mItemCount;
    private int mLayoutHeight;
    boolean mNeedSync;
    @ViewDebug$ExportedProperty(category = "list")
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    int mOldItemCount;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    OnItemClickListener mOnItemClickListener;
    OnItemLongClickListener mOnItemLongClickListener;
    OnItemSelectedListener mOnItemSelectedListener;
    @ViewDebug$ExportedProperty(category = "list")
    int mSelectedPosition;
    long mSelectedRowId;
    private SelectionNotifier mSelectionNotifier;
    int mSpecificTop;
    long mSyncHeight;
    int mSyncMode;
    int mSyncPosition;
    long mSyncRowId;
    
    AdapterViewCompat(final Context context) {
        super(context);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }
    
    AdapterViewCompat(final Context context, final AttributeSet set) {
        super(context, set);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }
    
    AdapterViewCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }
    
    static /* synthetic */ void access$000(final AdapterViewCompat adapterViewCompat, final Parcelable parcelable) {
        adapterViewCompat.onRestoreInstanceState(parcelable);
    }
    
    static /* synthetic */ Parcelable access$100(final AdapterViewCompat adapterViewCompat) {
        return adapterViewCompat.onSaveInstanceState();
    }
    
    private void fireOnSelected() {
        if (this.mOnItemSelectedListener == null) {
            return;
        }
        final int selectedItemPosition = this.getSelectedItemPosition();
        if (selectedItemPosition >= 0) {
            this.mOnItemSelectedListener.onItemSelected(this, this.getSelectedView(), selectedItemPosition, this.getAdapter().getItemId(selectedItemPosition));
            return;
        }
        this.mOnItemSelectedListener.onNothingSelected(this);
    }
    
    private void updateEmptyStatus(boolean b) {
        if (this.isInFilterMode()) {
            b = false;
        }
        if (b) {
            if (this.mEmptyView != null) {
                this.mEmptyView.setVisibility(0);
                this.setVisibility(8);
            }
            else {
                this.setVisibility(0);
            }
            if (this.mDataChanged) {
                this.onLayout(false, this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
            }
            return;
        }
        if (this.mEmptyView != null) {
            this.mEmptyView.setVisibility(8);
        }
        this.setVisibility(0);
    }
    
    public void addView(final View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }
    
    public void addView(final View view, final int n) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }
    
    protected boolean canAnimate() {
        return super.canAnimate() && this.mItemCount > 0;
    }
    
    void checkFocus() {
        final Adapter adapter = this.getAdapter();
        boolean b;
        if (adapter == null || adapter.getCount() == 0) {
            b = true;
        }
        else {
            b = false;
        }
        boolean b2;
        if (!b || this.isInFilterMode()) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        super.setFocusableInTouchMode(b2 && this.mDesiredFocusableInTouchModeState);
        super.setFocusable(b2 && this.mDesiredFocusableState);
        if (this.mEmptyView != null) {
            boolean b3 = false;
            Label_0103: {
                if (adapter != null) {
                    final boolean empty = adapter.isEmpty();
                    b3 = false;
                    if (!empty) {
                        break Label_0103;
                    }
                }
                b3 = true;
            }
            this.updateEmptyStatus(b3);
        }
    }
    
    void checkSelectionChanged() {
        if (this.mSelectedPosition != this.mOldSelectedPosition || this.mSelectedRowId != this.mOldSelectedRowId) {
            this.selectionChanged();
            this.mOldSelectedPosition = this.mSelectedPosition;
            this.mOldSelectedRowId = this.mSelectedRowId;
        }
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        final View selectedView = this.getSelectedView();
        return selectedView != null && selectedView.getVisibility() == 0 && selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchThawSelfOnly((SparseArray)sparseArray);
    }
    
    protected void dispatchSaveInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchFreezeSelfOnly((SparseArray)sparseArray);
    }
    
    int findSyncPosition() {
        final int mItemCount = this.mItemCount;
        int min;
        if (mItemCount == 0) {
            min = -1;
        }
        else {
            final long mSyncRowId = this.mSyncRowId;
            final int mSyncPosition = this.mSyncPosition;
            if (mSyncRowId == Long.MIN_VALUE) {
                return -1;
            }
            min = Math.min(mItemCount - 1, Math.max(0, mSyncPosition));
            final long n = 100L + SystemClock.uptimeMillis();
            int n2 = min;
            int n3 = min;
            final Adapter adapter = this.getAdapter();
            int n4 = 0;
            if (adapter == null) {
                return -1;
            }
            while (SystemClock.uptimeMillis() <= n) {
                if (adapter.getItemId(min) == mSyncRowId) {
                    return min;
                }
                boolean b;
                if (n3 == mItemCount - 1) {
                    b = true;
                }
                else {
                    b = false;
                }
                boolean b2;
                if (n2 == 0) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (b && b2) {
                    break;
                }
                if (b2 || (n4 != 0 && !b)) {
                    min = ++n3;
                    n4 = 0;
                }
                else {
                    if (!b && (n4 != 0 || b2)) {
                        continue;
                    }
                    min = --n2;
                    n4 = 1;
                }
            }
            return -1;
        }
        return min;
    }
    
    public abstract T getAdapter();
    
    @ViewDebug$CapturedViewProperty
    public int getCount() {
        return this.mItemCount;
    }
    
    public View getEmptyView() {
        return this.mEmptyView;
    }
    
    public int getFirstVisiblePosition() {
        return this.mFirstPosition;
    }
    
    public Object getItemAtPosition(final int n) {
        final Adapter adapter = this.getAdapter();
        if (adapter == null || n < 0) {
            return null;
        }
        return adapter.getItem(n);
    }
    
    public long getItemIdAtPosition(final int n) {
        final Adapter adapter = this.getAdapter();
        if (adapter == null || n < 0) {
            return Long.MIN_VALUE;
        }
        return adapter.getItemId(n);
    }
    
    public int getLastVisiblePosition() {
        return -1 + (this.mFirstPosition + this.getChildCount());
    }
    
    public final OnItemClickListener getOnItemClickListener() {
        return this.mOnItemClickListener;
    }
    
    public final OnItemLongClickListener getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }
    
    public final OnItemSelectedListener getOnItemSelectedListener() {
        return this.mOnItemSelectedListener;
    }
    
    public int getPositionForView(final View view) {
        View view2 = view;
        Label_0033: {
            try {
                while (true) {
                    final View view3 = (View)view2.getParent();
                    if (view3.equals(this)) {
                        break Label_0033;
                    }
                    view2 = view3;
                }
            }
            catch (ClassCastException ex) {}
            return -1;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            if (this.getChildAt(i).equals(view2)) {
                return i + this.mFirstPosition;
            }
        }
        return -1;
    }
    
    public Object getSelectedItem() {
        final Adapter adapter = this.getAdapter();
        final int selectedItemPosition = this.getSelectedItemPosition();
        if (adapter != null && adapter.getCount() > 0 && selectedItemPosition >= 0) {
            return adapter.getItem(selectedItemPosition);
        }
        return null;
    }
    
    @ViewDebug$CapturedViewProperty
    public long getSelectedItemId() {
        return this.mNextSelectedRowId;
    }
    
    @ViewDebug$CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.mNextSelectedPosition;
    }
    
    public abstract View getSelectedView();
    
    void handleDataChanged() {
        final int mItemCount = this.mItemCount;
        int n = 0;
        if (mItemCount > 0) {
            final boolean mNeedSync = this.mNeedSync;
            n = 0;
            if (mNeedSync) {
                this.mNeedSync = false;
                final int syncPosition = this.findSyncPosition();
                n = 0;
                if (syncPosition >= 0) {
                    final int lookForSelectablePosition = this.lookForSelectablePosition(syncPosition, true);
                    n = 0;
                    if (lookForSelectablePosition == syncPosition) {
                        this.setNextSelectedPositionInt(syncPosition);
                        n = 1;
                    }
                }
            }
            if (n == 0) {
                int selectedItemPosition = this.getSelectedItemPosition();
                if (selectedItemPosition >= mItemCount) {
                    selectedItemPosition = mItemCount - 1;
                }
                if (selectedItemPosition < 0) {
                    selectedItemPosition = 0;
                }
                int nextSelectedPositionInt = this.lookForSelectablePosition(selectedItemPosition, true);
                if (nextSelectedPositionInt < 0) {
                    nextSelectedPositionInt = this.lookForSelectablePosition(selectedItemPosition, false);
                }
                if (nextSelectedPositionInt >= 0) {
                    this.setNextSelectedPositionInt(nextSelectedPositionInt);
                    this.checkSelectionChanged();
                    n = 1;
                }
            }
        }
        if (n == 0) {
            this.mSelectedPosition = -1;
            this.mSelectedRowId = Long.MIN_VALUE;
            this.mNextSelectedPosition = -1;
            this.mNextSelectedRowId = Long.MIN_VALUE;
            this.mNeedSync = false;
            this.checkSelectionChanged();
        }
    }
    
    boolean isInFilterMode() {
        return false;
    }
    
    int lookForSelectablePosition(final int n, final boolean b) {
        return n;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks((Runnable)this.mSelectionNotifier);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.mLayoutHeight = this.getHeight();
    }
    
    public boolean performItemClick(final View view, final int n, final long n2) {
        final OnItemClickListener mOnItemClickListener = this.mOnItemClickListener;
        boolean b = false;
        if (mOnItemClickListener != null) {
            this.playSoundEffect(0);
            if (view != null) {
                view.sendAccessibilityEvent(1);
            }
            this.mOnItemClickListener.onItemClick(this, view, n, n2);
            b = true;
        }
        return b;
    }
    
    void rememberSyncState() {
        if (this.getChildCount() > 0) {
            this.mNeedSync = true;
            this.mSyncHeight = this.mLayoutHeight;
            if (this.mSelectedPosition < 0) {
                final View child = this.getChildAt(0);
                final Adapter adapter = this.getAdapter();
                if (this.mFirstPosition >= 0 && this.mFirstPosition < adapter.getCount()) {
                    this.mSyncRowId = adapter.getItemId(this.mFirstPosition);
                }
                else {
                    this.mSyncRowId = -1L;
                }
                this.mSyncPosition = this.mFirstPosition;
                if (child != null) {
                    this.mSpecificTop = child.getTop();
                }
                this.mSyncMode = 1;
                return;
            }
            final View child2 = this.getChildAt(this.mSelectedPosition - this.mFirstPosition);
            this.mSyncRowId = this.mNextSelectedRowId;
            this.mSyncPosition = this.mNextSelectedPosition;
            if (child2 != null) {
                this.mSpecificTop = child2.getTop();
            }
            this.mSyncMode = 0;
        }
    }
    
    public void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }
    
    public void removeView(final View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }
    
    public void removeViewAt(final int n) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }
    
    void selectionChanged() {
        if (this.mOnItemSelectedListener != null) {
            if (this.mInLayout || this.mBlockLayoutRequests) {
                if (this.mSelectionNotifier == null) {
                    this.mSelectionNotifier = new SelectionNotifier();
                }
                this.post((Runnable)this.mSelectionNotifier);
            }
            else {
                this.fireOnSelected();
            }
        }
        if (this.mSelectedPosition != -1 && this.isShown() && !this.isInTouchMode()) {
            this.sendAccessibilityEvent(4);
        }
    }
    
    public abstract void setAdapter(final T p0);
    
    public void setEmptyView(final View mEmptyView) {
        this.mEmptyView = mEmptyView;
        final Adapter adapter = this.getAdapter();
        this.updateEmptyStatus(adapter == null || adapter.isEmpty());
    }
    
    public void setFocusable(final boolean mDesiredFocusableState) {
        boolean focusable = true;
        final Adapter adapter = this.getAdapter();
        final boolean b = (adapter == null || adapter.getCount() == 0) && focusable;
        if (!(this.mDesiredFocusableState = mDesiredFocusableState)) {
            this.mDesiredFocusableInTouchModeState = false;
        }
        if (!mDesiredFocusableState || (b && !this.isInFilterMode())) {
            focusable = false;
        }
        super.setFocusable(focusable);
    }
    
    public void setFocusableInTouchMode(final boolean mDesiredFocusableInTouchModeState) {
        boolean b = true;
        final Adapter adapter = this.getAdapter();
        final boolean b2 = (adapter == null || adapter.getCount() == 0) && b;
        this.mDesiredFocusableInTouchModeState = mDesiredFocusableInTouchModeState;
        if (mDesiredFocusableInTouchModeState) {
            this.mDesiredFocusableState = b;
        }
        if (!mDesiredFocusableInTouchModeState || (b2 && !this.isInFilterMode())) {
            b = false;
        }
        super.setFocusableInTouchMode(b);
    }
    
    void setNextSelectedPositionInt(final int n) {
        this.mNextSelectedPosition = n;
        this.mNextSelectedRowId = this.getItemIdAtPosition(n);
        if (this.mNeedSync && this.mSyncMode == 0 && n >= 0) {
            this.mSyncPosition = n;
            this.mSyncRowId = this.mNextSelectedRowId;
        }
    }
    
    public void setOnClickListener(final View$OnClickListener view$OnClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }
    
    public void setOnItemClickListener(final OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }
    
    public void setOnItemLongClickListener(final OnItemLongClickListener mOnItemLongClickListener) {
        if (!this.isLongClickable()) {
            this.setLongClickable(true);
        }
        this.mOnItemLongClickListener = mOnItemLongClickListener;
    }
    
    public void setOnItemSelectedListener(final OnItemSelectedListener mOnItemSelectedListener) {
        this.mOnItemSelectedListener = mOnItemSelectedListener;
    }
    
    void setSelectedPositionInt(final int mSelectedPosition) {
        this.mSelectedPosition = mSelectedPosition;
        this.mSelectedRowId = this.getItemIdAtPosition(mSelectedPosition);
    }
    
    public abstract void setSelection(final int p0);
    
    public static class AdapterContextMenuInfo implements ContextMenu$ContextMenuInfo
    {
        public long id;
        public int position;
        public View targetView;
        
        public AdapterContextMenuInfo(final View targetView, final int position, final long id) {
            this.targetView = targetView;
            this.position = position;
            this.id = id;
        }
    }
    
    class AdapterDataSetObserver extends DataSetObserver
    {
        private Parcelable mInstanceState;
        
        AdapterDataSetObserver() {
            this.mInstanceState = null;
        }
        
        public void clearSavedState() {
            this.mInstanceState = null;
        }
        
        public void onChanged() {
            AdapterViewCompat.this.mDataChanged = true;
            AdapterViewCompat.this.mOldItemCount = AdapterViewCompat.this.mItemCount;
            AdapterViewCompat.this.mItemCount = AdapterViewCompat.this.getAdapter().getCount();
            if (AdapterViewCompat.this.getAdapter().hasStableIds() && this.mInstanceState != null && AdapterViewCompat.this.mOldItemCount == 0 && AdapterViewCompat.this.mItemCount > 0) {
                AdapterViewCompat.access$000(AdapterViewCompat.this, this.mInstanceState);
                this.mInstanceState = null;
            }
            else {
                AdapterViewCompat.this.rememberSyncState();
            }
            AdapterViewCompat.this.checkFocus();
            AdapterViewCompat.this.requestLayout();
        }
        
        public void onInvalidated() {
            AdapterViewCompat.this.mDataChanged = true;
            if (AdapterViewCompat.this.getAdapter().hasStableIds()) {
                this.mInstanceState = AdapterViewCompat.access$100(AdapterViewCompat.this);
            }
            AdapterViewCompat.this.mOldItemCount = AdapterViewCompat.this.mItemCount;
            AdapterViewCompat.this.mItemCount = 0;
            AdapterViewCompat.this.mSelectedPosition = -1;
            AdapterViewCompat.this.mSelectedRowId = Long.MIN_VALUE;
            AdapterViewCompat.this.mNextSelectedPosition = -1;
            AdapterViewCompat.this.mNextSelectedRowId = Long.MIN_VALUE;
            AdapterViewCompat.this.mNeedSync = false;
            AdapterViewCompat.this.checkFocus();
            AdapterViewCompat.this.requestLayout();
        }
    }
    
    public interface OnItemClickListener
    {
        void onItemClick(final AdapterViewCompat<?> p0, final View p1, final int p2, final long p3);
    }
    
    class OnItemClickListenerWrapper implements AdapterView$OnItemClickListener
    {
        private final OnItemClickListener mWrappedListener;
        
        public OnItemClickListenerWrapper(final OnItemClickListener mWrappedListener) {
            this.mWrappedListener = mWrappedListener;
        }
        
        public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
            this.mWrappedListener.onItemClick(AdapterViewCompat.this, view, n, n2);
        }
    }
    
    public interface OnItemLongClickListener
    {
        boolean onItemLongClick(final AdapterViewCompat<?> p0, final View p1, final int p2, final long p3);
    }
    
    public interface OnItemSelectedListener
    {
        void onItemSelected(final AdapterViewCompat<?> p0, final View p1, final int p2, final long p3);
        
        void onNothingSelected(final AdapterViewCompat<?> p0);
    }
    
    private class SelectionNotifier implements Runnable
    {
        @Override
        public void run() {
            if (AdapterViewCompat.this.mDataChanged) {
                if (AdapterViewCompat.this.getAdapter() != null) {
                    AdapterViewCompat.this.post((Runnable)this);
                }
                return;
            }
            AdapterViewCompat.this.fireOnSelected();
        }
    }
}
