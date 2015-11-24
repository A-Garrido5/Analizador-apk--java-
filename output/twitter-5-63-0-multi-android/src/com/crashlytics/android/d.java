// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.at;
import com.crashlytics.android.internal.cj;
import java.util.Collections;
import java.util.Map;
import com.crashlytics.android.internal.bg;
import android.app.Activity;
import com.crashlytics.android.internal.bh;
import com.crashlytics.android.internal.af;
import com.crashlytics.android.internal.c;
import com.crashlytics.android.internal.ci;
import com.crashlytics.android.internal.a;
import android.content.Context;
import com.crashlytics.android.internal.cl;
import com.crashlytics.android.internal.ai;
import com.crashlytics.android.internal.bd;
import com.crashlytics.android.internal.bo;
import java.util.concurrent.ConcurrentHashMap;
import com.crashlytics.android.internal.bu;
import android.content.ContextWrapper;
import com.crashlytics.android.internal.ck;

public final class d extends ck
{
    private static ContextWrapper j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static boolean r;
    private static t s;
    private static bu t;
    private static float u;
    private static d v;
    private final long a;
    private final ConcurrentHashMap b;
    private e c;
    private bc d;
    private bo e;
    private String f;
    private String g;
    private String h;
    private String i;
    
    static {
        d.r = false;
        d.s = null;
    }
    
    public d() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.b = new ConcurrentHashMap();
        this.a = System.currentTimeMillis();
    }
    
    private ak a(final ac ac) {
        return new ak(com.crashlytics.android.d.p, com.crashlytics.android.d.k, com.crashlytics.android.d.o, com.crashlytics.android.d.n, bd.a(new String[] { this.i }), com.crashlytics.android.d.m, ai.a(com.crashlytics.android.d.l).a(), com.crashlytics.android.d.q, "0", ac);
    }
    
    public static d a() {
        synchronized (d.class) {
            d v = (d)cl.a().a(d.class);
            if (v == null) {
                if (d.v == null) {
                    d.v = new d();
                }
                v = d.v;
            }
            return v;
        }
    }
    
    private static void a(final int n, final String s, final String s2) {
        final d a = a();
        if (a == null || a.d == null) {
            cl.a().b().a(s, "Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging messages.", null);
            return;
        }
        a.d.a(System.currentTimeMillis() - a.a, bd.b(n) + "/" + s + " " + s2);
    }
    
    public static void a(final Context context) {
        a(context, 1.0f);
    }
    
    public static void a(final Context context, final float u) {
        d.u = u;
        if (!bd.d(context)) {
            cl.a().a(new a());
        }
        cl.a(context, a(), new c());
    }
    
    public static void a(final t s) {
        if (d.s != s) {
            d.s = s;
            if (d.t != null) {
                if (s != null) {
                    d.t.a(new ar(s));
                    return;
                }
                d.t.a(null);
            }
        }
    }
    
    static void a(final String s) {
        final c c = (c)cl.a().a(c.class);
        if (c != null) {
            c.a(new bh(s));
        }
    }
    
    private void a(final String p0, final Context p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore          4
        //     3: aload_0        
        //     4: monitorenter   
        //     5: getstatic       com/crashlytics/android/d.j:Landroid/content/ContextWrapper;
        //     8: ifnull          29
        //    11: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    14: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    17: ldc             "Crashlytics"
        //    19: ldc             "Crashlytics already started, ignoring re-initialization attempt."
        //    21: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    26: aload_0        
        //    27: monitorexit    
        //    28: return         
        //    29: aload_1        
        //    30: putstatic       com/crashlytics/android/d.p:Ljava/lang/String;
        //    33: new             Landroid/content/ContextWrapper;
        //    36: dup            
        //    37: aload_2        
        //    38: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //    41: invokespecial   android/content/ContextWrapper.<init>:(Landroid/content/Context;)V
        //    44: putstatic       com/crashlytics/android/d.j:Landroid/content/ContextWrapper;
        //    47: new             Lcom/crashlytics/android/internal/bu;
        //    50: dup            
        //    51: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    54: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    57: invokespecial   com/crashlytics/android/internal/bu.<init>:(Lcom/crashlytics/android/internal/ci;)V
        //    60: putstatic       com/crashlytics/android/d.t:Lcom/crashlytics/android/internal/bu;
        //    63: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    66: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    69: ldc             "Crashlytics"
        //    71: new             Ljava/lang/StringBuilder;
        //    74: dup            
        //    75: ldc             "Initializing Crashlytics "
        //    77: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    80: invokestatic    com/crashlytics/android/d.c:()Ljava/lang/String;
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokeinterface com/crashlytics/android/internal/ci.b:(Ljava/lang/String;Ljava/lang/String;)V
        //    94: getstatic       com/crashlytics/android/d.j:Landroid/content/ContextWrapper;
        //    97: invokevirtual   android/content/ContextWrapper.getPackageName:()Ljava/lang/String;
        //   100: putstatic       com/crashlytics/android/d.k:Ljava/lang/String;
        //   103: getstatic       com/crashlytics/android/d.j:Landroid/content/ContextWrapper;
        //   106: invokevirtual   android/content/ContextWrapper.getPackageManager:()Landroid/content/pm/PackageManager;
        //   109: astore          11
        //   111: aload           11
        //   113: getstatic       com/crashlytics/android/d.k:Ljava/lang/String;
        //   116: invokevirtual   android/content/pm/PackageManager.getInstallerPackageName:(Ljava/lang/String;)Ljava/lang/String;
        //   119: putstatic       com/crashlytics/android/d.l:Ljava/lang/String;
        //   122: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   125: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   128: ldc             "Crashlytics"
        //   130: new             Ljava/lang/StringBuilder;
        //   133: dup            
        //   134: ldc             "Installer package name is: "
        //   136: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   139: getstatic       com/crashlytics/android/d.l:Ljava/lang/String;
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   148: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   153: aload           11
        //   155: getstatic       com/crashlytics/android/d.k:Ljava/lang/String;
        //   158: iconst_0       
        //   159: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   162: astore          12
        //   164: aload           12
        //   166: getfield        android/content/pm/PackageInfo.versionCode:I
        //   169: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   172: putstatic       com/crashlytics/android/d.n:Ljava/lang/String;
        //   175: aload           12
        //   177: getfield        android/content/pm/PackageInfo.versionName:Ljava/lang/String;
        //   180: ifnonnull       493
        //   183: ldc_w           "0.0"
        //   186: astore          13
        //   188: aload           13
        //   190: putstatic       com/crashlytics/android/d.o:Ljava/lang/String;
        //   193: aload_2        
        //   194: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   197: aload_2        
        //   198: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //   201: invokevirtual   android/content/pm/PackageManager.getApplicationLabel:(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
        //   204: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //   209: putstatic       com/crashlytics/android/d.m:Ljava/lang/String;
        //   212: aload_2        
        //   213: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //   216: getfield        android/content/pm/ApplicationInfo.targetSdkVersion:I
        //   219: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   222: putstatic       com/crashlytics/android/d.q:Ljava/lang/String;
        //   225: aload_0        
        //   226: aload_2        
        //   227: invokestatic    com/crashlytics/android/internal/bd.i:(Landroid/content/Context;)Ljava/lang/String;
        //   230: putfield        com/crashlytics/android/d.i:Ljava/lang/String;
        //   233: aload_0        
        //   234: new             Lcom/crashlytics/android/internal/bo;
        //   237: dup            
        //   238: getstatic       com/crashlytics/android/d.j:Landroid/content/ContextWrapper;
        //   241: invokespecial   com/crashlytics/android/internal/bo.<init>:(Landroid/content/Context;)V
        //   244: putfield        com/crashlytics/android/d.e:Lcom/crashlytics/android/internal/bo;
        //   247: aload_0        
        //   248: getfield        com/crashlytics/android/d.e:Lcom/crashlytics/android/internal/bo;
        //   251: invokevirtual   com/crashlytics/android/internal/bo.h:()Ljava/lang/String;
        //   254: pop            
        //   255: new             Lcom/crashlytics/android/al;
        //   258: dup            
        //   259: aload_0        
        //   260: getfield        com/crashlytics/android/d.i:Ljava/lang/String;
        //   263: getstatic       com/crashlytics/android/d.j:Landroid/content/ContextWrapper;
        //   266: ldc_w           "com.crashlytics.RequireBuildId"
        //   269: iconst_1       
        //   270: invokestatic    com/crashlytics/android/internal/bd.a:(Landroid/content/Context;Ljava/lang/String;Z)Z
        //   273: invokespecial   com/crashlytics/android/al.<init>:(Ljava/lang/String;Z)V
        //   276: aload_1        
        //   277: getstatic       com/crashlytics/android/d.k:Ljava/lang/String;
        //   280: invokevirtual   com/crashlytics/android/al.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   283: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   286: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   289: ldc             "Crashlytics"
        //   291: ldc_w           "Installing exception handler..."
        //   294: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   299: aload_0        
        //   300: new             Lcom/crashlytics/android/bc;
        //   303: dup            
        //   304: invokestatic    java/lang/Thread.getDefaultUncaughtExceptionHandler:()Ljava/lang/Thread$UncaughtExceptionHandler;
        //   307: aload_0        
        //   308: getfield        com/crashlytics/android/d.c:Lcom/crashlytics/android/e;
        //   311: aload_0        
        //   312: getfield        com/crashlytics/android/d.i:Ljava/lang/String;
        //   315: invokespecial   com/crashlytics/android/bc.<init>:(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/crashlytics/android/e;Ljava/lang/String;)V
        //   318: putfield        com/crashlytics/android/d.d:Lcom/crashlytics/android/bc;
        //   321: aload_0        
        //   322: getfield        com/crashlytics/android/d.d:Lcom/crashlytics/android/bc;
        //   325: invokevirtual   com/crashlytics/android/bc.f:()Z
        //   328: istore          4
        //   330: aload_0        
        //   331: getfield        com/crashlytics/android/d.d:Lcom/crashlytics/android/bc;
        //   334: invokevirtual   com/crashlytics/android/bc.d:()V
        //   337: aload_0        
        //   338: getfield        com/crashlytics/android/d.d:Lcom/crashlytics/android/bc;
        //   341: invokevirtual   com/crashlytics/android/bc.c:()V
        //   344: aload_0        
        //   345: getfield        com/crashlytics/android/d.d:Lcom/crashlytics/android/bc;
        //   348: invokevirtual   com/crashlytics/android/bc.h:()V
        //   351: aload_0        
        //   352: getfield        com/crashlytics/android/d.d:Lcom/crashlytics/android/bc;
        //   355: invokestatic    java/lang/Thread.setDefaultUncaughtExceptionHandler:(Ljava/lang/Thread$UncaughtExceptionHandler;)V
        //   358: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   361: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   364: ldc             "Crashlytics"
        //   366: ldc_w           "Successfully installed exception handler."
        //   369: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   374: new             Ljava/util/concurrent/CountDownLatch;
        //   377: dup            
        //   378: iconst_1       
        //   379: invokespecial   java/util/concurrent/CountDownLatch.<init>:(I)V
        //   382: astore          9
        //   384: new             Ljava/lang/Thread;
        //   387: dup            
        //   388: new             Lcom/crashlytics/android/ba;
        //   391: dup            
        //   392: aload_0        
        //   393: aload_2        
        //   394: fload_3        
        //   395: aload           9
        //   397: invokespecial   com/crashlytics/android/ba.<init>:(Lcom/crashlytics/android/d;Landroid/content/Context;FLjava/util/concurrent/CountDownLatch;)V
        //   400: ldc_w           "Crashlytics Initializer"
        //   403: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;Ljava/lang/String;)V
        //   406: invokevirtual   java/lang/Thread.start:()V
        //   409: iload           4
        //   411: ifeq            26
        //   414: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   417: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   420: ldc             "Crashlytics"
        //   422: ldc_w           "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."
        //   425: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   430: aload           9
        //   432: ldc2_w          4000
        //   435: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   438: invokevirtual   java/util/concurrent/CountDownLatch.await:(JLjava/util/concurrent/TimeUnit;)Z
        //   441: ifne            26
        //   444: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   447: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   450: ldc             "Crashlytics"
        //   452: ldc_w           "Crashlytics initialization was not completed in the allotted time."
        //   455: invokeinterface com/crashlytics/android/internal/ci.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   460: goto            26
        //   463: astore          10
        //   465: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   468: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   471: ldc             "Crashlytics"
        //   473: ldc_w           "Crashlytics was interrupted during initialization."
        //   476: aload           10
        //   478: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   483: goto            26
        //   486: astore          5
        //   488: aload_0        
        //   489: monitorexit    
        //   490: aload           5
        //   492: athrow         
        //   493: aload           12
        //   495: getfield        android/content/pm/PackageInfo.versionName:Ljava/lang/String;
        //   498: astore          13
        //   500: goto            188
        //   503: astore          6
        //   505: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   508: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   511: ldc             "Crashlytics"
        //   513: ldc_w           "Error setting up app properties"
        //   516: aload           6
        //   518: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   523: goto            233
        //   526: astore          8
        //   528: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   531: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   534: ldc             "Crashlytics"
        //   536: ldc_w           "There was a problem installing the exception handler."
        //   539: aload           8
        //   541: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   546: goto            374
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  5      26     486    493    Any
        //  29     94     486    493    Any
        //  94     183    503    526    Ljava/lang/Exception;
        //  94     183    486    493    Any
        //  188    233    503    526    Ljava/lang/Exception;
        //  188    233    486    493    Any
        //  233    283    486    493    Any
        //  283    374    526    549    Ljava/lang/Exception;
        //  283    374    486    493    Any
        //  374    409    486    493    Any
        //  414    430    486    493    Any
        //  430    460    463    486    Ljava/lang/InterruptedException;
        //  430    460    486    493    Any
        //  465    483    486    493    Any
        //  493    500    503    526    Ljava/lang/Exception;
        //  493    500    486    493    Any
        //  505    523    486    493    Any
        //  528    546    486    493    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 218, Size: 218
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
    
    public static void a(final String s, final String s2) {
        if (s == null) {
            if (d.j != null && bd.f((Context)d.j)) {
                throw new IllegalArgumentException("Custom attribute key cannot be null.");
            }
            cl.a().b().a("Crashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
        else {
            final String e = e(s);
            if (a().b.size() < 64 || a().b.containsKey(e)) {
                String e2;
                if (s2 == null) {
                    e2 = "";
                }
                else {
                    e2 = e(s2);
                }
                a().b.put(e, e2);
                return;
            }
            cl.a().b().a("Crashlytics", "Exceeded maximum number of custom attributes (64)");
        }
    }
    
    public static void a(final String s, final boolean b) {
        a(s, Boolean.toString(b));
    }
    
    public static void a(final Throwable t) {
        final d a = a();
        if (a == null || a.d == null) {
            cl.a().b().a("Crashlytics", "Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging exceptions.", null);
            return;
        }
        if (t == null) {
            cl.a().b().a(5, "Crashlytics", "Crashlytics is ignoring a request to log a null exception.");
            return;
        }
        a.d.a(Thread.currentThread(), t);
    }
    
    static void a(final boolean b) {
        bd.a().edit().putBoolean("always_send_reports_opt_in", true).commit();
    }
    
    static void b(final String s) {
        final c c = (c)cl.a().a(c.class);
        if (c != null) {
            c.a(new bg(s));
        }
    }
    
    private boolean b(final Context p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: aload_0        
        //     3: invokevirtual   com/crashlytics/android/d.w:()Landroid/content/Context;
        //     6: invokestatic    com/crashlytics/android/internal/bd.g:(Landroid/content/Context;)Ljava/lang/String;
        //     9: astore          4
        //    11: invokestatic    com/crashlytics/android/internal/at.a:()Lcom/crashlytics/android/internal/at;
        //    14: aload_1        
        //    15: getstatic       com/crashlytics/android/d.t:Lcom/crashlytics/android/internal/bu;
        //    18: getstatic       com/crashlytics/android/d.n:Ljava/lang/String;
        //    21: getstatic       com/crashlytics/android/d.o:Ljava/lang/String;
        //    24: invokestatic    com/crashlytics/android/d.l:()Ljava/lang/String;
        //    27: invokevirtual   com/crashlytics/android/internal/at.a:(Landroid/content/Context;Lcom/crashlytics/android/internal/bu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/internal/at;
        //    30: invokevirtual   com/crashlytics/android/internal/at.c:()Z
        //    33: pop            
        //    34: invokestatic    com/crashlytics/android/internal/at.a:()Lcom/crashlytics/android/internal/at;
        //    37: invokevirtual   com/crashlytics/android/internal/at.b:()Lcom/crashlytics/android/internal/az;
        //    40: astore          21
        //    42: aload           21
        //    44: astore          6
        //    46: aload           6
        //    48: ifnull          436
        //    51: aload           6
        //    53: getfield        com/crashlytics/android/internal/az.a:Lcom/crashlytics/android/internal/am;
        //    56: astore          14
        //    58: ldc_w           "new"
        //    61: aload           14
        //    63: getfield        com/crashlytics/android/internal/am.a:Ljava/lang/String;
        //    66: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    69: ifeq            258
        //    72: aload_0        
        //    73: aload_0        
        //    74: invokevirtual   com/crashlytics/android/d.w:()Landroid/content/Context;
        //    77: aload           4
        //    79: invokestatic    com/crashlytics/android/ac.a:(Landroid/content/Context;Ljava/lang/String;)Lcom/crashlytics/android/ac;
        //    82: invokespecial   com/crashlytics/android/d.a:(Lcom/crashlytics/android/ac;)Lcom/crashlytics/android/ak;
        //    85: astore          18
        //    87: new             Lcom/crashlytics/android/x;
        //    90: dup            
        //    91: invokestatic    com/crashlytics/android/d.l:()Ljava/lang/String;
        //    94: aload           14
        //    96: getfield        com/crashlytics/android/internal/am.b:Ljava/lang/String;
        //    99: getstatic       com/crashlytics/android/d.t:Lcom/crashlytics/android/internal/bu;
        //   102: invokespecial   com/crashlytics/android/x.<init>:(Ljava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/internal/bu;)V
        //   105: aload           18
        //   107: invokevirtual   com/crashlytics/android/x.a:(Lcom/crashlytics/android/ak;)Z
        //   110: ifeq            235
        //   113: invokestatic    com/crashlytics/android/internal/at.a:()Lcom/crashlytics/android/internal/at;
        //   116: invokevirtual   com/crashlytics/android/internal/at.d:()Z
        //   119: istore          19
        //   121: iload           19
        //   123: istore          15
        //   125: iload           15
        //   127: istore          8
        //   129: aload           6
        //   131: getfield        com/crashlytics/android/internal/az.d:Lcom/crashlytics/android/internal/aq;
        //   134: getfield        com/crashlytics/android/internal/aq.b:Z
        //   137: istore          7
        //   139: iload           8
        //   141: ifeq            430
        //   144: iload           7
        //   146: ifeq            430
        //   149: iconst_1       
        //   150: aload_0        
        //   151: getfield        com/crashlytics/android/d.d:Lcom/crashlytics/android/bc;
        //   154: invokevirtual   com/crashlytics/android/bc.b:()Z
        //   157: iand           
        //   158: istore_3       
        //   159: aload_0        
        //   160: invokevirtual   com/crashlytics/android/d.t:()Lcom/crashlytics/android/z;
        //   163: astore          11
        //   165: iconst_0       
        //   166: istore          9
        //   168: aload           11
        //   170: ifnull          186
        //   173: new             Lcom/crashlytics/android/af;
        //   176: dup            
        //   177: aload           11
        //   179: invokespecial   com/crashlytics/android/af.<init>:(Lcom/crashlytics/android/z;)V
        //   182: fload_2        
        //   183: invokevirtual   com/crashlytics/android/af.a:(F)V
        //   186: iload           9
        //   188: ifeq            207
        //   191: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   194: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   197: ldc             "Crashlytics"
        //   199: ldc_w           "Crash reporting disabled."
        //   202: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   207: iload_3        
        //   208: ireturn        
        //   209: astore          5
        //   211: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   214: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   217: ldc             "Crashlytics"
        //   219: ldc_w           "Error dealing with settings"
        //   222: aload           5
        //   224: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   229: aconst_null    
        //   230: astore          6
        //   232: goto            46
        //   235: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   238: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   241: ldc             "Crashlytics"
        //   243: ldc_w           "Failed to create app with Crashlytics service."
        //   246: aconst_null    
        //   247: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   252: iconst_0       
        //   253: istore          15
        //   255: goto            125
        //   258: ldc_w           "configured"
        //   261: aload           14
        //   263: getfield        com/crashlytics/android/internal/am.a:Ljava/lang/String;
        //   266: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   269: ifeq            283
        //   272: invokestatic    com/crashlytics/android/internal/at.a:()Lcom/crashlytics/android/internal/at;
        //   275: invokevirtual   com/crashlytics/android/internal/at.d:()Z
        //   278: istore          15
        //   280: goto            125
        //   283: aload           14
        //   285: getfield        com/crashlytics/android/internal/am.d:Z
        //   288: ifeq            346
        //   291: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   294: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   297: ldc             "Crashlytics"
        //   299: ldc_w           "Server says an update is required - forcing a full App update."
        //   302: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   307: aload_0        
        //   308: aload_0        
        //   309: invokevirtual   com/crashlytics/android/d.w:()Landroid/content/Context;
        //   312: aload           4
        //   314: invokestatic    com/crashlytics/android/ac.a:(Landroid/content/Context;Ljava/lang/String;)Lcom/crashlytics/android/ac;
        //   317: invokespecial   com/crashlytics/android/d.a:(Lcom/crashlytics/android/ac;)Lcom/crashlytics/android/ak;
        //   320: astore          16
        //   322: new             Lcom/crashlytics/android/ai;
        //   325: dup            
        //   326: invokestatic    com/crashlytics/android/d.l:()Ljava/lang/String;
        //   329: aload           14
        //   331: getfield        com/crashlytics/android/internal/am.b:Ljava/lang/String;
        //   334: getstatic       com/crashlytics/android/d.t:Lcom/crashlytics/android/internal/bu;
        //   337: invokespecial   com/crashlytics/android/ai.<init>:(Ljava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/internal/bu;)V
        //   340: aload           16
        //   342: invokevirtual   com/crashlytics/android/ai.a:(Lcom/crashlytics/android/ak;)Z
        //   345: pop            
        //   346: iload_3        
        //   347: istore          15
        //   349: goto            125
        //   352: astore          12
        //   354: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   357: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   360: ldc             "Crashlytics"
        //   362: ldc_w           "Error performing auto configuration."
        //   365: aload           12
        //   367: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   372: iconst_0       
        //   373: istore          8
        //   375: goto            129
        //   378: astore          13
        //   380: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   383: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   386: ldc             "Crashlytics"
        //   388: ldc_w           "Error getting collect reports setting."
        //   391: aload           13
        //   393: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   398: iconst_0       
        //   399: istore          7
        //   401: goto            139
        //   404: astore          10
        //   406: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   409: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   412: ldc             "Crashlytics"
        //   414: ldc_w           "Error sending crash report"
        //   417: aload           10
        //   419: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   424: iconst_0       
        //   425: istore          9
        //   427: goto            186
        //   430: iload_3        
        //   431: istore          9
        //   433: goto            186
        //   436: iconst_0       
        //   437: istore          7
        //   439: iconst_0       
        //   440: istore          8
        //   442: goto            139
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     42     209    235    Ljava/lang/Exception;
        //  51     121    352    378    Ljava/lang/Exception;
        //  129    139    378    404    Ljava/lang/Exception;
        //  149    165    404    430    Ljava/lang/Exception;
        //  173    186    404    430    Ljava/lang/Exception;
        //  235    252    352    378    Ljava/lang/Exception;
        //  258    280    352    378    Ljava/lang/Exception;
        //  283    346    352    378    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 184, Size: 184
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
    public static String c() {
        return a().f();
    }
    
    public static void c(final String s) {
        a(3, "Crashlytics", s);
    }
    
    public static void d(final String s) {
        a().h = e(s);
    }
    
    private static String e(String s) {
        if (s != null) {
            s = s.trim();
            if (s.length() > 1024) {
                s = s.substring(0, 1024);
            }
        }
        return s;
    }
    
    static String g() {
        return d.k;
    }
    
    static String h() {
        return d.l;
    }
    
    static String i() {
        return d.o;
    }
    
    static String j() {
        return d.n;
    }
    
    static String k() {
        return d.m;
    }
    
    static String l() {
        return bd.a((Context)d.j, "com.crashlytics.ApiEndpoint");
    }
    
    static boolean n() {
        return bd.a().getBoolean("always_send_reports_opt_in", false);
    }
    
    final Map b() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b);
    }
    
    final bo d() {
        return this.e;
    }
    
    @Override
    protected final void e() {
        final Context w = super.w();
        final String a = cj.a(w, false);
        if (a == null) {
            return;
        }
        try {
            this.a(a, w, com.crashlytics.android.d.u);
        }
        catch (CrashlyticsMissingDependencyException ex) {
            throw ex;
        }
        catch (Exception ex2) {
            cl.a().b().a("Crashlytics", "Crashlytics was not started due to an exception during initialization", ex2);
        }
    }
    
    public final String f() {
        return cl.a().f();
    }
    
    final boolean m() {
        return (boolean)at.a().a(new as(this), false);
    }
    
    final bc o() {
        return this.d;
    }
    
    final String p() {
        if (this.e.a()) {
            return this.f;
        }
        return null;
    }
    
    final String q() {
        if (this.e.a()) {
            return this.g;
        }
        return null;
    }
    
    final String r() {
        if (this.e.a()) {
            return this.h;
        }
        return null;
    }
    
    final boolean s() {
        return (boolean)at.a().a(new com.crashlytics.android.at(this), true);
    }
    
    final z t() {
        return (z)at.a().a(new au(this), null);
    }
    
    final com.crashlytics.android.internal.as u() {
        return (com.crashlytics.android.internal.as)at.a().a(new av(this), null);
    }
}
