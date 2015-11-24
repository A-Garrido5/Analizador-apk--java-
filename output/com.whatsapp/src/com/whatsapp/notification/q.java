// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.os.Build$VERSION;
import android.net.Uri;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.whatsapp.a_9;
import java.util.HashMap;

final class q implements Runnable
{
    private static final HashMap a;
    private static final String[] d;
    private static final String[] z;
    private final a2 b;
    private final boolean c;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    
    static {
        final String[] array = new String[57];
        String s = "w<c8ym";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_1645:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = 'W';
                        break;
                    }
                    case 1: {
                        c2 = 'P';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "0\"e#l\b>e\"u1)U\"s95";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "\u0011\u0016L\u0010Z\u0011";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    n2 = 3;
                    array2 = array3;
                    s = "w#e#r3m";
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    n2 = 4;
                    s = ":5y%}05d9h>6c5}#9e83$1g3<";
                    n = 3;
                    array2 = array3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "4?gxk?1~%}' U&n26o$y93o%";
                    n = 4;
                    array2 = array3;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "w2c1h2(~l";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "w$e8yj3e8j2\"y7h>?d";
                    n = 6;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "w3e:s%md#p;";
                    n = 7;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "\u0011\u0016L\u0010Z\u0011";
                    n = 8;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    s = "w2c1l>3~#n2";
                    n = 9;
                    n2 = 10;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 11;
                    array2 = array3;
                    s = ":5y%}05d9h>6c5}#9e834%x;o0\u007fd#p;p";
                    n = 10;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "9?~?z.\u000fx?r0$e8y";
                    n = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "9?~?z>3k\"u8>*%i' x3o$5nl<9?~vu9p|3n>6c3xw\"o1u$$x7h>?dvo#1~3";
                    n = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "w<c1t#m";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "6>n$s>4$$y$?\u007f$\u007f2j%y\u007f8=$!t6$y7l'\u007f8g/fa<c-of";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "<5s";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "w3\u007f%h8=";
                    n = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = "w#i$y2>U:s4;7";
                    n = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 19;
                    s = "'8e8y";
                    n = 18;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    n2 = 20;
                    s = "9?~?z.\u000ff?{?$";
                    n = 19;
                    array2 = array3;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    n2 = 21;
                    s = ":5y%}05d9h>6c5}#9e83w>o!!";
                    n = 20;
                    array2 = array3;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    n2 = 22;
                    s = "0\"e#l\b>e\"u1)U:u08~";
                    n = 21;
                    array2 = array3;
                    continue;
                }
                case 21: {
                    array2[n2] = intern;
                    n2 = 23;
                    s = "w!\u007f?y#m";
                    n = 22;
                    array2 = array3;
                    continue;
                }
                case 22: {
                    array2[n2] = intern;
                    n2 = 24;
                    s = "4?gxk?1~%}' $?r#5d\"263~?s9~Z\u001a]\u000e";
                    n = 23;
                    array2 = array3;
                    continue;
                }
                case 23: {
                    array2[n2] = intern;
                    n2 = 25;
                    s = "9?~?z>3k\"u8>U>}$8";
                    n = 24;
                    array2 = array3;
                    continue;
                }
                case 24: {
                    array2[n2] = intern;
                    n2 = 26;
                    s = "w$e8yj>e\"u19i7h>?d";
                    n = 25;
                    array2 = array3;
                    continue;
                }
                case 25: {
                    array2[n2] = intern;
                    n2 = 27;
                    s = "w3e:s%m";
                    n = 26;
                    array2 = array3;
                    continue;
                }
                case 26: {
                    array2[n2] = intern;
                    s = "0\"e#l\b;o/C:5y%}05y";
                    n = 27;
                    n2 = 28;
                    array2 = array3;
                    continue;
                }
                case 27: {
                    array2[n2] = intern;
                    n2 = 29;
                    array2 = array3;
                    s = "w&c4n6$ok";
                    n = 28;
                    continue;
                }
                case 28: {
                    array2[n2] = intern;
                    n2 = 30;
                    s = ":5y%}05d9h>6c5}#9e839?~?z.";
                    n = 29;
                    array2 = array3;
                    continue;
                }
                case 29: {
                    array2[n2] = intern;
                    n2 = 31;
                    s = "w3e#r#m";
                    n = 30;
                    array2 = array3;
                    continue;
                }
                case 30: {
                    array2[n2] = intern;
                    n2 = 32;
                    s = "w<k${29i9r";
                    n = 31;
                    array2 = array3;
                    continue;
                }
                case 31: {
                    array2[n2] = intern;
                    n2 = 33;
                    s = "0\"e#l\b>e\"u1)U:u08~\t\u007f8<e$";
                    n = 32;
                    array2 = array3;
                    continue;
                }
                case 32: {
                    array2[n2] = intern;
                    n2 = 34;
                    s = "0\"e#l\b>e\"u1)U u5\"k\"y\b<o8{#8";
                    n = 33;
                    array2 = array3;
                    continue;
                }
                case 33: {
                    array2[n2] = intern;
                    n2 = 35;
                    s = ":#m";
                    n = 34;
                    array2 = array3;
                    continue;
                }
                case 34: {
                    array2[n2] = intern;
                    n2 = 36;
                    s = "w=o%o67ok";
                    n = 35;
                    array2 = array3;
                    continue;
                }
                case 35: {
                    array2[n2] = intern;
                    n2 = 37;
                    s = "w9d4s/j";
                    n = 36;
                    array2 = array3;
                    continue;
                }
                case 36: {
                    array2[n2] = intern;
                    n2 = 38;
                    s = "w8k%tj";
                    n = 37;
                    array2 = array3;
                    continue;
                }
                case 37: {
                    array2[n2] = intern;
                    n2 = 39;
                    s = "9?~?z>3k\"u8>U>}$8";
                    n = 38;
                    array2 = array3;
                    continue;
                }
                case 38: {
                    array2[n2] = intern;
                    n2 = 40;
                    s = "6>n$s>4$&y%=c%o>?dxI\u0007\u0014K\u0002Y\b\u0011Z\u0006C\u0018\u0000Y\tO\u0003\u0011^\u0005";
                    n = 39;
                    array2 = array3;
                    continue;
                }
                case 39: {
                    array2[n2] = intern;
                    n2 = 41;
                    s = "9?~?z.\u000f|?~%1~3C;5d1h?";
                    n = 40;
                    array2 = array3;
                    continue;
                }
                case 40: {
                    array2[n2] = intern;
                    n2 = 42;
                    s = "0\"e#l\b;o/C:5y%}05y";
                    n = 41;
                    array2 = array3;
                    continue;
                }
                case 41: {
                    array2[n2] = intern;
                    n2 = 43;
                    s = "9?~?z.\u000ff?{?$U5s;?x";
                    n = 42;
                    array2 = array3;
                    continue;
                }
                case 42: {
                    array2[n2] = intern;
                    n2 = 44;
                    s = "9?~?z>3k\"u8>yvx>#k4p24";
                    n = 43;
                    array2 = array3;
                    continue;
                }
                case 43: {
                    array2[n2] = intern;
                    n2 = 45;
                    s = ">#U8s#9l?\u007f6$c9rja";
                    n = 44;
                    array2 = array3;
                    continue;
                }
                case 44: {
                    array2[n2] = intern;
                    n2 = 46;
                    s = "#9~:y\b;o/";
                    n = 45;
                    array2 = array3;
                    continue;
                }
                case 45: {
                    array2[n2] = intern;
                    n2 = 47;
                    s = "9?~?z.\u000fx?r0$e8y";
                    n = 46;
                    array2 = array3;
                    continue;
                }
                case 46: {
                    array2[n2] = intern;
                    n2 = 48;
                    s = "9?~?z.\u000ff?{?$U5s;?x";
                    n = 47;
                    array2 = array3;
                    continue;
                }
                case 47: {
                    array2[n2] = intern;
                    n2 = 49;
                    s = "0\"e#l\b>e\"u1)U:u08~\t\u007f8<e$";
                    n = 48;
                    array2 = array3;
                    continue;
                }
                case 48: {
                    array2[n2] = intern;
                    n2 = 50;
                    s = "0\"e#l\b>e\"u1)U\"s95";
                    n = 49;
                    array2 = array3;
                    continue;
                }
                case 49: {
                    array2[n2] = intern;
                    n2 = 51;
                    s = "0\"e#l\b>e\"u1)U u5\"k\"y\b<o8{#8";
                    n = 50;
                    array2 = array3;
                    continue;
                }
                case 50: {
                    array2[n2] = intern;
                    n2 = 52;
                    s = "9?~?z.\u000f|?~%1~3C;5d1h?";
                    n = 51;
                    array2 = array3;
                    continue;
                }
                case 51: {
                    array2[n2] = intern;
                    n2 = 53;
                    s = "g`:f,g";
                    n = 52;
                    array2 = array3;
                    continue;
                }
                case 52: {
                    array2[n2] = intern;
                    n2 = 54;
                    s = "\u0011\u0016L\u0010Z\u0011";
                    n = 53;
                    array2 = array3;
                    continue;
                }
                case 53: {
                    array2[n2] = intern;
                    n2 = 55;
                    s = "g`:f,g";
                    n = 54;
                    array2 = array3;
                    continue;
                }
                case 54: {
                    array2[n2] = intern;
                    n2 = 56;
                    s = "\u0011\u0016L\u0010Z\u0011";
                    n = 55;
                    array2 = array3;
                    continue;
                }
                case 55: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = { null };
                    s = "\b9n";
                    n = 56;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 56: {
                    break Label_1645;
                }
            }
        }
        array2[n2] = intern;
        d = array3;
        a = new HashMap();
    }
    
    public q(final a2 b, final boolean e, final boolean g, final boolean c, final boolean f) {
        this.b = b;
        this.e = e;
        this.g = g;
        this.c = c;
        this.f = f;
    }
    
    private Bitmap a(final a_9 a_9, final int n, final int n2) {
        Bitmap bitmap = this.b(a_9, n, n2);
        if (bitmap == null) {
            bitmap = a_9.x();
        }
        return bitmap;
    }
    
    private boolean a(final SharedPreferences p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/notification/a2.b:()Lcom/whatsapp/notification/a2;
        //     3: astore_2       
        //     4: aload_2        
        //     5: aload_1        
        //     6: getstatic       com/whatsapp/qc.GROUP:Lcom/whatsapp/qc;
        //     9: invokevirtual   com/whatsapp/notification/a2.a:(Landroid/content/SharedPreferences;Lcom/whatsapp/qc;)I
        //    12: istore_3       
        //    13: aload_2        
        //    14: aload_1        
        //    15: getstatic       com/whatsapp/qc.INDIVIDUAL:Lcom/whatsapp/qc;
        //    18: invokevirtual   com/whatsapp/notification/a2.a:(Landroid/content/SharedPreferences;Lcom/whatsapp/qc;)I
        //    21: istore          4
        //    23: aload_1        
        //    24: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    27: bipush          50
        //    29: aaload         
        //    30: aconst_null    
        //    31: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    36: astore          5
        //    38: aload_1        
        //    39: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    42: bipush          47
        //    44: aaload         
        //    45: aconst_null    
        //    46: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    51: astore          6
        //    53: aload_1        
        //    54: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    57: bipush          49
        //    59: aaload         
        //    60: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    63: bipush          56
        //    65: aaload         
        //    66: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    71: astore          7
        //    73: aload_1        
        //    74: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    77: bipush          48
        //    79: aaload         
        //    80: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    83: bipush          54
        //    85: aaload         
        //    86: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    91: astore          8
        //    93: aload_1        
        //    94: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    97: bipush          51
        //    99: aaload         
        //   100: ldc             "1"
        //   102: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   107: astore          9
        //   109: aload_1        
        //   110: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //   113: bipush          52
        //   115: aaload         
        //   116: ldc             "1"
        //   118: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   123: astore          10
        //   125: iload_3        
        //   126: ifne            254
        //   129: iload           4
        //   131: ifne            254
        //   134: aload           5
        //   136: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   139: istore          17
        //   141: iload           17
        //   143: ifeq            254
        //   146: aload           6
        //   148: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   151: istore          18
        //   153: iload           18
        //   155: ifeq            254
        //   158: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //   161: bipush          55
        //   163: aaload         
        //   164: aload           7
        //   166: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   169: istore          19
        //   171: iload           19
        //   173: ifeq            254
        //   176: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //   179: bipush          53
        //   181: aaload         
        //   182: aload           8
        //   184: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   187: istore          20
        //   189: iload           20
        //   191: ifeq            254
        //   194: ldc             "0"
        //   196: aload           9
        //   198: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   201: istore          21
        //   203: iload           21
        //   205: ifeq            254
        //   208: ldc             "0"
        //   210: aload           10
        //   212: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   215: istore          22
        //   217: iload           22
        //   219: ifeq            254
        //   222: iconst_1       
        //   223: ireturn        
        //   224: astore          11
        //   226: aload           11
        //   228: athrow         
        //   229: astore          12
        //   231: aload           12
        //   233: athrow         
        //   234: astore          13
        //   236: aload           13
        //   238: athrow         
        //   239: astore          14
        //   241: aload           14
        //   243: athrow         
        //   244: astore          15
        //   246: aload           15
        //   248: athrow         
        //   249: astore          16
        //   251: aload           16
        //   253: athrow         
        //   254: iconst_0       
        //   255: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  134    141    224    229    Ljava/lang/NumberFormatException;
        //  146    153    229    234    Ljava/lang/NumberFormatException;
        //  158    171    234    239    Ljava/lang/NumberFormatException;
        //  176    189    239    244    Ljava/lang/NumberFormatException;
        //  194    203    244    249    Ljava/lang/NumberFormatException;
        //  208    217    249    254    Ljava/lang/NumberFormatException;
        //  226    229    229    234    Ljava/lang/NumberFormatException;
        //  231    234    234    239    Ljava/lang/NumberFormatException;
        //  236    239    239    244    Ljava/lang/NumberFormatException;
        //  241    244    244    249    Ljava/lang/NumberFormatException;
        //  246    249    249    254    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 122, Size: 122
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
    
    public static boolean a(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: getstatic       com/whatsapp/notification/q.a:Ljava/util/HashMap;
        //     5: aload_0        
        //     6: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //     9: checkcast       Ljava/lang/Boolean;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ifnull          35
        //    17: aload_2        
        //    18: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    21: istore          18
        //    23: iload           18
        //    25: istore          15
        //    27: iload           15
        //    29: ireturn        
        //    30: astore          17
        //    32: aload           17
        //    34: athrow         
        //    35: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    38: aload_0        
        //    39: getstatic       com/whatsapp/notification/q.d:[Ljava/lang/String;
        //    42: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    45: bipush          45
        //    47: aaload         
        //    48: aconst_null    
        //    49: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    52: bipush          46
        //    54: aaload         
        //    55: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    58: astore          9
        //    60: aload           9
        //    62: ifnull          149
        //    65: aload           9
        //    67: invokeinterface android/database/Cursor.getCount:()I
        //    72: istore          13
        //    74: iload           13
        //    76: ifle            149
        //    79: getstatic       com/whatsapp/notification/q.a:Ljava/util/HashMap;
        //    82: aload_0        
        //    83: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    86: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    89: pop            
        //    90: iconst_1       
        //    91: istore          15
        //    93: aload           9
        //    95: ifnull          27
        //    98: aload           9
        //   100: invokeinterface android/database/Cursor.close:()V
        //   105: iload           15
        //   107: ireturn        
        //   108: astore          16
        //   110: aload           16
        //   112: athrow         
        //   113: astore          11
        //   115: aload           11
        //   117: athrow         
        //   118: astore          12
        //   120: aload           9
        //   122: astore          4
        //   124: aload           4
        //   126: ifnull          136
        //   129: aload           4
        //   131: invokeinterface android/database/Cursor.close:()V
        //   136: getstatic       com/whatsapp/notification/q.a:Ljava/util/HashMap;
        //   139: aload_0        
        //   140: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   143: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   146: pop            
        //   147: iconst_0       
        //   148: ireturn        
        //   149: aload           9
        //   151: ifnull          136
        //   154: aload           9
        //   156: invokeinterface android/database/Cursor.close:()V
        //   161: goto            136
        //   164: astore          10
        //   166: aload           10
        //   168: athrow         
        //   169: astore          6
        //   171: aload           6
        //   173: athrow         
        //   174: astore          7
        //   176: aload_1        
        //   177: ifnull          186
        //   180: aload_1        
        //   181: invokeinterface android/database/Cursor.close:()V
        //   186: aload           7
        //   188: athrow         
        //   189: astore          8
        //   191: aload           8
        //   193: athrow         
        //   194: astore          7
        //   196: aload           9
        //   198: astore_1       
        //   199: goto            176
        //   202: astore_3       
        //   203: aconst_null    
        //   204: astore          4
        //   206: goto            124
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     23     30     35     Ljava/lang/Exception;
        //  35     60     202    209    Ljava/lang/Exception;
        //  35     60     174    176    Any
        //  65     74     113    118    Ljava/lang/Exception;
        //  65     74     194    202    Any
        //  79     90     118    124    Ljava/lang/Exception;
        //  79     90     194    202    Any
        //  98     105    108    113    Ljava/lang/Exception;
        //  115    118    118    124    Ljava/lang/Exception;
        //  115    118    194    202    Any
        //  129    136    169    174    Ljava/lang/Exception;
        //  154    161    164    169    Ljava/lang/Exception;
        //  180    186    189    194    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
    
    private Bitmap b(final a_9 a_9, final int n, final int n2) {
        final int min = Math.min(n, n2);
        Bitmap b = null;
        Label_0070: {
            while (true) {
                int n3;
                try {
                    if (Build$VERSION.SDK_INT < 21) {
                        break Label_0070;
                    }
                    n3 = -1;
                    b = a_9.b(min, n3);
                    if (b != null) {
                        return b;
                    }
                    final a_9 a_10 = a_9;
                    final boolean h = a_10.h;
                    final boolean h2 = h;
                    if (!h2) {
                        return b;
                    }
                    final int n4 = min;
                    if (n4 > 0) {
                        final a_9 a_11 = a_9;
                        final int n5 = min;
                        final int n6 = n3;
                        final float n7 = n6;
                        final boolean b2 = true;
                        return a_11.a(n5, n7, b2);
                    }
                    return b;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    final a_9 a_10 = a_9;
                    final boolean h2;
                    final boolean h = h2 = a_10.h;
                    if (!h2) {
                        return b;
                    }
                    final int n4 = min;
                    if (n4 > 0) {
                        final a_9 a_11 = a_9;
                        final int n5 = min;
                        final int n6 = n3;
                        final float n7 = n6;
                        final boolean b2 = true;
                        return a_11.a(n5, n7, b2);
                    }
                    return b;
                    n3 = 0;
                    continue;
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
                break;
            }
        }
        return b;
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: if_acmpne       7
        //     5: iconst_1       
        //     6: ireturn        
        //     7: aload_1        
        //     8: ifnull          28
        //    11: aload_0        
        //    12: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    15: astore_3       
        //    16: aload_1        
        //    17: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    20: astore          4
        //    22: aload_3        
        //    23: aload           4
        //    25: if_acmpeq       33
        //    28: iconst_0       
        //    29: ireturn        
        //    30: astore_2       
        //    31: aload_2        
        //    32: athrow         
        //    33: aload_1        
        //    34: checkcast       Lcom/whatsapp/notification/q;
        //    37: astore          5
        //    39: aload_0        
        //    40: getfield        com/whatsapp/notification/q.f:Z
        //    43: istore          11
        //    45: aload           5
        //    47: getfield        com/whatsapp/notification/q.f:Z
        //    50: istore          12
        //    52: iload           11
        //    54: iload           12
        //    56: if_icmpne       138
        //    59: aload_0        
        //    60: getfield        com/whatsapp/notification/q.e:Z
        //    63: istore          13
        //    65: aload           5
        //    67: getfield        com/whatsapp/notification/q.e:Z
        //    70: istore          14
        //    72: iload           13
        //    74: iload           14
        //    76: if_icmpne       138
        //    79: aload_0        
        //    80: getfield        com/whatsapp/notification/q.c:Z
        //    83: istore          15
        //    85: aload           5
        //    87: getfield        com/whatsapp/notification/q.c:Z
        //    90: istore          16
        //    92: iload           15
        //    94: iload           16
        //    96: if_icmpne       138
        //    99: aload_0        
        //   100: getfield        com/whatsapp/notification/q.g:Z
        //   103: istore          17
        //   105: aload           5
        //   107: getfield        com/whatsapp/notification/q.g:Z
        //   110: istore          18
        //   112: iload           17
        //   114: iload           18
        //   116: if_icmpne       138
        //   119: aload_0        
        //   120: getfield        com/whatsapp/notification/q.b:Lcom/whatsapp/notification/a2;
        //   123: aload           5
        //   125: getfield        com/whatsapp/notification/q.b:Lcom/whatsapp/notification/a2;
        //   128: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   131: istore          19
        //   133: iload           19
        //   135: ifne            5
        //   138: iconst_0       
        //   139: ireturn        
        //   140: astore          6
        //   142: aload           6
        //   144: athrow         
        //   145: astore          7
        //   147: aload           7
        //   149: athrow         
        //   150: astore          8
        //   152: aload           8
        //   154: athrow         
        //   155: astore          9
        //   157: aload           9
        //   159: athrow         
        //   160: astore          10
        //   162: aload           10
        //   164: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  11     22     30     33     Ljava/lang/NumberFormatException;
        //  39     52     140    145    Ljava/lang/NumberFormatException;
        //  59     72     145    150    Ljava/lang/NumberFormatException;
        //  79     92     150    155    Ljava/lang/NumberFormatException;
        //  99     112    155    160    Ljava/lang/NumberFormatException;
        //  119    133    160    165    Ljava/lang/NumberFormatException;
        //  142    145    145    150    Ljava/lang/NumberFormatException;
        //  147    150    150    155    Ljava/lang/NumberFormatException;
        //  152    155    155    160    Ljava/lang/NumberFormatException;
        //  157    160    160    165    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 85, Size: 85
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
    public int hashCode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: bipush          31
        //     4: aload_0        
        //     5: getfield        com/whatsapp/notification/q.b:Lcom/whatsapp/notification/a2;
        //     8: invokevirtual   java/lang/Object.hashCode:()I
        //    11: imul           
        //    12: istore_2       
        //    13: aload_0        
        //    14: getfield        com/whatsapp/notification/q.e:Z
        //    17: istore          4
        //    19: iload           4
        //    21: ifeq            103
        //    24: iload_1        
        //    25: istore          5
        //    27: bipush          31
        //    29: iload           5
        //    31: iload_2        
        //    32: iadd           
        //    33: imul           
        //    34: istore          6
        //    36: aload_0        
        //    37: getfield        com/whatsapp/notification/q.g:Z
        //    40: istore          8
        //    42: iload           8
        //    44: ifeq            114
        //    47: iload_1        
        //    48: istore          9
        //    50: bipush          31
        //    52: iload           9
        //    54: iload           6
        //    56: iadd           
        //    57: imul           
        //    58: istore          10
        //    60: aload_0        
        //    61: getfield        com/whatsapp/notification/q.c:Z
        //    64: istore          12
        //    66: iload           12
        //    68: ifeq            125
        //    71: iload_1        
        //    72: istore          13
        //    74: bipush          31
        //    76: iload           13
        //    78: iload           10
        //    80: iadd           
        //    81: imul           
        //    82: istore          14
        //    84: aload_0        
        //    85: getfield        com/whatsapp/notification/q.f:Z
        //    88: istore          16
        //    90: iload           16
        //    92: ifeq            136
        //    95: iload           14
        //    97: iload_1        
        //    98: iadd           
        //    99: ireturn        
        //   100: astore_3       
        //   101: aload_3        
        //   102: athrow         
        //   103: iconst_0       
        //   104: istore          5
        //   106: goto            27
        //   109: astore          7
        //   111: aload           7
        //   113: athrow         
        //   114: iconst_0       
        //   115: istore          9
        //   117: goto            50
        //   120: astore          11
        //   122: aload           11
        //   124: athrow         
        //   125: iconst_0       
        //   126: istore          13
        //   128: goto            74
        //   131: astore          15
        //   133: aload           15
        //   135: athrow         
        //   136: iconst_0       
        //   137: istore_1       
        //   138: goto            95
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  13     19     100    103    Ljava/lang/NumberFormatException;
        //  36     42     109    114    Ljava/lang/NumberFormatException;
        //  60     66     120    125    Ljava/lang/NumberFormatException;
        //  84     90     131    136    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 80, Size: 80
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
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     7: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //    10: iconst_3       
        //    11: if_icmpeq       27
        //    14: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    17: bipush          13
        //    19: aaload         
        //    20: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    23: return         
        //    24: astore_2       
        //    25: aload_2        
        //    26: athrow         
        //    27: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    30: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    33: iconst_5       
        //    34: aaload         
        //    35: iconst_0       
        //    36: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    39: astore_3       
        //    40: aload_0        
        //    41: aload_3        
        //    42: invokespecial   com/whatsapp/notification/q.a:(Landroid/content/SharedPreferences;)Z
        //    45: ifeq            63
        //    48: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    51: bipush          44
        //    53: aaload         
        //    54: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    57: return         
        //    58: astore          4
        //    60: aload           4
        //    62: athrow         
        //    63: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    66: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //    69: bipush          19
        //    71: aaload         
        //    72: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    75: checkcast       Landroid/telephony/TelephonyManager;
        //    78: astore          5
        //    80: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    83: invokestatic    android/support/v4/app/NotificationManagerCompat.from:(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
        //    86: astore          6
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: astore          7
        //    97: new             Ljava/lang/StringBuilder;
        //   100: dup            
        //   101: invokespecial   java/lang/StringBuilder.<init>:()V
        //   104: astore          8
        //   106: invokestatic    com/whatsapp/z8.j:()Ljava/util/ArrayList;
        //   109: astore          9
        //   111: aload           9
        //   113: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   116: astore          10
        //   118: iconst_0       
        //   119: istore          11
        //   121: iconst_0       
        //   122: istore          12
        //   124: aconst_null    
        //   125: astore          13
        //   127: aconst_null    
        //   128: astore          14
        //   130: aload           10
        //   132: invokeinterface java/util/Iterator.hasNext:()Z
        //   137: ifeq            5122
        //   140: aload           10
        //   142: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   147: checkcast       Ljava/lang/String;
        //   150: astore_w        340
        //   154: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   157: aload_w         340
        //   161: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   164: astore_w        341
        //   168: aload_w         341
        //   172: getfield        com/whatsapp/a_9.l:I
        //   175: ifle            5095
        //   178: iload           12
        //   180: aload_w         341
        //   184: getfield        com/whatsapp/a_9.l:I
        //   187: iadd           
        //   188: istore_w        346
        //   192: iload           11
        //   194: iconst_1       
        //   195: iadd           
        //   196: istore_w        347
        //   200: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   203: aload_w         341
        //   207: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   210: invokevirtual   com/whatsapp/vy.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //   213: astore_w        348
        //   217: aload_w         348
        //   221: ifnull          5080
        //   224: aload           14
        //   226: ifnull          261
        //   229: aload           14
        //   231: getfield        com/whatsapp/protocol/bi.u:J
        //   234: lstore_w        352
        //   238: aload_w         348
        //   242: getfield        com/whatsapp/protocol/bi.u:J
        //   245: lstore_w        354
        //   249: lload_w         352
        //   253: lload_w         354
        //   257: lcmp           
        //   258: ifge            5065
        //   261: aload_w         348
        //   265: astore_w        342
        //   269: aload_w         341
        //   273: astore_w        343
        //   277: aload           8
        //   279: aload_w         348
        //   283: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   286: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //   289: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   292: aload_w         348
        //   296: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   299: getfield        com/whatsapp/protocol/c6.b:Z
        //   302: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   305: aload_w         348
        //   309: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   312: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   315: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   318: pop            
        //   319: iload_1        
        //   320: ifeq            5168
        //   323: new             Ljava/lang/StringBuilder;
        //   326: dup            
        //   327: invokespecial   java/lang/StringBuilder.<init>:()V
        //   330: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //   333: bipush          11
        //   335: aaload         
        //   336: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   339: aload_w         341
        //   343: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: ldc_w           " "
        //   352: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   355: aload_w         341
        //   359: getfield        com/whatsapp/a_9.l:I
        //   362: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   365: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   368: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   371: iload_w         346
        //   375: istore_w        344
        //   379: iload_w         347
        //   383: istore_w        345
        //   387: iload_1        
        //   388: ifeq            5141
        //   391: aload_w         342
        //   395: astore          15
        //   397: aload_w         343
        //   401: astore          16
        //   403: iload_w         344
        //   407: istore          17
        //   409: iload_w         345
        //   413: istore          18
        //   415: aload           8
        //   417: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   420: invokestatic    com/whatsapp/al5.d:(Ljava/lang/String;)Ljava/lang/String;
        //   423: astore          19
        //   425: aload_3        
        //   426: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //   429: bipush          25
        //   431: aaload         
        //   432: aconst_null    
        //   433: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   438: astore          20
        //   440: aload           19
        //   442: aload           20
        //   444: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   447: ifeq            500
        //   450: new             Ljava/lang/StringBuilder;
        //   453: dup            
        //   454: invokespecial   java/lang/StringBuilder.<init>:()V
        //   457: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //   460: iconst_4       
        //   461: aaload         
        //   462: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   465: aload           19
        //   467: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   470: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   473: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   476: return         
        //   477: astore          21
        //   479: aload           21
        //   481: athrow         
        //   482: astore_w        351
        //   486: aload_w         351
        //   490: athrow         
        //   491: astore_w        349
        //   495: aload_w         349
        //   499: athrow         
        //   500: iload           18
        //   502: ifeq            510
        //   505: aload           16
        //   507: ifnonnull       522
        //   510: aload           6
        //   512: iconst_1       
        //   513: invokevirtual   android/support/v4/app/NotificationManagerCompat.cancel:(I)V
        //   516: return         
        //   517: astore          22
        //   519: aload           22
        //   521: athrow         
        //   522: aload           16
        //   524: invokevirtual   com/whatsapp/a_9.m:()Z
        //   527: ifeq            592
        //   530: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   533: aload           16
        //   535: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   538: invokestatic    com/whatsapp/notification/y.c:(Landroid/content/Context;Ljava/lang/String;)Z
        //   541: istore_w        338
        //   545: iload_w         338
        //   549: ifne            592
        //   552: aload_0        
        //   553: getfield        com/whatsapp/notification/q.e:Z
        //   556: istore_w        339
        //   560: iload_w         339
        //   564: ifeq            23
        //   567: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   570: invokestatic    com/whatsapp/appwidget/WidgetProvider.a:(Landroid/content/Context;)V
        //   573: invokestatic    com/whatsapp/App.s:()V
        //   576: return         
        //   577: astore          25
        //   579: aload           25
        //   581: athrow         
        //   582: astore          23
        //   584: aload           23
        //   586: athrow         
        //   587: astore          24
        //   589: aload           24
        //   591: athrow         
        //   592: aload           16
        //   594: ifnonnull       601
        //   597: iload_1        
        //   598: ifeq            5059
        //   601: aload_0        
        //   602: getfield        com/whatsapp/notification/q.b:Lcom/whatsapp/notification/a2;
        //   605: astore          28
        //   607: aload           16
        //   609: invokevirtual   com/whatsapp/a_9.m:()Z
        //   612: istore          29
        //   614: iload           29
        //   616: ifeq            4155
        //   619: getstatic       com/whatsapp/qc.GROUP:Lcom/whatsapp/qc;
        //   622: astore          30
        //   624: aload           28
        //   626: aload_3        
        //   627: aload           30
        //   629: invokevirtual   com/whatsapp/notification/a2.a:(Landroid/content/SharedPreferences;Lcom/whatsapp/qc;)I
        //   632: istore          31
        //   634: new             Ljava/lang/StringBuilder;
        //   637: dup            
        //   638: invokespecial   java/lang/StringBuilder.<init>:()V
        //   641: astore          32
        //   643: iload           18
        //   645: iconst_1       
        //   646: if_icmpne       748
        //   649: aload           16
        //   651: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   654: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   657: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //   660: astore          33
        //   662: iload           17
        //   664: iconst_1       
        //   665: if_icmpne       693
        //   668: aload           32
        //   670: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   673: aload           15
        //   675: aload           16
        //   677: iconst_0       
        //   678: iconst_0       
        //   679: invokestatic    com/whatsapp/notification/y.a:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;ZZ)Ljava/lang/CharSequence;
        //   682: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //   685: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   688: pop            
        //   689: iload_1        
        //   690: ifeq            843
        //   693: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   696: ldc_w           2131296291
        //   699: iload           17
        //   701: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   704: astore_w        333
        //   708: iconst_1       
        //   709: anewarray       Ljava/lang/Object;
        //   712: astore_w        334
        //   716: aload_w         334
        //   720: iconst_0       
        //   721: iload           17
        //   723: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   726: aastore        
        //   727: aload           32
        //   729: aload_w         333
        //   733: aload_w         334
        //   737: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   740: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   743: pop            
        //   744: iload_1        
        //   745: ifeq            843
        //   748: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   751: ldc_w           2131231990
        //   754: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //   757: astore          33
        //   759: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   762: ldc_w           2131296292
        //   765: iload           17
        //   767: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   770: astore          34
        //   772: iconst_1       
        //   773: anewarray       Ljava/lang/Object;
        //   776: astore          35
        //   778: aload           35
        //   780: iconst_0       
        //   781: iload           17
        //   783: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   786: aastore        
        //   787: aload           34
        //   789: aload           35
        //   791: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   794: astore          36
        //   796: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   799: ldc_w           2131296293
        //   802: iload           18
        //   804: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   807: astore          37
        //   809: iconst_2       
        //   810: anewarray       Ljava/lang/Object;
        //   813: astore          38
        //   815: aload           38
        //   817: iconst_0       
        //   818: aload           36
        //   820: aastore        
        //   821: aload           38
        //   823: iconst_1       
        //   824: iload           18
        //   826: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   829: aastore        
        //   830: aload           32
        //   832: aload           37
        //   834: aload           38
        //   836: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   839: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   842: pop            
        //   843: aload           33
        //   845: astore          40
        //   847: aload_0        
        //   848: getfield        com/whatsapp/notification/q.e:Z
        //   851: ifne            869
        //   854: aload_0        
        //   855: getfield        com/whatsapp/notification/q.f:Z
        //   858: istore_w        331
        //   862: iload_w         331
        //   866: ifeq            23
        //   869: new             Landroid/support/v4/app/NotificationCompat$Builder;
        //   872: dup            
        //   873: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   876: invokespecial   android/support/v4/app/NotificationCompat$Builder.<init>:(Landroid/content/Context;)V
        //   879: astore          43
        //   881: aload           43
        //   883: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //   886: bipush          35
        //   888: aaload         
        //   889: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setCategory:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   892: pop            
        //   893: aload           16
        //   895: invokevirtual   com/whatsapp/a_9.m:()Z
        //   898: ifne            933
        //   901: aload           16
        //   903: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   906: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/ContentResolver;)Landroid/net/Uri;
        //   909: astore_w        328
        //   913: aload_w         328
        //   917: ifnull          933
        //   920: aload           43
        //   922: aload_w         328
        //   926: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   929: invokevirtual   android/support/v4/app/NotificationCompat$Builder.addPerson:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   932: pop            
        //   933: aload           43
        //   935: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //   938: bipush          28
        //   940: aaload         
        //   941: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setGroup:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   944: pop            
        //   945: aload           43
        //   947: iconst_1       
        //   948: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setGroupSummary:(Z)Landroid/support/v4/app/NotificationCompat$Builder;
        //   951: pop            
        //   952: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   955: istore          50
        //   957: iload           50
        //   959: bipush          16
        //   961: if_icmplt       5050
        //   964: iload           18
        //   966: iconst_1       
        //   967: if_icmpne       5050
        //   970: aload           15
        //   972: getfield        com/whatsapp/protocol/bi.I:B
        //   975: istore_w        326
        //   979: iload_w         326
        //   983: iconst_1       
        //   984: if_icmpne       5050
        //   987: aload           15
        //   989: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   992: astore_w        327
        //   996: aload_w         327
        //  1000: ifnull          5050
        //  1003: aload           15
        //  1005: invokestatic    com/whatsapp/App.m:(Lcom/whatsapp/protocol/bi;)Landroid/graphics/Bitmap;
        //  1008: astore          51
        //  1010: aload           51
        //  1012: astore          52
        //  1014: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1017: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //  1020: ldc_w           17104901
        //  1023: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //  1026: istore          53
        //  1028: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1031: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //  1034: ldc_w           17104902
        //  1037: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //  1040: istore          54
        //  1042: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1045: istore          57
        //  1047: iload           57
        //  1049: bipush          11
        //  1051: if_icmplt       1167
        //  1054: aload           16
        //  1056: ifnull          1167
        //  1059: iload           18
        //  1061: iconst_1       
        //  1062: if_icmpne       1167
        //  1065: aload_0        
        //  1066: aload           16
        //  1068: iload           53
        //  1070: iload           54
        //  1072: invokespecial   com/whatsapp/notification/q.b:(Lcom/whatsapp/a_9;II)Landroid/graphics/Bitmap;
        //  1075: astore_w        319
        //  1079: aload_w         319
        //  1083: ifnull          1137
        //  1086: aload           7
        //  1088: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  1091: bipush          32
        //  1093: aaload         
        //  1094: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1097: pop            
        //  1098: aload           43
        //  1100: aload_w         319
        //  1104: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setLargeIcon:(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1107: pop            
        //  1108: invokestatic    com/whatsapp/notification/AndroidWear.a:()Z
        //  1111: istore_w        325
        //  1115: iload_w         325
        //  1119: ifeq            5022
        //  1122: aload           51
        //  1124: ifnonnull       5022
        //  1127: iload_1        
        //  1128: ifeq            5035
        //  1131: aload_w         319
        //  1135: astore          51
        //  1137: aload           16
        //  1139: iload           53
        //  1141: iload           54
        //  1143: invokestatic    java/lang/Math.min:(II)I
        //  1146: invokevirtual   com/whatsapp/a_9.a:(I)Landroid/graphics/Bitmap;
        //  1149: astore_w        319
        //  1153: aload           43
        //  1155: aload_w         319
        //  1159: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setLargeIcon:(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1162: pop            
        //  1163: iload_1        
        //  1164: ifeq            5022
        //  1167: aconst_null    
        //  1168: astore          58
        //  1170: aload           51
        //  1172: astore          59
        //  1174: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1177: istore          61
        //  1179: iload           61
        //  1181: bipush          16
        //  1183: if_icmplt       2765
        //  1186: iload           17
        //  1188: iconst_1       
        //  1189: if_icmple       2229
        //  1192: new             Ljava/util/ArrayList;
        //  1195: dup            
        //  1196: invokespecial   java/util/ArrayList.<init>:()V
        //  1199: astore          210
        //  1201: new             Ljava/util/ArrayList;
        //  1204: dup            
        //  1205: invokespecial   java/util/ArrayList.<init>:()V
        //  1208: astore          211
        //  1210: aload           9
        //  1212: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1215: astore          212
        //  1217: aload           212
        //  1219: invokeinterface java/util/Iterator.hasNext:()Z
        //  1224: ifeq            1298
        //  1227: aload           212
        //  1229: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1234: checkcast       Ljava/lang/String;
        //  1237: astore_w        314
        //  1241: aload_0        
        //  1242: getfield        com/whatsapp/notification/q.b:Lcom/whatsapp/notification/a2;
        //  1245: aload_w         314
        //  1249: invokevirtual   com/whatsapp/notification/a2.c:(Ljava/lang/String;)Ljava/util/List;
        //  1252: astore_w        315
        //  1256: aload_w         315
        //  1260: invokeinterface java/util/List.size:()I
        //  1265: ifle            1284
        //  1268: aload           211
        //  1270: aload_w         315
        //  1274: iconst_0       
        //  1275: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1280: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1283: pop            
        //  1284: aload           210
        //  1286: aload_w         315
        //  1290: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  1293: pop            
        //  1294: iload_1        
        //  1295: ifeq            1217
        //  1298: aload           210
        //  1300: new             Lcom/whatsapp/notification/i;
        //  1303: dup            
        //  1304: aload_0        
        //  1305: invokespecial   com/whatsapp/notification/i.<init>:(Lcom/whatsapp/notification/q;)V
        //  1308: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //  1311: aload           210
        //  1313: invokevirtual   java/util/ArrayList.size:()I
        //  1316: iconst_1       
        //  1317: if_icmple       1533
        //  1320: new             Landroid/support/v4/app/NotificationCompat$InboxStyle;
        //  1323: dup            
        //  1324: invokespecial   android/support/v4/app/NotificationCompat$InboxStyle.<init>:()V
        //  1327: astore          213
        //  1329: iconst_0       
        //  1330: bipush          -7
        //  1332: aload           210
        //  1334: invokevirtual   java/util/ArrayList.size:()I
        //  1337: iadd           
        //  1338: invokestatic    java/lang/Math.max:(II)I
        //  1341: istore          214
        //  1343: iload           214
        //  1345: aload           210
        //  1347: invokevirtual   java/util/ArrayList.size:()I
        //  1350: if_icmpge       1492
        //  1353: aload           210
        //  1355: iload           214
        //  1357: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1360: checkcast       Lcom/whatsapp/protocol/bi;
        //  1363: astore_w        305
        //  1367: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //  1370: aload_w         305
        //  1374: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1377: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //  1380: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //  1383: astore_w        306
        //  1387: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1390: astore_w        308
        //  1394: iload           18
        //  1396: iconst_1       
        //  1397: if_icmple       4266
        //  1400: iconst_1       
        //  1401: istore_w        309
        //  1405: aload_w         308
        //  1409: aload_w         305
        //  1413: aload_w         306
        //  1417: iload_w         309
        //  1421: iconst_0       
        //  1422: invokestatic    com/whatsapp/notification/y.a:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;ZZ)Ljava/lang/CharSequence;
        //  1425: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //  1428: astore_w        310
        //  1432: aload           213
        //  1434: aload_w         310
        //  1438: invokevirtual   android/support/v4/app/NotificationCompat$InboxStyle.addLine:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;
        //  1441: pop            
        //  1442: aload           7
        //  1444: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  1447: iconst_0       
        //  1448: aaload         
        //  1449: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1452: iload           214
        //  1454: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1457: ldc_w           "("
        //  1460: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1463: aload_w         310
        //  1467: invokevirtual   java/lang/String.length:()I
        //  1470: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1473: ldc_w           ")"
        //  1476: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1479: pop            
        //  1480: iload           214
        //  1482: iconst_1       
        //  1483: iadd           
        //  1484: istore_w        313
        //  1488: iload_1        
        //  1489: ifeq            5013
        //  1492: aload           213
        //  1494: aload           32
        //  1496: invokevirtual   android/support/v4/app/NotificationCompat$InboxStyle.setSummaryText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;
        //  1499: pop            
        //  1500: aload           43
        //  1502: aload           213
        //  1504: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setStyle:(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1507: pop            
        //  1508: aload           7
        //  1510: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  1513: bipush          37
        //  1515: aaload         
        //  1516: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1519: bipush          8
        //  1521: aload           210
        //  1523: invokevirtual   java/util/ArrayList.size:()I
        //  1526: invokestatic    java/lang/Math.min:(II)I
        //  1529: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1532: pop            
        //  1533: invokestatic    com/whatsapp/notification/AndroidWear.a:()Z
        //  1536: ifeq            2225
        //  1539: aload_0        
        //  1540: getfield        com/whatsapp/notification/q.f:Z
        //  1543: istore_w        268
        //  1547: iload_w         268
        //  1551: ifeq            1560
        //  1554: iload           18
        //  1556: iconst_1       
        //  1557: if_icmpgt       2225
        //  1560: aload           211
        //  1562: new             Lcom/whatsapp/notification/i;
        //  1565: dup            
        //  1566: aload_0        
        //  1567: invokespecial   com/whatsapp/notification/i.<init>:(Lcom/whatsapp/notification/q;)V
        //  1570: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //  1573: new             Landroid/support/v4/app/NotificationCompat$Builder;
        //  1576: dup            
        //  1577: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1580: invokespecial   android/support/v4/app/NotificationCompat$Builder.<init>:(Landroid/content/Context;)V
        //  1583: astore_w        269
        //  1587: aload_w         269
        //  1591: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  1594: bipush          42
        //  1596: aaload         
        //  1597: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setGroup:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1600: pop            
        //  1601: aload_w         269
        //  1605: ldc_w           2130838963
        //  1608: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setSmallIcon:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1611: pop            
        //  1612: aload_w         269
        //  1616: iconst_1       
        //  1617: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setOnlyAlertOnce:(Z)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1620: pop            
        //  1621: iconst_0       
        //  1622: istore_w        273
        //  1626: iload_w         273
        //  1630: iconst_0       
        //  1631: bipush          -7
        //  1633: aload           211
        //  1635: invokevirtual   java/util/ArrayList.size:()I
        //  1638: iadd           
        //  1639: invokestatic    java/lang/Math.max:(II)I
        //  1642: if_icmpge       5002
        //  1645: aload           6
        //  1647: aload           211
        //  1649: iload_w         273
        //  1653: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1656: checkcast       Lcom/whatsapp/protocol/bi;
        //  1659: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1662: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //  1665: iconst_1       
        //  1666: invokevirtual   android/support/v4/app/NotificationManagerCompat.cancel:(Ljava/lang/String;I)V
        //  1669: iload_w         273
        //  1673: iconst_1       
        //  1674: iadd           
        //  1675: istore_w        300
        //  1679: iload_1        
        //  1680: ifeq            4991
        //  1683: iload_w         300
        //  1687: istore_w        274
        //  1691: aload           211
        //  1693: invokevirtual   java/util/ArrayList.size:()I
        //  1696: istore_w        275
        //  1700: iload_w         274
        //  1704: iload_w         275
        //  1708: if_icmpge       2225
        //  1711: aload           211
        //  1713: iload_w         274
        //  1717: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1720: checkcast       Lcom/whatsapp/protocol/bi;
        //  1723: astore_w        276
        //  1727: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //  1730: aload_w         276
        //  1734: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1737: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //  1740: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //  1743: astore_w        277
        //  1747: aload_w         269
        //  1751: aload           58
        //  1753: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setLargeIcon:(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1756: pop            
        //  1757: aload_w         269
        //  1761: aload_w         276
        //  1765: getfield        com/whatsapp/protocol/bi.u:J
        //  1768: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setWhen:(J)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1771: pop            
        //  1772: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1775: aload_w         276
        //  1779: aload_w         277
        //  1783: invokestatic    com/whatsapp/notification/y.a:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;)Lcom/whatsapp/notification/u;
        //  1786: astore_w        280
        //  1790: aload_w         269
        //  1794: aload_w         280
        //  1798: invokevirtual   com/whatsapp/notification/u.a:()Ljava/lang/CharSequence;
        //  1801: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //  1804: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1807: pop            
        //  1808: aload_w         269
        //  1812: aload_w         280
        //  1816: invokevirtual   com/whatsapp/notification/u.b:()Ljava/lang/CharSequence;
        //  1819: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //  1822: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1825: pop            
        //  1826: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1829: astore_w        284
        //  1833: iload           18
        //  1835: iconst_1       
        //  1836: if_icmpne       4293
        //  1839: iconst_1       
        //  1840: istore_w        285
        //  1844: aload_w         269
        //  1848: aload_w         284
        //  1852: aload_w         277
        //  1856: iconst_0       
        //  1857: aconst_null    
        //  1858: iload_w         285
        //  1862: aload           59
        //  1864: invokestatic    com/whatsapp/notification/AndroidWear.a:(Landroid/content/Context;Lcom/whatsapp/a_9;ZLcom/whatsapp/protocol/bi;ZLandroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$WearableExtender;
        //  1867: invokevirtual   android/support/v4/app/NotificationCompat$Builder.extend:(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  1870: pop            
        //  1871: new             Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  1874: dup            
        //  1875: aload_w         277
        //  1879: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1882: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //  1885: invokespecial   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.<init>:(Ljava/lang/String;)V
        //  1888: astore_w        287
        //  1892: new             Ljava/util/ArrayList;
        //  1895: dup            
        //  1896: aload_0        
        //  1897: getfield        com/whatsapp/notification/q.b:Lcom/whatsapp/notification/a2;
        //  1900: aload_w         277
        //  1904: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  1907: invokevirtual   com/whatsapp/notification/a2.c:(Ljava/lang/String;)Ljava/util/List;
        //  1910: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  1913: astore_w        288
        //  1917: aload_w         288
        //  1921: invokestatic    java/util/Collections.reverse:(Ljava/util/List;)V
        //  1924: aload_w         288
        //  1928: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1931: astore_w        289
        //  1935: aload_w         289
        //  1939: invokeinterface java/util/Iterator.hasNext:()Z
        //  1944: ifeq            2018
        //  1947: aload_w         289
        //  1951: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1956: checkcast       Lcom/whatsapp/protocol/bi;
        //  1959: astore_w        301
        //  1963: aload_w         301
        //  1967: getfield        com/whatsapp/protocol/bi.I:B
        //  1970: ifne            1988
        //  1973: aload_w         301
        //  1977: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //  1980: astore_w        304
        //  1984: iload_1        
        //  1985: ifeq            4980
        //  1988: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1991: aload_w         301
        //  1995: invokestatic    com/whatsapp/notification/y.a:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)Ljava/lang/String;
        //  1998: astore_w        302
        //  2002: aload_w         287
        //  2006: aload_w         302
        //  2010: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.addMessage:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2013: pop            
        //  2014: iload_1        
        //  2015: ifeq            1935
        //  2018: aload_w         287
        //  2022: aload_w         276
        //  2026: getfield        com/whatsapp/protocol/bi.u:J
        //  2029: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.setLatestTimestamp:(J)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2032: pop            
        //  2033: aload_w         287
        //  2037: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2040: aload_w         277
        //  2044: invokestatic    com/whatsapp/notification/AndroidWear.a:(Landroid/content/Context;Lcom/whatsapp/a_9;)Landroid/app/PendingIntent;
        //  2047: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2050: aload_w         277
        //  2054: invokestatic    com/whatsapp/notification/AndroidWear.c:(Landroid/content/Context;Lcom/whatsapp/a_9;)Landroid/support/v4/app/RemoteInput;
        //  2057: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.setReplyAction:(Landroid/app/PendingIntent;Landroid/support/v4/app/RemoteInput;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2060: pop            
        //  2061: aload_w         287
        //  2065: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2068: aload_w         277
        //  2072: invokestatic    com/whatsapp/notification/AndroidWear.b:(Landroid/content/Context;Lcom/whatsapp/a_9;)Landroid/app/PendingIntent;
        //  2075: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.setReadPendingIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2078: pop            
        //  2079: new             Landroid/support/v4/app/NotificationCompat$CarExtender;
        //  2082: dup            
        //  2083: invokespecial   android/support/v4/app/NotificationCompat$CarExtender.<init>:()V
        //  2086: astore_w        293
        //  2090: aload_w         293
        //  2094: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2097: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //  2100: ldc_w           2131623942
        //  2103: invokevirtual   android/content/res/Resources.getColor:(I)I
        //  2106: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender.setColor:(I)Landroid/support/v4/app/NotificationCompat$CarExtender;
        //  2109: pop            
        //  2110: aload_w         293
        //  2114: aload_w         287
        //  2118: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.build:()Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;
        //  2121: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender.setUnreadConversation:(Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;)Landroid/support/v4/app/NotificationCompat$CarExtender;
        //  2124: pop            
        //  2125: aload_w         293
        //  2129: aload_0        
        //  2130: aload_w         277
        //  2134: iload           53
        //  2136: iload           54
        //  2138: invokespecial   com/whatsapp/notification/q.a:(Lcom/whatsapp/a_9;II)Landroid/graphics/Bitmap;
        //  2141: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender.setLargeIcon:(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$CarExtender;
        //  2144: pop            
        //  2145: aload_w         269
        //  2149: aload_w         293
        //  2153: invokevirtual   android/support/v4/app/NotificationCompat$Builder.extend:(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2156: pop            
        //  2157: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2160: aload_w         277
        //  2164: invokestatic    com/whatsapp/Conversation.a:(Landroid/content/Context;Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //  2167: astore_w        298
        //  2171: aload_w         269
        //  2175: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2178: iconst_0       
        //  2179: aload_w         298
        //  2183: iconst_0       
        //  2184: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //  2187: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2190: pop            
        //  2191: aload           6
        //  2193: aload_w         277
        //  2197: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  2200: iconst_1       
        //  2201: aload_w         269
        //  2205: invokevirtual   android/support/v4/app/NotificationCompat$Builder.build:()Landroid/app/Notification;
        //  2208: invokevirtual   android/support/v4/app/NotificationManagerCompat.notify:(Ljava/lang/String;ILandroid/app/Notification;)V
        //  2211: iload_w         274
        //  2215: iconst_1       
        //  2216: iadd           
        //  2217: istore_w        300
        //  2221: iload_1        
        //  2222: ifeq            1683
        //  2225: iload_1        
        //  2226: ifeq            2765
        //  2229: invokestatic    com/whatsapp/notification/AndroidWear.a:()Z
        //  2232: istore          222
        //  2234: iload           222
        //  2236: ifeq            2259
        //  2239: aload           43
        //  2241: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2244: aload           16
        //  2246: iconst_1       
        //  2247: aload           15
        //  2249: iconst_1       
        //  2250: aload           59
        //  2252: invokestatic    com/whatsapp/notification/AndroidWear.a:(Landroid/content/Context;Lcom/whatsapp/a_9;ZLcom/whatsapp/protocol/bi;ZLandroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$WearableExtender;
        //  2255: invokevirtual   android/support/v4/app/NotificationCompat$Builder.extend:(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2258: pop            
        //  2259: new             Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2262: dup            
        //  2263: aload           16
        //  2265: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2268: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //  2271: invokespecial   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.<init>:(Ljava/lang/String;)V
        //  2274: astore          223
        //  2276: aload           223
        //  2278: aload           32
        //  2280: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2283: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.addMessage:(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2286: pop            
        //  2287: aload           223
        //  2289: aload           15
        //  2291: getfield        com/whatsapp/protocol/bi.u:J
        //  2294: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.setLatestTimestamp:(J)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2297: pop            
        //  2298: aload           223
        //  2300: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2303: aload           16
        //  2305: invokestatic    com/whatsapp/notification/AndroidWear.a:(Landroid/content/Context;Lcom/whatsapp/a_9;)Landroid/app/PendingIntent;
        //  2308: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2311: aload           16
        //  2313: invokestatic    com/whatsapp/notification/AndroidWear.c:(Landroid/content/Context;Lcom/whatsapp/a_9;)Landroid/support/v4/app/RemoteInput;
        //  2316: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.setReplyAction:(Landroid/app/PendingIntent;Landroid/support/v4/app/RemoteInput;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2319: pop            
        //  2320: aload           223
        //  2322: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2325: aload           16
        //  2327: invokestatic    com/whatsapp/notification/AndroidWear.b:(Landroid/content/Context;Lcom/whatsapp/a_9;)Landroid/app/PendingIntent;
        //  2330: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.setReadPendingIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;
        //  2333: pop            
        //  2334: new             Landroid/support/v4/app/NotificationCompat$CarExtender;
        //  2337: dup            
        //  2338: invokespecial   android/support/v4/app/NotificationCompat$CarExtender.<init>:()V
        //  2341: astore          228
        //  2343: aload           228
        //  2345: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2348: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //  2351: ldc_w           2131623942
        //  2354: invokevirtual   android/content/res/Resources.getColor:(I)I
        //  2357: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender.setColor:(I)Landroid/support/v4/app/NotificationCompat$CarExtender;
        //  2360: pop            
        //  2361: aload           228
        //  2363: aload           223
        //  2365: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder.build:()Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;
        //  2368: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender.setUnreadConversation:(Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;)Landroid/support/v4/app/NotificationCompat$CarExtender;
        //  2371: pop            
        //  2372: aload           228
        //  2374: aload_0        
        //  2375: aload           16
        //  2377: iload           53
        //  2379: iload           54
        //  2381: invokespecial   com/whatsapp/notification/q.a:(Lcom/whatsapp/a_9;II)Landroid/graphics/Bitmap;
        //  2384: invokevirtual   android/support/v4/app/NotificationCompat$CarExtender.setLargeIcon:(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$CarExtender;
        //  2387: pop            
        //  2388: aload           43
        //  2390: aload           228
        //  2392: invokevirtual   android/support/v4/app/NotificationCompat$Builder.extend:(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2395: pop            
        //  2396: iconst_0       
        //  2397: istore          233
        //  2399: aload           52
        //  2401: ifnull          2452
        //  2404: new             Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
        //  2407: dup            
        //  2408: invokespecial   android/support/v4/app/NotificationCompat$BigPictureStyle.<init>:()V
        //  2411: astore          234
        //  2413: aload           234
        //  2415: aload           32
        //  2417: invokevirtual   android/support/v4/app/NotificationCompat$BigPictureStyle.setSummaryText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
        //  2420: pop            
        //  2421: aload           234
        //  2423: aload           52
        //  2425: invokevirtual   android/support/v4/app/NotificationCompat$BigPictureStyle.bigPicture:(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
        //  2428: pop            
        //  2429: aload           43
        //  2431: aload           234
        //  2433: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setStyle:(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2436: pop            
        //  2437: iconst_1       
        //  2438: istore          233
        //  2440: aload           7
        //  2442: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  2445: bipush          10
        //  2447: aaload         
        //  2448: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2451: pop            
        //  2452: iload           233
        //  2454: ifne            2543
        //  2457: new             Landroid/support/v4/app/NotificationCompat$BigTextStyle;
        //  2460: dup            
        //  2461: invokespecial   android/support/v4/app/NotificationCompat$BigTextStyle.<init>:()V
        //  2464: astore          239
        //  2466: aload           239
        //  2468: aload           32
        //  2470: invokevirtual   android/support/v4/app/NotificationCompat$BigTextStyle.bigText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigTextStyle;
        //  2473: pop            
        //  2474: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //  2477: ldc_w           2131296291
        //  2480: iload           17
        //  2482: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //  2485: astore          241
        //  2487: iconst_1       
        //  2488: anewarray       Ljava/lang/Object;
        //  2491: astore          242
        //  2493: aload           242
        //  2495: iconst_0       
        //  2496: iload           17
        //  2498: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2501: aastore        
        //  2502: aload           239
        //  2504: aload           241
        //  2506: aload           242
        //  2508: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  2511: invokevirtual   android/support/v4/app/NotificationCompat$BigTextStyle.setSummaryText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigTextStyle;
        //  2514: pop            
        //  2515: aload           43
        //  2517: aload           239
        //  2519: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setStyle:(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2522: pop            
        //  2523: aload           7
        //  2525: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  2528: bipush          6
        //  2530: aaload         
        //  2531: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2534: aload           32
        //  2536: invokevirtual   java/lang/StringBuilder.length:()I
        //  2539: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  2542: pop            
        //  2543: aload           15
        //  2545: getfield        com/whatsapp/protocol/bi.I:B
        //  2548: iconst_2       
        //  2549: if_icmpeq       2569
        //  2552: aload           15
        //  2554: getfield        com/whatsapp/protocol/bi.I:B
        //  2557: istore_w        266
        //  2561: iload_w         266
        //  2565: iconst_1       
        //  2566: if_icmpne       2765
        //  2569: aload           15
        //  2571: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //  2574: astore          248
        //  2576: aload           248
        //  2578: ifnull          2765
        //  2581: aload           15
        //  2583: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //  2586: checkcast       Lcom/whatsapp/MediaData;
        //  2589: astore          249
        //  2591: aload           249
        //  2593: getfield        com/whatsapp/MediaData.transferred:Z
        //  2596: ifeq            2765
        //  2599: aload           249
        //  2601: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //  2604: astore          252
        //  2606: aload           252
        //  2608: ifnull          2765
        //  2611: aload           249
        //  2613: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //  2616: invokevirtual   java/io/File.exists:()Z
        //  2619: istore          253
        //  2621: iload           253
        //  2623: ifeq            2765
        //  2626: aload           16
        //  2628: invokestatic    com/whatsapp/Conversation.a:(Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //  2631: astore          254
        //  2633: aload           254
        //  2635: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  2638: bipush          24
        //  2640: aaload         
        //  2641: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //  2644: pop            
        //  2645: aload           254
        //  2647: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  2650: bipush          16
        //  2652: aaload         
        //  2653: new             Lcom/whatsapp/d6;
        //  2656: dup            
        //  2657: aload           15
        //  2659: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  2662: invokespecial   com/whatsapp/d6.<init>:(Lcom/whatsapp/protocol/c6;)V
        //  2665: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  2668: pop            
        //  2669: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2672: iconst_0       
        //  2673: aload           254
        //  2675: ldc_w           268435456
        //  2678: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //  2681: astore_w        257
        //  2685: aload           15
        //  2687: getfield        com/whatsapp/protocol/bi.I:B
        //  2690: istore_w        259
        //  2694: iload_w         259
        //  2698: iconst_1       
        //  2699: if_icmpne       4340
        //  2702: ldc_w           2130838961
        //  2705: istore_w        260
        //  2709: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2712: astore_w        262
        //  2716: aload           15
        //  2718: getfield        com/whatsapp/protocol/bi.I:B
        //  2721: istore_w        263
        //  2725: iload_w         263
        //  2729: iconst_1       
        //  2730: if_icmpne       4359
        //  2733: ldc_w           2131231907
        //  2736: istore_w        264
        //  2740: aload           43
        //  2742: iload_w         260
        //  2746: aload_w         262
        //  2750: iload_w         264
        //  2754: invokevirtual   com/whatsapp/App.getString:(I)Ljava/lang/String;
        //  2757: aload_w         257
        //  2761: invokevirtual   android/support/v4/app/NotificationCompat$Builder.addAction:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2764: pop            
        //  2765: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2768: lstore          62
        //  2770: lload           62
        //  2772: aload_0        
        //  2773: getfield        com/whatsapp/notification/q.b:Lcom/whatsapp/notification/a2;
        //  2776: getfield        com/whatsapp/notification/a2.d:J
        //  2779: lsub           
        //  2780: lstore          64
        //  2782: aload           43
        //  2784: ldc_w           2130838963
        //  2787: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setSmallIcon:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2790: pop            
        //  2791: aload_0        
        //  2792: getfield        com/whatsapp/notification/q.f:Z
        //  2795: ifne            2814
        //  2798: aload           43
        //  2800: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2803: aload           15
        //  2805: aload           16
        //  2807: invokestatic    com/whatsapp/notification/y.b:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;)Ljava/lang/String;
        //  2810: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setTicker:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2813: pop            
        //  2814: aload           43
        //  2816: lload           62
        //  2818: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setWhen:(J)Landroid/support/v4/app/NotificationCompat$Builder;
        //  2821: pop            
        //  2822: lload           64
        //  2824: ldc2_w          200
        //  2827: lcmp           
        //  2828: ifle            3597
        //  2831: aload_0        
        //  2832: getfield        com/whatsapp/notification/q.g:Z
        //  2835: istore          70
        //  2837: iload           70
        //  2839: ifne            3597
        //  2842: ldc             "0"
        //  2844: astore          122
        //  2846: invokestatic    com/whatsapp/Voip.d:()Z
        //  2849: istore          123
        //  2851: aload           16
        //  2853: ifnull          2939
        //  2856: iload           123
        //  2858: ifne            2939
        //  2861: aload           16
        //  2863: invokevirtual   com/whatsapp/a_9.m:()Z
        //  2866: istore          206
        //  2868: iload           206
        //  2870: ifeq            2891
        //  2873: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2876: aload           16
        //  2878: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  2881: invokestatic    com/whatsapp/notification/y.a:(Landroid/content/Context;Ljava/lang/String;)Z
        //  2884: istore          208
        //  2886: iload           208
        //  2888: ifne            2939
        //  2891: aload           16
        //  2893: invokevirtual   com/whatsapp/a_9.m:()Z
        //  2896: istore          207
        //  2898: iload           207
        //  2900: ifeq            2923
        //  2903: aload_3        
        //  2904: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  2907: bipush          34
        //  2909: aaload         
        //  2910: ldc             "1"
        //  2912: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2917: astore          122
        //  2919: iload_1        
        //  2920: ifeq            2939
        //  2923: aload_3        
        //  2924: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  2927: bipush          41
        //  2929: aaload         
        //  2930: ldc             "1"
        //  2932: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2937: astore          122
        //  2939: aload           7
        //  2941: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  2944: bipush          29
        //  2946: aaload         
        //  2947: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2950: aload           122
        //  2952: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2955: pop            
        //  2956: iconst_m1      
        //  2957: istore          125
        //  2959: aload           122
        //  2961: invokevirtual   java/lang/String.hashCode:()I
        //  2964: istore          127
        //  2966: iload           127
        //  2968: tableswitch {
        //               98: 4394
        //               99: 4415
        //              100: 4437
        //          default: 2996
        //        }
        //  2996: iload           125
        //  2998: istore          130
        //  3000: iload           130
        //  3002: tableswitch {
        //                0: 4473
        //                1: 4484
        //                2: 4525
        //          default: 3028
        //        }
        //  3028: aload           5
        //  3030: invokevirtual   android/telephony/TelephonyManager.getCallState:()I
        //  3033: istore          134
        //  3035: iload           134
        //  3037: ifne            3318
        //  3040: aload           16
        //  3042: ifnull          3318
        //  3045: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //  3048: ldc_w           Lcom/whatsapp/a8p;.class
        //  3051: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //  3054: checkcast       Lcom/whatsapp/a8p;
        //  3057: astore          160
        //  3059: invokestatic    com/whatsapp/Conversation.p:()Lcom/whatsapp/v1;
        //  3062: astore          161
        //  3064: aload           160
        //  3066: invokevirtual   com/whatsapp/a8p.a:()Z
        //  3069: ifne            4605
        //  3072: invokestatic    com/whatsapp/App.I:()Z
        //  3075: istore          191
        //  3077: iload           191
        //  3079: ifeq            4605
        //  3082: aload           161
        //  3084: invokevirtual   com/whatsapp/v1.a:()Z
        //  3087: istore          192
        //  3089: iload           192
        //  3091: ifeq            4605
        //  3094: aload           161
        //  3096: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //  3099: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //  3102: aload           16
        //  3104: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  3107: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3110: istore          193
        //  3112: iload           193
        //  3114: ifeq            4605
        //  3117: getstatic       com/whatsapp/Conversation.M:Z
        //  3120: istore          194
        //  3122: iload           194
        //  3124: ifeq            4974
        //  3127: aload           7
        //  3129: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3132: bipush          7
        //  3134: aaload         
        //  3135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3138: pop            
        //  3139: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3142: bipush          15
        //  3144: aaload         
        //  3145: astore          168
        //  3147: iload           123
        //  3149: ifeq            3172
        //  3152: aload           168
        //  3154: ifnull          3172
        //  3157: aload           168
        //  3159: ldc_w           ""
        //  3162: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3165: istore          189
        //  3167: iload           189
        //  3169: ifne            3172
        //  3172: aload           168
        //  3174: ifnull          3318
        //  3177: aload           168
        //  3179: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //  3182: astore          169
        //  3184: aload           7
        //  3186: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3189: iconst_3       
        //  3190: aaload         
        //  3191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3194: aload           169
        //  3196: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3199: pop            
        //  3200: aload           169
        //  3202: ifnull          3318
        //  3205: aload           16
        //  3207: invokevirtual   com/whatsapp/a_9.m:()Z
        //  3210: istore          180
        //  3212: iload           180
        //  3214: ifeq            3235
        //  3217: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  3220: aload           16
        //  3222: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  3225: invokestatic    com/whatsapp/notification/y.a:(Landroid/content/Context;Ljava/lang/String;)Z
        //  3228: istore          187
        //  3230: iload           187
        //  3232: ifne            3318
        //  3235: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  3238: istore          181
        //  3240: iload           181
        //  3242: bipush          21
        //  3244: if_icmplt       3313
        //  3247: getstatic       android/provider/Settings$System.DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;
        //  3250: aload           169
        //  3252: invokevirtual   android/net/Uri.equals:(Ljava/lang/Object;)Z
        //  3255: istore          182
        //  3257: iload           182
        //  3259: ifne            3274
        //  3262: aload           169
        //  3264: invokestatic    com/whatsapp/notification/q.a:(Landroid/net/Uri;)Z
        //  3267: istore          186
        //  3269: iload           186
        //  3271: ifeq            3313
        //  3274: aload           161
        //  3276: invokevirtual   com/whatsapp/v1.a:()Z
        //  3279: istore          183
        //  3281: iload           183
        //  3283: ifeq            3301
        //  3286: aload           161
        //  3288: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //  3291: invokevirtual   com/whatsapp/Conversation.h:()Z
        //  3294: istore          185
        //  3296: iload           185
        //  3298: ifne            3318
        //  3301: aload           43
        //  3303: aload           169
        //  3305: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setSound:(Landroid/net/Uri;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  3308: pop            
        //  3309: iload_1        
        //  3310: ifeq            3318
        //  3313: aload           169
        //  3315: invokestatic    com/whatsapp/App.a:(Landroid/net/Uri;)V
        //  3318: aload           16
        //  3320: ifnull          4961
        //  3323: aload           16
        //  3325: invokevirtual   com/whatsapp/a_9.m:()Z
        //  3328: istore          158
        //  3330: iload           158
        //  3332: ifeq            3354
        //  3335: aload_3        
        //  3336: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3339: bipush          22
        //  3341: aaload         
        //  3342: iconst_1       
        //  3343: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //  3348: istore          159
        //  3350: iload_1        
        //  3351: ifeq            4954
        //  3354: aload_3        
        //  3355: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3358: bipush          20
        //  3360: aaload         
        //  3361: iconst_1       
        //  3362: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //  3367: istore          135
        //  3369: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //  3372: ldc_w           Lcom/whatsapp/a8p;.class
        //  3375: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //  3378: checkcast       Lcom/whatsapp/a8p;
        //  3381: astore          136
        //  3383: iload           135
        //  3385: ifeq            3566
        //  3388: aload           136
        //  3390: invokevirtual   com/whatsapp/a8p.a:()Z
        //  3393: istore          143
        //  3395: iload           143
        //  3397: ifne            3423
        //  3400: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //  3403: astore          155
        //  3405: aload           155
        //  3407: ifnull          3566
        //  3410: getstatic       com/whatsapp/notification/PopupNotification.s:Lcom/whatsapp/notification/PopupNotification;
        //  3413: instanceof      Lcom/whatsapp/notification/PopupNotificationLocked;
        //  3416: istore          156
        //  3418: iload           156
        //  3420: ifeq            3566
        //  3423: aload           16
        //  3425: invokevirtual   com/whatsapp/a_9.m:()Z
        //  3428: istore          144
        //  3430: iload           144
        //  3432: ifeq            3458
        //  3435: aload_3        
        //  3436: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3439: bipush          33
        //  3441: aaload         
        //  3442: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3445: iconst_2       
        //  3446: aaload         
        //  3447: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3452: astore          145
        //  3454: iload_1        
        //  3455: ifeq            3478
        //  3458: aload_3        
        //  3459: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3462: bipush          43
        //  3464: aaload         
        //  3465: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3468: bipush          9
        //  3470: aaload         
        //  3471: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3476: astore          145
        //  3478: aload           145
        //  3480: ifnull          3550
        //  3483: aload           145
        //  3485: bipush          16
        //  3487: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;I)I
        //  3490: istore          154
        //  3492: iload           154
        //  3494: istore          149
        //  3496: iload           149
        //  3498: ldc_w           -16777216
        //  3501: ior            
        //  3502: istore          150
        //  3504: iload           150
        //  3506: ldc_w           -16777216
        //  3509: if_icmpeq       3546
        //  3512: aload           43
        //  3514: iload           150
        //  3516: sipush          1000
        //  3519: sipush          4000
        //  3522: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setLights:(III)Landroid/support/v4/app/NotificationCompat$Builder;
        //  3525: pop            
        //  3526: aload           7
        //  3528: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3531: bipush          27
        //  3533: aaload         
        //  3534: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3537: iload           150
        //  3539: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //  3542: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3545: pop            
        //  3546: iload_1        
        //  3547: ifeq            3562
        //  3550: aload           7
        //  3552: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3555: bipush          8
        //  3557: aaload         
        //  3558: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3561: pop            
        //  3562: iload_1        
        //  3563: ifeq            3597
        //  3566: aload           7
        //  3568: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3571: bipush          14
        //  3573: aaload         
        //  3574: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3577: iload           135
        //  3579: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //  3582: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3585: bipush          18
        //  3587: aaload         
        //  3588: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3591: aload           136
        //  3593: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3596: pop            
        //  3597: iload           18
        //  3599: iconst_1       
        //  3600: if_icmpne       4803
        //  3603: aload           16
        //  3605: invokestatic    com/whatsapp/Conversation.a:(Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //  3608: astore          121
        //  3610: aload           121
        //  3612: astore          71
        //  3614: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  3617: iconst_0       
        //  3618: aload           71
        //  3620: ldc_w           268435456
        //  3623: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //  3626: astore          72
        //  3628: aload           43
        //  3630: aload           72
        //  3632: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  3635: pop            
        //  3636: aload           43
        //  3638: aload           40
        //  3640: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  3643: pop            
        //  3644: aload           43
        //  3646: aload           32
        //  3648: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  3651: pop            
        //  3652: getstatic       com/whatsapp/App.aV:I
        //  3655: iconst_1       
        //  3656: if_icmplt       3676
        //  3659: aload           7
        //  3661: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3664: bipush          36
        //  3666: aaload         
        //  3667: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3670: aload           32
        //  3672: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
        //  3675: pop            
        //  3676: aload           7
        //  3678: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3681: bipush          38
        //  3683: aaload         
        //  3684: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3687: aload           19
        //  3689: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3692: pop            
        //  3693: aload_0        
        //  3694: getfield        com/whatsapp/notification/q.b:Lcom/whatsapp/notification/a2;
        //  3697: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3700: putfield        com/whatsapp/notification/a2.d:J
        //  3703: new             Ljava/lang/StringBuilder;
        //  3706: dup            
        //  3707: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3710: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3713: bipush          30
        //  3715: aaload         
        //  3716: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3719: aload           7
        //  3721: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3724: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3727: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3730: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  3733: aload_0        
        //  3734: getfield        com/whatsapp/notification/q.e:Z
        //  3737: ifne            3810
        //  3740: aload_0        
        //  3741: getfield        com/whatsapp/notification/q.g:Z
        //  3744: istore          118
        //  3746: iload           118
        //  3748: ifne            3810
        //  3751: new             Ljava/lang/StringBuilder;
        //  3754: dup            
        //  3755: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3758: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3761: bipush          21
        //  3763: aaload         
        //  3764: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3767: aload_0        
        //  3768: getfield        com/whatsapp/notification/q.e:Z
        //  3771: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //  3774: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3777: bipush          23
        //  3779: aaload         
        //  3780: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3783: aload_0        
        //  3784: getfield        com/whatsapp/notification/q.g:Z
        //  3787: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //  3790: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3793: bipush          31
        //  3795: aaload         
        //  3796: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3799: iload           18
        //  3801: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3804: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3807: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  3810: aload           5
        //  3812: invokevirtual   android/telephony/TelephonyManager.getCallState:()I
        //  3815: ifne            4871
        //  3818: invokestatic    com/whatsapp/Voip.d:()Z
        //  3821: istore          114
        //  3823: iload           114
        //  3825: ifne            4871
        //  3828: aload           16
        //  3830: ifnull          4871
        //  3833: iload           31
        //  3835: ifeq            4871
        //  3838: aload_0        
        //  3839: getfield        com/whatsapp/notification/q.c:Z
        //  3842: istore          115
        //  3844: iload           115
        //  3846: ifne            4871
        //  3849: aload           16
        //  3851: invokevirtual   com/whatsapp/a_9.m:()Z
        //  3854: istore          116
        //  3856: iload           116
        //  3858: ifeq            3879
        //  3861: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  3864: aload           16
        //  3866: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  3869: invokestatic    com/whatsapp/notification/y.d:(Landroid/content/Context;Ljava/lang/String;)Z
        //  3872: istore          117
        //  3874: iload           117
        //  3876: ifne            4871
        //  3879: iconst_1       
        //  3880: istore          87
        //  3882: iload           87
        //  3884: ifne            3905
        //  3887: aload_0        
        //  3888: getfield        com/whatsapp/notification/q.f:Z
        //  3891: istore          112
        //  3893: iload           112
        //  3895: ifne            3905
        //  3898: aload           43
        //  3900: iconst_1       
        //  3901: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setPriority:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //  3904: pop            
        //  3905: new             Landroid/content/Intent;
        //  3908: dup            
        //  3909: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  3912: ldc_w           Lcom/whatsapp/notification/MessageNotificationDismissedReceiver;.class
        //  3915: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3918: astore          88
        //  3920: aload           88
        //  3922: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  3925: bipush          39
        //  3927: aaload         
        //  3928: aload           19
        //  3930: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  3933: pop            
        //  3934: aload           43
        //  3936: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  3939: iconst_1       
        //  3940: aload           88
        //  3942: ldc_w           134217728
        //  3945: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //  3948: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setDeleteIntent:(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
        //  3951: pop            
        //  3952: aload           43
        //  3954: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  3957: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //  3960: ldc_w           2131624025
        //  3963: invokevirtual   android/content/res/Resources.getColor:(I)I
        //  3966: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setColor:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //  3969: pop            
        //  3970: aload           43
        //  3972: invokevirtual   android/support/v4/app/NotificationCompat$Builder.getNotification:()Landroid/app/Notification;
        //  3975: astore          92
        //  3977: aload_0        
        //  3978: getfield        com/whatsapp/notification/q.f:Z
        //  3981: istore          95
        //  3983: iload           95
        //  3985: ifeq            4000
        //  3988: iload           17
        //  3990: iconst_1       
        //  3991: if_icmpne       4000
        //  3994: aload           6
        //  3996: iconst_1       
        //  3997: invokevirtual   android/support/v4/app/NotificationManagerCompat.cancel:(I)V
        //  4000: aload           6
        //  4002: iconst_1       
        //  4003: aload           92
        //  4005: invokevirtual   android/support/v4/app/NotificationManagerCompat.notify:(ILandroid/app/Notification;)V
        //  4008: aload_0        
        //  4009: getfield        com/whatsapp/notification/q.f:Z
        //  4012: istore          99
        //  4014: iload           99
        //  4016: ifne            23
        //  4019: invokestatic    com/whatsapp/Conversation.p:()Lcom/whatsapp/v1;
        //  4022: astore          100
        //  4024: aload           100
        //  4026: invokevirtual   com/whatsapp/v1.a:()Z
        //  4029: ifeq            4061
        //  4032: aconst_null    
        //  4033: astore          101
        //  4035: aload           16
        //  4037: ifnull          4047
        //  4040: aload           16
        //  4042: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  4045: astore          101
        //  4047: aload           100
        //  4049: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //  4052: aload           101
        //  4054: invokevirtual   com/whatsapp/Conversation.j:(Ljava/lang/String;)V
        //  4057: iload_1        
        //  4058: ifeq            4064
        //  4061: invokestatic    com/whatsapp/Conversation.j:()V
        //  4064: iload           87
        //  4066: ifeq            4091
        //  4069: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  4072: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //  4075: new             Lcom/whatsapp/notification/z;
        //  4078: dup            
        //  4079: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  4082: iload           31
        //  4084: invokespecial   com/whatsapp/notification/z.<init>:(Landroid/content/Context;I)V
        //  4087: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //  4090: pop            
        //  4091: aload_0        
        //  4092: getfield        com/whatsapp/notification/q.e:Z
        //  4095: istore          106
        //  4097: iload           106
        //  4099: ifeq            4123
        //  4102: aload           16
        //  4104: ifnull          4123
        //  4107: aload           16
        //  4109: invokevirtual   com/whatsapp/a_9.m:()Z
        //  4112: ifeq            4123
        //  4115: aload           16
        //  4117: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //  4120: invokestatic    com/whatsapp/notification/y.c:(Ljava/lang/String;)V
        //  4123: aload_0        
        //  4124: getfield        com/whatsapp/notification/q.e:Z
        //  4127: ifeq            23
        //  4130: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  4133: invokestatic    com/whatsapp/appwidget/WidgetProvider.a:(Landroid/content/Context;)V
        //  4136: invokestatic    com/whatsapp/App.s:()V
        //  4139: return         
        //  4140: astore          107
        //  4142: aload           107
        //  4144: athrow         
        //  4145: astore          26
        //  4147: aload           26
        //  4149: athrow         
        //  4150: astore          27
        //  4152: aload           27
        //  4154: athrow         
        //  4155: getstatic       com/whatsapp/qc.INDIVIDUAL:Lcom/whatsapp/qc;
        //  4158: astore          30
        //  4160: goto            624
        //  4163: astore_w        336
        //  4167: aload_w         336
        //  4171: athrow         
        //  4172: astore_w        332
        //  4176: aload_w         332
        //  4180: athrow         
        //  4181: astore          41
        //  4183: aload           41
        //  4185: athrow         
        //  4186: astore          42
        //  4188: aload           42
        //  4190: athrow         
        //  4191: astore_w        329
        //  4195: aload_w         329
        //  4199: athrow         
        //  4200: astore          47
        //  4202: aload           47
        //  4204: athrow         
        //  4205: astore          48
        //  4207: aload           48
        //  4209: athrow         
        //  4210: astore          49
        //  4212: aload           49
        //  4214: athrow         
        //  4215: astore          55
        //  4217: aload           55
        //  4219: athrow         
        //  4220: astore          56
        //  4222: aload           56
        //  4224: athrow         
        //  4225: astore_w        321
        //  4229: aload_w         321
        //  4233: athrow         
        //  4234: astore_w        322
        //  4238: aload_w         322
        //  4242: athrow         
        //  4243: astore          60
        //  4245: aload           60
        //  4247: athrow         
        //  4248: astore_w        316
        //  4252: aload_w         316
        //  4256: athrow         
        //  4257: astore_w        307
        //  4261: aload_w         307
        //  4265: athrow         
        //  4266: iconst_0       
        //  4267: istore_w        309
        //  4271: goto            1405
        //  4274: astore          218
        //  4276: aload           218
        //  4278: athrow         
        //  4279: astore          219
        //  4281: aload           219
        //  4283: athrow         
        //  4284: astore_w        281
        //  4288: aload_w         281
        //  4292: athrow         
        //  4293: iconst_0       
        //  4294: istore_w        285
        //  4298: goto            1844
        //  4301: astore          220
        //  4303: aload           220
        //  4305: athrow         
        //  4306: astore          221
        //  4308: aload           221
        //  4310: athrow         
        //  4311: astore          246
        //  4313: aload           246
        //  4315: athrow         
        //  4316: astore          247
        //  4318: aload           247
        //  4320: athrow         
        //  4321: astore          250
        //  4323: aload           250
        //  4325: athrow         
        //  4326: astore          251
        //  4328: aload           251
        //  4330: athrow         
        //  4331: astore_w        258
        //  4335: aload_w         258
        //  4339: athrow         
        //  4340: ldc_w           2130838960
        //  4343: istore_w        260
        //  4347: goto            2709
        //  4350: astore_w        261
        //  4354: aload_w         261
        //  4358: athrow         
        //  4359: ldc_w           2131231484
        //  4362: istore_w        264
        //  4366: goto            2740
        //  4369: astore          66
        //  4371: aload           66
        //  4373: athrow         
        //  4374: astore          68
        //  4376: aload           68
        //  4378: athrow         
        //  4379: astore          203
        //  4381: aload           203
        //  4383: athrow         
        //  4384: astore          204
        //  4386: aload           204
        //  4388: athrow         
        //  4389: astore          205
        //  4391: aload           205
        //  4393: athrow         
        //  4394: aload           122
        //  4396: ldc             "1"
        //  4398: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4401: istore          202
        //  4403: iload           202
        //  4405: ifeq            2996
        //  4408: iconst_0       
        //  4409: istore          125
        //  4411: iload_1        
        //  4412: ifeq            2996
        //  4415: aload           122
        //  4417: ldc_w           "2"
        //  4420: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4423: istore          201
        //  4425: iload           201
        //  4427: ifeq            2996
        //  4430: iconst_1       
        //  4431: istore          125
        //  4433: iload_1        
        //  4434: ifeq            2996
        //  4437: aload           122
        //  4439: ldc_w           "3"
        //  4442: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4445: istore          129
        //  4447: iload           129
        //  4449: ifeq            2996
        //  4452: iconst_2       
        //  4453: istore          130
        //  4455: goto            3000
        //  4458: astore          126
        //  4460: aload           126
        //  4462: athrow         
        //  4463: astore          200
        //  4465: aload           200
        //  4467: athrow         
        //  4468: astore          128
        //  4470: aload           128
        //  4472: athrow         
        //  4473: aload           43
        //  4475: iconst_2       
        //  4476: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setDefaults:(I)Landroid/support/v4/app/NotificationCompat$Builder;
        //  4479: pop            
        //  4480: iload_1        
        //  4481: ifeq            3028
        //  4484: aload           43
        //  4486: iconst_5       
        //  4487: newarray        J
        //  4489: dup            
        //  4490: iconst_0       
        //  4491: lconst_0       
        //  4492: lastore        
        //  4493: dup            
        //  4494: iconst_1       
        //  4495: ldc2_w          300
        //  4498: lastore        
        //  4499: dup            
        //  4500: iconst_2       
        //  4501: ldc2_w          200
        //  4504: lastore        
        //  4505: dup            
        //  4506: iconst_3       
        //  4507: ldc2_w          300
        //  4510: lastore        
        //  4511: dup            
        //  4512: iconst_4       
        //  4513: ldc2_w          200
        //  4516: lastore        
        //  4517: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setVibrate:([J)Landroid/support/v4/app/NotificationCompat$Builder;
        //  4520: pop            
        //  4521: iload_1        
        //  4522: ifeq            3028
        //  4525: aload           43
        //  4527: iconst_5       
        //  4528: newarray        J
        //  4530: dup            
        //  4531: iconst_0       
        //  4532: lconst_0       
        //  4533: lastore        
        //  4534: dup            
        //  4535: iconst_1       
        //  4536: ldc2_w          750
        //  4539: lastore        
        //  4540: dup            
        //  4541: iconst_2       
        //  4542: ldc2_w          250
        //  4545: lastore        
        //  4546: dup            
        //  4547: iconst_3       
        //  4548: ldc2_w          750
        //  4551: lastore        
        //  4552: dup            
        //  4553: iconst_4       
        //  4554: ldc2_w          250
        //  4557: lastore        
        //  4558: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setVibrate:([J)Landroid/support/v4/app/NotificationCompat$Builder;
        //  4561: pop            
        //  4562: goto            3028
        //  4565: astore          131
        //  4567: aload           131
        //  4569: athrow         
        //  4570: astore          198
        //  4572: aload           198
        //  4574: athrow         
        //  4575: astore          196
        //  4577: aload           196
        //  4579: athrow         
        //  4580: astore          133
        //  4582: aload           133
        //  4584: athrow         
        //  4585: astore          162
        //  4587: aload           162
        //  4589: athrow         
        //  4590: astore          163
        //  4592: aload           163
        //  4594: athrow         
        //  4595: astore          164
        //  4597: aload           164
        //  4599: athrow         
        //  4600: astore          165
        //  4602: aload           165
        //  4604: athrow         
        //  4605: aload           7
        //  4607: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  4610: bipush          26
        //  4612: aaload         
        //  4613: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4616: pop            
        //  4617: aload           16
        //  4619: invokevirtual   com/whatsapp/a_9.m:()Z
        //  4622: ifeq            4655
        //  4625: aload_3        
        //  4626: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  4629: iconst_1       
        //  4630: aaload         
        //  4631: aconst_null    
        //  4632: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  4637: astore          168
        //  4639: aload           168
        //  4641: ifnonnull       3147
        //  4644: getstatic       android/provider/Settings$System.DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;
        //  4647: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  4650: astore          168
        //  4652: goto            3147
        //  4655: aload_3        
        //  4656: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  4659: bipush          12
        //  4661: aaload         
        //  4662: aconst_null    
        //  4663: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  4668: astore          167
        //  4670: aload           16
        //  4672: aload_3        
        //  4673: invokevirtual   com/whatsapp/a_9.b:(Landroid/content/SharedPreferences;)Ljava/lang/String;
        //  4676: astore          168
        //  4678: aload           168
        //  4680: ifnull          4967
        //  4683: aload           7
        //  4685: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  4688: bipush          17
        //  4690: aaload         
        //  4691: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4694: pop            
        //  4695: goto            4639
        //  4698: astore          188
        //  4700: aload           188
        //  4702: athrow         
        //  4703: astore          170
        //  4705: aload           170
        //  4707: athrow         
        //  4708: astore          171
        //  4710: aload           171
        //  4712: athrow         
        //  4713: astore          172
        //  4715: aload           172
        //  4717: athrow         
        //  4718: astore          173
        //  4720: aload           173
        //  4722: athrow         
        //  4723: astore          174
        //  4725: aload           174
        //  4727: athrow         
        //  4728: astore          175
        //  4730: aload           175
        //  4732: athrow         
        //  4733: astore          176
        //  4735: aload           176
        //  4737: athrow         
        //  4738: astore          177
        //  4740: aload           177
        //  4742: athrow         
        //  4743: astore          178
        //  4745: aload           178
        //  4747: athrow         
        //  4748: astore          157
        //  4750: aload           157
        //  4752: athrow         
        //  4753: astore          139
        //  4755: aload           139
        //  4757: athrow         
        //  4758: astore          140
        //  4760: aload           140
        //  4762: athrow         
        //  4763: astore          141
        //  4765: aload           141
        //  4767: athrow         
        //  4768: astore          142
        //  4770: aload           142
        //  4772: athrow         
        //  4773: astore          148
        //  4775: ldc_w           16777215
        //  4778: istore          149
        //  4780: goto            3496
        //  4783: astore          151
        //  4785: aload           151
        //  4787: athrow         
        //  4788: astore          146
        //  4790: aload           146
        //  4792: athrow         
        //  4793: astore          137
        //  4795: aload           137
        //  4797: athrow         
        //  4798: astore          120
        //  4800: aload           120
        //  4802: athrow         
        //  4803: new             Landroid/content/Intent;
        //  4806: dup            
        //  4807: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  4810: invokestatic    com/whatsapp/Main.h:()Ljava/lang/Class;
        //  4813: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4816: astore          71
        //  4818: goto            3614
        //  4821: astore          73
        //  4823: aload           73
        //  4825: athrow         
        //  4826: astore          77
        //  4828: aload           77
        //  4830: athrow         
        //  4831: astore          78
        //  4833: aload           78
        //  4835: athrow         
        //  4836: astore          80
        //  4838: aload           80
        //  4840: athrow         
        //  4841: astore          81
        //  4843: aload           81
        //  4845: athrow         
        //  4846: astore          82
        //  4848: aload           82
        //  4850: athrow         
        //  4851: astore          83
        //  4853: aload           83
        //  4855: athrow         
        //  4856: astore          84
        //  4858: aload           84
        //  4860: athrow         
        //  4861: astore          85
        //  4863: aload           85
        //  4865: athrow         
        //  4866: astore          86
        //  4868: aload           86
        //  4870: athrow         
        //  4871: iconst_0       
        //  4872: istore          87
        //  4874: goto            3882
        //  4877: astore          110
        //  4879: aload           110
        //  4881: athrow         
        //  4882: astore          111
        //  4884: aload           111
        //  4886: athrow         
        //  4887: astore          93
        //  4889: aload           93
        //  4891: athrow         
        //  4892: astore          94
        //  4894: aload           94
        //  4896: athrow         
        //  4897: astore          96
        //  4899: aload           96
        //  4901: invokevirtual   java/lang/SecurityException.toString:()Ljava/lang/String;
        //  4904: getstatic       com/whatsapp/notification/q.z:[Ljava/lang/String;
        //  4907: bipush          40
        //  4909: aaload         
        //  4910: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  4913: ifne            4008
        //  4916: aload           96
        //  4918: athrow         
        //  4919: astore          97
        //  4921: aload           97
        //  4923: athrow         
        //  4924: astore          98
        //  4926: aload           98
        //  4928: athrow         
        //  4929: astore          102
        //  4931: aload           102
        //  4933: athrow         
        //  4934: astore          108
        //  4936: aload           108
        //  4938: athrow         
        //  4939: astore          103
        //  4941: aload           103
        //  4943: athrow         
        //  4944: astore          104
        //  4946: aload           104
        //  4948: athrow         
        //  4949: astore          105
        //  4951: aload           105
        //  4953: athrow         
        //  4954: iload           159
        //  4956: istore          135
        //  4958: goto            3369
        //  4961: iconst_0       
        //  4962: istore          135
        //  4964: goto            3369
        //  4967: aload           167
        //  4969: astore          168
        //  4971: goto            4639
        //  4974: aconst_null    
        //  4975: astore          168
        //  4977: goto            3147
        //  4980: aload_w         304
        //  4984: astore_w        302
        //  4988: goto            2002
        //  4991: iload_w         300
        //  4995: istore_w        273
        //  4999: goto            1626
        //  5002: iload_w         273
        //  5006: istore_w        274
        //  5010: goto            1691
        //  5013: iload_w         313
        //  5017: istore          214
        //  5019: goto            1343
        //  5022: aload_w         319
        //  5026: astore          58
        //  5028: aload           51
        //  5030: astore          59
        //  5032: goto            1174
        //  5035: aload_w         319
        //  5039: astore          58
        //  5041: aload_w         319
        //  5045: astore          59
        //  5047: goto            1174
        //  5050: aconst_null    
        //  5051: astore          51
        //  5053: aconst_null    
        //  5054: astore          52
        //  5056: goto            1014
        //  5059: iconst_0       
        //  5060: istore          31
        //  5062: goto            634
        //  5065: aload           14
        //  5067: astore_w        342
        //  5071: aload           13
        //  5073: astore_w        343
        //  5077: goto            277
        //  5080: aload           14
        //  5082: astore_w        342
        //  5086: aload           13
        //  5088: astore_w        343
        //  5092: goto            323
        //  5095: aload           14
        //  5097: astore_w        342
        //  5101: aload           13
        //  5103: astore_w        343
        //  5107: iload           12
        //  5109: istore_w        344
        //  5113: iload           11
        //  5115: istore_w        345
        //  5119: goto            387
        //  5122: aload           14
        //  5124: astore          15
        //  5126: aload           13
        //  5128: astore          16
        //  5130: iload           12
        //  5132: istore          17
        //  5134: iload           11
        //  5136: istore          18
        //  5138: goto            415
        //  5141: iload_w         345
        //  5145: istore          11
        //  5147: iload_w         344
        //  5151: istore          12
        //  5153: aload_w         343
        //  5157: astore          13
        //  5159: aload_w         342
        //  5163: astore          14
        //  5165: goto            130
        //  5168: iload_w         346
        //  5172: istore_w        344
        //  5176: iload_w         347
        //  5180: istore_w        345
        //  5184: goto            387
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      23     24     27     Ljava/lang/NumberFormatException;
        //  40     57     58     63     Ljava/lang/NumberFormatException;
        //  229    249    482    491    Ljava/lang/NumberFormatException;
        //  277    319    491    500    Ljava/lang/NumberFormatException;
        //  323    371    491    500    Ljava/lang/NumberFormatException;
        //  440    476    477    482    Ljava/lang/NumberFormatException;
        //  510    516    517    522    Ljava/lang/NumberFormatException;
        //  522    545    582    587    Ljava/lang/NumberFormatException;
        //  552    560    587    592    Ljava/lang/NumberFormatException;
        //  567    576    577    582    Ljava/lang/NumberFormatException;
        //  584    587    587    592    Ljava/lang/NumberFormatException;
        //  589    592    577    582    Ljava/lang/NumberFormatException;
        //  601    614    4145   4150   Ljava/lang/NumberFormatException;
        //  619    624    4150   4155   Ljava/lang/NumberFormatException;
        //  668    689    4163   4172   Ljava/lang/NumberFormatException;
        //  693    744    4172   4181   Ljava/lang/NumberFormatException;
        //  847    862    4181   4191   Ljava/lang/NumberFormatException;
        //  920    933    4191   4200   Ljava/lang/NumberFormatException;
        //  952    957    4200   4205   Ljava/lang/NumberFormatException;
        //  970    979    4205   4210   Ljava/lang/NumberFormatException;
        //  987    996    4210   4215   Ljava/lang/NumberFormatException;
        //  1042   1047   4215   4225   Ljava/lang/NumberFormatException;
        //  1086   1115   4225   4243   Ljava/lang/NumberFormatException;
        //  1174   1179   4243   4248   Ljava/lang/NumberFormatException;
        //  1256   1284   4248   4257   Ljava/lang/NumberFormatException;
        //  1387   1394   4257   4266   Ljava/lang/NumberFormatException;
        //  1533   1547   4274   4284   Ljava/lang/NumberFormatException;
        //  1790   1833   4284   4293   Ljava/lang/NumberFormatException;
        //  2229   2234   4301   4306   Ljava/lang/NumberFormatException;
        //  2239   2259   4306   4311   Ljava/lang/NumberFormatException;
        //  2543   2561   4311   4316   Ljava/lang/NumberFormatException;
        //  2569   2576   4316   4321   Ljava/lang/NumberFormatException;
        //  2591   2606   4321   4326   Ljava/lang/NumberFormatException;
        //  2611   2621   4326   4331   Ljava/lang/NumberFormatException;
        //  2685   2694   4331   4340   Ljava/lang/NumberFormatException;
        //  2709   2725   4350   4359   Ljava/lang/NumberFormatException;
        //  2782   2814   4369   4374   Ljava/lang/NumberFormatException;
        //  2814   2822   4374   4379   Ljava/lang/NumberFormatException;
        //  2831   2837   4374   4379   Ljava/lang/NumberFormatException;
        //  2861   2868   4379   4384   Ljava/lang/NumberFormatException;
        //  2873   2886   4384   4389   Ljava/lang/NumberFormatException;
        //  2891   2898   4389   4394   Ljava/lang/NumberFormatException;
        //  2959   2966   4458   4463   Ljava/lang/NumberFormatException;
        //  3028   3035   4580   4585   Ljava/lang/NumberFormatException;
        //  3064   3077   4585   4590   Ljava/lang/NumberFormatException;
        //  3082   3089   4590   4595   Ljava/lang/NumberFormatException;
        //  3094   3112   4595   4600   Ljava/lang/NumberFormatException;
        //  3117   3122   4600   4605   Ljava/lang/NumberFormatException;
        //  3157   3167   4698   4703   Ljava/lang/NumberFormatException;
        //  3184   3200   4703   4708   Ljava/lang/NumberFormatException;
        //  3205   3212   4703   4708   Ljava/lang/NumberFormatException;
        //  3217   3230   4708   4713   Ljava/lang/NumberFormatException;
        //  3235   3240   4713   4718   Ljava/lang/NumberFormatException;
        //  3247   3257   4718   4723   Ljava/lang/NumberFormatException;
        //  3262   3269   4723   4728   Ljava/lang/NumberFormatException;
        //  3274   3281   4728   4733   Ljava/lang/NumberFormatException;
        //  3286   3296   4733   4738   Ljava/lang/NumberFormatException;
        //  3301   3309   4738   4743   Ljava/lang/NumberFormatException;
        //  3313   3318   4743   4748   Ljava/lang/NumberFormatException;
        //  3323   3330   4748   4753   Ljava/lang/NumberFormatException;
        //  3388   3395   4753   4758   Ljava/lang/NumberFormatException;
        //  3400   3405   4758   4763   Ljava/lang/NumberFormatException;
        //  3410   3418   4763   4768   Ljava/lang/NumberFormatException;
        //  3423   3430   4768   4773   Ljava/lang/NumberFormatException;
        //  3483   3492   4773   4783   Ljava/lang/NumberFormatException;
        //  3512   3546   4783   4788   Ljava/lang/NumberFormatException;
        //  3550   3562   4788   4793   Ljava/lang/NumberFormatException;
        //  3566   3597   4793   4798   Ljava/lang/NumberFormatException;
        //  3603   3610   4798   4803   Ljava/lang/NumberFormatException;
        //  3628   3676   4821   4826   Ljava/lang/NumberFormatException;
        //  3676   3746   4826   4831   Ljava/lang/NumberFormatException;
        //  3751   3810   4831   4836   Ljava/lang/NumberFormatException;
        //  3810   3823   4836   4851   Ljava/lang/NumberFormatException;
        //  3838   3844   4851   4856   Ljava/lang/NumberFormatException;
        //  3849   3856   4856   4861   Ljava/lang/NumberFormatException;
        //  3861   3874   4861   4871   Ljava/lang/NumberFormatException;
        //  3887   3893   4877   4882   Ljava/lang/NumberFormatException;
        //  3898   3905   4882   4887   Ljava/lang/NumberFormatException;
        //  3977   3983   4887   4892   Ljava/lang/NumberFormatException;
        //  3994   4000   4892   4897   Ljava/lang/NumberFormatException;
        //  4000   4008   4897   4924   Ljava/lang/SecurityException;
        //  4008   4014   4924   4929   Ljava/lang/NumberFormatException;
        //  4047   4057   4929   4934   Ljava/lang/NumberFormatException;
        //  4061   4064   4929   4934   Ljava/lang/NumberFormatException;
        //  4069   4091   4934   4939   Ljava/lang/NumberFormatException;
        //  4091   4097   4939   4949   Ljava/lang/NumberFormatException;
        //  4107   4123   4949   4954   Ljava/lang/NumberFormatException;
        //  4123   4139   4140   4145   Ljava/lang/NumberFormatException;
        //  4147   4150   4150   4155   Ljava/lang/NumberFormatException;
        //  4167   4172   4172   4181   Ljava/lang/NumberFormatException;
        //  4183   4186   4186   4191   Ljava/lang/NumberFormatException;
        //  4202   4205   4205   4210   Ljava/lang/NumberFormatException;
        //  4207   4210   4210   4215   Ljava/lang/NumberFormatException;
        //  4217   4220   4220   4225   Ljava/lang/NumberFormatException;
        //  4229   4234   4234   4243   Ljava/lang/NumberFormatException;
        //  4276   4279   4279   4284   Ljava/lang/NumberFormatException;
        //  4303   4306   4306   4311   Ljava/lang/NumberFormatException;
        //  4313   4316   4316   4321   Ljava/lang/NumberFormatException;
        //  4323   4326   4326   4331   Ljava/lang/NumberFormatException;
        //  4381   4384   4384   4389   Ljava/lang/NumberFormatException;
        //  4386   4389   4389   4394   Ljava/lang/NumberFormatException;
        //  4394   4403   4458   4463   Ljava/lang/NumberFormatException;
        //  4415   4425   4463   4468   Ljava/lang/NumberFormatException;
        //  4437   4447   4468   4473   Ljava/lang/NumberFormatException;
        //  4473   4480   4570   4575   Ljava/lang/NumberFormatException;
        //  4484   4521   4575   4580   Ljava/lang/NumberFormatException;
        //  4525   4562   4565   4570   Ljava/lang/NumberFormatException;
        //  4572   4575   4575   4580   Ljava/lang/NumberFormatException;
        //  4577   4580   4565   4570   Ljava/lang/NumberFormatException;
        //  4587   4590   4590   4595   Ljava/lang/NumberFormatException;
        //  4592   4595   4595   4600   Ljava/lang/NumberFormatException;
        //  4597   4600   4600   4605   Ljava/lang/NumberFormatException;
        //  4705   4708   4708   4713   Ljava/lang/NumberFormatException;
        //  4710   4713   4713   4718   Ljava/lang/NumberFormatException;
        //  4715   4718   4718   4723   Ljava/lang/NumberFormatException;
        //  4720   4723   4723   4728   Ljava/lang/NumberFormatException;
        //  4725   4728   4728   4733   Ljava/lang/NumberFormatException;
        //  4730   4733   4733   4738   Ljava/lang/NumberFormatException;
        //  4735   4738   4738   4743   Ljava/lang/NumberFormatException;
        //  4740   4743   4743   4748   Ljava/lang/NumberFormatException;
        //  4755   4758   4758   4763   Ljava/lang/NumberFormatException;
        //  4760   4763   4763   4768   Ljava/lang/NumberFormatException;
        //  4765   4768   4768   4773   Ljava/lang/NumberFormatException;
        //  4828   4831   4831   4836   Ljava/lang/NumberFormatException;
        //  4838   4841   4841   4851   Ljava/lang/NumberFormatException;
        //  4843   4846   4846   4851   Ljava/lang/NumberFormatException;
        //  4848   4851   4851   4856   Ljava/lang/NumberFormatException;
        //  4853   4856   4856   4861   Ljava/lang/NumberFormatException;
        //  4858   4861   4861   4871   Ljava/lang/NumberFormatException;
        //  4863   4866   4866   4871   Ljava/lang/NumberFormatException;
        //  4879   4882   4882   4887   Ljava/lang/NumberFormatException;
        //  4889   4892   4892   4897   Ljava/lang/NumberFormatException;
        //  4899   4919   4919   4924   Ljava/lang/NumberFormatException;
        //  4941   4944   4944   4949   Ljava/lang/NumberFormatException;
        //  4946   4949   4949   4954   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 2172, Size: 2172
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
