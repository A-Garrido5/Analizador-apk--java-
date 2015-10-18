// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.Date;
import java.text.DateFormat;

public final class s
{
    private static final ThreadLocal a;
    private static final String[] b;
    private static final DateFormat[] c;
    
    static {
        a = new t();
        b = new String[] { "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z" };
        c = new DateFormat[s.b.length];
    }
    
    public static String a(final Date date) {
        return s.a.get().format(date);
    }
    
    public static Date a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/squareup/okhttp/internal/http/s.a:Ljava/lang/ThreadLocal;
        //     3: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //     6: checkcast       Ljava/text/DateFormat;
        //     9: aload_0        
        //    10: invokevirtual   java/text/DateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
        //    13: astore          9
        //    15: aload           9
        //    17: areturn        
        //    18: astore_1       
        //    19: getstatic       com/squareup/okhttp/internal/http/s.b:[Ljava/lang/String;
        //    22: astore_2       
        //    23: aload_2        
        //    24: monitorenter   
        //    25: getstatic       com/squareup/okhttp/internal/http/s.b:[Ljava/lang/String;
        //    28: arraylength    
        //    29: istore          4
        //    31: iconst_0       
        //    32: istore          5
        //    34: iload           5
        //    36: iload           4
        //    38: if_icmpge       106
        //    41: getstatic       com/squareup/okhttp/internal/http/s.c:[Ljava/text/DateFormat;
        //    44: iload           5
        //    46: aaload         
        //    47: astore          6
        //    49: aload           6
        //    51: ifnonnull       80
        //    54: new             Ljava/text/SimpleDateFormat;
        //    57: dup            
        //    58: getstatic       com/squareup/okhttp/internal/http/s.b:[Ljava/lang/String;
        //    61: iload           5
        //    63: aaload         
        //    64: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    67: invokespecial   java/text/SimpleDateFormat.<init>:(Ljava/lang/String;Ljava/util/Locale;)V
        //    70: astore          6
        //    72: getstatic       com/squareup/okhttp/internal/http/s.c:[Ljava/text/DateFormat;
        //    75: iload           5
        //    77: aload           6
        //    79: aastore        
        //    80: aload           6
        //    82: aload_0        
        //    83: invokevirtual   java/text/DateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
        //    86: astore          8
        //    88: aload_2        
        //    89: monitorexit    
        //    90: aload           8
        //    92: areturn        
        //    93: astore_3       
        //    94: aload_2        
        //    95: monitorexit    
        //    96: aload_3        
        //    97: athrow         
        //    98: astore          7
        //   100: iinc            5, 1
        //   103: goto            34
        //   106: aload_2        
        //   107: monitorexit    
        //   108: aconst_null    
        //   109: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  0      15     18     110    Ljava/text/ParseException;
        //  25     31     93     98     Any
        //  41     49     93     98     Any
        //  54     80     93     98     Any
        //  80     88     98     106    Ljava/text/ParseException;
        //  80     88     93     98     Any
        //  88     90     93     98     Any
        //  94     96     93     98     Any
        //  106    108    93     98     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0080:
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
}
