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
import com.google.bl;
import java.io.InputStream;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import com.google.hv;
import com.google.du;
import com.google.dS;

public final class aC extends dS implements bC
{
    public static final int e = 4;
    public static final int g = 3;
    public static final int k = 2;
    public static du o;
    public static final int q = 5;
    public static final int s = 1;
    private static final long serialVersionUID;
    private static final aC t;
    private byte f;
    private int h;
    private hv i;
    private hv j;
    private final ce l;
    private int m;
    private hv n;
    private int p;
    private hv r;
    
    static {
        aC.o = new by();
        (t = new aC(true)).n();
    }
    
    private aC(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/bR.h:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        org/whispersystems/aC.f:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/aC.h:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/aC.n:()V
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
        //               42: 213
        //          default: 100
        //        }
        //   100: aload_0        
        //   101: aload_1        
        //   102: aload           4
        //   104: aload_2        
        //   105: iload           9
        //   107: invokevirtual   org/whispersystems/aC.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
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
        //   127: getfield        org/whispersystems/aC.m:I
        //   130: ior            
        //   131: putfield        org/whispersystems/aC.m:I
        //   134: aload_0        
        //   135: aload_1        
        //   136: invokevirtual   com/google/cL.l:()I
        //   139: putfield        org/whispersystems/aC.p:I
        //   142: iload_3        
        //   143: ifeq            232
        //   146: aload_0        
        //   147: iconst_2       
        //   148: aload_0        
        //   149: getfield        org/whispersystems/aC.m:I
        //   152: ior            
        //   153: putfield        org/whispersystems/aC.m:I
        //   156: aload_0        
        //   157: aload_1        
        //   158: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   161: putfield        org/whispersystems/aC.j:Lcom/google/hv;
        //   164: iload_3        
        //   165: ifeq            232
        //   168: aload_0        
        //   169: iconst_4       
        //   170: aload_0        
        //   171: getfield        org/whispersystems/aC.m:I
        //   174: ior            
        //   175: putfield        org/whispersystems/aC.m:I
        //   178: aload_0        
        //   179: aload_1        
        //   180: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   183: putfield        org/whispersystems/aC.r:Lcom/google/hv;
        //   186: iload_3        
        //   187: ifeq            232
        //   190: aload_0        
        //   191: bipush          8
        //   193: aload_0        
        //   194: getfield        org/whispersystems/aC.m:I
        //   197: ior            
        //   198: putfield        org/whispersystems/aC.m:I
        //   201: aload_0        
        //   202: aload_1        
        //   203: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   206: putfield        org/whispersystems/aC.i:Lcom/google/hv;
        //   209: iload_3        
        //   210: ifeq            232
        //   213: aload_0        
        //   214: bipush          16
        //   216: aload_0        
        //   217: getfield        org/whispersystems/aC.m:I
        //   220: ior            
        //   221: putfield        org/whispersystems/aC.m:I
        //   224: aload_0        
        //   225: aload_1        
        //   226: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   229: putfield        org/whispersystems/aC.n:Lcom/google/hv;
        //   232: iload_3        
        //   233: ifeq            30
        //   236: aload_0        
        //   237: aload           4
        //   239: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   242: putfield        org/whispersystems/aC.l:Lcom/google/ce;
        //   245: aload_0        
        //   246: invokevirtual   org/whispersystems/aC.c:()V
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
        //   282: putfield        org/whispersystems/aC.l:Lcom/google/ce;
        //   285: aload_0        
        //   286: invokevirtual   org/whispersystems/aC.c:()V
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
    
    aC(final cL cl, final fu fu, final U u) {
        this(cl, fu);
    }
    
    private aC(final fp fp) {
        super(fp);
        this.f = -1;
        this.h = -1;
        this.l = fp.getUnknownFields();
    }
    
    aC(final fp fp, final U u) {
        this(fp);
    }
    
    private aC(final boolean b) {
        this.f = -1;
        this.h = -1;
        this.l = ce.d();
    }
    
    static int a(final aC ac, final int p2) {
        return ac.p = p2;
    }
    
    static hv a(final aC ac, final hv i) {
        return ac.i = i;
    }
    
    public static aC a(final cL cl) {
        return (aC)aC.o.a(cl);
    }
    
    public static aC a(final cL cl, final fu fu) {
        return (aC)aC.o.a(cl, fu);
    }
    
    public static aC a(final hv hv) {
        return (aC)aC.o.a(hv);
    }
    
    public static aC a(final hv hv, final fu fu) {
        return (aC)aC.o.a(hv, fu);
    }
    
    public static aC a(final InputStream inputStream) {
        return (aC)aC.o.b(inputStream);
    }
    
    public static aC a(final InputStream inputStream, final fu fu) {
        return (aC)aC.o.b(inputStream, fu);
    }
    
    public static aC a(final byte[] array) {
        return (aC)aC.o.a(array);
    }
    
    public static aC a(final byte[] array, final fu fu) {
        return (aC)aC.o.a(array, fu);
    }
    
    public static aG a(final aC ac) {
        return e().a(ac);
    }
    
    static boolean a() {
        return aC.d;
    }
    
    static int b(final aC ac, final int m) {
        return ac.m = m;
    }
    
    public static final bl b() {
        return bR.h();
    }
    
    static hv b(final aC ac, final hv r) {
        return ac.r = r;
    }
    
    public static aC b(final InputStream inputStream) {
        return (aC)aC.o.a(inputStream);
    }
    
    public static aC b(final InputStream inputStream, final fu fu) {
        return (aC)aC.o.a(inputStream, fu);
    }
    
    static hv c(final aC ac, final hv j) {
        return ac.j = j;
    }
    
    static hv d(final aC ac, final hv n) {
        return ac.n = n;
    }
    
    public static aG e() {
        return aG.h();
    }
    
    public static aC f() {
        return aC.t;
    }
    
    private void n() {
        this.p = 0;
        this.j = hv.b;
        this.r = hv.b;
        this.i = hv.b;
        this.n = hv.b;
    }
    
    protected aG a(final dg dg) {
        return new aG(dg, null);
    }
    
    public boolean c() {
        return (0x1 & this.m) == 0x1;
    }
    
    public hv d() {
        return this.i;
    }
    
    public int g() {
        return this.p;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.o();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.o();
    }
    
    @Override
    public du getParserForType() {
        return aC.o;
    }
    
    @Override
    public int getSerializedSize() {
        final int h = this.h;
        if (h != -1) {
            return h;
        }
        final int n = 0x1 & this.m;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.p);
        }
        if ((0x2 & this.m) == 0x2) {
            n2 += ep.b(2, this.j);
        }
        if ((0x4 & this.m) == 0x4) {
            n2 += ep.b(3, this.r);
        }
        if ((0x8 & this.m) == 0x8) {
            n2 += ep.b(4, this.i);
        }
        if ((0x10 & this.m) == 0x10) {
            n2 += ep.b(5, this.n);
        }
        return this.h = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.l;
    }
    
    public aG h() {
        return a(this);
    }
    
    public aG i() {
        return e();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bR.a().a(aC.class, aG.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte f = this.f;
        if (f != -1) {
            return f == 1;
        }
        this.f = 1;
        return true;
    }
    
    public hv j() {
        return this.j;
    }
    
    public boolean k() {
        return (0x2 & this.m) == 0x2;
    }
    
    public boolean l() {
        return (0x4 & this.m) == 0x4;
    }
    
    public hv m() {
        return this.n;
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
    
    public aC o() {
        return aC.t;
    }
    
    public hv p() {
        return this.r;
    }
    
    public boolean q() {
        return (0x8 & this.m) == 0x8;
    }
    
    public boolean r() {
        return (0x10 & this.m) == 0x10;
    }
    
    @Override
    public a8 toBuilder() {
        return this.h();
    }
    
    @Override
    public aJ toBuilder() {
        return this.h();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.m) == 0x1) {
            ep.a(1, this.p);
        }
        if ((0x2 & this.m) == 0x2) {
            ep.c(2, this.j);
        }
        if ((0x4 & this.m) == 0x4) {
            ep.c(3, this.r);
        }
        if ((0x8 & this.m) == 0x8) {
            ep.c(4, this.i);
        }
        if ((0x10 & this.m) == 0x10) {
            ep.c(5, this.n);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
