// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.AsyncTask;

public class b2 extends AsyncTask
{
    private static final String[] z;
    lq a;
    final VerifySms b;
    
    static {
        final String[] z2 = new String[28];
        String s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0007|;uN";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0732:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = '_';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0001a-\u007f\u0013D";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\r|:b\u0013\u000ba\u007f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0010r/`\u0004\u0000";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0016v+b\b\u0001w";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0017p7u\u0005\u0011\u007f:=\u0013\u0001g-iN";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0001a-\u007f\u0013";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0007|1~\u0004\u0007g6f\b\u0010j";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0003f:c\u0012\u0001wrd\u000e\u000b>9q\u0012\u0010";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\tz,c\b\nt";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0001a-\u007f\u0013Ig:}\u0011\u000ba>b\b\bjre\u000f\u0005e>y\r\u0005q3u";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0017g>|\u0004";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0017v-f\u0004\u0016>,u\u000f\u0000>2y\u0012\tr+s\t";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0017v-f\u0004\u0016>,u\u000f\u0000>:b\u0013\u000bare\u000f\u0017c:s\b\u0002z:t";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0017v-f\u0004\u0016>,u\u000f\u0000>+\u007f\u000eI~>~\u0018It*u\u0012\u0017v,";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0016v8y\u0012\u0010v-?\u0011\f|1uN\u0002r6|\u0004\u0000>+\u007fL\u0011c;q\u0015\u0001>:h\u0011\ra>d\b\u000b}";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    s = "\u0017v-f\u0004\u0016>,u\u000f\u0000>:b\u0013\u000bard\u0004\tc0b\u0000\u0016z3iL\u0011}>f\u0000\r\u007f>r\r\u0001";
                    n = 15;
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    array = z2;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0001a-\u007f\u0013Kg:}\u0011If1q\u0017\u0005z3?\u0012\u0005e:tL\u0007|;uL\r`r~\u0014\b\u007f";
                    n = 16;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0006\u007f0s\n\u0001w";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0001a-\u007f\u0013Kg0\u007fL\u0002r,dN\u0017r)u\u0005Ip0t\u0004Iz,=\u000f\u0011\u007f3";
                    n = 18;
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = z2;
                    s = "\u0017v-f\u0004\u0016>,u\u000f\u0000>=|\u000e\u0007x:t";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0001a-\u007f\u0013Kp0~\u000f\u0001p+y\u0017\rg&?\u0012\u0005e:tL\u0007|;uL\r`r~\u0014\b\u007f";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0010|0=\f\u0005}&=\u0006\u0011v,c\u0004\u0017";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0017v-f\u0004\u0016>,u\u000f\u0000>:b\u0013\u000barc\u0015\u0005\u007f:";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0011}>e\u0015\f|-y\u001b\u0001w";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0017v-f\u0004\u0016>,u\u000f\u0000>2y\u0012\u0017z1w";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\u001d`2cN\u0012v-y\u0007\rv;";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0017v-f\u0004\u0016>,u\u000f\u0000>8e\u0004\u0017`:tL\u0010|0=\u0007\u0005`+";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    break Label_0732;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected b2(final VerifySms b) {
        this.b = b;
    }
    
    private aa7 a(final String s) {
        try {
            if (b2.z[3].equals(s)) {
                return aa7.TAPPED_LINK;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            if (b2.z[4].equals(s)) {
                return aa7.RETRIED;
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return aa7.AUTO_DETECTED;
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_3       
        //     1: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //     4: pop            
        //     5: aload_0        
        //     6: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //     9: invokestatic    com/whatsapp/VerifySms.k:(Lcom/whatsapp/VerifySms;)V
        //    12: aload_0        
        //    13: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    16: invokestatic    com/whatsapp/VerifySms.d:(Lcom/whatsapp/VerifySms;)V
        //    19: aload_0        
        //    20: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    23: getfield        com/whatsapp/VerifySms.q:Z
        //    26: istore          4
        //    28: iload           4
        //    30: ifne            43
        //    33: aload_0        
        //    34: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    37: invokevirtual   com/whatsapp/VerifySms.isFinishing:()Z
        //    40: ifeq            57
        //    43: aload_0        
        //    44: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    47: invokevirtual   com/whatsapp/VerifySms.g:()V
        //    50: return         
        //    51: astore_1       
        //    52: aload_1        
        //    53: athrow         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      28     51     54     Ljava/lang/NumberFormatException;
        //  33     43     54     57     Ljava/lang/NumberFormatException;
        //  43     50     54     57     Ljava/lang/NumberFormatException;
        //  52     54     54     57     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    private void b(final String s) {
        final int s2 = VerifySms.s(this.b);
        Log.i(b2.z[5] + s2);
        VerifySms.l(this.b).sendMessageDelayed(VerifySms.l(this.b).obtainMessage(1, (Object)s), (long)s2);
    }
    
    protected wo a(final String[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //    10: iconst_0       
        //    11: aaload         
        //    12: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    15: aload_1        
        //    16: iconst_0       
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    24: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    27: getstatic       com/whatsapp/wo.ERROR_UNSPECIFIED:Lcom/whatsapp/wo;
        //    30: pop            
        //    31: aload_0        
        //    32: aload_0        
        //    33: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    36: invokestatic    com/whatsapp/VerifySms.e:(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
        //    39: aload_0        
        //    40: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    43: invokestatic    com/whatsapp/VerifySms.y:(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
        //    46: aload_1        
        //    47: iconst_0       
        //    48: aaload         
        //    49: aload_0        
        //    50: aload_1        
        //    51: iconst_1       
        //    52: aaload         
        //    53: invokespecial   com/whatsapp/b2.a:(Ljava/lang/String;)Lcom/whatsapp/aa7;
        //    56: invokestatic    com/whatsapp/nu.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/aa7;)Lcom/whatsapp/lq;
        //    59: putfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //    62: getstatic       com/whatsapp/mw.a:[I
        //    65: aload_0        
        //    66: getfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //    69: getfield        com/whatsapp/lq.f:Lcom/whatsapp/wo;
        //    72: invokevirtual   com/whatsapp/wo.ordinal:()I
        //    75: iaload         
        //    76: istore          6
        //    78: iload           6
        //    80: tableswitch {
        //                2: 129
        //                3: 129
        //          default: 104
        //        }
        //   104: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   107: aload_0        
        //   108: getfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //   111: getfield        com/whatsapp/lq.b:Ljava/lang/String;
        //   114: invokestatic    com/whatsapp/App.f:(Landroid/content/Context;Ljava/lang/String;)V
        //   117: aload_0        
        //   118: getfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //   121: getfield        com/whatsapp/lq.f:Lcom/whatsapp/wo;
        //   124: astore          7
        //   126: aload           7
        //   128: areturn        
        //   129: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   132: aload_0        
        //   133: getfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //   136: getfield        com/whatsapp/lq.e:Ljava/lang/String;
        //   139: invokestatic    com/whatsapp/App.d:(Landroid/content/Context;Ljava/lang/String;)V
        //   142: goto            104
        //   145: astore          4
        //   147: aload           4
        //   149: athrow         
        //   150: astore          5
        //   152: new             Ljava/lang/StringBuilder;
        //   155: dup            
        //   156: invokespecial   java/lang/StringBuilder.<init>:()V
        //   159: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   162: iconst_2       
        //   163: aaload         
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: aload           5
        //   169: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   178: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   181: getstatic       com/whatsapp/wo.ERROR_CONNECTIVITY:Lcom/whatsapp/wo;
        //   184: areturn        
        //   185: astore_3       
        //   186: new             Ljava/lang/StringBuilder;
        //   189: dup            
        //   190: invokespecial   java/lang/StringBuilder.<init>:()V
        //   193: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   196: iconst_1       
        //   197: aaload         
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: aload_3        
        //   202: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   214: getstatic       com/whatsapp/wo.ERROR_UNSPECIFIED:Lcom/whatsapp/wo;
        //   217: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  31     78     145    150    Ljava/io/IOException;
        //  31     78     185    218    Ljava/lang/Exception;
        //  104    126    150    185    Ljava/io/IOException;
        //  104    126    185    218    Ljava/lang/Exception;
        //  129    142    145    150    Ljava/io/IOException;
        //  129    142    185    218    Ljava/lang/Exception;
        //  147    150    150    185    Ljava/io/IOException;
        //  147    150    185    218    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0104:
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
    
    protected void a(final wo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: getstatic       com/whatsapp/wo.YES:Lcom/whatsapp/wo;
        //     8: if_acmpne       92
        //    11: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //    14: bipush          26
        //    16: aaload         
        //    17: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    20: aload_0        
        //    21: getfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //    24: getfield        com/whatsapp/lq.c:[B
        //    27: aload_0        
        //    28: getfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //    31: getfield        com/whatsapp/lq.b:Ljava/lang/String;
        //    34: invokestatic    com/whatsapp/al5.c:([BLjava/lang/String;)Z
        //    37: pop            
        //    38: aload_0        
        //    39: getfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //    42: getfield        com/whatsapp/lq.j:Z
        //    45: invokestatic    com/whatsapp/VerifyNumber.a:(Z)Z
        //    48: pop            
        //    49: getstatic       com/whatsapp/h6.WHATSAPP_INITIATED:Lcom/whatsapp/h6;
        //    52: ldc2_w          1000
        //    55: aload_0        
        //    56: getfield        com/whatsapp/b2.a:Lcom/whatsapp/lq;
        //    59: getfield        com/whatsapp/lq.h:J
        //    62: lmul           
        //    63: invokestatic    com/whatsapp/ade.a:(Lcom/whatsapp/h6;J)V
        //    66: aload_0        
        //    67: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    70: invokestatic    com/whatsapp/VerifySms.t:(Lcom/whatsapp/VerifySms;)V
        //    73: aload_0        
        //    74: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    77: invokestatic    com/whatsapp/VerifySms.r:(Lcom/whatsapp/VerifySms;)V
        //    80: aload_0        
        //    81: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //    84: iconst_1       
        //    85: invokestatic    com/whatsapp/VerifySms.b:(Lcom/whatsapp/VerifySms;Z)V
        //    88: iload_2        
        //    89: ifeq            625
        //    92: aload_1        
        //    93: getstatic       com/whatsapp/wo.FAIL_MISMATCH:Lcom/whatsapp/wo;
        //    96: if_acmpne       160
        //    99: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   102: bipush          24
        //   104: aaload         
        //   105: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   108: aload_0        
        //   109: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   112: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   115: bipush          12
        //   117: aaload         
        //   118: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   121: iconst_3       
        //   122: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   125: pop            
        //   126: aload_0        
        //   127: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   130: invokestatic    com/whatsapp/VerifySms.k:(Lcom/whatsapp/VerifySms;)V
        //   133: aload_0        
        //   134: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   137: invokestatic    com/whatsapp/VerifySms.t:(Lcom/whatsapp/VerifySms;)V
        //   140: aload_0        
        //   141: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   144: invokestatic    com/whatsapp/VerifySms.r:(Lcom/whatsapp/VerifySms;)V
        //   147: aload_0        
        //   148: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   151: bipush          34
        //   153: invokevirtual   com/whatsapp/VerifySms.e:(I)V
        //   156: iload_2        
        //   157: ifeq            625
        //   160: aload_0        
        //   161: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   164: invokestatic    com/whatsapp/VerifySms.n:(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
        //   167: astore          4
        //   169: getstatic       com/whatsapp/wo.ERROR_CONNECTIVITY:Lcom/whatsapp/wo;
        //   172: astore          24
        //   174: aload_1        
        //   175: aload           24
        //   177: if_acmpne       245
        //   180: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   183: bipush          7
        //   185: aaload         
        //   186: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   189: aload           4
        //   191: ifnonnull       235
        //   194: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   197: bipush          21
        //   199: aaload         
        //   200: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   203: aload_0        
        //   204: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   207: invokestatic    com/whatsapp/VerifySms.t:(Lcom/whatsapp/VerifySms;)V
        //   210: iconst_4       
        //   211: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   214: pop            
        //   215: aload_0        
        //   216: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   219: invokestatic    com/whatsapp/VerifySms.k:(Lcom/whatsapp/VerifySms;)V
        //   222: aload_0        
        //   223: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   226: bipush          21
        //   228: invokevirtual   com/whatsapp/VerifySms.e:(I)V
        //   231: iload_2        
        //   232: ifeq            625
        //   235: aload_0        
        //   236: aload           4
        //   238: invokespecial   com/whatsapp/b2.b:(Ljava/lang/String;)V
        //   241: iload_2        
        //   242: ifeq            625
        //   245: getstatic       com/whatsapp/wo.FAIL_GUESSED_TOO_FAST:Lcom/whatsapp/wo;
        //   248: astore          25
        //   250: aload_1        
        //   251: aload           25
        //   253: if_acmpne       310
        //   256: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   259: bipush          8
        //   261: aaload         
        //   262: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   265: aload_0        
        //   266: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   269: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   272: bipush          27
        //   274: aaload         
        //   275: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   278: aload           4
        //   280: ifnonnull       300
        //   283: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   286: bipush          19
        //   288: aaload         
        //   289: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   292: aload_0        
        //   293: invokespecial   com/whatsapp/b2.a:()V
        //   296: iload_2        
        //   297: ifeq            625
        //   300: aload_0        
        //   301: aload           4
        //   303: invokespecial   com/whatsapp/b2.b:(Ljava/lang/String;)V
        //   306: iload_2        
        //   307: ifeq            625
        //   310: getstatic       com/whatsapp/wo.FAIL_TEMPORARILY_UNAVAILABLE:Lcom/whatsapp/wo;
        //   313: astore          26
        //   315: aload_1        
        //   316: aload           26
        //   318: if_acmpne       375
        //   321: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   324: bipush          10
        //   326: aaload         
        //   327: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   330: aload_0        
        //   331: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   334: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   337: bipush          16
        //   339: aaload         
        //   340: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   343: aload           4
        //   345: ifnonnull       365
        //   348: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   351: bipush          17
        //   353: aaload         
        //   354: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   357: aload_0        
        //   358: invokespecial   com/whatsapp/b2.a:()V
        //   361: iload_2        
        //   362: ifeq            625
        //   365: aload_0        
        //   366: aload           4
        //   368: invokespecial   com/whatsapp/b2.b:(Ljava/lang/String;)V
        //   371: iload_2        
        //   372: ifeq            625
        //   375: aload_0        
        //   376: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   379: invokestatic    com/whatsapp/VerifySms.t:(Lcom/whatsapp/VerifySms;)V
        //   382: aload_0        
        //   383: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   386: invokestatic    com/whatsapp/VerifySms.r:(Lcom/whatsapp/VerifySms;)V
        //   389: getstatic       com/whatsapp/wo.FAIL_MISSING:Lcom/whatsapp/wo;
        //   392: astore          27
        //   394: aload_1        
        //   395: aload           27
        //   397: if_acmpne       426
        //   400: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   403: bipush          9
        //   405: aaload         
        //   406: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   409: aload_0        
        //   410: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   413: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   416: bipush          25
        //   418: aaload         
        //   419: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   422: iload_2        
        //   423: ifeq            529
        //   426: getstatic       com/whatsapp/wo.FAIL_TOO_MANY_GUESSES:Lcom/whatsapp/wo;
        //   429: astore          28
        //   431: aload_1        
        //   432: aload           28
        //   434: if_acmpne       463
        //   437: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   440: bipush          22
        //   442: aaload         
        //   443: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   446: aload_0        
        //   447: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   450: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   453: bipush          14
        //   455: aaload         
        //   456: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   459: iload_2        
        //   460: ifeq            529
        //   463: getstatic       com/whatsapp/wo.ERROR_UNSPECIFIED:Lcom/whatsapp/wo;
        //   466: astore          29
        //   468: aload_1        
        //   469: aload           29
        //   471: if_acmpne       500
        //   474: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   477: bipush          6
        //   479: aaload         
        //   480: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   483: aload_0        
        //   484: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   487: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   490: bipush          13
        //   492: aaload         
        //   493: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   496: iload_2        
        //   497: ifeq            529
        //   500: aload_1        
        //   501: getstatic       com/whatsapp/wo.FAIL_STALE:Lcom/whatsapp/wo;
        //   504: if_acmpne       529
        //   507: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   510: bipush          11
        //   512: aaload         
        //   513: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   516: aload_0        
        //   517: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   520: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   523: bipush          23
        //   525: aaload         
        //   526: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   529: getstatic       com/whatsapp/wo.FAIL_BLOCKED:Lcom/whatsapp/wo;
        //   532: astore          34
        //   534: aload_1        
        //   535: aload           34
        //   537: if_acmpne       621
        //   540: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   543: bipush          18
        //   545: aaload         
        //   546: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   549: bipush          12
        //   551: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   554: pop            
        //   555: aload_0        
        //   556: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   559: invokestatic    com/whatsapp/VerifySms.k:(Lcom/whatsapp/VerifySms;)V
        //   562: aload_0        
        //   563: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   566: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   569: bipush          20
        //   571: aaload         
        //   572: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //   575: aload_0        
        //   576: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   579: invokestatic    com/whatsapp/VerifySms.w:(Lcom/whatsapp/VerifySms;)V
        //   582: aload_0        
        //   583: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   586: getfield        com/whatsapp/VerifySms.q:Z
        //   589: istore          36
        //   591: iload           36
        //   593: ifne            610
        //   596: aload_0        
        //   597: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   600: invokevirtual   com/whatsapp/VerifySms.isFinishing:()Z
        //   603: istore          37
        //   605: iload           37
        //   607: ifeq            625
        //   610: aload_0        
        //   611: getfield        com/whatsapp/b2.b:Lcom/whatsapp/VerifySms;
        //   614: invokevirtual   com/whatsapp/VerifySms.g:()V
        //   617: iload_2        
        //   618: ifeq            625
        //   621: aload_0        
        //   622: invokespecial   com/whatsapp/b2.a:()V
        //   625: return         
        //   626: astore          42
        //   628: getstatic       com/whatsapp/b2.z:[Ljava/lang/String;
        //   631: bipush          15
        //   633: aaload         
        //   634: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   637: goto            66
        //   640: astore          43
        //   642: aload           43
        //   644: athrow         
        //   645: astore_3       
        //   646: aload_3        
        //   647: athrow         
        //   648: astore          5
        //   650: aload           5
        //   652: athrow         
        //   653: astore          6
        //   655: aload           6
        //   657: athrow         
        //   658: astore          7
        //   660: aload           7
        //   662: athrow         
        //   663: astore          8
        //   665: aload           8
        //   667: athrow         
        //   668: astore          9
        //   670: aload           9
        //   672: athrow         
        //   673: astore          10
        //   675: aload           10
        //   677: athrow         
        //   678: astore          11
        //   680: aload           11
        //   682: athrow         
        //   683: astore          12
        //   685: aload           12
        //   687: athrow         
        //   688: astore          13
        //   690: aload           13
        //   692: athrow         
        //   693: astore          14
        //   695: aload           14
        //   697: athrow         
        //   698: astore          15
        //   700: aload           15
        //   702: athrow         
        //   703: astore          16
        //   705: aload           16
        //   707: athrow         
        //   708: astore          17
        //   710: aload           17
        //   712: athrow         
        //   713: astore          18
        //   715: aload           18
        //   717: athrow         
        //   718: astore          19
        //   720: aload           19
        //   722: athrow         
        //   723: astore          20
        //   725: aload           20
        //   727: athrow         
        //   728: astore          21
        //   730: aload           21
        //   732: athrow         
        //   733: astore          22
        //   735: aload           22
        //   737: athrow         
        //   738: astore          23
        //   740: aload           23
        //   742: athrow         
        //   743: astore          30
        //   745: aload           30
        //   747: athrow         
        //   748: astore          31
        //   750: aload           31
        //   752: athrow         
        //   753: astore          32
        //   755: aload           32
        //   757: athrow         
        //   758: astore          33
        //   760: aload           33
        //   762: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  49     66     626    640    Ljava/lang/NumberFormatException;
        //  66     88     640    645    Ljava/lang/NumberFormatException;
        //  92     156    645    648    Ljava/lang/NumberFormatException;
        //  169    174    648    653    Ljava/lang/NumberFormatException;
        //  180    189    653    658    Ljava/lang/NumberFormatException;
        //  194    231    658    663    Ljava/lang/NumberFormatException;
        //  235    241    663    668    Ljava/lang/NumberFormatException;
        //  245    250    668    673    Ljava/lang/NumberFormatException;
        //  256    278    673    678    Ljava/lang/NumberFormatException;
        //  283    296    678    683    Ljava/lang/NumberFormatException;
        //  300    306    683    688    Ljava/lang/NumberFormatException;
        //  310    315    688    693    Ljava/lang/NumberFormatException;
        //  321    343    693    698    Ljava/lang/NumberFormatException;
        //  348    361    698    703    Ljava/lang/NumberFormatException;
        //  365    371    703    708    Ljava/lang/NumberFormatException;
        //  375    394    708    713    Ljava/lang/NumberFormatException;
        //  400    422    713    718    Ljava/lang/NumberFormatException;
        //  426    431    718    723    Ljava/lang/NumberFormatException;
        //  437    459    723    728    Ljava/lang/NumberFormatException;
        //  463    468    728    733    Ljava/lang/NumberFormatException;
        //  474    496    733    738    Ljava/lang/NumberFormatException;
        //  500    529    738    743    Ljava/lang/NumberFormatException;
        //  529    534    743    748    Ljava/lang/NumberFormatException;
        //  540    591    748    753    Ljava/lang/NumberFormatException;
        //  596    605    753    758    Ljava/lang/NumberFormatException;
        //  610    617    758    763    Ljava/lang/NumberFormatException;
        //  621    625    758    763    Ljava/lang/NumberFormatException;
        //  642    645    645    648    Ljava/lang/NumberFormatException;
        //  650    653    653    658    Ljava/lang/NumberFormatException;
        //  655    658    658    663    Ljava/lang/NumberFormatException;
        //  660    663    663    668    Ljava/lang/NumberFormatException;
        //  665    668    668    673    Ljava/lang/NumberFormatException;
        //  670    673    673    678    Ljava/lang/NumberFormatException;
        //  675    678    678    683    Ljava/lang/NumberFormatException;
        //  680    683    683    688    Ljava/lang/NumberFormatException;
        //  685    688    688    693    Ljava/lang/NumberFormatException;
        //  690    693    693    698    Ljava/lang/NumberFormatException;
        //  695    698    698    703    Ljava/lang/NumberFormatException;
        //  700    703    703    708    Ljava/lang/NumberFormatException;
        //  705    708    708    713    Ljava/lang/NumberFormatException;
        //  710    713    713    718    Ljava/lang/NumberFormatException;
        //  715    718    718    723    Ljava/lang/NumberFormatException;
        //  720    723    723    728    Ljava/lang/NumberFormatException;
        //  725    728    728    733    Ljava/lang/NumberFormatException;
        //  730    733    733    738    Ljava/lang/NumberFormatException;
        //  735    738    738    743    Ljava/lang/NumberFormatException;
        //  745    748    748    753    Ljava/lang/NumberFormatException;
        //  750    753    753    758    Ljava/lang/NumberFormatException;
        //  755    758    758    763    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 366, Size: 366
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
    
    protected Object doInBackground(final Object[] array) {
        return this.a((String[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((wo)o);
    }
}
