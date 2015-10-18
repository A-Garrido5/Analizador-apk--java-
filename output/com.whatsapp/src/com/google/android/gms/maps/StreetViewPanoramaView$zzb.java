// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.zzf;
import android.content.Context;
import com.google.android.gms.dynamic.zza;

class StreetViewPanoramaView$zzb extends zza
{
    private final Context mContext;
    protected zzf zzaBZ;
    private final StreetViewPanoramaOptions zzaCG;
    private final ViewGroup zzaCg;
    private final List zzaCu;
    
    StreetViewPanoramaView$zzb(final ViewGroup zzaCg, final Context mContext, final StreetViewPanoramaOptions zzaCG) {
        this.zzaCu = new ArrayList();
        this.zzaCg = zzaCg;
        this.mContext = mContext;
        this.zzaCG = zzaCG;
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
        //     5: getfield        com/google/android/gms/maps/StreetViewPanoramaView$zzb.zzaBZ:Lcom/google/android/gms/dynamic/zzf;
        //     8: ifnull          125
        //    11: aload_0        
        //    12: invokevirtual   com/google/android/gms/maps/StreetViewPanoramaView$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnonnull       125
        //    20: aload_0        
        //    21: getfield        com/google/android/gms/maps/StreetViewPanoramaView$zzb.mContext:Landroid/content/Context;
        //    24: invokestatic    com/google/android/gms/maps/internal/zzy.zzay:(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/zzc;
        //    27: aload_0        
        //    28: getfield        com/google/android/gms/maps/StreetViewPanoramaView$zzb.mContext:Landroid/content/Context;
        //    31: invokestatic    com/google/android/gms/dynamic/zze.zzw:(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;
        //    34: aload_0        
        //    35: getfield        com/google/android/gms/maps/StreetViewPanoramaView$zzb.zzaCG:Lcom/google/android/gms/maps/StreetViewPanoramaOptions;
        //    38: invokeinterface com/google/android/gms/maps/internal/zzc.zza:(Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;
        //    43: astore          6
        //    45: aload_0        
        //    46: getfield        com/google/android/gms/maps/StreetViewPanoramaView$zzb.zzaBZ:Lcom/google/android/gms/dynamic/zzf;
        //    49: new             Lcom/google/android/gms/maps/StreetViewPanoramaView$zza;
        //    52: dup            
        //    53: aload_0        
        //    54: getfield        com/google/android/gms/maps/StreetViewPanoramaView$zzb.zzaCg:Landroid/view/ViewGroup;
        //    57: aload           6
        //    59: invokespecial   com/google/android/gms/maps/StreetViewPanoramaView$zza.<init>:(Landroid/view/ViewGroup;Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;)V
        //    62: invokeinterface com/google/android/gms/dynamic/zzf.zza:(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V
        //    67: aload_0        
        //    68: getfield        com/google/android/gms/maps/StreetViewPanoramaView$zzb.zzaCu:Ljava/util/List;
        //    71: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    76: astore          7
        //    78: aload           7
        //    80: invokeinterface java/util/Iterator.hasNext:()Z
        //    85: ifeq            116
        //    88: aload           7
        //    90: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    95: checkcast       Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;
        //    98: astore          8
        //   100: aload_0        
        //   101: invokevirtual   com/google/android/gms/maps/StreetViewPanoramaView$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //   104: checkcast       Lcom/google/android/gms/maps/StreetViewPanoramaView$zza;
        //   107: aload           8
        //   109: invokevirtual   com/google/android/gms/maps/StreetViewPanoramaView$zza.getStreetViewPanoramaAsync:(Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;)V
        //   112: iload_1        
        //   113: ifeq            78
        //   116: aload_0        
        //   117: getfield        com/google/android/gms/maps/StreetViewPanoramaView$zzb.zzaCu:Ljava/util/List;
        //   120: invokeinterface java/util/List.clear:()V
        //   125: return         
        //   126: astore_2       
        //   127: aload_2        
        //   128: athrow         
        //   129: astore          5
        //   131: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //   134: dup            
        //   135: aload           5
        //   137: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //   140: athrow         
        //   141: astore          4
        //   143: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                                   
        //  -----  -----  -----  -----  -----------------------------------------------------------------------
        //  4      16     126    129    Landroid/os/RemoteException;
        //  20     78     129    141    Landroid/os/RemoteException;
        //  20     78     141    144    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  78     112    129    141    Landroid/os/RemoteException;
        //  78     112    141    144    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  116    125    129    141    Landroid/os/RemoteException;
        //  116    125    141    144    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0078:
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
