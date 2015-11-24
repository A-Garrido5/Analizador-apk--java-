// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.content.ServiceConnection;
import java.util.HashSet;
import java.util.Set;
import android.content.ComponentName;
import android.os.IBinder;

final class zzl$zzb
{
    private int mState;
    private IBinder zzZQ;
    private ComponentName zzaaO;
    private final zzl$zzb$zza zzaaP;
    private final Set zzaaQ;
    private boolean zzaaR;
    private final zzl$zza zzaaS;
    final zzl zzaaT;
    
    public zzl$zzb(final zzl zzaaT, final zzl$zza zzaaS) {
        this.zzaaT = zzaaT;
        this.zzaaS = zzaaS;
        this.zzaaP = new zzl$zzb$zza(this);
        this.zzaaQ = new HashSet();
        this.mState = 2;
    }
    
    static int zza(final zzl$zzb zzl$zzb, final int mState) {
        return zzl$zzb.mState = mState;
    }
    
    static ComponentName zza(final zzl$zzb zzl$zzb, final ComponentName zzaaO) {
        return zzl$zzb.zzaaO = zzaaO;
    }
    
    static IBinder zza(final zzl$zzb zzl$zzb, final IBinder zzZQ) {
        return zzl$zzb.zzZQ = zzZQ;
    }
    
    static zzl$zza zza(final zzl$zzb zzl$zzb) {
        return zzl$zzb.zzaaS;
    }
    
    static Set zzb(final zzl$zzb zzl$zzb) {
        return zzl$zzb.zzaaQ;
    }
    
    public IBinder getBinder() {
        return this.zzZQ;
    }
    
    public ComponentName getComponentName() {
        return this.zzaaO;
    }
    
    public int getState() {
        return this.mState;
    }
    
    public boolean isBound() {
        return this.zzaaR;
    }
    
    public void zza(final ServiceConnection serviceConnection, final String s) {
        zzl.zzc(this.zzaaT).zza(zzl.zzb(this.zzaaT), serviceConnection, s, this.zzaaS.zznV());
        this.zzaaQ.add(serviceConnection);
    }
    
    public boolean zza(final ServiceConnection serviceConnection) {
        return this.zzaaQ.contains(serviceConnection);
    }
    
    public void zzb(final ServiceConnection serviceConnection, final String s) {
        zzl.zzc(this.zzaaT).zzb(zzl.zzb(this.zzaaT), serviceConnection);
        this.zzaaQ.remove(serviceConnection);
    }
    
    public void zzcc(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_0        
        //     2: getfield        com/google/android/gms/common/internal/zzl$zzb.zzaaT:Lcom/google/android/gms/common/internal/zzl;
        //     5: invokestatic    com/google/android/gms/common/internal/zzl.zzc:(Lcom/google/android/gms/common/internal/zzl;)Lcom/google/android/gms/common/stats/zzb;
        //     8: aload_0        
        //     9: getfield        com/google/android/gms/common/internal/zzl$zzb.zzaaT:Lcom/google/android/gms/common/internal/zzl;
        //    12: invokestatic    com/google/android/gms/common/internal/zzl.zzb:(Lcom/google/android/gms/common/internal/zzl;)Landroid/content/Context;
        //    15: aload_1        
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/common/internal/zzl$zzb.zzaaS:Lcom/google/android/gms/common/internal/zzl$zza;
        //    20: invokevirtual   com/google/android/gms/common/internal/zzl$zza.zznV:()Landroid/content/Intent;
        //    23: aload_0        
        //    24: getfield        com/google/android/gms/common/internal/zzl$zzb.zzaaP:Lcom/google/android/gms/common/internal/zzl$zzb$zza;
        //    27: sipush          129
        //    30: invokevirtual   com/google/android/gms/common/stats/zzb.zza:(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
        //    33: putfield        com/google/android/gms/common/internal/zzl$zzb.zzaaR:Z
        //    36: aload_0        
        //    37: getfield        com/google/android/gms/common/internal/zzl$zzb.zzaaR:Z
        //    40: ifeq            58
        //    43: aload_0        
        //    44: iconst_3       
        //    45: putfield        com/google/android/gms/common/internal/zzl$zzb.mState:I
        //    48: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //    51: istore          4
        //    53: iload           4
        //    55: ifeq            79
        //    58: aload_0        
        //    59: getfield        com/google/android/gms/common/internal/zzl$zzb.zzaaT:Lcom/google/android/gms/common/internal/zzl;
        //    62: invokestatic    com/google/android/gms/common/internal/zzl.zzc:(Lcom/google/android/gms/common/internal/zzl;)Lcom/google/android/gms/common/stats/zzb;
        //    65: aload_0        
        //    66: getfield        com/google/android/gms/common/internal/zzl$zzb.zzaaT:Lcom/google/android/gms/common/internal/zzl;
        //    69: invokestatic    com/google/android/gms/common/internal/zzl.zzb:(Lcom/google/android/gms/common/internal/zzl;)Landroid/content/Context;
        //    72: aload_0        
        //    73: getfield        com/google/android/gms/common/internal/zzl$zzb.zzaaP:Lcom/google/android/gms/common/internal/zzl$zzb$zza;
        //    76: invokevirtual   com/google/android/gms/common/stats/zzb.zza:(Landroid/content/Context;Landroid/content/ServiceConnection;)V
        //    79: return         
        //    80: astore_2       
        //    81: aload_2        
        //    82: athrow         
        //    83: astore_3       
        //    84: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      53     80     83     Ljava/lang/IllegalArgumentException;
        //  58     79     83     85     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
    
    public void zzcd(final String s) {
        zzl.zzc(this.zzaaT).zza(zzl.zzb(this.zzaaT), (ServiceConnection)this.zzaaP);
        this.zzaaR = false;
        this.mState = 2;
    }
    
    public boolean zznW() {
        return this.zzaaQ.isEmpty();
    }
}
