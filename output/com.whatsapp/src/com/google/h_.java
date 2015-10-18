// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.InputStream;

class h_ extends InputStream
{
    private hj a;
    private w b;
    private int c;
    final hu d;
    private int e;
    private int f;
    private int g;
    
    public h_(final hu d) {
        this.d = d;
        this.a();
    }
    
    private int a(final byte[] array, final int n, final int n2) {
        final boolean b = dt.b;
        int i = n2;
        int n3 = n;
        while (i > 0) {
            try {
                this.b();
                if (this.a == null) {
                    if (i == n2) {
                        return -1;
                    }
                    break;
                }
            }
            catch (NullPointerException ex) {
                try {
                    throw ex;
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
            }
            final int min = Math.min(this.c - this.e, i);
            if (array != null) {
                this.a.b(array, this.e, n3, min);
                n3 += min;
            }
            this.e += min;
            i -= min;
            if (b) {
                break;
            }
        }
        return n2 - i;
    }
    
    private void a() {
        this.b = new w(this.d, null);
        this.a = this.b.a();
        this.c = this.a.c();
        this.e = 0;
        this.g = 0;
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/h_.a:Lcom/google/hj;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          100
        //    11: aload_0        
        //    12: getfield        com/google/h_.e:I
        //    15: istore          6
        //    17: aload_0        
        //    18: getfield        com/google/h_.c:I
        //    21: istore          7
        //    23: iload           6
        //    25: iload           7
        //    27: if_icmpne       100
        //    30: aload_0        
        //    31: aload_0        
        //    32: getfield        com/google/h_.g:I
        //    35: aload_0        
        //    36: getfield        com/google/h_.c:I
        //    39: iadd           
        //    40: putfield        com/google/h_.g:I
        //    43: aload_0        
        //    44: iconst_0       
        //    45: putfield        com/google/h_.e:I
        //    48: aload_0        
        //    49: getfield        com/google/h_.b:Lcom/google/w;
        //    52: invokevirtual   com/google/w.hasNext:()Z
        //    55: istore          8
        //    57: iload           8
        //    59: ifeq            90
        //    62: aload_0        
        //    63: aload_0        
        //    64: getfield        com/google/h_.b:Lcom/google/w;
        //    67: invokevirtual   com/google/w.a:()Lcom/google/hj;
        //    70: putfield        com/google/h_.a:Lcom/google/hj;
        //    73: aload_0        
        //    74: aload_0        
        //    75: getfield        com/google/h_.a:Lcom/google/hj;
        //    78: invokevirtual   com/google/hj.c:()I
        //    81: putfield        com/google/h_.c:I
        //    84: getstatic       com/google/dt.b:Z
        //    87: ifeq            100
        //    90: aload_0        
        //    91: aconst_null    
        //    92: putfield        com/google/h_.a:Lcom/google/hj;
        //    95: aload_0        
        //    96: iconst_0       
        //    97: putfield        com/google/h_.c:I
        //   100: return         
        //   101: astore_1       
        //   102: aload_1        
        //   103: athrow         
        //   104: astore_2       
        //   105: aload_2        
        //   106: athrow         
        //   107: astore_3       
        //   108: aload_3        
        //   109: athrow         
        //   110: astore          4
        //   112: aload           4
        //   114: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      6      101    104    Ljava/lang/NullPointerException;
        //  11     23     104    107    Ljava/lang/NullPointerException;
        //  30     57     107    110    Ljava/lang/NullPointerException;
        //  62     90     110    115    Ljava/lang/NullPointerException;
        //  90     100    110    115    Ljava/lang/NullPointerException;
        //  102    104    104    107    Ljava/lang/NullPointerException;
        //  105    107    107    110    Ljava/lang/NullPointerException;
        //  108    110    110    115    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 61, Size: 61
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
    public int available() {
        return this.d.c() - (this.g + this.e);
    }
    
    @Override
    public void mark(final int n) {
        this.f = this.g + this.e;
    }
    
    @Override
    public boolean markSupported() {
        return true;
    }
    
    @Override
    public int read() {
        try {
            this.b();
            if (this.a == null) {
                return -1;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return 0xFF & this.a.b(this.e++);
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        if (array == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        while (true) {
            if (n >= 0 && n2 >= 0) {
                try {
                    if (n2 > array.length - n) {
                        throw new IndexOutOfBoundsException();
                    }
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
                return this.a(array, n, n2);
            }
            continue;
        }
    }
    
    @Override
    public void reset() {
        synchronized (this) {
            this.a();
            this.a(null, 0, this.f);
        }
    }
    
    @Override
    public long skip(long n) {
        if (n < 0L) {
            try {
                throw new IndexOutOfBoundsException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        if (n > 2147483647L) {
            n = 2147483647L;
        }
        return this.a(null, 0, (int)n);
    }
}
