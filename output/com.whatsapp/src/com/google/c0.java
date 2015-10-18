// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.io.Externalizable;

public class c0 implements Externalizable
{
    private static final long serialVersionUID = 1L;
    private h2 A;
    private boolean B;
    private h2 C;
    private boolean D;
    private boolean E;
    private h2 F;
    private boolean G;
    private boolean H;
    private boolean I;
    private h2 J;
    private boolean K;
    private boolean L;
    private h2 M;
    private boolean N;
    private boolean O;
    private boolean P;
    private List Q;
    private boolean R;
    private boolean S;
    private String T;
    private boolean U;
    private int V;
    private String W;
    private boolean X;
    private String Y;
    private boolean Z;
    private h2 a;
    private h2 b;
    private boolean c;
    private h2 d;
    private boolean e;
    private String f;
    private String g;
    private String h;
    private h2 i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private String n;
    private boolean o;
    private List p;
    private h2 q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private h2 v;
    private String w;
    private h2 x;
    private boolean y;
    private h2 z;
    
    public c0() {
        this.d = null;
        this.M = null;
        this.F = null;
        this.b = null;
        this.x = null;
        this.v = null;
        this.z = null;
        this.C = null;
        this.A = null;
        this.q = null;
        this.i = null;
        this.J = null;
        this.a = null;
        this.h = "";
        this.V = 0;
        this.g = "";
        this.Y = "";
        this.T = "";
        this.w = "";
        this.n = "";
        this.f = "";
        this.B = false;
        this.Q = new ArrayList();
        this.p = new ArrayList();
        this.o = false;
        this.W = "";
        this.G = false;
    }
    
    public static c2 W() {
        return new c2();
    }
    
    public int A() {
        return this.Q.size();
    }
    
    public String B() {
        return this.h;
    }
    
    public boolean C() {
        return this.I;
    }
    
    public boolean D() {
        return this.K;
    }
    
    public boolean E() {
        return this.N;
    }
    
    public boolean F() {
        return this.B;
    }
    
    public boolean G() {
        return this.u;
    }
    
    public boolean H() {
        return this.E;
    }
    
    public boolean I() {
        return this.U;
    }
    
    public h2 J() {
        return this.A;
    }
    
    public int K() {
        return this.V;
    }
    
    public boolean L() {
        return this.r;
    }
    
    public boolean M() {
        return this.D;
    }
    
    public boolean N() {
        return this.m;
    }
    
    public h2 O() {
        return this.a;
    }
    
    public h2 P() {
        return this.F;
    }
    
    public boolean Q() {
        return this.o;
    }
    
    public h2 R() {
        return this.q;
    }
    
    public int S() {
        return this.p.size();
    }
    
    public h2 T() {
        return this.v;
    }
    
    public h2 U() {
        return this.z;
    }
    
    public String V() {
        return this.f;
    }
    
    public String X() {
        return this.w;
    }
    
    public boolean Y() {
        return this.G;
    }
    
    public boolean Z() {
        return this.R;
    }
    
    public c0 a(final fw fw) {
        if (fw == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.p.add(fw);
        return this;
    }
    
    public c0 a(final h2 a) {
        if (a == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.m = true;
        this.A = a;
        return this;
    }
    
    public c0 a(final String w) {
        this.U = true;
        this.w = w;
        return this;
    }
    
    public c0 a(final boolean b) {
        this.K = true;
        this.B = b;
        return this;
    }
    
    public fw a(final int n) {
        return this.p.get(n);
    }
    
    public boolean a() {
        return this.y;
    }
    
    public boolean aa() {
        return this.o;
    }
    
    public boolean ab() {
        return this.Z;
    }
    
    public h2 ac() {
        return this.d;
    }
    
    public String ad() {
        return this.Y;
    }
    
    public boolean ae() {
        return this.O;
    }
    
    public c0 b(final fw fw) {
        if (fw == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.Q.add(fw);
        return this;
    }
    
    public c0 b(final h2 i) {
        if (i == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.L = true;
        this.i = i;
        return this;
    }
    
    public c0 b(final String n) {
        this.I = true;
        this.n = n;
        return this;
    }
    
    public c0 b(final boolean g) {
        this.r = true;
        this.G = g;
        return this;
    }
    
    public fw b(final int n) {
        return this.Q.get(n);
    }
    
    public boolean b() {
        return this.t;
    }
    
    public c0 c(final int v) {
        this.c = true;
        this.V = v;
        return this;
    }
    
    public c0 c(final h2 c) {
        if (c == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.P = true;
        this.C = c;
        return this;
    }
    
    public c0 c(final String t) {
        this.j = true;
        this.T = t;
        return this;
    }
    
    public c0 c(final boolean o) {
        this.E = true;
        this.o = o;
        return this;
    }
    
    public boolean c() {
        return this.c;
    }
    
    public c0 d() {
        this.p.clear();
        return this;
    }
    
    public c0 d(final h2 q) {
        if (q == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.N = true;
        this.q = q;
        return this;
    }
    
    public c0 d(final String y) {
        this.D = true;
        this.Y = y;
        return this;
    }
    
    public c0 e(final h2 x) {
        if (x == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.u = true;
        this.x = x;
        return this;
    }
    
    public c0 e(final String g) {
        this.t = true;
        this.g = g;
        return this;
    }
    
    public boolean e() {
        return this.k;
    }
    
    public c0 f(final h2 d) {
        if (d == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.e = true;
        this.d = d;
        return this;
    }
    
    public c0 f(final String f) {
        this.Z = true;
        this.f = f;
        return this;
    }
    
    public boolean f() {
        return this.l;
    }
    
    public c0 g(final h2 z) {
        if (z == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.S = true;
        this.z = z;
        return this;
    }
    
    public c0 g(final String w) {
        this.y = true;
        this.W = w;
        return this;
    }
    
    public h2 g() {
        return this.x;
    }
    
    public c0 h(final h2 m) {
        if (m == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.O = true;
        this.M = m;
        return this;
    }
    
    public c0 h(final String h) {
        this.s = true;
        this.h = h;
        return this;
    }
    
    public h2 h() {
        return this.C;
    }
    
    public c0 i(final h2 a) {
        if (a == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.H = true;
        this.a = a;
        return this;
    }
    
    public String i() {
        return this.n;
    }
    
    public c0 j(final h2 j) {
        if (j == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.X = true;
        this.J = j;
        return this;
    }
    
    public boolean j() {
        return this.L;
    }
    
    public c0 k(final h2 b) {
        if (b == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.R = true;
        this.b = b;
        return this;
    }
    
    public boolean k() {
        return this.s;
    }
    
    public c0 l(final h2 v) {
        if (v == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.l = true;
        this.v = v;
        return this;
    }
    
    public h2 l() {
        return this.b;
    }
    
    public c0 m(final h2 f) {
        if (f == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.k = true;
        this.F = f;
        return this;
    }
    
    public h2 m() {
        return this.i;
    }
    
    public boolean n() {
        return this.S;
    }
    
    public boolean o() {
        return this.X;
    }
    
    public boolean p() {
        return this.e;
    }
    
    public String q() {
        return this.g;
    }
    
    public List r() {
        return this.p;
    }
    
    @Override
    public void readExternal(final ObjectInput p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/google/e6.a:I
        //     5: istore_3       
        //     6: aload_1        
        //     7: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //    12: ifeq            37
        //    15: new             Lcom/google/h2;
        //    18: dup            
        //    19: invokespecial   com/google/h2.<init>:()V
        //    22: astore          4
        //    24: aload           4
        //    26: aload_1        
        //    27: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //    30: aload_0        
        //    31: aload           4
        //    33: invokevirtual   com/google/c0.f:(Lcom/google/h2;)Lcom/google/c0;
        //    36: pop            
        //    37: aload_1        
        //    38: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //    43: ifeq            68
        //    46: new             Lcom/google/h2;
        //    49: dup            
        //    50: invokespecial   com/google/h2.<init>:()V
        //    53: astore          6
        //    55: aload           6
        //    57: aload_1        
        //    58: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //    61: aload_0        
        //    62: aload           6
        //    64: invokevirtual   com/google/c0.h:(Lcom/google/h2;)Lcom/google/c0;
        //    67: pop            
        //    68: aload_1        
        //    69: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //    74: ifeq            99
        //    77: new             Lcom/google/h2;
        //    80: dup            
        //    81: invokespecial   com/google/h2.<init>:()V
        //    84: astore          8
        //    86: aload           8
        //    88: aload_1        
        //    89: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //    92: aload_0        
        //    93: aload           8
        //    95: invokevirtual   com/google/c0.m:(Lcom/google/h2;)Lcom/google/c0;
        //    98: pop            
        //    99: aload_1        
        //   100: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   105: ifeq            130
        //   108: new             Lcom/google/h2;
        //   111: dup            
        //   112: invokespecial   com/google/h2.<init>:()V
        //   115: astore          10
        //   117: aload           10
        //   119: aload_1        
        //   120: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   123: aload_0        
        //   124: aload           10
        //   126: invokevirtual   com/google/c0.k:(Lcom/google/h2;)Lcom/google/c0;
        //   129: pop            
        //   130: aload_1        
        //   131: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   136: ifeq            161
        //   139: new             Lcom/google/h2;
        //   142: dup            
        //   143: invokespecial   com/google/h2.<init>:()V
        //   146: astore          12
        //   148: aload           12
        //   150: aload_1        
        //   151: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   154: aload_0        
        //   155: aload           12
        //   157: invokevirtual   com/google/c0.e:(Lcom/google/h2;)Lcom/google/c0;
        //   160: pop            
        //   161: aload_1        
        //   162: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   167: ifeq            192
        //   170: new             Lcom/google/h2;
        //   173: dup            
        //   174: invokespecial   com/google/h2.<init>:()V
        //   177: astore          14
        //   179: aload           14
        //   181: aload_1        
        //   182: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   185: aload_0        
        //   186: aload           14
        //   188: invokevirtual   com/google/c0.l:(Lcom/google/h2;)Lcom/google/c0;
        //   191: pop            
        //   192: aload_1        
        //   193: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   198: ifeq            223
        //   201: new             Lcom/google/h2;
        //   204: dup            
        //   205: invokespecial   com/google/h2.<init>:()V
        //   208: astore          16
        //   210: aload           16
        //   212: aload_1        
        //   213: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   216: aload_0        
        //   217: aload           16
        //   219: invokevirtual   com/google/c0.g:(Lcom/google/h2;)Lcom/google/c0;
        //   222: pop            
        //   223: aload_1        
        //   224: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   229: ifeq            254
        //   232: new             Lcom/google/h2;
        //   235: dup            
        //   236: invokespecial   com/google/h2.<init>:()V
        //   239: astore          18
        //   241: aload           18
        //   243: aload_1        
        //   244: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   247: aload_0        
        //   248: aload           18
        //   250: invokevirtual   com/google/c0.c:(Lcom/google/h2;)Lcom/google/c0;
        //   253: pop            
        //   254: aload_1        
        //   255: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   260: ifeq            285
        //   263: new             Lcom/google/h2;
        //   266: dup            
        //   267: invokespecial   com/google/h2.<init>:()V
        //   270: astore          20
        //   272: aload           20
        //   274: aload_1        
        //   275: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   278: aload_0        
        //   279: aload           20
        //   281: invokevirtual   com/google/c0.a:(Lcom/google/h2;)Lcom/google/c0;
        //   284: pop            
        //   285: aload_1        
        //   286: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   291: ifeq            316
        //   294: new             Lcom/google/h2;
        //   297: dup            
        //   298: invokespecial   com/google/h2.<init>:()V
        //   301: astore          22
        //   303: aload           22
        //   305: aload_1        
        //   306: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   309: aload_0        
        //   310: aload           22
        //   312: invokevirtual   com/google/c0.d:(Lcom/google/h2;)Lcom/google/c0;
        //   315: pop            
        //   316: aload_1        
        //   317: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   322: ifeq            347
        //   325: new             Lcom/google/h2;
        //   328: dup            
        //   329: invokespecial   com/google/h2.<init>:()V
        //   332: astore          24
        //   334: aload           24
        //   336: aload_1        
        //   337: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   340: aload_0        
        //   341: aload           24
        //   343: invokevirtual   com/google/c0.b:(Lcom/google/h2;)Lcom/google/c0;
        //   346: pop            
        //   347: aload_1        
        //   348: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   353: ifeq            378
        //   356: new             Lcom/google/h2;
        //   359: dup            
        //   360: invokespecial   com/google/h2.<init>:()V
        //   363: astore          26
        //   365: aload           26
        //   367: aload_1        
        //   368: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   371: aload_0        
        //   372: aload           26
        //   374: invokevirtual   com/google/c0.j:(Lcom/google/h2;)Lcom/google/c0;
        //   377: pop            
        //   378: aload_1        
        //   379: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   384: ifeq            409
        //   387: new             Lcom/google/h2;
        //   390: dup            
        //   391: invokespecial   com/google/h2.<init>:()V
        //   394: astore          28
        //   396: aload           28
        //   398: aload_1        
        //   399: invokevirtual   com/google/h2.readExternal:(Ljava/io/ObjectInput;)V
        //   402: aload_0        
        //   403: aload           28
        //   405: invokevirtual   com/google/c0.i:(Lcom/google/h2;)Lcom/google/c0;
        //   408: pop            
        //   409: aload_0        
        //   410: aload_1        
        //   411: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   416: invokevirtual   com/google/c0.h:(Ljava/lang/String;)Lcom/google/c0;
        //   419: pop            
        //   420: aload_0        
        //   421: aload_1        
        //   422: invokeinterface java/io/ObjectInput.readInt:()I
        //   427: invokevirtual   com/google/c0.c:(I)Lcom/google/c0;
        //   430: pop            
        //   431: aload_0        
        //   432: aload_1        
        //   433: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   438: invokevirtual   com/google/c0.e:(Ljava/lang/String;)Lcom/google/c0;
        //   441: pop            
        //   442: aload_1        
        //   443: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   448: ifeq            462
        //   451: aload_0        
        //   452: aload_1        
        //   453: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   458: invokevirtual   com/google/c0.d:(Ljava/lang/String;)Lcom/google/c0;
        //   461: pop            
        //   462: aload_1        
        //   463: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   468: ifeq            482
        //   471: aload_0        
        //   472: aload_1        
        //   473: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   478: invokevirtual   com/google/c0.c:(Ljava/lang/String;)Lcom/google/c0;
        //   481: pop            
        //   482: aload_1        
        //   483: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   488: ifeq            502
        //   491: aload_0        
        //   492: aload_1        
        //   493: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   498: invokevirtual   com/google/c0.a:(Ljava/lang/String;)Lcom/google/c0;
        //   501: pop            
        //   502: aload_1        
        //   503: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   508: ifeq            522
        //   511: aload_0        
        //   512: aload_1        
        //   513: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   518: invokevirtual   com/google/c0.b:(Ljava/lang/String;)Lcom/google/c0;
        //   521: pop            
        //   522: aload_1        
        //   523: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   528: ifeq            542
        //   531: aload_0        
        //   532: aload_1        
        //   533: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   538: invokevirtual   com/google/c0.f:(Ljava/lang/String;)Lcom/google/c0;
        //   541: pop            
        //   542: aload_0        
        //   543: aload_1        
        //   544: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   549: invokevirtual   com/google/c0.a:(Z)Lcom/google/c0;
        //   552: pop            
        //   553: aload_1        
        //   554: invokeinterface java/io/ObjectInput.readInt:()I
        //   559: istore          34
        //   561: iconst_0       
        //   562: istore          35
        //   564: iload           35
        //   566: iload           34
        //   568: if_icmpge       605
        //   571: new             Lcom/google/fw;
        //   574: dup            
        //   575: invokespecial   com/google/fw.<init>:()V
        //   578: astore          36
        //   580: aload           36
        //   582: aload_1        
        //   583: invokevirtual   com/google/fw.readExternal:(Ljava/io/ObjectInput;)V
        //   586: aload_0        
        //   587: getfield        com/google/c0.Q:Ljava/util/List;
        //   590: aload           36
        //   592: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   597: pop            
        //   598: iinc            35, 1
        //   601: iload_3        
        //   602: ifeq            564
        //   605: aload_1        
        //   606: invokeinterface java/io/ObjectInput.readInt:()I
        //   611: istore          38
        //   613: iload_2        
        //   614: iload           38
        //   616: if_icmpge       653
        //   619: new             Lcom/google/fw;
        //   622: dup            
        //   623: invokespecial   com/google/fw.<init>:()V
        //   626: astore          39
        //   628: aload           39
        //   630: aload_1        
        //   631: invokevirtual   com/google/fw.readExternal:(Ljava/io/ObjectInput;)V
        //   634: aload_0        
        //   635: getfield        com/google/c0.p:Ljava/util/List;
        //   638: aload           39
        //   640: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   645: pop            
        //   646: iinc            2, 1
        //   649: iload_3        
        //   650: ifeq            613
        //   653: aload_0        
        //   654: aload_1        
        //   655: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   660: invokevirtual   com/google/c0.c:(Z)Lcom/google/c0;
        //   663: pop            
        //   664: aload_1        
        //   665: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   670: ifeq            684
        //   673: aload_0        
        //   674: aload_1        
        //   675: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   680: invokevirtual   com/google/c0.g:(Ljava/lang/String;)Lcom/google/c0;
        //   683: pop            
        //   684: aload_0        
        //   685: aload_1        
        //   686: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   691: invokevirtual   com/google/c0.b:(Z)Lcom/google/c0;
        //   694: pop            
        //   695: return         
        //   696: astore          53
        //   698: aload           53
        //   700: athrow         
        //   701: astore          51
        //   703: aload           51
        //   705: athrow         
        //   706: astore          49
        //   708: aload           49
        //   710: athrow         
        //   711: astore          47
        //   713: aload           47
        //   715: athrow         
        //   716: astore          45
        //   718: aload           45
        //   720: athrow         
        //   721: astore          43
        //   723: aload           43
        //   725: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  451    462    696    701    Ljava/lang/NullPointerException;
        //  471    482    701    706    Ljava/lang/NullPointerException;
        //  491    502    706    711    Ljava/lang/NullPointerException;
        //  511    522    711    716    Ljava/lang/NullPointerException;
        //  531    542    716    721    Ljava/lang/NullPointerException;
        //  673    684    721    726    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 327, Size: 327
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
    
    public h2 s() {
        return this.J;
    }
    
    public boolean t() {
        return this.P;
    }
    
    public String u() {
        return this.T;
    }
    
    public h2 v() {
        return this.M;
    }
    
    public String w() {
        return this.W;
    }
    
    @Override
    public void writeExternal(final ObjectOutput p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/google/e6.a:I
        //     5: istore_3       
        //     6: aload_1        
        //     7: aload_0        
        //     8: getfield        com/google/c0.e:Z
        //    11: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //    16: aload_0        
        //    17: getfield        com/google/c0.e:Z
        //    20: ifeq            31
        //    23: aload_0        
        //    24: getfield        com/google/c0.d:Lcom/google/h2;
        //    27: aload_1        
        //    28: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //    31: aload_1        
        //    32: aload_0        
        //    33: getfield        com/google/c0.O:Z
        //    36: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //    41: aload_0        
        //    42: getfield        com/google/c0.O:Z
        //    45: ifeq            56
        //    48: aload_0        
        //    49: getfield        com/google/c0.M:Lcom/google/h2;
        //    52: aload_1        
        //    53: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //    56: aload_1        
        //    57: aload_0        
        //    58: getfield        com/google/c0.k:Z
        //    61: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //    66: aload_0        
        //    67: getfield        com/google/c0.k:Z
        //    70: ifeq            81
        //    73: aload_0        
        //    74: getfield        com/google/c0.F:Lcom/google/h2;
        //    77: aload_1        
        //    78: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //    81: aload_1        
        //    82: aload_0        
        //    83: getfield        com/google/c0.R:Z
        //    86: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //    91: aload_0        
        //    92: getfield        com/google/c0.R:Z
        //    95: ifeq            106
        //    98: aload_0        
        //    99: getfield        com/google/c0.b:Lcom/google/h2;
        //   102: aload_1        
        //   103: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   106: aload_1        
        //   107: aload_0        
        //   108: getfield        com/google/c0.u:Z
        //   111: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   116: aload_0        
        //   117: getfield        com/google/c0.u:Z
        //   120: ifeq            131
        //   123: aload_0        
        //   124: getfield        com/google/c0.x:Lcom/google/h2;
        //   127: aload_1        
        //   128: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   131: aload_1        
        //   132: aload_0        
        //   133: getfield        com/google/c0.l:Z
        //   136: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   141: aload_0        
        //   142: getfield        com/google/c0.l:Z
        //   145: ifeq            156
        //   148: aload_0        
        //   149: getfield        com/google/c0.v:Lcom/google/h2;
        //   152: aload_1        
        //   153: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   156: aload_1        
        //   157: aload_0        
        //   158: getfield        com/google/c0.S:Z
        //   161: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   166: aload_0        
        //   167: getfield        com/google/c0.S:Z
        //   170: ifeq            181
        //   173: aload_0        
        //   174: getfield        com/google/c0.z:Lcom/google/h2;
        //   177: aload_1        
        //   178: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   181: aload_1        
        //   182: aload_0        
        //   183: getfield        com/google/c0.P:Z
        //   186: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   191: aload_0        
        //   192: getfield        com/google/c0.P:Z
        //   195: ifeq            206
        //   198: aload_0        
        //   199: getfield        com/google/c0.C:Lcom/google/h2;
        //   202: aload_1        
        //   203: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   206: aload_1        
        //   207: aload_0        
        //   208: getfield        com/google/c0.m:Z
        //   211: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   216: aload_0        
        //   217: getfield        com/google/c0.m:Z
        //   220: ifeq            231
        //   223: aload_0        
        //   224: getfield        com/google/c0.A:Lcom/google/h2;
        //   227: aload_1        
        //   228: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   231: aload_1        
        //   232: aload_0        
        //   233: getfield        com/google/c0.N:Z
        //   236: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   241: aload_0        
        //   242: getfield        com/google/c0.N:Z
        //   245: ifeq            256
        //   248: aload_0        
        //   249: getfield        com/google/c0.q:Lcom/google/h2;
        //   252: aload_1        
        //   253: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   256: aload_1        
        //   257: aload_0        
        //   258: getfield        com/google/c0.L:Z
        //   261: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   266: aload_0        
        //   267: getfield        com/google/c0.L:Z
        //   270: ifeq            281
        //   273: aload_0        
        //   274: getfield        com/google/c0.i:Lcom/google/h2;
        //   277: aload_1        
        //   278: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   281: aload_1        
        //   282: aload_0        
        //   283: getfield        com/google/c0.X:Z
        //   286: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   291: aload_0        
        //   292: getfield        com/google/c0.X:Z
        //   295: ifeq            306
        //   298: aload_0        
        //   299: getfield        com/google/c0.J:Lcom/google/h2;
        //   302: aload_1        
        //   303: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   306: aload_1        
        //   307: aload_0        
        //   308: getfield        com/google/c0.H:Z
        //   311: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   316: aload_0        
        //   317: getfield        com/google/c0.H:Z
        //   320: ifeq            331
        //   323: aload_0        
        //   324: getfield        com/google/c0.a:Lcom/google/h2;
        //   327: aload_1        
        //   328: invokevirtual   com/google/h2.writeExternal:(Ljava/io/ObjectOutput;)V
        //   331: aload_1        
        //   332: aload_0        
        //   333: getfield        com/google/c0.h:Ljava/lang/String;
        //   336: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   341: aload_1        
        //   342: aload_0        
        //   343: getfield        com/google/c0.V:I
        //   346: invokeinterface java/io/ObjectOutput.writeInt:(I)V
        //   351: aload_1        
        //   352: aload_0        
        //   353: getfield        com/google/c0.g:Ljava/lang/String;
        //   356: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   361: aload_1        
        //   362: aload_0        
        //   363: getfield        com/google/c0.D:Z
        //   366: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   371: aload_0        
        //   372: getfield        com/google/c0.D:Z
        //   375: ifeq            388
        //   378: aload_1        
        //   379: aload_0        
        //   380: getfield        com/google/c0.Y:Ljava/lang/String;
        //   383: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   388: aload_1        
        //   389: aload_0        
        //   390: getfield        com/google/c0.j:Z
        //   393: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   398: aload_0        
        //   399: getfield        com/google/c0.j:Z
        //   402: ifeq            415
        //   405: aload_1        
        //   406: aload_0        
        //   407: getfield        com/google/c0.T:Ljava/lang/String;
        //   410: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   415: aload_1        
        //   416: aload_0        
        //   417: getfield        com/google/c0.U:Z
        //   420: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   425: aload_0        
        //   426: getfield        com/google/c0.U:Z
        //   429: ifeq            442
        //   432: aload_1        
        //   433: aload_0        
        //   434: getfield        com/google/c0.w:Ljava/lang/String;
        //   437: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   442: aload_1        
        //   443: aload_0        
        //   444: getfield        com/google/c0.I:Z
        //   447: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   452: aload_0        
        //   453: getfield        com/google/c0.I:Z
        //   456: ifeq            469
        //   459: aload_1        
        //   460: aload_0        
        //   461: getfield        com/google/c0.n:Ljava/lang/String;
        //   464: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   469: aload_1        
        //   470: aload_0        
        //   471: getfield        com/google/c0.Z:Z
        //   474: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   479: aload_0        
        //   480: getfield        com/google/c0.Z:Z
        //   483: ifeq            496
        //   486: aload_1        
        //   487: aload_0        
        //   488: getfield        com/google/c0.f:Ljava/lang/String;
        //   491: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   496: aload_1        
        //   497: aload_0        
        //   498: getfield        com/google/c0.B:Z
        //   501: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   506: aload_0        
        //   507: invokevirtual   com/google/c0.A:()I
        //   510: istore          22
        //   512: aload_1        
        //   513: iload           22
        //   515: invokeinterface java/io/ObjectOutput.writeInt:(I)V
        //   520: iconst_0       
        //   521: istore          23
        //   523: iload           23
        //   525: iload           22
        //   527: if_icmpge       558
        //   530: aload_0        
        //   531: getfield        com/google/c0.Q:Ljava/util/List;
        //   534: iload           23
        //   536: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   541: checkcast       Lcom/google/fw;
        //   544: aload_1        
        //   545: invokevirtual   com/google/fw.writeExternal:(Ljava/io/ObjectOutput;)V
        //   548: iload           23
        //   550: iconst_1       
        //   551: iadd           
        //   552: istore          28
        //   554: iload_3        
        //   555: ifeq            770
        //   558: aload_0        
        //   559: invokevirtual   com/google/c0.S:()I
        //   562: istore          24
        //   564: aload_1        
        //   565: iload           24
        //   567: invokeinterface java/io/ObjectOutput.writeInt:(I)V
        //   572: iload_2        
        //   573: iload           24
        //   575: if_icmpge       604
        //   578: aload_0        
        //   579: getfield        com/google/c0.p:Ljava/util/List;
        //   582: iload_2        
        //   583: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   588: checkcast       Lcom/google/fw;
        //   591: aload_1        
        //   592: invokevirtual   com/google/fw.writeExternal:(Ljava/io/ObjectOutput;)V
        //   595: iload_2        
        //   596: iconst_1       
        //   597: iadd           
        //   598: istore          27
        //   600: iload_3        
        //   601: ifeq            764
        //   604: aload_1        
        //   605: aload_0        
        //   606: getfield        com/google/c0.o:Z
        //   609: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   614: aload_1        
        //   615: aload_0        
        //   616: getfield        com/google/c0.y:Z
        //   619: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   624: aload_0        
        //   625: getfield        com/google/c0.y:Z
        //   628: ifeq            641
        //   631: aload_1        
        //   632: aload_0        
        //   633: getfield        com/google/c0.W:Ljava/lang/String;
        //   636: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   641: aload_1        
        //   642: aload_0        
        //   643: getfield        com/google/c0.G:Z
        //   646: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   651: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   654: ifeq            663
        //   657: iload_3        
        //   658: iconst_1       
        //   659: iadd           
        //   660: putstatic       com/google/e6.a:I
        //   663: return         
        //   664: astore          4
        //   666: aload           4
        //   668: athrow         
        //   669: astore          5
        //   671: aload           5
        //   673: athrow         
        //   674: astore          6
        //   676: aload           6
        //   678: athrow         
        //   679: astore          7
        //   681: aload           7
        //   683: athrow         
        //   684: astore          8
        //   686: aload           8
        //   688: athrow         
        //   689: astore          9
        //   691: aload           9
        //   693: athrow         
        //   694: astore          10
        //   696: aload           10
        //   698: athrow         
        //   699: astore          11
        //   701: aload           11
        //   703: athrow         
        //   704: astore          12
        //   706: aload           12
        //   708: athrow         
        //   709: astore          13
        //   711: aload           13
        //   713: athrow         
        //   714: astore          14
        //   716: aload           14
        //   718: athrow         
        //   719: astore          15
        //   721: aload           15
        //   723: athrow         
        //   724: astore          16
        //   726: aload           16
        //   728: athrow         
        //   729: astore          17
        //   731: aload           17
        //   733: athrow         
        //   734: astore          18
        //   736: aload           18
        //   738: athrow         
        //   739: astore          19
        //   741: aload           19
        //   743: athrow         
        //   744: astore          20
        //   746: aload           20
        //   748: athrow         
        //   749: astore          21
        //   751: aload           21
        //   753: athrow         
        //   754: astore          25
        //   756: aload           25
        //   758: athrow         
        //   759: astore          26
        //   761: aload           26
        //   763: athrow         
        //   764: iload           27
        //   766: istore_2       
        //   767: goto            572
        //   770: iload           28
        //   772: istore          23
        //   774: goto            523
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  6      31     664    669    Ljava/lang/NullPointerException;
        //  31     56     669    674    Ljava/lang/NullPointerException;
        //  56     81     674    679    Ljava/lang/NullPointerException;
        //  81     106    679    684    Ljava/lang/NullPointerException;
        //  106    131    684    689    Ljava/lang/NullPointerException;
        //  131    156    689    694    Ljava/lang/NullPointerException;
        //  156    181    694    699    Ljava/lang/NullPointerException;
        //  181    206    699    704    Ljava/lang/NullPointerException;
        //  206    231    704    709    Ljava/lang/NullPointerException;
        //  231    256    709    714    Ljava/lang/NullPointerException;
        //  256    281    714    719    Ljava/lang/NullPointerException;
        //  281    306    719    724    Ljava/lang/NullPointerException;
        //  306    331    724    729    Ljava/lang/NullPointerException;
        //  331    388    729    734    Ljava/lang/NullPointerException;
        //  388    415    734    739    Ljava/lang/NullPointerException;
        //  415    442    739    744    Ljava/lang/NullPointerException;
        //  442    469    744    749    Ljava/lang/NullPointerException;
        //  469    496    749    754    Ljava/lang/NullPointerException;
        //  604    641    754    759    Ljava/lang/NullPointerException;
        //  641    663    759    764    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 356, Size: 356
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
    
    public List x() {
        return this.Q;
    }
    
    public boolean y() {
        return this.j;
    }
    
    public boolean z() {
        return this.H;
    }
}
