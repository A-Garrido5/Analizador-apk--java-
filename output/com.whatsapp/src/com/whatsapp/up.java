// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.whatsapp.protocol.bi;
import com.whatsapp.util.ao;
import android.media.audiofx.Visualizer;
import android.media.MediaPlayer;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.app.Activity;
import android.os.Handler;
import android.hardware.Sensor;
import android.media.AudioManager;

public class up
{
    private static AudioManager b;
    private static String[] c;
    private static byte[] j;
    public static up n;
    private static final String[] z;
    private int a;
    private mc d;
    private int e;
    private Sensor f;
    private boolean g;
    private Handler h;
    private Activity i;
    private AudioManager$OnAudioFocusChangeListener k;
    private MediaPlayer l;
    private float m;
    private int o;
    private Visualizer p;
    private r7 q;
    private ao r;
    private boolean s;
    private bi t;
    private SensorManager u;
    private long v;
    private SensorEventListener w;
    
    static {
        final String[] array = new String[9];
        String s = "$K$9]%";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0652:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = 'W';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = 'J';
                        break;
                    }
                    case 3: {
                        c2 = 'J';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = ":K99S0K+?V>A:&S.K8eA#A:";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "6[.#]";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = ":K99S0K+?V>A:&S.K8e@2]?'W";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = ":K99S0K+?V>A:&S.K8eA#O8>";
                    n2 = 4;
                    array2 = array3;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    array2 = array3;
                    s = "$O'9G9I";
                    n = 4;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "!G9?S;C/.[6^&+K2\\e9F6\\>j";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = ":K99S0K+?V>A:&S.K8e]9K+8B%A2#_>Z3j";
                    n = 6;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "6[.#]";
                    n = 7;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = new String[11];
                    s = "\u0010zg\u0003\u000bb\u001e\u007f";
                    n = 8;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    s = "\u0010zg\u0003\u000bb\u001e|";
                    n = 9;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    s = "\u0010zg\u0003\u000bb\u001e\u007f\r";
                    n = 10;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    s = "\u0004i\u0002g{d\u001d}";
                    n = 11;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    s = "\u0004i\u0002g\u007fn\u001fs";
                    n = 12;
                    n2 = 4;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "\u0004m\u0002g{b\u001a\u007f";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "\u0004~\u0002g~`\u001cz";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "\u0004m\u0002g`n\u0019z";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "\u0010zg\u0003\u000bb\u001er";
                    n = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "\u0004i\u0002g|g\u001a\u007f";
                    n = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "\u0004mgz\u0006\u0012";
                    n = 18;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    break Label_0652;
                }
            }
        }
        array2[n2] = intern;
        up.c = array3;
    }
    
    public up(final Activity i) {
        this.h = new ra(this);
        this.i = i;
        if (up.b == null) {
            up.b = (AudioManager)this.i.getApplicationContext().getSystemService(up.z[2]);
        }
    }
    
    static ao a(final up up) {
        return up.r;
    }
    
    private void a() {
        try {
            if (Build$VERSION.SDK_INT > 7) {
                up.b.abandonAudioFocus(this.p());
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: iload_1        
        //     6: putfield        com/whatsapp/up.o:I
        //     9: aload_0        
        //    10: getfield        com/whatsapp/up.q:Lcom/whatsapp/r7;
        //    13: ifnull          26
        //    16: aload_0        
        //    17: getfield        com/whatsapp/up.q:Lcom/whatsapp/r7;
        //    20: iload_1        
        //    21: invokeinterface com/whatsapp/r7.a:(I)V
        //    26: aload_0        
        //    27: getfield        com/whatsapp/up.d:Lcom/whatsapp/mc;
        //    30: astore          6
        //    32: aload           6
        //    34: ifnull          238
        //    37: aload_0        
        //    38: getfield        com/whatsapp/up.p:Landroid/media/audiofx/Visualizer;
        //    41: ifnonnull       238
        //    44: aload_0        
        //    45: iconst_1       
        //    46: aload_0        
        //    47: getfield        com/whatsapp/up.e:I
        //    50: iadd           
        //    51: putfield        com/whatsapp/up.e:I
        //    54: getstatic       com/whatsapp/up.j:[B
        //    57: astore          7
        //    59: aload           7
        //    61: ifnonnull       177
        //    64: sipush          128
        //    67: newarray        B
        //    69: putstatic       com/whatsapp/up.j:[B
        //    72: iconst_0       
        //    73: istore          10
        //    75: iload           10
        //    77: getstatic       com/whatsapp/up.j:[B
        //    80: arraylength    
        //    81: if_icmpge       177
        //    84: ldc2_w          32.0
        //    87: ldc2_w          3.141592653589793
        //    90: iload           10
        //    92: i2d            
        //    93: dmul           
        //    94: dmul           
        //    95: getstatic       com/whatsapp/up.j:[B
        //    98: arraylength    
        //    99: i2d            
        //   100: ddiv           
        //   101: invokestatic    java/lang/Math.sin:(D)D
        //   104: ldc2_w          4.0
        //   107: ldc2_w          3.141592653589793
        //   110: iload           10
        //   112: i2d            
        //   113: dmul           
        //   114: dmul           
        //   115: getstatic       com/whatsapp/up.j:[B
        //   118: arraylength    
        //   119: i2d            
        //   120: ddiv           
        //   121: invokestatic    java/lang/Math.sin:(D)D
        //   124: invokestatic    java/lang/Math.abs:(D)D
        //   127: dmul           
        //   128: dconst_1       
        //   129: ldc2_w          3.141592653589793
        //   132: iload           10
        //   134: i2d            
        //   135: dmul           
        //   136: dmul           
        //   137: getstatic       com/whatsapp/up.j:[B
        //   140: arraylength    
        //   141: i2d            
        //   142: ddiv           
        //   143: invokestatic    java/lang/Math.sin:(D)D
        //   146: invokestatic    java/lang/Math.abs:(D)D
        //   149: dmul           
        //   150: dstore          11
        //   152: getstatic       com/whatsapp/up.j:[B
        //   155: iload           10
        //   157: ldc2_w          128.0
        //   160: dload           11
        //   162: ldc2_w          64.0
        //   165: dmul           
        //   166: dadd           
        //   167: d2i            
        //   168: i2b            
        //   169: bastore        
        //   170: iinc            10, 1
        //   173: iload_2        
        //   174: ifeq            75
        //   177: aload_0        
        //   178: getfield        com/whatsapp/up.e:I
        //   181: iconst_4       
        //   182: irem           
        //   183: istore          8
        //   185: iconst_0       
        //   186: istore          9
        //   188: iload           8
        //   190: ifne            226
        //   193: iload           9
        //   195: getstatic       com/whatsapp/up.j:[B
        //   198: arraylength    
        //   199: if_icmpge       226
        //   202: getstatic       com/whatsapp/up.j:[B
        //   205: iload           9
        //   207: sipush          256
        //   210: getstatic       com/whatsapp/up.j:[B
        //   213: iload           9
        //   215: baload         
        //   216: isub           
        //   217: i2b            
        //   218: bastore        
        //   219: iinc            9, 1
        //   222: iload_2        
        //   223: ifeq            193
        //   226: aload_0        
        //   227: getfield        com/whatsapp/up.d:Lcom/whatsapp/mc;
        //   230: getstatic       com/whatsapp/up.j:[B
        //   233: invokeinterface com/whatsapp/mc.a:([B)V
        //   238: return         
        //   239: astore_3       
        //   240: aload_3        
        //   241: athrow         
        //   242: astore          4
        //   244: aload           4
        //   246: athrow         
        //   247: astore          5
        //   249: aload           5
        //   251: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      26     239    242    Ljava/lang/IllegalStateException;
        //  26     32     242    247    Ljava/lang/IllegalStateException;
        //  37     59     247    252    Ljava/lang/IllegalStateException;
        //  244    247    247    252    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 129, Size: 129
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
    
    static void a(final up up, final int n) {
        up.a(n);
    }
    
    public static boolean a(final bi bi) {
        try {
            if (up.n == null) {
                return false;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return bi.a.equals(up.n.t.a);
    }
    
    static mc b(final up up) {
        return up.d;
    }
    
    static boolean c(final up up) {
        return up.g;
    }
    
    static void d(final up up) {
        up.j();
    }
    
    static Sensor e(final up up) {
        return up.f;
    }
    
    private void f() {
        try {
            if (this.q != null) {
                this.q.d();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void g() {
        try {
            if (this.q != null) {
                this.q.c();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public static void h() {
        try {
            if (up.n != null) {
                up.n.m();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void i() {
        try {
            if (this.q != null) {
                this.q.a();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void j() {
        try {
            if (this.u != null) {
                this.u.unregisterListener(this.w, this.f);
                this.u = null;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public static boolean k() {
        try {
            if (up.n == null) {
                return false;
            }
            final up up = com.whatsapp.up.n;
            final boolean b = up.n();
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final up up = com.whatsapp.up.n;
            final boolean b = up.n();
            if (b) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    private void l() {
        try {
            if (this.u == null) {
                this.u = (SensorManager)this.i.getSystemService(up.z[0]);
                this.f = this.u.getDefaultSensor(8);
                this.w = (SensorEventListener)new a97(this);
                this.u.registerListener(this.w, this.f, 2);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public static boolean o() {
        try {
            if (up.n == null) {
                return false;
            }
            final up up = com.whatsapp.up.n;
            final boolean b = up.s;
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final up up = com.whatsapp.up.n;
            final boolean b = up.s;
            if (b) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    private AudioManager$OnAudioFocusChangeListener p() {
        try {
            if (this.k == null) {
                this.k = (AudioManager$OnAudioFocusChangeListener)new ls(this);
            }
            return this.k;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public static void q() {
        try {
            if (up.n != null) {
                up.n.e();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void s() {
        try {
            if (this.q != null) {
                this.q.b();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private void t() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     5: istore          4
        //     7: iload           4
        //     9: bipush          7
        //    11: if_icmple       52
        //    14: getstatic       com/whatsapp/up.b:Landroid/media/AudioManager;
        //    17: astore          5
        //    19: aload_0        
        //    20: invokespecial   com/whatsapp/up.p:()Landroid/media/AudioManager$OnAudioFocusChangeListener;
        //    23: astore          6
        //    25: aload_0        
        //    26: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //    29: getfield        com/whatsapp/protocol/bi.E:I
        //    32: istore          7
        //    34: iload           7
        //    36: iload_1        
        //    37: if_icmpne       42
        //    40: iconst_3       
        //    41: istore_1       
        //    42: aload           5
        //    44: aload           6
        //    46: iconst_3       
        //    47: iload_1        
        //    48: invokevirtual   android/media/AudioManager.requestAudioFocus:(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I
        //    51: pop            
        //    52: return         
        //    53: astore_2       
        //    54: aload_2        
        //    55: athrow         
        //    56: astore_3       
        //    57: aload_3        
        //    58: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      7      53     56     Ljava/lang/IllegalStateException;
        //  14     34     56     59     Ljava/lang/IllegalStateException;
        //  54     56     56     59     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    public void a(final mc d) {
        this.d = d;
    }
    
    public void a(final r7 q) {
        this.q = q;
    }
    
    protected void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/App.L:Z
        //     7: ifeq            12
        //    10: iconst_0       
        //    11: istore_1       
        //    12: aload_0        
        //    13: getfield        com/whatsapp/up.s:Z
        //    16: istore          4
        //    18: iload           4
        //    20: iload_1        
        //    21: if_icmpne       28
        //    24: return         
        //    25: astore_3       
        //    26: aload_3        
        //    27: athrow         
        //    28: iload_1        
        //    29: ifeq            57
        //    32: aload_0        
        //    33: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    36: astore          28
        //    38: aload           28
        //    40: ifnull          24
        //    43: aload_0        
        //    44: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    47: invokevirtual   com/whatsapp/util/ao.f:()Z
        //    50: istore          29
        //    52: iload           29
        //    54: ifeq            24
        //    57: new             Ljava/lang/StringBuilder;
        //    60: dup            
        //    61: invokespecial   java/lang/StringBuilder.<init>:()V
        //    64: getstatic       com/whatsapp/up.z:[Ljava/lang/String;
        //    67: bipush          7
        //    69: aaload         
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: iload_1        
        //    74: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    77: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    80: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    83: aload_0        
        //    84: iload_1        
        //    85: putfield        com/whatsapp/up.s:Z
        //    88: aload_0        
        //    89: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //    92: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //    95: astore          5
        //    97: aload           5
        //    99: invokevirtual   android/view/Window.getAttributes:()Landroid/view/WindowManager$LayoutParams;
        //   102: astore          6
        //   104: iload_1        
        //   105: ifeq            129
        //   108: aload_0        
        //   109: aload           6
        //   111: getfield        android/view/WindowManager$LayoutParams.screenBrightness:F
        //   114: putfield        com/whatsapp/up.m:F
        //   117: aload           6
        //   119: ldc_w           0.1
        //   122: putfield        android/view/WindowManager$LayoutParams.screenBrightness:F
        //   125: iload_2        
        //   126: ifeq            138
        //   129: aload           6
        //   131: aload_0        
        //   132: getfield        com/whatsapp/up.m:F
        //   135: putfield        android/view/WindowManager$LayoutParams.screenBrightness:F
        //   138: aload           5
        //   140: aload           6
        //   142: invokevirtual   android/view/Window.setAttributes:(Landroid/view/WindowManager$LayoutParams;)V
        //   145: aload_0        
        //   146: getfield        com/whatsapp/up.q:Lcom/whatsapp/r7;
        //   149: ifnull          162
        //   152: aload_0        
        //   153: getfield        com/whatsapp/up.q:Lcom/whatsapp/r7;
        //   156: iload_1        
        //   157: invokeinterface com/whatsapp/r7.a:(Z)V
        //   162: aload_0        
        //   163: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   166: ifnull          24
        //   169: aload_0        
        //   170: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   173: invokevirtual   com/whatsapp/util/ao.f:()Z
        //   176: istore          10
        //   178: iload           10
        //   180: ifeq            24
        //   183: aload_0        
        //   184: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   187: invokevirtual   com/whatsapp/util/ao.i:()I
        //   190: istore          11
        //   192: aload_0        
        //   193: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   196: invokevirtual   com/whatsapp/util/ao.c:()V
        //   199: aload_0        
        //   200: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   203: invokevirtual   com/whatsapp/util/ao.b:()V
        //   206: aload_0        
        //   207: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   210: invokevirtual   com/whatsapp/util/ao.d:()V
        //   213: aload_0        
        //   214: aconst_null    
        //   215: putfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   218: aload_0        
        //   219: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   222: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   225: checkcast       Lcom/whatsapp/MediaData;
        //   228: astore          12
        //   230: aload_0        
        //   231: aload           12
        //   233: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   236: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   239: invokestatic    com/whatsapp/util/ao.a:(Ljava/lang/String;)Lcom/whatsapp/util/ao;
        //   242: putfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   245: iload_1        
        //   246: ifeq            293
        //   249: aload_0        
        //   250: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //   253: getstatic       com/whatsapp/up.z:[Ljava/lang/String;
        //   256: bipush          8
        //   258: aaload         
        //   259: invokevirtual   android/app/Activity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   262: checkcast       Landroid/media/AudioManager;
        //   265: astore          15
        //   267: aload           15
        //   269: iconst_0       
        //   270: invokevirtual   android/media/AudioManager.setSpeakerphoneOn:(Z)V
        //   273: aload_0        
        //   274: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   277: iconst_0       
        //   278: invokevirtual   com/whatsapp/util/ao.b:(I)V
        //   281: aload_0        
        //   282: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //   285: iconst_0       
        //   286: invokevirtual   android/app/Activity.setVolumeControlStream:(I)V
        //   289: iload_2        
        //   290: ifeq            309
        //   293: aload_0        
        //   294: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   297: iconst_3       
        //   298: invokevirtual   com/whatsapp/util/ao.b:(I)V
        //   301: aload_0        
        //   302: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //   305: iconst_3       
        //   306: invokevirtual   android/app/Activity.setVolumeControlStream:(I)V
        //   309: aload_0        
        //   310: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   313: invokevirtual   com/whatsapp/util/ao.g:()V
        //   316: aload_0        
        //   317: iconst_0       
        //   318: iload           11
        //   320: sipush          1000
        //   323: isub           
        //   324: invokestatic    java/lang/Math.max:(II)I
        //   327: putfield        com/whatsapp/up.o:I
        //   330: aload_0        
        //   331: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   334: aload_0        
        //   335: getfield        com/whatsapp/up.o:I
        //   338: invokevirtual   com/whatsapp/util/ao.a:(I)V
        //   341: iload_1        
        //   342: ifne            368
        //   345: invokestatic    java/lang/System.currentTimeMillis:()J
        //   348: lstore          20
        //   350: aload_0        
        //   351: getfield        com/whatsapp/up.v:J
        //   354: lstore          22
        //   356: lload           20
        //   358: lload           22
        //   360: lsub           
        //   361: ldc2_w          1500
        //   364: lcmp           
        //   365: ifge            379
        //   368: aload_0        
        //   369: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   372: invokevirtual   com/whatsapp/util/ao.h:()V
        //   375: iload_2        
        //   376: ifeq            24
        //   379: aload_0        
        //   380: iconst_1       
        //   381: putfield        com/whatsapp/up.g:Z
        //   384: aload_0        
        //   385: invokespecial   com/whatsapp/up.s:()V
        //   388: aload_0        
        //   389: invokespecial   com/whatsapp/up.a:()V
        //   392: return         
        //   393: astore          19
        //   395: aload           19
        //   397: athrow         
        //   398: astore          14
        //   400: aload_0        
        //   401: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //   404: invokevirtual   android/app/Activity.getApplicationContext:()Landroid/content/Context;
        //   407: ldc_w           2131231134
        //   410: iconst_0       
        //   411: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   414: return         
        //   415: astore          25
        //   417: aload           25
        //   419: athrow         
        //   420: astore          26
        //   422: aload           26
        //   424: athrow         
        //   425: astore          27
        //   427: aload           27
        //   429: athrow         
        //   430: astore          24
        //   432: aload           24
        //   434: athrow         
        //   435: astore          7
        //   437: aload           7
        //   439: athrow         
        //   440: astore          8
        //   442: aload           8
        //   444: athrow         
        //   445: astore          9
        //   447: aload           9
        //   449: athrow         
        //   450: astore          16
        //   452: aload           16
        //   454: athrow         
        //   455: astore          13
        //   457: aload_0        
        //   458: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //   461: invokevirtual   android/app/Activity.getApplicationContext:()Landroid/content/Context;
        //   464: ldc_w           2131231134
        //   467: iconst_0       
        //   468: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   471: return         
        //   472: astore          17
        //   474: aload           17
        //   476: athrow         
        //   477: astore          18
        //   479: aload           18
        //   481: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  12     18     25     28     Ljava/lang/IllegalStateException;
        //  32     38     415    420    Ljava/lang/IllegalStateException;
        //  43     52     420    430    Ljava/lang/IllegalStateException;
        //  108    125    430    435    Ljava/lang/IllegalStateException;
        //  129    138    435    440    Ljava/lang/IllegalStateException;
        //  138    162    440    445    Ljava/lang/IllegalStateException;
        //  162    178    445    450    Ljava/lang/IllegalStateException;
        //  230    245    398    415    Ljava/lang/IllegalStateException;
        //  230    245    455    472    Ljava/io/IOException;
        //  249    267    398    415    Ljava/lang/IllegalStateException;
        //  249    267    455    472    Ljava/io/IOException;
        //  267    289    450    455    Ljava/lang/IllegalStateException;
        //  267    289    455    472    Ljava/io/IOException;
        //  293    309    450    455    Ljava/lang/IllegalStateException;
        //  293    309    455    472    Ljava/io/IOException;
        //  309    341    472    477    Ljava/lang/IllegalStateException;
        //  309    341    455    472    Ljava/io/IOException;
        //  345    356    472    477    Ljava/lang/IllegalStateException;
        //  345    356    455    472    Ljava/io/IOException;
        //  368    375    477    482    Ljava/lang/IllegalStateException;
        //  368    375    455    472    Ljava/io/IOException;
        //  379    392    393    398    Ljava/lang/IllegalStateException;
        //  379    392    455    472    Ljava/io/IOException;
        //  395    398    398    415    Ljava/lang/IllegalStateException;
        //  395    398    455    472    Ljava/io/IOException;
        //  417    420    420    430    Ljava/lang/IllegalStateException;
        //  422    425    425    430    Ljava/lang/IllegalStateException;
        //  432    435    435    440    Ljava/lang/IllegalStateException;
        //  452    455    398    415    Ljava/lang/IllegalStateException;
        //  452    455    455    472    Ljava/io/IOException;
        //  474    477    477    482    Ljava/lang/IllegalStateException;
        //  474    477    455    472    Ljava/io/IOException;
        //  479    482    393    398    Ljava/lang/IllegalStateException;
        //  479    482    455    472    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 232, Size: 232
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
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/up.n:Lcom/whatsapp/up;
        //     3: astore_3       
        //     4: aload_3        
        //     5: aload_0        
        //     6: if_acmpeq       21
        //     9: getstatic       com/whatsapp/up.n:Lcom/whatsapp/up;
        //    12: ifnull          21
        //    15: getstatic       com/whatsapp/up.n:Lcom/whatsapp/up;
        //    18: invokevirtual   com/whatsapp/up.m:()V
        //    21: aload_0        
        //    22: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    25: astore          7
        //    27: aload           7
        //    29: ifnull          46
        //    32: aload_0        
        //    33: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    36: invokevirtual   com/whatsapp/util/ao.f:()Z
        //    39: istore          8
        //    41: iload           8
        //    43: ifne            56
        //    46: aload_0        
        //    47: invokevirtual   com/whatsapp/up.c:()V
        //    50: getstatic       com/whatsapp/App.I:Z
        //    53: ifeq            60
        //    56: aload_0        
        //    57: invokevirtual   com/whatsapp/up.e:()V
        //    60: return         
        //    61: astore_1       
        //    62: aload_1        
        //    63: athrow         
        //    64: astore_2       
        //    65: aload_2        
        //    66: athrow         
        //    67: astore          4
        //    69: aload           4
        //    71: athrow         
        //    72: astore          5
        //    74: aload           5
        //    76: athrow         
        //    77: astore          6
        //    79: aload           6
        //    81: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      4      61     64     Ljava/lang/IllegalStateException;
        //  9      21     64     67     Ljava/lang/IllegalStateException;
        //  21     27     67     72     Ljava/lang/IllegalStateException;
        //  32     41     72     77     Ljava/lang/IllegalStateException;
        //  46     56     77     82     Ljava/lang/IllegalStateException;
        //  56     60     77     82     Ljava/lang/IllegalStateException;
        //  62     64     64     67     Ljava/lang/IllegalStateException;
        //  69     72     72     77     Ljava/lang/IllegalStateException;
        //  74     77     77     82     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 42, Size: 42
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
    
    public void b(final int o) {
        try {
            this.o = o;
            if (this.r != null) {
                this.r.a(o);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void b(final bi t) {
        this.t = t;
    }
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/up.n:Lcom/whatsapp/up;
        //     7: aload_0        
        //     8: if_acmpeq       27
        //    11: getstatic       com/whatsapp/up.n:Lcom/whatsapp/up;
        //    14: astore          40
        //    16: aload           40
        //    18: ifnull          27
        //    21: getstatic       com/whatsapp/up.n:Lcom/whatsapp/up;
        //    24: invokevirtual   com/whatsapp/up.m:()V
        //    27: getstatic       com/whatsapp/App.a:Landroid/media/AsyncPlayer;
        //    30: invokevirtual   android/media/AsyncPlayer.stop:()V
        //    33: aload_0        
        //    34: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //    37: invokestatic    com/whatsapp/App.e:(Landroid/content/Context;)Z
        //    40: ifne            51
        //    43: aload_0        
        //    44: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //    47: iconst_3       
        //    48: invokevirtual   android/app/Activity.setVolumeControlStream:(I)V
        //    51: aload_0        
        //    52: invokespecial   com/whatsapp/up.t:()V
        //    55: aload_0        
        //    56: invokestatic    java/lang/System.currentTimeMillis:()J
        //    59: putfield        com/whatsapp/up.v:J
        //    62: aload_0        
        //    63: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    66: ifnonnull       474
        //    69: getstatic       com/whatsapp/up.z:[Ljava/lang/String;
        //    72: iconst_4       
        //    73: aaload         
        //    74: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    77: aload_0        
        //    78: getfield        com/whatsapp/up.d:Lcom/whatsapp/mc;
        //    81: astore          12
        //    83: aload           12
        //    85: ifnull          199
        //    88: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    91: istore          34
        //    93: iload           34
        //    95: bipush          17
        //    97: if_icmplt       199
        //   100: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   103: istore          35
        //   105: iload           35
        //   107: bipush          18
        //   109: if_icmpgt       199
        //   112: getstatic       com/whatsapp/up.z:[Ljava/lang/String;
        //   115: iconst_5       
        //   116: aaload         
        //   117: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //   120: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   123: istore          36
        //   125: iload           36
        //   127: ifeq            199
        //   130: getstatic       com/whatsapp/up.c:[Ljava/lang/String;
        //   133: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   136: invokestatic    com/whatsapp/util/ax.a:([Ljava/lang/Object;Ljava/lang/Object;)Z
        //   139: istore          37
        //   141: iload           37
        //   143: ifeq            199
        //   146: aload_0        
        //   147: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   150: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   153: checkcast       Lcom/whatsapp/MediaData;
        //   156: astore          39
        //   158: aload_0        
        //   159: new             Landroid/media/MediaPlayer;
        //   162: dup            
        //   163: invokespecial   android/media/MediaPlayer.<init>:()V
        //   166: putfield        com/whatsapp/up.l:Landroid/media/MediaPlayer;
        //   169: aload_0        
        //   170: getfield        com/whatsapp/up.l:Landroid/media/MediaPlayer;
        //   173: aload           39
        //   175: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   178: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   181: invokevirtual   android/media/MediaPlayer.setDataSource:(Ljava/lang/String;)V
        //   184: aload_0        
        //   185: getfield        com/whatsapp/up.l:Landroid/media/MediaPlayer;
        //   188: iconst_3       
        //   189: invokevirtual   android/media/MediaPlayer.setAudioStreamType:(I)V
        //   192: aload_0        
        //   193: getfield        com/whatsapp/up.l:Landroid/media/MediaPlayer;
        //   196: invokevirtual   android/media/MediaPlayer.prepare:()V
        //   199: aload_0        
        //   200: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   203: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   206: checkcast       Lcom/whatsapp/MediaData;
        //   209: astore          24
        //   211: aload_0        
        //   212: aload           24
        //   214: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   217: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   220: invokestatic    com/whatsapp/util/ao.a:(Ljava/lang/String;)Lcom/whatsapp/util/ao;
        //   223: putfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   226: aload_0        
        //   227: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   230: iconst_3       
        //   231: invokevirtual   com/whatsapp/util/ao.b:(I)V
        //   234: aload_0        
        //   235: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   238: invokevirtual   com/whatsapp/util/ao.g:()V
        //   241: aload_0        
        //   242: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   245: aload_0        
        //   246: getfield        com/whatsapp/up.o:I
        //   249: invokevirtual   com/whatsapp/util/ao.a:(I)V
        //   252: aload_0        
        //   253: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   256: invokevirtual   com/whatsapp/util/ao.h:()V
        //   259: aload_0        
        //   260: aload_0        
        //   261: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   264: invokevirtual   com/whatsapp/util/ao.e:()I
        //   267: putfield        com/whatsapp/up.a:I
        //   270: aload_0        
        //   271: getfield        com/whatsapp/up.h:Landroid/os/Handler;
        //   274: iconst_0       
        //   275: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   278: pop            
        //   279: aload_0        
        //   280: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   283: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   286: getfield        com/whatsapp/protocol/c6.b:Z
        //   289: ifne            362
        //   292: aload_0        
        //   293: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   296: getfield        com/whatsapp/protocol/bi.E:I
        //   299: istore          30
        //   301: iload           30
        //   303: iconst_1       
        //   304: if_icmpne       362
        //   307: aload_0        
        //   308: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   311: getfield        com/whatsapp/protocol/bi.c:I
        //   314: istore          31
        //   316: iload           31
        //   318: bipush          9
        //   320: if_icmpeq       362
        //   323: aload_0        
        //   324: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   327: getfield        com/whatsapp/protocol/bi.c:I
        //   330: istore          32
        //   332: iload           32
        //   334: bipush          10
        //   336: if_icmpeq       362
        //   339: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   342: aload_0        
        //   343: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   346: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   349: bipush          9
        //   351: invokevirtual   com/whatsapp/vy.b:(Lcom/whatsapp/protocol/c6;I)Z
        //   354: pop            
        //   355: aload_0        
        //   356: getfield        com/whatsapp/up.t:Lcom/whatsapp/protocol/bi;
        //   359: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/protocol/bi;)V
        //   362: iconst_1       
        //   363: istore          14
        //   365: iload           14
        //   367: ifeq            466
        //   370: aload_0        
        //   371: getfield        com/whatsapp/up.d:Lcom/whatsapp/mc;
        //   374: astore          18
        //   376: aload           18
        //   378: ifnull          450
        //   381: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   384: istore          19
        //   386: iload           19
        //   388: bipush          9
        //   390: if_icmplt       450
        //   393: aload_0        
        //   394: new             Landroid/media/audiofx/Visualizer;
        //   397: dup            
        //   398: iconst_0       
        //   399: invokespecial   android/media/audiofx/Visualizer.<init>:(I)V
        //   402: putfield        com/whatsapp/up.p:Landroid/media/audiofx/Visualizer;
        //   405: aload_0        
        //   406: getfield        com/whatsapp/up.p:Landroid/media/audiofx/Visualizer;
        //   409: invokestatic    android/media/audiofx/Visualizer.getCaptureSizeRange:()[I
        //   412: iconst_1       
        //   413: iaload         
        //   414: invokevirtual   android/media/audiofx/Visualizer.setCaptureSize:(I)I
        //   417: pop            
        //   418: aload_0        
        //   419: getfield        com/whatsapp/up.p:Landroid/media/audiofx/Visualizer;
        //   422: new             Lcom/whatsapp/u3;
        //   425: dup            
        //   426: aload_0        
        //   427: invokespecial   com/whatsapp/u3.<init>:(Lcom/whatsapp/up;)V
        //   430: invokestatic    android/media/audiofx/Visualizer.getMaxCaptureRate:()I
        //   433: iconst_2       
        //   434: idiv           
        //   435: iconst_1       
        //   436: iconst_1       
        //   437: invokevirtual   android/media/audiofx/Visualizer.setDataCaptureListener:(Landroid/media/audiofx/Visualizer$OnDataCaptureListener;IZZ)I
        //   440: pop            
        //   441: aload_0        
        //   442: getfield        com/whatsapp/up.p:Landroid/media/audiofx/Visualizer;
        //   445: iconst_1       
        //   446: invokevirtual   android/media/audiofx/Visualizer.setEnabled:(Z)I
        //   449: pop            
        //   450: aload_0        
        //   451: invokespecial   com/whatsapp/up.i:()V
        //   454: aload_0        
        //   455: invokespecial   com/whatsapp/up.l:()V
        //   458: aload_0        
        //   459: putstatic       com/whatsapp/up.n:Lcom/whatsapp/up;
        //   462: iload_1        
        //   463: ifeq            470
        //   466: aload_0        
        //   467: invokevirtual   com/whatsapp/up.m:()V
        //   470: iload_1        
        //   471: ifeq            522
        //   474: getstatic       com/whatsapp/up.z:[Ljava/lang/String;
        //   477: iconst_3       
        //   478: aaload         
        //   479: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   482: aload_0        
        //   483: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   486: aload_0        
        //   487: getfield        com/whatsapp/up.o:I
        //   490: invokevirtual   com/whatsapp/util/ao.a:(I)V
        //   493: aload_0        
        //   494: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //   497: invokevirtual   com/whatsapp/util/ao.h:()V
        //   500: aload_0        
        //   501: iconst_0       
        //   502: putfield        com/whatsapp/up.g:Z
        //   505: aload_0        
        //   506: getfield        com/whatsapp/up.h:Landroid/os/Handler;
        //   509: iconst_0       
        //   510: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   513: pop            
        //   514: aload_0        
        //   515: invokespecial   com/whatsapp/up.g:()V
        //   518: aload_0        
        //   519: invokespecial   com/whatsapp/up.l:()V
        //   522: return         
        //   523: astore_2       
        //   524: aload_2        
        //   525: athrow         
        //   526: astore_3       
        //   527: aload_3        
        //   528: athrow         
        //   529: astore          4
        //   531: aload           4
        //   533: athrow         
        //   534: astore          5
        //   536: aload           5
        //   538: athrow         
        //   539: astore          6
        //   541: aload           6
        //   543: athrow         
        //   544: astore          7
        //   546: aload           7
        //   548: athrow         
        //   549: astore          8
        //   551: aload           8
        //   553: athrow         
        //   554: astore          9
        //   556: aload           9
        //   558: athrow         
        //   559: astore          38
        //   561: aload           38
        //   563: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   566: goto            199
        //   569: astore          25
        //   571: aload           25
        //   573: athrow         
        //   574: astore          26
        //   576: aload           26
        //   578: athrow         
        //   579: astore          27
        //   581: aload           27
        //   583: athrow         
        //   584: astore          28
        //   586: aload           28
        //   588: athrow         
        //   589: astore          13
        //   591: aload           13
        //   593: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   596: aload_0        
        //   597: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //   600: invokevirtual   android/app/Activity.getApplicationContext:()Landroid/content/Context;
        //   603: ldc_w           2131231134
        //   606: iconst_0       
        //   607: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   610: iconst_0       
        //   611: istore          14
        //   613: goto            365
        //   616: astore          16
        //   618: aload           16
        //   620: athrow         
        //   621: astore          17
        //   623: aload           17
        //   625: athrow         
        //   626: astore          20
        //   628: new             Ljava/lang/StringBuilder;
        //   631: dup            
        //   632: invokespecial   java/lang/StringBuilder.<init>:()V
        //   635: getstatic       com/whatsapp/up.z:[Ljava/lang/String;
        //   638: bipush          6
        //   640: aaload         
        //   641: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   644: aload           20
        //   646: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   649: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   652: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   655: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   658: goto            450
        //   661: astore          15
        //   663: aload           15
        //   665: athrow         
        //   666: astore          10
        //   668: aload           10
        //   670: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      16     523    526    Ljava/io/IOException;
        //  21     27     526    529    Ljava/io/IOException;
        //  27     51     529    534    Ljava/io/IOException;
        //  51     83     534    539    Ljava/io/IOException;
        //  88     93     539    544    Ljava/io/IOException;
        //  100    105    544    549    Ljava/io/IOException;
        //  112    125    549    554    Ljava/io/IOException;
        //  130    141    554    559    Ljava/io/IOException;
        //  146    199    559    569    Ljava/io/IOException;
        //  199    211    589    616    Ljava/io/IOException;
        //  211    301    569    574    Ljava/io/IOException;
        //  307    316    574    579    Ljava/io/IOException;
        //  323    332    579    584    Ljava/io/IOException;
        //  339    362    584    589    Ljava/io/IOException;
        //  370    376    616    621    Ljava/io/IOException;
        //  381    386    621    626    Ljava/io/IOException;
        //  393    450    626    661    Ljava/lang/Exception;
        //  450    462    661    666    Ljava/io/IOException;
        //  466    470    661    666    Ljava/io/IOException;
        //  474    522    666    671    Ljava/io/IOException;
        //  524    526    526    529    Ljava/io/IOException;
        //  536    539    539    544    Ljava/io/IOException;
        //  541    544    544    549    Ljava/io/IOException;
        //  546    549    549    554    Ljava/io/IOException;
        //  551    554    554    559    Ljava/io/IOException;
        //  571    574    574    579    Ljava/io/IOException;
        //  576    579    579    584    Ljava/io/IOException;
        //  581    584    584    589    Ljava/io/IOException;
        //  586    589    589    616    Ljava/io/IOException;
        //  618    621    621    626    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 317, Size: 317
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
    
    public int d() {
        try {
            if (this.r == null) {
                return 0;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return Math.max(this.o, this.r.i());
    }
    
    public void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          35
        //     9: aload_0        
        //    10: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    13: invokevirtual   com/whatsapp/util/ao.f:()Z
        //    16: ifeq            35
        //    19: aload_0        
        //    20: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    23: invokevirtual   com/whatsapp/util/ao.a:()V
        //    26: aload_0        
        //    27: iconst_1       
        //    28: putfield        com/whatsapp/up.g:Z
        //    31: aload_0        
        //    32: invokespecial   com/whatsapp/up.s:()V
        //    35: aload_0        
        //    36: invokespecial   com/whatsapp/up.a:()V
        //    39: return         
        //    40: astore_1       
        //    41: aload_1        
        //    42: athrow         
        //    43: astore_2       
        //    44: aload_2        
        //    45: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      40     43     Ljava/lang/IllegalStateException;
        //  9      35     43     46     Ljava/lang/IllegalStateException;
        //  41     43     43     46     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    public void m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/up.z:[Ljava/lang/String;
        //     3: iconst_1       
        //     4: aaload         
        //     5: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    12: astore_3       
        //    13: aload_3        
        //    14: ifnull          53
        //    17: aload_0        
        //    18: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    21: invokevirtual   com/whatsapp/util/ao.f:()Z
        //    24: ifeq            34
        //    27: aload_0        
        //    28: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    31: invokevirtual   com/whatsapp/util/ao.c:()V
        //    34: aload_0        
        //    35: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    38: invokevirtual   com/whatsapp/util/ao.b:()V
        //    41: aload_0        
        //    42: getfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    45: invokevirtual   com/whatsapp/util/ao.d:()V
        //    48: aload_0        
        //    49: aconst_null    
        //    50: putfield        com/whatsapp/up.r:Lcom/whatsapp/util/ao;
        //    53: aload_0        
        //    54: getfield        com/whatsapp/up.l:Landroid/media/MediaPlayer;
        //    57: ifnull          79
        //    60: aload_0        
        //    61: getfield        com/whatsapp/up.l:Landroid/media/MediaPlayer;
        //    64: invokevirtual   android/media/MediaPlayer.reset:()V
        //    67: aload_0        
        //    68: getfield        com/whatsapp/up.l:Landroid/media/MediaPlayer;
        //    71: invokevirtual   android/media/MediaPlayer.release:()V
        //    74: aload_0        
        //    75: aconst_null    
        //    76: putfield        com/whatsapp/up.l:Landroid/media/MediaPlayer;
        //    79: aload_0        
        //    80: getfield        com/whatsapp/up.p:Landroid/media/audiofx/Visualizer;
        //    83: ifnull          100
        //    86: aload_0        
        //    87: getfield        com/whatsapp/up.p:Landroid/media/audiofx/Visualizer;
        //    90: iconst_0       
        //    91: invokevirtual   android/media/audiofx/Visualizer.setEnabled:(Z)I
        //    94: pop            
        //    95: aload_0        
        //    96: aconst_null    
        //    97: putfield        com/whatsapp/up.p:Landroid/media/audiofx/Visualizer;
        //   100: aload_0        
        //   101: getfield        com/whatsapp/up.s:Z
        //   104: ifne            111
        //   107: aload_0        
        //   108: invokespecial   com/whatsapp/up.j:()V
        //   111: aload_0        
        //   112: invokespecial   com/whatsapp/up.a:()V
        //   115: aload_0        
        //   116: getfield        com/whatsapp/up.i:Landroid/app/Activity;
        //   119: ldc_w           -2147483648
        //   122: invokevirtual   android/app/Activity.setVolumeControlStream:(I)V
        //   125: aload_0        
        //   126: iconst_0       
        //   127: putfield        com/whatsapp/up.o:I
        //   130: aload_0        
        //   131: iconst_0       
        //   132: putfield        com/whatsapp/up.g:Z
        //   135: aload_0        
        //   136: getfield        com/whatsapp/up.h:Landroid/os/Handler;
        //   139: iconst_0       
        //   140: invokevirtual   android/os/Handler.removeMessages:(I)V
        //   143: aconst_null    
        //   144: putstatic       com/whatsapp/up.n:Lcom/whatsapp/up;
        //   147: aload_0        
        //   148: invokespecial   com/whatsapp/up.f:()V
        //   151: return         
        //   152: astore_1       
        //   153: aload_1        
        //   154: athrow         
        //   155: astore_2       
        //   156: aload_2        
        //   157: athrow         
        //   158: astore          4
        //   160: aload           4
        //   162: athrow         
        //   163: astore          5
        //   165: aload           5
        //   167: athrow         
        //   168: astore          6
        //   170: aload           6
        //   172: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      13     152    155    Ljava/lang/IllegalStateException;
        //  17     34     155    158    Ljava/lang/IllegalStateException;
        //  53     79     158    163    Ljava/lang/IllegalStateException;
        //  79     100    163    168    Ljava/lang/IllegalStateException;
        //  100    111    168    173    Ljava/lang/IllegalStateException;
        //  153    155    155    158    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 89, Size: 89
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
    
    public boolean n() {
        try {
            if (this.r == null) {
                return false;
            }
            final up up = this;
            final ao ao = up.r;
            final boolean b = ao.f();
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            final up up = this;
            final ao ao = up.r;
            final boolean b = ao.f();
            if (b) {
                return true;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public int r() {
        return this.a;
    }
}
