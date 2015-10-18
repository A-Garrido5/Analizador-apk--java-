// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.io.InputStream;
import javax.net.ssl.SSLSocket;
import java.net.SocketAddress;
import com.whatsapp.util.Log;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.a1;
import java.io.OutputStream;
import java.net.Socket;
import java.net.InetAddress;
import com.whatsapp.App;
import com.whatsapp.util.dns.DnsCacheEntrySerializable;
import java.util.Random;
import javax.net.ssl.SSLSocketFactory;
import javax.net.SocketFactory;
import java.util.List;
import java.net.InetSocketAddress;

final class bz
{
    private static final String[] k;
    private static final String[] z;
    private final int a;
    private final int b;
    private final InetSocketAddress c;
    private int d;
    private final List e;
    private final String f;
    private final SocketFactory g;
    private final boolean h;
    private r i;
    private final SSLSocketFactory j;
    private final List l;
    private final Random m;
    
    static {
        final String[] array = new String[7];
        String s = "\u001b\u0019^\u0014G!\u0010B\u0018^+\u0013\f\u0002P/\u0003IQ";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0730:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = ',';
                        break;
                    }
                    case 3: {
                        c2 = 'q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "\u0003\u0002_\u0005\u0004-\u0016@\u001d\u0004#\u0018Z\u0014p!9I\tPn\u0011E\u0003W:";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "\r\u0016B\u001fK:W^\u0014P<\u001eI\u0007An\u0004C\u0012O+\u0003\f\u0001E=\u0003\f\u0014J*";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "\u001b\u0019^\u0014G!\u0010B\u0018^+\u0013\f\u0002P/\u0003IQ";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = "\r\u0016B\u001fK:W^\u0014P<\u001eI\u0007An\u0016H\u0015V+\u0004_QT/\u0004XQA \u0013";
                    n2 = 4;
                    array2 = array3;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    array2 = array3;
                    s = "\u0003\u0002_\u0005\u0004-\u0016@\u001d\u0004#\u0018Z\u0014p!9I\tPn\u0011E\u0003W:";
                    n = 4;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "-\u0018B\u001fA-\u0003E\u001eJ\u0011\u0004I\u0000Q+\u0019O\u0014\u000b:\u0005U.G!\u0019B\u0014G:X\t\u0002\u0004f\u001aI\u0005L!\u0013\u0013Q\u0001,^";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = new String[16];
                    s = "+F\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 6;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    s = "+E\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 7;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    s = "+D\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 8;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    s = "+C\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 9;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    s = "+B\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 10;
                    n2 = 4;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "+A\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "+@\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "+O\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "+N\u0002\u0006L/\u0003_\u0010T>YB\u0014P`";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "+F\u001c_S&\u0016X\u0002E>\u0007\u0002\u001fA:Y";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "+F\u001d_S&\u0016X\u0002E>\u0007\u0002\u001fA:Y";
                    n = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "+F\u001e_S&\u0016X\u0002E>\u0007\u0002\u001fA:Y";
                    n = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "+F\u001f_S&\u0016X\u0002E>\u0007\u0002\u001fA:Y";
                    n = 18;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "+F\u0018_S&\u0016X\u0002E>\u0007\u0002\u001fA:Y";
                    n = 19;
                    array2 = array3;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "+F\u0019_S&\u0016X\u0002E>\u0007\u0002\u001fA:Y";
                    n = 20;
                    array2 = array3;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "+F\u001a_S&\u0016X\u0002E>\u0007\u0002\u001fA:Y";
                    n = 21;
                    array2 = array3;
                    continue;
                }
                case 21: {
                    break Label_0730;
                }
            }
        }
        array2[n2] = intern;
        k = array3;
    }
    
    public bz(final InetSocketAddress inetSocketAddress, final String s, final List list, final Random random) {
        this(inetSocketAddress, s, list, random, e());
    }
    
    private bz(final InetSocketAddress p0, final String p1, final List p2, final Random p3, final boolean p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore          6
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0        
        //    10: getstatic       com/whatsapp/messaging/r.START:Lcom/whatsapp/messaging/r;
        //    13: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        com/whatsapp/messaging/bz.c:Ljava/net/InetSocketAddress;
        //    21: aload_0        
        //    22: aload_2        
        //    23: putfield        com/whatsapp/messaging/bz.f:Ljava/lang/String;
        //    26: aload_0        
        //    27: aload           4
        //    29: putfield        com/whatsapp/messaging/bz.m:Ljava/util/Random;
        //    32: aload_0        
        //    33: new             Ljava/util/ArrayList;
        //    36: dup            
        //    37: invokespecial   java/util/ArrayList.<init>:()V
        //    40: putfield        com/whatsapp/messaging/bz.e:Ljava/util/List;
        //    43: aload_0        
        //    44: new             Ljava/util/ArrayList;
        //    47: dup            
        //    48: invokespecial   java/util/ArrayList.<init>:()V
        //    51: putfield        com/whatsapp/messaging/bz.l:Ljava/util/List;
        //    54: aload_3        
        //    55: ifnull          134
        //    58: aload_3        
        //    59: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    64: astore          11
        //    66: aload           11
        //    68: invokeinterface java/util/Iterator.hasNext:()Z
        //    73: ifeq            134
        //    76: aload           11
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: checkcast       Lcom/whatsapp/util/dns/DnsCacheEntrySerializable;
        //    86: astore          12
        //    88: aload           12
        //    90: invokevirtual   com/whatsapp/util/dns/DnsCacheEntrySerializable.isForceOverride:()Z
        //    93: istore          15
        //    95: iload           15
        //    97: ifeq            117
        //   100: aload_0        
        //   101: getfield        com/whatsapp/messaging/bz.e:Ljava/util/List;
        //   104: aload           12
        //   106: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   111: pop            
        //   112: iload           6
        //   114: ifeq            129
        //   117: aload_0        
        //   118: getfield        com/whatsapp/messaging/bz.l:Ljava/util/List;
        //   121: aload           12
        //   123: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   128: pop            
        //   129: iload           6
        //   131: ifeq            66
        //   134: aload_0        
        //   135: invokestatic    com/whatsapp/messaging/aw.a:()Lcom/whatsapp/messaging/aw;
        //   138: putfield        com/whatsapp/messaging/bz.j:Ljavax/net/ssl/SSLSocketFactory;
        //   141: aload_0        
        //   142: invokestatic    javax/net/SocketFactory.getDefault:()Ljavax/net/SocketFactory;
        //   145: putfield        com/whatsapp/messaging/bz.g:Ljavax/net/SocketFactory;
        //   148: aload           4
        //   150: invokevirtual   java/util/Random.nextBoolean:()Z
        //   153: istore          7
        //   155: iload           7
        //   157: ifeq            204
        //   160: sipush          443
        //   163: istore          8
        //   165: aload_0        
        //   166: iload           8
        //   168: putfield        com/whatsapp/messaging/bz.b:I
        //   171: iload           7
        //   173: ifeq            217
        //   176: sipush          5222
        //   179: istore          10
        //   181: aload_0        
        //   182: iload           10
        //   184: putfield        com/whatsapp/messaging/bz.a:I
        //   187: aload_0        
        //   188: iload           5
        //   190: putfield        com/whatsapp/messaging/bz.h:Z
        //   193: return         
        //   194: astore          13
        //   196: aload           13
        //   198: athrow         
        //   199: astore          14
        //   201: aload           14
        //   203: athrow         
        //   204: sipush          5222
        //   207: istore          8
        //   209: goto            165
        //   212: astore          9
        //   214: aload           9
        //   216: athrow         
        //   217: sipush          443
        //   220: istore          10
        //   222: goto            181
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  88     95     194    199    Ljava/lang/IllegalStateException;
        //  100    112    199    204    Ljava/lang/IllegalStateException;
        //  117    129    199    204    Ljava/lang/IllegalStateException;
        //  165    171    212    217    Ljava/lang/IllegalStateException;
        //  196    199    199    204    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 99, Size: 99
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    private boolean b() {
        try {
            final int n = be.a[this.i.ordinal()];
            final boolean secureSocket = false;
            switch (n) {
                default: {
                    throw new IllegalStateException(bz.z[0] + this.i);
                }
                case 1: {
                    throw new IllegalStateException(bz.z[1]);
                }
                case 3: {
                    break;
                }
                case 2:
                case 4:
                case 5:
                case 6:
                case 8: {
                    return secureSocket;
                }
                case 7: {
                    return this.l.get(this.d).isSecureSocket();
                }
                case 9: {
                    throw new IllegalStateException(bz.z[2]);
                }
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return this.e.get(this.d).isSecureSocket();
    }
    
    private InetSocketAddress d() {
        Label_0283: {
            Label_0170: {
                try {
                    switch (be.a[this.i.ordinal()]) {
                        default: {
                            throw new IllegalStateException(bz.z[3] + this.i);
                        }
                        case 1: {
                            throw new IllegalStateException(bz.z[5]);
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            return this.e.get(this.d).getInetSocketAddress();
                        }
                        case 4: {
                            return new InetSocketAddress(this.f, this.b);
                        }
                        case 5: {
                            return new InetSocketAddress(this.f, this.a);
                        }
                        case 6: {
                            break Label_0170;
                        }
                        case 7: {
                            return this.l.get(this.d).getInetSocketAddress();
                        }
                        case 8: {
                            break Label_0283;
                        }
                        case 9: {
                            throw new IllegalStateException(bz.z[4]);
                        }
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                return this.c;
            }
            while (true) {
                final List d = App.g.d(bz.k[this.m.nextInt(bz.k.length)]);
                final InetAddress inetAddress = d.get(this.m.nextInt(d.size()));
                while (true) {
                    try {
                        if (this.m.nextBoolean()) {
                            final int n = 443;
                            return new InetSocketAddress(inetAddress, n);
                        }
                    }
                    catch (IllegalStateException ex2) {
                        throw ex2;
                    }
                    final int n = 5222;
                    continue;
                }
            }
            return this.c;
        }
        final List d2 = App.g.d(bz.k[this.m.nextInt(bz.k.length)]);
        return new InetSocketAddress(d2.get(this.m.nextInt(d2.size())), 80);
    }
    
    public static boolean e() {
        return true;
    }
    
    public OutputStream a(final Socket socket) {
        try {
            if (this.i == r.HTTP) {
                return new av(socket.getOutputStream());
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return socket.getOutputStream();
    }
    
    public Socket a(final int n) {
        try {
            if (this.i == r.HTTP) {
                a5.a(App.aq.getApplicationContext(), a1.PSEUDO_HTTP_CONNECTION_ATTEMPT, Integer.valueOf(1));
            }
            final InetSocketAddress d = this.d();
            final boolean b = this.b();
            Log.c(bz.z[6], null, new Object[] { d, b });
            Socket socket = this.g.createSocket();
            socket.connect(d, n);
            if (b) {
                socket = this.j.createSocket(socket, d.getHostName(), d.getPort(), true);
                ((SSLSocket)socket).startHandshake();
            }
            return socket;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/messaging/e.a:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/messaging/be.a:[I
        //     7: aload_0        
        //     8: getfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //    11: invokevirtual   com/whatsapp/messaging/r.ordinal:()I
        //    14: iaload         
        //    15: istore          19
        //    17: iload           19
        //    19: tableswitch {
        //                2: 91
        //                3: 176
        //                4: 187
        //                5: 257
        //                6: 268
        //                7: 279
        //                8: 333
        //                9: 389
        //          default: 64
        //        }
        //    64: aload_0        
        //    65: getfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //    68: astore          22
        //    70: getstatic       com/whatsapp/messaging/r.END:Lcom/whatsapp/messaging/r;
        //    73: astore          23
        //    75: iconst_0       
        //    76: istore          24
        //    78: aload           22
        //    80: aload           23
        //    82: if_acmpeq       88
        //    85: iconst_1       
        //    86: istore          24
        //    88: iload           24
        //    90: ireturn        
        //    91: aload_0        
        //    92: getfield        com/whatsapp/messaging/bz.c:Ljava/net/InetSocketAddress;
        //    95: astore          37
        //    97: aload           37
        //    99: ifnull          113
        //   102: aload_0        
        //   103: getstatic       com/whatsapp/messaging/r.DEBUG_CHAT_HOST:Lcom/whatsapp/messaging/r;
        //   106: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   109: iload_1        
        //   110: ifeq            64
        //   113: aload_0        
        //   114: getfield        com/whatsapp/messaging/bz.e:Ljava/util/List;
        //   117: invokeinterface java/util/List.isEmpty:()Z
        //   122: istore          38
        //   124: iload           38
        //   126: ifne            140
        //   129: aload_0        
        //   130: getstatic       com/whatsapp/messaging/r.OVERRIDES:Lcom/whatsapp/messaging/r;
        //   133: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   136: iload_1        
        //   137: ifeq            64
        //   140: aload_0        
        //   141: getfield        com/whatsapp/messaging/bz.f:Ljava/lang/String;
        //   144: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   147: istore          39
        //   149: iload           39
        //   151: ifne            165
        //   154: aload_0        
        //   155: getstatic       com/whatsapp/messaging/r.IP_OVERRIDE_PORT_1:Lcom/whatsapp/messaging/r;
        //   158: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   161: iload_1        
        //   162: ifeq            64
        //   165: aload_0        
        //   166: getstatic       com/whatsapp/messaging/r.PRIMARY:Lcom/whatsapp/messaging/r;
        //   169: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   172: iload_1        
        //   173: ifeq            64
        //   176: aload_0        
        //   177: getstatic       com/whatsapp/messaging/r.END:Lcom/whatsapp/messaging/r;
        //   180: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   183: iload_1        
        //   184: ifeq            64
        //   187: aload_0        
        //   188: iconst_1       
        //   189: aload_0        
        //   190: getfield        com/whatsapp/messaging/bz.d:I
        //   193: iadd           
        //   194: putfield        com/whatsapp/messaging/bz.d:I
        //   197: aload_0        
        //   198: getfield        com/whatsapp/messaging/bz.d:I
        //   201: istore          34
        //   203: aload_0        
        //   204: getfield        com/whatsapp/messaging/bz.e:Ljava/util/List;
        //   207: invokeinterface java/util/List.size:()I
        //   212: istore          35
        //   214: iload           34
        //   216: iload           35
        //   218: if_icmplt       64
        //   221: aload_0        
        //   222: getfield        com/whatsapp/messaging/bz.f:Ljava/lang/String;
        //   225: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   228: istore          36
        //   230: iload           36
        //   232: ifeq            246
        //   235: aload_0        
        //   236: getstatic       com/whatsapp/messaging/r.PRIMARY:Lcom/whatsapp/messaging/r;
        //   239: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   242: iload_1        
        //   243: ifeq            64
        //   246: aload_0        
        //   247: getstatic       com/whatsapp/messaging/r.IP_OVERRIDE_PORT_1:Lcom/whatsapp/messaging/r;
        //   250: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   253: iload_1        
        //   254: ifeq            64
        //   257: aload_0        
        //   258: getstatic       com/whatsapp/messaging/r.IP_OVERRIDE_PORT_2:Lcom/whatsapp/messaging/r;
        //   261: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   264: iload_1        
        //   265: ifeq            64
        //   268: aload_0        
        //   269: getstatic       com/whatsapp/messaging/r.PRIMARY:Lcom/whatsapp/messaging/r;
        //   272: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   275: iload_1        
        //   276: ifeq            64
        //   279: aload_0        
        //   280: getfield        com/whatsapp/messaging/bz.l:Ljava/util/List;
        //   283: invokeinterface java/util/List.isEmpty:()Z
        //   288: istore          30
        //   290: iload           30
        //   292: ifeq            317
        //   295: aload_0        
        //   296: getfield        com/whatsapp/messaging/bz.h:Z
        //   299: ifeq            485
        //   302: getstatic       com/whatsapp/messaging/r.HTTP:Lcom/whatsapp/messaging/r;
        //   305: astore          32
        //   307: aload_0        
        //   308: aload           32
        //   310: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   313: iload_1        
        //   314: ifeq            64
        //   317: aload_0        
        //   318: getstatic       com/whatsapp/messaging/r.FALLBACKS:Lcom/whatsapp/messaging/r;
        //   321: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   324: aload_0        
        //   325: iconst_0       
        //   326: putfield        com/whatsapp/messaging/bz.d:I
        //   329: iload_1        
        //   330: ifeq            64
        //   333: aload_0        
        //   334: iconst_1       
        //   335: aload_0        
        //   336: getfield        com/whatsapp/messaging/bz.d:I
        //   339: iadd           
        //   340: putfield        com/whatsapp/messaging/bz.d:I
        //   343: aload_0        
        //   344: getfield        com/whatsapp/messaging/bz.d:I
        //   347: istore          27
        //   349: aload_0        
        //   350: getfield        com/whatsapp/messaging/bz.l:Ljava/util/List;
        //   353: invokeinterface java/util/List.size:()I
        //   358: istore          28
        //   360: iload           27
        //   362: iload           28
        //   364: if_icmplt       64
        //   367: aload_0        
        //   368: getfield        com/whatsapp/messaging/bz.h:Z
        //   371: ifeq            513
        //   374: getstatic       com/whatsapp/messaging/r.HTTP:Lcom/whatsapp/messaging/r;
        //   377: astore          29
        //   379: aload_0        
        //   380: aload           29
        //   382: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   385: iload_1        
        //   386: ifeq            64
        //   389: aload_0        
        //   390: getstatic       com/whatsapp/messaging/r.END:Lcom/whatsapp/messaging/r;
        //   393: putfield        com/whatsapp/messaging/bz.i:Lcom/whatsapp/messaging/r;
        //   396: goto            64
        //   399: astore          20
        //   401: aload           20
        //   403: athrow         
        //   404: astore_2       
        //   405: aload_2        
        //   406: athrow         
        //   407: astore_3       
        //   408: aload_3        
        //   409: athrow         
        //   410: astore          4
        //   412: aload           4
        //   414: athrow         
        //   415: astore          5
        //   417: aload           5
        //   419: athrow         
        //   420: astore          6
        //   422: aload           6
        //   424: athrow         
        //   425: astore          7
        //   427: aload           7
        //   429: athrow         
        //   430: astore          8
        //   432: aload           8
        //   434: athrow         
        //   435: astore          9
        //   437: aload           9
        //   439: athrow         
        //   440: astore          10
        //   442: aload           10
        //   444: athrow         
        //   445: astore          11
        //   447: aload           11
        //   449: athrow         
        //   450: astore          12
        //   452: aload           12
        //   454: athrow         
        //   455: astore          13
        //   457: aload           13
        //   459: athrow         
        //   460: astore          14
        //   462: aload           14
        //   464: athrow         
        //   465: astore          15
        //   467: aload           15
        //   469: athrow         
        //   470: astore          16
        //   472: aload           16
        //   474: athrow         
        //   475: astore          17
        //   477: aload           17
        //   479: athrow         
        //   480: astore          18
        //   482: aload           18
        //   484: athrow         
        //   485: getstatic       com/whatsapp/messaging/r.END:Lcom/whatsapp/messaging/r;
        //   488: astore          32
        //   490: goto            307
        //   493: astore          33
        //   495: aload           33
        //   497: athrow         
        //   498: astore          31
        //   500: aload           31
        //   502: athrow         
        //   503: astore          25
        //   505: aload           25
        //   507: athrow         
        //   508: astore          26
        //   510: aload           26
        //   512: athrow         
        //   513: getstatic       com/whatsapp/messaging/r.END:Lcom/whatsapp/messaging/r;
        //   516: astore          29
        //   518: goto            379
        //   521: astore          21
        //   523: aload           21
        //   525: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      17     404    407    Ljava/lang/IllegalStateException;
        //  64     75     521    526    Ljava/lang/IllegalStateException;
        //  91     97     407    410    Ljava/lang/IllegalStateException;
        //  102    109    410    415    Ljava/lang/IllegalStateException;
        //  113    124    415    420    Ljava/lang/IllegalStateException;
        //  129    136    420    425    Ljava/lang/IllegalStateException;
        //  140    149    425    430    Ljava/lang/IllegalStateException;
        //  154    161    430    435    Ljava/lang/IllegalStateException;
        //  165    172    435    440    Ljava/lang/IllegalStateException;
        //  176    183    440    445    Ljava/lang/IllegalStateException;
        //  187    214    445    450    Ljava/lang/IllegalStateException;
        //  221    230    450    455    Ljava/lang/IllegalStateException;
        //  235    242    455    460    Ljava/lang/IllegalStateException;
        //  246    253    460    465    Ljava/lang/IllegalStateException;
        //  257    264    465    470    Ljava/lang/IllegalStateException;
        //  268    275    470    475    Ljava/lang/IllegalStateException;
        //  279    290    475    480    Ljava/lang/IllegalStateException;
        //  295    307    480    485    Ljava/lang/IllegalStateException;
        //  307    313    493    498    Ljava/lang/IllegalStateException;
        //  317    329    498    503    Ljava/lang/IllegalStateException;
        //  333    360    503    508    Ljava/lang/IllegalStateException;
        //  367    379    508    513    Ljava/lang/IllegalStateException;
        //  379    385    399    404    Ljava/lang/IllegalStateException;
        //  389    396    399    404    Ljava/lang/IllegalStateException;
        //  405    407    407    410    Ljava/lang/IllegalStateException;
        //  408    410    410    415    Ljava/lang/IllegalStateException;
        //  412    415    415    420    Ljava/lang/IllegalStateException;
        //  417    420    420    425    Ljava/lang/IllegalStateException;
        //  422    425    425    430    Ljava/lang/IllegalStateException;
        //  427    430    430    435    Ljava/lang/IllegalStateException;
        //  432    435    435    440    Ljava/lang/IllegalStateException;
        //  437    440    440    445    Ljava/lang/IllegalStateException;
        //  442    445    445    450    Ljava/lang/IllegalStateException;
        //  447    450    450    455    Ljava/lang/IllegalStateException;
        //  452    455    455    460    Ljava/lang/IllegalStateException;
        //  457    460    460    465    Ljava/lang/IllegalStateException;
        //  462    465    465    470    Ljava/lang/IllegalStateException;
        //  467    470    470    475    Ljava/lang/IllegalStateException;
        //  472    475    475    480    Ljava/lang/IllegalStateException;
        //  477    480    480    485    Ljava/lang/IllegalStateException;
        //  495    498    498    503    Ljava/lang/IllegalStateException;
        //  500    503    503    508    Ljava/lang/IllegalStateException;
        //  505    508    508    513    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 237, Size: 237
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
    
    public InputStream b(final Socket socket) {
        try {
            if (this.i == r.HTTP) {
                return new x(socket.getInputStream());
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return socket.getInputStream();
    }
    
    public void c() {
        try {
            if (this.i == r.HTTP) {
                a5.a(App.aq.getApplicationContext(), a1.PSEUDO_HTTP_CONNECTION_SUCCESS, Integer.valueOf(1));
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void f() {
        try {
            if (this.i == r.HTTP) {
                a5.a(App.aq.getApplicationContext(), a1.PSEUDO_HTTP_CONNECTION_FAILURE, Integer.valueOf(1));
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
}
