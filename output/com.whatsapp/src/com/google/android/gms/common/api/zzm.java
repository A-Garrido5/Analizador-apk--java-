// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Parcelable;
import android.os.Bundle;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.Log;
import android.support.v4.app.FragmentActivity;
import android.os.Looper;
import android.util.SparseArray;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import android.content.DialogInterface$OnCancelListener;
import android.support.v4.app.Fragment;

public class zzm extends Fragment implements DialogInterface$OnCancelListener
{
    private boolean mStarted;
    private boolean zzXV;
    private int zzXW;
    private ConnectionResult zzXX;
    private final Handler zzXY;
    private final SparseArray zzXZ;
    
    public zzm() {
        this.zzXW = -1;
        this.zzXY = new Handler(Looper.getMainLooper());
        this.zzXZ = new SparseArray();
    }
    
    static int zza(final zzm zzm, final int zzXW) {
        return zzm.zzXW = zzXW;
    }
    
    static ConnectionResult zza(final zzm zzm, final ConnectionResult zzXX) {
        return zzm.zzXX = zzXX;
    }
    
    public static zzm zza(final FragmentActivity p0) {
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
        //    11: ldc             "GmsSupportLifecycleFragment"
        //    13: invokevirtual   android/support/v4/app/FragmentManager.findFragmentByTag:(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
        //    16: checkcast       Lcom/google/android/gms/common/api/zzm;
        //    19: astore_3       
        //    20: aload_3        
        //    21: ifnull          35
        //    24: aload_3        
        //    25: invokevirtual   com/google/android/gms/common/api/zzm.isRemoving:()Z
        //    28: istore          7
        //    30: iload           7
        //    32: ifeq            62
        //    35: new             Lcom/google/android/gms/common/api/zzm;
        //    38: dup            
        //    39: invokespecial   com/google/android/gms/common/api/zzm.<init>:()V
        //    42: astore_3       
        //    43: aload_1        
        //    44: invokevirtual   android/support/v4/app/FragmentManager.beginTransaction:()Landroid/support/v4/app/FragmentTransaction;
        //    47: aload_3        
        //    48: ldc             "GmsSupportLifecycleFragment"
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
        //    69: ldc             "Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment"
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
    
    private void zza(final int n, final ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        final zzm$zza zzm$zza = (zzm$zza)this.zzXZ.get(n);
        Label_0051: {
            if (zzm$zza == null) {
                break Label_0051;
            }
            this.zzbb(n);
            final GoogleApiClient$OnConnectionFailedListener zzYc = zzm$zza.zzYc;
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
    
    static void zza(final zzm zzm, final int n, final ConnectionResult connectionResult) {
        zzm.zza(n, connectionResult);
    }
    
    static boolean zza(final zzm zzm) {
        return zzm.mStarted;
    }
    
    static boolean zza(final zzm zzm, final boolean zzXV) {
        return zzm.zzXV = zzXV;
    }
    
    static boolean zzb(final zzm zzm) {
        return zzm.zzXV;
    }
    
    static void zzc(final zzm zzm) {
        zzm.zzmV();
    }
    
    static Handler zzd(final zzm zzm) {
        return zzm.zzXY;
    }
    
    private void zzmV() {
        final boolean a = Api.a;
        this.zzXV = false;
        this.zzXW = -1;
        this.zzXX = null;
        int n;
        for (int i = 0; i < this.zzXZ.size(); i = n) {
            ((zzm$zza)this.zzXZ.valueAt(i)).zzYb.connect();
            n = i + 1;
            if (a) {
                break;
            }
        }
    }
    
    @Override
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final boolean a = Api.a;
        super.dump(s, fileDescriptor, printWriter, array);
        int n;
        for (int i = 0; i < this.zzXZ.size(); i = n) {
            ((zzm$zza)this.zzXZ.valueAt(i)).dump(s, fileDescriptor, printWriter, array);
            n = i + 1;
            if (a) {
                break;
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
            final zzm zzm = this;
            final Bundle bundle2 = bundle;
            final String s = "resolving_error";
            final boolean b = false;
            final boolean b2 = bundle2.getBoolean(s, b);
            zzm.zzXV = b2;
            final zzm zzm2 = this;
            final Bundle bundle3 = bundle;
            final String s2 = "failed_client_id";
            final int n = -1;
            final int n2 = bundle3.getInt(s2, n);
            zzm2.zzXW = n2;
            final zzm zzm3 = this;
            final int n3 = zzm3.zzXW;
            if (n3 >= 0) {
                final zzm zzm4 = this;
                final Bundle bundle4 = bundle;
                final String s3 = "failed_status";
                final int n4 = bundle4.getInt(s3);
                final Bundle bundle5 = bundle;
                final String s4 = "failed_resolution";
                final Parcelable parcelable = bundle5.getParcelable(s4);
                final PendingIntent pendingIntent = (PendingIntent)parcelable;
                final ConnectionResult connectionResult = new ConnectionResult(n4, pendingIntent);
                zzm4.zzXX = connectionResult;
            }
            return;
        }
        catch (ClassCastException ex) {
            throw ex;
        }
        try {
            final zzm zzm = this;
            final Bundle bundle2 = bundle;
            final String s = "resolving_error";
            final boolean b = false;
            final boolean b2 = bundle2.getBoolean(s, b);
            zzm.zzXV = b2;
            final zzm zzm2 = this;
            final Bundle bundle3 = bundle;
            final String s2 = "failed_client_id";
            final int n = -1;
            final int n2 = bundle3.getInt(s2, n);
            zzm2.zzXW = n2;
            final zzm zzm3 = this;
            final int n3 = zzm3.zzXW;
            if (n3 >= 0) {
                final zzm zzm4 = this;
                final Bundle bundle4 = bundle;
                final String s3 = "failed_status";
                final int n4 = bundle4.getInt(s3);
                final Bundle bundle5 = bundle;
                final String s4 = "failed_resolution";
                final Parcelable parcelable = bundle5.getParcelable(s4);
                final PendingIntent pendingIntent = (PendingIntent)parcelable;
                final ConnectionResult connectionResult = new ConnectionResult(n4, pendingIntent);
                zzm4.zzXX = connectionResult;
            }
        }
        catch (ClassCastException ex2) {
            throw ex2;
        }
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
        this.mStarted = true;
        if (!this.zzXV) {
            int n;
            for (int i = 0; i < this.zzXZ.size(); i = n) {
                ((zzm$zza)this.zzXZ.valueAt(i)).zzYb.connect();
                n = i + 1;
                if (a) {
                    break;
                }
            }
        }
    }
    
    @Override
    public void onStop() {
        final boolean a = Api.a;
        super.onStop();
        this.mStarted = false;
        int n;
        for (int i = 0; i < this.zzXZ.size(); i = n) {
            ((zzm$zza)this.zzXZ.valueAt(i)).zzYb.disconnect();
            n = i + 1;
            if (a) {
                break;
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
        //     1: ldc             "GoogleApiClient instance cannot be null"
        //     3: invokestatic    com/google/android/gms/common/internal/zzu.zzb:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //     6: pop            
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/api/zzm.zzXZ:Landroid/util/SparseArray;
        //    11: iload_1        
        //    12: invokevirtual   android/util/SparseArray.indexOfKey:(I)I
        //    15: istore          6
        //    17: iload           6
        //    19: ifge            103
        //    22: iconst_1       
        //    23: istore          7
        //    25: iload           7
        //    27: new             Ljava/lang/StringBuilder;
        //    30: dup            
        //    31: invokespecial   java/lang/StringBuilder.<init>:()V
        //    34: ldc_w           "Already managing a GoogleApiClient with id "
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: iload_1        
        //    41: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    44: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    47: invokestatic    com/google/android/gms/common/internal/zzu.zza:(ZLjava/lang/Object;)V
        //    50: new             Lcom/google/android/gms/common/api/zzm$zza;
        //    53: dup            
        //    54: aload_0        
        //    55: iload_1        
        //    56: aload_2        
        //    57: aload_3        
        //    58: invokespecial   com/google/android/gms/common/api/zzm$zza.<init>:(Lcom/google/android/gms/common/api/zzm;ILcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
        //    61: astore          8
        //    63: aload_0        
        //    64: getfield        com/google/android/gms/common/api/zzm.zzXZ:Landroid/util/SparseArray;
        //    67: iload_1        
        //    68: aload           8
        //    70: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //    73: aload_0        
        //    74: getfield        com/google/android/gms/common/api/zzm.mStarted:Z
        //    77: istore          11
        //    79: iload           11
        //    81: ifeq            97
        //    84: aload_0        
        //    85: getfield        com/google/android/gms/common/api/zzm.zzXV:Z
        //    88: ifne            97
        //    91: aload_2        
        //    92: invokeinterface com/google/android/gms/common/api/GoogleApiClient.connect:()V
        //    97: return         
        //    98: astore          4
        //   100: aload           4
        //   102: athrow         
        //   103: iconst_0       
        //   104: istore          7
        //   106: goto            25
        //   109: astore          9
        //   111: aload           9
        //   113: athrow         
        //   114: astore          10
        //   116: aload           10
        //   118: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  0      17     98     103    Ljava/lang/ClassCastException;
        //  63     79     109    114    Ljava/lang/ClassCastException;
        //  84     97     114    119    Ljava/lang/ClassCastException;
        //  111    114    114    119    Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
    
    public void zzbb(final int n) {
        final zzm$zza zzm$zza = (zzm$zza)this.zzXZ.get(n);
        try {
            this.zzXZ.remove(n);
            if (zzm$zza != null) {
                zzm$zza.zzmW();
            }
        }
        catch (ClassCastException ex) {
            throw ex;
        }
    }
}
