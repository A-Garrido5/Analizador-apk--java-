// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.ImageButton;
import android.view.View$OnClickListener;

class ah3 implements View$OnClickListener
{
    private static final String[] z;
    private ImageButton a;
    final MediaView b;
    private VoiceNoteSeekBar c;
    
    static {
        final String[] z2 = new String[4];
        String s = "u~Yq\u0017nrXoYynYq\u0019{wT{\u001d8";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = '\u0018';
                        break;
                    }
                    case 1: {
                        c2 = '\u001b';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = '\u0018';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "86\u001d";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "8g\u001d";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "8g\u001d";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ah3(final MediaView b, final VoiceNoteSeekBar c, final ImageButton a) {
        this.b = b;
        this.c = c;
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
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/ah3.z:[Ljava/lang/String;
        //    14: iconst_0       
        //    15: aaload         
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    19: aload_0        
        //    20: getfield        com/whatsapp/ah3.c:Lcom/whatsapp/VoiceNoteSeekBar;
        //    23: invokevirtual   com/whatsapp/VoiceNoteSeekBar.f:()I
        //    26: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    29: getstatic       com/whatsapp/ah3.z:[Ljava/lang/String;
        //    32: iconst_2       
        //    33: aaload         
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: aload_0        
        //    38: getfield        com/whatsapp/ah3.c:Lcom/whatsapp/VoiceNoteSeekBar;
        //    41: invokevirtual   com/whatsapp/VoiceNoteSeekBar.a:()I
        //    44: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    47: getstatic       com/whatsapp/ah3.z:[Ljava/lang/String;
        //    50: iconst_1       
        //    51: aaload         
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: aload_0        
        //    56: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //    59: invokestatic    com/whatsapp/MediaView.u:(Lcom/whatsapp/MediaView;)I
        //    62: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    65: getstatic       com/whatsapp/ah3.z:[Ljava/lang/String;
        //    68: iconst_3       
        //    69: aaload         
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: iconst_5       
        //    74: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    77: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    80: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    83: aload_0        
        //    84: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //    87: invokestatic    com/whatsapp/MediaView.u:(Lcom/whatsapp/MediaView;)I
        //    90: iconst_5       
        //    91: if_icmpne       188
        //    94: aload_0        
        //    95: getfield        com/whatsapp/ah3.c:Lcom/whatsapp/VoiceNoteSeekBar;
        //    98: invokevirtual   com/whatsapp/VoiceNoteSeekBar.f:()I
        //   101: istore          28
        //   103: iload           28
        //   105: ifle            188
        //   108: aload_0        
        //   109: getfield        com/whatsapp/ah3.c:Lcom/whatsapp/VoiceNoteSeekBar;
        //   112: invokevirtual   com/whatsapp/VoiceNoteSeekBar.f:()I
        //   115: istore          29
        //   117: aload_0        
        //   118: getfield        com/whatsapp/ah3.c:Lcom/whatsapp/VoiceNoteSeekBar;
        //   121: invokevirtual   com/whatsapp/VoiceNoteSeekBar.a:()I
        //   124: istore          30
        //   126: iload           29
        //   128: iload           30
        //   130: if_icmpge       188
        //   133: aload_0        
        //   134: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   137: iconst_4       
        //   138: invokestatic    com/whatsapp/MediaView.a:(Lcom/whatsapp/MediaView;I)I
        //   141: pop            
        //   142: aload_0        
        //   143: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   146: invokestatic    com/whatsapp/App.e:(Landroid/content/Context;)Z
        //   149: pop            
        //   150: invokestatic    com/whatsapp/up.q:()V
        //   153: aload_0        
        //   154: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   157: invokestatic    com/whatsapp/MediaView.q:(Lcom/whatsapp/MediaView;)Lcom/whatsapp/util/ao;
        //   160: invokevirtual   com/whatsapp/util/ao.h:()V
        //   163: aload_0        
        //   164: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   167: invokestatic    com/whatsapp/MediaView.t:(Lcom/whatsapp/MediaView;)Landroid/os/Handler;
        //   170: iconst_0       
        //   171: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   174: pop            
        //   175: aload_0        
        //   176: getfield        com/whatsapp/ah3.a:Landroid/widget/ImageButton;
        //   179: ldc             2130838953
        //   181: invokevirtual   android/widget/ImageButton.setImageResource:(I)V
        //   184: iload_2        
        //   185: ifeq            489
        //   188: aload_0        
        //   189: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   192: invokestatic    com/whatsapp/MediaView.u:(Lcom/whatsapp/MediaView;)I
        //   195: istore          9
        //   197: iload           9
        //   199: iconst_5       
        //   200: if_icmpne       343
        //   203: aload_0        
        //   204: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   207: invokestatic    com/whatsapp/MediaView.q:(Lcom/whatsapp/MediaView;)Lcom/whatsapp/util/ao;
        //   210: invokevirtual   com/whatsapp/util/ao.i:()I
        //   213: istore          18
        //   215: aload_0        
        //   216: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   219: invokestatic    com/whatsapp/MediaView.q:(Lcom/whatsapp/MediaView;)Lcom/whatsapp/util/ao;
        //   222: invokevirtual   com/whatsapp/util/ao.e:()I
        //   225: istore          19
        //   227: iload           18
        //   229: iload           19
        //   231: if_icmplt       277
        //   234: aload_0        
        //   235: getfield        com/whatsapp/ah3.c:Lcom/whatsapp/VoiceNoteSeekBar;
        //   238: invokevirtual   com/whatsapp/VoiceNoteSeekBar.f:()I
        //   241: istore          24
        //   243: aload_0        
        //   244: getfield        com/whatsapp/ah3.c:Lcom/whatsapp/VoiceNoteSeekBar;
        //   247: invokevirtual   com/whatsapp/VoiceNoteSeekBar.a:()I
        //   250: istore          25
        //   252: iload           24
        //   254: iload           25
        //   256: if_icmpne       277
        //   259: aload_0        
        //   260: getfield        com/whatsapp/ah3.c:Lcom/whatsapp/VoiceNoteSeekBar;
        //   263: iconst_0       
        //   264: invokevirtual   com/whatsapp/VoiceNoteSeekBar.setProgress:(I)V
        //   267: aload_0        
        //   268: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   271: invokestatic    com/whatsapp/MediaView.q:(Lcom/whatsapp/MediaView;)Lcom/whatsapp/util/ao;
        //   274: invokevirtual   com/whatsapp/util/ao.g:()V
        //   277: aload_0        
        //   278: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   281: invokestatic    com/whatsapp/App.e:(Landroid/content/Context;)Z
        //   284: pop            
        //   285: invokestatic    com/whatsapp/up.q:()V
        //   288: aload_0        
        //   289: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   292: invokestatic    com/whatsapp/MediaView.q:(Lcom/whatsapp/MediaView;)Lcom/whatsapp/util/ao;
        //   295: invokevirtual   com/whatsapp/util/ao.h:()V
        //   298: aload_0        
        //   299: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   302: invokestatic    com/whatsapp/MediaView.t:(Lcom/whatsapp/MediaView;)Landroid/os/Handler;
        //   305: iconst_0       
        //   306: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   309: aload_0        
        //   310: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   313: invokestatic    com/whatsapp/MediaView.t:(Lcom/whatsapp/MediaView;)Landroid/os/Handler;
        //   316: iconst_0       
        //   317: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   320: pop            
        //   321: aload_0        
        //   322: getfield        com/whatsapp/ah3.a:Landroid/widget/ImageButton;
        //   325: ldc             2130838953
        //   327: invokevirtual   android/widget/ImageButton.setImageResource:(I)V
        //   330: aload_0        
        //   331: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   334: iconst_4       
        //   335: invokestatic    com/whatsapp/MediaView.a:(Lcom/whatsapp/MediaView;I)I
        //   338: pop            
        //   339: iload_2        
        //   340: ifeq            489
        //   343: aload_0        
        //   344: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   347: invokestatic    com/whatsapp/MediaView.u:(Lcom/whatsapp/MediaView;)I
        //   350: istore          13
        //   352: iload           13
        //   354: iconst_4       
        //   355: if_icmpne       407
        //   358: aload_0        
        //   359: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   362: invokestatic    com/whatsapp/MediaView.q:(Lcom/whatsapp/MediaView;)Lcom/whatsapp/util/ao;
        //   365: invokevirtual   com/whatsapp/util/ao.a:()V
        //   368: aload_0        
        //   369: getfield        com/whatsapp/ah3.a:Landroid/widget/ImageButton;
        //   372: new             Lcom/whatsapp/util/m;
        //   375: dup            
        //   376: aload_0        
        //   377: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   380: invokevirtual   com/whatsapp/MediaView.getResources:()Landroid/content/res/Resources;
        //   383: ldc             2130838954
        //   385: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   388: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   391: invokevirtual   android/widget/ImageButton.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   394: aload_0        
        //   395: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   398: iconst_5       
        //   399: invokestatic    com/whatsapp/MediaView.a:(Lcom/whatsapp/MediaView;I)I
        //   402: pop            
        //   403: iload_2        
        //   404: ifeq            489
        //   407: aload_0        
        //   408: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   411: aload_0        
        //   412: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   415: aload_0        
        //   416: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   419: invokestatic    com/whatsapp/MediaView.i:(Lcom/whatsapp/MediaView;)I
        //   422: invokestatic    com/whatsapp/MediaView.c:(Lcom/whatsapp/MediaView;I)Lcom/whatsapp/protocol/bi;
        //   425: invokestatic    com/whatsapp/MediaView.b:(Lcom/whatsapp/MediaView;Lcom/whatsapp/protocol/bi;)V
        //   428: aload_0        
        //   429: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   432: invokestatic    com/whatsapp/MediaView.q:(Lcom/whatsapp/MediaView;)Lcom/whatsapp/util/ao;
        //   435: ifnull          489
        //   438: aload_0        
        //   439: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   442: iconst_4       
        //   443: invokestatic    com/whatsapp/MediaView.a:(Lcom/whatsapp/MediaView;I)I
        //   446: pop            
        //   447: aload_0        
        //   448: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   451: invokestatic    com/whatsapp/MediaView.t:(Lcom/whatsapp/MediaView;)Landroid/os/Handler;
        //   454: iconst_0       
        //   455: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   458: pop            
        //   459: aload_0        
        //   460: getfield        com/whatsapp/ah3.a:Landroid/widget/ImageButton;
        //   463: ldc             2130838953
        //   465: invokevirtual   android/widget/ImageButton.setImageResource:(I)V
        //   468: aload_0        
        //   469: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   472: invokestatic    com/whatsapp/App.e:(Landroid/content/Context;)Z
        //   475: pop            
        //   476: invokestatic    com/whatsapp/up.q:()V
        //   479: aload_0        
        //   480: getfield        com/whatsapp/ah3.b:Lcom/whatsapp/MediaView;
        //   483: invokestatic    com/whatsapp/MediaView.q:(Lcom/whatsapp/MediaView;)Lcom/whatsapp/util/ao;
        //   486: invokevirtual   com/whatsapp/util/ao.h:()V
        //   489: return         
        //   490: astore_3       
        //   491: aload_3        
        //   492: athrow         
        //   493: astore          4
        //   495: aload           4
        //   497: athrow         
        //   498: astore          5
        //   500: aload           5
        //   502: athrow         
        //   503: astore          6
        //   505: aload           6
        //   507: athrow         
        //   508: astore          7
        //   510: aload           7
        //   512: athrow         
        //   513: astore          8
        //   515: aload           8
        //   517: athrow         
        //   518: astore          27
        //   520: aload           27
        //   522: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   525: goto            277
        //   528: astore          26
        //   530: aload           26
        //   532: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   535: goto            277
        //   538: astore          20
        //   540: aload           20
        //   542: athrow         
        //   543: astore          10
        //   545: aload           10
        //   547: athrow         
        //   548: astore          11
        //   550: aload           11
        //   552: athrow         
        //   553: astore          12
        //   555: aload           12
        //   557: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      103    490    493    Ljava/lang/IllegalStateException;
        //  108    126    493    498    Ljava/lang/IllegalStateException;
        //  133    184    498    503    Ljava/lang/IllegalStateException;
        //  188    197    503    508    Ljava/lang/IllegalStateException;
        //  203    227    508    513    Ljava/lang/IllegalStateException;
        //  234    252    513    518    Ljava/lang/IllegalStateException;
        //  267    277    518    528    Ljava/lang/IllegalStateException;
        //  267    277    528    538    Ljava/io/IOException;
        //  277    339    538    543    Ljava/lang/IllegalStateException;
        //  343    352    543    548    Ljava/lang/IllegalStateException;
        //  358    403    548    553    Ljava/lang/IllegalStateException;
        //  407    489    553    558    Ljava/lang/IllegalStateException;
        //  491    493    493    498    Ljava/lang/IllegalStateException;
        //  495    498    498    503    Ljava/lang/IllegalStateException;
        //  500    503    503    508    Ljava/lang/IllegalStateException;
        //  505    508    508    513    Ljava/lang/IllegalStateException;
        //  510    513    513    518    Ljava/lang/IllegalStateException;
        //  540    543    543    548    Ljava/lang/IllegalStateException;
        //  545    548    548    553    Ljava/lang/IllegalStateException;
        //  550    553    553    558    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 260, Size: 260
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
