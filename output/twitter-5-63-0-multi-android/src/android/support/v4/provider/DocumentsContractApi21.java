// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.provider;

import android.provider.DocumentsContract;
import android.net.Uri;
import android.content.Context;

class DocumentsContractApi21
{
    private static final String TAG = "DocumentFile";
    
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
    
    public static Uri createDirectory(final Context context, final Uri uri, final String s) {
        return createFile(context, uri, "vnd.android.document/directory", s);
    }
    
    public static Uri createFile(final Context context, final Uri uri, final String s, final String s2) {
        return DocumentsContract.createDocument(context.getContentResolver(), uri, s, s2);
    }
    
    public static Uri[] listFiles(final Context p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore_2       
        //     5: aload_1        
        //     6: aload_1        
        //     7: invokestatic    android/provider/DocumentsContract.getDocumentId:(Landroid/net/Uri;)Ljava/lang/String;
        //    10: invokestatic    android/provider/DocumentsContract.buildChildDocumentsUriUsingTree:(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
        //    13: astore_3       
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: invokespecial   java/util/ArrayList.<init>:()V
        //    21: astore          4
        //    23: aload_2        
        //    24: aload_3        
        //    25: iconst_1       
        //    26: anewarray       Ljava/lang/String;
        //    29: dup            
        //    30: iconst_0       
        //    31: ldc             "document_id"
        //    33: aastore        
        //    34: aconst_null    
        //    35: aconst_null    
        //    36: aconst_null    
        //    37: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    40: astore          9
        //    42: aload           9
        //    44: astore          6
        //    46: aload           6
        //    48: invokeinterface android/database/Cursor.moveToNext:()Z
        //    53: ifeq            127
        //    56: aload           4
        //    58: aload_1        
        //    59: aload           6
        //    61: iconst_0       
        //    62: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    67: invokestatic    android/provider/DocumentsContract.buildDocumentUriUsingTree:(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
        //    70: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    73: pop            
        //    74: goto            46
        //    77: astore          5
        //    79: ldc             "DocumentFile"
        //    81: new             Ljava/lang/StringBuilder;
        //    84: dup            
        //    85: invokespecial   java/lang/StringBuilder.<init>:()V
        //    88: ldc             "Failed query: "
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: aload           5
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    98: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   101: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   104: pop            
        //   105: aload           6
        //   107: invokestatic    android/support/v4/provider/DocumentsContractApi21.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //   110: aload           4
        //   112: aload           4
        //   114: invokevirtual   java/util/ArrayList.size:()I
        //   117: anewarray       Landroid/net/Uri;
        //   120: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   123: checkcast       [Landroid/net/Uri;
        //   126: areturn        
        //   127: aload           6
        //   129: invokestatic    android/support/v4/provider/DocumentsContractApi21.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //   132: goto            110
        //   135: astore          7
        //   137: aconst_null    
        //   138: astore          6
        //   140: aload           6
        //   142: invokestatic    android/support/v4/provider/DocumentsContractApi21.closeQuietly:(Ljava/lang/AutoCloseable;)V
        //   145: aload           7
        //   147: athrow         
        //   148: astore          7
        //   150: goto            140
        //   153: astore          5
        //   155: aconst_null    
        //   156: astore          6
        //   158: goto            79
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     42     153    161    Ljava/lang/Exception;
        //  23     42     135    140    Any
        //  46     74     77     79     Ljava/lang/Exception;
        //  46     74     148    153    Any
        //  79     105    148    153    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    public static Uri prepareTreeUri(final Uri uri) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
    }
    
    public static Uri renameTo(final Context context, final Uri uri, final String s) {
        return DocumentsContract.renameDocument(context.getContentResolver(), uri, s);
    }
}
