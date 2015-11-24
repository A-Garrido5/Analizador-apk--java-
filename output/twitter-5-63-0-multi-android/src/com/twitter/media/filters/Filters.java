// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import java.io.File;
import com.twitter.media.MediaUtils;
import android.net.Uri;
import android.graphics.Bitmap;
import java.io.FileDescriptor;
import android.content.res.AssetFileDescriptor;
import android.content.Context;
import java.util.Iterator;
import com.twitter.media.NativeInit;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.ContentResolver;
import java.util.Map;

public class Filters
{
    private static final Map a;
    private static final Map b;
    private int c;
    private a d;
    private ContentResolver e;
    private ArrayList f;
    
    static {
        a = new HashMap();
        b = new HashMap();
        NativeInit.a();
        Filters.a.put(0, "none");
        Filters.a.put(1, "vignette");
        Filters.a.put(2, "warm");
        Filters.a.put(3, "cool");
        Filters.a.put(4, "1963");
        Filters.a.put(5, "1972");
        Filters.a.put(6, "goldenhour");
        Filters.a.put(7, "antique");
        Filters.a.put(8, "bw");
        Filters.a.put(9, "exposure");
        Filters.a.put(10, "positive");
        Filters.a.put(11, "warm");
        Filters.a.put(12, "cool");
        Filters.a.put(13, "balance");
        Filters.a.put(14, "retro");
        Filters.a.put(15, "x-pro");
        Filters.a.put(16, "raven");
        for (final Integer n : Filters.a.keySet()) {
            Filters.b.put(Filters.a.get(n), n);
        }
    }
    
    public Filters() {
        this.c = 0;
        this.f = new ArrayList();
    }
    
    public Filters(final a d) {
        this.c = 0;
        this.f = new ArrayList();
        this.d = d;
    }
    
    private static native boolean nativeBlur(final Context p0, final AssetFileDescriptor p1, final String p2, final FileDescriptor p3, final FileDescriptor p4, final int p5, final int p6, final boolean p7, final float p8);
    
    private static native int nativeCreateBitmapImageSource(final int p0, final Bitmap p1, final boolean p2);
    
    private static native int nativeCreateDynamicImageSource(final int p0, final int p1, final int p2);
    
    private static native int nativeCreateStaticImageSource(final int p0, final AssetFileDescriptor p1, final int p2, final int p3, final boolean p4, final int p5, final int p6, final int p7, final int p8);
    
    private static native void nativeDispose(final int p0);
    
    private static native void nativeDisposeImageSource(final int p0, final int p1);
    
    private static native boolean nativeFilter(final int p0, final String p1, final int p2, final Bitmap p3, final float p4, final float p5);
    
    private static native boolean nativeFilterToFile(final int p0, final String p1, final int p2, final FileDescriptor p3, final float p4, final float p5);
    
    private static native String nativeGetFilterIdentifier(final int p0, final int p1);
    
    private static native String[] nativeGetFilterIdentifiers(final int p0);
    
    private static native String nativeGetFilterName(final int p0, final String p1);
    
    private static native int nativeGetImageSourceTexId(final int p0, final int p1);
    
    private static native int nativeInit(final Context p0, final AssetFileDescriptor p1, final String p2, final boolean p3);
    
    private static native boolean nativeRenderFilterPreview(final int p0, final String p1, final int p2, final float p3, final float p4, final String p5, final float p6);
    
    public int a(final Bitmap p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/twitter/media/filters/Filters.c:I
        //     6: istore          4
        //     8: iconst_0       
        //     9: istore          5
        //    11: iload           4
        //    13: ifle            88
        //    16: aload_0        
        //    17: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    20: astore          6
        //    22: iconst_0       
        //    23: istore          5
        //    25: aload           6
        //    27: ifnull          88
        //    30: aload_0        
        //    31: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    34: invokevirtual   com/twitter/media/filters/a.c:()Z
        //    37: istore          7
        //    39: iconst_0       
        //    40: istore          5
        //    42: iload           7
        //    44: ifeq            88
        //    47: aload_0        
        //    48: getfield        com/twitter/media/filters/Filters.c:I
        //    51: aload_1        
        //    52: iload_2        
        //    53: invokestatic    com/twitter/media/filters/Filters.nativeCreateBitmapImageSource:(ILandroid/graphics/Bitmap;Z)I
        //    56: istore          11
        //    58: iload           11
        //    60: istore          5
        //    62: iload           5
        //    64: ifeq            80
        //    67: aload_0        
        //    68: getfield        com/twitter/media/filters/Filters.f:Ljava/util/ArrayList;
        //    71: iload           5
        //    73: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    76: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    79: pop            
        //    80: aload_0        
        //    81: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    84: invokevirtual   com/twitter/media/filters/a.d:()Z
        //    87: pop            
        //    88: aload_0        
        //    89: monitorexit    
        //    90: iload           5
        //    92: ireturn        
        //    93: astore_3       
        //    94: aload_0        
        //    95: monitorexit    
        //    96: aload_3        
        //    97: athrow         
        //    98: astore          8
        //   100: iconst_0       
        //   101: istore          5
        //   103: goto            62
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      8      93     98     Any
        //  16     22     93     98     Any
        //  30     39     93     98     Any
        //  47     58     98     106    Ljava/lang/Exception;
        //  47     58     93     98     Any
        //  67     80     93     98     Any
        //  80     88     93     98     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0062:
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
    
    public int a(final Uri uri, final int n, final int n2, final boolean b) {
        return this.a(uri, n, n2, b, 0, 0, 0, 0);
    }
    
    public int a(final Uri uri, final int n, final int n2, final boolean b, final int n3, final int n4, final int n5, final int n6) {
        while (true) {
            synchronized (this) {
                if (this.c > 0 && this.d != null && this.d.c()) {
                    AssetFileDescriptor openAssetFileDescriptor = null;
                    try {
                        openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
                        final int nativeCreateStaticImageSource = nativeCreateStaticImageSource(this.c, openAssetFileDescriptor, n, n2, b, n3, n4, n5, n6);
                        MediaUtils.a(openAssetFileDescriptor);
                        if (nativeCreateStaticImageSource != 0) {
                            this.f.add(nativeCreateStaticImageSource);
                        }
                        this.d.d();
                        return nativeCreateStaticImageSource;
                    }
                    catch (Exception ex) {
                        MediaUtils.a(openAssetFileDescriptor);
                        final int nativeCreateStaticImageSource = 0;
                    }
                    finally {
                        MediaUtils.a(openAssetFileDescriptor);
                    }
                }
            }
            return 0;
        }
    }
    
    public void a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/twitter/media/filters/Filters.c:I
        //     6: ifle            44
        //     9: aload_0        
        //    10: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    13: ifnull          44
        //    16: aload_0        
        //    17: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    20: invokevirtual   com/twitter/media/filters/a.c:()Z
        //    23: istore_3       
        //    24: iload_3        
        //    25: ifeq            44
        //    28: aload_0        
        //    29: getfield        com/twitter/media/filters/Filters.c:I
        //    32: iload_1        
        //    33: invokestatic    com/twitter/media/filters/Filters.nativeDisposeImageSource:(II)V
        //    36: aload_0        
        //    37: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    40: invokevirtual   com/twitter/media/filters/a.d:()Z
        //    43: pop            
        //    44: aload_0        
        //    45: monitorexit    
        //    46: return         
        //    47: astore_2       
        //    48: aload_0        
        //    49: monitorexit    
        //    50: aload_2        
        //    51: athrow         
        //    52: astore          4
        //    54: goto            36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      24     47     52     Any
        //  28     36     52     57     Ljava/lang/Exception;
        //  28     36     47     52     Any
        //  36     44     47     52     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
    
    public void a(final boolean b) {
        Label_0064: {
            synchronized (this) {
                if (this.c <= 0) {
                    break Label_0064;
                }
                final Iterator<Integer> iterator = this.f.iterator();
                while (iterator.hasNext()) {
                    this.a(iterator.next());
                }
            }
            this.f.clear();
            nativeDispose(this.c);
        }
        if (b && this.d != null) {
            this.d.e();
            this.d = null;
        }
    }
    // monitorexit(this)
    
    public boolean a(final int n, final int n2, final float n3, final float n4, final int n5, final float n6) {
        while (true) {
            synchronized (this) {
                if (this.c > 0) {
                    try {
                        return nativeRenderFilterPreview(this.c, Filters.a.get(n), n2, n3, n4, Filters.a.get(n5), n6);
                    }
                    catch (Exception ex) {
                        final boolean nativeRenderFilterPreview = false;
                    }
                }
            }
            return false;
        }
    }
    
    public boolean a(final int n, final int n2, final Bitmap bitmap) {
        return this.a(n, n2, bitmap, 1.0f, 1.0f);
    }
    
    public boolean a(final int n, final int n2, final Bitmap bitmap, final float n3, final float n4) {
        while (true) {
            synchronized (this) {
                if (this.c > 0 && this.d != null && this.d.c()) {
                    try {
                        final boolean nativeFilter = nativeFilter(this.c, Filters.a.get(n), n2, bitmap, n3, n4);
                        this.d.d();
                        return nativeFilter;
                    }
                    catch (Exception ex) {
                        final boolean nativeFilter = false;
                    }
                }
            }
            return false;
        }
    }
    
    public boolean a(final int p0, final int p1, final File p2, final float p3, final float p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aconst_null    
        //     3: astore          6
        //     5: new             Ljava/io/FileOutputStream;
        //     8: dup            
        //     9: aload_3        
        //    10: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    13: astore          7
        //    15: aload           7
        //    17: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //    20: astore          11
        //    22: aload_0        
        //    23: getfield        com/twitter/media/filters/Filters.c:I
        //    26: istore          12
        //    28: iconst_0       
        //    29: istore          13
        //    31: iload           12
        //    33: ifle            110
        //    36: aload_0        
        //    37: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    40: astore          14
        //    42: iconst_0       
        //    43: istore          13
        //    45: aload           14
        //    47: ifnull          110
        //    50: aload_0        
        //    51: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    54: invokevirtual   com/twitter/media/filters/a.c:()Z
        //    57: istore          15
        //    59: iconst_0       
        //    60: istore          13
        //    62: iload           15
        //    64: ifeq            110
        //    67: aload_0        
        //    68: getfield        com/twitter/media/filters/Filters.c:I
        //    71: getstatic       com/twitter/media/filters/Filters.a:Ljava/util/Map;
        //    74: iload_1        
        //    75: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    78: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    83: checkcast       Ljava/lang/String;
        //    86: iload_2        
        //    87: aload           11
        //    89: fload           4
        //    91: fload           5
        //    93: invokestatic    com/twitter/media/filters/Filters.nativeFilterToFile:(ILjava/lang/String;ILjava/io/FileDescriptor;FF)Z
        //    96: istore          18
        //    98: iload           18
        //   100: istore          13
        //   102: aload_0        
        //   103: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   106: invokevirtual   com/twitter/media/filters/a.d:()Z
        //   109: pop            
        //   110: iload           13
        //   112: istore          10
        //   114: aload           7
        //   116: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   119: aload_0        
        //   120: monitorexit    
        //   121: iload           10
        //   123: ireturn        
        //   124: astore          19
        //   126: aload           6
        //   128: invokestatic    com/twitter/media/MediaUtils.a:(Ljava/io/Closeable;)V
        //   131: iconst_0       
        //   132: istore          10
        //   134: goto            119
        //   137: astore          9
        //   139: aload_0        
        //   140: monitorexit    
        //   141: aload           9
        //   143: athrow         
        //   144: astore          16
        //   146: iconst_0       
        //   147: istore          13
        //   149: goto            102
        //   152: astore          8
        //   154: aload           7
        //   156: astore          6
        //   158: goto            126
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      15     124    126    Ljava/io/IOException;
        //  5      15     137    144    Any
        //  15     22     152    161    Ljava/io/IOException;
        //  15     22     137    144    Any
        //  22     28     137    144    Any
        //  36     42     137    144    Any
        //  50     59     137    144    Any
        //  67     98     144    152    Ljava/lang/Exception;
        //  67     98     137    144    Any
        //  102    110    137    144    Any
        //  114    119    137    144    Any
        //  126    131    137    144    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0102:
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
    
    public boolean a(final Context p0, final AssetFileDescriptor p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore          4
        //     3: iconst_0       
        //     4: istore          5
        //     6: aload_0        
        //     7: monitorenter   
        //     8: aload_0        
        //     9: aload_1        
        //    10: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    13: putfield        com/twitter/media/filters/Filters.e:Landroid/content/ContentResolver;
        //    16: aload_0        
        //    17: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    20: ifnonnull       295
        //    23: aload_0        
        //    24: new             Lcom/twitter/media/filters/a;
        //    27: dup            
        //    28: invokespecial   com/twitter/media/filters/a.<init>:()V
        //    31: putfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    34: aload_0        
        //    35: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    38: invokevirtual   com/twitter/media/filters/a.a:()Z
        //    41: ifne            54
        //    44: aload_0        
        //    45: aconst_null    
        //    46: putfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    49: aload_0        
        //    50: monitorexit    
        //    51: iload           5
        //    53: ireturn        
        //    54: iload           4
        //    56: istore          8
        //    58: aload_0        
        //    59: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //    62: invokevirtual   com/twitter/media/filters/a.c:()Z
        //    65: istore          14
        //    67: iload           14
        //    69: ifeq            286
        //    72: aload_0        
        //    73: aload_1        
        //    74: aload_2        
        //    75: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //    78: iload_3        
        //    79: invokestatic    com/twitter/media/filters/Filters.nativeInit:(Landroid/content/Context;Landroid/content/res/AssetFileDescriptor;Ljava/lang/String;Z)I
        //    82: putfield        com/twitter/media/filters/Filters.c:I
        //    85: aload_0        
        //    86: getfield        com/twitter/media/filters/Filters.c:I
        //    89: istore          18
        //    91: iload           18
        //    93: ifle            135
        //    96: iload           4
        //    98: istore          15
        //   100: iload           8
        //   102: ifeq            141
        //   105: iload           15
        //   107: ifne            141
        //   110: aload_0        
        //   111: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   114: invokevirtual   com/twitter/media/filters/a.e:()V
        //   117: aload_0        
        //   118: aconst_null    
        //   119: putfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   122: iconst_0       
        //   123: istore          5
        //   125: goto            49
        //   128: astore          6
        //   130: aload_0        
        //   131: monitorexit    
        //   132: aload           6
        //   134: athrow         
        //   135: iconst_0       
        //   136: istore          15
        //   138: goto            100
        //   141: iload           4
        //   143: ifeq            279
        //   146: aload_0        
        //   147: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   150: invokevirtual   com/twitter/media/filters/a.d:()Z
        //   153: pop            
        //   154: iload           15
        //   156: istore          5
        //   158: goto            49
        //   161: iload           11
        //   163: ifeq            184
        //   166: aload_0        
        //   167: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   170: invokevirtual   com/twitter/media/filters/a.e:()V
        //   173: aload_0        
        //   174: aconst_null    
        //   175: putfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   178: iconst_0       
        //   179: istore          5
        //   181: goto            49
        //   184: iconst_0       
        //   185: istore          5
        //   187: iload           4
        //   189: ifeq            49
        //   192: aload_0        
        //   193: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   196: invokevirtual   com/twitter/media/filters/a.d:()Z
        //   199: pop            
        //   200: iconst_0       
        //   201: istore          5
        //   203: goto            49
        //   206: iload           8
        //   208: ifeq            229
        //   211: aload_0        
        //   212: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   215: invokevirtual   com/twitter/media/filters/a.e:()V
        //   218: aload_0        
        //   219: aconst_null    
        //   220: putfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   223: iconst_0       
        //   224: istore          5
        //   226: goto            49
        //   229: iload           4
        //   231: ifeq            242
        //   234: aload_0        
        //   235: getfield        com/twitter/media/filters/Filters.d:Lcom/twitter/media/filters/a;
        //   238: invokevirtual   com/twitter/media/filters/a.d:()Z
        //   241: pop            
        //   242: aload           7
        //   244: athrow         
        //   245: astore          7
        //   247: iconst_0       
        //   248: istore          4
        //   250: goto            206
        //   253: astore          7
        //   255: goto            206
        //   258: astore          13
        //   260: iload           8
        //   262: istore          11
        //   264: iconst_0       
        //   265: istore          4
        //   267: goto            161
        //   270: astore          17
        //   272: iload           8
        //   274: istore          11
        //   276: goto            161
        //   279: iload           15
        //   281: istore          5
        //   283: goto            49
        //   286: iconst_0       
        //   287: istore          15
        //   289: iconst_0       
        //   290: istore          4
        //   292: goto            100
        //   295: iconst_0       
        //   296: istore          8
        //   298: goto            58
        //   301: astore          10
        //   303: iconst_0       
        //   304: istore          11
        //   306: iconst_0       
        //   307: istore          4
        //   309: goto            161
        //   312: astore          7
        //   314: iconst_0       
        //   315: istore          4
        //   317: iconst_0       
        //   318: istore          8
        //   320: goto            206
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      16     128    135    Any
        //  16     49     301    312    Ljava/lang/Exception;
        //  16     49     312    323    Any
        //  58     67     258    270    Ljava/lang/Exception;
        //  58     67     245    253    Any
        //  72     91     270    279    Ljava/lang/Exception;
        //  72     91     253    258    Any
        //  110    122    128    135    Any
        //  146    154    128    135    Any
        //  166    178    128    135    Any
        //  192    200    128    135    Any
        //  211    223    128    135    Any
        //  234    242    128    135    Any
        //  242    245    128    135    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    public int[] a() {
        synchronized (this) {
            final String[] nativeGetFilterIdentifiers = nativeGetFilterIdentifiers(this.c);
            int[] array;
            if (nativeGetFilterIdentifiers == null || nativeGetFilterIdentifiers.length == 0) {
                array = null;
            }
            else {
                final int[] array2 = new int[nativeGetFilterIdentifiers.length];
                for (int i = 0; i < nativeGetFilterIdentifiers.length; ++i) {
                    array2[i] = (int)Filters.b.get(nativeGetFilterIdentifiers[i]);
                }
                array = array2;
            }
            return array;
        }
    }
    
    public String b(final int n) {
        synchronized (this) {
            return Filters.a.get(n);
        }
    }
    
    public void b() {
        synchronized (this) {
            this.a(true);
        }
    }
    
    public a c() {
        return this.d;
    }
    
    @Override
    protected void finalize() {
        this.a(false);
        super.finalize();
    }
}
