// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Message;
import android.os.Build$VERSION;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import android.os.SystemClock;
import java.util.Random;
import java.io.IOException;
import android.os.ConditionVariable;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.util.Log;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.os.Process;
import android.content.pm.PackageManager$NameNotFoundException;
import java.security.KeyPair;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;
import android.os.Messenger;
import android.app.PendingIntent;

public class zzc
{
    static String zzaxd;
    static int zzaxe;
    static int zzaxf;
    static int zzaxg;
    PendingIntent zzavT;
    Messenger zzavX;
    Map zzaxh;
    Messenger zzaxi;
    MessengerCompat zzaxj;
    long zzaxk;
    long zzaxl;
    int zzaxm;
    int zzaxn;
    long zzaxo;
    Context zzpH;
    
    static {
        zzc.zzaxd = null;
        zzc.zzaxe = 0;
        zzc.zzaxf = 0;
        zzc.zzaxg = 0;
    }
    
    public zzc(final Context zzpH) {
        this.zzaxh = new HashMap();
        this.zzpH = zzpH;
    }
    
    static String zza(final KeyPair p0, final String[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             "\n"
        //     2: aload_1        
        //     3: invokestatic    android/text/TextUtils.join:(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
        //     6: ldc             "UTF-8"
        //     8: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    11: astore          4
        //    13: aload_0        
        //    14: invokevirtual   java/security/KeyPair.getPrivate:()Ljava/security/PrivateKey;
        //    17: astore          7
        //    19: aload           7
        //    21: instanceof      Ljava/security/interfaces/RSAPrivateKey;
        //    24: ifeq            96
        //    27: ldc             "SHA256withRSA"
        //    29: astore          9
        //    31: aload           9
        //    33: invokestatic    java/security/Signature.getInstance:(Ljava/lang/String;)Ljava/security/Signature;
        //    36: astore          10
        //    38: aload           10
        //    40: aload           7
        //    42: invokevirtual   java/security/Signature.initSign:(Ljava/security/PrivateKey;)V
        //    45: aload           10
        //    47: aload           4
        //    49: invokevirtual   java/security/Signature.update:([B)V
        //    52: aload           10
        //    54: invokevirtual   java/security/Signature.sign:()[B
        //    57: invokestatic    com/google/android/gms/iid/InstanceID.zzm:([B)Ljava/lang/String;
        //    60: astore          11
        //    62: aload           11
        //    64: areturn        
        //    65: astore_2       
        //    66: ldc             "InstanceID/Rpc"
        //    68: ldc             "Unable to encode string"
        //    70: aload_2        
        //    71: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    74: pop            
        //    75: aconst_null    
        //    76: areturn        
        //    77: astore          8
        //    79: aload           8
        //    81: athrow         
        //    82: astore          5
        //    84: ldc             "InstanceID/Rpc"
        //    86: ldc             "Unable to sign registration request"
        //    88: aload           5
        //    90: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    93: pop            
        //    94: aconst_null    
        //    95: areturn        
        //    96: ldc             "SHA256withECDSA"
        //    98: astore          9
        //   100: goto            31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  0      13     65     77     Ljava/io/UnsupportedEncodingException;
        //  13     19     82     96     Ljava/security/GeneralSecurityException;
        //  19     27     77     82     Ljava/io/UnsupportedEncodingException;
        //  19     27     82     96     Ljava/security/GeneralSecurityException;
        //  31     62     82     96     Ljava/security/GeneralSecurityException;
        //  79     82     82     96     Ljava/security/GeneralSecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
    
    public static String zzaw(final Context context) {
        final int a = MessengerCompat.a;
        try {
            if (zzc.zzaxd != null) {
                return zzc.zzaxd;
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw ex;
        }
        zzc.zzaxe = Process.myUid();
        final PackageManager packageManager = context.getPackageManager();
        final Iterator iterator = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
        while (true) {
            Label_0220: {
                if (!iterator.hasNext()) {
                    break Label_0220;
                }
                final ResolveInfo resolveInfo = iterator.next();
                Label_0216: {
                    if (packageManager.checkPermission("com.google.android.c2dm.permission.RECEIVE", resolveInfo.serviceInfo.packageName) == 0) {
                        try {
                            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(resolveInfo.serviceInfo.packageName, 0);
                            Log.w("InstanceID/Rpc", "Found " + applicationInfo.uid);
                            zzc.zzaxf = applicationInfo.uid;
                            return zzc.zzaxd = resolveInfo.serviceInfo.packageName;
                        }
                        catch (PackageManager$NameNotFoundException ex3) {
                            if (a == 0) {
                                break Label_0216;
                            }
                        }
                    }
                    try {
                        Log.w("InstanceID/Rpc", "Possible malicious package " + resolveInfo.serviceInfo.packageName + " declares " + "com.google.android.c2dm.intent.REGISTER" + " without permission");
                        if (a != 0) {
                            Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
                            final PackageManager packageManager2 = packageManager;
                            final String s = "com.google.android.gms";
                            final int n = 0;
                            final ApplicationInfo applicationInfo2 = packageManager2.getApplicationInfo(s, n);
                            final ApplicationInfo applicationInfo4;
                            final ApplicationInfo applicationInfo3 = applicationInfo4 = applicationInfo2;
                            zzc.zzaxd = applicationInfo4.packageName;
                            final ApplicationInfo applicationInfo5 = applicationInfo3;
                            zzc.zzaxf = applicationInfo5.uid;
                            final String zzaxd = zzc.zzaxd;
                            return zzaxd;
                        }
                        continue;
                    }
                    catch (PackageManager$NameNotFoundException ex2) {
                        throw ex2;
                    }
                }
            }
            try {
                final PackageManager packageManager2 = packageManager;
                final String s = "com.google.android.gms";
                final int n = 0;
                final ApplicationInfo applicationInfo2 = packageManager2.getApplicationInfo(s, n);
                final ApplicationInfo applicationInfo4;
                final ApplicationInfo applicationInfo3 = applicationInfo4 = applicationInfo2;
                zzc.zzaxd = applicationInfo4.packageName;
                final ApplicationInfo applicationInfo5 = applicationInfo3;
                zzc.zzaxf = applicationInfo5.uid;
                final String zzaxd2;
                final String zzaxd = zzaxd2 = zzc.zzaxd;
                return zzaxd2;
            }
            catch (PackageManager$NameNotFoundException ex4) {
                try {
                    final ApplicationInfo applicationInfo6 = packageManager.getApplicationInfo("com.google.android.gsf", 0);
                    zzc.zzaxd = applicationInfo6.packageName;
                    zzc.zzaxf = applicationInfo6.uid;
                    return zzc.zzaxd;
                }
                catch (PackageManager$NameNotFoundException ex5) {
                    Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                    return null;
                }
            }
        }
    }
    
    private Intent zzb(final Bundle bundle, final KeyPair keyPair) {
        final ConditionVariable conditionVariable = new ConditionVariable();
        final String zzuk = zzuk();
        final Class<? extends zzc> class1 = this.getClass();
        Intent intent2 = null;
        Label_0105: {
            synchronized (class1) {
                this.zzaxh.put(zzuk, conditionVariable);
                // monitorexit(class1)
                this.zza(bundle, keyPair, zzuk);
                conditionVariable.block(30000L);
                final Class<? extends zzc> class2 = this.getClass();
                // monitorenter(class2)
                final zzc zzc = this;
                final Map map = zzc.zzaxh;
                final String s = zzuk;
                final Intent intent = map.remove(s);
                final Intent intent3;
                intent2 = (intent3 = intent);
                final boolean b = intent3 instanceof Intent;
                if (b) {
                    final Intent intent4 = intent2;
                    final Intent intent5 = intent4;
                    return intent5;
                }
                break Label_0105;
            }
            try {
                final zzc zzc = this;
                final Map map = zzc.zzaxh;
                final String s = zzuk;
                final Intent intent = map.remove(s);
                final Intent intent3;
                intent2 = (intent3 = intent);
                final boolean b = intent3 instanceof Intent;
                if (b) {
                    final Intent intent4 = intent2;
                    final Intent intent6;
                    final Intent intent5 = intent6 = intent4;
                    return intent6;
                }
                if (intent2 instanceof String) {
                    throw new IOException((String)intent2);
                }
            }
            finally {
            }
            // monitorexit(class2)
        }
        Log.w("InstanceID/Rpc", "No response " + intent2);
        throw new IOException("TIMEOUT");
    }
    
    private void zzdd(final String s) {
        if ("com.google.android.gsf".equals(zzc.zzaxd)) {
            ++this.zzaxm;
            if (this.zzaxm >= 3) {
                if (this.zzaxm == 3) {
                    this.zzaxn = 1000 + new Random().nextInt(1000);
                }
                this.zzaxn *= 2;
                this.zzaxo = SystemClock.elapsedRealtime() + this.zzaxn;
                Log.w("InstanceID/Rpc", "Backoff due to " + s + " for " + this.zzaxn);
            }
        }
    }
    
    private void zze(final Object p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: instanceof      Landroid/os/ConditionVariable;
        //     4: ifeq            14
        //     7: aload_1        
        //     8: checkcast       Landroid/os/ConditionVariable;
        //    11: invokevirtual   android/os/ConditionVariable.open:()V
        //    14: aload_1        
        //    15: instanceof      Landroid/os/Messenger;
        //    18: ifeq            45
        //    21: aload_1        
        //    22: checkcast       Landroid/os/Messenger;
        //    25: astore          4
        //    27: invokestatic    android/os/Message.obtain:()Landroid/os/Message;
        //    30: astore          5
        //    32: aload           5
        //    34: aload_2        
        //    35: putfield        android/os/Message.obj:Ljava/lang/Object;
        //    38: aload           4
        //    40: aload           5
        //    42: invokevirtual   android/os/Messenger.send:(Landroid/os/Message;)V
        //    45: return         
        //    46: astore_3       
        //    47: aload_3        
        //    48: athrow         
        //    49: astore          6
        //    51: ldc             "InstanceID/Rpc"
        //    53: new             Ljava/lang/StringBuilder;
        //    56: dup            
        //    57: invokespecial   java/lang/StringBuilder.<init>:()V
        //    60: ldc_w           "Failed to send response "
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    66: aload           6
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    77: pop            
        //    78: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      14     46     49     Landroid/os/RemoteException;
        //  38     45     49     79     Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    private void zzi(final String s, final Object o) {
        synchronized (this.getClass()) {
            final Object value = this.zzaxh.get(s);
            this.zzaxh.put(s, o);
            this.zze(value, o);
        }
    }
    
    public static String zzuk() {
        synchronized (zzc.class) {
            final int zzaxg = zzc.zzaxg;
            zzc.zzaxg = zzaxg + 1;
            return Integer.toString(zzaxg);
        }
    }
    
    private void zzx(final Object o) {
        final int a = MessengerCompat.a;
        synchronized (this.getClass()) {
            for (final String s : this.zzaxh.keySet()) {
                final Object value = this.zzaxh.get(s);
                this.zzaxh.put(s, o);
                this.zze(value, o);
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    Intent zza(final Bundle bundle, final KeyPair keyPair) {
        Intent intent = this.zzb(bundle, keyPair);
        if (intent != null && intent.hasExtra("google.messenger")) {
            intent = this.zzb(bundle, keyPair);
        }
        return intent;
    }
    
    void zza(final Bundle bundle, final KeyPair keyPair, final String s) {
        final int a = MessengerCompat.a;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzaxo != 0L && elapsedRealtime <= this.zzaxo) {
            Log.w("InstanceID/Rpc", "Backoff mode, next request attempt: " + (this.zzaxo - elapsedRealtime) + " interval: " + this.zzaxn);
            throw new IOException("RETRY_LATER");
        }
        this.zzuj();
        if (zzc.zzaxd == null) {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
        this.zzaxk = SystemClock.elapsedRealtime();
        final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(zzc.zzaxd);
        bundle.putString("gmsv", Integer.toString(GoogleCloudMessaging.zzat(this.zzpH)));
        bundle.putString("osv", Integer.toString(Build$VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(InstanceID.zzau(this.zzpH)));
        bundle.putString("cliv", "1");
        bundle.putString("appid", InstanceID.zza(keyPair));
        final String zzm = InstanceID.zzm(keyPair.getPublic().getEncoded());
        bundle.putString("pub2", zzm);
        bundle.putString("sig", zza(keyPair, new String[] { this.zzpH.getPackageName(), zzm }));
        intent.putExtras(bundle);
        this.zzo(intent);
        this.zzb(intent, s);
        if (a != 0) {
            final boolean a2 = zzb$zza.a;
            boolean a3 = false;
            if (!a2) {
                a3 = true;
            }
            zzb$zza.a = a3;
        }
    }
    
    protected void zzb(final Intent p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //     4: putfield        com/google/android/gms/iid/zzc.zzaxk:J
        //     7: aload_1        
        //     8: ldc_w           "kid"
        //    11: new             Ljava/lang/StringBuilder;
        //    14: dup            
        //    15: invokespecial   java/lang/StringBuilder.<init>:()V
        //    18: ldc_w           "|ID|"
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    24: aload_2        
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: ldc_w           "|"
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    37: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    40: pop            
        //    41: aload_1        
        //    42: ldc_w           "X-kid"
        //    45: new             Ljava/lang/StringBuilder;
        //    48: dup            
        //    49: invokespecial   java/lang/StringBuilder.<init>:()V
        //    52: ldc_w           "|ID|"
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: aload_2        
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: ldc_w           "|"
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    71: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    74: pop            
        //    75: ldc             "com.google.android.gsf"
        //    77: getstatic       com/google/android/gms/iid/zzc.zzaxd:Ljava/lang/String;
        //    80: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    83: istore          5
        //    85: aload_1        
        //    86: ldc_w           "useGsf"
        //    89: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    92: astore          6
        //    94: aload           6
        //    96: ifnull          109
        //    99: ldc_w           "1"
        //   102: aload           6
        //   104: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   107: istore          5
        //   109: ldc             "InstanceID/Rpc"
        //   111: iconst_3       
        //   112: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   115: ifeq            147
        //   118: ldc             "InstanceID/Rpc"
        //   120: new             Ljava/lang/StringBuilder;
        //   123: dup            
        //   124: invokespecial   java/lang/StringBuilder.<init>:()V
        //   127: ldc_w           "Sending "
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: aload_1        
        //   134: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   140: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   143: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   146: pop            
        //   147: aload_0        
        //   148: getfield        com/google/android/gms/iid/zzc.zzaxi:Landroid/os/Messenger;
        //   151: ifnull          212
        //   154: aload_1        
        //   155: ldc_w           "google.messenger"
        //   158: aload_0        
        //   159: getfield        com/google/android/gms/iid/zzc.zzavX:Landroid/os/Messenger;
        //   162: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   165: pop            
        //   166: invokestatic    android/os/Message.obtain:()Landroid/os/Message;
        //   169: astore          22
        //   171: aload           22
        //   173: aload_1        
        //   174: putfield        android/os/Message.obj:Ljava/lang/Object;
        //   177: aload_0        
        //   178: getfield        com/google/android/gms/iid/zzc.zzaxi:Landroid/os/Messenger;
        //   181: aload           22
        //   183: invokevirtual   android/os/Messenger.send:(Landroid/os/Message;)V
        //   186: return         
        //   187: astore          7
        //   189: aload           7
        //   191: athrow         
        //   192: astore          23
        //   194: ldc             "InstanceID/Rpc"
        //   196: iconst_3       
        //   197: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   200: ifeq            212
        //   203: ldc             "InstanceID/Rpc"
        //   205: ldc_w           "Messenger failed, fallback to startService"
        //   208: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   211: pop            
        //   212: iload           5
        //   214: ifeq            268
        //   217: new             Landroid/content/Intent;
        //   220: dup            
        //   221: ldc_w           "com.google.android.gms.iid.InstanceID"
        //   224: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   227: astore          8
        //   229: aload           8
        //   231: aload_0        
        //   232: getfield        com/google/android/gms/iid/zzc.zzpH:Landroid/content/Context;
        //   235: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   238: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //   241: pop            
        //   242: aload           8
        //   244: ldc_w           "GSF"
        //   247: aload_1        
        //   248: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   251: pop            
        //   252: aload_0        
        //   253: getfield        com/google/android/gms/iid/zzc.zzpH:Landroid/content/Context;
        //   256: aload           8
        //   258: invokevirtual   android/content/Context.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
        //   261: pop            
        //   262: getstatic       com/google/android/gms/iid/MessengerCompat.a:I
        //   265: ifeq            186
        //   268: aload_1        
        //   269: ldc_w           "google.messenger"
        //   272: aload_0        
        //   273: getfield        com/google/android/gms/iid/zzc.zzavX:Landroid/os/Messenger;
        //   276: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   279: pop            
        //   280: aload_1        
        //   281: ldc_w           "messenger2"
        //   284: ldc_w           "1"
        //   287: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   290: pop            
        //   291: aload_0        
        //   292: getfield        com/google/android/gms/iid/zzc.zzaxj:Lcom/google/android/gms/iid/MessengerCompat;
        //   295: astore          15
        //   297: aload           15
        //   299: ifnull          343
        //   302: invokestatic    android/os/Message.obtain:()Landroid/os/Message;
        //   305: astore          17
        //   307: aload           17
        //   309: aload_1        
        //   310: putfield        android/os/Message.obj:Ljava/lang/Object;
        //   313: aload_0        
        //   314: getfield        com/google/android/gms/iid/zzc.zzaxj:Lcom/google/android/gms/iid/MessengerCompat;
        //   317: aload           17
        //   319: invokevirtual   com/google/android/gms/iid/MessengerCompat.send:(Landroid/os/Message;)V
        //   322: return         
        //   323: astore          18
        //   325: ldc             "InstanceID/Rpc"
        //   327: iconst_3       
        //   328: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   331: ifeq            343
        //   334: ldc             "InstanceID/Rpc"
        //   336: ldc_w           "Messenger failed, fallback to startService"
        //   339: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   342: pop            
        //   343: aload_0        
        //   344: getfield        com/google/android/gms/iid/zzc.zzpH:Landroid/content/Context;
        //   347: aload_1        
        //   348: invokevirtual   android/content/Context.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
        //   351: pop            
        //   352: return         
        //   353: astore          24
        //   355: aload           24
        //   357: athrow         
        //   358: astore          9
        //   360: aload           9
        //   362: athrow         
        //   363: astore          19
        //   365: aload           19
        //   367: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  109    147    187    192    Landroid/os/RemoteException;
        //  177    186    192    212    Landroid/os/RemoteException;
        //  194    212    353    358    Landroid/os/RemoteException;
        //  229    268    358    363    Landroid/os/RemoteException;
        //  268    297    358    363    Landroid/os/RemoteException;
        //  313    322    323    343    Landroid/os/RemoteException;
        //  325    343    363    368    Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 167, Size: 167
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
    
    public void zze(final Message message) {
        if (message != null) {
            if (message.obj instanceof Intent) {
                final Intent intent = (Intent)message.obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    final Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.zzaxj = (MessengerCompat)parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.zzaxi = (Messenger)parcelableExtra;
                    }
                }
                this.zzr((Intent)message.obj);
                if (MessengerCompat.a == 0) {
                    return;
                }
            }
            Log.w("InstanceID/Rpc", "Dropping invalid message");
        }
    }
    
    void zzo(final Intent intent) {
        synchronized (this) {
            if (this.zzavT == null) {
                final Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                this.zzavT = PendingIntent.getBroadcast(this.zzpH, 0, intent2, 0);
            }
            intent.putExtra("app", (Parcelable)this.zzavT);
        }
    }
    
    String zzp(final Intent intent) {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String s = intent.getStringExtra("registration_id");
        if (s == null) {
            s = intent.getStringExtra("unregistered");
        }
        intent.getLongExtra("Retry-After", 0L);
        if (s != null) {}
        if (s != null) {
            return s;
        }
        final String stringExtra = intent.getStringExtra("error");
        if (stringExtra != null) {
            throw new IOException(stringExtra);
        }
        Log.w("InstanceID/Rpc", "Unexpected response from GCM " + intent.getExtras(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    
    void zzq(final Intent intent) {
        final int a = MessengerCompat.a;
        String s = intent.getStringExtra("error");
        if (s == null) {
            Log.w("InstanceID/Rpc", "Unexpected response, no error or registration id " + intent.getExtras());
        }
        else {
            if (Log.isLoggable("InstanceID/Rpc", 3)) {
                Log.d("InstanceID/Rpc", "Received InstanceID error " + s);
            }
            final boolean startsWith = s.startsWith("|");
            String s2 = null;
            if (startsWith) {
                final String[] split = s.split("\\|");
                if (!"ID".equals(split[1])) {
                    Log.w("InstanceID/Rpc", "Unexpected structured response " + s);
                }
                if (split.length > 2) {
                    s2 = split[2];
                    s = split[3];
                    if (s.startsWith(":")) {
                        s = s.substring(1);
                    }
                }
                else {
                    s = "UNKNOWN";
                    s2 = null;
                }
                intent.putExtra("error", s);
            }
            Label_0210: {
                if (s2 == null) {
                    this.zzx(s);
                    if (a == 0) {
                        break Label_0210;
                    }
                }
                this.zzi(s2, s);
            }
            final long longExtra = intent.getLongExtra("Retry-After", 0L);
            if (longExtra > 0L) {
                this.zzaxl = SystemClock.elapsedRealtime();
                this.zzaxn = 1000 * (int)longExtra;
                this.zzaxo = SystemClock.elapsedRealtime() + this.zzaxn;
                Log.w("InstanceID/Rpc", "Explicit request from server to backoff: " + this.zzaxn);
                if (a == 0) {
                    return;
                }
            }
            if ("SERVICE_NOT_AVAILABLE".equals(s) || "AUTHENTICATION_FAILED".equals(s)) {
                this.zzdd(s);
            }
        }
    }
    
    void zzr(final Intent intent) {
        final int a = MessengerCompat.a;
        if (intent == null) {
            if (Log.isLoggable("InstanceID/Rpc", 3)) {
                Log.d("InstanceID/Rpc", "Unexpected response: null");
            }
        }
        else {
            final String action = intent.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action) && !"com.google.android.gms.iid.InstanceID".equals(action)) {
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Unexpected response " + intent.getAction());
                }
            }
            else {
                final String stringExtra = intent.getStringExtra("registration_id");
                String stringExtra2;
                if (stringExtra == null) {
                    stringExtra2 = intent.getStringExtra("unregistered");
                }
                else {
                    stringExtra2 = stringExtra;
                }
                if (stringExtra2 == null) {
                    this.zzq(intent);
                    return;
                }
                this.zzaxk = SystemClock.elapsedRealtime();
                this.zzaxo = 0L;
                this.zzaxm = 0;
                this.zzaxn = 0;
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "AppIDResponse: " + stringExtra2 + " " + intent.getExtras());
                }
                final boolean startsWith = stringExtra2.startsWith("|");
                String s = null;
                if (startsWith) {
                    final String[] split = stringExtra2.split("\\|");
                    if (!"ID".equals(split[1])) {
                        Log.w("InstanceID/Rpc", "Unexpected structured response " + stringExtra2);
                    }
                    final String s2 = split[2];
                    Label_0346: {
                        if (split.length > 4) {
                            if ("SYNC".equals(split[3])) {
                                InstanceIDListenerService.zzav(this.zzpH);
                                if (a == 0) {
                                    break Label_0346;
                                }
                            }
                            if ("RST".equals(split[3])) {
                                InstanceIDListenerService.zza(this.zzpH, InstanceID.getInstance(this.zzpH).zzug());
                                intent.removeExtra("registration_id");
                                this.zzi(s2, intent);
                                return;
                            }
                        }
                    }
                    String substring = split[-1 + split.length];
                    if (substring.startsWith(":")) {
                        substring = substring.substring(1);
                    }
                    intent.putExtra("registration_id", substring);
                    s = s2;
                }
                if (s == null) {
                    this.zzx(intent);
                    if (a == 0) {
                        return;
                    }
                }
                this.zzi(s, intent);
            }
        }
    }
    
    void zzuj() {
        if (this.zzavX != null) {
            return;
        }
        zzaw(this.zzpH);
        this.zzavX = new Messenger((Handler)new zzc$1(this, Looper.getMainLooper()));
    }
}
