// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;

class k4 extends AsyncTask
{
    private static final String[] z;
    t8 a;
    final a9 b;
    
    static {
        final String[] z2 = new String[5];
        String s = "`@*NQOLo";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = '/';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "CJnT@[_fR@J\u0000zOD^NxXHCNmX\u000e\u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "CJnT@[_fR@J\u0000zOD^NxXHCNmX\u000e\u000e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "CJnT@[_fR@J\u0000zOD^NxXHCNmX\u000e\u000e";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "CJnT@[_fR@J\u0000zOD^NxXHCNmX\u000e\u000e";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    k4(final a9 b) {
        this.b = b;
        this.a = t8.SUCCESS;
    }
    
    protected String a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //     4: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //     7: getfield        com/whatsapp/protocol/bi.I:B
        //    10: iconst_1       
        //    11: if_icmpne       188
        //    14: aload_0        
        //    15: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //    18: invokestatic    com/whatsapp/a9.c:(Lcom/whatsapp/a9;)Lcom/whatsapp/MediaData;
        //    21: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    24: astore          5
        //    26: aload           5
        //    28: ifnonnull       188
        //    31: aload_0        
        //    32: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //    35: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //    38: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //    41: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    44: astore          6
        //    46: invokestatic    com/whatsapp/a9.a:()Ljava/lang/Object;
        //    49: astore          16
        //    51: aload           16
        //    53: monitorenter   
        //    54: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    57: aload           6
        //    59: aload_0        
        //    60: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //    63: invokestatic    com/whatsapp/a9.c:(Lcom/whatsapp/a9;)Lcom/whatsapp/MediaData;
        //    66: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;Lcom/whatsapp/MediaData;)[B
        //    69: astore          18
        //    71: aload_0        
        //    72: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //    75: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //    78: aload           18
        //    80: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //    83: aload_0        
        //    84: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //    87: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //    90: aload_0        
        //    91: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //    94: invokestatic    com/whatsapp/a9.c:(Lcom/whatsapp/a9;)Lcom/whatsapp/MediaData;
        //    97: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   100: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   103: putfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   106: aload_0        
        //   107: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //   110: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   113: aload_0        
        //   114: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //   117: invokestatic    com/whatsapp/a9.c:(Lcom/whatsapp/a9;)Lcom/whatsapp/MediaData;
        //   120: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   123: invokevirtual   java/io/File.length:()J
        //   126: putfield        com/whatsapp/protocol/bi.L:J
        //   129: aload_0        
        //   130: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //   133: invokestatic    com/whatsapp/a9.c:(Lcom/whatsapp/a9;)Lcom/whatsapp/MediaData;
        //   136: aload_0        
        //   137: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //   140: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   143: getfield        com/whatsapp/protocol/bi.L:J
        //   146: putfield        com/whatsapp/MediaData.fileSize:J
        //   149: aload           16
        //   151: monitorexit    
        //   152: aload_0        
        //   153: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //   156: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   159: invokestatic    com/whatsapp/util/b.c:(Lcom/whatsapp/protocol/bi;)V
        //   162: aload_0        
        //   163: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //   166: invokestatic    com/whatsapp/a9.c:(Lcom/whatsapp/a9;)Lcom/whatsapp/MediaData;
        //   169: iconst_1       
        //   170: putfield        com/whatsapp/MediaData.autodownloadRetryEnabled:Z
        //   173: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   176: aload_0        
        //   177: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //   180: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   183: iconst_1       
        //   184: iconst_m1      
        //   185: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   188: aload_0        
        //   189: getfield        com/whatsapp/k4.a:Lcom/whatsapp/t8;
        //   192: getstatic       com/whatsapp/t8.SUCCESS:Lcom/whatsapp/t8;
        //   195: if_acmpne       448
        //   198: aload_0        
        //   199: getfield        com/whatsapp/k4.b:Lcom/whatsapp/a9;
        //   202: invokevirtual   com/whatsapp/a9.h:()Ljava/lang/String;
        //   205: astore          4
        //   207: aload           4
        //   209: areturn        
        //   210: astore_2       
        //   211: aload_2        
        //   212: athrow         
        //   213: astore          17
        //   215: aload           16
        //   217: monitorexit    
        //   218: aload           17
        //   220: athrow         
        //   221: astore          10
        //   223: new             Ljava/lang/StringBuilder;
        //   226: dup            
        //   227: invokespecial   java/lang/StringBuilder.<init>:()V
        //   230: getstatic       com/whatsapp/k4.z:[Ljava/lang/String;
        //   233: iconst_3       
        //   234: aaload         
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: aload           10
        //   240: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   249: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   252: aload           10
        //   254: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   257: astore          14
        //   259: aload           14
        //   261: ifnull          297
        //   264: aload           10
        //   266: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   269: getstatic       com/whatsapp/k4.z:[Ljava/lang/String;
        //   272: iconst_0       
        //   273: aaload         
        //   274: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   277: istore          15
        //   279: iload           15
        //   281: ifeq            297
        //   284: aload_0        
        //   285: getstatic       com/whatsapp/t8.FAILED_INSUFFICIENT_SPACE:Lcom/whatsapp/t8;
        //   288: putfield        com/whatsapp/k4.a:Lcom/whatsapp/t8;
        //   291: getstatic       com/whatsapp/App.I:Z
        //   294: ifeq            188
        //   297: aload_0        
        //   298: getstatic       com/whatsapp/t8.FAILED_IO:Lcom/whatsapp/t8;
        //   301: putfield        com/whatsapp/k4.a:Lcom/whatsapp/t8;
        //   304: goto            188
        //   307: astore          13
        //   309: aload           13
        //   311: athrow         
        //   312: astore          11
        //   314: aload           11
        //   316: athrow         
        //   317: astore          12
        //   319: aload           12
        //   321: athrow         
        //   322: astore          9
        //   324: new             Ljava/lang/StringBuilder;
        //   327: dup            
        //   328: invokespecial   java/lang/StringBuilder.<init>:()V
        //   331: getstatic       com/whatsapp/k4.z:[Ljava/lang/String;
        //   334: iconst_1       
        //   335: aaload         
        //   336: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   339: aload           9
        //   341: invokevirtual   com/whatsapp/util/av.toString:()Ljava/lang/String;
        //   344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   347: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   350: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   353: aload_0        
        //   354: getstatic       com/whatsapp/t8.FAILED_BAD_MEDIA:Lcom/whatsapp/t8;
        //   357: putfield        com/whatsapp/k4.a:Lcom/whatsapp/t8;
        //   360: goto            188
        //   363: astore          8
        //   365: new             Ljava/lang/StringBuilder;
        //   368: dup            
        //   369: invokespecial   java/lang/StringBuilder.<init>:()V
        //   372: getstatic       com/whatsapp/k4.z:[Ljava/lang/String;
        //   375: iconst_4       
        //   376: aaload         
        //   377: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   380: aload           8
        //   382: invokevirtual   java/lang/OutOfMemoryError.toString:()Ljava/lang/String;
        //   385: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   391: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   394: aload_0        
        //   395: getstatic       com/whatsapp/t8.FAILED_OOM:Lcom/whatsapp/t8;
        //   398: putfield        com/whatsapp/k4.a:Lcom/whatsapp/t8;
        //   401: goto            188
        //   404: astore          7
        //   406: new             Ljava/lang/StringBuilder;
        //   409: dup            
        //   410: invokespecial   java/lang/StringBuilder.<init>:()V
        //   413: getstatic       com/whatsapp/k4.z:[Ljava/lang/String;
        //   416: iconst_2       
        //   417: aaload         
        //   418: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   421: aload           7
        //   423: invokevirtual   java/lang/SecurityException.toString:()Ljava/lang/String;
        //   426: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   429: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   432: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   435: aload_0        
        //   436: getstatic       com/whatsapp/t8.FAILED_NO_PERMISSIONS:Lcom/whatsapp/t8;
        //   439: putfield        com/whatsapp/k4.a:Lcom/whatsapp/t8;
        //   442: goto            188
        //   445: astore_3       
        //   446: aload_3        
        //   447: athrow         
        //   448: aconst_null    
        //   449: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  0      26     210    213    Ljava/io/IOException;
        //  46     54     221    322    Ljava/io/IOException;
        //  46     54     322    363    Lcom/whatsapp/util/av;
        //  46     54     363    404    Ljava/lang/OutOfMemoryError;
        //  46     54     404    445    Ljava/lang/SecurityException;
        //  54     152    213    221    Any
        //  152    188    221    322    Ljava/io/IOException;
        //  152    188    322    363    Lcom/whatsapp/util/av;
        //  152    188    363    404    Ljava/lang/OutOfMemoryError;
        //  152    188    404    445    Ljava/lang/SecurityException;
        //  188    207    445    448    Ljava/io/IOException;
        //  215    218    213    221    Any
        //  218    221    221    322    Ljava/io/IOException;
        //  218    221    322    363    Lcom/whatsapp/util/av;
        //  218    221    363    404    Ljava/lang/OutOfMemoryError;
        //  218    221    404    445    Ljava/lang/SecurityException;
        //  223    259    312    317    Ljava/io/IOException;
        //  264    279    317    322    Ljava/io/IOException;
        //  284    297    307    312    Ljava/io/IOException;
        //  297    304    307    312    Ljava/io/IOException;
        //  314    317    317    322    Ljava/io/IOException;
        //  319    322    307    312    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 198, Size: 198
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
    
    public void a(final String s) {
        if (s != null) {
            a9.a(this.b, s);
            return;
        }
        while (true) {
            while (true) {
                try {
                    final a9 b = this.b;
                    if (this.a != t8.SUCCESS) {
                        final t8 t8 = this.a;
                        b.a(t8);
                        return;
                    }
                }
                catch (SecurityException ex) {
                    throw ex;
                }
                final t8 t8 = com.whatsapp.t8.FAILED_GENERIC;
                continue;
            }
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public void onPostExecute(final Object o) {
        this.a((String)o);
    }
}
