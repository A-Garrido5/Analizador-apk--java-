// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view.accessibility;

class AccessibilityRecordCompat$AccessibilityRecordIcsImpl extends AccessibilityRecordCompat$AccessibilityRecordStubImpl
{
    @Override
    public Object obtain() {
        return AccessibilityRecordCompatIcs.obtain();
    }
    
    @Override
    public void setFromIndex(final Object o, final int n) {
        AccessibilityRecordCompatIcs.setFromIndex(o, n);
    }
    
    @Override
    public void setItemCount(final Object o, final int n) {
        AccessibilityRecordCompatIcs.setItemCount(o, n);
    }
    
    @Override
    public void setScrollX(final Object o, final int n) {
        AccessibilityRecordCompatIcs.setScrollX(o, n);
    }
    
    @Override
    public void setScrollY(final Object o, final int n) {
        AccessibilityRecordCompatIcs.setScrollY(o, n);
    }
    
    @Override
    public void setScrollable(final Object o, final boolean b) {
        AccessibilityRecordCompatIcs.setScrollable(o, b);
    }
    
    @Override
    public void setToIndex(final Object o, final int n) {
        AccessibilityRecordCompatIcs.setToIndex(o, n);
    }
}
