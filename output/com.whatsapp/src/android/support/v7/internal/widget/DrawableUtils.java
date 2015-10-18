// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.graphics.Rect;

public class DrawableUtils
{
    public static final Rect INSETS_NONE;
    private static Class sInsetsClazz;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "\u0000hF[0&vBy%-vT";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0016:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
            Label_0250_Outer:
                while (true) {
                    Label_0280: {
                        if (length > n3) {
                            break Label_0280;
                        }
                        final String intern = new String(charArray).intern();
                        final char[] charArray2;
                        final int length2;
                        int n4 = 0;
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "&uSX>)";
                                n2 = 1;
                                array = z2;
                                n = 0;
                                continue Label_0016;
                            }
                            case 0: {
                                array[n2] = intern;
                                s = "#\u007fSc!0sDM=\rtTI%7";
                                n2 = 2;
                                array = z2;
                                n = 1;
                                continue Label_0016;
                            }
                            case 1: {
                                array[n2] = intern;
                                s = "0uW";
                                n2 = 3;
                                array = z2;
                                n = 2;
                                continue Label_0016;
                            }
                            case 2: {
                                array[n2] = intern;
                                s = "(\u007fAX";
                                n2 = 4;
                                array = z2;
                                n = 3;
                                continue Label_0016;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                array = z2;
                                s = "6s@D%";
                                n = 4;
                                continue Label_0016;
                            }
                            case 4: {
                                array[n2] = intern;
                                n2 = 6;
                                s = "\u0007uR@5*=S\f>&nFE?dnOIq+jSE2%v\u0007E?7\u007fS_\u007fdS@B>6sIK\u007f";
                                n = 5;
                                array = z2;
                                continue Label_0016;
                            }
                            case 5: {
                                array[n2] = intern;
                                z = z2;
                                INSETS_NONE = new Rect();
                                if (Build$VERSION.SDK_INT >= 18) {
                                    charArray2 = "%tC^>-~\tK#%jOE274nB\"!nT".toCharArray();
                                    length2 = charArray2.length;
                                    n4 = 0;
                                    break;
                                }
                                return;
                            }
                        }
                        String intern2;
                        char c;
                        char c2;
                        char c3;
                        char c4;
                        Label_0416_Outer:Label_0324_Outer:
                        while (true) {
                            Label_0369: {
                                if (length2 > n4) {
                                    break Label_0369;
                                }
                                intern2 = new String(charArray2).intern();
                                try {
                                    DrawableUtils.sInsetsClazz = Class.forName(intern2);
                                    return;
                                    Label_0454: {
                                        c = ',';
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@10929976, n3 % 5)
                                Label_0324:
                                    while (true) {
                                        while (true) {
                                            break Label_0416;
                                            charArray[n3] = (char)(c2 ^ c3);
                                            ++n3;
                                            continue Label_0250_Outer;
                                            charArray2[n4] = (char)(c ^ c4);
                                            ++n4;
                                            continue Label_0416_Outer;
                                            Label_0433:
                                            c = 'D';
                                            continue Label_0324_Outer;
                                            Label_0341:
                                            c2 = 'D';
                                            continue Label_0324;
                                            c3 = charArray[n3];
                                            Label_0447:
                                            c = '\'';
                                            continue Label_0324_Outer;
                                            Label_0362:
                                            c2 = ',';
                                            continue Label_0324;
                                            Label_0348:
                                            c2 = '\u001a';
                                            continue Label_0324;
                                            Label_0355:
                                            c2 = '\'';
                                            continue Label_0324;
                                            Label_0440:
                                            c = '\u001a';
                                            continue Label_0324_Outer;
                                            Label_0412:
                                            c = 'Q';
                                            continue Label_0324_Outer;
                                        }
                                        c4 = charArray2[n4];
                                        Label_0320:
                                        c2 = 'Q';
                                        continue Label_0324;
                                    }
                                }
                                // switch([Lcom.strobel.decompiler.ast.Label;@1c01696c, n4 % 5)
                                catch (ClassNotFoundException ex) {}
                            }
                            break;
                        }
                    }
                }
            }
            break;
        }
    }
    
    public static Rect getOpticalBounds(final Drawable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/widget/AdapterViewCompat.a:I
        //     3: istore_1       
        //     4: getstatic       android/support/v7/internal/widget/DrawableUtils.sInsetsClazz:Ljava/lang/Class;
        //     7: ifnull          260
        //    10: aload_0        
        //    11: invokestatic    android/support/v4/graphics/drawable/DrawableCompat.unwrap:(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
        //    14: astore          4
        //    16: aload           4
        //    18: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    21: getstatic       android/support/v7/internal/widget/DrawableUtils.z:[Ljava/lang/String;
        //    24: iconst_2       
        //    25: aaload         
        //    26: iconst_0       
        //    27: anewarray       Ljava/lang/Class;
        //    30: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    33: aload           4
        //    35: iconst_0       
        //    36: anewarray       Ljava/lang/Object;
        //    39: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    42: astore          5
        //    44: aload           5
        //    46: ifnull          260
        //    49: new             Landroid/graphics/Rect;
        //    52: dup            
        //    53: invokespecial   android/graphics/Rect.<init>:()V
        //    56: astore          6
        //    58: getstatic       android/support/v7/internal/widget/DrawableUtils.sInsetsClazz:Ljava/lang/Class;
        //    61: invokevirtual   java/lang/Class.getFields:()[Ljava/lang/reflect/Field;
        //    64: astore          7
        //    66: aload           7
        //    68: arraylength    
        //    69: istore          8
        //    71: iconst_0       
        //    72: istore          9
        //    74: iload           9
        //    76: iload           8
        //    78: if_icmpge       426
        //    81: aload           7
        //    83: iload           9
        //    85: aaload         
        //    86: astore          10
        //    88: aload           10
        //    90: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    93: astore          11
        //    95: iconst_m1      
        //    96: istore          12
        //    98: aload           11
        //   100: invokevirtual   java/lang/String.hashCode:()I
        //   103: lookupswitch {
        //          -1383228885: 216
        //           115029: 168
        //          3317767: 144
        //          108511772: 192
        //          default: 384
        //        }
        //   144: aload           11
        //   146: getstatic       android/support/v7/internal/widget/DrawableUtils.z:[Ljava/lang/String;
        //   149: iconst_4       
        //   150: aaload         
        //   151: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   154: istore          25
        //   156: iload           25
        //   158: ifeq            384
        //   161: iload_1        
        //   162: ifeq            381
        //   165: iconst_0       
        //   166: istore          12
        //   168: aload           11
        //   170: getstatic       android/support/v7/internal/widget/DrawableUtils.z:[Ljava/lang/String;
        //   173: iconst_3       
        //   174: aaload         
        //   175: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   178: istore          24
        //   180: iload           24
        //   182: ifeq            384
        //   185: iload_1        
        //   186: ifeq            375
        //   189: iconst_1       
        //   190: istore          12
        //   192: aload           11
        //   194: getstatic       android/support/v7/internal/widget/DrawableUtils.z:[Ljava/lang/String;
        //   197: iconst_5       
        //   198: aaload         
        //   199: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   202: istore          22
        //   204: iload           22
        //   206: ifeq            384
        //   209: iload_1        
        //   210: ifeq            369
        //   213: iconst_2       
        //   214: istore          12
        //   216: aload           11
        //   218: getstatic       android/support/v7/internal/widget/DrawableUtils.z:[Ljava/lang/String;
        //   221: iconst_1       
        //   222: aaload         
        //   223: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   226: istore          15
        //   228: iload           15
        //   230: ifeq            384
        //   233: iconst_3       
        //   234: istore          12
        //   236: goto            384
        //   239: astore          13
        //   241: aload           13
        //   243: athrow         
        //   244: astore_2       
        //   245: getstatic       android/support/v7/internal/widget/DrawableUtils.z:[Ljava/lang/String;
        //   248: iconst_0       
        //   249: aaload         
        //   250: getstatic       android/support/v7/internal/widget/DrawableUtils.z:[Ljava/lang/String;
        //   253: bipush          6
        //   255: aaload         
        //   256: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   259: pop            
        //   260: getstatic       android/support/v7/internal/widget/DrawableUtils.INSETS_NONE:Landroid/graphics/Rect;
        //   263: areturn        
        //   264: astore          23
        //   266: aload           23
        //   268: athrow         
        //   269: astore          21
        //   271: aload           21
        //   273: athrow         
        //   274: astore          14
        //   276: aload           14
        //   278: athrow         
        //   279: aload           6
        //   281: aload           10
        //   283: aload           5
        //   285: invokevirtual   java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
        //   288: putfield        android/graphics/Rect.left:I
        //   291: iload_1        
        //   292: ifeq            416
        //   295: aload           6
        //   297: aload           10
        //   299: aload           5
        //   301: invokevirtual   java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
        //   304: putfield        android/graphics/Rect.top:I
        //   307: iload_1        
        //   308: ifeq            416
        //   311: aload           6
        //   313: aload           10
        //   315: aload           5
        //   317: invokevirtual   java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
        //   320: putfield        android/graphics/Rect.right:I
        //   323: iload_1        
        //   324: ifeq            416
        //   327: aload           6
        //   329: aload           10
        //   331: aload           5
        //   333: invokevirtual   java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
        //   336: putfield        android/graphics/Rect.bottom:I
        //   339: goto            416
        //   342: astore          16
        //   344: aload           16
        //   346: athrow         
        //   347: astore          20
        //   349: aload           20
        //   351: athrow         
        //   352: astore          19
        //   354: aload           19
        //   356: athrow         
        //   357: astore          18
        //   359: aload           18
        //   361: athrow         
        //   362: iload           17
        //   364: istore          9
        //   366: goto            74
        //   369: iconst_2       
        //   370: istore          12
        //   372: goto            384
        //   375: iconst_1       
        //   376: istore          12
        //   378: goto            384
        //   381: iconst_0       
        //   382: istore          12
        //   384: iload           12
        //   386: tableswitch {
        //                0: 279
        //                1: 295
        //                2: 311
        //                3: 327
        //          default: 416
        //        }
        //   416: iload           9
        //   418: iconst_1       
        //   419: iadd           
        //   420: istore          17
        //   422: iload_1        
        //   423: ifeq            362
        //   426: aload           6
        //   428: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     44     244    260    Ljava/lang/Exception;
        //  49     71     244    260    Ljava/lang/Exception;
        //  81     95     244    260    Ljava/lang/Exception;
        //  98     144    239    244    Ljava/lang/Exception;
        //  144    156    239    244    Ljava/lang/Exception;
        //  168    180    264    269    Ljava/lang/Exception;
        //  192    204    269    274    Ljava/lang/Exception;
        //  216    228    274    279    Ljava/lang/Exception;
        //  241    244    244    260    Ljava/lang/Exception;
        //  266    269    244    260    Ljava/lang/Exception;
        //  271    274    244    260    Ljava/lang/Exception;
        //  276    279    244    260    Ljava/lang/Exception;
        //  279    291    347    352    Ljava/lang/Exception;
        //  295    307    352    357    Ljava/lang/Exception;
        //  311    323    357    362    Ljava/lang/Exception;
        //  327    339    342    347    Ljava/lang/Exception;
        //  344    347    244    260    Ljava/lang/Exception;
        //  349    352    352    357    Ljava/lang/Exception;
        //  354    357    357    362    Ljava/lang/Exception;
        //  359    362    342    347    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 179, Size: 179
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
