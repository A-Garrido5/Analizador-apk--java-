// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.DialogInterface$OnClickListener;
import com.google.android.gms.internal.m;
import android.app.AlertDialog$Builder;
import android.util.TypedValue;
import com.google.android.gms.internal.be;
import java.util.Arrays;
import java.util.Set;
import android.util.Base64;
import android.util.Log;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.app.Dialog;
import com.google.android.gms.internal.bj;
import android.support.v4.app.FragmentActivity;
import android.content.DialogInterface$OnCancelListener;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Build;
import android.content.res.Resources;
import com.google.android.gms.internal.aa;
import android.content.Intent;
import android.content.Context;

public final class e
{
    public static boolean a;
    public static boolean b;
    private static int c;
    private static final Object d;
    
    static {
        e.a = false;
        e.b = false;
        e.c = -1;
        d = new Object();
    }
    
    public static int a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //     4: astore_1       
        //     5: getstatic       com/google/android/gms/internal/l.a:Z
        //     8: ifne            22
        //    11: aload_0        
        //    12: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    15: getstatic       am.common_google_play_services_unknown_issue:I
        //    18: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //    21: pop            
        //    22: getstatic       com/google/android/gms/internal/l.a:Z
        //    25: ifne            32
        //    28: aload_0        
        //    29: invokestatic    com/google/android/gms/common/e.d:(Landroid/content/Context;)V
        //    32: aload_1        
        //    33: ldc             "com.google.android.gms"
        //    35: bipush          64
        //    37: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    40: astore          4
        //    42: aload           4
        //    44: getfield        android/content/pm/PackageInfo.versionCode:I
        //    47: invokestatic    com/google/android/gms/internal/be.c:(I)Z
        //    50: ifeq            242
        //    53: invokestatic    com/google/android/gms/common/e.a:()Z
        //    56: ifeq            143
        //    59: iconst_0       
        //    60: istore          17
        //    62: iconst_3       
        //    63: anewarray       [B
        //    66: astore          18
        //    68: aload           18
        //    70: iconst_0       
        //    71: getstatic       com/google/android/gms/common/g.a:[[B
        //    74: iload           17
        //    76: aaload         
        //    77: aastore        
        //    78: aload           18
        //    80: iconst_1       
        //    81: getstatic       com/google/android/gms/common/g.g:[[B
        //    84: iload           17
        //    86: aaload         
        //    87: aastore        
        //    88: aload           18
        //    90: iconst_2       
        //    91: getstatic       com/google/android/gms/common/g.f:[[B
        //    94: iload           17
        //    96: aaload         
        //    97: aastore        
        //    98: aload           4
        //   100: aload           18
        //   102: invokestatic    com/google/android/gms/common/e.a:(Landroid/content/pm/PackageInfo;[[B)[B
        //   105: ifnonnull       149
        //   108: ldc             "GooglePlayServicesUtil"
        //   110: ldc             "Google Play Services signature invalid on Glass."
        //   112: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   115: pop            
        //   116: bipush          9
        //   118: ireturn        
        //   119: astore          25
        //   121: ldc             "GooglePlayServicesUtil"
        //   123: ldc             "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
        //   125: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   128: pop            
        //   129: goto            22
        //   132: astore_2       
        //   133: ldc             "GooglePlayServicesUtil"
        //   135: ldc             "Google Play services is missing."
        //   137: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   140: pop            
        //   141: iconst_1       
        //   142: ireturn        
        //   143: iconst_1       
        //   144: istore          17
        //   146: goto            62
        //   149: aload_0        
        //   150: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   153: astore          19
        //   155: aload_1        
        //   156: aload           19
        //   158: bipush          64
        //   160: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   163: astore          22
        //   165: aload_1        
        //   166: aload           22
        //   168: invokestatic    com/google/android/gms/common/e.a:(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)Z
        //   171: ifne            348
        //   174: ldc             "GooglePlayServicesUtil"
        //   176: new             Ljava/lang/StringBuilder;
        //   179: dup            
        //   180: invokespecial   java/lang/StringBuilder.<init>:()V
        //   183: ldc             "Calling package "
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: aload           22
        //   190: getfield        android/content/pm/PackageInfo.packageName:Ljava/lang/String;
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: ldc             " signature invalid on Glass."
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   204: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   207: pop            
        //   208: bipush          9
        //   210: ireturn        
        //   211: astore          20
        //   213: ldc             "GooglePlayServicesUtil"
        //   215: new             Ljava/lang/StringBuilder;
        //   218: dup            
        //   219: invokespecial   java/lang/StringBuilder.<init>:()V
        //   222: ldc             "Could not get info for calling package: "
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: aload           19
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   235: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   238: pop            
        //   239: bipush          9
        //   241: ireturn        
        //   242: aload_0        
        //   243: invokestatic    com/google/android/gms/internal/be.a:(Landroid/content/Context;)Z
        //   246: ifeq            271
        //   249: aload           4
        //   251: getstatic       com/google/android/gms/common/g.a:[[B
        //   254: invokestatic    com/google/android/gms/common/e.a:(Landroid/content/pm/PackageInfo;[[B)[B
        //   257: ifnonnull       348
        //   260: ldc             "GooglePlayServicesUtil"
        //   262: ldc             "Google Play services signature invalid."
        //   264: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   267: pop            
        //   268: bipush          9
        //   270: ireturn        
        //   271: aload_1        
        //   272: ldc             "com.android.vending"
        //   274: bipush          64
        //   276: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   279: astore          7
        //   281: aload           7
        //   283: getstatic       com/google/android/gms/common/g.a:[[B
        //   286: invokestatic    com/google/android/gms/common/e.a:(Landroid/content/pm/PackageInfo;[[B)[B
        //   289: astore          8
        //   291: aload           8
        //   293: ifnonnull       320
        //   296: ldc             "GooglePlayServicesUtil"
        //   298: ldc             "Google Play Store signature invalid."
        //   300: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   303: pop            
        //   304: bipush          9
        //   306: ireturn        
        //   307: astore          5
        //   309: ldc             "GooglePlayServicesUtil"
        //   311: ldc             "Google Play Store is missing."
        //   313: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   316: pop            
        //   317: bipush          9
        //   319: ireturn        
        //   320: aload           4
        //   322: iconst_1       
        //   323: anewarray       [B
        //   326: dup            
        //   327: iconst_0       
        //   328: aload           8
        //   330: aastore        
        //   331: invokestatic    com/google/android/gms/common/e.a:(Landroid/content/pm/PackageInfo;[[B)[B
        //   334: ifnonnull       348
        //   337: ldc             "GooglePlayServicesUtil"
        //   339: ldc             "Google Play services signature invalid."
        //   341: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   344: pop            
        //   345: bipush          9
        //   347: ireturn        
        //   348: ldc             6587000
        //   350: invokestatic    com/google/android/gms/internal/be.a:(I)I
        //   353: istore          9
        //   355: aload           4
        //   357: getfield        android/content/pm/PackageInfo.versionCode:I
        //   360: invokestatic    com/google/android/gms/internal/be.a:(I)I
        //   363: iload           9
        //   365: if_icmpge       399
        //   368: ldc             "GooglePlayServicesUtil"
        //   370: new             Ljava/lang/StringBuilder;
        //   373: dup            
        //   374: invokespecial   java/lang/StringBuilder.<init>:()V
        //   377: ldc             "Google Play services out of date.  Requires 6587000 but found "
        //   379: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   382: aload           4
        //   384: getfield        android/content/pm/PackageInfo.versionCode:I
        //   387: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   390: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   393: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   396: pop            
        //   397: iconst_2       
        //   398: ireturn        
        //   399: aload_1        
        //   400: ldc             "com.google.android.gms"
        //   402: iconst_0       
        //   403: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   406: astore          12
        //   408: aload           12
        //   410: getfield        android/content/pm/ApplicationInfo.enabled:Z
        //   413: ifne            435
        //   416: iconst_3       
        //   417: ireturn        
        //   418: astore          10
        //   420: ldc             "GooglePlayServicesUtil"
        //   422: ldc             "Google Play services missing when getting application info."
        //   424: invokestatic    android/util/Log.wtf:(Ljava/lang/String;Ljava/lang/String;)I
        //   427: pop            
        //   428: aload           10
        //   430: invokevirtual   android/content/pm/PackageManager$NameNotFoundException.printStackTrace:()V
        //   433: iconst_1       
        //   434: ireturn        
        //   435: iconst_0       
        //   436: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  11     22     119    132    Ljava/lang/Throwable;
        //  32     42     132    143    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  155    208    211    242    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  271    281    307    320    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  399    408    418    435    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    public static Intent a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1:
            case 2: {
                return aa.b("com.google.android.gms");
            }
            case 42: {
                return aa.a();
            }
            case 3: {
                return aa.a("com.google.android.gms");
            }
        }
    }
    
    public static String a(final Context context, final int n) {
        final Resources resources = context.getResources();
        switch (n) {
            default: {
                return resources.getString(am.common_google_play_services_unknown_issue);
            }
            case 1: {
                if (a(context.getResources())) {
                    return resources.getString(am.common_google_play_services_install_text_tablet);
                }
                return resources.getString(am.common_google_play_services_install_text_phone);
            }
            case 3: {
                return resources.getString(am.common_google_play_services_enable_text);
            }
            case 2: {
                return resources.getString(am.common_google_play_services_update_text);
            }
            case 42: {
                return resources.getString(am.common_android_wear_update_text);
            }
            case 9: {
                return resources.getString(am.common_google_play_services_unsupported_text);
            }
            case 7: {
                return resources.getString(am.common_google_play_services_network_error_text);
            }
            case 5: {
                return resources.getString(am.common_google_play_services_invalid_account_text);
            }
        }
    }
    
    public static boolean a() {
        if (e.a) {
            return e.b;
        }
        return "user".equals(Build.TYPE);
    }
    
    public static boolean a(final int n, final Activity activity, final Fragment fragment, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final Dialog b = b(n, activity, fragment, n2, dialogInterface$OnCancelListener);
        if (b == null) {
            return false;
        }
        while (true) {
            try {
                final int n3 = (activity instanceof FragmentActivity) ? 1 : 0;
                if (n3 != 0) {
                    SupportErrorDialogFragment.a(b, dialogInterface$OnCancelListener).show(((FragmentActivity)activity).getSupportFragmentManager(), "GooglePlayServicesErrorDialog");
                }
                else {
                    if (!bj.a()) {
                        throw new RuntimeException("This Activity does not support Fragments.");
                    }
                    com.google.android.gms.common.b.a(b, dialogInterface$OnCancelListener).show(activity.getFragmentManager(), "GooglePlayServicesErrorDialog");
                }
                return true;
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                final int n3 = 0;
                continue;
            }
            break;
        }
    }
    
    public static boolean a(final PackageManager packageManager) {
        synchronized (e.d) {
        Label_0054:
            while (true) {
                if (e.c != -1) {
                    break Label_0054;
                }
                while (true) {
                    try {
                        if (a(packageManager.getPackageInfo("com.google.android.gms", 64), new byte[][] { g.E[1] }) != null) {
                            e.c = 1;
                        }
                        else {
                            e.c = 0;
                        }
                        // monitorexit(e.d)
                        if (e.c != 0) {
                            return true;
                        }
                        break;
                    }
                    catch (PackageManager$NameNotFoundException ex) {
                        e.c = 0;
                        continue Label_0054;
                    }
                    continue Label_0054;
                }
                break;
            }
        }
        return false;
    }
    
    public static boolean a(final PackageManager packageManager, final PackageInfo packageInfo) {
        boolean b = true;
        boolean b2 = false;
        if (packageInfo != null) {
            if (b(packageManager)) {
                if (a(packageInfo, b) == null) {
                    b = false;
                }
                return b;
            }
            final byte[] a = a(packageInfo, false);
            b2 = false;
            if (a != null) {
                b2 = b;
            }
            if (!b2 && a(packageInfo, b) != null) {
                Log.w("GooglePlayServicesUtil", "Test-keys aren't accepted on this build.");
                return b2;
            }
        }
        return b2;
    }
    
    public static boolean a(final Resources resources) {
        if (resources != null) {
            boolean b;
            if ((0xF & resources.getConfiguration().screenLayout) > 3) {
                b = true;
            }
            else {
                b = false;
            }
            if ((bj.a() && b) || b(resources)) {
                return true;
            }
        }
        return false;
    }
    
    private static byte[] a(final PackageInfo packageInfo, final boolean b) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        final byte[] byteArray = packageInfo.signatures[0].toByteArray();
        Set set;
        if (b) {
            set = g.a();
        }
        else {
            set = g.b();
        }
        if (set.contains(byteArray)) {
            return byteArray;
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
            Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(byteArray, 0));
        }
        return null;
    }
    
    private static byte[] a(final PackageInfo packageInfo, final byte[]... array) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        final byte[] byteArray = packageInfo.signatures[0].toByteArray();
        for (int i = 0; i < array.length; ++i) {
            final byte[] array2 = array[i];
            if (Arrays.equals(array2, byteArray)) {
                return array2;
            }
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
            Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(byteArray, 0));
        }
        return null;
    }
    
    private static Dialog b(int n, final Activity activity, final Fragment fragment, final int n2, final DialogInterface$OnCancelListener onCancelListener) {
        if (be.a((Context)activity) && n == 2) {
            n = 42;
        }
        while (true) {
            Label_0488: {
                if (!bj.c()) {
                    break Label_0488;
                }
                final TypedValue typedValue = new TypedValue();
                activity.getTheme().resolveAttribute(16843529, typedValue, true);
                if (!"Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
                    break Label_0488;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity, 5);
                if (alertDialog$Builder == null) {
                    alertDialog$Builder = new AlertDialog$Builder((Context)activity);
                }
                alertDialog$Builder.setMessage((CharSequence)a((Context)activity, n));
                if (onCancelListener != null) {
                    alertDialog$Builder.setOnCancelListener(onCancelListener);
                }
                final Intent a = a(n);
                m m;
                if (fragment == null) {
                    m = new m(activity, a, n2);
                }
                else {
                    m = new m(fragment, a, n2);
                }
                final String b = b((Context)activity, n);
                if (b != null) {
                    alertDialog$Builder.setPositiveButton((CharSequence)b, (DialogInterface$OnClickListener)m);
                }
                switch (n) {
                    default: {
                        Log.e("GooglePlayServicesUtil", "Unexpected error code " + n);
                        return (Dialog)alertDialog$Builder.create();
                    }
                    case 0: {
                        return null;
                    }
                    case 4:
                    case 6: {
                        return (Dialog)alertDialog$Builder.create();
                    }
                    case 1: {
                        return (Dialog)alertDialog$Builder.setTitle(am.common_google_play_services_install_title).create();
                    }
                    case 3: {
                        return (Dialog)alertDialog$Builder.setTitle(am.common_google_play_services_enable_title).create();
                    }
                    case 2: {
                        return (Dialog)alertDialog$Builder.setTitle(am.common_google_play_services_update_title).create();
                    }
                    case 42: {
                        return (Dialog)alertDialog$Builder.setTitle(am.common_android_wear_update_title).create();
                    }
                    case 9: {
                        Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
                        return (Dialog)alertDialog$Builder.setTitle(am.common_google_play_services_unsupported_title).create();
                    }
                    case 7: {
                        Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
                        return (Dialog)alertDialog$Builder.setTitle(am.common_google_play_services_network_error_title).create();
                    }
                    case 8: {
                        Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
                        return (Dialog)alertDialog$Builder.create();
                    }
                    case 10: {
                        Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
                        return (Dialog)alertDialog$Builder.create();
                    }
                    case 5: {
                        Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
                        return (Dialog)alertDialog$Builder.setTitle(am.common_google_play_services_invalid_account_title).create();
                    }
                    case 11: {
                        Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
                        return (Dialog)alertDialog$Builder.create();
                    }
                }
            }
            AlertDialog$Builder alertDialog$Builder = null;
            continue;
        }
    }
    
    public static String b(final Context context, final int n) {
        final Resources resources = context.getResources();
        switch (n) {
            default: {
                return resources.getString(17039370);
            }
            case 1: {
                return resources.getString(am.common_google_play_services_install_button);
            }
            case 3: {
                return resources.getString(am.common_google_play_services_enable_button);
            }
            case 2:
            case 42: {
                return resources.getString(am.common_google_play_services_update_button);
            }
        }
    }
    
    public static void b(final Context context) {
        final int a = a(context);
        if (a == 0) {
            return;
        }
        final Intent a2 = a(a);
        Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
        if (a2 == null) {
            throw new GooglePlayServicesNotAvailableException(a);
        }
        throw new GooglePlayServicesRepairableException(a, "Google Play Services not available", a2);
    }
    
    public static boolean b(final int n) {
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
    
    public static boolean b(final PackageManager packageManager) {
        return a(packageManager) || !a();
    }
    
    private static boolean b(final Resources resources) {
        final Configuration configuration = resources.getConfiguration();
        final boolean b = bj.b();
        boolean b2 = false;
        if (b) {
            final int n = 0xF & configuration.screenLayout;
            b2 = false;
            if (n <= 3) {
                final int smallestScreenWidthDp = configuration.smallestScreenWidthDp;
                b2 = false;
                if (smallestScreenWidthDp >= 600) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static Context c(final Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static boolean c(final Context context, final int n) {
        if (n == 1) {
            final PackageManager packageManager = context.getPackageManager();
            try {
                if (packageManager.getApplicationInfo("com.google.android.gms", 8192).enabled) {
                    return true;
                }
            }
            catch (PackageManager$NameNotFoundException ex) {}
        }
        return false;
    }
    
    private static void d(final Context context) {
        int int1;
        while (true) {
            try {
                final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                final Bundle metaData = applicationInfo.metaData;
                if (metaData == null) {
                    throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                }
                int1 = metaData.getInt("com.google.android.gms.version");
                if (int1 == 6587000) {
                    return;
                }
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.wtf("GooglePlayServicesUtil", "This should never happen.", (Throwable)ex);
                final ApplicationInfo applicationInfo = null;
                continue;
            }
            break;
        }
        throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found " + int1 + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
    }
}
