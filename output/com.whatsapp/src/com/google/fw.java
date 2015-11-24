// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.io.Externalizable;

public class fw implements Externalizable
{
    private static final long serialVersionUID = 1L;
    private List a;
    private boolean b;
    private boolean c;
    private String d;
    private boolean e;
    private boolean f;
    private String g;
    private String h;
    private boolean i;
    private boolean j;
    private String k;
    
    public fw() {
        this.d = "";
        this.k = "";
        this.a = new ArrayList();
        this.g = "";
        this.j = false;
        this.h = "";
    }
    
    public static f6 m() {
        return new f6();
    }
    
    public fw a(final fw p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   com/google/fw.e:()Z
        //     8: ifeq            20
        //    11: aload_0        
        //    12: aload_1        
        //    13: invokevirtual   com/google/fw.l:()Ljava/lang/String;
        //    16: invokevirtual   com/google/fw.e:(Ljava/lang/String;)Lcom/google/fw;
        //    19: pop            
        //    20: aload_1        
        //    21: invokevirtual   com/google/fw.a:()Z
        //    24: ifeq            36
        //    27: aload_0        
        //    28: aload_1        
        //    29: invokevirtual   com/google/fw.c:()Ljava/lang/String;
        //    32: invokevirtual   com/google/fw.c:(Ljava/lang/String;)Lcom/google/fw;
        //    35: pop            
        //    36: aload_1        
        //    37: invokevirtual   com/google/fw.g:()I
        //    40: istore          5
        //    42: iconst_0       
        //    43: istore          6
        //    45: iload           6
        //    47: iload           5
        //    49: if_icmpge       70
        //    52: aload_0        
        //    53: aload_1        
        //    54: iload           6
        //    56: invokevirtual   com/google/fw.a:(I)Ljava/lang/String;
        //    59: invokevirtual   com/google/fw.b:(Ljava/lang/String;)Lcom/google/fw;
        //    62: pop            
        //    63: iinc            6, 1
        //    66: iload_2        
        //    67: ifeq            45
        //    70: aload_1        
        //    71: invokevirtual   com/google/fw.h:()Z
        //    74: ifeq            86
        //    77: aload_0        
        //    78: aload_1        
        //    79: invokevirtual   com/google/fw.b:()Ljava/lang/String;
        //    82: invokevirtual   com/google/fw.a:(Ljava/lang/String;)Lcom/google/fw;
        //    85: pop            
        //    86: aload_1        
        //    87: invokevirtual   com/google/fw.j:()Z
        //    90: ifeq            102
        //    93: aload_0        
        //    94: aload_1        
        //    95: invokevirtual   com/google/fw.d:()Ljava/lang/String;
        //    98: invokevirtual   com/google/fw.d:(Ljava/lang/String;)Lcom/google/fw;
        //   101: pop            
        //   102: aload_0        
        //   103: aload_1        
        //   104: invokevirtual   com/google/fw.k:()Z
        //   107: invokevirtual   com/google/fw.a:(Z)Lcom/google/fw;
        //   110: pop            
        //   111: aload_0        
        //   112: areturn        
        //   113: astore_3       
        //   114: aload_3        
        //   115: athrow         
        //   116: astore          4
        //   118: aload           4
        //   120: athrow         
        //   121: astore          7
        //   123: aload           7
        //   125: athrow         
        //   126: astore          8
        //   128: aload           8
        //   130: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      20     113    116    Ljava/lang/NullPointerException;
        //  20     36     116    121    Ljava/lang/NullPointerException;
        //  70     86     121    126    Ljava/lang/NullPointerException;
        //  86     102    126    131    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 70, Size: 70
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
    
    public fw a(final String g) {
        this.e = true;
        this.g = g;
        return this;
    }
    
    public fw a(final boolean j) {
        this.f = true;
        this.j = j;
        return this;
    }
    
    public String a(final int n) {
        return this.a.get(n);
    }
    
    public boolean a() {
        return this.c;
    }
    
    public fw b(final String s) {
        if (s == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.a.add(s);
        return this;
    }
    
    public String b() {
        return this.g;
    }
    
    public fw c(final String k) {
        this.c = true;
        this.k = k;
        return this;
    }
    
    public String c() {
        return this.k;
    }
    
    public fw d(final String h) {
        this.i = true;
        this.h = h;
        return this;
    }
    
    public String d() {
        return this.h;
    }
    
    public fw e(final String d) {
        this.b = true;
        this.d = d;
        return this;
    }
    
    public boolean e() {
        return this.b;
    }
    
    public List f() {
        return this.a;
    }
    
    public int g() {
        return this.a.size();
    }
    
    public boolean h() {
        return this.e;
    }
    
    public fw i() {
        this.e = false;
        this.g = "";
        return this;
    }
    
    public boolean j() {
        return this.i;
    }
    
    public boolean k() {
        return this.j;
    }
    
    public String l() {
        return this.d;
    }
    
    public boolean n() {
        return this.f;
    }
    
    @Override
    public void readExternal(final ObjectInput p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //    11: invokevirtual   com/google/fw.e:(Ljava/lang/String;)Lcom/google/fw;
        //    14: pop            
        //    15: aload_0        
        //    16: aload_1        
        //    17: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //    22: invokevirtual   com/google/fw.c:(Ljava/lang/String;)Lcom/google/fw;
        //    25: pop            
        //    26: aload_1        
        //    27: invokeinterface java/io/ObjectInput.readInt:()I
        //    32: istore          5
        //    34: iconst_0       
        //    35: istore          6
        //    37: iload           6
        //    39: iload           5
        //    41: if_icmpge       67
        //    44: aload_0        
        //    45: getfield        com/google/fw.a:Ljava/util/List;
        //    48: aload_1        
        //    49: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //    54: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    59: pop            
        //    60: iinc            6, 1
        //    63: iload_2        
        //    64: ifeq            37
        //    67: aload_1        
        //    68: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //    73: ifeq            87
        //    76: aload_0        
        //    77: aload_1        
        //    78: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //    83: invokevirtual   com/google/fw.a:(Ljava/lang/String;)Lcom/google/fw;
        //    86: pop            
        //    87: aload_1        
        //    88: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //    93: ifeq            107
        //    96: aload_0        
        //    97: aload_1        
        //    98: invokeinterface java/io/ObjectInput.readUTF:()Ljava/lang/String;
        //   103: invokevirtual   com/google/fw.d:(Ljava/lang/String;)Lcom/google/fw;
        //   106: pop            
        //   107: aload_0        
        //   108: aload_1        
        //   109: invokeinterface java/io/ObjectInput.readBoolean:()Z
        //   114: invokevirtual   com/google/fw.a:(Z)Lcom/google/fw;
        //   117: pop            
        //   118: return         
        //   119: astore          7
        //   121: aload           7
        //   123: athrow         
        //   124: astore          8
        //   126: aload           8
        //   128: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  67     87     119    124    Ljava/lang/NullPointerException;
        //  87     107    124    129    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    @Override
    public void writeExternal(final ObjectOutput p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/e6.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: aload_0        
        //     6: getfield        com/google/fw.d:Ljava/lang/String;
        //     9: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //    14: aload_1        
        //    15: aload_0        
        //    16: getfield        com/google/fw.k:Ljava/lang/String;
        //    19: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //    24: aload_0        
        //    25: invokevirtual   com/google/fw.g:()I
        //    28: istore_3       
        //    29: aload_1        
        //    30: iload_3        
        //    31: invokeinterface java/io/ObjectOutput.writeInt:(I)V
        //    36: iconst_0       
        //    37: istore          4
        //    39: iload           4
        //    41: iload_3        
        //    42: if_icmpge       75
        //    45: aload_1        
        //    46: aload_0        
        //    47: getfield        com/google/fw.a:Ljava/util/List;
        //    50: iload           4
        //    52: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    57: checkcast       Ljava/lang/String;
        //    60: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //    65: iload           4
        //    67: iconst_1       
        //    68: iadd           
        //    69: istore          7
        //    71: iload_2        
        //    72: ifeq            150
        //    75: aload_1        
        //    76: aload_0        
        //    77: getfield        com/google/fw.e:Z
        //    80: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //    85: aload_0        
        //    86: getfield        com/google/fw.e:Z
        //    89: ifeq            102
        //    92: aload_1        
        //    93: aload_0        
        //    94: getfield        com/google/fw.g:Ljava/lang/String;
        //    97: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   102: aload_1        
        //   103: aload_0        
        //   104: getfield        com/google/fw.i:Z
        //   107: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   112: aload_0        
        //   113: getfield        com/google/fw.i:Z
        //   116: ifeq            129
        //   119: aload_1        
        //   120: aload_0        
        //   121: getfield        com/google/fw.h:Ljava/lang/String;
        //   124: invokeinterface java/io/ObjectOutput.writeUTF:(Ljava/lang/String;)V
        //   129: aload_1        
        //   130: aload_0        
        //   131: getfield        com/google/fw.j:Z
        //   134: invokeinterface java/io/ObjectOutput.writeBoolean:(Z)V
        //   139: return         
        //   140: astore          5
        //   142: aload           5
        //   144: athrow         
        //   145: astore          6
        //   147: aload           6
        //   149: athrow         
        //   150: iload           7
        //   152: istore          4
        //   154: goto            39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  75     102    140    145    Ljava/lang/NullPointerException;
        //  102    129    145    150    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0102:
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
