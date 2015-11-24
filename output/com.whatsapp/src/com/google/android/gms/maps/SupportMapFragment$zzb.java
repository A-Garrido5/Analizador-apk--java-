// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.dynamic.zzf;
import android.support.v4.app.Fragment;
import android.app.Activity;
import com.google.android.gms.dynamic.zza;

class SupportMapFragment$zzb extends zza
{
    private Activity mActivity;
    private final Fragment zzZX;
    protected zzf zzaBZ;
    private final List zzaCa;
    
    SupportMapFragment$zzb(final Fragment zzZX) {
        this.zzaCa = new ArrayList();
        this.zzZX = zzZX;
    }
    
    private void setActivity(final Activity mActivity) {
        this.mActivity = mActivity;
        this.zzvu();
    }
    
    static void zza(final SupportMapFragment$zzb supportMapFragment$zzb, final Activity activity) {
        supportMapFragment$zzb.setActivity(activity);
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
        //     5: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.mActivity:Landroid/app/Activity;
        //     8: ifnull          67
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.zzaBZ:Lcom/google/android/gms/dynamic/zzf;
        //    15: astore          4
        //    17: aload           4
        //    19: ifnull          67
        //    22: aload_0        
        //    23: invokevirtual   com/google/android/gms/maps/SupportMapFragment$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //    26: astore          5
        //    28: aload           5
        //    30: ifnonnull       67
        //    33: aload_0        
        //    34: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.mActivity:Landroid/app/Activity;
        //    37: invokestatic    com/google/android/gms/maps/MapsInitializer.initialize:(Landroid/content/Context;)I
        //    40: pop            
        //    41: aload_0        
        //    42: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.mActivity:Landroid/app/Activity;
        //    45: invokestatic    com/google/android/gms/maps/internal/zzy.zzay:(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/zzc;
        //    48: aload_0        
        //    49: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.mActivity:Landroid/app/Activity;
        //    52: invokestatic    com/google/android/gms/dynamic/zze.zzw:(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;
        //    55: invokeinterface com/google/android/gms/maps/internal/zzc.zzr:(Lcom/google/android/gms/dynamic/zzd;)Lcom/google/android/gms/maps/internal/IMapFragmentDelegate;
        //    60: astore          9
        //    62: aload           9
        //    64: ifnonnull       74
        //    67: return         
        //    68: astore_2       
        //    69: aload_2        
        //    70: athrow         
        //    71: astore_3       
        //    72: aload_3        
        //    73: athrow         
        //    74: aload_0        
        //    75: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.zzaBZ:Lcom/google/android/gms/dynamic/zzf;
        //    78: new             Lcom/google/android/gms/maps/SupportMapFragment$zza;
        //    81: dup            
        //    82: aload_0        
        //    83: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.zzZX:Landroid/support/v4/app/Fragment;
        //    86: aload           9
        //    88: invokespecial   com/google/android/gms/maps/SupportMapFragment$zza.<init>:(Landroid/support/v4/app/Fragment;Lcom/google/android/gms/maps/internal/IMapFragmentDelegate;)V
        //    91: invokeinterface com/google/android/gms/dynamic/zzf.zza:(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V
        //    96: aload_0        
        //    97: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.zzaCa:Ljava/util/List;
        //   100: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   105: astore          10
        //   107: aload           10
        //   109: invokeinterface java/util/Iterator.hasNext:()Z
        //   114: ifeq            145
        //   117: aload           10
        //   119: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   124: checkcast       Lcom/google/android/gms/maps/OnMapReadyCallback;
        //   127: astore          11
        //   129: aload_0        
        //   130: invokevirtual   com/google/android/gms/maps/SupportMapFragment$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //   133: checkcast       Lcom/google/android/gms/maps/SupportMapFragment$zza;
        //   136: aload           11
        //   138: invokevirtual   com/google/android/gms/maps/SupportMapFragment$zza.getMapAsync:(Lcom/google/android/gms/maps/OnMapReadyCallback;)V
        //   141: iload_1        
        //   142: ifeq            107
        //   145: aload_0        
        //   146: getfield        com/google/android/gms/maps/SupportMapFragment$zzb.zzaCa:Ljava/util/List;
        //   149: invokeinterface java/util/List.clear:()V
        //   154: return         
        //   155: astore          7
        //   157: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //   160: dup            
        //   161: aload           7
        //   163: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //   166: athrow         
        //   167: astore          6
        //   169: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                                   
        //  -----  -----  -----  -----  -----------------------------------------------------------------------
        //  4      17     68     71     Landroid/os/RemoteException;
        //  22     28     71     74     Landroid/os/RemoteException;
        //  33     62     155    167    Landroid/os/RemoteException;
        //  33     62     167    170    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  69     71     71     74     Landroid/os/RemoteException;
        //  74     107    155    167    Landroid/os/RemoteException;
        //  74     107    167    170    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  107    141    155    167    Landroid/os/RemoteException;
        //  107    141    167    170    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  145    154    155    167    Landroid/os/RemoteException;
        //  145    154    167    170    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 75, Size: 75
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
}
