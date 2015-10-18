// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import android.content.res.AssetFileDescriptor;
import com.twitter.media.MediaUtils;
import com.twitter.media.c;
import java.io.File;
import android.net.Uri;
import android.content.Context;

public class g
{
    private static boolean a;
    private static boolean b;
    private static a c;
    
    private static a a() {
        if (g.c == null) {
            (g.c = new a()).a();
        }
        return g.c;
    }
    
    public static boolean a(final int n) {
        return n == 0;
    }
    
    public static boolean a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: ldc             Lcom/twitter/media/filters/g;.class
        //     4: monitorenter   
        //     5: getstatic       com/twitter/media/filters/g.a:Z
        //     8: ifeq            20
        //    11: getstatic       com/twitter/media/filters/g.b:Z
        //    14: istore_1       
        //    15: ldc             Lcom/twitter/media/filters/g;.class
        //    17: monitorexit    
        //    18: iload_1        
        //    19: ireturn        
        //    20: aconst_null    
        //    21: astore_3       
        //    22: invokestatic    com/twitter/media/NativeInit.b:()Z
        //    25: istore          10
        //    27: aconst_null    
        //    28: astore_3       
        //    29: iload           10
        //    31: ifeq            236
        //    34: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    37: istore          11
        //    39: aconst_null    
        //    40: astore_3       
        //    41: iload           11
        //    43: bipush          14
        //    45: if_icmplt       236
        //    48: aload_0        
        //    49: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    52: getstatic       com/twitter/media/c.filter_resources:I
        //    55: invokevirtual   android/content/res/Resources.openRawResourceFd:(I)Landroid/content/res/AssetFileDescriptor;
        //    58: astore          12
        //    60: aload           12
        //    62: astore_3       
        //    63: aload_3        
        //    64: ifnull          119
        //    67: aload_3        
        //    68: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //    71: lconst_0       
        //    72: lcmp           
        //    73: ifle            119
        //    76: aload_3        
        //    77: invokevirtual   android/content/res/AssetFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    80: astore          16
        //    82: aload           16
        //    84: ifnull          119
        //    87: aload           16
        //    89: invokevirtual   java/io/FileDescriptor.valid:()Z
        //    92: ifeq            119
        //    95: iconst_1       
        //    96: putstatic       com/twitter/media/filters/g.b:Z
        //    99: iconst_1       
        //   100: putstatic       com/twitter/media/filters/g.a:Z
        //   103: aload_3        
        //   104: ifnull          15
        //   107: aload_3        
        //   108: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   111: goto            15
        //   114: astore          17
        //   116: goto            15
        //   119: aload_3        
        //   120: astore          7
        //   122: iconst_0       
        //   123: putstatic       com/twitter/media/filters/g.b:Z
        //   126: iconst_1       
        //   127: putstatic       com/twitter/media/filters/g.a:Z
        //   130: aload           7
        //   132: ifnull          140
        //   135: aload           7
        //   137: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   140: iconst_0       
        //   141: istore_1       
        //   142: goto            15
        //   145: astore          6
        //   147: aconst_null    
        //   148: astore          7
        //   150: iconst_0       
        //   151: putstatic       com/twitter/media/filters/g.b:Z
        //   154: iconst_1       
        //   155: putstatic       com/twitter/media/filters/g.a:Z
        //   158: aload           7
        //   160: ifnull          168
        //   163: aload           7
        //   165: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   168: iconst_0       
        //   169: istore_1       
        //   170: goto            15
        //   173: astore          4
        //   175: iconst_1       
        //   176: putstatic       com/twitter/media/filters/g.a:Z
        //   179: aload_3        
        //   180: ifnull          187
        //   183: aload_3        
        //   184: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   187: aload           4
        //   189: athrow         
        //   190: astore_2       
        //   191: ldc             Lcom/twitter/media/filters/g;.class
        //   193: monitorexit    
        //   194: aload_2        
        //   195: athrow         
        //   196: astore          14
        //   198: goto            140
        //   201: astore          9
        //   203: goto            168
        //   206: astore          5
        //   208: goto            187
        //   211: astore          8
        //   213: aload           7
        //   215: astore_3       
        //   216: aload           8
        //   218: astore          4
        //   220: goto            175
        //   223: astore          15
        //   225: aload_3        
        //   226: astore          7
        //   228: goto            150
        //   231: astore          13
        //   233: goto            150
        //   236: aconst_null    
        //   237: astore          7
        //   239: goto            122
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      15     190    196    Any
        //  22     27     145    150    Ljava/lang/Exception;
        //  22     27     173    175    Any
        //  34     39     145    150    Ljava/lang/Exception;
        //  34     39     173    175    Any
        //  48     60     145    150    Ljava/lang/Exception;
        //  48     60     173    175    Any
        //  67     82     223    231    Ljava/lang/Exception;
        //  67     82     173    175    Any
        //  87     99     223    231    Ljava/lang/Exception;
        //  87     99     173    175    Any
        //  99     103    190    196    Any
        //  107    111    114    119    Ljava/io/IOException;
        //  107    111    190    196    Any
        //  122    126    231    236    Ljava/lang/Exception;
        //  122    126    211    223    Any
        //  126    130    190    196    Any
        //  135    140    196    201    Ljava/io/IOException;
        //  135    140    190    196    Any
        //  150    154    211    223    Any
        //  154    158    190    196    Any
        //  163    168    201    206    Ljava/io/IOException;
        //  163    168    190    196    Any
        //  175    179    190    196    Any
        //  183    187    206    211    Ljava/io/IOException;
        //  183    187    190    196    Any
        //  187    190    190    196    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 122, Size: 122
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    public static boolean a(final Context context, final Uri uri, final File file, final int n, final int n2, final int n3, final boolean b, final float n4, final float n5) {
        if (n3 < 0) {
            return false;
        }
        final Filters filters = new Filters(a());
        Label_0106: {
            if (n3 <= 8) {
                break Label_0106;
            }
            boolean b2 = true;
        Label_0092_Outer:
            while (true) {
                final AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(com.twitter.media.c.filter_resources);
                while (true) {
                    Label_0122: {
                        try {
                            if (!filters.a(context, openRawResourceFd, b2)) {
                                break Label_0122;
                            }
                            final int a = filters.a(uri, n, n2, b);
                            if (a > 0) {
                                final boolean a2 = filters.a(n3, a, file, n4, n5);
                                MediaUtils.a(openRawResourceFd);
                                filters.a(false);
                                return a2;
                            }
                            break Label_0122;
                            b2 = false;
                            continue Label_0092_Outer;
                        }
                        finally {
                            MediaUtils.a(openRawResourceFd);
                        }
                    }
                    final boolean a2 = false;
                    continue;
                }
            }
        }
    }
}
