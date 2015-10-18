// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.aJ;
import com.google.a8;
import com.google.ch;
import com.google.ep;
import com.google.fm;
import com.google.ci;
import com.google.dg;
import java.io.InputStream;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import com.google.hv;
import com.google.du;
import com.google.dS;

public final class aj extends dS implements bl
{
    private static final aj h;
    public static final int i = 5;
    public static final int j = 4;
    public static final int k = 1;
    public static du p;
    public static final int r = 2;
    public static final int s = 3;
    private static final long serialVersionUID;
    private hv e;
    private int f;
    private long g;
    private hv l;
    private int m;
    private byte n;
    private final ce o;
    private hv q;
    private int t;
    
    static {
        aj.p = new b8();
        (h = new aj(true)).b();
    }
    
    private aj(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/aZ.o:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        org/whispersystems/aj.n:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/aj.t:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/aj.b:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            236
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 250
        //                8: 124
        //               18: 146
        //               26: 168
        //               34: 190
        //               41: 213
        //          default: 100
        //        }
        //   100: aload_0        
        //   101: aload_1        
        //   102: aload           4
        //   104: aload_2        
        //   105: iload           9
        //   107: invokevirtual   org/whispersystems/aj.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   110: istore          11
        //   112: iload           11
        //   114: ifne            232
        //   117: iload_3        
        //   118: ifeq            336
        //   121: iconst_1       
        //   122: istore          5
        //   124: aload_0        
        //   125: iconst_1       
        //   126: aload_0        
        //   127: getfield        org/whispersystems/aj.f:I
        //   130: ior            
        //   131: putfield        org/whispersystems/aj.f:I
        //   134: aload_0        
        //   135: aload_1        
        //   136: invokevirtual   com/google/cL.l:()I
        //   139: putfield        org/whispersystems/aj.m:I
        //   142: iload_3        
        //   143: ifeq            232
        //   146: aload_0        
        //   147: iconst_2       
        //   148: aload_0        
        //   149: getfield        org/whispersystems/aj.f:I
        //   152: ior            
        //   153: putfield        org/whispersystems/aj.f:I
        //   156: aload_0        
        //   157: aload_1        
        //   158: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   161: putfield        org/whispersystems/aj.q:Lcom/google/hv;
        //   164: iload_3        
        //   165: ifeq            232
        //   168: aload_0        
        //   169: iconst_4       
        //   170: aload_0        
        //   171: getfield        org/whispersystems/aj.f:I
        //   174: ior            
        //   175: putfield        org/whispersystems/aj.f:I
        //   178: aload_0        
        //   179: aload_1        
        //   180: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   183: putfield        org/whispersystems/aj.e:Lcom/google/hv;
        //   186: iload_3        
        //   187: ifeq            232
        //   190: aload_0        
        //   191: bipush          8
        //   193: aload_0        
        //   194: getfield        org/whispersystems/aj.f:I
        //   197: ior            
        //   198: putfield        org/whispersystems/aj.f:I
        //   201: aload_0        
        //   202: aload_1        
        //   203: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   206: putfield        org/whispersystems/aj.l:Lcom/google/hv;
        //   209: iload_3        
        //   210: ifeq            232
        //   213: aload_0        
        //   214: bipush          16
        //   216: aload_0        
        //   217: getfield        org/whispersystems/aj.f:I
        //   220: ior            
        //   221: putfield        org/whispersystems/aj.f:I
        //   224: aload_0        
        //   225: aload_1        
        //   226: invokevirtual   com/google/cL.n:()J
        //   229: putfield        org/whispersystems/aj.g:J
        //   232: iload_3        
        //   233: ifeq            30
        //   236: aload_0        
        //   237: aload           4
        //   239: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   242: putfield        org/whispersystems/aj.o:Lcom/google/ce;
        //   245: aload_0        
        //   246: invokevirtual   org/whispersystems/aj.c:()V
        //   249: return         
        //   250: iload_3        
        //   251: ifeq            336
        //   254: iconst_1       
        //   255: istore          5
        //   257: goto            100
        //   260: astore          10
        //   262: aload           10
        //   264: athrow         
        //   265: astore          8
        //   267: aload           8
        //   269: aload_0        
        //   270: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   273: athrow         
        //   274: astore          7
        //   276: aload_0        
        //   277: aload           4
        //   279: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   282: putfield        org/whispersystems/aj.o:Lcom/google/ce;
        //   285: aload_0        
        //   286: invokevirtual   org/whispersystems/aj.c:()V
        //   289: aload           7
        //   291: athrow         
        //   292: astore          12
        //   294: aload           12
        //   296: athrow         
        //   297: astore          13
        //   299: aload           13
        //   301: athrow         
        //   302: astore          14
        //   304: aload           14
        //   306: athrow         
        //   307: astore          15
        //   309: aload           15
        //   311: athrow         
        //   312: astore          16
        //   314: aload           16
        //   316: athrow         
        //   317: astore          6
        //   319: new             Lcom/google/bg;
        //   322: dup            
        //   323: aload           6
        //   325: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   328: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   331: aload_0        
        //   332: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   335: athrow         
        //   336: iconst_1       
        //   337: istore          5
        //   339: goto            232
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     265    274    Lcom/google/bg;
        //  35     41     317    336    Ljava/io/IOException;
        //  35     41     274    292    Any
        //  100    112    260    265    Lcom/google/bg;
        //  100    112    317    336    Ljava/io/IOException;
        //  100    112    274    292    Any
        //  124    142    292    297    Lcom/google/bg;
        //  124    142    317    336    Ljava/io/IOException;
        //  124    142    274    292    Any
        //  146    164    297    302    Lcom/google/bg;
        //  146    164    317    336    Ljava/io/IOException;
        //  146    164    274    292    Any
        //  168    186    302    307    Lcom/google/bg;
        //  168    186    317    336    Ljava/io/IOException;
        //  168    186    274    292    Any
        //  190    209    307    312    Lcom/google/bg;
        //  190    209    317    336    Ljava/io/IOException;
        //  190    209    274    292    Any
        //  213    232    312    317    Lcom/google/bg;
        //  213    232    317    336    Ljava/io/IOException;
        //  213    232    274    292    Any
        //  262    265    265    274    Lcom/google/bg;
        //  262    265    317    336    Ljava/io/IOException;
        //  262    265    274    292    Any
        //  267    274    274    292    Any
        //  294    297    297    302    Lcom/google/bg;
        //  294    297    317    336    Ljava/io/IOException;
        //  294    297    274    292    Any
        //  299    302    302    307    Lcom/google/bg;
        //  299    302    317    336    Ljava/io/IOException;
        //  299    302    274    292    Any
        //  304    307    307    312    Lcom/google/bg;
        //  304    307    317    336    Ljava/io/IOException;
        //  304    307    274    292    Any
        //  309    312    312    317    Lcom/google/bg;
        //  309    312    317    336    Ljava/io/IOException;
        //  309    312    274    292    Any
        //  314    317    265    274    Lcom/google/bg;
        //  314    317    317    336    Ljava/io/IOException;
        //  314    317    274    292    Any
        //  319    336    274    292    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 152, Size: 152
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    aj(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private aj(final fp fp) {
        super(fp);
        this.n = -1;
        this.t = -1;
        this.o = fp.getUnknownFields();
    }
    
    aj(final fp fp, final j j) {
        this(fp);
    }
    
    private aj(final boolean b) {
        this.n = -1;
        this.t = -1;
        this.o = ce.d();
    }
    
    static int a(final aj aj, final int f) {
        return aj.f = f;
    }
    
    static long a(final aj aj, final long g) {
        return aj.g = g;
    }
    
    static hv a(final aj aj, final hv l) {
        return aj.l = l;
    }
    
    public static aj a(final cL cl) {
        return (aj)aj.p.a(cl);
    }
    
    public static aj a(final cL cl, final fu fu) {
        return (aj)aj.p.a(cl, fu);
    }
    
    public static aj a(final hv hv) {
        return (aj)aj.p.a(hv);
    }
    
    public static aj a(final hv hv, final fu fu) {
        return (aj)aj.p.a(hv, fu);
    }
    
    public static aj a(final InputStream inputStream) {
        return (aj)aj.p.b(inputStream);
    }
    
    public static aj a(final InputStream inputStream, final fu fu) {
        return (aj)aj.p.a(inputStream, fu);
    }
    
    public static aj a(final byte[] array) {
        return (aj)aj.p.a(array);
    }
    
    public static aj a(final byte[] array, final fu fu) {
        return (aj)aj.p.a(array, fu);
    }
    
    public static bQ a(final aj aj) {
        return n().a(aj);
    }
    
    static int b(final aj aj, final int m) {
        return aj.m = m;
    }
    
    static hv b(final aj aj, final hv q) {
        return aj.q = q;
    }
    
    public static aj b(final InputStream inputStream) {
        return (aj)aj.p.a(inputStream);
    }
    
    public static aj b(final InputStream inputStream, final fu fu) {
        return (aj)aj.p.b(inputStream, fu);
    }
    
    private void b() {
        this.m = 0;
        this.q = hv.b;
        this.e = hv.b;
        this.l = hv.b;
        this.g = 0L;
    }
    
    static hv c(final aj aj, final hv e) {
        return aj.e = e;
    }
    
    static boolean e() {
        return aj.d;
    }
    
    public static aj j() {
        return aj.h;
    }
    
    public static final com.google.bl l() {
        return bO.j();
    }
    
    public static bQ n() {
        return bQ.c();
    }
    
    protected bQ a(final dg dg) {
        return new bQ(dg, null);
    }
    
    public hv c() {
        return this.l;
    }
    
    public hv d() {
        return this.e;
    }
    
    public long f() {
        return this.g;
    }
    
    public bQ g() {
        return a(this);
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.s();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.s();
    }
    
    @Override
    public du getParserForType() {
        return aj.p;
    }
    
    @Override
    public int getSerializedSize() {
        final int t = this.t;
        if (t != -1) {
            return t;
        }
        final int n = 0x1 & this.f;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.m);
        }
        if ((0x2 & this.f) == 0x2) {
            n2 += ep.b(2, this.q);
        }
        if ((0x4 & this.f) == 0x4) {
            n2 += ep.b(3, this.e);
        }
        if ((0x8 & this.f) == 0x8) {
            n2 += ep.b(4, this.l);
        }
        if ((0x10 & this.f) == 0x10) {
            n2 += ep.d(5, this.g);
        }
        return this.t = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.o;
    }
    
    public hv h() {
        return this.q;
    }
    
    public bQ i() {
        return n();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.v().a(aj.class, bQ.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte n = this.n;
        if (n != -1) {
            return n == 1;
        }
        this.n = 1;
        return true;
    }
    
    public boolean k() {
        return (0x2 & this.f) == 0x2;
    }
    
    public boolean m() {
        return (0x4 & this.f) == 0x4;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.i();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.i();
    }
    
    public boolean o() {
        return (0x10 & this.f) == 0x10;
    }
    
    public boolean p() {
        return (0x1 & this.f) == 0x1;
    }
    
    public boolean q() {
        return (0x8 & this.f) == 0x8;
    }
    
    public int r() {
        return this.m;
    }
    
    public aj s() {
        return aj.h;
    }
    
    @Override
    public a8 toBuilder() {
        return this.g();
    }
    
    @Override
    public aJ toBuilder() {
        return this.g();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.f) == 0x1) {
            ep.a(1, this.m);
        }
        if ((0x2 & this.f) == 0x2) {
            ep.c(2, this.q);
        }
        if ((0x4 & this.f) == 0x4) {
            ep.c(3, this.e);
        }
        if ((0x8 & this.f) == 0x8) {
            ep.c(4, this.l);
        }
        if ((0x10 & this.f) == 0x10) {
            ep.c(5, this.g);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
