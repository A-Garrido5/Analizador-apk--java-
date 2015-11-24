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
import java.util.Collections;
import java.io.InputStream;
import com.google.hv;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import java.util.List;
import com.google.ce;
import com.google.du;
import com.google.dS;

public final class ay extends dS implements u
{
    public static final int g = 1;
    public static du i;
    private static final ay m;
    public static final int n = 2;
    private static final long serialVersionUID;
    private int e;
    private aZ f;
    private byte h;
    private final ce j;
    private List k;
    private int l;
    
    static {
        ay.i = new b_();
        (m = new ay(true)).h();
    }
    
    private ay(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       org/whispersystems/aZ.o:Z
        //     5: istore          4
        //     7: aload_0        
        //     8: invokespecial   com/google/dS.<init>:()V
        //    11: aload_0        
        //    12: iconst_m1      
        //    13: putfield        org/whispersystems/ay.h:B
        //    16: aload_0        
        //    17: iconst_m1      
        //    18: putfield        org/whispersystems/ay.l:I
        //    21: aload_0        
        //    22: invokespecial   org/whispersystems/ay.h:()V
        //    25: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    28: astore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload_3        
        //    34: ifne            233
        //    37: aload_1        
        //    38: invokevirtual   com/google/cL.a:()I
        //    41: istore          12
        //    43: iload           12
        //    45: lookupswitch {
        //                0: 266
        //               10: 383
        //               18: 185
        //          default: 80
        //        }
        //    80: aload_0        
        //    81: aload_1        
        //    82: aload           5
        //    84: aload_2        
        //    85: iload           12
        //    87: invokevirtual   org/whispersystems/ay.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    90: istore          21
        //    92: iload           21
        //    94: ifne            228
        //    97: iload           4
        //    99: ifeq            378
        //   102: iconst_1       
        //   103: istore          13
        //   105: iconst_1       
        //   106: aload_0        
        //   107: getfield        org/whispersystems/ay.e:I
        //   110: iand           
        //   111: iconst_1       
        //   112: if_icmpne       372
        //   115: aload_0        
        //   116: getfield        org/whispersystems/ay.f:Lorg/whispersystems/aZ;
        //   119: invokevirtual   org/whispersystems/aZ.r:()Lorg/whispersystems/a2;
        //   122: astore          19
        //   124: aload           19
        //   126: astore          14
        //   128: aload_0        
        //   129: aload_1        
        //   130: getstatic       org/whispersystems/aZ.E:Lcom/google/du;
        //   133: aload_2        
        //   134: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   137: checkcast       Lorg/whispersystems/aZ;
        //   140: putfield        org/whispersystems/ay.f:Lorg/whispersystems/aZ;
        //   143: aload           14
        //   145: ifnull          167
        //   148: aload           14
        //   150: aload_0        
        //   151: getfield        org/whispersystems/ay.f:Lorg/whispersystems/aZ;
        //   154: invokevirtual   org/whispersystems/a2.a:(Lorg/whispersystems/aZ;)Lorg/whispersystems/a2;
        //   157: pop            
        //   158: aload_0        
        //   159: aload           14
        //   161: invokevirtual   org/whispersystems/a2.l:()Lorg/whispersystems/aZ;
        //   164: putfield        org/whispersystems/ay.f:Lorg/whispersystems/aZ;
        //   167: aload_0        
        //   168: iconst_1       
        //   169: aload_0        
        //   170: getfield        org/whispersystems/ay.e:I
        //   173: ior            
        //   174: putfield        org/whispersystems/ay.e:I
        //   177: iload           4
        //   179: ifeq            366
        //   182: iload           13
        //   184: istore_3       
        //   185: iload           6
        //   187: iconst_2       
        //   188: iand           
        //   189: iconst_2       
        //   190: if_icmpeq       210
        //   193: aload_0        
        //   194: new             Ljava/util/ArrayList;
        //   197: dup            
        //   198: invokespecial   java/util/ArrayList.<init>:()V
        //   201: putfield        org/whispersystems/ay.k:Ljava/util/List;
        //   204: iload           6
        //   206: iconst_2       
        //   207: ior            
        //   208: istore          6
        //   210: aload_0        
        //   211: getfield        org/whispersystems/ay.k:Ljava/util/List;
        //   214: aload_1        
        //   215: getstatic       org/whispersystems/aZ.E:Lcom/google/du;
        //   218: aload_2        
        //   219: invokevirtual   com/google/cL.a:(Lcom/google/du;Lcom/google/fu;)Lcom/google/ci;
        //   222: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   227: pop            
        //   228: iload           4
        //   230: ifeq            33
        //   233: iload           6
        //   235: iconst_2       
        //   236: iand           
        //   237: iconst_2       
        //   238: if_icmpne       252
        //   241: aload_0        
        //   242: aload_0        
        //   243: getfield        org/whispersystems/ay.k:Ljava/util/List;
        //   246: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   249: putfield        org/whispersystems/ay.k:Ljava/util/List;
        //   252: aload_0        
        //   253: aload           5
        //   255: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   258: putfield        org/whispersystems/ay.j:Lcom/google/ce;
        //   261: aload_0        
        //   262: invokevirtual   org/whispersystems/ay.c:()V
        //   265: return         
        //   266: iload           4
        //   268: ifeq            378
        //   271: iconst_1       
        //   272: istore_3       
        //   273: goto            80
        //   276: astore          20
        //   278: aload           20
        //   280: athrow         
        //   281: astore          11
        //   283: aload           11
        //   285: aload_0        
        //   286: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   289: athrow         
        //   290: astore          9
        //   292: iload           6
        //   294: iconst_2       
        //   295: iand           
        //   296: iconst_2       
        //   297: if_icmpne       311
        //   300: aload_0        
        //   301: aload_0        
        //   302: getfield        org/whispersystems/ay.k:Ljava/util/List;
        //   305: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   308: putfield        org/whispersystems/ay.k:Ljava/util/List;
        //   311: aload_0        
        //   312: aload           5
        //   314: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   317: putfield        org/whispersystems/ay.j:Lcom/google/ce;
        //   320: aload_0        
        //   321: invokevirtual   org/whispersystems/ay.c:()V
        //   324: aload           9
        //   326: athrow         
        //   327: astore          15
        //   329: aload           15
        //   331: athrow         
        //   332: astore          8
        //   334: new             Lcom/google/bg;
        //   337: dup            
        //   338: aload           8
        //   340: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   343: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   346: aload_0        
        //   347: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   350: athrow         
        //   351: astore          17
        //   353: aload           17
        //   355: athrow         
        //   356: astore          7
        //   358: aload           7
        //   360: athrow         
        //   361: astore          10
        //   363: aload           10
        //   365: athrow         
        //   366: iload           13
        //   368: istore_3       
        //   369: goto            228
        //   372: aconst_null    
        //   373: astore          14
        //   375: goto            128
        //   378: iconst_1       
        //   379: istore_3       
        //   380: goto            228
        //   383: iload_3        
        //   384: istore          13
        //   386: goto            105
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     43     281    290    Lcom/google/bg;
        //  37     43     332    351    Ljava/io/IOException;
        //  37     43     290    327    Any
        //  80     92     276    281    Lcom/google/bg;
        //  80     92     332    351    Ljava/io/IOException;
        //  80     92     290    327    Any
        //  105    124    281    290    Lcom/google/bg;
        //  105    124    332    351    Ljava/io/IOException;
        //  105    124    290    327    Any
        //  128    143    327    332    Lcom/google/bg;
        //  128    143    332    351    Ljava/io/IOException;
        //  128    143    290    327    Any
        //  148    167    327    332    Lcom/google/bg;
        //  148    167    332    351    Ljava/io/IOException;
        //  148    167    290    327    Any
        //  167    177    351    356    Lcom/google/bg;
        //  167    177    332    351    Ljava/io/IOException;
        //  167    177    290    327    Any
        //  193    204    281    290    Lcom/google/bg;
        //  193    204    332    351    Ljava/io/IOException;
        //  193    204    290    327    Any
        //  210    228    281    290    Lcom/google/bg;
        //  210    228    332    351    Ljava/io/IOException;
        //  210    228    290    327    Any
        //  241    252    356    361    Lcom/google/bg;
        //  278    281    281    290    Lcom/google/bg;
        //  278    281    332    351    Ljava/io/IOException;
        //  278    281    290    327    Any
        //  283    290    290    327    Any
        //  300    311    361    366    Lcom/google/bg;
        //  329    332    281    290    Lcom/google/bg;
        //  329    332    332    351    Ljava/io/IOException;
        //  329    332    290    327    Any
        //  334    351    290    327    Any
        //  353    356    281    290    Lcom/google/bg;
        //  353    356    332    351    Ljava/io/IOException;
        //  353    356    290    327    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 184, Size: 184
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
    
    ay(final cL cl, final fu fu, final j j) {
        this(cl, fu);
    }
    
    private ay(final fp fp) {
        super(fp);
        this.h = -1;
        this.l = -1;
        this.j = fp.getUnknownFields();
    }
    
    ay(final fp fp, final j j) {
        this(fp);
    }
    
    private ay(final boolean b) {
        this.h = -1;
        this.l = -1;
        this.j = ce.d();
    }
    
    static int a(final ay ay, final int e) {
        return ay.e = e;
    }
    
    static List a(final ay ay) {
        return ay.k;
    }
    
    static List a(final ay ay, final List k) {
        return ay.k = k;
    }
    
    static aZ a(final ay ay, final aZ f) {
        return ay.f = f;
    }
    
    public static ay a(final cL cl) {
        return (ay)ay.i.a(cl);
    }
    
    public static ay a(final cL cl, final fu fu) {
        return (ay)ay.i.a(cl, fu);
    }
    
    public static ay a(final hv hv) {
        return (ay)ay.i.a(hv);
    }
    
    public static ay a(final hv hv, final fu fu) {
        return (ay)ay.i.a(hv, fu);
    }
    
    public static ay a(final InputStream inputStream) {
        return (ay)ay.i.b(inputStream);
    }
    
    public static ay a(final InputStream inputStream, final fu fu) {
        return (ay)ay.i.a(inputStream, fu);
    }
    
    public static ay a(final byte[] array) {
        return (ay)ay.i.a(array);
    }
    
    public static ay a(final byte[] array, final fu fu) {
        return (ay)ay.i.a(array, fu);
    }
    
    public static ae b() {
        return ae.j();
    }
    
    public static ae b(final ay ay) {
        return b().a(ay);
    }
    
    public static ay b(final InputStream inputStream) {
        return (ay)ay.i.a(inputStream);
    }
    
    public static ay b(final InputStream inputStream, final fu fu) {
        return (ay)ay.i.b(inputStream, fu);
    }
    
    static boolean c() {
        return ay.d;
    }
    
    static boolean d() {
        return ay.d;
    }
    
    public static ay e() {
        return ay.m;
    }
    
    private void h() {
        this.f = aZ.i();
        this.k = Collections.emptyList();
    }
    
    public static final bl j() {
        return bO.f();
    }
    
    public int a() {
        return this.k.size();
    }
    
    protected ae a(final dg dg) {
        return new ae(dg, null);
    }
    
    public bK a(final int n) {
        return this.k.get(n);
    }
    
    public aZ b(final int n) {
        return this.k.get(n);
    }
    
    public ae f() {
        return b(this);
    }
    
    public ae g() {
        return b();
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
        return ay.i;
    }
    
    @Override
    public int getSerializedSize() {
        int i = 0;
        final boolean o = aZ.o;
        final int l = this.l;
        if (l != -1) {
            return l;
        }
        int n;
        if ((0x1 & this.e) == 0x1) {
            n = 0 + ep.f(1, this.f);
        }
        else {
            n = 0;
        }
        int n2 = n;
        while (i < this.k.size()) {
            final int n3 = n2 + ep.f(2, this.k.get(i));
            ++i;
            if (o) {
                return this.l = n3 + this.getUnknownFields().getSerializedSize();
            }
            n2 = n3;
        }
        final int n3 = n2;
        return this.l = n3 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.j;
    }
    
    public boolean i() {
        return (0x1 & this.e) == 0x1;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return bO.B().a(ay.class, ae.class);
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
    
    public List k() {
        return this.k;
    }
    
    public aZ l() {
        return this.f;
    }
    
    public bK m() {
        return this.f;
    }
    
    public List n() {
        return this.k;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.g();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.a(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.g();
    }
    
    public ay o() {
        return ay.m;
    }
    
    @Override
    public a8 toBuilder() {
        return this.f();
    }
    
    @Override
    public aJ toBuilder() {
        return this.f();
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean o = aZ.o;
        this.getSerializedSize();
        if ((0x1 & this.e) == 0x1) {
            ep.e(1, this.f);
        }
        int n;
        for (int i = 0; i < this.k.size(); i = n) {
            ep.e(2, (ci)this.k.get(i));
            n = i + 1;
            if (o) {
                break;
            }
        }
        this.getUnknownFields().writeTo(ep);
    }
}
