// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gcm;

import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Handler;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.util.Set;
import com.twitter.library.platform.f;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Context;
import android.util.Log;

public final class b
{
    private static final boolean a;
    private static GCMBroadcastReceiver b;
    private static String c;
    
    static {
        a = Log.isLoggable("GCMRegistrar", 3);
    }
    
    static String a(final Context context, final String s) {
        final SharedPreferences n = n(context);
        final String string = n.getString("regId", "");
        final int m = m(context);
        if (com.google.android.gcm.b.a) {
            Log.v("GCMRegistrar", "Saving regId on app version " + m);
        }
        final SharedPreferences$Editor edit = n.edit();
        edit.putString("regId", s);
        edit.putInt("appVersion", m);
        edit.apply();
        return string;
    }
    
    static String a(final String... array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        final StringBuilder sb = new StringBuilder(array[0]);
        for (int i = 1; i < array.length; ++i) {
            sb.append(',').append(array[i]);
        }
        return sb.toString();
    }
    
    public static void a(final Context context) {
        if (!f.a(context)) {
            throw new UnsupportedOperationException("GooglePlayServices not enabled on this device.");
        }
    }
    
    static void a(final Context context, final int n) {
        final SharedPreferences$Editor edit = n(context).edit();
        edit.putInt("backoff_ms", n);
        edit.apply();
    }
    
    public static void a(final Context context, final long n) {
        final SharedPreferences$Editor edit = n(context).edit();
        edit.putLong("onServerLifeSpan", n);
        edit.apply();
    }
    
    private static void a(final Context context, final Set set, final String s) {
        final PackageManager packageManager = context.getPackageManager();
        final String packageName = context.getPackageName();
        final Intent intent = new Intent(s);
        intent.setPackage(packageName);
        final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 32);
        if (queryBroadcastReceivers.isEmpty()) {
            throw new IllegalStateException("No receivers for action " + s);
        }
        if (com.google.android.gcm.b.a) {
            Log.v("GCMRegistrar", "Found " + queryBroadcastReceivers.size() + " receivers for action " + s);
        }
        final Iterator<ResolveInfo> iterator = queryBroadcastReceivers.iterator();
        while (iterator.hasNext()) {
            final String name = iterator.next().activityInfo.name;
            if (!set.contains(name)) {
                throw new IllegalStateException("Receiver " + name + " is not set with permission " + "com.google.android.c2dm.permission.SEND");
            }
        }
    }
    
    public static void a(final Context context, final boolean b) {
        final SharedPreferences$Editor edit = n(context).edit();
        edit.putBoolean("onServer", b);
        final long n = j(context) + System.currentTimeMillis();
        if (b.a) {
            Log.v("GCMRegistrar", "Setting registeredOnServer status as " + b + " until " + new Timestamp(n));
        }
        edit.putLong("onServerExpirationTime", n);
        edit.apply();
    }
    
    public static void a(final Context context, final String... array) {
        k(context);
        b(context, array);
    }
    
    static void a(final String c) {
        if (com.google.android.gcm.b.a) {
            Log.v("GCMRegistrar", "Setting the name of retry receiver class to " + c);
        }
        com.google.android.gcm.b.c = c;
    }
    
    public static void b(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //     4: astore_1       
        //     5: aload_0        
        //     6: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //     9: astore_2       
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: aload_2        
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: ldc             ".permission.C2D_MESSAGE"
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    29: astore_3       
        //    30: aload_1        
        //    31: aload_3        
        //    32: sipush          4096
        //    35: invokevirtual   android/content/pm/PackageManager.getPermissionInfo:(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;
        //    38: pop            
        //    39: aload_1        
        //    40: aload_2        
        //    41: iconst_2       
        //    42: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    45: astore          7
        //    47: aload           7
        //    49: getfield        android/content/pm/PackageInfo.receivers:[Landroid/content/pm/ActivityInfo;
        //    52: astore          8
        //    54: aload           8
        //    56: ifnull          65
        //    59: aload           8
        //    61: arraylength    
        //    62: ifne            153
        //    65: new             Ljava/lang/IllegalStateException;
        //    68: dup            
        //    69: new             Ljava/lang/StringBuilder;
        //    72: dup            
        //    73: invokespecial   java/lang/StringBuilder.<init>:()V
        //    76: ldc_w           "No receiver for package "
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: aload_2        
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    92: athrow         
        //    93: astore          4
        //    95: new             Ljava/lang/IllegalStateException;
        //    98: dup            
        //    99: new             Ljava/lang/StringBuilder;
        //   102: dup            
        //   103: invokespecial   java/lang/StringBuilder.<init>:()V
        //   106: ldc_w           "Application does not define permission "
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: aload_3        
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   119: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   122: athrow         
        //   123: astore          6
        //   125: new             Ljava/lang/IllegalStateException;
        //   128: dup            
        //   129: new             Ljava/lang/StringBuilder;
        //   132: dup            
        //   133: invokespecial   java/lang/StringBuilder.<init>:()V
        //   136: ldc_w           "Could not get receivers for package "
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: aload_2        
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   149: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   152: athrow         
        //   153: getstatic       com/google/android/gcm/b.a:Z
        //   156: ifeq            197
        //   159: ldc             "GCMRegistrar"
        //   161: new             Ljava/lang/StringBuilder;
        //   164: dup            
        //   165: invokespecial   java/lang/StringBuilder.<init>:()V
        //   168: ldc_w           "number of receivers for "
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: aload_2        
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: ldc_w           ": "
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: aload           8
        //   186: arraylength    
        //   187: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   196: pop            
        //   197: new             Ljava/util/HashSet;
        //   200: dup            
        //   201: invokespecial   java/util/HashSet.<init>:()V
        //   204: astore          9
        //   206: aload           8
        //   208: arraylength    
        //   209: istore          10
        //   211: iconst_0       
        //   212: istore          11
        //   214: iload           11
        //   216: iload           10
        //   218: if_icmpge       260
        //   221: aload           8
        //   223: iload           11
        //   225: aaload         
        //   226: astore          12
        //   228: ldc             "com.google.android.c2dm.permission.SEND"
        //   230: aload           12
        //   232: getfield        android/content/pm/ActivityInfo.permission:Ljava/lang/String;
        //   235: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   238: ifeq            254
        //   241: aload           9
        //   243: aload           12
        //   245: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //   248: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   253: pop            
        //   254: iinc            11, 1
        //   257: goto            214
        //   260: aload           9
        //   262: invokeinterface java/util/Set.isEmpty:()Z
        //   267: ifeq            281
        //   270: new             Ljava/lang/IllegalStateException;
        //   273: dup            
        //   274: ldc_w           "No receiver allowed to receive com.google.android.c2dm.permission.SEND"
        //   277: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   280: athrow         
        //   281: aload_0        
        //   282: aload           9
        //   284: ldc_w           "com.google.android.c2dm.intent.RECEIVE"
        //   287: invokestatic    com/google/android/gcm/b.a:(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)V
        //   290: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  30     39     93     123    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  39     47     123    153    Landroid/content/pm/PackageManager$NameNotFoundException;
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
    
    static void b(final Context context, final String... array) {
        final String a = a(array);
        if (com.google.android.gcm.b.a) {
            Log.v("GCMRegistrar", "Registering app " + context.getPackageName() + " of senders " + a);
        }
        final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTRATION");
        intent.putExtra("sender", a);
        intent.setClass(context, com.google.android.gcm.a.a);
        final LocalBroadcastManager instance = LocalBroadcastManager.getInstance(context);
        if (com.google.android.gcm.b.b == null) {
            a(com.google.android.gcm.a.a.getName());
            e(context);
            instance.registerReceiver(com.google.android.gcm.b.b, new IntentFilter("com.google.android.c2dm.intent.REGISTRATION"));
        }
        instance.sendBroadcast(intent);
    }
    
    public static void c(final Context context) {
        synchronized (b.class) {
            if (com.google.android.gcm.b.b != null) {
                if (com.google.android.gcm.b.a) {
                    Log.v("GCMRegistrar", "Unregistering receiver");
                }
                context.unregisterReceiver((BroadcastReceiver)com.google.android.gcm.b.b);
                com.google.android.gcm.b.b = null;
            }
        }
    }
    
    static void d(final Context context) {
        if (com.google.android.gcm.b.a) {
            Log.v("GCMRegistrar", "Unregistering app " + context.getPackageName());
        }
        final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTRATION");
        intent.putExtra("unregistered", "1");
        intent.setClass(context, com.google.android.gcm.a.a);
        final LocalBroadcastManager instance = LocalBroadcastManager.getInstance(context);
        if (com.google.android.gcm.b.b == null) {
            a(com.google.android.gcm.a.a.getName());
            e(context);
            instance.registerReceiver(com.google.android.gcm.b.b, new IntentFilter("com.google.android.c2dm.intent.REGISTRATION"));
        }
        instance.sendBroadcast(intent);
    }
    
    static void e(final Context context) {
        synchronized (b.class) {
            if (com.google.android.gcm.b.b == null) {
                if (com.google.android.gcm.b.c == null) {
                    if (com.google.android.gcm.b.a) {
                        Log.e("GCMRegistrar", "internal error: retry receiver class not set yet");
                    }
                    com.google.android.gcm.b.b = new GCMBroadcastReceiver();
                }
                else {
                    try {
                        com.google.android.gcm.b.b = (GCMBroadcastReceiver)Class.forName(com.google.android.gcm.b.c).newInstance();
                    }
                    catch (Exception ex) {
                        if (com.google.android.gcm.b.a) {
                            Log.e("GCMRegistrar", "Could not create instance of " + com.google.android.gcm.b.c + ". Using " + GCMBroadcastReceiver.class.getName() + " directly.");
                        }
                        com.google.android.gcm.b.b = new GCMBroadcastReceiver();
                    }
                }
                final String packageName = context.getPackageName();
                final IntentFilter intentFilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
                intentFilter.addCategory(packageName);
                final String string = packageName + ".permission.C2D_MESSAGE";
                if (com.google.android.gcm.b.a) {
                    Log.v("GCMRegistrar", "Registering receiver");
                }
                context.registerReceiver((BroadcastReceiver)com.google.android.gcm.b.b, intentFilter, string, (Handler)null);
            }
        }
    }
    
    public static String f(final Context context) {
        final SharedPreferences n = n(context);
        String string = n.getString("regId", "");
        final int int1 = n.getInt("appVersion", Integer.MIN_VALUE);
        final int m = m(context);
        if (int1 != Integer.MIN_VALUE && int1 != m) {
            if (com.google.android.gcm.b.a) {
                Log.v("GCMRegistrar", "App version changed from " + int1 + " to " + m + "; resetting registration id");
            }
            h(context);
            string = "";
        }
        return string;
    }
    
    public static boolean g(final Context context) {
        return f(context).length() > 0;
    }
    
    static String h(final Context context) {
        return a(context, "");
    }
    
    public static boolean i(final Context context) {
        final SharedPreferences n = n(context);
        final boolean boolean1 = n.getBoolean("onServer", false);
        if (com.google.android.gcm.b.a) {
            Log.v("GCMRegistrar", "Is registered on server: " + boolean1);
        }
        if (boolean1) {
            final long long1 = n.getLong("onServerExpirationTime", -1L);
            if (System.currentTimeMillis() > long1) {
                if (com.google.android.gcm.b.a) {
                    Log.v("GCMRegistrar", "flag expired on: " + new Timestamp(long1));
                }
                return false;
            }
        }
        return boolean1;
    }
    
    public static long j(final Context context) {
        return n(context).getLong("onServerLifeSpan", 604800000L);
    }
    
    static void k(final Context context) {
        if (com.google.android.gcm.b.a) {
            Log.d("GCMRegistrar", "resetting backoff for " + context.getPackageName());
        }
        a(context, 3000);
    }
    
    static int l(final Context context) {
        return n(context).getInt("backoff_ms", 3000);
    }
    
    private static int m(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new RuntimeException("Coult not get package name: " + ex);
        }
    }
    
    private static SharedPreferences n(final Context context) {
        return context.getSharedPreferences("com.google.android.gcm", 0);
    }
}
