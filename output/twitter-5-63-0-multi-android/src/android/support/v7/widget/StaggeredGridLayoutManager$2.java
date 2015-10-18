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
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.view.View;
import java.util.BitSet;
import android.graphics.PointF;
import android.content.Context;

class StaggeredGridLayoutManager$2 extends LinearSmoothScroller
{
    final /* synthetic */ StaggeredGridLayoutManager this$0;
    
    StaggeredGridLayoutManager$2(final StaggeredGridLayoutManager this$0, final Context context) {
        this.this$0 = this$0;
        super(context);
    }
    
    @Override
    public PointF computeScrollVectorForPosition(final int n) {
        final int access$400 = this.this$0.calculateScrollDirectionForPosition(n);
        if (access$400 == 0) {
            return null;
        }
        if (this.this$0.mOrientation == 0) {
            return new PointF((float)access$400, 0.0f);
        }
        return new PointF(0.0f, (float)access$400);
    }
}
