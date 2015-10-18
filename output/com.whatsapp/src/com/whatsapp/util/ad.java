// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.os.Build$VERSION;
import java.io.File;

public class ad
{
    private static final String[] z;
    private final File a;
    
    static {
        final String[] z2 = new String[11];
        String s = "\u007f|A\u0011\b mP\u001d\u0003p";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = 'P';
                        break;
                    }
                    case 1: {
                        c2 = '\u0019';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u007f\u007fK\u0017\b\u000fjI\u0013\u000e59";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u007fmV\u0006\f<FJ\u0002\f3|\u0019";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u007flJ\u0013\u000f<|f\u0001\u001d1z\\R";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "5tI\u0006\u0014p\u007fP\u001e\bpuP\u0001\u0019p\u007fK\u001d\u0000p}P\u0000\b3mV\u0000\u0014p";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "pmV\u0006\f<9";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u007fuJR\t";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u007fuJR@";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u007fuJR\t";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\"vV\u0006M=lJ\u0006M2|\u0019\u0013M4pK\u0017\u000e$vK\u000b";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\"vV\u0006M=lJ\u0006M>vMR\u000f59W\u0007\u0001<";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ad(final File a) {
        if (a == null) {
            throw new NullPointerException(ad.z[10]);
        }
        try {
            if (!a.isDirectory()) {
                throw new IllegalArgumentException(ad.z[9]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        this.a = a;
    }
    
    private static long a(final int n, final String s, final File file) {
        final boolean l = Log.l;
        final String a = a(file);
        if (file.isDirectory()) {
            Log.b(n, s + ad.z[6] + a + ' ' + file.getAbsolutePath());
            final File[] listFiles = file.listFiles();
            if (listFiles == null) {
                try {
                    throw new IllegalStateException(ad.z[4] + file);
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
            final int length = listFiles.length;
            long n2 = 0L;
            int i = 0;
            while (i < length) {
                n2 += a(n, s, listFiles[i]);
                ++i;
                if (l) {
                    break;
                }
            }
            Log.b(n, s + ad.z[8] + a + ' ' + file.getAbsolutePath() + ad.z[5] + n2);
            return n2;
        }
        Log.b(n, s + ad.z[7] + a + ' ' + file.getAbsolutePath() + ' ' + file.length());
        return file.length();
    }
    
    private static String a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_2       
        //     1: newarray        C
        //     3: dup            
        //     4: iconst_0       
        //     5: ldc             45
        //     7: castore        
        //     8: dup            
        //     9: iconst_1       
        //    10: ldc             45
        //    12: castore        
        //    13: astore_1       
        //    14: aload_0        
        //    15: invokevirtual   java/io/File.canRead:()Z
        //    18: ifeq            26
        //    21: aload_1        
        //    22: iconst_0       
        //    23: bipush          114
        //    25: castore        
        //    26: aload_0        
        //    27: invokevirtual   java/io/File.canWrite:()Z
        //    30: ifeq            38
        //    33: aload_1        
        //    34: iconst_1       
        //    35: bipush          119
        //    37: castore        
        //    38: new             Ljava/lang/String;
        //    41: dup            
        //    42: aload_1        
        //    43: invokespecial   java/lang/String.<init>:([C)V
        //    46: areturn        
        //    47: astore_2       
        //    48: aload_2        
        //    49: athrow         
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  14     26     47     50     Ljava/lang/NullPointerException;
        //  26     38     50     53     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    public static void b(final int n, final String s, final File file) {
        try {
            new ad(file).a(n, s);
        }
        catch (Exception ex) {
            Log.w(s + ad.z[0] + ex);
        }
    }
    
    public void a(final int n, final String s) {
        try {
            if (Build$VERSION.SDK_INT >= 9) {
                Log.b(n, s + ad.z[2] + this.a.getTotalSpace());
                Log.b(n, s + ad.z[3] + this.a.getUsableSpace());
                Log.b(n, s + ad.z[1] + this.a.getFreeSpace());
            }
            a(n, s, this.a);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
}
