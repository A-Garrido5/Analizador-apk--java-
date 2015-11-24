// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ahn implements View$OnClickListener
{
    final tv a;
    
    ahn(final tv a) {
        this.a = a;
    }
    
    public void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: checkcast       Landroid/widget/CheckBox;
        //     8: invokevirtual   android/widget/CheckBox.isChecked:()Z
        //    11: istore_3       
        //    12: aload_1        
        //    13: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //    16: checkcast       Lcom/whatsapp/a_9;
        //    19: astore          4
        //    21: aload           4
        //    23: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    26: invokestatic    com/whatsapp/App.p:(Ljava/lang/String;)Z
        //    29: istore          6
        //    31: iload           6
        //    33: ifeq            42
        //    36: return         
        //    37: astore          5
        //    39: aload           5
        //    41: athrow         
        //    42: iload_3        
        //    43: ifeq            158
        //    46: aload_0        
        //    47: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //    50: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //    53: invokestatic    com/whatsapp/MultipleContactPicker.i:(Lcom/whatsapp/MultipleContactPicker;)Ljava/util/Set;
        //    56: invokeinterface java/util/Set.size:()I
        //    61: istore          20
        //    63: aload_0        
        //    64: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //    67: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //    70: invokestatic    com/whatsapp/MultipleContactPicker.g:(Lcom/whatsapp/MultipleContactPicker;)I
        //    73: istore          21
        //    75: iload           20
        //    77: iload           21
        //    79: if_icmpne       158
        //    82: aload_0        
        //    83: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //    86: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //    89: astore          23
        //    91: aload_0        
        //    92: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //    95: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //    98: aload_0        
        //    99: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   102: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //   105: invokestatic    com/whatsapp/MultipleContactPicker.k:(Lcom/whatsapp/MultipleContactPicker;)I
        //   108: invokevirtual   com/whatsapp/MultipleContactPicker.getString:(I)Ljava/lang/String;
        //   111: astore          24
        //   113: iconst_1       
        //   114: anewarray       Ljava/lang/Object;
        //   117: astore          25
        //   119: aload           25
        //   121: iconst_0       
        //   122: aload_0        
        //   123: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   126: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //   129: invokestatic    com/whatsapp/MultipleContactPicker.g:(Lcom/whatsapp/MultipleContactPicker;)I
        //   132: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   135: aastore        
        //   136: aload           23
        //   138: aload           24
        //   140: aload           25
        //   142: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   145: invokevirtual   com/whatsapp/MultipleContactPicker.f:(Ljava/lang/String;)V
        //   148: aload_1        
        //   149: checkcast       Landroid/widget/CheckBox;
        //   152: iconst_0       
        //   153: invokevirtual   android/widget/CheckBox.setChecked:(Z)V
        //   156: iconst_0       
        //   157: istore_3       
        //   158: aload           4
        //   160: iload_3        
        //   161: putfield        com/whatsapp/a_9.g:Z
        //   164: aload           4
        //   166: getfield        com/whatsapp/a_9.g:Z
        //   169: istore          9
        //   171: iload           9
        //   173: ifeq            201
        //   176: aload_0        
        //   177: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   180: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //   183: invokestatic    com/whatsapp/MultipleContactPicker.i:(Lcom/whatsapp/MultipleContactPicker;)Ljava/util/Set;
        //   186: aload           4
        //   188: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   191: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   196: pop            
        //   197: iload_2        
        //   198: ifeq            222
        //   201: aload_0        
        //   202: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   205: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //   208: invokestatic    com/whatsapp/MultipleContactPicker.i:(Lcom/whatsapp/MultipleContactPicker;)Ljava/util/Set;
        //   211: aload           4
        //   213: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   216: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   221: pop            
        //   222: aload_0        
        //   223: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   226: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //   229: aload_0        
        //   230: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   233: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //   236: invokestatic    com/whatsapp/MultipleContactPicker.i:(Lcom/whatsapp/MultipleContactPicker;)Ljava/util/Set;
        //   239: invokeinterface java/util/Set.size:()I
        //   244: invokestatic    com/whatsapp/MultipleContactPicker.a:(Lcom/whatsapp/MultipleContactPicker;I)V
        //   247: aload_0        
        //   248: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   251: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //   254: invokestatic    com/whatsapp/MultipleContactPicker.j:(Lcom/whatsapp/MultipleContactPicker;)Ljava/util/ArrayList;
        //   257: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   260: astore          11
        //   262: iconst_0       
        //   263: istore          12
        //   265: aload           11
        //   267: invokeinterface java/util/Iterator.hasNext:()Z
        //   272: ifeq            400
        //   275: aload           11
        //   277: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   282: checkcast       Lcom/whatsapp/a_9;
        //   285: astore          15
        //   287: aload           15
        //   289: aload           4
        //   291: if_acmpeq       393
        //   294: aload           4
        //   296: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   299: aload           15
        //   301: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   304: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   307: istore          17
        //   309: iload           17
        //   311: ifeq            393
        //   314: aload           15
        //   316: aload           4
        //   318: getfield        com/whatsapp/a_9.g:Z
        //   321: putfield        com/whatsapp/a_9.g:Z
        //   324: iconst_1       
        //   325: istore          13
        //   327: iload_2        
        //   328: ifeq            386
        //   331: iload           13
        //   333: ifeq            36
        //   336: aload_0        
        //   337: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   340: invokevirtual   com/whatsapp/tv.notifyDataSetChanged:()V
        //   343: return         
        //   344: astore          14
        //   346: aload           14
        //   348: athrow         
        //   349: astore          19
        //   351: aload           19
        //   353: athrow         
        //   354: astore          22
        //   356: aload_0        
        //   357: getfield        com/whatsapp/ahn.a:Lcom/whatsapp/tv;
        //   360: getfield        com/whatsapp/tv.a:Lcom/whatsapp/MultipleContactPicker;
        //   363: ldc             2131231375
        //   365: invokevirtual   com/whatsapp/MultipleContactPicker.a:(I)V
        //   368: goto            148
        //   371: astore          7
        //   373: aload           7
        //   375: athrow         
        //   376: astore          8
        //   378: aload           8
        //   380: athrow         
        //   381: astore          16
        //   383: aload           16
        //   385: athrow         
        //   386: iload           13
        //   388: istore          12
        //   390: goto            265
        //   393: iload           12
        //   395: istore          13
        //   397: goto            327
        //   400: iload           12
        //   402: istore          13
        //   404: goto            331
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  21     31     37     42     Ljava/util/UnknownFormatConversionException;
        //  46     75     349    354    Ljava/util/UnknownFormatConversionException;
        //  82     148    354    371    Ljava/util/UnknownFormatConversionException;
        //  158    171    371    376    Ljava/util/UnknownFormatConversionException;
        //  176    197    376    381    Ljava/util/UnknownFormatConversionException;
        //  201    222    376    381    Ljava/util/UnknownFormatConversionException;
        //  294    309    381    386    Ljava/util/UnknownFormatConversionException;
        //  336    343    344    349    Ljava/util/UnknownFormatConversionException;
        //  373    376    376    381    Ljava/util/UnknownFormatConversionException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 177, Size: 177
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
