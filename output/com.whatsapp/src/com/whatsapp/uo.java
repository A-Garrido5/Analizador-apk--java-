// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.contact.h;

final class uo implements Runnable
{
    private static final String[] z;
    final h a;
    
    static {
        final String[] z2 = new String[7];
        String s = "K\u0006\u0001TWK\u001c\u001f[AT\u0007\u0010\u0018EAF\u0012TCX\u0000\u0001R";
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
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = 'i';
                        break;
                    }
                    case 2: {
                        c2 = 's';
                        break;
                    }
                    case 3: {
                        c2 = '7';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "K\u0006\u0001TWK\u001c\u001f[AT\u0007\u0010\u0018EAF\u0001R^H\b\u0000R";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "K\u001c\u001f[AT\u0007\u0010";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "K\u0006\u0001TWK\u001c\u001f[AT\u0007\u0010\u0018EAF\u0001R^H\b\u0000R";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "]\u0006\u0004R@";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "K\u0006\u0001TWK\u001c\u001f[AT\u0007\u0010\u0018W_\u001b\u001cE";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "K\u0006\u0001TWK\u001c\u001f[AT\u0007\u0010\u0018EAF\u0001R^H\b\u0000R";
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
    
    uo(final h a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     3: getstatic       com/whatsapp/uo.z:[Ljava/lang/String;
        //     6: iconst_4       
        //     7: aaload         
        //     8: invokevirtual   com/whatsapp/App.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    11: checkcast       Landroid/os/PowerManager;
        //    14: astore_1       
        //    15: aconst_null    
        //    16: astore_2       
        //    17: aload_1        
        //    18: ifnull          32
        //    21: aload_1        
        //    22: iconst_1       
        //    23: getstatic       com/whatsapp/uo.z:[Ljava/lang/String;
        //    26: iconst_2       
        //    27: aaload         
        //    28: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //    31: astore_2       
        //    32: aload_2        
        //    33: ifnull          48
        //    36: aload_2        
        //    37: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //    40: getstatic       com/whatsapp/uo.z:[Ljava/lang/String;
        //    43: iconst_0       
        //    44: aaload         
        //    45: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    48: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    51: aload_0        
        //    52: getfield        com/whatsapp/uo.a:Lcom/whatsapp/contact/h;
        //    55: invokestatic    com/whatsapp/contact/f.d:(Landroid/content/Context;Lcom/whatsapp/contact/h;)Lcom/whatsapp/contact/k;
        //    58: astore          7
        //    60: aload           7
        //    62: invokevirtual   com/whatsapp/contact/k.isSuccess:()Z
        //    65: ifeq            94
        //    68: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //    71: iconst_1       
        //    72: invokevirtual   com/whatsapp/m7.c:(Z)V
        //    75: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    78: invokestatic    java/lang/System.currentTimeMillis:()J
        //    81: invokevirtual   com/whatsapp/App.a:(J)V
        //    84: getstatic       com/whatsapp/App.I:Z
        //    87: istore          15
        //    89: iload           15
        //    91: ifeq            113
        //    94: aload           7
        //    96: invokevirtual   com/whatsapp/contact/k.isFailure:()Z
        //    99: istore          11
        //   101: iload           11
        //   103: ifeq            113
        //   106: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //   109: iconst_1       
        //   110: invokevirtual   com/whatsapp/m7.b:(Z)V
        //   113: aload_2        
        //   114: ifnull          140
        //   117: aload_2        
        //   118: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   121: istore          14
        //   123: iload           14
        //   125: ifeq            140
        //   128: aload_2        
        //   129: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   132: getstatic       com/whatsapp/uo.z:[Ljava/lang/String;
        //   135: iconst_1       
        //   136: aaload         
        //   137: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   140: return         
        //   141: astore          16
        //   143: aload           16
        //   145: athrow         
        //   146: astore          5
        //   148: getstatic       com/whatsapp/uo.z:[Ljava/lang/String;
        //   151: iconst_5       
        //   152: aaload         
        //   153: aload           5
        //   155: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   158: aload_2        
        //   159: ifnull          140
        //   162: aload_2        
        //   163: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   166: ifeq            140
        //   169: aload_2        
        //   170: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   173: getstatic       com/whatsapp/uo.z:[Ljava/lang/String;
        //   176: bipush          6
        //   178: aaload         
        //   179: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   182: return         
        //   183: astore          6
        //   185: aload           6
        //   187: athrow         
        //   188: astore          8
        //   190: aload           8
        //   192: athrow         
        //   193: astore          9
        //   195: aload           9
        //   197: athrow         
        //   198: astore          10
        //   200: aload           10
        //   202: athrow         
        //   203: astore_3       
        //   204: aload_2        
        //   205: ifnull          227
        //   208: aload_2        
        //   209: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   212: ifeq            227
        //   215: aload_2        
        //   216: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   219: getstatic       com/whatsapp/uo.z:[Ljava/lang/String;
        //   222: iconst_3       
        //   223: aaload         
        //   224: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   227: aload_3        
        //   228: athrow         
        //   229: astore          12
        //   231: aload           12
        //   233: athrow         
        //   234: astore          13
        //   236: aload           13
        //   238: athrow         
        //   239: astore          4
        //   241: aload           4
        //   243: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  36     48     141    146    Ljava/lang/Exception;
        //  36     48     203    229    Any
        //  48     60     146    188    Ljava/lang/Exception;
        //  48     60     203    229    Any
        //  60     89     188    193    Ljava/lang/Exception;
        //  60     89     203    229    Any
        //  94     101    193    198    Ljava/lang/Exception;
        //  94     101    203    229    Any
        //  106    113    198    203    Ljava/lang/Exception;
        //  106    113    203    229    Any
        //  117    123    229    234    Ljava/lang/Exception;
        //  128    140    234    239    Ljava/lang/Exception;
        //  143    146    146    188    Ljava/lang/Exception;
        //  143    146    203    229    Any
        //  148    158    203    229    Any
        //  162    182    183    188    Ljava/lang/Exception;
        //  190    193    193    198    Ljava/lang/Exception;
        //  190    193    203    229    Any
        //  195    198    198    203    Ljava/lang/Exception;
        //  195    198    203    229    Any
        //  200    203    146    188    Ljava/lang/Exception;
        //  200    203    203    229    Any
        //  208    227    239    244    Ljava/lang/Exception;
        //  231    234    234    239    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 122, Size: 122
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
}
