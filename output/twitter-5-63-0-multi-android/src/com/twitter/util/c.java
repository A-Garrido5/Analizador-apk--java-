// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.os.Vibrator;
import android.text.TextUtils;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.os.Looper;
import android.view.View;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.app.PendingIntent;
import android.app.AlarmManager;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;

public class c
{
    private static PackageInfo a;
    
    public static int a(final Context context) {
        return 1048576 * ((ActivityManager)context.getSystemService("activity")).getMemoryClass();
    }
    
    public static ActivityManager$RunningAppProcessInfo a(final Context context, final int n) {
        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses()) {
            if (activityManager$RunningAppProcessInfo.pid == n) {
                return activityManager$RunningAppProcessInfo;
            }
        }
        return null;
    }
    
    public static void a(final Context context, final long n) {
        ((AlarmManager)context.getSystemService("alarm")).set(1, n + System.currentTimeMillis(), PendingIntent.getActivity(context, 0, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 0));
        System.exit(0);
    }
    
    public static void a(final Context context, final String s, final String s2) {
        ((ClipboardManager)context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)s, (CharSequence)s2));
    }
    
    public static void a(final View view) {
        view.setSystemUiVisibility(5894);
    }
    
    public static void a(final View view, final int n) {
        view.setSystemUiVisibility(n | 0x100);
    }
    
    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
    
    public static boolean a(final Context context, final String s) {
        boolean enabled;
        try {
            final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(s, 0);
            enabled = applicationInfo.enabled;
            if (Build$VERSION.SDK_INT >= 17) {
                final int n = applicationInfo.flags & 0x800000;
                boolean b = false;
                if (n != 0) {
                    b = true;
                }
                return b & enabled;
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
        return enabled;
    }
    
    public static PackageInfo b(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/twitter/util/c;.class
        //     2: monitorenter   
        //     3: getstatic       com/twitter/util/c.a:Landroid/content/pm/PackageInfo;
        //     6: astore_2       
        //     7: aload_2        
        //     8: ifnonnull       26
        //    11: aload_0        
        //    12: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    15: aload_0        
        //    16: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    19: iconst_0       
        //    20: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    23: putstatic       com/twitter/util/c.a:Landroid/content/pm/PackageInfo;
        //    26: getstatic       com/twitter/util/c.a:Landroid/content/pm/PackageInfo;
        //    29: astore_3       
        //    30: ldc             Lcom/twitter/util/c;.class
        //    32: monitorexit    
        //    33: aload_3        
        //    34: areturn        
        //    35: astore_1       
        //    36: ldc             Lcom/twitter/util/c;.class
        //    38: monitorexit    
        //    39: aload_1        
        //    40: athrow         
        //    41: astore          4
        //    43: goto            26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  3      7      35     41     Any
        //  11     26     41     46     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  11     26     35     41     Any
        //  26     30     35     41     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    public static void b(final View view) {
        a(view, 0);
    }
    
    public static String c(final Context context) {
        final PackageInfo b = b(context);
        String versionName;
        if (b != null) {
            versionName = b.versionName;
        }
        else {
            versionName = null;
        }
        if (TextUtils.isEmpty((CharSequence)versionName)) {
            versionName = "0.0.0";
        }
        return versionName;
    }
    
    public static int d(final Context context) {
        final PackageInfo b = b(context);
        if (b != null) {
            return b.versionCode;
        }
        return 0;
    }
    
    public static boolean e(final Context context) {
        return ((Vibrator)context.getSystemService("vibrator")).hasVibrator();
    }
    
    public static boolean f(final Context context) {
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
    
    public static boolean g(final Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
