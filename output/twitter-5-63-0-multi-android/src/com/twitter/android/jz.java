// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.Bitmap;
import android.net.Uri;
import android.content.Context;
import android.os.AsyncTask;

public class jz extends AsyncTask
{
    private Context a;
    private ka b;
    
    public jz(final Context a, final ka b) {
        this.a = a;
        this.b = b;
    }
    
    protected Bitmap a(final Uri... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: aload_0        
        //     3: getfield        com/twitter/android/jz.a:Landroid/content/Context;
        //     6: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     9: getstatic       android/provider/ContactsContract$Profile.CONTENT_URI:Landroid/net/Uri;
        //    12: iconst_1       
        //    13: invokestatic    android/provider/ContactsContract$Contacts.openContactPhotoInputStream:(Landroid/content/ContentResolver;Landroid/net/Uri;Z)Ljava/io/InputStream;
        //    16: astore          12
        //    18: aload           12
        //    20: astore          4
        //    22: aload           4
        //    24: ifnonnull       49
        //    27: aload_0        
        //    28: getfield        com/twitter/android/jz.b:Lcom/twitter/android/ka;
        //    31: invokeinterface com/twitter/android/ka.a:()V
        //    36: aconst_null    
        //    37: areturn        
        //    38: astore_3       
        //    39: aload_3        
        //    40: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    43: aconst_null    
        //    44: astore          4
        //    46: goto            22
        //    49: aload_0        
        //    50: getfield        com/twitter/android/jz.a:Landroid/content/Context;
        //    53: getstatic       com/twitter/library/media/model/MediaType.b:Lcom/twitter/library/media/model/MediaType;
        //    56: getfield        com/twitter/library/media/model/MediaType.extension:Ljava/lang/String;
        //    59: invokestatic    com/twitter/library/util/af.a:(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
        //    62: astore          5
        //    64: aload           5
        //    66: ifnonnull       80
        //    69: aload_0        
        //    70: getfield        com/twitter/android/jz.b:Lcom/twitter/android/ka;
        //    73: invokeinterface com/twitter/android/ka.a:()V
        //    78: aconst_null    
        //    79: areturn        
        //    80: new             Ljava/io/FileOutputStream;
        //    83: dup            
        //    84: aload           5
        //    86: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    89: astore          6
        //    91: aload           4
        //    93: aload           6
        //    95: sipush          4096
        //    98: invokestatic    yp.a:(Ljava/io/InputStream;Ljava/io/OutputStream;I)I
        //   101: pop            
        //   102: aload           4
        //   104: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   107: aload           6
        //   109: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   112: aload_0        
        //   113: getfield        com/twitter/android/jz.b:Lcom/twitter/android/ka;
        //   116: aload           5
        //   118: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   121: invokeinterface com/twitter/android/ka.a:(Landroid/net/Uri;)V
        //   126: aload           5
        //   128: invokestatic    com/twitter/library/media/decoder/ImageDecoder.a:(Ljava/io/File;)Lcom/twitter/library/media/decoder/ImageDecoder;
        //   131: invokevirtual   com/twitter/library/media/decoder/ImageDecoder.b:()Landroid/graphics/Bitmap;
        //   134: areturn        
        //   135: astore          11
        //   137: aconst_null    
        //   138: astore          6
        //   140: aload_0        
        //   141: getfield        com/twitter/android/jz.b:Lcom/twitter/android/ka;
        //   144: invokeinterface com/twitter/android/ka.a:()V
        //   149: aload           4
        //   151: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   154: aload           6
        //   156: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   159: aconst_null    
        //   160: areturn        
        //   161: astore          9
        //   163: aload           4
        //   165: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   168: aload_2        
        //   169: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   172: aload           9
        //   174: athrow         
        //   175: astore          8
        //   177: aload           6
        //   179: astore_2       
        //   180: aload           8
        //   182: astore          9
        //   184: goto            163
        //   187: astore          7
        //   189: goto            140
        //   192: astore_3       
        //   193: goto            39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      18     38     39     Ljava/lang/SecurityException;
        //  2      18     192    196    Ljava/lang/NullPointerException;
        //  80     91     135    140    Ljava/io/IOException;
        //  80     91     161    163    Any
        //  91     102    187    192    Ljava/io/IOException;
        //  91     102    175    187    Any
        //  140    149    175    187    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 89, Size: 89
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
