// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;

class ViewPager$MyAccessibilityDelegate extends AccessibilityDelegateCompat
{
    final ViewPager this$0;
    
    ViewPager$MyAccessibilityDelegate(final ViewPager this$0) {
        this.this$0 = this$0;
    }
    
    private boolean canScroll() {
        return ViewPager.access$200(this.this$0) != null && ViewPager.access$200(this.this$0).getCount() > 1;
    }
    
    @Override
    public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)ViewPager.class.getName());
        final AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
        obtain.setScrollable(this.canScroll());
        if (accessibilityEvent.getEventType() == 4096 && ViewPager.access$200(this.this$0) != null) {
            obtain.setItemCount(ViewPager.access$200(this.this$0).getCount());
            obtain.setFromIndex(ViewPager.access$300(this.this$0));
            obtain.setToIndex(ViewPager.access$300(this.this$0));
        }
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
        accessibilityNodeInfoCompat.setScrollable(this.canScroll());
        if (this.this$0.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.addAction(4096);
        }
        if (this.this$0.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.addAction(8192);
        }
    }
    
    @Override
    public boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        if (super.performAccessibilityAction(view, n, bundle)) {
            return true;
        }
        switch (n) {
            default: {
                return false;
            }
            case 4096: {
                if (this.this$0.canScrollHorizontally(1)) {
                    this.this$0.setCurrentItem(1 + ViewPager.access$300(this.this$0));
                    return true;
                }
                return false;
            }
            case 8192: {
                if (this.this$0.canScrollHorizontally(-1)) {
                    this.this$0.setCurrentItem(-1 + ViewPager.access$300(this.this$0));
                    return true;
                }
                return false;
            }
        }
    }
}
