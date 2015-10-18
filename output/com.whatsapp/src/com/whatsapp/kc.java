// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class kc implements View$OnClickListener
{
    private static final String z;
    final bi a;
    
    static {
        final char[] charArray = "VC~\u0017j".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0003';
                    break;
                }
                case 0: {
                    c2 = '3';
                    break;
                }
                case 1: {
                    c2 = '.';
                    break;
                }
                case 2: {
                    c2 = '\u0011';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    kc(final bi a) {
        this.a = a;
    }
    
    public void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: aload_1        
        //     7: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //    10: checkcast       Ljava/lang/Integer;
        //    13: invokevirtual   java/lang/Integer.intValue:()I
        //    16: istore          4
        //    18: invokestatic    com/whatsapp/bi.c:()Ljava/util/ArrayList;
        //    21: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    24: astore          5
        //    26: iconst_0       
        //    27: istore          6
        //    29: aload           5
        //    31: invokeinterface java/util/Iterator.hasNext:()Z
        //    36: ifeq            448
        //    39: aload           5
        //    41: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    46: checkcast       Lcom/whatsapp/EmojiPicker$EmojiWeight;
        //    49: astore          24
        //    51: aload           24
        //    53: getfield        com/whatsapp/EmojiPicker$EmojiWeight.code:I
        //    56: iload           4
        //    58: if_icmpeq       78
        //    61: aload           24
        //    63: ldc             0.9
        //    65: aload           24
        //    67: getfield        com/whatsapp/EmojiPicker$EmojiWeight.weight:F
        //    70: fmul           
        //    71: putfield        com/whatsapp/EmojiPicker$EmojiWeight.weight:F
        //    74: iload_3        
        //    75: ifeq            441
        //    78: aload           24
        //    80: fconst_1       
        //    81: aload           24
        //    83: getfield        com/whatsapp/EmojiPicker$EmojiWeight.weight:F
        //    86: fadd           
        //    87: putfield        com/whatsapp/EmojiPicker$EmojiWeight.weight:F
        //    90: iconst_1       
        //    91: istore          7
        //    93: iload_3        
        //    94: ifeq            434
        //    97: iload           7
        //    99: ifne            119
        //   102: invokestatic    com/whatsapp/bi.c:()Ljava/util/ArrayList;
        //   105: new             Lcom/whatsapp/EmojiPicker$EmojiWeight;
        //   108: dup            
        //   109: iload           4
        //   111: fconst_1       
        //   112: invokespecial   com/whatsapp/EmojiPicker$EmojiWeight.<init>:(IF)V
        //   115: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   118: pop            
        //   119: invokestatic    com/whatsapp/bi.c:()Ljava/util/ArrayList;
        //   122: aload_0        
        //   123: getfield        com/whatsapp/kc.a:Lcom/whatsapp/bi;
        //   126: invokestatic    com/whatsapp/bi.e:(Lcom/whatsapp/bi;)Ljava/util/Comparator;
        //   129: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   132: iconst_m1      
        //   133: invokestatic    com/whatsapp/bi.c:()Ljava/util/ArrayList;
        //   136: invokevirtual   java/util/ArrayList.size:()I
        //   139: iadd           
        //   140: istore          8
        //   142: iload           8
        //   144: bipush          35
        //   146: if_icmple       188
        //   149: invokestatic    com/whatsapp/bi.c:()Ljava/util/ArrayList;
        //   152: iload           8
        //   154: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   157: checkcast       Lcom/whatsapp/EmojiPicker$EmojiWeight;
        //   160: getfield        com/whatsapp/EmojiPicker$EmojiWeight.weight:F
        //   163: ldc             0.1
        //   165: fcmpg          
        //   166: ifge            178
        //   169: invokestatic    com/whatsapp/bi.c:()Ljava/util/ArrayList;
        //   172: iload           8
        //   174: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   177: pop            
        //   178: iload           8
        //   180: iconst_1       
        //   181: isub           
        //   182: istore          20
        //   184: iload_3        
        //   185: ifeq            427
        //   188: aconst_null    
        //   189: astore          9
        //   191: new             Ljava/io/ObjectOutputStream;
        //   194: dup            
        //   195: new             Ljava/io/FileOutputStream;
        //   198: dup            
        //   199: new             Ljava/io/File;
        //   202: dup            
        //   203: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   206: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //   209: getstatic       com/whatsapp/kc.z:Ljava/lang/String;
        //   212: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   215: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   218: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   221: astore          10
        //   223: aload           10
        //   225: invokestatic    com/whatsapp/bi.c:()Ljava/util/ArrayList;
        //   228: invokevirtual   java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
        //   231: aload           10
        //   233: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   236: invokestatic    com/whatsapp/bi.b:()I
        //   239: ifeq            254
        //   242: aload_0        
        //   243: getfield        com/whatsapp/kc.a:Lcom/whatsapp/bi;
        //   246: invokestatic    com/whatsapp/bi.j:(Lcom/whatsapp/bi;)[Lcom/whatsapp/io;
        //   249: iconst_0       
        //   250: aaload         
        //   251: invokevirtual   com/whatsapp/io.notifyDataSetChanged:()V
        //   254: aload_0        
        //   255: getfield        com/whatsapp/kc.a:Lcom/whatsapp/bi;
        //   258: invokestatic    com/whatsapp/bi.a:(Lcom/whatsapp/bi;)Lcom/whatsapp/eu;
        //   261: ifnull          335
        //   264: iload           4
        //   266: invokestatic    com/whatsapp/util/cq.c:(I)[I
        //   269: astore          14
        //   271: aload           14
        //   273: ifnonnull       297
        //   276: aload_0        
        //   277: getfield        com/whatsapp/kc.a:Lcom/whatsapp/bi;
        //   280: invokestatic    com/whatsapp/bi.a:(Lcom/whatsapp/bi;)Lcom/whatsapp/eu;
        //   283: iload           4
        //   285: invokestatic    com/whatsapp/util/cq.e:(I)I
        //   288: invokeinterface com/whatsapp/eu.a:(I)V
        //   293: iload_3        
        //   294: ifeq            335
        //   297: aload           14
        //   299: arraylength    
        //   300: istore          15
        //   302: iload_2        
        //   303: iload           15
        //   305: if_icmpge       335
        //   308: aload           14
        //   310: iload_2        
        //   311: iaload         
        //   312: istore          16
        //   314: aload_0        
        //   315: getfield        com/whatsapp/kc.a:Lcom/whatsapp/bi;
        //   318: invokestatic    com/whatsapp/bi.a:(Lcom/whatsapp/bi;)Lcom/whatsapp/eu;
        //   321: iload           16
        //   323: invokeinterface com/whatsapp/eu.a:(I)V
        //   328: iinc            2, 1
        //   331: iload_3        
        //   332: ifeq            302
        //   335: return         
        //   336: astore          25
        //   338: aload           25
        //   340: athrow         
        //   341: astore          22
        //   343: aload           22
        //   345: athrow         
        //   346: astore          19
        //   348: aload           19
        //   350: athrow         
        //   351: astore          11
        //   353: aconst_null    
        //   354: astore          10
        //   356: aload           11
        //   358: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   361: aload           10
        //   363: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   366: goto            236
        //   369: astore          18
        //   371: aload           18
        //   373: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   376: aload           9
        //   378: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   381: goto            236
        //   384: astore          12
        //   386: aload           9
        //   388: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   391: aload           12
        //   393: athrow         
        //   394: astore          13
        //   396: aload           13
        //   398: athrow         
        //   399: astore          17
        //   401: aload           17
        //   403: athrow         
        //   404: astore          12
        //   406: aload           10
        //   408: astore          9
        //   410: goto            386
        //   413: astore          18
        //   415: aload           10
        //   417: astore          9
        //   419: goto            371
        //   422: astore          11
        //   424: goto            356
        //   427: iload           20
        //   429: istore          8
        //   431: goto            142
        //   434: iload           7
        //   436: istore          6
        //   438: goto            29
        //   441: iload           6
        //   443: istore          7
        //   445: goto            93
        //   448: iload           6
        //   450: istore          7
        //   452: goto            97
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  51     74     336    341    Ljava/io/FileNotFoundException;
        //  102    119    341    346    Ljava/io/FileNotFoundException;
        //  149    178    346    351    Ljava/io/FileNotFoundException;
        //  191    223    351    356    Ljava/io/FileNotFoundException;
        //  191    223    369    371    Ljava/io/IOException;
        //  191    223    384    386    Any
        //  223    231    422    427    Ljava/io/FileNotFoundException;
        //  223    231    413    422    Ljava/io/IOException;
        //  223    231    404    413    Any
        //  236    254    394    399    Ljava/io/FileNotFoundException;
        //  276    293    399    404    Ljava/io/FileNotFoundException;
        //  356    361    404    413    Any
        //  371    376    384    386    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 204, Size: 204
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
