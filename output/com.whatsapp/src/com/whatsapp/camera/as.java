// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.co;

class as extends co
{
    private static final String[] z;
    final CameraActivity b;
    
    static {
        final String[] z2 = new String[6];
        String s = "(w<}\u0013*w2l\b=\u007f%aN8b>h\u0017\"r4w\u0002*f%m\u0013.6";
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
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = 'K';
                        break;
                    }
                    case 1: {
                        c2 = '\u0016';
                        break;
                    }
                    case 2: {
                        c2 = 'Q';
                        break;
                    }
                    case 3: {
                        c2 = '\u0018';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0005yqk\u0011*u4";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "8}8h>;d4n\b.a";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "=\u007f5}\u000ed<";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "(w!l\b$x";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "*x5j\u000e\"r\u007fq\u000f?s?lO.n%j\u0000eE\u0005J$\n[";
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
    
    as(final CameraActivity b) {
        this.b = b;
    }
    
    @Override
    public void a(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //     8: invokestatic    com/whatsapp/camera/CameraActivity.i:(Lcom/whatsapp/camera/CameraActivity;)Lcom/whatsapp/ConversationTextEntry;
        //    11: invokevirtual   com/whatsapp/ConversationTextEntry.getText:()Landroid/text/Editable;
        //    14: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    17: astore_3       
        //    18: aload_0        
        //    19: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //    22: invokestatic    com/whatsapp/camera/CameraActivity.x:(Lcom/whatsapp/camera/CameraActivity;)Lcom/whatsapp/a_9;
        //    25: ifnull          182
        //    28: aload_0        
        //    29: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //    32: aload_0        
        //    33: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //    36: invokestatic    com/whatsapp/camera/CameraActivity.x:(Lcom/whatsapp/camera/CameraActivity;)Lcom/whatsapp/a_9;
        //    39: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    42: aload_0        
        //    43: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //    46: invokestatic    com/whatsapp/camera/CameraActivity.l:(Lcom/whatsapp/camera/CameraActivity;)Ljava/io/File;
        //    49: iconst_3       
        //    50: iconst_0       
        //    51: iconst_0       
        //    52: aload_3        
        //    53: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;BIZLjava/lang/String;)Z
        //    56: pop            
        //    57: aload_0        
        //    58: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //    61: aload_0        
        //    62: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //    65: invokestatic    com/whatsapp/camera/CameraActivity.l:(Lcom/whatsapp/camera/CameraActivity;)Ljava/io/File;
        //    68: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //    71: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //    74: aload_0        
        //    75: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //    78: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //    81: return         
        //    82: astore          9
        //    84: aload           9
        //    86: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //    89: astore          13
        //    91: aload           13
        //    93: ifnull          136
        //    96: aload           9
        //    98: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   101: getstatic       com/whatsapp/camera/as.z:[Ljava/lang/String;
        //   104: iconst_1       
        //   105: aaload         
        //   106: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   109: istore          14
        //   111: iload           14
        //   113: ifeq            136
        //   116: aload_0        
        //   117: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //   120: aload_0        
        //   121: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //   124: ldc             2131231078
        //   126: invokevirtual   com/whatsapp/camera/CameraActivity.getString:(I)Ljava/lang/String;
        //   129: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //   132: iload_2        
        //   133: ifeq            149
        //   136: aload_0        
        //   137: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //   140: invokevirtual   com/whatsapp/camera/CameraActivity.getBaseContext:()Landroid/content/Context;
        //   143: ldc             2131231735
        //   145: iconst_0       
        //   146: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   149: new             Ljava/lang/StringBuilder;
        //   152: dup            
        //   153: invokespecial   java/lang/StringBuilder.<init>:()V
        //   156: getstatic       com/whatsapp/camera/as.z:[Ljava/lang/String;
        //   159: iconst_0       
        //   160: aaload         
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: aload           9
        //   166: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   175: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   178: iload_2        
        //   179: ifeq            57
        //   182: new             Landroid/content/Intent;
        //   185: dup            
        //   186: aload_0        
        //   187: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //   190: invokevirtual   com/whatsapp/camera/CameraActivity.getBaseContext:()Landroid/content/Context;
        //   193: ldc             Lcom/whatsapp/ContactPicker;.class
        //   195: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   198: astore          4
        //   200: aload           4
        //   202: getstatic       com/whatsapp/camera/as.z:[Ljava/lang/String;
        //   205: iconst_3       
        //   206: aaload         
        //   207: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   210: pop            
        //   211: aload_0        
        //   212: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //   215: invokestatic    com/whatsapp/camera/CameraActivity.l:(Lcom/whatsapp/camera/CameraActivity;)Ljava/io/File;
        //   218: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   221: astore          6
        //   223: aload_3        
        //   224: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   227: ifne            249
        //   230: aload           6
        //   232: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //   235: getstatic       com/whatsapp/camera/as.z:[Ljava/lang/String;
        //   238: iconst_4       
        //   239: aaload         
        //   240: aload_3        
        //   241: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   244: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   247: astore          6
        //   249: aload           4
        //   251: getstatic       com/whatsapp/camera/as.z:[Ljava/lang/String;
        //   254: iconst_5       
        //   255: aaload         
        //   256: aload           6
        //   258: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   261: pop            
        //   262: aload           4
        //   264: getstatic       com/whatsapp/camera/as.z:[Ljava/lang/String;
        //   267: iconst_2       
        //   268: aaload         
        //   269: iconst_1       
        //   270: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   273: pop            
        //   274: aload_0        
        //   275: getfield        com/whatsapp/camera/as.b:Lcom/whatsapp/camera/CameraActivity;
        //   278: aload           4
        //   280: invokevirtual   com/whatsapp/camera/CameraActivity.startActivity:(Landroid/content/Intent;)V
        //   283: goto            57
        //   286: astore          10
        //   288: aload           10
        //   290: athrow         
        //   291: astore          11
        //   293: aload           11
        //   295: athrow         
        //   296: astore          12
        //   298: aload           12
        //   300: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  28     57     82     301    Ljava/io/IOException;
        //  84     91     286    291    Ljava/io/IOException;
        //  96     111    291    296    Ljava/io/IOException;
        //  116    132    296    301    Ljava/io/IOException;
        //  136    149    296    301    Ljava/io/IOException;
        //  288    291    291    296    Ljava/io/IOException;
        //  293    296    296    301    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 141, Size: 141
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
