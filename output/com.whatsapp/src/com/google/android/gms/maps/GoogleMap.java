// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.internal.zzi;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

public final class GoogleMap
{
    public static int a;
    private final IGoogleMapDelegate zzaBp;
    private UiSettings zzaBq;
    
    protected GoogleMap(final IGoogleMapDelegate googleMapDelegate) {
        this.zzaBp = (IGoogleMapDelegate)zzu.zzu(googleMapDelegate);
    }
    
    public final Marker addMarker(final MarkerOptions markerOptions) {
        try {
            final zzi addMarker = this.zzaBp.addMarker(markerOptions);
            if (addMarker != null) {
                return new Marker(addMarker);
            }
            return null;
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void animateCamera(final CameraUpdate cameraUpdate) {
        try {
            this.zzaBp.animateCamera(cameraUpdate.zzvg());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void clear() {
        try {
            this.zzaBp.clear();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final CameraPosition getCameraPosition() {
        try {
            return this.zzaBp.getCameraPosition();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.zzaBp.getMyLocation();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final Projection getProjection() {
        try {
            return new Projection(this.zzaBp.getProjection());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final UiSettings getUiSettings() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/maps/GoogleMap.zzaBq:Lcom/google/android/gms/maps/UiSettings;
        //     4: ifnonnull       27
        //     7: aload_0        
        //     8: new             Lcom/google/android/gms/maps/UiSettings;
        //    11: dup            
        //    12: aload_0        
        //    13: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //    16: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.getUiSettings:()Lcom/google/android/gms/maps/internal/IUiSettingsDelegate;
        //    21: invokespecial   com/google/android/gms/maps/UiSettings.<init>:(Lcom/google/android/gms/maps/internal/IUiSettingsDelegate;)V
        //    24: putfield        com/google/android/gms/maps/GoogleMap.zzaBq:Lcom/google/android/gms/maps/UiSettings;
        //    27: aload_0        
        //    28: getfield        com/google/android/gms/maps/GoogleMap.zzaBq:Lcom/google/android/gms/maps/UiSettings;
        //    31: areturn        
        //    32: astore_1       
        //    33: aload_1        
        //    34: athrow         
        //    35: astore_2       
        //    36: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //    39: dup            
        //    40: aload_2        
        //    41: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //    44: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      27     32     35     Landroid/os/RemoteException;
        //  27     32     35     45     Landroid/os/RemoteException;
        //  33     35     35     45     Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    public final boolean isTrafficEnabled() {
        try {
            return this.zzaBp.isTrafficEnabled();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void moveCamera(final CameraUpdate cameraUpdate) {
        try {
            this.zzaBp.moveCamera(cameraUpdate.zzvg());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final boolean setIndoorEnabled(final boolean indoorEnabled) {
        try {
            return this.zzaBp.setIndoorEnabled(indoorEnabled);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void setMapType(final int mapType) {
        try {
            this.zzaBp.setMapType(mapType);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void setMyLocationEnabled(final boolean myLocationEnabled) {
        try {
            this.zzaBp.setMyLocationEnabled(myLocationEnabled);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void setOnCameraChangeListener(final GoogleMap$OnCameraChangeListener p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       24
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //     8: aconst_null    
        //     9: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.setOnCameraChangeListener:(Lcom/google/android/gms/maps/internal/zzf;)V
        //    14: getstatic       com/google/android/gms/maps/MapView.a:I
        //    17: istore          5
        //    19: iload           5
        //    21: ifeq            61
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //    28: new             Lcom/google/android/gms/maps/GoogleMap$7;
        //    31: dup            
        //    32: aload_0        
        //    33: aload_1        
        //    34: invokespecial   com/google/android/gms/maps/GoogleMap$7.<init>:(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V
        //    37: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.setOnCameraChangeListener:(Lcom/google/android/gms/maps/internal/zzf;)V
        //    42: return         
        //    43: astore          4
        //    45: aload           4
        //    47: athrow         
        //    48: astore_2       
        //    49: aload_2        
        //    50: athrow         
        //    51: astore_3       
        //    52: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //    55: dup            
        //    56: aload_3        
        //    57: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //    60: athrow         
        //    61: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      19     43     48     Landroid/os/RemoteException;
        //  24     42     48     61     Landroid/os/RemoteException;
        //  45     48     48     61     Landroid/os/RemoteException;
        //  49     51     51     61     Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public final void setOnInfoWindowClickListener(final GoogleMap$OnInfoWindowClickListener p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       24
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //     8: aconst_null    
        //     9: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.setOnInfoWindowClickListener:(Lcom/google/android/gms/maps/internal/zzh;)V
        //    14: getstatic       com/google/android/gms/maps/MapView.a:I
        //    17: istore          5
        //    19: iload           5
        //    21: ifeq            61
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //    28: new             Lcom/google/android/gms/maps/GoogleMap$12;
        //    31: dup            
        //    32: aload_0        
        //    33: aload_1        
        //    34: invokespecial   com/google/android/gms/maps/GoogleMap$12.<init>:(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V
        //    37: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.setOnInfoWindowClickListener:(Lcom/google/android/gms/maps/internal/zzh;)V
        //    42: return         
        //    43: astore          4
        //    45: aload           4
        //    47: athrow         
        //    48: astore_2       
        //    49: aload_2        
        //    50: athrow         
        //    51: astore_3       
        //    52: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //    55: dup            
        //    56: aload_3        
        //    57: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //    60: athrow         
        //    61: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      19     43     48     Landroid/os/RemoteException;
        //  24     42     48     61     Landroid/os/RemoteException;
        //  45     48     48     61     Landroid/os/RemoteException;
        //  49     51     51     61     Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public final void setOnMapClickListener(final GoogleMap$OnMapClickListener p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       24
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //     8: aconst_null    
        //     9: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.setOnMapClickListener:(Lcom/google/android/gms/maps/internal/zzj;)V
        //    14: getstatic       com/google/android/gms/maps/MapView.a:I
        //    17: istore          5
        //    19: iload           5
        //    21: ifeq            61
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //    28: new             Lcom/google/android/gms/maps/GoogleMap$8;
        //    31: dup            
        //    32: aload_0        
        //    33: aload_1        
        //    34: invokespecial   com/google/android/gms/maps/GoogleMap$8.<init>:(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V
        //    37: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.setOnMapClickListener:(Lcom/google/android/gms/maps/internal/zzj;)V
        //    42: return         
        //    43: astore          4
        //    45: aload           4
        //    47: athrow         
        //    48: astore_2       
        //    49: aload_2        
        //    50: athrow         
        //    51: astore_3       
        //    52: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //    55: dup            
        //    56: aload_3        
        //    57: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //    60: athrow         
        //    61: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      19     43     48     Landroid/os/RemoteException;
        //  24     42     48     61     Landroid/os/RemoteException;
        //  45     48     48     61     Landroid/os/RemoteException;
        //  49     51     51     61     Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public final void setOnMarkerClickListener(final GoogleMap$OnMarkerClickListener p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       24
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //     8: aconst_null    
        //     9: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.setOnMarkerClickListener:(Lcom/google/android/gms/maps/internal/zzn;)V
        //    14: getstatic       com/google/android/gms/maps/MapView.a:I
        //    17: istore          5
        //    19: iload           5
        //    21: ifeq            61
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/maps/GoogleMap.zzaBp:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
        //    28: new             Lcom/google/android/gms/maps/GoogleMap$10;
        //    31: dup            
        //    32: aload_0        
        //    33: aload_1        
        //    34: invokespecial   com/google/android/gms/maps/GoogleMap$10.<init>:(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V
        //    37: invokeinterface com/google/android/gms/maps/internal/IGoogleMapDelegate.setOnMarkerClickListener:(Lcom/google/android/gms/maps/internal/zzn;)V
        //    42: return         
        //    43: astore          4
        //    45: aload           4
        //    47: athrow         
        //    48: astore_2       
        //    49: aload_2        
        //    50: athrow         
        //    51: astore_3       
        //    52: new             Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //    55: dup            
        //    56: aload_3        
        //    57: invokespecial   com/google/android/gms/maps/model/RuntimeRemoteException.<init>:(Landroid/os/RemoteException;)V
        //    60: athrow         
        //    61: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      19     43     48     Landroid/os/RemoteException;
        //  24     42     48     61     Landroid/os/RemoteException;
        //  45     48     48     61     Landroid/os/RemoteException;
        //  49     51     51     61     Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
        try {
            this.zzaBp.setPadding(n, n2, n3, n4);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void setTrafficEnabled(final boolean trafficEnabled) {
        try {
            this.zzaBp.setTrafficEnabled(trafficEnabled);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void stopAnimation() {
        try {
            this.zzaBp.stopAnimation();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
