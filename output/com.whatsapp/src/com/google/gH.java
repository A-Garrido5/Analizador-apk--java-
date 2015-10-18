// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class gH extends gj
{
    private final gP[] b;
    
    public gH(final Map map) {
        Collection collection;
        if (map == null) {
            collection = null;
        }
        else {
            collection = map.get(bj.POSSIBLE_FORMATS);
        }
        final ArrayList<g9> list = new ArrayList<g9>();
        if (collection != null) {
            Label_0080: {
                if (collection.contains(d3.EAN_13)) {
                    list.add(new g9());
                    if (!gj.a) {
                        break Label_0080;
                    }
                }
                if (collection.contains(d3.UPC_A)) {
                    list.add((g9)new gb());
                }
            }
            if (collection.contains(d3.EAN_8)) {
                list.add((g9)new gL());
            }
            if (collection.contains(d3.UPC_E)) {
                list.add((g9)new gK());
            }
        }
        if (list.isEmpty()) {
            list.add(new g9());
            list.add((g9)new gL());
            list.add((g9)new gK());
        }
        this.b = list.toArray(new gP[list.size()]);
    }
    
    @Override
    public aU a(final int p0, final hN p1, final Map p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: invokestatic    com/google/gP.a:(Lcom/google/hN;)[I
        //     4: astore          4
        //     6: aload_0        
        //     7: getfield        com/google/gH.b:[Lcom/google/gP;
        //    10: astore          5
        //    12: aload           5
        //    14: arraylength    
        //    15: istore          6
        //    17: iconst_0       
        //    18: istore          7
        //    20: iload           7
        //    22: iload           6
        //    24: if_icmpge       227
        //    27: aload           5
        //    29: iload           7
        //    31: aaload         
        //    32: astore          8
        //    34: aload           8
        //    36: iload_1        
        //    37: aload_2        
        //    38: aload           4
        //    40: aload_3        
        //    41: invokevirtual   com/google/gP.a:(ILcom/google/hN;[ILjava/util/Map;)Lcom/google/aU;
        //    44: astore          10
        //    46: aload           10
        //    48: invokevirtual   com/google/aU.e:()Lcom/google/d3;
        //    51: astore          13
        //    53: getstatic       com/google/d3.EAN_13:Lcom/google/d3;
        //    56: astore          14
        //    58: aload           13
        //    60: aload           14
        //    62: if_acmpne       185
        //    65: aload           10
        //    67: invokevirtual   com/google/aU.a:()Ljava/lang/String;
        //    70: iconst_0       
        //    71: invokevirtual   java/lang/String.charAt:(I)C
        //    74: istore          21
        //    76: iload           21
        //    78: bipush          48
        //    80: if_icmpne       185
        //    83: iconst_1       
        //    84: istore          15
        //    86: aload_3        
        //    87: ifnonnull       191
        //    90: aconst_null    
        //    91: astore          16
        //    93: aload           16
        //    95: ifnull          118
        //    98: aload           16
        //   100: getstatic       com/google/d3.UPC_A:Lcom/google/d3;
        //   103: invokeinterface java/util/Collection.contains:(Ljava/lang/Object;)Z
        //   108: istore          20
        //   110: iconst_0       
        //   111: istore          17
        //   113: iload           20
        //   115: ifeq            121
        //   118: iconst_1       
        //   119: istore          17
        //   121: iload           15
        //   123: ifeq            213
        //   126: iload           17
        //   128: ifeq            213
        //   131: new             Lcom/google/aU;
        //   134: dup            
        //   135: aload           10
        //   137: invokevirtual   com/google/aU.a:()Ljava/lang/String;
        //   140: iconst_1       
        //   141: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   144: aload           10
        //   146: invokevirtual   com/google/aU.b:()[B
        //   149: aload           10
        //   151: invokevirtual   com/google/aU.c:()[Lcom/google/cs;
        //   154: getstatic       com/google/d3.UPC_A:Lcom/google/d3;
        //   157: invokespecial   com/google/aU.<init>:(Ljava/lang/String;[B[Lcom/google/cs;Lcom/google/d3;)V
        //   160: astore          18
        //   162: aload           18
        //   164: aload           10
        //   166: invokevirtual   com/google/aU.d:()Ljava/util/Map;
        //   169: invokevirtual   com/google/aU.a:(Ljava/util/Map;)V
        //   172: aload           18
        //   174: areturn        
        //   175: astore          11
        //   177: aload           11
        //   179: athrow         
        //   180: astore          12
        //   182: aload           12
        //   184: athrow         
        //   185: iconst_0       
        //   186: istore          15
        //   188: goto            86
        //   191: aload_3        
        //   192: getstatic       com/google/bj.POSSIBLE_FORMATS:Lcom/google/bj;
        //   195: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   200: checkcast       Ljava/util/Collection;
        //   203: astore          16
        //   205: goto            93
        //   208: astore          19
        //   210: aload           19
        //   212: athrow         
        //   213: aload           10
        //   215: areturn        
        //   216: astore          9
        //   218: iinc            7, 1
        //   221: getstatic       com/google/gj.a:Z
        //   224: ifeq            20
        //   227: invokestatic    com/google/fv.a:()Lcom/google/fv;
        //   230: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  34     46     216    227    Lcom/google/fN;
        //  46     58     175    180    Lcom/google/fN;
        //  65     76     180    185    Lcom/google/fN;
        //  98     110    208    213    Lcom/google/fN;
        //  177    180    180    185    Lcom/google/fN;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 108, Size: 108
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    public void a() {
        final boolean a = gj.a;
        final gP[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            b[i].a();
            ++i;
            if (a) {
                break;
            }
        }
    }
}
