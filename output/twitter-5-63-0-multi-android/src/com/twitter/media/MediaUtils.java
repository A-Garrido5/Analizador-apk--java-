// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.content.Context;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.Closeable;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.FileDescriptor;
import java.io.File;

public class MediaUtils
{
    static {
        NativeInit.a();
    }
    
    public static int a(final int n, final float n2) {
        return 0xFFFFFFFE & 1 + (int)(n2 * n);
    }
    
    public static int a(final File p0, final File p1, final File p2, final int p3, final int p4, final int p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileInputStream;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //     8: astore          6
        //    10: new             Ljava/io/FileInputStream;
        //    13: dup            
        //    14: aload_1        
        //    15: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    18: astore          7
        //    20: new             Ljava/io/FileOutputStream;
        //    23: dup            
        //    24: aload_2        
        //    25: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    28: astore          8
        //    30: aload           6
        //    32: invokevirtual   java/io/FileInputStream.getFD:()Ljava/io/FileDescriptor;
        //    35: lconst_0       
        //    36: aload           7
        //    38: invokevirtual   java/io/FileInputStream.getFD:()Ljava/io/FileDescriptor;
        //    41: lconst_0       
        //    42: aload           8
        //    44: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //    47: iload_3        
        //    48: iload           4
        //    50: iload           5
        //    52: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/FileDescriptor;JLjava/io/FileDescriptor;JLjava/io/FileDescriptor;III)I
        //    55: istore          15
        //    57: iload           15
        //    59: ifeq            121
        //    62: new             Lcom/twitter/media/VireoNativeException;
        //    65: dup            
        //    66: iload           15
        //    68: invokespecial   com/twitter/media/VireoNativeException.<init>:(I)V
        //    71: athrow         
        //    72: astore          11
        //    74: aload           8
        //    76: astore          12
        //    78: aload           7
        //    80: astore          13
        //    82: aload           6
        //    84: astore          14
        //    86: aload           11
        //    88: athrow         
        //    89: astore          10
        //    91: aload           12
        //    93: astore          8
        //    95: aload           13
        //    97: astore          7
        //    99: aload           14
        //   101: astore          6
        //   103: aload           6
        //   105: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   108: aload           7
        //   110: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   113: aload           8
        //   115: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   118: aload           10
        //   120: athrow         
        //   121: aload           6
        //   123: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   126: aload           7
        //   128: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   131: aload           8
        //   133: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   136: iconst_0       
        //   137: ireturn        
        //   138: astore          9
        //   140: aconst_null    
        //   141: astore          8
        //   143: aconst_null    
        //   144: astore          7
        //   146: aconst_null    
        //   147: astore          6
        //   149: aload           9
        //   151: athrow         
        //   152: astore          10
        //   154: goto            103
        //   157: astore          10
        //   159: aconst_null    
        //   160: astore          8
        //   162: aconst_null    
        //   163: astore          7
        //   165: aconst_null    
        //   166: astore          6
        //   168: goto            103
        //   171: astore          10
        //   173: aconst_null    
        //   174: astore          8
        //   176: aconst_null    
        //   177: astore          7
        //   179: goto            103
        //   182: astore          10
        //   184: aconst_null    
        //   185: astore          8
        //   187: goto            103
        //   190: astore          9
        //   192: aconst_null    
        //   193: astore          8
        //   195: aconst_null    
        //   196: astore          7
        //   198: goto            149
        //   201: astore          9
        //   203: aconst_null    
        //   204: astore          8
        //   206: goto            149
        //   209: astore          9
        //   211: goto            149
        //   214: astore          11
        //   216: aconst_null    
        //   217: astore          12
        //   219: aconst_null    
        //   220: astore          13
        //   222: aconst_null    
        //   223: astore          14
        //   225: goto            86
        //   228: astore          11
        //   230: aload           6
        //   232: astore          14
        //   234: aconst_null    
        //   235: astore          12
        //   237: aconst_null    
        //   238: astore          13
        //   240: goto            86
        //   243: astore          11
        //   245: aload           7
        //   247: astore          13
        //   249: aload           6
        //   251: astore          14
        //   253: aconst_null    
        //   254: astore          12
        //   256: goto            86
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      10     214    228    Ljava/io/FileNotFoundException;
        //  0      10     138    149    Ljava/io/IOException;
        //  0      10     157    171    Any
        //  10     20     228    243    Ljava/io/FileNotFoundException;
        //  10     20     190    201    Ljava/io/IOException;
        //  10     20     171    182    Any
        //  20     30     243    259    Ljava/io/FileNotFoundException;
        //  20     30     201    209    Ljava/io/IOException;
        //  20     30     182    190    Any
        //  30     57     72     86     Ljava/io/FileNotFoundException;
        //  30     57     209    214    Ljava/io/IOException;
        //  30     57     152    157    Any
        //  62     72     72     86     Ljava/io/FileNotFoundException;
        //  62     72     209    214    Ljava/io/IOException;
        //  62     72     152    157    Any
        //  86     89     89     103    Any
        //  149    152    152    157    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 132, Size: 132
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
    
    public static int a(final FileDescriptor fileDescriptor, final long n, final FileDescriptor fileDescriptor2, final long n2, final FileDescriptor fileDescriptor3, final int n3, final int n4, final int n5) {
        if (a()) {
            return nativeMux(fileDescriptor, n, fileDescriptor2, n2, fileDescriptor3, n3, n4, n5);
        }
        throw new VireoNativeException(7);
    }
    
    public static int a(final ArrayList list, final File file, final long n, final long n2) {
        final ArrayList<FileInputStream> list2 = new ArrayList<FileInputStream>();
        Label_0248: {
            try {
                final Iterator<File> iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add(new FileInputStream(iterator.next()));
                }
                break Label_0248;
            }
            catch (FileNotFoundException ex3) {
                try {
                    throw;
                }
                finally {}
                final Iterator<FileInputStream> iterator2 = list2.iterator();
                while (iterator2.hasNext()) {
                    a(iterator2.next());
                }
                break Label_0248;
                // iftrue(Label_0155:, !iterator3.hasNext())
                while (true) {
                    while (true) {
                        final ArrayList<FileDescriptor> list3;
                        final Iterator<FileInputStream> iterator3;
                        list3.add(iterator3.next().getFD());
                        continue;
                    }
                    final ArrayList<FileDescriptor> list3 = new ArrayList<FileDescriptor>();
                    final Iterator<FileInputStream> iterator3 = list2.iterator();
                    continue;
                }
            }
            catch (IOException ex4) {
                throw;
                final FileOutputStream fileOutputStream;
                Label_0155: {
                    fileOutputStream = new FileOutputStream(file);
                }
                Label_0208: {
                    try {
                        final ArrayList<FileDescriptor> list3;
                        final int a = a(list3, new long[list2.size()], fileOutputStream.getFD());
                        if (a != 0) {
                            throw new VireoNativeException(a);
                        }
                        break Label_0208;
                    }
                    catch (FileNotFoundException ex) {
                        final Iterator<FileInputStream> iterator4 = list2.iterator();
                        while (iterator4.hasNext()) {
                            a(iterator4.next());
                        }
                        a(fileOutputStream);
                        return 0;
                        final Closeable closeable;
                        a(closeable);
                        throw;
                    }
                    catch (IOException ex2) {}
                }
            }
        }
    }
    
    public static int a(final ArrayList list, final long[] array, final FileDescriptor fileDescriptor) {
        if (list.size() == array.length && a()) {
            return nativeStitch(list, array, fileDescriptor);
        }
        throw new VireoNativeException(7);
    }
    
    public static ImageInfo a(final Context p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: aload_1        
        //     5: ldc             "r"
        //     7: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //    10: astore          7
        //    12: aload           7
        //    14: astore_3       
        //    15: aload_3        
        //    16: invokevirtual   android/content/res/AssetFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    19: aload_3        
        //    20: invokevirtual   android/content/res/AssetFileDescriptor.getStartOffset:()J
        //    23: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/FileDescriptor;J)Lcom/twitter/media/ImageInfo;
        //    26: astore          10
        //    28: aload_3        
        //    29: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    32: aload           10
        //    34: areturn        
        //    35: astore          6
        //    37: aconst_null    
        //    38: astore_3       
        //    39: aload_3        
        //    40: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    43: aconst_null    
        //    44: areturn        
        //    45: astore          5
        //    47: aconst_null    
        //    48: astore_3       
        //    49: aload_3        
        //    50: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    53: aconst_null    
        //    54: areturn        
        //    55: astore_2       
        //    56: aconst_null    
        //    57: astore_3       
        //    58: aload_2        
        //    59: astore          4
        //    61: aload_3        
        //    62: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    65: aload           4
        //    67: athrow         
        //    68: astore          4
        //    70: goto            61
        //    73: astore          9
        //    75: goto            49
        //    78: astore          8
        //    80: goto            39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      12     35     39     Ljava/io/FileNotFoundException;
        //  0      12     45     49     Ljava/io/IOException;
        //  0      12     55     61     Any
        //  15     28     78     83     Ljava/io/FileNotFoundException;
        //  15     28     73     78     Ljava/io/IOException;
        //  15     28     68     73     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    public static ImageInfo a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileInputStream;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //     8: astore_1       
        //     9: aload_1        
        //    10: invokevirtual   java/io/FileInputStream.getFD:()Ljava/io/FileDescriptor;
        //    13: lconst_0       
        //    14: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/FileDescriptor;J)Lcom/twitter/media/ImageInfo;
        //    17: astore          5
        //    19: aload_1        
        //    20: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    23: aload           5
        //    25: areturn        
        //    26: astore          8
        //    28: aconst_null    
        //    29: astore_1       
        //    30: aload_1        
        //    31: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    34: aconst_null    
        //    35: areturn        
        //    36: astore          7
        //    38: aconst_null    
        //    39: astore_1       
        //    40: aload_1        
        //    41: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    44: aconst_null    
        //    45: areturn        
        //    46: astore          6
        //    48: aconst_null    
        //    49: astore_1       
        //    50: aload           6
        //    52: astore          4
        //    54: aload_1        
        //    55: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    58: aload           4
        //    60: athrow         
        //    61: astore          4
        //    63: goto            54
        //    66: astore_3       
        //    67: goto            40
        //    70: astore_2       
        //    71: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      9      26     30     Ljava/io/FileNotFoundException;
        //  0      9      36     40     Ljava/io/IOException;
        //  0      9      46     54     Any
        //  9      19     70     74     Ljava/io/FileNotFoundException;
        //  9      19     66     70     Ljava/io/IOException;
        //  9      19     61     66     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    public static ImageInfo a(final FileDescriptor fileDescriptor, final long n) {
        if (a()) {
            final ImageInfo imageInfo = new ImageInfo();
            if (nativeIdentify(fileDescriptor, n, imageInfo)) {
                return imageInfo;
            }
        }
        return null;
    }
    
    public static void a(final AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return;
        }
        try {
            assetFileDescriptor.close();
        }
        catch (IOException ex) {}
    }
    
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    public static boolean a() {
        return NativeInit.b();
    }
    
    public static boolean a(final Context p0, final Uri p1, final File p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          5
        //     3: aload_0        
        //     4: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     7: aload_1        
        //     8: ldc             "r"
        //    10: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //    13: astore          11
        //    15: aload           11
        //    17: astore          7
        //    19: new             Ljava/io/FileOutputStream;
        //    22: dup            
        //    23: aload_2        
        //    24: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    27: astore          12
        //    29: aload           7
        //    31: invokevirtual   android/content/res/AssetFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    34: aload           7
        //    36: invokevirtual   android/content/res/AssetFileDescriptor.getStartOffset:()J
        //    39: aload           12
        //    41: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //    44: iload_3        
        //    45: iload           4
        //    47: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/FileDescriptor;JLjava/io/FileDescriptor;II)Z
        //    50: istore          15
        //    52: aload           12
        //    54: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    57: aload           7
        //    59: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    62: iload           15
        //    64: ireturn        
        //    65: astore          9
        //    67: aconst_null    
        //    68: astore          10
        //    70: aload           5
        //    72: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    75: aload           10
        //    77: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    80: iconst_0       
        //    81: ireturn        
        //    82: astore          8
        //    84: aconst_null    
        //    85: astore          7
        //    87: aload           5
        //    89: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    92: aload           7
        //    94: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    97: iconst_0       
        //    98: ireturn        
        //    99: astore          6
        //   101: aconst_null    
        //   102: astore          7
        //   104: aload           5
        //   106: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   109: aload           7
        //   111: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //   114: aload           6
        //   116: athrow         
        //   117: astore          6
        //   119: aconst_null    
        //   120: astore          5
        //   122: goto            104
        //   125: astore          6
        //   127: aload           12
        //   129: astore          5
        //   131: goto            104
        //   134: astore          17
        //   136: aconst_null    
        //   137: astore          5
        //   139: goto            87
        //   142: astore          14
        //   144: aload           12
        //   146: astore          5
        //   148: goto            87
        //   151: astore          16
        //   153: aload           7
        //   155: astore          10
        //   157: aconst_null    
        //   158: astore          5
        //   160: goto            70
        //   163: astore          13
        //   165: aload           12
        //   167: astore          5
        //   169: aload           7
        //   171: astore          10
        //   173: goto            70
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  3      15     65     70     Ljava/io/FileNotFoundException;
        //  3      15     82     87     Ljava/io/IOException;
        //  3      15     99     104    Any
        //  19     29     151    163    Ljava/io/FileNotFoundException;
        //  19     29     134    142    Ljava/io/IOException;
        //  19     29     117    125    Any
        //  29     52     163    176    Ljava/io/FileNotFoundException;
        //  29     52     142    151    Ljava/io/IOException;
        //  29     52     125    134    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 86, Size: 86
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
    
    public static boolean a(final Context p0, final Uri p1, final File p2, final Rect p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          4
        //     3: aload_0        
        //     4: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     7: aload_1        
        //     8: ldc             "r"
        //    10: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //    13: astore          10
        //    15: aload           10
        //    17: astore          6
        //    19: new             Ljava/io/FileOutputStream;
        //    22: dup            
        //    23: aload_2        
        //    24: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    27: astore          9
        //    29: aload           6
        //    31: invokevirtual   android/content/res/AssetFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    34: aload           6
        //    36: invokevirtual   android/content/res/AssetFileDescriptor.getStartOffset:()J
        //    39: aload           9
        //    41: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //    44: aload_3        
        //    45: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/FileDescriptor;JLjava/io/FileDescriptor;Landroid/graphics/Rect;)Z
        //    48: istore          13
        //    50: aload           9
        //    52: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    55: aload           6
        //    57: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    60: iload           13
        //    62: ireturn        
        //    63: astore          8
        //    65: aconst_null    
        //    66: astore          9
        //    68: aload           9
        //    70: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    73: aload           4
        //    75: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    78: iconst_0       
        //    79: ireturn        
        //    80: astore          7
        //    82: aconst_null    
        //    83: astore          6
        //    85: aload           4
        //    87: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    90: aload           6
        //    92: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //    95: iconst_0       
        //    96: ireturn        
        //    97: astore          5
        //    99: aconst_null    
        //   100: astore          6
        //   102: aload           4
        //   104: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   107: aload           6
        //   109: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //   112: aload           5
        //   114: athrow         
        //   115: astore          5
        //   117: aconst_null    
        //   118: astore          4
        //   120: goto            102
        //   123: astore          5
        //   125: aload           9
        //   127: astore          4
        //   129: goto            102
        //   132: astore          15
        //   134: aconst_null    
        //   135: astore          4
        //   137: goto            85
        //   140: astore          12
        //   142: aload           9
        //   144: astore          4
        //   146: goto            85
        //   149: astore          14
        //   151: aload           6
        //   153: astore          4
        //   155: aconst_null    
        //   156: astore          9
        //   158: goto            68
        //   161: astore          11
        //   163: aload           6
        //   165: astore          4
        //   167: goto            68
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  3      15     63     68     Ljava/io/FileNotFoundException;
        //  3      15     80     85     Ljava/io/IOException;
        //  3      15     97     102    Any
        //  19     29     149    161    Ljava/io/FileNotFoundException;
        //  19     29     132    140    Ljava/io/IOException;
        //  19     29     115    123    Any
        //  29     50     161    170    Ljava/io/FileNotFoundException;
        //  29     50     140    149    Ljava/io/IOException;
        //  29     50     123    132    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 83, Size: 83
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
    
    public static boolean a(final FileDescriptor fileDescriptor) {
        if (a()) {
            return nativeCanTrim(fileDescriptor);
        }
        throw new VireoNativeException(7);
    }
    
    public static boolean a(final FileDescriptor fileDescriptor, final long n, final FileDescriptor fileDescriptor2, final int n2, final int n3) {
        return a() && nativeResize(fileDescriptor, n, fileDescriptor2, n2, n3);
    }
    
    public static boolean a(final FileDescriptor fileDescriptor, final long n, final FileDescriptor fileDescriptor2, final Rect rect) {
        return a() && nativeCrop(fileDescriptor, n, fileDescriptor2, rect.left, rect.top, rect.width(), rect.height());
    }
    
    public static boolean a(final byte[] array, final int n, final int n2, final int n3, final byte[] array2, final int n4, final int n5, final int n6) {
        return nativeScaleFrameYUV420(array, n, n2, n3, array2, n4, n5, n6);
    }
    
    public static boolean a(final byte[] array, final byte[] array2, final int n, final int n2, final int n3) {
        switch (n) {
            default: {
                return false;
            }
            case 2141391875: {
                return nativeConvertFrame(array, array2, n2, n3, n);
            }
            case 2141391876: {
                return nativeConvertFrame(array, array2, n2, n3, n);
            }
        }
    }
    
    public static byte[] a(final int n, final int n2, final int n3) {
        switch (n) {
            default: {
                return null;
            }
            case 2141391875: {
                return new byte[(0xFFFFF800 & 2047 + n2 * n3) + n2 * n3 / 2];
            }
            case 2141391876: {
                return new byte[n2 * n3 + n2 * n3 / 2];
            }
            case 21: {
                return new byte[n2 * n3 + n2 * n3 / 2];
            }
        }
    }
    
    public static int[] a(final Context p0, final Uri p1, final File p2, final long p3, final long p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: aload_1        
        //     5: ldc             "r"
        //     7: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //    10: astore          14
        //    12: aload           14
        //    14: astore          12
        //    16: new             Ljava/io/RandomAccessFile;
        //    19: dup            
        //    20: aload_2        
        //    21: ldc             "rw"
        //    23: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    26: astore          11
        //    28: aload           12
        //    30: invokevirtual   android/content/res/AssetFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    33: aload           12
        //    35: invokevirtual   android/content/res/AssetFileDescriptor.getStartOffset:()J
        //    38: aload           11
        //    40: invokevirtual   java/io/RandomAccessFile.getFD:()Ljava/io/FileDescriptor;
        //    43: lload_3        
        //    44: lload           5
        //    46: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/FileDescriptor;JLjava/io/FileDescriptor;JJ)[I
        //    49: astore          15
        //    51: aload           15
        //    53: iconst_0       
        //    54: iaload         
        //    55: iconst_m1      
        //    56: if_icmpne       107
        //    59: new             Lcom/twitter/media/VireoNativeException;
        //    62: dup            
        //    63: aload           15
        //    65: iconst_1       
        //    66: iaload         
        //    67: invokespecial   com/twitter/media/VireoNativeException.<init>:(I)V
        //    70: athrow         
        //    71: astore          7
        //    73: aload           11
        //    75: astore          8
        //    77: aload           12
        //    79: astore          9
        //    81: aload           7
        //    83: athrow         
        //    84: astore          10
        //    86: aload           8
        //    88: astore          11
        //    90: aload           9
        //    92: astore          12
        //    94: aload           11
        //    96: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    99: aload           12
        //   101: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //   104: aload           10
        //   106: athrow         
        //   107: aload           11
        //   109: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   112: aload           12
        //   114: invokestatic    com/twitter/media/MediaUtils.a:(Landroid/content/res/AssetFileDescriptor;)V
        //   117: aload           15
        //   119: areturn        
        //   120: astore          13
        //   122: aconst_null    
        //   123: astore          11
        //   125: aconst_null    
        //   126: astore          12
        //   128: aload           13
        //   130: athrow         
        //   131: astore          10
        //   133: goto            94
        //   136: astore          10
        //   138: aconst_null    
        //   139: astore          11
        //   141: aconst_null    
        //   142: astore          12
        //   144: goto            94
        //   147: astore          10
        //   149: aconst_null    
        //   150: astore          11
        //   152: goto            94
        //   155: astore          13
        //   157: aconst_null    
        //   158: astore          11
        //   160: goto            128
        //   163: astore          13
        //   165: goto            128
        //   168: astore          7
        //   170: aconst_null    
        //   171: astore          8
        //   173: aconst_null    
        //   174: astore          9
        //   176: goto            81
        //   179: astore          7
        //   181: aload           12
        //   183: astore          9
        //   185: aconst_null    
        //   186: astore          8
        //   188: goto            81
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      12     168    179    Ljava/io/FileNotFoundException;
        //  0      12     120    128    Ljava/io/IOException;
        //  0      12     136    147    Any
        //  16     28     179    191    Ljava/io/FileNotFoundException;
        //  16     28     155    163    Ljava/io/IOException;
        //  16     28     147    155    Any
        //  28     71     71     81     Ljava/io/FileNotFoundException;
        //  28     71     163    168    Ljava/io/IOException;
        //  28     71     131    136    Any
        //  81     84     84     94     Any
        //  128    131    131    136    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0081:
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
    
    public static int[] a(final File p0, final File p1, final long p2, final long p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileInputStream;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //     8: astore          6
        //    10: new             Ljava/io/RandomAccessFile;
        //    13: dup            
        //    14: aload_1        
        //    15: ldc             "rw"
        //    17: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    20: astore          7
        //    22: aload           6
        //    24: invokevirtual   java/io/FileInputStream.getFD:()Ljava/io/FileDescriptor;
        //    27: lconst_0       
        //    28: aload           7
        //    30: invokevirtual   java/io/RandomAccessFile.getFD:()Ljava/io/FileDescriptor;
        //    33: lload_2        
        //    34: lload           4
        //    36: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/FileDescriptor;JLjava/io/FileDescriptor;JJ)[I
        //    39: astore          13
        //    41: aload           13
        //    43: iconst_0       
        //    44: iaload         
        //    45: iconst_m1      
        //    46: if_icmpne       97
        //    49: new             Lcom/twitter/media/VireoNativeException;
        //    52: dup            
        //    53: aload           13
        //    55: iconst_1       
        //    56: iaload         
        //    57: invokespecial   com/twitter/media/VireoNativeException.<init>:(I)V
        //    60: athrow         
        //    61: astore          10
        //    63: aload           7
        //    65: astore          11
        //    67: aload           6
        //    69: astore          12
        //    71: aload           10
        //    73: athrow         
        //    74: astore          9
        //    76: aload           11
        //    78: astore          7
        //    80: aload           12
        //    82: astore          6
        //    84: aload           6
        //    86: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    89: aload           7
        //    91: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    94: aload           9
        //    96: athrow         
        //    97: aload           6
        //    99: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   102: aload           7
        //   104: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   107: aload           13
        //   109: areturn        
        //   110: astore          8
        //   112: aconst_null    
        //   113: astore          7
        //   115: aconst_null    
        //   116: astore          6
        //   118: aload           8
        //   120: athrow         
        //   121: astore          9
        //   123: goto            84
        //   126: astore          9
        //   128: aconst_null    
        //   129: astore          7
        //   131: aconst_null    
        //   132: astore          6
        //   134: goto            84
        //   137: astore          9
        //   139: aconst_null    
        //   140: astore          7
        //   142: goto            84
        //   145: astore          8
        //   147: aconst_null    
        //   148: astore          7
        //   150: goto            118
        //   153: astore          8
        //   155: goto            118
        //   158: astore          10
        //   160: aconst_null    
        //   161: astore          11
        //   163: aconst_null    
        //   164: astore          12
        //   166: goto            71
        //   169: astore          10
        //   171: aload           6
        //   173: astore          12
        //   175: aconst_null    
        //   176: astore          11
        //   178: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      10     158    169    Ljava/io/FileNotFoundException;
        //  0      10     110    118    Ljava/io/IOException;
        //  0      10     126    137    Any
        //  10     22     169    181    Ljava/io/FileNotFoundException;
        //  10     22     145    153    Ljava/io/IOException;
        //  10     22     137    145    Any
        //  22     61     61     71     Ljava/io/FileNotFoundException;
        //  22     61     153    158    Ljava/io/IOException;
        //  22     61     121    126    Any
        //  71     74     74     84     Any
        //  118    121    121    126    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
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
    
    public static int[] a(final FileDescriptor fileDescriptor, final long n, final FileDescriptor fileDescriptor2, final long n2, final long n3) {
        if (a()) {
            return nativeTrim(fileDescriptor, n, fileDescriptor2, n2, n3);
        }
        throw new VireoNativeException(7);
    }
    
    public static boolean b(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileInputStream;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //     8: astore_1       
        //     9: aload_1        
        //    10: invokevirtual   java/io/FileInputStream.getFD:()Ljava/io/FileDescriptor;
        //    13: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/FileDescriptor;)Z
        //    16: istore          6
        //    18: aload_1        
        //    19: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    22: iload           6
        //    24: ireturn        
        //    25: astore_2       
        //    26: aconst_null    
        //    27: astore_1       
        //    28: aload_2        
        //    29: athrow         
        //    30: astore_3       
        //    31: aload_1        
        //    32: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //    35: aload_3        
        //    36: athrow         
        //    37: astore          4
        //    39: aconst_null    
        //    40: astore_1       
        //    41: aload           4
        //    43: athrow         
        //    44: aload           5
        //    46: athrow         
        //    47: astore_3       
        //    48: aconst_null    
        //    49: astore_1       
        //    50: goto            31
        //    53: astore          5
        //    55: goto            44
        //    58: astore          4
        //    60: goto            41
        //    63: astore_2       
        //    64: goto            28
        //    67: astore          5
        //    69: aconst_null    
        //    70: astore_1       
        //    71: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  0      9      25     28     Lcom/twitter/media/VireoNativeException;
        //  0      9      37     41     Ljava/io/FileNotFoundException;
        //  0      9      67     74     Ljava/io/IOException;
        //  0      9      47     53     Any
        //  9      18     63     67     Lcom/twitter/media/VireoNativeException;
        //  9      18     58     63     Ljava/io/FileNotFoundException;
        //  9      18     53     58     Ljava/io/IOException;
        //  9      18     30     31     Any
        //  28     30     30     31     Any
        //  41     44     30     31     Any
        //  44     47     30     31     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
    
    private static native boolean nativeCanTrim(final FileDescriptor p0);
    
    private static native boolean nativeConvertFrame(final byte[] p0, final byte[] p1, final int p2, final int p3, final int p4);
    
    private static native boolean nativeCrop(final FileDescriptor p0, final long p1, final FileDescriptor p2, final int p3, final int p4, final int p5, final int p6);
    
    private static native boolean nativeIdentify(final FileDescriptor p0, final long p1, final ImageInfo p2);
    
    private static native Bitmap nativeLoad(final FileDescriptor p0, final long p1, final int p2, final int p3, final boolean p4, final boolean p5, final boolean p6, final Bitmap$Config p7);
    
    private static native int nativeMux(final FileDescriptor p0, final long p1, final FileDescriptor p2, final long p3, final FileDescriptor p4, final int p5, final int p6, final int p7);
    
    private static native boolean nativeRGBAtoYUV420(final byte[] p0, final byte[] p1, final int p2, final int p3);
    
    private static native boolean nativeResize(final FileDescriptor p0, final long p1, final FileDescriptor p2, final int p3, final int p4);
    
    private static native boolean nativeScaleFrameYUV420(final byte[] p0, final int p1, final int p2, final int p3, final byte[] p4, final int p5, final int p6, final int p7);
    
    private static native int nativeStitch(final ArrayList p0, final long[] p1, final FileDescriptor p2);
    
    private static native int[] nativeTrim(final FileDescriptor p0, final long p1, final FileDescriptor p2, final long p3, final long p4);
}
