// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.io.IOException;
import android.graphics.Matrix;
import android.os.ParcelFileDescriptor;
import android.graphics.Bitmap;
import android.content.ContentResolver;
import android.net.Uri;
import android.graphics.BitmapFactory$Options;

public class bq
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = ">xH\u0019";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = 'k';
                        break;
                    }
                    case 1: {
                        c2 = '\f';
                        break;
                    }
                    case 2: {
                        c2 = '!';
                        break;
                    }
                    case 3: {
                        c2 = 'u';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = ",cUU8\u0004a\u0001\u0010/\biQ\u0001>\u0004b\u0001";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static int a(final BitmapFactory$Options bitmapFactory$Options, final int n, final int n2) {
        final int v = MediaGalleryBase.v;
        final int b = b(bitmapFactory$Options, n, n2);
        if (b <= 8) {
            int i = 1;
            while (i < b) {
                i <<= 1;
                if (v != 0) {
                    return 8 * ((b + 7) / 8);
                }
            }
            return i;
        }
        return 8 * ((b + 7) / 8);
    }
    
    public static Bitmap a(final int p0, final int p1, final Uri p2, final ContentResolver p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          4
        //     3: aload_3        
        //     4: aload_2        
        //     5: ldc             "r"
        //     7: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
        //    10: astore          8
        //    12: aload           8
        //    14: astore          7
        //    16: iload_0        
        //    17: iload_1        
        //    18: aload_2        
        //    19: aload_3        
        //    20: aload           7
        //    22: aconst_null    
        //    23: invokestatic    com/whatsapp/gallerypicker/bq.a:(IILandroid/net/Uri;Landroid/content/ContentResolver;Landroid/os/ParcelFileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    26: astore          10
        //    28: aload           7
        //    30: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/os/ParcelFileDescriptor;)V
        //    33: aload           10
        //    35: areturn        
        //    36: astore          6
        //    38: aconst_null    
        //    39: astore          7
        //    41: aload           7
        //    43: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/os/ParcelFileDescriptor;)V
        //    46: aconst_null    
        //    47: areturn        
        //    48: astore          5
        //    50: aload           4
        //    52: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/os/ParcelFileDescriptor;)V
        //    55: aload           5
        //    57: athrow         
        //    58: astore          5
        //    60: aload           7
        //    62: astore          4
        //    64: goto            50
        //    67: astore          9
        //    69: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      12     36     41     Ljava/io/IOException;
        //  3      12     48     50     Any
        //  16     28     67     72     Ljava/io/IOException;
        //  16     28     58     67     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    public static Bitmap a(final int p0, final int p1, final Uri p2, final ContentResolver p3, final ParcelFileDescriptor p4, final BitmapFactory$Options p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload           4
        //     2: ifnonnull       16
        //     5: aload_2        
        //     6: aload_3        
        //     7: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/net/Uri;Landroid/content/ContentResolver;)Landroid/os/ParcelFileDescriptor;
        //    10: astore          16
        //    12: aload           16
        //    14: astore          4
        //    16: aload           4
        //    18: ifnonnull       28
        //    21: aload           4
        //    23: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/os/ParcelFileDescriptor;)V
        //    26: aconst_null    
        //    27: areturn        
        //    28: aload           5
        //    30: ifnonnull       42
        //    33: new             Landroid/graphics/BitmapFactory$Options;
        //    36: dup            
        //    37: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //    40: astore          5
        //    42: aload           4
        //    44: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    47: astore          9
        //    49: aload           5
        //    51: iconst_1       
        //    52: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //    55: invokestatic    com/whatsapp/gallerypicker/a2.a:()Lcom/whatsapp/gallerypicker/a2;
        //    58: aload           9
        //    60: aload           5
        //    62: invokevirtual   com/whatsapp/gallerypicker/a2.a:(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    65: pop            
        //    66: aload           5
        //    68: getfield        android/graphics/BitmapFactory$Options.mCancel:Z
        //    71: ifne            100
        //    74: aload           5
        //    76: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //    79: istore          13
        //    81: iload           13
        //    83: iconst_m1      
        //    84: if_icmpeq       100
        //    87: aload           5
        //    89: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //    92: istore          14
        //    94: iload           14
        //    96: iconst_m1      
        //    97: if_icmpne       142
        //   100: aload           4
        //   102: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/os/ParcelFileDescriptor;)V
        //   105: aconst_null    
        //   106: areturn        
        //   107: astore          10
        //   109: aload           10
        //   111: athrow         
        //   112: astore          11
        //   114: aload           11
        //   116: athrow         
        //   117: astore          7
        //   119: getstatic       com/whatsapp/gallerypicker/bq.z:[Ljava/lang/String;
        //   122: iconst_0       
        //   123: aaload         
        //   124: getstatic       com/whatsapp/gallerypicker/bq.z:[Ljava/lang/String;
        //   127: iconst_1       
        //   128: aaload         
        //   129: aload           7
        //   131: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   134: pop            
        //   135: aload           4
        //   137: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/os/ParcelFileDescriptor;)V
        //   140: aconst_null    
        //   141: areturn        
        //   142: aload           5
        //   144: aload           5
        //   146: iload_0        
        //   147: iload_1        
        //   148: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/graphics/BitmapFactory$Options;II)I
        //   151: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   154: aload           5
        //   156: iconst_0       
        //   157: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   160: aload           5
        //   162: iconst_0       
        //   163: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //   166: aload           5
        //   168: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   171: putfield        android/graphics/BitmapFactory$Options.inPreferredConfig:Landroid/graphics/Bitmap$Config;
        //   174: invokestatic    com/whatsapp/gallerypicker/a2.a:()Lcom/whatsapp/gallerypicker/a2;
        //   177: aload           9
        //   179: aload           5
        //   181: invokevirtual   com/whatsapp/gallerypicker/a2.a:(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   184: astore          15
        //   186: aload           4
        //   188: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/os/ParcelFileDescriptor;)V
        //   191: aload           15
        //   193: areturn        
        //   194: astore          6
        //   196: aload           4
        //   198: invokestatic    com/whatsapp/gallerypicker/bq.a:(Landroid/os/ParcelFileDescriptor;)V
        //   201: aload           6
        //   203: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  5      12     117    142    Ljava/lang/OutOfMemoryError;
        //  5      12     194    204    Any
        //  33     42     117    142    Ljava/lang/OutOfMemoryError;
        //  33     42     194    204    Any
        //  42     49     117    142    Ljava/lang/OutOfMemoryError;
        //  42     49     194    204    Any
        //  49     81     107    112    Ljava/lang/OutOfMemoryError;
        //  49     81     194    204    Any
        //  87     94     112    117    Ljava/lang/OutOfMemoryError;
        //  87     94     194    204    Any
        //  109    112    112    117    Ljava/lang/OutOfMemoryError;
        //  109    112    194    204    Any
        //  114    117    117    142    Ljava/lang/OutOfMemoryError;
        //  114    117    194    204    Any
        //  119    135    194    204    Any
        //  142    186    117    142    Ljava/lang/OutOfMemoryError;
        //  142    186    194    204    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0100:
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
    
    public static Bitmap a(final int n, final int n2, final ParcelFileDescriptor parcelFileDescriptor) {
        return a(n, n2, null, null, parcelFileDescriptor, null);
    }
    
    public static Bitmap a(Bitmap bitmap, final int n) {
        if (n == 0 || bitmap == null) {
            return bitmap;
        }
        final Matrix matrix = new Matrix();
        matrix.setRotate((float)n, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        try {
            final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap != bitmap2) {
                bitmap.recycle();
                bitmap = bitmap2;
            }
            return bitmap;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return bitmap;
        }
    }
    
    private static ParcelFileDescriptor a(final Uri uri, final ContentResolver contentResolver) {
        try {
            return contentResolver.openFileDescriptor(uri, "r");
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static void a(final ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return;
        }
        try {
            parcelFileDescriptor.close();
        }
        catch (Throwable t) {}
    }
    
    private static int b(final BitmapFactory$Options bitmapFactory$Options, final int n, final int n2) {
        final double n3 = bitmapFactory$Options.outWidth;
        final double n4 = bitmapFactory$Options.outHeight;
        int n5;
        if (n2 == -1) {
            n5 = 1;
        }
        else {
            n5 = (int)Math.ceil(Math.sqrt(n3 * n4 / n2));
        }
        int n6;
        if (n == -1) {
            n6 = 128;
        }
        else {
            n6 = (int)Math.min(Math.floor(n3 / n), Math.floor(n4 / n));
        }
        if (n6 >= n5) {
            if (n2 == -1 && n == -1) {
                return 1;
            }
            if (n != -1) {
                return n6;
            }
        }
        return n5;
    }
}
