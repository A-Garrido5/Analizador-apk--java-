// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import android.os.Looper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.HandlerThread;
import java.util.HashMap;
import android.content.Context;

public class MediaServiceClient
{
    private static MediaServiceClient a;
    private final Context b;
    private final HashMap c;
    private final e d;
    private final HandlerThread e;
    private Messenger f;
    private Handler g;
    
    private MediaServiceClient(final Context b) {
        this.c = new HashMap();
        this.d = new e(this, null);
        this.b = b;
        (this.e = new HandlerThread("MediaServiceHandler", 10)).start();
        this.d.a();
    }
    
    public static MediaServiceClient a(final Context context) {
        synchronized (MediaServiceClient.class) {
            if (MediaServiceClient.a == null) {
                MediaServiceClient.a = new MediaServiceClient(context.getApplicationContext());
            }
            return MediaServiceClient.a;
        }
    }
    
    private void a() {
        this.a(2, null, new c(this));
    }
    
    private Handler b() {
        synchronized (this) {
            if (this.g == null) {
                this.g = new f(this.e.getLooper(), this.c);
            }
            return this.g;
        }
    }
    
    private static void b(final g g, final Bundle g2) {
        synchronized (g) {
            g.g = g2;
            g.f = true;
            g.notifyAll();
            // monitorexit(g)
            if (g.d != null && g.e != null) {
                g.e.post((Runnable)new d(g));
            }
        }
    }
    
    private Messenger c() {
        synchronized (this) {
            if (this.f == null) {
                this.f = new Messenger(this.b());
            }
            return this.f;
        }
    }
    
    public int a(final int n, final Bundle bundle, final h d) {
        final g g = new g(n, bundle, null);
        if (d != null) {
            g.d = d;
            if (Looper.myLooper() != null) {
                g.e = new Handler();
            }
            else {
                g.e = this.b();
            }
        }
        this.d.a(g);
        return g.a;
    }
    
    public Bundle a(final int n, final Bundle bundle) {
        return this.a(n, bundle, 60000);
    }
    
    public Bundle a(final int p0, final Bundle p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/twitter/library/media/service/core/g;
        //     3: dup            
        //     4: iload_1        
        //     5: aload_2        
        //     6: aconst_null    
        //     7: invokespecial   com/twitter/library/media/service/core/g.<init>:(ILandroid/os/Bundle;Lcom/twitter/library/media/service/core/c;)V
        //    10: astore          4
        //    12: aload_0        
        //    13: getfield        com/twitter/library/media/service/core/MediaServiceClient.d:Lcom/twitter/library/media/service/core/e;
        //    16: aload           4
        //    18: invokevirtual   com/twitter/library/media/service/core/e.a:(Lcom/twitter/library/media/service/core/g;)V
        //    21: aload           4
        //    23: monitorenter   
        //    24: aload           4
        //    26: getfield        com/twitter/library/media/service/core/g.f:Z
        //    29: istore          6
        //    31: aconst_null    
        //    32: astore          7
        //    34: iload           6
        //    36: ifne            74
        //    39: iload_3        
        //    40: i2l            
        //    41: lstore          8
        //    43: aload           4
        //    45: lload           8
        //    47: invokevirtual   java/lang/Object.wait:(J)V
        //    50: aload           4
        //    52: getfield        com/twitter/library/media/service/core/g.f:Z
        //    55: ifne            67
        //    58: aload_0        
        //    59: getfield        com/twitter/library/media/service/core/MediaServiceClient.d:Lcom/twitter/library/media/service/core/e;
        //    62: aload           4
        //    64: invokevirtual   com/twitter/library/media/service/core/e.b:(Lcom/twitter/library/media/service/core/g;)V
        //    67: aload           4
        //    69: getfield        com/twitter/library/media/service/core/g.g:Landroid/os/Bundle;
        //    72: astore          7
        //    74: aload           4
        //    76: monitorexit    
        //    77: aload           7
        //    79: areturn        
        //    80: astore          5
        //    82: aload           4
        //    84: monitorexit    
        //    85: aload           5
        //    87: athrow         
        //    88: astore          10
        //    90: goto            50
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  24     31     80     88     Any
        //  43     50     88     93     Ljava/lang/Exception;
        //  43     50     80     88     Any
        //  50     67     80     88     Any
        //  67     74     80     88     Any
        //  74     77     80     88     Any
        //  82     85     80     88     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
