// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.os.AsyncTask;
import java.util.concurrent.Callable;
import com.twitter.util.concurrent.b;
import java.util.List;
import com.twitter.library.provider.Tweet;
import android.net.Uri;
import com.twitter.util.concurrent.i;
import android.content.Context;

public class ab
{
    private final Context a;
    private i b;
    
    public ab(final Context a) {
        this.a = a;
    }
    
    static String[] c(final Uri uri) {
        final List pathSegments = uri.getPathSegments();
        if (pathSegments != null && pathSegments.size() > 0 && "status_groups_retweets_view".equals(pathSegments.get(0))) {
            return Tweet.b;
        }
        return Tweet.a;
    }
    
    public i a(final Uri uri) {
        if (this.b != null) {
            this.b.cancel(true);
        }
        return this.b = new b().a(new ac(this, uri)).a(AsyncTask.THREAD_POOL_EXECUTOR).a();
    }
    
    Tweet b(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/twitter/library/av/ab.a:Landroid/content/Context;
        //     4: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     7: aload_1        
        //     8: aload_1        
        //     9: invokestatic    com/twitter/library/av/ab.c:(Landroid/net/Uri;)[Ljava/lang/String;
        //    12: aconst_null    
        //    13: aconst_null    
        //    14: aconst_null    
        //    15: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    18: astore          4
        //    20: aload           4
        //    22: astore_3       
        //    23: aload_3        
        //    24: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    29: pop            
        //    30: new             Lcom/twitter/library/provider/ad;
        //    33: dup            
        //    34: aload_3        
        //    35: invokespecial   com/twitter/library/provider/ad.<init>:(Landroid/database/Cursor;)V
        //    38: invokevirtual   com/twitter/library/provider/ad.a:()Lcom/twitter/library/provider/Tweet;
        //    41: astore          6
        //    43: aload_3        
        //    44: ifnull          53
        //    47: aload_3        
        //    48: invokeinterface android/database/Cursor.close:()V
        //    53: aload           6
        //    55: areturn        
        //    56: astore_2       
        //    57: aconst_null    
        //    58: astore_3       
        //    59: aload_3        
        //    60: ifnull          69
        //    63: aload_3        
        //    64: invokeinterface android/database/Cursor.close:()V
        //    69: aload_2        
        //    70: athrow         
        //    71: astore_2       
        //    72: goto            59
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      20     56     59     Any
        //  23     43     71     75     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
