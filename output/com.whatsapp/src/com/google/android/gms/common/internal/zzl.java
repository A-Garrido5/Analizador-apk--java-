// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Message;
import android.content.ServiceConnection;
import android.content.Context;
import com.google.android.gms.common.stats.zzb;
import java.util.HashMap;
import android.os.Handler;
import android.os.Handler$Callback;

final class zzl extends zzk implements Handler$Callback
{
    private final Handler mHandler;
    private final HashMap zzaaL;
    private final zzb zzaaM;
    private final long zzaaN;
    private final Context zzqw;
    
    zzl(final Context context) {
        this.zzaaL = new HashMap();
        this.zzqw = context.getApplicationContext();
        this.mHandler = new Handler(context.getMainLooper(), (Handler$Callback)this);
        this.zzaaM = zzb.zzoO();
        this.zzaaN = 5000L;
    }
    
    static HashMap zza(final zzl zzl) {
        return zzl.zzaaL;
    }
    
    private boolean zza(final zzl$zza p0, final ServiceConnection p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //     3: istore          4
        //     5: aload_2        
        //     6: ldc             "ServiceConnection must not be null"
        //     8: invokestatic    com/google/android/gms/common/internal/zzu.zzb:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    11: pop            
        //    12: aload_0        
        //    13: getfield        com/google/android/gms/common/internal/zzl.zzaaL:Ljava/util/HashMap;
        //    16: astore          6
        //    18: aload           6
        //    20: monitorenter   
        //    21: aload_0        
        //    22: getfield        com/google/android/gms/common/internal/zzl.zzaaL:Ljava/util/HashMap;
        //    25: aload_1        
        //    26: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    29: checkcast       Lcom/google/android/gms/common/internal/zzl$zzb;
        //    32: astore          8
        //    34: aload           8
        //    36: ifnonnull       79
        //    39: new             Lcom/google/android/gms/common/internal/zzl$zzb;
        //    42: dup            
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokespecial   com/google/android/gms/common/internal/zzl$zzb.<init>:(Lcom/google/android/gms/common/internal/zzl;Lcom/google/android/gms/common/internal/zzl$zza;)V
        //    48: astore          8
        //    50: aload           8
        //    52: aload_2        
        //    53: aload_3        
        //    54: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.zza:(Landroid/content/ServiceConnection;Ljava/lang/String;)V
        //    57: aload           8
        //    59: aload_3        
        //    60: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.zzcc:(Ljava/lang/String;)V
        //    63: aload_0        
        //    64: getfield        com/google/android/gms/common/internal/zzl.zzaaL:Ljava/util/HashMap;
        //    67: aload_1        
        //    68: aload           8
        //    70: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    73: pop            
        //    74: iload           4
        //    76: ifeq            184
        //    79: aload_0        
        //    80: getfield        com/google/android/gms/common/internal/zzl.mHandler:Landroid/os/Handler;
        //    83: iconst_0       
        //    84: aload           8
        //    86: invokevirtual   android/os/Handler.removeMessages:(ILjava/lang/Object;)V
        //    89: aload           8
        //    91: aload_2        
        //    92: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.zza:(Landroid/content/ServiceConnection;)Z
        //    95: istore          13
        //    97: iload           13
        //    99: ifeq            147
        //   102: new             Ljava/lang/IllegalStateException;
        //   105: dup            
        //   106: new             Ljava/lang/StringBuilder;
        //   109: dup            
        //   110: invokespecial   java/lang/StringBuilder.<init>:()V
        //   113: ldc             "Trying to bind a GmsServiceConnection that was already connected before.  config="
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   118: aload_1        
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   122: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   128: athrow         
        //   129: astore          10
        //   131: aload           10
        //   133: athrow         
        //   134: astore          7
        //   136: aload           6
        //   138: monitorexit    
        //   139: aload           7
        //   141: athrow         
        //   142: astore          9
        //   144: aload           9
        //   146: athrow         
        //   147: aload           8
        //   149: aload_2        
        //   150: aload_3        
        //   151: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.zza:(Landroid/content/ServiceConnection;Ljava/lang/String;)V
        //   154: aload           8
        //   156: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.getState:()I
        //   159: istore          16
        //   161: iload           16
        //   163: tableswitch {
        //                2: 197
        //                3: 218
        //          default: 184
        //        }
        //   184: aload           8
        //   186: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.isBound:()Z
        //   189: istore          12
        //   191: aload           6
        //   193: monitorexit    
        //   194: iload           12
        //   196: ireturn        
        //   197: aload_2        
        //   198: aload           8
        //   200: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.getComponentName:()Landroid/content/ComponentName;
        //   203: aload           8
        //   205: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.getBinder:()Landroid/os/IBinder;
        //   208: invokeinterface android/content/ServiceConnection.onServiceConnected:(Landroid/content/ComponentName;Landroid/os/IBinder;)V
        //   213: iload           4
        //   215: ifeq            184
        //   218: aload           8
        //   220: aload_3        
        //   221: invokevirtual   com/google/android/gms/common/internal/zzl$zzb.zzcc:(Ljava/lang/String;)V
        //   224: goto            184
        //   227: astore          15
        //   229: aload           15
        //   231: athrow         
        //   232: astore          14
        //   234: aload           14
        //   236: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  21     34     134    142    Any
        //  39     50     134    142    Any
        //  50     74     142    147    Ljava/lang/IllegalStateException;
        //  50     74     134    142    Any
        //  79     97     142    147    Ljava/lang/IllegalStateException;
        //  79     97     134    142    Any
        //  102    129    129    134    Ljava/lang/IllegalStateException;
        //  102    129    134    142    Any
        //  131    134    134    142    Any
        //  136    139    134    142    Any
        //  144    147    129    134    Ljava/lang/IllegalStateException;
        //  144    147    134    142    Any
        //  147    161    232    237    Ljava/lang/IllegalStateException;
        //  147    161    134    142    Any
        //  184    194    134    142    Any
        //  197    213    232    237    Ljava/lang/IllegalStateException;
        //  197    213    134    142    Any
        //  218    224    227    232    Ljava/lang/IllegalStateException;
        //  218    224    134    142    Any
        //  229    232    134    142    Any
        //  234    237    227    232    Ljava/lang/IllegalStateException;
        //  234    237    134    142    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0079:
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
    
    static Context zzb(final zzl zzl) {
        return zzl.zzqw;
    }
    
    private void zzb(final zzl$zza zzl$zza, final ServiceConnection serviceConnection, final String s) {
        zzu.zzb(serviceConnection, "ServiceConnection must not be null");
        final zzl$zzb zzl$zzb;
        synchronized (this.zzaaL) {
            zzl$zzb = this.zzaaL.get(zzl$zza);
            if (zzl$zzb == null) {
                try {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + zzl$zza);
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
        }
        try {
            if (!zzl$zzb.zza(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzl$zza);
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        zzl$zzb.zzb(serviceConnection, s);
        if (zzl$zzb.zznW()) {
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, (Object)zzl$zzb), this.zzaaN);
        }
    }
    // monitorexit(hashMap)
    
    static zzb zzc(final zzl zzl) {
        return zzl.zzaaM;
    }
    
    public boolean handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 0: {
                final zzl$zzb zzl$zzb = (zzl$zzb)message.obj;
                synchronized (this.zzaaL) {
                    if (!zzl$zzb.zznW()) {
                        return true;
                    }
                    try {
                        if (zzl$zzb.isBound()) {
                            zzl$zzb.zzcd("GmsClientSupervisor");
                        }
                        this.zzaaL.remove(com.google.android.gms.common.internal.zzl$zzb.zza(zzl$zzb));
                        return true;
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public boolean zza(final ComponentName componentName, final ServiceConnection serviceConnection, final String s) {
        return this.zza(new zzl$zza(componentName), serviceConnection, s);
    }
    
    @Override
    public boolean zza(final String s, final ServiceConnection serviceConnection, final String s2) {
        return this.zza(new zzl$zza(s), serviceConnection, s2);
    }
    
    @Override
    public void zzb(final ComponentName componentName, final ServiceConnection serviceConnection, final String s) {
        this.zzb(new zzl$zza(componentName), serviceConnection, s);
    }
    
    @Override
    public void zzb(final String s, final ServiceConnection serviceConnection, final String s2) {
        this.zzb(new zzl$zza(s), serviceConnection, s2);
    }
}
