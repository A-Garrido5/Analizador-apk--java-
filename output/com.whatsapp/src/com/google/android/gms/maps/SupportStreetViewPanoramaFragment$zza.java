// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.app.Activity;
import com.google.android.gms.dynamic.zze;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.internal.zzv;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import android.support.v4.app.Fragment;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;

class SupportStreetViewPanoramaFragment$zza implements StreetViewLifecycleDelegate
{
    private final Fragment zzZX;
    private final IStreetViewPanoramaFragmentDelegate zzaCr;
    
    public SupportStreetViewPanoramaFragment$zza(final Fragment fragment, final IStreetViewPanoramaFragmentDelegate streetViewPanoramaFragmentDelegate) {
        this.zzaCr = (IStreetViewPanoramaFragmentDelegate)zzu.zzu(streetViewPanoramaFragmentDelegate);
        this.zzZX = (Fragment)zzu.zzu(fragment);
    }
    
    public void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        try {
            this.zzaCr.getStreetViewPanoramaAsync(new SupportStreetViewPanoramaFragment$zza$1(this, onStreetViewPanoramaReadyCallback));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       12
        //     4: new             Landroid/os/Bundle;
        //     7: dup            
        //     8: invokespecial   android/os/Bundle.<init>:()V
        //    11: astore_1       
        //    12: aload_0        
        //    13: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza.zzZX:Landroid/support/v4/app/Fragment;
        //    16: invokevirtual   android/support/v4/app/Fragment.getArguments:()Landroid/os/Bundle;
        //    19: astore_3       
        //    20: aload_3        
        //    21: ifnull          49
        //    24: aload_3        
        //    25: ldc             "StreetViewPanoramaOptions"
        //    27: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //    30: istore          6
        //    32: iload           6
        //    34: ifeq            49
        //    37: aload_1        
        //    38: ldc             "StreetViewPanoramaOptions"
        //    40: aload_3        
        //    41: ldc             "StreetViewPanoramaOptions"
        //    43: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //    46: invokestatic    com/google/android/gms/maps/internal/zzx.zza:(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V
        //    49: aload_0        
        //    50: getfield        com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza.zzaCr:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
        //    53: aload_1        
        //    54: invokeinterface com/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate.onCreate:(Landroid/os/Bundle;)V
        //    59: return         
        //    60: astore          4
        //    62: aload           4
        //    64: athrow         
        //    65: astore          5
        //    67: aload           5
        //    69: athrow         
        //    70: astore_2       
        //    71: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //    74: dup            
        //    75: aload_2        
        //    76: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //    79: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      12     70     80     Landroid/os/RemoteException;
        //  12     20     70     80     Landroid/os/RemoteException;
        //  24     32     60     65     Landroid/os/RemoteException;
        //  37     49     65     70     Landroid/os/RemoteException;
        //  49     59     70     80     Landroid/os/RemoteException;
        //  62     65     65     70     Landroid/os/RemoteException;
        //  67     70     70     80     Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        try {
            return (View)zze.zzn(this.zzaCr.onCreateView(zze.zzw(layoutInflater), zze.zzw(viewGroup), bundle));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onDestroy() {
        try {
            this.zzaCr.onDestroy();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onDestroyView() {
        try {
            this.zzaCr.onDestroyView();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onInflate(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        try {
            this.zzaCr.onInflate(zze.zzw(activity), null, bundle2);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onLowMemory() {
        try {
            this.zzaCr.onLowMemory();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onPause() {
        try {
            this.zzaCr.onPause();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onResume() {
        try {
            this.zzaCr.onResume();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        try {
            this.zzaCr.onSaveInstanceState(bundle);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
