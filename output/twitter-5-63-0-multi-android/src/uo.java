import android.os.AsyncTask$Status;
import android.support.v4.util.LruCache;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.5.30
// 

class uo extends AsyncTask
{
    final /* synthetic */ un a;
    private String b;
    
    uo(final un a) {
        this.a = a;
    }
    
    private boolean a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/net/URL;
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //     8: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    11: checkcast       Ljava/net/HttpURLConnection;
        //    14: astore          4
        //    16: aload           4
        //    18: iconst_0       
        //    19: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //    22: aload           4
        //    24: invokevirtual   java/net/HttpURLConnection.connect:()V
        //    27: aload           4
        //    29: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    32: istore          6
        //    34: iload           6
        //    36: sipush          301
        //    39: if_icmpeq       50
        //    42: iload           6
        //    44: sipush          302
        //    47: if_icmpne       87
        //    50: iconst_1       
        //    51: istore          7
        //    53: aload           4
        //    55: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    58: iload           7
        //    60: ireturn        
        //    61: astore          5
        //    63: aload           4
        //    65: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    68: aload           5
        //    70: athrow         
        //    71: astore_3       
        //    72: iconst_0       
        //    73: ireturn        
        //    74: astore          9
        //    76: iload           7
        //    78: ireturn        
        //    79: astore_2       
        //    80: iconst_0       
        //    81: ireturn        
        //    82: astore          8
        //    84: iload           7
        //    86: ireturn        
        //    87: iconst_0       
        //    88: istore          7
        //    90: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      16     71     74     Ljava/io/IOException;
        //  0      16     79     82     Ljava/lang/NullPointerException;
        //  16     34     61     71     Any
        //  53     58     74     79     Ljava/io/IOException;
        //  53     58     82     87     Ljava/lang/NullPointerException;
        //  63     71     71     74     Ljava/io/IOException;
        //  63     71     79     82     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    protected Boolean a(final String... array) {
        if (array != null && array.length > 0) {
            this.b = array[0];
            return this.a(this.b);
        }
        return null;
    }
    
    protected final void a(final Boolean b) {
        un.a.put(this.b, b);
        this.a.a(this.b, b);
    }
}
