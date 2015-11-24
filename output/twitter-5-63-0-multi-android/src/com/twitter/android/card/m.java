// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.CardDebugLog;
import com.twitter.internal.network.l;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import com.twitter.internal.network.j;

public class m implements j
{
    public HashMap a;
    private final WeakReference b;
    private final String c;
    
    public m(final WeakReference b, final String c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final int p0, final InputStream p1, final int p2, final String p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          6
        //     3: invokestatic    com/twitter/library/card/CardDebugLog.e:()Z
        //     6: ifeq            353
        //     9: new             Ljava/io/BufferedInputStream;
        //    12: dup            
        //    13: aload_2        
        //    14: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    17: astore          7
        //    19: aload           7
        //    21: sipush          1024
        //    24: invokevirtual   java/io/BufferedInputStream.mark:(I)V
        //    27: new             Ljava/io/InputStreamReader;
        //    30: dup            
        //    31: aload           7
        //    33: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    36: astore          8
        //    38: sipush          1024
        //    41: newarray        C
        //    43: astore          9
        //    45: new             Ljava/lang/String;
        //    48: dup            
        //    49: aload           9
        //    51: iconst_0       
        //    52: aload           8
        //    54: aload           9
        //    56: iconst_0       
        //    57: sipush          1024
        //    60: invokevirtual   java/io/InputStreamReader.read:([CII)I
        //    63: invokespecial   java/lang/String.<init>:([CII)V
        //    66: astore          10
        //    68: aload           7
        //    70: invokevirtual   java/io/BufferedInputStream.reset:()V
        //    73: aload           7
        //    75: astore_2       
        //    76: aload           10
        //    78: astore          11
        //    80: iload_1        
        //    81: sipush          200
        //    84: if_icmpeq       94
        //    87: iload_1        
        //    88: sipush          400
        //    91: if_icmplt       321
        //    94: aload           4
        //    96: ldc             "application/json"
        //    98: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   101: ifne            110
        //   104: ldc             "Expecting JSON content in API response"
        //   106: aconst_null    
        //   107: invokestatic    com/twitter/library/card/CardDebugLog.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   110: ldc             ""
        //   112: astore          12
        //   114: aload_2        
        //   115: invokestatic    com/twitter/library/api/bh.a:(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
        //   118: astore          6
        //   120: new             Lcom/twitter/library/card/instance/a;
        //   123: dup            
        //   124: invokespecial   com/twitter/library/card/instance/a.<init>:()V
        //   127: astore          18
        //   129: aload           18
        //   131: aload           6
        //   133: invokevirtual   com/twitter/library/card/instance/a.a:(Lcom/fasterxml/jackson/core/JsonParser;)Z
        //   136: ifeq            277
        //   139: aload_0        
        //   140: aload           18
        //   142: invokevirtual   com/twitter/library/card/instance/a.b:()Ljava/util/HashMap;
        //   145: putfield        com/twitter/android/card/m.a:Ljava/util/HashMap;
        //   148: new             Ljava/lang/StringBuilder;
        //   151: dup            
        //   152: invokespecial   java/lang/StringBuilder.<init>:()V
        //   155: aload_0        
        //   156: getfield        com/twitter/android/card/m.c:Ljava/lang/String;
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: ldc             " : parsed successfully"
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   170: aload           11
        //   172: invokestatic    com/twitter/library/card/CardDebugLog.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   175: iconst_1       
        //   176: istore          16
        //   178: aload           6
        //   180: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   183: iload           16
        //   185: ifne            250
        //   188: aload_0        
        //   189: getfield        com/twitter/android/card/m.b:Ljava/lang/ref/WeakReference;
        //   192: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //   195: checkcast       Lcom/twitter/android/card/n;
        //   198: astore          17
        //   200: aload           17
        //   202: ifnull          218
        //   205: aload           17
        //   207: aload_0        
        //   208: getfield        com/twitter/android/card/m.c:Ljava/lang/String;
        //   211: aload           12
        //   213: invokeinterface com/twitter/android/card/n.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   218: new             Ljava/lang/StringBuilder;
        //   221: dup            
        //   222: invokespecial   java/lang/StringBuilder.<init>:()V
        //   225: aload_0        
        //   226: getfield        com/twitter/android/card/m.c:Ljava/lang/String;
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: ldc             " : "
        //   234: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   237: aload           12
        //   239: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   242: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   245: aload           11
        //   247: invokestatic    com/twitter/library/card/CardDebugLog.d:(Ljava/lang/String;Ljava/lang/String;)V
        //   250: return         
        //   251: astore          20
        //   253: aload           7
        //   255: invokevirtual   java/io/BufferedInputStream.reset:()V
        //   258: aload           7
        //   260: astore_2       
        //   261: aconst_null    
        //   262: astore          11
        //   264: goto            80
        //   267: astore          19
        //   269: aload           7
        //   271: invokevirtual   java/io/BufferedInputStream.reset:()V
        //   274: aload           19
        //   276: athrow         
        //   277: ldc             "failed to parse"
        //   279: astore          12
        //   281: iconst_0       
        //   282: istore          16
        //   284: goto            178
        //   287: astore          14
        //   289: aload           14
        //   291: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   294: astore          15
        //   296: aload           15
        //   298: astore          12
        //   300: aload           6
        //   302: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   305: iconst_0       
        //   306: istore          16
        //   308: goto            183
        //   311: astore          13
        //   313: aload           6
        //   315: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   318: aload           13
        //   320: athrow         
        //   321: new             Ljava/lang/StringBuilder;
        //   324: dup            
        //   325: invokespecial   java/lang/StringBuilder.<init>:()V
        //   328: aload_0        
        //   329: getfield        com/twitter/android/card/m.c:Ljava/lang/String;
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   335: ldc             " : "
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   340: iload_1        
        //   341: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   344: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   347: aload           11
        //   349: invokestatic    com/twitter/library/card/CardDebugLog.d:(Ljava/lang/String;Ljava/lang/String;)V
        //   352: return         
        //   353: aconst_null    
        //   354: astore          11
        //   356: goto            80
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  45     68     251    267    Ljava/io/IOException;
        //  45     68     267    277    Any
        //  114    175    287    311    Ljava/io/IOException;
        //  114    175    311    321    Any
        //  289    296    311    321    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0178:
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
    
    @Override
    public void a(final l l) {
        final n n = (n)this.b.get();
        if (n != null) {
            n.a(this.c, l.a + " - " + l.b);
        }
        CardDebugLog.d(this.c + " : " + l.a + " - " + l.b, null);
    }
}
