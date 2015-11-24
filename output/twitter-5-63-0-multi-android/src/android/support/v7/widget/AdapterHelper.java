// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import java.util.List;
import java.util.Collection;
import java.util.Collections;
import android.support.v4.util.Pools$SimplePool;
import android.support.v4.util.Pools$Pool;
import java.util.ArrayList;

class AdapterHelper implements OpReorderer$Callback
{
    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    final AdapterHelper$Callback mCallback;
    final boolean mDisableRecycler;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList mPendingUpdates;
    final ArrayList mPostponedList;
    private Pools$Pool mUpdateOpPool;
    
    AdapterHelper(final AdapterHelper$Callback adapterHelper$Callback) {
        this(adapterHelper$Callback, false);
    }
    
    AdapterHelper(final AdapterHelper$Callback mCallback, final boolean mDisableRecycler) {
        this.mUpdateOpPool = new Pools$SimplePool(30);
        this.mPendingUpdates = new ArrayList();
        this.mPostponedList = new ArrayList();
        this.mCallback = mCallback;
        this.mDisableRecycler = mDisableRecycler;
        this.mOpReorderer = new OpReorderer(this);
    }
    
    private void applyAdd(final AdapterHelper$UpdateOp adapterHelper$UpdateOp) {
        this.postponeAndUpdateViewHolders(adapterHelper$UpdateOp);
    }
    
    private void applyMove(final AdapterHelper$UpdateOp adapterHelper$UpdateOp) {
        this.postponeAndUpdateViewHolders(adapterHelper$UpdateOp);
    }
    
    private void applyRemove(AdapterHelper$UpdateOp obtainUpdateOp) {
        final int positionStart = obtainUpdateOp.positionStart;
        int n = obtainUpdateOp.positionStart + obtainUpdateOp.itemCount;
        int n2 = -1;
        int i = obtainUpdateOp.positionStart;
        int n3 = 0;
        while (i < n) {
            int n4;
            if (this.mCallback.findViewHolder(i) != null || this.canFindInPreLayout(i)) {
                if (n2 == 0) {
                    this.dispatchAndUpdateViewHolders(this.obtainUpdateOp(1, positionStart, n3));
                    n4 = 1;
                }
                else {
                    n4 = 0;
                }
                n2 = 1;
            }
            else {
                if (n2 == 1) {
                    this.postponeAndUpdateViewHolders(this.obtainUpdateOp(1, positionStart, n3));
                    n4 = 1;
                }
                else {
                    n4 = 0;
                }
                n2 = 0;
            }
            int n5;
            int n6;
            int n7;
            if (n4 != 0) {
                n5 = i - n3;
                n6 = n - n3;
                n7 = 1;
            }
            else {
                final int n8 = n3 + 1;
                final int n9 = i;
                n6 = n;
                n7 = n8;
                n5 = n9;
            }
            final int n10 = n5 + 1;
            n3 = n7;
            n = n6;
            i = n10;
        }
        if (n3 != obtainUpdateOp.itemCount) {
            this.recycleUpdateOp(obtainUpdateOp);
            obtainUpdateOp = this.obtainUpdateOp(1, positionStart, n3);
        }
        if (n2 == 0) {
            this.dispatchAndUpdateViewHolders(obtainUpdateOp);
            return;
        }
        this.postponeAndUpdateViewHolders(obtainUpdateOp);
    }
    
    private void applyUpdate(AdapterHelper$UpdateOp obtainUpdateOp) {
        int positionStart = obtainUpdateOp.positionStart;
        final int n = obtainUpdateOp.positionStart + obtainUpdateOp.itemCount;
        int i = obtainUpdateOp.positionStart;
        int n2 = -1;
        int n3 = 0;
        while (i < n) {
            int n4;
            int n5;
            int n6;
            if (this.mCallback.findViewHolder(i) != null || this.canFindInPreLayout(i)) {
                if (n2 == 0) {
                    this.dispatchAndUpdateViewHolders(this.obtainUpdateOp(2, positionStart, n3));
                    n3 = 0;
                    positionStart = i;
                }
                n4 = positionStart;
                n5 = n3;
                n6 = 1;
            }
            else {
                if (n2 == 1) {
                    this.postponeAndUpdateViewHolders(this.obtainUpdateOp(2, positionStart, n3));
                    n3 = 0;
                    positionStart = i;
                }
                n4 = positionStart;
                n5 = n3;
                n6 = 0;
            }
            final int n7 = n5 + 1;
            ++i;
            final int n8 = n6;
            n3 = n7;
            positionStart = n4;
            n2 = n8;
        }
        if (n3 != obtainUpdateOp.itemCount) {
            this.recycleUpdateOp(obtainUpdateOp);
            obtainUpdateOp = this.obtainUpdateOp(2, positionStart, n3);
        }
        if (n2 == 0) {
            this.dispatchAndUpdateViewHolders(obtainUpdateOp);
            return;
        }
        this.postponeAndUpdateViewHolders(obtainUpdateOp);
    }
    
    private boolean canFindInPreLayout(final int n) {
        for (int size = this.mPostponedList.size(), i = 0; i < size; ++i) {
            final AdapterHelper$UpdateOp adapterHelper$UpdateOp = this.mPostponedList.get(i);
            if (adapterHelper$UpdateOp.cmd == 3) {
                if (this.findPositionOffset(adapterHelper$UpdateOp.itemCount, i + 1) == n) {
                    return true;
                }
            }
            else if (adapterHelper$UpdateOp.cmd == 0) {
                for (int n2 = adapterHelper$UpdateOp.positionStart + adapterHelper$UpdateOp.itemCount, j = adapterHelper$UpdateOp.positionStart; j < n2; ++j) {
                    if (this.findPositionOffset(j, i + 1) == n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private void dispatchAndUpdateViewHolders(final AdapterHelper$UpdateOp adapterHelper$UpdateOp) {
        if (adapterHelper$UpdateOp.cmd == 0 || adapterHelper$UpdateOp.cmd == 3) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        final int updatePositionWithPostponed = this.updatePositionWithPostponed(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.cmd);
        final int positionStart = adapterHelper$UpdateOp.positionStart;
        int n = 0;
        switch (adapterHelper$UpdateOp.cmd) {
            default: {
                throw new IllegalArgumentException("op should be remove or update." + adapterHelper$UpdateOp);
            }
            case 2: {
                n = 1;
                break;
            }
            case 1: {
                n = 0;
                break;
            }
        }
        int n2 = 1;
        int n3 = updatePositionWithPostponed;
        int n4 = positionStart;
        for (int i = 1; i < adapterHelper$UpdateOp.itemCount; ++i) {
            final int updatePositionWithPostponed2 = this.updatePositionWithPostponed(adapterHelper$UpdateOp.positionStart + n * i, adapterHelper$UpdateOp.cmd);
            int n5 = 0;
            switch (adapterHelper$UpdateOp.cmd) {
                default: {
                    n5 = 0;
                    break;
                }
                case 2: {
                    if (updatePositionWithPostponed2 == n3 + 1) {
                        n5 = 1;
                        break;
                    }
                    n5 = 0;
                    break;
                }
                case 1: {
                    if (updatePositionWithPostponed2 == n3) {
                        n5 = 1;
                        break;
                    }
                    n5 = 0;
                    break;
                }
            }
            if (n5 != 0) {
                ++n2;
            }
            else {
                final AdapterHelper$UpdateOp obtainUpdateOp = this.obtainUpdateOp(adapterHelper$UpdateOp.cmd, n3, n2);
                this.dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp, n4);
                this.recycleUpdateOp(obtainUpdateOp);
                if (adapterHelper$UpdateOp.cmd == 2) {
                    n4 += n2;
                }
                n2 = 1;
                n3 = updatePositionWithPostponed2;
            }
        }
        this.recycleUpdateOp(adapterHelper$UpdateOp);
        if (n2 > 0) {
            final AdapterHelper$UpdateOp obtainUpdateOp2 = this.obtainUpdateOp(adapterHelper$UpdateOp.cmd, n3, n2);
            this.dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp2, n4);
            this.recycleUpdateOp(obtainUpdateOp2);
        }
    }
    
    private void postponeAndUpdateViewHolders(final AdapterHelper$UpdateOp adapterHelper$UpdateOp) {
        this.mPostponedList.add(adapterHelper$UpdateOp);
        switch (adapterHelper$UpdateOp.cmd) {
            default: {
                throw new IllegalArgumentException("Unknown update op type for " + adapterHelper$UpdateOp);
            }
            case 0: {
                this.mCallback.offsetPositionsForAdd(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.itemCount);
            }
            case 3: {
                this.mCallback.offsetPositionsForMove(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.itemCount);
            }
            case 1: {
                this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.itemCount);
            }
            case 2: {
                this.mCallback.markViewHoldersUpdated(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.itemCount);
            }
        }
    }
    
    private int updatePositionWithPostponed(final int n, final int n2) {
        int i = -1 + this.mPostponedList.size();
        int n3 = n;
        while (i >= 0) {
            final AdapterHelper$UpdateOp adapterHelper$UpdateOp = this.mPostponedList.get(i);
            if (adapterHelper$UpdateOp.cmd == 3) {
                int n4;
                int n5;
                if (adapterHelper$UpdateOp.positionStart < adapterHelper$UpdateOp.itemCount) {
                    n4 = adapterHelper$UpdateOp.positionStart;
                    n5 = adapterHelper$UpdateOp.itemCount;
                }
                else {
                    n4 = adapterHelper$UpdateOp.itemCount;
                    n5 = adapterHelper$UpdateOp.positionStart;
                }
                int n6 = 0;
                Label_0112: {
                    if (n3 >= n4 && n3 <= n5) {
                        if (n4 == adapterHelper$UpdateOp.positionStart) {
                            if (n2 == 0) {
                                ++adapterHelper$UpdateOp.itemCount;
                            }
                            else if (n2 == 1) {
                                --adapterHelper$UpdateOp.itemCount;
                            }
                            n6 = n3 + 1;
                        }
                        else {
                            if (n2 == 0) {
                                ++adapterHelper$UpdateOp.positionStart;
                            }
                            else if (n2 == 1) {
                                --adapterHelper$UpdateOp.positionStart;
                            }
                            n6 = n3 - 1;
                        }
                    }
                    else {
                        if (n3 < adapterHelper$UpdateOp.positionStart) {
                            if (n2 == 0) {
                                ++adapterHelper$UpdateOp.positionStart;
                                ++adapterHelper$UpdateOp.itemCount;
                                n6 = n3;
                                break Label_0112;
                            }
                            if (n2 == 1) {
                                --adapterHelper$UpdateOp.positionStart;
                                --adapterHelper$UpdateOp.itemCount;
                            }
                        }
                        n6 = n3;
                    }
                }
                n3 = n6;
            }
            else if (adapterHelper$UpdateOp.positionStart <= n3) {
                if (adapterHelper$UpdateOp.cmd == 0) {
                    n3 -= adapterHelper$UpdateOp.itemCount;
                }
                else if (adapterHelper$UpdateOp.cmd == 1) {
                    n3 += adapterHelper$UpdateOp.itemCount;
                }
            }
            else if (n2 == 0) {
                ++adapterHelper$UpdateOp.positionStart;
            }
            else if (n2 == 1) {
                --adapterHelper$UpdateOp.positionStart;
            }
            --i;
        }
        for (int j = -1 + this.mPostponedList.size(); j >= 0; --j) {
            final AdapterHelper$UpdateOp adapterHelper$UpdateOp2 = this.mPostponedList.get(j);
            if (adapterHelper$UpdateOp2.cmd == 3) {
                if (adapterHelper$UpdateOp2.itemCount == adapterHelper$UpdateOp2.positionStart || adapterHelper$UpdateOp2.itemCount < 0) {
                    this.mPostponedList.remove(j);
                    this.recycleUpdateOp(adapterHelper$UpdateOp2);
                }
            }
            else if (adapterHelper$UpdateOp2.itemCount <= 0) {
                this.mPostponedList.remove(j);
                this.recycleUpdateOp(adapterHelper$UpdateOp2);
            }
        }
        return n3;
    }
    
    AdapterHelper addUpdateOp(final AdapterHelper$UpdateOp... array) {
        Collections.addAll(this.mPendingUpdates, array);
        return this;
    }
    
    void consumePostponedUpdates() {
        for (int size = this.mPostponedList.size(), i = 0; i < size; ++i) {
            this.mCallback.onDispatchSecondPass((AdapterHelper$UpdateOp)this.mPostponedList.get(i));
        }
        this.recycleUpdateOpsAndClearList(this.mPostponedList);
    }
    
    void consumeUpdatesInOnePass() {
        this.consumePostponedUpdates();
        for (int size = this.mPendingUpdates.size(), i = 0; i < size; ++i) {
            final AdapterHelper$UpdateOp adapterHelper$UpdateOp = this.mPendingUpdates.get(i);
            switch (adapterHelper$UpdateOp.cmd) {
                case 0: {
                    this.mCallback.onDispatchSecondPass(adapterHelper$UpdateOp);
                    this.mCallback.offsetPositionsForAdd(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.itemCount);
                    break;
                }
                case 1: {
                    this.mCallback.onDispatchSecondPass(adapterHelper$UpdateOp);
                    this.mCallback.offsetPositionsForRemovingInvisible(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.itemCount);
                    break;
                }
                case 2: {
                    this.mCallback.onDispatchSecondPass(adapterHelper$UpdateOp);
                    this.mCallback.markViewHoldersUpdated(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.itemCount);
                    break;
                }
                case 3: {
                    this.mCallback.onDispatchSecondPass(adapterHelper$UpdateOp);
                    this.mCallback.offsetPositionsForMove(adapterHelper$UpdateOp.positionStart, adapterHelper$UpdateOp.itemCount);
                    break;
                }
            }
            if (this.mOnItemProcessedCallback != null) {
                this.mOnItemProcessedCallback.run();
            }
        }
        this.recycleUpdateOpsAndClearList(this.mPendingUpdates);
    }
    
    void dispatchFirstPassAndUpdateViewHolders(final AdapterHelper$UpdateOp adapterHelper$UpdateOp, final int n) {
        this.mCallback.onDispatchFirstPass(adapterHelper$UpdateOp);
        switch (adapterHelper$UpdateOp.cmd) {
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            case 1: {
                this.mCallback.offsetPositionsForRemovingInvisible(n, adapterHelper$UpdateOp.itemCount);
            }
            case 2: {
                this.mCallback.markViewHoldersUpdated(n, adapterHelper$UpdateOp.itemCount);
            }
        }
    }
    
    int findPositionOffset(final int n) {
        return this.findPositionOffset(n, 0);
    }
    
    int findPositionOffset(final int n, int i) {
        final int size = this.mPostponedList.size();
        int itemCount = n;
        while (i < size) {
            final AdapterHelper$UpdateOp adapterHelper$UpdateOp = this.mPostponedList.get(i);
            if (adapterHelper$UpdateOp.cmd == 3) {
                if (adapterHelper$UpdateOp.positionStart == itemCount) {
                    itemCount = adapterHelper$UpdateOp.itemCount;
                }
                else {
                    if (adapterHelper$UpdateOp.positionStart < itemCount) {
                        --itemCount;
                    }
                    if (adapterHelper$UpdateOp.itemCount <= itemCount) {
                        ++itemCount;
                    }
                }
            }
            else if (adapterHelper$UpdateOp.positionStart <= itemCount) {
                if (adapterHelper$UpdateOp.cmd == 1) {
                    if (itemCount < adapterHelper$UpdateOp.positionStart + adapterHelper$UpdateOp.itemCount) {
                        itemCount = -1;
                        break;
                    }
                    itemCount -= adapterHelper$UpdateOp.itemCount;
                }
                else if (adapterHelper$UpdateOp.cmd == 0) {
                    itemCount += adapterHelper$UpdateOp.itemCount;
                }
            }
            ++i;
        }
        return itemCount;
    }
    
    boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }
    
    @Override
    public AdapterHelper$UpdateOp obtainUpdateOp(final int cmd, final int positionStart, final int itemCount) {
        final AdapterHelper$UpdateOp adapterHelper$UpdateOp = (AdapterHelper$UpdateOp)this.mUpdateOpPool.acquire();
        if (adapterHelper$UpdateOp == null) {
            return new AdapterHelper$UpdateOp(cmd, positionStart, itemCount);
        }
        adapterHelper$UpdateOp.cmd = cmd;
        adapterHelper$UpdateOp.positionStart = positionStart;
        adapterHelper$UpdateOp.itemCount = itemCount;
        return adapterHelper$UpdateOp;
    }
    
    boolean onItemRangeChanged(final int n, final int n2) {
        this.mPendingUpdates.add(this.obtainUpdateOp(2, n, n2));
        return this.mPendingUpdates.size() == 1;
    }
    
    boolean onItemRangeInserted(final int n, final int n2) {
        this.mPendingUpdates.add(this.obtainUpdateOp(0, n, n2));
        return this.mPendingUpdates.size() == 1;
    }
    
    boolean onItemRangeMoved(final int n, final int n2, final int n3) {
        boolean b = true;
        if (n == n2) {
            return false;
        }
        if (n3 != (b ? 1 : 0)) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.mPendingUpdates.add(this.obtainUpdateOp(3, n, n2));
        if (this.mPendingUpdates.size() != (b ? 1 : 0)) {
            b = false;
        }
        return b;
    }
    
    boolean onItemRangeRemoved(final int n, final int n2) {
        this.mPendingUpdates.add(this.obtainUpdateOp(1, n, n2));
        return this.mPendingUpdates.size() == 1;
    }
    
    void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        for (int size = this.mPendingUpdates.size(), i = 0; i < size; ++i) {
            final AdapterHelper$UpdateOp adapterHelper$UpdateOp = this.mPendingUpdates.get(i);
            switch (adapterHelper$UpdateOp.cmd) {
                case 0: {
                    this.applyAdd(adapterHelper$UpdateOp);
                    break;
                }
                case 1: {
                    this.applyRemove(adapterHelper$UpdateOp);
                    break;
                }
                case 2: {
                    this.applyUpdate(adapterHelper$UpdateOp);
                    break;
                }
                case 3: {
                    this.applyMove(adapterHelper$UpdateOp);
                    break;
                }
            }
            if (this.mOnItemProcessedCallback != null) {
                this.mOnItemProcessedCallback.run();
            }
        }
        this.mPendingUpdates.clear();
    }
    
    @Override
    public void recycleUpdateOp(final AdapterHelper$UpdateOp adapterHelper$UpdateOp) {
        if (!this.mDisableRecycler) {
            this.mUpdateOpPool.release(adapterHelper$UpdateOp);
        }
    }
    
    void recycleUpdateOpsAndClearList(final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            this.recycleUpdateOp(list.get(i));
        }
        list.clear();
    }
    
    void reset() {
        this.recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.recycleUpdateOpsAndClearList(this.mPostponedList);
    }
}
