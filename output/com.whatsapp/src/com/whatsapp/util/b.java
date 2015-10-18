// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.widget.ImageView;
import android.graphics.Bitmap;
import com.whatsapp.protocol.bi;
import java.util.HashSet;
import android.support.v4.util.LruCache;
import android.os.Handler;
import java.util.HashMap;
import android.graphics.BitmapFactory$Options;

public class b
{
    private static long c;
    public static BitmapFactory$Options e;
    private static ar g;
    private static final b h;
    private static final HashMap j;
    private static final String[] z;
    private HashMap a;
    private cs b;
    private Handler d;
    private LruCache f;
    private a5 i;
    private HashSet k;
    
    static {
        final String[] z2 = new String[5];
        String s = "~L;5%tL<.1~K+''{Lg%+}Z<41p]h";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'D';
                        break;
                    }
                    case 0: {
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = 'H';
                        break;
                    }
                    case 3: {
                        c2 = 'F';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "zD)!!>] 3)q\u0006*'7v\u001f|k vJ'\"!<D-57rN-h r])|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "zD)!!>] 3)q\u0006*'7v\u001f|k vJ'\"!<L:4+a";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "zD)!!>] 3)q\u0006*'7v\u001f|k vJ'\"!<D-57rN-h!}J'\"-}Nr";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "2\bh4!pP+*!w\t%#7`H/#dzGh.%aMh%%pA-";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        j = new HashMap();
        h = new b();
        b.e = new BitmapFactory$Options();
        b.e.inDither = true;
        b.g = new c9();
    }
    
    private b() {
        this.a = new HashMap();
        this.k = new HashSet();
        this.i = null;
        this.b = new cs(this);
        final int n = (int)(Runtime.getRuntime().maxMemory() / 1024L / 8L);
        Log.i(com.whatsapp.util.b.z[0] + n);
        this.f = new aq(this, n);
    }
    
    public static Bitmap a(final bi bi) {
        return b.h.b(bi, null, null);
    }
    
    static HashMap a(final b b) {
        return b.a;
    }
    
    private void a(final bi p0, final ImageView p1, final ar p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/util/b.d:Landroid/os/Handler;
        //     4: ifnonnull       18
        //     7: aload_0        
        //     8: new             Landroid/os/Handler;
        //    11: dup            
        //    12: invokespecial   android/os/Handler.<init>:()V
        //    15: putfield        com/whatsapp/util/b.d:Landroid/os/Handler;
        //    18: aload_0        
        //    19: getfield        com/whatsapp/util/b.b:Lcom/whatsapp/util/cs;
        //    22: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //    25: astore          5
        //    27: aload           5
        //    29: monitorenter   
        //    30: aload_0        
        //    31: getfield        com/whatsapp/util/b.b:Lcom/whatsapp/util/cs;
        //    34: aload_2        
        //    35: invokevirtual   com/whatsapp/util/cs.a:(Landroid/widget/ImageView;)V
        //    38: aload_0        
        //    39: getfield        com/whatsapp/util/b.b:Lcom/whatsapp/util/cs;
        //    42: aload_1        
        //    43: invokevirtual   com/whatsapp/util/cs.a:(Lcom/whatsapp/protocol/bi;)Z
        //    46: ifeq            58
        //    49: aload           5
        //    51: monitorexit    
        //    52: return         
        //    53: astore          4
        //    55: aload           4
        //    57: athrow         
        //    58: aload           5
        //    60: monitorexit    
        //    61: aload_1        
        //    62: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    65: checkcast       Lcom/whatsapp/MediaData;
        //    68: astore          7
        //    70: aload           7
        //    72: ifnull          52
        //    75: aload           7
        //    77: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    80: astore          11
        //    82: aload           11
        //    84: ifnull          52
        //    87: aload           7
        //    89: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    92: invokevirtual   java/io/File.exists:()Z
        //    95: istore          12
        //    97: iload           12
        //    99: ifeq            52
        //   102: new             Lcom/whatsapp/util/as;
        //   105: dup            
        //   106: aload_0        
        //   107: aload_1        
        //   108: aload_2        
        //   109: aload_3        
        //   110: invokespecial   com/whatsapp/util/as.<init>:(Lcom/whatsapp/util/b;Lcom/whatsapp/protocol/bi;Landroid/widget/ImageView;Lcom/whatsapp/util/ar;)V
        //   113: astore          13
        //   115: aload_0        
        //   116: getfield        com/whatsapp/util/b.b:Lcom/whatsapp/util/cs;
        //   119: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //   122: astore          14
        //   124: aload           14
        //   126: monitorenter   
        //   127: aload_0        
        //   128: getfield        com/whatsapp/util/b.b:Lcom/whatsapp/util/cs;
        //   131: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //   134: iconst_0       
        //   135: aload           13
        //   137: invokevirtual   java/util/Stack.add:(ILjava/lang/Object;)V
        //   140: aload_0        
        //   141: getfield        com/whatsapp/util/b.b:Lcom/whatsapp/util/cs;
        //   144: invokestatic    com/whatsapp/util/cs.a:(Lcom/whatsapp/util/cs;)Ljava/util/Stack;
        //   147: invokevirtual   java/lang/Object.notifyAll:()V
        //   150: aload           14
        //   152: monitorexit    
        //   153: aload_0        
        //   154: getfield        com/whatsapp/util/b.i:Lcom/whatsapp/util/a5;
        //   157: ifnonnull       52
        //   160: aload_0        
        //   161: new             Lcom/whatsapp/util/a5;
        //   164: dup            
        //   165: aload_0        
        //   166: invokespecial   com/whatsapp/util/a5.<init>:(Lcom/whatsapp/util/b;)V
        //   169: putfield        com/whatsapp/util/b.i:Lcom/whatsapp/util/a5;
        //   172: aload_0        
        //   173: getfield        com/whatsapp/util/b.i:Lcom/whatsapp/util/a5;
        //   176: iconst_4       
        //   177: invokevirtual   com/whatsapp/util/a5.setPriority:(I)V
        //   180: aload_0        
        //   181: getfield        com/whatsapp/util/b.i:Lcom/whatsapp/util/a5;
        //   184: invokevirtual   com/whatsapp/util/a5.start:()V
        //   187: return         
        //   188: astore          16
        //   190: aload           16
        //   192: athrow         
        //   193: astore          6
        //   195: aload           5
        //   197: monitorexit    
        //   198: aload           6
        //   200: athrow         
        //   201: astore          8
        //   203: aload           8
        //   205: athrow         
        //   206: astore          9
        //   208: aload           9
        //   210: athrow         
        //   211: astore          10
        //   213: aload           10
        //   215: athrow         
        //   216: astore          15
        //   218: aload           14
        //   220: monitorexit    
        //   221: aload           15
        //   223: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  0      18     53     58     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  30     52     193    201    Any
        //  58     61     193    201    Any
        //  75     82     201    206    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  87     97     206    216    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  127    153    216    224    Any
        //  153    187    188    193    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  195    198    193    201    Any
        //  203    206    206    216    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  208    211    211    216    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  218    221    216    224    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 113, Size: 113
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
    
    public static void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/b.h:Lcom/whatsapp/util/b;
        //     3: astore_1       
        //     4: aload_1        
        //     5: monitorenter   
        //     6: getstatic       com/whatsapp/util/b.j:Ljava/util/HashMap;
        //     9: aload_0        
        //    10: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    13: checkcast       Ljava/lang/Integer;
        //    16: astore_3       
        //    17: aload_3        
        //    18: ifnonnull       43
        //    21: getstatic       com/whatsapp/util/b.j:Ljava/util/HashMap;
        //    24: aload_0        
        //    25: iconst_1       
        //    26: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    29: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    32: pop            
        //    33: getstatic       com/whatsapp/util/Log.l:Z
        //    36: istore          8
        //    38: iload           8
        //    40: ifeq            60
        //    43: getstatic       com/whatsapp/util/b.j:Ljava/util/HashMap;
        //    46: aload_0        
        //    47: iconst_1       
        //    48: aload_3        
        //    49: invokevirtual   java/lang/Integer.intValue:()I
        //    52: iadd           
        //    53: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    56: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    59: pop            
        //    60: aload_1        
        //    61: monitorexit    
        //    62: return         
        //    63: astore          6
        //    65: aload           6
        //    67: athrow         
        //    68: astore          4
        //    70: aload           4
        //    72: athrow         
        //    73: astore_2       
        //    74: aload_1        
        //    75: monitorexit    
        //    76: aload_2        
        //    77: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  6      17     73     78     Any
        //  21     38     63     68     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  21     38     73     78     Any
        //  43     60     68     73     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  43     60     73     78     Any
        //  60     62     73     78     Any
        //  65     68     68     73     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  65     68     73     78     Any
        //  70     73     73     78     Any
        //  74     76     73     78     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    public static void a(final boolean b) {
        Label_0016: {
            if (!b) {
                break Label_0016;
            }
            try {
                b.c = System.currentTimeMillis();
                if (Log.l) {
                    b.c = 0L;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
    }
    
    private static boolean a() {
        try {
            if (System.currentTimeMillis() - b.c < 1000L) {
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw ex;
        }
        return false;
    }
    
    private Bitmap b(final bi p0, final ImageView p1, final ar p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: getstatic       com/whatsapp/util/Log.l:Z
        //     5: istore          5
        //     7: aload_1        
        //     8: invokevirtual   com/whatsapp/protocol/bi.a:()Z
        //    11: istore          7
        //    13: iload           7
        //    15: ifne            38
        //    18: aconst_null    
        //    19: astore          8
        //    21: aload_0        
        //    22: monitorexit    
        //    23: aload           8
        //    25: areturn        
        //    26: astore          6
        //    28: aload           6
        //    30: athrow         
        //    31: astore          4
        //    33: aload_0        
        //    34: monitorexit    
        //    35: aload           4
        //    37: athrow         
        //    38: aload_0        
        //    39: getfield        com/whatsapp/util/b.f:Landroid/support/v4/util/LruCache;
        //    42: aload_1        
        //    43: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    46: invokevirtual   android/support/v4/util/LruCache.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    49: checkcast       Landroid/graphics/Bitmap;
        //    52: astore          8
        //    54: aload           8
        //    56: ifnull          71
        //    59: aload           8
        //    61: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //    64: istore          51
        //    66: iload           51
        //    68: ifeq            381
        //    71: aload           8
        //    73: ifnull          96
        //    76: aload           8
        //    78: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //    81: istore          48
        //    83: iload           48
        //    85: ifeq            96
        //    88: getstatic       com/whatsapp/util/b.z:[Ljava/lang/String;
        //    91: iconst_4       
        //    92: aaload         
        //    93: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    96: aload_0        
        //    97: getfield        com/whatsapp/util/b.a:Ljava/util/HashMap;
        //   100: aload_1        
        //   101: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   104: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   107: checkcast       Ljava/lang/ref/SoftReference;
        //   110: astore          9
        //   112: aload           9
        //   114: ifnull          747
        //   117: aload           9
        //   119: invokevirtual   java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        //   122: checkcast       Landroid/graphics/Bitmap;
        //   125: astore          10
        //   127: aload           10
        //   129: ifnull          144
        //   132: aload           10
        //   134: invokevirtual   android/graphics/Bitmap.isRecycled:()Z
        //   137: istore          45
        //   139: iload           45
        //   141: ifeq            740
        //   144: aload           9
        //   146: ifnull          161
        //   149: aload_0        
        //   150: getfield        com/whatsapp/util/b.a:Ljava/util/HashMap;
        //   153: aload_1        
        //   154: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   157: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   160: pop            
        //   161: aload_1        
        //   162: getfield        com/whatsapp/protocol/bi.n:I
        //   165: ifne            608
        //   168: aload_1        
        //   169: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   172: astore          39
        //   174: aload           39
        //   176: ifnull          734
        //   179: aload_1        
        //   180: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   183: invokevirtual   java/lang/String.length:()I
        //   186: istore          40
        //   188: iload           40
        //   190: ifle            734
        //   193: aload_1        
        //   194: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   197: iconst_0       
        //   198: invokestatic    android/backport/util/Base64.decode:(Ljava/lang/String;I)[B
        //   201: astore          29
        //   203: aload           29
        //   205: ifnull          728
        //   208: aload           29
        //   210: iconst_0       
        //   211: aload           29
        //   213: arraylength    
        //   214: getstatic       com/whatsapp/util/b.e:Landroid/graphics/BitmapFactory$Options;
        //   217: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   220: astore          30
        //   222: aload           30
        //   224: astore          12
        //   226: aload           12
        //   228: ifnull          601
        //   231: aload_3        
        //   232: ifnull          721
        //   235: aload_1        
        //   236: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   239: checkcast       Lcom/whatsapp/MediaData;
        //   242: astore          36
        //   244: aload           36
        //   246: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   249: ifnull          267
        //   252: aload           36
        //   254: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   257: invokevirtual   java/io/File.exists:()Z
        //   260: istore          38
        //   262: iload           38
        //   264: ifne            721
        //   267: aload           12
        //   269: iconst_1       
        //   270: iconst_2       
        //   271: invokestatic    com/whatsapp/util/v.a:(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
        //   274: astore          8
        //   276: aload           12
        //   278: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   281: aload_0        
        //   282: getfield        com/whatsapp/util/b.f:Landroid/support/v4/util/LruCache;
        //   285: aload_1        
        //   286: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   289: aload           8
        //   291: invokevirtual   android/support/v4/util/LruCache.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   294: pop            
        //   295: aload_0        
        //   296: getfield        com/whatsapp/util/b.k:Ljava/util/HashSet;
        //   299: aload_1        
        //   300: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   303: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   306: pop            
        //   307: aload           8
        //   309: ifnull          376
        //   312: aload_3        
        //   313: ifnull          376
        //   316: aload_0        
        //   317: aload_1        
        //   318: aload_2        
        //   319: aload_3        
        //   320: invokespecial   com/whatsapp/util/b.a:(Lcom/whatsapp/protocol/bi;Landroid/widget/ImageView;Lcom/whatsapp/util/ar;)V
        //   323: iload           5
        //   325: ifeq            376
        //   328: aload_3        
        //   329: ifnull          376
        //   332: aload_3        
        //   333: invokeinterface com/whatsapp/util/ar.a:()I
        //   338: i2f            
        //   339: fstore          22
        //   341: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //   344: getfield        com/whatsapp/vc.b:F
        //   347: fstore          23
        //   349: fload           22
        //   351: fload           23
        //   353: fdiv           
        //   354: f2i            
        //   355: istore          24
        //   357: iload           24
        //   359: iconst_2       
        //   360: aload           8
        //   362: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   365: imul           
        //   366: if_icmple       376
        //   369: aload_0        
        //   370: aload_1        
        //   371: aload_2        
        //   372: aload_3        
        //   373: invokespecial   com/whatsapp/util/b.a:(Lcom/whatsapp/protocol/bi;Landroid/widget/ImageView;Lcom/whatsapp/util/ar;)V
        //   376: iload           5
        //   378: ifeq            429
        //   381: aload_3        
        //   382: ifnull          429
        //   385: aload_3        
        //   386: invokeinterface com/whatsapp/util/ar.a:()I
        //   391: i2f            
        //   392: fstore          17
        //   394: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //   397: getfield        com/whatsapp/vc.b:F
        //   400: fstore          18
        //   402: fload           17
        //   404: fload           18
        //   406: fdiv           
        //   407: f2i            
        //   408: istore          19
        //   410: iload           19
        //   412: iconst_2       
        //   413: aload           8
        //   415: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   418: imul           
        //   419: if_icmple       429
        //   422: aload_0        
        //   423: aload_1        
        //   424: aload_2        
        //   425: aload_3        
        //   426: invokespecial   com/whatsapp/util/b.a:(Lcom/whatsapp/protocol/bi;Landroid/widget/ImageView;Lcom/whatsapp/util/ar;)V
        //   429: aload_3        
        //   430: ifnull          21
        //   433: aload_3        
        //   434: aload_2        
        //   435: aload           8
        //   437: aload_1        
        //   438: invokeinterface com/whatsapp/util/ar.a:(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Lcom/whatsapp/protocol/bi;)V
        //   443: goto            21
        //   446: astore          16
        //   448: aload           16
        //   450: athrow         
        //   451: astore          49
        //   453: aload           49
        //   455: athrow         
        //   456: astore          50
        //   458: aload           50
        //   460: athrow         
        //   461: astore          46
        //   463: aload           46
        //   465: athrow         
        //   466: astore          47
        //   468: aload           47
        //   470: athrow         
        //   471: astore          43
        //   473: aload           43
        //   475: athrow         
        //   476: astore          44
        //   478: aload           44
        //   480: athrow         
        //   481: astore          41
        //   483: aload           41
        //   485: athrow         
        //   486: astore          26
        //   488: aload           26
        //   490: athrow         
        //   491: astore          27
        //   493: aload           27
        //   495: athrow         
        //   496: astore          11
        //   498: aconst_null    
        //   499: astore          12
        //   501: new             Ljava/lang/StringBuilder;
        //   504: dup            
        //   505: invokespecial   java/lang/StringBuilder.<init>:()V
        //   508: getstatic       com/whatsapp/util/b.z:[Ljava/lang/String;
        //   511: iconst_3       
        //   512: aaload         
        //   513: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   516: aload_1        
        //   517: getfield        com/whatsapp/protocol/bi.n:I
        //   520: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   523: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   526: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   529: aload_1        
        //   530: getfield        com/whatsapp/protocol/bi.n:I
        //   533: istore          15
        //   535: iload           15
        //   537: ifne            591
        //   540: aload_1        
        //   541: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   544: ifnull          591
        //   547: new             Ljava/lang/StringBuilder;
        //   550: dup            
        //   551: invokespecial   java/lang/StringBuilder.<init>:()V
        //   554: getstatic       com/whatsapp/util/b.z:[Ljava/lang/String;
        //   557: iconst_1       
        //   558: aaload         
        //   559: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   562: aload_1        
        //   563: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   566: iconst_0       
        //   567: bipush          100
        //   569: aload_1        
        //   570: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   573: invokevirtual   java/lang/String.length:()I
        //   576: invokestatic    java/lang/Math.min:(II)I
        //   579: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   585: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   588: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   591: getstatic       com/whatsapp/util/b.z:[Ljava/lang/String;
        //   594: iconst_2       
        //   595: aaload         
        //   596: aload           11
        //   598: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   601: aload           12
        //   603: astore          8
        //   605: goto            307
        //   608: aload_1        
        //   609: invokevirtual   com/whatsapp/protocol/bi.d:()[B
        //   612: astore          28
        //   614: aload           28
        //   616: astore          29
        //   618: goto            203
        //   621: astore          37
        //   623: aload           37
        //   625: athrow         
        //   626: astore          11
        //   628: goto            501
        //   631: astore          13
        //   633: aload           13
        //   635: athrow         
        //   636: astore          14
        //   638: aload           14
        //   640: athrow         
        //   641: astore          21
        //   643: aload           21
        //   645: athrow         
        //   646: astore          25
        //   648: aload           25
        //   650: athrow         
        //   651: astore          20
        //   653: aload           20
        //   655: athrow         
        //   656: astore          33
        //   658: aload           8
        //   660: astore          12
        //   662: aload           33
        //   664: astore          11
        //   666: goto            501
        //   669: astore          11
        //   671: aconst_null    
        //   672: astore          12
        //   674: goto            501
        //   677: astore          11
        //   679: goto            501
        //   682: astore          32
        //   684: aload           8
        //   686: astore          12
        //   688: aload           32
        //   690: astore          11
        //   692: goto            501
        //   695: astore          11
        //   697: aconst_null    
        //   698: astore          12
        //   700: goto            501
        //   703: astore          11
        //   705: goto            501
        //   708: astore          31
        //   710: aload           8
        //   712: astore          12
        //   714: aload           31
        //   716: astore          11
        //   718: goto            501
        //   721: aload           12
        //   723: astore          8
        //   725: goto            281
        //   728: aconst_null    
        //   729: astore          12
        //   731: goto            226
        //   734: aconst_null    
        //   735: astore          29
        //   737: goto            203
        //   740: aload           10
        //   742: astore          8
        //   744: goto            328
        //   747: aconst_null    
        //   748: astore          10
        //   750: goto            127
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  2      7      31     38     Any
        //  7      13     26     31     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  7      13     31     38     Any
        //  28     31     31     38     Any
        //  38     54     31     38     Any
        //  59     66     451    461    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  59     66     31     38     Any
        //  76     83     461    466    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  76     83     31     38     Any
        //  88     96     466    471    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  88     96     31     38     Any
        //  96     112    31     38     Any
        //  117    127    31     38     Any
        //  132    139    471    481    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  132    139    31     38     Any
        //  149    161    481    486    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  149    161    31     38     Any
        //  161    174    486    491    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  161    174    695    703    Ljava/lang/StringIndexOutOfBoundsException;
        //  161    174    669    677    Ljava/lang/IllegalArgumentException;
        //  161    174    31     38     Any
        //  179    188    491    496    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  179    188    695    703    Ljava/lang/StringIndexOutOfBoundsException;
        //  179    188    669    677    Ljava/lang/IllegalArgumentException;
        //  179    188    31     38     Any
        //  193    203    496    501    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  193    203    695    703    Ljava/lang/StringIndexOutOfBoundsException;
        //  193    203    669    677    Ljava/lang/IllegalArgumentException;
        //  193    203    31     38     Any
        //  208    222    496    501    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  208    222    695    703    Ljava/lang/StringIndexOutOfBoundsException;
        //  208    222    669    677    Ljava/lang/IllegalArgumentException;
        //  208    222    31     38     Any
        //  235    244    626    631    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  235    244    703    708    Ljava/lang/StringIndexOutOfBoundsException;
        //  235    244    677    682    Ljava/lang/IllegalArgumentException;
        //  235    244    31     38     Any
        //  244    262    621    626    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  244    262    703    708    Ljava/lang/StringIndexOutOfBoundsException;
        //  244    262    677    682    Ljava/lang/IllegalArgumentException;
        //  244    262    31     38     Any
        //  267    281    626    631    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  267    281    703    708    Ljava/lang/StringIndexOutOfBoundsException;
        //  267    281    677    682    Ljava/lang/IllegalArgumentException;
        //  267    281    31     38     Any
        //  281    307    656    669    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  281    307    708    721    Ljava/lang/StringIndexOutOfBoundsException;
        //  281    307    682    695    Ljava/lang/IllegalArgumentException;
        //  281    307    31     38     Any
        //  316    323    641    646    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  316    323    31     38     Any
        //  332    349    31     38     Any
        //  357    376    646    651    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  357    376    31     38     Any
        //  385    402    31     38     Any
        //  410    429    651    656    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  410    429    31     38     Any
        //  433    443    446    451    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  433    443    31     38     Any
        //  448    451    31     38     Any
        //  453    456    456    461    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  453    456    31     38     Any
        //  458    461    461    466    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  458    461    31     38     Any
        //  463    466    466    471    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  463    466    31     38     Any
        //  468    471    31     38     Any
        //  473    476    476    481    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  473    476    31     38     Any
        //  478    481    481    486    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  478    481    31     38     Any
        //  483    486    31     38     Any
        //  488    491    491    496    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  488    491    695    703    Ljava/lang/StringIndexOutOfBoundsException;
        //  488    491    669    677    Ljava/lang/IllegalArgumentException;
        //  488    491    31     38     Any
        //  493    496    496    501    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  493    496    695    703    Ljava/lang/StringIndexOutOfBoundsException;
        //  493    496    669    677    Ljava/lang/IllegalArgumentException;
        //  493    496    31     38     Any
        //  501    535    631    636    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  501    535    31     38     Any
        //  540    591    636    641    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  540    591    31     38     Any
        //  591    601    31     38     Any
        //  608    614    496    501    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  608    614    695    703    Ljava/lang/StringIndexOutOfBoundsException;
        //  608    614    669    677    Ljava/lang/IllegalArgumentException;
        //  608    614    31     38     Any
        //  623    626    626    631    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  623    626    703    708    Ljava/lang/StringIndexOutOfBoundsException;
        //  623    626    677    682    Ljava/lang/IllegalArgumentException;
        //  623    626    31     38     Any
        //  633    636    636    641    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  633    636    31     38     Any
        //  638    641    31     38     Any
        //  643    646    31     38     Any
        //  648    651    31     38     Any
        //  653    656    31     38     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 365, Size: 365
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
    
    static HashSet b(final b b) {
        return b.k;
    }
    
    private void b(final bi bi) {
        synchronized (this) {
            this.f.remove(bi.a);
            this.k.remove(bi.a);
            this.a.remove(bi.a);
        }
    }
    
    private void b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: getstatic       com/whatsapp/util/Log.l:Z
        //     5: istore_3       
        //     6: aload_1        
        //     7: ifnonnull       13
        //    10: aload_0        
        //    11: monitorexit    
        //    12: return         
        //    13: new             Ljava/util/HashSet;
        //    16: dup            
        //    17: invokespecial   java/util/HashSet.<init>:()V
        //    20: astore          4
        //    22: aload_0        
        //    23: getfield        com/whatsapp/util/b.k:Ljava/util/HashSet;
        //    26: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //    29: astore          5
        //    31: aload           5
        //    33: invokeinterface java/util/Iterator.hasNext:()Z
        //    38: ifeq            110
        //    41: aload           5
        //    43: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    48: checkcast       Lcom/whatsapp/protocol/c6;
        //    51: astore          11
        //    53: aload_1        
        //    54: aload           11
        //    56: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    59: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    62: ifeq            229
        //    65: aload_0        
        //    66: getfield        com/whatsapp/util/b.f:Landroid/support/v4/util/LruCache;
        //    69: aload           11
        //    71: invokevirtual   android/support/v4/util/LruCache.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    74: checkcast       Landroid/graphics/Bitmap;
        //    77: astore          12
        //    79: aload           12
        //    81: ifnull          89
        //    84: aload           12
        //    86: invokevirtual   android/graphics/Bitmap.recycle:()V
        //    89: aload_0        
        //    90: getfield        com/whatsapp/util/b.f:Landroid/support/v4/util/LruCache;
        //    93: aload           11
        //    95: invokevirtual   android/support/v4/util/LruCache.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    98: pop            
        //    99: aload           4
        //   101: aload           11
        //   103: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   106: pop            
        //   107: goto            229
        //   110: aload_0        
        //   111: getfield        com/whatsapp/util/b.k:Ljava/util/HashSet;
        //   114: aload           4
        //   116: invokevirtual   java/util/HashSet.removeAll:(Ljava/util/Collection;)Z
        //   119: pop            
        //   120: aload_0        
        //   121: getfield        com/whatsapp/util/b.a:Ljava/util/HashMap;
        //   124: invokevirtual   java/util/HashMap.entrySet:()Ljava/util/Set;
        //   127: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   132: astore          7
        //   134: aload           7
        //   136: invokeinterface java/util/Iterator.hasNext:()Z
        //   141: ifeq            10
        //   144: aload           7
        //   146: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   151: checkcast       Ljava/util/Map$Entry;
        //   154: astore          8
        //   156: aload_1        
        //   157: aload           8
        //   159: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   164: checkcast       Lcom/whatsapp/protocol/c6;
        //   167: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   170: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   173: ifeq            236
        //   176: aload           8
        //   178: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   183: checkcast       Ljava/lang/ref/SoftReference;
        //   186: invokevirtual   java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        //   189: checkcast       Landroid/graphics/Bitmap;
        //   192: astore          9
        //   194: aload           9
        //   196: ifnull          204
        //   199: aload           9
        //   201: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   204: aload           7
        //   206: invokeinterface java/util/Iterator.remove:()V
        //   211: goto            236
        //   214: astore          15
        //   216: aload           15
        //   218: athrow         
        //   219: astore_2       
        //   220: aload_0        
        //   221: monitorexit    
        //   222: aload_2        
        //   223: athrow         
        //   224: astore          10
        //   226: aload           10
        //   228: athrow         
        //   229: iload_3        
        //   230: ifeq            31
        //   233: goto            110
        //   236: iload_3        
        //   237: ifeq            134
        //   240: goto            10
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  2      6      219    224    Any
        //  13     31     219    224    Any
        //  31     79     219    224    Any
        //  84     89     214    219    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  84     89     219    224    Any
        //  89     107    219    224    Any
        //  110    134    219    224    Any
        //  134    194    219    224    Any
        //  199    204    224    229    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  199    204    219    224    Any
        //  204    211    219    224    Any
        //  216    219    219    224    Any
        //  226    229    219    224    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0204:
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
    
    static boolean b() {
        return a();
    }
    
    static Handler c(final b b) {
        return b.d;
    }
    
    public static void c(final bi bi) {
        b.h.b(bi);
    }
    
    public static void c(final bi p0, final ImageView p1, final ar p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnull          12
        //     4: aload_1        
        //     5: aload_0        
        //     6: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //     9: invokevirtual   android/widget/ImageView.setTag:(Ljava/lang/Object;)V
        //    12: getstatic       com/whatsapp/util/b.h:Lcom/whatsapp/util/b;
        //    15: astore          4
        //    17: aload_2        
        //    18: ifnonnull       25
        //    21: getstatic       com/whatsapp/util/b.g:Lcom/whatsapp/util/ar;
        //    24: astore_2       
        //    25: aload           4
        //    27: aload_0        
        //    28: aload_1        
        //    29: aload_2        
        //    30: invokespecial   com/whatsapp/util/b.b:(Lcom/whatsapp/protocol/bi;Landroid/widget/ImageView;Lcom/whatsapp/util/ar;)Landroid/graphics/Bitmap;
        //    33: pop            
        //    34: return         
        //    35: astore          6
        //    37: aload           6
        //    39: athrow         
        //    40: astore_3       
        //    41: aload_3        
        //    42: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  4      12     35     40     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  12     17     40     43     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  21     25     40     43     Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0012:
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
    
    public static void c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/b.h:Lcom/whatsapp/util/b;
        //     3: astore_1       
        //     4: aload_1        
        //     5: monitorenter   
        //     6: getstatic       com/whatsapp/util/b.j:Ljava/util/HashMap;
        //     9: aload_0        
        //    10: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    13: checkcast       Ljava/lang/Integer;
        //    16: astore_3       
        //    17: aload_3        
        //    18: ifnull          75
        //    21: aload_3        
        //    22: invokevirtual   java/lang/Integer.intValue:()I
        //    25: istore          7
        //    27: iload           7
        //    29: iconst_1       
        //    30: if_icmpne       58
        //    33: getstatic       com/whatsapp/util/b.j:Ljava/util/HashMap;
        //    36: aload_0        
        //    37: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    40: pop            
        //    41: getstatic       com/whatsapp/util/b.h:Lcom/whatsapp/util/b;
        //    44: aload_0        
        //    45: invokespecial   com/whatsapp/util/b.b:(Ljava/lang/String;)V
        //    48: getstatic       com/whatsapp/util/Log.l:Z
        //    51: istore          10
        //    53: iload           10
        //    55: ifeq            75
        //    58: getstatic       com/whatsapp/util/b.j:Ljava/util/HashMap;
        //    61: aload_0        
        //    62: iconst_m1      
        //    63: aload_3        
        //    64: invokevirtual   java/lang/Integer.intValue:()I
        //    67: iadd           
        //    68: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    71: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    74: pop            
        //    75: aload_1        
        //    76: monitorexit    
        //    77: return         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    83: astore          5
        //    85: aload           5
        //    87: athrow         
        //    88: astore          6
        //    90: aload           6
        //    92: athrow         
        //    93: astore_2       
        //    94: aload_1        
        //    95: monitorexit    
        //    96: aload_2        
        //    97: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  6      17     93     98     Any
        //  21     27     78     83     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  21     27     93     98     Any
        //  33     53     83     88     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  33     53     93     98     Any
        //  58     75     88     93     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  58     75     93     98     Any
        //  75     77     93     98     Any
        //  80     83     83     88     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  80     83     93     98     Any
        //  85     88     88     93     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  85     88     93     98     Any
        //  90     93     93     98     Any
        //  94     96     93     98     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 54, Size: 54
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
    
    static LruCache d(final b b) {
        return b.f;
    }
    
    static cs e(final b b) {
        return b.b;
    }
}
