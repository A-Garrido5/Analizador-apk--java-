// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view.accessibility;

class AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1 implements AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge
{
    final /* synthetic */ AccessibilityManagerCompat$AccessibilityManagerIcsImpl this$0;
    final /* synthetic */ AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat val$listener;
    
    AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1(final AccessibilityManagerCompat$AccessibilityManagerIcsImpl this$0, final AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat val$listener) {
        this.this$0 = this$0;
        this.val$listener = val$listener;
    }
    
    @Override
    public void onAccessibilityStateChanged(final boolean b) {
        this.val$listener.onAccessibilityStateChanged(b);
    }
}
