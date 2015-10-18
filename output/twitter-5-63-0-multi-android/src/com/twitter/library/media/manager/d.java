// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.io.File;

class d implements f
{
    @Override
    public Object b(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileInputStream;
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //     8: astore_2       
        //     9: new             Ljava/io/ObjectInputStream;
        //    12: dup            
        //    13: aload_2        
        //    14: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    17: astore_3       
        //    18: aload_3        
        //    19: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    22: astore          6
        //    24: aload_3        
        //    25: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    28: aload_2        
        //    29: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    32: aload           6
        //    34: areturn        
        //    35: astore          4
        //    37: aconst_null    
        //    38: astore_3       
        //    39: aconst_null    
        //    40: astore_2       
        //    41: aload           4
        //    43: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    46: aload_3        
        //    47: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    50: aload_2        
        //    51: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    54: aconst_null    
        //    55: areturn        
        //    56: astore          8
        //    58: aconst_null    
        //    59: astore_3       
        //    60: aconst_null    
        //    61: astore_2       
        //    62: aload           8
        //    64: astore          5
        //    66: aload_3        
        //    67: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    70: aload_2        
        //    71: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    74: aload           5
        //    76: athrow         
        //    77: astore          7
        //    79: aload           7
        //    81: astore          5
        //    83: aconst_null    
        //    84: astore_3       
        //    85: goto            66
        //    88: astore          5
        //    90: goto            66
        //    93: astore          4
        //    95: aconst_null    
        //    96: astore_3       
        //    97: goto            41
        //   100: astore          4
        //   102: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      9      35     41     Ljava/lang/ClassNotFoundException;
        //  0      9      56     66     Any
        //  9      18     93     100    Ljava/lang/ClassNotFoundException;
        //  9      18     77     88     Any
        //  18     24     100    105    Ljava/lang/ClassNotFoundException;
        //  18     24     88     93     Any
        //  41     46     88     93     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
}
