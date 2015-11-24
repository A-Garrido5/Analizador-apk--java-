// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import java.util.Collection;
import java.util.Iterator;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.util.HashSet;
import java.util.Map;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.zzps;
import java.util.Set;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
import android.content.Context;

public class zze implements zzh
{
    private final Context mContext;
    private final Api$zza zzWE;
    private final zzg zzWK;
    private final Lock zzWL;
    private ConnectionResult zzWM;
    private int zzWN;
    private int zzWO;
    private boolean zzWP;
    private int zzWQ;
    private final Bundle zzWR;
    private final Set zzWS;
    private zzps zzWT;
    private int zzWU;
    private boolean zzWV;
    private boolean zzWW;
    private IAccountAccessor zzWX;
    private boolean zzWY;
    private boolean zzWZ;
    private final com.google.android.gms.common.internal.zze zzXa;
    private final Map zzXb;
    
    public zze(final zzg zzWK, final com.google.android.gms.common.internal.zze zzXa, final Map zzXb, final Api$zza zzWE, final Lock zzWL, final Context mContext) {
        this.zzWO = 0;
        this.zzWP = false;
        this.zzWR = new Bundle();
        this.zzWS = new HashSet();
        this.zzWK = zzWK;
        this.zzXa = zzXa;
        this.zzXb = zzXb;
        this.zzWE = zzWE;
        this.zzWL = zzWL;
        this.mContext = mContext;
    }
    
    private void zzT(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/api/zze.zzWT:Lcom/google/android/gms/internal/zzps;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          54
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/common/api/zze.zzWT:Lcom/google/android/gms/internal/zzps;
        //    15: invokeinterface com/google/android/gms/internal/zzps.isConnected:()Z
        //    20: istore          6
        //    22: iload           6
        //    24: ifeq            49
        //    27: iload_1        
        //    28: ifeq            40
        //    31: aload_0        
        //    32: getfield        com/google/android/gms/common/api/zze.zzWT:Lcom/google/android/gms/internal/zzps;
        //    35: invokeinterface com/google/android/gms/internal/zzps.zzxY:()V
        //    40: aload_0        
        //    41: getfield        com/google/android/gms/common/api/zze.zzWT:Lcom/google/android/gms/internal/zzps;
        //    44: invokeinterface com/google/android/gms/internal/zzps.disconnect:()V
        //    49: aload_0        
        //    50: aconst_null    
        //    51: putfield        com/google/android/gms/common/api/zze.zzWX:Lcom/google/android/gms/common/internal/IAccountAccessor;
        //    54: return         
        //    55: astore_2       
        //    56: aload_2        
        //    57: athrow         
        //    58: astore_3       
        //    59: aload_3        
        //    60: athrow         
        //    61: astore          4
        //    63: aload           4
        //    65: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      55     58     Ljava/lang/IllegalStateException;
        //  11     22     58     61     Ljava/lang/IllegalStateException;
        //  31     40     61     66     Ljava/lang/IllegalStateException;
        //  56     58     58     61     Ljava/lang/IllegalStateException;
        //  59     61     61     66     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 32, Size: 32
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
    
    static Lock zza(final zze zze) {
        return zze.zzWL;
    }
    
    private void zza(final ConnectionResult p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/common/api/zze.zzWL:Ljava/util/concurrent/locks/Lock;
        //     8: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    13: aload_0        
        //    14: iconst_2       
        //    15: invokespecial   com/google/android/gms/common/api/zze.zzaW:(I)Z
        //    18: istore          4
        //    20: iload           4
        //    22: ifne            35
        //    25: aload_0        
        //    26: getfield        com/google/android/gms/common/api/zze.zzWL:Ljava/util/concurrent/locks/Lock;
        //    29: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    34: return         
        //    35: aload_1        
        //    36: invokevirtual   com/google/android/gms/common/ConnectionResult.isSuccess:()Z
        //    39: ifeq            50
        //    42: aload_0        
        //    43: invokespecial   com/google/android/gms/common/api/zze.zzmG:()V
        //    46: iload_2        
        //    47: ifeq            79
        //    50: aload_0        
        //    51: aload_1        
        //    52: invokespecial   com/google/android/gms/common/api/zze.zzc:(Lcom/google/android/gms/common/ConnectionResult;)Z
        //    55: istore          9
        //    57: iload           9
        //    59: ifeq            74
        //    62: aload_0        
        //    63: invokespecial   com/google/android/gms/common/api/zze.zzmI:()V
        //    66: aload_0        
        //    67: invokespecial   com/google/android/gms/common/api/zze.zzmG:()V
        //    70: iload_2        
        //    71: ifeq            79
        //    74: aload_0        
        //    75: aload_1        
        //    76: invokespecial   com/google/android/gms/common/api/zze.zzd:(Lcom/google/android/gms/common/ConnectionResult;)V
        //    79: aload_0        
        //    80: getfield        com/google/android/gms/common/api/zze.zzWL:Ljava/util/concurrent/locks/Lock;
        //    83: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    88: return         
        //    89: astore          5
        //    91: aload           5
        //    93: athrow         
        //    94: astore          6
        //    96: aload           6
        //    98: athrow         
        //    99: astore          7
        //   101: aload           7
        //   103: athrow         
        //   104: astore          8
        //   106: aload           8
        //   108: athrow         
        //   109: astore_3       
        //   110: aload_0        
        //   111: getfield        com/google/android/gms/common/api/zze.zzWL:Ljava/util/concurrent/locks/Lock;
        //   114: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   119: aload_3        
        //   120: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  13     20     109    121    Any
        //  35     46     89     94     Ljava/lang/IllegalStateException;
        //  35     46     109    121    Any
        //  50     57     94     99     Ljava/lang/IllegalStateException;
        //  50     57     109    121    Any
        //  62     70     99     104    Ljava/lang/IllegalStateException;
        //  62     70     109    121    Any
        //  74     79     104    109    Ljava/lang/IllegalStateException;
        //  74     79     109    121    Any
        //  91     94     94     99     Ljava/lang/IllegalStateException;
        //  91     94     109    121    Any
        //  96     99     99     104    Ljava/lang/IllegalStateException;
        //  96     99     109    121    Any
        //  101    104    104    109    Ljava/lang/IllegalStateException;
        //  101    104    109    121    Any
        //  106    109    109    121    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    static void zza(final zze zze, final ConnectionResult connectionResult) {
        zze.zzd(connectionResult);
    }
    
    static void zza(final zze zze, final ConnectionResult connectionResult, final Api api, final int n) {
        zze.zzb(connectionResult, api, n);
    }
    
    static void zza(final zze zze, final ResolveAccountResponse resolveAccountResponse) {
        zze.zza(resolveAccountResponse);
    }
    
    private void zza(final ResolveAccountResponse p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   com/google/android/gms/common/internal/ResolveAccountResponse.zzoa:()Lcom/google/android/gms/common/ConnectionResult;
        //     8: astore_3       
        //     9: aload_0        
        //    10: getfield        com/google/android/gms/common/api/zze.zzWL:Ljava/util/concurrent/locks/Lock;
        //    13: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    18: aload_0        
        //    19: iconst_0       
        //    20: invokespecial   com/google/android/gms/common/api/zze.zzaW:(I)Z
        //    23: istore          5
        //    25: iload           5
        //    27: ifne            40
        //    30: aload_0        
        //    31: getfield        com/google/android/gms/common/api/zze.zzWL:Ljava/util/concurrent/locks/Lock;
        //    34: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    39: return         
        //    40: aload_3        
        //    41: invokevirtual   com/google/android/gms/common/ConnectionResult.isSuccess:()Z
        //    44: ifeq            84
        //    47: aload_0        
        //    48: aload_1        
        //    49: invokevirtual   com/google/android/gms/common/internal/ResolveAccountResponse.zznZ:()Lcom/google/android/gms/common/internal/IAccountAccessor;
        //    52: putfield        com/google/android/gms/common/api/zze.zzWX:Lcom/google/android/gms/common/internal/IAccountAccessor;
        //    55: aload_0        
        //    56: iconst_1       
        //    57: putfield        com/google/android/gms/common/api/zze.zzWW:Z
        //    60: aload_0        
        //    61: aload_1        
        //    62: invokevirtual   com/google/android/gms/common/internal/ResolveAccountResponse.zzob:()Z
        //    65: putfield        com/google/android/gms/common/api/zze.zzWY:Z
        //    68: aload_0        
        //    69: aload_1        
        //    70: invokevirtual   com/google/android/gms/common/internal/ResolveAccountResponse.zzoc:()Z
        //    73: putfield        com/google/android/gms/common/api/zze.zzWZ:Z
        //    76: aload_0        
        //    77: invokespecial   com/google/android/gms/common/api/zze.zzmE:()V
        //    80: iload_2        
        //    81: ifeq            124
        //    84: aload_0        
        //    85: aload_3        
        //    86: invokespecial   com/google/android/gms/common/api/zze.zzc:(Lcom/google/android/gms/common/ConnectionResult;)Z
        //    89: istore          11
        //    91: iload           11
        //    93: ifeq            119
        //    96: aload_0        
        //    97: invokespecial   com/google/android/gms/common/api/zze.zzmI:()V
        //   100: aload_0        
        //   101: getfield        com/google/android/gms/common/api/zze.zzWQ:I
        //   104: istore          12
        //   106: iload           12
        //   108: ifne            124
        //   111: aload_0        
        //   112: invokespecial   com/google/android/gms/common/api/zze.zzmG:()V
        //   115: iload_2        
        //   116: ifeq            124
        //   119: aload_0        
        //   120: aload_3        
        //   121: invokespecial   com/google/android/gms/common/api/zze.zzd:(Lcom/google/android/gms/common/ConnectionResult;)V
        //   124: aload_0        
        //   125: getfield        com/google/android/gms/common/api/zze.zzWL:Ljava/util/concurrent/locks/Lock;
        //   128: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   133: return         
        //   134: astore          6
        //   136: aload           6
        //   138: athrow         
        //   139: astore          7
        //   141: aload           7
        //   143: athrow         
        //   144: astore          8
        //   146: aload           8
        //   148: athrow         
        //   149: astore          9
        //   151: aload           9
        //   153: athrow         
        //   154: astore          10
        //   156: aload           10
        //   158: athrow         
        //   159: astore          4
        //   161: aload_0        
        //   162: getfield        com/google/android/gms/common/api/zze.zzWL:Ljava/util/concurrent/locks/Lock;
        //   165: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   170: aload           4
        //   172: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  18     25     159    173    Any
        //  40     80     134    139    Ljava/lang/IllegalStateException;
        //  40     80     159    173    Any
        //  84     91     139    144    Ljava/lang/IllegalStateException;
        //  84     91     159    173    Any
        //  96     106    144    149    Ljava/lang/IllegalStateException;
        //  96     106    159    173    Any
        //  111    115    149    154    Ljava/lang/IllegalStateException;
        //  111    115    159    173    Any
        //  119    124    154    159    Ljava/lang/IllegalStateException;
        //  119    124    159    173    Any
        //  136    139    139    144    Ljava/lang/IllegalStateException;
        //  136    139    159    173    Any
        //  141    144    144    149    Ljava/lang/IllegalStateException;
        //  141    144    159    173    Any
        //  146    149    149    154    Ljava/lang/IllegalStateException;
        //  146    149    159    173    Any
        //  151    154    154    159    Ljava/lang/IllegalStateException;
        //  151    154    159    173    Any
        //  156    159    159    173    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 85, Size: 85
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    private boolean zza(final int n, final int n2, final ConnectionResult connectionResult) {
        Label_0023: {
            if (n2 != 1) {
                break Label_0023;
            }
            try {
                if (!zzb(connectionResult)) {
                    return false;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (this.zzWM == null) {
                    return true;
                }
                final int n3 = n;
                final zze zze = this;
                final int n4 = zze.zzWN;
                if (n3 < n4) {
                    return true;
                }
                return false;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        try {
            final int n3 = n;
            final zze zze = this;
            final int n4 = zze.zzWN;
            if (n3 >= n4) {
                return false;
            }
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
        return true;
    }
    
    static boolean zza(final zze zze, final int n) {
        return zze.zzaW(n);
    }
    
    private boolean zzaW(final int n) {
        try {
            if (this.zzWO != n) {
                Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + this.zzaX(this.zzWO) + " but received callback for step " + this.zzaX(n));
                this.zzd(new ConnectionResult(8, null));
                return false;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return true;
    }
    
    private String zzaX(final int n) {
        switch (n) {
            default: {
                return "UNKNOWN";
            }
            case 0: {
                return "STEP_GETTING_SERVICE_BINDINGS";
            }
            case 1: {
                return "STEP_VALIDATING_ACCOUNT";
            }
            case 2: {
                return "STEP_AUTHENTICATING";
            }
            case 3: {
                return "STEP_GETTING_REMOTE_SERVICE";
            }
        }
    }
    
    static zzg zzb(final zze zze) {
        return zze.zzWK;
    }
    
    private void zzb(final ConnectionResult zzWM, final Api api, final int n) {
        Label_0038: {
            if (n == 2) {
                break Label_0038;
            }
            final int priority = api.zzmp().getPriority();
            try {
                if (this.zza(priority, n, zzWM)) {
                    this.zzWM = zzWM;
                    this.zzWN = priority;
                }
                this.zzWK.zzXv.put(api.zzms(), zzWM);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    private static boolean zzb(final ConnectionResult connectionResult) {
        while (true) {
            try {
                if (connectionResult.hasResolution()) {
                    return true;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (GooglePlayServicesUtil.zzaT(connectionResult.getErrorCode()) == null) {
                    return false;
                }
                return true;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    static boolean zzb(final zze zze, final ConnectionResult connectionResult) {
        return zze.zzc(connectionResult);
    }
    
    static zzps zzc(final zze zze) {
        return zze.zzWT;
    }
    
    static void zzc(final zze zze, final ConnectionResult connectionResult) {
        zze.zza(connectionResult);
    }
    
    private boolean zzc(final ConnectionResult p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/api/zze.zzWU:I
        //     4: istore          5
        //     6: iload           5
        //     8: iconst_2       
        //     9: if_icmpeq       35
        //    12: aload_0        
        //    13: getfield        com/google/android/gms/common/api/zze.zzWU:I
        //    16: istore          6
        //    18: iload           6
        //    20: iconst_1       
        //    21: if_icmpne       48
        //    24: aload_1        
        //    25: invokevirtual   com/google/android/gms/common/ConnectionResult.hasResolution:()Z
        //    28: istore          7
        //    30: iload           7
        //    32: ifne            48
        //    35: iconst_1       
        //    36: ireturn        
        //    37: astore_2       
        //    38: aload_2        
        //    39: athrow         
        //    40: astore_3       
        //    41: aload_3        
        //    42: athrow         
        //    43: astore          4
        //    45: aload           4
        //    47: athrow         
        //    48: iconst_0       
        //    49: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      37     40     Ljava/lang/IllegalStateException;
        //  12     18     40     43     Ljava/lang/IllegalStateException;
        //  24     30     43     48     Ljava/lang/IllegalStateException;
        //  38     40     40     43     Ljava/lang/IllegalStateException;
        //  41     43     43     48     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 30, Size: 30
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
    
    private void zzd(final ConnectionResult p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iconst_0       
        //     2: putfield        com/google/android/gms/common/api/zze.zzWP:Z
        //     5: aload_0        
        //     6: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //     9: getfield        com/google/android/gms/common/api/zzg.zzXw:Ljava/util/Set;
        //    12: invokeinterface java/util/Set.clear:()V
        //    17: aload_0        
        //    18: aload_1        
        //    19: putfield        com/google/android/gms/common/api/zze.zzWM:Lcom/google/android/gms/common/ConnectionResult;
        //    22: aload_1        
        //    23: invokevirtual   com/google/android/gms/common/ConnectionResult.hasResolution:()Z
        //    26: istore_3       
        //    27: iconst_0       
        //    28: istore          4
        //    30: iload_3        
        //    31: ifne            37
        //    34: iconst_1       
        //    35: istore          4
        //    37: aload_0        
        //    38: iload           4
        //    40: invokespecial   com/google/android/gms/common/api/zze.zzT:(Z)V
        //    43: aload_0        
        //    44: iconst_3       
        //    45: invokevirtual   com/google/android/gms/common/api/zze.zzaV:(I)V
        //    48: aload_0        
        //    49: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    52: invokevirtual   com/google/android/gms/common/api/zzg.zzmO:()Z
        //    55: istore          7
        //    57: iload           7
        //    59: ifeq            76
        //    62: aload_0        
        //    63: getfield        com/google/android/gms/common/api/zze.mContext:Landroid/content/Context;
        //    66: aload_1        
        //    67: invokevirtual   com/google/android/gms/common/ConnectionResult.getErrorCode:()I
        //    70: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.zze:(Landroid/content/Context;I)Z
        //    73: ifne            95
        //    76: aload_0        
        //    77: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    80: invokevirtual   com/google/android/gms/common/api/zzg.zzmR:()Z
        //    83: pop            
        //    84: aload_0        
        //    85: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    88: getfield        com/google/android/gms/common/api/zzg.zzXn:Lcom/google/android/gms/common/internal/zzj;
        //    91: aload_1        
        //    92: invokevirtual   com/google/android/gms/common/internal/zzj.zzh:(Lcom/google/android/gms/common/ConnectionResult;)V
        //    95: aload_0        
        //    96: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    99: getfield        com/google/android/gms/common/api/zzg.zzXn:Lcom/google/android/gms/common/internal/zzj;
        //   102: invokevirtual   com/google/android/gms/common/internal/zzj.zznT:()V
        //   105: return         
        //   106: astore_2       
        //   107: aload_2        
        //   108: athrow         
        //   109: astore          5
        //   111: aload           5
        //   113: athrow         
        //   114: astore          6
        //   116: aload           6
        //   118: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      27     106    109    Ljava/lang/IllegalStateException;
        //  37     57     109    114    Ljava/lang/IllegalStateException;
        //  62     76     114    119    Ljava/lang/IllegalStateException;
        //  76     95     114    119    Ljava/lang/IllegalStateException;
        //  111    114    114    119    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 60, Size: 60
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
    
    static void zzd(final zze zze) {
        zze.zzmI();
    }
    
    static void zze(final zze zze) {
        zze.zzmG();
    }
    
    static boolean zzf(final zze zze) {
        return zze.zzmC();
    }
    
    static void zzg(final zze zze) {
        zze.zzmD();
    }
    
    static void zzh(final zze zze) {
        zze.zzmF();
    }
    
    private boolean zzmC() {
        try {
            --this.zzWQ;
            if (this.zzWQ > 0) {
                return false;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (this.zzWQ < 0) {
                Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
                this.zzd(new ConnectionResult(8, null));
                return false;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        try {
            if (this.zzWM != null) {
                this.zzd(this.zzWM);
                return false;
            }
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
        return true;
    }
    
    private void zzmD() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/api/zze.zzWV:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            19
        //     9: aload_0        
        //    10: invokespecial   com/google/android/gms/common/api/zze.zzmE:()V
        //    13: getstatic       com/google/android/gms/common/api/Api.a:Z
        //    16: ifeq            30
        //    19: aload_0        
        //    20: invokespecial   com/google/android/gms/common/api/zze.zzmG:()V
        //    23: return         
        //    24: astore_1       
        //    25: aload_1        
        //    26: athrow         
        //    27: astore_2       
        //    28: aload_2        
        //    29: athrow         
        //    30: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      24     27     Ljava/lang/IllegalStateException;
        //  9      19     27     30     Ljava/lang/IllegalStateException;
        //  19     23     27     30     Ljava/lang/IllegalStateException;
        //  25     27     27     30     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    
    private void zzmE() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/common/api/zze.zzWW:Z
        //     8: ifeq            152
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/common/api/zze.zzWQ:I
        //    15: istore_3       
        //    16: iload_3        
        //    17: ifne            152
        //    20: aload_0        
        //    21: iconst_1       
        //    22: putfield        com/google/android/gms/common/api/zze.zzWO:I
        //    25: aload_0        
        //    26: aload_0        
        //    27: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    30: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //    33: invokeinterface java/util/Map.size:()I
        //    38: putfield        com/google/android/gms/common/api/zze.zzWQ:I
        //    41: aload_0        
        //    42: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    45: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //    48: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    53: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    58: astore          4
        //    60: aload           4
        //    62: invokeinterface java/util/Iterator.hasNext:()Z
        //    67: ifeq            152
        //    70: aload           4
        //    72: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    77: checkcast       Lcom/google/android/gms/common/api/Api$ClientKey;
        //    80: astore          5
        //    82: aload_0        
        //    83: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    86: getfield        com/google/android/gms/common/api/zzg.zzXv:Ljava/util/Map;
        //    89: aload           5
        //    91: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    96: istore          9
        //    98: iload           9
        //   100: ifeq            122
        //   103: aload_0        
        //   104: invokespecial   com/google/android/gms/common/api/zze.zzmC:()Z
        //   107: istore          10
        //   109: iload           10
        //   111: ifeq            148
        //   114: aload_0        
        //   115: invokespecial   com/google/android/gms/common/api/zze.zzmF:()V
        //   118: iload_1        
        //   119: ifeq            148
        //   122: aload_0        
        //   123: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   126: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //   129: aload           5
        //   131: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   136: checkcast       Lcom/google/android/gms/common/api/Api$Client;
        //   139: aload_0        
        //   140: getfield        com/google/android/gms/common/api/zze.zzWX:Lcom/google/android/gms/common/internal/IAccountAccessor;
        //   143: invokeinterface com/google/android/gms/common/api/Api$Client.validateAccount:(Lcom/google/android/gms/common/internal/IAccountAccessor;)V
        //   148: iload_1        
        //   149: ifeq            60
        //   152: return         
        //   153: astore_2       
        //   154: aload_2        
        //   155: athrow         
        //   156: astore          6
        //   158: aload           6
        //   160: athrow         
        //   161: astore          7
        //   163: aload           7
        //   165: athrow         
        //   166: astore          8
        //   168: aload           8
        //   170: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      16     153    156    Ljava/lang/IllegalStateException;
        //  82     98     156    161    Ljava/lang/IllegalStateException;
        //  103    109    161    166    Ljava/lang/IllegalStateException;
        //  114    118    166    171    Ljava/lang/IllegalStateException;
        //  122    148    166    171    Ljava/lang/IllegalStateException;
        //  158    161    161    166    Ljava/lang/IllegalStateException;
        //  163    166    166    171    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
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
    
    private void zzmF() {
        this.zzWO = 2;
        this.zzWK.zzXw = this.zzmJ();
        this.zzWT.zza(this.zzWX, this.zzWK.zzXw, new zze$zza(this));
    }
    
    private void zzmG() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //     8: getfield        com/google/android/gms/common/api/zzg.zzXw:Ljava/util/Set;
        //    11: astore_2       
        //    12: aload_2        
        //    13: invokeinterface java/util/Set.isEmpty:()Z
        //    18: ifeq            175
        //    21: aload_0        
        //    22: invokespecial   com/google/android/gms/common/api/zze.zzmJ:()Ljava/util/Set;
        //    25: astore_3       
        //    26: aload_0        
        //    27: iconst_3       
        //    28: putfield        com/google/android/gms/common/api/zze.zzWO:I
        //    31: aload_0        
        //    32: aload_0        
        //    33: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    36: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //    39: invokeinterface java/util/Map.size:()I
        //    44: putfield        com/google/android/gms/common/api/zze.zzWQ:I
        //    47: aload_0        
        //    48: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    51: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //    54: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    59: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    64: astore          4
        //    66: aload           4
        //    68: invokeinterface java/util/Iterator.hasNext:()Z
        //    73: ifeq            159
        //    76: aload           4
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: checkcast       Lcom/google/android/gms/common/api/Api$ClientKey;
        //    86: astore          5
        //    88: aload_0        
        //    89: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    92: getfield        com/google/android/gms/common/api/zzg.zzXv:Ljava/util/Map;
        //    95: aload           5
        //    97: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   102: istore          9
        //   104: iload           9
        //   106: ifeq            128
        //   109: aload_0        
        //   110: invokespecial   com/google/android/gms/common/api/zze.zzmC:()Z
        //   113: istore          10
        //   115: iload           10
        //   117: ifeq            155
        //   120: aload_0        
        //   121: invokespecial   com/google/android/gms/common/api/zze.zzmH:()V
        //   124: iload_1        
        //   125: ifeq            155
        //   128: aload_0        
        //   129: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   132: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //   135: aload           5
        //   137: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   142: checkcast       Lcom/google/android/gms/common/api/Api$Client;
        //   145: aload_0        
        //   146: getfield        com/google/android/gms/common/api/zze.zzWX:Lcom/google/android/gms/common/internal/IAccountAccessor;
        //   149: aload_3        
        //   150: invokeinterface com/google/android/gms/common/api/Api$Client.getRemoteService:(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V
        //   155: iload_1        
        //   156: ifeq            66
        //   159: return         
        //   160: astore          6
        //   162: aload           6
        //   164: athrow         
        //   165: astore          7
        //   167: aload           7
        //   169: athrow         
        //   170: astore          8
        //   172: aload           8
        //   174: athrow         
        //   175: aload_2        
        //   176: astore_3       
        //   177: goto            26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  88     104    160    165    Ljava/lang/IllegalStateException;
        //  109    115    165    170    Ljava/lang/IllegalStateException;
        //  120    124    170    175    Ljava/lang/IllegalStateException;
        //  128    155    170    175    Ljava/lang/IllegalStateException;
        //  162    165    165    170    Ljava/lang/IllegalStateException;
        //  167    170    170    175    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 76, Size: 76
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
    
    private void zzmH() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //     8: invokevirtual   com/google/android/gms/common/api/zzg.zzmN:()V
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/common/api/zze.zzWT:Lcom/google/android/gms/internal/zzps;
        //    15: astore          4
        //    17: aload           4
        //    19: ifnull          51
        //    22: aload_0        
        //    23: getfield        com/google/android/gms/common/api/zze.zzWY:Z
        //    26: ifeq            46
        //    29: aload_0        
        //    30: getfield        com/google/android/gms/common/api/zze.zzWT:Lcom/google/android/gms/internal/zzps;
        //    33: aload_0        
        //    34: getfield        com/google/android/gms/common/api/zze.zzWX:Lcom/google/android/gms/common/internal/IAccountAccessor;
        //    37: aload_0        
        //    38: getfield        com/google/android/gms/common/api/zze.zzWZ:Z
        //    41: invokeinterface com/google/android/gms/internal/zzps.zza:(Lcom/google/android/gms/common/internal/IAccountAccessor;Z)V
        //    46: aload_0        
        //    47: iconst_0       
        //    48: invokespecial   com/google/android/gms/common/api/zze.zzT:(Z)V
        //    51: aload_0        
        //    52: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    55: getfield        com/google/android/gms/common/api/zzg.zzXv:Ljava/util/Map;
        //    58: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    63: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    68: astore          5
        //    70: aload           5
        //    72: invokeinterface java/util/Iterator.hasNext:()Z
        //    77: ifeq            118
        //    80: aload           5
        //    82: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    87: checkcast       Lcom/google/android/gms/common/api/Api$ClientKey;
        //    90: astore          12
        //    92: aload_0        
        //    93: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    96: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //    99: aload           12
        //   101: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   106: checkcast       Lcom/google/android/gms/common/api/Api$Client;
        //   109: invokeinterface com/google/android/gms/common/api/Api$Client.disconnect:()V
        //   114: iload_1        
        //   115: ifeq            70
        //   118: aload_0        
        //   119: getfield        com/google/android/gms/common/api/zze.zzWP:Z
        //   122: istore          9
        //   124: iload           9
        //   126: ifeq            143
        //   129: aload_0        
        //   130: iconst_0       
        //   131: putfield        com/google/android/gms/common/api/zze.zzWP:Z
        //   134: aload_0        
        //   135: iconst_m1      
        //   136: invokevirtual   com/google/android/gms/common/api/zze.zzaV:(I)V
        //   139: iload_1        
        //   140: ifeq            172
        //   143: aload_0        
        //   144: getfield        com/google/android/gms/common/api/zze.zzWR:Landroid/os/Bundle;
        //   147: invokevirtual   android/os/Bundle.isEmpty:()Z
        //   150: istore          10
        //   152: iload           10
        //   154: ifeq            194
        //   157: aconst_null    
        //   158: astore          11
        //   160: aload_0        
        //   161: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   164: getfield        com/google/android/gms/common/api/zzg.zzXn:Lcom/google/android/gms/common/internal/zzj;
        //   167: aload           11
        //   169: invokevirtual   com/google/android/gms/common/internal/zzj.zzg:(Landroid/os/Bundle;)V
        //   172: return         
        //   173: astore_2       
        //   174: aload_2        
        //   175: athrow         
        //   176: astore_3       
        //   177: aload_3        
        //   178: athrow         
        //   179: astore          6
        //   181: aload           6
        //   183: athrow         
        //   184: astore          7
        //   186: aload           7
        //   188: athrow         
        //   189: astore          8
        //   191: aload           8
        //   193: athrow         
        //   194: aload_0        
        //   195: getfield        com/google/android/gms/common/api/zze.zzWR:Landroid/os/Bundle;
        //   198: astore          11
        //   200: goto            160
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      17     173    176    Ljava/lang/IllegalStateException;
        //  22     46     176    179    Ljava/lang/IllegalStateException;
        //  118    124    179    184    Ljava/lang/IllegalStateException;
        //  129    139    184    189    Ljava/lang/IllegalStateException;
        //  143    152    189    194    Ljava/lang/IllegalStateException;
        //  174    176    176    179    Ljava/lang/IllegalStateException;
        //  181    184    184    189    Ljava/lang/IllegalStateException;
        //  186    189    189    194    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
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
    
    private void zzmI() {
        final boolean a = Api.a;
        this.zzWV = false;
        this.zzWK.zzXw.clear();
        final Iterator<Api$ClientKey> iterator = (Iterator<Api$ClientKey>)this.zzWS.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return;
            }
            final Api$ClientKey api$ClientKey = iterator.next();
            try {
                if (!this.zzWK.zzXv.containsKey(api$ClientKey)) {
                    this.zzWK.zzXv.put(api$ClientKey, new ConnectionResult(17, null));
                }
                if (a) {
                    return;
                }
                continue;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    private Set zzmJ() {
        final boolean a = Api.a;
        final HashSet set = new HashSet(this.zzXa.zznv());
        final Map zznx = this.zzXa.zznx();
        final Iterator<Api> iterator = zznx.keySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return set;
            }
            final Api api = iterator.next();
            try {
                if (!this.zzWK.zzXv.containsKey(api.zzms())) {
                    set.addAll(((com.google.android.gms.common.internal.zze$zza)zznx.get(api)).zzWJ);
                }
                if (a) {
                    return set;
                }
                continue;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void begin() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //     8: getfield        com/google/android/gms/common/api/zzg.zzXn:Lcom/google/android/gms/common/internal/zzj;
        //    11: invokevirtual   com/google/android/gms/common/internal/zzj.zznU:()V
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    18: getfield        com/google/android/gms/common/api/zzg.zzXv:Ljava/util/Map;
        //    21: invokeinterface java/util/Map.clear:()V
        //    26: aload_0        
        //    27: iconst_0       
        //    28: putfield        com/google/android/gms/common/api/zze.zzWP:Z
        //    31: aload_0        
        //    32: iconst_0       
        //    33: putfield        com/google/android/gms/common/api/zze.zzWV:Z
        //    36: aload_0        
        //    37: aconst_null    
        //    38: putfield        com/google/android/gms/common/api/zze.zzWM:Lcom/google/android/gms/common/ConnectionResult;
        //    41: aload_0        
        //    42: iconst_0       
        //    43: putfield        com/google/android/gms/common/api/zze.zzWO:I
        //    46: aload_0        
        //    47: iconst_2       
        //    48: putfield        com/google/android/gms/common/api/zze.zzWU:I
        //    51: aload_0        
        //    52: iconst_0       
        //    53: putfield        com/google/android/gms/common/api/zze.zzWW:Z
        //    56: aload_0        
        //    57: iconst_0       
        //    58: putfield        com/google/android/gms/common/api/zze.zzWY:Z
        //    61: aload_0        
        //    62: getfield        com/google/android/gms/common/api/zze.mContext:Landroid/content/Context;
        //    65: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.isGooglePlayServicesAvailable:(Landroid/content/Context;)I
        //    68: istore_2       
        //    69: iload_2        
        //    70: ifeq            104
        //    73: new             Lcom/google/android/gms/common/ConnectionResult;
        //    76: dup            
        //    77: iload_2        
        //    78: aconst_null    
        //    79: invokespecial   com/google/android/gms/common/ConnectionResult.<init>:(ILandroid/app/PendingIntent;)V
        //    82: astore_3       
        //    83: aload_0        
        //    84: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    87: getfield        com/google/android/gms/common/api/zzg.zzXs:Lcom/google/android/gms/common/api/zzg$zza;
        //    90: new             Lcom/google/android/gms/common/api/zze$1;
        //    93: dup            
        //    94: aload_0        
        //    95: aload_3        
        //    96: invokespecial   com/google/android/gms/common/api/zze$1.<init>:(Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/ConnectionResult;)V
        //    99: invokevirtual   com/google/android/gms/common/api/zzg$zza.post:(Ljava/lang/Runnable;)Z
        //   102: pop            
        //   103: return         
        //   104: new             Ljava/util/HashMap;
        //   107: dup            
        //   108: invokespecial   java/util/HashMap.<init>:()V
        //   111: astore          5
        //   113: aload_0        
        //   114: getfield        com/google/android/gms/common/api/zze.zzXb:Ljava/util/Map;
        //   117: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   122: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   127: astore          6
        //   129: iconst_0       
        //   130: istore          7
        //   132: aload           6
        //   134: invokeinterface java/util/Iterator.hasNext:()Z
        //   139: ifeq            518
        //   142: aload           6
        //   144: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   149: checkcast       Lcom/google/android/gms/common/api/Api;
        //   152: astore          13
        //   154: aload_0        
        //   155: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   158: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //   161: aload           13
        //   163: invokevirtual   com/google/android/gms/common/api/Api.zzms:()Lcom/google/android/gms/common/api/Api$ClientKey;
        //   166: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   171: checkcast       Lcom/google/android/gms/common/api/Api$Client;
        //   174: astore          14
        //   176: aload_0        
        //   177: getfield        com/google/android/gms/common/api/zze.zzXb:Ljava/util/Map;
        //   180: aload           13
        //   182: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   187: checkcast       Ljava/lang/Integer;
        //   190: invokevirtual   java/lang/Integer.intValue:()I
        //   193: istore          15
        //   195: aload           13
        //   197: invokevirtual   com/google/android/gms/common/api/Api.zzmp:()Lcom/google/android/gms/common/api/Api$zza;
        //   200: invokeinterface com/google/android/gms/common/api/Api$zza.getPriority:()I
        //   205: istore          17
        //   207: iload           17
        //   209: iconst_1       
        //   210: if_icmpne       485
        //   213: iconst_1       
        //   214: istore          18
        //   216: iload           18
        //   218: iload           7
        //   220: ior            
        //   221: istore          8
        //   223: aload           14
        //   225: invokeinterface com/google/android/gms/common/api/Api$Client.requiresSignIn:()Z
        //   230: istore          21
        //   232: iload           21
        //   234: ifeq            277
        //   237: aload_0        
        //   238: iconst_1       
        //   239: putfield        com/google/android/gms/common/api/zze.zzWV:Z
        //   242: iload           15
        //   244: aload_0        
        //   245: getfield        com/google/android/gms/common/api/zze.zzWU:I
        //   248: if_icmpge       257
        //   251: aload_0        
        //   252: iload           15
        //   254: putfield        com/google/android/gms/common/api/zze.zzWU:I
        //   257: iload           15
        //   259: ifeq            277
        //   262: aload_0        
        //   263: getfield        com/google/android/gms/common/api/zze.zzWS:Ljava/util/Set;
        //   266: aload           13
        //   268: invokevirtual   com/google/android/gms/common/api/Api.zzms:()Lcom/google/android/gms/common/api/Api$ClientKey;
        //   271: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   276: pop            
        //   277: aload           5
        //   279: aload           14
        //   281: new             Lcom/google/android/gms/common/api/zze$zzc;
        //   284: dup            
        //   285: aload_0        
        //   286: aload           13
        //   288: iload           15
        //   290: invokespecial   com/google/android/gms/common/api/zze$zzc.<init>:(Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/api/Api;I)V
        //   293: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   298: pop            
        //   299: iload_1        
        //   300: ifeq            511
        //   303: iload           8
        //   305: ifeq            313
        //   308: aload_0        
        //   309: iconst_0       
        //   310: putfield        com/google/android/gms/common/api/zze.zzWV:Z
        //   313: aload_0        
        //   314: getfield        com/google/android/gms/common/api/zze.zzWV:Z
        //   317: ifeq            399
        //   320: aload_0        
        //   321: getfield        com/google/android/gms/common/api/zze.zzXa:Lcom/google/android/gms/common/internal/zze;
        //   324: aload_0        
        //   325: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   328: invokevirtual   com/google/android/gms/common/api/zzg.getSessionId:()I
        //   331: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   334: invokevirtual   com/google/android/gms/common/internal/zze.zza:(Ljava/lang/Integer;)V
        //   337: new             Lcom/google/android/gms/common/api/zze$zzd;
        //   340: dup            
        //   341: aload_0        
        //   342: aconst_null    
        //   343: invokespecial   com/google/android/gms/common/api/zze$zzd.<init>:(Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/api/zze$1;)V
        //   346: astore          11
        //   348: aload_0        
        //   349: aload_0        
        //   350: getfield        com/google/android/gms/common/api/zze.zzWE:Lcom/google/android/gms/common/api/Api$zza;
        //   353: aload_0        
        //   354: getfield        com/google/android/gms/common/api/zze.mContext:Landroid/content/Context;
        //   357: aload_0        
        //   358: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   361: invokevirtual   com/google/android/gms/common/api/zzg.getLooper:()Landroid/os/Looper;
        //   364: aload_0        
        //   365: getfield        com/google/android/gms/common/api/zze.zzXa:Lcom/google/android/gms/common/internal/zze;
        //   368: aload_0        
        //   369: getfield        com/google/android/gms/common/api/zze.zzXa:Lcom/google/android/gms/common/internal/zze;
        //   372: invokevirtual   com/google/android/gms/common/internal/zze.zznB:()Lcom/google/android/gms/internal/zzpt;
        //   375: aload           11
        //   377: aload           11
        //   379: invokeinterface com/google/android/gms/common/api/Api$zza.zza:(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zze;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$Client;
        //   384: checkcast       Lcom/google/android/gms/internal/zzps;
        //   387: putfield        com/google/android/gms/common/api/zze.zzWT:Lcom/google/android/gms/internal/zzps;
        //   390: aload_0        
        //   391: getfield        com/google/android/gms/common/api/zze.zzWT:Lcom/google/android/gms/internal/zzps;
        //   394: invokeinterface com/google/android/gms/internal/zzps.connect:()V
        //   399: aload_0        
        //   400: aload_0        
        //   401: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   404: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //   407: invokeinterface java/util/Map.size:()I
        //   412: putfield        com/google/android/gms/common/api/zze.zzWQ:I
        //   415: aload_0        
        //   416: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   419: getfield        com/google/android/gms/common/api/zzg.zzXu:Ljava/util/Map;
        //   422: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   427: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   432: astore          9
        //   434: aload           9
        //   436: invokeinterface java/util/Iterator.hasNext:()Z
        //   441: ifeq            103
        //   444: aload           9
        //   446: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   451: checkcast       Lcom/google/android/gms/common/api/Api$Client;
        //   454: astore          10
        //   456: aload           10
        //   458: aload           5
        //   460: aload           10
        //   462: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   467: checkcast       Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionProgressReportCallbacks;
        //   470: invokeinterface com/google/android/gms/common/api/Api$Client.connect:(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionProgressReportCallbacks;)V
        //   475: iload_1        
        //   476: ifeq            434
        //   479: return         
        //   480: astore          16
        //   482: aload           16
        //   484: athrow         
        //   485: iconst_0       
        //   486: istore          18
        //   488: goto            216
        //   491: astore          19
        //   493: aload           19
        //   495: athrow         
        //   496: astore          20
        //   498: aload           20
        //   500: athrow         
        //   501: astore          23
        //   503: aload           23
        //   505: athrow         
        //   506: astore          12
        //   508: aload           12
        //   510: athrow         
        //   511: iload           8
        //   513: istore          7
        //   515: goto            132
        //   518: iload           7
        //   520: istore          8
        //   522: goto            303
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  195    207    480    485    Ljava/lang/IllegalStateException;
        //  223    232    491    496    Ljava/lang/IllegalStateException;
        //  237    257    496    501    Ljava/lang/IllegalStateException;
        //  262    277    501    506    Ljava/lang/IllegalStateException;
        //  308    313    506    511    Ljava/lang/IllegalStateException;
        //  493    496    496    501    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 229, Size: 229
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
    
    @Override
    public void connect() {
        this.zzWP = false;
    }
    
    @Override
    public String getName() {
        return "CONNECTING";
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
        while (true) {
            try {
                if (!this.zzaW(3)) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            Label_0026: {
                if (bundle == null) {
                    break Label_0026;
                }
                try {
                    this.zzWR.putAll(bundle);
                    try {
                        if (this.zzmC()) {
                            this.zzmH();
                        }
                    }
                    catch (IllegalStateException ex2) {
                        throw ex2;
                    }
                }
                catch (IllegalStateException ex3) {
                    throw ex3;
                }
            }
        }
    }
    
    @Override
    public void onConnectionSuspended(final int n) {
        this.zzd(new ConnectionResult(8, null));
    }
    
    @Override
    public void zza(final ConnectionResult connectionResult, final Api api, final int n) {
        while (true) {
            try {
                if (!this.zzaW(3)) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                this.zzb(connectionResult, api, n);
                if (this.zzmC()) {
                    this.zzmH();
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public void zzaV(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/api/Api.a:Z
        //     3: istore_2       
        //     4: iload_1        
        //     5: iconst_m1      
        //     6: if_icmpne       146
        //     9: aload_0        
        //    10: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    13: getfield        com/google/android/gms/common/api/zzg.zzXo:Ljava/util/Queue;
        //    16: invokeinterface java/util/Queue.iterator:()Ljava/util/Iterator;
        //    21: astore_3       
        //    22: aload_3        
        //    23: invokeinterface java/util/Iterator.hasNext:()Z
        //    28: ifeq            70
        //    31: aload_3        
        //    32: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    37: checkcast       Lcom/google/android/gms/common/api/zzg$zze;
        //    40: astore          7
        //    42: aload           7
        //    44: invokeinterface com/google/android/gms/common/api/zzg$zze.zzmv:()I
        //    49: iconst_1       
        //    50: if_icmpeq       66
        //    53: aload           7
        //    55: invokeinterface com/google/android/gms/common/api/zzg$zze.cancel:()V
        //    60: aload_3        
        //    61: invokeinterface java/util/Iterator.remove:()V
        //    66: iload_2        
        //    67: ifeq            22
        //    70: aload_0        
        //    71: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    74: invokevirtual   com/google/android/gms/common/api/zzg.zzmK:()V
        //    77: aload_0        
        //    78: getfield        com/google/android/gms/common/api/zze.zzWM:Lcom/google/android/gms/common/ConnectionResult;
        //    81: astore          6
        //    83: aload           6
        //    85: ifnonnull       124
        //    88: aload_0        
        //    89: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //    92: getfield        com/google/android/gms/common/api/zzg.zzXo:Ljava/util/Queue;
        //    95: invokeinterface java/util/Queue.isEmpty:()Z
        //   100: ifne            124
        //   103: aload_0        
        //   104: iconst_1       
        //   105: putfield        com/google/android/gms/common/api/zze.zzWP:Z
        //   108: return         
        //   109: astore          8
        //   111: aload           8
        //   113: athrow         
        //   114: astore          4
        //   116: aload           4
        //   118: athrow         
        //   119: astore          5
        //   121: aload           5
        //   123: athrow         
        //   124: aload_0        
        //   125: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   128: getfield        com/google/android/gms/common/api/zzg.zzXv:Ljava/util/Map;
        //   131: invokeinterface java/util/Map.clear:()V
        //   136: aload_0        
        //   137: aconst_null    
        //   138: putfield        com/google/android/gms/common/api/zze.zzWM:Lcom/google/android/gms/common/ConnectionResult;
        //   141: aload_0        
        //   142: iconst_1       
        //   143: invokespecial   com/google/android/gms/common/api/zze.zzT:(Z)V
        //   146: aload_0        
        //   147: getfield        com/google/android/gms/common/api/zze.zzWK:Lcom/google/android/gms/common/api/zzg;
        //   150: aload_0        
        //   151: getfield        com/google/android/gms/common/api/zze.zzWM:Lcom/google/android/gms/common/ConnectionResult;
        //   154: invokevirtual   com/google/android/gms/common/api/zzg.zze:(Lcom/google/android/gms/common/ConnectionResult;)V
        //   157: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  42     66     109    114    Ljava/lang/IllegalStateException;
        //  70     83     114    119    Ljava/lang/IllegalStateException;
        //  88     108    119    124    Ljava/lang/IllegalStateException;
        //  116    119    119    124    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 69, Size: 69
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
    
    @Override
    public zza$zza zzb(final zza$zza zza$zza) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
