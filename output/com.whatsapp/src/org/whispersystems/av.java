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

public final class av extends dS implements N
{
    public static final int BASEKEY_FIELD_NUMBER = 2;
    public static du PARSER;
    public static final int PREKEYID_FIELD_NUMBER = 1;
    public static final int SIGNEDPREKEYID_FIELD_NUMBER = 3;
    private static final av j;
    private static final long serialVersionUID;
    private hv e;
    private int f;
    private final ce g;
    private byte h;
    private int i;
    private int k;
    private int l;
    
    static {
        av.PARSER = new bg();
        (j = new av(true)).b();
    }
    
    private av(final cL p0, final fu p1) {
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
        //    10: putfield        org/whispersystems/av.h:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/av.i:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/av.b:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            174
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 188
        //                8: 108
        //               18: 130
        //               24: 152
        //          default: 84
        //        }
        //    84: aload_0        
        //    85: aload_1        
        //    86: aload           4
        //    88: aload_2        
        //    89: iload           9
        //    91: invokevirtual   org/whispersystems/av.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    94: istore          11
        //    96: iload           11
        //    98: ifne            170
        //   101: iload_3        
        //   102: ifeq            264
        //   105: iconst_1       
        //   106: istore          5
        //   108: aload_0        
        //   109: iconst_1       
        //   110: aload_0        
        //   111: getfield        org/whispersystems/av.k:I
        //   114: ior            
        //   115: putfield        org/whispersystems/av.k:I
        //   118: aload_0        
        //   119: aload_1        
        //   120: invokevirtual   com/google/cL.l:()I
        //   123: putfield        org/whispersystems/av.l:I
        //   126: iload_3        
        //   127: ifeq            170
        //   130: aload_0        
        //   131: iconst_4       
        //   132: aload_0        
        //   133: getfield        org/whispersystems/av.k:I
        //   136: ior            
        //   137: putfield        org/whispersystems/av.k:I
        //   140: aload_0        
        //   141: aload_1        
        //   142: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   145: putfield        org/whispersystems/av.e:Lcom/google/hv;
        //   148: iload_3        
        //   149: ifeq            170
        //   152: aload_0        
        //   153: iconst_2       
        //   154: aload_0        
        //   155: getfield        org/whispersystems/av.k:I
        //   158: ior            
        //   159: putfield        org/whispersystems/av.k:I
        //   162: aload_0        
        //   163: aload_1        
        //   164: invokevirtual   com/google/cL.j:()I
        //   167: putfield        org/whispersystems/av.f:I
        //   170: iload_3        
        //   171: ifeq            30
        //   174: aload_0        
        //   175: aload           4
        //   177: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   180: putfield        org/whispersystems/av.g:Lcom/google/ce;
        //   183: aload_0        
        //   184: invokevirtual   org/whispersystems/av.c:()V
        //   187: return         
        //   188: iload_3        
        //   189: ifeq            264
        //   192: iconst_1       
        //   193: istore          5
        //   195: goto            84
        //   198: astore          10
        //   200: aload           10
        //   202: athrow         
        //   203: astore          8
        //   205: aload           8
        //   207: aload_0        
        //   208: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   211: athrow         
        //   212: astore          7
        //   214: aload_0        
        //   215: aload           4
        //   217: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   220: putfield        org/whispersystems/av.g:Lcom/google/ce;
        //   223: aload_0        
        //   224: invokevirtual   org/whispersystems/av.c:()V
        //   227: aload           7
        //   229: athrow         
        //   230: astore          12
        //   232: aload           12
        //   234: athrow         
        //   235: astore          13
        //   237: aload           13
        //   239: athrow         
        //   240: astore          14
        //   242: aload           14
        //   244: athrow         
        //   245: astore          6
        //   247: new             Lcom/google/bg;
        //   250: dup            
        //   251: aload           6
        //   253: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   256: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   259: aload_0        
        //   260: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   263: athrow         
        //   264: iconst_1       
        //   265: istore          5
        //   267: goto            170
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     203    212    Lcom/google/bg;
        //  35     41     245    264    Ljava/io/IOException;
        //  35     41     212    230    Any
        //  84     96     198    203    Lcom/google/bg;
        //  84     96     245    264    Ljava/io/IOException;
        //  84     96     212    230    Any
        //  108    126    230    235    Lcom/google/bg;
        //  108    126    245    264    Ljava/io/IOException;
        //  108    126    212    230    Any
        //  130    148    235    240    Lcom/google/bg;
        //  130    148    245    264    Ljava/io/IOException;
        //  130    148    212    230    Any
        //  152    170    240    245    Lcom/google/bg;
        //  152    170    245    264    Ljava/io/IOException;
        //  152    170    212    230    Any
        //  200    203    203    212    Lcom/google/bg;
        //  200    203    245    264    Ljava/io/IOException;
        //  200    203    212    230    Any
        //  205    212    212    230    Any
        //  232    235    235    240    Lcom/google/bg;
        //  232    235    245    264    Ljava/io/IOException;
        //  232    235    212    230    Any
        //  237    240    240    245    Lcom/google/bg;
        //  237    240    245    264    Ljava/io/IOException;
        //  237    240    212    230    Any
        //  242    245    203    212    Lcom/google/bg;
        //  242    245    245    264    Ljava/io/IOException;
        //  242    245    212    230    Any
        //  247    264    212    230    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 122, Size: 122
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
    
    av(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private av(final fp fp) {
        super(fp);
        this.h = -1;
        this.i = -1;
        this.g = fp.getUnknownFields();
    }
    
    av(final fp fp, final j j) {
        this(fp);
    }
    
    private av(final boolean b) {
        this.h = -1;
        this.i = -1;
        this.g = ce.d();
    }
    
    static int a(final av av, final int l) {
        return av.l = l;
    }
    
    static hv a(final av av, final hv e) {
        return av.e = e;
    }
    
    public static av a(final cL cl) {
        return (av)av.PARSER.a(cl);
    }
    
    public static av a(final cL cl, final fu fu) {
        return (av)av.PARSER.a(cl, fu);
    }
    
    public static av a(final hv hv) {
        return (av)av.PARSER.a(hv);
    }
    
    public static av a(final hv hv, final fu fu) {
        return (av)av.PARSER.a(hv, fu);
    }
    
    public static av a(final InputStream inputStream) {
        return (av)av.PARSER.a(inputStream);
    }
    
    public static av a(final InputStream inputStream, final fu fu) {
        return (av)av.PARSER.b(inputStream, fu);
    }
    
    public static av a(final byte[] array) {
        return (av)av.PARSER.a(array);
    }
    
    public static av a(final byte[] array, final fu fu) {
        return (av)av.PARSER.a(array, fu);
    }
    
    public static bS a() {
        return bS.a();
    }
    
    public static bS a(final av av) {
        return a().a(av);
    }
    
    static int b(final av av, final int k) {
        return av.k = k;
    }
    
    public static av b(final InputStream inputStream) {
        return (av)av.PARSER.b(inputStream);
    }
    
    public static av b(final InputStream inputStream, final fu fu) {
        return (av)av.PARSER.a(inputStream, fu);
    }
    
    private void b() {
        this.l = 0;
        this.f = 0;
        this.e = hv.b;
    }
    
    static int c(final av av, final int f) {
        return av.f = f;
    }
    
    public static av c() {
        return av.j;
    }
    
    static boolean d() {
        return av.d;
    }
    
    public static final bl g() {
        return bO.D();
    }
    
    protected bS a(final dg dg) {
        return new bS(dg, null);
    }
    
    public av e() {
        return av.j;
    }
    
    public hv f() {
        return this.e;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.e();
    }
    
    @Override
    public du getParserForType() {
        return av.PARSER;
    }
    
    @Override
    public int getSerializedSize() {
        final int i = this.i;
        if (i != -1) {
            return i;
        }
        final int n = 0x1 & this.k;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.l);
        }
        if ((0x4 & this.k) == 0x4) {
            n2 += ep.b(2, this.e);
        }
        if ((0x2 & this.k) == 0x2) {
            n2 += ep.c(3, this.f);
        }
        return this.i = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.g;
    }
    
    public boolean h() {
        return (0x4 & this.k) == 0x4;
    }
    
    public int i() {
        return this.f;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.q().a(av.class, bS.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte h = this.h;
        if (h != -1) {
            return h == 1;
        }
        this.h = 1;
        return true;
    }
    
    public boolean j() {
        return (0x2 & this.k) == 0x2;
    }
    
    public bS k() {
        return a();
    }
    
    public int l() {
        return this.l;
    }
    
    public boolean m() {
        return (0x1 & this.k) == 0x1;
    }
    
    public bS n() {
        return a(this);
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.k();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.k();
    }
    
    @Override
    public a8 toBuilder() {
        return this.n();
    }
    
    @Override
    public aJ toBuilder() {
        return this.n();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.k) == 0x1) {
            ep.a(1, this.l);
        }
        if ((0x4 & this.k) == 0x4) {
            ep.c(2, this.e);
        }
        if ((0x2 & this.k) == 0x2) {
            ep.e(3, this.f);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
