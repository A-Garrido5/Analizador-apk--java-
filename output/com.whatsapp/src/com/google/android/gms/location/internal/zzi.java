// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import com.google.android.gms.location.zzd;
import com.google.android.gms.location.LocationRequest;
import android.os.RemoteException;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationListener;
import java.util.HashMap;
import android.content.ContentProviderClient;
import java.util.Map;
import android.content.Context;

public class zzi
{
    private final Context mContext;
    private Map zzakE;
    private ContentProviderClient zzayL;
    private boolean zzayM;
    private Map zzayN;
    private final zzn zzayq;
    
    public zzi(final Context mContext, final zzn zzayq) {
        this.zzayL = null;
        this.zzayM = false;
        this.zzakE = new HashMap();
        this.zzayN = new HashMap();
        this.mContext = mContext;
        this.zzayq = zzayq;
    }
    
    private zzi$zzc zza(final LocationListener locationListener, final Looper looper) {
        synchronized (this.zzakE) {
            zzi$zzc zzi$zzc = this.zzakE.get(locationListener);
            if (zzi$zzc == null) {
                zzi$zzc = new zzi$zzc(locationListener, looper);
            }
            this.zzakE.put(locationListener, zzi$zzc);
            return zzi$zzc;
        }
    }
    
    public Location getLastLocation() {
        this.zzayq.zznL();
        try {
            return ((zzg)this.zzayq.zznM()).zzdl(this.mContext.getPackageName());
        }
        catch (RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public void removeAllListeners() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/location/internal/zzj.c:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/location/internal/zzi.zzakE:Ljava/util/Map;
        //     8: astore_3       
        //     9: aload_3        
        //    10: monitorenter   
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/location/internal/zzi.zzakE:Ljava/util/Map;
        //    15: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    20: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    25: astore          5
        //    27: aload           5
        //    29: invokeinterface java/util/Iterator.hasNext:()Z
        //    34: ifeq            80
        //    37: aload           5
        //    39: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    44: checkcast       Lcom/google/android/gms/location/internal/zzi$zzc;
        //    47: astore          9
        //    49: aload           9
        //    51: ifnull          76
        //    54: aload_0        
        //    55: getfield        com/google/android/gms/location/internal/zzi.zzayq:Lcom/google/android/gms/location/internal/zzn;
        //    58: invokeinterface com/google/android/gms/location/internal/zzn.zznM:()Landroid/os/IInterface;
        //    63: checkcast       Lcom/google/android/gms/location/internal/zzg;
        //    66: aload           9
        //    68: invokestatic    com/google/android/gms/location/internal/LocationRequestUpdateData.zzb:(Lcom/google/android/gms/location/zzd;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
        //    71: invokeinterface com/google/android/gms/location/internal/zzg.zza:(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V
        //    76: iload_1        
        //    77: ifeq            27
        //    80: aload_0        
        //    81: getfield        com/google/android/gms/location/internal/zzi.zzakE:Ljava/util/Map;
        //    84: invokeinterface java/util/Map.clear:()V
        //    89: aload_0        
        //    90: getfield        com/google/android/gms/location/internal/zzi.zzayN:Ljava/util/Map;
        //    93: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    98: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   103: astore          6
        //   105: aload           6
        //   107: invokeinterface java/util/Iterator.hasNext:()Z
        //   112: ifeq            158
        //   115: aload           6
        //   117: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   122: checkcast       Lcom/google/android/gms/location/internal/zzi$zza;
        //   125: astore          7
        //   127: aload           7
        //   129: ifnull          154
        //   132: aload_0        
        //   133: getfield        com/google/android/gms/location/internal/zzi.zzayq:Lcom/google/android/gms/location/internal/zzn;
        //   136: invokeinterface com/google/android/gms/location/internal/zzn.zznM:()Landroid/os/IInterface;
        //   141: checkcast       Lcom/google/android/gms/location/internal/zzg;
        //   144: aload           7
        //   146: invokestatic    com/google/android/gms/location/internal/LocationRequestUpdateData.zza:(Lcom/google/android/gms/location/zzc;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
        //   149: invokeinterface com/google/android/gms/location/internal/zzg.zza:(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V
        //   154: iload_1        
        //   155: ifeq            105
        //   158: aload_0        
        //   159: getfield        com/google/android/gms/location/internal/zzi.zzayN:Ljava/util/Map;
        //   162: invokeinterface java/util/Map.clear:()V
        //   167: aload_3        
        //   168: monitorexit    
        //   169: return         
        //   170: astore          10
        //   172: aload           10
        //   174: athrow         
        //   175: astore          4
        //   177: aload_3        
        //   178: monitorexit    
        //   179: aload           4
        //   181: athrow         
        //   182: astore_2       
        //   183: new             Ljava/lang/IllegalStateException;
        //   186: dup            
        //   187: aload_2        
        //   188: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   191: athrow         
        //   192: astore          8
        //   194: aload           8
        //   196: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      11     182    192    Landroid/os/RemoteException;
        //  11     27     175    182    Any
        //  27     49     175    182    Any
        //  54     76     170    175    Landroid/os/RemoteException;
        //  54     76     175    182    Any
        //  80     105    175    182    Any
        //  105    127    175    182    Any
        //  132    154    192    197    Landroid/os/RemoteException;
        //  132    154    175    182    Any
        //  158    169    175    182    Any
        //  172    175    175    182    Any
        //  177    179    175    182    Any
        //  179    182    182    192    Landroid/os/RemoteException;
        //  194    197    175    182    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0154:
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
    
    public void zza(final LocationListener p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/location/internal/zzi.zzayq:Lcom/google/android/gms/location/internal/zzn;
        //     4: invokeinterface com/google/android/gms/location/internal/zzn.zznL:()V
        //     9: aload_1        
        //    10: ldc             "Invalid null listener"
        //    12: invokestatic    com/google/android/gms/common/internal/zzu.zzb:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    15: pop            
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/location/internal/zzi.zzakE:Ljava/util/Map;
        //    20: astore_3       
        //    21: aload_3        
        //    22: monitorenter   
        //    23: aload_0        
        //    24: getfield        com/google/android/gms/location/internal/zzi.zzakE:Ljava/util/Map;
        //    27: aload_1        
        //    28: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    33: checkcast       Lcom/google/android/gms/location/internal/zzi$zzc;
        //    36: astore          5
        //    38: aload_0        
        //    39: getfield        com/google/android/gms/location/internal/zzi.zzayL:Landroid/content/ContentProviderClient;
        //    42: ifnull          74
        //    45: aload_0        
        //    46: getfield        com/google/android/gms/location/internal/zzi.zzakE:Ljava/util/Map;
        //    49: invokeinterface java/util/Map.isEmpty:()Z
        //    54: istore          9
        //    56: iload           9
        //    58: ifeq            74
        //    61: aload_0        
        //    62: getfield        com/google/android/gms/location/internal/zzi.zzayL:Landroid/content/ContentProviderClient;
        //    65: invokevirtual   android/content/ContentProviderClient.release:()Z
        //    68: pop            
        //    69: aload_0        
        //    70: aconst_null    
        //    71: putfield        com/google/android/gms/location/internal/zzi.zzayL:Landroid/content/ContentProviderClient;
        //    74: aload           5
        //    76: ifnull          106
        //    79: aload           5
        //    81: invokevirtual   com/google/android/gms/location/internal/zzi$zzc.release:()V
        //    84: aload_0        
        //    85: getfield        com/google/android/gms/location/internal/zzi.zzayq:Lcom/google/android/gms/location/internal/zzn;
        //    88: invokeinterface com/google/android/gms/location/internal/zzn.zznM:()Landroid/os/IInterface;
        //    93: checkcast       Lcom/google/android/gms/location/internal/zzg;
        //    96: aload           5
        //    98: invokestatic    com/google/android/gms/location/internal/LocationRequestUpdateData.zzb:(Lcom/google/android/gms/location/zzd;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
        //   101: invokeinterface com/google/android/gms/location/internal/zzg.zza:(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V
        //   106: aload_3        
        //   107: monitorexit    
        //   108: return         
        //   109: astore          6
        //   111: aload           6
        //   113: athrow         
        //   114: astore          7
        //   116: aload           7
        //   118: athrow         
        //   119: astore          4
        //   121: aload_3        
        //   122: monitorexit    
        //   123: aload           4
        //   125: athrow         
        //   126: astore          8
        //   128: aload           8
        //   130: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  23     38     119    126    Any
        //  38     56     109    114    Ljava/lang/IllegalStateException;
        //  38     56     119    126    Any
        //  61     74     114    119    Ljava/lang/IllegalStateException;
        //  61     74     119    126    Any
        //  79     106    126    131    Ljava/lang/IllegalStateException;
        //  79     106    119    126    Any
        //  106    108    119    126    Any
        //  111    114    114    119    Ljava/lang/IllegalStateException;
        //  111    114    119    126    Any
        //  116    119    119    126    Any
        //  121    123    119    126    Any
        //  128    131    119    126    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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
    
    public void zza(final LocationRequest locationRequest, final LocationListener locationListener, final Looper looper) {
        this.zzayq.zznL();
        ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationRequest), this.zza(locationListener, looper)));
    }
    
    public void zzac(final boolean zzayM) {
        this.zzayq.zznL();
        ((zzg)this.zzayq.zznM()).zzac(zzayM);
        this.zzayM = zzayM;
    }
    
    public void zzux() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/location/internal/zzi.zzayM:Z
        //     4: istore_2       
        //     5: iload_2        
        //     6: ifeq            14
        //     9: aload_0        
        //    10: iconst_0       
        //    11: invokevirtual   com/google/android/gms/location/internal/zzi.zzac:(Z)V
        //    14: return         
        //    15: astore_1       
        //    16: aload_1        
        //    17: athrow         
        //    18: astore_3       
        //    19: new             Ljava/lang/IllegalStateException;
        //    22: dup            
        //    23: aload_3        
        //    24: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //    27: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      15     18     Ljava/lang/IllegalStateException;
        //  9      14     18     28     Landroid/os/RemoteException;
        //  9      14     15     18     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0014:
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
