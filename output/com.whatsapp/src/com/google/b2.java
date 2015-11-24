// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.util.logging.Level;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;
import java.util.Map;

class b2
{
    private static final Map a;
    private static final Logger b;
    private static final Set c;
    private static final String z;
    
    static {
        final char[] charArray = "\u0017\u001e\tUl_\u0012\t_/]R\u000f\t{VR\u0016P,V\u0018\bM.Z\u0018\u0014Kl\\\u001c\u0012Ylh\u0015\tV&v\b\u000bZ&J<\nL&J\u0013\u0007L&~\u0012\u0014U\"L\u000e6J,L\u00129".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = 'C';
                    break;
                }
                case 0: {
                    c3 = '8';
                    break;
                }
                case 1: {
                    c3 = '}';
                    break;
                }
                case 2: {
                    c3 = 'f';
                    break;
                }
                case 3: {
                    c3 = '8';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        z = new String(charArray).intern();
        b = Logger.getLogger(b2.class.getName());
        a = Collections.synchronizedMap(new HashMap<Object, Object>());
        c = ew.a();
    }
    
    private static void a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore_1       
        //     4: ldc             Lcom/google/cw;.class
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: invokespecial   java/lang/StringBuilder.<init>:()V
        //    13: getstatic       com/google/b2.z:Ljava/lang/String;
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    19: iload_0        
        //    20: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    23: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    26: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //    29: astore_2       
        //    30: new             Ljava/io/ObjectInputStream;
        //    33: dup            
        //    34: aload_2        
        //    35: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    38: astore_3       
        //    39: new             Lcom/google/d0;
        //    42: dup            
        //    43: invokespecial   com/google/d0.<init>:()V
        //    46: astore          4
        //    48: aload           4
        //    50: aload_3        
        //    51: invokevirtual   com/google/d0.readExternal:(Ljava/io/ObjectInput;)V
        //    54: aload           4
        //    56: invokevirtual   com/google/d0.d:()Ljava/util/List;
        //    59: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    64: astore          7
        //    66: aload           7
        //    68: invokeinterface java/util/Iterator.hasNext:()Z
        //    73: ifeq            111
        //    76: aload           7
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: checkcast       Lcom/google/c0;
        //    86: astore          8
        //    88: getstatic       com/google/b2.a:Ljava/util/Map;
        //    91: aload           8
        //    93: invokevirtual   com/google/c0.K:()I
        //    96: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    99: aload           8
        //   101: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   106: pop            
        //   107: iload_1        
        //   108: ifeq            66
        //   111: aload_3        
        //   112: invokestatic    com/google/b2.a:(Ljava/io/InputStream;)V
        //   115: return         
        //   116: astore          5
        //   118: aconst_null    
        //   119: astore_3       
        //   120: getstatic       com/google/b2.b:Ljava/util/logging/Logger;
        //   123: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //   126: aload           5
        //   128: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   131: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;)V
        //   134: aload_3        
        //   135: invokestatic    com/google/b2.a:(Ljava/io/InputStream;)V
        //   138: return         
        //   139: astore          6
        //   141: aconst_null    
        //   142: astore_3       
        //   143: aload_3        
        //   144: invokestatic    com/google/b2.a:(Ljava/io/InputStream;)V
        //   147: aload           6
        //   149: athrow         
        //   150: astore          6
        //   152: goto            143
        //   155: astore          5
        //   157: goto            120
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  30     39     116    120    Ljava/io/IOException;
        //  30     39     139    143    Any
        //  39     66     155    160    Ljava/io/IOException;
        //  39     66     150    155    Any
        //  66     107    155    160    Ljava/io/IOException;
        //  66     107    150    155    Any
        //  120    134    150    155    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    
    private static void a(final InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        }
        catch (IOException ex) {
            b2.b.log(Level.WARNING, ex.toString());
        }
    }
    
    static c0 b(final int n) {
        if (!b2.c.contains(n)) {
            return null;
        }
        synchronized (b2.a) {
            if (!b2.a.containsKey(n)) {
                a(n);
            }
            // monitorexit(b2.a)
            return b2.a.get(n);
        }
    }
}
