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

class SupportStreetViewPanoramaFragment$zzb extends zza
{
    private Activity mActivity;
    private final Fragment zzZX;
    protected zzf zzaBZ;
    private final List zzaCu;
    
    SupportStreetViewPanoramaFragment$zzb(final Fragment zzZX) {
        this.zzaCu = new ArrayList();
        this.zzZX = zzZX;
    }
    
    private void setActivity(final Activity mActivity) {
        this.mActivity = mActivity;
        this.zzvu();
    }
    
    static void zza(final SupportStreetViewPanoramaFragment$zzb supportStreetViewPanoramaFragment$zzb, final Activity activity) {
        supportStreetViewPanoramaFragment$zzb.setActivity(activity);
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
        //     5: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.mActivity:Landroid/app/Activity;
        //     8: ifnull          142
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.zzaBZ:Lcom/google/android/gms/dynamic/zzf;
        //    15: astore          4
        //    17: aload           4
        //    19: ifnull          142
        //    22: aload_0        
        //    23: invokevirtual   com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //    26: astore          5
        //    28: aload           5
        //    30: ifnonnull       142
        //    33: aload_0        
        //    34: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.mActivity:Landroid/app/Activity;
        //    37: invokestatic    com/google/android/gms/maps/MapsInitializer.initialize:(Landroid/content/Context;)I
        //    40: pop            
        //    41: aload_0        
        //    42: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.mActivity:Landroid/app/Activity;
        //    45: invokestatic    com/google/android/gms/maps/internal/zzy.zzay:(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/zzc;
        //    48: aload_0        
        //    49: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.mActivity:Landroid/app/Activity;
        //    52: invokestatic    com/google/android/gms/dynamic/zze.zzw:(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;
        //    55: invokeinterface com/google/android/gms/maps/internal/zzc.zzs:(Lcom/google/android/gms/dynamic/zzd;)Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
        //    60: astore          9
        //    62: aload_0        
        //    63: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.zzaBZ:Lcom/google/android/gms/dynamic/zzf;
        //    66: new             Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza;
        //    69: dup            
        //    70: aload_0        
        //    71: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.zzZX:Landroid/support/v4/app/Fragment;
        //    74: aload           9
        //    76: invokespecial   com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza.<init>:(Landroid/support/v4/app/Fragment;Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;)V
        //    79: invokeinterface com/google/android/gms/dynamic/zzf.zza:(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V
        //    84: aload_0        
        //    85: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.zzaCu:Ljava/util/List;
        //    88: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    93: astore          10
        //    95: aload           10
        //    97: invokeinterface java/util/Iterator.hasNext:()Z
        //   102: ifeq            133
        //   105: aload           10
        //   107: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   112: checkcast       Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;
        //   115: astore          11
        //   117: aload_0        
        //   118: invokevirtual   com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.zzqj:()Lcom/google/android/gms/dynamic/LifecycleDelegate;
        //   121: checkcast       Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza;
        //   124: aload           11
        //   126: invokevirtual   com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync:(Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;)V
        //   129: iload_1        
        //   130: ifeq            95
        //   133: aload_0        
        //   134: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb.zzaCu:Ljava/util/List;
        //   137: invokeinterface java/util/List.clear:()V
        //   142: return         
        //   143: astore_2       
        //   144: aload_2        
        //   145: athrow         
        //   146: astore_3       
        //   147: aload_3        
        //   148: athrow         
        //   149: astore          7
        //   151: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //   154: dup            
        //   155: aload           7
        //   157: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //   160: athrow         
        //   161: astore          6
        //   163: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                                   
        //  -----  -----  -----  -----  -----------------------------------------------------------------------
        //  4      17     143    146    Landroid/os/RemoteException;
        //  22     28     146    149    Landroid/os/RemoteException;
        //  33     95     149    161    Landroid/os/RemoteException;
        //  33     95     161    164    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  95     129    149    161    Landroid/os/RemoteException;
        //  95     129    161    164    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  133    142    149    161    Landroid/os/RemoteException;
        //  133    142    161    164    Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        //  144    146    146    149    Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
