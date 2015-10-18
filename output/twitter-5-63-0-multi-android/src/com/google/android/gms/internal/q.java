// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.os.DeadObjectException;
import com.google.android.gms.common.d;
import android.os.Bundle;
import android.util.Log;
import android.os.IBinder;
import com.google.android.gms.common.api.p;
import java.util.ArrayList;
import android.os.IInterface;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.e;

public abstract class q
{
    final /* synthetic */ o a;
    private Object b;
    private boolean c;
    
    public q(final o a, final Object b) {
        this.a = a;
        this.b = b;
        this.c = false;
    }
    
    protected abstract void a();
    
    protected abstract void a(final Object p0);
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/google/android/gms/internal/q.b:Ljava/lang/Object;
        //     6: astore_2       
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/internal/q.c:Z
        //    11: ifeq            44
        //    14: ldc             "GmsClient"
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: invokespecial   java/lang/StringBuilder.<init>:()V
        //    23: ldc             "Callback proxy "
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: aload_0        
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    32: ldc             " being reused. This is not safe."
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    40: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    43: pop            
        //    44: aload_0        
        //    45: monitorexit    
        //    46: aload_2        
        //    47: ifnull          83
        //    50: aload_0        
        //    51: aload_2        
        //    52: invokevirtual   com/google/android/gms/internal/q.a:(Ljava/lang/Object;)V
        //    55: aload_0        
        //    56: monitorenter   
        //    57: aload_0        
        //    58: iconst_1       
        //    59: putfield        com/google/android/gms/internal/q.c:Z
        //    62: aload_0        
        //    63: monitorexit    
        //    64: aload_0        
        //    65: invokevirtual   com/google/android/gms/internal/q.c:()V
        //    68: return         
        //    69: astore_1       
        //    70: aload_0        
        //    71: monitorexit    
        //    72: aload_1        
        //    73: athrow         
        //    74: astore          4
        //    76: aload_0        
        //    77: invokevirtual   com/google/android/gms/internal/q.a:()V
        //    80: aload           4
        //    82: athrow         
        //    83: aload_0        
        //    84: invokevirtual   com/google/android/gms/internal/q.a:()V
        //    87: goto            55
        //    90: astore_3       
        //    91: aload_0        
        //    92: monitorexit    
        //    93: aload_3        
        //    94: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  2      44     69     74     Any
        //  44     46     69     74     Any
        //  50     55     74     83     Ljava/lang/RuntimeException;
        //  57     64     90     95     Any
        //  70     72     69     74     Any
        //  91     93     90     95     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 56, Size: 56
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
    
    public void c() {
        this.d();
        synchronized (this.a.h) {
            this.a.h.remove(this);
        }
    }
    
    public void d() {
        synchronized (this) {
            this.b = null;
        }
    }
}
