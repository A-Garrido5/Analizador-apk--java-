// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import java.util.Iterator;
import android.content.pm.PackageInstaller$SessionInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.app.NotificationManager;
import com.google.android.gms.common.internal.zzm;
import android.util.Log;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.internal.zzlk;
import android.support.v4.app.FragmentActivity;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GooglePlayServicesUtil
{
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static boolean a;
    public static boolean zzVS;
    public static boolean zzVT;
    private static int zzVU;
    private static String zzVV;
    private static Integer zzVW;
    static final AtomicBoolean zzVX;
    private static final Object zzoW;
    
    static {
        GOOGLE_PLAY_SERVICES_VERSION_CODE = zzml();
        GooglePlayServicesUtil.zzVS = false;
        GooglePlayServicesUtil.zzVT = false;
        GooglePlayServicesUtil.zzVU = -1;
        zzoW = new Object();
        GooglePlayServicesUtil.zzVV = null;
        GooglePlayServicesUtil.zzVW = null;
        zzVX = new AtomicBoolean();
    }
    
    @Deprecated
    public static Dialog getErrorDialog(final int n, final Activity activity, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return zza(n, activity, null, n2, dialogInterface$OnCancelListener);
    }
    
    @Deprecated
    public static PendingIntent getErrorPendingIntent(final int n, final Context context, final int n2) {
        final Intent zzaT = zzaT(n);
        if (zzaT == null) {
            return null;
        }
        return PendingIntent.getActivity(context, n2, zzaT, 268435456);
    }
    
    public static Context getRemoteContext(final Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    @Deprecated
    public static int isGooglePlayServicesAvailable(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/internal/zzd.zzZR:Z
        //     3: istore_2       
        //     4: iload_2        
        //     5: ifeq            13
        //     8: iconst_0       
        //     9: ireturn        
        //    10: astore_1       
        //    11: aload_1        
        //    12: athrow         
        //    13: aload_0        
        //    14: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    17: astore_3       
        //    18: aload_0        
        //    19: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    22: getstatic       com/google/android/gms/e.common_google_play_services_unknown_issue:I
        //    25: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //    28: pop            
        //    29: ldc             "com.google.android.gms"
        //    31: aload_0        
        //    32: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    35: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    38: ifne            45
        //    41: aload_0        
        //    42: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.zzaa:(Landroid/content/Context;)V
        //    45: aload_3        
        //    46: ldc             "com.google.android.gms"
        //    48: bipush          64
        //    50: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    53: astore          9
        //    55: invokestatic    com/google/android/gms/common/zzd.zzmn:()Lcom/google/android/gms/common/zzd;
        //    58: astore          10
        //    60: aload           9
        //    62: getfield        android/content/pm/PackageInfo.versionCode:I
        //    65: invokestatic    com/google/android/gms/internal/zzkz.zzbP:(I)Z
        //    68: ifne            82
        //    71: aload_0        
        //    72: invokestatic    com/google/android/gms/internal/zzkz.zzai:(Landroid/content/Context;)Z
        //    75: istore          25
        //    77: iload           25
        //    79: ifeq            155
        //    82: aload           10
        //    84: aload           9
        //    86: getstatic       com/google/android/gms/common/zzc$zzbk.zzVR:[Lcom/google/android/gms/common/zzc$zza;
        //    89: invokevirtual   com/google/android/gms/common/zzd.zza:(Landroid/content/pm/PackageInfo;[Lcom/google/android/gms/common/zzc$zza;)Lcom/google/android/gms/common/zzc$zza;
        //    92: astore          14
        //    94: aload           14
        //    96: ifnonnull       292
        //    99: ldc             "GooglePlayServicesUtil"
        //   101: ldc             "Google Play services signature invalid."
        //   103: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   106: pop            
        //   107: bipush          9
        //   109: ireturn        
        //   110: astore          4
        //   112: ldc             "GooglePlayServicesUtil"
        //   114: ldc             "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
        //   116: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   119: pop            
        //   120: goto            29
        //   123: astore          6
        //   125: aload           6
        //   127: athrow         
        //   128: astore          7
        //   130: ldc             "GooglePlayServicesUtil"
        //   132: ldc             "Google Play services is missing."
        //   134: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   137: pop            
        //   138: iconst_1       
        //   139: ireturn        
        //   140: astore          11
        //   142: aload           11
        //   144: athrow         
        //   145: astore          12
        //   147: aload           12
        //   149: athrow         
        //   150: astore          13
        //   152: aload           13
        //   154: athrow         
        //   155: aload           10
        //   157: aload_3        
        //   158: ldc             "com.android.vending"
        //   160: bipush          64
        //   162: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   165: getstatic       com/google/android/gms/common/zzc$zzbk.zzVR:[Lcom/google/android/gms/common/zzc$zza;
        //   168: invokevirtual   com/google/android/gms/common/zzd.zza:(Landroid/content/pm/PackageInfo;[Lcom/google/android/gms/common/zzc$zza;)Lcom/google/android/gms/common/zzc$zza;
        //   171: astore          33
        //   173: aload           33
        //   175: ifnonnull       189
        //   178: ldc             "GooglePlayServicesUtil"
        //   180: ldc             "Google Play Store signature invalid."
        //   182: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   185: pop            
        //   186: bipush          9
        //   188: ireturn        
        //   189: aload           10
        //   191: aload           9
        //   193: iconst_1       
        //   194: anewarray       Lcom/google/android/gms/common/zzc$zza;
        //   197: dup            
        //   198: iconst_0       
        //   199: aload           33
        //   201: aastore        
        //   202: invokevirtual   com/google/android/gms/common/zzd.zza:(Landroid/content/pm/PackageInfo;[Lcom/google/android/gms/common/zzc$zza;)Lcom/google/android/gms/common/zzc$zza;
        //   205: ifnonnull       292
        //   208: ldc             "GooglePlayServicesUtil"
        //   210: ldc             "Google Play services signature invalid."
        //   212: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   215: pop            
        //   216: bipush          9
        //   218: ireturn        
        //   219: astore          35
        //   221: aload           35
        //   223: athrow         
        //   224: astore          26
        //   226: aload_0        
        //   227: ldc             "com.android.vending"
        //   229: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.zzh:(Landroid/content/Context;Ljava/lang/String;)Z
        //   232: ifeq            281
        //   235: ldc             "GooglePlayServicesUtil"
        //   237: ldc             "Google Play Store is updating."
        //   239: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   242: pop            
        //   243: aload           10
        //   245: aload           9
        //   247: getstatic       com/google/android/gms/common/zzc$zzbk.zzVR:[Lcom/google/android/gms/common/zzc$zza;
        //   250: invokevirtual   com/google/android/gms/common/zzd.zza:(Landroid/content/pm/PackageInfo;[Lcom/google/android/gms/common/zzc$zza;)Lcom/google/android/gms/common/zzc$zza;
        //   253: astore          31
        //   255: aload           31
        //   257: ifnonnull       292
        //   260: ldc             "GooglePlayServicesUtil"
        //   262: ldc             "Google Play services signature invalid."
        //   264: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   267: pop            
        //   268: bipush          9
        //   270: ireturn        
        //   271: astore          27
        //   273: aload           27
        //   275: athrow         
        //   276: astore          28
        //   278: aload           28
        //   280: athrow         
        //   281: ldc             "GooglePlayServicesUtil"
        //   283: ldc             "Google Play Store is neither installed nor updating."
        //   285: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   288: pop            
        //   289: bipush          9
        //   291: ireturn        
        //   292: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE:I
        //   295: invokestatic    com/google/android/gms/internal/zzkz.zzbN:(I)I
        //   298: istore          15
        //   300: aload           9
        //   302: getfield        android/content/pm/PackageInfo.versionCode:I
        //   305: invokestatic    com/google/android/gms/internal/zzkz.zzbN:(I)I
        //   308: iload           15
        //   310: if_icmpge       360
        //   313: ldc             "GooglePlayServicesUtil"
        //   315: new             Ljava/lang/StringBuilder;
        //   318: dup            
        //   319: invokespecial   java/lang/StringBuilder.<init>:()V
        //   322: ldc             "Google Play services out of date.  Requires "
        //   324: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   327: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE:I
        //   330: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   333: ldc             " but found "
        //   335: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   338: aload           9
        //   340: getfield        android/content/pm/PackageInfo.versionCode:I
        //   343: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   346: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   349: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   352: pop            
        //   353: iconst_2       
        //   354: ireturn        
        //   355: astore          22
        //   357: aload           22
        //   359: athrow         
        //   360: aload           9
        //   362: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //   365: astore          16
        //   367: aload           16
        //   369: ifnonnull       385
        //   372: aload_3        
        //   373: ldc             "com.google.android.gms"
        //   375: iconst_0       
        //   376: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   379: astore          21
        //   381: aload           21
        //   383: astore          16
        //   385: aload           16
        //   387: getfield        android/content/pm/ApplicationInfo.enabled:Z
        //   390: istore          18
        //   392: iload           18
        //   394: ifne            8
        //   397: iconst_3       
        //   398: ireturn        
        //   399: astore          19
        //   401: ldc             "GooglePlayServicesUtil"
        //   403: ldc             "Google Play services missing when getting application info."
        //   405: invokestatic    android/util/Log.wtf:(Ljava/lang/String;Ljava/lang/String;)I
        //   408: pop            
        //   409: aload           19
        //   411: invokevirtual   android/content/pm/PackageManager$NameNotFoundException.printStackTrace:()V
        //   414: iconst_1       
        //   415: ireturn        
        //   416: astore          17
        //   418: aload           17
        //   420: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      4      10     13     Ljava/lang/Throwable;
        //  18     29     110    123    Ljava/lang/Throwable;
        //  29     45     123    128    Ljava/lang/Throwable;
        //  45     55     128    140    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  60     77     140    145    Ljava/lang/Throwable;
        //  82     94     145    150    Ljava/lang/Throwable;
        //  99     107    150    155    Ljava/lang/Throwable;
        //  142    145    145    150    Ljava/lang/Throwable;
        //  147    150    150    155    Ljava/lang/Throwable;
        //  155    173    224    292    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  178    186    224    292    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  189    216    224    292    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  189    216    219    224    Ljava/lang/IllegalArgumentException;
        //  226    255    271    276    Ljava/lang/Throwable;
        //  260    268    276    281    Ljava/lang/Throwable;
        //  273    276    276    281    Ljava/lang/Throwable;
        //  313    353    355    360    Ljava/lang/Throwable;
        //  372    381    399    416    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  385    392    416    421    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 207, Size: 207
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
    
    @Deprecated
    public static boolean isUserRecoverableError(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 1:
            case 2:
            case 3:
            case 9: {
                return true;
            }
        }
    }
    
    public static boolean showErrorDialogFragment(final int n, final Activity activity, final Fragment fragment, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final boolean a = GooglePlayServicesUtil.a;
        final Dialog zza = zza(n, activity, fragment, n2, dialogInterface$OnCancelListener);
        if (zza == null) {
            return false;
        }
        while (true) {
            try {
                final int n3 = (activity instanceof FragmentActivity) ? 1 : 0;
                while (true) {
                    if (n3 != 0) {
                        final FragmentManager supportFragmentManager = ((FragmentActivity)activity).getSupportFragmentManager();
                        final SupportErrorDialogFragment instance = SupportErrorDialogFragment.newInstance(zza, dialogInterface$OnCancelListener);
                        try {
                            instance.show(supportFragmentManager, "GooglePlayServicesErrorDialog");
                            if (a) {
                                Label_0105: {
                                    if (!zzlk.zzoR()) {
                                        break Label_0105;
                                    }
                                    final android.app.FragmentManager fragmentManager = activity.getFragmentManager();
                                    final ErrorDialogFragment instance2 = ErrorDialogFragment.newInstance(zza, dialogInterface$OnCancelListener);
                                    try {
                                        instance2.show(fragmentManager, "GooglePlayServicesErrorDialog");
                                        if (a) {
                                            throw new RuntimeException("This Activity does not support Fragments.");
                                        }
                                        return true;
                                    }
                                    catch (NoClassDefFoundError noClassDefFoundError) {
                                        throw noClassDefFoundError;
                                    }
                                }
                            }
                        }
                        catch (NoClassDefFoundError noClassDefFoundError2) {
                            throw noClassDefFoundError2;
                        }
                        return true;
                    }
                    continue;
                }
            }
            catch (NoClassDefFoundError noClassDefFoundError3) {
                final int n3 = 0;
                continue;
            }
            break;
        }
    }
    
    @Deprecated
    public static void zzY(final Context context) {
        final int googlePlayServicesAvailable = isGooglePlayServicesAvailable(context);
        if (googlePlayServicesAvailable != 0) {
            final Intent zzaT = zzaT(googlePlayServicesAvailable);
            try {
                Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + googlePlayServicesAvailable);
                if (zzaT == null) {
                    throw new GooglePlayServicesNotAvailableException(googlePlayServicesAvailable);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            throw new GooglePlayServicesRepairableException(googlePlayServicesAvailable, "Google Play Services not available", zzaT);
        }
    }
    
    private static Dialog zza(final int p0, final Activity p1, final Fragment p2, final int p3, final DialogInterface$OnCancelListener p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_0        
        //     1: ifne            6
        //     4: aconst_null    
        //     5: areturn        
        //     6: aload_1        
        //     7: invokestatic    com/google/android/gms/internal/zzkz.zzai:(Landroid/content/Context;)Z
        //    10: istore          6
        //    12: iload           6
        //    14: ifeq            25
        //    17: iload_0        
        //    18: iconst_2       
        //    19: if_icmpne       25
        //    22: bipush          42
        //    24: istore_0       
        //    25: invokestatic    com/google/android/gms/internal/zzlk.zzoU:()Z
        //    28: istore          7
        //    30: aconst_null    
        //    31: astore          8
        //    33: iload           7
        //    35: ifeq            100
        //    38: new             Landroid/util/TypedValue;
        //    41: dup            
        //    42: invokespecial   android/util/TypedValue.<init>:()V
        //    45: astore          9
        //    47: aload_1        
        //    48: invokevirtual   android/app/Activity.getTheme:()Landroid/content/res/Resources$Theme;
        //    51: ldc_w           16843529
        //    54: aload           9
        //    56: iconst_1       
        //    57: invokevirtual   android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
        //    60: pop            
        //    61: ldc_w           "Theme.Dialog.Alert"
        //    64: aload_1        
        //    65: invokevirtual   android/app/Activity.getResources:()Landroid/content/res/Resources;
        //    68: aload           9
        //    70: getfield        android/util/TypedValue.resourceId:I
        //    73: invokevirtual   android/content/res/Resources.getResourceEntryName:(I)Ljava/lang/String;
        //    76: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    79: istore          11
        //    81: aconst_null    
        //    82: astore          8
        //    84: iload           11
        //    86: ifeq            100
        //    89: new             Landroid/app/AlertDialog$Builder;
        //    92: dup            
        //    93: aload_1        
        //    94: iconst_5       
        //    95: invokespecial   android/app/AlertDialog$Builder.<init>:(Landroid/content/Context;I)V
        //    98: astore          8
        //   100: aload           8
        //   102: ifnonnull       115
        //   105: new             Landroid/app/AlertDialog$Builder;
        //   108: dup            
        //   109: aload_1        
        //   110: invokespecial   android/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   113: astore          8
        //   115: aload_1        
        //   116: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.zzad:(Landroid/content/Context;)Ljava/lang/String;
        //   119: astore          12
        //   121: aload           8
        //   123: aload_1        
        //   124: iload_0        
        //   125: aload           12
        //   127: invokestatic    com/google/android/gms/common/internal/zzf.zzb:(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;
        //   130: invokevirtual   android/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
        //   133: pop            
        //   134: aload           4
        //   136: ifnull          147
        //   139: aload           8
        //   141: aload           4
        //   143: invokevirtual   android/app/AlertDialog$Builder.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
        //   146: pop            
        //   147: iload_0        
        //   148: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.zzaT:(I)Landroid/content/Intent;
        //   151: astore          16
        //   153: aload_2        
        //   154: ifnonnull       176
        //   157: new             Lcom/google/android/gms/common/internal/zzg;
        //   160: dup            
        //   161: aload_1        
        //   162: aload           16
        //   164: iload_3        
        //   165: invokespecial   com/google/android/gms/common/internal/zzg.<init>:(Landroid/app/Activity;Landroid/content/Intent;I)V
        //   168: astore          17
        //   170: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.a:Z
        //   173: ifeq            189
        //   176: new             Lcom/google/android/gms/common/internal/zzg;
        //   179: dup            
        //   180: aload_2        
        //   181: aload           16
        //   183: iload_3        
        //   184: invokespecial   com/google/android/gms/common/internal/zzg.<init>:(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
        //   187: astore          17
        //   189: aload_1        
        //   190: iload_0        
        //   191: invokestatic    com/google/android/gms/common/internal/zzf.zzh:(Landroid/content/Context;I)Ljava/lang/String;
        //   194: astore          18
        //   196: aload           18
        //   198: ifnull          211
        //   201: aload           8
        //   203: aload           18
        //   205: aload           17
        //   207: invokevirtual   android/app/AlertDialog$Builder.setPositiveButton:(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
        //   210: pop            
        //   211: aload_1        
        //   212: iload_0        
        //   213: invokestatic    com/google/android/gms/common/internal/zzf.zzg:(Landroid/content/Context;I)Ljava/lang/String;
        //   216: astore          19
        //   218: aload           19
        //   220: ifnull          231
        //   223: aload           8
        //   225: aload           19
        //   227: invokevirtual   android/app/AlertDialog$Builder.setTitle:(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
        //   230: pop            
        //   231: aload           8
        //   233: invokevirtual   android/app/AlertDialog$Builder.create:()Landroid/app/AlertDialog;
        //   236: areturn        
        //   237: astore          5
        //   239: aload           5
        //   241: athrow         
        //   242: astore          13
        //   244: aload           13
        //   246: athrow         
        //   247: astore          22
        //   249: aload           22
        //   251: athrow         
        //   252: astore          20
        //   254: aload           20
        //   256: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      12     237    242    Ljava/lang/IllegalArgumentException;
        //  121    134    242    247    Ljava/lang/IllegalArgumentException;
        //  139    147    242    247    Ljava/lang/IllegalArgumentException;
        //  201    211    247    252    Ljava/lang/IllegalArgumentException;
        //  223    231    252    257    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 129, Size: 129
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
    
    @Deprecated
    public static Intent zzaT(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1:
            case 2: {
                try {
                    return zzm.zzcg("com.google.android.gms");
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 42: {
                return zzm.zznX();
            }
            case 3: {
                return zzm.zzce("com.google.android.gms");
            }
        }
    }
    
    private static void zzaa(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.a:Z
        //     3: istore_1       
        //     4: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.zzoW:Ljava/lang/Object;
        //     7: astore_2       
        //     8: aload_2        
        //     9: monitorenter   
        //    10: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.zzVV:Ljava/lang/String;
        //    13: ifnonnull       124
        //    16: aload_0        
        //    17: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    20: putstatic       com/google/android/gms/common/GooglePlayServicesUtil.zzVV:Ljava/lang/String;
        //    23: aload_0        
        //    24: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    27: aload_0        
        //    28: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    31: sipush          128
        //    34: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    37: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    40: astore          12
        //    42: aload           12
        //    44: ifnull          65
        //    47: aload           12
        //    49: ldc_w           "com.google.android.gms.version"
        //    52: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //    55: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    58: putstatic       com/google/android/gms/common/GooglePlayServicesUtil.zzVW:Ljava/lang/Integer;
        //    61: iload_1        
        //    62: ifeq            69
        //    65: aconst_null    
        //    66: putstatic       com/google/android/gms/common/GooglePlayServicesUtil.zzVW:Ljava/lang/Integer;
        //    69: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.zzVW:Ljava/lang/Integer;
        //    72: astore          7
        //    74: aload_2        
        //    75: monitorexit    
        //    76: aload           7
        //    78: ifnonnull       205
        //    81: new             Ljava/lang/IllegalStateException;
        //    84: dup            
        //    85: ldc_w           "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
        //    88: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    91: athrow         
        //    92: astore          9
        //    94: aload           9
        //    96: athrow         
        //    97: astore          14
        //    99: aload           14
        //   101: athrow         
        //   102: astore          13
        //   104: aload           13
        //   106: athrow         
        //   107: astore          10
        //   109: ldc             "GooglePlayServicesUtil"
        //   111: ldc_w           "This should never happen."
        //   114: aload           10
        //   116: invokestatic    android/util/Log.wtf:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   119: pop            
        //   120: iload_1        
        //   121: ifeq            69
        //   124: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.zzVV:Ljava/lang/String;
        //   127: aload_0        
        //   128: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   131: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   134: istore          6
        //   136: iload           6
        //   138: ifne            69
        //   141: new             Ljava/lang/IllegalArgumentException;
        //   144: dup            
        //   145: new             Ljava/lang/StringBuilder;
        //   148: dup            
        //   149: invokespecial   java/lang/StringBuilder.<init>:()V
        //   152: ldc_w           "isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '"
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.zzVV:Ljava/lang/String;
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: ldc_w           "' and this call used package '"
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload_0        
        //   171: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: ldc_w           "'."
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   186: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   189: athrow         
        //   190: astore          5
        //   192: aload           5
        //   194: athrow         
        //   195: astore_3       
        //   196: aload_2        
        //   197: monitorexit    
        //   198: aload_3        
        //   199: athrow         
        //   200: astore          4
        //   202: aload           4
        //   204: athrow         
        //   205: aload           7
        //   207: invokevirtual   java/lang/Integer.intValue:()I
        //   210: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE:I
        //   213: if_icmpeq       298
        //   216: new             Ljava/lang/IllegalStateException;
        //   219: dup            
        //   220: new             Ljava/lang/StringBuilder;
        //   223: dup            
        //   224: invokespecial   java/lang/StringBuilder.<init>:()V
        //   227: ldc_w           "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: getstatic       com/google/android/gms/common/GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE:I
        //   236: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   239: ldc_w           " but"
        //   242: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   245: ldc_w           " found "
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: aload           7
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   256: ldc_w           ".  You must have the"
        //   259: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   262: ldc_w           " following declaration within the <application> element: "
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   268: ldc_w           "    <meta-data android:name=\""
        //   271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   274: ldc_w           "com.google.android.gms.version"
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: ldc_w           "\" android:value=\"@integer/google_play_services_version\" />"
        //   283: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   286: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   289: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   292: athrow         
        //   293: astore          8
        //   295: aload           8
        //   297: athrow         
        //   298: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  10     23     195    200    Any
        //  23     42     107    124    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  23     42     195    200    Any
        //  47     61     97     102    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  47     61     195    200    Any
        //  65     69     102    107    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  65     69     195    200    Any
        //  69     76     195    200    Any
        //  81     92     92     97     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  99     102    102    107    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  99     102    195    200    Any
        //  104    107    107    124    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  104    107    195    200    Any
        //  109    120    200    205    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  109    120    195    200    Any
        //  124    136    200    205    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  124    136    195    200    Any
        //  141    190    190    195    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  141    190    195    200    Any
        //  192    195    195    200    Any
        //  196    198    195    200    Any
        //  202    205    190    195    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  202    205    195    200    Any
        //  205    293    293    298    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    @Deprecated
    public static void zzac(final Context context) {
        try {
            if (GooglePlayServicesUtil.zzVX.getAndSet(true)) {
                return;
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        try {
            ((NotificationManager)context.getSystemService("notification")).cancel(10436);
        }
        catch (SecurityException ex2) {}
    }
    
    public static String zzad(final Context context) {
        String s = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        s = context.getPackageName();
        final PackageManager packageManager = context.getApplicationContext().getPackageManager();
        while (true) {
            try {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                if (applicationInfo != null) {
                    s = packageManager.getApplicationLabel(applicationInfo).toString();
                }
                return s;
            }
            catch (PackageManager$NameNotFoundException ex) {
                final ApplicationInfo applicationInfo = null;
                continue;
            }
            break;
        }
    }
    
    @Deprecated
    public static boolean zze(final Context context, final int n) {
        if (n == 18) {
            return true;
        }
        if (n == 1) {
            try {
                return zzh(context, "com.google.android.gms");
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    public static boolean zzh(final Context context, final String s) {
        final boolean a = GooglePlayServicesUtil.a;
        if (zzlk.zzoZ()) {
            for (final PackageInstaller$SessionInfo packageInstaller$SessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                try {
                    if (s.equals(packageInstaller$SessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
                catch (PackageManager$NameNotFoundException ex) {
                    throw ex;
                }
                if (a) {
                    break;
                }
            }
            if (!a) {
                return false;
            }
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.getApplicationInfo(s, 8192).enabled) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        catch (PackageManager$NameNotFoundException ex3) {}
        return false;
    }
    
    private static int zzml() {
        return 7571000;
    }
}
