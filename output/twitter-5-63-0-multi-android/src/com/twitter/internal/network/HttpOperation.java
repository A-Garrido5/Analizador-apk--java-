// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.util.Collections;
import java.util.Collection;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import com.twitter.util.platform.k;
import java.util.zip.Inflater;
import java.util.HashMap;
import org.apache.http.HttpEntity;
import java.net.URI;
import com.twitter.util.s;
import com.twitter.util.platform.p;
import java.util.concurrent.atomic.AtomicLong;

public abstract class HttpOperation
{
    protected static final j a;
    private static final AtomicLong h;
    protected final p b;
    protected final s c;
    protected final HttpOperation$RequestMethod d;
    protected final URI e;
    protected final j f;
    protected long g;
    private HttpEntity i;
    private final e j;
    private final e k;
    private final r l;
    private boolean m;
    private final HashMap n;
    private l o;
    private volatile boolean p;
    private volatile boolean q;
    private Object r;
    private Object s;
    private int t;
    private Inflater u;
    private HttpOperation$Protocol v;
    private long w;
    
    static {
        a = new c();
        h = new AtomicLong(0L);
    }
    
    public HttpOperation(final HttpOperation$RequestMethod httpOperation$RequestMethod, final URI uri, final j j) {
        this(httpOperation$RequestMethod, uri, j, com.twitter.util.platform.k.f().c(), com.twitter.util.platform.k.f().a(), com.twitter.internal.network.e.a(), com.twitter.internal.network.r.a());
    }
    
    protected HttpOperation(final HttpOperation$RequestMethod d, final URI e, final j f, final p b, final s c, final e k, final r l) {
        this.g = -1L;
        this.i = null;
        this.j = new e();
        this.m = false;
        this.n = new HashMap();
        this.o = new l();
        this.t = -1;
        this.b = b;
        this.c = c;
        this.k = k;
        this.l = l;
        this.w = this.b.b();
        this.d = d;
        this.e = e;
        if (f == null) {
            this.f = HttpOperation.a;
        }
        else {
            this.f = f;
        }
        this.b(HttpOperation$Protocol.b);
    }
    
    private long a(final yq yq) {
        if (yq != null) {
            return yq.a();
        }
        return 0L;
    }
    
    private String a(final Object o, final String s) {
        if (o != null) {
            return this.a(o, s, 0);
        }
        return null;
    }
    
    private void a(final int n, final long w) {
        if (w < this.w) {
            return;
        }
        this.o.t[n] = (int)(w - this.w);
        this.w = w;
    }
    
    private void a(final l p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/twitter/internal/network/l.m:Ljava/lang/String;
        //     4: astore_3       
        //     5: aload_1        
        //     6: getfield        com/twitter/internal/network/l.l:Ljava/lang/String;
        //     9: astore          4
        //    11: aload_1        
        //    12: getfield        com/twitter/internal/network/l.k:I
        //    15: istore          5
        //    17: aconst_null    
        //    18: astore          6
        //    20: aload_0        
        //    21: aload_2        
        //    22: invokevirtual   com/twitter/internal/network/HttpOperation.d:(Ljava/lang/Object;)Ljava/io/InputStream;
        //    25: astore          16
        //    27: aload           16
        //    29: ifnull          767
        //    32: new             Lyq;
        //    35: dup            
        //    36: aload           16
        //    38: invokespecial   yq.<init>:(Ljava/io/InputStream;)V
        //    41: astore          18
        //    43: new             Ljava/io/BufferedInputStream;
        //    46: dup            
        //    47: aload           18
        //    49: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    52: astore          6
        //    54: aload           4
        //    56: ifnull          242
        //    59: aload           4
        //    61: ldc             "application/octet-stream"
        //    63: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    66: ifne            242
        //    69: aload           4
        //    71: ldc             "video/mp4"
        //    73: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    76: ifne            242
        //    79: aload           4
        //    81: ldc             "binary/octet-stream"
        //    83: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    86: ifne            242
        //    89: aload           4
        //    91: invokestatic    yr.a:(Ljava/lang/String;)Z
        //    94: ifne            242
        //    97: aload           4
        //    99: ldc             "image/"
        //   101: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   104: ifne            242
        //   107: new             Ljava/io/IOException;
        //   110: dup            
        //   111: new             Ljava/lang/StringBuilder;
        //   114: dup            
        //   115: invokespecial   java/lang/StringBuilder.<init>:()V
        //   118: ldc             "Unsupported content type: "
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: aload           4
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   131: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   134: athrow         
        //   135: astore          26
        //   137: aconst_null    
        //   138: astore          10
        //   140: aload           26
        //   142: astore          8
        //   144: aload           18
        //   146: astore          9
        //   148: aload           9
        //   150: ifnull          591
        //   153: aload           9
        //   155: invokevirtual   yq.d:()Z
        //   158: ifeq            591
        //   161: iconst_1       
        //   162: istore          11
        //   164: aload_1        
        //   165: iload           11
        //   167: putfield        com/twitter/internal/network/l.d:Z
        //   170: aload_0        
        //   171: aload           8
        //   173: invokevirtual   com/twitter/internal/network/HttpOperation.b:(Ljava/lang/Exception;)V
        //   176: aload           10
        //   178: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   181: aload           6
        //   183: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   186: aload_1        
        //   187: aload_0        
        //   188: aload           9
        //   190: invokespecial   com/twitter/internal/network/HttpOperation.a:(Lyq;)J
        //   193: putfield        com/twitter/internal/network/l.f:J
        //   196: aload           9
        //   198: ifnull          597
        //   201: aload           9
        //   203: invokevirtual   yq.c:()J
        //   206: lstore          13
        //   208: aload_1        
        //   209: lload           13
        //   211: putfield        com/twitter/internal/network/l.i:J
        //   214: aload           9
        //   216: ifnull          241
        //   219: aload           9
        //   221: invokevirtual   yq.b:()J
        //   224: lconst_0       
        //   225: lcmp           
        //   226: ifle            241
        //   229: aload_0        
        //   230: getfield        com/twitter/internal/network/HttpOperation.o:Lcom/twitter/internal/network/l;
        //   233: aload           9
        //   235: invokevirtual   yq.b:()J
        //   238: putfield        com/twitter/internal/network/l.r:J
        //   241: return         
        //   242: aload_3        
        //   243: ifnull          760
        //   246: aload_3        
        //   247: ldc             "gzip"
        //   249: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   252: ifeq            497
        //   255: bipush          14
        //   257: newarray        B
        //   259: astore          30
        //   261: new             Ljava/io/SequenceInputStream;
        //   264: dup            
        //   265: new             Ljava/io/ByteArrayInputStream;
        //   268: dup            
        //   269: aload           30
        //   271: iconst_0       
        //   272: aload           6
        //   274: aload           30
        //   276: invokevirtual   java/io/InputStream.read:([B)I
        //   279: invokespecial   java/io/ByteArrayInputStream.<init>:([BII)V
        //   282: aload           6
        //   284: invokespecial   java/io/SequenceInputStream.<init>:(Ljava/io/InputStream;Ljava/io/InputStream;)V
        //   287: astore          31
        //   289: aload_0        
        //   290: aload           31
        //   292: invokevirtual   com/twitter/internal/network/HttpOperation.a:(Ljava/io/InputStream;)Ljava/util/zip/GZIPInputStream;
        //   295: astore          34
        //   297: iconst_m1      
        //   298: istore          5
        //   300: aload           34
        //   302: astore          19
        //   304: aload_1        
        //   305: getfield        com/twitter/internal/network/l.a:I
        //   308: sipush          400
        //   311: if_icmplt       753
        //   314: aload_1        
        //   315: getfield        com/twitter/internal/network/l.a:I
        //   318: sipush          600
        //   321: if_icmpge       753
        //   324: aload_0        
        //   325: getfield        com/twitter/internal/network/HttpOperation.m:Z
        //   328: ifeq            753
        //   331: aload           4
        //   333: invokestatic    yr.a:(Ljava/lang/String;)Z
        //   336: ifeq            753
        //   339: new             Ljava/io/BufferedInputStream;
        //   342: dup            
        //   343: aload           19
        //   345: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //   348: astore          6
        //   350: aload           6
        //   352: sipush          4096
        //   355: invokevirtual   java/io/InputStream.mark:(I)V
        //   358: sipush          4096
        //   361: newarray        B
        //   363: astore          29
        //   365: aload_1        
        //   366: new             Ljava/lang/String;
        //   369: dup            
        //   370: aload           29
        //   372: iconst_0       
        //   373: aload           6
        //   375: aload           29
        //   377: iconst_0       
        //   378: sipush          4096
        //   381: invokevirtual   java/io/InputStream.read:([BII)I
        //   384: ldc_w           "UTF-8"
        //   387: invokestatic    java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
        //   390: invokespecial   java/lang/String.<init>:([BIILjava/nio/charset/Charset;)V
        //   393: putfield        com/twitter/internal/network/l.s:Ljava/lang/String;
        //   396: aload           6
        //   398: invokevirtual   java/io/InputStream.reset:()V
        //   401: new             Lyi;
        //   404: dup            
        //   405: aload           6
        //   407: invokespecial   yi.<init>:(Ljava/io/InputStream;)V
        //   410: astore          10
        //   412: aload_0        
        //   413: getfield        com/twitter/internal/network/HttpOperation.f:Lcom/twitter/internal/network/j;
        //   416: aload_1        
        //   417: getfield        com/twitter/internal/network/l.a:I
        //   420: aload           10
        //   422: iload           5
        //   424: aload           4
        //   426: aload_3        
        //   427: invokeinterface com/twitter/internal/network/j.a:(ILjava/io/InputStream;ILjava/lang/String;Ljava/lang/String;)V
        //   432: aload_0        
        //   433: getfield        com/twitter/internal/network/HttpOperation.b:Lcom/twitter/util/platform/p;
        //   436: invokeinterface com/twitter/util/platform/p.b:()J
        //   441: lstore          22
        //   443: aload           10
        //   445: invokestatic    com/twitter/internal/network/HttpOperation.a:(Lyi;)Z
        //   448: ifne            457
        //   451: aload           10
        //   453: invokestatic    yh.a:(Ljava/io/InputStream;)I
        //   456: pop            
        //   457: aload_1        
        //   458: aload_0        
        //   459: getfield        com/twitter/internal/network/HttpOperation.b:Lcom/twitter/util/platform/p;
        //   462: invokeinterface com/twitter/util/platform/p.b:()J
        //   467: lload           22
        //   469: lsub           
        //   470: putfield        com/twitter/internal/network/l.h:J
        //   473: aload           18
        //   475: invokevirtual   yq.e:()Ljava/io/IOException;
        //   478: astore          24
        //   480: aload           24
        //   482: ifnull          570
        //   485: aload           24
        //   487: athrow         
        //   488: astore          8
        //   490: aload           18
        //   492: astore          9
        //   494: goto            148
        //   497: aload_3        
        //   498: ldc_w           "deflate"
        //   501: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   504: ifeq            760
        //   507: new             Ljava/util/zip/InflaterInputStream;
        //   510: dup            
        //   511: aload           6
        //   513: aload_0        
        //   514: invokevirtual   com/twitter/internal/network/HttpOperation.s:()Ljava/util/zip/Inflater;
        //   517: invokespecial   java/util/zip/InflaterInputStream.<init>:(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
        //   520: astore          19
        //   522: iconst_m1      
        //   523: istore          5
        //   525: goto            304
        //   528: astore          28
        //   530: aload           6
        //   532: invokevirtual   java/io/InputStream.reset:()V
        //   535: goto            401
        //   538: astore          15
        //   540: aconst_null    
        //   541: astore          10
        //   543: aload           15
        //   545: astore          12
        //   547: aload           10
        //   549: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   552: aload           6
        //   554: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   557: aload           12
        //   559: athrow         
        //   560: astore          27
        //   562: aload           6
        //   564: invokevirtual   java/io/InputStream.reset:()V
        //   567: aload           27
        //   569: athrow         
        //   570: aload           6
        //   572: astore          17
        //   574: aload           18
        //   576: astore          9
        //   578: aload           10
        //   580: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   583: aload           17
        //   585: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   588: goto            186
        //   591: iconst_0       
        //   592: istore          11
        //   594: goto            164
        //   597: lconst_0       
        //   598: lstore          13
        //   600: goto            208
        //   603: astore          36
        //   605: aload           16
        //   607: astore          6
        //   609: aload           36
        //   611: astore          12
        //   613: aconst_null    
        //   614: astore          10
        //   616: goto            547
        //   619: astore          33
        //   621: aload           31
        //   623: astore          6
        //   625: aload           33
        //   627: astore          12
        //   629: aconst_null    
        //   630: astore          10
        //   632: goto            547
        //   635: astore          21
        //   637: aload           19
        //   639: astore          6
        //   641: aload           21
        //   643: astore          12
        //   645: aconst_null    
        //   646: astore          10
        //   648: goto            547
        //   651: astore          12
        //   653: goto            547
        //   656: astore          7
        //   658: aload           7
        //   660: astore          8
        //   662: aconst_null    
        //   663: astore          9
        //   665: aconst_null    
        //   666: astore          10
        //   668: aconst_null    
        //   669: astore          6
        //   671: goto            148
        //   674: astore          37
        //   676: aload           16
        //   678: astore          6
        //   680: aload           37
        //   682: astore          8
        //   684: aconst_null    
        //   685: astore          9
        //   687: aconst_null    
        //   688: astore          10
        //   690: goto            148
        //   693: astore          35
        //   695: aload           16
        //   697: astore          6
        //   699: aload           18
        //   701: astore          9
        //   703: aload           35
        //   705: astore          8
        //   707: aconst_null    
        //   708: astore          10
        //   710: goto            148
        //   713: astore          32
        //   715: aload           31
        //   717: astore          6
        //   719: aload           32
        //   721: astore          8
        //   723: aload           18
        //   725: astore          9
        //   727: aconst_null    
        //   728: astore          10
        //   730: goto            148
        //   733: astore          20
        //   735: aload           19
        //   737: astore          6
        //   739: aload           20
        //   741: astore          8
        //   743: aload           18
        //   745: astore          9
        //   747: aconst_null    
        //   748: astore          10
        //   750: goto            148
        //   753: aload           19
        //   755: astore          6
        //   757: goto            401
        //   760: aload           6
        //   762: astore          19
        //   764: goto            304
        //   767: aload           16
        //   769: astore          17
        //   771: aconst_null    
        //   772: astore          9
        //   774: aconst_null    
        //   775: astore          10
        //   777: goto            578
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  20     27     656    674    Ljava/lang/Exception;
        //  20     27     538    547    Any
        //  32     43     674    693    Ljava/lang/Exception;
        //  32     43     603    619    Any
        //  43     54     693    713    Ljava/lang/Exception;
        //  43     54     603    619    Any
        //  59     135    135    148    Ljava/lang/Exception;
        //  59     135    538    547    Any
        //  153    161    651    656    Any
        //  164    176    651    656    Any
        //  246    289    135    148    Ljava/lang/Exception;
        //  246    289    538    547    Any
        //  289    297    713    733    Ljava/lang/Exception;
        //  289    297    619    635    Any
        //  304    350    733    753    Ljava/lang/Exception;
        //  304    350    635    651    Any
        //  350    358    135    148    Ljava/lang/Exception;
        //  350    358    538    547    Any
        //  358    396    528    538    Ljava/lang/Exception;
        //  358    396    560    570    Any
        //  396    401    135    148    Ljava/lang/Exception;
        //  396    401    538    547    Any
        //  401    412    135    148    Ljava/lang/Exception;
        //  401    412    538    547    Any
        //  412    457    488    497    Ljava/lang/Exception;
        //  412    457    651    656    Any
        //  457    480    488    497    Ljava/lang/Exception;
        //  457    480    651    656    Any
        //  485    488    488    497    Ljava/lang/Exception;
        //  485    488    651    656    Any
        //  497    522    135    148    Ljava/lang/Exception;
        //  497    522    538    547    Any
        //  530    535    135    148    Ljava/lang/Exception;
        //  530    535    538    547    Any
        //  562    570    135    148    Ljava/lang/Exception;
        //  562    570    538    547    Any
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
    
    private static boolean a(final yi yi) {
        return yi != null && yi.a();
    }
    
    private void b(final int n) {
        this.a(n, this.b.b());
    }
    
    private void c(final Exception ex) {
        this.j.a(this, ex);
        this.k.a(this, ex);
    }
    
    private void l(final Object o) {
        if (this.t >= 0) {
            this.a(o, this.t);
        }
        this.a(o, this.e());
        for (final Map.Entry<K, ArrayList> entry : this.n.entrySet()) {
            final Iterator<String> iterator2 = entry.getValue().iterator();
            while (iterator2.hasNext()) {
                this.a(o, (String)entry.getKey(), iterator2.next());
            }
        }
    }
    
    private void m(final Object o) {
        if (o != null) {
            final Date n = this.n(o);
            if (n != null) {
                HttpOperation.h.set(n.getTime() - this.b.a());
            }
        }
    }
    
    private Date n(final Object o) {
        final String a = this.a(o, "Date");
        if (a != null) {
            try {
                return this.c.a().parse(a);
            }
            catch (ParseException ex) {}
        }
        return null;
    }
    
    private void t() {
        if (!this.o()) {
            throw new IllegalStateException("Request not yet complete for this HttpOperation");
        }
    }
    
    private void u() {
        this.j.a(this);
        this.k.a(this);
    }
    
    private void v() {
        this.j.b(this);
        this.k.b(this);
    }
    
    public HttpOperation a(final d d) {
        this.j.a(d);
        return this;
    }
    
    public HttpOperation a(final Exception c) {
        this.b();
        final l o = this.o;
        o.a = 0;
        o.b = null;
        o.c = c;
        return this;
    }
    
    public HttpOperation a(final String s, final String s2) {
        if (this.n.containsKey(s)) {
            this.n.get(s).set(0, s2);
            return this;
        }
        final ArrayList<String> list = new ArrayList<String>(1);
        list.add(s2);
        this.n.put(s, list);
        return this;
    }
    
    public HttpOperation a(final HttpEntity i) {
        this.i = i;
        return this;
    }
    
    protected abstract Object a();
    
    protected abstract String a(final Object p0);
    
    protected abstract String a(final Object p0, final String p1, final int p2);
    
    public String a(final String s) {
        if (this.n.containsKey(s)) {
            return this.n.get(s).get(0);
        }
        return null;
    }
    
    protected GZIPInputStream a(final InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
    
    public void a(final int t) {
        this.t = t;
    }
    
    protected abstract void a(final Object p0, final int p1);
    
    protected abstract void a(final Object p0, final String p1, final String p2);
    
    protected abstract void a(final Object p0, final HttpEntity p1);
    
    public void a(final boolean m) {
        this.m = m;
    }
    
    protected boolean a(final HttpOperation$Protocol httpOperation$Protocol) {
        return httpOperation$Protocol == HttpOperation$Protocol.b;
    }
    
    protected abstract String b(final Object p0);
    
    public String b(final String s) {
        this.t();
        return this.a(this.s, s);
    }
    
    public void b() {
        if (this.r != null) {
            this.e(this.r);
        }
        this.p = true;
    }
    
    public final void b(final HttpOperation$Protocol v) {
        if (!this.a(v)) {
            throw new IllegalArgumentException(v + " is not supported by this HttpOperation");
        }
        this.c(this.v = v);
    }
    
    protected void b(final Exception c) {
        this.c(c);
        this.b();
        final l o = this.o;
        o.a = 0;
        o.c = c;
    }
    
    protected abstract int c(final Object p0);
    
    public final HttpOperation c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/internal/network/HttpOperation.l:Lcom/twitter/internal/network/r;
        //     4: invokevirtual   com/twitter/internal/network/r.b:()Z
        //     7: ifne            26
        //    10: aload_0        
        //    11: new             Ljava/net/NoRouteToHostException;
        //    14: dup            
        //    15: ldc_w           "Wifi only mode is enabled."
        //    18: invokespecial   java/net/NoRouteToHostException.<init>:(Ljava/lang/String;)V
        //    21: invokevirtual   com/twitter/internal/network/HttpOperation.b:(Ljava/lang/Exception;)V
        //    24: aload_0        
        //    25: areturn        
        //    26: aload_0        
        //    27: getfield        com/twitter/internal/network/HttpOperation.q:Z
        //    30: ifne            24
        //    33: aload_0        
        //    34: invokevirtual   com/twitter/internal/network/HttpOperation.o:()Z
        //    37: ifne            24
        //    40: aload_0        
        //    41: iconst_0       
        //    42: invokespecial   com/twitter/internal/network/HttpOperation.b:(I)V
        //    45: aload_0        
        //    46: iconst_1       
        //    47: putfield        com/twitter/internal/network/HttpOperation.q:Z
        //    50: aload_0        
        //    51: invokespecial   com/twitter/internal/network/HttpOperation.v:()V
        //    54: aload_0        
        //    55: getfield        com/twitter/internal/network/HttpOperation.b:Lcom/twitter/util/platform/p;
        //    58: invokeinterface com/twitter/util/platform/p.b:()J
        //    63: lstore_1       
        //    64: aload_0        
        //    65: getfield        com/twitter/internal/network/HttpOperation.o:Lcom/twitter/internal/network/l;
        //    68: astore_3       
        //    69: aload_3        
        //    70: aload_0        
        //    71: invokevirtual   com/twitter/internal/network/HttpOperation.p:()Lcom/twitter/internal/network/HttpOperation$Protocol;
        //    74: putfield        com/twitter/internal/network/l.o:Lcom/twitter/internal/network/HttpOperation$Protocol;
        //    77: aload_3        
        //    78: aload_0        
        //    79: invokevirtual   com/twitter/internal/network/HttpOperation.d:()Ljava/lang/String;
        //    82: putfield        com/twitter/internal/network/l.p:Ljava/lang/String;
        //    85: aload_0        
        //    86: aload_0        
        //    87: invokevirtual   com/twitter/internal/network/HttpOperation.a:()Ljava/lang/Object;
        //    90: putfield        com/twitter/internal/network/HttpOperation.r:Ljava/lang/Object;
        //    93: aload_0        
        //    94: aload_0        
        //    95: getfield        com/twitter/internal/network/HttpOperation.r:Ljava/lang/Object;
        //    98: invokespecial   com/twitter/internal/network/HttpOperation.l:(Ljava/lang/Object;)V
        //   101: aload_0        
        //   102: iconst_1       
        //   103: invokespecial   com/twitter/internal/network/HttpOperation.b:(I)V
        //   106: iconst_2       
        //   107: istore          5
        //   109: aload_0        
        //   110: aload_0        
        //   111: getfield        com/twitter/internal/network/HttpOperation.r:Ljava/lang/Object;
        //   114: invokevirtual   com/twitter/internal/network/HttpOperation.f:(Ljava/lang/Object;)Ljava/lang/Object;
        //   117: astore          9
        //   119: aload           9
        //   121: astore          6
        //   123: aload_0        
        //   124: iload           5
        //   126: invokespecial   com/twitter/internal/network/HttpOperation.b:(I)V
        //   129: iconst_3       
        //   130: istore          5
        //   132: aload_3        
        //   133: aload_0        
        //   134: aload           6
        //   136: invokevirtual   com/twitter/internal/network/HttpOperation.h:(Ljava/lang/Object;)I
        //   139: putfield        com/twitter/internal/network/l.a:I
        //   142: aload_0        
        //   143: iload           5
        //   145: invokespecial   com/twitter/internal/network/HttpOperation.b:(I)V
        //   148: aload_0        
        //   149: getfield        com/twitter/internal/network/HttpOperation.o:Lcom/twitter/internal/network/l;
        //   152: aload_0        
        //   153: getfield        com/twitter/internal/network/HttpOperation.b:Lcom/twitter/util/platform/p;
        //   156: invokeinterface com/twitter/util/platform/p.b:()J
        //   161: putfield        com/twitter/internal/network/l.r:J
        //   164: aload_3        
        //   165: aload_0        
        //   166: aload           6
        //   168: invokevirtual   com/twitter/internal/network/HttpOperation.i:(Ljava/lang/Object;)Ljava/lang/String;
        //   171: putfield        com/twitter/internal/network/l.b:Ljava/lang/String;
        //   174: aload_3        
        //   175: aload_0        
        //   176: aload           6
        //   178: invokevirtual   com/twitter/internal/network/HttpOperation.c:(Ljava/lang/Object;)I
        //   181: putfield        com/twitter/internal/network/l.k:I
        //   184: aload_3        
        //   185: aload_0        
        //   186: aload           6
        //   188: invokevirtual   com/twitter/internal/network/HttpOperation.b:(Ljava/lang/Object;)Ljava/lang/String;
        //   191: putfield        com/twitter/internal/network/l.l:Ljava/lang/String;
        //   194: aload_3        
        //   195: aload_0        
        //   196: aload           6
        //   198: invokevirtual   com/twitter/internal/network/HttpOperation.a:(Ljava/lang/Object;)Ljava/lang/String;
        //   201: putfield        com/twitter/internal/network/l.m:Ljava/lang/String;
        //   204: aload_3        
        //   205: aload_0        
        //   206: aload           6
        //   208: invokevirtual   com/twitter/internal/network/HttpOperation.k:(Ljava/lang/Object;)Lcom/twitter/internal/network/HttpOperation$Protocol;
        //   211: putfield        com/twitter/internal/network/l.o:Lcom/twitter/internal/network/HttpOperation$Protocol;
        //   214: aload_3        
        //   215: aload_0        
        //   216: aload           6
        //   218: ldc_w           "x-served-by"
        //   221: iconst_0       
        //   222: invokevirtual   com/twitter/internal/network/HttpOperation.a:(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/String;
        //   225: putfield        com/twitter/internal/network/l.q:Ljava/lang/String;
        //   228: aload_3        
        //   229: getfield        com/twitter/internal/network/l.q:Ljava/lang/String;
        //   232: ifnonnull       249
        //   235: aload_3        
        //   236: aload_0        
        //   237: aload           6
        //   239: ldc_w           "server"
        //   242: iconst_0       
        //   243: invokevirtual   com/twitter/internal/network/HttpOperation.a:(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/String;
        //   246: putfield        com/twitter/internal/network/l.q:Ljava/lang/String;
        //   249: aload_0        
        //   250: aload           6
        //   252: invokespecial   com/twitter/internal/network/HttpOperation.m:(Ljava/lang/Object;)V
        //   255: aload_3        
        //   256: aload_0        
        //   257: getfield        com/twitter/internal/network/HttpOperation.b:Lcom/twitter/util/platform/p;
        //   260: invokeinterface com/twitter/util/platform/p.b:()J
        //   265: lload_1        
        //   266: lsub           
        //   267: putfield        com/twitter/internal/network/l.g:J
        //   270: aload           6
        //   272: ifnull          306
        //   275: aload_3        
        //   276: getfield        com/twitter/internal/network/l.c:Ljava/lang/Exception;
        //   279: ifnonnull       306
        //   282: aload_0        
        //   283: aload_3        
        //   284: aload           6
        //   286: invokespecial   com/twitter/internal/network/HttpOperation.a:(Lcom/twitter/internal/network/l;Ljava/lang/Object;)V
        //   289: aload_0        
        //   290: iconst_4       
        //   291: aload_0        
        //   292: getfield        com/twitter/internal/network/HttpOperation.o:Lcom/twitter/internal/network/l;
        //   295: getfield        com/twitter/internal/network/l.r:J
        //   298: invokespecial   com/twitter/internal/network/HttpOperation.a:(IJ)V
        //   301: aload_0        
        //   302: iconst_5       
        //   303: invokespecial   com/twitter/internal/network/HttpOperation.b:(I)V
        //   306: aload_3        
        //   307: aload_3        
        //   308: getfield        com/twitter/internal/network/l.g:J
        //   311: aload_3        
        //   312: getfield        com/twitter/internal/network/l.f:J
        //   315: ladd           
        //   316: aload_3        
        //   317: getfield        com/twitter/internal/network/l.h:J
        //   320: ladd           
        //   321: putfield        com/twitter/internal/network/l.e:J
        //   324: aload_0        
        //   325: iconst_1       
        //   326: putfield        com/twitter/internal/network/HttpOperation.p:Z
        //   329: aload_0        
        //   330: iconst_0       
        //   331: putfield        com/twitter/internal/network/HttpOperation.q:Z
        //   334: aload_0        
        //   335: aload           6
        //   337: putfield        com/twitter/internal/network/HttpOperation.s:Ljava/lang/Object;
        //   340: aload_3        
        //   341: invokevirtual   com/twitter/internal/network/l.a:()Z
        //   344: ifne            357
        //   347: aload_0        
        //   348: getfield        com/twitter/internal/network/HttpOperation.f:Lcom/twitter/internal/network/j;
        //   351: aload_3        
        //   352: invokeinterface com/twitter/internal/network/j.a:(Lcom/twitter/internal/network/l;)V
        //   357: aload_0        
        //   358: getfield        com/twitter/internal/network/HttpOperation.r:Ljava/lang/Object;
        //   361: ifnull          372
        //   364: aload_0        
        //   365: aload_0        
        //   366: getfield        com/twitter/internal/network/HttpOperation.r:Ljava/lang/Object;
        //   369: invokevirtual   com/twitter/internal/network/HttpOperation.j:(Ljava/lang/Object;)V
        //   372: aload_0        
        //   373: invokespecial   com/twitter/internal/network/HttpOperation.u:()V
        //   376: aload_0        
        //   377: bipush          6
        //   379: invokespecial   com/twitter/internal/network/HttpOperation.b:(I)V
        //   382: aload_0        
        //   383: areturn        
        //   384: astore          4
        //   386: iconst_1       
        //   387: istore          5
        //   389: aconst_null    
        //   390: astore          6
        //   392: aload           4
        //   394: astore          7
        //   396: aload_0        
        //   397: iload           5
        //   399: invokespecial   com/twitter/internal/network/HttpOperation.b:(I)V
        //   402: aload_3        
        //   403: aload           7
        //   405: instanceof      Ljava/io/IOException;
        //   408: putfield        com/twitter/internal/network/l.d:Z
        //   411: aload_0        
        //   412: aload           7
        //   414: invokevirtual   com/twitter/internal/network/HttpOperation.b:(Ljava/lang/Exception;)V
        //   417: goto            249
        //   420: astore          8
        //   422: aload           8
        //   424: astore          7
        //   426: aconst_null    
        //   427: astore          6
        //   429: goto            396
        //   432: astore          7
        //   434: goto            396
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  85     106    384    396    Ljava/lang/Exception;
        //  109    119    420    432    Ljava/lang/Exception;
        //  123    129    432    437    Ljava/lang/Exception;
        //  132    249    432    437    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 216, Size: 216
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
    
    protected void c(final HttpOperation$Protocol httpOperation$Protocol) {
    }
    
    protected abstract InputStream d(final Object p0);
    
    protected abstract String d();
    
    public final HttpEntity e() {
        if (this.i != null && this.d.a()) {
            return this.i;
        }
        return null;
    }
    
    protected abstract void e(final Object p0);
    
    public long f() {
        if (this.i != null) {
            return this.i.getContentLength();
        }
        return 0L;
    }
    
    protected abstract Object f(final Object p0);
    
    public long g() {
        return this.g;
    }
    
    protected abstract Map g(final Object p0);
    
    protected abstract int h(final Object p0);
    
    public HttpOperation$RequestMethod h() {
        return this.d;
    }
    
    protected abstract String i(final Object p0);
    
    public URI i() {
        return this.e;
    }
    
    protected void j(final Object o) {
    }
    
    public boolean j() {
        this.t();
        return this.o.a == 200;
    }
    
    protected abstract HttpOperation$Protocol k(final Object p0);
    
    public boolean k() {
        this.t();
        return this.o.a();
    }
    
    public l l() {
        return this.o;
    }
    
    public Map m() {
        final HashMap<Object, ArrayList> hashMap = new HashMap<Object, ArrayList>();
        for (final Map.Entry<Object, V> entry : this.n.entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList((Collection<?>)entry.getValue()));
        }
        return hashMap;
    }
    
    public Map n() {
        this.t();
        if (this.s != null) {
            return this.g(this.s);
        }
        return Collections.emptyMap();
    }
    
    public boolean o() {
        return this.p;
    }
    
    public HttpOperation$Protocol p() {
        return this.v;
    }
    
    public j q() {
        return this.f;
    }
    
    public long r() {
        return HttpOperation.h.get();
    }
    
    public Inflater s() {
        synchronized (this) {
            if (this.u == null) {
                this.u = new Inflater(false);
            }
            return this.u;
        }
    }
}
