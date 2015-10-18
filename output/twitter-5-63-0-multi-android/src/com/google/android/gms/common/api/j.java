// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.ap;
import java.util.Iterator;
import android.os.Looper;
import com.google.android.gms.internal.ab;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public abstract class j implements r
{
    protected final k a;
    private final Object b;
    private final CountDownLatch c;
    private final ArrayList d;
    private v e;
    private volatile u f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private ab j;
    
    protected j(final Looper looper) {
        this.b = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList();
        this.a = new k(looper);
    }
    
    private void b(final u f) {
        this.f = f;
        this.j = null;
        this.c.countDown();
        final Status b = this.f.b();
        if (this.e != null) {
            this.a.a();
            if (!this.h) {
                this.a.a(this.e, this.f());
            }
        }
        final Iterator<s> iterator = (Iterator<s>)this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b);
        }
        this.d.clear();
    }
    
    private u f() {
        while (true) {
            while (true) {
                synchronized (this.b) {
                    if (!this.g) {
                        final boolean b = true;
                        ap.a(b, (Object)"Result has already been consumed.");
                        ap.a(this.a(), (Object)"Result is not ready.");
                        final u f = this.f;
                        this.c();
                        return f;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    private void g() {
        synchronized (this.b) {
            if (!this.a()) {
                this.a(this.a(Status.d));
                this.i = true;
            }
        }
    }
    
    protected abstract u a(final Status p0);
    
    public final void a(final u u) {
    Label_0054_Outer:
        while (true) {
            boolean b = true;
            while (true) {
            Label_0081:
                while (true) {
                    synchronized (this.b) {
                        if (this.i || this.h) {
                            com.google.android.gms.common.api.i.a(u);
                            return;
                        }
                        if (!this.a()) {
                            final boolean b2 = b;
                            ap.a(b2, (Object)"Results have already been set");
                            if (!this.g) {
                                ap.a(b, (Object)"Result has already been consumed");
                                this.b(u);
                                return;
                            }
                            break Label_0081;
                        }
                    }
                    final boolean b2 = false;
                    continue Label_0054_Outer;
                }
                b = false;
                continue;
            }
        }
    }
    
    public final boolean a() {
        return this.c.getCount() == 0L;
    }
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/api/j.b:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/api/j.h:Z
        //    11: ifne            21
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/common/api/j.g:Z
        //    18: ifeq            24
        //    21: aload_1        
        //    22: monitorexit    
        //    23: return         
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/common/api/j.j:Lcom/google/android/gms/internal/ab;
        //    28: astore_3       
        //    29: aload_3        
        //    30: ifnull          42
        //    33: aload_0        
        //    34: getfield        com/google/android/gms/common/api/j.j:Lcom/google/android/gms/internal/ab;
        //    37: invokeinterface com/google/android/gms/internal/ab.a:()V
        //    42: aload_0        
        //    43: getfield        com/google/android/gms/common/api/j.f:Lcom/google/android/gms/common/api/u;
        //    46: invokestatic    com/google/android/gms/common/api/i.a:(Lcom/google/android/gms/common/api/u;)V
        //    49: aload_0        
        //    50: aconst_null    
        //    51: putfield        com/google/android/gms/common/api/j.e:Lcom/google/android/gms/common/api/v;
        //    54: aload_0        
        //    55: iconst_1       
        //    56: putfield        com/google/android/gms/common/api/j.h:Z
        //    59: aload_0        
        //    60: aload_0        
        //    61: getstatic       com/google/android/gms/common/api/Status.e:Lcom/google/android/gms/common/api/Status;
        //    64: invokevirtual   com/google/android/gms/common/api/j.a:(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/u;
        //    67: invokespecial   com/google/android/gms/common/api/j.b:(Lcom/google/android/gms/common/api/u;)V
        //    70: aload_1        
        //    71: monitorexit    
        //    72: return         
        //    73: astore_2       
        //    74: aload_1        
        //    75: monitorexit    
        //    76: aload_2        
        //    77: athrow         
        //    78: astore          4
        //    80: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      21     73     78     Any
        //  21     23     73     78     Any
        //  24     29     73     78     Any
        //  33     42     78     83     Landroid/os/RemoteException;
        //  33     42     73     78     Any
        //  42     72     73     78     Any
        //  74     76     73     78     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    protected void c() {
        this.g = true;
        this.f = null;
        this.e = null;
    }
}
