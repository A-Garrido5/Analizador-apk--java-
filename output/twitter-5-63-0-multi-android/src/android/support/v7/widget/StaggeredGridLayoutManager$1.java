// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.view.View;
import java.util.BitSet;

class StaggeredGridLayoutManager$1 implements Runnable
{
    final /* synthetic */ StaggeredGridLayoutManager this$0;
    
    StaggeredGridLayoutManager$1(final StaggeredGridLayoutManager this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        this.this$0.checkForGaps();
    }
}
