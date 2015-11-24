// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class SlidingPaneLayout$SlidingPanelLayoutImplJB extends SlidingPaneLayout$SlidingPanelLayoutImplBase
{
    private static final String[] z;
    private Method mGetDisplayList;
    private Field mRecreateDisplayList;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0002\u000e\"Hkg\u000e5Ak\"\u000f8Nw \\4Nj7\u00101^9+\u0015#S94\b1S|";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0019';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = 'P';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0014\u00109Cp)\u001b\u0000Fw\"01^v2\b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "*.5Dk\"\u001d$B].\u000f Kx>09Tm";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0014\u00109Cp)\u001b\u0000Fw\"01^v2\b";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = " \u0019$cp4\f<F`\u000b\u0015#S";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0014\u00109Cp)\u001b\u0000Fw\"01^v2\b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0004\u0013%K})[$\u0007\u007f\"\b3O9 \u0019$cp4\f<F`\u000b\u0015#S9*\u0019$Ov#GpCp*\u00119I~g\u000b?I>3\\'Hk,\\\"N~/\b~";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0004\u0013%K})[$\u0007\u007f\"\b3O9*.5Dk\"\u001d$B].\u000f Kx>09Tmg\u001a9Bu#GpCp*\u00119I~g\u000b9Kug\u001e5\u0007j+\u0013'\t";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    SlidingPaneLayout$SlidingPanelLayoutImplJB() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase.<init>:()V
        //     4: aload_0        
        //     5: ldc             Landroid/view/View;.class
        //     7: getstatic       android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.z:[Ljava/lang/String;
        //    10: iconst_4       
        //    11: aaload         
        //    12: aconst_null    
        //    13: checkcast       [Ljava/lang/Class;
        //    16: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    19: putfield        android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.mGetDisplayList:Ljava/lang/reflect/Method;
        //    22: aload_0        
        //    23: ldc             Landroid/view/View;.class
        //    25: getstatic       android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.z:[Ljava/lang/String;
        //    28: iconst_2       
        //    29: aaload         
        //    30: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    33: putfield        android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.mRecreateDisplayList:Ljava/lang/reflect/Field;
        //    36: aload_0        
        //    37: getfield        android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.mRecreateDisplayList:Ljava/lang/reflect/Field;
        //    40: iconst_1       
        //    41: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    44: return         
        //    45: astore_1       
        //    46: getstatic       android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.z:[Ljava/lang/String;
        //    49: iconst_3       
        //    50: aaload         
        //    51: getstatic       android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.z:[Ljava/lang/String;
        //    54: bipush          6
        //    56: aaload         
        //    57: aload_1        
        //    58: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    61: pop            
        //    62: goto            22
        //    65: astore_3       
        //    66: getstatic       android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.z:[Ljava/lang/String;
        //    69: iconst_5       
        //    70: aaload         
        //    71: getstatic       android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.z:[Ljava/lang/String;
        //    74: bipush          7
        //    76: aaload         
        //    77: aload_3        
        //    78: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    81: pop            
        //    82: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      22     45     65     Ljava/lang/NoSuchMethodException;
        //  22     44     65     83     Ljava/lang/NoSuchFieldException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    public void invalidateChildRegion(final SlidingPaneLayout p0, final View p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.mGetDisplayList:Ljava/lang/reflect/Method;
        //     4: ifnull          74
        //     7: aload_0        
        //     8: getfield        android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.mRecreateDisplayList:Ljava/lang/reflect/Field;
        //    11: astore          5
        //    13: aload           5
        //    15: ifnull          74
        //    18: aload_0        
        //    19: getfield        android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.mRecreateDisplayList:Ljava/lang/reflect/Field;
        //    22: aload_2        
        //    23: iconst_1       
        //    24: invokevirtual   java/lang/reflect/Field.setBoolean:(Ljava/lang/Object;Z)V
        //    27: aload_0        
        //    28: getfield        android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.mGetDisplayList:Ljava/lang/reflect/Method;
        //    31: aload_2        
        //    32: aconst_null    
        //    33: checkcast       [Ljava/lang/Object;
        //    36: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    39: pop            
        //    40: aload_0        
        //    41: aload_1        
        //    42: aload_2        
        //    43: invokespecial   android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase.invalidateChildRegion:(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
        //    46: return         
        //    47: astore_3       
        //    48: aload_3        
        //    49: athrow         
        //    50: astore          6
        //    52: getstatic       android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.z:[Ljava/lang/String;
        //    55: iconst_1       
        //    56: aaload         
        //    57: getstatic       android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB.z:[Ljava/lang/String;
        //    60: iconst_0       
        //    61: aaload         
        //    62: aload           6
        //    64: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    67: pop            
        //    68: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //    71: ifeq            40
        //    74: aload_2        
        //    75: invokevirtual   android/view/View.invalidate:()V
        //    78: return         
        //    79: astore          4
        //    81: aload           4
        //    83: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      13     47     50     Ljava/lang/Exception;
        //  18     40     50     74     Ljava/lang/Exception;
        //  52     74     79     84     Ljava/lang/Exception;
        //  74     78     79     84     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
