// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.util.d;
import android.media.MediaScannerConnection$MediaScannerConnectionClient;
import android.os.Looper;
import android.support.v4.util.SimpleArrayMap;
import android.os.Handler;
import android.content.Context;
import java.util.ArrayList;
import android.media.MediaScannerConnection;

class aa
{
    final MediaScannerConnection a;
    final ArrayList b;
    final Context c;
    final Handler d;
    final SimpleArrayMap e;
    
    public aa(final Context c) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = new SimpleArrayMap();
        this.c = c;
        this.b = new ArrayList();
        (this.a = new MediaScannerConnection(c, (MediaScannerConnection$MediaScannerConnectionClient)new ab(this))).connect();
    }
    
    public void a(final String s, final String s2, final ae ae) {
        com.twitter.util.d.c();
        Label_0029: {
            if (ae == null) {
                break Label_0029;
            }
            synchronized (this.e) {
                this.e.put(s, ae);
                // monitorexit(this.e)
                if (this.a.isConnected()) {
                    this.a.scanFile(s, s2);
                    return;
                }
            }
        }
        synchronized (this.b) {
            this.b.add(new ad(s, s2));
        }
    }
    
    public boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/twitter/util/d.c:()V
        //     3: aload_0        
        //     4: getfield        com/twitter/library/media/util/aa.c:Landroid/content/Context;
        //     7: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    10: astore_1       
        //    11: aload_1        
        //    12: invokestatic    android/provider/MediaStore.getMediaScannerUri:()Landroid/net/Uri;
        //    15: iconst_1       
        //    16: anewarray       Ljava/lang/String;
        //    19: dup            
        //    20: iconst_0       
        //    21: ldc             "volume"
        //    23: aastore        
        //    24: aconst_null    
        //    25: aconst_null    
        //    26: aconst_null    
        //    27: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    30: astore_3       
        //    31: aload_3        
        //    32: ifnull          104
        //    35: aload_3        
        //    36: invokeinterface android/database/Cursor.getCount:()I
        //    41: iconst_1       
        //    42: if_icmpne       98
        //    45: aload_3        
        //    46: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    51: pop            
        //    52: ldc             "external"
        //    54: aload_3        
        //    55: iconst_0       
        //    56: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    61: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    64: istore          8
        //    66: iload           8
        //    68: istore          5
        //    70: aload_3        
        //    71: invokeinterface android/database/Cursor.close:()V
        //    76: iload           5
        //    78: ireturn        
        //    79: astore          4
        //    81: aload_3        
        //    82: invokeinterface android/database/Cursor.close:()V
        //    87: aload           4
        //    89: athrow         
        //    90: astore_2       
        //    91: iconst_0       
        //    92: ireturn        
        //    93: astore          6
        //    95: iload           5
        //    97: ireturn        
        //    98: iconst_0       
        //    99: istore          5
        //   101: goto            70
        //   104: iconst_0       
        //   105: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     31     90     93     Ljava/lang/Exception;
        //  35     66     79     90     Any
        //  70     76     93     98     Ljava/lang/Exception;
        //  81     90     90     93     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0070:
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
    
    public boolean b() {
        synchronized (this) {
            com.twitter.util.d.c();
            int n = 0;
            while (true) {
                Label_0039: {
                    if (!this.a()) {
                        break Label_0039;
                    }
                    while (true) {
                        boolean b;
                        try {
                            Thread.sleep(250L, 0);
                            ++n;
                            b = false;
                            if (n != 3) {
                                break;
                            }
                            return b;
                            b = true;
                            return b;
                        }
                        catch (Exception ex) {
                            b = false;
                            return b;
                        }
                        return b;
                    }
                }
            }
        }
    }
}
