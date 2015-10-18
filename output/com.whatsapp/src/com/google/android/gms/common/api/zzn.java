// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.support.v4.content.Loader;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.content.Intent;
import android.support.v4.app.LoaderManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.os.Looper;
import android.util.SparseArray;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.content.DialogInterface$OnCancelListener;
import android.support.v4.app.Fragment;

public class zzn extends Fragment implements DialogInterface$OnCancelListener, LoaderManager$LoaderCallbacks
{
    private boolean zzXV;
    private int zzXW;
    private ConnectionResult zzXX;
    private final Handler zzXY;
    private final SparseArray zzXZ;
    
    public zzn() {
        this.zzXW = -1;
        this.zzXY = new Handler(Looper.getMainLooper());
        this.zzXZ = new SparseArray();
    }
    
    private void zza(final int n, final ConnectionResult connectionResult) {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        final zzn$zzb zzn$zzb = (zzn$zzb)this.zzXZ.get(n);
        Label_0051: {
            if (zzn$zzb == null) {
                break Label_0051;
            }
            this.zzbb(n);
            final GoogleApiClient$OnConnectionFailedListener zzYc = zzn$zzb.zzYc;
            if (zzYc == null) {
                break Label_0051;
            }
            try {
                zzYc.onConnectionFailed(connectionResult);
                this.zzmV();
            }
            catch (ClassCastException ex) {
                throw ex;
            }
        }
    }
    
    static void zza(final zzn zzn) {
        zzn.zzmV();
    }
    
    static void zza(final zzn zzn, final int n, final ConnectionResult connectionResult) {
        zzn.zza(n, connectionResult);
    }
    
    public static zzn zzb(final FragmentActivity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             "Must be called from main thread of process"
        //     2: invokestatic    com/google/android/gms/common/internal/zzu.zzbY:(Ljava/lang/String;)V
        //     5: aload_0        
        //     6: invokevirtual   android/support/v4/app/FragmentActivity.getSupportFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //     9: astore_1       
        //    10: aload_1        
        //    11: ldc             "GmsSupportLoaderLifecycleFragment"
        //    13: invokevirtual   android/support/v4/app/FragmentManager.findFragmentByTag:(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
        //    16: checkcast       Lcom/google/android/gms/common/api/zzn;
        //    19: astore_3       
        //    20: aload_3        
        //    21: ifnull          35
        //    24: aload_3        
        //    25: invokevirtual   com/google/android/gms/common/api/zzn.isRemoving:()Z
        //    28: istore          7
        //    30: iload           7
        //    32: ifeq            62
        //    35: new             Lcom/google/android/gms/common/api/zzn;
        //    38: dup            
        //    39: invokespecial   com/google/android/gms/common/api/zzn.<init>:()V
        //    42: astore_3       
        //    43: aload_1        
        //    44: invokevirtual   android/support/v4/app/FragmentManager.beginTransaction:()Landroid/support/v4/app/FragmentTransaction;
        //    47: aload_3        
        //    48: ldc             "GmsSupportLoaderLifecycleFragment"
        //    50: invokevirtual   android/support/v4/app/FragmentTransaction.add:(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
        //    53: invokevirtual   android/support/v4/app/FragmentTransaction.commit:()I
        //    56: pop            
        //    57: aload_1        
        //    58: invokevirtual   android/support/v4/app/FragmentManager.executePendingTransactions:()Z
        //    61: pop            
        //    62: aload_3        
        //    63: areturn        
        //    64: astore_2       
        //    65: new             Ljava/lang/IllegalStateException;
        //    68: dup            
        //    69: ldc             "Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment"
        //    71: aload_2        
        //    72: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    75: athrow         
        //    76: astore          6
        //    78: aload           6
        //    80: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  10     20     64     76     Ljava/lang/ClassCastException;
        //  24     30     76     81     Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    private void zzb(final int zzXW, final ConnectionResult zzXX) {
        try {
            if (!this.zzXV) {
                this.zzXV = true;
                this.zzXW = zzXW;
                this.zzXX = zzXX;
                this.zzXY.post((Runnable)new zzn$zzc(this, zzXW, zzXX));
            }
        }
        catch (ClassCastException ex) {
            throw ex;
        }
    }
    
    private void zzmV() {
        int n = 0;
        final boolean a = Api.a;
        this.zzXV = false;
        this.zzXW = -1;
        this.zzXX = null;
        final LoaderManager loaderManager = this.getLoaderManager();
        while (true) {
            if (n >= this.zzXZ.size()) {
                return;
            }
            final int key = this.zzXZ.keyAt(n);
            final zzn$zza zzbd = this.zzbd(key);
            Label_0083: {
                if (zzbd == null) {
                    break Label_0083;
                }
                try {
                    if (zzbd.zzmX()) {
                        loaderManager.destroyLoader(key);
                        loaderManager.initLoader(key, null, this);
                    }
                    ++n;
                    if (a) {
                        return;
                    }
                    continue;
                }
                catch (ClassCastException ex) {
                    throw ex;
                }
            }
        }
    }
    
    @Override
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        int n3 = 1;
        final boolean a = Api.a;
        int n4 = 0;
        while (true) {
            while (true) {
                Label_0040: {
                    Label_0067: {
                        switch (n) {
                            case 2: {
                                break Label_0067;
                            }
                            case 1: {
                                Label_0093: {
                                    break Label_0093;
                                    try {
                                        this.zzmV();
                                        if (a) {
                                            this.zza(this.zzXW, this.zzXX);
                                        }
                                        return;
                                        try {
                                            final int googlePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)this.getActivity());
                                            n4 = 0;
                                            if (googlePlayServicesAvailable != 0) {
                                                break;
                                            }
                                            if (!a) {
                                                break Label_0040;
                                            }
                                            n4 = n3;
                                            if (n2 == -1) {
                                                break Label_0040;
                                            }
                                            break;
                                        }
                                        catch (ClassCastException ex) {
                                            throw ex;
                                        }
                                    }
                                    catch (ClassCastException ex2) {
                                        throw ex2;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    n3 = n4;
                }
                if (n3 != 0) {
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    @Override
    public void onAttach(final Activity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   android/support/v4/app/Fragment.onAttach:(Landroid/app/Activity;)V
        //     9: iconst_0       
        //    10: istore_3       
        //    11: iload_3        
        //    12: aload_0        
        //    13: getfield        com/google/android/gms/common/api/zzn.zzXZ:Landroid/util/SparseArray;
        //    16: invokevirtual   android/util/SparseArray.size:()I
        //    19: if_icmpge       135
        //    22: aload_0        
        //    23: getfield        com/google/android/gms/common/api/zzn.zzXZ:Landroid/util/SparseArray;
        //    26: iload_3        
        //    27: invokevirtual   android/util/SparseArray.keyAt:(I)I
        //    30: istore          4
        //    32: aload_0        
        //    33: iload           4
        //    35: invokevirtual   com/google/android/gms/common/api/zzn.zzbd:(I)Lcom/google/android/gms/common/api/zzn$zza;
        //    38: astore          5
        //    40: aload           5
        //    42: ifnull          95
        //    45: aload_0        
        //    46: getfield        com/google/android/gms/common/api/zzn.zzXZ:Landroid/util/SparseArray;
        //    49: iload_3        
        //    50: invokevirtual   android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
        //    53: checkcast       Lcom/google/android/gms/common/api/zzn$zzb;
        //    56: astore          9
        //    58: aload           9
        //    60: getfield        com/google/android/gms/common/api/zzn$zzb.zzYb:Lcom/google/android/gms/common/api/GoogleApiClient;
        //    63: astore          11
        //    65: aload           5
        //    67: getfield        com/google/android/gms/common/api/zzn$zza.zzYb:Lcom/google/android/gms/common/api/GoogleApiClient;
        //    70: astore          12
        //    72: aload           11
        //    74: aload           12
        //    76: if_acmpeq       95
        //    79: aload_0        
        //    80: invokevirtual   com/google/android/gms/common/api/zzn.getLoaderManager:()Landroid/support/v4/app/LoaderManager;
        //    83: iload           4
        //    85: aconst_null    
        //    86: aload_0        
        //    87: invokevirtual   android/support/v4/app/LoaderManager.restartLoader:(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;
        //    90: pop            
        //    91: iload_2        
        //    92: ifeq            126
        //    95: aload_0        
        //    96: invokevirtual   com/google/android/gms/common/api/zzn.getLoaderManager:()Landroid/support/v4/app/LoaderManager;
        //    99: iload           4
        //   101: aconst_null    
        //   102: aload_0        
        //   103: invokevirtual   android/support/v4/app/LoaderManager.initLoader:(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;
        //   106: pop            
        //   107: goto            126
        //   110: astore          10
        //   112: aload           10
        //   114: athrow         
        //   115: astore          6
        //   117: aload           6
        //   119: athrow         
        //   120: iload           8
        //   122: istore_3       
        //   123: goto            11
        //   126: iload_3        
        //   127: iconst_1       
        //   128: iadd           
        //   129: istore          8
        //   131: iload_2        
        //   132: ifeq            120
        //   135: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  58     72     110    115    Ljava/lang/ClassCastException;
        //  79     91     115    120    Ljava/lang/ClassCastException;
        //  95     107    115    120    Ljava/lang/ClassCastException;
        //  112    115    115    120    Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
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
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.zza(this.zzXW, new ConnectionResult(13, null));
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (bundle == null) {
                return;
            }
            final zzn zzn = this;
            final Bundle bundle2 = bundle;
            final String s = "resolving_error";
            final boolean b = false;
            final boolean b2 = bundle2.getBoolean(s, b);
            zzn.zzXV = b2;
            final zzn zzn2 = this;
            final Bundle bundle3 = bundle;
            final String s2 = "failed_client_id";
            final int n = -1;
            final int n2 = bundle3.getInt(s2, n);
            zzn2.zzXW = n2;
            final zzn zzn3 = this;
            final int n3 = zzn3.zzXW;
            if (n3 >= 0) {
                final zzn zzn4 = this;
                final Bundle bundle4 = bundle;
                final String s3 = "failed_status";
                final int n4 = bundle4.getInt(s3);
                final Bundle bundle5 = bundle;
                final String s4 = "failed_resolution";
                final Parcelable parcelable = bundle5.getParcelable(s4);
                final PendingIntent pendingIntent = (PendingIntent)parcelable;
                final ConnectionResult connectionResult = new ConnectionResult(n4, pendingIntent);
                zzn4.zzXX = connectionResult;
            }
            return;
        }
        catch (ClassCastException ex) {
            throw ex;
        }
        try {
            final zzn zzn = this;
            final Bundle bundle2 = bundle;
            final String s = "resolving_error";
            final boolean b = false;
            final boolean b2 = bundle2.getBoolean(s, b);
            zzn.zzXV = b2;
            final zzn zzn2 = this;
            final Bundle bundle3 = bundle;
            final String s2 = "failed_client_id";
            final int n = -1;
            final int n2 = bundle3.getInt(s2, n);
            zzn2.zzXW = n2;
            final zzn zzn3 = this;
            final int n3 = zzn3.zzXW;
            if (n3 >= 0) {
                final zzn zzn4 = this;
                final Bundle bundle4 = bundle;
                final String s3 = "failed_status";
                final int n4 = bundle4.getInt(s3);
                final Bundle bundle5 = bundle;
                final String s4 = "failed_resolution";
                final Parcelable parcelable = bundle5.getParcelable(s4);
                final PendingIntent pendingIntent = (PendingIntent)parcelable;
                final ConnectionResult connectionResult = new ConnectionResult(n4, pendingIntent);
                zzn4.zzXX = connectionResult;
            }
        }
        catch (ClassCastException ex2) {
            throw ex2;
        }
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new zzn$zza((Context)this.getActivity(), ((zzn$zzb)this.zzXZ.get(n)).zzYb);
    }
    
    public void onLoadFinished(final Loader loader, final Object o) {
        this.zza(loader, (ConnectionResult)o);
    }
    
    public void onLoaderReset(final Loader loader) {
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("resolving_error", this.zzXV);
            if (this.zzXW >= 0) {
                bundle.putInt("failed_client_id", this.zzXW);
                bundle.putInt("failed_status", this.zzXX.getErrorCode());
                bundle.putParcelable("failed_resolution", (Parcelable)this.zzXX.getResolution());
            }
        }
        catch (ClassCastException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onStart() {
        final boolean a = Api.a;
        super.onStart();
        if (!this.zzXV) {
            int i = 0;
            while (i < this.zzXZ.size()) {
                this.getLoaderManager().initLoader(this.zzXZ.keyAt(i), null, this);
                ++i;
                if (a) {
                    break;
                }
            }
        }
    }
    
    public void zza(final int p0, final GoogleApiClient p1, final GoogleApiClient$OnConnectionFailedListener p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: ldc_w           "GoogleApiClient instance cannot be null"
        //     4: invokestatic    com/google/android/gms/common/internal/zzu.zzb:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //     7: pop            
        //     8: aload_0        
        //     9: getfield        com/google/android/gms/common/api/zzn.zzXZ:Landroid/util/SparseArray;
        //    12: iload_1        
        //    13: invokevirtual   android/util/SparseArray.indexOfKey:(I)I
        //    16: istore          6
        //    18: iconst_0       
        //    19: istore          7
        //    21: iload           6
        //    23: ifge            29
        //    26: iconst_1       
        //    27: istore          7
        //    29: iload           7
        //    31: new             Ljava/lang/StringBuilder;
        //    34: dup            
        //    35: invokespecial   java/lang/StringBuilder.<init>:()V
        //    38: ldc_w           "Already managing a GoogleApiClient with id "
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: iload_1        
        //    45: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    48: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    51: invokestatic    com/google/android/gms/common/internal/zzu.zza:(ZLjava/lang/Object;)V
        //    54: new             Lcom/google/android/gms/common/api/zzn$zzb;
        //    57: dup            
        //    58: aload_2        
        //    59: aload_3        
        //    60: aconst_null    
        //    61: invokespecial   com/google/android/gms/common/api/zzn$zzb.<init>:(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/common/api/zzn$1;)V
        //    64: astore          8
        //    66: aload_0        
        //    67: getfield        com/google/android/gms/common/api/zzn.zzXZ:Landroid/util/SparseArray;
        //    70: iload_1        
        //    71: aload           8
        //    73: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //    76: aload_0        
        //    77: invokevirtual   com/google/android/gms/common/api/zzn.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    80: ifnull          98
        //    83: iconst_0       
        //    84: invokestatic    android/support/v4/app/LoaderManager.enableDebugLogging:(Z)V
        //    87: aload_0        
        //    88: invokevirtual   com/google/android/gms/common/api/zzn.getLoaderManager:()Landroid/support/v4/app/LoaderManager;
        //    91: iload_1        
        //    92: aconst_null    
        //    93: aload_0        
        //    94: invokevirtual   android/support/v4/app/LoaderManager.initLoader:(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;
        //    97: pop            
        //    98: return         
        //    99: astore          4
        //   101: aload           4
        //   103: athrow         
        //   104: astore          9
        //   106: aload           9
        //   108: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  0      18     99     104    Ljava/lang/ClassCastException;
        //  66     98     104    109    Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
    
    public void zza(final Loader loader, final ConnectionResult connectionResult) {
        try {
            if (!connectionResult.isSuccess()) {
                this.zzb(loader.getId(), connectionResult);
            }
        }
        catch (ClassCastException ex) {
            throw ex;
        }
    }
    
    public void zzbb(final int n) {
        this.zzXZ.remove(n);
        this.getLoaderManager().destroyLoader(n);
    }
    
    public GoogleApiClient zzbc(final int n) {
        if (this.getActivity() != null) {
            final zzn$zza zzbd = this.zzbd(n);
            if (zzbd != null) {
                try {
                    return zzbd.zzYb;
                }
                catch (ClassCastException ex) {
                    throw ex;
                }
            }
        }
        return null;
    }
    
    zzn$zza zzbd(final int n) {
        try {
            return (zzn$zza)this.getLoaderManager().getLoader(n);
        }
        catch (ClassCastException ex) {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", ex);
        }
    }
}
