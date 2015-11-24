// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.b9;
import org.whispersystems.bW;
import org.whispersystems.b;
import org.whispersystems.I;
import com.whatsapp.fieldstats.e;
import com.whatsapp.util.Log;
import org.whispersystems.F;
import org.whispersystems.V;
import com.whatsapp.fieldstats.b0;
import com.whatsapp.protocol.bi;

final class a9v implements Runnable
{
    private static final String[] z;
    final ie a;
    private final a_9 b;
    private final a8p c;
    private final bi d;
    
    static {
        final String[] z2 = new String[12];
        String s = "\u001dVNS\u001b\bB\u0001[\u001b\u0019]O\u0018\u0000\\EOP\u0003\\FNHT\bA\u0001W\u0015\u0012JMZT\bFD\u001f\u0017\u0015^IZ\u0006\bKYKT\nKSL\u001d\u0013@\u0001M\u0011\u001fKHI\u0011\u0018\u0014\u0001R\u0011\u000f]@X\u0011REDFI";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 't';
                        break;
                    }
                    case 0: {
                        c2 = '|';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = '!';
                        break;
                    }
                    case 3: {
                        c2 = '?';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\\X\u001c";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "G\u000eLZ\u0007\u000fOFZZ\u000eKLP\u0000\u0019qSZ\u0007\u0013[S\\\u0011A";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "G\u000eLZ\u0007\u000fOFZZ\u000eKUM\r?ATQ\u0000A";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001dVNS\u001b\bB\u0001\\\u0006\u0015ZH\\\u0015\u0010GUFT\u0019XDQ\u0000F\u000e\tM\u0011\u001fKHI\u0011\u000e\u0007\u0001Y\u001d\u0012OM\u001f\u0006\u0019ZSFT\u001aOHS\u0011\u0018";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001dVNS\u001b\bB\u0001M\u0011\u001fKHI\u0011\u0018\u000e@\u001f\u0019\u0019]R^\u0013\u0019\u0015\u0001R\u0011\u000f]@X\u0011REDFI";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001dVNS\u001b\bB\u0001J\u001a\u000eKBP\u0013\u0012G[Z\u0010\\MHO\u001c\u0019\\UZ\f\b\u000eUF\u0004\u0019\u0015\u0001R\u0011\u000f]@X\u0011REDFI";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\\ZXO\u0011A";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001dVNS\u001b\bB";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001dVNS\u001b\bB";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u001dVNS\u001b\bB";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u001dVNS\u001b\bB";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public a9v(final ie a, final bi d, final a8p c, final a_9 b) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    static bi a(final a9v a9v) {
        return a9v.d;
    }
    
    private F a(final b0 b0, final V v, final bi bi, final a8p a8p, final a_9 a_9) {
        try {
            if (bi.g() == 1) {
                b0.a = 1.0;
                return new p2(this, bi, a8p, a_9);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (bi.g() == 2) {
                b0.a = 2.0;
                return new vx(this, bi, a8p, a_9, v, b0);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        Log.w(a9v.z[0] + bi.a + a9v.z[1] + bi.g());
        b0.e = 0.0;
        b0.c = (double)e.UNKNOWN_CIPHERTEXT_VERSION.getCode();
        return null;
    }
    
    private V a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //     4: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //     7: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    10: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //    13: ifeq            36
        //    16: aload_0        
        //    17: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //    20: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //    23: astore_2       
        //    24: aload_2        
        //    25: invokestatic    com/whatsapp/ha.g:(Ljava/lang/String;)Lorg/whispersystems/V;
        //    28: astore          5
        //    30: aload           5
        //    32: areturn        
        //    33: astore_1       
        //    34: aload_1        
        //    35: athrow         
        //    36: aload_0        
        //    37: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //    40: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    43: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    46: astore_2       
        //    47: goto            24
        //    50: astore_3       
        //    51: aload_0        
        //    52: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //    55: invokestatic    com/whatsapp/ie.a:(Lcom/whatsapp/ie;)Lcom/whatsapp/App;
        //    58: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //    61: new             Lcom/whatsapp/dn;
        //    64: dup            
        //    65: aload_0        
        //    66: aload_0        
        //    67: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //    70: invokestatic    com/whatsapp/ie.a:(Lcom/whatsapp/ie;)Lcom/whatsapp/App;
        //    73: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    76: invokespecial   com/whatsapp/dn.<init>:(Lcom/whatsapp/a9v;Lcom/whatsapp/ha;)V
        //    79: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    82: pop            
        //    83: aconst_null    
        //    84: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      24     33     36     Ljava/lang/IllegalArgumentException;
        //  24     30     50     85     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    private void a(final b0 p0, final V p1, final F p2, final bi p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: aload           4
        //     7: invokevirtual   com/whatsapp/protocol/bi.b:()I
        //    10: istore          12
        //    12: iload           12
        //    14: ifne            48
        //    17: aload_1        
        //    18: getstatic       com/whatsapp/fieldstats/ap.MESSAGE:Lcom/whatsapp/fieldstats/ap;
        //    21: invokevirtual   com/whatsapp/fieldstats/ap.getCode:()I
        //    24: i2d            
        //    25: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    28: putfield        com/whatsapp/fieldstats/b0.d:Ljava/lang/Double;
        //    31: aload_0        
        //    32: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //    35: aload_1        
        //    36: aload_2        
        //    37: aload_3        
        //    38: aload           4
        //    40: invokestatic    com/whatsapp/ie.a:(Lcom/whatsapp/ie;Lcom/whatsapp/fieldstats/b0;Lorg/whispersystems/V;Lorg/whispersystems/F;Lcom/whatsapp/protocol/bi;)V
        //    43: iload           5
        //    45: ifeq            205
        //    48: aload           4
        //    50: invokevirtual   com/whatsapp/protocol/bi.b:()I
        //    53: istore          13
        //    55: iload           13
        //    57: iconst_1       
        //    58: if_icmpne       92
        //    61: aload_1        
        //    62: getstatic       com/whatsapp/fieldstats/ap.PREKEY_MESSAGE:Lcom/whatsapp/fieldstats/ap;
        //    65: invokevirtual   com/whatsapp/fieldstats/ap.getCode:()I
        //    68: i2d            
        //    69: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    72: putfield        com/whatsapp/fieldstats/b0.d:Ljava/lang/Double;
        //    75: aload_0        
        //    76: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //    79: aload_1        
        //    80: aload_2        
        //    81: aload_3        
        //    82: aload           4
        //    84: invokestatic    com/whatsapp/ie.b:(Lcom/whatsapp/ie;Lcom/whatsapp/fieldstats/b0;Lorg/whispersystems/V;Lorg/whispersystems/F;Lcom/whatsapp/protocol/bi;)V
        //    87: iload           5
        //    89: ifeq            205
        //    92: aload           4
        //    94: invokevirtual   com/whatsapp/protocol/bi.b:()I
        //    97: istore          14
        //    99: iload           14
        //   101: iconst_2       
        //   102: if_icmpne       136
        //   105: aload_1        
        //   106: getstatic       com/whatsapp/fieldstats/ap.SENDER_KEY_MESSAGE:Lcom/whatsapp/fieldstats/ap;
        //   109: invokevirtual   com/whatsapp/fieldstats/ap.getCode:()I
        //   112: i2d            
        //   113: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   116: putfield        com/whatsapp/fieldstats/b0.d:Ljava/lang/Double;
        //   119: aload_0        
        //   120: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //   123: aload_1        
        //   124: aload_2        
        //   125: aload_3        
        //   126: aload           4
        //   128: invokestatic    com/whatsapp/ie.c:(Lcom/whatsapp/ie;Lcom/whatsapp/fieldstats/b0;Lorg/whispersystems/V;Lorg/whispersystems/F;Lcom/whatsapp/protocol/bi;)V
        //   131: iload           5
        //   133: ifeq            205
        //   136: new             Ljava/lang/StringBuilder;
        //   139: dup            
        //   140: invokespecial   java/lang/StringBuilder.<init>:()V
        //   143: getstatic       com/whatsapp/a9v.z:[Ljava/lang/String;
        //   146: bipush          6
        //   148: aaload         
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: aload           4
        //   154: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   160: getstatic       com/whatsapp/a9v.z:[Ljava/lang/String;
        //   163: bipush          7
        //   165: aaload         
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: aload           4
        //   171: invokevirtual   com/whatsapp/protocol/bi.b:()I
        //   174: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   177: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   180: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   183: aload_1        
        //   184: dconst_0       
        //   185: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   188: putfield        com/whatsapp/fieldstats/b0.e:Ljava/lang/Double;
        //   191: aload_1        
        //   192: getstatic       com/whatsapp/fieldstats/e.UNKNOWN_CIPHERTEXT_TYPE:Lcom/whatsapp/fieldstats/e;
        //   195: invokevirtual   com/whatsapp/fieldstats/e.getCode:()I
        //   198: i2d            
        //   199: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   202: putfield        com/whatsapp/fieldstats/b0.c:Ljava/lang/Double;
        //   205: return         
        //   206: astore          6
        //   208: aload           6
        //   210: athrow         
        //   211: astore          7
        //   213: aload           7
        //   215: athrow         
        //   216: astore          8
        //   218: aload           8
        //   220: athrow         
        //   221: astore          9
        //   223: aload           9
        //   225: athrow         
        //   226: astore          10
        //   228: aload           10
        //   230: athrow         
        //   231: astore          11
        //   233: aload           11
        //   235: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      12     206    211    Ljava/lang/IllegalArgumentException;
        //  17     43     211    216    Ljava/lang/IllegalArgumentException;
        //  48     55     216    221    Ljava/lang/IllegalArgumentException;
        //  61     87     221    226    Ljava/lang/IllegalArgumentException;
        //  92     99     226    231    Ljava/lang/IllegalArgumentException;
        //  105    131    231    236    Ljava/lang/IllegalArgumentException;
        //  136    205    231    236    Ljava/lang/IllegalArgumentException;
        //  208    211    211    216    Ljava/lang/IllegalArgumentException;
        //  213    216    216    221    Ljava/lang/IllegalArgumentException;
        //  218    221    221    226    Ljava/lang/IllegalArgumentException;
        //  223    226    226    231    Ljava/lang/IllegalArgumentException;
        //  228    231    231    236    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 112, Size: 112
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
    
    private boolean a(final V v, final b0 b0) {
        try {
            b0.e = 1.0;
            final F a = this.a(b0, v, this.d, this.c, this.b);
            if (a == null) {
                return true;
            }
            try {
                this.a(b0, v, a, this.d);
                return true;
            }
            catch (I i) {
                throw i;
            }
        }
        catch (I j) {
            Log.c(a9v.z[8], j);
            this.d.a(true);
            b0.e = 0.0;
            b0.c = (double)e.INVALID_MESSAGE.getCode();
            return true;
        }
        catch (b b2) {
            Log.c(a9v.z[10], b2);
            App.f(this.d);
            return false;
        }
        catch (bW bw) {
            Log.c(a9v.z[11], bw);
            b0.e = 0.0;
            b0.c = (double)e.LEGACY_MESSAGE.getCode();
            return true;
        }
        catch (b9 b3) {
            Log.c(a9v.z[9], b3);
            b0.e = 0.0;
            b0.c = (double)e.INVALID_VERSION.getCode();
            return true;
        }
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Lcom/whatsapp/fieldstats/b0;
        //     7: dup            
        //     8: invokespecial   com/whatsapp/fieldstats/b0.<init>:()V
        //    11: astore_2       
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: getstatic       com/whatsapp/a9v.z:[Ljava/lang/String;
        //    22: iconst_5       
        //    23: aaload         
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: aload_0        
        //    28: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //    31: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    37: getstatic       com/whatsapp/a9v.z:[Ljava/lang/String;
        //    40: iconst_3       
        //    41: aaload         
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: aload_0        
        //    46: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //    49: getfield        com/whatsapp/protocol/bi.y:I
        //    52: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    55: getstatic       com/whatsapp/a9v.z:[Ljava/lang/String;
        //    58: iconst_2       
        //    59: aaload         
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: aload_0        
        //    64: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //    67: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    76: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    79: aload_2        
        //    80: aload_0        
        //    81: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //    84: getfield        com/whatsapp/protocol/bi.y:I
        //    87: i2d            
        //    88: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    91: putfield        com/whatsapp/fieldstats/b0.b:Ljava/lang/Double;
        //    94: aload_0        
        //    95: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //    98: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   101: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   104: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //   107: istore          7
        //   109: iload           7
        //   111: ifeq            132
        //   114: aload_2        
        //   115: getstatic       com/whatsapp/fieldstats/a2.GROUP:Lcom/whatsapp/fieldstats/a2;
        //   118: invokevirtual   com/whatsapp/fieldstats/a2.getCode:()I
        //   121: i2d            
        //   122: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   125: putfield        com/whatsapp/fieldstats/b0.f:Ljava/lang/Double;
        //   128: iload_1        
        //   129: ifeq            184
        //   132: aload_0        
        //   133: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //   136: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   139: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   142: invokestatic    com/whatsapp/a_9.h:(Ljava/lang/String;)Z
        //   145: istore          8
        //   147: iload           8
        //   149: ifeq            170
        //   152: aload_2        
        //   153: getstatic       com/whatsapp/fieldstats/a2.LIST:Lcom/whatsapp/fieldstats/a2;
        //   156: invokevirtual   com/whatsapp/fieldstats/a2.getCode:()I
        //   159: i2d            
        //   160: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   163: putfield        com/whatsapp/fieldstats/b0.f:Ljava/lang/Double;
        //   166: iload_1        
        //   167: ifeq            184
        //   170: aload_2        
        //   171: getstatic       com/whatsapp/fieldstats/a2.INDIVIDUAL:Lcom/whatsapp/fieldstats/a2;
        //   174: invokevirtual   com/whatsapp/fieldstats/a2.getCode:()I
        //   177: i2d            
        //   178: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   181: putfield        com/whatsapp/fieldstats/b0.f:Ljava/lang/Double;
        //   184: aload_0        
        //   185: invokespecial   com/whatsapp/a9v.a:()Lorg/whispersystems/V;
        //   188: astore          9
        //   190: aload           9
        //   192: ifnull          209
        //   195: aload_0        
        //   196: aload           9
        //   198: aload_2        
        //   199: invokespecial   com/whatsapp/a9v.a:(Lorg/whispersystems/V;Lcom/whatsapp/fieldstats/b0;)Z
        //   202: istore          11
        //   204: iload           11
        //   206: ifne            233
        //   209: return         
        //   210: astore_3       
        //   211: aload_3        
        //   212: athrow         
        //   213: astore          4
        //   215: aload           4
        //   217: athrow         
        //   218: astore          5
        //   220: aload           5
        //   222: athrow         
        //   223: astore          6
        //   225: aload           6
        //   227: athrow         
        //   228: astore          10
        //   230: aload           10
        //   232: athrow         
        //   233: aload_0        
        //   234: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //   237: invokestatic    com/whatsapp/ie.a:(Lcom/whatsapp/ie;)Lcom/whatsapp/App;
        //   240: aload_2        
        //   241: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //   244: aload_2        
        //   245: getfield        com/whatsapp/fieldstats/b0.e:Ljava/lang/Double;
        //   248: astore          16
        //   250: aload           16
        //   252: ifnull          269
        //   255: aload_2        
        //   256: getfield        com/whatsapp/fieldstats/b0.e:Ljava/lang/Double;
        //   259: invokevirtual   java/lang/Double.intValue:()I
        //   262: istore          19
        //   264: iload           19
        //   266: ifne            304
        //   269: aload_0        
        //   270: getfield        com/whatsapp/a9v.d:Lcom/whatsapp/protocol/bi;
        //   273: getfield        com/whatsapp/protocol/bi.y:I
        //   276: istore          17
        //   278: iload           17
        //   280: iconst_4       
        //   281: if_icmpne       304
        //   284: getstatic       com/whatsapp/App.aS:I
        //   287: iconst_1       
        //   288: if_icmpne       304
        //   291: getstatic       com/whatsapp/a9v.z:[Ljava/lang/String;
        //   294: iconst_4       
        //   295: aaload         
        //   296: iconst_0       
        //   297: getstatic       com/whatsapp/f8.CRASH:Lcom/whatsapp/f8;
        //   300: aconst_null    
        //   301: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;ZLcom/whatsapp/f8;Ljava/util/EnumSet;)V
        //   304: aload_0        
        //   305: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //   308: invokestatic    com/whatsapp/ie.a:(Lcom/whatsapp/ie;)Lcom/whatsapp/App;
        //   311: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   314: new             Lcom/whatsapp/dn;
        //   317: dup            
        //   318: aload_0        
        //   319: aload_0        
        //   320: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //   323: invokestatic    com/whatsapp/ie.a:(Lcom/whatsapp/ie;)Lcom/whatsapp/App;
        //   326: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   329: invokespecial   com/whatsapp/dn.<init>:(Lcom/whatsapp/a9v;Lcom/whatsapp/ha;)V
        //   332: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   335: pop            
        //   336: return         
        //   337: astore          12
        //   339: aload           12
        //   341: athrow         
        //   342: astore          13
        //   344: aload           13
        //   346: athrow         
        //   347: astore          14
        //   349: aload           14
        //   351: athrow         
        //   352: astore          15
        //   354: aload           15
        //   356: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     109    210    213    Ljava/lang/IllegalArgumentException;
        //  114    128    213    218    Ljava/lang/IllegalArgumentException;
        //  132    147    218    223    Ljava/lang/IllegalArgumentException;
        //  152    166    223    228    Ljava/lang/IllegalArgumentException;
        //  170    184    223    228    Ljava/lang/IllegalArgumentException;
        //  195    204    228    233    Ljava/lang/IllegalArgumentException;
        //  211    213    213    218    Ljava/lang/IllegalArgumentException;
        //  215    218    218    223    Ljava/lang/IllegalArgumentException;
        //  220    223    223    228    Ljava/lang/IllegalArgumentException;
        //  233    250    337    342    Ljava/lang/IllegalArgumentException;
        //  255    264    342    347    Ljava/lang/IllegalArgumentException;
        //  269    278    347    352    Ljava/lang/IllegalArgumentException;
        //  284    304    352    357    Ljava/lang/IllegalArgumentException;
        //  339    342    342    347    Ljava/lang/IllegalArgumentException;
        //  344    347    347    352    Ljava/lang/IllegalArgumentException;
        //  349    352    352    357    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 168, Size: 168
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
