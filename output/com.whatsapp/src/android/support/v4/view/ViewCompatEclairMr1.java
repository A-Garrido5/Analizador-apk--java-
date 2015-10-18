// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.ViewGroup;
import android.view.View;
import java.lang.reflect.Method;

class ViewCompatEclairMr1
{
    private static Method sChildrenDrawingOrderMethod;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "(|AM9\u0011xT[\u000e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = '~';
                        break;
                    }
                    case 1: {
                        c2 = '\u0015';
                        break;
                    }
                    case 2: {
                        c2 = '$';
                        break;
                    }
                    case 3: {
                        c2 = ':';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "(|AM9\u0011xT[\u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "+{EX\u0016\u001b5PUZ\u0017{RU\u0011\u001b5GR\u0013\u0012qV_\u0014:gEM\u0013\u0010rkH\u001e\u001bgaT\u001b\u001cyA^";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "(|AM9\u0011xT[\u000e";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "+{EX\u0016\u001b5PUZ\u0018|J^Z\u001d}MV\u001e\fpJ~\b\u001fbMT\u001d1g@_\b;{EX\u0016\u001bq";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "+{EX\u0016\u001b5PUZ\u0017{RU\u0011\u001b5GR\u0013\u0012qV_\u0014:gEM\u0013\u0010rkH\u001e\u001bgaT\u001b\u001cyA^";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "(|AM9\u0011xT[\u000e";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "+{EX\u0016\u001b5PUZ\u0017{RU\u0011\u001b5GR\u0013\u0012qV_\u0014:gEM\u0013\u0010rkH\u001e\u001bgaT\u001b\u001cyA^";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\rpPy\u0012\u0017y@H\u001f\u0010QV[\r\u0017{Cu\b\u001apV\u007f\u0014\u001fwH_\u001e";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
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
        //     3: astore_3       
        //     4: aload_3        
        //     5: ifnonnull       48
        //     8: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //    11: bipush          8
        //    13: aaload         
        //    14: astore          15
        //    16: iconst_1       
        //    17: anewarray       Ljava/lang/Class;
        //    20: astore          16
        //    22: aload           16
        //    24: iconst_0       
        //    25: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    28: aastore        
        //    29: ldc             Landroid/view/ViewGroup;.class
        //    31: aload           15
        //    33: aload           16
        //    35: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    38: putstatic       android/support/v4/view/ViewCompatEclairMr1.sChildrenDrawingOrderMethod:Ljava/lang/reflect/Method;
        //    41: getstatic       android/support/v4/view/ViewCompatEclairMr1.sChildrenDrawingOrderMethod:Ljava/lang/reflect/Method;
        //    44: iconst_1       
        //    45: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    48: getstatic       android/support/v4/view/ViewCompatEclairMr1.sChildrenDrawingOrderMethod:Ljava/lang/reflect/Method;
        //    51: astore          10
        //    53: iconst_1       
        //    54: anewarray       Ljava/lang/Object;
        //    57: astore          11
        //    59: aload           11
        //    61: iconst_0       
        //    62: iload_1        
        //    63: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    66: aastore        
        //    67: aload           10
        //    69: aload_0        
        //    70: aload           11
        //    72: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    75: pop            
        //    76: return         
        //    77: astore_2       
        //    78: aload_2        
        //    79: athrow         
        //    80: astore          13
        //    82: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //    85: iconst_0       
        //    86: aaload         
        //    87: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //    90: iconst_4       
        //    91: aaload         
        //    92: aload           13
        //    94: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    97: pop            
        //    98: goto            41
        //   101: astore          8
        //   103: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //   106: iconst_1       
        //   107: aaload         
        //   108: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //   111: iconst_5       
        //   112: aaload         
        //   113: aload           8
        //   115: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   118: pop            
        //   119: return         
        //   120: astore          6
        //   122: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //   125: iconst_3       
        //   126: aaload         
        //   127: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //   130: iconst_2       
        //   131: aaload         
        //   132: aload           6
        //   134: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   137: pop            
        //   138: return         
        //   139: astore          4
        //   141: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //   144: bipush          6
        //   146: aaload         
        //   147: getstatic       android/support/v4/view/ViewCompatEclairMr1.z:[Ljava/lang/String;
        //   150: bipush          7
        //   152: aaload         
        //   153: aload           4
        //   155: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   158: pop            
        //   159: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  0      4      77     80     Ljava/lang/IllegalAccessException;
        //  8      41     80     101    Ljava/lang/NoSuchMethodException;
        //  8      41     77     80     Ljava/lang/IllegalAccessException;
        //  48     76     101    120    Ljava/lang/IllegalAccessException;
        //  48     76     120    139    Ljava/lang/IllegalArgumentException;
        //  48     76     139    160    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 86, Size: 86
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
