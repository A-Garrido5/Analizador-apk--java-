// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

class m9 extends GestureDetector$SimpleOnGestureListener
{
    final GalleryView a;
    
    m9(final GalleryView a) {
        this.a = a;
    }
    
    public boolean onFling(final MotionEvent p0, final MotionEvent p1, final float p2, final float p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/view/MotionEvent.getY:()F
        //     4: aload_2        
        //     5: invokevirtual   android/view/MotionEvent.getY:()F
        //     8: fsub           
        //     9: invokestatic    java/lang/Math.abs:(F)F
        //    12: fstore          6
        //    14: fload           6
        //    16: ldc             250.0
        //    18: fcmpl          
        //    19: ifle            24
        //    22: iconst_0       
        //    23: ireturn        
        //    24: aload_1        
        //    25: invokevirtual   android/view/MotionEvent.getX:()F
        //    28: aload_2        
        //    29: invokevirtual   android/view/MotionEvent.getX:()F
        //    32: fsub           
        //    33: ldc             120.0
        //    35: fcmpl          
        //    36: ifle            164
        //    39: fload_3        
        //    40: invokestatic    java/lang/Math.abs:(F)F
        //    43: fstore          19
        //    45: fload           19
        //    47: ldc             200.0
        //    49: fcmpl          
        //    50: ifle            164
        //    53: aload_0        
        //    54: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //    57: invokestatic    com/whatsapp/GalleryView.b:(Lcom/whatsapp/GalleryView;)I
        //    60: istore          20
        //    62: iload           20
        //    64: iconst_1       
        //    65: if_icmpeq       162
        //    68: aload_0        
        //    69: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //    72: aload_0        
        //    73: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //    76: invokestatic    com/whatsapp/GalleryView.a:(Lcom/whatsapp/GalleryView;)I
        //    79: invokevirtual   com/whatsapp/GalleryView.getChildAt:(I)Landroid/view/View;
        //    82: checkcast       Lcom/whatsapp/TouchImageView;
        //    85: getfield        com/whatsapp/TouchImageView.B:Z
        //    88: istore          21
        //    90: iload           21
        //    92: ifne            162
        //    95: aload_0        
        //    96: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //    99: invokestatic    com/whatsapp/GalleryView.a:(Lcom/whatsapp/GalleryView;)I
        //   102: istore          22
        //   104: aload_0        
        //   105: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   108: invokevirtual   com/whatsapp/GalleryView.getChildCount:()I
        //   111: istore          23
        //   113: iload           22
        //   115: iload           23
        //   117: iconst_1       
        //   118: isub           
        //   119: if_icmpge       162
        //   122: aload_0        
        //   123: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   126: iconst_1       
        //   127: aload_0        
        //   128: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   131: invokestatic    com/whatsapp/GalleryView.a:(Lcom/whatsapp/GalleryView;)I
        //   134: iadd           
        //   135: invokevirtual   com/whatsapp/GalleryView.a:(I)V
        //   138: iconst_1       
        //   139: ireturn        
        //   140: astore          7
        //   142: aload           7
        //   144: athrow         
        //   145: astore          8
        //   147: aload           8
        //   149: athrow         
        //   150: astore          9
        //   152: aload           9
        //   154: athrow         
        //   155: astore          10
        //   157: aload           10
        //   159: athrow         
        //   160: astore          5
        //   162: iconst_0       
        //   163: ireturn        
        //   164: aload_2        
        //   165: invokevirtual   android/view/MotionEvent.getX:()F
        //   168: aload_1        
        //   169: invokevirtual   android/view/MotionEvent.getX:()F
        //   172: fsub           
        //   173: ldc             120.0
        //   175: fcmpl          
        //   176: ifle            162
        //   179: fload_3        
        //   180: invokestatic    java/lang/Math.abs:(F)F
        //   183: fstore          15
        //   185: fload           15
        //   187: ldc             200.0
        //   189: fcmpl          
        //   190: ifle            162
        //   193: aload_0        
        //   194: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   197: invokestatic    com/whatsapp/GalleryView.b:(Lcom/whatsapp/GalleryView;)I
        //   200: istore          16
        //   202: iload           16
        //   204: iconst_1       
        //   205: if_icmpeq       162
        //   208: aload_0        
        //   209: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   212: aload_0        
        //   213: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   216: invokestatic    com/whatsapp/GalleryView.a:(Lcom/whatsapp/GalleryView;)I
        //   219: invokevirtual   com/whatsapp/GalleryView.getChildAt:(I)Landroid/view/View;
        //   222: checkcast       Lcom/whatsapp/TouchImageView;
        //   225: getfield        com/whatsapp/TouchImageView.B:Z
        //   228: istore          17
        //   230: iload           17
        //   232: ifne            162
        //   235: aload_0        
        //   236: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   239: invokestatic    com/whatsapp/GalleryView.a:(Lcom/whatsapp/GalleryView;)I
        //   242: istore          18
        //   244: iload           18
        //   246: ifle            162
        //   249: aload_0        
        //   250: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   253: iconst_m1      
        //   254: aload_0        
        //   255: getfield        com/whatsapp/m9.a:Lcom/whatsapp/GalleryView;
        //   258: invokestatic    com/whatsapp/GalleryView.a:(Lcom/whatsapp/GalleryView;)I
        //   261: iadd           
        //   262: invokevirtual   com/whatsapp/GalleryView.a:(I)V
        //   265: iconst_1       
        //   266: ireturn        
        //   267: astore          11
        //   269: aload           11
        //   271: athrow         
        //   272: astore          12
        //   274: aload           12
        //   276: athrow         
        //   277: astore          13
        //   279: aload           13
        //   281: athrow         
        //   282: astore          14
        //   284: aload           14
        //   286: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      14     160    162    Ljava/lang/Exception;
        //  24     45     140    145    Ljava/lang/Exception;
        //  53     62     145    150    Ljava/lang/Exception;
        //  68     90     150    155    Ljava/lang/Exception;
        //  95     113    155    160    Ljava/lang/Exception;
        //  122    138    160    162    Ljava/lang/Exception;
        //  142    145    145    150    Ljava/lang/Exception;
        //  147    150    150    155    Ljava/lang/Exception;
        //  152    155    155    160    Ljava/lang/Exception;
        //  157    160    160    162    Ljava/lang/Exception;
        //  164    185    267    272    Ljava/lang/Exception;
        //  193    202    272    277    Ljava/lang/Exception;
        //  208    230    277    282    Ljava/lang/Exception;
        //  235    244    282    287    Ljava/lang/Exception;
        //  249    265    160    162    Ljava/lang/Exception;
        //  269    272    272    277    Ljava/lang/Exception;
        //  274    277    277    282    Ljava/lang/Exception;
        //  279    282    282    287    Ljava/lang/Exception;
        //  284    287    160    162    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 145, Size: 145
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
