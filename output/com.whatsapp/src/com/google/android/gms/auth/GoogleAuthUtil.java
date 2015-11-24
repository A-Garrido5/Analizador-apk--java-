// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import com.google.android.gms.internal.zzjr;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.accounts.Account;
import java.io.IOException;
import android.util.Log;
import android.os.RemoteException;
import com.google.android.gms.internal.zzau$zza;
import android.content.ServiceConnection;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.zza;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.ComponentName;

public final class GoogleAuthUtil
{
    public static final String KEY_ANDROID_PACKAGE_NAME;
    public static final String KEY_CALLER_UID;
    private static final ComponentName zzOB;
    private static final ComponentName zzOC;
    
    static {
        String key_CALLER_UID;
        if (Build$VERSION.SDK_INT >= 11) {
            key_CALLER_UID = "callerUid";
        }
        else {
            key_CALLER_UID = "callerUid";
        }
        KEY_CALLER_UID = key_CALLER_UID;
        String key_ANDROID_PACKAGE_NAME;
        if (Build$VERSION.SDK_INT >= 14) {
            key_ANDROID_PACKAGE_NAME = "androidPackageName";
        }
        else {
            key_ANDROID_PACKAGE_NAME = "androidPackageName";
        }
        KEY_ANDROID_PACKAGE_NAME = key_ANDROID_PACKAGE_NAME;
        zzOB = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        zzOC = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
    }
    
    public static void clearToken(final Context context, final String s) {
        final boolean a = GoogleAuthException.a;
        final Context applicationContext = context.getApplicationContext();
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        zzY(applicationContext);
        final Bundle bundle = new Bundle();
        final String packageName = context.getApplicationInfo().packageName;
        try {
            bundle.putString("clientPackageName", packageName);
            if (!bundle.containsKey(GoogleAuthUtil.KEY_ANDROID_PACKAGE_NAME)) {
                bundle.putString(GoogleAuthUtil.KEY_ANDROID_PACKAGE_NAME, packageName);
            }
            final zza zza = new zza();
            if (zzk.zzah(applicationContext).zza(GoogleAuthUtil.zzOB, (ServiceConnection)zza, "GoogleAuthUtil")) {
                try {
                    try {
                        final Bundle zza2 = zzau$zza.zza(zza.zzmh()).zza(s, bundle);
                        final String string = zza2.getString("Error");
                        try {
                            if (!zza2.getBoolean("booleanResult")) {
                                throw new GoogleAuthException(string);
                            }
                            goto Label_0192;
                        }
                        catch (RemoteException ex2) {
                            throw ex2;
                        }
                    }
                    catch (RemoteException ex3) {
                        Log.i("GoogleAuthUtil", "GMS remote exception ", (Throwable)ex3);
                        throw new IOException("remote exception");
                    }
                    try {
                        final RemoteException ex2;
                        throw ex2;
                    }
                    catch (InterruptedException ex6) {
                        throw new GoogleAuthException("Interrupted");
                    }
                }
                catch (InterruptedException ex7) {}
            }
        }
        catch (RemoteException ex8) {}
        while (true) {
            try {
                throw new IOException("Could not bind to service with the given context.");
            }
            catch (RemoteException ex9) {}
            while (true) {
                Label_0268: {
                    try {
                        if (zzu.a != 0) {
                            if (!a) {
                                break Label_0268;
                            }
                            final boolean a2 = false;
                            GoogleAuthException.a = a2;
                        }
                        return;
                    }
                    catch (RemoteException ex4) {
                        try {
                            throw ex4;
                        }
                        catch (RemoteException ex5) {
                            throw ex5;
                        }
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
    
    public static String getToken(final Context context, final Account account, final String s, final Bundle bundle) {
        return zza(context, account, s, bundle).getString("authtoken");
    }
    
    @Deprecated
    public static String getToken(final Context context, final String s, final String s2, final Bundle bundle) {
        return getToken(context, new Account(s, "com.google"), s2, bundle);
    }
    
    private static void zzY(final Context context) {
        try {
            GooglePlayServicesUtil.zzY(context);
        }
        catch (GooglePlayServicesRepairableException ex) {
            throw new GooglePlayServicesAvailabilityException(ex.getConnectionStatusCode(), ex.getMessage(), ex.getIntent());
        }
        catch (GooglePlayServicesNotAvailableException ex2) {
            throw new GoogleAuthException(ex2.getMessage());
        }
    }
    
    public static Bundle zza(final Context p0, final Account p1, final String p2, final Bundle p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/auth/GoogleAuthException.a:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //     9: astore          5
        //    11: ldc             "Calling this from your main thread can lead to deadlock"
        //    13: invokestatic    com/google/android/gms/common/internal/zzu.zzbZ:(Ljava/lang/String;)V
        //    16: aload           5
        //    18: invokestatic    com/google/android/gms/auth/GoogleAuthUtil.zzY:(Landroid/content/Context;)V
        //    21: aload_3        
        //    22: ifnonnull       46
        //    25: new             Landroid/os/Bundle;
        //    28: dup            
        //    29: invokespecial   android/os/Bundle.<init>:()V
        //    32: astore_3       
        //    33: iload           4
        //    35: ifeq            55
        //    38: iconst_1       
        //    39: getstatic       com/google/android/gms/common/internal/zzu.a:I
        //    42: iadd           
        //    43: putstatic       com/google/android/gms/common/internal/zzu.a:I
        //    46: new             Landroid/os/Bundle;
        //    49: dup            
        //    50: aload_3        
        //    51: invokespecial   android/os/Bundle.<init>:(Landroid/os/Bundle;)V
        //    54: astore_3       
        //    55: aload_0        
        //    56: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    59: getfield        android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
        //    62: astore          6
        //    64: aload_3        
        //    65: ldc             "clientPackageName"
        //    67: aload           6
        //    69: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //    72: aload_3        
        //    73: getstatic       com/google/android/gms/auth/GoogleAuthUtil.KEY_ANDROID_PACKAGE_NAME:Ljava/lang/String;
        //    76: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    79: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    82: ifeq            94
        //    85: aload_3        
        //    86: getstatic       com/google/android/gms/auth/GoogleAuthUtil.KEY_ANDROID_PACKAGE_NAME:Ljava/lang/String;
        //    89: aload           6
        //    91: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //    94: new             Lcom/google/android/gms/common/zza;
        //    97: dup            
        //    98: invokespecial   com/google/android/gms/common/zza.<init>:()V
        //   101: astore          8
        //   103: aload           5
        //   105: invokestatic    com/google/android/gms/common/internal/zzk.zzah:(Landroid/content/Context;)Lcom/google/android/gms/common/internal/zzk;
        //   108: astore          9
        //   110: aload           9
        //   112: getstatic       com/google/android/gms/auth/GoogleAuthUtil.zzOB:Landroid/content/ComponentName;
        //   115: aload           8
        //   117: ldc             "GoogleAuthUtil"
        //   119: invokevirtual   com/google/android/gms/common/internal/zzk.zza:(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
        //   122: ifeq            338
        //   125: aload           8
        //   127: invokevirtual   com/google/android/gms/common/zza.zzmh:()Landroid/os/IBinder;
        //   130: invokestatic    com/google/android/gms/internal/zzau$zza.zza:(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzau;
        //   133: aload_1        
        //   134: aload_2        
        //   135: aload_3        
        //   136: invokeinterface com/google/android/gms/internal/zzau.zza:(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
        //   141: astore          14
        //   143: aload           14
        //   145: ifnonnull       215
        //   148: ldc             "GoogleAuthUtil"
        //   150: ldc             "Binder call returned null."
        //   152: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   155: pop            
        //   156: new             Lcom/google/android/gms/auth/GoogleAuthException;
        //   159: dup            
        //   160: ldc             "ServiceUnavailable"
        //   162: invokespecial   com/google/android/gms/auth/GoogleAuthException.<init>:(Ljava/lang/String;)V
        //   165: athrow         
        //   166: astore          20
        //   168: aload           20
        //   170: athrow         
        //   171: astore          12
        //   173: ldc             "GoogleAuthUtil"
        //   175: ldc             "GMS remote exception "
        //   177: aload           12
        //   179: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   182: pop            
        //   183: new             Ljava/io/IOException;
        //   186: dup            
        //   187: ldc             "remote exception"
        //   189: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   192: athrow         
        //   193: astore          11
        //   195: aload           9
        //   197: getstatic       com/google/android/gms/auth/GoogleAuthUtil.zzOB:Landroid/content/ComponentName;
        //   200: aload           8
        //   202: ldc             "GoogleAuthUtil"
        //   204: invokevirtual   com/google/android/gms/common/internal/zzk.zzb:(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
        //   207: aload           11
        //   209: athrow         
        //   210: astore          7
        //   212: aload           7
        //   214: athrow         
        //   215: aload           14
        //   217: ldc             "authtoken"
        //   219: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   222: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   225: istore          15
        //   227: iload           15
        //   229: ifne            247
        //   232: aload           9
        //   234: getstatic       com/google/android/gms/auth/GoogleAuthUtil.zzOB:Landroid/content/ComponentName;
        //   237: aload           8
        //   239: ldc             "GoogleAuthUtil"
        //   241: invokevirtual   com/google/android/gms/common/internal/zzk.zzb:(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
        //   244: aload           14
        //   246: areturn        
        //   247: aload           14
        //   249: ldc             "Error"
        //   251: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   254: astore          16
        //   256: aload           14
        //   258: ldc             "userRecoveryIntent"
        //   260: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   263: checkcast       Landroid/content/Intent;
        //   266: astore          17
        //   268: aload           16
        //   270: invokestatic    com/google/android/gms/auth/GoogleAuthUtil.zzbv:(Ljava/lang/String;)Z
        //   273: ifeq            305
        //   276: new             Lcom/google/android/gms/auth/UserRecoverableAuthException;
        //   279: dup            
        //   280: aload           16
        //   282: aload           17
        //   284: invokespecial   com/google/android/gms/auth/UserRecoverableAuthException.<init>:(Ljava/lang/String;Landroid/content/Intent;)V
        //   287: athrow         
        //   288: astore          18
        //   290: aload           18
        //   292: athrow         
        //   293: astore          10
        //   295: new             Lcom/google/android/gms/auth/GoogleAuthException;
        //   298: dup            
        //   299: ldc             "Interrupted"
        //   301: invokespecial   com/google/android/gms/auth/GoogleAuthException.<init>:(Ljava/lang/String;)V
        //   304: athrow         
        //   305: aload           16
        //   307: invokestatic    com/google/android/gms/auth/GoogleAuthUtil.zzbu:(Ljava/lang/String;)Z
        //   310: ifeq            328
        //   313: new             Ljava/io/IOException;
        //   316: dup            
        //   317: aload           16
        //   319: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   322: athrow         
        //   323: astore          19
        //   325: aload           19
        //   327: athrow         
        //   328: new             Lcom/google/android/gms/auth/GoogleAuthException;
        //   331: dup            
        //   332: aload           16
        //   334: invokespecial   com/google/android/gms/auth/GoogleAuthException.<init>:(Ljava/lang/String;)V
        //   337: athrow         
        //   338: new             Ljava/io/IOException;
        //   341: dup            
        //   342: ldc             "Could not bind to service with the given context."
        //   344: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   347: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  64     94     210    215    Landroid/os/RemoteException;
        //  125    143    171    193    Landroid/os/RemoteException;
        //  125    143    293    305    Ljava/lang/InterruptedException;
        //  125    143    193    210    Any
        //  148    166    166    171    Landroid/os/RemoteException;
        //  148    166    293    305    Ljava/lang/InterruptedException;
        //  148    166    193    210    Any
        //  168    171    171    193    Landroid/os/RemoteException;
        //  168    171    293    305    Ljava/lang/InterruptedException;
        //  168    171    193    210    Any
        //  173    193    193    210    Any
        //  215    227    171    193    Landroid/os/RemoteException;
        //  215    227    293    305    Ljava/lang/InterruptedException;
        //  215    227    193    210    Any
        //  247    268    171    193    Landroid/os/RemoteException;
        //  247    268    293    305    Ljava/lang/InterruptedException;
        //  247    268    193    210    Any
        //  268    288    288    293    Landroid/os/RemoteException;
        //  268    288    293    305    Ljava/lang/InterruptedException;
        //  268    288    193    210    Any
        //  290    293    171    193    Landroid/os/RemoteException;
        //  290    293    293    305    Ljava/lang/InterruptedException;
        //  290    293    193    210    Any
        //  295    305    193    210    Any
        //  305    323    323    328    Landroid/os/RemoteException;
        //  305    323    293    305    Ljava/lang/InterruptedException;
        //  305    323    193    210    Any
        //  325    328    171    193    Landroid/os/RemoteException;
        //  325    328    293    305    Ljava/lang/InterruptedException;
        //  325    328    193    210    Any
        //  328    338    171    193    Landroid/os/RemoteException;
        //  328    338    293    305    Ljava/lang/InterruptedException;
        //  328    338    193    210    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 162, Size: 162
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
    
    private static boolean zzbu(final String s) {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }
    
    private static boolean zzbv(final String s) {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || zzjr.zzPR.zzld().equals(s) || zzjr.zzPS.zzld().equals(s) || zzjr.zzPT.zzld().equals(s) || zzjr.zzPU.zzld().equals(s) || zzjr.zzPV.zzld().equals(s) || zzjr.zzPW.zzld().equals(s) || zzjr.zzPP.zzld().equals(s);
    }
}
