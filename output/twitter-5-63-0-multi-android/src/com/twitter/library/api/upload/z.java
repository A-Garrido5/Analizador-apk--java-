// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import java.util.ArrayList;
import com.twitter.library.media.util.p;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.util.bd;
import com.twitter.library.service.aa;
import java.io.File;
import com.twitter.internal.network.j;
import com.twitter.library.media.model.EditableMedia;
import android.content.Context;
import com.twitter.library.api.bg;
import java.util.List;

public class z extends q
{
    private final List m;
    private final int n;
    private bg o;
    private long p;
    private long q;
    
    public z(final Context context, final List m, final int n, final EditableMedia editableMedia) {
        super(context, editableMedia);
        this.m = m;
        this.n = n;
        this.k = false;
    }
    
    private ah a(final int n) {
        final ah a = this.c.a();
        a.a(this.o = bg.a(n));
        a.g = null;
        return a;
    }
    
    private void a(final File file, final aa aa, int n) {
        this.k = false;
        while (!this.a(file, aa, (long)this.m.get(n))) {
            if (++n >= this.m.size()) {
                return;
            }
        }
        this.j = this.q;
    }
    
    private boolean a(final bd bd, final int n, final long n2, final String s, final aa aa) {
        final ah a = this.a(82);
        a.a("media", bd, (int)n2);
        final HttpOperation a2 = a.c().a("X-SessionPhase", "APPEND").a("X-TotalBytes", Long.toString(n2)).a("X-MediaId", Long.toString(this.p)).a("Content-MD5", s).a("X-SegmentIndex", Integer.toString(n));
        this.a(a2);
        a.a(a2, aa);
        return a2.k();
    }
    
    private boolean a(final File file, final aa aa, final long n) {
        final p p3 = new p();
        p3.a("upload-" + this.h, this.q);
        ++this.h;
        final boolean b = this.c(aa) && this.b(file, aa, n) && this.d(aa);
        int n2 = 0;
        if (!b) {
            n2 = 1005;
        }
        p3.a(n2);
        this.i.add(p3);
        return b;
    }
    
    private boolean b(final File p0, final aa p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/RandomAccessFile;
        //     3: dup            
        //     4: aload_1        
        //     5: ldc             "r"
        //     7: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    10: astore          5
        //    12: new             Lcom/twitter/library/util/ac;
        //    15: dup            
        //    16: aload           5
        //    18: aload_0        
        //    19: getfield        com/twitter/library/api/upload/z.q:J
        //    22: lload_3        
        //    23: invokespecial   com/twitter/library/util/ac.<init>:(Ljava/io/RandomAccessFile;JJ)V
        //    26: astore          6
        //    28: aload_0        
        //    29: iconst_0       
        //    30: iconst_1       
        //    31: invokevirtual   com/twitter/library/api/upload/z.a:(II)V
        //    34: aload           6
        //    36: invokevirtual   com/twitter/library/util/ac.iterator:()Ljava/util/Iterator;
        //    39: astore          17
        //    41: iconst_0       
        //    42: istore          14
        //    44: iconst_0       
        //    45: istore          18
        //    47: lconst_0       
        //    48: lstore          9
        //    50: aload           17
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            407
        //    60: aload           17
        //    62: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    67: checkcast       Lcom/twitter/library/util/bd;
        //    70: astore          21
        //    72: aload           21
        //    74: ifnonnull       136
        //    77: aload_0        
        //    78: invokevirtual   com/twitter/library/api/upload/z.i:()V
        //    81: aload_0        
        //    82: ldc             "Phase"
        //    84: ldc             "Append"
        //    86: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    89: aload_0        
        //    90: ldc             "Cause"
        //    92: ldc             "IOError"
        //    94: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    97: aload_0        
        //    98: ldc             "Index"
        //   100: iload           14
        //   102: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   105: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   108: aload_2        
        //   109: sipush          1008
        //   112: new             Lcom/twitter/library/media/util/MediaException;
        //   115: dup            
        //   116: ldc             "Error reading image file"
        //   118: invokespecial   com/twitter/library/media/util/MediaException.<init>:(Ljava/lang/String;)V
        //   121: invokevirtual   com/twitter/library/service/aa.a:(ILjava/lang/Exception;)V
        //   124: aload           6
        //   126: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   129: aload           5
        //   131: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   134: iconst_0       
        //   135: ireturn        
        //   136: iconst_0       
        //   137: istore          18
        //   139: aload           6
        //   141: invokevirtual   com/twitter/library/util/ac.d:()J
        //   144: lstore          9
        //   146: aload           6
        //   148: invokevirtual   com/twitter/library/util/ac.e:()Ljava/lang/String;
        //   151: astore          22
        //   153: aload           21
        //   155: astore          23
        //   157: iconst_0       
        //   158: istore          24
        //   160: aload_0        
        //   161: invokevirtual   com/twitter/library/api/upload/z.i:()V
        //   164: aload_0        
        //   165: aload           23
        //   167: iload           14
        //   169: lload           9
        //   171: aload           22
        //   173: aload_2        
        //   174: invokespecial   com/twitter/library/api/upload/z.a:(Lcom/twitter/library/util/bd;IJLjava/lang/String;Lcom/twitter/library/service/aa;)Z
        //   177: istore          26
        //   179: iload           26
        //   181: ifeq            305
        //   184: iload           24
        //   186: istore          18
        //   188: iinc            14, 1
        //   191: aload_0        
        //   192: iload           14
        //   194: aload           6
        //   196: invokevirtual   com/twitter/library/util/ac.a:()I
        //   199: invokevirtual   com/twitter/library/api/upload/z.a:(II)V
        //   202: goto            50
        //   205: astore          19
        //   207: aload           6
        //   209: astore          12
        //   211: aload           19
        //   213: astore          11
        //   215: iload           18
        //   217: istore          20
        //   219: aload           5
        //   221: astore          8
        //   223: iload           20
        //   225: istore          13
        //   227: aload_2        
        //   228: sipush          1008
        //   231: aload           11
        //   233: invokevirtual   com/twitter/library/service/aa.a:(ILjava/lang/Exception;)V
        //   236: aload_0        
        //   237: ldc             "Phase"
        //   239: ldc             "Append"
        //   241: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   244: aload_0        
        //   245: ldc             "Cause"
        //   247: ldc             "IOException"
        //   249: aload           11
        //   251: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
        //   254: aload_0        
        //   255: ldc             "Index"
        //   257: iload           14
        //   259: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   262: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   265: aload_0        
        //   266: ldc             "RetryCount"
        //   268: iload           13
        //   270: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   273: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   276: aload_0        
        //   277: ldc             "CurSegSize"
        //   279: lload           9
        //   281: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   284: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   287: aload_0        
        //   288: iconst_0       
        //   289: iconst_1       
        //   290: invokevirtual   com/twitter/library/api/upload/z.a:(II)V
        //   293: aload           12
        //   295: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   298: aload           8
        //   300: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   303: iconst_0       
        //   304: ireturn        
        //   305: iload           24
        //   307: iconst_1       
        //   308: iadd           
        //   309: istore          18
        //   311: iload           18
        //   313: aload_0        
        //   314: getfield        com/twitter/library/api/upload/z.n:I
        //   317: if_icmple       384
        //   320: aload_0        
        //   321: ldc             "Phase"
        //   323: ldc             "Append"
        //   325: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   328: aload_0        
        //   329: ldc             "Cause"
        //   331: ldc_w           "MaxRetry"
        //   334: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   337: aload_0        
        //   338: ldc             "Index"
        //   340: iload           14
        //   342: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   345: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   348: aload_0        
        //   349: ldc             "RetryCount"
        //   351: aload_0        
        //   352: getfield        com/twitter/library/api/upload/z.n:I
        //   355: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   358: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   361: aload_0        
        //   362: ldc             "CurSegSize"
        //   364: lload           9
        //   366: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   369: invokevirtual   com/twitter/library/api/upload/z.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   372: aload           6
        //   374: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   377: aload           5
        //   379: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   382: iconst_0       
        //   383: ireturn        
        //   384: aload           6
        //   386: invokevirtual   com/twitter/library/util/ac.c:()Lcom/twitter/library/util/bd;
        //   389: astore          27
        //   391: aload           27
        //   393: astore          23
        //   395: aload           23
        //   397: ifnull          188
        //   400: iload           18
        //   402: istore          24
        //   404: goto            160
        //   407: aload           6
        //   409: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   412: aload           5
        //   414: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   417: iconst_1       
        //   418: ireturn        
        //   419: astore          15
        //   421: aconst_null    
        //   422: astore          5
        //   424: aconst_null    
        //   425: astore          12
        //   427: aload           12
        //   429: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   432: aload           5
        //   434: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   437: aload           15
        //   439: athrow         
        //   440: astore          15
        //   442: aconst_null    
        //   443: astore          12
        //   445: goto            427
        //   448: astore          16
        //   450: aload           6
        //   452: astore          12
        //   454: aload           16
        //   456: astore          15
        //   458: goto            427
        //   461: astore          15
        //   463: aload           8
        //   465: astore          5
        //   467: goto            427
        //   470: astore          11
        //   472: lconst_0       
        //   473: lstore          9
        //   475: iconst_0       
        //   476: istore          13
        //   478: aconst_null    
        //   479: astore          12
        //   481: aconst_null    
        //   482: astore          8
        //   484: iconst_0       
        //   485: istore          14
        //   487: goto            227
        //   490: astore          11
        //   492: aload           5
        //   494: astore          8
        //   496: lconst_0       
        //   497: lstore          9
        //   499: iconst_0       
        //   500: istore          13
        //   502: aconst_null    
        //   503: astore          12
        //   505: iconst_0       
        //   506: istore          14
        //   508: goto            227
        //   511: astore          7
        //   513: aload           5
        //   515: astore          8
        //   517: lconst_0       
        //   518: lstore          9
        //   520: aload           7
        //   522: astore          11
        //   524: aload           6
        //   526: astore          12
        //   528: iconst_0       
        //   529: istore          13
        //   531: iconst_0       
        //   532: istore          14
        //   534: goto            227
        //   537: astore          25
        //   539: aload           5
        //   541: astore          8
        //   543: iload           24
        //   545: istore          13
        //   547: aload           25
        //   549: astore          11
        //   551: aload           6
        //   553: astore          12
        //   555: goto            227
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      12     470    490    Ljava/io/IOException;
        //  0      12     419    427    Any
        //  12     28     490    511    Ljava/io/IOException;
        //  12     28     440    448    Any
        //  28     41     511    537    Ljava/io/IOException;
        //  28     41     448    461    Any
        //  50     72     205    227    Ljava/io/IOException;
        //  50     72     448    461    Any
        //  77     124    205    227    Ljava/io/IOException;
        //  77     124    448    461    Any
        //  139    153    205    227    Ljava/io/IOException;
        //  139    153    448    461    Any
        //  160    179    537    558    Ljava/io/IOException;
        //  160    179    448    461    Any
        //  191    202    205    227    Ljava/io/IOException;
        //  191    202    448    461    Any
        //  227    293    461    470    Any
        //  311    372    205    227    Ljava/io/IOException;
        //  311    372    448    461    Any
        //  384    391    205    227    Ljava/io/IOException;
        //  384    391    448    461    Any
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
    
    private boolean c(final aa aa) {
        final ah a = this.a(55);
        final HttpOperation a2 = a.c().a("X-SessionPhase", "INIT").a("X-TotalBytes", Long.toString(this.q));
        this.b(a2);
        a2.c();
        a.a(a2, aa);
        this.p = 0L;
        if (a2.k()) {
            this.p = (long)this.o.a();
        }
        if (this.p == 0L) {
            this.a("Phase", "Init");
            return false;
        }
        return true;
    }
    
    private boolean d(final aa aa) {
        final HttpOperation a = this.c.c().a("X-SessionPhase", "FINALIZE").a("X-MediaId", Long.toString(this.p));
        a.c();
        this.c.a(a, aa);
        if (!a.k()) {
            this.a("Phase", "Finalize");
            return false;
        }
        return true;
    }
    
    @Override
    protected void b(final aa aa) {
        this.h = 0;
        this.i = new ArrayList();
        int n = 0;
        while (true) {
            int n2 = 0;
            Block_7: {
                while (true) {
                    final MediaFile d = this.d.d();
                    if (d != null) {
                        this.q = d.file.length();
                        final MediaType e = this.f.e();
                        boolean b;
                        if (e == MediaType.d || e == MediaType.e) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        if (this.q <= this.m.get(n) && !b) {
                            this.a(d.file, aa);
                        }
                        else {
                            this.a(d.file, aa, n);
                        }
                        if (aa.a() || aa.c() != 0) {
                            break;
                        }
                        n2 = -1 + this.m.size();
                    }
                    else {
                        n2 = n;
                    }
                    if (!this.h()) {
                        break Block_7;
                    }
                    n = n2;
                }
                this.a("FileSize", Long.toString(this.q));
                if (!this.k) {
                    this.a("SegSize", Long.toString((int)this.m.get(n)));
                    this.a("MediaId", Long.toString(this.p));
                }
                else if (aa.a()) {
                    this.a("origin", "segmented");
                    return;
                }
                return;
            }
            n = n2;
            continue;
        }
    }
}
