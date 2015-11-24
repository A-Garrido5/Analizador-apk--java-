// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Canvas;
import android.view.ViewGroup;
import android.content.Context;
import com.whatsapp.protocol.bi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;

public class BubbleRelativeLayout extends RelativeLayout
{
    private static final Drawable a;
    private static final Drawable b;
    private static final Drawable g;
    private static final Drawable j;
    static Rect k;
    static Rect n;
    private static final String z;
    private int c;
    Rect d;
    private int e;
    private int f;
    public int h;
    boolean i;
    boolean l;
    bi m;
    
    static {
        final char[] charArray = "\u001863Vm\u001f\u001c#km\u001b:>AuU$#Qd\u0014\u001c3Ac\u0018/4\u001b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0001';
                    break;
                }
                case 0: {
                    c2 = 'z';
                    break;
                }
                case 1: {
                    c2 = 'C';
                    break;
                }
                case 2: {
                    c2 = 'Q';
                    break;
                }
                case 3: {
                    c2 = '4';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        a = App.aq.getApplicationContext().getResources().getDrawable(2130837617);
        g = App.aq.getApplicationContext().getResources().getDrawable(2130837618);
        j = App.aq.getApplicationContext().getResources().getDrawable(2130837609);
        b = App.aq.getApplicationContext().getResources().getDrawable(2130837610);
        BubbleRelativeLayout.k = new Rect();
        BubbleRelativeLayout.n = new Rect();
        BubbleRelativeLayout.a.getPadding(BubbleRelativeLayout.k);
        BubbleRelativeLayout.j.getPadding(BubbleRelativeLayout.n);
    }
    
    public BubbleRelativeLayout(final Context context, final bi m) {
        super(context);
        this.d = new Rect();
        this.h = -1;
        this.m = m;
    }
    
    protected float a() {
        final ViewGroup viewGroup = (ViewGroup)this.getChildAt(1);
        this.e = viewGroup.getTop();
        this.c = viewGroup.getBottom();
        this.f = viewGroup.getMeasuredWidth();
        this.i = adc.b(this.m.a.a);
        final int f = this.f;
        int n;
        if (this.m.a.b) {
            n = BubbleRelativeLayout.k.left + BubbleRelativeLayout.k.right;
        }
        else {
            n = BubbleRelativeLayout.n.left + BubbleRelativeLayout.n.right;
        }
        return n + f;
    }
    
    protected void onDraw(final Canvas p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/BubbleRelativeLayout.isSelected:()Z
        //     8: ifne            33
        //    11: aload_0        
        //    12: invokevirtual   com/whatsapp/BubbleRelativeLayout.isPressed:()Z
        //    15: istore          57
        //    17: iload           57
        //    19: ifne            33
        //    22: aload_0        
        //    23: invokevirtual   com/whatsapp/BubbleRelativeLayout.isFocused:()Z
        //    26: istore          58
        //    28: iload           58
        //    30: ifeq            331
        //    33: iconst_1       
        //    34: istore          6
        //    36: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //    39: astore          7
        //    41: aload_0        
        //    42: getfield        com/whatsapp/BubbleRelativeLayout.m:Lcom/whatsapp/protocol/bi;
        //    45: getfield        com/whatsapp/protocol/bi.c:I
        //    48: iconst_m1      
        //    49: if_icmpeq       312
        //    52: aload_0        
        //    53: getfield        com/whatsapp/BubbleRelativeLayout.m:Lcom/whatsapp/protocol/bi;
        //    56: getfield        com/whatsapp/protocol/bi.c:I
        //    59: istore          10
        //    61: iload           10
        //    63: bipush          6
        //    65: if_icmpne       84
        //    68: aload_0        
        //    69: getfield        com/whatsapp/BubbleRelativeLayout.m:Lcom/whatsapp/protocol/bi;
        //    72: getfield        com/whatsapp/protocol/bi.I:B
        //    75: istore          56
        //    77: iload           56
        //    79: bipush          8
        //    81: if_icmpne       312
        //    84: aload_0        
        //    85: invokevirtual   com/whatsapp/BubbleRelativeLayout.a:()F
        //    88: f2i            
        //    89: istore          11
        //    91: aload_0        
        //    92: getfield        com/whatsapp/BubbleRelativeLayout.m:Lcom/whatsapp/protocol/bi;
        //    95: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    98: getfield        com/whatsapp/protocol/c6.b:Z
        //   101: ifeq            447
        //   104: aload_0        
        //   105: getfield        com/whatsapp/BubbleRelativeLayout.d:Landroid/graphics/Rect;
        //   108: astore          33
        //   110: invokestatic    com/whatsapp/App.ak:()Z
        //   113: istore          34
        //   115: iload           34
        //   117: ifeq            357
        //   120: aload_0        
        //   121: invokevirtual   com/whatsapp/BubbleRelativeLayout.getWidth:()I
        //   124: istore          55
        //   126: iload           55
        //   128: iload           11
        //   130: isub           
        //   131: istore          35
        //   133: aload_0        
        //   134: getfield        com/whatsapp/BubbleRelativeLayout.e:I
        //   137: getstatic       com/whatsapp/BubbleRelativeLayout.k:Landroid/graphics/Rect;
        //   140: getfield        android/graphics/Rect.top:I
        //   143: isub           
        //   144: istore          37
        //   146: invokestatic    com/whatsapp/App.ak:()Z
        //   149: ifeq            368
        //   152: aload_0        
        //   153: invokevirtual   com/whatsapp/BubbleRelativeLayout.getWidth:()I
        //   156: istore          54
        //   158: iload           54
        //   160: istore          38
        //   162: aload           33
        //   164: iload           35
        //   166: iload           37
        //   168: iload           38
        //   170: aload_0        
        //   171: getfield        com/whatsapp/BubbleRelativeLayout.c:I
        //   174: getstatic       com/whatsapp/BubbleRelativeLayout.k:Landroid/graphics/Rect;
        //   177: getfield        android/graphics/Rect.bottom:I
        //   180: iadd           
        //   181: invokevirtual   android/graphics/Rect.set:(IIII)V
        //   184: aload_0        
        //   185: getfield        com/whatsapp/BubbleRelativeLayout.h:I
        //   188: istore          41
        //   190: iload           41
        //   192: tableswitch {
        //                4: 375
        //                5: 375
        //          default: 216
        //        }
        //   216: iload           6
        //   218: ifeq            647
        //   221: aload_0        
        //   222: invokevirtual   com/whatsapp/BubbleRelativeLayout.getContext:()Landroid/content/Context;
        //   225: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   228: ldc             2130837619
        //   230: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   233: astore          51
        //   235: aload           51
        //   237: astore          49
        //   239: aload           49
        //   241: astore          43
        //   243: aload_0        
        //   244: getfield        com/whatsapp/BubbleRelativeLayout.d:Landroid/graphics/Rect;
        //   247: astore          45
        //   249: invokestatic    com/whatsapp/App.ak:()Z
        //   252: ifeq            660
        //   255: aload           7
        //   257: getfield        com/whatsapp/vc.r:I
        //   260: istore          48
        //   262: iload           48
        //   264: ineg           
        //   265: istore          46
        //   267: aload           45
        //   269: iload           46
        //   271: iconst_0       
        //   272: invokevirtual   android/graphics/Rect.offset:(II)V
        //   275: aload           43
        //   277: ifnull          312
        //   280: new             Lcom/whatsapp/util/m;
        //   283: dup            
        //   284: aload           43
        //   286: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   289: astore          47
        //   291: aload           47
        //   293: iconst_1       
        //   294: invokevirtual   android/graphics/drawable/Drawable.setDither:(Z)V
        //   297: aload           47
        //   299: aload_0        
        //   300: getfield        com/whatsapp/BubbleRelativeLayout.d:Landroid/graphics/Rect;
        //   303: invokevirtual   android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
        //   306: aload           47
        //   308: aload_1        
        //   309: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   312: aload_0        
        //   313: aload_1        
        //   314: invokespecial   android/widget/RelativeLayout.onDraw:(Landroid/graphics/Canvas;)V
        //   317: return         
        //   318: astore_3       
        //   319: aload_3        
        //   320: athrow         
        //   321: astore          4
        //   323: aload           4
        //   325: athrow         
        //   326: astore          5
        //   328: aload           5
        //   330: athrow         
        //   331: iconst_0       
        //   332: istore          6
        //   334: goto            36
        //   337: astore          8
        //   339: aload           8
        //   341: athrow         
        //   342: astore          9
        //   344: aload           9
        //   346: athrow         
        //   347: astore          12
        //   349: aload           12
        //   351: athrow         
        //   352: astore          13
        //   354: aload           13
        //   356: athrow         
        //   357: iconst_0       
        //   358: istore          35
        //   360: goto            133
        //   363: astore          36
        //   365: aload           36
        //   367: athrow         
        //   368: iload           11
        //   370: istore          38
        //   372: goto            162
        //   375: iload           6
        //   377: ifeq            634
        //   380: aload_0        
        //   381: invokevirtual   com/whatsapp/BubbleRelativeLayout.getContext:()Landroid/content/Context;
        //   384: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   387: ldc             2130837620
        //   389: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   392: astore          53
        //   394: aload           53
        //   396: astore          42
        //   398: iload_2        
        //   399: ifne            216
        //   402: aload           42
        //   404: astore          43
        //   406: goto            243
        //   409: astore          52
        //   411: aload           52
        //   413: athrow         
        //   414: astore          39
        //   416: new             Ljava/lang/StringBuilder;
        //   419: dup            
        //   420: invokespecial   java/lang/StringBuilder.<init>:()V
        //   423: getstatic       com/whatsapp/BubbleRelativeLayout.z:Ljava/lang/String;
        //   426: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   429: aload           39
        //   431: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   434: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   437: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   440: invokestatic    com/whatsapp/util/br.b:()V
        //   443: iload_2        
        //   444: ifeq            312
        //   447: aload_0        
        //   448: getfield        com/whatsapp/BubbleRelativeLayout.d:Landroid/graphics/Rect;
        //   451: astore          15
        //   453: invokestatic    com/whatsapp/App.ak:()Z
        //   456: istore          16
        //   458: iload           16
        //   460: ifeq            680
        //   463: iconst_0       
        //   464: istore          17
        //   466: aload_0        
        //   467: getfield        com/whatsapp/BubbleRelativeLayout.e:I
        //   470: getstatic       com/whatsapp/BubbleRelativeLayout.n:Landroid/graphics/Rect;
        //   473: getfield        android/graphics/Rect.top:I
        //   476: isub           
        //   477: istore          19
        //   479: invokestatic    com/whatsapp/App.ak:()Z
        //   482: istore          20
        //   484: iload           20
        //   486: ifeq            697
        //   489: aload           15
        //   491: iload           17
        //   493: iload           19
        //   495: iload           11
        //   497: aload_0        
        //   498: getfield        com/whatsapp/BubbleRelativeLayout.c:I
        //   501: getstatic       com/whatsapp/BubbleRelativeLayout.n:Landroid/graphics/Rect;
        //   504: getfield        android/graphics/Rect.bottom:I
        //   507: iadd           
        //   508: invokevirtual   android/graphics/Rect.set:(IIII)V
        //   511: aload_0        
        //   512: getfield        com/whatsapp/BubbleRelativeLayout.h:I
        //   515: istore          23
        //   517: iload           23
        //   519: tableswitch {
        //                4: 706
        //                5: 706
        //          default: 540
        //        }
        //   540: iload           6
        //   542: ifeq            751
        //   545: aload_0        
        //   546: invokevirtual   com/whatsapp/BubbleRelativeLayout.getContext:()Landroid/content/Context;
        //   549: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   552: ldc             2130837612
        //   554: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   557: astore          32
        //   559: aload           32
        //   561: astore          30
        //   563: aload           30
        //   565: astore          25
        //   567: aload_0        
        //   568: getfield        com/whatsapp/BubbleRelativeLayout.d:Landroid/graphics/Rect;
        //   571: astore          27
        //   573: invokestatic    com/whatsapp/App.ak:()Z
        //   576: ifeq            764
        //   579: aload           7
        //   581: getfield        com/whatsapp/vc.r:I
        //   584: istore          28
        //   586: aload           27
        //   588: iload           28
        //   590: iconst_0       
        //   591: invokevirtual   android/graphics/Rect.offset:(II)V
        //   594: aload           25
        //   596: ifnull          312
        //   599: new             Lcom/whatsapp/util/m;
        //   602: dup            
        //   603: aload           25
        //   605: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   608: astore          29
        //   610: aload           29
        //   612: aload_0        
        //   613: getfield        com/whatsapp/BubbleRelativeLayout.d:Landroid/graphics/Rect;
        //   616: invokevirtual   android/graphics/drawable/Drawable.setBounds:(Landroid/graphics/Rect;)V
        //   619: aload           29
        //   621: iconst_1       
        //   622: invokevirtual   android/graphics/drawable/Drawable.setDither:(Z)V
        //   625: aload           29
        //   627: aload_1        
        //   628: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   631: goto            312
        //   634: getstatic       com/whatsapp/BubbleRelativeLayout.g:Landroid/graphics/drawable/Drawable;
        //   637: astore          42
        //   639: goto            398
        //   642: astore          50
        //   644: aload           50
        //   646: athrow         
        //   647: getstatic       com/whatsapp/BubbleRelativeLayout.a:Landroid/graphics/drawable/Drawable;
        //   650: astore          49
        //   652: goto            239
        //   655: astore          44
        //   657: aload           44
        //   659: athrow         
        //   660: aload           7
        //   662: getfield        com/whatsapp/vc.r:I
        //   665: istore          46
        //   667: goto            267
        //   670: astore          40
        //   672: aload           40
        //   674: athrow         
        //   675: astore          14
        //   677: aload           14
        //   679: athrow         
        //   680: aload_0        
        //   681: invokevirtual   com/whatsapp/BubbleRelativeLayout.getWidth:()I
        //   684: iload           11
        //   686: isub           
        //   687: istore          17
        //   689: goto            466
        //   692: astore          18
        //   694: aload           18
        //   696: athrow         
        //   697: aload_0        
        //   698: invokevirtual   com/whatsapp/BubbleRelativeLayout.getWidth:()I
        //   701: istore          11
        //   703: goto            489
        //   706: iload           6
        //   708: ifeq            738
        //   711: aload_0        
        //   712: invokevirtual   com/whatsapp/BubbleRelativeLayout.getContext:()Landroid/content/Context;
        //   715: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   718: ldc             2130837613
        //   720: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   723: astore          24
        //   725: goto            775
        //   728: astore          21
        //   730: aload           21
        //   732: athrow         
        //   733: astore          22
        //   735: aload           22
        //   737: athrow         
        //   738: getstatic       com/whatsapp/BubbleRelativeLayout.b:Landroid/graphics/drawable/Drawable;
        //   741: astore          24
        //   743: goto            775
        //   746: astore          31
        //   748: aload           31
        //   750: athrow         
        //   751: getstatic       com/whatsapp/BubbleRelativeLayout.j:Landroid/graphics/drawable/Drawable;
        //   754: astore          30
        //   756: goto            563
        //   759: astore          26
        //   761: aload           26
        //   763: athrow         
        //   764: aload           7
        //   766: getfield        com/whatsapp/vc.r:I
        //   769: ineg           
        //   770: istore          28
        //   772: goto            586
        //   775: aload           24
        //   777: astore          25
        //   779: goto            567
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      17     318    321    Ljava/lang/OutOfMemoryError;
        //  22     28     321    331    Ljava/lang/OutOfMemoryError;
        //  41     61     337    342    Ljava/lang/OutOfMemoryError;
        //  68     77     342    347    Ljava/lang/OutOfMemoryError;
        //  91     115    347    352    Ljava/lang/OutOfMemoryError;
        //  120    126    352    357    Ljava/lang/OutOfMemoryError;
        //  133    158    363    368    Ljava/lang/OutOfMemoryError;
        //  184    190    414    675    Ljava/lang/OutOfMemoryError;
        //  221    235    642    647    Ljava/lang/OutOfMemoryError;
        //  243    262    655    660    Ljava/lang/OutOfMemoryError;
        //  267    275    414    675    Ljava/lang/OutOfMemoryError;
        //  280    312    414    675    Ljava/lang/OutOfMemoryError;
        //  319    321    321    331    Ljava/lang/OutOfMemoryError;
        //  323    326    326    331    Ljava/lang/OutOfMemoryError;
        //  339    342    342    347    Ljava/lang/OutOfMemoryError;
        //  349    352    352    357    Ljava/lang/OutOfMemoryError;
        //  380    394    409    414    Ljava/lang/OutOfMemoryError;
        //  411    414    414    675    Ljava/lang/OutOfMemoryError;
        //  416    443    670    675    Ljava/lang/OutOfMemoryError;
        //  447    458    675    680    Ljava/lang/OutOfMemoryError;
        //  466    484    692    697    Ljava/lang/OutOfMemoryError;
        //  511    517    728    733    Ljava/lang/OutOfMemoryError;
        //  545    559    746    751    Ljava/lang/OutOfMemoryError;
        //  567    586    759    764    Ljava/lang/OutOfMemoryError;
        //  634    639    414    675    Ljava/lang/OutOfMemoryError;
        //  644    647    414    675    Ljava/lang/OutOfMemoryError;
        //  647    652    414    675    Ljava/lang/OutOfMemoryError;
        //  657    660    414    675    Ljava/lang/OutOfMemoryError;
        //  660    667    414    675    Ljava/lang/OutOfMemoryError;
        //  672    675    675    680    Ljava/lang/OutOfMemoryError;
        //  711    725    733    738    Ljava/lang/OutOfMemoryError;
        //  730    733    733    738    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 347, Size: 347
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
