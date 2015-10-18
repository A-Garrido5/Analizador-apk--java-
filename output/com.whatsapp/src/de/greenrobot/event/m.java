// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import android.util.Log;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.Map;

public class m
{
    private static final f d;
    static volatile m f;
    private static final Map g;
    public static int q;
    public static String s;
    private static final String[] z;
    private final boolean a;
    private final boolean b;
    private final i c;
    private final ThreadLocal e;
    private final boolean h;
    private final boolean i;
    private final Map j;
    private final boolean k;
    private final ExecutorService l;
    private final Map m;
    private final Map n;
    private final l o;
    private final g p;
    private final boolean r;
    private final q t;
    
    static {
        final String[] z2 = new String[14];
        String s = "ColZ\r\u0006h-J\u0006\u0000i}[\u0017\fb-F\u0010C";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0382:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '~';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = '\f';
                        break;
                    }
                    case 2: {
                        c2 = '\r';
                        break;
                    }
                    case 3: {
                        c2 = '/';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Cxb\u000f\r\u0016n~L\f\nndA\u0019CoaN\r\u0010,";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "0yo\\\u001d\u0011eoJ\f&tnJ\u000e\u0017ebA;\u0015ic[^\u0010yo\\\u001d\u0011eoJ\fC";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Cxe]\u001b\u0014,lA^\u0006tnJ\u000e\u0017ebA";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "*bd[\u0017\u0002`-J\b\u0006by\u000f";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = " cxC\u001aCbb[^\u0007e~_\u001f\u0017oe\u000f\u001b\u0015ic[DC";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "*b{@\u0015\nbj\u000f\r\u0016n~L\f\nnh]^\u0005mdC\u001b\u0007";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "0yo\\\u001d\u0011eoJ\fC";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Cma]\u001b\u0002ht\u000f\f\u0006kd\\\n\u0006~hK^\u0017c-J\b\u0006by\u000f";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "6bfA\u0011\u0014b-[\u0016\u0011ilK^\u000eciJDC";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "6bhW\u000e\u0006oyJ\u001aCiuL\u001b\u0013xd@\u0010";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "-c-\\\u000b\u0001\u007fn]\u0017\u0001i\u007f\\^\u0011ijF\r\u0017i\u007fJ\u001aCjb]^\u0006zhA\nC";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    s = "0yo\\\u001d\u0011eoJ\fCxb\u000f\u000b\r~hH\u0017\u0010xh]^\u0014m~\u000f\u0010\fx-]\u001b\u0004e~[\u001b\u0011ii\u000f\u001c\u0006jb]\u001bY,";
                    n = 11;
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    s = "*byJ\f\rma\u000f\u001b\u0011~b]PCMo@\f\u0017,~[\u001f\u0017i-X\u001f\u0010,c@\nC~h\\\u001b\u0017";
                    n2 = 13;
                    array = z2;
                    n = 12;
                    continue;
                }
                case 12: {
                    break Label_0382;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        final char[] charArray2 = "&zhA\n".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = '~';
                    break;
                }
                case 0: {
                    c4 = 'c';
                    break;
                }
                case 1: {
                    c4 = '\f';
                    break;
                }
                case 2: {
                    c4 = '\r';
                    break;
                }
                case 3: {
                    c4 = '/';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        m.s = new String(charArray2).intern();
        d = new f();
        g = new HashMap();
    }
    
    public m() {
        this(de.greenrobot.event.m.d);
    }
    
    m(final f f) {
        this.e = new n(this);
        this.m = new HashMap();
        this.j = new HashMap();
        this.n = new ConcurrentHashMap();
        this.o = new l(this, Looper.getMainLooper(), 10);
        this.c = new i(this);
        this.t = new q(this);
        this.p = new g(f.e);
        this.b = f.d;
        this.k = f.a;
        this.h = f.f;
        this.r = f.g;
        this.a = f.i;
        this.i = f.b;
        this.l = f.h;
    }
    
    private void a(final c c, final Object o, final Throwable t) {
        while (true) {
            try {
                if (o instanceof o) {
                    if (this.b) {
                        Log.e(de.greenrobot.event.m.s, de.greenrobot.event.m.z[2] + c.d.getClass() + de.greenrobot.event.m.z[3], t);
                        final o o2 = (o)o;
                        Log.e(de.greenrobot.event.m.s, de.greenrobot.event.m.z[4] + o2.d + de.greenrobot.event.m.z[0] + o2.a, o2.c);
                    }
                    return;
                }
            }
            catch (j j) {
                throw j;
            }
            try {
                if (this.a) {
                    throw new j(de.greenrobot.event.m.z[6], t);
                }
            }
            catch (j i) {
                throw i;
            }
            try {
                if (this.b) {
                    Log.e(de.greenrobot.event.m.s, de.greenrobot.event.m.z[5] + o.getClass() + de.greenrobot.event.m.z[1] + c.d.getClass(), t);
                }
                if (this.h) {
                    this.b(new o(this, t, o, c.d));
                }
            }
            catch (j k) {
                throw k;
            }
        }
    }
    
    private void a(final c c, final Object o, final boolean b) {
        Label_0149: {
            Label_0123: {
                try {
                    switch (de.greenrobot.event.e.a[c.a.b.ordinal()]) {
                        default: {
                            throw new IllegalStateException(de.greenrobot.event.m.z[9] + c.a.b);
                        }
                        case 1: {
                            this.a(c, o);
                            return;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            break Label_0123;
                        }
                        case 4: {
                            break Label_0149;
                        }
                    }
                }
                catch (j j) {
                    throw j;
                }
                if (b) {
                    try {
                        this.a(c, o);
                        return;
                    }
                    catch (j i) {
                        throw i;
                    }
                }
                this.o.a(c, o);
                return;
            }
            if (b) {
                try {
                    this.c.a(c, o);
                    return;
                }
                catch (j k) {
                    throw k;
                }
            }
            this.a(c, o);
            return;
        }
        this.t.a(c, o);
    }
    
    private void a(final Object p0, final k p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     4: astore_3       
        //     5: aload_0        
        //     6: getfield        de/greenrobot/event/m.i:Z
        //     9: ifeq            154
        //    12: aload_0        
        //    13: aload_3        
        //    14: invokespecial   de/greenrobot/event/m.b:(Ljava/lang/Class;)Ljava/util/List;
        //    17: astore          11
        //    19: aload           11
        //    21: invokeinterface java/util/List.size:()I
        //    26: istore          12
        //    28: iconst_0       
        //    29: istore          13
        //    31: iconst_0       
        //    32: istore          14
        //    34: iload           13
        //    36: iload           12
        //    38: if_icmpge       70
        //    41: iload           14
        //    43: aload_0        
        //    44: aload_1        
        //    45: aload_2        
        //    46: aload           11
        //    48: iload           13
        //    50: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    55: checkcast       Ljava/lang/Class;
        //    58: invokespecial   de/greenrobot/event/m.a:(Ljava/lang/Object;Lde/greenrobot/event/k;Ljava/lang/Class;)Z
        //    61: ior            
        //    62: istore          14
        //    64: iinc            13, 1
        //    67: goto            34
        //    70: iload           14
        //    72: istore          4
        //    74: iload           4
        //    76: ifne            153
        //    79: aload_0        
        //    80: getfield        de/greenrobot/event/m.k:Z
        //    83: ifeq            116
        //    86: getstatic       de/greenrobot/event/m.s:Ljava/lang/String;
        //    89: new             Ljava/lang/StringBuilder;
        //    92: dup            
        //    93: invokespecial   java/lang/StringBuilder.<init>:()V
        //    96: getstatic       de/greenrobot/event/m.z:[Ljava/lang/String;
        //    99: bipush          11
        //   101: aaload         
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: aload_3        
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   109: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   112: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   115: pop            
        //   116: aload_0        
        //   117: getfield        de/greenrobot/event/m.r:Z
        //   120: istore          9
        //   122: iload           9
        //   124: ifeq            153
        //   127: aload_3        
        //   128: ldc_w           Lde/greenrobot/event/b;.class
        //   131: if_acmpeq       153
        //   134: aload_3        
        //   135: ldc             Lde/greenrobot/event/o;.class
        //   137: if_acmpeq       153
        //   140: aload_0        
        //   141: new             Lde/greenrobot/event/b;
        //   144: dup            
        //   145: aload_0        
        //   146: aload_1        
        //   147: invokespecial   de/greenrobot/event/b.<init>:(Lde/greenrobot/event/m;Ljava/lang/Object;)V
        //   150: invokevirtual   de/greenrobot/event/m.b:(Ljava/lang/Object;)V
        //   153: return         
        //   154: aload_0        
        //   155: aload_1        
        //   156: aload_2        
        //   157: aload_3        
        //   158: invokespecial   de/greenrobot/event/m.a:(Ljava/lang/Object;Lde/greenrobot/event/k;Ljava/lang/Class;)Z
        //   161: istore          4
        //   163: goto            74
        //   166: astore          5
        //   168: aload           5
        //   170: athrow         
        //   171: astore          6
        //   173: aload           6
        //   175: athrow         
        //   176: astore          7
        //   178: aload           7
        //   180: athrow         
        //   181: astore          8
        //   183: aload           8
        //   185: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  79     116    166    171    Lde/greenrobot/event/j;
        //  116    122    171    181    Lde/greenrobot/event/j;
        //  140    153    181    186    Lde/greenrobot/event/j;
        //  173    176    176    181    Lde/greenrobot/event/j;
        //  178    181    181    186    Lde/greenrobot/event/j;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
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
    
    private void a(final Object p0, final p p1, final boolean p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: getfield        de/greenrobot/event/p.a:Ljava/lang/Class;
        //     4: astore          5
        //     6: aload_0        
        //     7: getfield        de/greenrobot/event/m.m:Ljava/util/Map;
        //    10: aload           5
        //    12: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    17: checkcast       Ljava/util/concurrent/CopyOnWriteArrayList;
        //    20: astore          6
        //    22: new             Lde/greenrobot/event/c;
        //    25: dup            
        //    26: aload_1        
        //    27: aload_2        
        //    28: iload           4
        //    30: invokespecial   de/greenrobot/event/c.<init>:(Ljava/lang/Object;Lde/greenrobot/event/p;I)V
        //    33: astore          7
        //    35: aload           6
        //    37: ifnonnull       246
        //    40: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //    43: dup            
        //    44: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //    47: astore          8
        //    49: aload_0        
        //    50: getfield        de/greenrobot/event/m.m:Ljava/util/Map;
        //    53: aload           5
        //    55: aload           8
        //    57: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    62: pop            
        //    63: aload           8
        //    65: astore          10
        //    67: aload           10
        //    69: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.size:()I
        //    72: istore          11
        //    74: iconst_0       
        //    75: istore          12
        //    77: iload           12
        //    79: iload           11
        //    81: if_icmpgt       129
        //    84: iload           12
        //    86: iload           11
        //    88: if_icmpeq       120
        //    91: aload           7
        //    93: getfield        de/greenrobot/event/c.b:I
        //    96: istore          25
        //    98: aload           10
        //   100: iload           12
        //   102: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.get:(I)Ljava/lang/Object;
        //   105: checkcast       Lde/greenrobot/event/c;
        //   108: getfield        de/greenrobot/event/c.b:I
        //   111: istore          26
        //   113: iload           25
        //   115: iload           26
        //   117: if_icmple       319
        //   120: aload           10
        //   122: iload           12
        //   124: aload           7
        //   126: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.add:(ILjava/lang/Object;)V
        //   129: aload_0        
        //   130: getfield        de/greenrobot/event/m.j:Ljava/util/Map;
        //   133: aload_1        
        //   134: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   139: checkcast       Ljava/util/List;
        //   142: astore          13
        //   144: aload           13
        //   146: ifnonnull       171
        //   149: new             Ljava/util/ArrayList;
        //   152: dup            
        //   153: invokespecial   java/util/ArrayList.<init>:()V
        //   156: astore          13
        //   158: aload_0        
        //   159: getfield        de/greenrobot/event/m.j:Ljava/util/Map;
        //   162: aload_1        
        //   163: aload           13
        //   165: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   170: pop            
        //   171: aload           13
        //   173: aload           5
        //   175: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   180: pop            
        //   181: iload_3        
        //   182: ifeq            245
        //   185: aload_0        
        //   186: getfield        de/greenrobot/event/m.n:Ljava/util/Map;
        //   189: astore          16
        //   191: aload           16
        //   193: monitorenter   
        //   194: aload_0        
        //   195: getfield        de/greenrobot/event/m.n:Ljava/util/Map;
        //   198: aload           5
        //   200: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   205: astore          18
        //   207: aload           16
        //   209: monitorexit    
        //   210: aload           18
        //   212: ifnull          245
        //   215: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //   218: astore          20
        //   220: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //   223: astore          21
        //   225: aload           20
        //   227: aload           21
        //   229: if_acmpne       338
        //   232: iconst_1       
        //   233: istore          22
        //   235: aload_0        
        //   236: aload           7
        //   238: aload           18
        //   240: iload           22
        //   242: invokespecial   de/greenrobot/event/m.a:(Lde/greenrobot/event/c;Ljava/lang/Object;Z)V
        //   245: return         
        //   246: aload           6
        //   248: aload           7
        //   250: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.contains:(Ljava/lang/Object;)Z
        //   253: ifeq            344
        //   256: new             Lde/greenrobot/event/j;
        //   259: dup            
        //   260: new             Ljava/lang/StringBuilder;
        //   263: dup            
        //   264: invokespecial   java/lang/StringBuilder.<init>:()V
        //   267: getstatic       de/greenrobot/event/m.z:[Ljava/lang/String;
        //   270: bipush          7
        //   272: aaload         
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: aload_1        
        //   277: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   283: getstatic       de/greenrobot/event/m.z:[Ljava/lang/String;
        //   286: bipush          8
        //   288: aaload         
        //   289: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   292: aload           5
        //   294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   297: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   300: invokespecial   de/greenrobot/event/j.<init>:(Ljava/lang/String;)V
        //   303: athrow         
        //   304: astore          27
        //   306: aload           27
        //   308: athrow         
        //   309: astore          24
        //   311: aload           24
        //   313: athrow         
        //   314: astore          23
        //   316: aload           23
        //   318: athrow         
        //   319: iinc            12, 1
        //   322: goto            77
        //   325: astore          17
        //   327: aload           16
        //   329: monitorexit    
        //   330: aload           17
        //   332: athrow         
        //   333: astore          19
        //   335: aload           19
        //   337: athrow         
        //   338: iconst_0       
        //   339: istore          22
        //   341: goto            235
        //   344: aload           6
        //   346: astore          10
        //   348: goto            67
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  91     113    309    314    Lde/greenrobot/event/j;
        //  120    129    314    319    Lde/greenrobot/event/j;
        //  194    210    325    333    Any
        //  215    225    333    338    Lde/greenrobot/event/j;
        //  246    304    304    309    Lde/greenrobot/event/j;
        //  311    314    314    319    Lde/greenrobot/event/j;
        //  327    330    325    333    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 160, Size: 160
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
    
    private void a(final Object o, final Class clazz) {
        int n = 0;
        final boolean b = de.greenrobot.event.a.b;
        final List<c> list = this.m.get(clazz);
        while (true) {
            int size = 0;
            Label_0036: {
                if (list != null) {
                    size = list.size();
                    break Label_0036;
                }
                return;
                int n3;
                int n4;
                while (true) {
                    final c c = list.get(n);
                    while (true) {
                        Label_0117: {
                            try {
                                if (c.d != o) {
                                    break Label_0117;
                                }
                                c.c = false;
                                list.remove(n);
                                final int n2 = n - 1;
                                n3 = size - 1;
                                n4 = n2 + 1;
                                if (b) {
                                    return;
                                }
                            }
                            catch (j j) {
                                throw j;
                            }
                            break;
                        }
                        final int n2 = n;
                        n3 = size;
                        continue;
                    }
                }
                size = n3;
                n = n4;
            }
            if (n < size) {
                continue;
            }
            break;
        }
    }
    
    private void a(final Object o, final boolean b, final int n) {
        synchronized (this) {
            final Iterator<p> iterator = this.p.a(o.getClass()).iterator();
            while (iterator.hasNext()) {
                this.a(o, iterator.next(), b, n);
            }
        }
    }
    // monitorexit(this)
    
    static void a(final List list, final Class[] array) {
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final Class clazz = array[i];
            try {
                if (!list.contains(clazz)) {
                    list.add(clazz);
                    a(list, clazz.getInterfaces());
                }
                ++i;
                continue;
            }
            catch (j j) {
                throw j;
            }
            break;
        }
    }
    
    private boolean a(final Object p0, final k p1, final Class p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        de/greenrobot/event/m.m:Ljava/util/Map;
        //     6: aload_3        
        //     7: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    12: checkcast       Ljava/util/concurrent/CopyOnWriteArrayList;
        //    15: astore          5
        //    17: aload_0        
        //    18: monitorexit    
        //    19: aload           5
        //    21: ifnull          147
        //    24: aload           5
        //    26: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.isEmpty:()Z
        //    29: istore          7
        //    31: iload           7
        //    33: ifne            147
        //    36: aload           5
        //    38: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
        //    41: astore          8
        //    43: aload           8
        //    45: invokeinterface java/util/Iterator.hasNext:()Z
        //    50: ifeq            113
        //    53: aload           8
        //    55: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    60: checkcast       Lde/greenrobot/event/c;
        //    63: astore          9
        //    65: aload_2        
        //    66: aload_1        
        //    67: putfield        de/greenrobot/event/k.d:Ljava/lang/Object;
        //    70: aload_2        
        //    71: aload           9
        //    73: putfield        de/greenrobot/event/k.b:Lde/greenrobot/event/c;
        //    76: aload_0        
        //    77: aload           9
        //    79: aload_1        
        //    80: aload_2        
        //    81: getfield        de/greenrobot/event/k.a:Z
        //    84: invokespecial   de/greenrobot/event/m.a:(Lde/greenrobot/event/c;Ljava/lang/Object;Z)V
        //    87: aload_2        
        //    88: getfield        de/greenrobot/event/k.f:Z
        //    91: istore          11
        //    93: aload_2        
        //    94: aconst_null    
        //    95: putfield        de/greenrobot/event/k.d:Ljava/lang/Object;
        //    98: aload_2        
        //    99: aconst_null    
        //   100: putfield        de/greenrobot/event/k.b:Lde/greenrobot/event/c;
        //   103: aload_2        
        //   104: iconst_0       
        //   105: putfield        de/greenrobot/event/k.f:Z
        //   108: iload           11
        //   110: ifeq            43
        //   113: iconst_1       
        //   114: ireturn        
        //   115: astore          4
        //   117: aload_0        
        //   118: monitorexit    
        //   119: aload           4
        //   121: athrow         
        //   122: astore          6
        //   124: aload           6
        //   126: athrow         
        //   127: astore          10
        //   129: aload_2        
        //   130: aconst_null    
        //   131: putfield        de/greenrobot/event/k.d:Ljava/lang/Object;
        //   134: aload_2        
        //   135: aconst_null    
        //   136: putfield        de/greenrobot/event/k.b:Lde/greenrobot/event/c;
        //   139: aload_2        
        //   140: iconst_0       
        //   141: putfield        de/greenrobot/event/k.f:Z
        //   144: aload           10
        //   146: athrow         
        //   147: iconst_0       
        //   148: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  2      19     115    122    Any
        //  24     31     122    127    Lde/greenrobot/event/j;
        //  76     93     127    147    Any
        //  117    119    115    122    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 77, Size: 77
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
    
    public static m b() {
        Label_0028: {
            if (m.f != null) {
                break Label_0028;
            }
            synchronized (m.class) {
                if (m.f == null) {
                    m.f = new m();
                }
                return m.f;
            }
        }
    }
    
    private List b(final Class clazz) {
        synchronized (de.greenrobot.event.m.g) {
            List<Class> list = de.greenrobot.event.m.g.get(clazz);
            if (list == null) {
                list = new ArrayList<Class>();
                for (Class superclass = clazz; superclass != null; superclass = superclass.getSuperclass()) {
                    list.add(superclass);
                    a(list, superclass.getInterfaces());
                }
                de.greenrobot.event.m.g.put(clazz, list);
            }
            return list;
        }
    }
    
    public Object a(final Class clazz) {
        synchronized (this.n) {
            return clazz.cast(this.n.get(clazz));
        }
    }
    
    ExecutorService a() {
        return this.l;
    }
    
    void a(final c c, final Object o) {
        try {
            c.a.d.invoke(c.d, o);
        }
        catch (InvocationTargetException ex) {
            this.a(c, o, ex.getCause());
        }
        catch (IllegalAccessException ex2) {
            throw new IllegalStateException(de.greenrobot.event.m.z[10], ex2);
        }
    }
    
    void a(final d d) {
        final Object c = d.c;
        final c a = d.a;
        try {
            d.a(d);
            if (a.c) {
                this.a(a, c);
            }
        }
        catch (j j) {
            throw j;
        }
    }
    
    public void a(final Object o) {
        this.a(o, true, 0);
    }
    
    public void b(final Object o) {
        while (true) {
            boolean a = true;
            final k k = this.e.get();
            final List e = k.e;
            Label_0103: {
                while (true) {
                    try {
                        e.add(o);
                        if (k.c) {
                            break;
                        }
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            try {
                                k.a = a;
                                k.c = true;
                                if (k.f) {
                                    throw new j(de.greenrobot.event.m.z[13]);
                                }
                                break Label_0103;
                            }
                            catch (j j) {
                                throw j;
                            }
                        }
                    }
                    catch (j i) {
                        try {
                            throw i;
                        }
                        catch (j l) {
                            throw l;
                        }
                    }
                    a = false;
                    continue;
                }
                try {
                    while (!e.isEmpty()) {
                        this.a(e.remove(0), k);
                    }
                }
                finally {
                    k.c = false;
                    k.a = false;
                }
            }
            k.c = false;
            k.a = false;
            break;
        }
    }
    
    public void c(final Object o) {
        synchronized (this.n) {
            this.n.put(o.getClass(), o);
            // monitorexit(this.n)
            this.b(o);
        }
    }
    
    public void d(final Object o) {
        this.a(o, false, 0);
    }
    
    public void e(final Object o) {
        synchronized (this) {
            final boolean b = de.greenrobot.event.a.b;
            final List<Class> list = this.j.get(o);
            Label_0079: {
                if (list == null) {
                    break Label_0079;
                }
                final Iterator<Class> iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.a(o, iterator.next());
                    if (b) {
                        break;
                    }
                }
                try {
                    this.j.remove(o);
                    if (b) {
                        Log.w(de.greenrobot.event.m.s, de.greenrobot.event.m.z[12] + o.getClass());
                    }
                }
                catch (j j) {
                    throw j;
                }
            }
        }
    }
}
