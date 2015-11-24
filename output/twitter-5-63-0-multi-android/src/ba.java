import javax.net.ssl.SSLSocket;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import com.squareup.okhttp.Protocol;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class ba
{
    private static final ba a;
    
    static {
        a = c();
    }
    
    public static ba a() {
        return ba.a;
    }
    
    static byte[] a(final List list) {
        final Iterator<Protocol> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += 1 + iterator.next().name.e();
        }
        final byte[] array = new byte[n];
        final Iterator<Protocol> iterator2 = list.iterator();
        int n2 = 0;
        while (iterator2.hasNext()) {
            final Protocol protocol = iterator2.next();
            final int e = protocol.name.e();
            final int n3 = n2 + 1;
            array[n2] = (byte)e;
            System.arraycopy(protocol.name.f(), 0, array, n3, e);
            n2 = n3 + e;
        }
        return array;
    }
    
    private static ba c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             "com.android.org.conscrypt.OpenSSLSocketImpl"
        //     2: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //     5: astore          30
        //     7: aload           30
        //     9: astore          11
        //    11: iconst_1       
        //    12: anewarray       Ljava/lang/Class;
        //    15: astore          12
        //    17: aload           12
        //    19: iconst_0       
        //    20: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    23: aastore        
        //    24: aload           11
        //    26: ldc             "setUseSessionTickets"
        //    28: aload           12
        //    30: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    33: astore          13
        //    35: aload           11
        //    37: ldc             "setHostname"
        //    39: iconst_1       
        //    40: anewarray       Ljava/lang/Class;
        //    43: dup            
        //    44: iconst_0       
        //    45: ldc             Ljava/lang/String;.class
        //    47: aastore        
        //    48: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    51: astore          14
        //    53: aload           11
        //    55: ldc             "setNpnProtocols"
        //    57: iconst_1       
        //    58: anewarray       Ljava/lang/Class;
        //    61: dup            
        //    62: iconst_0       
        //    63: ldc             [B.class
        //    65: aastore        
        //    66: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    69: astore          20
        //    71: aload           11
        //    73: ldc             "getNpnSelectedProtocol"
        //    75: iconst_0       
        //    76: anewarray       Ljava/lang/Class;
        //    79: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    82: astore          22
        //    84: aload           11
        //    86: ldc             "setAlpnProtocols"
        //    88: iconst_1       
        //    89: anewarray       Ljava/lang/Class;
        //    92: dup            
        //    93: iconst_0       
        //    94: ldc             [B.class
        //    96: aastore        
        //    97: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   100: astore          27
        //   102: aload           27
        //   104: astore          25
        //   106: aload           11
        //   108: ldc             "getAlpnSelectedProtocol"
        //   110: iconst_0       
        //   111: anewarray       Ljava/lang/Class;
        //   114: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   117: astore          29
        //   119: aload           29
        //   121: astore          24
        //   123: aload           24
        //   125: astore          19
        //   127: aload           25
        //   129: astore          26
        //   131: aload           20
        //   133: astore          16
        //   135: aload           22
        //   137: astore          17
        //   139: aload           26
        //   141: astore          18
        //   143: new             Lbc;
        //   146: dup            
        //   147: aload           11
        //   149: aload           13
        //   151: aload           14
        //   153: aload           16
        //   155: aload           17
        //   157: aload           18
        //   159: aload           19
        //   161: aconst_null    
        //   162: invokespecial   bc.<init>:(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lbb;)V
        //   165: areturn        
        //   166: astore          8
        //   168: ldc             "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"
        //   170: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   173: astore          10
        //   175: aload           10
        //   177: astore          11
        //   179: goto            11
        //   182: astore          15
        //   184: aconst_null    
        //   185: astore          16
        //   187: aconst_null    
        //   188: astore          17
        //   190: aconst_null    
        //   191: astore          18
        //   193: aconst_null    
        //   194: astore          19
        //   196: goto            143
        //   199: astore_0       
        //   200: ldc             "org.eclipse.jetty.npn.NextProtoNego"
        //   202: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   205: astore_3       
        //   206: new             Ljava/lang/StringBuilder;
        //   209: dup            
        //   210: invokespecial   java/lang/StringBuilder.<init>:()V
        //   213: ldc             "org.eclipse.jetty.npn.NextProtoNego"
        //   215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   218: ldc             "$Provider"
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   226: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   229: astore          4
        //   231: new             Ljava/lang/StringBuilder;
        //   234: dup            
        //   235: invokespecial   java/lang/StringBuilder.<init>:()V
        //   238: ldc             "org.eclipse.jetty.npn.NextProtoNego"
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: ldc             "$ClientProvider"
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   251: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   254: astore          5
        //   256: new             Ljava/lang/StringBuilder;
        //   259: dup            
        //   260: invokespecial   java/lang/StringBuilder.<init>:()V
        //   263: ldc             "org.eclipse.jetty.npn.NextProtoNego"
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   268: ldc             "$ServerProvider"
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   276: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   279: astore          6
        //   281: new             Lbd;
        //   284: dup            
        //   285: aload_3        
        //   286: ldc             "put"
        //   288: iconst_2       
        //   289: anewarray       Ljava/lang/Class;
        //   292: dup            
        //   293: iconst_0       
        //   294: ldc             Ljavax/net/ssl/SSLSocket;.class
        //   296: aastore        
        //   297: dup            
        //   298: iconst_1       
        //   299: aload           4
        //   301: aastore        
        //   302: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   305: aload_3        
        //   306: ldc             "get"
        //   308: iconst_1       
        //   309: anewarray       Ljava/lang/Class;
        //   312: dup            
        //   313: iconst_0       
        //   314: ldc             Ljavax/net/ssl/SSLSocket;.class
        //   316: aastore        
        //   317: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   320: aload           5
        //   322: aload           6
        //   324: invokespecial   bd.<init>:(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
        //   327: astore          7
        //   329: aload           7
        //   331: areturn        
        //   332: astore_2       
        //   333: new             Lba;
        //   336: dup            
        //   337: invokespecial   ba.<init>:()V
        //   340: areturn        
        //   341: astore_1       
        //   342: goto            333
        //   345: astore          9
        //   347: goto            200
        //   350: astore          21
        //   352: aload           20
        //   354: astore          16
        //   356: goto            187
        //   359: astore          23
        //   361: aconst_null    
        //   362: astore          24
        //   364: aconst_null    
        //   365: astore          25
        //   367: goto            123
        //   370: astore          28
        //   372: aconst_null    
        //   373: astore          24
        //   375: goto            123
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      7      166    182    Ljava/lang/ClassNotFoundException;
        //  0      7      199    200    Ljava/lang/NoSuchMethodException;
        //  11     53     345    350    Ljava/lang/ClassNotFoundException;
        //  11     53     199    200    Ljava/lang/NoSuchMethodException;
        //  53     71     182    187    Ljava/lang/NoSuchMethodException;
        //  53     71     345    350    Ljava/lang/ClassNotFoundException;
        //  71     84     350    359    Ljava/lang/NoSuchMethodException;
        //  71     84     345    350    Ljava/lang/ClassNotFoundException;
        //  84     102    359    370    Ljava/lang/NoSuchMethodException;
        //  84     102    345    350    Ljava/lang/ClassNotFoundException;
        //  106    119    370    378    Ljava/lang/NoSuchMethodException;
        //  106    119    345    350    Ljava/lang/ClassNotFoundException;
        //  143    166    345    350    Ljava/lang/ClassNotFoundException;
        //  143    166    199    200    Ljava/lang/NoSuchMethodException;
        //  168    175    345    350    Ljava/lang/ClassNotFoundException;
        //  168    175    199    200    Ljava/lang/NoSuchMethodException;
        //  200    329    332    333    Ljava/lang/ClassNotFoundException;
        //  200    329    341    345    Ljava/lang/NoSuchMethodException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 189, Size: 189
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
    
    public URI a(final URL url) {
        return url.toURI();
    }
    
    public void a(final String s) {
        System.out.println(s);
    }
    
    public void a(final Socket socket) {
    }
    
    public void a(final Socket socket, final InetSocketAddress inetSocketAddress, final int n) {
        socket.connect(inetSocketAddress, n);
    }
    
    public void a(final SSLSocket sslSocket) {
        sslSocket.setEnabledProtocols(new String[] { "SSLv3" });
    }
    
    public void a(final SSLSocket sslSocket, final String s) {
    }
    
    public void a(final SSLSocket sslSocket, final List list) {
    }
    
    public bk b(final SSLSocket sslSocket) {
        return null;
    }
    
    public String b() {
        return "OkHttp";
    }
    
    public void b(final Socket socket) {
    }
}
