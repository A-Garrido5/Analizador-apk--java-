// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.support.v4.content.WakefulBroadcastReceiver;
import android.os.Build$VERSION;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import android.os.Message;
import android.content.Intent;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.content.BroadcastReceiver;
import android.app.Service;

public class InstanceIDListenerService extends Service
{
    static String ACTION;
    private static String zzavK;
    private static String zzawW;
    MessengerCompat zzawU;
    BroadcastReceiver zzawV;
    int zzawX;
    int zzawY;
    
    static {
        InstanceIDListenerService.ACTION = "action";
        InstanceIDListenerService.zzavK = "google.com/iid";
        InstanceIDListenerService.zzawW = "CMD";
    }
    
    public InstanceIDListenerService() {
        this.zzawU = new MessengerCompat(new InstanceIDListenerService$1(this, Looper.getMainLooper()));
        this.zzawV = new InstanceIDListenerService$2(this);
    }
    
    static void zza(final Context context, final zzd zzd) {
        zzd.zzul();
        final Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra(InstanceIDListenerService.zzawW, "RST");
        intent.setPackage(context.getPackageName());
        context.startService(intent);
    }
    
    private void zza(final Message message, final int n) {
        zzc.zzaw((Context)this);
        this.getPackageManager();
        if (n != zzc.zzaxf && n != zzc.zzaxe) {
            Log.w("InstanceID", "Message from unexpected caller " + n + " mine=" + zzc.zzaxe + " appid=" + zzc.zzaxf);
            return;
        }
        this.zzn((Intent)message.obj);
    }
    
    static void zza(final InstanceIDListenerService instanceIDListenerService, final Message message, final int n) {
        instanceIDListenerService.zza(message, n);
    }
    
    static void zzav(final Context context) {
        final Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(InstanceIDListenerService.zzawW, "SYNC");
        context.startService(intent);
    }
    
    public IBinder onBind(final Intent intent) {
        if (intent != null && "com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            return this.zzawU.getBinder();
        }
        return null;
    }
    
    public void onCreate() {
        final IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentFilter.addCategory(this.getPackageName());
        this.registerReceiver(this.zzawV, intentFilter, "com.google.android.c2dm.permission.RECEIVE", (Handler)null);
    }
    
    public void onDestroy() {
        this.unregisterReceiver(this.zzawV);
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        this.zzgn(n2);
        if (intent == null) {
            this.stop();
            return 2;
        }
        try {
            if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
                if (Build$VERSION.SDK_INT <= 18) {
                    final Intent intent2 = (Intent)intent.getParcelableExtra("GSF");
                    if (intent2 != null) {
                        this.startService(intent2);
                        return 1;
                    }
                }
                this.zzn(intent);
            }
            this.stop();
            if (intent.getStringExtra("from") != null) {
                WakefulBroadcastReceiver.completeWakefulIntent(intent);
            }
            return 2;
        }
        finally {
            this.stop();
        }
    }
    
    public void onTokenRefresh() {
    }
    
    void stop() {
        synchronized (this) {
            --this.zzawX;
            if (this.zzawX == 0) {
                this.stopSelf(this.zzawY);
            }
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Stop " + this.zzawX + " " + this.zzawY);
            }
        }
    }
    
    public void zzab(final boolean b) {
        this.onTokenRefresh();
    }
    
    void zzgn(final int zzawY) {
        synchronized (this) {
            ++this.zzawX;
            if (zzawY > this.zzawY) {
                this.zzawY = zzawY;
            }
        }
    }
    
    public void zzn(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/iid/MessengerCompat.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: ldc             "subtype"
        //     7: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    10: astore_3       
        //    11: aload_3        
        //    12: ifnonnull       103
        //    15: aload_0        
        //    16: invokestatic    com/google/android/gms/iid/InstanceID.getInstance:(Landroid/content/Context;)Lcom/google/android/gms/iid/InstanceID;
        //    19: astore          5
        //    21: aload_1        
        //    22: getstatic       com/google/android/gms/iid/InstanceIDListenerService.zzawW:Ljava/lang/String;
        //    25: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    28: astore          6
        //    30: aload_1        
        //    31: ldc_w           "error"
        //    34: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    37: ifnonnull       54
        //    40: aload_1        
        //    41: ldc_w           "registration_id"
        //    44: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    47: astore          12
        //    49: aload           12
        //    51: ifnull          146
        //    54: ldc             "InstanceID"
        //    56: iconst_3       
        //    57: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    60: istore          10
        //    62: iload           10
        //    64: ifeq            93
        //    67: ldc             "InstanceID"
        //    69: new             Ljava/lang/StringBuilder;
        //    72: dup            
        //    73: invokespecial   java/lang/StringBuilder.<init>:()V
        //    76: ldc_w           "Register result in service "
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: aload_3        
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    92: pop            
        //    93: aload           5
        //    95: invokevirtual   com/google/android/gms/iid/InstanceID.zzuh:()Lcom/google/android/gms/iid/zzc;
        //    98: aload_1        
        //    99: invokevirtual   com/google/android/gms/iid/zzc.zzr:(Landroid/content/Intent;)V
        //   102: return         
        //   103: new             Landroid/os/Bundle;
        //   106: dup            
        //   107: invokespecial   android/os/Bundle.<init>:()V
        //   110: astore          4
        //   112: aload           4
        //   114: ldc             "subtype"
        //   116: aload_3        
        //   117: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   120: aload_0        
        //   121: aload           4
        //   123: invokestatic    com/google/android/gms/iid/InstanceID.zza:(Landroid/content/Context;Landroid/os/Bundle;)Lcom/google/android/gms/iid/InstanceID;
        //   126: astore          5
        //   128: goto            21
        //   131: astore          7
        //   133: aload           7
        //   135: athrow         
        //   136: astore          8
        //   138: aload           8
        //   140: athrow         
        //   141: astore          9
        //   143: aload           9
        //   145: athrow         
        //   146: ldc             "InstanceID"
        //   148: iconst_3       
        //   149: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   152: ifeq            203
        //   155: ldc             "InstanceID"
        //   157: new             Ljava/lang/StringBuilder;
        //   160: dup            
        //   161: invokespecial   java/lang/StringBuilder.<init>:()V
        //   164: ldc_w           "Service command "
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload_3        
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: ldc             " "
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload           6
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: ldc             " "
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: aload_1        
        //   190: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   202: pop            
        //   203: aload_1        
        //   204: ldc_w           "unregistered"
        //   207: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   210: ifnull          259
        //   213: aload           5
        //   215: invokevirtual   com/google/android/gms/iid/InstanceID.zzug:()Lcom/google/android/gms/iid/zzd;
        //   218: astore          29
        //   220: aload_3        
        //   221: ifnonnull       228
        //   224: ldc_w           ""
        //   227: astore_3       
        //   228: aload           29
        //   230: aload_3        
        //   231: invokevirtual   com/google/android/gms/iid/zzd.zzdi:(Ljava/lang/String;)V
        //   234: aload           5
        //   236: invokevirtual   com/google/android/gms/iid/InstanceID.zzuh:()Lcom/google/android/gms/iid/zzc;
        //   239: aload_1        
        //   240: invokevirtual   com/google/android/gms/iid/zzc.zzr:(Landroid/content/Intent;)V
        //   243: return         
        //   244: astore          13
        //   246: aload           13
        //   248: athrow         
        //   249: astore          14
        //   251: aload           14
        //   253: athrow         
        //   254: astore          15
        //   256: aload           15
        //   258: athrow         
        //   259: ldc             "RST"
        //   261: aload           6
        //   263: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   266: ifeq            283
        //   269: aload           5
        //   271: invokevirtual   com/google/android/gms/iid/InstanceID.zzuf:()V
        //   274: aload_0        
        //   275: iconst_1       
        //   276: invokevirtual   com/google/android/gms/iid/InstanceIDListenerService.zzab:(Z)V
        //   279: iload_2        
        //   280: ifeq            102
        //   283: ldc_w           "RST_FULL"
        //   286: aload           6
        //   288: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   291: istore          23
        //   293: iload           23
        //   295: ifeq            330
        //   298: aload           5
        //   300: invokevirtual   com/google/android/gms/iid/InstanceID.zzug:()Lcom/google/android/gms/iid/zzd;
        //   303: invokevirtual   com/google/android/gms/iid/zzd.isEmpty:()Z
        //   306: istore          28
        //   308: iload           28
        //   310: ifne            102
        //   313: aload           5
        //   315: invokevirtual   com/google/android/gms/iid/InstanceID.zzug:()Lcom/google/android/gms/iid/zzd;
        //   318: invokevirtual   com/google/android/gms/iid/zzd.zzul:()V
        //   321: aload_0        
        //   322: iconst_1       
        //   323: invokevirtual   com/google/android/gms/iid/InstanceIDListenerService.zzab:(Z)V
        //   326: iload_2        
        //   327: ifeq            102
        //   330: ldc             "SYNC"
        //   332: aload           6
        //   334: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   337: istore          24
        //   339: iload           24
        //   341: ifeq            362
        //   344: aload           5
        //   346: invokevirtual   com/google/android/gms/iid/InstanceID.zzug:()Lcom/google/android/gms/iid/zzd;
        //   349: aload_3        
        //   350: invokevirtual   com/google/android/gms/iid/zzd.zzdi:(Ljava/lang/String;)V
        //   353: aload_0        
        //   354: iconst_0       
        //   355: invokevirtual   com/google/android/gms/iid/InstanceIDListenerService.zzab:(Z)V
        //   358: iload_2        
        //   359: ifeq            102
        //   362: ldc_w           "PING"
        //   365: aload           6
        //   367: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   370: istore          25
        //   372: iload           25
        //   374: ifeq            102
        //   377: aload_0        
        //   378: invokestatic    com/google/android/gms/gcm/GoogleCloudMessaging.getInstance:(Landroid/content/Context;)Lcom/google/android/gms/gcm/GoogleCloudMessaging;
        //   381: getstatic       com/google/android/gms/iid/InstanceIDListenerService.zzavK:Ljava/lang/String;
        //   384: invokestatic    com/google/android/gms/iid/zzc.zzuk:()Ljava/lang/String;
        //   387: lconst_0       
        //   388: aload_1        
        //   389: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   392: invokevirtual   com/google/android/gms/gcm/GoogleCloudMessaging.send:(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V
        //   395: return         
        //   396: astore          26
        //   398: ldc             "InstanceID"
        //   400: ldc_w           "Failed to send ping response"
        //   403: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   406: pop            
        //   407: return         
        //   408: astore          16
        //   410: aload           16
        //   412: athrow         
        //   413: astore          17
        //   415: aload           17
        //   417: athrow         
        //   418: astore          18
        //   420: aload           18
        //   422: athrow         
        //   423: astore          19
        //   425: aload           19
        //   427: athrow         
        //   428: astore          20
        //   430: aload           20
        //   432: athrow         
        //   433: astore          21
        //   435: aload           21
        //   437: athrow         
        //   438: astore          22
        //   440: aload           22
        //   442: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  30     49     131    136    Ljava/io/IOException;
        //  54     62     136    141    Ljava/io/IOException;
        //  67     93     141    146    Ljava/io/IOException;
        //  133    136    136    141    Ljava/io/IOException;
        //  138    141    141    146    Ljava/io/IOException;
        //  146    203    244    249    Ljava/io/IOException;
        //  203    220    249    259    Ljava/io/IOException;
        //  251    254    254    259    Ljava/io/IOException;
        //  259    279    408    413    Ljava/io/IOException;
        //  283    293    413    418    Ljava/io/IOException;
        //  298    308    418    423    Ljava/io/IOException;
        //  313    326    423    428    Ljava/io/IOException;
        //  330    339    428    433    Ljava/io/IOException;
        //  344    358    433    438    Ljava/io/IOException;
        //  362    372    438    443    Ljava/io/IOException;
        //  377    395    396    408    Ljava/io/IOException;
        //  410    413    413    418    Ljava/io/IOException;
        //  415    418    418    423    Ljava/io/IOException;
        //  420    423    423    428    Ljava/io/IOException;
        //  425    428    428    433    Ljava/io/IOException;
        //  430    433    433    438    Ljava/io/IOException;
        //  435    438    438    443    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 209, Size: 209
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
