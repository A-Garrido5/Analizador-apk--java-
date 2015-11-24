// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.provider;

import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.net.Uri;
import android.content.Context;

class DocumentsContractApi19
{
    private static final String TAG = "DocumentFile";
    
    public static boolean canRead(final Context context, final Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty((CharSequence)getRawType(context, uri));
    }
    
    public static boolean canWrite(final Context context, final Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) == 0) {
            final String rawType = getRawType(context, uri);
            final int queryForInt = queryForInt(context, uri, "flags", 0);
            if (!TextUtils.isEmpty((CharSequence)rawType)) {
                if ((queryForInt & 0x4) != 0x0) {
                    return true;
                }
                if ("vnd.android.document/directory".equals(rawType) && (queryForInt & 0x8) != 0x0) {
                    return true;
                }
                if (!TextUtils.isEmpty((CharSequence)rawType) && (queryForInt & 0x2) != 0x0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static void closeQuietly(final AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        try {
            autoCloseable.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {}
    }
    
    public static boolean delete(final Context context, final Uri uri) {
        return DocumentsContract.deleteDocument(context.getContentResolver(), uri);
    }
    
    public static boolean exists(final Context p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore_2       
        //     5: aload_2        
        //     6: aload_1        
        //     7: iconst_1       
        //     8: anewarray       Ljava/lang/String;
        //    11: dup            
        //    12: iconst_0       
        //    13: ldc             "document_id"
        //    15: aastore        
        //    16: aconst_null    
        //    17: aconst_null    
        //    18: aconst_null    
        //    19: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    22: astore          7
        //    24: aload           7
        //    26: astore          4
        //    28: aload           4
        //    30: invokeinterface android/database/Cursor.getCount:()I
        //    35: istore          8
        //    37: iload           8
        //    39: ifle            53
        //    42: iconst_1       
        //    43: istore          9
        //    45: aload           4
        //    47: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //    50: iload           9
        //    52: ireturn        
        //    53: iconst_0       
        //    54: istore          9
        //    56: goto            45
        //    59: astore          5
        //    61: aconst_null    
        //    62: astore          4
        //    64: ldc             "DocumentFile"
        //    66: new             Ljava/lang/StringBuilder;
        //    69: dup            
        //    70: invokespecial   java/lang/StringBuilder.<init>:()V
        //    73: ldc             "Failed query: "
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: aload           5
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    83: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    86: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    89: pop            
        //    90: aload           4
        //    92: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //    95: iconst_0       
        //    96: ireturn        
        //    97: astore_3       
        //    98: aconst_null    
        //    99: astore          4
        //   101: aload           4
        //   103: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //   106: aload_3        
        //   107: athrow         
        //   108: astore_3       
        //   109: goto            101
        //   112: astore          5
        //   114: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      24     59     64     Ljava/lang/Exception;
        //  5      24     97     101    Any
        //  28     37     112    117    Ljava/lang/Exception;
        //  28     37     108    112    Any
        //  64     90     108    112    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    public static String getName(final Context context, final Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }
    
    private static String getRawType(final Context context, final Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }
    
    public static String getType(final Context context, final Uri uri) {
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            rawType = null;
        }
        return rawType;
    }
    
    public static boolean isDirectory(final Context context, final Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }
    
    public static boolean isDocumentUri(final Context context, final Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }
    
    public static boolean isFile(final Context context, final Uri uri) {
        final String rawType = getRawType(context, uri);
        return !"vnd.android.document/directory".equals(rawType) && !TextUtils.isEmpty((CharSequence)rawType);
    }
    
    public static long lastModified(final Context context, final Uri uri) {
        return queryForLong(context, uri, "last_modified", 0L);
    }
    
    public static long length(final Context context, final Uri uri) {
        return queryForLong(context, uri, "_size", 0L);
    }
    
    private static int queryForInt(final Context context, final Uri uri, final String s, final int n) {
        return (int)queryForLong(context, uri, s, n);
    }
    
    private static long queryForLong(final Context p0, final Uri p1, final String p2, final long p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore          5
        //     6: aload           5
        //     8: aload_1        
        //     9: iconst_1       
        //    10: anewarray       Ljava/lang/String;
        //    13: dup            
        //    14: iconst_0       
        //    15: aload_2        
        //    16: aastore        
        //    17: aconst_null    
        //    18: aconst_null    
        //    19: aconst_null    
        //    20: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    23: astore          10
        //    25: aload           10
        //    27: astore          7
        //    29: aload           7
        //    31: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    36: ifeq            68
        //    39: aload           7
        //    41: iconst_0       
        //    42: invokeinterface android/database/Cursor.isNull:(I)Z
        //    47: ifne            68
        //    50: aload           7
        //    52: iconst_0       
        //    53: invokeinterface android/database/Cursor.getLong:(I)J
        //    58: lstore          11
        //    60: aload           7
        //    62: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //    65: lload           11
        //    67: lreturn        
        //    68: aload           7
        //    70: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //    73: lload_3        
        //    74: lreturn        
        //    75: astore          8
        //    77: aconst_null    
        //    78: astore          7
        //    80: ldc             "DocumentFile"
        //    82: new             Ljava/lang/StringBuilder;
        //    85: dup            
        //    86: invokespecial   java/lang/StringBuilder.<init>:()V
        //    89: ldc             "Failed query: "
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: aload           8
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    99: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   102: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   105: pop            
        //   106: aload           7
        //   108: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //   111: lload_3        
        //   112: lreturn        
        //   113: astore          6
        //   115: aconst_null    
        //   116: astore          7
        //   118: aload           7
        //   120: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //   123: aload           6
        //   125: athrow         
        //   126: astore          6
        //   128: goto            118
        //   131: astore          8
        //   133: goto            80
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      25     75     80     Ljava/lang/Exception;
        //  6      25     113    118    Any
        //  29     60     131    136    Ljava/lang/Exception;
        //  29     60     126    131    Any
        //  80     106    126    131    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    
    private static String queryForString(final Context p0, final Uri p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore          4
        //     6: aload           4
        //     8: aload_1        
        //     9: iconst_1       
        //    10: anewarray       Ljava/lang/String;
        //    13: dup            
        //    14: iconst_0       
        //    15: aload_2        
        //    16: aastore        
        //    17: aconst_null    
        //    18: aconst_null    
        //    19: aconst_null    
        //    20: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    23: astore          9
        //    25: aload           9
        //    27: astore          6
        //    29: aload           6
        //    31: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    36: ifeq            68
        //    39: aload           6
        //    41: iconst_0       
        //    42: invokeinterface android/database/Cursor.isNull:(I)Z
        //    47: ifne            68
        //    50: aload           6
        //    52: iconst_0       
        //    53: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    58: astore          10
        //    60: aload           6
        //    62: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //    65: aload           10
        //    67: areturn        
        //    68: aload           6
        //    70: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //    73: aload_3        
        //    74: areturn        
        //    75: astore          7
        //    77: aconst_null    
        //    78: astore          6
        //    80: ldc             "DocumentFile"
        //    82: new             Ljava/lang/StringBuilder;
        //    85: dup            
        //    86: invokespecial   java/lang/StringBuilder.<init>:()V
        //    89: ldc             "Failed query: "
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: aload           7
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    99: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   102: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   105: pop            
        //   106: aload           6
        //   108: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //   111: aload_3        
        //   112: areturn        
        //   113: astore          5
        //   115: aconst_null    
        //   116: astore          6
        //   118: aload           6
        //   120: invokestatic    android/support/v4/provider/DocumentsContractApi19.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //   123: aload           5
        //   125: athrow         
        //   126: astore          5
        //   128: goto            118
        //   131: astore          7
        //   133: goto            80
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      25     75     80     Ljava/lang/Exception;
        //  6      25     113    118    Any
        //  29     60     131    136    Ljava/lang/Exception;
        //  29     60     126    131    Any
        //  80     106    126    131    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
}
