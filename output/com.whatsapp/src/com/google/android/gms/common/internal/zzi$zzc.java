// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

public abstract class zzi$zzc
{
    private Object mListener;
    final zzi zzaax;
    private boolean zzaay;
    
    public zzi$zzc(final zzi zzaax, final Object mListener) {
        this.zzaax = zzaax;
        this.mListener = mListener;
        this.zzaay = false;
    }
    
    public void unregister() {
        this.zznR();
        synchronized (zzi.zzc(this.zzaax)) {
            zzi.zzc(this.zzaax).remove(this);
        }
    }
    
    protected abstract void zznP();
    
    public void zznQ() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/google/android/gms/common/internal/zzi$zzc.mListener:Ljava/lang/Object;
        //     6: astore_2       
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/internal/zzi$zzc.zzaay:Z
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
        //    47: ifnull          86
        //    50: aload_0        
        //    51: aload_2        
        //    52: invokevirtual   com/google/android/gms/common/internal/zzi$zzc.zzr:(Ljava/lang/Object;)V
        //    55: aload_0        
        //    56: monitorenter   
        //    57: aload_0        
        //    58: iconst_1       
        //    59: putfield        com/google/android/gms/common/internal/zzi$zzc.zzaay:Z
        //    62: aload_0        
        //    63: monitorexit    
        //    64: aload_0        
        //    65: invokevirtual   com/google/android/gms/common/internal/zzi$zzc.unregister:()V
        //    68: return         
        //    69: astore_3       
        //    70: aload_3        
        //    71: athrow         
        //    72: astore_1       
        //    73: aload_0        
        //    74: monitorexit    
        //    75: aload_1        
        //    76: athrow         
        //    77: astore          5
        //    79: aload_0        
        //    80: invokevirtual   com/google/android/gms/common/internal/zzi$zzc.zznP:()V
        //    83: aload           5
        //    85: athrow         
        //    86: aload_0        
        //    87: invokevirtual   com/google/android/gms/common/internal/zzi$zzc.zznP:()V
        //    90: goto            55
        //    93: astore          4
        //    95: aload_0        
        //    96: monitorexit    
        //    97: aload           4
        //    99: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  2      7      72     77     Any
        //  7      44     69     72     Ljava/lang/RuntimeException;
        //  7      44     72     77     Any
        //  44     46     72     77     Any
        //  50     55     77     86     Ljava/lang/RuntimeException;
        //  57     64     93     100    Any
        //  70     72     72     77     Any
        //  73     75     72     77     Any
        //  95     97     93     100    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
    
    public void zznR() {
        synchronized (this) {
            this.mListener = null;
        }
    }
    
    protected abstract void zzr(final Object p0);
}
