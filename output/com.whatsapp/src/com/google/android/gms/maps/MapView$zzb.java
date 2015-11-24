// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import java.util.ArrayList;
import android.view.ViewGroup;
import java.util.List;
import com.google.android.gms.dynamic.zzf;
import android.content.Context;
import com.google.android.gms.dynamic.zza;

class MapView$zzb extends zza
{
    private final Context mContext;
    protected zzf zzaBZ;
    private final List zzaCa;
    private final ViewGroup zzaCg;
    private final GoogleMapOptions zzaCh;
    
    MapView$zzb(final ViewGroup zzaCg, final Context mContext, final GoogleMapOptions zzaCh) {
        this.zzaCa = new ArrayList();
        this.zzaCg = zzaCg;
        this.mContext = mContext;
        this.zzaCh = zzaCh;
    }
    
    public void getMapAsync(final OnMapReadyCallback p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/google/android/gms/maps/MapView$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          28
        //    11: aload_0        
        //    12: invokevirtual   com/google/android/gms/maps/MapView$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //    15: checkcast       Lcom/google/android/gms/maps/MapView$zza;
        //    18: aload_1        
        //    19: invokevirtual   com/google/android/gms/maps/MapView$zza.getMapAsync:(Lcom/google/android/gms/maps/OnMapReadyCallback;)V
        //    22: getstatic       com/google/android/gms/maps/MapView.a:I
        //    25: ifeq            46
        //    28: aload_0        
        //    29: getfield        com/google/android/gms/maps/MapView$zzb.zzaCa:Ljava/util/List;
        //    32: aload_1        
        //    33: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    38: pop            
        //    39: return         
        //    40: astore_2       
        //    41: aload_2        
        //    42: athrow         
        //    43: astore_3       
        //    44: aload_3        
        //    45: athrow         
        //    46: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                      
        //  -----  -----  -----  -----  ----------------------------------------------------------
        //  0      6      40     43     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //  11     28     43     46     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //  28     39     43     46     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //  41     43     43     46     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    @Override
    protected void zza(final zzf zzaBZ) {
        this.zzaBZ = zzaBZ;
        this.zzvu();
    }
    
    public void zzvu() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/maps/MapView.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/maps/MapView$zzb.zzaBZ:Lcom/google/android/gms/dynamic/zzf;
        //     8: ifnull          58
        //    11: aload_0        
        //    12: invokevirtual   com/google/android/gms/maps/MapView$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnonnull       58
        //    20: aload_0        
        //    21: getfield        com/google/android/gms/maps/MapView$zzb.mContext:Landroid/content/Context;
        //    24: invokestatic    com/google/android/gms/maps/MapsInitializer.initialize:(Landroid/content/Context;)I
        //    27: pop            
        //    28: aload_0        
        //    29: getfield        com/google/android/gms/maps/MapView$zzb.mContext:Landroid/content/Context;
        //    32: invokestatic    com/google/android/gms/maps/internal/zzy.zzay:(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/zzc;
        //    35: aload_0        
        //    36: getfield        com/google/android/gms/maps/MapView$zzb.mContext:Landroid/content/Context;
        //    39: invokestatic    com/google/android/gms/dynamic/zze.zzw:(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;
        //    42: aload_0        
        //    43: getfield        com/google/android/gms/maps/MapView$zzb.zzaCh:Lcom/google/android/gms/maps/GoogleMapOptions;
        //    46: invokeinterface com/google/android/gms/maps/internal/zzc.zza:(Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/maps/GoogleMapOptions;)Lcom/google/android/gms/maps/internal/IMapViewDelegate;
        //    51: astore          7
        //    53: aload           7
        //    55: ifnonnull       62
        //    58: return         
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    62: aload_0        
        //    63: getfield        com/google/android/gms/maps/MapView$zzb.zzaBZ:Lcom/google/android/gms/dynamic/zzf;
        //    66: new             Lcom/google/android/gms/maps/MapView$zza;
        //    69: dup            
        //    70: aload_0        
        //    71: getfield        com/google/android/gms/maps/MapView$zzb.zzaCg:Landroid/view/ViewGroup;
        //    74: aload           7
        //    76: invokespecial   com/google/android/gms/maps/MapView$zza.<init>:(Landroid/view/ViewGroup;Lcom/google/android/gms/maps/internal/IMapViewDelegate;)V
        //    79: invokeinterface com/google/android/gms/dynamic/zzf.zza:(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V
        //    84: aload_0        
        //    85: getfield        com/google/android/gms/maps/MapView$zzb.zzaCa:Ljava/util/List;
        //    88: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    93: astore          8
        //    95: aload           8
        //    97: invokeinterface java/util/Iterator.hasNext:()Z
        //   102: ifeq            133
        //   105: aload           8
        //   107: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   112: checkcast       Lcom/google/android/gms/maps/OnMapReadyCallback;
        //   115: astore          9
        //   117: aload_0        
        //   118: invokevirtual   com/google/android/gms/maps/MapView$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //   121: checkcast       Lcom/google/android/gms/maps/MapView$zza;
        //   124: aload           9
        //   126: invokevirtual   com/google/android/gms/maps/MapView$zza.getMapAsync:(Lcom/google/android/gms/maps/OnMapReadyCallback;)V
        //   129: iload_1        
        //   130: ifeq            95
        //   133: aload_0        
        //   134: getfield        com/google/android/gms/maps/MapView$zzb.zzaCa:Ljava/util/List;
        //   137: invokeinterface java/util/List.clear:()V
        //   142: return         
        //   143: astore          5
        //   145: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //   148: dup            
        //   149: aload           5
        //   151: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //   154: athrow         
        //   155: astore          4
        //   157: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                                   
        //  -----  -----  -----  -----  -----------------------------------------------------------------------
        //  4      16     59     62     Landroid/os/RemoteException;
        //  20     53     143    155    Landroid/os/RemoteException;
        //  20     53     155    158    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  62     95     143    155    Landroid/os/RemoteException;
        //  62     95     155    158    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  95     129    143    155    Landroid/os/RemoteException;
        //  95     129    155    158    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  133    142    143    155    Landroid/os/RemoteException;
        //  133    142    155    158    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
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
}
