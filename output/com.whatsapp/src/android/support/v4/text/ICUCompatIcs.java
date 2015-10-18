// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.reflect.Method;

class ICUCompatIcs
{
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;
    private static final String[] z;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_m1      
        //     1: istore_0       
        //     2: iconst_4       
        //     3: anewarray       Ljava/lang/String;
        //     6: astore_1       
        //     7: iconst_0       
        //     8: istore_2       
        //     9: aload_1        
        //    10: astore_3       
        //    11: ldc             "NR\"-aja\u0016\u001aGdb"
        //    13: astore          4
        //    15: iload_0        
        //    16: istore          5
        //    18: aload           4
        //    20: invokestatic    android/support/v4/text/ICUCompatIcs.z:(Ljava/lang/String;)[C
        //    23: invokestatic    android/support/v4/text/ICUCompatIcs.z:([C)Ljava/lang/String;
        //    26: astore          6
        //    28: iload           5
        //    30: tableswitch {
        //                0: 75
        //                1: 94
        //                2: 113
        //          default: 56
        //        }
        //    56: aload_3        
        //    57: iload_2        
        //    58: aload           6
        //    60: aastore        
        //    61: ldc             "NR\"-aja\u0016\u001aGdb"
        //    63: astore          4
        //    65: iconst_1       
        //    66: istore_2       
        //    67: aload_1        
        //    68: astore_3       
        //    69: iconst_0       
        //    70: istore          5
        //    72: goto            18
        //    75: aload_3        
        //    76: iload_2        
        //    77: aload           6
        //    79: aastore        
        //    80: ldc             "NR\"-aja\u0016\u001aGdb"
        //    82: astore          4
        //    84: iconst_2       
        //    85: istore_2       
        //    86: aload_1        
        //    87: astore_3       
        //    88: iconst_1       
        //    89: istore          5
        //    91: goto            18
        //    94: aload_3        
        //    95: iload_2        
        //    96: aload           6
        //    98: aastore        
        //    99: iconst_3       
        //   100: istore_2       
        //   101: aload_1        
        //   102: astore_3       
        //   103: ldc             "NR\"-aja\u0016\u001aGdb"
        //   105: astore          4
        //   107: iconst_2       
        //   108: istore          5
        //   110: goto            18
        //   113: aload_3        
        //   114: iload_2        
        //   115: aload           6
        //   117: aastore        
        //   118: aload_1        
        //   119: putstatic       android/support/v4/text/ICUCompatIcs.z:[Ljava/lang/String;
        //   122: ldc             "kx\u0015\rautY\u0007mr?>-["
        //   124: invokestatic    android/support/v4/text/ICUCompatIcs.z:(Ljava/lang/String;)[C
        //   127: invokestatic    android/support/v4/text/ICUCompatIcs.z:([C)Ljava/lang/String;
        //   130: astore          7
        //   132: aload           7
        //   134: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   137: astore          10
        //   139: aload           10
        //   141: ifnull          228
        //   144: ldc             "`t\u0003=mux\u0007\u001a"
        //   146: astore          11
        //   148: aload           10
        //   150: astore          12
        //   152: aload           11
        //   154: invokestatic    android/support/v4/text/ICUCompatIcs.z:(Ljava/lang/String;)[C
        //   157: invokestatic    android/support/v4/text/ICUCompatIcs.z:([C)Ljava/lang/String;
        //   160: astore          13
        //   162: iload_0        
        //   163: tableswitch {
        //                0: 229
        //          default: 180
        //        }
        //   180: aload           12
        //   182: aload           13
        //   184: iconst_1       
        //   185: anewarray       Ljava/lang/Class;
        //   188: dup            
        //   189: iconst_0       
        //   190: ldc             Ljava/lang/String;.class
        //   192: aastore        
        //   193: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   196: putstatic       android/support/v4/text/ICUCompatIcs.sGetScriptMethod:Ljava/lang/reflect/Method;
        //   199: ldc             "fu\u0013\"glt\u001b\u0017]rs\u0003\u000fit"
        //   201: astore          11
        //   203: aload           10
        //   205: astore          12
        //   207: iconst_0       
        //   208: istore_0       
        //   209: goto            152
        //   212: astore          8
        //   214: ldc             "NR\"-aja\u0016\u001aGdb"
        //   216: invokestatic    android/support/v4/text/ICUCompatIcs.z:(Ljava/lang/String;)[C
        //   219: invokestatic    android/support/v4/text/ICUCompatIcs.z:([C)Ljava/lang/String;
        //   222: aload           8
        //   224: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/Throwable;)I
        //   227: pop            
        //   228: return         
        //   229: aload           12
        //   231: aload           13
        //   233: iconst_1       
        //   234: anewarray       Ljava/lang/Class;
        //   237: dup            
        //   238: iconst_0       
        //   239: ldc             Ljava/lang/String;.class
        //   241: aastore        
        //   242: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   245: putstatic       android/support/v4/text/ICUCompatIcs.sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;
        //   248: return         
        //   249: astore          14
        //   251: aload           14
        //   253: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  132    139    212    228    Ljava/lang/Exception;
        //  180    199    249    254    Ljava/lang/Exception;
        //  229    248    249    254    Ljava/lang/Exception;
        //  251    254    212    228    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0180:
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
    
    public static String addLikelySubtags(final String s) {
        try {
            if (ICUCompatIcs.sAddLikelySubtagsMethod != null) {
                return (String)ICUCompatIcs.sAddLikelySubtagsMethod.invoke(null, s);
            }
            goto Label_0044;
        }
        catch (IllegalAccessException ex) {
            Log.w(ICUCompatIcs.z[0], (Throwable)ex);
        }
        catch (InvocationTargetException ex2) {
            Log.w(ICUCompatIcs.z[1], (Throwable)ex2);
            goto Label_0044;
        }
    }
    
    public static String getScript(final String s) {
        try {
            if (ICUCompatIcs.sGetScriptMethod != null) {
                return (String)ICUCompatIcs.sGetScriptMethod.invoke(null, s);
            }
            goto Label_0044;
        }
        catch (IllegalAccessException ex) {
            Log.w(ICUCompatIcs.z[3], (Throwable)ex);
        }
        catch (InvocationTargetException ex2) {
            Log.w(ICUCompatIcs.z[2], (Throwable)ex2);
            goto Label_0044;
        }
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000e';
                    break;
                }
                case 0: {
                    c2 = '\u0007';
                    break;
                }
                case 1: {
                    c2 = '\u0011';
                    break;
                }
                case 2: {
                    c2 = 'w';
                    break;
                }
                case 3: {
                    c2 = 'n';
                    break;
                }
            }
            array[n] = (char)(c2 ^ c);
        }
        return new String(array).intern();
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length < 2) {
            charArray[0] ^= '\u000e';
        }
        return charArray;
    }
}
