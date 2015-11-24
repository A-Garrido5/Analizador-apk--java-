// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

class AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1 implements AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge
{
    final AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl this$0;
    final AccessibilityNodeProviderCompat val$compat;
    
    AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1(final AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl this$0, final AccessibilityNodeProviderCompat val$compat) {
        this.this$0 = this$0;
        this.val$compat = val$compat;
    }
    
    @Override
    public Object createAccessibilityNodeInfo(final int n) {
        final AccessibilityNodeInfoCompat accessibilityNodeInfo = this.val$compat.createAccessibilityNodeInfo(n);
        if (accessibilityNodeInfo == null) {
            return null;
        }
        return accessibilityNodeInfo.getInfo();
    }
    
    @Override
    public List findAccessibilityNodeInfosByText(final String s, final int n) {
        final int a = AccessibilityNodeInfoCompat.a;
        final List accessibilityNodeInfosByText = this.val$compat.findAccessibilityNodeInfosByText(s, n);
        final ArrayList<Object> list = new ArrayList<Object>();
        int n2;
        for (int size = accessibilityNodeInfosByText.size(), i = 0; i < size; i = n2) {
            list.add(accessibilityNodeInfosByText.get(i).getInfo());
            n2 = i + 1;
            if (a != 0) {
                break;
            }
        }
        if (FragmentActivity.a != 0) {
            AccessibilityNodeInfoCompat.a = a + 1;
        }
        return list;
    }
    
    @Override
    public boolean performAction(final int n, final int n2, final Bundle bundle) {
        return this.val$compat.performAction(n, n2, bundle);
    }
}
