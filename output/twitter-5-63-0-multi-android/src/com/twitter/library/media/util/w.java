// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.library.util.af;
import com.twitter.util.d;
import java.util.Date;
import android.os.Environment;
import java.io.File;
import android.database.Cursor;
import android.net.Uri;
import com.twitter.util.SynchronizedDateFormat;
import android.content.Context;
import java.text.DateFormat;

public class w
{
    private static final DateFormat a;
    private static w b;
    private final Context c;
    private final aa d;
    
    static {
        a = new SynchronizedDateFormat("yyyyMMdd_HHmmss");
    }
    
    private w(final Context c) {
        this.c = c;
        this.d = new aa(c);
    }
    
    private Cursor a(final Uri uri, final String[] array, final String s, final String[] array2) {
        Cursor query;
        if (!"content".equals(uri.getScheme())) {
            query = null;
        }
        else {
            try {
                query = this.c.getContentResolver().query(uri, array, s, array2, (String)null);
                if (query != null) {
                    if (query.moveToFirst() && query.getCount() <= 1) {
                        return query;
                    }
                    query.close();
                }
                return null;
            }
            catch (Exception ex) {
                return null;
            }
        }
        return query;
    }
    
    public static w a(final Context context) {
        synchronized (w.class) {
            if (w.b == null && context != null) {
                w.b = new w(context.getApplicationContext());
            }
            return w.b;
        }
    }
    
    public static File a() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            final File file = new File(new StringBuffer().append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).toString()).append(File.separator).append("Twitter").append(File.separator).append(".VID_").append(w.a.format(new Date())).append(".session").toString());
            if (file.exists() || file.mkdirs()) {
                return file;
            }
        }
        return null;
    }
    
    private File a(final z z, File g, final boolean b) {
        com.twitter.util.d.c();
        final Uri d = this.d(z);
        if (d != null) {
            final String c = af.c(this.c, d);
            if (c != null) {
                if (g == null) {
                    g = z.g;
                }
                final File file = new File(c);
                boolean b2;
                if (b) {
                    b2 = yh.c(g, file);
                }
                else {
                    b2 = yh.b(g, file);
                }
                if (b2) {
                    this.d.a(c, null, z.l);
                    return file;
                }
                this.c.getContentResolver().delete(d, (String)null, (String[])null);
                return null;
            }
        }
        return null;
    }
    
    private Uri d(final z p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/twitter/util/d.c:()V
        //     3: aload_0        
        //     4: getfield        com/twitter/library/media/util/w.d:Lcom/twitter/library/media/util/aa;
        //     7: invokevirtual   com/twitter/library/media/util/aa.b:()Z
        //    10: ifne            19
        //    13: aconst_null    
        //    14: astore          7
        //    16: aload           7
        //    18: areturn        
        //    19: new             Landroid/content/ContentValues;
        //    22: dup            
        //    23: invokespecial   android/content/ContentValues.<init>:()V
        //    26: astore_2       
        //    27: aload_1        
        //    28: getfield        com/twitter/library/media/util/z.j:Ljava/lang/String;
        //    31: astore_3       
        //    32: aload_1        
        //    33: getfield        com/twitter/library/media/util/z.h:Lcom/twitter/library/media/model/MediaType;
        //    36: getstatic       com/twitter/library/media/model/MediaType.d:Lcom/twitter/library/media/model/MediaType;
        //    39: if_acmpne       174
        //    42: getstatic       android/provider/MediaStore$Video$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //    45: astore          4
        //    47: aload_2        
        //    48: ldc             "description"
        //    50: aload_1        
        //    51: getfield        com/twitter/library/media/util/z.k:Ljava/lang/String;
        //    54: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //    57: aload_3        
        //    58: ifnonnull       72
        //    61: aload_0        
        //    62: getfield        com/twitter/library/media/util/w.c:Landroid/content/Context;
        //    65: getstatic       lg.file_video_name:I
        //    68: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    71: astore_3       
        //    72: aload_1        
        //    73: invokevirtual   com/twitter/library/media/util/z.b:()Ljava/lang/String;
        //    76: astore          5
        //    78: new             Ljava/io/File;
        //    81: dup            
        //    82: aload           5
        //    84: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    87: invokestatic    yp.c:(Ljava/io/File;)Z
        //    90: ifeq            101
        //    93: aload_2        
        //    94: ldc             "_data"
        //    96: aload           5
        //    98: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   101: aload_2        
        //   102: ldc             "title"
        //   104: aload_3        
        //   105: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   108: aload_2        
        //   109: ldc             "mime_type"
        //   111: aload_1        
        //   112: getfield        com/twitter/library/media/util/z.h:Lcom/twitter/library/media/model/MediaType;
        //   115: getfield        com/twitter/library/media/model/MediaType.mimeType:Ljava/lang/String;
        //   118: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   121: aload_0        
        //   122: getfield        com/twitter/library/media/util/w.c:Landroid/content/Context;
        //   125: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   128: astore          6
        //   130: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //   133: ldc             "mounted"
        //   135: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   138: ifeq            240
        //   141: aload           6
        //   143: aload           4
        //   145: aload_2        
        //   146: invokevirtual   android/content/ContentResolver.insert:(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
        //   149: astore          15
        //   151: aload           15
        //   153: astore          7
        //   155: aload           7
        //   157: ifnonnull       16
        //   160: aload           6
        //   162: getstatic       android/provider/MediaStore$Images$Media.INTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   165: aload_2        
        //   166: invokevirtual   android/content/ContentResolver.insert:(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
        //   169: astore          11
        //   171: aload           11
        //   173: areturn        
        //   174: getstatic       android/provider/MediaStore$Images$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   177: astore          4
        //   179: aload_2        
        //   180: ldc             "description"
        //   182: aload_1        
        //   183: getfield        com/twitter/library/media/util/z.k:Ljava/lang/String;
        //   186: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   189: aload_3        
        //   190: ifnonnull       72
        //   193: aload_0        
        //   194: getfield        com/twitter/library/media/util/w.c:Landroid/content/Context;
        //   197: getstatic       lg.file_photo_name:I
        //   200: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   203: astore_3       
        //   204: goto            72
        //   207: astore          14
        //   209: aconst_null    
        //   210: astore          7
        //   212: goto            155
        //   215: astore          13
        //   217: goto            209
        //   220: astore          12
        //   222: goto            209
        //   225: astore          10
        //   227: aload           7
        //   229: areturn        
        //   230: astore          9
        //   232: aload           7
        //   234: areturn        
        //   235: astore          8
        //   237: aload           7
        //   239: areturn        
        //   240: aconst_null    
        //   241: astore          7
        //   243: goto            155
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  141    151    207    209    Ljava/lang/UnsupportedOperationException;
        //  141    151    215    220    Landroid/database/sqlite/SQLiteException;
        //  141    151    220    225    Ljava/lang/IllegalStateException;
        //  160    171    235    240    Ljava/lang/UnsupportedOperationException;
        //  160    171    225    230    Landroid/database/sqlite/SQLiteException;
        //  160    171    230    235    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0174:
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
    
    public File a(final z z) {
        final File file = new File(z.b());
        if (file.exists()) {
            return file;
        }
        return null;
    }
    
    public File a(final z z, final File file) {
        return this.a(z, file, true);
    }
    
    public String a(final Uri p0, final String p1, final String p2, final String[] p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: iconst_1       
        //     3: anewarray       Ljava/lang/String;
        //     6: dup            
        //     7: iconst_0       
        //     8: aload_2        
        //     9: aastore        
        //    10: aload_3        
        //    11: aload           4
        //    13: invokespecial   com/twitter/library/media/util/w.a:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //    16: astore          8
        //    18: aload           8
        //    20: astore          6
        //    22: aload           6
        //    24: ifnull          56
        //    27: aload           6
        //    29: invokeinterface android/database/Cursor.getColumnCount:()I
        //    34: iconst_1       
        //    35: if_icmpne       56
        //    38: aload           6
        //    40: iconst_0       
        //    41: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    46: astore          9
        //    48: aload           6
        //    50: invokestatic    yp.a:(Landroid/database/Cursor;)V
        //    53: aload           9
        //    55: areturn        
        //    56: aload           6
        //    58: invokestatic    yp.a:(Landroid/database/Cursor;)V
        //    61: aconst_null    
        //    62: areturn        
        //    63: astore          5
        //    65: aconst_null    
        //    66: astore          6
        //    68: aload           5
        //    70: astore          7
        //    72: aload           6
        //    74: invokestatic    yp.a:(Landroid/database/Cursor;)V
        //    77: aload           7
        //    79: athrow         
        //    80: astore          7
        //    82: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      18     63     72     Any
        //  27     48     80     85     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    
    public File b(final z z) {
        return this.a(z, z.g, false);
    }
    
    public File c(final z z) {
        return this.a(z, null, true);
    }
}
