// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;

public final class b5
{
    private static final String[] z;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    
    static {
        final String[] z2 = new String[19];
        String s = "*1 |\u001c\u001a)\u0017`\u0018\u000671s\u0011\r18|\u0011U";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0507:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'y';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = 'P';
                        break;
                    }
                    case 2: {
                        c2 = 'T';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Dp$m\u000b\u000b5:|D";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Dp'k\u0018\u00045i";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Dp$d\f\u000f71lD";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "Dp8m\u000f\r<i";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u000055d\r\u0000";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u00045\"m\u0015";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "!> m\u0017\u001cp9}\n\u001cp6mY\t>0z\u0016\u00014za\u0017\u001c5:|W\t3 a\u0016\u0006~\u0016I-<\u0015\u0006Q&+\u0018\u0015F>-\u0014";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "\u001b35d\u001c";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "\t>0z\u0016\u00014za\u0017\u001c5:|W\t3 a\u0016\u0006~\u0016I-<\u0015\u0006Q&+\u0018\u0015F>-\u0014";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0018<!o\u001e\r4";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000b?8l";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u000f?;l";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u001d>?f\u0016\u001f>";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0007$<m\u000b@";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0007&1z\u0011\r1 ";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\f55l";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0007&1z&\u001e?8|\u0018\u000f5";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u001d>'x\u001c\u000b92a\u001c\f\u000f2i\u0010\u0004%&m";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    break Label_0507;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public b5(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a8p.b:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: getstatic       com/whatsapp/b5.z:[Ljava/lang/String;
        //    11: bipush          9
        //    13: aaload         
        //    14: aload_1        
        //    15: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    18: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    21: ifne            38
        //    24: new             Ljava/lang/IllegalArgumentException;
        //    27: dup            
        //    28: getstatic       com/whatsapp/b5.z:[Ljava/lang/String;
        //    31: bipush          7
        //    33: aaload         
        //    34: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    37: athrow         
        //    38: aload_0        
        //    39: aload_1        
        //    40: getstatic       com/whatsapp/b5.z:[Ljava/lang/String;
        //    43: iconst_5       
        //    44: aaload         
        //    45: iconst_1       
        //    46: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //    49: putfield        com/whatsapp/b5.c:I
        //    52: aload_0        
        //    53: aload_1        
        //    54: getstatic       com/whatsapp/b5.z:[Ljava/lang/String;
        //    57: bipush          6
        //    59: aaload         
        //    60: iconst_m1      
        //    61: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //    64: putfield        com/whatsapp/b5.b:I
        //    67: aload_0        
        //    68: aload_1        
        //    69: getstatic       com/whatsapp/b5.z:[Ljava/lang/String;
        //    72: bipush          10
        //    74: aaload         
        //    75: iconst_0       
        //    76: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //    79: putfield        com/whatsapp/b5.a:I
        //    82: aload_0        
        //    83: aload_1        
        //    84: getstatic       com/whatsapp/b5.z:[Ljava/lang/String;
        //    87: bipush          8
        //    89: aaload         
        //    90: iconst_m1      
        //    91: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //    94: putfield        com/whatsapp/b5.d:I
        //    97: iload_2        
        //    98: ifeq            119
        //   101: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   104: istore          5
        //   106: iconst_0       
        //   107: istore          6
        //   109: iload           5
        //   111: ifeq            128
        //   114: iload           6
        //   116: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   119: return         
        //   120: astore_3       
        //   121: aload_3        
        //   122: athrow         
        //   123: astore          4
        //   125: aload           4
        //   127: athrow         
        //   128: iconst_1       
        //   129: istore          6
        //   131: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  38     97     120    123    Ljava/lang/IllegalArgumentException;
        //  101    106    123    128    Ljava/lang/IllegalArgumentException;
        //  121    123    123    128    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0114:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    private String d() {
        final boolean b = a8p.b;
        Label_0152: {
            switch (this.c) {
                case 1: {
                    final String string = b5.z[13];
                    if (b) {
                        break Label_0152;
                    }
                    return string;
                }
                case 2: {
                    final String string = b5.z[12];
                    if (b) {
                        break Label_0152;
                    }
                    return string;
                }
                case 3: {
                    final String string = b5.z[15];
                    if (b) {
                        break Label_0152;
                    }
                    return string;
                }
                case 4: {
                    final String string = b5.z[16];
                    if (b) {
                        break Label_0152;
                    }
                    return string;
                }
                case 5: {
                    final String string = b5.z[17];
                    if (b) {
                        break Label_0152;
                    }
                    return string;
                }
                case 6: {
                    final String string = b5.z[18];
                    if (b) {
                        break Label_0152;
                    }
                    return string;
                }
                case 7: {
                    final String string = b5.z[11];
                    if (b) {
                        break;
                    }
                    return string;
                }
            }
        }
        return b5.z[14] + this.c + ')';
    }
    
    public double a() {
        try {
            if (this.b < 0) {
                return Double.NaN;
            }
            final b5 b5 = this;
            final int n = b5.d;
            if (n > 0) {
                final double n2 = 100.0;
                final b5 b6 = this;
                final int n3 = b6.b;
                final double n4 = n3;
                final double n5 = n2 * n4;
                final b5 b7 = this;
                final int n6 = b7.d;
                final double n7 = n6;
                return n5 / n7;
            }
            return Double.NaN;
        }
        catch (IllegalArgumentException ex) {
            try {
                throw ex;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        try {
            final b5 b5 = this;
            final int n = b5.d;
            if (n > 0) {
                final double n2 = 100.0;
                final b5 b6 = this;
                final int n3 = b6.b;
                final double n4 = n3;
                final double n5 = n2 * n4;
                final b5 b7 = this;
                final int n6 = b7.d;
                final double n7 = n6;
                return n5 / n7;
            }
        }
        catch (IllegalArgumentException ex3) {}
        return Double.NaN;
    }
    
    public boolean b() {
        try {
            if (this.a != 0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean c() {
        final double a = this.a();
        try {
            if (this.b() || (a != Double.NaN && a > 20.0)) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            try {
                throw ex;
            }
            catch (IllegalArgumentException ex2) {
                try {
                    throw ex2;
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        while (true) {
            final boolean b = a8p.b;
            while (true) {
                Label_0127: {
                    try {
                        final String string = b5.z[0] + this.d() + b5.z[4] + this.b + b5.z[3] + this.a + b5.z[2] + this.d + b5.z[1] + this.a() + '}';
                        if (DialogToastActivity.h) {
                            final boolean b2 = false;
                            if (!b) {
                                break Label_0127;
                            }
                            a8p.b = b2;
                        }
                        return string;
                    }
                    catch (IllegalArgumentException ex) {
                        try {
                            throw ex;
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                    }
                }
                final boolean b2 = true;
                continue;
            }
        }
    }
}
