// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.stats;

import android.os.Process;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Debug;
import com.google.android.gms.internal.zzll;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.Context;
import com.google.android.gms.internal.zzla;
import java.util.List;
import android.content.ComponentName;

public class zzb
{
    private static final Object zzaaJ;
    private static zzb zzack;
    private static final ComponentName zzacp;
    private final List zzacl;
    private final List zzacm;
    private final List zzacn;
    private final List zzaco;
    private zze zzacq;
    
    static {
        zzaaJ = new Object();
        zzacp = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    }
    
    private zzb() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: invokespecial   com/google/android/gms/common/stats/zzb.getLogLevel:()I
        //     8: getstatic       com/google/android/gms/common/stats/zzd.zzacz:I
        //    11: if_icmpne       43
        //    14: aload_0        
        //    15: getstatic       java/util/Collections.EMPTY_LIST:Ljava/util/List;
        //    18: putfield        com/google/android/gms/common/stats/zzb.zzacl:Ljava/util/List;
        //    21: aload_0        
        //    22: getstatic       java/util/Collections.EMPTY_LIST:Ljava/util/List;
        //    25: putfield        com/google/android/gms/common/stats/zzb.zzacm:Ljava/util/List;
        //    28: aload_0        
        //    29: getstatic       java/util/Collections.EMPTY_LIST:Ljava/util/List;
        //    32: putfield        com/google/android/gms/common/stats/zzb.zzacn:Ljava/util/List;
        //    35: aload_0        
        //    36: getstatic       java/util/Collections.EMPTY_LIST:Ljava/util/List;
        //    39: putfield        com/google/android/gms/common/stats/zzb.zzaco:Ljava/util/List;
        //    42: return         
        //    43: getstatic       com/google/android/gms/common/stats/zzc$zza.zzacu:Lcom/google/android/gms/internal/zzkf;
        //    46: invokevirtual   com/google/android/gms/internal/zzkf.get:()Ljava/lang/Object;
        //    49: checkcast       Ljava/lang/String;
        //    52: astore_1       
        //    53: aload_1        
        //    54: ifnonnull       177
        //    57: getstatic       java/util/Collections.EMPTY_LIST:Ljava/util/List;
        //    60: astore_2       
        //    61: aload_0        
        //    62: aload_2        
        //    63: putfield        com/google/android/gms/common/stats/zzb.zzacl:Ljava/util/List;
        //    66: getstatic       com/google/android/gms/common/stats/zzc$zza.zzacv:Lcom/google/android/gms/internal/zzkf;
        //    69: invokevirtual   com/google/android/gms/internal/zzkf.get:()Ljava/lang/Object;
        //    72: checkcast       Ljava/lang/String;
        //    75: astore_3       
        //    76: aload_3        
        //    77: ifnonnull       195
        //    80: getstatic       java/util/Collections.EMPTY_LIST:Ljava/util/List;
        //    83: astore          4
        //    85: aload_0        
        //    86: aload           4
        //    88: putfield        com/google/android/gms/common/stats/zzb.zzacm:Ljava/util/List;
        //    91: getstatic       com/google/android/gms/common/stats/zzc$zza.zzacw:Lcom/google/android/gms/internal/zzkf;
        //    94: invokevirtual   com/google/android/gms/internal/zzkf.get:()Ljava/lang/Object;
        //    97: checkcast       Ljava/lang/String;
        //   100: astore          5
        //   102: aload           5
        //   104: ifnonnull       214
        //   107: getstatic       java/util/Collections.EMPTY_LIST:Ljava/util/List;
        //   110: astore          6
        //   112: aload_0        
        //   113: aload           6
        //   115: putfield        com/google/android/gms/common/stats/zzb.zzacn:Ljava/util/List;
        //   118: getstatic       com/google/android/gms/common/stats/zzc$zza.zzacx:Lcom/google/android/gms/internal/zzkf;
        //   121: invokevirtual   com/google/android/gms/internal/zzkf.get:()Ljava/lang/Object;
        //   124: checkcast       Ljava/lang/String;
        //   127: astore          7
        //   129: aload           7
        //   131: ifnonnull       234
        //   134: getstatic       java/util/Collections.EMPTY_LIST:Ljava/util/List;
        //   137: astore          8
        //   139: aload_0        
        //   140: aload           8
        //   142: putfield        com/google/android/gms/common/stats/zzb.zzaco:Ljava/util/List;
        //   145: aload_0        
        //   146: new             Lcom/google/android/gms/common/stats/zze;
        //   149: dup            
        //   150: sipush          1024
        //   153: getstatic       com/google/android/gms/common/stats/zzc$zza.zzacy:Lcom/google/android/gms/internal/zzkf;
        //   156: invokevirtual   com/google/android/gms/internal/zzkf.get:()Ljava/lang/Object;
        //   159: checkcast       Ljava/lang/Long;
        //   162: invokevirtual   java/lang/Long.longValue:()J
        //   165: invokespecial   com/google/android/gms/common/stats/zze.<init>:(IJ)V
        //   168: putfield        com/google/android/gms/common/stats/zzb.zzacq:Lcom/google/android/gms/common/stats/zze;
        //   171: return         
        //   172: astore          12
        //   174: aload           12
        //   176: athrow         
        //   177: aload_1        
        //   178: ldc             ","
        //   180: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   183: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   186: astore_2       
        //   187: goto            61
        //   190: astore          11
        //   192: aload           11
        //   194: athrow         
        //   195: aload_3        
        //   196: ldc             ","
        //   198: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   201: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   204: astore          4
        //   206: goto            85
        //   209: astore          10
        //   211: aload           10
        //   213: athrow         
        //   214: aload           5
        //   216: ldc             ","
        //   218: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   221: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   224: astore          6
        //   226: goto            112
        //   229: astore          9
        //   231: aload           9
        //   233: athrow         
        //   234: aload           7
        //   236: ldc             ","
        //   238: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   241: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   244: astore          8
        //   246: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  57     61     172    177    Ljava/lang/SecurityException;
        //  80     85     190    195    Ljava/lang/SecurityException;
        //  107    112    209    214    Ljava/lang/SecurityException;
        //  134    139    229    234    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 110, Size: 110
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    private int getLogLevel() {
        try {
            if (zzla.zziW()) {
                return (int)zzc$zza.zzact.get();
            }
        }
        catch (SecurityException ex) {
            try {
                throw ex;
            }
            catch (SecurityException ex2) {
                return zzd.zzacz;
            }
        }
        return zzd.zzacz;
    }
    
    private void zza(final Context context, final ServiceConnection serviceConnection, final String s, final Intent intent, final int n) {
        while (true) {
            try {
                if (!com.google.android.gms.common.internal.zzd.zzZR) {
                    return;
                }
            }
            catch (SecurityException ex) {
                throw ex;
            }
            final String zzb = this.zzb(serviceConnection);
            try {
                if (this.zza(context, s, intent, zzb, n)) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    final int n2 = this.getLogLevel() & zzd.zzacD;
                    String zzl = null;
                    if (n2 != 0) {
                        zzl = zzll.zzl(3, 5);
                    }
                    long nativeHeapAllocatedSize = 0L;
                    if ((this.getLogLevel() & zzd.zzacF) != 0x0) {
                        nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                    }
                    ConnectionEvent connectionEvent = null;
                    Label_0180: {
                        if (n == 1 || n == 4) {
                            connectionEvent = new ConnectionEvent(currentTimeMillis, n, null, null, null, null, zzl, zzb, SystemClock.elapsedRealtime(), nativeHeapAllocatedSize);
                            if (!zzd.a) {
                                break Label_0180;
                            }
                        }
                        final ServiceInfo zzb2 = zzb(context, intent);
                        connectionEvent = new ConnectionEvent(currentTimeMillis, n, zzll.zzaj(context), s, zzb2.processName, zzb2.name, zzl, zzb, SystemClock.elapsedRealtime(), nativeHeapAllocatedSize);
                    }
                    context.startService(new Intent().setComponent(com.google.android.gms.common.stats.zzb.zzacp).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", (Parcelable)connectionEvent));
                }
            }
            catch (SecurityException ex2) {
                throw ex2;
            }
        }
    }
    
    private boolean zza(final Context context, final Intent intent) {
        final ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if (!com.google.android.gms.common.internal.zzd.zzZR) {
                    return zzla.zzi(context, component.getPackageName());
                }
                final String s = "com.google.android.gms";
                final ComponentName componentName = component;
                final String s2 = componentName.getPackageName();
                final boolean b = s.equals(s2);
                if (b) {
                    return false;
                }
                return zzla.zzi(context, component.getPackageName());
            }
            catch (SecurityException ex) {
                throw ex;
            }
            try {
                final String s = "com.google.android.gms";
                final ComponentName componentName = component;
                final String s2 = componentName.getPackageName();
                final boolean b = s.equals(s2);
                if (b) {
                    return false;
                }
            }
            catch (SecurityException ex2) {
                throw ex2;
            }
            return zzla.zzi(context, component.getPackageName());
        }
        return false;
    }
    
    private boolean zza(final Context p0, final String p1, final Intent p2, final String p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/android/gms/common/stats/zzb.getLogLevel:()I
        //     4: istore          6
        //     6: getstatic       com/google/android/gms/common/stats/zzd.zzacz:I
        //     9: istore          9
        //    11: iload           6
        //    13: iload           9
        //    15: if_icmpeq       284
        //    18: aload_0        
        //    19: getfield        com/google/android/gms/common/stats/zzb.zzacq:Lcom/google/android/gms/common/stats/zze;
        //    22: ifnonnull       37
        //    25: iconst_0       
        //    26: ireturn        
        //    27: astore          7
        //    29: aload           7
        //    31: athrow         
        //    32: astore          8
        //    34: aload           8
        //    36: athrow         
        //    37: iload           5
        //    39: iconst_4       
        //    40: if_icmpeq       49
        //    43: iload           5
        //    45: iconst_1       
        //    46: if_icmpne       72
        //    49: aload_0        
        //    50: getfield        com/google/android/gms/common/stats/zzb.zzacq:Lcom/google/android/gms/common/stats/zze;
        //    53: aload           4
        //    55: invokevirtual   com/google/android/gms/common/stats/zze.zzcq:(Ljava/lang/String;)Z
        //    58: istore          11
        //    60: iload           11
        //    62: ifeq            284
        //    65: iconst_1       
        //    66: ireturn        
        //    67: astore          10
        //    69: aload           10
        //    71: athrow         
        //    72: aload_1        
        //    73: aload_3        
        //    74: invokestatic    com/google/android/gms/common/stats/zzb.zzb:(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/pm/ServiceInfo;
        //    77: astore          12
        //    79: aload           12
        //    81: ifnonnull       124
        //    84: iconst_2       
        //    85: anewarray       Ljava/lang/Object;
        //    88: astore          30
        //    90: aload           30
        //    92: iconst_0       
        //    93: aload_2        
        //    94: aastore        
        //    95: aload           30
        //    97: iconst_1       
        //    98: aload_3        
        //    99: iconst_0       
        //   100: invokevirtual   android/content/Intent.toUri:(I)Ljava/lang/String;
        //   103: aastore        
        //   104: ldc             "ConnectionTracker"
        //   106: ldc             "Client %s made an invalid request %s"
        //   108: aload           30
        //   110: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   113: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   116: pop            
        //   117: iconst_0       
        //   118: ireturn        
        //   119: astore          29
        //   121: aload           29
        //   123: athrow         
        //   124: aload_1        
        //   125: invokestatic    com/google/android/gms/internal/zzll.zzaj:(Landroid/content/Context;)Ljava/lang/String;
        //   128: astore          13
        //   130: aload           12
        //   132: getfield        android/content/pm/ServiceInfo.processName:Ljava/lang/String;
        //   135: astore          14
        //   137: aload           12
        //   139: getfield        android/content/pm/ServiceInfo.name:Ljava/lang/String;
        //   142: astore          15
        //   144: aload_0        
        //   145: getfield        com/google/android/gms/common/stats/zzb.zzacl:Ljava/util/List;
        //   148: aload           13
        //   150: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   155: istore          22
        //   157: iload           22
        //   159: ifne            284
        //   162: aload_0        
        //   163: getfield        com/google/android/gms/common/stats/zzb.zzacm:Ljava/util/List;
        //   166: aload_2        
        //   167: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   172: istore          23
        //   174: iload           23
        //   176: ifne            284
        //   179: aload_0        
        //   180: getfield        com/google/android/gms/common/stats/zzb.zzacn:Ljava/util/List;
        //   183: aload           14
        //   185: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   190: istore          24
        //   192: iload           24
        //   194: ifne            284
        //   197: aload_0        
        //   198: getfield        com/google/android/gms/common/stats/zzb.zzaco:Ljava/util/List;
        //   201: aload           15
        //   203: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   208: istore          25
        //   210: iload           25
        //   212: ifne            284
        //   215: aload           14
        //   217: aload           13
        //   219: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   222: istore          26
        //   224: iload           26
        //   226: ifeq            242
        //   229: getstatic       com/google/android/gms/common/stats/zzd.zzacE:I
        //   232: istore          28
        //   234: iload           6
        //   236: iload           28
        //   238: iand           
        //   239: ifne            284
        //   242: aload_0        
        //   243: getfield        com/google/android/gms/common/stats/zzb.zzacq:Lcom/google/android/gms/common/stats/zze;
        //   246: aload           4
        //   248: invokevirtual   com/google/android/gms/common/stats/zze.zzcp:(Ljava/lang/String;)Ljava/lang/Long;
        //   251: pop            
        //   252: iconst_1       
        //   253: ireturn        
        //   254: astore          16
        //   256: aload           16
        //   258: athrow         
        //   259: astore          17
        //   261: aload           17
        //   263: athrow         
        //   264: astore          18
        //   266: aload           18
        //   268: athrow         
        //   269: astore          19
        //   271: aload           19
        //   273: athrow         
        //   274: astore          20
        //   276: aload           20
        //   278: athrow         
        //   279: astore          21
        //   281: aload           21
        //   283: athrow         
        //   284: iconst_0       
        //   285: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  6      11     27     32     Ljava/lang/SecurityException;
        //  18     25     32     37     Ljava/lang/SecurityException;
        //  29     32     32     37     Ljava/lang/SecurityException;
        //  49     60     67     72     Ljava/lang/SecurityException;
        //  84     117    119    124    Ljava/lang/SecurityException;
        //  144    157    254    259    Ljava/lang/SecurityException;
        //  162    174    259    264    Ljava/lang/SecurityException;
        //  179    192    264    269    Ljava/lang/SecurityException;
        //  197    210    269    274    Ljava/lang/SecurityException;
        //  215    224    274    279    Ljava/lang/SecurityException;
        //  229    234    279    284    Ljava/lang/SecurityException;
        //  256    259    259    264    Ljava/lang/SecurityException;
        //  261    264    264    269    Ljava/lang/SecurityException;
        //  266    269    269    274    Ljava/lang/SecurityException;
        //  271    274    274    279    Ljava/lang/SecurityException;
        //  276    279    279    284    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 143, Size: 143
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
    
    private static ServiceInfo zzb(final Context context, final Intent intent) {
        final List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        while (true) {
            if (queryIntentServices != null) {
                try {
                    if (queryIntentServices.size() == 0) {
                        Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", intent.toUri(0), zzll.zzl(3, 20)));
                        return null;
                    }
                }
                catch (SecurityException ex) {
                    throw ex;
                }
                if (queryIntentServices.size() > 1) {
                    Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", intent.toUri(0), zzll.zzl(3, 20)));
                    final Iterator<ResolveInfo> iterator = queryIntentServices.iterator();
                    if (iterator.hasNext()) {
                        Log.w("ConnectionTracker", iterator.next().serviceInfo.name);
                        return null;
                    }
                }
                return queryIntentServices.get(0).serviceInfo;
            }
            continue;
        }
    }
    
    private String zzb(final ServiceConnection serviceConnection) {
        return String.valueOf(Process.myPid() << 32 | System.identityHashCode(serviceConnection));
    }
    
    public static zzb zzoO() {
        synchronized (zzb.zzaaJ) {
            if (zzb.zzack == null) {
                zzb.zzack = new zzb();
            }
            return zzb.zzack;
        }
    }
    
    public void zza(final Context context, final ServiceConnection serviceConnection) {
        this.zza(context, serviceConnection, null, null, 1);
        context.unbindService(serviceConnection);
    }
    
    public void zza(final Context context, final ServiceConnection serviceConnection, final String s, final Intent intent) {
        this.zza(context, serviceConnection, s, intent, 3);
    }
    
    public boolean zza(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n) {
        try {
            if (this.zza(context, intent)) {
                Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                return false;
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        this.zza(context, serviceConnection, s, intent, 2);
        return context.bindService(intent, serviceConnection, n);
    }
    
    public void zzb(final Context context, final ServiceConnection serviceConnection) {
        this.zza(context, serviceConnection, null, null, 4);
    }
}
