// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.decoder;

import android.graphics.Bitmap;
import com.twitter.internal.android.util.Size;
import java.io.FileInputStream;

public class i extends ImageDecoder
{
    protected int n;
    
    @Override
    protected Size a(final FileInputStream fileInputStream) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected Bitmap b(final FileInputStream fileInputStream) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    b c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //     7: astore_2       
        //     8: aload_2        
        //     9: aload_0        
        //    10: getfield        com/twitter/library/media/decoder/i.i:Ljava/io/File;
        //    13: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    16: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/lang/String;)V
        //    19: aload_2        
        //    20: sipush          1000
        //    23: aload_0        
        //    24: getfield        com/twitter/library/media/decoder/i.n:I
        //    27: imul           
        //    28: i2l            
        //    29: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(J)Landroid/graphics/Bitmap;
        //    32: astore          11
        //    34: aload           11
        //    36: astore          7
        //    38: aload_2        
        //    39: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //    42: aload           7
        //    44: ifnonnull       81
        //    47: aconst_null    
        //    48: areturn        
        //    49: astore          5
        //    51: aload           5
        //    53: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    56: aload_2        
        //    57: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //    60: aconst_null    
        //    61: astore          7
        //    63: goto            42
        //    66: astore          6
        //    68: aconst_null    
        //    69: astore          7
        //    71: goto            42
        //    74: astore_3       
        //    75: aload_2        
        //    76: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //    79: aload_3        
        //    80: athrow         
        //    81: aload           7
        //    83: invokestatic    com/twitter/internal/android/util/Size.a:(Landroid/graphics/Bitmap;)Lcom/twitter/internal/android/util/Size;
        //    86: astore          8
        //    88: aload_0        
        //    89: getfield        com/twitter/library/media/decoder/i.b:Lcom/twitter/library/media/decoder/f;
        //    92: aload           8
        //    94: invokevirtual   com/twitter/library/media/decoder/f.g:(Lcom/twitter/internal/android/util/Size;)Landroid/graphics/Matrix;
        //    97: astore          9
        //    99: aload           7
        //   101: aload_0        
        //   102: getfield        com/twitter/library/media/decoder/i.b:Lcom/twitter/library/media/decoder/f;
        //   105: aload           8
        //   107: invokevirtual   com/twitter/library/media/decoder/f.c:(Lcom/twitter/internal/android/util/Size;)Landroid/graphics/Rect;
        //   110: aload           9
        //   112: iconst_1       
        //   113: invokestatic    com/twitter/library/media/util/m.a:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
        //   116: astore          10
        //   118: aload           10
        //   120: aload           7
        //   122: if_acmpeq       130
        //   125: aload           7
        //   127: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   130: new             Lcom/twitter/library/media/decoder/b;
        //   133: dup            
        //   134: aload           10
        //   136: invokespecial   com/twitter/library/media/decoder/b.<init>:(Landroid/graphics/Bitmap;)V
        //   139: areturn        
        //   140: astore          12
        //   142: goto            42
        //   145: astore          4
        //   147: goto            79
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  8      34     49     74     Ljava/lang/RuntimeException;
        //  8      34     74     81     Any
        //  38     42     140    145    Ljava/lang/RuntimeException;
        //  51     56     74     81     Any
        //  56     60     66     74     Ljava/lang/RuntimeException;
        //  75     79     145    150    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
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
    
    public ImageDecoder f(final int n) {
        this.n = n;
        return this;
    }
}
