// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.FileOutputStream;
import java.io.OutputStream;

public final class bj
{
    private final bz a;
    private boolean b;
    final n c;
    
    private bj(final n c, final bz a) {
        this.c = c;
        this.a = a;
    }
    
    bj(final n n, final bz bz, final y y) {
        this(n, bz);
    }
    
    static bz a(final bj bj) {
        return bj.a;
    }
    
    static boolean a(final bj bj, final boolean b) {
        return bj.b = b;
    }
    
    public OutputStream a(final int n) {
        synchronized (this.c) {
            if (bz.a(this.a) != this) {
                throw new IllegalStateException();
            }
        }
        // monitorexit(n2)
        return new au(this, new FileOutputStream(this.a.a(n)), null);
    }
    
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/util/bj.b:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            39
        //     9: aload_0        
        //    10: getfield        com/whatsapp/util/bj.c:Lcom/whatsapp/util/n;
        //    13: aload_0        
        //    14: iconst_0       
        //    15: invokestatic    com/whatsapp/util/n.a:(Lcom/whatsapp/util/n;Lcom/whatsapp/util/bj;Z)V
        //    18: aload_0        
        //    19: getfield        com/whatsapp/util/bj.c:Lcom/whatsapp/util/n;
        //    22: aload_0        
        //    23: getfield        com/whatsapp/util/bj.a:Lcom/whatsapp/util/bz;
        //    26: invokestatic    com/whatsapp/util/bz.e:(Lcom/whatsapp/util/bz;)Ljava/lang/String;
        //    29: invokevirtual   com/whatsapp/util/n.d:(Ljava/lang/String;)Z
        //    32: pop            
        //    33: getstatic       com/whatsapp/util/Log.l:Z
        //    36: ifeq            55
        //    39: aload_0        
        //    40: getfield        com/whatsapp/util/bj.c:Lcom/whatsapp/util/n;
        //    43: aload_0        
        //    44: iconst_1       
        //    45: invokestatic    com/whatsapp/util/n.a:(Lcom/whatsapp/util/n;Lcom/whatsapp/util/bj;Z)V
        //    48: return         
        //    49: astore_1       
        //    50: aload_1        
        //    51: athrow         
        //    52: astore_2       
        //    53: aload_2        
        //    54: athrow         
        //    55: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      49     52     Ljava/lang/IllegalStateException;
        //  9      39     52     55     Ljava/lang/IllegalStateException;
        //  39     48     52     55     Ljava/lang/IllegalStateException;
        //  50     52     52     55     Ljava/lang/IllegalStateException;
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
    
    public void b() {
        n.a(this.c, this, false);
    }
}
