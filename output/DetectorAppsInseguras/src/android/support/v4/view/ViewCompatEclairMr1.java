// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.ViewGroup;
import android.view.View;
import java.lang.reflect.Method;

class ViewCompatEclairMr1
{
    public static final String TAG = "ViewCompat";
    private static Method sChildrenDrawingOrderMethod;
    
    public static boolean isOpaque(final View view) {
        return view.isOpaque();
    }
    
    public static void setChildrenDrawingOrderEnabled(final ViewGroup p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewCompatEclairMr1.sChildrenDrawingOrderMethod:Ljava/lang/reflect/Method;
        //     3: ifnonnull       38
        //     6: iconst_1       
        //     7: anewarray       Ljava/lang/Class;
        //    10: astore          13
        //    12: aload           13
        //    14: iconst_0       
        //    15: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    18: aastore        
        //    19: ldc             Landroid/view/ViewGroup;.class
        //    21: ldc             "setChildrenDrawingOrderEnabled"
        //    23: aload           13
        //    25: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    28: putstatic       android/support/v4/view/ViewCompatEclairMr1.sChildrenDrawingOrderMethod:Ljava/lang/reflect/Method;
        //    31: getstatic       android/support/v4/view/ViewCompatEclairMr1.sChildrenDrawingOrderMethod:Ljava/lang/reflect/Method;
        //    34: iconst_1       
        //    35: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    38: getstatic       android/support/v4/view/ViewCompatEclairMr1.sChildrenDrawingOrderMethod:Ljava/lang/reflect/Method;
        //    41: astore          8
        //    43: iconst_1       
        //    44: anewarray       Ljava/lang/Object;
        //    47: astore          9
        //    49: aload           9
        //    51: iconst_0       
        //    52: iload_1        
        //    53: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    56: aastore        
        //    57: aload           8
        //    59: aload_0        
        //    60: aload           9
        //    62: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    65: pop            
        //    66: return         
        //    67: astore          11
        //    69: ldc             "ViewCompat"
        //    71: ldc             "Unable to find childrenDrawingOrderEnabled"
        //    73: aload           11
        //    75: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    78: pop            
        //    79: goto            31
        //    82: astore          6
        //    84: ldc             "ViewCompat"
        //    86: ldc             "Unable to invoke childrenDrawingOrderEnabled"
        //    88: aload           6
        //    90: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    93: pop            
        //    94: return         
        //    95: astore          4
        //    97: ldc             "ViewCompat"
        //    99: ldc             "Unable to invoke childrenDrawingOrderEnabled"
        //   101: aload           4
        //   103: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   106: pop            
        //   107: return         
        //   108: astore_2       
        //   109: ldc             "ViewCompat"
        //   111: ldc             "Unable to invoke childrenDrawingOrderEnabled"
        //   113: aload_2        
        //   114: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   117: pop            
        //   118: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  6      31     67     82     Ljava/lang/NoSuchMethodException;
        //  38     66     82     95     Ljava/lang/IllegalAccessException;
        //  38     66     95     108    Ljava/lang/IllegalArgumentException;
        //  38     66     108    119    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
}
