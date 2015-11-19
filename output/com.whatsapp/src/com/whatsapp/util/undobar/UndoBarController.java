// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.undobar;

import android.os.Bundle;
import android.annotation.TargetApi;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.animation.Interpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.content.res.Resources;
import android.annotation.SuppressLint;
import android.view.WindowManager;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import android.widget.TextView;
import android.os.Handler;
import android.os.Parcelable;
import android.view.animation.Animation;
import android.widget.LinearLayout;

public class UndoBarController extends LinearLayout
{
    private static Animation b;
    public static final g c;
    public static final g l;
    private static Animation n;
    public static final g q;
    static final boolean r;
    public static boolean t;
    private static final String[] z;
    private a a;
    private Parcelable d;
    private final Handler e;
    private CharSequence f;
    private boolean g;
    private g h;
    private boolean i;
    private String j;
    private final TextView k;
    private int m;
    private final Runnable o;
    private final TextView p;
    private float s;
    
    static {
        int r2 = 1;
        final String[] z2 = new String[20];
        int n = 0;
        String[] array = z2;
        String s = "|+\u001e:4z1\u00039\u000e";
        int n2 = -1;
    Label_0019:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_0621: {
                        if (length > n3) {
                            break Label_0621;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n2) {
                            default: {
                                array[n] = intern;
                                s = "|+\u001e:4d \t&\nn ";
                                n = r2;
                                array = z2;
                                n2 = 0;
                                continue Label_0019;
                            }
                            case 0: {
                                array[n] = intern;
                                s = "\u007f,\t<\te ";
                                n = 2;
                                array = z2;
                                n2 = r2;
                                continue Label_0019;
                            }
                            case 1: {
                                array[n] = intern;
                                n = 3;
                                array = z2;
                                s = "|+\u001e:4}*\u00110\u0005";
                                n2 = 2;
                                continue Label_0019;
                            }
                            case 2: {
                                array[n] = intern;
                                n = 4;
                                s = "h+\u001e'\u0004`!";
                                n2 = 3;
                                array = z2;
                                continue Label_0019;
                            }
                            case 3: {
                                array[n] = intern;
                                n = 5;
                                s = "m,\u00170\u0005";
                                n2 = 4;
                                array = z2;
                                continue Label_0019;
                            }
                            case 4: {
                                array[n] = intern;
                                n = 6;
                                s = "|+\u001e:4z1\u00039\u000e";
                                n2 = 5;
                                array = z2;
                                continue Label_0019;
                            }
                            case 5: {
                                array[n] = intern;
                                n = 7;
                                s = "|+\u001e:4d \t&\nn ";
                                n2 = 6;
                                array = z2;
                                continue Label_0019;
                            }
                            case 6: {
                                array[n] = intern;
                                n = 8;
                                s = "|+\u001e:4}*\u00110\u0005";
                                n2 = 7;
                                array = z2;
                                continue Label_0019;
                            }
                            case 7: {
                                array[n] = intern;
                                s = "\u007f,\t<\te ";
                                n2 = 8;
                                n = 9;
                                array = z2;
                                continue Label_0019;
                            }
                            case 8: {
                                array[n] = intern;
                                n = 10;
                                array = z2;
                                s = "n \u000e";
                                n2 = 9;
                                continue Label_0019;
                            }
                            case 9: {
                                array[n] = intern;
                                n = 11;
                                s = "~,\u00141\u0004~";
                                n2 = 10;
                                array = z2;
                                continue Label_0019;
                            }
                            case 10: {
                                array[n] = intern;
                                n = 12;
                                s = "h+\u001e'\u0004`!T:\u0018'\u0016\u0003&\u001fl(*'\u0004y \b!\u0002l6";
                                n2 = 11;
                                array = z2;
                                continue Label_0019;
                            }
                            case 11: {
                                array[n] = intern;
                                n = 13;
                                s = "x \u0017 Ea2T8\n`+\u00110\u0012z";
                                n2 = 12;
                                array = z2;
                                continue Label_0019;
                            }
                            case 12: {
                                array[n] = intern;
                                n = 14;
                                s = "j*\u00143\u0002n\u001a\t=\u0004~\u000b\u001b#\u0002n$\u000e<\u0004g\u0007\u001b'";
                                n2 = 13;
                                array = z2;
                                continue Label_0019;
                            }
                            case 13: {
                                array[n] = intern;
                                n = 15;
                                s = "h+\u001e'\u0004`!";
                                n2 = 14;
                                array = z2;
                                continue Label_0019;
                            }
                            case 14: {
                                array[n] = intern;
                                n = 16;
                                s = "k*\u00159";
                                n2 = 15;
                                array = z2;
                                continue Label_0019;
                            }
                            case 15: {
                                array[n] = intern;
                                n = 17;
                                s = "g$\f<\fh1\u0013:\u0005V'\u001b'4a \u00132\u0003}";
                                n2 = 16;
                                array = z2;
                                continue Label_0019;
                            }
                            case 16: {
                                array[n] = intern;
                                n = 18;
                                s = "g$\f<\fh1\u0013:\u0005V'\u001b'4a \u00132\u0003}\u001a\u00164\u0005m6\u00194\u001bl";
                                n2 = 17;
                                array = z2;
                                continue Label_0019;
                            }
                            case 17: {
                                array[n] = intern;
                                n = 19;
                                s = "z1\u00039\u000e)(\u000f&\u001f)+\u0015!Kk Z0\u0006y1\u0003{";
                                n2 = 18;
                                array = z2;
                                continue Label_0019;
                            }
                            case 18: {
                                break;
                            }
                        }
                        while (true) {
                            array[n] = intern;
                            z = z2;
                            while (true) {
                                Label_0718: {
                                    try {
                                        if (!UndoBarController.class.desiredAssertionStatus()) {
                                            r = (r2 != 0);
                                            l = new g(-1, 2131231870);
                                            c = new g(2130838828, 2131231609, -1L);
                                            q = new g(-1, -1, 5000L);
                                            UndoBarController.b = a((Animation$AnimationListener)null);
                                            UndoBarController.n = b((Animation$AnimationListener)null);
                                            return;
                                        }
                                        break Label_0718;
                                        char c2 = '\0';
                                        Label_0664: {
                                            c2 = 'k';
                                        }
                                        while (true) {
                                            final char c3;
                                            charArray[n3] = (char)(c2 ^ c3);
                                            ++n3;
                                            break;
                                            c3 = charArray[n3];
                                            Label_0692:
                                            c2 = 'E';
                                            continue;
                                            Label_0706:
                                            c2 = 'U';
                                            continue;
                                            Label_0685:
                                            c2 = '\t';
                                            continue;
                                            Label_0699:
                                            c2 = 'z';
                                            continue;
                                        }
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@11255edb, n3 % 5)
                                    catch (IllegalArgumentException ex) {
                                        throw ex;
                                    }
                                }
                                r2 = 0;
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    private UndoBarController(final Context p0, final AttributeSet p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: aload_0        
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokespecial   android/widget/LinearLayout.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;)V
        //     8: aload_0        
        //     9: getstatic       com/whatsapp/util/undobar/UndoBarController.l:Lcom/whatsapp/util/undobar/g;
        //    12: putfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //    15: aload_0        
        //    16: new             Landroid/os/Handler;
        //    19: dup            
        //    20: invokespecial   android/os/Handler.<init>:()V
        //    23: putfield        com/whatsapp/util/undobar/UndoBarController.e:Landroid/os/Handler;
        //    26: aload_0        
        //    27: new             Lcom/whatsapp/util/undobar/e;
        //    30: dup            
        //    31: aload_0        
        //    32: invokespecial   com/whatsapp/util/undobar/e.<init>:(Lcom/whatsapp/util/undobar/UndoBarController;)V
        //    35: putfield        com/whatsapp/util/undobar/UndoBarController.o:Ljava/lang/Runnable;
        //    38: aload_0        
        //    39: iconst_m1      
        //    40: putfield        com/whatsapp/util/undobar/UndoBarController.m:I
        //    43: aload_1        
        //    44: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    47: ldc             2130903228
        //    49: aload_0        
        //    50: iload_3        
        //    51: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    54: pop            
        //    55: aload_0        
        //    56: aload_0        
        //    57: ldc             2131755769
        //    59: invokevirtual   com/whatsapp/util/undobar/UndoBarController.findViewById:(I)Landroid/view/View;
        //    62: checkcast       Landroid/widget/TextView;
        //    65: putfield        com/whatsapp/util/undobar/UndoBarController.p:Landroid/widget/TextView;
        //    68: aload_0        
        //    69: aload_0        
        //    70: ldc             2131755771
        //    72: invokevirtual   com/whatsapp/util/undobar/UndoBarController.findViewById:(I)Landroid/view/View;
        //    75: checkcast       Landroid/widget/TextView;
        //    78: putfield        com/whatsapp/util/undobar/UndoBarController.k:Landroid/widget/TextView;
        //    81: aload_0        
        //    82: getfield        com/whatsapp/util/undobar/UndoBarController.k:Landroid/widget/TextView;
        //    85: new             Lcom/whatsapp/util/undobar/f;
        //    88: dup            
        //    89: aload_0        
        //    90: invokespecial   com/whatsapp/util/undobar/f.<init>:(Lcom/whatsapp/util/undobar/UndoBarController;)V
        //    93: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    96: aload_0        
        //    97: iload_3        
        //    98: invokespecial   com/whatsapp/util/undobar/UndoBarController.a:(Z)V
        //   101: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   104: bipush          19
        //   106: if_icmplt       355
        //   109: aload_1        
        //   110: getstatic       com/whatsapp/util/undobar/UndoBarController.z:[Ljava/lang/String;
        //   113: bipush          11
        //   115: aaload         
        //   116: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   119: checkcast       Landroid/view/WindowManager;
        //   122: astore          5
        //   124: aload_0        
        //   125: invokevirtual   com/whatsapp/util/undobar/UndoBarController.getResources:()Landroid/content/res/Resources;
        //   128: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   131: getfield        android/content/res/Configuration.orientation:I
        //   134: istore          7
        //   136: iload           7
        //   138: iload_3        
        //   139: if_icmpne       283
        //   142: aload_0        
        //   143: iload_3        
        //   144: putfield        com/whatsapp/util/undobar/UndoBarController.i:Z
        //   147: getstatic       com/whatsapp/util/undobar/UndoBarController.z:[Ljava/lang/String;
        //   150: bipush          12
        //   152: aaload         
        //   153: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   156: getstatic       com/whatsapp/util/undobar/UndoBarController.z:[Ljava/lang/String;
        //   159: bipush          10
        //   161: aaload         
        //   162: iconst_1       
        //   163: anewarray       Ljava/lang/Class;
        //   166: dup            
        //   167: iconst_0       
        //   168: ldc             Ljava/lang/String;.class
        //   170: aastore        
        //   171: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   174: astore          16
        //   176: aload           16
        //   178: iconst_1       
        //   179: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //   182: iconst_1       
        //   183: anewarray       Ljava/lang/Object;
        //   186: astore          17
        //   188: aload           17
        //   190: iconst_0       
        //   191: getstatic       com/whatsapp/util/undobar/UndoBarController.z:[Ljava/lang/String;
        //   194: bipush          13
        //   196: aaload         
        //   197: aastore        
        //   198: aload_0        
        //   199: aload           16
        //   201: aconst_null    
        //   202: aload           17
        //   204: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   207: checkcast       Ljava/lang/String;
        //   210: putfield        com/whatsapp/util/undobar/UndoBarController.j:Ljava/lang/String;
        //   213: aload_1        
        //   214: iconst_2       
        //   215: newarray        I
        //   217: dup            
        //   218: iconst_0       
        //   219: ldc             16843759
        //   221: iastore        
        //   222: dup            
        //   223: iconst_1       
        //   224: ldc             16843760
        //   226: iastore        
        //   227: invokevirtual   android/content/Context.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
        //   230: astore          9
        //   232: aload_0        
        //   233: aload           9
        //   235: iconst_1       
        //   236: iconst_0       
        //   237: invokevirtual   android/content/res/TypedArray.getBoolean:(IZ)Z
        //   240: putfield        com/whatsapp/util/undobar/UndoBarController.g:Z
        //   243: aload           9
        //   245: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   248: getstatic       com/whatsapp/util/undobar/UndoBarController.r:Z
        //   251: istore          13
        //   253: iload           13
        //   255: ifne            313
        //   258: aload_0        
        //   259: invokevirtual   com/whatsapp/util/undobar/UndoBarController.getContext:()Landroid/content/Context;
        //   262: ifnonnull       313
        //   265: new             Ljava/lang/AssertionError;
        //   268: dup            
        //   269: invokespecial   java/lang/AssertionError.<init>:()V
        //   272: athrow         
        //   273: astore          12
        //   275: aload           12
        //   277: athrow         
        //   278: astore          6
        //   280: aload           6
        //   282: athrow         
        //   283: iconst_0       
        //   284: istore_3       
        //   285: goto            142
        //   288: astore          8
        //   290: aload_0        
        //   291: aconst_null    
        //   292: putfield        com/whatsapp/util/undobar/UndoBarController.j:Ljava/lang/String;
        //   295: goto            213
        //   298: astore          10
        //   300: aload           9
        //   302: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   305: aload           10
        //   307: athrow         
        //   308: astore          11
        //   310: aload           11
        //   312: athrow         
        //   313: aload_0        
        //   314: invokevirtual   com/whatsapp/util/undobar/UndoBarController.getContext:()Landroid/content/Context;
        //   317: checkcast       Landroid/app/Activity;
        //   320: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //   323: invokevirtual   android/view/Window.getAttributes:()Landroid/view/WindowManager$LayoutParams;
        //   326: astore          14
        //   328: ldc_w           134217728
        //   331: aload           14
        //   333: getfield        android/view/WindowManager$LayoutParams.flags:I
        //   336: iand           
        //   337: ifeq            345
        //   340: aload_0        
        //   341: iconst_1       
        //   342: putfield        com/whatsapp/util/undobar/UndoBarController.g:Z
        //   345: aload_0        
        //   346: aload_0        
        //   347: aload           5
        //   349: invokespecial   com/whatsapp/util/undobar/UndoBarController.a:(Landroid/view/WindowManager;)F
        //   352: putfield        com/whatsapp/util/undobar/UndoBarController.s:F
        //   355: return         
        //   356: astore          15
        //   358: aload           15
        //   360: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  124    136    278    283    Ljava/lang/Throwable;
        //  147    213    288    298    Ljava/lang/Throwable;
        //  232    243    298    308    Any
        //  248    253    308    313    Ljava/lang/Throwable;
        //  258    273    273    278    Ljava/lang/Throwable;
        //  310    313    273    278    Ljava/lang/Throwable;
        //  328    345    356    361    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 184, Size: 184
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    @SuppressLint({ "NewApi" })
    private float a(final WindowManager p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/util/DisplayMetrics;
        //     3: dup            
        //     4: invokespecial   android/util/DisplayMetrics.<init>:()V
        //     7: astore_2       
        //     8: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    11: istore          5
        //    13: iload           5
        //    15: bipush          16
        //    17: if_icmplt       36
        //    20: aload_1        
        //    21: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //    26: aload_2        
        //    27: invokevirtual   android/view/Display.getRealMetrics:(Landroid/util/DisplayMetrics;)V
        //    30: getstatic       com/whatsapp/util/undobar/UndoBarController.t:Z
        //    33: ifeq            46
        //    36: aload_1        
        //    37: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //    42: aload_2        
        //    43: invokevirtual   android/view/Display.getMetrics:(Landroid/util/DisplayMetrics;)V
        //    46: aload_2        
        //    47: getfield        android/util/DisplayMetrics.widthPixels:I
        //    50: i2f            
        //    51: aload_2        
        //    52: getfield        android/util/DisplayMetrics.density:F
        //    55: fdiv           
        //    56: aload_2        
        //    57: getfield        android/util/DisplayMetrics.heightPixels:I
        //    60: i2f            
        //    61: aload_2        
        //    62: getfield        android/util/DisplayMetrics.density:F
        //    65: fdiv           
        //    66: invokestatic    java/lang/Math.min:(FF)F
        //    69: freturn        
        //    70: astore_3       
        //    71: aload_3        
        //    72: athrow         
        //    73: astore          4
        //    75: aload           4
        //    77: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      13     70     73     Ljava/lang/IllegalArgumentException;
        //  20     36     73     78     Ljava/lang/IllegalArgumentException;
        //  36     46     73     78     Ljava/lang/IllegalArgumentException;
        //  71     73     73     78     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
    
    private int a(final Resources resources, final String s) {
        final int identifier = resources.getIdentifier(s, UndoBarController.z[5], UndoBarController.z[4]);
        int dimensionPixelSize = 0;
        if (identifier > 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        }
        return dimensionPixelSize;
    }
    
    private static Animation a(final Animation$AnimationListener animationListener) {
        final TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator((Interpolator)new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(animationListener);
        return (Animation)translateAnimation;
    }
    
    private static UndoBarController a(final Activity activity) {
        Object c = c(activity);
        if (c == null) {
            final UndoBarController undoBarController = new UndoBarController((Context)activity, null);
            ((ViewGroup)activity.findViewById(16908290)).addView((View)undoBarController);
            c = undoBarController;
        }
        return (UndoBarController)c;
    }
    
    public static UndoBarController a(final Activity activity, final CharSequence charSequence, final a a, final Parcelable parcelable, final boolean b, final g h, final int m) {
        final UndoBarController a2 = a(activity);
        if (h == null) {
            try {
                throw new IllegalArgumentException(UndoBarController.z[19]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        a2.h = h;
        a2.a(a);
        a2.a(b, charSequence, parcelable);
        a2.m = m;
        return a2;
    }
    
    static a a(final UndoBarController undoBarController) {
        return undoBarController.a;
    }
    
    static void a(final UndoBarController undoBarController, final boolean b) {
        undoBarController.a(b);
    }
    
    private void a(final a a) {
        this.a = a;
    }
    
    private void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/undobar/UndoBarController.t:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/util/undobar/UndoBarController.e:Landroid/os/Handler;
        //     8: aload_0        
        //     9: getfield        com/whatsapp/util/undobar/UndoBarController.o:Ljava/lang/Runnable;
        //    12: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //    15: aload_0        
        //    16: aconst_null    
        //    17: putfield        com/whatsapp/util/undobar/UndoBarController.d:Landroid/os/Parcelable;
        //    20: iload_1        
        //    21: ifeq            34
        //    24: aload_0        
        //    25: bipush          8
        //    27: invokevirtual   com/whatsapp/util/undobar/UndoBarController.setVisibility:(I)V
        //    30: iload_2        
        //    31: ifeq            80
        //    34: aload_0        
        //    35: invokevirtual   com/whatsapp/util/undobar/UndoBarController.clearAnimation:()V
        //    38: aload_0        
        //    39: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //    42: getfield        com/whatsapp/util/undobar/g.b:Landroid/view/animation/Animation;
        //    45: astore          7
        //    47: aload           7
        //    49: ifnull          67
        //    52: aload_0        
        //    53: aload_0        
        //    54: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //    57: getfield        com/whatsapp/util/undobar/g.b:Landroid/view/animation/Animation;
        //    60: invokevirtual   com/whatsapp/util/undobar/UndoBarController.startAnimation:(Landroid/view/animation/Animation;)V
        //    63: iload_2        
        //    64: ifeq            74
        //    67: aload_0        
        //    68: getstatic       com/whatsapp/util/undobar/UndoBarController.n:Landroid/view/animation/Animation;
        //    71: invokevirtual   com/whatsapp/util/undobar/UndoBarController.startAnimation:(Landroid/view/animation/Animation;)V
        //    74: aload_0        
        //    75: bipush          8
        //    77: invokevirtual   com/whatsapp/util/undobar/UndoBarController.setVisibility:(I)V
        //    80: return         
        //    81: astore_3       
        //    82: aload_3        
        //    83: athrow         
        //    84: astore          4
        //    86: aload           4
        //    88: athrow         
        //    89: astore          5
        //    91: aload           5
        //    93: athrow         
        //    94: astore          6
        //    96: aload           6
        //    98: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      20     81     84     Ljava/lang/IllegalArgumentException;
        //  24     30     84     89     Ljava/lang/IllegalArgumentException;
        //  34     47     89     94     Ljava/lang/IllegalArgumentException;
        //  52     63     94     99     Ljava/lang/IllegalArgumentException;
        //  67     74     94     99     Ljava/lang/IllegalArgumentException;
        //  82     84     84     89     Ljava/lang/IllegalArgumentException;
        //  86     89     89     94     Ljava/lang/IllegalArgumentException;
        //  91     94     94     99     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 51, Size: 51
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
    
    private void a(final boolean p0, final CharSequence p1, final Parcelable p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/undobar/UndoBarController.t:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: aload_3        
        //     7: putfield        com/whatsapp/util/undobar/UndoBarController.d:Landroid/os/Parcelable;
        //    10: aload_0        
        //    11: aload_2        
        //    12: putfield        com/whatsapp/util/undobar/UndoBarController.f:Ljava/lang/CharSequence;
        //    15: aload_0        
        //    16: getfield        com/whatsapp/util/undobar/UndoBarController.p:Landroid/widget/TextView;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/util/undobar/UndoBarController.f:Ljava/lang/CharSequence;
        //    23: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    26: aload_0        
        //    27: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //    30: getfield        com/whatsapp/util/undobar/g.e:I
        //    33: istore          8
        //    35: iload           8
        //    37: ifle            116
        //    40: aload_0        
        //    41: getfield        com/whatsapp/util/undobar/UndoBarController.k:Landroid/widget/TextView;
        //    44: iconst_0       
        //    45: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    48: aload_0        
        //    49: ldc_w           2131755770
        //    52: invokevirtual   com/whatsapp/util/undobar/UndoBarController.findViewById:(I)Landroid/view/View;
        //    55: iconst_0       
        //    56: invokevirtual   android/view/View.setVisibility:(I)V
        //    59: aload_0        
        //    60: getfield        com/whatsapp/util/undobar/UndoBarController.k:Landroid/widget/TextView;
        //    63: aload_0        
        //    64: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //    67: getfield        com/whatsapp/util/undobar/g.e:I
        //    70: invokevirtual   android/widget/TextView.setText:(I)V
        //    73: aload_0        
        //    74: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //    77: getfield        com/whatsapp/util/undobar/g.a:I
        //    80: istore          22
        //    82: iload           22
        //    84: ifle            137
        //    87: aload_0        
        //    88: getfield        com/whatsapp/util/undobar/UndoBarController.k:Landroid/widget/TextView;
        //    91: aload_0        
        //    92: invokevirtual   com/whatsapp/util/undobar/UndoBarController.getResources:()Landroid/content/res/Resources;
        //    95: aload_0        
        //    96: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //    99: getfield        com/whatsapp/util/undobar/g.a:I
        //   102: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   105: aconst_null    
        //   106: aconst_null    
        //   107: aconst_null    
        //   108: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
        //   111: iload           4
        //   113: ifeq            137
        //   116: aload_0        
        //   117: getfield        com/whatsapp/util/undobar/UndoBarController.k:Landroid/widget/TextView;
        //   120: bipush          8
        //   122: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   125: aload_0        
        //   126: ldc_w           2131755770
        //   129: invokevirtual   com/whatsapp/util/undobar/UndoBarController.findViewById:(I)Landroid/view/View;
        //   132: bipush          8
        //   134: invokevirtual   android/view/View.setVisibility:(I)V
        //   137: aload_0        
        //   138: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //   141: getfield        com/whatsapp/util/undobar/g.c:I
        //   144: ifle            164
        //   147: aload_0        
        //   148: ldc_w           2131755768
        //   151: invokevirtual   com/whatsapp/util/undobar/UndoBarController.findViewById:(I)Landroid/view/View;
        //   154: aload_0        
        //   155: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //   158: getfield        com/whatsapp/util/undobar/g.c:I
        //   161: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   164: aload_0        
        //   165: getfield        com/whatsapp/util/undobar/UndoBarController.e:Landroid/os/Handler;
        //   168: aload_0        
        //   169: getfield        com/whatsapp/util/undobar/UndoBarController.o:Ljava/lang/Runnable;
        //   172: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   175: aload_0        
        //   176: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //   179: getfield        com/whatsapp/util/undobar/g.f:J
        //   182: lconst_0       
        //   183: lcmp           
        //   184: ifle            206
        //   187: aload_0        
        //   188: getfield        com/whatsapp/util/undobar/UndoBarController.e:Landroid/os/Handler;
        //   191: aload_0        
        //   192: getfield        com/whatsapp/util/undobar/UndoBarController.o:Ljava/lang/Runnable;
        //   195: aload_0        
        //   196: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //   199: getfield        com/whatsapp/util/undobar/g.f:J
        //   202: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   205: pop            
        //   206: iload_1        
        //   207: ifne            251
        //   210: aload_0        
        //   211: invokevirtual   com/whatsapp/util/undobar/UndoBarController.clearAnimation:()V
        //   214: aload_0        
        //   215: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //   218: getfield        com/whatsapp/util/undobar/g.d:Landroid/view/animation/Animation;
        //   221: astore          20
        //   223: aload           20
        //   225: ifnull          244
        //   228: aload_0        
        //   229: aload_0        
        //   230: getfield        com/whatsapp/util/undobar/UndoBarController.h:Lcom/whatsapp/util/undobar/g;
        //   233: getfield        com/whatsapp/util/undobar/g.d:Landroid/view/animation/Animation;
        //   236: invokevirtual   com/whatsapp/util/undobar/UndoBarController.startAnimation:(Landroid/view/animation/Animation;)V
        //   239: iload           4
        //   241: ifeq            251
        //   244: aload_0        
        //   245: getstatic       com/whatsapp/util/undobar/UndoBarController.b:Landroid/view/animation/Animation;
        //   248: invokevirtual   com/whatsapp/util/undobar/UndoBarController.startAnimation:(Landroid/view/animation/Animation;)V
        //   251: aload_0        
        //   252: iconst_0       
        //   253: invokevirtual   com/whatsapp/util/undobar/UndoBarController.setVisibility:(I)V
        //   256: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   259: istore          15
        //   261: iload           15
        //   263: bipush          19
        //   265: if_icmplt       313
        //   268: aload_0        
        //   269: getfield        com/whatsapp/util/undobar/UndoBarController.m:I
        //   272: istore          16
        //   274: iload           16
        //   276: ifeq            313
        //   279: aload_0        
        //   280: getfield        com/whatsapp/util/undobar/UndoBarController.m:I
        //   283: istore          17
        //   285: iload           17
        //   287: iconst_1       
        //   288: if_icmpeq       298
        //   291: aload_0        
        //   292: getfield        com/whatsapp/util/undobar/UndoBarController.g:Z
        //   295: ifeq            313
        //   298: aload_0        
        //   299: iconst_0       
        //   300: iconst_0       
        //   301: iconst_0       
        //   302: aload_0        
        //   303: aload_0        
        //   304: invokevirtual   com/whatsapp/util/undobar/UndoBarController.getContext:()Landroid/content/Context;
        //   307: invokespecial   com/whatsapp/util/undobar/UndoBarController.b:(Landroid/content/Context;)I
        //   310: invokevirtual   com/whatsapp/util/undobar/UndoBarController.setPadding:(IIII)V
        //   313: return         
        //   314: astore          5
        //   316: aload           5
        //   318: athrow         
        //   319: astore          6
        //   321: aload           6
        //   323: athrow         
        //   324: astore          7
        //   326: aload           7
        //   328: athrow         
        //   329: astore          9
        //   331: aload           9
        //   333: athrow         
        //   334: astore          10
        //   336: aload           10
        //   338: athrow         
        //   339: astore          18
        //   341: aload           18
        //   343: athrow         
        //   344: astore          19
        //   346: aload           19
        //   348: athrow         
        //   349: astore          11
        //   351: aload           11
        //   353: athrow         
        //   354: astore          12
        //   356: aload           12
        //   358: athrow         
        //   359: astore          13
        //   361: aload           13
        //   363: athrow         
        //   364: astore          14
        //   366: aload           14
        //   368: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      35     314    319    Ljava/lang/IllegalArgumentException;
        //  40     82     319    324    Ljava/lang/IllegalArgumentException;
        //  87     111    324    329    Ljava/lang/IllegalArgumentException;
        //  116    137    324    329    Ljava/lang/IllegalArgumentException;
        //  137    164    329    334    Ljava/lang/IllegalArgumentException;
        //  164    206    334    339    Ljava/lang/IllegalArgumentException;
        //  210    223    339    344    Ljava/lang/IllegalArgumentException;
        //  228    239    344    349    Ljava/lang/IllegalArgumentException;
        //  244    251    344    349    Ljava/lang/IllegalArgumentException;
        //  251    261    349    354    Ljava/lang/IllegalArgumentException;
        //  268    274    354    359    Ljava/lang/IllegalArgumentException;
        //  279    285    359    364    Ljava/lang/IllegalArgumentException;
        //  291    298    364    369    Ljava/lang/IllegalArgumentException;
        //  298    313    364    369    Ljava/lang/IllegalArgumentException;
        //  316    319    319    324    Ljava/lang/IllegalArgumentException;
        //  321    324    324    329    Ljava/lang/IllegalArgumentException;
        //  341    344    344    349    Ljava/lang/IllegalArgumentException;
        //  351    354    354    359    Ljava/lang/IllegalArgumentException;
        //  356    359    359    364    Ljava/lang/IllegalArgumentException;
        //  361    364    364    369    Ljava/lang/IllegalArgumentException;
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
    
    private boolean a() {
        try {
            if (this.s >= 600.0f) {
                return true;
            }
            final UndoBarController undoBarController = this;
            final boolean b = undoBarController.i;
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final UndoBarController undoBarController = this;
            final boolean b = undoBarController.i;
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    @TargetApi(14)
    private boolean a(final Context context) {
        boolean b = true;
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier(UndoBarController.z[14], UndoBarController.z[16], UndoBarController.z[15]);
        if (identifier != 0) {
            final boolean boolean1 = resources.getBoolean(identifier);
            Label_0070: {
                if (!"1".equals(this.j)) {
                    final boolean b2 = boolean1;
                    break Label_0070;
                }
                try {
                    final boolean t = UndoBarController.t;
                    boolean b2 = false;
                    if (t) {
                        if ("0".equals(this.j)) {
                            b2 = b;
                        }
                    }
                    return b2;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
        }
        while (true) {
            try {
                if (!ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    return b;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
            b = false;
            return b;
        }
    }
    
    @TargetApi(14)
    private int b(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //     4: astore_2       
        //     5: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     8: istore          5
        //    10: iload           5
        //    12: bipush          14
        //    14: if_icmplt       101
        //    17: aload_0        
        //    18: aload_1        
        //    19: invokespecial   com/whatsapp/util/undobar/UndoBarController.a:(Landroid/content/Context;)Z
        //    22: ifeq            101
        //    25: aload_0        
        //    26: getfield        com/whatsapp/util/undobar/UndoBarController.i:Z
        //    29: istore          6
        //    31: iload           6
        //    33: ifeq            54
        //    36: getstatic       com/whatsapp/util/undobar/UndoBarController.z:[Ljava/lang/String;
        //    39: bipush          17
        //    41: aaload         
        //    42: astore          9
        //    44: getstatic       com/whatsapp/util/undobar/UndoBarController.t:Z
        //    47: istore          11
        //    49: iload           11
        //    51: ifeq            93
        //    54: aload_0        
        //    55: invokespecial   com/whatsapp/util/undobar/UndoBarController.a:()Z
        //    58: istore          8
        //    60: iload           8
        //    62: ifne            85
        //    65: iconst_0       
        //    66: ireturn        
        //    67: astore_3       
        //    68: aload_3        
        //    69: athrow         
        //    70: astore          4
        //    72: aload           4
        //    74: athrow         
        //    75: astore          10
        //    77: aload           10
        //    79: athrow         
        //    80: astore          7
        //    82: aload           7
        //    84: athrow         
        //    85: getstatic       com/whatsapp/util/undobar/UndoBarController.z:[Ljava/lang/String;
        //    88: bipush          18
        //    90: aaload         
        //    91: astore          9
        //    93: aload_0        
        //    94: aload_2        
        //    95: aload           9
        //    97: invokespecial   com/whatsapp/util/undobar/UndoBarController.a:(Landroid/content/res/Resources;Ljava/lang/String;)I
        //   100: ireturn        
        //   101: iconst_0       
        //   102: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      10     67     70     Ljava/lang/IllegalArgumentException;
        //  17     31     70     75     Ljava/lang/IllegalArgumentException;
        //  44     49     75     80     Ljava/lang/IllegalArgumentException;
        //  54     60     80     85     Ljava/lang/IllegalArgumentException;
        //  68     70     70     75     Ljava/lang/IllegalArgumentException;
        //  77     80     80     85     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 55, Size: 55
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
    
    static Parcelable b(final UndoBarController undoBarController) {
        return undoBarController.d;
    }
    
    private static Animation b(final Animation$AnimationListener animationListener) {
        final TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator((Interpolator)new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(animationListener);
        return (Animation)translateAnimation;
    }
    
    public static void b(final Activity activity) {
        final UndoBarController c = c(activity);
        if (c == null) {
            return;
        }
        try {
            c.setVisibility(8);
            c.e.removeCallbacks(c.o);
            if (c.a instanceof d) {
                ((d)c.a).a();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private static UndoBarController c(final Activity activity) {
        final View viewById = activity.findViewById(2131755768);
        UndoBarController undoBarController = null;
        if (viewById != null) {
            undoBarController = (UndoBarController)viewById.getParent();
        }
        return undoBarController;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            try {
                this.f = bundle.getCharSequence(UndoBarController.z[7]);
                this.d = bundle.getParcelable(UndoBarController.z[8]);
                this.h = (g)bundle.getParcelable(UndoBarController.z[6]);
                if (bundle.getInt(UndoBarController.z[9]) == 0) {
                    this.a(true, this.f, this.d);
                }
                return;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }
    
    public Parcelable onSaveInstanceState() {
        final Bundle bundle = new Bundle();
        bundle.putCharSequence(UndoBarController.z[1], this.f);
        bundle.putParcelable(UndoBarController.z[3], this.d);
        bundle.putParcelable(UndoBarController.z[0], (Parcelable)this.h);
        bundle.putInt(UndoBarController.z[2], this.getVisibility());
        return (Parcelable)bundle;
    }
}
