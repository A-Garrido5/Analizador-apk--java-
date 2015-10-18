// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.os.Parcelable;
import android.os.Message;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.iid.zzc;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import android.content.Context;
import android.os.Messenger;
import java.util.concurrent.BlockingQueue;
import java.util.Map;
import android.app.PendingIntent;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleCloudMessaging
{
    public static int zzavP;
    public static int zzavQ;
    public static int zzavR;
    static GoogleCloudMessaging zzavS;
    private static final AtomicInteger zzavV;
    private PendingIntent zzavT;
    private Map zzavU;
    private final BlockingQueue zzavW;
    final Messenger zzavX;
    private Context zzpH;
    
    static {
        GoogleCloudMessaging.zzavP = 5000000;
        GoogleCloudMessaging.zzavQ = 6500000;
        GoogleCloudMessaging.zzavR = 7000000;
        zzavV = new AtomicInteger(1);
    }
    
    public GoogleCloudMessaging() {
        this.zzavW = new LinkedBlockingQueue();
        this.zzavU = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.zzavX = new Messenger((Handler)new GoogleCloudMessaging$1(this, Looper.getMainLooper()));
    }
    
    public static GoogleCloudMessaging getInstance(final Context context) {
        synchronized (GoogleCloudMessaging.class) {
            try {
                if (GoogleCloudMessaging.zzavS == null) {
                    GoogleCloudMessaging.zzavS = new GoogleCloudMessaging();
                    GoogleCloudMessaging.zzavS.zzpH = context.getApplicationContext();
                }
                return GoogleCloudMessaging.zzavS;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    static BlockingQueue zza(final GoogleCloudMessaging googleCloudMessaging) {
        return googleCloudMessaging.zzavW;
    }
    
    private void zza(final String p0, final String p1, final long p2, final int p3, final Bundle p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/gcm/zzb$zza.a:Z
        //     3: istore          7
        //     5: aload_1        
        //     6: ifnonnull       24
        //     9: new             Ljava/lang/IllegalArgumentException;
        //    12: dup            
        //    13: ldc             "Missing 'to'"
        //    15: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    18: athrow         
        //    19: astore          22
        //    21: aload           22
        //    23: athrow         
        //    24: new             Landroid/content/Intent;
        //    27: dup            
        //    28: ldc             "com.google.android.gcm.intent.SEND"
        //    30: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    33: astore          8
        //    35: aload           6
        //    37: ifnull          48
        //    40: aload           8
        //    42: aload           6
        //    44: invokevirtual   android/content/Intent.putExtras:(Landroid/os/Bundle;)Landroid/content/Intent;
        //    47: pop            
        //    48: aload_0        
        //    49: aload           8
        //    51: invokevirtual   com/google/android/gms/gcm/GoogleCloudMessaging.zzm:(Landroid/content/Intent;)V
        //    54: aload           8
        //    56: aload_0        
        //    57: getfield        com/google/android/gms/gcm/GoogleCloudMessaging.zzpH:Landroid/content/Context;
        //    60: invokestatic    com/google/android/gms/gcm/GoogleCloudMessaging.zzas:(Landroid/content/Context;)Ljava/lang/String;
        //    63: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //    66: pop            
        //    67: aload           8
        //    69: ldc             "google.to"
        //    71: aload_1        
        //    72: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    75: pop            
        //    76: aload           8
        //    78: ldc             "google.message_id"
        //    80: aload_2        
        //    81: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    84: pop            
        //    85: aload           8
        //    87: ldc             "google.ttl"
        //    89: lload_3        
        //    90: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //    93: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    96: pop            
        //    97: aload           8
        //    99: ldc             "google.delay"
        //   101: iload           5
        //   103: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   106: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   109: pop            
        //   110: aload_0        
        //   111: getfield        com/google/android/gms/gcm/GoogleCloudMessaging.zzpH:Landroid/content/Context;
        //   114: invokestatic    com/google/android/gms/gcm/GoogleCloudMessaging.zzas:(Landroid/content/Context;)Ljava/lang/String;
        //   117: ldc             ".gsf"
        //   119: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   122: ifeq            264
        //   125: new             Landroid/os/Bundle;
        //   128: dup            
        //   129: invokespecial   android/os/Bundle.<init>:()V
        //   132: astore          14
        //   134: aload           6
        //   136: invokevirtual   android/os/Bundle.keySet:()Ljava/util/Set;
        //   139: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   144: astore          15
        //   146: aload           15
        //   148: invokeinterface java/util/Iterator.hasNext:()Z
        //   153: ifeq            220
        //   156: aload           15
        //   158: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   163: checkcast       Ljava/lang/String;
        //   166: astore          17
        //   168: aload           6
        //   170: aload           17
        //   172: invokevirtual   android/os/Bundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //   175: astore          18
        //   177: aload           18
        //   179: instanceof      Ljava/lang/String;
        //   182: ifeq            215
        //   185: aload           14
        //   187: new             Ljava/lang/StringBuilder;
        //   190: dup            
        //   191: invokespecial   java/lang/StringBuilder.<init>:()V
        //   194: ldc             "gcm."
        //   196: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   199: aload           17
        //   201: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   204: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   207: aload           18
        //   209: checkcast       Ljava/lang/String;
        //   212: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   215: iload           7
        //   217: ifeq            146
        //   220: aload           14
        //   222: ldc             "google.to"
        //   224: aload_1        
        //   225: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   228: aload           14
        //   230: ldc             "google.message_id"
        //   232: aload_2        
        //   233: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   236: aload_0        
        //   237: getfield        com/google/android/gms/gcm/GoogleCloudMessaging.zzpH:Landroid/content/Context;
        //   240: invokestatic    com/google/android/gms/iid/InstanceID.getInstance:(Landroid/content/Context;)Lcom/google/android/gms/iid/InstanceID;
        //   243: ldc             "GCM"
        //   245: ldc             "upstream"
        //   247: aload           14
        //   249: invokevirtual   com/google/android/gms/iid/InstanceID.zzc:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
        //   252: pop            
        //   253: return         
        //   254: astore          20
        //   256: aload           20
        //   258: athrow         
        //   259: astore          19
        //   261: aload           19
        //   263: athrow         
        //   264: aload_0        
        //   265: getfield        com/google/android/gms/gcm/GoogleCloudMessaging.zzpH:Landroid/content/Context;
        //   268: aload           8
        //   270: ldc             "com.google.android.gtalkservice.permission.GTALK_SERVICE"
        //   272: invokevirtual   android/content/Context.sendOrderedBroadcast:(Landroid/content/Intent;Ljava/lang/String;)V
        //   275: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      19     19     24     Ljava/lang/IllegalArgumentException;
        //  40     48     254    259    Ljava/lang/IllegalArgumentException;
        //  177    215    259    264    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0215:
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
    
    static boolean zza(final GoogleCloudMessaging googleCloudMessaging, final Intent intent) {
        return googleCloudMessaging.zzl(intent);
    }
    
    public static String zzas(final Context context) {
        return zzc.zzaw(context);
    }
    
    public static int zzat(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getPackageInfo(zzas(context), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return -1;
        }
    }
    
    static Context zzb(final GoogleCloudMessaging googleCloudMessaging) {
        return googleCloudMessaging.zzpH;
    }
    
    private boolean zzl(final Intent obj) {
        String s = obj.getStringExtra("In-Reply-To");
        while (true) {
            if (s == null) {
                try {
                    if (obj.hasExtra("error")) {
                        s = obj.getStringExtra("google.message_id");
                    }
                    if (s != null) {
                        final Handler handler = this.zzavU.remove(s);
                        if (handler != null) {
                            final Message obtain = Message.obtain();
                            obtain.obj = obj;
                            return handler.sendMessage(obtain);
                        }
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return false;
            }
            continue;
        }
    }
    
    public void send(final String s, final String s2, final long n, final Bundle bundle) {
        this.zza(s, s2, n, -1, bundle);
    }
    
    void zzm(final Intent intent) {
        synchronized (this) {
            if (this.zzavT == null) {
                final Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                this.zzavT = PendingIntent.getBroadcast(this.zzpH, 0, intent2, 0);
            }
            intent.putExtra("app", (Parcelable)this.zzavT);
        }
    }
}
