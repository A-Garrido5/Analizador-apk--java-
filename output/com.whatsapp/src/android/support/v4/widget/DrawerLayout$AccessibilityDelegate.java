// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.ViewParent;
import android.support.v4.view.ViewCompat;
import java.util.List;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.graphics.Rect;
import android.support.v4.view.AccessibilityDelegateCompat;

class DrawerLayout$AccessibilityDelegate extends AccessibilityDelegateCompat
{
    private final Rect mTmpRect;
    final DrawerLayout this$0;
    
    DrawerLayout$AccessibilityDelegate(final DrawerLayout this$0) {
        this.this$0 = this$0;
        this.mTmpRect = new Rect();
    }
    
    private void addChildrenForAccessibility(final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, final ViewGroup viewGroup) {
        final boolean a = SlidingPaneLayout.a;
        final int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            final View child = viewGroup.getChildAt(i);
            if (DrawerLayout.access$400(child)) {
                accessibilityNodeInfoCompat.addChild(child);
            }
            ++i;
            if (a) {
                break;
            }
        }
    }
    
    private void copyNodeInfoNoChildren(final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
        final Rect mTmpRect = this.mTmpRect;
        accessibilityNodeInfoCompat2.getBoundsInParent(mTmpRect);
        accessibilityNodeInfoCompat.setBoundsInParent(mTmpRect);
        accessibilityNodeInfoCompat2.getBoundsInScreen(mTmpRect);
        accessibilityNodeInfoCompat.setBoundsInScreen(mTmpRect);
        accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
        accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
        accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
        accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
        accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
        accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
        accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
        accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
        accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
        accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
        accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
        accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
    }
    
    @Override
    public boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            final List text = accessibilityEvent.getText();
            final View access$300 = DrawerLayout.access$300(this.this$0);
            if (access$300 != null) {
                final CharSequence drawerTitle = this.this$0.getDrawerTitle(this.this$0.getDrawerViewAbsoluteGravity(access$300));
                if (drawerTitle != null) {
                    text.add(drawerTitle);
                }
            }
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    @Override
    public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)DrawerLayout.class.getName());
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfo(final View source, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Label_0076: {
            if (DrawerLayout.access$200()) {
                super.onInitializeAccessibilityNodeInfo(source, accessibilityNodeInfoCompat);
                if (!SlidingPaneLayout.a) {
                    break Label_0076;
                }
            }
            final AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(source, obtain);
            accessibilityNodeInfoCompat.setSource(source);
            final ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(source);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View)parentForAccessibility);
            }
            this.copyNodeInfoNoChildren(accessibilityNodeInfoCompat, obtain);
            obtain.recycle();
            this.addChildrenForAccessibility(accessibilityNodeInfoCompat, (ViewGroup)source);
        }
        accessibilityNodeInfoCompat.setClassName(DrawerLayout.class.getName());
        accessibilityNodeInfoCompat.setFocusable(false);
        accessibilityNodeInfoCompat.setFocused(false);
    }
    
    @Override
    public boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return (DrawerLayout.access$200() || DrawerLayout.access$400(view)) && super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
