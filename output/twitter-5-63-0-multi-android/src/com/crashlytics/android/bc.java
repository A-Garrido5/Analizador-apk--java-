// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import java.util.UUID;
import java.util.TreeMap;
import java.io.Closeable;
import java.util.LinkedList;
import android.os.Environment;
import java.io.Writer;
import java.io.OutputStream;
import java.util.Date;
import java.util.Arrays;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Callable;
import java.io.IOException;
import com.crashlytics.android.internal.bt;
import java.util.Iterator;
import com.crashlytics.android.internal.ap;
import android.content.IntentFilter;
import java.util.Locale;
import com.crashlytics.android.internal.cl;
import com.crashlytics.android.internal.bi;
import java.util.Collections;
import java.util.List;
import com.crashlytics.android.internal.bp;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.concurrent.ExecutorService;
import android.content.BroadcastReceiver;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.Comparator;
import java.io.FilenameFilter;

final class bc implements UncaughtExceptionHandler
{
    static final FilenameFilter a;
    private static Comparator b;
    private static Comparator c;
    private static final Pattern d;
    private static final Map e;
    private static final am f;
    private final AtomicInteger g;
    private final AtomicBoolean h;
    private final int i;
    private final UncaughtExceptionHandler j;
    private final File k;
    private final File l;
    private final AtomicBoolean m;
    private final String n;
    private final BroadcastReceiver o;
    private final BroadcastReceiver p;
    private final am q;
    private final am r;
    private final ExecutorService s;
    private ActivityManager$RunningAppProcessInfo t;
    private bp u;
    private boolean v;
    private Thread[] w;
    private List x;
    private StackTraceElement[] y;
    
    static {
        a = new bd();
        bc.b = new k();
        bc.c = new m();
        new n();
        d = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
        e = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
        f = am.a("0");
    }
    
    public bc(final UncaughtExceptionHandler uncaughtExceptionHandler, final e e, final String s) {
        this(uncaughtExceptionHandler, e, bi.a("Crashlytics Exception Handler"), s);
    }
    
    private bc(final UncaughtExceptionHandler j, final e e, final ExecutorService s, final String s2) {
        this.g = new AtomicInteger(0);
        this.h = new AtomicBoolean(false);
        this.j = j;
        this.s = s;
        this.m = new AtomicBoolean(false);
        this.k = cl.a().i();
        this.l = new File(this.k, "initialization_marker");
        this.n = String.format(Locale.US, "Crashlytics Android SDK/%s", com.crashlytics.android.d.a().f());
        this.i = 8;
        cl.a().b().a("Crashlytics", "Checking for previous crash marker.");
        final File file = new File(cl.a().i(), "crash_marker");
    Label_0173:
        while (true) {
            if (!file.exists()) {
                break Label_0173;
            }
            file.delete();
            if (e == null) {
                break Label_0173;
            }
            while (true) {
                while (true) {
                    try {
                        e.a();
                        this.q = am.a(com.crashlytics.android.d.g());
                        if (s2 == null) {
                            final am a = null;
                            this.r = a;
                            this.p = new o(this);
                            final IntentFilter intentFilter = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
                            this.o = new p(this);
                            final IntentFilter intentFilter2 = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
                            com.crashlytics.android.d.a().w().registerReceiver(this.p, intentFilter);
                            com.crashlytics.android.d.a().w().registerReceiver(this.o, intentFilter2);
                            this.h.set(true);
                            return;
                        }
                    }
                    catch (Exception ex) {
                        cl.a().b().a("Crashlytics", "Exception thrown by CrashlyticsListener while notifying of previous crash.", ex);
                        continue Label_0173;
                    }
                    final am a = am.a(s2.replace("-", ""));
                    continue;
                }
            }
            break;
        }
    }
    
    private static int a(final float n, final int n2, final boolean b, final int n3, final long n4, final long n5) {
        return 0 + aq.b(1, n) + aq.f(2, n2) + aq.b(3, b) + aq.d(4, n3) + aq.b(5, n4) + aq.b(6, n5);
    }
    
    private int a(final int n, final am am, final am am2, final int n2, final long n3, final long n4, final boolean b, final Map map, final int n5, final am am3, final am am4) {
        final int n6 = 0 + aq.b(1, am) + aq.e(3, n);
        int b2;
        if (am2 == null) {
            b2 = 0;
        }
        else {
            b2 = aq.b(4, am2);
        }
        final int n7 = b2 + n6 + aq.d(5, n2) + aq.b(6, n3) + aq.b(7, n4) + aq.b(10, b);
        int n8;
        if (map != null) {
            final Iterator<Map.Entry<ap, V>> iterator = map.entrySet().iterator();
            n8 = n7;
            while (iterator.hasNext()) {
                final Map.Entry<ap, V> entry = iterator.next();
                final int a = a(entry.getKey(), (String)entry.getValue());
                n8 += a + (aq.a(11) + aq.c(a));
            }
        }
        else {
            n8 = n7;
        }
        final int n9 = n8 + aq.d(12, n5);
        int b3;
        if (am3 == null) {
            b3 = 0;
        }
        else {
            b3 = aq.b(13, am3);
        }
        final int n10 = n9 + b3;
        int b4;
        if (am4 == null) {
            b4 = 0;
        }
        else {
            b4 = aq.b(14, am4);
        }
        return b4 + n10;
    }
    
    private static int a(final ap ap, final String s) {
        return aq.e(1, ap.f) + aq.b(2, am.a(s));
    }
    
    private static int a(final StackTraceElement stackTraceElement, final boolean b) {
        int n;
        if (stackTraceElement.isNativeMethod()) {
            n = 0 + aq.b(1, (long)Math.max(stackTraceElement.getLineNumber(), 0));
        }
        else {
            n = 0 + aq.b(1, 0L);
        }
        int n2 = n + aq.b(2, am.a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            n2 += aq.b(3, am.a(stackTraceElement.getFileName()));
        }
        int n3;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            n3 = n2 + aq.b(4, (long)stackTraceElement.getLineNumber());
        }
        else {
            n3 = n2;
        }
        int n4;
        if (b) {
            n4 = 2;
        }
        else {
            n4 = 0;
        }
        return n3 + aq.d(5, n4);
    }
    
    private static int a(final String s, String s2) {
        final int b = aq.b(1, am.a(s));
        if (s2 == null) {
            s2 = "";
        }
        return b + aq.b(2, am.a(s2));
    }
    
    private int a(final Thread thread, final Throwable t, final Map map) {
        final int b = this.b(thread, t);
        final int n = 0 + (b + (aq.a(1) + aq.c(b)));
        int n2;
        if (map != null) {
            final Iterator<Map.Entry<String, V>> iterator = map.entrySet().iterator();
            n2 = n;
            while (iterator.hasNext()) {
                final Map.Entry<String, V> entry = iterator.next();
                final int a = a(entry.getKey(), (String)entry.getValue());
                n2 += a + (aq.a(2) + aq.c(a));
            }
        }
        else {
            n2 = n;
        }
        if (this.t != null) {
            n2 += aq.b(3, this.t.importance != 100);
        }
        return n2 + aq.d(4, com.crashlytics.android.d.a().w().getResources().getConfiguration().orientation);
    }
    
    private int a(final Thread thread, final StackTraceElement[] array, final int n, final boolean b) {
        int n2 = aq.b(1, am.a(thread.getName())) + aq.d(2, n);
        for (int length = array.length, i = 0; i < length; ++i) {
            final int a = a(array[i], b);
            n2 += a + (aq.a(3) + aq.c(a));
        }
        return n2;
    }
    
    private int a(final Throwable t, final int n) {
        int n2 = 0 + aq.b(1, am.a(t.getClass().getName()));
        final String localizedMessage = t.getLocalizedMessage();
        if (localizedMessage != null) {
            n2 += aq.b(3, am.a(localizedMessage));
        }
        final StackTraceElement[] stackTrace = t.getStackTrace();
        int n3;
        for (int length = stackTrace.length, i = 0; i < length; ++i, n2 = n3) {
            final int a = a(stackTrace[i], true);
            n3 = n2 + (a + (aq.a(4) + aq.c(a)));
        }
        Throwable t2 = t.getCause();
        if (t2 != null) {
            int n4 = 0;
            if (n >= 8) {
                while (t2 != null) {
                    t2 = t2.getCause();
                    ++n4;
                }
                return n2 + aq.d(7, n4);
            }
            final int a2 = this.a(t2, n + 1);
            n2 += a2 + (aq.a(6) + aq.c(a2));
        }
        return n2;
    }
    
    private am a(final bp bp) {
        if (bp == null) {
            return null;
        }
        final int[] array = { 0 };
        final byte[] array2 = new byte[bp.a()];
        try {
            bp.a(new bf(this, array2, array));
            return am.a(array2, 0, array[0]);
        }
        catch (IOException ex) {
            cl.a().b().a("Crashlytics", "A problem occurred while reading the Crashlytics log file.", ex);
            return am.a(array2, 0, array[0]);
        }
    }
    
    private Object a(final Callable callable) {
        try {
            return this.s.submit((Callable<Object>)callable).get();
        }
        catch (RejectedExecutionException ex2) {
            cl.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        catch (Exception ex) {
            cl.a().b().a("Crashlytics", "Failed to execute task.", ex);
            return null;
        }
    }
    
    private static String a(final File file) {
        return file.getName().substring(0, 35);
    }
    
    private Future a(final Runnable runnable) {
        try {
            return this.s.submit(new j(this, runnable));
        }
        catch (RejectedExecutionException ex) {
            cl.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }
    
    private static void a(final ao ao) {
        if (ao == null) {
            return;
        }
        try {
            ao.a();
        }
        catch (IOException ex) {
            cl.a().b().a("Crashlytics", "Error closing session file stream in the presence of an exception", ex);
        }
    }
    
    private void a(final aq aq, final int n, final StackTraceElement stackTraceElement, final boolean b) {
        int n2 = 4;
        aq.g(n, 2);
        aq.b(a(stackTraceElement, b));
        if (stackTraceElement.isNativeMethod()) {
            aq.a(1, (long)Math.max(stackTraceElement.getLineNumber(), 0));
        }
        else {
            aq.a(1, 0L);
        }
        aq.a(2, am.a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            aq.a(3, am.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            aq.a(n2, (long)stackTraceElement.getLineNumber());
        }
        if (!b) {
            n2 = 0;
        }
        aq.a(5, n2);
    }
    
    private static void a(final aq p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   java/io/File.exists:()Z
        //     4: ifeq            90
        //     7: aload_1        
        //     8: invokevirtual   java/io/File.length:()J
        //    11: l2i            
        //    12: newarray        B
        //    14: astore_2       
        //    15: new             Ljava/io/FileInputStream;
        //    18: dup            
        //    19: aload_1        
        //    20: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    23: astore_3       
        //    24: iconst_0       
        //    25: istore          4
        //    27: iload           4
        //    29: aload_2        
        //    30: arraylength    
        //    31: if_icmpge       63
        //    34: aload_3        
        //    35: aload_2        
        //    36: iload           4
        //    38: aload_2        
        //    39: arraylength    
        //    40: iload           4
        //    42: isub           
        //    43: invokevirtual   java/io/FileInputStream.read:([BII)I
        //    46: istore          6
        //    48: iload           6
        //    50: iflt            63
        //    53: iload           4
        //    55: iload           6
        //    57: iadd           
        //    58: istore          4
        //    60: goto            27
        //    63: aload_3        
        //    64: ldc_w           "Failed to close file input stream."
        //    67: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    70: aload_0        
        //    71: aload_2        
        //    72: invokevirtual   com/crashlytics/android/aq.a:([B)V
        //    75: return         
        //    76: astore          5
        //    78: aconst_null    
        //    79: astore_3       
        //    80: aload_3        
        //    81: ldc_w           "Failed to close file input stream."
        //    84: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    87: aload           5
        //    89: athrow         
        //    90: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    93: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    96: ldc             "Crashlytics"
        //    98: new             Ljava/lang/StringBuilder;
        //   101: dup            
        //   102: ldc_w           "Tried to include a file that doesn't exist: "
        //   105: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   108: aload_1        
        //   109: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   118: aconst_null    
        //   119: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   124: return         
        //   125: astore          5
        //   127: goto            80
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  15     24     76     80     Any
        //  27     48     125    130    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    private void a(final aq aq, final String s) {
        for (final String s2 : new String[] { "SessionUser", "SessionApp", "SessionOS", "SessionDevice" }) {
            final File[] a = this.a(new v(s + s2));
            if (a.length == 0) {
                cl.a().b().a("Crashlytics", "Can't find " + s2 + " data for session ID " + s, null);
            }
            else {
                cl.a().b().a("Crashlytics", "Collecting " + s2 + " data for session ID " + s);
                a(aq, a[0]);
            }
        }
    }
    
    private void a(final aq aq, final Thread thread, final Throwable t) {
        aq.g(1, 2);
        aq.b(this.b(thread, t));
        this.a(aq, thread, this.y, 4, true);
        for (int length = this.w.length, i = 0; i < length; ++i) {
            this.a(aq, this.w[i], (StackTraceElement[])this.x.get(i), 0, false);
        }
        this.a(aq, t, 1, 2);
        aq.g(3, 2);
        aq.b(s());
        aq.a(1, bc.f);
        aq.a(2, bc.f);
        aq.a(3, 0L);
        aq.g(4, 2);
        aq.b(this.r());
        aq.a(1, 0L);
        aq.a(2, 0L);
        aq.a(3, this.q);
        if (this.r != null) {
            aq.a(4, this.r);
        }
    }
    
    private void a(final aq aq, final Thread thread, final StackTraceElement[] array, final int n, final boolean b) {
        aq.g(1, 2);
        aq.b(this.a(thread, array, n, b));
        aq.a(1, am.a(thread.getName()));
        aq.a(2, n);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.a(aq, 3, array[i], b);
        }
    }
    
    private void a(final aq aq, final Throwable t, final int n, final int n2) {
        aq.g(n2, 2);
        aq.b(this.a(t, 1));
        aq.a(1, am.a(t.getClass().getName()));
        final String localizedMessage = t.getLocalizedMessage();
        if (localizedMessage != null) {
            aq.a(3, am.a(localizedMessage));
        }
        final StackTraceElement[] stackTrace = t.getStackTrace();
        for (int length = stackTrace.length, i = 0; i < length; ++i) {
            this.a(aq, 4, stackTrace[i], true);
        }
        Throwable t2 = t.getCause();
        if (t2 != null) {
            int n3 = 0;
            if (n >= 8) {
                while (t2 != null) {
                    t2 = t2.getCause();
                    ++n3;
                }
                aq.a(7, n3);
                return;
            }
            this.a(aq, t2, n + 1, 6);
        }
    }
    
    private void a(final aq aq, final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            aq.g(2, 2);
            aq.b(a(entry.getKey(), (String)entry.getValue()));
            aq.a(1, am.a(entry.getKey()));
            String s = (String)entry.getValue();
            if (s == null) {
                s = "";
            }
            aq.a(2, am.a(s));
        }
    }
    
    private void a(final aq aq, final File[] array, final String s) {
        Arrays.sort(array, com.crashlytics.android.internal.bd.a);
        final int length = array.length;
        int i = 0;
    Label_0085_Outer:
        while (i < length) {
            final File file = array[i];
            while (true) {
                try {
                    cl.a().b().a("Crashlytics", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", s, file.getName()));
                    a(aq, file);
                    ++i;
                    continue Label_0085_Outer;
                }
                catch (Exception ex) {
                    cl.a().b().a("Crashlytics", "Error writting non-fatal to session.", ex);
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    static void a(final bp bp, final int n, final long n2, final String s) {
        if (bp != null) {
            while (true) {
                Label_0170: {
                    if (s != null) {
                        break Label_0170;
                    }
                    String string = "null";
                    try {
                        if (string.length() > 16384) {
                            string = "..." + string.substring(-16384 + string.length());
                        }
                        bp.a(String.format(Locale.US, "%d %s%n", n2, string.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes("UTF-8"));
                        while (!bp.b() && bp.a() > 65536) {
                            bp.c();
                        }
                        return;
                    }
                    catch (IOException ex) {
                        cl.a().b().a("Crashlytics", "There was a problem writing to the Crashlytics log.", ex);
                        return;
                    }
                }
                String string = s;
                continue;
            }
        }
    }
    
    private void a(final String s) {
        final File[] a = this.a(new w(s));
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].delete();
        }
    }
    
    private void a(final String s, final int n) {
        ak.a(this.k, new v(s + "SessionEvent"), n, bc.c);
    }
    
    private void a(final Throwable p0, final OutputStream p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: ifnull          25
        //     4: new             Ljava/io/PrintWriter;
        //     7: dup            
        //     8: aload_2        
        //     9: invokespecial   java/io/PrintWriter.<init>:(Ljava/io/OutputStream;)V
        //    12: astore_3       
        //    13: aload_1        
        //    14: aload_3        
        //    15: invokestatic    com/crashlytics/android/bc.a:(Ljava/lang/Throwable;Ljava/io/Writer;)V
        //    18: aload_3        
        //    19: ldc_w           "Failed to close stack trace writer."
        //    22: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    25: return         
        //    26: astore          4
        //    28: aconst_null    
        //    29: astore_3       
        //    30: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    33: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    36: ldc             "Crashlytics"
        //    38: ldc_w           "Failed to create PrintWriter"
        //    41: aload           4
        //    43: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //    48: aload_3        
        //    49: ldc_w           "Failed to close stack trace writer."
        //    52: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    55: return         
        //    56: astore          5
        //    58: aconst_null    
        //    59: astore_3       
        //    60: aload_3        
        //    61: ldc_w           "Failed to close stack trace writer."
        //    64: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    67: aload           5
        //    69: athrow         
        //    70: astore          5
        //    72: goto            60
        //    75: astore          4
        //    77: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      13     26     30     Ljava/lang/Exception;
        //  4      13     56     60     Any
        //  13     18     75     80     Ljava/lang/Exception;
        //  13     18     70     75     Any
        //  30     48     70     75     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    private static void a(Throwable cause, final Writer writer) {
        boolean b = true;
    Label_0182:
        while (cause != null) {
            while (true) {
                while (true) {
                    String replaceAll = null;
                    Label_0183: {
                        try {
                            final String localizedMessage = cause.getLocalizedMessage();
                            if (localizedMessage == null) {
                                replaceAll = null;
                                break Label_0183;
                            }
                            replaceAll = localizedMessage.replaceAll("(\r\n|\n|\f)", " ");
                            break Label_0183;
                            final String s;
                            final String s2;
                            writer.write(s + cause.getClass().getName() + ": " + s2 + "\n");
                            final StackTraceElement[] stackTrace = cause.getStackTrace();
                            final int length = stackTrace.length;
                            int n = 0;
                            while (true) {
                                break Label_0083;
                                Label_0150: {
                                    cause = cause.getCause();
                                }
                                b = false;
                                break;
                                writer.write("\tat " + stackTrace[n].toString() + "\n");
                                ++n;
                                continue;
                            }
                        }
                        // iftrue(Label_0150:, n >= length)
                        catch (Exception ex) {
                            cl.a().b().a("Crashlytics", "Could not write stack trace", ex);
                        }
                        break Label_0182;
                    }
                    if (replaceAll != null) {
                        final String s2 = replaceAll;
                    }
                    else {
                        final String s2 = "";
                    }
                    if (b) {
                        final String s = "";
                        continue;
                    }
                    final String s = "Caused by: ";
                    continue;
                }
            }
        }
    }
    
    private void a(final Date date, final aq aq, final Thread thread, final Throwable t, final String s, final boolean b) {
        final long n = date.getTime() / 1000L;
        final float b2 = com.crashlytics.android.internal.bd.b(com.crashlytics.android.d.a().w());
        final int a = com.crashlytics.android.internal.bd.a(this.v);
        final boolean c = com.crashlytics.android.internal.bd.c(com.crashlytics.android.d.a().w());
        final int orientation = com.crashlytics.android.d.a().w().getResources().getConfiguration().orientation;
        final long n2 = com.crashlytics.android.internal.bd.c() - com.crashlytics.android.internal.bd.a(com.crashlytics.android.d.a().w());
        final long b3 = com.crashlytics.android.internal.bd.b(Environment.getDataDirectory().getPath());
        this.t = com.crashlytics.android.internal.bd.a(com.crashlytics.android.d.g(), com.crashlytics.android.d.a().w());
        this.x = new LinkedList();
        this.y = t.getStackTrace();
        if (b) {
            final Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            this.w = new Thread[allStackTraces.size()];
            final Iterator<Map.Entry<Thread, StackTraceElement[]>> iterator = allStackTraces.entrySet().iterator();
            int n3 = 0;
            while (iterator.hasNext()) {
                final Map.Entry<Thread, StackTraceElement[]> entry = iterator.next();
                this.w[n3] = entry.getKey();
                this.x.add(entry.getValue());
                ++n3;
            }
        }
        else {
            this.w = new Thread[0];
        }
        final am a2 = this.a(this.u);
        if (a2 == null) {
            cl.a().b().a("Crashlytics", "No log data to include with this event.");
        }
        com.crashlytics.android.internal.bd.a(this.u, "There was a problem closing the Crashlytics log file.");
        this.u = null;
        Map<?, ?> map;
        if (!com.crashlytics.android.internal.bd.a(com.crashlytics.android.d.a().w(), "com.crashlytics.CollectCustomKeys", true)) {
            map = new TreeMap<Object, Object>();
        }
        else {
            final Map b4 = com.crashlytics.android.d.a().b();
            if (b4 != null && b4.size() > 1) {
                map = new TreeMap<Object, Object>(b4);
            }
            else {
                map = (Map<?, ?>)b4;
            }
        }
        aq.g(10, 2);
        final int n4 = 0 + aq.b(1, n) + aq.b(2, am.a(s));
        final int a3 = this.a(thread, t, map);
        final int n5 = n4 + (a3 + (aq.a(3) + aq.c(a3)));
        final int a4 = a(b2, a, c, orientation, n2, b3);
        int n6 = n5 + (a4 + (aq.a(5) + aq.c(a4)));
        if (a2 != null) {
            final int b5 = aq.b(1, a2);
            n6 += b5 + (aq.a(6) + aq.c(b5));
        }
        aq.b(n6);
        aq.a(1, n);
        aq.a(2, am.a(s));
        aq.g(3, 2);
        aq.b(this.a(thread, t, map));
        this.a(aq, thread, t);
        if (map != null && !map.isEmpty()) {
            this.a(aq, map);
        }
        if (this.t != null) {
            aq.a(3, this.t.importance != 100);
        }
        aq.a(4, com.crashlytics.android.d.a().w().getResources().getConfiguration().orientation);
        aq.g(5, 2);
        aq.b(a(b2, a, c, orientation, n2, b3));
        aq.a(1, b2);
        aq.c(2, a);
        aq.a(3, c);
        aq.a(4, orientation);
        aq.a(5, n2);
        aq.a(6, b3);
        if (a2 != null) {
            aq.g(6, 2);
            aq.b(aq.b(1, a2));
            aq.a(1, a2);
        }
    }
    
    private File[] a(final FilenameFilter filenameFilter) {
        File[] listFiles = this.k.listFiles(filenameFilter);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        return listFiles;
    }
    
    private int b(final Thread thread, final Throwable t) {
        final int a = this.a(thread, this.y, 4, true);
        final int n = 0 + (a + (aq.a(1) + aq.c(a)));
        final int length = this.w.length;
        int i = 0;
        int n2 = n;
        while (i < length) {
            final int a2 = this.a(this.w[i], this.x.get(i), 0, false);
            n2 += a2 + (aq.a(1) + aq.c(a2));
            ++i;
        }
        final int a3 = this.a(t, 1);
        final int n3 = n2 + (a3 + (aq.a(2) + aq.c(a3)));
        final int s = s();
        final int n4 = n3 + (s + (aq.a(3) + aq.c(s)));
        final int r = this.r();
        return n4 + (r + (aq.a(3) + aq.c(r)));
    }
    
    private static am b(final String s) {
        if (s == null) {
            return null;
        }
        return am.a(s);
    }
    
    private Future b(final Callable callable) {
        try {
            return this.s.submit((Callable<Object>)new l(this, callable));
        }
        catch (RejectedExecutionException ex) {
            cl.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }
    
    private void c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //     3: invokevirtual   com/crashlytics/android/internal/cl.i:()Ljava/io/File;
        //     6: astore          8
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: aload_1        
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    19: ldc_w           "SessionDevice"
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    28: astore          9
        //    30: new             Lcom/crashlytics/android/ao;
        //    33: dup            
        //    34: aload           8
        //    36: aload           9
        //    38: invokespecial   com/crashlytics/android/ao.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    41: astore          7
        //    43: aload           7
        //    45: invokestatic    com/crashlytics/android/aq.a:(Ljava/io/OutputStream;)Lcom/crashlytics/android/aq;
        //    48: astore          10
        //    50: aload           10
        //    52: astore          6
        //    54: new             Landroid/os/StatFs;
        //    57: dup            
        //    58: invokestatic    android/os/Environment.getDataDirectory:()Ljava/io/File;
        //    61: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //    64: invokespecial   android/os/StatFs.<init>:(Ljava/lang/String;)V
        //    67: astore          11
        //    69: invokestatic    com/crashlytics/android/internal/bd.b:()I
        //    72: istore          12
        //    74: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //    77: invokestatic    com/crashlytics/android/bc.b:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //    80: astore          13
        //    82: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //    85: invokestatic    com/crashlytics/android/bc.b:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //    88: astore          14
        //    90: getstatic       android/os/Build.PRODUCT:Ljava/lang/String;
        //    93: invokestatic    com/crashlytics/android/bc.b:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //    96: astore          15
        //    98: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   101: invokevirtual   java/lang/Runtime.availableProcessors:()I
        //   104: istore          16
        //   106: invokestatic    com/crashlytics/android/internal/bd.c:()J
        //   109: lstore          17
        //   111: aload           11
        //   113: invokevirtual   android/os/StatFs.getBlockCount:()I
        //   116: i2l            
        //   117: aload           11
        //   119: invokevirtual   android/os/StatFs.getBlockSize:()I
        //   122: i2l            
        //   123: lmul           
        //   124: lstore          19
        //   126: invokestatic    com/crashlytics/android/internal/bd.d:()Z
        //   129: istore          21
        //   131: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   134: invokevirtual   com/crashlytics/android/d.d:()Lcom/crashlytics/android/internal/bo;
        //   137: astore          22
        //   139: aload           22
        //   141: invokevirtual   com/crashlytics/android/internal/bo.e:()Ljava/lang/String;
        //   144: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   147: astore          23
        //   149: aload           22
        //   151: invokevirtual   com/crashlytics/android/internal/bo.f:()Ljava/util/Map;
        //   154: astore          24
        //   156: invokestatic    com/crashlytics/android/internal/bd.f:()I
        //   159: istore          25
        //   161: aload           6
        //   163: bipush          9
        //   165: iconst_2       
        //   166: invokevirtual   com/crashlytics/android/aq.g:(II)V
        //   169: aload_0        
        //   170: iload           12
        //   172: aload           23
        //   174: aload           13
        //   176: iload           16
        //   178: lload           17
        //   180: lload           19
        //   182: iload           21
        //   184: aload           24
        //   186: iload           25
        //   188: aload           14
        //   190: aload           15
        //   192: invokespecial   com/crashlytics/android/bc.a:(ILcom/crashlytics/android/am;Lcom/crashlytics/android/am;IJJZLjava/util/Map;ILcom/crashlytics/android/am;Lcom/crashlytics/android/am;)I
        //   195: istore          26
        //   197: aload           6
        //   199: iload           26
        //   201: invokevirtual   com/crashlytics/android/aq.b:(I)V
        //   204: aload           6
        //   206: iconst_1       
        //   207: aload           23
        //   209: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   212: aload           6
        //   214: iconst_3       
        //   215: iload           12
        //   217: invokevirtual   com/crashlytics/android/aq.b:(II)V
        //   220: aload           6
        //   222: iconst_4       
        //   223: aload           13
        //   225: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   228: aload           6
        //   230: iconst_5       
        //   231: iload           16
        //   233: invokevirtual   com/crashlytics/android/aq.a:(II)V
        //   236: aload           6
        //   238: bipush          6
        //   240: lload           17
        //   242: invokevirtual   com/crashlytics/android/aq.a:(IJ)V
        //   245: aload           6
        //   247: bipush          7
        //   249: lload           19
        //   251: invokevirtual   com/crashlytics/android/aq.a:(IJ)V
        //   254: aload           6
        //   256: bipush          10
        //   258: iload           21
        //   260: invokevirtual   com/crashlytics/android/aq.a:(IZ)V
        //   263: aload           24
        //   265: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   270: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   275: astore          27
        //   277: aload           27
        //   279: invokeinterface java/util/Iterator.hasNext:()Z
        //   284: ifeq            433
        //   287: aload           27
        //   289: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   294: checkcast       Ljava/util/Map$Entry;
        //   297: astore          28
        //   299: aload           6
        //   301: bipush          11
        //   303: iconst_2       
        //   304: invokevirtual   com/crashlytics/android/aq.g:(II)V
        //   307: aload           28
        //   309: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   314: checkcast       Lcom/crashlytics/android/internal/ap;
        //   317: aload           28
        //   319: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   324: checkcast       Ljava/lang/String;
        //   327: invokestatic    com/crashlytics/android/bc.a:(Lcom/crashlytics/android/internal/ap;Ljava/lang/String;)I
        //   330: istore          29
        //   332: aload           6
        //   334: iload           29
        //   336: invokevirtual   com/crashlytics/android/aq.b:(I)V
        //   339: aload           28
        //   341: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   346: checkcast       Lcom/crashlytics/android/internal/ap;
        //   349: getfield        com/crashlytics/android/internal/ap.f:I
        //   352: istore          30
        //   354: aload           6
        //   356: iconst_1       
        //   357: iload           30
        //   359: invokevirtual   com/crashlytics/android/aq.b:(II)V
        //   362: aload           28
        //   364: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   369: checkcast       Ljava/lang/String;
        //   372: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   375: astore          31
        //   377: aload           6
        //   379: iconst_2       
        //   380: aload           31
        //   382: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   385: goto            277
        //   388: astore_2       
        //   389: aload           6
        //   391: astore_3       
        //   392: aload           7
        //   394: astore          4
        //   396: aload_0        
        //   397: aload_2        
        //   398: aload           4
        //   400: invokespecial   com/crashlytics/android/bc.a:(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
        //   403: aload_2        
        //   404: athrow         
        //   405: astore          5
        //   407: aload_3        
        //   408: astore          6
        //   410: aload           4
        //   412: astore          7
        //   414: aload           6
        //   416: ldc_w           "Failed to flush session device info."
        //   419: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   422: aload           7
        //   424: ldc_w           "Failed to close session device file."
        //   427: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   430: aload           5
        //   432: athrow         
        //   433: aload           6
        //   435: bipush          12
        //   437: iload           25
        //   439: invokevirtual   com/crashlytics/android/aq.a:(II)V
        //   442: aload           14
        //   444: ifnull          456
        //   447: aload           6
        //   449: bipush          13
        //   451: aload           14
        //   453: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   456: aload           15
        //   458: ifnull          470
        //   461: aload           6
        //   463: bipush          14
        //   465: aload           15
        //   467: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   470: aload           6
        //   472: ldc_w           "Failed to flush session device info."
        //   475: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   478: aload           7
        //   480: ldc_w           "Failed to close session device file."
        //   483: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   486: return         
        //   487: astore          5
        //   489: aconst_null    
        //   490: astore          6
        //   492: aconst_null    
        //   493: astore          7
        //   495: goto            414
        //   498: astore          5
        //   500: aconst_null    
        //   501: astore          6
        //   503: goto            414
        //   506: astore          5
        //   508: goto            414
        //   511: astore_2       
        //   512: aconst_null    
        //   513: astore_3       
        //   514: aconst_null    
        //   515: astore          4
        //   517: goto            396
        //   520: astore_2       
        //   521: aload           7
        //   523: astore          4
        //   525: aconst_null    
        //   526: astore_3       
        //   527: goto            396
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      43     511    520    Ljava/lang/Exception;
        //  0      43     487    498    Any
        //  43     50     520    530    Ljava/lang/Exception;
        //  43     50     498    506    Any
        //  54     277    388    396    Ljava/lang/Exception;
        //  54     277    506    511    Any
        //  277    385    388    396    Ljava/lang/Exception;
        //  277    385    506    511    Any
        //  396    405    405    414    Any
        //  433    442    388    396    Ljava/lang/Exception;
        //  433    442    506    511    Any
        //  447    456    388    396    Ljava/lang/Exception;
        //  447    456    506    511    Any
        //  461    470    388    396    Ljava/lang/Exception;
        //  461    470    506    511    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0277:
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
    
    private boolean k() {
        if (!com.crashlytics.android.internal.bd.a(com.crashlytics.android.d.a().w(), "com.crashlytics.CollectCustomLogs", true)) {
            cl.a().b().a("Crashlytics", "Preferences requested not to collect custom logs. Aborting log file creation.");
            return false;
        }
        com.crashlytics.android.internal.bd.a(this.u, "Could not close log file: " + this.u);
        File file;
        try {
            file = new File(cl.a().i(), "crashlytics-userlog-" + UUID.randomUUID().toString() + ".temp");
            final bc bc = this;
            final File file2 = file;
            final bp bp = new bp(file2);
            bc.u = bp;
            final File file3 = file;
            file3.delete();
            return true;
        }
        catch (Exception ex) {
            file = null;
        }
        while (true) {
            try {
                final bc bc = this;
                final File file2 = file;
                final bp bp = new bp(file2);
                bc.u = bp;
                final File file3 = file;
                file3.delete();
                return true;
                final Exception ex;
                cl.a().b().a("Crashlytics", "Could not create log file: " + file, ex);
                return false;
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    private void l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: new             Ljava/util/Date;
        //     5: dup            
        //     6: invokespecial   java/util/Date.<init>:()V
        //     9: astore_2       
        //    10: new             Lcom/crashlytics/android/an;
        //    13: dup            
        //    14: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //    17: invokevirtual   com/crashlytics/android/d.d:()Lcom/crashlytics/android/internal/bo;
        //    20: invokespecial   com/crashlytics/android/an.<init>:(Lcom/crashlytics/android/internal/bo;)V
        //    23: invokevirtual   com/crashlytics/android/an.toString:()Ljava/lang/String;
        //    26: astore_3       
        //    27: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    30: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    33: ldc             "Crashlytics"
        //    35: new             Ljava/lang/StringBuilder;
        //    38: dup            
        //    39: ldc_w           "Opening an new session with ID "
        //    42: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    45: aload_3        
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    49: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    52: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    57: new             Lcom/crashlytics/android/ao;
        //    60: dup            
        //    61: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    64: invokevirtual   com/crashlytics/android/internal/cl.i:()Ljava/io/File;
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: aload_3        
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: ldc_w           "BeginSession"
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    87: invokespecial   com/crashlytics/android/ao.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    90: astore          4
        //    92: aload           4
        //    94: invokestatic    com/crashlytics/android/aq.a:(Ljava/io/OutputStream;)Lcom/crashlytics/android/aq;
        //    97: astore          9
        //    99: aload           9
        //   101: astore          6
        //   103: aload           6
        //   105: iconst_1       
        //   106: aload_0        
        //   107: getfield        com/crashlytics/android/bc.n:Ljava/lang/String;
        //   110: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   113: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   116: aload           6
        //   118: iconst_2       
        //   119: aload_3        
        //   120: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   123: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   126: aload           6
        //   128: iconst_3       
        //   129: aload_2        
        //   130: invokevirtual   java/util/Date.getTime:()J
        //   133: ldc2_w          1000
        //   136: ldiv           
        //   137: invokevirtual   com/crashlytics/android/aq.a:(IJ)V
        //   140: aload           6
        //   142: ldc_w           "Failed to flush to session begin file."
        //   145: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   148: aload           4
        //   150: ldc_w           "Failed to close begin session file."
        //   153: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   156: new             Lcom/crashlytics/android/ao;
        //   159: dup            
        //   160: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   163: invokevirtual   com/crashlytics/android/internal/cl.i:()Ljava/io/File;
        //   166: new             Ljava/lang/StringBuilder;
        //   169: dup            
        //   170: invokespecial   java/lang/StringBuilder.<init>:()V
        //   173: aload_3        
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: ldc_w           "SessionApp"
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   186: invokespecial   com/crashlytics/android/ao.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   189: astore          10
        //   191: aload           10
        //   193: invokestatic    com/crashlytics/android/aq.a:(Ljava/io/OutputStream;)Lcom/crashlytics/android/aq;
        //   196: astore          15
        //   198: aload           15
        //   200: astore          14
        //   202: invokestatic    com/crashlytics/android/d.g:()Ljava/lang/String;
        //   205: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   208: astore          16
        //   210: invokestatic    com/crashlytics/android/d.j:()Ljava/lang/String;
        //   213: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   216: astore          17
        //   218: invokestatic    com/crashlytics/android/d.i:()Ljava/lang/String;
        //   221: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   224: astore          18
        //   226: invokestatic    com/crashlytics/android/d.k:()Ljava/lang/String;
        //   229: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   232: pop            
        //   233: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   236: invokevirtual   com/crashlytics/android/d.w:()Landroid/content/Context;
        //   239: invokevirtual   android/content/Context.getPackageCodePath:()Ljava/lang/String;
        //   242: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   245: pop            
        //   246: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   249: invokevirtual   com/crashlytics/android/d.d:()Lcom/crashlytics/android/internal/bo;
        //   252: invokevirtual   com/crashlytics/android/internal/bo.b:()Ljava/lang/String;
        //   255: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   258: astore          21
        //   260: invokestatic    com/crashlytics/android/d.h:()Ljava/lang/String;
        //   263: invokestatic    com/crashlytics/android/internal/ai.a:(Ljava/lang/String;)Lcom/crashlytics/android/internal/ai;
        //   266: invokevirtual   com/crashlytics/android/internal/ai.a:()I
        //   269: istore          22
        //   271: aload           14
        //   273: bipush          7
        //   275: iconst_2       
        //   276: invokevirtual   com/crashlytics/android/aq.g:(II)V
        //   279: iconst_0       
        //   280: iconst_1       
        //   281: aload           16
        //   283: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //   286: iadd           
        //   287: iconst_2       
        //   288: aload           17
        //   290: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //   293: iadd           
        //   294: iconst_3       
        //   295: aload           18
        //   297: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //   300: iadd           
        //   301: istore          23
        //   303: invokestatic    com/crashlytics/android/bc.q:()I
        //   306: istore          24
        //   308: aload           14
        //   310: iload           23
        //   312: iload           24
        //   314: iconst_5       
        //   315: invokestatic    com/crashlytics/android/aq.a:(I)I
        //   318: iload           24
        //   320: invokestatic    com/crashlytics/android/aq.c:(I)I
        //   323: iadd           
        //   324: iadd           
        //   325: iadd           
        //   326: bipush          6
        //   328: aload           21
        //   330: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //   333: iadd           
        //   334: bipush          10
        //   336: iload           22
        //   338: invokestatic    com/crashlytics/android/aq.e:(II)I
        //   341: iadd           
        //   342: invokevirtual   com/crashlytics/android/aq.b:(I)V
        //   345: aload           14
        //   347: iconst_1       
        //   348: aload           16
        //   350: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   353: aload           14
        //   355: iconst_2       
        //   356: aload           17
        //   358: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   361: aload           14
        //   363: iconst_3       
        //   364: aload           18
        //   366: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   369: aload           14
        //   371: iconst_5       
        //   372: iconst_2       
        //   373: invokevirtual   com/crashlytics/android/aq.g:(II)V
        //   376: aload           14
        //   378: invokestatic    com/crashlytics/android/bc.q:()I
        //   381: invokevirtual   com/crashlytics/android/aq.b:(I)V
        //   384: aload           14
        //   386: iconst_1       
        //   387: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   390: invokevirtual   com/crashlytics/android/d.w:()Landroid/content/Context;
        //   393: iconst_0       
        //   394: invokestatic    com/crashlytics/android/internal/cj.a:(Landroid/content/Context;Z)Ljava/lang/String;
        //   397: invokevirtual   com/crashlytics/android/aq.a:(ILjava/lang/String;)V
        //   400: aload           14
        //   402: bipush          6
        //   404: aload           21
        //   406: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   409: aload           14
        //   411: bipush          10
        //   413: iload           22
        //   415: invokevirtual   com/crashlytics/android/aq.b:(II)V
        //   418: aload           14
        //   420: ldc_w           "Failed to flush to session app file."
        //   423: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   426: aload           10
        //   428: ldc_w           "Failed to close session app file."
        //   431: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   434: new             Lcom/crashlytics/android/ao;
        //   437: dup            
        //   438: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   441: invokevirtual   com/crashlytics/android/internal/cl.i:()Ljava/io/File;
        //   444: new             Ljava/lang/StringBuilder;
        //   447: dup            
        //   448: invokespecial   java/lang/StringBuilder.<init>:()V
        //   451: aload_3        
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: ldc_w           "SessionOS"
        //   458: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   461: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   464: invokespecial   com/crashlytics/android/ao.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   467: astore          25
        //   469: aload           25
        //   471: invokestatic    com/crashlytics/android/aq.a:(Ljava/io/OutputStream;)Lcom/crashlytics/android/aq;
        //   474: astore_1       
        //   475: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //   478: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   481: astore          28
        //   483: getstatic       android/os/Build$VERSION.CODENAME:Ljava/lang/String;
        //   486: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   489: astore          29
        //   491: invokestatic    com/crashlytics/android/internal/bd.e:()Z
        //   494: istore          30
        //   496: aload_1        
        //   497: bipush          8
        //   499: iconst_2       
        //   500: invokevirtual   com/crashlytics/android/aq.g:(II)V
        //   503: aload_1        
        //   504: iconst_0       
        //   505: iconst_1       
        //   506: iconst_3       
        //   507: invokestatic    com/crashlytics/android/aq.e:(II)I
        //   510: iadd           
        //   511: iconst_2       
        //   512: aload           28
        //   514: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //   517: iadd           
        //   518: iconst_3       
        //   519: aload           29
        //   521: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //   524: iadd           
        //   525: iconst_4       
        //   526: iload           30
        //   528: invokestatic    com/crashlytics/android/aq.b:(IZ)I
        //   531: iadd           
        //   532: invokevirtual   com/crashlytics/android/aq.b:(I)V
        //   535: aload_1        
        //   536: iconst_1       
        //   537: iconst_3       
        //   538: invokevirtual   com/crashlytics/android/aq.b:(II)V
        //   541: aload_1        
        //   542: iconst_2       
        //   543: aload           28
        //   545: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   548: aload_1        
        //   549: iconst_3       
        //   550: aload           29
        //   552: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //   555: aload_1        
        //   556: iconst_4       
        //   557: iload           30
        //   559: invokevirtual   com/crashlytics/android/aq.a:(IZ)V
        //   562: aload_1        
        //   563: ldc_w           "Failed to flush to session OS file."
        //   566: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   569: aload           25
        //   571: ldc_w           "Failed to close session OS file."
        //   574: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   577: aload_0        
        //   578: aload_3        
        //   579: invokespecial   com/crashlytics/android/bc.c:(Ljava/lang/String;)V
        //   582: return         
        //   583: astore          5
        //   585: aconst_null    
        //   586: astore          6
        //   588: aload_0        
        //   589: aload           5
        //   591: aload_1        
        //   592: invokespecial   com/crashlytics/android/bc.a:(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
        //   595: aload           5
        //   597: athrow         
        //   598: astore          7
        //   600: aload_1        
        //   601: astore          4
        //   603: aload           6
        //   605: astore          8
        //   607: aload           8
        //   609: ldc_w           "Failed to flush to session begin file."
        //   612: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   615: aload           4
        //   617: ldc_w           "Failed to close begin session file."
        //   620: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   623: aload           7
        //   625: athrow         
        //   626: astore          11
        //   628: aconst_null    
        //   629: astore          12
        //   631: aload_0        
        //   632: aload           11
        //   634: aload           12
        //   636: invokespecial   com/crashlytics/android/bc.a:(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
        //   639: aload           11
        //   641: athrow         
        //   642: astore          13
        //   644: aload           12
        //   646: astore          10
        //   648: aload_1        
        //   649: astore          14
        //   651: aload           14
        //   653: ldc_w           "Failed to flush to session app file."
        //   656: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   659: aload           10
        //   661: ldc_w           "Failed to close session app file."
        //   664: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   667: aload           13
        //   669: athrow         
        //   670: astore          26
        //   672: aconst_null    
        //   673: astore          25
        //   675: aload_0        
        //   676: aload           26
        //   678: aload           25
        //   680: invokespecial   com/crashlytics/android/bc.a:(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
        //   683: aload           26
        //   685: athrow         
        //   686: astore          27
        //   688: aload_1        
        //   689: ldc_w           "Failed to flush to session OS file."
        //   692: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   695: aload           25
        //   697: ldc_w           "Failed to close session OS file."
        //   700: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   703: aload           27
        //   705: athrow         
        //   706: astore          27
        //   708: aconst_null    
        //   709: astore          25
        //   711: aconst_null    
        //   712: astore_1       
        //   713: goto            688
        //   716: astore          26
        //   718: goto            675
        //   721: astore          13
        //   723: aconst_null    
        //   724: astore          14
        //   726: aconst_null    
        //   727: astore          10
        //   729: goto            651
        //   732: astore          13
        //   734: aconst_null    
        //   735: astore          14
        //   737: goto            651
        //   740: astore          13
        //   742: goto            651
        //   745: astore          11
        //   747: aload           10
        //   749: astore          12
        //   751: aconst_null    
        //   752: astore_1       
        //   753: goto            631
        //   756: astore          11
        //   758: aload           14
        //   760: astore_1       
        //   761: aload           10
        //   763: astore          12
        //   765: goto            631
        //   768: astore          7
        //   770: aconst_null    
        //   771: astore          8
        //   773: aconst_null    
        //   774: astore          4
        //   776: goto            607
        //   779: astore          7
        //   781: aconst_null    
        //   782: astore          8
        //   784: goto            607
        //   787: astore          7
        //   789: aload           6
        //   791: astore          8
        //   793: goto            607
        //   796: astore          5
        //   798: aload           4
        //   800: astore_1       
        //   801: aconst_null    
        //   802: astore          6
        //   804: goto            588
        //   807: astore          5
        //   809: aload           4
        //   811: astore_1       
        //   812: goto            588
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  57     92     583    588    Ljava/lang/Exception;
        //  57     92     768    779    Any
        //  92     99     796    807    Ljava/lang/Exception;
        //  92     99     779    787    Any
        //  103    140    807    815    Ljava/lang/Exception;
        //  103    140    787    796    Any
        //  156    191    626    631    Ljava/lang/Exception;
        //  156    191    721    732    Any
        //  191    198    745    756    Ljava/lang/Exception;
        //  191    198    732    740    Any
        //  202    418    756    768    Ljava/lang/Exception;
        //  202    418    740    745    Any
        //  434    469    670    675    Ljava/lang/Exception;
        //  434    469    706    716    Any
        //  469    562    716    721    Ljava/lang/Exception;
        //  469    562    686    688    Any
        //  588    598    598    607    Any
        //  631    642    642    651    Any
        //  675    686    686    688    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 383, Size: 383
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    private void m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/util/HashSet;
        //     3: dup            
        //     4: invokespecial   java/util/HashSet.<init>:()V
        //     7: astore_1       
        //     8: aload_0        
        //     9: invokespecial   com/crashlytics/android/bc.o:()[Ljava/io/File;
        //    12: astore_2       
        //    13: aload_2        
        //    14: getstatic       com/crashlytics/android/bc.b:Ljava/util/Comparator;
        //    17: invokestatic    java/util/Arrays.sort:([Ljava/lang/Object;Ljava/util/Comparator;)V
        //    20: bipush          8
        //    22: aload_2        
        //    23: arraylength    
        //    24: invokestatic    java/lang/Math.min:(II)I
        //    27: istore_3       
        //    28: iconst_0       
        //    29: istore          4
        //    31: iload           4
        //    33: iload_3        
        //    34: if_icmpge       57
        //    37: aload_1        
        //    38: aload_2        
        //    39: iload           4
        //    41: aaload         
        //    42: invokestatic    com/crashlytics/android/bc.a:(Ljava/io/File;)Ljava/lang/String;
        //    45: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    50: pop            
        //    51: iinc            4, 1
        //    54: goto            31
        //    57: aload_0        
        //    58: new             Lcom/crashlytics/android/u;
        //    61: dup            
        //    62: iconst_0       
        //    63: invokespecial   com/crashlytics/android/u.<init>:(B)V
        //    66: invokespecial   com/crashlytics/android/bc.a:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //    69: astore          5
        //    71: aload           5
        //    73: arraylength    
        //    74: istore          6
        //    76: iconst_0       
        //    77: istore          7
        //    79: iload           7
        //    81: iload           6
        //    83: if_icmpge       174
        //    86: aload           5
        //    88: iload           7
        //    90: aaload         
        //    91: astore          49
        //    93: aload           49
        //    95: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    98: astore          50
        //   100: getstatic       com/crashlytics/android/bc.d:Ljava/util/regex/Pattern;
        //   103: aload           50
        //   105: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   108: astore          51
        //   110: aload           51
        //   112: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   115: pop            
        //   116: aload_1        
        //   117: aload           51
        //   119: iconst_1       
        //   120: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   123: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   128: ifne            168
        //   131: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   134: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   137: ldc             "Crashlytics"
        //   139: new             Ljava/lang/StringBuilder;
        //   142: dup            
        //   143: ldc_w           "Trimming open session file: "
        //   146: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   149: aload           50
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   157: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   162: aload           49
        //   164: invokevirtual   java/io/File.delete:()Z
        //   167: pop            
        //   168: iinc            7, 1
        //   171: goto            79
        //   174: aload_0        
        //   175: invokespecial   com/crashlytics/android/bc.n:()Ljava/lang/String;
        //   178: astore          8
        //   180: aload           8
        //   182: ifnull          1294
        //   185: aconst_null    
        //   186: astore          9
        //   188: new             Lcom/crashlytics/android/ao;
        //   191: dup            
        //   192: aload_0        
        //   193: getfield        com/crashlytics/android/bc.k:Ljava/io/File;
        //   196: new             Ljava/lang/StringBuilder;
        //   199: dup            
        //   200: invokespecial   java/lang/StringBuilder.<init>:()V
        //   203: aload           8
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: ldc_w           "SessionUser"
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   217: invokespecial   com/crashlytics/android/ao.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   220: astore          10
        //   222: aload           10
        //   224: invokestatic    com/crashlytics/android/aq.a:(Ljava/io/OutputStream;)Lcom/crashlytics/android/aq;
        //   227: astore          9
        //   229: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   232: invokevirtual   com/crashlytics/android/d.p:()Ljava/lang/String;
        //   235: astore          13
        //   237: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   240: invokevirtual   com/crashlytics/android/d.r:()Ljava/lang/String;
        //   243: astore          14
        //   245: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   248: invokevirtual   com/crashlytics/android/d.q:()Ljava/lang/String;
        //   251: astore          15
        //   253: aload           13
        //   255: ifnonnull       944
        //   258: aload           14
        //   260: ifnonnull       944
        //   263: aload           15
        //   265: ifnonnull       944
        //   268: aload           9
        //   270: ldc_w           "Failed to flush session user file."
        //   273: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   276: aload           10
        //   278: ldc_w           "Failed to close session user file."
        //   281: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   284: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //   287: invokevirtual   com/crashlytics/android/d.u:()Lcom/crashlytics/android/internal/as;
        //   290: astore          20
        //   292: aload           20
        //   294: ifnull          1277
        //   297: aload           20
        //   299: getfield        com/crashlytics/android/internal/as.a:I
        //   302: istore          21
        //   304: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   307: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   310: ldc             "Crashlytics"
        //   312: ldc_w           "Closing all open sessions."
        //   315: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   320: aload_0        
        //   321: invokespecial   com/crashlytics/android/bc.o:()[Ljava/io/File;
        //   324: astore          22
        //   326: aload           22
        //   328: ifnull          1293
        //   331: aload           22
        //   333: arraylength    
        //   334: ifle            1293
        //   337: aload           22
        //   339: arraylength    
        //   340: istore          23
        //   342: iconst_0       
        //   343: istore          24
        //   345: iload           24
        //   347: iload           23
        //   349: if_icmpge       1293
        //   352: aload           22
        //   354: iload           24
        //   356: aaload         
        //   357: astore          25
        //   359: aload           25
        //   361: invokestatic    com/crashlytics/android/bc.a:(Ljava/io/File;)Ljava/lang/String;
        //   364: astore          26
        //   366: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   369: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   372: ldc             "Crashlytics"
        //   374: new             Ljava/lang/StringBuilder;
        //   377: dup            
        //   378: ldc_w           "Closing session: "
        //   381: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   384: aload           26
        //   386: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   389: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   392: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   397: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   400: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   403: ldc             "Crashlytics"
        //   405: new             Ljava/lang/StringBuilder;
        //   408: dup            
        //   409: ldc_w           "Collecting session parts for ID "
        //   412: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   415: aload           26
        //   417: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   420: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   423: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   428: aload_0        
        //   429: new             Lcom/crashlytics/android/v;
        //   432: dup            
        //   433: new             Ljava/lang/StringBuilder;
        //   436: dup            
        //   437: invokespecial   java/lang/StringBuilder.<init>:()V
        //   440: aload           26
        //   442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   445: ldc_w           "SessionCrash"
        //   448: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   451: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   454: invokespecial   com/crashlytics/android/v.<init>:(Ljava/lang/String;)V
        //   457: invokespecial   com/crashlytics/android/bc.a:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //   460: astore          27
        //   462: aload           27
        //   464: ifnull          1142
        //   467: aload           27
        //   469: arraylength    
        //   470: ifle            1142
        //   473: iconst_1       
        //   474: istore          28
        //   476: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   479: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   482: astore          29
        //   484: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   487: astore          30
        //   489: iconst_2       
        //   490: anewarray       Ljava/lang/Object;
        //   493: astore          31
        //   495: aload           31
        //   497: iconst_0       
        //   498: aload           26
        //   500: aastore        
        //   501: aload           31
        //   503: iconst_1       
        //   504: iload           28
        //   506: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   509: aastore        
        //   510: aload           29
        //   512: ldc             "Crashlytics"
        //   514: aload           30
        //   516: ldc_w           "Session %s has fatal exception: %s"
        //   519: aload           31
        //   521: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   524: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   529: aload_0        
        //   530: new             Lcom/crashlytics/android/v;
        //   533: dup            
        //   534: new             Ljava/lang/StringBuilder;
        //   537: dup            
        //   538: invokespecial   java/lang/StringBuilder.<init>:()V
        //   541: aload           26
        //   543: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   546: ldc_w           "SessionEvent"
        //   549: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   552: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   555: invokespecial   com/crashlytics/android/v.<init>:(Ljava/lang/String;)V
        //   558: invokespecial   com/crashlytics/android/bc.a:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //   561: astore          32
        //   563: aload           32
        //   565: ifnull          1148
        //   568: aload           32
        //   570: arraylength    
        //   571: ifle            1148
        //   574: iconst_1       
        //   575: istore          33
        //   577: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   580: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   583: astore          34
        //   585: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   588: astore          35
        //   590: iconst_2       
        //   591: anewarray       Ljava/lang/Object;
        //   594: astore          36
        //   596: aload           36
        //   598: iconst_0       
        //   599: aload           26
        //   601: aastore        
        //   602: aload           36
        //   604: iconst_1       
        //   605: iload           33
        //   607: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   610: aastore        
        //   611: aload           34
        //   613: ldc             "Crashlytics"
        //   615: aload           35
        //   617: ldc_w           "Session %s has non-fatal exceptions: %s"
        //   620: aload           36
        //   622: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   625: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   630: iload           28
        //   632: ifne            640
        //   635: iload           33
        //   637: ifeq            1243
        //   640: aconst_null    
        //   641: astore          37
        //   643: new             Lcom/crashlytics/android/ao;
        //   646: dup            
        //   647: aload_0        
        //   648: getfield        com/crashlytics/android/bc.k:Ljava/io/File;
        //   651: aload           26
        //   653: invokespecial   com/crashlytics/android/ao.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   656: astore          38
        //   658: aload           38
        //   660: invokestatic    com/crashlytics/android/aq.a:(Ljava/io/OutputStream;)Lcom/crashlytics/android/aq;
        //   663: astore          43
        //   665: aload           43
        //   667: astore          37
        //   669: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   672: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   675: ldc             "Crashlytics"
        //   677: new             Ljava/lang/StringBuilder;
        //   680: dup            
        //   681: ldc_w           "Collecting SessionStart data for session ID "
        //   684: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   687: aload           26
        //   689: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   692: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   695: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   700: aload           37
        //   702: aload           25
        //   704: invokestatic    com/crashlytics/android/bc.a:(Lcom/crashlytics/android/aq;Ljava/io/File;)V
        //   707: aload           37
        //   709: iconst_4       
        //   710: new             Ljava/util/Date;
        //   713: dup            
        //   714: invokespecial   java/util/Date.<init>:()V
        //   717: invokevirtual   java/util/Date.getTime:()J
        //   720: ldc2_w          1000
        //   723: ldiv           
        //   724: invokevirtual   com/crashlytics/android/aq.a:(IJ)V
        //   727: aload           37
        //   729: iconst_5       
        //   730: iload           28
        //   732: invokevirtual   com/crashlytics/android/aq.a:(IZ)V
        //   735: aload_0        
        //   736: aload           37
        //   738: aload           26
        //   740: invokespecial   com/crashlytics/android/bc.a:(Lcom/crashlytics/android/aq;Ljava/lang/String;)V
        //   743: iload           33
        //   745: ifeq            855
        //   748: aload           32
        //   750: arraylength    
        //   751: iload           21
        //   753: if_icmple       1370
        //   756: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   759: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   762: astore          45
        //   764: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   767: astore          46
        //   769: iconst_1       
        //   770: anewarray       Ljava/lang/Object;
        //   773: astore          47
        //   775: aload           47
        //   777: iconst_0       
        //   778: iload           21
        //   780: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   783: aastore        
        //   784: aload           45
        //   786: ldc             "Crashlytics"
        //   788: aload           46
        //   790: ldc_w           "Trimming down to %d logged exceptions."
        //   793: aload           47
        //   795: invokestatic    java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   798: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   803: aload_0        
        //   804: aload           26
        //   806: iload           21
        //   808: invokespecial   com/crashlytics/android/bc.a:(Ljava/lang/String;I)V
        //   811: aload_0        
        //   812: new             Lcom/crashlytics/android/v;
        //   815: dup            
        //   816: new             Ljava/lang/StringBuilder;
        //   819: dup            
        //   820: invokespecial   java/lang/StringBuilder.<init>:()V
        //   823: aload           26
        //   825: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   828: ldc_w           "SessionEvent"
        //   831: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   834: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   837: invokespecial   com/crashlytics/android/v.<init>:(Ljava/lang/String;)V
        //   840: invokespecial   com/crashlytics/android/bc.a:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //   843: astore          44
        //   845: aload_0        
        //   846: aload           37
        //   848: aload           44
        //   850: aload           26
        //   852: invokespecial   com/crashlytics/android/bc.a:(Lcom/crashlytics/android/aq;[Ljava/io/File;Ljava/lang/String;)V
        //   855: iload           28
        //   857: ifeq            869
        //   860: aload           37
        //   862: aload           27
        //   864: iconst_0       
        //   865: aaload         
        //   866: invokestatic    com/crashlytics/android/bc.a:(Lcom/crashlytics/android/aq;Ljava/io/File;)V
        //   869: aload           37
        //   871: bipush          11
        //   873: iconst_1       
        //   874: invokevirtual   com/crashlytics/android/aq.a:(II)V
        //   877: aload           37
        //   879: bipush          12
        //   881: iconst_3       
        //   882: invokevirtual   com/crashlytics/android/aq.b:(II)V
        //   885: aload           37
        //   887: ldc_w           "Error flushing session file stream"
        //   890: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //   893: aload           38
        //   895: ldc_w           "Failed to close CLS file"
        //   898: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   901: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   904: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   907: ldc             "Crashlytics"
        //   909: new             Ljava/lang/StringBuilder;
        //   912: dup            
        //   913: ldc_w           "Removing session part files for ID "
        //   916: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   919: aload           26
        //   921: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   924: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   927: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   932: aload_0        
        //   933: aload           26
        //   935: invokespecial   com/crashlytics/android/bc.a:(Ljava/lang/String;)V
        //   938: iinc            24, 1
        //   941: goto            345
        //   944: aload           13
        //   946: ifnonnull       953
        //   949: ldc             ""
        //   951: astore          13
        //   953: aload           13
        //   955: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //   958: astore          16
        //   960: aload           14
        //   962: ifnonnull       1081
        //   965: aconst_null    
        //   966: astore          17
        //   968: goto            1377
        //   971: iconst_0       
        //   972: iconst_1       
        //   973: aload           16
        //   975: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //   978: iadd           
        //   979: istore          19
        //   981: aload           17
        //   983: ifnull          997
        //   986: iload           19
        //   988: iconst_2       
        //   989: aload           17
        //   991: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //   994: iadd           
        //   995: istore          19
        //   997: aload           18
        //   999: ifnull          1013
        //  1002: iload           19
        //  1004: iconst_3       
        //  1005: aload           18
        //  1007: invokestatic    com/crashlytics/android/aq.b:(ILcom/crashlytics/android/am;)I
        //  1010: iadd           
        //  1011: istore          19
        //  1013: aload           9
        //  1015: bipush          6
        //  1017: iconst_2       
        //  1018: invokevirtual   com/crashlytics/android/aq.g:(II)V
        //  1021: aload           9
        //  1023: iload           19
        //  1025: invokevirtual   com/crashlytics/android/aq.b:(I)V
        //  1028: aload           9
        //  1030: iconst_1       
        //  1031: aload           16
        //  1033: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //  1036: aload           17
        //  1038: ifnull          1049
        //  1041: aload           9
        //  1043: iconst_2       
        //  1044: aload           17
        //  1046: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //  1049: aload           18
        //  1051: ifnull          1062
        //  1054: aload           9
        //  1056: iconst_3       
        //  1057: aload           18
        //  1059: invokevirtual   com/crashlytics/android/aq.a:(ILcom/crashlytics/android/am;)V
        //  1062: aload           9
        //  1064: ldc_w           "Failed to flush session user file."
        //  1067: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //  1070: aload           10
        //  1072: ldc_w           "Failed to close session user file."
        //  1075: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //  1078: goto            284
        //  1081: aload           14
        //  1083: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //  1086: astore          17
        //  1088: goto            1377
        //  1091: aload           15
        //  1093: invokestatic    com/crashlytics/android/am.a:(Ljava/lang/String;)Lcom/crashlytics/android/am;
        //  1096: astore          48
        //  1098: aload           48
        //  1100: astore          18
        //  1102: goto            971
        //  1105: astore          11
        //  1107: aconst_null    
        //  1108: astore          10
        //  1110: aload_0        
        //  1111: aload           11
        //  1113: aload           10
        //  1115: invokespecial   com/crashlytics/android/bc.a:(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
        //  1118: aload           11
        //  1120: athrow         
        //  1121: astore          12
        //  1123: aload           9
        //  1125: ldc_w           "Failed to flush session user file."
        //  1128: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //  1131: aload           10
        //  1133: ldc_w           "Failed to close session user file."
        //  1136: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //  1139: aload           12
        //  1141: athrow         
        //  1142: iconst_0       
        //  1143: istore          28
        //  1145: goto            476
        //  1148: iconst_0       
        //  1149: istore          33
        //  1151: goto            577
        //  1154: astore          39
        //  1156: aconst_null    
        //  1157: astore          41
        //  1159: aconst_null    
        //  1160: astore          40
        //  1162: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //  1165: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //  1168: ldc             "Crashlytics"
        //  1170: new             Ljava/lang/StringBuilder;
        //  1173: dup            
        //  1174: ldc_w           "Failed to write session file for session ID: "
        //  1177: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1180: aload           26
        //  1182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1185: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1188: aload           39
        //  1190: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1195: aload_0        
        //  1196: aload           39
        //  1198: aload           40
        //  1200: invokespecial   com/crashlytics/android/bc.a:(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
        //  1203: aload           41
        //  1205: ldc_w           "Error flushing session file stream"
        //  1208: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //  1211: aload           40
        //  1213: invokestatic    com/crashlytics/android/bc.a:(Lcom/crashlytics/android/ao;)V
        //  1216: goto            901
        //  1219: astore          42
        //  1221: aconst_null    
        //  1222: astore          38
        //  1224: aload           37
        //  1226: ldc_w           "Error flushing session file stream"
        //  1229: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Flushable;Ljava/lang/String;)V
        //  1232: aload           38
        //  1234: ldc_w           "Failed to close CLS file"
        //  1237: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //  1240: aload           42
        //  1242: athrow         
        //  1243: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //  1246: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //  1249: ldc             "Crashlytics"
        //  1251: new             Ljava/lang/StringBuilder;
        //  1254: dup            
        //  1255: ldc_w           "No events present for session ID "
        //  1258: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1261: aload           26
        //  1263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1266: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1269: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //  1274: goto            901
        //  1277: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //  1280: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //  1283: ldc             "Crashlytics"
        //  1285: ldc_w           "No session begin files found."
        //  1288: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //  1293: return         
        //  1294: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //  1297: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //  1300: ldc             "Crashlytics"
        //  1302: ldc_w           "Unable to close session. Settings are not loaded."
        //  1305: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //  1310: return         
        //  1311: astore          42
        //  1313: goto            1224
        //  1316: astore          42
        //  1318: aload           40
        //  1320: astore          38
        //  1322: aload           41
        //  1324: astore          37
        //  1326: goto            1224
        //  1329: astore          39
        //  1331: aload           38
        //  1333: astore          40
        //  1335: aconst_null    
        //  1336: astore          41
        //  1338: goto            1162
        //  1341: astore          39
        //  1343: aload           37
        //  1345: astore          41
        //  1347: aload           38
        //  1349: astore          40
        //  1351: goto            1162
        //  1354: astore          12
        //  1356: aconst_null    
        //  1357: astore          9
        //  1359: aconst_null    
        //  1360: astore          10
        //  1362: goto            1123
        //  1365: astore          11
        //  1367: goto            1110
        //  1370: aload           32
        //  1372: astore          44
        //  1374: goto            845
        //  1377: aload           15
        //  1379: ifnonnull       1091
        //  1382: aconst_null    
        //  1383: astore          18
        //  1385: goto            971
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  188    222    1105   1110   Ljava/lang/Exception;
        //  188    222    1354   1365   Any
        //  222    253    1365   1370   Ljava/lang/Exception;
        //  222    253    1121   1123   Any
        //  643    658    1154   1162   Ljava/lang/Exception;
        //  643    658    1219   1224   Any
        //  658    665    1329   1341   Ljava/lang/Exception;
        //  658    665    1311   1316   Any
        //  669    743    1341   1354   Ljava/lang/Exception;
        //  669    743    1311   1316   Any
        //  748    845    1341   1354   Ljava/lang/Exception;
        //  748    845    1311   1316   Any
        //  845    855    1341   1354   Ljava/lang/Exception;
        //  845    855    1311   1316   Any
        //  860    869    1341   1354   Ljava/lang/Exception;
        //  860    869    1311   1316   Any
        //  869    885    1341   1354   Ljava/lang/Exception;
        //  869    885    1311   1316   Any
        //  953    960    1365   1370   Ljava/lang/Exception;
        //  953    960    1121   1123   Any
        //  971    981    1365   1370   Ljava/lang/Exception;
        //  971    981    1121   1123   Any
        //  986    997    1365   1370   Ljava/lang/Exception;
        //  986    997    1121   1123   Any
        //  1002   1013   1365   1370   Ljava/lang/Exception;
        //  1002   1013   1121   1123   Any
        //  1013   1036   1365   1370   Ljava/lang/Exception;
        //  1013   1036   1121   1123   Any
        //  1041   1049   1365   1370   Ljava/lang/Exception;
        //  1041   1049   1121   1123   Any
        //  1054   1062   1365   1370   Ljava/lang/Exception;
        //  1054   1062   1121   1123   Any
        //  1081   1088   1365   1370   Ljava/lang/Exception;
        //  1081   1088   1121   1123   Any
        //  1091   1098   1365   1370   Ljava/lang/Exception;
        //  1091   1098   1121   1123   Any
        //  1110   1121   1121   1123   Any
        //  1162   1203   1316   1329   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    private String n() {
        final File[] a = this.a(new v("BeginSession"));
        Arrays.sort(a, bc.b);
        if (a.length > 0) {
            return a(a[0]);
        }
        return null;
    }
    
    private File[] o() {
        return this.a(new v("BeginSession"));
    }
    
    private void p() {
        for (final File file : this.a(bc.a)) {
            cl.a().b().a("Crashlytics", "Attempting to send crash report at time of crash...");
            new Thread(new f(this, file), "Crashlytics Report Uploader").start();
        }
    }
    
    private static int q() {
        return 0 + aq.b(1, am.a(cj.a(com.crashlytics.android.d.a().w(), cl.a().g())));
    }
    
    private int r() {
        int n = 0 + aq.b(1, 0L) + aq.b(2, 0L) + aq.b(3, this.q);
        if (this.r != null) {
            n += aq.b(4, this.r);
        }
        return n;
    }
    
    private static int s() {
        return 0 + aq.b(1, bc.f) + aq.b(2, bc.f) + aq.b(3, 0L);
    }
    
    final void a(final long n, final String s) {
        this.b(new be(this, n, s));
    }
    
    final void a(final Thread thread, final Throwable t) {
        this.a(new s(this, new Date(), thread, t));
    }
    
    final void a(final File[] array) {
        final File file = new File(cl.a().i(), "invalidClsFiles");
        if (file.exists()) {
            if (file.isDirectory()) {
                final File[] listFiles = file.listFiles();
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
        for (final File file2 : array) {
            cl.a().b().a("Crashlytics", "Found invalid session part file: " + file2);
            final String a = a(file2);
            final h h = new h(this, a);
            cl.a().b().a("Crashlytics", "Deleting all part files for invalid session: " + a);
            for (final File file3 : this.a(h)) {
                cl.a().b().a("Crashlytics", "Deleting session file: " + file3);
                file3.delete();
            }
        }
    }
    
    final boolean a() {
        return this.m.get();
    }
    
    final boolean b() {
        return (boolean)this.a(new r(this));
    }
    
    final void c() {
        this.b(new bg(this));
    }
    
    final void d() {
        this.b(new a(this));
    }
    
    final void e() {
        this.b(new b(this));
    }
    
    final boolean f() {
        return (boolean)this.a(new c(this));
    }
    
    final boolean g() {
        return this.o().length > 0;
    }
    
    final void h() {
        this.a(new g(this));
    }
    
    @Override
    public final void uncaughtException(final Thread p0, final Throwable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/crashlytics/android/bc.m:Ljava/util/concurrent/atomic/AtomicBoolean;
        //     6: iconst_1       
        //     7: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //    10: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    13: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    16: ldc             "Crashlytics"
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: ldc_w           "Crashlytics is handling uncaught exception \""
        //    25: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    28: aload_2        
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    32: ldc_w           "\" from thread "
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: aload_1        
        //    39: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    48: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    53: aload_0        
        //    54: getfield        com/crashlytics/android/bc.h:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    57: iconst_1       
        //    58: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //    61: ifne            106
        //    64: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    67: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    70: ldc             "Crashlytics"
        //    72: ldc_w           "Unregistering power receivers."
        //    75: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    80: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //    83: invokevirtual   com/crashlytics/android/d.w:()Landroid/content/Context;
        //    86: aload_0        
        //    87: getfield        com/crashlytics/android/bc.p:Landroid/content/BroadcastReceiver;
        //    90: invokevirtual   android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    93: invokestatic    com/crashlytics/android/d.a:()Lcom/crashlytics/android/d;
        //    96: invokevirtual   com/crashlytics/android/d.w:()Landroid/content/Context;
        //    99: aload_0        
        //   100: getfield        com/crashlytics/android/bc.o:Landroid/content/BroadcastReceiver;
        //   103: invokevirtual   android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //   106: aload_0        
        //   107: new             Lcom/crashlytics/android/q;
        //   110: dup            
        //   111: aload_0        
        //   112: new             Ljava/util/Date;
        //   115: dup            
        //   116: invokespecial   java/util/Date.<init>:()V
        //   119: aload_1        
        //   120: aload_2        
        //   121: invokespecial   com/crashlytics/android/q.<init>:(Lcom/crashlytics/android/bc;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //   124: invokespecial   com/crashlytics/android/bc.a:(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
        //   127: pop            
        //   128: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   131: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   134: ldc             "Crashlytics"
        //   136: ldc_w           "Crashlytics completed exception processing. Invoking default exception handler."
        //   139: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   144: aload_0        
        //   145: getfield        com/crashlytics/android/bc.j:Ljava/lang/Thread$UncaughtExceptionHandler;
        //   148: aload_1        
        //   149: aload_2        
        //   150: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //   155: aload_0        
        //   156: getfield        com/crashlytics/android/bc.m:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   159: iconst_0       
        //   160: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   163: aload_0        
        //   164: monitorexit    
        //   165: return         
        //   166: astore          5
        //   168: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   171: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   174: ldc             "Crashlytics"
        //   176: ldc_w           "An error occurred in the uncaught exception handler"
        //   179: aload           5
        //   181: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   186: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   189: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   192: ldc             "Crashlytics"
        //   194: ldc_w           "Crashlytics completed exception processing. Invoking default exception handler."
        //   197: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   202: aload_0        
        //   203: getfield        com/crashlytics/android/bc.j:Ljava/lang/Thread$UncaughtExceptionHandler;
        //   206: aload_1        
        //   207: aload_2        
        //   208: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //   213: aload_0        
        //   214: getfield        com/crashlytics/android/bc.m:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   217: iconst_0       
        //   218: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   221: goto            163
        //   224: astore_3       
        //   225: aload_0        
        //   226: monitorexit    
        //   227: aload_3        
        //   228: athrow         
        //   229: astore          4
        //   231: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //   234: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   237: ldc             "Crashlytics"
        //   239: ldc_w           "Crashlytics completed exception processing. Invoking default exception handler."
        //   242: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   247: aload_0        
        //   248: getfield        com/crashlytics/android/bc.j:Ljava/lang/Thread$UncaughtExceptionHandler;
        //   251: aload_1        
        //   252: aload_2        
        //   253: invokeinterface java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        //   258: aload_0        
        //   259: getfield        com/crashlytics/android/bc.m:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   262: iconst_0       
        //   263: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   266: aload           4
        //   268: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      10     224    229    Any
        //  10     106    166    224    Ljava/lang/Exception;
        //  10     106    229    269    Any
        //  106    128    166    224    Ljava/lang/Exception;
        //  106    128    229    269    Any
        //  128    163    224    229    Any
        //  168    186    229    269    Any
        //  186    221    224    229    Any
        //  231    269    224    229    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0106:
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
}
