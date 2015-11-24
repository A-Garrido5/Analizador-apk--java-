// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.app.NotificationManager;
import android.util.Log;
import android.app.Notification;
import android.content.Context;

class zza
{
    static zza zzavF;
    private Context mContext;
    
    private zza(final Context context) {
        this.mContext = context.getApplicationContext();
    }
    
    private void zza(String string, final Notification notification) {
        try {
            if (Log.isLoggable("GcmNotification", 3)) {
                Log.d("GcmNotification", "Showing notification");
            }
            final NotificationManager notificationManager = (NotificationManager)this.mContext.getSystemService("notification");
            if (TextUtils.isEmpty((CharSequence)string)) {
                string = "GCM-Notification:" + SystemClock.uptimeMillis();
            }
            notificationManager.notify(string, 0, notification);
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
    }
    
    static zza zzar(final Context context) {
        synchronized (zza.class) {
            try {
                if (zza.zzavF == null) {
                    zza.zzavF = new zza(context);
                }
                return zza.zzavF;
            }
            catch (zza$zza zza$zza) {
                throw zza$zza;
            }
        }
    }
    
    static String zzb(final Bundle bundle, final String s) {
        String s2 = bundle.getString(s);
        if (s2 == null) {
            s2 = bundle.getString(s.replace("gcm.n.", "gcm.notification."));
        }
        return s2;
    }
    
    private int zzda(final String s) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                throw new zza$zza(this, "Missing icon", null);
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
        final Resources resources = this.mContext.getResources();
        int n = resources.getIdentifier(s, "drawable", this.mContext.getPackageName());
        if (n == 0) {
            n = resources.getIdentifier(s, "mipmap", this.mContext.getPackageName());
            if (n == 0) {
                throw new zza$zza(this, "Icon resource not found: " + s, null);
            }
        }
        return n;
    }
    
    private Uri zzdb(final String s) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return null;
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
        try {
            if ("default".equals(s)) {
                return RingtoneManager.getDefaultUri(2);
            }
        }
        catch (zza$zza zza$zza2) {
            throw zza$zza2;
        }
        throw new zza$zza(this, "Invalid sound: " + s, null);
    }
    
    static boolean zzt(final Bundle bundle) {
        try {
            if (zzb(bundle, "gcm.n.title") != null) {
                return true;
            }
        }
        catch (zza$zza zza$zza) {
            throw zza$zza;
        }
        return false;
    }
    
    private Notification zzv(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/gcm/zzb$zza.a:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ldc             "gcm.n.title"
        //     7: invokestatic    com/google/android/gms/gcm/zza.zzb:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
        //    10: astore_3       
        //    11: aload_3        
        //    12: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    15: ifeq            35
        //    18: new             Lcom/google/android/gms/gcm/zza$zza;
        //    21: dup            
        //    22: aload_0        
        //    23: ldc             "Missing title"
        //    25: aconst_null    
        //    26: invokespecial   com/google/android/gms/gcm/zza$zza.<init>:(Lcom/google/android/gms/gcm/zza;Ljava/lang/String;Lcom/google/android/gms/gcm/zza$1;)V
        //    29: athrow         
        //    30: astore          4
        //    32: aload           4
        //    34: athrow         
        //    35: aload_1        
        //    36: ldc             "gcm.n.body"
        //    38: invokestatic    com/google/android/gms/gcm/zza.zzb:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
        //    41: astore          5
        //    43: aload_0        
        //    44: aload_1        
        //    45: ldc             "gcm.n.icon"
        //    47: invokestatic    com/google/android/gms/gcm/zza.zzb:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
        //    50: invokespecial   com/google/android/gms/gcm/zza.zzda:(Ljava/lang/String;)I
        //    53: istore          6
        //    55: aload_0        
        //    56: aload_1        
        //    57: ldc             "gcm.n.sound"
        //    59: invokestatic    com/google/android/gms/gcm/zza.zzb:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
        //    62: invokespecial   com/google/android/gms/gcm/zza.zzdb:(Ljava/lang/String;)Landroid/net/Uri;
        //    65: astore          7
        //    67: aload_0        
        //    68: aload_1        
        //    69: invokespecial   com/google/android/gms/gcm/zza.zzw:(Landroid/os/Bundle;)Landroid/app/PendingIntent;
        //    72: astore          8
        //    74: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    77: bipush          11
        //    79: if_icmplt       204
        //    82: new             Landroid/app/Notification$Builder;
        //    85: dup            
        //    86: aload_0        
        //    87: getfield        com/google/android/gms/gcm/zza.mContext:Landroid/content/Context;
        //    90: invokespecial   android/app/Notification$Builder.<init>:(Landroid/content/Context;)V
        //    93: iconst_1       
        //    94: invokevirtual   android/app/Notification$Builder.setAutoCancel:(Z)Landroid/app/Notification$Builder;
        //    97: iload           6
        //    99: invokevirtual   android/app/Notification$Builder.setSmallIcon:(I)Landroid/app/Notification$Builder;
        //   102: aload_3        
        //   103: invokevirtual   android/app/Notification$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
        //   106: aload           5
        //   108: invokevirtual   android/app/Notification$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
        //   111: astore          13
        //   113: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   116: bipush          21
        //   118: if_icmplt       148
        //   121: aload_1        
        //   122: ldc             "gcm.n.color"
        //   124: invokestatic    com/google/android/gms/gcm/zza.zzb:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
        //   127: astore          19
        //   129: aload           19
        //   131: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   134: ifne            148
        //   137: aload           13
        //   139: aload           19
        //   141: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //   144: invokevirtual   android/app/Notification$Builder.setColor:(I)Landroid/app/Notification$Builder;
        //   147: pop            
        //   148: aload           7
        //   150: ifnull          161
        //   153: aload           13
        //   155: aload           7
        //   157: invokevirtual   android/app/Notification$Builder.setSound:(Landroid/net/Uri;)Landroid/app/Notification$Builder;
        //   160: pop            
        //   161: aload           8
        //   163: ifnull          174
        //   166: aload           13
        //   168: aload           8
        //   170: invokevirtual   android/app/Notification$Builder.setContentIntent:(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
        //   173: pop            
        //   174: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   177: bipush          16
        //   179: if_icmplt       193
        //   182: aload           13
        //   184: invokevirtual   android/app/Notification$Builder.build:()Landroid/app/Notification;
        //   187: astore          14
        //   189: iload_2        
        //   190: ifeq            200
        //   193: aload           13
        //   195: invokevirtual   android/app/Notification$Builder.getNotification:()Landroid/app/Notification;
        //   198: astore          14
        //   200: iload_2        
        //   201: ifeq            317
        //   204: new             Landroid/app/Notification;
        //   207: dup            
        //   208: invokespecial   android/app/Notification.<init>:()V
        //   211: astore          9
        //   213: aload           9
        //   215: bipush          16
        //   217: aload           9
        //   219: getfield        android/app/Notification.flags:I
        //   222: ior            
        //   223: putfield        android/app/Notification.flags:I
        //   226: aload           9
        //   228: iload           6
        //   230: putfield        android/app/Notification.icon:I
        //   233: aload           7
        //   235: ifnull          245
        //   238: aload           9
        //   240: aload           7
        //   242: putfield        android/app/Notification.sound:Landroid/net/Uri;
        //   245: aload           8
        //   247: ifnonnull       280
        //   250: new             Landroid/content/Intent;
        //   253: dup            
        //   254: invokespecial   android/content/Intent.<init>:()V
        //   257: astore          11
        //   259: aload           11
        //   261: ldc             "com.google.example.invalidpackage"
        //   263: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //   266: pop            
        //   267: aload_0        
        //   268: getfield        com/google/android/gms/gcm/zza.mContext:Landroid/content/Context;
        //   271: iconst_0       
        //   272: aload           11
        //   274: iconst_0       
        //   275: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   278: astore          8
        //   280: aload           9
        //   282: aload_0        
        //   283: getfield        com/google/android/gms/gcm/zza.mContext:Landroid/content/Context;
        //   286: aload_3        
        //   287: aload           5
        //   289: aload           8
        //   291: invokevirtual   android/app/Notification.setLatestEventInfo:(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
        //   294: aload           9
        //   296: areturn        
        //   297: astore          20
        //   299: aload           20
        //   301: athrow         
        //   302: astore          17
        //   304: aload           17
        //   306: athrow         
        //   307: astore          15
        //   309: aload           15
        //   311: athrow         
        //   312: astore          10
        //   314: aload           10
        //   316: athrow         
        //   317: aload           14
        //   319: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  11     30     30     35     Lcom/google/android/gms/gcm/zza$zza;
        //  129    148    297    302    Lcom/google/android/gms/gcm/zza$zza;
        //  153    161    302    307    Lcom/google/android/gms/gcm/zza$zza;
        //  166    174    307    312    Lcom/google/android/gms/gcm/zza$zza;
        //  213    233    312    317    Lcom/google/android/gms/gcm/zza$zza;
        //  238    245    312    317    Lcom/google/android/gms/gcm/zza$zza;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 154, Size: 154
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
    
    private PendingIntent zzw(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/gcm/zzb$zza.a:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ldc_w           "gcm.n.click_action"
        //     8: invokestatic    com/google/android/gms/gcm/zza.zzb:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_3        
        //    13: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    16: istore          5
        //    18: iload           5
        //    20: ifeq            30
        //    23: aconst_null    
        //    24: areturn        
        //    25: astore          4
        //    27: aload           4
        //    29: athrow         
        //    30: new             Landroid/content/Intent;
        //    33: dup            
        //    34: aload_3        
        //    35: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    38: astore          6
        //    40: aload           6
        //    42: aload_0        
        //    43: getfield        com/google/android/gms/gcm/zza.mContext:Landroid/content/Context;
        //    46: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    49: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //    52: pop            
        //    53: aload           6
        //    55: ldc_w           268435456
        //    58: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //    61: pop            
        //    62: aload           6
        //    64: aload_1        
        //    65: invokevirtual   android/content/Intent.putExtras:(Landroid/os/Bundle;)Landroid/content/Intent;
        //    68: pop            
        //    69: aload_1        
        //    70: invokevirtual   android/os/Bundle.keySet:()Ljava/util/Set;
        //    73: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    78: astore          10
        //    80: aload           10
        //    82: invokeinterface java/util/Iterator.hasNext:()Z
        //    87: ifeq            137
        //    90: aload           10
        //    92: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    97: checkcast       Ljava/lang/String;
        //   100: astore          11
        //   102: aload           11
        //   104: ldc             "gcm.n."
        //   106: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   109: istore          14
        //   111: iload           14
        //   113: ifne            126
        //   116: aload           11
        //   118: ldc             "gcm.notification."
        //   120: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   123: ifeq            133
        //   126: aload           6
        //   128: aload           11
        //   130: invokevirtual   android/content/Intent.removeExtra:(Ljava/lang/String;)V
        //   133: iload_2        
        //   134: ifeq            80
        //   137: aload_0        
        //   138: getfield        com/google/android/gms/gcm/zza.mContext:Landroid/content/Context;
        //   141: iconst_0       
        //   142: aload           6
        //   144: ldc_w           1073741824
        //   147: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   150: areturn        
        //   151: astore          12
        //   153: aload           12
        //   155: athrow         
        //   156: astore          13
        //   158: aload           13
        //   160: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     18     25     30     Lcom/google/android/gms/gcm/zza$zza;
        //  102    111    151    156    Lcom/google/android/gms/gcm/zza$zza;
        //  116    126    156    161    Lcom/google/android/gms/gcm/zza$zza;
        //  126    133    156    161    Lcom/google/android/gms/gcm/zza$zza;
        //  153    156    156    161    Lcom/google/android/gms/gcm/zza$zza;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0126:
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
    
    boolean zzu(final Bundle bundle) {
        try {
            this.zza(zzb(bundle, "gcm.n.tag"), this.zzv(bundle));
            return true;
        }
        catch (zza$zza zza$zza) {
            Log.w("GcmNotification", "Failed to show notification: " + zza$zza.getMessage());
            return false;
        }
    }
}
