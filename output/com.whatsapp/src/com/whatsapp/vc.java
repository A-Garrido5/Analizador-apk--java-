// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.EditText;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Typeface;

public class vc
{
    private static Typeface a;
    private static Typeface c;
    private static Boolean h;
    private static Typeface m;
    private static vc n;
    private static Typeface s;
    private static final String[] z;
    public final float b;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int i;
    public final float j;
    public final int k;
    public final int l;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final float t;
    
    static {
        final String[] z2 = new String[7];
        String s = ":H_2E:";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = 'M';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = '1';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ">BP:O?\u0001B>E8MUvE#MHvH(\u0001X8C9HP:C7DUvE#BT";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ">@_%\u0007>DC?L`MX1B9";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "+N_\"Ybs^4E9N\u001c\u001aC*IEx^9G";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = ">@_%\u0007>DC?L`LT2C8L";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "+N_\"Ybs^4E9N\u001c\u001bO)HD;\u00049UW";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\fcr7H.\u0010\u0003e";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        vc.n = null;
        vc.h = null;
        vc.c = null;
        vc.s = null;
        vc.a = null;
        vc.m = null;
    }
    
    private vc(final Context context) {
        this.b = context.getResources().getDisplayMetrics().density;
        Label_0213: {
            if (context.getResources().getDisplayMetrics().widthPixels / this.b < 360.0f) {
                break Label_0213;
            }
            float n = 8.0f;
        Label_0100_Outer:
            while (true) {
                while (true) {
                    Label_0221: {
                        try {
                            this.r = Math.round(n * this.b);
                            this.i = (int)(2.0f * this.b);
                            this.k = (int)(4.0f * this.b / 3.0f);
                            if (this.b >= 1.5f) {
                                final float d = 52.0f;
                                this.d = d;
                                this.t = (int)(4.0f * this.b);
                                this.e = 2.0f * this.b;
                                this.p = (int)(83.333336f * this.b);
                                this.l = (int)(1.3333334f * this.b);
                                this.j = 3.3333333f * this.b;
                                this.o = (int)(66.666664f * this.b);
                                this.f = (int)(2.6666667f * this.b);
                                this.q = (int)(1.3333334f * this.b);
                                this.g = (int)(4.0f * this.b);
                                return;
                            }
                            break Label_0221;
                            n = 2.0f;
                            continue Label_0100_Outer;
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                    }
                    final float d = 42.0f;
                    continue;
                }
            }
        }
    }
    
    public static void a(final Context context) {
        try {
            if (vc.n != null) {
                throw new IllegalStateException(vc.z[1]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        vc.n = new vc(context);
    }
    
    public static void a(final TextView p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/vc.h:Ljava/lang/Boolean;
        //     7: ifnonnull       14
        //    10: invokestatic    com/whatsapp/vc.c:()Z
        //    13: pop            
        //    14: getstatic       com/whatsapp/vc.h:Ljava/lang/Boolean;
        //    17: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    20: istore          7
        //    22: iload           7
        //    24: ifeq            93
        //    27: getstatic       com/whatsapp/vc.c:Landroid/graphics/Typeface;
        //    30: astore          9
        //    32: aload           9
        //    34: ifnonnull       82
        //    37: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    40: istore          11
        //    42: iload           11
        //    44: bipush          21
        //    46: if_icmplt       65
        //    49: getstatic       com/whatsapp/vc.z:[Ljava/lang/String;
        //    52: iconst_2       
        //    53: aaload         
        //    54: iconst_0       
        //    55: invokestatic    android/graphics/Typeface.create:(Ljava/lang/String;I)Landroid/graphics/Typeface;
        //    58: putstatic       com/whatsapp/vc.c:Landroid/graphics/Typeface;
        //    61: iload_1        
        //    62: ifeq            82
        //    65: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    68: invokevirtual   com/whatsapp/App.getAssets:()Landroid/content/res/AssetManager;
        //    71: getstatic       com/whatsapp/vc.z:[Ljava/lang/String;
        //    74: iconst_3       
        //    75: aaload         
        //    76: invokestatic    android/graphics/Typeface.createFromAsset:(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;
        //    79: putstatic       com/whatsapp/vc.c:Landroid/graphics/Typeface;
        //    82: aload_0        
        //    83: getstatic       com/whatsapp/vc.c:Landroid/graphics/Typeface;
        //    86: invokevirtual   android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;)V
        //    89: iload_1        
        //    90: ifeq            121
        //    93: getstatic       com/whatsapp/vc.a:Landroid/graphics/Typeface;
        //    96: ifnonnull       106
        //    99: iconst_0       
        //   100: invokestatic    android/graphics/Typeface.defaultFromStyle:(I)Landroid/graphics/Typeface;
        //   103: putstatic       com/whatsapp/vc.a:Landroid/graphics/Typeface;
        //   106: aload_0        
        //   107: getstatic       com/whatsapp/vc.a:Landroid/graphics/Typeface;
        //   110: invokevirtual   android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;)V
        //   113: aload_0        
        //   114: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   117: iconst_0       
        //   118: invokevirtual   android/text/TextPaint.setFakeBoldText:(Z)V
        //   121: return         
        //   122: astore_2       
        //   123: aload_2        
        //   124: athrow         
        //   125: astore_3       
        //   126: aload_3        
        //   127: athrow         
        //   128: astore          4
        //   130: aload           4
        //   132: athrow         
        //   133: astore          5
        //   135: aload           5
        //   137: athrow         
        //   138: astore          6
        //   140: aload           6
        //   142: athrow         
        //   143: astore          10
        //   145: aload           10
        //   147: athrow         
        //   148: astore          8
        //   150: aload           8
        //   152: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      14     122    125    Ljava/lang/IllegalStateException;
        //  14     22     125    128    Ljava/lang/IllegalStateException;
        //  27     32     128    133    Ljava/lang/IllegalStateException;
        //  37     42     133    138    Ljava/lang/IllegalStateException;
        //  49     61     138    143    Ljava/lang/IllegalStateException;
        //  65     82     138    143    Ljava/lang/IllegalStateException;
        //  82     89     143    148    Ljava/lang/IllegalStateException;
        //  93     106    148    153    Ljava/lang/IllegalStateException;
        //  126    128    128    133    Ljava/lang/IllegalStateException;
        //  130    133    133    138    Ljava/lang/IllegalStateException;
        //  135    138    138    143    Ljava/lang/IllegalStateException;
        //  145    148    148    153    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 74, Size: 74
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
    
    public static vc b() {
        return vc.n;
    }
    
    public static void b(final TextView p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_2       
        //     6: getstatic       com/whatsapp/vc.h:Ljava/lang/Boolean;
        //     9: ifnonnull       16
        //    12: invokestatic    com/whatsapp/vc.c:()Z
        //    15: pop            
        //    16: getstatic       com/whatsapp/vc.h:Ljava/lang/Boolean;
        //    19: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    22: istore          8
        //    24: iload           8
        //    26: ifeq            95
        //    29: getstatic       com/whatsapp/vc.s:Landroid/graphics/Typeface;
        //    32: astore          13
        //    34: aload           13
        //    36: ifnonnull       84
        //    39: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    42: istore          15
        //    44: iload           15
        //    46: bipush          21
        //    48: if_icmplt       67
        //    51: getstatic       com/whatsapp/vc.z:[Ljava/lang/String;
        //    54: iconst_4       
        //    55: aaload         
        //    56: iconst_0       
        //    57: invokestatic    android/graphics/Typeface.create:(Ljava/lang/String;I)Landroid/graphics/Typeface;
        //    60: putstatic       com/whatsapp/vc.s:Landroid/graphics/Typeface;
        //    63: iload_2        
        //    64: ifeq            84
        //    67: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    70: invokevirtual   com/whatsapp/App.getAssets:()Landroid/content/res/AssetManager;
        //    73: getstatic       com/whatsapp/vc.z:[Ljava/lang/String;
        //    76: iconst_5       
        //    77: aaload         
        //    78: invokestatic    android/graphics/Typeface.createFromAsset:(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;
        //    81: putstatic       com/whatsapp/vc.s:Landroid/graphics/Typeface;
        //    84: aload_0        
        //    85: getstatic       com/whatsapp/vc.s:Landroid/graphics/Typeface;
        //    88: invokevirtual   android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;)V
        //    91: iload_2        
        //    92: ifeq            145
        //    95: getstatic       com/whatsapp/vc.m:Landroid/graphics/Typeface;
        //    98: ifnonnull       111
        //   101: getstatic       android/graphics/Typeface.DEFAULT:Landroid/graphics/Typeface;
        //   104: iconst_1       
        //   105: invokestatic    android/graphics/Typeface.create:(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
        //   108: putstatic       com/whatsapp/vc.m:Landroid/graphics/Typeface;
        //   111: aload_0        
        //   112: getstatic       com/whatsapp/vc.m:Landroid/graphics/Typeface;
        //   115: invokevirtual   android/widget/TextView.setTypeface:(Landroid/graphics/Typeface;)V
        //   118: aload_0        
        //   119: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   122: astore          11
        //   124: getstatic       com/whatsapp/vc.m:Landroid/graphics/Typeface;
        //   127: invokevirtual   android/graphics/Typeface.getStyle:()I
        //   130: istore          12
        //   132: iload           12
        //   134: iconst_1       
        //   135: iand           
        //   136: ifne            184
        //   139: aload           11
        //   141: iload_1        
        //   142: invokevirtual   android/text/TextPaint.setFakeBoldText:(Z)V
        //   145: return         
        //   146: astore_3       
        //   147: aload_3        
        //   148: athrow         
        //   149: astore          4
        //   151: aload           4
        //   153: athrow         
        //   154: astore          5
        //   156: aload           5
        //   158: athrow         
        //   159: astore          6
        //   161: aload           6
        //   163: athrow         
        //   164: astore          7
        //   166: aload           7
        //   168: athrow         
        //   169: astore          14
        //   171: aload           14
        //   173: athrow         
        //   174: astore          9
        //   176: aload           9
        //   178: athrow         
        //   179: astore          10
        //   181: aload           10
        //   183: athrow         
        //   184: iconst_0       
        //   185: istore_1       
        //   186: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  6      16     146    149    Ljava/lang/IllegalStateException;
        //  16     24     149    154    Ljava/lang/IllegalStateException;
        //  29     34     154    159    Ljava/lang/IllegalStateException;
        //  39     44     159    164    Ljava/lang/IllegalStateException;
        //  51     63     164    169    Ljava/lang/IllegalStateException;
        //  67     84     164    169    Ljava/lang/IllegalStateException;
        //  84     91     169    174    Ljava/lang/IllegalStateException;
        //  95     111    174    179    Ljava/lang/IllegalStateException;
        //  111    132    179    184    Ljava/lang/IllegalStateException;
        //  151    154    154    159    Ljava/lang/IllegalStateException;
        //  156    159    159    164    Ljava/lang/IllegalStateException;
        //  161    164    164    169    Ljava/lang/IllegalStateException;
        //  171    174    174    179    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 92, Size: 92
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
    
    public static boolean c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_0       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_1       
        //     6: new             Landroid/text/TextPaint;
        //     9: dup            
        //    10: invokespecial   android/text/TextPaint.<init>:()V
        //    13: astore_2       
        //    14: aload_2        
        //    15: ldc             20.0
        //    17: invokevirtual   android/text/TextPaint.setTextSize:(F)V
        //    20: aload_2        
        //    21: getstatic       android/graphics/Typeface.DEFAULT:Landroid/graphics/Typeface;
        //    24: invokevirtual   android/text/TextPaint.setTypeface:(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
        //    27: pop            
        //    28: aload_2        
        //    29: getstatic       com/whatsapp/vc.z:[Ljava/lang/String;
        //    32: bipush          6
        //    34: aaload         
        //    35: invokevirtual   android/text/TextPaint.measureText:(Ljava/lang/String;)F
        //    38: fstore          4
        //    40: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    43: istore          9
        //    45: iload           9
        //    47: bipush          21
        //    49: if_icmplt       63
        //    52: iconst_1       
        //    53: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    56: putstatic       com/whatsapp/vc.h:Ljava/lang/Boolean;
        //    59: iload_1        
        //    60: ifeq            113
        //    63: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    66: istore          10
        //    68: iload           10
        //    70: bipush          14
        //    72: if_icmplt       98
        //    75: fload           4
        //    77: ldc             105.0
        //    79: fcmpl          
        //    80: ifne            140
        //    83: iload_0        
        //    84: istore          11
        //    86: iload           11
        //    88: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    91: putstatic       com/whatsapp/vc.h:Ljava/lang/Boolean;
        //    94: iload_1        
        //    95: ifeq            113
        //    98: fload           4
        //   100: ldc             101.0
        //   102: fcmpl          
        //   103: ifne            156
        //   106: iload_0        
        //   107: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   110: putstatic       com/whatsapp/vc.h:Ljava/lang/Boolean;
        //   113: getstatic       com/whatsapp/vc.h:Ljava/lang/Boolean;
        //   116: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   119: ireturn        
        //   120: astore          5
        //   122: aload           5
        //   124: athrow         
        //   125: astore          6
        //   127: aload           6
        //   129: athrow         
        //   130: astore          7
        //   132: aload           7
        //   134: athrow         
        //   135: astore          8
        //   137: aload           8
        //   139: athrow         
        //   140: iconst_0       
        //   141: istore          11
        //   143: goto            86
        //   146: astore          12
        //   148: aload           12
        //   150: athrow         
        //   151: astore          13
        //   153: aload           13
        //   155: athrow         
        //   156: iconst_0       
        //   157: istore_0       
        //   158: goto            106
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  40     45     120    125    Ljava/lang/IllegalStateException;
        //  52     59     125    130    Ljava/lang/IllegalStateException;
        //  63     68     130    140    Ljava/lang/IllegalStateException;
        //  86     94     146    156    Ljava/lang/IllegalStateException;
        //  122    125    125    130    Ljava/lang/IllegalStateException;
        //  127    130    130    140    Ljava/lang/IllegalStateException;
        //  132    135    135    140    Ljava/lang/IllegalStateException;
        //  148    151    151    156    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 81, Size: 81
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
    
    public float a(float n) {
        while (true) {
            try {
                if (this.b >= 1.5f) {
                    n *= 0.59f;
                    return n;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (this.b >= 1.0f) {
                    return n * 0.6f;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            try {
                if (this.b >= 0.75f) {
                    return n * 0.6f;
                }
                return n;
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
    }
    
    public int a() {
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager)App.aq.getSystemService(vc.z[0])).getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.densityDpi >= 320) {
                return (int)(displayMetrics.density * 25.0f);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (displayMetrics.densityDpi >= 240) {
                return 38;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        try {
            if (displayMetrics.densityDpi >= 160) {
                return 25;
            }
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
        return 19;
    }
    
    public void a(final EditText p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/vc.b:F
        //     8: fstore          7
        //    10: fload           7
        //    12: ldc             1.5
        //    14: fcmpl          
        //    15: iflt            28
        //    18: aload_1        
        //    19: bipush          6
        //    21: invokevirtual   android/widget/EditText.setMaxLines:(I)V
        //    24: iload_2        
        //    25: ifeq            55
        //    28: aload_0        
        //    29: getfield        com/whatsapp/vc.b:F
        //    32: fstore          8
        //    34: fload           8
        //    36: fconst_1       
        //    37: fcmpl          
        //    38: iflt            50
        //    41: aload_1        
        //    42: iconst_5       
        //    43: invokevirtual   android/widget/EditText.setMaxLines:(I)V
        //    46: iload_2        
        //    47: ifeq            55
        //    50: aload_1        
        //    51: iconst_4       
        //    52: invokevirtual   android/widget/EditText.setMaxLines:(I)V
        //    55: return         
        //    56: astore_3       
        //    57: aload_3        
        //    58: athrow         
        //    59: astore          4
        //    61: aload           4
        //    63: athrow         
        //    64: astore          5
        //    66: aload           5
        //    68: athrow         
        //    69: astore          6
        //    71: aload           6
        //    73: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     56     59     Ljava/lang/IllegalStateException;
        //  18     24     59     64     Ljava/lang/IllegalStateException;
        //  28     34     64     69     Ljava/lang/IllegalStateException;
        //  41     46     69     74     Ljava/lang/IllegalStateException;
        //  50     55     69     74     Ljava/lang/IllegalStateException;
        //  57     59     59     64     Ljava/lang/IllegalStateException;
        //  61     64     64     69     Ljava/lang/IllegalStateException;
        //  66     69     69     74     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 42, Size: 42
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
    
    public float b(final float n) {
        try {
            if (this.b >= 1.5f) {
                return 0.55f * n;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (this.b >= 1.0f) {
                return n * 0.56f;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        try {
            if (this.b >= 0.75f) {
                return 0.54f * n;
            }
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
        return n * 0.56f;
    }
    
    public float c(float n) {
        while (true) {
            try {
                if (this.b >= 1.5f) {
                    n *= 0.78f;
                    return n;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (this.b >= 1.0f) {
                    return n * 0.8f;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            try {
                if (this.b >= 0.75f) {
                    return n * 0.8f;
                }
                return n;
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
    }
}
