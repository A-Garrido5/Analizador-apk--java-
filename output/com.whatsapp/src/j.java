import android.content.ContentValues;
import com.whatsapp.DialogToastActivity;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.nio.ByteBuffer;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.io.UnsupportedEncodingException;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

package java.lang;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class j implements s
{
    private static String b;
    public static String g;
    private static final String[] z;
    private r a;
    public List c;
    private String d;
    private String e;
    private String f;
    private boolean h;
    private int i;
    private q j;
    
    static {
        int n = -1;
        final String[] z2 = new String[13];
        int n2 = 0;
        String[] array = z2;
        String s = "\u0012\u0013?k22\u0019i{+4\t,ns+\u000f d*:\u001f%o~>\u0013*e:2\u0013.";
        int n3 = n;
        String intern = null;
    Label_0361:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n4 = 0; i > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = '^';
                        break;
                    }
                    case 0: {
                        c2 = '[';
                        break;
                    }
                    case 1: {
                        c2 = '}';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = '\n';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    array[n2] = intern;
                    s = "\u0012\u0013?k22\u0019i_\f\u0017],d=4\u0019 d9a]'e*{\u001ci|?7\u0014-*:2\u001a ~~s\u000f(n7#]x<wa]";
                    n2 = 1;
                    array = z2;
                    n3 = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\n(\u0006^\u001b\u001fP\u0019X\u0017\u0015)\bH\u0012\u001e";
                    n2 = 2;
                    array = z2;
                    n3 = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u001d\u001c f;?]=e~>\u0013*e:>Gii6:\u000f:o*f";
                    n3 = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u001d\u001c f;?]=e~?\u0018*e:>]8\u007f1/\u0018-'.)\u0014'~?9\u0011,0~";
                    n3 = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "Vw";
                    n3 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "ft";
                    n3 = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "f]";
                    n3 = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0019<\u001aOho";
                    n3 = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001d\u001c f;?]=e~>\u0013*e:>Gii6:\u000f:o*f";
                    n3 = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    s = "\u001d\u001c f;?]=e~>\u0013*e:>Gii6:\u000f:o*f";
                    n3 = 9;
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    array = z2;
                    s = "\u001e3\nE\u001a\u00123\u000e";
                    n3 = 10;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u000f$\u0019O";
                    n3 = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0361;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        String s2 = "\r9\b^\u001f\u0019\b f:>\u000f";
        String intern2 = null;
    Label_0625:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            for (int j = charArray2.length, n5 = 0; j > n5; ++n5) {
                final char c3 = charArray2[n5];
                char c4 = '\0';
                switch (n5 % 5) {
                    default: {
                        c4 = '^';
                        break;
                    }
                    case 0: {
                        c4 = '[';
                        break;
                    }
                    case 1: {
                        c4 = '}';
                        break;
                    }
                    case 2: {
                        c4 = 'I';
                        break;
                    }
                    case 3: {
                        c4 = '\n';
                        break;
                    }
                }
                charArray2[n5] = (char)(c4 ^ c3);
            }
            intern2 = new String(charArray2).intern();
            switch (n) {
                default: {
                    j.b = intern2;
                    s2 = "\u000e)\u000f'f";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0625;
                }
            }
        }
        j.g = intern2;
    }
    
    public j() {
        this(j.g, j.g, false);
    }
    
    public j(final String p0, final String p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       q.c:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0        
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: invokespecial   java/util/ArrayList.<init>:()V
        //    17: putfield        j.c:Ljava/util/List;
        //    20: aload_0        
        //    21: iconst_0       
        //    22: putfield        j.i:I
        //    25: aload_1        
        //    26: ifnull          39
        //    29: aload_0        
        //    30: aload_1        
        //    31: putfield        j.e:Ljava/lang/String;
        //    34: iload           4
        //    36: ifeq            46
        //    39: aload_0        
        //    40: getstatic       j.g:Ljava/lang/String;
        //    43: putfield        j.e:Ljava/lang/String;
        //    46: aload_2        
        //    47: ifnull          60
        //    50: aload_0        
        //    51: aload_2        
        //    52: putfield        j.f:Ljava/lang/String;
        //    55: iload           4
        //    57: ifeq            67
        //    60: aload_0        
        //    61: getstatic       j.g:Ljava/lang/String;
        //    64: putfield        j.f:Ljava/lang/String;
        //    67: aload_0        
        //    68: iload_3        
        //    69: putfield        j.h:Z
        //    72: return         
        //    73: astore          5
        //    75: aload           5
        //    77: athrow         
        //    78: astore          6
        //    80: aload           6
        //    82: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  29     34     73     78     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  39     46     73     78     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  50     55     78     83     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  60     67     78     83     Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    private static int a(final byte b) {
        final int digit = Character.digit((char)b, 16);
        if (digit == -1) {
            try {
                throw new p(j.z[1] + b);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
        return digit;
    }
    
    private String a(final String s, final String s2) {
        try {
            if (this.e.equalsIgnoreCase(s2)) {
                return s;
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw ex;
        }
        final ByteBuffer encode = Charset.forName(this.e).encode(s);
        final byte[] array = new byte[encode.remaining()];
        encode.get(array);
        try {
            return new String(array, s2);
        }
        catch (UnsupportedEncodingException ex2) {
            Log.e(j.z[10] + s2);
            return new String(array);
        }
    }
    
    private String a(final String p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       q.c:Z
        //     3: istore          4
        //     5: aload_3        
        //     6: ifnull          579
        //     9: aload_3        
        //    10: getstatic       j.z:[Ljava/lang/String;
        //    13: bipush          8
        //    15: aaload         
        //    16: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    19: istore          8
        //    21: iload           8
        //    23: ifne            39
        //    26: aload_3        
        //    27: ldc             "B"
        //    29: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    32: istore          9
        //    34: iload           9
        //    36: ifeq            71
        //    39: aload_0        
        //    40: getfield        j.j:Lq;
        //    43: aload_1        
        //    44: invokevirtual   java/lang/String.getBytes:()[B
        //    47: iconst_0       
        //    48: invokestatic    android/backport/util/Base64.decode:([BI)[B
        //    51: putfield        q.a:[B
        //    54: aload_1        
        //    55: areturn        
        //    56: astore          5
        //    58: aload           5
        //    60: athrow         
        //    61: astore          6
        //    63: aload           6
        //    65: athrow         
        //    66: astore          7
        //    68: aload           7
        //    70: athrow         
        //    71: aload_3        
        //    72: getstatic       j.z:[Ljava/lang/String;
        //    75: iconst_2       
        //    76: aaload         
        //    77: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    80: ifeq            579
        //    83: aload_1        
        //    84: getstatic       j.z:[Ljava/lang/String;
        //    87: bipush          7
        //    89: aaload         
        //    90: ldc             " "
        //    92: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    95: getstatic       j.z:[Ljava/lang/String;
        //    98: bipush          6
        //   100: aaload         
        //   101: ldc             "\t"
        //   103: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   106: astore          10
        //   108: aload_0        
        //   109: getfield        j.h:Z
        //   112: ifeq            132
        //   115: aload           10
        //   117: getstatic       j.z:[Ljava/lang/String;
        //   120: iconst_5       
        //   121: aaload         
        //   122: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   125: astore          17
        //   127: iload           4
        //   129: ifeq            342
        //   132: new             Ljava/lang/StringBuilder;
        //   135: dup            
        //   136: invokespecial   java/lang/StringBuilder.<init>:()V
        //   139: astore          11
        //   141: aload           10
        //   143: invokevirtual   java/lang/String.length:()I
        //   146: istore          12
        //   148: new             Ljava/util/ArrayList;
        //   151: dup            
        //   152: invokespecial   java/util/ArrayList.<init>:()V
        //   155: astore          13
        //   157: iconst_0       
        //   158: istore          14
        //   160: iload           14
        //   162: iload           12
        //   164: if_icmpge       305
        //   167: aload           10
        //   169: iload           14
        //   171: invokevirtual   java/lang/String.charAt:(I)C
        //   174: istore          32
        //   176: iload           32
        //   178: bipush          10
        //   180: if_icmpne       629
        //   183: aload           13
        //   185: aload           11
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   193: pop            
        //   194: new             Ljava/lang/StringBuilder;
        //   197: dup            
        //   198: invokespecial   java/lang/StringBuilder.<init>:()V
        //   201: astore          11
        //   203: iload           4
        //   205: ifeq            297
        //   208: aload           11
        //   210: astore          33
        //   212: iload           32
        //   214: bipush          13
        //   216: if_icmpne       618
        //   219: aload           13
        //   221: aload           33
        //   223: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   226: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   229: pop            
        //   230: new             Ljava/lang/StringBuilder;
        //   233: dup            
        //   234: invokespecial   java/lang/StringBuilder.<init>:()V
        //   237: astore          40
        //   239: iload           14
        //   241: iload           12
        //   243: iconst_1       
        //   244: isub           
        //   245: if_icmpge       611
        //   248: aload           10
        //   250: iload           14
        //   252: iconst_1       
        //   253: iadd           
        //   254: invokevirtual   java/lang/String.charAt:(I)C
        //   257: bipush          10
        //   259: if_icmpne       604
        //   262: iload           14
        //   264: iconst_1       
        //   265: iadd           
        //   266: istore          34
        //   268: iload           4
        //   270: ifeq            593
        //   273: aload           40
        //   275: astore          35
        //   277: aload           35
        //   279: iload           32
        //   281: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   284: pop            
        //   285: iload           34
        //   287: istore          38
        //   289: aload           35
        //   291: astore          11
        //   293: iload           38
        //   295: istore          14
        //   297: iinc            14, 1
        //   300: iload           4
        //   302: ifeq            160
        //   305: aload           11
        //   307: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   310: astore          15
        //   312: aload           15
        //   314: invokevirtual   java/lang/String.length:()I
        //   317: ifle            328
        //   320: aload           13
        //   322: aload           15
        //   324: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   327: pop            
        //   328: aload           13
        //   330: iconst_0       
        //   331: anewarray       Ljava/lang/String;
        //   334: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   337: checkcast       [Ljava/lang/String;
        //   340: astore          17
        //   342: new             Ljava/lang/StringBuilder;
        //   345: dup            
        //   346: invokespecial   java/lang/StringBuilder.<init>:()V
        //   349: astore          18
        //   351: aload           17
        //   353: arraylength    
        //   354: istore          19
        //   356: iconst_0       
        //   357: istore          20
        //   359: iload           20
        //   361: iload           19
        //   363: if_icmpge       417
        //   366: aload           17
        //   368: iload           20
        //   370: aaload         
        //   371: astore          28
        //   373: aload           28
        //   375: ldc             "="
        //   377: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   380: ifeq            398
        //   383: aload           28
        //   385: iconst_0       
        //   386: iconst_m1      
        //   387: aload           28
        //   389: invokevirtual   java/lang/String.length:()I
        //   392: iadd           
        //   393: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   396: astore          28
        //   398: aload           18
        //   400: aload           28
        //   402: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   405: pop            
        //   406: iload           20
        //   408: iconst_1       
        //   409: iadd           
        //   410: istore          30
        //   412: iload           4
        //   414: ifeq            586
        //   417: aload           18
        //   419: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   422: aload_0        
        //   423: getfield        j.e:Ljava/lang/String;
        //   426: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //   429: astore          27
        //   431: aload           27
        //   433: astore          22
        //   435: aload           22
        //   437: invokestatic    j.a:([B)[B
        //   440: astore          24
        //   442: new             Ljava/lang/String;
        //   445: dup            
        //   446: aload           24
        //   448: aload_2        
        //   449: invokespecial   java/lang/String.<init>:([BLjava/lang/String;)V
        //   452: astore          25
        //   454: aload           25
        //   456: areturn        
        //   457: astore          26
        //   459: new             Ljava/lang/StringBuilder;
        //   462: dup            
        //   463: invokespecial   java/lang/StringBuilder.<init>:()V
        //   466: getstatic       j.z:[Ljava/lang/String;
        //   469: iconst_3       
        //   470: aaload         
        //   471: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   474: aload_2        
        //   475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   478: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   481: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   484: new             Ljava/lang/String;
        //   487: dup            
        //   488: aload           24
        //   490: invokespecial   java/lang/String.<init>:([B)V
        //   493: areturn        
        //   494: astore          36
        //   496: aload           36
        //   498: athrow         
        //   499: astore          16
        //   501: aload           16
        //   503: athrow         
        //   504: astore          21
        //   506: new             Ljava/lang/StringBuilder;
        //   509: dup            
        //   510: invokespecial   java/lang/StringBuilder.<init>:()V
        //   513: getstatic       j.z:[Ljava/lang/String;
        //   516: bipush          9
        //   518: aaload         
        //   519: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   522: aload_0        
        //   523: getfield        j.e:Ljava/lang/String;
        //   526: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   529: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   532: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   535: aload           18
        //   537: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   540: invokevirtual   java/lang/String.getBytes:()[B
        //   543: astore          22
        //   545: goto            435
        //   548: astore          23
        //   550: new             Ljava/lang/StringBuilder;
        //   553: dup            
        //   554: invokespecial   java/lang/StringBuilder.<init>:()V
        //   557: getstatic       j.z:[Ljava/lang/String;
        //   560: iconst_4       
        //   561: aaload         
        //   562: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   565: aload           23
        //   567: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   570: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   573: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   576: ldc             ""
        //   578: areturn        
        //   579: aload_0        
        //   580: aload_1        
        //   581: aload_2        
        //   582: invokespecial   j.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   585: areturn        
        //   586: iload           30
        //   588: istore          20
        //   590: goto            359
        //   593: iload           34
        //   595: istore          14
        //   597: aload           40
        //   599: astore          11
        //   601: goto            297
        //   604: iload           14
        //   606: istore          34
        //   608: goto            268
        //   611: aload           40
        //   613: astore          11
        //   615: goto            297
        //   618: iload           14
        //   620: istore          34
        //   622: aload           33
        //   624: astore          35
        //   626: goto            277
        //   629: aload           11
        //   631: astore          33
        //   633: goto            212
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  9      21     56     61     Ljava/io/UnsupportedEncodingException;
        //  26     34     61     66     Ljava/io/UnsupportedEncodingException;
        //  39     54     66     71     Ljava/io/UnsupportedEncodingException;
        //  58     61     61     66     Ljava/io/UnsupportedEncodingException;
        //  63     66     66     71     Ljava/io/UnsupportedEncodingException;
        //  277    285    494    499    Ljava/io/UnsupportedEncodingException;
        //  312    328    499    504    Ljava/io/UnsupportedEncodingException;
        //  417    431    504    548    Ljava/io/UnsupportedEncodingException;
        //  435    442    548    579    Lp;
        //  442    454    457    494    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 301, Size: 301
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
    
    private String a(final List list) {
        final boolean c = q.c;
        final int size = list.size();
        if (size > 1) {
            final StringBuilder sb = new StringBuilder();
            final Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                sb.append(iterator.next()).append(";");
                if (c) {
                    break;
                }
            }
            final int length = sb.length();
            if (length > 0) {
                final int n = length - 1;
                try {
                    if (sb.charAt(n) == ';') {
                        return sb.substring(0, length - 1);
                    }
                }
                catch (ArrayIndexOutOfBoundsException ex) {
                    throw ex;
                }
            }
            return sb.toString();
        }
        if (size == 1) {
            try {
                return list.get(0);
            }
            catch (ArrayIndexOutOfBoundsException ex2) {
                throw ex2;
            }
        }
        return "";
    }
    
    public static byte[] a(final byte[] array) {
        final boolean c = q.c;
        if (array == null) {
            return null;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n = 0;
    Label_0073_Outer:
        while (true) {
            while (true) {
                final byte b;
                Label_0080: {
                    if (n >= array.length) {
                        break Label_0080;
                    }
                    b = array[n];
                    if (b != 61) {
                        break Label_0080;
                    }
                    final int n2 = n + 1;
                    try {
                        final int a = a(array[n2]);
                        n = n2 + 1;
                        byteArrayOutputStream.write((char)(a(array[n]) + (a << 4)));
                        ++n;
                        if (c) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        continue Label_0073_Outer;
                    }
                    catch (ArrayIndexOutOfBoundsException ex) {
                        throw new p(j.z[0], ex);
                    }
                }
                byteArrayOutputStream.write(b);
                continue;
            }
        }
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final String c) {
        while (true) {
            final boolean c2 = q.c;
            final r r = new r();
            while (true) {
                Label_0101: {
                    try {
                        r.a = 1;
                        r.c = c;
                        this.c.add(r);
                        this.i = -1 + this.c.size();
                        this.a = this.c.get(this.i);
                        if (DialogToastActivity.h) {
                            if (!c2) {
                                break Label_0101;
                            }
                            final boolean c3 = false;
                            q.c = c3;
                        }
                        return;
                    }
                    catch (ArrayIndexOutOfBoundsException ex) {
                        try {
                            throw ex;
                        }
                        catch (ArrayIndexOutOfBoundsException ex2) {
                            throw ex2;
                        }
                    }
                }
                final boolean c3 = true;
                continue;
            }
        }
    }
    
    @Override
    public void a(final List list) {
        final boolean c = q.c;
        Label_0017: {
            if (list == null) {
                break Label_0017;
            }
            try {
                if (list.size() == 0) {
                    this.j.a = null;
                    this.j.h.clear();
                    this.j.h.add("");
                    this.j.f = "";
                    return;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
        }
        final ContentValues g = this.j.g;
        final String g2 = j.g;
        final String asString = g.getAsString(j.z[11]);
        Label_0109: {
            if (g2 == null) {
                break Label_0109;
            }
            while (true) {
                while (true) {
                    try {
                        if (g2.length() == 0) {
                            final String f = this.f;
                            final Iterator<String> iterator = list.iterator();
                            while (iterator.hasNext()) {
                                this.j.h.add(this.a(iterator.next(), f, asString));
                                if (c) {
                                    break;
                                }
                            }
                            this.j.f = this.a(this.j.h);
                            return;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex2) {
                        throw ex2;
                    }
                    final String f = g2;
                    continue;
                }
            }
        }
    }
    
    @Override
    public void b() {
        this.a.b.add(this.j);
    }
    
    @Override
    public void b(final String s) {
        this.j.e.add(s);
    }
    
    @Override
    public void c() {
        this.c.get(this.i).a = 0;
        while (this.i > 0) {
            --this.i;
            if (this.c.get(this.i).a == 1) {
                break;
            }
        }
        this.a = this.c.get(this.i);
    }
    
    @Override
    public void c(final String d) {
        this.d = d;
    }
    
    @Override
    public void d() {
        this.j = new q();
    }
    
    @Override
    public void d(final String d) {
        this.j.d = d;
    }
    
    @Override
    public void e() {
    }
    
    @Override
    public void e(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        j.d:Ljava/lang/String;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          31
        //    11: aload_0        
        //    12: getfield        j.d:Ljava/lang/String;
        //    15: getstatic       j.z:[Ljava/lang/String;
        //    18: bipush          12
        //    20: aaload         
        //    21: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    24: istore          7
        //    26: iload           7
        //    28: ifeq            51
        //    31: aload_0        
        //    32: getfield        j.j:Lq;
        //    35: getfield        q.b:Ljava/util/Set;
        //    38: aload_1        
        //    39: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    44: pop            
        //    45: getstatic       q.c:Z
        //    48: ifeq            66
        //    51: aload_0        
        //    52: getfield        j.j:Lq;
        //    55: getfield        q.g:Landroid/content/ContentValues;
        //    58: aload_0        
        //    59: getfield        j.d:Ljava/lang/String;
        //    62: aload_1        
        //    63: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //    66: aload_0        
        //    67: aconst_null    
        //    68: putfield        j.d:Ljava/lang/String;
        //    71: return         
        //    72: astore_2       
        //    73: aload_2        
        //    74: athrow         
        //    75: astore_3       
        //    76: aload_3        
        //    77: athrow         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  0      6      72     75     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  11     26     75     78     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  31     51     78     83     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  51     66     78     83     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  73     75     75     78     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  76     78     78     83     Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 42, Size: 42
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
