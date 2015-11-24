// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.AsyncTask;

public class asi extends AsyncTask
{
    private static final String[] z;
    lq a;
    final VerifySms b;
    
    static {
        final String[] z2 = new String[25];
        String s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0016s&Ze^c8Zt\u0018d0";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0657:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 's';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '\u0017';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0007d9Ex\u0001`&\\{\n,![v\u0005`=Yv\u0011m1";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0000u5Yr";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "s1R~\u0000u1G8\u0003i;[r\\g5\\{\u0016eyAx^t$Qv\u0007dyPo\u0003h&Tc\u001an:";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0016s&Ze";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0016s&Ze^f!Pd\u0000d0\u0018c\u001cnySv\u0000u";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0005d&\\q\u001ad0\u0018u\u0006uyPo\u0003h&Ps";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0006o5W{\u0016, Z:\u0003`&Fr^s1Ae\n@2Ar\u0001";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0005d&\\q\u001ad0";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0001d Gn\u0012g PeSg5\\{\u0016etAxSq5Gd\u0016";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "w;\\t\u0016, Pz\u0003n&Te\u001am-\u0018b\u001d`\"T~\u001f`6Yr";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0016s&Ze^l=Fd\u001ao3";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "d&Gx\u0001!9\\d\u0000h:R";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0016s&Ze^b;[y\u0016b \\a\u001au-";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "s1R~\u0000u1G8\u0003i;[r\\g5\\{\u0016eyAx^t$Qv\u0007dyPo\u0003h&Tc\u001an:";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0006o5W{\u0016, Z:\u0003`&Fr^s1Ae\n@2Ar\u0001";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "h:Eb\u0007^9Pc\u001bn0";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u001ao7Ze\u0001d7A";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0006o5W{\u0016, Z:\u0003`&Fr^s1Ae\n@2Ar\u0001";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0016s&Ze^u;Z:\u001e`:L:\u0014t1Fd\u0016r";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "s1Sb\u0000d0";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u001an1Ge\u001cst";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0010n0P8";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P8\u0016s&ZeS";
                    n = 22;
                    n2 = 23;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    array = z2;
                    s = "w1G~\u0015x\"Z~\u0010d{Cr\u0001h2La\u001ch7P";
                    n = 23;
                    continue;
                }
                case 23: {
                    break Label_0657;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected asi(final VerifySms b) {
        this.b = b;
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
        //     7: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //    10: bipush          22
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: iconst_0       
        //    18: aaload         
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    25: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    28: getstatic       com/whatsapp/wo.ERROR_UNSPECIFIED:Lcom/whatsapp/wo;
        //    31: astore_2       
        //    32: aload_0        
        //    33: aload_0        
        //    34: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //    37: invokestatic    com/whatsapp/VerifySms.e:(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
        //    40: aload_0        
        //    41: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //    44: invokestatic    com/whatsapp/VerifySms.y:(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
        //    47: aload_1        
        //    48: iconst_0       
        //    49: aaload         
        //    50: getstatic       com/whatsapp/aa7.TYPED:Lcom/whatsapp/aa7;
        //    53: invokestatic    com/whatsapp/nu.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/aa7;)Lcom/whatsapp/lq;
        //    56: putfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //    59: getstatic       com/whatsapp/mw.a:[I
        //    62: aload_0        
        //    63: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //    66: getfield        com/whatsapp/lq.f:Lcom/whatsapp/wo;
        //    69: invokevirtual   com/whatsapp/wo.ordinal:()I
        //    72: iaload         
        //    73: istore          10
        //    75: iload           10
        //    77: tableswitch {
        //                2: 125
        //                3: 125
        //          default: 100
        //        }
        //   100: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   103: aload_0        
        //   104: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   107: getfield        com/whatsapp/lq.b:Ljava/lang/String;
        //   110: invokestatic    com/whatsapp/App.f:(Landroid/content/Context;Ljava/lang/String;)V
        //   113: aload_0        
        //   114: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   117: getfield        com/whatsapp/lq.f:Lcom/whatsapp/wo;
        //   120: astore          9
        //   122: aload           9
        //   124: areturn        
        //   125: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   128: aload_0        
        //   129: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   132: getfield        com/whatsapp/lq.e:Ljava/lang/String;
        //   135: invokestatic    com/whatsapp/App.d:(Landroid/content/Context;Ljava/lang/String;)V
        //   138: goto            100
        //   141: astore          4
        //   143: aload           4
        //   145: athrow         
        //   146: astore          5
        //   148: aload           5
        //   150: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   153: astore          6
        //   155: new             Ljava/lang/StringBuilder;
        //   158: dup            
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   165: bipush          21
        //   167: aaload         
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: aload           6
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   179: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   182: aload           6
        //   184: ifnull          216
        //   187: aload           6
        //   189: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   192: bipush          20
        //   194: aaload         
        //   195: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   198: istore          8
        //   200: iload           8
        //   202: ifeq            216
        //   205: getstatic       com/whatsapp/wo.ERROR_UNSPECIFIED:Lcom/whatsapp/wo;
        //   208: astore          9
        //   210: getstatic       com/whatsapp/App.I:Z
        //   213: ifeq            122
        //   216: getstatic       com/whatsapp/wo.ERROR_CONNECTIVITY:Lcom/whatsapp/wo;
        //   219: areturn        
        //   220: astore          7
        //   222: aload           7
        //   224: athrow         
        //   225: astore_3       
        //   226: new             Ljava/lang/StringBuilder;
        //   229: dup            
        //   230: invokespecial   java/lang/StringBuilder.<init>:()V
        //   233: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   236: bipush          23
        //   238: aaload         
        //   239: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   242: aload_3        
        //   243: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   252: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   255: aload_2        
        //   256: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  32     75     141    146    Ljava/io/IOException;
        //  32     75     225    257    Ljava/lang/Exception;
        //  100    122    146    225    Ljava/io/IOException;
        //  100    122    225    257    Ljava/lang/Exception;
        //  125    138    141    146    Ljava/io/IOException;
        //  125    138    225    257    Ljava/lang/Exception;
        //  143    146    146    225    Ljava/io/IOException;
        //  143    146    225    257    Ljava/lang/Exception;
        //  155    182    220    225    Ljava/io/IOException;
        //  187    200    220    225    Ljava/io/IOException;
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
        //     4: aload_0        
        //     5: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //     8: bipush          24
        //    10: invokevirtual   com/whatsapp/VerifySms.removeDialog:(I)V
        //    13: aload_1        
        //    14: getstatic       com/whatsapp/wo.YES:Lcom/whatsapp/wo;
        //    17: if_acmpne       92
        //    20: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //    23: bipush          8
        //    25: aaload         
        //    26: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    29: aload_0        
        //    30: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //    33: getfield        com/whatsapp/lq.c:[B
        //    36: aload_0        
        //    37: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //    40: getfield        com/whatsapp/lq.b:Ljava/lang/String;
        //    43: invokestatic    com/whatsapp/al5.c:([BLjava/lang/String;)Z
        //    46: pop            
        //    47: aload_0        
        //    48: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //    51: getfield        com/whatsapp/lq.j:Z
        //    54: invokestatic    com/whatsapp/VerifyNumber.a:(Z)Z
        //    57: pop            
        //    58: getstatic       com/whatsapp/h6.WHATSAPP_INITIATED:Lcom/whatsapp/h6;
        //    61: ldc2_w          1000
        //    64: aload_0        
        //    65: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //    68: getfield        com/whatsapp/lq.h:J
        //    71: lmul           
        //    72: invokestatic    com/whatsapp/ade.a:(Lcom/whatsapp/h6;J)V
        //    75: iconst_3       
        //    76: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //    79: pop            
        //    80: aload_0        
        //    81: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //    84: iconst_1       
        //    85: invokestatic    com/whatsapp/VerifySms.b:(Lcom/whatsapp/VerifySms;Z)V
        //    88: iload_2        
        //    89: ifeq            831
        //    92: getstatic       com/whatsapp/wo.EXPIRED:Lcom/whatsapp/wo;
        //    95: astore          4
        //    97: aload_1        
        //    98: aload           4
        //   100: if_acmpne       175
        //   103: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   106: bipush          6
        //   108: aaload         
        //   109: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   112: aload_0        
        //   113: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   116: getfield        com/whatsapp/lq.c:[B
        //   119: aload_0        
        //   120: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   123: getfield        com/whatsapp/lq.b:Ljava/lang/String;
        //   126: invokestatic    com/whatsapp/al5.c:([BLjava/lang/String;)Z
        //   129: pop            
        //   130: aload_0        
        //   131: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   134: getfield        com/whatsapp/lq.j:Z
        //   137: invokestatic    com/whatsapp/VerifyNumber.a:(Z)Z
        //   140: pop            
        //   141: getstatic       com/whatsapp/h6.WHATSAPP_INITIATED:Lcom/whatsapp/h6;
        //   144: ldc2_w          1000
        //   147: aload_0        
        //   148: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   151: getfield        com/whatsapp/lq.h:J
        //   154: lmul           
        //   155: invokestatic    com/whatsapp/ade.a:(Lcom/whatsapp/h6;J)V
        //   158: iconst_3       
        //   159: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   162: pop            
        //   163: aload_0        
        //   164: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   167: iconst_1       
        //   168: invokestatic    com/whatsapp/VerifySms.b:(Lcom/whatsapp/VerifySms;Z)V
        //   171: iload_2        
        //   172: ifeq            831
        //   175: getstatic       com/whatsapp/wo.FAIL_MISMATCH:Lcom/whatsapp/wo;
        //   178: astore          7
        //   180: aload_1        
        //   181: aload           7
        //   183: if_acmpne       565
        //   186: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   189: bipush          17
        //   191: aaload         
        //   192: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   195: aload_0        
        //   196: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   199: invokestatic    com/whatsapp/VerifySms.j:(Lcom/whatsapp/VerifySms;)Landroid/widget/EditText;
        //   202: ldc             ""
        //   204: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   207: invokestatic    com/whatsapp/VerifySms.i:()I
        //   210: istore          73
        //   212: iload           73
        //   214: bipush          13
        //   216: if_icmpne       303
        //   219: iconst_3       
        //   220: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   223: pop            
        //   224: aload_0        
        //   225: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   228: astore          97
        //   230: aload_0        
        //   231: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   234: astore          98
        //   236: iconst_1       
        //   237: anewarray       Ljava/lang/Object;
        //   240: astore          99
        //   242: aload           99
        //   244: iconst_0       
        //   245: aload_0        
        //   246: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   249: ldc             2131231890
        //   251: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   254: aastore        
        //   255: aload           97
        //   257: aload           98
        //   259: ldc             2131231896
        //   261: aload           99
        //   263: invokevirtual   com/whatsapp/VerifySms.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   266: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //   269: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   272: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   275: bipush          16
        //   277: aaload         
        //   278: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   281: checkcast       Landroid/view/inputmethod/InputMethodManager;
        //   284: aload_0        
        //   285: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   288: invokestatic    com/whatsapp/VerifySms.j:(Lcom/whatsapp/VerifySms;)Landroid/widget/EditText;
        //   291: invokevirtual   android/widget/EditText.getWindowToken:()Landroid/os/IBinder;
        //   294: iconst_0       
        //   295: invokevirtual   android/view/inputmethod/InputMethodManager.hideSoftInputFromWindow:(Landroid/os/IBinder;I)Z
        //   298: pop            
        //   299: iload_2        
        //   300: ifeq            831
        //   303: bipush          10
        //   305: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   308: pop            
        //   309: ldc2_w          60000
        //   312: lstore          75
        //   314: aload_0        
        //   315: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   318: getfield        com/whatsapp/lq.g:Ljava/lang/String;
        //   321: ifnull          344
        //   324: aload_0        
        //   325: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   328: getfield        com/whatsapp/lq.g:Ljava/lang/String;
        //   331: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   334: lstore          94
        //   336: lload           94
        //   338: ldc2_w          1000
        //   341: lmul           
        //   342: lstore          75
        //   344: invokestatic    com/whatsapp/VerifySms.d:()I
        //   347: istore          81
        //   349: iload           81
        //   351: ifle            530
        //   354: lload           75
        //   356: lconst_0       
        //   357: lcmp           
        //   358: ifle            452
        //   361: aload_0        
        //   362: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   365: astore          88
        //   367: aload_0        
        //   368: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   371: astore          89
        //   373: iconst_2       
        //   374: anewarray       Ljava/lang/Object;
        //   377: astore          90
        //   379: aload           90
        //   381: iconst_0       
        //   382: aload_0        
        //   383: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   386: lload           75
        //   388: invokestatic    com/whatsapp/util/b6.n:(Landroid/content/Context;J)Ljava/lang/String;
        //   391: aastore        
        //   392: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   395: ldc_w           2131296300
        //   398: invokestatic    com/whatsapp/VerifySms.C:()I
        //   401: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   404: astore          91
        //   406: iconst_1       
        //   407: anewarray       Ljava/lang/Object;
        //   410: astore          92
        //   412: aload           92
        //   414: iconst_0       
        //   415: invokestatic    com/whatsapp/VerifySms.C:()I
        //   418: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   421: aastore        
        //   422: aload           90
        //   424: iconst_1       
        //   425: aload           91
        //   427: aload           92
        //   429: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   432: aastore        
        //   433: aload           88
        //   435: aload           89
        //   437: ldc_w           2131231581
        //   440: aload           90
        //   442: invokevirtual   com/whatsapp/VerifySms.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   445: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //   448: iload_2        
        //   449: ifeq            552
        //   452: aload_0        
        //   453: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   456: astore          83
        //   458: aload_0        
        //   459: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   462: astore          84
        //   464: iconst_1       
        //   465: anewarray       Ljava/lang/Object;
        //   468: astore          85
        //   470: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   473: ldc_w           2131296300
        //   476: invokestatic    com/whatsapp/VerifySms.C:()I
        //   479: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   482: astore          86
        //   484: iconst_1       
        //   485: anewarray       Ljava/lang/Object;
        //   488: astore          87
        //   490: aload           87
        //   492: iconst_0       
        //   493: invokestatic    com/whatsapp/VerifySms.C:()I
        //   496: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   499: aastore        
        //   500: aload           85
        //   502: iconst_0       
        //   503: aload           86
        //   505: aload           87
        //   507: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   510: aastore        
        //   511: aload           83
        //   513: aload           84
        //   515: ldc_w           2131231580
        //   518: aload           85
        //   520: invokevirtual   com/whatsapp/VerifySms.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   523: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //   526: iload_2        
        //   527: ifeq            552
        //   530: aload_0        
        //   531: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   534: aload_0        
        //   535: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   538: ldc_w           2131231578
        //   541: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   544: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //   547: iconst_3       
        //   548: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   551: pop            
        //   552: aload_0        
        //   553: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   556: lload           75
        //   558: invokestatic    com/whatsapp/VerifySms.d:(Lcom/whatsapp/VerifySms;J)V
        //   561: iload_2        
        //   562: ifeq            831
        //   565: getstatic       com/whatsapp/wo.ERROR_UNSPECIFIED:Lcom/whatsapp/wo;
        //   568: astore          15
        //   570: aload_1        
        //   571: aload           15
        //   573: if_acmpne       603
        //   576: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   579: iconst_4       
        //   580: aaload         
        //   581: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   584: bipush          11
        //   586: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   589: pop            
        //   590: aload_0        
        //   591: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   594: bipush          109
        //   596: invokevirtual   com/whatsapp/VerifySms.d:(I)V
        //   599: iload_2        
        //   600: ifeq            831
        //   603: getstatic       com/whatsapp/wo.FAIL_MISSING:Lcom/whatsapp/wo;
        //   606: astore          16
        //   608: aload_1        
        //   609: aload           16
        //   611: if_acmpne       686
        //   614: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   617: bipush          11
        //   619: aaload         
        //   620: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   623: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   626: bipush          12
        //   628: aaload         
        //   629: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //   632: iconst_3       
        //   633: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   636: pop            
        //   637: aload_0        
        //   638: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   641: astore          69
        //   643: aload_0        
        //   644: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   647: astore          70
        //   649: iconst_1       
        //   650: anewarray       Ljava/lang/Object;
        //   653: astore          71
        //   655: aload           71
        //   657: iconst_0       
        //   658: aload_0        
        //   659: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   662: ldc             2131231890
        //   664: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   667: aastore        
        //   668: aload           69
        //   670: aload           70
        //   672: ldc             2131231896
        //   674: aload           71
        //   676: invokevirtual   com/whatsapp/VerifySms.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   679: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //   682: iload_2        
        //   683: ifeq            831
        //   686: getstatic       com/whatsapp/wo.FAIL_TOO_MANY_GUESSES:Lcom/whatsapp/wo;
        //   689: astore          17
        //   691: aload_1        
        //   692: aload           17
        //   694: if_acmpne       987
        //   697: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   700: bipush          19
        //   702: aaload         
        //   703: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   706: iconst_3       
        //   707: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   710: pop            
        //   711: aload_0        
        //   712: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   715: getfield        com/whatsapp/lq.g:Ljava/lang/String;
        //   718: astore          60
        //   720: aload           60
        //   722: ifnonnull       746
        //   725: aload_0        
        //   726: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   729: aload_0        
        //   730: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   733: ldc_w           2131231568
        //   736: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   739: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //   742: iload_2        
        //   743: ifeq            831
        //   746: ldc2_w          1000
        //   749: aload_0        
        //   750: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //   753: getfield        com/whatsapp/lq.g:Ljava/lang/String;
        //   756: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   759: lmul           
        //   760: lstore          62
        //   762: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   765: lload           62
        //   767: invokevirtual   com/whatsapp/App.c:(J)V
        //   770: aload_0        
        //   771: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   774: astore          64
        //   776: aload_0        
        //   777: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   780: astore          65
        //   782: iconst_1       
        //   783: anewarray       Ljava/lang/Object;
        //   786: astore          66
        //   788: aload           66
        //   790: iconst_0       
        //   791: aload_0        
        //   792: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   795: lload           62
        //   797: invokestatic    com/whatsapp/util/b6.n:(Landroid/content/Context;J)Ljava/lang/String;
        //   800: aastore        
        //   801: aload           64
        //   803: aload           65
        //   805: ldc_w           2131231570
        //   808: aload           66
        //   810: invokevirtual   com/whatsapp/VerifySms.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   813: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //   816: bipush          10
        //   818: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //   821: pop            
        //   822: aload_0        
        //   823: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   826: lload           62
        //   828: invokestatic    com/whatsapp/VerifySms.d:(Lcom/whatsapp/VerifySms;J)V
        //   831: aload_0        
        //   832: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   835: invokestatic    com/whatsapp/VerifySms.k:(Lcom/whatsapp/VerifySms;)V
        //   838: aload_0        
        //   839: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   842: invokestatic    com/whatsapp/VerifySms.A:(Lcom/whatsapp/VerifySms;)V
        //   845: return         
        //   846: astore          107
        //   848: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   851: iconst_3       
        //   852: aaload         
        //   853: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   856: goto            75
        //   859: astore_3       
        //   860: aload_3        
        //   861: athrow         
        //   862: astore          103
        //   864: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   867: bipush          14
        //   869: aaload         
        //   870: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   873: goto            158
        //   876: astore          5
        //   878: aload           5
        //   880: athrow         
        //   881: astore          6
        //   883: aload           6
        //   885: athrow         
        //   886: astore          93
        //   888: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   891: bipush          9
        //   893: aaload         
        //   894: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   897: goto            344
        //   900: astore          77
        //   902: aload           77
        //   904: athrow         
        //   905: astore          78
        //   907: aload           78
        //   909: athrow         
        //   910: astore          79
        //   912: aload           79
        //   914: athrow         
        //   915: astore          80
        //   917: aload           80
        //   919: athrow         
        //   920: astore          8
        //   922: aload           8
        //   924: athrow         
        //   925: astore          9
        //   927: aload           9
        //   929: athrow         
        //   930: astore          10
        //   932: aload           10
        //   934: athrow         
        //   935: astore          11
        //   937: aload           11
        //   939: athrow         
        //   940: astore          12
        //   942: aload           12
        //   944: athrow         
        //   945: astore          13
        //   947: aload           13
        //   949: athrow         
        //   950: astore          14
        //   952: aload           14
        //   954: athrow         
        //   955: astore          61
        //   957: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //   960: bipush          7
        //   962: aaload         
        //   963: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   966: aload_0        
        //   967: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   970: aload_0        
        //   971: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //   974: ldc_w           2131231568
        //   977: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //   980: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //   983: iload_2        
        //   984: ifeq            831
        //   987: getstatic       com/whatsapp/wo.FAIL_GUESSED_TOO_FAST:Lcom/whatsapp/wo;
        //   990: astore          21
        //   992: aload_1        
        //   993: aload           21
        //   995: if_acmpne       1166
        //   998: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //  1001: iconst_5       
        //  1002: aaload         
        //  1003: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1006: iconst_3       
        //  1007: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //  1010: pop            
        //  1011: aload_0        
        //  1012: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //  1015: getfield        com/whatsapp/lq.g:Ljava/lang/String;
        //  1018: astore          51
        //  1020: aload           51
        //  1022: ifnonnull       1046
        //  1025: aload_0        
        //  1026: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1029: aload_0        
        //  1030: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1033: ldc_w           2131231566
        //  1036: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //  1039: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //  1042: iload_2        
        //  1043: ifeq            831
        //  1046: ldc2_w          1000
        //  1049: aload_0        
        //  1050: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //  1053: getfield        com/whatsapp/lq.g:Ljava/lang/String;
        //  1056: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1059: lmul           
        //  1060: lstore          53
        //  1062: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1065: lload           53
        //  1067: invokevirtual   com/whatsapp/App.c:(J)V
        //  1070: aload_0        
        //  1071: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1074: astore          55
        //  1076: aload_0        
        //  1077: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1080: astore          56
        //  1082: iconst_1       
        //  1083: anewarray       Ljava/lang/Object;
        //  1086: astore          57
        //  1088: aload           57
        //  1090: iconst_0       
        //  1091: aload_0        
        //  1092: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1095: lload           53
        //  1097: invokestatic    com/whatsapp/util/b6.n:(Landroid/content/Context;J)Ljava/lang/String;
        //  1100: aastore        
        //  1101: aload           55
        //  1103: aload           56
        //  1105: ldc_w           2131231567
        //  1108: aload           57
        //  1110: invokevirtual   com/whatsapp/VerifySms.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1113: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //  1116: bipush          10
        //  1118: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //  1121: pop            
        //  1122: aload_0        
        //  1123: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1126: lload           53
        //  1128: invokestatic    com/whatsapp/VerifySms.d:(Lcom/whatsapp/VerifySms;J)V
        //  1131: goto            831
        //  1134: astore          52
        //  1136: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //  1139: bipush          18
        //  1141: aaload         
        //  1142: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1145: aload_0        
        //  1146: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1149: aload_0        
        //  1150: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1153: ldc_w           2131231566
        //  1156: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //  1159: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //  1162: iload_2        
        //  1163: ifeq            831
        //  1166: getstatic       com/whatsapp/wo.ERROR_CONNECTIVITY:Lcom/whatsapp/wo;
        //  1169: astore          31
        //  1171: aload_1        
        //  1172: aload           31
        //  1174: if_acmpne       1243
        //  1177: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //  1180: bipush          13
        //  1182: aaload         
        //  1183: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1186: bipush          11
        //  1188: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //  1191: pop            
        //  1192: aload_0        
        //  1193: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1196: astore          47
        //  1198: aload_0        
        //  1199: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1202: astore          48
        //  1204: iconst_1       
        //  1205: anewarray       Ljava/lang/Object;
        //  1208: astore          49
        //  1210: aload           49
        //  1212: iconst_0       
        //  1213: aload_0        
        //  1214: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1217: ldc_w           2131230921
        //  1220: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //  1223: aastore        
        //  1224: aload           47
        //  1226: aload           48
        //  1228: ldc_w           2131231532
        //  1231: aload           49
        //  1233: invokevirtual   com/whatsapp/VerifySms.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1236: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //  1239: iload_2        
        //  1240: ifeq            831
        //  1243: getstatic       com/whatsapp/wo.FAIL_BLOCKED:Lcom/whatsapp/wo;
        //  1246: astore          32
        //  1248: aload_1        
        //  1249: aload           32
        //  1251: if_acmpne       1279
        //  1254: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //  1257: iconst_0       
        //  1258: aaload         
        //  1259: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1262: bipush          12
        //  1264: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //  1267: pop            
        //  1268: aload_0        
        //  1269: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1272: invokestatic    com/whatsapp/VerifySms.w:(Lcom/whatsapp/VerifySms;)V
        //  1275: iload_2        
        //  1276: ifeq            831
        //  1279: getstatic       com/whatsapp/wo.FAIL_STALE:Lcom/whatsapp/wo;
        //  1282: astore          33
        //  1284: aload_1        
        //  1285: aload           33
        //  1287: if_acmpne       1317
        //  1290: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //  1293: iconst_2       
        //  1294: aaload         
        //  1295: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1298: iconst_3       
        //  1299: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //  1302: pop            
        //  1303: aload_0        
        //  1304: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1307: ldc_w           2131231564
        //  1310: invokevirtual   com/whatsapp/VerifySms.f:(I)V
        //  1313: iload_2        
        //  1314: ifeq            831
        //  1317: getstatic       com/whatsapp/wo.FAIL_TEMPORARILY_UNAVAILABLE:Lcom/whatsapp/wo;
        //  1320: astore          34
        //  1322: aload_1        
        //  1323: aload           34
        //  1325: if_acmpne       831
        //  1328: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //  1331: iconst_1       
        //  1332: aaload         
        //  1333: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1336: aload_0        
        //  1337: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1340: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //  1343: bipush          10
        //  1345: aaload         
        //  1346: invokevirtual   com/whatsapp/VerifySms.c:(Ljava/lang/String;)V
        //  1349: iconst_3       
        //  1350: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //  1353: pop            
        //  1354: aload_0        
        //  1355: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //  1358: getfield        com/whatsapp/lq.g:Ljava/lang/String;
        //  1361: astore          36
        //  1363: aload           36
        //  1365: ifnonnull       1389
        //  1368: aload_0        
        //  1369: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1372: aload_0        
        //  1373: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1376: ldc_w           2131231566
        //  1379: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //  1382: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //  1385: iload_2        
        //  1386: ifeq            831
        //  1389: ldc2_w          1000
        //  1392: aload_0        
        //  1393: getfield        com/whatsapp/asi.a:Lcom/whatsapp/lq;
        //  1396: getfield        com/whatsapp/lq.g:Ljava/lang/String;
        //  1399: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1402: lmul           
        //  1403: lstore          38
        //  1405: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1408: lload           38
        //  1410: invokevirtual   com/whatsapp/App.c:(J)V
        //  1413: aload_0        
        //  1414: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1417: astore          40
        //  1419: aload_0        
        //  1420: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1423: astore          41
        //  1425: iconst_1       
        //  1426: anewarray       Ljava/lang/Object;
        //  1429: astore          42
        //  1431: aload           42
        //  1433: iconst_0       
        //  1434: aload_0        
        //  1435: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1438: lload           38
        //  1440: invokestatic    com/whatsapp/util/b6.n:(Landroid/content/Context;J)Ljava/lang/String;
        //  1443: aastore        
        //  1444: aload           40
        //  1446: aload           41
        //  1448: ldc_w           2131231567
        //  1451: aload           42
        //  1453: invokevirtual   com/whatsapp/VerifySms.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1456: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //  1459: bipush          10
        //  1461: invokestatic    com/whatsapp/VerifySms.j:(I)I
        //  1464: pop            
        //  1465: aload_0        
        //  1466: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1469: lload           38
        //  1471: invokestatic    com/whatsapp/VerifySms.d:(Lcom/whatsapp/VerifySms;J)V
        //  1474: goto            831
        //  1477: astore          37
        //  1479: getstatic       com/whatsapp/asi.z:[Ljava/lang/String;
        //  1482: bipush          15
        //  1484: aaload         
        //  1485: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1488: aload_0        
        //  1489: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1492: aload_0        
        //  1493: getfield        com/whatsapp/asi.b:Lcom/whatsapp/VerifySms;
        //  1496: ldc_w           2131231566
        //  1499: invokevirtual   com/whatsapp/VerifySms.getString:(I)Ljava/lang/String;
        //  1502: invokevirtual   com/whatsapp/VerifySms.d:(Ljava/lang/String;)V
        //  1505: goto            831
        //  1508: astore          18
        //  1510: aload           18
        //  1512: athrow         
        //  1513: astore          19
        //  1515: aload           19
        //  1517: athrow         
        //  1518: astore          20
        //  1520: aload           20
        //  1522: athrow         
        //  1523: astore          22
        //  1525: aload           22
        //  1527: athrow         
        //  1528: astore          23
        //  1530: aload           23
        //  1532: athrow         
        //  1533: astore          24
        //  1535: aload           24
        //  1537: athrow         
        //  1538: astore          25
        //  1540: aload           25
        //  1542: athrow         
        //  1543: astore          26
        //  1545: aload           26
        //  1547: athrow         
        //  1548: astore          27
        //  1550: aload           27
        //  1552: athrow         
        //  1553: astore          28
        //  1555: aload           28
        //  1557: athrow         
        //  1558: astore          29
        //  1560: aload           29
        //  1562: athrow         
        //  1563: astore          30
        //  1565: aload           30
        //  1567: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  58     75     846    859    Ljava/lang/NumberFormatException;
        //  75     88     859    862    Ljava/lang/NumberFormatException;
        //  92     97     859    862    Ljava/lang/NumberFormatException;
        //  141    158    862    876    Ljava/lang/NumberFormatException;
        //  158    171    876    881    Ljava/lang/NumberFormatException;
        //  175    180    876    881    Ljava/lang/NumberFormatException;
        //  186    212    881    886    Ljava/lang/NumberFormatException;
        //  324    336    886    900    Ljava/lang/NumberFormatException;
        //  344    349    900    905    Ljava/lang/NumberFormatException;
        //  361    448    905    910    Ljava/lang/NumberFormatException;
        //  452    526    910    915    Ljava/lang/NumberFormatException;
        //  530    552    915    920    Ljava/lang/NumberFormatException;
        //  552    561    920    925    Ljava/lang/NumberFormatException;
        //  565    570    920    925    Ljava/lang/NumberFormatException;
        //  576    599    925    930    Ljava/lang/NumberFormatException;
        //  603    608    930    935    Ljava/lang/NumberFormatException;
        //  614    682    935    940    Ljava/lang/NumberFormatException;
        //  686    691    940    945    Ljava/lang/NumberFormatException;
        //  697    720    945    950    Ljava/lang/NumberFormatException;
        //  725    742    950    955    Ljava/lang/NumberFormatException;
        //  746    831    955    987    Ljava/lang/NumberFormatException;
        //  878    881    881    886    Ljava/lang/NumberFormatException;
        //  902    905    905    910    Ljava/lang/NumberFormatException;
        //  907    910    910    915    Ljava/lang/NumberFormatException;
        //  912    915    915    920    Ljava/lang/NumberFormatException;
        //  922    925    925    930    Ljava/lang/NumberFormatException;
        //  927    930    930    935    Ljava/lang/NumberFormatException;
        //  932    935    935    940    Ljava/lang/NumberFormatException;
        //  937    940    940    945    Ljava/lang/NumberFormatException;
        //  942    945    945    950    Ljava/lang/NumberFormatException;
        //  947    950    950    955    Ljava/lang/NumberFormatException;
        //  957    983    1508   1513   Ljava/lang/NumberFormatException;
        //  987    992    1508   1513   Ljava/lang/NumberFormatException;
        //  998    1020   1513   1518   Ljava/lang/NumberFormatException;
        //  1025   1042   1518   1523   Ljava/lang/NumberFormatException;
        //  1046   1131   1134   1166   Ljava/lang/NumberFormatException;
        //  1136   1162   1523   1528   Ljava/lang/NumberFormatException;
        //  1166   1171   1523   1528   Ljava/lang/NumberFormatException;
        //  1177   1239   1528   1533   Ljava/lang/NumberFormatException;
        //  1243   1248   1533   1538   Ljava/lang/NumberFormatException;
        //  1254   1275   1538   1543   Ljava/lang/NumberFormatException;
        //  1279   1284   1543   1548   Ljava/lang/NumberFormatException;
        //  1290   1313   1548   1553   Ljava/lang/NumberFormatException;
        //  1317   1322   1553   1558   Ljava/lang/NumberFormatException;
        //  1328   1363   1558   1563   Ljava/lang/NumberFormatException;
        //  1368   1385   1563   1568   Ljava/lang/NumberFormatException;
        //  1389   1474   1477   1508   Ljava/lang/NumberFormatException;
        //  1510   1513   1513   1518   Ljava/lang/NumberFormatException;
        //  1515   1518   1518   1523   Ljava/lang/NumberFormatException;
        //  1525   1528   1528   1533   Ljava/lang/NumberFormatException;
        //  1530   1533   1533   1538   Ljava/lang/NumberFormatException;
        //  1535   1538   1538   1543   Ljava/lang/NumberFormatException;
        //  1540   1543   1543   1548   Ljava/lang/NumberFormatException;
        //  1545   1548   1548   1553   Ljava/lang/NumberFormatException;
        //  1550   1553   1553   1558   Ljava/lang/NumberFormatException;
        //  1555   1558   1558   1563   Ljava/lang/NumberFormatException;
        //  1560   1563   1563   1568   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 739, Size: 739
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
    
    protected void onPreExecute() {
        try {
            Log.i(asi.z[24]);
            if (!this.b.isFinishing()) {
                this.b.showDialog(24);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
}
