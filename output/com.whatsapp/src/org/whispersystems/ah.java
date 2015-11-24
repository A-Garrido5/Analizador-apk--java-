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
import com.google.bl;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import com.google.hv;
import com.google.du;
import com.google.dS;

public final class ah extends dS implements e
{
    public static final int CIPHERKEY_FIELD_NUMBER = 2;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int IV_FIELD_NUMBER = 4;
    public static final int MACKEY_FIELD_NUMBER = 3;
    public static du PARSER;
    private static final ah i;
    private static final long serialVersionUID;
    private int e;
    private hv f;
    private int g;
    private hv h;
    private hv j;
    private final ce k;
    private byte l;
    private int m;
    
    static {
        ah.PARSER = new bU();
        (i = new ah(true)).o();
    }
    
    private ah(final cL p0, final fu p1) {
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
        //    10: putfield        org/whispersystems/ah.l:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        org/whispersystems/ah.g:I
        //    18: aload_0        
        //    19: invokespecial   org/whispersystems/ah.o:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            205
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 219
        //                8: 116
        //               18: 138
        //               26: 160
        //               34: 182
        //          default: 92
        //        }
        //    92: aload_0        
        //    93: aload_1        
        //    94: aload           4
        //    96: aload_2        
        //    97: iload           9
        //    99: invokevirtual   org/whispersystems/ah.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //   102: istore          11
        //   104: iload           11
        //   106: ifne            201
        //   109: iload_3        
        //   110: ifeq            300
        //   113: iconst_1       
        //   114: istore          5
        //   116: aload_0        
        //   117: iconst_1       
        //   118: aload_0        
        //   119: getfield        org/whispersystems/ah.e:I
        //   122: ior            
        //   123: putfield        org/whispersystems/ah.e:I
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokevirtual   com/google/cL.l:()I
        //   131: putfield        org/whispersystems/ah.m:I
        //   134: iload_3        
        //   135: ifeq            201
        //   138: aload_0        
        //   139: iconst_2       
        //   140: aload_0        
        //   141: getfield        org/whispersystems/ah.e:I
        //   144: ior            
        //   145: putfield        org/whispersystems/ah.e:I
        //   148: aload_0        
        //   149: aload_1        
        //   150: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   153: putfield        org/whispersystems/ah.h:Lcom/google/hv;
        //   156: iload_3        
        //   157: ifeq            201
        //   160: aload_0        
        //   161: iconst_4       
        //   162: aload_0        
        //   163: getfield        org/whispersystems/ah.e:I
        //   166: ior            
        //   167: putfield        org/whispersystems/ah.e:I
        //   170: aload_0        
        //   171: aload_1        
        //   172: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   175: putfield        org/whispersystems/ah.f:Lcom/google/hv;
        //   178: iload_3        
        //   179: ifeq            201
        //   182: aload_0        
        //   183: bipush          8
        //   185: aload_0        
        //   186: getfield        org/whispersystems/ah.e:I
        //   189: ior            
        //   190: putfield        org/whispersystems/ah.e:I
        //   193: aload_0        
        //   194: aload_1        
        //   195: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   198: putfield        org/whispersystems/ah.j:Lcom/google/hv;
        //   201: iload_3        
        //   202: ifeq            30
        //   205: aload_0        
        //   206: aload           4
        //   208: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   211: putfield        org/whispersystems/ah.k:Lcom/google/ce;
        //   214: aload_0        
        //   215: invokevirtual   org/whispersystems/ah.c:()V
        //   218: return         
        //   219: iload_3        
        //   220: ifeq            300
        //   223: iconst_1       
        //   224: istore          5
        //   226: goto            92
        //   229: astore          10
        //   231: aload           10
        //   233: athrow         
        //   234: astore          8
        //   236: aload           8
        //   238: aload_0        
        //   239: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   242: athrow         
        //   243: astore          7
        //   245: aload_0        
        //   246: aload           4
        //   248: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   251: putfield        org/whispersystems/ah.k:Lcom/google/ce;
        //   254: aload_0        
        //   255: invokevirtual   org/whispersystems/ah.c:()V
        //   258: aload           7
        //   260: athrow         
        //   261: astore          12
        //   263: aload           12
        //   265: athrow         
        //   266: astore          13
        //   268: aload           13
        //   270: athrow         
        //   271: astore          14
        //   273: aload           14
        //   275: athrow         
        //   276: astore          15
        //   278: aload           15
        //   280: athrow         
        //   281: astore          6
        //   283: new             Lcom/google/bg;
        //   286: dup            
        //   287: aload           6
        //   289: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   292: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   295: aload_0        
        //   296: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   299: athrow         
        //   300: iconst_1       
        //   301: istore          5
        //   303: goto            201
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     234    243    Lcom/google/bg;
        //  35     41     281    300    Ljava/io/IOException;
        //  35     41     243    261    Any
        //  92     104    229    234    Lcom/google/bg;
        //  92     104    281    300    Ljava/io/IOException;
        //  92     104    243    261    Any
        //  116    134    261    266    Lcom/google/bg;
        //  116    134    281    300    Ljava/io/IOException;
        //  116    134    243    261    Any
        //  138    156    266    271    Lcom/google/bg;
        //  138    156    281    300    Ljava/io/IOException;
        //  138    156    243    261    Any
        //  160    178    271    276    Lcom/google/bg;
        //  160    178    281    300    Ljava/io/IOException;
        //  160    178    243    261    Any
        //  182    201    276    281    Lcom/google/bg;
        //  182    201    281    300    Ljava/io/IOException;
        //  182    201    243    261    Any
        //  231    234    234    243    Lcom/google/bg;
        //  231    234    281    300    Ljava/io/IOException;
        //  231    234    243    261    Any
        //  236    243    243    261    Any
        //  263    266    266    271    Lcom/google/bg;
        //  263    266    281    300    Ljava/io/IOException;
        //  263    266    243    261    Any
        //  268    271    271    276    Lcom/google/bg;
        //  268    271    281    300    Ljava/io/IOException;
        //  268    271    243    261    Any
        //  273    276    276    281    Lcom/google/bg;
        //  273    276    281    300    Ljava/io/IOException;
        //  273    276    243    261    Any
        //  278    281    234    243    Lcom/google/bg;
        //  278    281    281    300    Ljava/io/IOException;
        //  278    281    243    261    Any
        //  283    300    243    261    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 137, Size: 137
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
    
    ah(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private ah(final fp fp) {
        super(fp);
        this.l = -1;
        this.g = -1;
        this.k = fp.getUnknownFields();
    }
    
    ah(final fp fp, final j j) {
        this(fp);
    }
    
    private ah(final boolean b) {
        this.l = -1;
        this.g = -1;
        this.k = ce.d();
    }
    
    static int a(final ah ah, final int m) {
        return ah.m = m;
    }
    
    public static final bl a() {
        return bO.E();
    }
    
    static hv a(final ah ah, final hv j) {
        return ah.j = j;
    }
    
    public static ah a(final cL cl) {
        return (ah)ah.PARSER.a(cl);
    }
    
    public static ah a(final cL cl, final fu fu) {
        return (ah)ah.PARSER.a(cl, fu);
    }
    
    public static ah a(final hv hv) {
        return (ah)ah.PARSER.a(hv);
    }
    
    public static ah a(final hv hv, final fu fu) {
        return (ah)ah.PARSER.a(hv, fu);
    }
    
    public static ah a(final InputStream inputStream) {
        return (ah)ah.PARSER.a(inputStream);
    }
    
    public static ah a(final InputStream inputStream, final fu fu) {
        return (ah)ah.PARSER.a(inputStream, fu);
    }
    
    public static ah a(final byte[] array) {
        return (ah)ah.PARSER.a(array);
    }
    
    public static ah a(final byte[] array, final fu fu) {
        return (ah)ah.PARSER.a(array, fu);
    }
    
    public static bt a(final ah ah) {
        return d().a(ah);
    }
    
    static int b(final ah ah, final int e) {
        return ah.e = e;
    }
    
    static hv b(final ah ah, final hv h) {
        return ah.h = h;
    }
    
    public static ah b(final InputStream inputStream) {
        return (ah)ah.PARSER.b(inputStream);
    }
    
    public static ah b(final InputStream inputStream, final fu fu) {
        return (ah)ah.PARSER.b(inputStream, fu);
    }
    
    static hv c(final ah ah, final hv f) {
        return ah.f = f;
    }
    
    public static bt d() {
        return bt.g();
    }
    
    static boolean i() {
        return ah.d;
    }
    
    public static ah l() {
        return ah.i;
    }
    
    private void o() {
        this.m = 0;
        this.h = hv.b;
        this.f = hv.b;
        this.j = hv.b;
    }
    
    protected bt a(final dg dg) {
        return new bt(dg, null);
    }
    
    public hv c() {
        return this.f;
    }
    
    public hv e() {
        return this.j;
    }
    
    public boolean f() {
        return (0x2 & this.e) == 0x2;
    }
    
    public boolean g() {
        return (0x4 & this.e) == 0x4;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.n();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.n();
    }
    
    @Override
    public du getParserForType() {
        return ah.PARSER;
    }
    
    @Override
    public int getSerializedSize() {
        final int g = this.g;
        if (g != -1) {
            return g;
        }
        final int n = 0x1 & this.e;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.m);
        }
        if ((0x2 & this.e) == 0x2) {
            n2 += ep.b(2, this.h);
        }
        if ((0x4 & this.e) == 0x4) {
            n2 += ep.b(3, this.f);
        }
        if ((0x8 & this.e) == 0x8) {
            n2 += ep.b(4, this.j);
        }
        return this.g = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.k;
    }
    
    public hv h() {
        return this.h;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.i().a(ah.class, bt.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte l = this.l;
        if (l != -1) {
            return l == 1;
        }
        this.l = 1;
        return true;
    }
    
    public bt j() {
        return a(this);
    }
    
    public int k() {
        return this.m;
    }
    
    public bt m() {
        return d();
    }
    
    public ah n() {
        return ah.i;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.m();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.m();
    }
    
    public boolean p() {
        return (0x8 & this.e) == 0x8;
    }
    
    public boolean q() {
        return (0x1 & this.e) == 0x1;
    }
    
    @Override
    public a8 toBuilder() {
        return this.j();
    }
    
    @Override
    public aJ toBuilder() {
        return this.j();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.e) == 0x1) {
            ep.a(1, this.m);
        }
        if ((0x2 & this.e) == 0x2) {
            ep.c(2, this.h);
        }
        if ((0x4 & this.e) == 0x4) {
            ep.c(3, this.f);
        }
        if ((0x8 & this.e) == 0x8) {
            ep.c(4, this.j);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
