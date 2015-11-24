// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

public final class bw
{
    private static aa a;
    private HttpURLConnection b;
    private URL c;
    private final String d;
    private ae e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    
    static {
        bw.a = aa.a;
    }
    
    private bw(final CharSequence charSequence, final String d) {
        this.b = null;
        this.g = true;
        this.h = false;
        this.i = 8192;
        try {
            this.c = new URL(charSequence.toString());
            this.d = d;
        }
        catch (MalformedURLException ex) {
            throw new aD(ex);
        }
    }
    
    private bw a(final InputStream inputStream, final OutputStream outputStream) {
        return (bw)new bx(this, inputStream, this.g, inputStream, outputStream).call();
    }
    
    public static bw a(final CharSequence charSequence) {
        return new bw(charSequence, "PUT");
    }
    
    public static bw a(final CharSequence charSequence, final Map map, final boolean b) {
        return new bw(c((CharSequence)a(charSequence, map)), "GET");
    }
    
    private bw a(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"").append(s);
        if (s2 != null) {
            sb.append("\"; filename=\"").append(s2);
        }
        sb.append('\"');
        this.d("Content-Disposition", sb.toString());
        if (s3 != null) {
            this.d("Content-Type", s3);
        }
        return this.d((CharSequence)"\r\n");
    }
    
    private bw a(final String s, final String s2, final String s3, final String s4) {
        try {
            this.j();
            this.a(s, s2, null);
            this.e.a(s4);
            return this;
        }
        catch (IOException ex) {
            throw new aD(ex);
        }
    }
    
    private static String a(final CharSequence charSequence, final Map map) {
        final String string = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return string;
        }
        final StringBuilder sb = new StringBuilder(string);
        if (2 + string.indexOf(58) == string.lastIndexOf(47)) {
            sb.append('/');
        }
        final int index = string.indexOf(63);
        final int n = -1 + sb.length();
        if (index == -1) {
            sb.append('?');
        }
        else if (index < n && string.charAt(n) != '&') {
            sb.append('&');
        }
        final Iterator<Map.Entry<Object, V>> iterator = map.entrySet().iterator();
        final Map.Entry<Object, V> entry = iterator.next();
        sb.append(entry.getKey().toString());
        sb.append('=');
        final V value = entry.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (iterator.hasNext()) {
            sb.append('&');
            final Map.Entry<Object, V> entry2 = iterator.next();
            sb.append(entry2.getKey().toString());
            sb.append('=');
            final V value2 = entry2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }
    
    public static bw b(final CharSequence charSequence) {
        return new bw(charSequence, "DELETE");
    }
    
    public static bw b(final CharSequence charSequence, final Map map, final boolean b) {
        return new bw(c((CharSequence)a(charSequence, map)), "POST");
    }
    
    private bw b(final String s, final String s2, final String s3) {
        return this.a(s, s2, null, s3);
    }
    
    private static String c(final CharSequence p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/net/URL;
        //     3: dup            
        //     4: aload_0        
        //     5: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    10: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    13: astore_1       
        //    14: aload_1        
        //    15: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //    18: astore_2       
        //    19: aload_1        
        //    20: invokevirtual   java/net/URL.getPort:()I
        //    23: istore_3       
        //    24: iload_3        
        //    25: iconst_m1      
        //    26: if_icmpeq       56
        //    29: new             Ljava/lang/StringBuilder;
        //    32: dup            
        //    33: invokespecial   java/lang/StringBuilder.<init>:()V
        //    36: aload_2        
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: bipush          58
        //    42: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    45: iload_3        
        //    46: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    55: astore_2       
        //    56: new             Ljava/net/URI;
        //    59: dup            
        //    60: aload_1        
        //    61: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //    64: aload_2        
        //    65: aload_1        
        //    66: invokevirtual   java/net/URL.getPath:()Ljava/lang/String;
        //    69: aload_1        
        //    70: invokevirtual   java/net/URL.getQuery:()Ljava/lang/String;
        //    73: aconst_null    
        //    74: invokespecial   java/net/URI.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    77: invokevirtual   java/net/URI.toASCIIString:()Ljava/lang/String;
        //    80: astore          7
        //    82: aload           7
        //    84: bipush          63
        //    86: invokevirtual   java/lang/String.indexOf:(I)I
        //    89: istore          8
        //    91: iload           8
        //    93: ifle            156
        //    96: iload           8
        //    98: iconst_1       
        //    99: iadd           
        //   100: aload           7
        //   102: invokevirtual   java/lang/String.length:()I
        //   105: if_icmpge       156
        //   108: new             Ljava/lang/StringBuilder;
        //   111: dup            
        //   112: invokespecial   java/lang/StringBuilder.<init>:()V
        //   115: aload           7
        //   117: iconst_0       
        //   118: iload           8
        //   120: iconst_1       
        //   121: iadd           
        //   122: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: aload           7
        //   130: iload           8
        //   132: iconst_1       
        //   133: iadd           
        //   134: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   137: ldc             "+"
        //   139: ldc             "%2B"
        //   141: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   150: astore          9
        //   152: aload           9
        //   154: astore          7
        //   156: aload           7
        //   158: areturn        
        //   159: astore          10
        //   161: new             Lcom/crashlytics/android/internal/aD;
        //   164: dup            
        //   165: aload           10
        //   167: invokespecial   com/crashlytics/android/internal/aD.<init>:(Ljava/io/IOException;)V
        //   170: athrow         
        //   171: astore          4
        //   173: new             Ljava/io/IOException;
        //   176: dup            
        //   177: ldc             "Parsing URI failed"
        //   179: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   182: astore          5
        //   184: aload           5
        //   186: aload           4
        //   188: invokevirtual   java/io/IOException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   191: pop            
        //   192: new             Lcom/crashlytics/android/internal/aD;
        //   195: dup            
        //   196: aload           5
        //   198: invokespecial   com/crashlytics/android/internal/aD.<init>:(Ljava/io/IOException;)V
        //   201: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  0      14     159    171    Ljava/io/IOException;
        //  56     91     171    202    Ljava/net/URISyntaxException;
        //  96     152    171    202    Ljava/net/URISyntaxException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    
    private static String c(final String s) {
        if (s != null && s.length() > 0) {
            return s;
        }
        return "UTF-8";
    }
    
    private static String c(final String s, final String s2) {
        String trim;
        if (s == null || s.length() == 0) {
            trim = null;
        }
        else {
            final int length = s.length();
            final int n = 1 + s.indexOf(59);
            if (n == 0 || n == length) {
                return null;
            }
            final int index = s.indexOf(59, n);
            int i;
            int n2;
            if (index == -1) {
                i = n;
                n2 = length;
            }
            else {
                i = n;
                n2 = index;
            }
            while (i < n2) {
                final int index2 = s.indexOf(61, i);
                if (index2 != -1 && index2 < n2 && s2.equals(s.substring(i, index2).trim())) {
                    trim = s.substring(index2 + 1, n2).trim();
                    final int length2 = trim.length();
                    if (length2 != 0) {
                        if (length2 > 2 && '\"' == trim.charAt(0) && '\"' == trim.charAt(length2 - 1)) {
                            return trim.substring(1, length2 - 1);
                        }
                        return trim;
                    }
                }
                final int n3 = n2 + 1;
                int index3 = s.indexOf(59, n3);
                if (index3 == -1) {
                    index3 = length;
                }
                final int n4 = index3;
                i = n3;
                n2 = n4;
            }
            return null;
        }
        return trim;
    }
    
    private bw d(final CharSequence charSequence) {
        try {
            this.i();
            this.e.a(charSequence.toString());
            return this;
        }
        catch (IOException ex) {
            throw new aD(ex);
        }
    }
    
    private bw d(final String s, final String s2) {
        return this.d((CharSequence)s).d((CharSequence)": ").d((CharSequence)s2).d((CharSequence)"\r\n");
    }
    
    private String d(final String s) {
        this.h();
        final int headerFieldInt = this.a().getHeaderFieldInt("Content-Length", -1);
        Label_0067: {
            if (headerFieldInt <= 0) {
                break Label_0067;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(headerFieldInt);
            try {
                while (true) {
                    this.a(new BufferedInputStream(this.f(), this.i), byteArrayOutputStream);
                    return byteArrayOutputStream.toString(c(s));
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    continue;
                }
            }
            catch (IOException ex) {
                throw new aD(ex);
            }
        }
    }
    
    private HttpURLConnection e() {
        try {
            final HttpURLConnection a = bw.a.a(this.c);
            a.setRequestMethod(this.d);
            return a;
        }
        catch (IOException ex) {
            throw new aD(ex);
        }
    }
    
    private InputStream f() {
        Label_0036: {
            if (this.b() >= 400) {
                break Label_0036;
            }
            try {
                return this.a().getInputStream();
            }
            catch (IOException ex) {
                throw new aD(ex);
            }
        }
        final InputStream inputStream = this.a().getErrorStream();
        if (inputStream != null) {
            return inputStream;
        }
        try {
            return this.a().getInputStream();
        }
        catch (IOException ex2) {
            throw new aD(ex2);
        }
    }
    
    private bw g() {
        if (this.e == null) {
            return this;
        }
        if (this.f) {
            this.e.a("\r\n--00content0boundary00--\r\n");
        }
        Label_0048: {
            if (!this.g) {
                break Label_0048;
            }
            while (true) {
                while (true) {
                    try {
                        this.e.close();
                        this.e = null;
                        return this;
                        this.e.close();
                        continue;
                    }
                    catch (IOException ex) {
                        continue;
                    }
                    continue;
                }
            }
        }
    }
    
    private bw h() {
        try {
            return this.g();
        }
        catch (IOException ex) {
            throw new aD(ex);
        }
    }
    
    private bw i() {
        if (this.e != null) {
            return this;
        }
        this.a().setDoOutput(true);
        this.e = new ae(this.a().getOutputStream(), c(this.a().getRequestProperty("Content-Type"), "charset"), this.i);
        return this;
    }
    
    private bw j() {
        if (!this.f) {
            this.f = true;
            this.a("Content-Type", "multipart/form-data; boundary=00content0boundary00").i();
            this.e.a("--00content0boundary00\r\n");
            return this;
        }
        this.e.a("\r\n--00content0boundary00\r\n");
        return this;
    }
    
    public final bw a(final int n) {
        this.a().setConnectTimeout(10000);
        return this;
    }
    
    public final bw a(final String s, final Number n) {
        String string;
        if (n != null) {
            string = n.toString();
        }
        else {
            string = null;
        }
        return this.b(s, null, string);
    }
    
    public final bw a(final String s, final String s2) {
        this.a().setRequestProperty(s, s2);
        return this;
    }
    
    public final bw a(final String p0, final String p1, final String p2, final File p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/BufferedInputStream;
        //     3: dup            
        //     4: new             Ljava/io/FileInputStream;
        //     7: dup            
        //     8: aload           4
        //    10: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    13: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    16: astore          5
        //    18: aload_0        
        //    19: aload_1        
        //    20: aload_2        
        //    21: aload_3        
        //    22: aload           5
        //    24: invokevirtual   com/crashlytics/android/internal/bw.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lcom/crashlytics/android/internal/bw;
        //    27: astore          9
        //    29: aload           5
        //    31: invokevirtual   java/io/InputStream.close:()V
        //    34: aload           9
        //    36: areturn        
        //    37: astore          6
        //    39: aconst_null    
        //    40: astore          5
        //    42: new             Lcom/crashlytics/android/internal/aD;
        //    45: dup            
        //    46: aload           6
        //    48: invokespecial   com/crashlytics/android/internal/aD.<init>:(Ljava/io/IOException;)V
        //    51: athrow         
        //    52: astore          7
        //    54: aload           5
        //    56: ifnull          64
        //    59: aload           5
        //    61: invokevirtual   java/io/InputStream.close:()V
        //    64: aload           7
        //    66: athrow         
        //    67: astore          10
        //    69: aload           9
        //    71: areturn        
        //    72: astore          8
        //    74: goto            64
        //    77: astore          7
        //    79: aconst_null    
        //    80: astore          5
        //    82: goto            54
        //    85: astore          6
        //    87: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      18     37     42     Ljava/io/IOException;
        //  0      18     77     85     Any
        //  18     29     85     90     Ljava/io/IOException;
        //  18     29     52     54     Any
        //  29     34     67     72     Ljava/io/IOException;
        //  42     52     52     54     Any
        //  59     64     72     77     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    public final bw a(final String s, final String s2, final String s3, final InputStream inputStream) {
        try {
            this.j();
            this.a(s, s2, s3);
            this.a(inputStream, this.e);
            return this;
        }
        catch (IOException ex) {
            throw new aD(ex);
        }
    }
    
    public final bw a(final Map.Entry entry) {
        return this.a(entry.getKey(), entry.getValue());
    }
    
    public final bw a(final boolean b) {
        this.a().setUseCaches(false);
        return this;
    }
    
    public final String a(final String s) {
        this.h();
        return this.a().getHeaderField(s);
    }
    
    public final HttpURLConnection a() {
        if (this.b == null) {
            this.b = this.e();
        }
        return this.b;
    }
    
    public final int b() {
        try {
            this.g();
            return this.a().getResponseCode();
        }
        catch (IOException ex) {
            throw new aD(ex);
        }
    }
    
    public final bw b(final String s, final String s2) {
        return this.b(s, null, s2);
    }
    
    public final String c() {
        return this.d(c(this.a("Content-Type"), "charset"));
    }
    
    public final String d() {
        return this.a().getRequestMethod();
    }
    
    @Override
    public final String toString() {
        return this.a().getRequestMethod() + ' ' + this.a().getURL();
    }
}
