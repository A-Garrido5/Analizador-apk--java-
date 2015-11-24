// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.view.View;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.view.accessibility.AccessibilityManager;
import android.content.Context;

public class a
{
    private static volatile boolean a;
    
    static {
        com.twitter.util.a.a = false;
    }
    
    public static void a(final Context context) {
        com.twitter.util.a.a = false;
        final AccessibilityManager accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
        com.twitter.util.a.a = (accessibilityManager.isEnabled() && AccessibilityManagerCompat.isTouchExplorationEnabled(accessibilityManager));
    }
    
    private static void a(final View view) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = viewGroup.getChildAt(i);
                child.setContentDescription((CharSequence)null);
                a(child);
            }
        }
    }
    
    @TargetApi(16)
    public static void a(final View view, final int importantForAccessibility) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.setImportantForAccessibility(importantForAccessibility);
        }
        else if (importantForAccessibility == 2 || importantForAccessibility == 4) {
            view.setContentDescription((CharSequence)null);
            if (importantForAccessibility == 4) {
                a(view);
            }
        }
    }
    
    public static boolean a() {
        return com.twitter.util.a.a;
    }
}
