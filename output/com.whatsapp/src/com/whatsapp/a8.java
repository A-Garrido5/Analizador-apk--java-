// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

public class a8 extends a9
{
    private static final String[] z;
    private bi s;
    private String t;
    
    static {
        final String[] z2 = new String[8];
        String s = "V\u0011M1x[\u0010\u0005";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001d';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = 'd';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = 'C';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "B\u0001].xQ\r^1x@\u0014S,|QKZ-y\u0015";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0015\u0014Z-y\\\nXy";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "B\u0001].xQ\r^1x@\u0014S,|QKJ1q\u001a\u0001M1rGD";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "B\u0001].xQ\r^1x@\u0014S,|QKM&n@\bK02X\rL0t[\u0003\u001f(xL\u0017\u001f*s\u0015\u0011O/rT\u0000\u001f1xF\u0011S7";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "B\u0001].xQ\r^1x@\u0014S,|QKJ1q\u001a\nPnuZ\u0017K";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0015\u0016Z0hY\u0010\u0005";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "B\u0001].xQ\r^1x@\u0014S,|QKL6~V\u0001L0=";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public a8(final bi s, final bi bi, final String t) {
        super(bi, 0L, true);
        this.t = t;
        this.s = s;
    }
    
    @Override
    public void a(final t8 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/a8.z:[Ljava/lang/String;
        //    10: iconst_1       
        //    11: aaload         
        //    12: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    15: aload_0        
        //    16: getfield        com/whatsapp/a8.h:Lcom/whatsapp/protocol/bi;
        //    19: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    25: getstatic       com/whatsapp/a8.z:[Ljava/lang/String;
        //    28: iconst_0       
        //    29: aaload         
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: getstatic       com/whatsapp/a8.f:Ljava/util/LinkedHashMap;
        //    36: invokevirtual   java/util/LinkedHashMap.size:()I
        //    39: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    42: getstatic       com/whatsapp/a8.z:[Ljava/lang/String;
        //    45: iconst_2       
        //    46: aaload         
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    50: getstatic       com/whatsapp/a8.k:Ljava/util/LinkedHashMap;
        //    53: invokevirtual   java/util/LinkedHashMap.size:()I
        //    56: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    59: getstatic       com/whatsapp/a8.z:[Ljava/lang/String;
        //    62: bipush          6
        //    64: aaload         
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: aload_1        
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    72: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    75: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    78: aload_0        
        //    79: aload_1        
        //    80: invokespecial   com/whatsapp/a9.a:(Lcom/whatsapp/t8;)V
        //    83: new             Lcom/whatsapp/protocol/cq;
        //    86: dup            
        //    87: invokespecial   com/whatsapp/protocol/cq.<init>:()V
        //    90: astore_2       
        //    91: aload_1        
        //    92: getstatic       com/whatsapp/t8.SUCCESS:Lcom/whatsapp/t8;
        //    95: if_acmpne       358
        //    98: aload_0        
        //    99: getfield        com/whatsapp/a8.n:Z
        //   102: istore          5
        //   104: iload           5
        //   106: ifeq            358
        //   109: new             Ljava/net/URL;
        //   112: dup            
        //   113: aload_0        
        //   114: getfield        com/whatsapp/a8.o:Lcom/whatsapp/protocol/cb;
        //   117: getfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   120: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   123: astore          6
        //   125: aload           6
        //   127: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   130: ifnull          148
        //   133: aload           6
        //   135: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   138: invokevirtual   java/lang/String.length:()I
        //   141: istore          10
        //   143: iload           10
        //   145: ifne            212
        //   148: getstatic       com/whatsapp/a8.z:[Ljava/lang/String;
        //   151: iconst_5       
        //   152: aaload         
        //   153: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   156: aload_2        
        //   157: sipush          502
        //   160: putfield        com/whatsapp/protocol/cq.h:I
        //   163: aload_0        
        //   164: getfield        com/whatsapp/a8.t:Ljava/lang/String;
        //   167: aload_2        
        //   168: iconst_5       
        //   169: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Lcom/whatsapp/protocol/cq;I)V
        //   172: return         
        //   173: astore_3       
        //   174: aload_3        
        //   175: athrow         
        //   176: astore          7
        //   178: aload           7
        //   180: athrow         
        //   181: astore          8
        //   183: new             Ljava/lang/StringBuilder;
        //   186: dup            
        //   187: invokespecial   java/lang/StringBuilder.<init>:()V
        //   190: getstatic       com/whatsapp/a8.z:[Ljava/lang/String;
        //   193: iconst_3       
        //   194: aaload         
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: aload           8
        //   200: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   209: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   212: aload_0        
        //   213: getfield        com/whatsapp/a8.o:Lcom/whatsapp/protocol/cb;
        //   216: getfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   219: ifnonnull       252
        //   222: getstatic       com/whatsapp/a8.z:[Ljava/lang/String;
        //   225: iconst_4       
        //   226: aaload         
        //   227: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   230: aload_2        
        //   231: sipush          502
        //   234: putfield        com/whatsapp/protocol/cq.h:I
        //   237: aload_0        
        //   238: getfield        com/whatsapp/a8.t:Ljava/lang/String;
        //   241: aload_2        
        //   242: iconst_5       
        //   243: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Lcom/whatsapp/protocol/cq;I)V
        //   246: return         
        //   247: astore          9
        //   249: aload           9
        //   251: athrow         
        //   252: new             Ljava/lang/StringBuilder;
        //   255: dup            
        //   256: invokespecial   java/lang/StringBuilder.<init>:()V
        //   259: getstatic       com/whatsapp/a8.z:[Ljava/lang/String;
        //   262: bipush          7
        //   264: aaload         
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   268: aload_0        
        //   269: getfield        com/whatsapp/a8.h:Lcom/whatsapp/protocol/bi;
        //   272: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   278: ldc             " "
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   283: aload_0        
        //   284: getfield        com/whatsapp/a8.o:Lcom/whatsapp/protocol/cb;
        //   287: getfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   293: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   296: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   299: aload_2        
        //   300: sipush          200
        //   303: putfield        com/whatsapp/protocol/cq.h:I
        //   306: aload_2        
        //   307: aload_0        
        //   308: getfield        com/whatsapp/a8.o:Lcom/whatsapp/protocol/cb;
        //   311: getfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   314: putfield        com/whatsapp/protocol/cq.q:Ljava/lang/String;
        //   317: aload_0        
        //   318: getfield        com/whatsapp/a8.t:Ljava/lang/String;
        //   321: aload_2        
        //   322: iconst_5       
        //   323: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Lcom/whatsapp/protocol/cq;I)V
        //   326: aload_0        
        //   327: getfield        com/whatsapp/a8.s:Lcom/whatsapp/protocol/bi;
        //   330: aload_0        
        //   331: getfield        com/whatsapp/a8.o:Lcom/whatsapp/protocol/cb;
        //   334: getfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   337: putfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   340: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   343: aload_0        
        //   344: getfield        com/whatsapp/a8.s:Lcom/whatsapp/protocol/bi;
        //   347: iconst_1       
        //   348: iconst_m1      
        //   349: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   352: getstatic       com/whatsapp/App.I:Z
        //   355: ifeq            172
        //   358: aload_2        
        //   359: sipush          502
        //   362: putfield        com/whatsapp/protocol/cq.h:I
        //   365: aload_0        
        //   366: getfield        com/whatsapp/a8.t:Ljava/lang/String;
        //   369: aload_2        
        //   370: iconst_5       
        //   371: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Lcom/whatsapp/protocol/cq;I)V
        //   374: return         
        //   375: astore          4
        //   377: aload           4
        //   379: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  91     104    173    176    Ljava/lang/Exception;
        //  109    125    181    212    Ljava/lang/Exception;
        //  125    143    176    181    Ljava/lang/Exception;
        //  148    172    181    212    Ljava/lang/Exception;
        //  178    181    181    212    Ljava/lang/Exception;
        //  212    246    247    252    Ljava/lang/Exception;
        //  252    358    375    380    Ljava/lang/Exception;
        //  358    374    375    380    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
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
    public void onPostExecute(final Object o) {
        this.a((t8)o);
    }
}
