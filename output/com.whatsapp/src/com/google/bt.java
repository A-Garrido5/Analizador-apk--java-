// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

public final class bt
{
    private final cO a;
    
    public bt() {
        this.a = new cO(gN.p);
    }
    
    private aS a(final d d, final Map map) {
        final int e = bE.e;
        final bE e2 = d.e();
        final e a = d.d().a();
        final fZ[] a2 = fZ.a(d.a(), e2, a);
        final int length = a2.length;
        int n = 0;
        int i = 0;
        while (i < length) {
            n += a2[i].a();
            ++i;
            if (e != 0) {
                break;
            }
        }
        final byte[] array = new byte[n];
        int n2 = 0;
        final int length2 = a2.length;
        int j = 0;
    Label_0169:
        while (j < length2) {
            final fZ fz = a2[j];
            final byte[] b = fz.b();
            final int a3 = fz.a();
            this.a(b, a3);
            int k = 0;
            while (true) {
                while (k < a3) {
                    final int n3 = n2 + 1;
                    array[n2] = b[k];
                    final int n4 = k + 1;
                    if (e != 0) {
                        final int n5 = j + 1;
                        if (e != 0) {
                            break Label_0169;
                        }
                        j = n5;
                        n2 = n3;
                        continue Label_0169;
                    }
                    else {
                        k = n4;
                        n2 = n3;
                    }
                }
                final int n3 = n2;
                continue;
            }
        }
        return dL.a(array, e2, a, map);
    }
    
    private void a(final byte[] array, final int n) {
        int i = 0;
        final int e = bE.e;
        final int length = array.length;
        final int[] array2 = new int[length];
        int j = 0;
        while (j < length) {
            array2[j] = (0xFF & array[j]);
            ++j;
            if (e != 0) {
                break;
            }
        }
        final int n2 = array.length - n;
        try {
            this.a.a(array2, n2);
            while (i < n) {
                array[i] = (byte)array2[i];
                ++i;
                if (e != 0) {
                    break;
                }
            }
        }
        catch (dA da) {
            throw fh.a();
        }
    }
    
    public aS a(final L p0, final Map p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/google/d;
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   com/google/d.<init>:(Lcom/google/L;)V
        //     8: astore_3       
        //     9: aload_0        
        //    10: aload_3        
        //    11: aload_2        
        //    12: invokespecial   com/google/bt.a:(Lcom/google/d;Ljava/util/Map;)Lcom/google/aS;
        //    15: astore          13
        //    17: aload           13
        //    19: areturn        
        //    20: astore          12
        //    22: aload           12
        //    24: astore          5
        //    26: aconst_null    
        //    27: astore          4
        //    29: aload_3        
        //    30: invokevirtual   com/google/d.c:()V
        //    33: aload_3        
        //    34: iconst_1       
        //    35: invokevirtual   com/google/d.a:(Z)V
        //    38: aload_3        
        //    39: invokevirtual   com/google/d.e:()Lcom/google/bE;
        //    42: pop            
        //    43: aload_3        
        //    44: invokevirtual   com/google/d.d:()Lcom/google/bH;
        //    47: pop            
        //    48: aload_3        
        //    49: invokevirtual   com/google/d.b:()V
        //    52: aload_0        
        //    53: aload_3        
        //    54: aload_2        
        //    55: invokespecial   com/google/bt.a:(Lcom/google/d;Ljava/util/Map;)Lcom/google/aS;
        //    58: astore          11
        //    60: aload           11
        //    62: new             Lcom/google/cc;
        //    65: dup            
        //    66: iconst_1       
        //    67: invokespecial   com/google/cc.<init>:(Z)V
        //    70: invokevirtual   com/google/aS.a:(Ljava/lang/Object;)V
        //    73: aload           11
        //    75: areturn        
        //    76: astore          6
        //    78: aload           5
        //    80: ifnull          99
        //    83: aload           5
        //    85: athrow         
        //    86: astore          8
        //    88: aload           8
        //    90: athrow         
        //    91: astore          4
        //    93: aconst_null    
        //    94: astore          5
        //    96: goto            29
        //    99: aload           4
        //   101: ifnull          112
        //   104: aload           4
        //   106: athrow         
        //   107: astore          7
        //   109: aload           7
        //   111: athrow         
        //   112: aload           6
        //   114: athrow         
        //   115: astore          6
        //   117: goto            78
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  9      17     20     29     Lcom/google/fD;
        //  9      17     91     99     Lcom/google/fh;
        //  29     73     76     78     Lcom/google/fD;
        //  29     73     115    120    Lcom/google/fh;
        //  83     86     86     91     Lcom/google/fD;
        //  104    107    107    112    Lcom/google/fD;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 66, Size: 66
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
