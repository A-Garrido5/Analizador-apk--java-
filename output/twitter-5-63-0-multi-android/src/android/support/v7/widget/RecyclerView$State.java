// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v4.util.ArrayMap;
import android.util.SparseArray;

public class RecyclerView$State
{
    private SparseArray mData;
    private int mDeletedInvisibleItemCountSincePreviousLayout;
    private boolean mInPreLayout;
    int mItemCount;
    ArrayMap mOldChangedHolders;
    ArrayMap mPostLayoutHolderMap;
    ArrayMap mPreLayoutHolderMap;
    private int mPreviousLayoutItemCount;
    private boolean mRunPredictiveAnimations;
    private boolean mRunSimpleAnimations;
    private boolean mStructureChanged;
    private int mTargetPosition;
    
    public RecyclerView$State() {
        this.mTargetPosition = -1;
        this.mPreLayoutHolderMap = new ArrayMap();
        this.mPostLayoutHolderMap = new ArrayMap();
        this.mOldChangedHolders = new ArrayMap();
        this.mItemCount = 0;
        this.mPreviousLayoutItemCount = 0;
        this.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        this.mStructureChanged = false;
        this.mInPreLayout = false;
        this.mRunSimpleAnimations = false;
        this.mRunPredictiveAnimations = false;
    }
    
    private void removeFrom(final ArrayMap arrayMap, final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        for (int i = -1 + arrayMap.size(); i >= 0; --i) {
            if (recyclerView$ViewHolder == arrayMap.valueAt(i)) {
                arrayMap.removeAt(i);
                break;
            }
        }
    }
    
    public boolean didStructureChange() {
        return this.mStructureChanged;
    }
    
    public Object get(final int n) {
        if (this.mData == null) {
            return null;
        }
        return this.mData.get(n);
    }
    
    public int getItemCount() {
        if (this.mInPreLayout) {
            return this.mPreviousLayoutItemCount - this.mDeletedInvisibleItemCountSincePreviousLayout;
        }
        return this.mItemCount;
    }
    
    public int getTargetScrollPosition() {
        return this.mTargetPosition;
    }
    
    public boolean hasTargetScrollPosition() {
        return this.mTargetPosition != -1;
    }
    
    public boolean isPreLayout() {
        return this.mInPreLayout;
    }
    
    public void onViewIgnored(final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        this.onViewRecycled(recyclerView$ViewHolder);
    }
    
    public void onViewRecycled(final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        this.mPreLayoutHolderMap.remove(recyclerView$ViewHolder);
        this.mPostLayoutHolderMap.remove(recyclerView$ViewHolder);
        if (this.mOldChangedHolders != null) {
            this.removeFrom(this.mOldChangedHolders, recyclerView$ViewHolder);
        }
    }
    
    public void put(final int n, final Object o) {
        if (this.mData == null) {
            this.mData = new SparseArray();
        }
        this.mData.put(n, o);
    }
    
    public void remove(final int n) {
        if (this.mData == null) {
            return;
        }
        this.mData.remove(n);
    }
    
    RecyclerView$State reset() {
        this.mTargetPosition = -1;
        if (this.mData != null) {
            this.mData.clear();
        }
        this.mItemCount = 0;
        this.mStructureChanged = false;
        return this;
    }
    
    @Override
    public String toString() {
        return "State{mTargetPosition=" + this.mTargetPosition + ", mPreLayoutHolderMap=" + this.mPreLayoutHolderMap + ", mPostLayoutHolderMap=" + this.mPostLayoutHolderMap + ", mData=" + this.mData + ", mItemCount=" + this.mItemCount + ", mPreviousLayoutItemCount=" + this.mPreviousLayoutItemCount + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.mDeletedInvisibleItemCountSincePreviousLayout + ", mStructureChanged=" + this.mStructureChanged + ", mInPreLayout=" + this.mInPreLayout + ", mRunSimpleAnimations=" + this.mRunSimpleAnimations + ", mRunPredictiveAnimations=" + this.mRunPredictiveAnimations + '}';
    }
    
    public boolean willRunPredictiveAnimations() {
        return this.mRunPredictiveAnimations;
    }
    
    public boolean willRunSimpleAnimations() {
        return this.mRunSimpleAnimations;
    }
}
