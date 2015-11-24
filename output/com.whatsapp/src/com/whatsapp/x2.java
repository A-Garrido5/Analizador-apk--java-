// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class x2
{
    private static final String[] z;
    private String a;
    private String b;
    private String c;
    
    static {
        final String[] z2 = new String[4];
        String s = "T(!6wB75r\u007fT~";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = '\'';
                        break;
                    }
                    case 1: {
                        c2 = 'C';
                        break;
                    }
                    case 2: {
                        c2 = 'T';
                        break;
                    }
                    case 3: {
                        c2 = '\u001b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "W1=xv";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "W1;\u007ffD7\u001d\u007f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "T(!6wB75r\u007fTl>h|In1cpB3 r|Ic>h|I~";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public x2(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gm.b:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        com/whatsapp/x2.c:Ljava/lang/String;
        //    13: new             Lorg/json/JSONObject;
        //    16: dup            
        //    17: aload_0        
        //    18: getfield        com/whatsapp/x2.c:Ljava/lang/String;
        //    21: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    24: astore          4
        //    26: aload_0        
        //    27: aload           4
        //    29: getstatic       com/whatsapp/x2.z:[Ljava/lang/String;
        //    32: iconst_2       
        //    33: aaload         
        //    34: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //    37: putfield        com/whatsapp/x2.b:Ljava/lang/String;
        //    40: aload_0        
        //    41: aload           4
        //    43: getstatic       com/whatsapp/x2.z:[Ljava/lang/String;
        //    46: iconst_1       
        //    47: aaload         
        //    48: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //    51: putfield        com/whatsapp/x2.a:Ljava/lang/String;
        //    54: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //    57: ifeq            66
        //    60: iload_2        
        //    61: iconst_1       
        //    62: iadd           
        //    63: putstatic       com/whatsapp/gm.b:I
        //    66: return         
        //    67: astore_3       
        //    68: new             Ljava/lang/StringBuilder;
        //    71: dup            
        //    72: invokespecial   java/lang/StringBuilder.<init>:()V
        //    75: getstatic       com/whatsapp/x2.z:[Ljava/lang/String;
        //    78: iconst_3       
        //    79: aaload         
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: aload_1        
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    90: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    93: new             Ljava/lang/RuntimeException;
        //    96: dup            
        //    97: aload_3        
        //    98: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   101: athrow         
        //   102: astore          5
        //   104: aload           5
        //   106: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  8      54     67     102    Lorg/json/JSONException;
        //  54     66     102    107    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
        return this.b;
    }
    
    public String b() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return x2.z[0] + this.c;
    }
}
