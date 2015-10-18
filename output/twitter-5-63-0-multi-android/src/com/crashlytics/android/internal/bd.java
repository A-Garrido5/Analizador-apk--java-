// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.os.Debug;
import android.os.Build;
import android.provider.Settings$Secure;
import android.hardware.SensorManager;
import android.text.TextUtils;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import android.os.StatFs;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.io.OutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.Closeable;
import java.util.Collections;
import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Scanner;
import java.io.InputStream;
import java.io.File;
import java.util.Locale;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.content.res.Resources;
import android.content.Context;
import java.util.Comparator;

public final class bd
{
    public static final Comparator a;
    private static Boolean b;
    private static final char[] c;
    private static long d;
    private static Boolean e;
    
    static {
        bd.b = null;
        c = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        bd.d = -1L;
        bd.e = null;
        a = new be();
    }
    
    public static int a(final Context context, final String s, final String s2) {
        final Resources resources = context.getResources();
        final int icon = context.getApplicationContext().getApplicationInfo().icon;
        String s3;
        if (icon > 0) {
            s3 = context.getResources().getResourcePackageName(icon);
        }
        else {
            s3 = context.getPackageName();
        }
        return resources.getIdentifier(s, s2, s3);
    }
    
    public static int a(final boolean b) {
        final float b2 = b(cl.a().w());
        if (!b) {
            return 1;
        }
        if (b && b2 >= 99.0) {
            return 3;
        }
        if (b && b2 < 99.0) {
            return 2;
        }
        return 0;
    }
    
    public static long a(final Context context) {
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
        return activityManager$MemoryInfo.availMem;
    }
    
    private static long a(final String s, final String s2, final int n) {
        return Long.parseLong(s.split(s2)[0].trim()) * n;
    }
    
    public static ActivityManager$RunningAppProcessInfo a(final String s, final Context context) {
        final List runningAppProcesses = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (activityManager$RunningAppProcessInfo.processName.equals(s)) {
                    return activityManager$RunningAppProcessInfo;
                }
            }
        }
        return null;
    }
    
    public static SharedPreferences a() {
        return cl.a().w().getSharedPreferences("com.crashlytics.prefs", 0);
    }
    
    public static String a(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("value must be zero or greater");
        }
        return String.format(Locale.US, "%1$10s", n).replace(' ', '0');
    }
    
    public static String a(final Context context, final String s) {
        final int a = a(context, s, "string");
        if (a > 0) {
            return context.getString(a);
        }
        return "";
    }
    
    private static String a(final File p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   java/io/File.exists:()Z
        //     4: istore_2       
        //     5: aconst_null    
        //     6: astore_3       
        //     7: iload_2        
        //     8: ifeq            88
        //    11: new             Ljava/io/BufferedReader;
        //    14: dup            
        //    15: new             Ljava/io/FileReader;
        //    18: dup            
        //    19: aload_0        
        //    20: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //    23: sipush          1024
        //    26: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;I)V
        //    29: astore          4
        //    31: aload           4
        //    33: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    36: astore          7
        //    38: aconst_null    
        //    39: astore_3       
        //    40: aload           7
        //    42: ifnull          81
        //    45: ldc             "\\s*:\\s*"
        //    47: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    50: aload           7
        //    52: iconst_2       
        //    53: invokevirtual   java/util/regex/Pattern.split:(Ljava/lang/CharSequence;I)[Ljava/lang/String;
        //    56: astore          8
        //    58: aload           8
        //    60: arraylength    
        //    61: iconst_1       
        //    62: if_icmple       31
        //    65: aload           8
        //    67: iconst_0       
        //    68: aaload         
        //    69: aload_1        
        //    70: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    73: ifeq            31
        //    76: aload           8
        //    78: iconst_1       
        //    79: aaload         
        //    80: astore_3       
        //    81: aload           4
        //    83: ldc             "Failed to close system file reader."
        //    85: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    88: aload_3        
        //    89: areturn        
        //    90: astore          5
        //    92: aconst_null    
        //    93: astore          4
        //    95: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    98: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //   101: ldc             "Crashlytics"
        //   103: new             Ljava/lang/StringBuilder;
        //   106: dup            
        //   107: ldc             "Error parsing "
        //   109: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   112: aload_0        
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   116: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   119: aload           5
        //   121: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   126: aload           4
        //   128: ldc             "Failed to close system file reader."
        //   130: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   133: aconst_null    
        //   134: areturn        
        //   135: astore          9
        //   137: aconst_null    
        //   138: astore          4
        //   140: aload           9
        //   142: astore          6
        //   144: aload           4
        //   146: ldc             "Failed to close system file reader."
        //   148: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   151: aload           6
        //   153: athrow         
        //   154: astore          6
        //   156: goto            144
        //   159: astore          5
        //   161: goto            95
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     31     90     95     Ljava/lang/Exception;
        //  11     31     135    144    Any
        //  31     38     159    164    Ljava/lang/Exception;
        //  31     38     154    159    Any
        //  45     81     159    164    Ljava/lang/Exception;
        //  45     81     154    159    Any
        //  95     126    154    159    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
    
    public static String a(final InputStream inputStream) {
        final Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }
    
    public static String a(final String s) {
        return a(s.getBytes(), "SHA-1");
    }
    
    public static String a(final byte[] array) {
        final char[] array2 = new char[array.length << 1];
        for (int i = 0; i < array.length; ++i) {
            final int n = 0xFF & array[i];
            array2[i << 1] = bd.c[n >>> 4];
            array2[1 + (i << 1)] = bd.c[n & 0xF];
        }
        return new String(array2);
    }
    
    private static String a(final byte[] array, final String s) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(s);
            instance.update(array);
            return a(instance.digest());
        }
        catch (NoSuchAlgorithmException ex) {
            cl.a().b().a("Crashlytics", "Could not create hashing algorithm: " + s + ", returning empty string.", ex);
            return "";
        }
    }
    
    public static String a(final String... array) {
        if (array == null || array.length == 0) {
            return null;
        }
        final ArrayList<String> list = (ArrayList<String>)new ArrayList<Comparable>();
        for (final String s : array) {
            if (s != null) {
                list.add(s.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort((List<Comparable>)list);
        final StringBuilder sb = new StringBuilder();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        final String string = sb.toString();
        if (string.length() > 0) {
            return a(string);
        }
        return null;
    }
    
    public static void a(final int n, final String s) {
        if (e(cl.a().w())) {
            cl.a().b().a(4, "Crashlytics", s);
        }
    }
    
    public static void a(final Closeable closeable, final String s) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {
            cl.a().b().a("Crashlytics", s, ex);
        }
    }
    
    public static void a(final Flushable flushable, final String s) {
        if (flushable == null) {
            return;
        }
        try {
            flushable.flush();
        }
        catch (IOException ex) {
            cl.a().b().a("Crashlytics", s, ex);
        }
    }
    
    public static void a(final InputStream inputStream, final OutputStream outputStream, final byte[] array) {
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            outputStream.write(array, 0, read);
        }
    }
    
    public static boolean a(final Context context, final String s, boolean boolean1) {
        if (context != null) {
            final Resources resources = context.getResources();
            if (resources != null) {
                final int a = a(context, s, "bool");
                if (a > 0) {
                    boolean1 = resources.getBoolean(a);
                }
                else {
                    final int a2 = a(context, s, "string");
                    if (a2 > 0) {
                        return Boolean.parseBoolean(context.getString(a2));
                    }
                }
            }
        }
        return boolean1;
    }
    
    public static float b(final Context context) {
        final Intent registerReceiver = context.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
    }
    
    public static int b() {
        return ad.a().ordinal();
    }
    
    public static long b(final String s) {
        final StatFs statFs = new StatFs(s);
        final long n = statFs.getBlockSize();
        return n * statFs.getBlockCount() - n * statFs.getAvailableBlocks();
    }
    
    public static String b(final int n) {
        switch (n) {
            default: {
                return "?";
            }
            case 7: {
                return "A";
            }
            case 3: {
                return "D";
            }
            case 6: {
                return "E";
            }
            case 4: {
                return "I";
            }
            case 2: {
                return "V";
            }
            case 5: {
                return "W";
            }
        }
    }
    
    private static String b(final InputStream inputStream) {
        MessageDigest instance;
        try {
            instance = MessageDigest.getInstance("SHA-1");
            final byte[] array = new byte[1024];
            while (true) {
                final int read = inputStream.read(array);
                if (read == -1) {
                    break;
                }
                instance.update(array, 0, read);
            }
        }
        catch (Exception ex) {
            cl.a().b().a("Crashlytics", "Could not calculate hash for app icon.", ex);
            return "";
        }
        return a(instance.digest());
    }
    
    public static Cipher b(final int n, final String s) {
        if (s.length() < 32) {
            throw new InvalidKeyException("Key must be at least 32 bytes.");
        }
        final SecretKeySpec secretKeySpec = new SecretKeySpec(s.getBytes(), 0, 32, "AES/ECB/PKCS7Padding");
        try {
            final Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
            instance.init(1, secretKeySpec);
            return instance;
        }
        catch (GeneralSecurityException ex) {
            cl.a().b().a("Crashlytics", "Could not create Cipher for AES/ECB/PKCS7Padding - should never happen.", ex);
            throw new RuntimeException(ex);
        }
    }
    
    public static long c() {
        synchronized (bd.class) {
            while (true) {
                Label_0079: {
                    if (bd.d != -1L) {
                        break Label_0079;
                    }
                    final String a = a(new File("/proc/meminfo"), "MemTotal");
                    if (TextUtils.isEmpty((CharSequence)a)) {
                        break Label_0079;
                    }
                    final String upperCase = a.toUpperCase(Locale.US);
                    try {
                        long d;
                        if (upperCase.endsWith("KB")) {
                            d = a(upperCase, "KB", 1024);
                        }
                        else if (upperCase.endsWith("MB")) {
                            d = a(upperCase, "MB", 1048576);
                        }
                        else if (upperCase.endsWith("GB")) {
                            d = a(upperCase, "GB", 1073741824);
                        }
                        else {
                            cl.a().b().a("Crashlytics", "Unexpected meminfo format while computing RAM: " + upperCase);
                            d = 0L;
                        }
                        bd.d = d;
                        return bd.d;
                    }
                    catch (NumberFormatException ex) {
                        cl.a().b().a("Crashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, ex);
                    }
                }
                long d = 0L;
                continue;
            }
        }
    }
    
    public static void c(final String s) {
        if (e(cl.a().w())) {
            cl.a().b().a("Crashlytics", s);
        }
    }
    
    public static boolean c(final Context context) {
        return !d() && ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }
    
    public static void d(final String s) {
        if (e(cl.a().w())) {
            cl.a().b().d("Crashlytics", s);
        }
    }
    
    public static boolean d() {
        final String string = Settings$Secure.getString(cl.a().w().getContentResolver(), "android_id");
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || string == null;
    }
    
    public static boolean d(final Context context) {
        if (bd.e == null) {
            final boolean a = a(context, "com.crashlytics.SilenceCrashlyticsLogCat", false);
            boolean b = false;
            if (!a) {
                b = true;
            }
            bd.e = b;
        }
        return bd.e;
    }
    
    public static boolean e() {
        final boolean d = d();
        final String tags = Build.TAGS;
        if ((d || tags == null || !tags.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            final File file = new File("/system/xbin/su");
            if (d || !file.exists()) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean e(final Context context) {
        if (bd.b == null) {
            bd.b = a(context, "com.crashlytics.Trace", false);
        }
        return bd.b;
    }
    
    public static boolean e(final String s) {
        return s == null || s.length() == 0;
    }
    
    public static int f() {
        int n;
        if (d()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (e()) {
            n |= 0x2;
        }
        boolean b = false;
        Label_0036: {
            if (!Debug.isDebuggerConnected()) {
                final boolean waitingForDebugger = Debug.waitingForDebugger();
                b = false;
                if (!waitingForDebugger) {
                    break Label_0036;
                }
            }
            b = true;
        }
        if (b) {
            n |= 0x4;
        }
        return n;
    }
    
    public static boolean f(final Context context) {
        return (0x2 & context.getApplicationInfo().flags) != 0x0;
    }
    
    public static String g(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //     4: aload_0        
        //     5: invokestatic    com/crashlytics/android/internal/bd.h:(Landroid/content/Context;)I
        //     8: invokevirtual   android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
        //    11: astore          5
        //    13: aload           5
        //    15: astore_2       
        //    16: aload_2        
        //    17: invokestatic    com/crashlytics/android/internal/bd.b:(Ljava/io/InputStream;)Ljava/lang/String;
        //    20: astore          6
        //    22: aload           6
        //    24: invokestatic    com/crashlytics/android/internal/bd.e:(Ljava/lang/String;)Z
        //    27: istore          7
        //    29: aconst_null    
        //    30: astore          8
        //    32: iload           7
        //    34: ifeq            47
        //    37: aload_2        
        //    38: ldc_w           "Failed to close icon input stream."
        //    41: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    44: aload           8
        //    46: areturn        
        //    47: aload           6
        //    49: astore          8
        //    51: goto            37
        //    54: astore          4
        //    56: aconst_null    
        //    57: astore_2       
        //    58: invokestatic    com/crashlytics/android/internal/cl.a:()Lcom/crashlytics/android/internal/cl;
        //    61: invokevirtual   com/crashlytics/android/internal/cl.b:()Lcom/crashlytics/android/internal/ci;
        //    64: ldc             "Crashlytics"
        //    66: ldc_w           "Could not calculate hash for app icon."
        //    69: aload           4
        //    71: invokeinterface com/crashlytics/android/internal/ci.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //    76: aload_2        
        //    77: ldc_w           "Failed to close icon input stream."
        //    80: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    83: aconst_null    
        //    84: areturn        
        //    85: astore_1       
        //    86: aconst_null    
        //    87: astore_2       
        //    88: aload_1        
        //    89: astore_3       
        //    90: aload_2        
        //    91: ldc_w           "Failed to close icon input stream."
        //    94: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    97: aload_3        
        //    98: athrow         
        //    99: astore_3       
        //   100: goto            90
        //   103: astore          4
        //   105: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      13     54     58     Ljava/lang/Exception;
        //  0      13     85     90     Any
        //  16     29     103    108    Ljava/lang/Exception;
        //  16     29     99     103    Any
        //  58     76     99     103    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    public static int h(final Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }
    
    public static String i(final Context context) {
        final int a = a(context, "com.crashlytics.android.build_id", "string");
        String string = null;
        if (a != 0) {
            string = context.getResources().getString(a);
            cl.a().b().a("Crashlytics", "Build ID is: " + string);
        }
        return string;
    }
}
