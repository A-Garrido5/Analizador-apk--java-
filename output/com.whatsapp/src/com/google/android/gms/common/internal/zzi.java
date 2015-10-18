// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.ServiceConnection;
import java.util.Iterator;
import com.google.android.gms.common.api.Scope;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import java.util.ArrayList;
import android.os.IInterface;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionProgressReportCallbacks;
import android.os.Looper;
import java.util.Set;
import android.accounts.Account;
import android.os.Handler;
import android.content.Context;
import com.google.android.gms.common.api.Api$Client;

public abstract class zzi implements Api$Client, zzj$zza
{
    public static boolean a;
    public static final String[] zzaav;
    private final Context mContext;
    final Handler mHandler;
    private final Account zzMY;
    private final Set zzWJ;
    private final Looper zzWt;
    private final zze zzXa;
    private final zzk zzaak;
    private zzp zzaal;
    private GoogleApiClient$ConnectionProgressReportCallbacks zzaam;
    private IInterface zzaan;
    private final ArrayList zzaao;
    private zzi$zze zzaap;
    private int zzaaq;
    private GoogleApiClient$ConnectionCallbacks zzaar;
    private GoogleApiClient$OnConnectionFailedListener zzaas;
    private final int zzaat;
    protected AtomicInteger zzaau;
    private final Object zzqt;
    
    static {
        zzaav = new String[] { "service_esmobile", "service_googleme" };
    }
    
    protected zzi(final Context context, final Looper looper, final int n, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener, final zze zze) {
        this(context, looper, zzk.zzah(context), n, zze, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
    }
    
    protected zzi(final Context context, final Looper looper, final zzk zzk, final int zzaat, final zze zze) {
        final boolean a = zzi.a;
        this.zzqt = new Object();
        this.zzaao = new ArrayList();
        this.zzaaq = 1;
        this.zzaau = new AtomicInteger(0);
        this.mContext = (Context)zzu.zzb(context, "Context must not be null");
        this.zzWt = (Looper)zzu.zzb(looper, "Looper must not be null");
        this.zzaak = (zzk)zzu.zzb(zzk, "Supervisor must not be null");
        this.mHandler = new zzi$zzb(this, looper);
        this.zzaat = zzaat;
        this.zzXa = (zze)zzu.zzu(zze);
        this.zzMY = zze.getAccount();
        this.zzWJ = this.zzb(zze.zznw());
        if (a) {
            ++zzu.a;
        }
    }
    
    protected zzi(final Context context, final Looper looper, final zzk zzk, final int n, final zze zze, final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this(context, looper, zzk, n, zze);
        this.zzaar = (GoogleApiClient$ConnectionCallbacks)zzu.zzu(googleApiClient$ConnectionCallbacks);
        this.zzaas = (GoogleApiClient$OnConnectionFailedListener)zzu.zzu(googleApiClient$OnConnectionFailedListener);
    }
    
    static GoogleApiClient$ConnectionProgressReportCallbacks zza(final zzi zzi) {
        return zzi.zzaam;
    }
    
    static zzp zza(final zzi zzi, final zzp zzaal) {
        return zzi.zzaal = zzaal;
    }
    
    private void zza(final int p0, final IInterface p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //     5: istore          4
        //     7: iload_1        
        //     8: iconst_3       
        //     9: if_icmpne       84
        //    12: iload_3        
        //    13: istore          5
        //    15: aload_2        
        //    16: ifnull          90
        //    19: iload_3        
        //    20: istore          6
        //    22: iload           5
        //    24: iload           6
        //    26: if_icmpne       96
        //    29: iload_3        
        //    30: invokestatic    com/google/android/gms/common/internal/zzu.zzV:(Z)V
        //    33: aload_0        
        //    34: getfield        com/google/android/gms/common/internal/zzi.zzqt:Ljava/lang/Object;
        //    37: astore          7
        //    39: aload           7
        //    41: monitorenter   
        //    42: aload_0        
        //    43: iload_1        
        //    44: putfield        com/google/android/gms/common/internal/zzi.zzaaq:I
        //    47: aload_0        
        //    48: aload_2        
        //    49: putfield        com/google/android/gms/common/internal/zzi.zzaan:Landroid/os/IInterface;
        //    52: iload_1        
        //    53: tableswitch {
        //                2: 119
        //                3: 101
        //                4: 110
        //          default: 80
        //        }
        //    80: aload           7
        //    82: monitorexit    
        //    83: return         
        //    84: iconst_0       
        //    85: istore          5
        //    87: goto            15
        //    90: iconst_0       
        //    91: istore          6
        //    93: goto            22
        //    96: iconst_0       
        //    97: istore_3       
        //    98: goto            29
        //   101: aload_0        
        //   102: invokespecial   com/google/android/gms/common/internal/zzi.zznH:()V
        //   105: iload           4
        //   107: ifeq            80
        //   110: aload_0        
        //   111: invokevirtual   com/google/android/gms/common/internal/zzi.zznG:()V
        //   114: iload           4
        //   116: ifeq            80
        //   119: aload_0        
        //   120: invokespecial   com/google/android/gms/common/internal/zzi.zznI:()V
        //   123: goto            80
        //   126: astore          9
        //   128: aload           9
        //   130: athrow         
        //   131: astore          8
        //   133: aload           7
        //   135: monitorexit    
        //   136: aload           8
        //   138: athrow         
        //   139: astore          10
        //   141: aload           10
        //   143: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  42     52     131    139    Any
        //  80     83     131    139    Any
        //  101    105    139    144    Ljava/lang/IllegalStateException;
        //  101    105    131    139    Any
        //  110    114    139    144    Ljava/lang/IllegalStateException;
        //  110    114    131    139    Any
        //  119    123    126    131    Ljava/lang/IllegalStateException;
        //  119    123    131    139    Any
        //  128    131    131    139    Any
        //  133    136    131    139    Any
        //  141    144    126    131    Ljava/lang/IllegalStateException;
        //  141    144    131    139    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0101:
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
    
    private void zza(final GoogleApiClient$ConnectionProgressReportCallbacks googleApiClient$ConnectionProgressReportCallbacks) {
        this.zzaam = (GoogleApiClient$ConnectionProgressReportCallbacks)zzu.zzb(googleApiClient$ConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
    }
    
    static void zza(final zzi zzi, final int n, final IInterface interface1) {
        zzi.zza(n, interface1);
    }
    
    private boolean zza(final int n, final int n2, final IInterface interface1) {
        synchronized (this.zzqt) {
            if (this.zzaaq != n) {
                return false;
            }
            this.zza(n2, interface1);
            return true;
        }
    }
    
    static boolean zza(final zzi zzi, final int n, final int n2, final IInterface interface1) {
        return zzi.zza(n, n2, interface1);
    }
    
    static GoogleApiClient$ConnectionCallbacks zzb(final zzi zzi) {
        return zzi.zzaar;
    }
    
    private Set zzb(final Set set) {
        final boolean a = zzi.a;
        final Set zza = this.zza(set);
        if (zza == null) {
            return zza;
        }
        for (final Scope scope : zza) {
            try {
                if (!set.contains(scope)) {
                    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            if (a) {
                break;
            }
        }
        return zza;
    }
    
    static ArrayList zzc(final zzi zzi) {
        return zzi.zzaao;
    }
    
    static Set zzd(final zzi zzi) {
        return zzi.zzWJ;
    }
    
    static GoogleApiClient$OnConnectionFailedListener zze(final zzi zzi) {
        return zzi.zzaas;
    }
    
    static Context zzf(final zzi zzi) {
        return zzi.mContext;
    }
    
    private void zznH() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/internal/zzi.zzaap:Lcom/google/android/gms/common/internal/zzi$zze;
        //     4: ifnull          62
        //     7: ldc             "GmsClient"
        //     9: new             Ljava/lang/StringBuilder;
        //    12: dup            
        //    13: invokespecial   java/lang/StringBuilder.<init>:()V
        //    16: ldc             "Calling connect() while still connected, missing disconnect() for "
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/gms/common/internal/zzi.getStartServiceAction:()Ljava/lang/String;
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    31: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    34: pop            
        //    35: aload_0        
        //    36: getfield        com/google/android/gms/common/internal/zzi.zzaak:Lcom/google/android/gms/common/internal/zzk;
        //    39: aload_0        
        //    40: invokevirtual   com/google/android/gms/common/internal/zzi.getStartServiceAction:()Ljava/lang/String;
        //    43: aload_0        
        //    44: getfield        com/google/android/gms/common/internal/zzi.zzaap:Lcom/google/android/gms/common/internal/zzi$zze;
        //    47: aload_0        
        //    48: invokevirtual   com/google/android/gms/common/internal/zzi.zzkQ:()Ljava/lang/String;
        //    51: invokevirtual   com/google/android/gms/common/internal/zzk.zzb:(Ljava/lang/String;Landroid/content/ServiceConnection;Ljava/lang/String;)V
        //    54: aload_0        
        //    55: getfield        com/google/android/gms/common/internal/zzi.zzaau:Ljava/util/concurrent/atomic/AtomicInteger;
        //    58: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //    61: pop            
        //    62: aload_0        
        //    63: new             Lcom/google/android/gms/common/internal/zzi$zze;
        //    66: dup            
        //    67: aload_0        
        //    68: aload_0        
        //    69: getfield        com/google/android/gms/common/internal/zzi.zzaau:Ljava/util/concurrent/atomic/AtomicInteger;
        //    72: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //    75: invokespecial   com/google/android/gms/common/internal/zzi$zze.<init>:(Lcom/google/android/gms/common/internal/zzi;I)V
        //    78: putfield        com/google/android/gms/common/internal/zzi.zzaap:Lcom/google/android/gms/common/internal/zzi$zze;
        //    81: aload_0        
        //    82: getfield        com/google/android/gms/common/internal/zzi.zzaak:Lcom/google/android/gms/common/internal/zzk;
        //    85: aload_0        
        //    86: invokevirtual   com/google/android/gms/common/internal/zzi.getStartServiceAction:()Ljava/lang/String;
        //    89: aload_0        
        //    90: getfield        com/google/android/gms/common/internal/zzi.zzaap:Lcom/google/android/gms/common/internal/zzi$zze;
        //    93: aload_0        
        //    94: invokevirtual   com/google/android/gms/common/internal/zzi.zzkQ:()Ljava/lang/String;
        //    97: invokevirtual   com/google/android/gms/common/internal/zzk.zza:(Ljava/lang/String;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
        //   100: ifne            157
        //   103: ldc             "GmsClient"
        //   105: new             Ljava/lang/StringBuilder;
        //   108: dup            
        //   109: invokespecial   java/lang/StringBuilder.<init>:()V
        //   112: ldc_w           "unable to connect to service: "
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   118: aload_0        
        //   119: invokevirtual   com/google/android/gms/common/internal/zzi.getStartServiceAction:()Ljava/lang/String;
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   128: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   131: pop            
        //   132: aload_0        
        //   133: getfield        com/google/android/gms/common/internal/zzi.mHandler:Landroid/os/Handler;
        //   136: aload_0        
        //   137: getfield        com/google/android/gms/common/internal/zzi.mHandler:Landroid/os/Handler;
        //   140: iconst_3       
        //   141: aload_0        
        //   142: getfield        com/google/android/gms/common/internal/zzi.zzaau:Ljava/util/concurrent/atomic/AtomicInteger;
        //   145: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //   148: bipush          9
        //   150: invokevirtual   android/os/Handler.obtainMessage:(III)Landroid/os/Message;
        //   153: invokevirtual   android/os/Handler.sendMessage:(Landroid/os/Message;)Z
        //   156: pop            
        //   157: return         
        //   158: astore_1       
        //   159: aload_1        
        //   160: athrow         
        //   161: astore_2       
        //   162: aload_2        
        //   163: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      62     158    161    Ljava/lang/IllegalStateException;
        //  103    157    161    164    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0157:
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
    
    private void zznI() {
        try {
            if (this.zzaap != null) {
                this.zzaak.zzb(this.getStartServiceAction(), (ServiceConnection)this.zzaap, this.zzkQ());
                this.zzaap = null;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public void connect(final GoogleApiClient$ConnectionProgressReportCallbacks googleApiClient$ConnectionProgressReportCallbacks) {
        this.zza(googleApiClient$ConnectionProgressReportCallbacks);
        this.zza(2, null);
    }
    
    @Override
    public void disconnect() {
        while (true) {
            final boolean a = zzi.a;
            this.zzaau.incrementAndGet();
            while (true) {
                final int n2;
                Label_0086: {
                    synchronized (this.zzaao) {
                        final int size = this.zzaao.size();
                        final int n = 0;
                        if (n < size) {
                            ((zzi$zzc)this.zzaao.get(n)).zznR();
                            n2 = n + 1;
                            if (!a) {
                                break Label_0086;
                            }
                        }
                        this.zzaao.clear();
                        // monitorexit(this.zzaao)
                        this.zza(1, null);
                        return;
                    }
                }
                final int n = n2;
                continue;
            }
        }
    }
    
    @Override
    public void dump(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //     3: istore          5
        //     5: aload_0        
        //     6: getfield        com/google/android/gms/common/internal/zzi.zzqt:Ljava/lang/Object;
        //     9: astore          6
        //    11: aload           6
        //    13: monitorenter   
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/common/internal/zzi.zzaaq:I
        //    18: istore          8
        //    20: aload_0        
        //    21: getfield        com/google/android/gms/common/internal/zzi.zzaan:Landroid/os/IInterface;
        //    24: astore          9
        //    26: aload           6
        //    28: monitorexit    
        //    29: aload_3        
        //    30: aload_1        
        //    31: invokevirtual   java/io/PrintWriter.append:(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;
        //    34: ldc_w           "mConnectState="
        //    37: invokevirtual   java/io/PrintWriter.append:(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;
        //    40: pop            
        //    41: iload           8
        //    43: tableswitch {
        //                2: 179
        //                3: 143
        //                4: 155
        //                5: 167
        //          default: 72
        //        }
        //    72: aload_3        
        //    73: ldc_w           "UNKNOWN"
        //    76: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    79: aload_3        
        //    80: ldc_w           " mService="
        //    83: invokevirtual   java/io/PrintWriter.append:(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;
        //    86: pop            
        //    87: aload           9
        //    89: ifnonnull       104
        //    92: aload_3        
        //    93: ldc_w           "null"
        //    96: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //    99: iload           5
        //   101: ifeq            134
        //   104: aload_3        
        //   105: aload_0        
        //   106: invokevirtual   com/google/android/gms/common/internal/zzi.getServiceDescriptor:()Ljava/lang/String;
        //   109: invokevirtual   java/io/PrintWriter.append:(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;
        //   112: ldc_w           "@"
        //   115: invokevirtual   java/io/PrintWriter.append:(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;
        //   118: aload           9
        //   120: invokeinterface android/os/IInterface.asBinder:()Landroid/os/IBinder;
        //   125: invokestatic    java/lang/System.identityHashCode:(Ljava/lang/Object;)I
        //   128: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   131: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   134: return         
        //   135: astore          7
        //   137: aload           6
        //   139: monitorexit    
        //   140: aload           7
        //   142: athrow         
        //   143: aload_3        
        //   144: ldc_w           "CONNECTING"
        //   147: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   150: iload           5
        //   152: ifeq            79
        //   155: aload_3        
        //   156: ldc_w           "CONNECTED"
        //   159: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   162: iload           5
        //   164: ifeq            79
        //   167: aload_3        
        //   168: ldc_w           "DISCONNECTING"
        //   171: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   174: iload           5
        //   176: ifeq            79
        //   179: aload_3        
        //   180: ldc_w           "DISCONNECTED"
        //   183: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   186: iload           5
        //   188: ifeq            79
        //   191: goto            72
        //   194: astore          10
        //   196: aload           10
        //   198: athrow         
        //   199: astore          11
        //   201: aload           11
        //   203: athrow         
        //   204: astore          12
        //   206: aload           12
        //   208: athrow         
        //   209: astore          13
        //   211: aload           13
        //   213: athrow         
        //   214: astore          14
        //   216: aload           14
        //   218: athrow         
        //   219: astore          16
        //   221: aload           16
        //   223: athrow         
        //   224: astore          17
        //   226: aload           17
        //   228: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  14     29     135    143    Any
        //  29     41     194    199    Ljava/lang/IllegalStateException;
        //  72     79     214    219    Ljava/lang/IllegalStateException;
        //  79     87     219    224    Ljava/lang/IllegalStateException;
        //  92     99     224    229    Ljava/lang/IllegalStateException;
        //  104    134    224    229    Ljava/lang/IllegalStateException;
        //  137    140    135    143    Any
        //  143    150    199    204    Ljava/lang/IllegalStateException;
        //  155    162    204    209    Ljava/lang/IllegalStateException;
        //  167    174    209    214    Ljava/lang/IllegalStateException;
        //  179    186    214    219    Ljava/lang/IllegalStateException;
        //  196    199    199    204    Ljava/lang/IllegalStateException;
        //  201    204    204    209    Ljava/lang/IllegalStateException;
        //  206    209    209    214    Ljava/lang/IllegalStateException;
        //  211    214    214    219    Ljava/lang/IllegalStateException;
        //  221    224    224    229    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 96, Size: 96
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
    
    public final Context getContext() {
        return this.mContext;
    }
    
    @Override
    public void getRemoteService(final IAccountAccessor p0, final Set p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/google/android/gms/common/internal/zzi.zzkR:()Landroid/os/Bundle;
        //     4: astore          7
        //     6: new             Lcom/google/android/gms/common/internal/GetServiceRequest;
        //     9: dup            
        //    10: aload_0        
        //    11: getfield        com/google/android/gms/common/internal/zzi.zzaat:I
        //    14: invokespecial   com/google/android/gms/common/internal/GetServiceRequest.<init>:(I)V
        //    17: aload_0        
        //    18: getfield        com/google/android/gms/common/internal/zzi.mContext:Landroid/content/Context;
        //    21: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    24: invokevirtual   com/google/android/gms/common/internal/GetServiceRequest.zzcb:(Ljava/lang/String;)Lcom/google/android/gms/common/internal/GetServiceRequest;
        //    27: aload           7
        //    29: invokevirtual   com/google/android/gms/common/internal/GetServiceRequest.zzf:(Landroid/os/Bundle;)Lcom/google/android/gms/common/internal/GetServiceRequest;
        //    32: astore          8
        //    34: aload_2        
        //    35: ifnull          45
        //    38: aload           8
        //    40: aload_2        
        //    41: invokevirtual   com/google/android/gms/common/internal/GetServiceRequest.zzb:(Ljava/util/Collection;)Lcom/google/android/gms/common/internal/GetServiceRequest;
        //    44: pop            
        //    45: aload_0        
        //    46: invokevirtual   com/google/android/gms/common/internal/zzi.requiresSignIn:()Z
        //    49: ifeq            76
        //    52: aload           8
        //    54: aload_0        
        //    55: invokevirtual   com/google/android/gms/common/internal/zzi.zznt:()Landroid/accounts/Account;
        //    58: invokevirtual   com/google/android/gms/common/internal/GetServiceRequest.zzb:(Landroid/accounts/Account;)Lcom/google/android/gms/common/internal/GetServiceRequest;
        //    61: aload_1        
        //    62: invokevirtual   com/google/android/gms/common/internal/GetServiceRequest.zzb:(Lcom/google/android/gms/common/internal/IAccountAccessor;)Lcom/google/android/gms/common/internal/GetServiceRequest;
        //    65: pop            
        //    66: getstatic       com/google/android/gms/common/internal/zzi.a:Z
        //    69: istore          15
        //    71: iload           15
        //    73: ifeq            97
        //    76: aload_0        
        //    77: invokevirtual   com/google/android/gms/common/internal/zzi.requiresAccount:()Z
        //    80: istore          12
        //    82: iload           12
        //    84: ifeq            97
        //    87: aload           8
        //    89: aload_0        
        //    90: getfield        com/google/android/gms/common/internal/zzi.zzMY:Landroid/accounts/Account;
        //    93: invokevirtual   com/google/android/gms/common/internal/GetServiceRequest.zzb:(Landroid/accounts/Account;)Lcom/google/android/gms/common/internal/GetServiceRequest;
        //    96: pop            
        //    97: aload_0        
        //    98: getfield        com/google/android/gms/common/internal/zzi.zzaal:Lcom/google/android/gms/common/internal/zzp;
        //   101: new             Lcom/google/android/gms/common/internal/zzi$zzd;
        //   104: dup            
        //   105: aload_0        
        //   106: aload_0        
        //   107: getfield        com/google/android/gms/common/internal/zzi.zzaau:Ljava/util/concurrent/atomic/AtomicInteger;
        //   110: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //   113: invokespecial   com/google/android/gms/common/internal/zzi$zzd.<init>:(Lcom/google/android/gms/common/internal/zzi;I)V
        //   116: aload           8
        //   118: invokeinterface com/google/android/gms/common/internal/zzp.zza:(Lcom/google/android/gms/common/internal/zzo;Lcom/google/android/gms/common/internal/GetServiceRequest;)V
        //   123: return         
        //   124: astore          16
        //   126: aload           16
        //   128: athrow         
        //   129: astore          5
        //   131: ldc             "GmsClient"
        //   133: ldc_w           "service died"
        //   136: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   139: pop            
        //   140: aload_0        
        //   141: iconst_1       
        //   142: invokevirtual   com/google/android/gms/common/internal/zzi.zzbs:(I)V
        //   145: return         
        //   146: astore          9
        //   148: aload           9
        //   150: athrow         
        //   151: astore          10
        //   153: aload           10
        //   155: athrow         
        //   156: astore          11
        //   158: aload           11
        //   160: athrow         
        //   161: astore_3       
        //   162: ldc             "GmsClient"
        //   164: ldc_w           "Remote exception occurred"
        //   167: aload_3        
        //   168: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   171: pop            
        //   172: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      34     129    146    Landroid/os/DeadObjectException;
        //  0      34     161    173    Landroid/os/RemoteException;
        //  38     45     124    129    Landroid/os/DeadObjectException;
        //  38     45     161    173    Landroid/os/RemoteException;
        //  45     71     146    151    Landroid/os/DeadObjectException;
        //  45     71     161    173    Landroid/os/RemoteException;
        //  76     82     151    156    Landroid/os/DeadObjectException;
        //  76     82     161    173    Landroid/os/RemoteException;
        //  87     97     156    161    Landroid/os/DeadObjectException;
        //  87     97     161    173    Landroid/os/RemoteException;
        //  97     123    129    146    Landroid/os/DeadObjectException;
        //  97     123    161    173    Landroid/os/RemoteException;
        //  126    129    129    146    Landroid/os/DeadObjectException;
        //  126    129    161    173    Landroid/os/RemoteException;
        //  148    151    151    156    Landroid/os/DeadObjectException;
        //  148    151    161    173    Landroid/os/RemoteException;
        //  153    156    156    161    Landroid/os/DeadObjectException;
        //  153    156    161    173    Landroid/os/RemoteException;
        //  158    161    129    146    Landroid/os/DeadObjectException;
        //  158    161    161    173    Landroid/os/RemoteException;
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
    
    protected abstract String getServiceDescriptor();
    
    protected abstract String getStartServiceAction();
    
    @Override
    public boolean isConnected() {
        while (true) {
            synchronized (this.zzqt) {
                if (this.zzaaq == 3) {
                    return true;
                }
            }
            return false;
        }
    }
    
    public boolean isConnecting() {
        while (true) {
            synchronized (this.zzqt) {
                if (this.zzaaq == 2) {
                    return true;
                }
            }
            return false;
        }
    }
    
    protected void onConnectionFailed(final ConnectionResult connectionResult) {
    }
    
    protected void onConnectionSuspended(final int n) {
    }
    
    public boolean requiresAccount() {
        return false;
    }
    
    @Override
    public boolean requiresSignIn() {
        return false;
    }
    
    @Override
    public void validateAccount(final IAccountAccessor accountAccessor) {
        final ValidateAccountRequest validateAccountRequest = new ValidateAccountRequest(accountAccessor, this.zzWJ.toArray(new Scope[this.zzWJ.size()]), this.mContext.getPackageName(), this.zznN());
        try {
            this.zzaal.zza(new zzi$zzd(this, this.zzaau.get()), validateAccountRequest);
        }
        catch (DeadObjectException ex2) {
            Log.w("GmsClient", "service died");
            this.zzbs(1);
        }
        catch (RemoteException ex) {
            Log.w("GmsClient", "Remote exception occurred", (Throwable)ex);
        }
    }
    
    protected abstract IInterface zzT(final IBinder p0);
    
    protected Set zza(final Set set) {
        return set;
    }
    
    protected void zza(final int n, final Bundle bundle, final int n2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(5, n2, -1, (Object)new zzi$zzi(this, n, bundle)));
    }
    
    protected void zza(final int n, final IBinder binder, final Bundle bundle, final int n2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, n2, -1, (Object)new zzi$zzg(this, n, binder, bundle)));
    }
    
    public void zzbs(final int n) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, this.zzaau.get(), n));
    }
    
    protected void zzbt(final int n) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6, n, -1, (Object)new zzi$zzh(this)));
    }
    
    protected String zzkQ() {
        return this.zzXa.zznz();
    }
    
    protected Bundle zzkR() {
        return new Bundle();
    }
    
    @Override
    public Bundle zzlM() {
        return null;
    }
    
    protected void zznG() {
    }
    
    protected final void zznL() {
        try {
            if (!this.isConnected()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public final IInterface zznM() {
        synchronized (this.zzqt) {
            if (this.zzaaq == 4) {
                throw new DeadObjectException();
            }
        }
        while (true) {
            while (true) {
                try {
                    this.zznL();
                    if (this.zzaan != null) {
                        final boolean b = true;
                        zzu.zza(b, "Client is connected but service is null");
                        // monitorexit(o)
                        return this.zzaan;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    protected Bundle zznN() {
        return null;
    }
    
    public final Account zznt() {
        try {
            if (this.zzMY != null) {
                return this.zzMY;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return new Account("<<default account>>", "com.google");
    }
}
