import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.5.30
// 

class if extends AsyncTask
{
    final /* synthetic */ id a;
    
    private if(final id a) {
        this.a = a;
    }
    
    protected Integer a(final Void... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/File;
        //     3: dup            
        //     4: ldc             "/proc/cpuinfo"
        //     6: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //     9: invokevirtual   java/io/File.exists:()Z
        //    12: ifeq            167
        //    15: new             Ljava/io/BufferedReader;
        //    18: dup            
        //    19: new             Ljava/io/FileReader;
        //    22: dup            
        //    23: new             Ljava/io/File;
        //    26: dup            
        //    27: ldc             "/proc/cpuinfo"
        //    29: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    32: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //    35: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    38: astore          4
        //    40: iconst_0       
        //    41: istore          5
        //    43: iconst_0       
        //    44: istore          6
        //    46: aload           4
        //    48: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    51: astore          10
        //    53: aload           10
        //    55: ifnull          96
        //    58: invokestatic    id.a:()Ljava/util/regex/Pattern;
        //    61: aload           10
        //    63: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    66: astore          11
        //    68: aload           11
        //    70: invokevirtual   java/util/regex/Matcher.matches:()Z
        //    73: ifeq            46
        //    76: iinc            6, 1
        //    79: aload           11
        //    81: iconst_1       
        //    82: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //    85: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //    88: invokevirtual   java/lang/Integer.intValue:()I
        //    91: istore          5
        //    93: goto            46
        //    96: aload           4
        //    98: ifnull          106
        //   101: aload           4
        //   103: invokevirtual   java/io/BufferedReader.close:()V
        //   106: iload           5
        //   108: istore          12
        //   110: iload           6
        //   112: istore_2       
        //   113: iload           12
        //   115: istore_3       
        //   116: iload_3        
        //   117: iconst_1       
        //   118: iadd           
        //   119: iload_2        
        //   120: if_icmpne       146
        //   123: iload_2        
        //   124: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   127: areturn        
        //   128: astore          9
        //   130: iconst_0       
        //   131: istore_3       
        //   132: iconst_0       
        //   133: istore          8
        //   135: aload           9
        //   137: invokevirtual   java/io/IOException.printStackTrace:()V
        //   140: iload           8
        //   142: istore_2       
        //   143: goto            116
        //   146: iconst_0       
        //   147: istore_2       
        //   148: goto            123
        //   151: astore          7
        //   153: iload           6
        //   155: istore          8
        //   157: iload           5
        //   159: istore_3       
        //   160: aload           7
        //   162: astore          9
        //   164: goto            135
        //   167: iconst_0       
        //   168: istore_2       
        //   169: iconst_0       
        //   170: istore_3       
        //   171: goto            116
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  15     40     128    135    Ljava/io/IOException;
        //  46     53     151    167    Ljava/io/IOException;
        //  58     76     151    167    Ljava/io/IOException;
        //  79     93     151    167    Ljava/io/IOException;
        //  101    106    151    167    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    protected void a(final Integer n) {
        this.a.a = n;
    }
}
