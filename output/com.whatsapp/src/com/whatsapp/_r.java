// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.fieldstats.j;
import java.util.TimerTask;
import java.util.Timer;
import android.os.Looper;
import com.whatsapp.protocol.c_;
import java.util.HashMap;
import android.os.Handler;
import com.whatsapp.protocol.bl;
import com.whatsapp.protocol.c2;

public class _r extends _2 implements c2, bl
{
    public static Handler g;
    private static HashMap j;
    private static final String[] z;
    private boolean f;
    private long h;
    private ao0 i;
    public boolean k;
    public boolean l;
    public c_ m;
    private Long n;
    
    static {
        final String[] z2 = new String[4];
        String s = "+\u001e5ko7\t*ei/\u00032lh?\u0000?\u007f))\t+xc(\u0018zkg2\u0000?i&aL";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = '[';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = 'Z';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "{\u0010z";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "+\u001e5ko7\t*ei/\u00032lh?\u0000?\u007f))\t+xc(\u0018z~s8\u000f?~u{Vz";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "{\u0010z";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        _r.j = new HashMap();
        _r.g = new ou(Looper.getMainLooper());
    }
    
    public _r(final String s, final byte[] array, final byte[] array2) {
        super(s, array, array2, 0);
        this.l = false;
        this.f = false;
        this.n = System.currentTimeMillis();
        _r.j.put(this.n.toString(), this);
        this.h = System.currentTimeMillis();
        this.i = new ao0(this);
        new Timer().schedule(this.i, 32000L);
    }
    
    public _r(final String s, final byte[] array, final byte[] array2, final c_ m) {
        this(s, array, array2);
        this.m = m;
    }
    
    static Long a(final _r r) {
        return r.n;
    }
    
    static HashMap a() {
        return _r.j;
    }
    
    static void a(final _r r, final j j) {
        r.a(j);
    }
    
    private void a(final j p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/whatsapp/fieldstats/bz;
        //     3: dup            
        //     4: invokespecial   com/whatsapp/fieldstats/bz.<init>:()V
        //     7: astore_2       
        //     8: aload_0        
        //     9: getfield        com/whatsapp/_r.c:[B
        //    12: astore          4
        //    14: aload           4
        //    16: ifnonnull       88
        //    19: iconst_0       
        //    20: istore          5
        //    22: aload_0        
        //    23: getfield        com/whatsapp/_r.e:[B
        //    26: astore          7
        //    28: iconst_0       
        //    29: istore          8
        //    31: aload           7
        //    33: ifnonnull       103
        //    36: aload_2        
        //    37: iload           8
        //    39: iload           5
        //    41: iadd           
        //    42: i2d            
        //    43: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    46: putfield        com/whatsapp/fieldstats/bz.a:Ljava/lang/Double;
        //    49: aload_2        
        //    50: invokestatic    java/lang/System.currentTimeMillis:()J
        //    53: aload_0        
        //    54: getfield        com/whatsapp/_r.h:J
        //    57: lsub           
        //    58: l2d            
        //    59: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    62: putfield        com/whatsapp/fieldstats/bz.c:Ljava/lang/Double;
        //    65: aload_2        
        //    66: aload_1        
        //    67: invokevirtual   com/whatsapp/fieldstats/j.getCode:()I
        //    70: i2d            
        //    71: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    74: putfield        com/whatsapp/fieldstats/bz.d:Ljava/lang/Double;
        //    77: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    80: aload_2        
        //    81: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //    84: return         
        //    85: astore_3       
        //    86: aload_3        
        //    87: athrow         
        //    88: aload_0        
        //    89: getfield        com/whatsapp/_r.c:[B
        //    92: arraylength    
        //    93: istore          5
        //    95: goto            22
        //    98: astore          6
        //   100: aload           6
        //   102: athrow         
        //   103: aload_0        
        //   104: getfield        com/whatsapp/_r.e:[B
        //   107: arraylength    
        //   108: istore          8
        //   110: goto            36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      14     85     88     Ljava/lang/NumberFormatException;
        //  22     28     98     103    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    public static boolean a(final String s) {
        final boolean i = App.I;
        if (s == null) {
            return false;
        }
        for (final _r r : _r.j.values()) {
            try {
                if (s.equals(r.b)) {
                    return true;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            if (i) {
                break;
            }
        }
        return false;
    }
    
    static boolean b(final _r r) {
        return r.f;
    }
    
    @Override
    public void a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/_r.z:[Ljava/lang/String;
        //    10: iconst_0       
        //    11: aaload         
        //    12: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    15: iload_1        
        //    16: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    19: getstatic       com/whatsapp/_r.z:[Ljava/lang/String;
        //    22: iconst_1       
        //    23: aaload         
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: aload_0        
        //    28: getfield        com/whatsapp/_r.b:Ljava/lang/String;
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    37: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    40: aload_0        
        //    41: iconst_1       
        //    42: putfield        com/whatsapp/_r.f:Z
        //    45: aload_0        
        //    46: getfield        com/whatsapp/_r.i:Lcom/whatsapp/ao0;
        //    49: invokevirtual   com/whatsapp/ao0.cancel:()Z
        //    52: pop            
        //    53: getstatic       com/whatsapp/_r.j:Ljava/util/HashMap;
        //    56: aload_0        
        //    57: getfield        com/whatsapp/_r.n:Ljava/lang/Long;
        //    60: invokevirtual   java/lang/Long.toString:()Ljava/lang/String;
        //    63: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    66: pop            
        //    67: aload_0        
        //    68: getstatic       com/whatsapp/fieldstats/j.ERROR_UNKNOWN:Lcom/whatsapp/fieldstats/j;
        //    71: invokespecial   com/whatsapp/_r.a:(Lcom/whatsapp/fieldstats/j;)V
        //    74: aload_0        
        //    75: getfield        com/whatsapp/_r.k:Z
        //    78: ifne            170
        //    81: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    84: aload_0        
        //    85: getfield        com/whatsapp/_r.b:Ljava/lang/String;
        //    88: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    91: astore          5
        //    93: iload_1        
        //    94: sipush          401
        //    97: if_icmpne       154
        //   100: aload           5
        //   102: ifnull          154
        //   105: aload           5
        //   107: invokevirtual   com/whatsapp/a_9.m:()Z
        //   110: istore          9
        //   112: iload           9
        //   114: ifeq            154
        //   117: aload           5
        //   119: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   122: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   125: istore          10
        //   127: iload           10
        //   129: ifne            154
        //   132: getstatic       com/whatsapp/_r.g:Landroid/os/Handler;
        //   135: iconst_3       
        //   136: iload_1        
        //   137: iconst_0       
        //   138: aload_0        
        //   139: getfield        com/whatsapp/_r.b:Ljava/lang/String;
        //   142: invokevirtual   android/os/Handler.obtainMessage:(IIILjava/lang/Object;)Landroid/os/Message;
        //   145: invokevirtual   android/os/Message.sendToTarget:()V
        //   148: getstatic       com/whatsapp/App.I:Z
        //   151: ifeq            170
        //   154: getstatic       com/whatsapp/_r.g:Landroid/os/Handler;
        //   157: iconst_2       
        //   158: iload_1        
        //   159: iconst_0       
        //   160: aload_0        
        //   161: getfield        com/whatsapp/_r.b:Ljava/lang/String;
        //   164: invokevirtual   android/os/Handler.obtainMessage:(IIILjava/lang/Object;)Landroid/os/Message;
        //   167: invokevirtual   android/os/Message.sendToTarget:()V
        //   170: aload_0        
        //   171: getfield        com/whatsapp/_r.m:Lcom/whatsapp/protocol/c_;
        //   174: ifnull          188
        //   177: aload_0        
        //   178: getfield        com/whatsapp/_r.m:Lcom/whatsapp/protocol/c_;
        //   181: getfield        com/whatsapp/protocol/c_.a:Ljava/lang/String;
        //   184: iload_1        
        //   185: invokestatic    com/whatsapp/l7.a:(Ljava/lang/String;I)V
        //   188: return         
        //   189: astore          7
        //   191: aload           7
        //   193: athrow         
        //   194: astore          8
        //   196: aload           8
        //   198: athrow         
        //   199: astore          6
        //   201: aload           6
        //   203: athrow         
        //   204: astore          4
        //   206: aload           4
        //   208: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  105    112    189    194    Ljava/lang/NumberFormatException;
        //  117    127    194    199    Ljava/lang/NumberFormatException;
        //  132    154    199    204    Ljava/lang/NumberFormatException;
        //  154    170    199    204    Ljava/lang/NumberFormatException;
        //  170    188    204    209    Ljava/lang/NumberFormatException;
        //  191    194    194    199    Ljava/lang/NumberFormatException;
        //  196    199    199    204    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 97, Size: 97
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
    
    @Override
    public void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/_r.z:[Ljava/lang/String;
        //    10: iconst_2       
        //    11: aaload         
        //    12: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    15: aload_1        
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    19: getstatic       com/whatsapp/_r.z:[Ljava/lang/String;
        //    22: iconst_3       
        //    23: aaload         
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: aload_0        
        //    28: getfield        com/whatsapp/_r.b:Ljava/lang/String;
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    37: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    40: aload_0        
        //    41: iconst_1       
        //    42: putfield        com/whatsapp/_r.f:Z
        //    45: aload_0        
        //    46: getfield        com/whatsapp/_r.i:Lcom/whatsapp/ao0;
        //    49: invokevirtual   com/whatsapp/ao0.cancel:()Z
        //    52: pop            
        //    53: getstatic       com/whatsapp/_r.j:Ljava/util/HashMap;
        //    56: aload_0        
        //    57: getfield        com/whatsapp/_r.n:Ljava/lang/Long;
        //    60: invokevirtual   java/lang/Long.toString:()Ljava/lang/String;
        //    63: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    66: pop            
        //    67: aload_0        
        //    68: getstatic       com/whatsapp/fieldstats/j.OK:Lcom/whatsapp/fieldstats/j;
        //    71: invokespecial   com/whatsapp/_r.a:(Lcom/whatsapp/fieldstats/j;)V
        //    74: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    77: aload_0        
        //    78: getfield        com/whatsapp/_r.b:Ljava/lang/String;
        //    81: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    84: astore          4
        //    86: aload           4
        //    88: ifnull          183
        //    91: aload_1        
        //    92: ifnonnull       204
        //    95: iconst_m1      
        //    96: istore          15
        //    98: aload           4
        //   100: iload           15
        //   102: iload           15
        //   104: invokevirtual   com/whatsapp/a_9.a:(II)V
        //   107: aload_0        
        //   108: getfield        com/whatsapp/_r.k:Z
        //   111: istore          11
        //   113: iload           11
        //   115: ifne            183
        //   118: aload_0        
        //   119: getfield        com/whatsapp/_r.c:[B
        //   122: astore          12
        //   124: aload           12
        //   126: ifnonnull       151
        //   129: aload_0        
        //   130: getfield        com/whatsapp/_r.e:[B
        //   133: astore          13
        //   135: aload           13
        //   137: ifnonnull       151
        //   140: aload           4
        //   142: invokevirtual   com/whatsapp/a_9.z:()V
        //   145: getstatic       com/whatsapp/App.I:Z
        //   148: ifeq            164
        //   151: aload           4
        //   153: aload_0        
        //   154: getfield        com/whatsapp/_r.c:[B
        //   157: aload_0        
        //   158: getfield        com/whatsapp/_r.e:[B
        //   161: invokevirtual   com/whatsapp/a_9.a:([B[B)V
        //   164: aload           4
        //   166: invokevirtual   com/whatsapp/a_9.w:()V
        //   169: getstatic       com/whatsapp/_r.g:Landroid/os/Handler;
        //   172: iconst_1       
        //   173: aload_0        
        //   174: getfield        com/whatsapp/_r.b:Ljava/lang/String;
        //   177: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
        //   180: invokevirtual   android/os/Message.sendToTarget:()V
        //   183: aload_0        
        //   184: getfield        com/whatsapp/_r.m:Lcom/whatsapp/protocol/c_;
        //   187: ifnull          203
        //   190: aload_0        
        //   191: getfield        com/whatsapp/_r.m:Lcom/whatsapp/protocol/c_;
        //   194: getfield        com/whatsapp/protocol/c_.a:Ljava/lang/String;
        //   197: sipush          200
        //   200: invokestatic    com/whatsapp/l7.a:(Ljava/lang/String;I)V
        //   203: return         
        //   204: aload_1        
        //   205: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   208: istore          14
        //   210: iload           14
        //   212: istore          15
        //   214: goto            98
        //   217: astore          7
        //   219: aload           7
        //   221: athrow         
        //   222: astore          8
        //   224: aload           8
        //   226: athrow         
        //   227: astore          9
        //   229: aload           9
        //   231: athrow         
        //   232: astore          10
        //   234: aload           10
        //   236: athrow         
        //   237: astore          5
        //   239: aload           5
        //   241: athrow         
        //   242: astore          6
        //   244: goto            107
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  98     107    242    247    Ljava/lang/NumberFormatException;
        //  107    113    217    222    Ljava/lang/NumberFormatException;
        //  118    124    222    227    Ljava/lang/NumberFormatException;
        //  129    135    227    232    Ljava/lang/NumberFormatException;
        //  140    151    232    237    Ljava/lang/NumberFormatException;
        //  151    164    232    237    Ljava/lang/NumberFormatException;
        //  183    203    237    242    Ljava/lang/NumberFormatException;
        //  204    210    242    247    Ljava/lang/NumberFormatException;
        //  219    222    222    227    Ljava/lang/NumberFormatException;
        //  224    227    227    232    Ljava/lang/NumberFormatException;
        //  229    232    232    237    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
}
