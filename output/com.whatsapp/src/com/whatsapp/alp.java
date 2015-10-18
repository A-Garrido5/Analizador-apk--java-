// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.StringReader;
import java.io.OutputStream;
import java.io.File;
import java.util.LinkedList;
import java.net.URL;

public class alp
{
    private static final String[] z;
    final _b a;
    final int b;
    final URL c;
    LinkedList d;
    int e;
    final int f;
    final a6i g;
    
    static {
        final String[] z2 = new String[20];
        String s = "S\t\u0014}mN\u001d\n}+X\u0013\nd)Z\u001d\fh?\\\u0013\rg`_\u000e\u00014|g\u0006\"P";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0532:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = 'x';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "X\u0015\u0014lqN\u0010\u0017h`\u0011\u0012\u0017{aM\f\u0017gw[";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "F%\u0002S]";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0013Q\u0000P~d%u\u0003";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0013VW#\t4";
                    n = 3;
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "}\u0013\u0016}aP\bU]}N\u0019B)eN\f\u0014`g_\b\u0011fj\u0011\u0013\u001b}aJQ\u000b}v[\u001d\u0015\u0004\u000e";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "F%\u0002S]";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "}\u0013\u0016}aP\bUMmM\f\u0017zmJ\u0015\u0017g>\u001e\u001a\u0017{i\u0013\u0018\u0019}e\u0005\\\u0016hi[AZomR\u0019Z2bW\u0010\u001dgeS\u0019E+";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0013Qu\u0003";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    s = "3v";
                    n = 8;
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    array = z2;
                    s = "3v";
                    n = 9;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "3v";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "3vU$";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "3v;fjJ\u0019\u0016})z\u0015\u000bykM\u0015\f`kPFXokL\u0011UmeJ\u001dC)j_\u0011\u001d4&";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u001cqr";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "3v";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "}\u0013\u0016}aP\bU]}N\u0019";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "3vU$";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u001cqr\u0004\u000e";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "}\u0013\u0016}aP\bU[eP\u001b\u001d3$\\\u0005\flw\u001e";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    break Label_0532;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public alp(final URL c, final _b a, final int b, final int f, final a6i g) {
        this.d = new LinkedList();
        this.c = c;
        this.a = a;
        this.b = b;
        this.f = f;
        this.g = g;
    }
    
    public alp(final URL url, final File file, final int n, final a6i a6i) {
        this(url, new ip(file), 0, n, a6i);
    }
    
    static void a(final OutputStream outputStream, final String s) {
        final boolean i = App.I;
        final StringReader stringReader = new StringReader(s);
        while (true) {
            try {
                do {
                    final int read = stringReader.read();
                    if (read == -1) {
                        break;
                    }
                    outputStream.write((char)read);
                } while (!i);
                outputStream.flush();
            }
            catch (Exception ex) {
                Log.b(ex);
                continue;
            }
            break;
        }
    }
    
    public void a(final String s, final String s2) {
        this.d.add(new ac(this, s, s2));
    }
    
    public boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: astore_2       
        //    12: aload_0        
        //    13: getfield        com/whatsapp/alp.a:Lcom/whatsapp/_b;
        //    16: invokeinterface com/whatsapp/_b.a:()Ljava/lang/String;
        //    21: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //    24: bipush          10
        //    26: aaload         
        //    27: ldc             ""
        //    29: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //    32: astore_3       
        //    33: aload_2        
        //    34: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //    37: iconst_3       
        //    38: aaload         
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //    45: bipush          7
        //    47: aaload         
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: aload_3        
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //    58: bipush          14
        //    60: aaload         
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //    67: iconst_5       
        //    68: aaload         
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: pop            
        //    73: aload_0        
        //    74: getfield        com/whatsapp/alp.b:I
        //    77: ifeq            106
        //    80: aload_2        
        //    81: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //    84: bipush          19
        //    86: aaload         
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: aload_0        
        //    91: getfield        com/whatsapp/alp.b:I
        //    94: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    97: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   100: iconst_4       
        //   101: aaload         
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload_2        
        //   107: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   110: bipush          9
        //   112: aaload         
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: pop            
        //   117: aload_2        
        //   118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   121: astore          7
        //   123: new             Ljava/lang/StringBuilder;
        //   126: dup            
        //   127: invokespecial   java/lang/StringBuilder.<init>:()V
        //   130: astore          8
        //   132: aload_0        
        //   133: getfield        com/whatsapp/alp.d:Ljava/util/LinkedList;
        //   136: invokevirtual   java/util/LinkedList.iterator:()Ljava/util/Iterator;
        //   139: astore          9
        //   141: aload           9
        //   143: invokeinterface java/util/Iterator.hasNext:()Z
        //   148: ifeq            251
        //   151: aload           9
        //   153: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   158: checkcast       Lcom/whatsapp/ac;
        //   161: astore          26
        //   163: aload           26
        //   165: getfield        com/whatsapp/ac.b:Ljava/lang/String;
        //   168: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   171: bipush          15
        //   173: aaload         
        //   174: ldc             ""
        //   176: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   179: astore          27
        //   181: aload           26
        //   183: getfield        com/whatsapp/ac.c:Ljava/lang/String;
        //   186: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   189: bipush          11
        //   191: aaload         
        //   192: ldc             ""
        //   194: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   197: astore          28
        //   199: aload           8
        //   201: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   204: bipush          17
        //   206: aaload         
        //   207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   210: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   213: iconst_2       
        //   214: aaload         
        //   215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   218: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   221: bipush          13
        //   223: aaload         
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: aload           27
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   235: bipush          18
        //   237: aaload         
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: aload           28
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: pop            
        //   247: iload_1        
        //   248: ifeq            141
        //   251: aload           8
        //   253: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   256: bipush          12
        //   258: aaload         
        //   259: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   262: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   265: bipush          6
        //   267: aaload         
        //   268: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   271: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   274: bipush          8
        //   276: aaload         
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: pop            
        //   281: aload           8
        //   283: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   286: astore          11
        //   288: aload_0        
        //   289: getfield        com/whatsapp/alp.a:Lcom/whatsapp/_b;
        //   292: invokeinterface com/whatsapp/_b.b:()J
        //   297: lconst_0       
        //   298: lcmp           
        //   299: iflt            432
        //   302: aload           7
        //   304: invokevirtual   java/lang/String.length:()I
        //   307: i2l            
        //   308: aload_0        
        //   309: getfield        com/whatsapp/alp.a:Lcom/whatsapp/_b;
        //   312: invokeinterface com/whatsapp/_b.b:()J
        //   317: ladd           
        //   318: aload           11
        //   320: invokevirtual   java/lang/String.length:()I
        //   323: i2l            
        //   324: ladd           
        //   325: lstore          23
        //   327: aload_0        
        //   328: getfield        com/whatsapp/alp.b:I
        //   331: istore          25
        //   333: lload           23
        //   335: iload           25
        //   337: i2l            
        //   338: lsub           
        //   339: lstore          13
        //   341: new             Lcom/whatsapp/cq;
        //   344: dup            
        //   345: aload_0        
        //   346: new             Lcom/whatsapp/cy;
        //   349: dup            
        //   350: aload_0        
        //   351: aload           7
        //   353: aload           11
        //   355: invokespecial   com/whatsapp/cy.<init>:(Lcom/whatsapp/alp;Ljava/lang/String;Ljava/lang/String;)V
        //   358: lload           13
        //   360: invokespecial   com/whatsapp/cq.<init>:(Lcom/whatsapp/alp;Lorg/apache/http/entity/ContentProducer;J)V
        //   363: astore          15
        //   365: aload_0        
        //   366: getfield        com/whatsapp/alp.c:Ljava/net/URL;
        //   369: invokevirtual   java/net/URL.toString:()Ljava/lang/String;
        //   372: invokestatic    com/whatsapp/e6.a:(Ljava/lang/String;)Lcom/whatsapp/e6;
        //   375: astore          16
        //   377: aload           16
        //   379: aload           15
        //   381: invokevirtual   com/whatsapp/e6.a:(Lorg/apache/http/HttpEntity;)V
        //   384: aload           16
        //   386: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   389: bipush          16
        //   391: aaload         
        //   392: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   395: iconst_0       
        //   396: aaload         
        //   397: invokevirtual   com/whatsapp/e6.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   400: aload           16
        //   402: invokevirtual   com/whatsapp/e6.a:()Lorg/apache/http/HttpResponse;
        //   405: astore          18
        //   407: aload           18
        //   409: ifnonnull       449
        //   412: getstatic       com/whatsapp/alp.z:[Ljava/lang/String;
        //   415: iconst_1       
        //   416: aaload         
        //   417: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   420: iconst_0       
        //   421: ireturn        
        //   422: astore          4
        //   424: aload           4
        //   426: athrow         
        //   427: astore          12
        //   429: aload           12
        //   431: athrow         
        //   432: ldc2_w          -1
        //   435: lstore          13
        //   437: goto            341
        //   440: astore          17
        //   442: iconst_0       
        //   443: ireturn        
        //   444: astore          22
        //   446: aload           22
        //   448: athrow         
        //   449: aload_0        
        //   450: aload           18
        //   452: invokeinterface org/apache/http/HttpResponse.getStatusLine:()Lorg/apache/http/StatusLine;
        //   457: invokeinterface org/apache/http/StatusLine.getStatusCode:()I
        //   462: putfield        com/whatsapp/alp.e:I
        //   465: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   468: invokevirtual   java/lang/Thread.isInterrupted:()Z
        //   471: istore          20
        //   473: iload           20
        //   475: ifeq            485
        //   478: iconst_0       
        //   479: ireturn        
        //   480: astore          19
        //   482: aload           19
        //   484: athrow         
        //   485: aload_0        
        //   486: getfield        com/whatsapp/alp.g:Lcom/whatsapp/a6i;
        //   489: ifnull          525
        //   492: aload_0        
        //   493: getfield        com/whatsapp/alp.g:Lcom/whatsapp/a6i;
        //   496: aload           18
        //   498: invokeinterface org/apache/http/HttpResponse.getAllHeaders:()[Lorg/apache/http/Header;
        //   503: aload           18
        //   505: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //   510: invokestatic    org/apache/http/util/EntityUtils.toString:(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
        //   513: invokeinterface com/whatsapp/a6i.a:([Lorg/apache/http/Header;Ljava/lang/String;)V
        //   518: iconst_1       
        //   519: ireturn        
        //   520: astore          21
        //   522: aload           21
        //   524: athrow         
        //   525: iconst_1       
        //   526: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  33     106    422    427    Ljava/net/SocketTimeoutException;
        //  288    333    427    432    Ljava/net/SocketTimeoutException;
        //  400    407    440    444    Ljava/net/SocketTimeoutException;
        //  412    420    444    449    Ljava/net/SocketTimeoutException;
        //  449    473    480    485    Ljava/net/SocketTimeoutException;
        //  485    518    520    525    Ljava/net/SocketTimeoutException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 245, Size: 245
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
    
    public int b() {
        return this.e;
    }
}
