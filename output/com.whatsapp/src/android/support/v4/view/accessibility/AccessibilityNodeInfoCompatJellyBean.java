// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellyBean
{
    public static int getMovementGranularities(final Object o) {
        return ((AccessibilityNodeInfo)o).getMovementGranularities();
    }
    
    public static boolean isAccessibilityFocused(final Object o) {
        return ((AccessibilityNodeInfo)o).isAccessibilityFocused();
    }
    
    public static boolean isVisibleToUser(final Object o) {
        return ((AccessibilityNodeInfo)o).isVisibleToUser();
    }
    
    public static void setAccesibilityFocused(final Object o, final boolean accessibilityFocused) {
        ((AccessibilityNodeInfo)o).setAccessibilityFocused(accessibilityFocused);
    }
    
    public static void setMovementGranularities(final Object o, final int movementGranularities) {
        ((AccessibilityNodeInfo)o).setMovementGranularities(movementGranularities);
    }
    
    public static void setVisibleToUser(final Object o, final boolean visibleToUser) {
        ((AccessibilityNodeInfo)o).setVisibleToUser(visibleToUser);
    }
}
