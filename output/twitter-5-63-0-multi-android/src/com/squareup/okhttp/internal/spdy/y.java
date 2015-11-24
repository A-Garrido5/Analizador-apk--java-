// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.InterruptedIOException;
import java.io.IOException;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.util.Map;
import com.squareup.okhttp.Protocol;
import java.util.concurrent.ExecutorService;
import java.io.Closeable;

public final class y implements Closeable
{
    private static final ExecutorService l;
    final Protocol a;
    final boolean b;
    long c;
    long d;
    final u e;
    final u f;
    final a g;
    final c h;
    final long i;
    final ah j;
    private final m m;
    private final Map n;
    private final String o;
    private int p;
    private int q;
    private long r;
    private volatile boolean s;
    private Map t;
    private final s u;
    private int v;
    private boolean w;
    private final Set x;
    
    static {
        k = !y.class.desiredAssertionStatus();
        l = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), bf.a("OkHttp SpdyConnection", true));
    }
    
    private y(final ag ag) {
        int v = 1;
        this.n = new HashMap();
        this.r = System.nanoTime();
        this.c = 0L;
        this.e = new u();
        this.f = new u();
        this.w = false;
        this.x = new LinkedHashSet();
        this.a = ag.e;
        this.u = ag.f;
        this.b = ag.g;
        this.m = ag.d;
        int q;
        if (ag.g) {
            q = v;
        }
        else {
            q = 2;
        }
        this.q = q;
        if (!ag.g) {
            v = 2;
        }
        this.v = v;
        if (ag.g) {
            this.e.a(7, 0, 16777216);
        }
        this.o = ag.a;
        ao ao;
        if (this.a == Protocol.a) {
            ao = new h();
        }
        else {
            if (this.a != Protocol.b) {
                throw new AssertionError(this.a);
            }
            ao = new v();
        }
        this.d = this.f.d(65536);
        this.g = ao.a(ag.b, this.b);
        this.h = ao.a(ag.c, this.b);
        this.i = ao.a();
        this.j = new ah(this, null);
        new Thread(this.j).start();
    }
    
    private ak a(final int n, final List list, final boolean b, final boolean b2) {
        // monitorexit(this)
        // monitorexit(c)
        while (true) {
            Label_0058: {
                if (b) {
                    break Label_0058;
                }
                final boolean b3 = true;
                final boolean b4 = !b2;
                Label_0070: {
                    synchronized (this.h) {
                        synchronized (this) {
                            if (this.s) {
                                throw new IOException("shutdown");
                            }
                            break Label_0070;
                        }
                    }
                    break Label_0058;
                }
                final int q = this.q;
                this.q += 2;
                final ak ak = new ak(q, this, b3, b4, -1, list);
                if (ak.a()) {
                    this.n.put(q, ak);
                    this.a(false);
                }
                if (n == 0) {
                    this.h.a(b3, b4, q, n, -1, 0, list);
                }
                else {
                    if (this.b) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.h.a(n, q, list);
                }
                if (!b) {
                    this.h.c();
                }
                return ak;
            }
            final boolean b3 = false;
            continue;
        }
    }
    
    private void a(final int n, final bj bj, final int n2, final boolean b) {
        final bq bq = new bq();
        bj.a(n2);
        bj.b(bq, n2);
        if (bq.l() != n2) {
            throw new IOException(bq.l() + " != " + n2);
        }
        y.l.submit(new ae(this, "OkHttp %s Push Data[%s]", new Object[] { this.o, n }, n, bq, n2, b));
    }
    
    private void a(final int n, final List list) {
        synchronized (this) {
            if (this.x.contains(n)) {
                this.a(n, ErrorCode.b);
                return;
            }
            this.x.add(n);
            // monitorexit(this)
            y.l.submit(new ac(this, "OkHttp %s Push Request[%s]", new Object[] { this.o, n }, n, list));
        }
    }
    
    private void a(final int n, final List list, final boolean b) {
        y.l.submit(new ad(this, "OkHttp %s Push Headers[%s]", new Object[] { this.o, n }, n, list, b));
    }
    
    private void a(final ErrorCode p0, final ErrorCode p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/squareup/okhttp/internal/spdy/y.k:Z
        //     3: ifne            21
        //     6: aload_0        
        //     7: invokestatic    java/lang/Thread.holdsLock:(Ljava/lang/Object;)Z
        //    10: ifeq            21
        //    13: new             Ljava/lang/AssertionError;
        //    16: dup            
        //    17: invokespecial   java/lang/AssertionError.<init>:()V
        //    20: athrow         
        //    21: aload_0        
        //    22: aload_1        
        //    23: invokevirtual   com/squareup/okhttp/internal/spdy/y.a:(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V
        //    26: aconst_null    
        //    27: astore          4
        //    29: aload_0        
        //    30: monitorenter   
        //    31: aload_0        
        //    32: getfield        com/squareup/okhttp/internal/spdy/y.n:Ljava/util/Map;
        //    35: invokeinterface java/util/Map.isEmpty:()Z
        //    40: ifne            310
        //    43: aload_0        
        //    44: getfield        com/squareup/okhttp/internal/spdy/y.n:Ljava/util/Map;
        //    47: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    52: aload_0        
        //    53: getfield        com/squareup/okhttp/internal/spdy/y.n:Ljava/util/Map;
        //    56: invokeinterface java/util/Map.size:()I
        //    61: anewarray       Lcom/squareup/okhttp/internal/spdy/ak;
        //    64: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    69: checkcast       [Lcom/squareup/okhttp/internal/spdy/ak;
        //    72: astore          18
        //    74: aload_0        
        //    75: getfield        com/squareup/okhttp/internal/spdy/y.n:Ljava/util/Map;
        //    78: invokeinterface java/util/Map.clear:()V
        //    83: aload_0        
        //    84: iconst_0       
        //    85: invokespecial   com/squareup/okhttp/internal/spdy/y.a:(Z)V
        //    88: aload           18
        //    90: astore          6
        //    92: aload_0        
        //    93: getfield        com/squareup/okhttp/internal/spdy/y.t:Ljava/util/Map;
        //    96: ifnull          304
        //    99: aload_0        
        //   100: getfield        com/squareup/okhttp/internal/spdy/y.t:Ljava/util/Map;
        //   103: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   108: aload_0        
        //   109: getfield        com/squareup/okhttp/internal/spdy/y.t:Ljava/util/Map;
        //   112: invokeinterface java/util/Map.size:()I
        //   117: anewarray       Lcom/squareup/okhttp/internal/spdy/r;
        //   120: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   125: checkcast       [Lcom/squareup/okhttp/internal/spdy/r;
        //   128: astore          17
        //   130: aload_0        
        //   131: aconst_null    
        //   132: putfield        com/squareup/okhttp/internal/spdy/y.t:Ljava/util/Map;
        //   135: aload           17
        //   137: astore          7
        //   139: aload_0        
        //   140: monitorexit    
        //   141: aload           6
        //   143: ifnull          216
        //   146: aload           6
        //   148: arraylength    
        //   149: istore          12
        //   151: iconst_0       
        //   152: istore          13
        //   154: aload           4
        //   156: astore          14
        //   158: iload           13
        //   160: iload           12
        //   162: if_icmpge       212
        //   165: aload           6
        //   167: iload           13
        //   169: aaload         
        //   170: astore          15
        //   172: aload           15
        //   174: aload_2        
        //   175: invokevirtual   com/squareup/okhttp/internal/spdy/ak.a:(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V
        //   178: iinc            13, 1
        //   181: goto            158
        //   184: astore_3       
        //   185: aload_3        
        //   186: astore          4
        //   188: goto            29
        //   191: astore          5
        //   193: aload_0        
        //   194: monitorexit    
        //   195: aload           5
        //   197: athrow         
        //   198: astore          16
        //   200: aload           14
        //   202: ifnull          178
        //   205: aload           16
        //   207: astore          14
        //   209: goto            178
        //   212: aload           14
        //   214: astore          4
        //   216: aload           7
        //   218: ifnull          250
        //   221: aload           7
        //   223: arraylength    
        //   224: istore          10
        //   226: iconst_0       
        //   227: istore          11
        //   229: iload           11
        //   231: iload           10
        //   233: if_icmpge       250
        //   236: aload           7
        //   238: iload           11
        //   240: aaload         
        //   241: invokevirtual   com/squareup/okhttp/internal/spdy/r.c:()V
        //   244: iinc            11, 1
        //   247: goto            229
        //   250: aload_0        
        //   251: getfield        com/squareup/okhttp/internal/spdy/y.g:Lcom/squareup/okhttp/internal/spdy/a;
        //   254: invokeinterface com/squareup/okhttp/internal/spdy/a.close:()V
        //   259: aload_0        
        //   260: getfield        com/squareup/okhttp/internal/spdy/y.h:Lcom/squareup/okhttp/internal/spdy/c;
        //   263: invokeinterface com/squareup/okhttp/internal/spdy/c.close:()V
        //   268: aload           4
        //   270: astore          9
        //   272: aload           9
        //   274: ifnull          303
        //   277: aload           9
        //   279: athrow         
        //   280: astore          8
        //   282: aload           8
        //   284: astore          4
        //   286: goto            259
        //   289: astore          9
        //   291: aload           4
        //   293: ifnull          272
        //   296: aload           4
        //   298: astore          9
        //   300: goto            272
        //   303: return         
        //   304: aconst_null    
        //   305: astore          7
        //   307: goto            139
        //   310: aconst_null    
        //   311: astore          6
        //   313: goto            92
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  21     26     184    191    Ljava/io/IOException;
        //  31     88     191    198    Any
        //  92     135    191    198    Any
        //  139    141    191    198    Any
        //  172    178    198    212    Ljava/io/IOException;
        //  193    195    191    198    Any
        //  250    259    280    289    Ljava/io/IOException;
        //  259    268    289    303    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 141, Size: 141
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
    
    private void a(final boolean b) {
        // monitorenter(this)
        Label_0018: {
            if (!b) {
                break Label_0018;
            }
            try {
                long nanoTime = System.nanoTime();
                while (true) {
                    this.r = nanoTime;
                    return;
                    nanoTime = Long.MAX_VALUE;
                    continue;
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    private void a(final boolean b, final int n, final int n2, final r r) {
        y.l.submit(new ab(this, "OkHttp %s ping %08x%08x", new Object[] { this.o, n, n2 }, b, n, n2, r));
    }
    
    private void b(final boolean b, final int n, final int n2, final r r) {
        final c h = this.h;
        // monitorenter(h)
        Label_0019: {
            if (r == null) {
                break Label_0019;
            }
            try {
                r.a();
                this.h.a(b, n, n2);
            }
            finally {
            }
            // monitorexit(h)
        }
    }
    
    private r c(final int n) {
        synchronized (this) {
            r r;
            if (this.t != null) {
                r = this.t.remove(n);
            }
            else {
                r = null;
            }
            return r;
        }
    }
    
    private void c(final int n, final ErrorCode errorCode) {
        y.l.submit(new af(this, "OkHttp %s Push Reset[%s]", new Object[] { this.o, n }, n, errorCode));
    }
    
    private boolean d(final int n) {
        return this.a == Protocol.a && n != 0 && (n & 0x1) == 0x0;
    }
    
    public Protocol a() {
        return this.a;
    }
    
    ak a(final int n) {
        synchronized (this) {
            return this.n.get(n);
        }
    }
    
    public ak a(final List list, final boolean b, final boolean b2) {
        return this.a(0, list, b, b2);
    }
    
    void a(final int n, final long n2) {
        y.l.submit(new aa(this, "OkHttp Window Update %s stream %d", new Object[] { this.o, n }, n, n2));
    }
    
    void a(final int n, final ErrorCode errorCode) {
        y.l.submit(new z(this, "OkHttp %s stream %d", new Object[] { this.o, n }, n, errorCode));
    }
    
    public void a(final int n, final boolean b, final bq bq, long n2) {
        Label_0020: {
            if (n2 == 0L) {
                this.h.a(b, n, bq, 0);
            }
            else {
                Label_0095: {
                    break Label_0095;
                    while (true) {
                        while (true) {
                            try {
                                while (true) {
                                    final int n3 = (int)Math.min(Math.min(n2, this.d), this.i);
                                    this.d -= n3;
                                    // monitorexit(this)
                                    n2 -= n3;
                                    final c h = this.h;
                                    if (!b || n2 != 0L) {
                                        break;
                                    }
                                    final boolean b2 = true;
                                    h.a(b2, n, bq, n3);
                                    if (n2 <= 0L) {
                                        break Label_0020;
                                    }
                                    // monitorenter(this)
                                    try {
                                        while (this.d <= 0L) {
                                            this.wait();
                                        }
                                    }
                                    catch (InterruptedException ex) {
                                        throw new InterruptedIOException();
                                    }
                                }
                            }
                            finally {
                            }
                            // monitorexit(this)
                            final boolean b2 = false;
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    void a(final long n) {
        this.d += n;
        if (n > 0L) {
            this.notifyAll();
        }
    }
    
    public void a(final ErrorCode p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/squareup/okhttp/internal/spdy/y.h:Lcom/squareup/okhttp/internal/spdy/c;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: monitorenter   
        //     9: aload_0        
        //    10: getfield        com/squareup/okhttp/internal/spdy/y.s:Z
        //    13: ifeq            21
        //    16: aload_0        
        //    17: monitorexit    
        //    18: aload_2        
        //    19: monitorexit    
        //    20: return         
        //    21: aload_0        
        //    22: iconst_1       
        //    23: putfield        com/squareup/okhttp/internal/spdy/y.s:Z
        //    26: aload_0        
        //    27: getfield        com/squareup/okhttp/internal/spdy/y.p:I
        //    30: istore          5
        //    32: aload_0        
        //    33: monitorexit    
        //    34: aload_0        
        //    35: getfield        com/squareup/okhttp/internal/spdy/y.h:Lcom/squareup/okhttp/internal/spdy/c;
        //    38: iload           5
        //    40: aload_1        
        //    41: getstatic       bf.a:[B
        //    44: invokeinterface com/squareup/okhttp/internal/spdy/c.a:(ILcom/squareup/okhttp/internal/spdy/ErrorCode;[B)V
        //    49: aload_2        
        //    50: monitorexit    
        //    51: return         
        //    52: astore_3       
        //    53: aload_2        
        //    54: monitorexit    
        //    55: aload_3        
        //    56: athrow         
        //    57: astore          4
        //    59: aload_0        
        //    60: monitorexit    
        //    61: aload           4
        //    63: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      9      52     57     Any
        //  9      18     57     64     Any
        //  18     20     52     57     Any
        //  21     34     57     64     Any
        //  34     51     52     57     Any
        //  53     55     52     57     Any
        //  59     61     57     64     Any
        //  61     64     52     57     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
    
    ak b(final int n) {
        synchronized (this) {
            final ak ak = this.n.remove(n);
            if (ak != null && this.n.isEmpty()) {
                this.a(true);
            }
            return ak;
        }
    }
    
    void b(final int n, final ErrorCode errorCode) {
        this.h.a(n, errorCode);
    }
    
    public boolean b() {
        synchronized (this) {
            return this.r != Long.MAX_VALUE;
        }
    }
    
    public long c() {
        synchronized (this) {
            return this.r;
        }
    }
    
    @Override
    public void close() {
        this.a(ErrorCode.a, ErrorCode.l);
    }
    
    public void d() {
        this.h.c();
    }
    
    public void e() {
        this.h.a();
        this.h.a(this.e);
    }
    
    public boolean f() {
        return this.s;
    }
}
