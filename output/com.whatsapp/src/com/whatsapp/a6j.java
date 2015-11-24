// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a6j implements View$OnClickListener
{
    private static final String[] z;
    final Advanced a;
    
    static {
        final String[] z2 = new String[6];
        String s = "h;\tz\t`0";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '}';
                        break;
                    }
                    case 0: {
                        c2 = '\u0005';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = '|';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "r<\u001d`\u000ed$\f:\u0011j3";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "V\u0010\\w\u001cw0\\z\u0012qt\u001db\u001cl8\u001dv\u0011`{\u000eq\u001ca-";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "f;\fm]i;\u001b4\tjt/P]f5\u000ep";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "I;\u001bg";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "r<\u001d`\u000ed$\f:\u0011j3";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a6j(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: getstatic       com/whatsapp/a6j.z:[Ljava/lang/String;
        //     5: iconst_3       
        //     6: aaload         
        //     7: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //    10: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //    13: getstatic       com/whatsapp/a6j.z:[Ljava/lang/String;
        //    16: iconst_0       
        //    17: aaload         
        //    18: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    21: ifeq            154
        //    24: new             Ljava/io/File;
        //    27: dup            
        //    28: new             Ljava/io/File;
        //    31: dup            
        //    32: aload_0        
        //    33: getfield        com/whatsapp/a6j.a:Lcom/whatsapp/Advanced;
        //    36: invokevirtual   com/whatsapp/Advanced.getFilesDir:()Ljava/io/File;
        //    39: getstatic       com/whatsapp/a6j.z:[Ljava/lang/String;
        //    42: iconst_4       
        //    43: aaload         
        //    44: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    47: getstatic       com/whatsapp/a6j.z:[Ljava/lang/String;
        //    50: iconst_1       
        //    51: aaload         
        //    52: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    55: astore_3       
        //    56: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    59: invokevirtual   java/io/File.exists:()Z
        //    62: ifne            72
        //    65: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    68: invokevirtual   java/io/File.mkdirs:()Z
        //    71: pop            
        //    72: new             Ljava/io/File;
        //    75: dup            
        //    76: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //    79: getstatic       com/whatsapp/a6j.z:[Ljava/lang/String;
        //    82: iconst_5       
        //    83: aaload         
        //    84: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    87: astore          5
        //    89: new             Lcom/whatsapp/util/c;
        //    92: dup            
        //    93: getstatic       com/whatsapp/App.n:Lcom/whatsapp/util/p;
        //    96: aload           5
        //    98: invokespecial   com/whatsapp/util/c.<init>:(Lcom/whatsapp/util/p;Ljava/io/File;)V
        //   101: invokestatic    java/nio/channels/Channels.newChannel:(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
        //   104: astore          12
        //   106: aload           12
        //   108: astore          7
        //   110: new             Ljava/io/FileInputStream;
        //   113: dup            
        //   114: aload_3        
        //   115: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   118: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //   121: astore_2       
        //   122: aload_2        
        //   123: aload           7
        //   125: invokestatic    com/whatsapp/util/ba.a:(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
        //   128: aload_2        
        //   129: ifnull          136
        //   132: aload_2        
        //   133: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   136: aload           7
        //   138: ifnull          148
        //   141: aload           7
        //   143: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   148: getstatic       com/whatsapp/App.I:Z
        //   151: ifeq            162
        //   154: getstatic       com/whatsapp/a6j.z:[Ljava/lang/String;
        //   157: iconst_2       
        //   158: aaload         
        //   159: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //   162: return         
        //   163: astore          4
        //   165: aload           4
        //   167: athrow         
        //   168: astore          13
        //   170: aload           13
        //   172: athrow         
        //   173: astore          8
        //   175: goto            148
        //   178: astore          6
        //   180: aconst_null    
        //   181: astore          7
        //   183: aload_2        
        //   184: ifnull          191
        //   187: aload_2        
        //   188: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   191: aload           7
        //   193: ifnull          203
        //   196: aload           7
        //   198: invokeinterface java/nio/channels/WritableByteChannel.close:()V
        //   203: aload           6
        //   205: athrow         
        //   206: astore          11
        //   208: aload           11
        //   210: athrow         
        //   211: astore          10
        //   213: aload           10
        //   215: athrow         
        //   216: astore          9
        //   218: aload           9
        //   220: athrow         
        //   221: astore          6
        //   223: goto            183
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  56     72     163    168    Ljava/io/IOException;
        //  89     106    178    183    Any
        //  110    128    221    226    Any
        //  132    136    173    178    Ljava/io/IOException;
        //  141    148    168    173    Ljava/io/IOException;
        //  148    154    216    221    Ljava/io/IOException;
        //  154    162    216    221    Ljava/io/IOException;
        //  170    173    173    178    Ljava/io/IOException;
        //  187    191    206    211    Ljava/io/IOException;
        //  196    203    211    216    Ljava/io/IOException;
        //  203    206    173    178    Ljava/io/IOException;
        //  208    211    173    178    Ljava/io/IOException;
        //  213    216    173    178    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 107, Size: 107
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
