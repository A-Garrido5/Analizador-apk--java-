// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class g2
{
    private static final String[] z;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    
    static {
        final String[] z2 = new String[7];
        String s = "f25\f;m'&\u001b\u0007c./\u00066f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = '\u0002';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "r\"1\n?c$&=8i2-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "r%,\r\"a#\n\r";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "v8(\f9";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "r\"1\n?c$&F=q8-D2z4&\u0019#k8-I=q8-T";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\"$*\u000e9c#6\u001b2?";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "r\"1\n?c$&T";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public g2(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gm.b:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        com/whatsapp/g2.c:Ljava/lang/String;
        //    13: new             Lorg/json/JSONObject;
        //    16: dup            
        //    17: aload_0        
        //    18: getfield        com/whatsapp/g2.c:Ljava/lang/String;
        //    21: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    24: astore          5
        //    26: aload_0        
        //    27: aload           5
        //    29: getstatic       com/whatsapp/g2.z:[Ljava/lang/String;
        //    32: iconst_2       
        //    33: aaload         
        //    34: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //    37: putfield        com/whatsapp/g2.e:Ljava/lang/String;
        //    40: aload_0        
        //    41: aload           5
        //    43: getstatic       com/whatsapp/g2.z:[Ljava/lang/String;
        //    46: iconst_3       
        //    47: aaload         
        //    48: aload           5
        //    50: getstatic       com/whatsapp/g2.z:[Ljava/lang/String;
        //    53: iconst_1       
        //    54: aaload         
        //    55: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //    58: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    61: putfield        com/whatsapp/g2.a:Ljava/lang/String;
        //    64: aload_0        
        //    65: aload           5
        //    67: getstatic       com/whatsapp/g2.z:[Ljava/lang/String;
        //    70: iconst_0       
        //    71: aaload         
        //    72: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //    75: putfield        com/whatsapp/g2.b:Ljava/lang/String;
        //    78: aload_0        
        //    79: aload_2        
        //    80: putfield        com/whatsapp/g2.d:Ljava/lang/String;
        //    83: iload_3        
        //    84: ifeq            105
        //    87: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //    90: istore          7
        //    92: iconst_0       
        //    93: istore          8
        //    95: iload           7
        //    97: ifeq            160
        //   100: iload           8
        //   102: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   105: return         
        //   106: astore          4
        //   108: new             Ljava/lang/StringBuilder;
        //   111: dup            
        //   112: invokespecial   java/lang/StringBuilder.<init>:()V
        //   115: getstatic       com/whatsapp/g2.z:[Ljava/lang/String;
        //   118: iconst_4       
        //   119: aaload         
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: aload_1        
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: getstatic       com/whatsapp/g2.z:[Ljava/lang/String;
        //   130: iconst_5       
        //   131: aaload         
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: aload_2        
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   142: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   145: new             Ljava/lang/RuntimeException;
        //   148: dup            
        //   149: aload           4
        //   151: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   154: athrow         
        //   155: astore          6
        //   157: aload           6
        //   159: athrow         
        //   160: iconst_1       
        //   161: istore          8
        //   163: goto            100
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  8      83     106    155    Lorg/json/JSONException;
        //  87     92     155    160    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0100:
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
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.d;
    }
    
    public String c() {
        return this.e;
    }
    
    public String d() {
        return this.c;
    }
    
    public String e() {
        return this.b;
    }
    
    @Override
    public String toString() {
        return g2.z[6] + this.c;
    }
}
