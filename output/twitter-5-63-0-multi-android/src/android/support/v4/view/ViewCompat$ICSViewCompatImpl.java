// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;
import android.view.View;
import java.lang.reflect.Field;

class ViewCompat$ICSViewCompatImpl extends ViewCompat$HCViewCompatImpl
{
    static boolean accessibilityDelegateCheckFailed;
    static Field mAccessibilityDelegateField;
    
    static {
        ViewCompat$ICSViewCompatImpl.accessibilityDelegateCheckFailed = false;
    }
    
    @Override
    public ViewPropertyAnimatorCompat animate(final View view) {
        if (this.mViewPropertyAnimatorCompatMap == null) {
            this.mViewPropertyAnimatorCompatMap = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mViewPropertyAnimatorCompatMap.get(view);
        if (viewPropertyAnimatorCompat == null) {
            viewPropertyAnimatorCompat = new ViewPropertyAnimatorCompat(view);
            this.mViewPropertyAnimatorCompatMap.put(view, viewPropertyAnimatorCompat);
        }
        return viewPropertyAnimatorCompat;
    }
    
    @Override
    public boolean canScrollHorizontally(final View view, final int n) {
        return ViewCompatICS.canScrollHorizontally(view, n);
    }
    
    @Override
    public boolean canScrollVertically(final View view, final int n) {
        return ViewCompatICS.canScrollVertically(view, n);
    }
    
    @Override
    public boolean hasAccessibilityDelegate(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       android/support/v4/view/ViewCompat$ICSViewCompatImpl.accessibilityDelegateCheckFailed:Z
        //     5: ifeq            10
        //     8: iconst_0       
        //     9: ireturn        
        //    10: getstatic       android/support/v4/view/ViewCompat$ICSViewCompatImpl.mAccessibilityDelegateField:Ljava/lang/reflect/Field;
        //    13: ifnonnull       33
        //    16: ldc             Landroid/view/View;.class
        //    18: ldc             "mAccessibilityDelegate"
        //    20: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    23: putstatic       android/support/v4/view/ViewCompat$ICSViewCompatImpl.mAccessibilityDelegateField:Ljava/lang/reflect/Field;
        //    26: getstatic       android/support/v4/view/ViewCompat$ICSViewCompatImpl.mAccessibilityDelegateField:Ljava/lang/reflect/Field;
        //    29: iconst_1       
        //    30: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    33: getstatic       android/support/v4/view/ViewCompat$ICSViewCompatImpl.mAccessibilityDelegateField:Ljava/lang/reflect/Field;
        //    36: aload_1        
        //    37: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    40: astore          4
        //    42: aload           4
        //    44: ifnull          57
        //    47: iload_2        
        //    48: ireturn        
        //    49: astore          5
        //    51: iload_2        
        //    52: putstatic       android/support/v4/view/ViewCompat$ICSViewCompatImpl.accessibilityDelegateCheckFailed:Z
        //    55: iconst_0       
        //    56: ireturn        
        //    57: iconst_0       
        //    58: istore_2       
        //    59: goto            47
        //    62: astore_3       
        //    63: iload_2        
        //    64: putstatic       android/support/v4/view/ViewCompat$ICSViewCompatImpl.accessibilityDelegateCheckFailed:Z
        //    67: iconst_0       
        //    68: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  16     33     49     57     Ljava/lang/Throwable;
        //  33     42     62     69     Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        ViewCompatICS.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewCompatICS.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.getInfo());
    }
    
    @Override
    public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        ViewCompatICS.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    @Override
    public void setAccessibilityDelegate(final View view, final AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompatICS.setAccessibilityDelegate(view, accessibilityDelegateCompat.getBridge());
    }
}
