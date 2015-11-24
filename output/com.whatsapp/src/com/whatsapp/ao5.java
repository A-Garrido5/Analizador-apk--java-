// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

final class ao5 implements Runnable
{
    private static final String[] z;
    final App a;
    private final boolean b;
    private final bi c;
    
    static {
        final String[] z2 = new String[7];
        String s = "H`Q\u0005>_ZV\u0003.\u001avT\u0005?Va\u001c\u0004/L`NJ(_%Y\u0007:N|";
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
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = ':';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = '<';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001alR\u001e%\u001auY\u0004.Sk[J/\b`\u001c\u0019/IvU\u0005$\u001avH\u000b>_%X\u001f/\u001aqSJ$U%O\u000f9IlS\u0004j[kXJt\b1\u001c\u0002%OwOJ9Sk_\u000fjVdO\u001ejQ`EJ8_tI\u000f9N";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "[}S\u0006%Ni\u001c\u001a?NqU\u0004-\u001a";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "[}S\u0006%Ni\u001c\u0007+HnU\u0004-\u001ahY\u00199[bYJ+I%I\u00049_kHJ8[qT\u000f8\u001aqT\u000b$\u001auY\u0004.Sk[J/\b`\u001c\u0019/IvU\u0005$\u0001%Q\u000f9Id[\u000fdQ`EW";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "[}S\u0006%Ni\u001c\u0019/TaU\u0004-\u001a`R\t8CuH\u000f.\u001ahY\u00199[bYQjW`O\u0019+]`\u0012\u0001/C8";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "[}S\u0006%Ni\u001c\u0019/TaU\u0004-\u001auP\u000b#TqY\u0012>\u001ahY\u00199[bYQjW`O\u0019+]`\u0012\u0001/C8";
                    n = 4;
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = z2;
                    s = "[}S\u0006%Ni\u001c\u0003-TjN\u0003$]%Q\u000f9Id[\u000fq\u001ahY\u00199[bYD!_|\u0001";
                    n = 5;
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
    
    public ao5(final App a, final bi c, final boolean b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    static bi a(final ao5 ao5) {
        return ao5.c;
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/App.a3:()Z
        //     7: ifeq            215
        //    10: aload_0        
        //    11: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //    14: getfield        com/whatsapp/protocol/bi.c:I
        //    17: istore          5
        //    19: iload           5
        //    21: bipush          14
        //    23: if_icmpeq       215
        //    26: aload_0        
        //    27: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //    30: invokevirtual   com/whatsapp/protocol/bi.f:()[B
        //    33: astore          6
        //    35: aload           6
        //    37: ifnull          167
        //    40: getstatic       com/whatsapp/ym.h:Z
        //    43: istore          10
        //    45: iload           10
        //    47: ifeq            167
        //    50: aload_0        
        //    51: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //    54: getfield        com/whatsapp/protocol/bi.y:I
        //    57: istore          11
        //    59: getstatic       com/whatsapp/ym.n:I
        //    62: istore          12
        //    64: iload           11
        //    66: iload           12
        //    68: if_icmpge       167
        //    71: new             Ljava/lang/StringBuilder;
        //    74: dup            
        //    75: invokespecial   java/lang/StringBuilder.<init>:()V
        //    78: getstatic       com/whatsapp/ao5.z:[Ljava/lang/String;
        //    81: iconst_4       
        //    82: aaload         
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: aload_0        
        //    87: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //    90: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    96: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    99: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   102: invokestatic    com/whatsapp/App.Y:()Lcom/whatsapp/messaging/MessageService;
        //   105: aload_0        
        //   106: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   109: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   112: aload_0        
        //   113: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   116: invokevirtual   com/whatsapp/protocol/bi.g:()I
        //   119: aload_0        
        //   120: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   123: invokevirtual   com/whatsapp/protocol/bi.b:()I
        //   126: aload           6
        //   128: aload_0        
        //   129: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   132: getfield        com/whatsapp/protocol/bi.y:I
        //   135: aconst_null    
        //   136: aload_0        
        //   137: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   140: getfield        com/whatsapp/protocol/bi.l:[Ljava/lang/String;
        //   143: aload_0        
        //   144: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   147: getfield        com/whatsapp/protocol/bi.Q:Ljava/lang/String;
        //   150: aload_0        
        //   151: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   154: getfield        com/whatsapp/protocol/bi.C:Ljava/lang/String;
        //   157: invokestatic    com/whatsapp/messaging/e.a:(Lcom/whatsapp/protocol/c6;II[BILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Message;
        //   160: invokevirtual   com/whatsapp/messaging/MessageService.b:(Landroid/os/Message;)V
        //   163: iload_1        
        //   164: ifeq            211
        //   167: new             Ljava/lang/StringBuilder;
        //   170: dup            
        //   171: invokespecial   java/lang/StringBuilder.<init>:()V
        //   174: getstatic       com/whatsapp/ao5.z:[Ljava/lang/String;
        //   177: iconst_5       
        //   178: aaload         
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: aload_0        
        //   183: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   186: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   192: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   195: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   198: invokestatic    com/whatsapp/App.Y:()Lcom/whatsapp/messaging/MessageService;
        //   201: aload_0        
        //   202: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   205: invokestatic    com/whatsapp/messaging/e.b:(Lcom/whatsapp/protocol/bi;)Landroid/os/Message;
        //   208: invokevirtual   com/whatsapp/messaging/MessageService.b:(Landroid/os/Message;)V
        //   211: iload_1        
        //   212: ifeq            262
        //   215: new             Ljava/lang/StringBuilder;
        //   218: dup            
        //   219: invokespecial   java/lang/StringBuilder.<init>:()V
        //   222: getstatic       com/whatsapp/ao5.z:[Ljava/lang/String;
        //   225: bipush          6
        //   227: aaload         
        //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   231: aload_0        
        //   232: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   235: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   241: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   244: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   247: invokestatic    com/whatsapp/App.a4:()Landroid/os/Handler;
        //   250: new             Lcom/whatsapp/hu;
        //   253: dup            
        //   254: aload_0        
        //   255: invokespecial   com/whatsapp/hu.<init>:(Lcom/whatsapp/ao5;)V
        //   258: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   261: pop            
        //   262: return         
        //   263: astore_2       
        //   264: aload_2        
        //   265: athrow         
        //   266: astore          8
        //   268: aload           8
        //   270: athrow         
        //   271: astore          9
        //   273: aload           9
        //   275: athrow         
        //   276: astore          7
        //   278: aload           7
        //   280: athrow         
        //   281: astore_3       
        //   282: aload_3        
        //   283: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      19     263    266    Ljava/lang/IllegalArgumentException;
        //  40     45     266    271    Ljava/lang/IllegalArgumentException;
        //  50     64     271    276    Ljava/lang/IllegalArgumentException;
        //  71     163    276    281    Ljava/lang/IllegalArgumentException;
        //  167    211    276    281    Ljava/lang/IllegalArgumentException;
        //  215    262    281    284    Ljava/lang/IllegalArgumentException;
        //  268    271    271    276    Ljava/lang/IllegalArgumentException;
        //  273    276    276    281    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 127, Size: 127
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
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //    10: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    13: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    16: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    19: ifeq            38
        //    22: new             Ljava/lang/AssertionError;
        //    25: dup            
        //    26: getstatic       com/whatsapp/ao5.z:[Ljava/lang/String;
        //    29: iconst_0       
        //    30: aaload         
        //    31: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //    34: athrow         
        //    35: astore_3       
        //    36: aload_3        
        //    37: athrow         
        //    38: aload_0        
        //    39: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //    42: getfield        com/whatsapp/protocol/bi.I:B
        //    45: istore          5
        //    47: iload           5
        //    49: ifne            342
        //    52: iload_1        
        //    53: istore          6
        //    55: aload_0        
        //    56: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //    59: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    62: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    65: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //    68: istore          7
        //    70: aload_0        
        //    71: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //    74: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    77: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    80: invokestatic    com/whatsapp/a_9.h:(Ljava/lang/String;)Z
        //    83: istore          8
        //    85: iload           7
        //    87: ifne            348
        //    90: iload           8
        //    92: ifne            348
        //    95: iload_1        
        //    96: istore          9
        //    98: iload           6
        //   100: ifeq            733
        //   103: iload           9
        //   105: ifeq            733
        //   108: aload_0        
        //   109: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   112: aconst_null    
        //   113: invokevirtual   com/whatsapp/protocol/bi.b:([B)V
        //   116: new             Lcom/whatsapp/fieldstats/b2;
        //   119: dup            
        //   120: invokespecial   com/whatsapp/fieldstats/b2.<init>:()V
        //   123: astore          19
        //   125: aload           19
        //   127: aload_0        
        //   128: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   131: getfield        com/whatsapp/protocol/bi.y:I
        //   134: i2d            
        //   135: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   138: putfield        com/whatsapp/fieldstats/b2.b:Ljava/lang/Double;
        //   141: aload_0        
        //   142: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   145: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   148: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   151: invokestatic    com/whatsapp/ha.g:(Ljava/lang/String;)Lorg/whispersystems/V;
        //   154: astore          21
        //   156: aload_0        
        //   157: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   160: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   163: aload           21
        //   165: invokevirtual   org/whispersystems/V.b:()Ljava/lang/String;
        //   168: invokevirtual   com/whatsapp/ha.f:(Ljava/lang/String;)Lcom/whatsapp/alk;
        //   171: invokevirtual   com/whatsapp/alk.a:()Ljava/util/Date;
        //   174: astore          22
        //   176: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //   179: astore          23
        //   181: aload           23
        //   183: iconst_5       
        //   184: iconst_m1      
        //   185: invokevirtual   java/util/Calendar.add:(II)V
        //   188: aload_0        
        //   189: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   192: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   195: aload           21
        //   197: invokevirtual   com/whatsapp/ha.a:(Lorg/whispersystems/V;)Z
        //   200: istore          24
        //   202: aload           22
        //   204: ifnull          224
        //   207: aload           22
        //   209: aload           23
        //   211: invokevirtual   java/util/Calendar.getTime:()Ljava/util/Date;
        //   214: invokevirtual   java/util/Date.before:(Ljava/util/Date;)Z
        //   217: istore          41
        //   219: iload           41
        //   221: ifeq            366
        //   224: iload_1        
        //   225: istore          25
        //   227: iload           24
        //   229: ifne            405
        //   232: iload           25
        //   234: ifeq            405
        //   237: aload_0        
        //   238: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   241: getfield        com/whatsapp/App.aG:Lorg/whispersystems/jobqueue/v;
        //   244: new             Lcom/whatsapp/jobqueue/job/GetPreKeyJob;
        //   247: dup            
        //   248: aload_0        
        //   249: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   252: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   255: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   258: aconst_null    
        //   259: invokespecial   com/whatsapp/jobqueue/job/GetPreKeyJob.<init>:(Ljava/lang/String;[B)V
        //   262: invokevirtual   org/whispersystems/jobqueue/v.a:(Lorg/whispersystems/jobqueue/a;)V
        //   265: getstatic       com/whatsapp/ym.d:Z
        //   268: ifeq            377
        //   271: new             Ljava/lang/StringBuilder;
        //   274: dup            
        //   275: invokespecial   java/lang/StringBuilder.<init>:()V
        //   278: getstatic       com/whatsapp/ao5.z:[Ljava/lang/String;
        //   281: iconst_2       
        //   282: aaload         
        //   283: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   286: aload_0        
        //   287: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   290: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   293: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   296: getstatic       com/whatsapp/ao5.z:[Ljava/lang/String;
        //   299: iconst_1       
        //   300: aaload         
        //   301: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   304: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   307: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   310: aload_0        
        //   311: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   314: bipush          14
        //   316: putfield        com/whatsapp/protocol/bi.c:I
        //   319: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   322: aload_0        
        //   323: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   326: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   329: invokevirtual   com/whatsapp/vy.c:(Lcom/whatsapp/protocol/c6;)V
        //   332: aload_0        
        //   333: invokespecial   com/whatsapp/ao5.a:()V
        //   336: return         
        //   337: astore          4
        //   339: aload           4
        //   341: athrow         
        //   342: iconst_0       
        //   343: istore          6
        //   345: goto            55
        //   348: iconst_0       
        //   349: istore          9
        //   351: goto            98
        //   354: astore          20
        //   356: aload_0        
        //   357: invokespecial   com/whatsapp/ao5.a:()V
        //   360: return         
        //   361: astore          40
        //   363: aload           40
        //   365: athrow         
        //   366: iconst_0       
        //   367: istore          25
        //   369: goto            227
        //   372: astore          38
        //   374: aload           38
        //   376: athrow         
        //   377: aload           19
        //   379: dconst_0       
        //   380: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   383: putfield        com/whatsapp/fieldstats/b2.f:Ljava/lang/Double;
        //   386: aload           19
        //   388: getstatic       com/whatsapp/fieldstats/e.NO_SESSION_AVAILABLE:Lcom/whatsapp/fieldstats/e;
        //   391: invokevirtual   com/whatsapp/fieldstats/e.getCode:()I
        //   394: i2d            
        //   395: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   398: putfield        com/whatsapp/fieldstats/b2.c:Ljava/lang/Double;
        //   401: iload_2        
        //   402: ifeq            716
        //   405: iload           24
        //   407: ifeq            641
        //   410: new             Lorg/whispersystems/aK;
        //   413: dup            
        //   414: aload_0        
        //   415: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   418: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   421: aload_0        
        //   422: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   425: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   428: aload_0        
        //   429: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   432: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   435: invokevirtual   com/whatsapp/ha.g:()Lcom/whatsapp/it;
        //   438: aload_0        
        //   439: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   442: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   445: aload           21
        //   447: invokespecial   org/whispersystems/aK.<init>:(Lorg/whispersystems/i;Lorg/whispersystems/M;Lorg/whispersystems/a4;Lorg/whispersystems/a5;Lorg/whispersystems/V;)V
        //   450: astore          26
        //   452: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   455: aload_0        
        //   456: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   459: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   462: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   465: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   468: astore          27
        //   470: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   473: aload           27
        //   475: invokevirtual   com/whatsapp/wc.k:(Lcom/whatsapp/a_9;)V
        //   478: aload           27
        //   480: ldc_w           Lcom/whatsapp/o7;.class
        //   483: invokevirtual   com/whatsapp/a_9.a:(Ljava/lang/Class;)Lcom/whatsapp/b7;
        //   486: checkcast       Lcom/whatsapp/o7;
        //   489: getstatic       com/whatsapp/o7.ALLOW:Lcom/whatsapp/o7;
        //   492: if_acmpne       565
        //   495: aload_0        
        //   496: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   499: iconst_2       
        //   500: invokevirtual   com/whatsapp/protocol/bi.a:(I)V
        //   503: invokestatic    com/whatsapp/proto/E2E$Message.newBuilder:()Lcom/whatsapp/proto/E2E$Message$Builder;
        //   506: aload_0        
        //   507: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   510: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   513: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.setConversation:(Ljava/lang/String;)Lcom/whatsapp/proto/E2E$Message$Builder;
        //   516: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.build:()Lcom/whatsapp/proto/E2E$Message;
        //   519: invokevirtual   com/whatsapp/proto/E2E$Message.a:()[B
        //   522: astore          35
        //   524: iconst_1       
        //   525: aload           35
        //   527: arraylength    
        //   528: iadd           
        //   529: newarray        B
        //   531: astore          36
        //   533: aload           35
        //   535: iconst_0       
        //   536: aload           36
        //   538: iconst_0       
        //   539: aload           35
        //   541: arraylength    
        //   542: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   545: aload           36
        //   547: aload           35
        //   549: arraylength    
        //   550: iload_1        
        //   551: bastore        
        //   552: aload           26
        //   554: aload           36
        //   556: invokevirtual   org/whispersystems/aK.a:([B)Lorg/whispersystems/ai;
        //   559: astore          37
        //   561: iload_2        
        //   562: ifeq            949
        //   565: aload_0        
        //   566: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   569: iload_1        
        //   570: invokevirtual   com/whatsapp/protocol/bi.a:(I)V
        //   573: aload           26
        //   575: aload_0        
        //   576: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   579: invokevirtual   com/whatsapp/protocol/bi.d:()[B
        //   582: invokevirtual   org/whispersystems/aK.a:([B)Lorg/whispersystems/ai;
        //   585: astore          28
        //   587: aload_0        
        //   588: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   591: aload           28
        //   593: invokeinterface org/whispersystems/ai.a:()[B
        //   598: invokevirtual   com/whatsapp/protocol/bi.b:([B)V
        //   601: aload_0        
        //   602: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   605: astore          30
        //   607: aload           28
        //   609: invokeinterface org/whispersystems/ai.b:()I
        //   614: istore          31
        //   616: iload           31
        //   618: iconst_3       
        //   619: if_icmpne       909
        //   622: aload           30
        //   624: iload_1        
        //   625: invokevirtual   com/whatsapp/protocol/bi.b:(I)V
        //   628: aload           19
        //   630: dconst_1       
        //   631: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   634: putfield        com/whatsapp/fieldstats/b2.f:Ljava/lang/Double;
        //   637: iload_2        
        //   638: ifeq            716
        //   641: aload_0        
        //   642: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   645: getfield        com/whatsapp/protocol/bi.c:I
        //   648: bipush          14
        //   650: if_icmpne       692
        //   653: new             Ljava/lang/StringBuilder;
        //   656: dup            
        //   657: invokespecial   java/lang/StringBuilder.<init>:()V
        //   660: getstatic       com/whatsapp/ao5.z:[Ljava/lang/String;
        //   663: iconst_3       
        //   664: aaload         
        //   665: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   668: aload_0        
        //   669: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   672: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   675: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   678: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   681: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   684: aload_0        
        //   685: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   688: iconst_0       
        //   689: putfield        com/whatsapp/protocol/bi.c:I
        //   692: aload           19
        //   694: dconst_0       
        //   695: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   698: putfield        com/whatsapp/fieldstats/b2.f:Ljava/lang/Double;
        //   701: aload           19
        //   703: getstatic       com/whatsapp/fieldstats/e.NO_SESSION_AVAILABLE:Lcom/whatsapp/fieldstats/e;
        //   706: invokevirtual   com/whatsapp/fieldstats/e.getCode:()I
        //   709: i2d            
        //   710: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   713: putfield        com/whatsapp/fieldstats/b2.c:Ljava/lang/Double;
        //   716: aload_0        
        //   717: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   720: aload           19
        //   722: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //   725: aload_0        
        //   726: invokespecial   com/whatsapp/ao5.a:()V
        //   729: iload_2        
        //   730: ifeq            336
        //   733: getstatic       com/whatsapp/ym.o:Z
        //   736: istore          12
        //   738: iload           12
        //   740: ifeq            889
        //   743: iload           6
        //   745: ifeq            889
        //   748: iload           7
        //   750: ifeq            889
        //   753: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   756: aload_0        
        //   757: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   760: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   763: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   766: invokevirtual   com/whatsapp/vy.D:(Ljava/lang/String;)Ljava/util/Collection;
        //   769: astore          14
        //   771: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   774: aload           14
        //   776: getstatic       com/whatsapp/o7.ALLOW:Lcom/whatsapp/o7;
        //   779: invokevirtual   com/whatsapp/wc.a:(Ljava/util/Collection;Lcom/whatsapp/b7;)Z
        //   782: ifeq            881
        //   785: aload_0        
        //   786: getfield        com/whatsapp/ao5.b:Z
        //   789: istore          17
        //   791: iload           17
        //   793: ifne            885
        //   796: invokestatic    com/whatsapp/proto/E2E$Message.newBuilder:()Lcom/whatsapp/proto/E2E$Message$Builder;
        //   799: aload_0        
        //   800: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   803: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   806: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.setConversation:(Ljava/lang/String;)Lcom/whatsapp/proto/E2E$Message$Builder;
        //   809: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.build:()Lcom/whatsapp/proto/E2E$Message;
        //   812: astore          18
        //   814: aload_0        
        //   815: getfield        com/whatsapp/ao5.a:Lcom/whatsapp/App;
        //   818: getfield        com/whatsapp/App.aG:Lorg/whispersystems/jobqueue/v;
        //   821: new             Lcom/whatsapp/jobqueue/job/SendE2EMessageJob;
        //   824: dup            
        //   825: aload           18
        //   827: aload_0        
        //   828: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   831: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   834: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //   837: aload_0        
        //   838: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   841: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   844: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   847: aconst_null    
        //   848: aload_0        
        //   849: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   852: getfield        com/whatsapp/protocol/bi.y:I
        //   855: aconst_null    
        //   856: aload_0        
        //   857: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   860: getfield        com/whatsapp/protocol/bi.Q:Ljava/lang/String;
        //   863: aload_0        
        //   864: getfield        com/whatsapp/ao5.c:Lcom/whatsapp/protocol/bi;
        //   867: getfield        com/whatsapp/protocol/bi.C:Ljava/lang/String;
        //   870: aconst_null    
        //   871: invokespecial   com/whatsapp/jobqueue/job/SendE2EMessageJob.<init>:(Lcom/whatsapp/proto/E2E$Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
        //   874: invokevirtual   org/whispersystems/jobqueue/v.a:(Lorg/whispersystems/jobqueue/a;)V
        //   877: iload_2        
        //   878: ifeq            885
        //   881: aload_0        
        //   882: invokespecial   com/whatsapp/ao5.a:()V
        //   885: iload_2        
        //   886: ifeq            336
        //   889: aload_0        
        //   890: invokespecial   com/whatsapp/ao5.a:()V
        //   893: return         
        //   894: astore          13
        //   896: aload           13
        //   898: athrow         
        //   899: astore          39
        //   901: aload           39
        //   903: athrow         
        //   904: astore          29
        //   906: aload           29
        //   908: athrow         
        //   909: iconst_0       
        //   910: istore_1       
        //   911: goto            622
        //   914: astore          32
        //   916: aload           32
        //   918: athrow         
        //   919: astore          33
        //   921: aload           33
        //   923: athrow         
        //   924: astore          34
        //   926: aload           34
        //   928: athrow         
        //   929: astore          10
        //   931: aload           10
        //   933: athrow         
        //   934: astore          11
        //   936: aload           11
        //   938: athrow         
        //   939: astore          16
        //   941: aload           16
        //   943: athrow         
        //   944: astore          15
        //   946: aload           15
        //   948: athrow         
        //   949: aload           37
        //   951: astore          28
        //   953: goto            587
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      35     35     38     Ljava/lang/IllegalArgumentException;
        //  38     47     337    342    Ljava/lang/IllegalArgumentException;
        //  141    156    354    361    Ljava/lang/IllegalArgumentException;
        //  207    219    361    366    Ljava/lang/IllegalArgumentException;
        //  237    336    372    377    Ljava/lang/IllegalArgumentException;
        //  377    401    899    904    Ljava/lang/IllegalArgumentException;
        //  587    616    904    909    Ljava/lang/IllegalArgumentException;
        //  622    637    914    919    Ljava/lang/IllegalArgumentException;
        //  641    692    919    924    Ljava/lang/IllegalArgumentException;
        //  716    729    924    929    Ljava/lang/IllegalArgumentException;
        //  733    738    929    939    Ljava/lang/IllegalArgumentException;
        //  785    791    939    944    Ljava/lang/IllegalArgumentException;
        //  814    877    944    949    Ljava/lang/IllegalArgumentException;
        //  881    885    944    949    Ljava/lang/IllegalArgumentException;
        //  889    893    894    899    Ljava/lang/IllegalArgumentException;
        //  916    919    919    924    Ljava/lang/IllegalArgumentException;
        //  926    929    929    939    Ljava/lang/IllegalArgumentException;
        //  931    934    934    939    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 433, Size: 433
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
