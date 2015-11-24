// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

class AccessibilityRecordCompatIcs
{
    public static Object obtain() {
        return AccessibilityRecord.obtain();
    }
    
    public static void setFromIndex(final Object o, final int fromIndex) {
        ((AccessibilityRecord)o).setFromIndex(fromIndex);
    }
    
    public static void setItemCount(final Object o, final int itemCount) {
        ((AccessibilityRecord)o).setItemCount(itemCount);
    }
    
    public static void setScrollX(final Object o, final int scrollX) {
        ((AccessibilityRecord)o).setScrollX(scrollX);
    }
    
    public static void setScrollY(final Object o, final int scrollY) {
        ((AccessibilityRecord)o).setScrollY(scrollY);
    }
    
    public static void setScrollable(final Object o, final boolean scrollable) {
        ((AccessibilityRecord)o).setScrollable(scrollable);
    }
    
    public static void setToIndex(final Object o, final int toIndex) {
        ((AccessibilityRecord)o).setToIndex(toIndex);
    }
}
