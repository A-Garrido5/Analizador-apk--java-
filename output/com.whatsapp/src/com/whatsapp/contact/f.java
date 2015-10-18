// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import java.util.UUID;
import com.whatsapp.aam;
import java.util.ArrayList;
import com.whatsapp.ade;
import android.text.TextUtils;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.protocol.bo;
import com.whatsapp.Voip;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import com.whatsapp.a_9;
import java.util.List;
import com.whatsapp.App;
import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Map;

public class f
{
    private static final Map a;
    private static final AtomicLong b;
    private static final ConditionVariable c;
    private static final ConditionVariable d;
    private static final AtomicLong e;
    public static boolean f;
    private static final AtomicBoolean g;
    private static final Map h;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[57];
        String s = "PN!d&G";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = 'P';
                        break;
                    }
                    case 0: {
                        c3 = '\"';
                        break;
                    }
                    case 1: {
                        c3 = '+';
                        break;
                    }
                    case 2: {
                        c3 = 'L';
                        break;
                    }
                    case 3: {
                        c3 = '\u000b';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "CO(";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "W[(j$G";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "WE/c1LL)o";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "WE/c1LL)o";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "W[(j$G";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "CO(";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "PN!d&G";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "QR\"h\u007fQ_-\u007f%Q\u0006>n#RD\"x5\u000fH#f NN8npGY>d\"\u001f\u000e(";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "QR\"h\u007fQ_-\u007f%Q\u0006>n#RD\"x5\u000fH#f NN8n\u007fHB(x}Q_-\u007f%QN?+=KX!j$ACla9FXo6uF\u000b?\u007f1V^?n#\u0001\u0016io";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "QR\"h\u007fPN?~<V\u000b?b4\u001f\u000e?+9LO)sm\u0007Ol~#GY?T3M^\"\u007fm\u0007O";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    s = "QR\"h\u007fQR\"h\u000fFN \u007f1\r_%f5\r\u000e(";
                    n = 10;
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    array = z2;
                    s = "QR\"h\u007fQR\"h\u000fFN \u007f1\rX8j$WX\u0013y5RG5T$KF)d%V";
                    n = 11;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "QR\"h\u007fQR\"h\u000fFN \u007f1\r";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "QR\"h\u007fQR\"h\u000fFN \u007f1\rN>y?P";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "QR\"h\u007fQR\"h\u000fFN \u007f1\r_%f5\r\u000e(+xGY>d\"\u000b";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "QR\"h\u000fQB(T4GG8j";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "QR\"h\u007fQR\"h\u000fFN \u007f1\rX5e3}Y){<[t8b=GD9\u007f";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "DB np\u0007Xle?V\u000b*d%LOlm?P\u000b;y9VB\"l~\u0002J<{pFB>n3VD>rpLD8+'PB8j2NNs*o\u0003\u0014";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "kd\ts3G[8b?L\u000bixpUY%\u007f9LLl\u007f?\u0002\u000e?";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "AD>y%R_lm9NNl.#\u000e\u000b>n$WY\"b>E\u000b(n6C^ \u007fpNJ?\u007fpUJ%\u007fpVB!n";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "kd\ts3G[8b?L\u000bixpPN-o9LLlm\"MFl.#\u000e\u000b>n$WY\"b>E\u000b(n6C^ \u007fpNJ?\u007fpUJ%\u007fpVB!n";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "QR\"h\u007fQR\"h\u000fCG $=KX?b>Et>n#RD\"x5\r\u000e?";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "QR\"h\u007fQR\"h\u000fQB\"l<Gt/d>VJ/\u007f\u007fVB!n\u007f\u0007O";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "QR\"h\u007fQR\"h\u000fQB\"l<Gt/d>VJ/\u007f\u007fL^ g\u000fIN5+";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "QR\"h\u007fQR\"h\u000fQB\"l<Gt/d>VJ/\u007f\u007fQ_-\u007f%Qt>n NR\u0013\u007f9ON#~$";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "QR\"h\u007fQR\"h\u000fQB\"l<Gt/d>VJ/\u007f\u007fVB!n\u007f\u0007Ol#5PY#yy";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "QR\"h\u000fQB(T#KE+g5}H#e$CH8";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "QR\"h\u007fQR\"h\u000fQB\"l<Gt/d>VJ/\u007f\u007fGY>d\"";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "QR\"h\u007fQR\"h\u000fQB\"l<Gt/d>VJ/\u007f\u007fQR\"h\u000fPN<g)}_%f5M^8";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "QR\"h\u007fGY>d\"\u0002X%om\u0007Xlb>FN46uF\u000b/d4G\u0016iop@J/`?DMq.4";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "QR\"h\u000f@J/`?DM";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "QR\"h\u000fQB(T6WG ";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "QR\"h\u007fQR\"h\u000fCG $#[E/T\"G[ r\u000fVB!n?W_";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    s = "QR\"h\u007fQR\"h\u000fCG $$KF)$uF\u000bdn\"PD>\"";
                    n = 33;
                    n2 = 34;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    array = z2;
                    s = "QR\"h\u007fQR\"h\u000fCG $5PY#y";
                    n = 34;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "QR\"h\u007fQR\"h\u000fCG $";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "QR\"h\u007fQR\"h\u000fCG $#VJ8~#}Y){<[t8b=GD9\u007f";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "QR\"h\u007fQR\"h\u000fCG $$KF)$uF";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "QR\"h\u007fAD!{<G_)+#KOq.#\u0002])y#KD\"6uQ\u000b;j9V\u0016io";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "D^ g\u000fQR\"h\u000fUJ%\u007f";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "QR\"h\u007fQ@%{\u007fTD%{\u000fAJ g";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "QR\"h\u007f@^+$#[E/T6NJ+T1N_)y5Ft;c9NN\u0013x)LH\u0013b>}[>d7PN?x";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    s = "QR\"h\u007fQB6np\u0007O";
                    n = 42;
                    n2 = 43;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    array = z2;
                    s = "QR\"h\u007fQ@%{\u007fCG>n1FR\u0013b>}[>d7PN?x";
                    n = 43;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "QR\"h\u007fQB6np\u0007O";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "QR\"h\u007fQ@%{\u007fGS<b\"GO";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "QR\"h\u007fQ@%{\u007fLN8|?P@\u0013~>C]-b<CI n";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "QR\"h\u007f@^+$#[E/T6NJ+T1N_)y5Ft;c9NN\u0013x)LH\u0013b>}[>d7PN?x";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "QR\"h\u007fQB6np\u0007O";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "QR\"h\u007f@^+$#[E/T6NJ+T1N_)y5Ft;c9NN\u0013x)LH\u0013b>}[>d7PN?x";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "QR\"h\u007fQB6np\u0007O";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "QR\"h\u007f@^+$#[E/T6NJ+T1N_)y5Ft;c9NN\u0013x)LH\u0013b>}[>d7PN?x";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "QR\"h\u007fQ@%{\u007f@J/`?DMl.4";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "D^ g\u000fQR\"h\u000fUJ%\u007f";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "QR\"h\u000f@J/`?DM";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "QR\"h\u000f@J/`?DM";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    break Label_1457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        g = new AtomicBoolean(false);
        d = new ConditionVariable();
        a = new HashMap();
        c = new ConditionVariable();
        h = new HashMap();
        b = new AtomicLong(-1L);
        e = new AtomicLong(-1L);
    }
    
    private static long a(final Context p0, final String p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          4
        //     3: new             Ljava/io/ObjectInputStream;
        //     6: dup            
        //     7: aload_0        
        //     8: aload_1        
        //     9: invokevirtual   android/content/Context.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //    12: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    15: astore          5
        //    17: aload           5
        //    19: invokevirtual   java/io/ObjectInputStream.readLong:()J
        //    22: lstore          16
        //    24: lload           16
        //    26: lstore_2       
        //    27: aload           5
        //    29: ifnull          37
        //    32: aload           5
        //    34: invokevirtual   java/io/ObjectInputStream.close:()V
        //    37: lload_2        
        //    38: lreturn        
        //    39: astore          20
        //    41: aconst_null    
        //    42: astore          5
        //    44: aload           5
        //    46: ifnull          37
        //    49: aload           5
        //    51: invokevirtual   java/io/ObjectInputStream.close:()V
        //    54: lload_2        
        //    55: lreturn        
        //    56: astore          7
        //    58: lload_2        
        //    59: lreturn        
        //    60: astore          19
        //    62: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //    65: bipush          20
        //    67: aaload         
        //    68: aconst_null    
        //    69: iconst_1       
        //    70: anewarray       Ljava/lang/Object;
        //    73: dup            
        //    74: iconst_0       
        //    75: aload_1        
        //    76: aastore        
        //    77: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //    80: aload           4
        //    82: ifnull          37
        //    85: aload           4
        //    87: invokevirtual   java/io/ObjectInputStream.close:()V
        //    90: lload_2        
        //    91: lreturn        
        //    92: astore          11
        //    94: lload_2        
        //    95: lreturn        
        //    96: astore          13
        //    98: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   101: bipush          21
        //   103: aaload         
        //   104: aconst_null    
        //   105: iconst_2       
        //   106: anewarray       Ljava/lang/Object;
        //   109: dup            
        //   110: iconst_0       
        //   111: aload           13
        //   113: aastore        
        //   114: dup            
        //   115: iconst_1       
        //   116: aload_1        
        //   117: aastore        
        //   118: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   121: aload           4
        //   123: ifnull          37
        //   126: aload           4
        //   128: invokevirtual   java/io/ObjectInputStream.close:()V
        //   131: lload_2        
        //   132: lreturn        
        //   133: astore          14
        //   135: lload_2        
        //   136: lreturn        
        //   137: astore          9
        //   139: aload           4
        //   141: ifnull          149
        //   144: aload           4
        //   146: invokevirtual   java/io/ObjectInputStream.close:()V
        //   149: aload           9
        //   151: athrow         
        //   152: astore          18
        //   154: lload_2        
        //   155: lreturn        
        //   156: astore          10
        //   158: goto            149
        //   161: astore          15
        //   163: aload           5
        //   165: astore          4
        //   167: aload           15
        //   169: astore          9
        //   171: goto            139
        //   174: astore          12
        //   176: aload           5
        //   178: astore          4
        //   180: aload           12
        //   182: astore          13
        //   184: goto            98
        //   187: astore          8
        //   189: aload           5
        //   191: astore          4
        //   193: goto            62
        //   196: astore          6
        //   198: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  3      17     39     44     Ljava/io/FileNotFoundException;
        //  3      17     60     62     Ljava/io/StreamCorruptedException;
        //  3      17     96     98     Ljava/io/IOException;
        //  3      17     137    139    Any
        //  17     24     196    201    Ljava/io/FileNotFoundException;
        //  17     24     187    196    Ljava/io/StreamCorruptedException;
        //  17     24     174    187    Ljava/io/IOException;
        //  17     24     161    174    Any
        //  32     37     152    156    Ljava/io/IOException;
        //  49     54     56     60     Ljava/io/IOException;
        //  62     80     137    139    Any
        //  85     90     92     96     Ljava/io/IOException;
        //  98     121    137    139    Any
        //  126    131    133    137    Ljava/io/IOException;
        //  144    149    156    161    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 108, Size: 108
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
    
    private static i a(final Context context, final String s) {
        final boolean f = com.whatsapp.contact.f.f;
        final Map a = j.a(context);
        final Map a2 = App.S.a();
        final i i = new i(null);
        final HashSet v = App.V();
        for (final Map.Entry<K, List> entry : a.entrySet()) {
            final o o = entry.getValue().get(0);
            if (entry.getValue().size() > 1) {}
            final a_9 a_9 = (a_9)a2.get(entry.getKey());
            Label_0210: {
                if (a_9 != null) {
                    if (a_9.a(o)) {
                        i.b(a_9);
                        if (!f) {
                            break Label_0210;
                        }
                    }
                    i.d(a_9);
                    if (!f) {
                        break Label_0210;
                    }
                }
                if (v.contains(entry.getKey())) {
                    i.d(new a_9(o));
                    if (!f) {
                        break Label_0210;
                    }
                }
                i.a(new a_9(o));
            }
            if (f) {
                break;
            }
        }
        for (final Map.Entry<Object, V> entry2 : a2.entrySet()) {
            if (!a.containsKey(entry2.getKey())) {
                i.c((a_9)entry2.getValue());
            }
            if (f) {
                break;
            }
        }
        a_9.a(i.g(), s + com.whatsapp.contact.f.z[6], com.whatsapp.contact.f.z[1]);
        a_9.a(i.f(), s + com.whatsapp.contact.f.z[2], com.whatsapp.contact.f.z[5]);
        a_9.a(i.e(), s + com.whatsapp.contact.f.z[0], com.whatsapp.contact.f.z[7]);
        a_9.a(i.i(), s + com.whatsapp.contact.f.z[4], com.whatsapp.contact.f.z[3]);
        return i;
    }
    
    private static k a(final Context context, final h h, final boolean b) {
        k k;
        if (a()) {
            Log.i(com.whatsapp.contact.f.z[46]);
            k = com.whatsapp.contact.k.USER_IS_EXPIRED;
        }
        else {
            if (!App.O()) {
                Log.i(com.whatsapp.contact.f.z[47]);
                return com.whatsapp.contact.k.NETWORK_UNAVAILABLE;
            }
            if (!b && !b()) {
                Log.i(com.whatsapp.contact.f.z[44]);
                return com.whatsapp.contact.k.IN_PROGRESS;
            }
            if (Voip.d()) {
                Log.i(com.whatsapp.contact.f.z[41]);
                return com.whatsapp.contact.k.DELAYED;
            }
            try {
                final long b2 = b(context);
                if (b2 > System.currentTimeMillis()) {
                    Log.c(com.whatsapp.contact.f.z[53], null, new Object[] { b2 });
                    k = com.whatsapp.contact.k.DELAYED;
                    Log.c(com.whatsapp.contact.f.z[43], null, new Object[] { com.whatsapp.contact.f.a.size() });
                    com.whatsapp.contact.f.a.clear();
                    com.whatsapp.contact.f.h.clear();
                    if (!b && !d()) {
                        Log.e(com.whatsapp.contact.f.z[50]);
                        return k;
                    }
                }
                else {
                    final int h2 = App.S.h();
                    boolean b3;
                    if (h.isFullSync()) {
                        b3 = c(context, h);
                    }
                    else {
                        b3 = a(context, h);
                    }
                    if (b3) {
                        App.aL.a(h2);
                        k = com.whatsapp.contact.k.UP_TO_DATE;
                        Log.c(com.whatsapp.contact.f.z[51], null, new Object[] { com.whatsapp.contact.f.a.size() });
                        com.whatsapp.contact.f.a.clear();
                        com.whatsapp.contact.f.h.clear();
                        if (!b && !d()) {
                            Log.e(com.whatsapp.contact.f.z[48]);
                            return k;
                        }
                    }
                    else {
                        k = com.whatsapp.contact.k.FAILED;
                        Log.c(com.whatsapp.contact.f.z[49], null, new Object[] { com.whatsapp.contact.f.a.size() });
                        com.whatsapp.contact.f.a.clear();
                        com.whatsapp.contact.f.h.clear();
                        if (!b && !d()) {
                            Log.e(com.whatsapp.contact.f.z[52]);
                            return k;
                        }
                    }
                }
            }
            finally {
                Log.c(com.whatsapp.contact.f.z[45], null, new Object[] { com.whatsapp.contact.f.a.size() });
                com.whatsapp.contact.f.a.clear();
                com.whatsapp.contact.f.h.clear();
                if (!b && !d()) {
                    Log.e(com.whatsapp.contact.f.z[42]);
                }
            }
        }
        return k;
    }
    
    public static void a(final Context context) {
        com.whatsapp.contact.f.b.set(0L);
        a(context, 0L, com.whatsapp.contact.f.z[56]);
    }
    
    private static void a(final Context p0, final long p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          4
        //     3: new             Ljava/io/ObjectOutputStream;
        //     6: dup            
        //     7: aload_0        
        //     8: aload_3        
        //     9: iconst_0       
        //    10: invokevirtual   android/content/Context.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //    13: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    16: astore          5
        //    18: aload           5
        //    20: lload_1        
        //    21: invokevirtual   java/io/ObjectOutputStream.writeLong:(J)V
        //    24: aload           5
        //    26: ifnull          34
        //    29: aload           5
        //    31: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    34: return         
        //    35: astore          15
        //    37: aconst_null    
        //    38: astore          5
        //    40: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //    43: bipush          18
        //    45: aaload         
        //    46: aconst_null    
        //    47: iconst_1       
        //    48: anewarray       Ljava/lang/Object;
        //    51: dup            
        //    52: iconst_0       
        //    53: aload_3        
        //    54: aastore        
        //    55: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //    58: aload           5
        //    60: ifnull          34
        //    63: aload           5
        //    65: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    68: return         
        //    69: astore          10
        //    71: return         
        //    72: astore          12
        //    74: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //    77: bipush          19
        //    79: aaload         
        //    80: aconst_null    
        //    81: iconst_2       
        //    82: anewarray       Ljava/lang/Object;
        //    85: dup            
        //    86: iconst_0       
        //    87: aload           12
        //    89: aastore        
        //    90: dup            
        //    91: iconst_1       
        //    92: aload_3        
        //    93: aastore        
        //    94: invokestatic    com/whatsapp/util/Log.a:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //    97: aload           4
        //    99: ifnull          34
        //   102: aload           4
        //   104: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   107: return         
        //   108: astore          13
        //   110: return         
        //   111: astore          8
        //   113: aload           4
        //   115: ifnull          123
        //   118: aload           4
        //   120: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   123: aload           8
        //   125: athrow         
        //   126: astore          14
        //   128: return         
        //   129: astore          9
        //   131: goto            123
        //   134: astore          7
        //   136: aload           5
        //   138: astore          4
        //   140: aload           7
        //   142: astore          8
        //   144: goto            113
        //   147: astore          11
        //   149: aload           5
        //   151: astore          4
        //   153: aload           11
        //   155: astore          12
        //   157: goto            74
        //   160: astore          6
        //   162: goto            40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  3      18     35     40     Ljava/io/FileNotFoundException;
        //  3      18     72     74     Ljava/io/IOException;
        //  3      18     111    113    Any
        //  18     24     160    165    Ljava/io/FileNotFoundException;
        //  18     24     147    160    Ljava/io/IOException;
        //  18     24     134    147    Any
        //  29     34     126    129    Ljava/io/IOException;
        //  40     58     134    147    Any
        //  63     68     69     72     Ljava/io/IOException;
        //  74     97     111    113    Any
        //  102    107    108    111    Ljava/io/IOException;
        //  118    123    129    134    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
    
    public static void a(final Context context, final String s, final int n, final int n2, final long n3) {
        Log.b(com.whatsapp.contact.f.z[30], null, new Object[] { s, n, n2, n3 });
        if (n3 > 0L) {
            final long n4 = n3 + System.currentTimeMillis();
            com.whatsapp.contact.f.b.set(n4);
            a(context, n4, com.whatsapp.contact.f.z[31]);
        }
        com.whatsapp.contact.f.d.open();
    }
    
    public static void a(final Context context, final String s, final String s2, final long n) {
        final boolean f = com.whatsapp.contact.f.f;
        Log.c(com.whatsapp.contact.f.z[39], null, new Object[] { s, s2, n });
        if (n > 0L) {
            com.whatsapp.contact.f.e.set(n);
            a(context, n, com.whatsapp.contact.f.z[40]);
        }
        final HashSet v = App.V();
        final Iterator<Map.Entry<K, bo>> iterator = com.whatsapp.contact.f.a.entrySet().iterator();
        while (iterator.hasNext()) {
            final bo bo = iterator.next().getValue();
            if (bo.b == 2) {
                v.add(bo.a);
            }
            if (f) {
                break;
            }
        }
        App.a(v);
        com.whatsapp.contact.f.d.open();
        if (DialogToastActivity.h) {
            com.whatsapp.contact.f.f = !f;
        }
    }
    
    public static void a(final Integer n, final String[] array, final String[] array2) {
        final boolean f = com.whatsapp.contact.f.f;
        if (n != null) {
            Log.b(com.whatsapp.contact.f.z[8], null, new Object[] { n });
        }
        Label_0147: {
            if (array != null && array2 != null) {
                if (array.length == array2.length) {
                    int i = 0;
                    while (i < array.length) {
                        if (!TextUtils.isEmpty((CharSequence)array[i]) && !TextUtils.isEmpty((CharSequence)array2[i])) {
                            com.whatsapp.contact.f.h.put(array[i], new m(0L, array2[i]));
                        }
                        ++i;
                        if (f) {
                            break;
                        }
                    }
                    if (!f) {
                        break Label_0147;
                    }
                }
                Log.b(com.whatsapp.contact.f.z[9], null, new Object[] { array.length, array2.length });
            }
        }
        com.whatsapp.contact.f.c.open();
    }
    
    public static void a(final String s) {
    }
    
    public static void a(final String s, final int n, final l[] array) {
        int i = 0;
        final boolean f = com.whatsapp.contact.f.f;
        Log.c(com.whatsapp.contact.f.z[10], null, new Object[] { s, n, array.length });
        while (i < array.length) {
            final l l = array[i];
            com.whatsapp.contact.f.a.put(l.a().a, l.a());
            ++i;
            if (f) {
                break;
            }
        }
    }
    
    public static void a(final String s, final long n, final String s2) {
        com.whatsapp.contact.f.h.put(s, new m(n, s2));
    }
    
    private static void a(final List list, final Collection collection) {
        final boolean f = com.whatsapp.contact.f.f;
        for (final a_9 a_9 : list) {
            final m m = com.whatsapp.contact.f.h.get(a_9.u);
            if (m != null && (!TextUtils.equals((CharSequence)m.a, (CharSequence)a_9.d) || m.b != a_9.s)) {
                a_9.d = m.a;
                a_9.s = m.b;
                if (collection != null) {
                    collection.add(a_9);
                }
            }
            if (f) {
                break;
            }
        }
    }
    
    private static boolean a() {
        return ade.a(true) == 0;
    }
    
    private static boolean a(final Context p0, final h p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    java/lang/System.currentTimeMillis:()J
        //     3: lstore_2       
        //     4: aload_0        
        //     5: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //     8: bipush          13
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/contact/f.a:(Landroid/content/Context;Ljava/lang/String;)Lcom/whatsapp/contact/i;
        //    14: astore          7
        //    16: aload           7
        //    18: invokevirtual   com/whatsapp/contact/i.h:()Ljava/util/ArrayList;
        //    21: astore          8
        //    23: aload           7
        //    25: invokevirtual   com/whatsapp/contact/i.c:()Ljava/util/ArrayList;
        //    28: astore          9
        //    30: aload           8
        //    32: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    35: ifeq            50
        //    38: aload           9
        //    40: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    43: istore          28
        //    45: iload           28
        //    47: ifne            195
        //    50: getstatic       com/whatsapp/contact/f.d:Landroid/os/ConditionVariable;
        //    53: invokevirtual   android/os/ConditionVariable.close:()V
        //    56: aload_1        
        //    57: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //    60: bipush          16
        //    62: aaload         
        //    63: invokestatic    com/whatsapp/contact/f.b:(Ljava/lang/String;)Ljava/lang/String;
        //    66: iconst_0       
        //    67: iconst_1       
        //    68: aload           8
        //    70: aload           9
        //    72: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/contact/h;Ljava/lang/String;IZLjava/util/ArrayList;Ljava/util/ArrayList;)Z
        //    75: istore          12
        //    77: iload           12
        //    79: ifne            172
        //    82: getstatic       com/whatsapp/App.u:Ljava/lang/Object;
        //    85: astore          26
        //    87: aload           26
        //    89: monitorenter   
        //    90: getstatic       com/whatsapp/App.d:Lcom/whatsapp/contact/h;
        //    93: aload_1        
        //    94: invokestatic    com/whatsapp/contact/h.combine:(Lcom/whatsapp/contact/h;Lcom/whatsapp/contact/h;)Lcom/whatsapp/contact/h;
        //    97: putstatic       com/whatsapp/App.d:Lcom/whatsapp/contact/h;
        //   100: aload           26
        //   102: monitorexit    
        //   103: iconst_0       
        //   104: ireturn        
        //   105: astore          10
        //   107: aload           10
        //   109: athrow         
        //   110: astore          11
        //   112: aload           11
        //   114: athrow         
        //   115: astore          4
        //   117: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   120: bipush          14
        //   122: aaload         
        //   123: aload           4
        //   125: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   128: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   131: bipush          15
        //   133: aaload         
        //   134: astore          5
        //   136: iconst_1       
        //   137: anewarray       Ljava/lang/Object;
        //   140: astore          6
        //   142: aload           6
        //   144: iconst_0       
        //   145: invokestatic    java/lang/System.currentTimeMillis:()J
        //   148: lload_2        
        //   149: lsub           
        //   150: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   153: aastore        
        //   154: aload           5
        //   156: aconst_null    
        //   157: aload           6
        //   159: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   162: iconst_0       
        //   163: ireturn        
        //   164: astore          27
        //   166: aload           26
        //   168: monitorexit    
        //   169: aload           27
        //   171: athrow         
        //   172: getstatic       com/whatsapp/contact/f.d:Landroid/os/ConditionVariable;
        //   175: ldc2_w          64000
        //   178: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //   181: ifne            195
        //   184: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   187: bipush          17
        //   189: aaload         
        //   190: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   193: iconst_0       
        //   194: ireturn        
        //   195: aload           7
        //   197: invokevirtual   com/whatsapp/contact/i.g:()Ljava/util/List;
        //   200: aconst_null    
        //   201: invokestatic    com/whatsapp/contact/f.b:(Ljava/util/List;Ljava/util/Collection;)V
        //   204: getstatic       com/whatsapp/contact/f.c:Landroid/os/ConditionVariable;
        //   207: invokevirtual   android/os/ConditionVariable.close:()V
        //   210: aload           7
        //   212: invokevirtual   com/whatsapp/contact/i.b:()[Lcom/whatsapp/a_9;
        //   215: astore          13
        //   217: aload           13
        //   219: arraylength    
        //   220: ifle            302
        //   223: aload           13
        //   225: invokestatic    com/whatsapp/App.a:([Lcom/whatsapp/a_9;)Z
        //   228: istore          23
        //   230: iload           23
        //   232: ifne            271
        //   235: getstatic       com/whatsapp/App.u:Ljava/lang/Object;
        //   238: astore          24
        //   240: aload           24
        //   242: monitorenter   
        //   243: getstatic       com/whatsapp/App.d:Lcom/whatsapp/contact/h;
        //   246: aload_1        
        //   247: invokestatic    com/whatsapp/contact/h.combine:(Lcom/whatsapp/contact/h;Lcom/whatsapp/contact/h;)Lcom/whatsapp/contact/h;
        //   250: putstatic       com/whatsapp/App.d:Lcom/whatsapp/contact/h;
        //   253: aload           24
        //   255: monitorexit    
        //   256: iconst_0       
        //   257: ireturn        
        //   258: astore          14
        //   260: aload           14
        //   262: athrow         
        //   263: astore          25
        //   265: aload           24
        //   267: monitorexit    
        //   268: aload           25
        //   270: athrow         
        //   271: aload           13
        //   273: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   276: invokestatic    com/whatsapp/App.b:(Ljava/util/Collection;)V
        //   279: getstatic       com/whatsapp/contact/f.c:Landroid/os/ConditionVariable;
        //   282: ldc2_w          64000
        //   285: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //   288: ifne            302
        //   291: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   294: bipush          12
        //   296: aaload         
        //   297: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   300: iconst_0       
        //   301: ireturn        
        //   302: aload           7
        //   304: invokevirtual   com/whatsapp/contact/i.g:()Ljava/util/List;
        //   307: aconst_null    
        //   308: invokestatic    com/whatsapp/contact/f.a:(Ljava/util/List;Ljava/util/Collection;)V
        //   311: aload           7
        //   313: invokevirtual   com/whatsapp/contact/i.g:()Ljava/util/List;
        //   316: invokeinterface java/util/List.isEmpty:()Z
        //   321: ifne            335
        //   324: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   327: aload           7
        //   329: invokevirtual   com/whatsapp/contact/i.g:()Ljava/util/List;
        //   332: invokevirtual   com/whatsapp/wc.f:(Ljava/util/Collection;)V
        //   335: aload           7
        //   337: invokevirtual   com/whatsapp/contact/i.f:()Ljava/util/List;
        //   340: invokeinterface java/util/List.isEmpty:()Z
        //   345: ifne            359
        //   348: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   351: aload           7
        //   353: invokevirtual   com/whatsapp/contact/i.f:()Ljava/util/List;
        //   356: invokevirtual   com/whatsapp/wc.b:(Ljava/util/Collection;)V
        //   359: aload           7
        //   361: invokevirtual   com/whatsapp/contact/i.e:()Ljava/util/List;
        //   364: invokeinterface java/util/List.isEmpty:()Z
        //   369: ifne            383
        //   372: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   375: aload           7
        //   377: invokevirtual   com/whatsapp/contact/i.e:()Ljava/util/List;
        //   380: invokevirtual   com/whatsapp/wc.e:(Ljava/util/Collection;)V
        //   383: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   386: bipush          11
        //   388: aaload         
        //   389: astore          19
        //   391: iconst_1       
        //   392: anewarray       Ljava/lang/Object;
        //   395: astore          20
        //   397: aload           20
        //   399: iconst_0       
        //   400: invokestatic    java/lang/System.currentTimeMillis:()J
        //   403: lload_2        
        //   404: lsub           
        //   405: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   408: aastore        
        //   409: aload           19
        //   411: aconst_null    
        //   412: aload           20
        //   414: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   417: aload           7
        //   419: invokevirtual   com/whatsapp/contact/i.d:()Z
        //   422: ifne            433
        //   425: getstatic       com/whatsapp/App.av:Landroid/os/Handler;
        //   428: iconst_1       
        //   429: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   432: pop            
        //   433: getstatic       com/whatsapp/App.aP:Landroid/os/Handler;
        //   436: iconst_0       
        //   437: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   440: pop            
        //   441: iconst_1       
        //   442: ireturn        
        //   443: astore          15
        //   445: aload           15
        //   447: athrow         
        //   448: astore          16
        //   450: aload           16
        //   452: athrow         
        //   453: astore          17
        //   455: aload           17
        //   457: athrow         
        //   458: astore          18
        //   460: aload           18
        //   462: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      30     115    164    Ljava/lang/Exception;
        //  30     45     105    110    Ljava/lang/Exception;
        //  50     77     110    115    Ljava/lang/Exception;
        //  82     90     115    164    Ljava/lang/Exception;
        //  90     103    164    172    Any
        //  107    110    110    115    Ljava/lang/Exception;
        //  112    115    115    164    Ljava/lang/Exception;
        //  166    169    164    172    Any
        //  169    172    115    164    Ljava/lang/Exception;
        //  172    193    115    164    Ljava/lang/Exception;
        //  195    217    115    164    Ljava/lang/Exception;
        //  217    230    258    263    Ljava/lang/Exception;
        //  235    243    115    164    Ljava/lang/Exception;
        //  243    256    263    271    Any
        //  260    263    115    164    Ljava/lang/Exception;
        //  265    268    263    271    Any
        //  268    271    115    164    Ljava/lang/Exception;
        //  271    300    115    164    Ljava/lang/Exception;
        //  302    335    443    448    Ljava/lang/Exception;
        //  335    359    448    453    Ljava/lang/Exception;
        //  359    383    453    458    Ljava/lang/Exception;
        //  383    433    458    463    Ljava/lang/Exception;
        //  433    441    115    164    Ljava/lang/Exception;
        //  445    448    115    164    Ljava/lang/Exception;
        //  450    453    115    164    Ljava/lang/Exception;
        //  455    458    115    164    Ljava/lang/Exception;
        //  460    463    115    164    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 217, Size: 217
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
    
    public static boolean a(final a_9 a_9) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            if (a_9.e == null) {
                Log.w(com.whatsapp.contact.f.z[24] + a_9);
                return false;
            }
            final ArrayList<a_9> list = new ArrayList<a_9>(1);
            list.add(a_9);
            final ArrayList<String> list2 = new ArrayList<String>(1);
            list2.add(a_9.e.a());
            com.whatsapp.contact.f.d.close();
            if (!App.a(com.whatsapp.contact.h.INTERACTIVE_DELTA, b(com.whatsapp.contact.f.z[27]), 0, true, list2, null)) {
                return false;
            }
            if (!com.whatsapp.contact.f.d.block(64000L)) {
                Log.w(com.whatsapp.contact.f.z[29]);
                return false;
            }
            b(list, null);
            com.whatsapp.contact.f.c.close();
            if (!App.a(new a_9[] { a_9 })) {
                return false;
            }
            App.a(new String[] { a_9.u });
            if (!com.whatsapp.contact.f.c.block(64000L)) {
                Log.w(com.whatsapp.contact.f.z[25]);
                return false;
            }
            a(list, null);
            App.S.b((Collection)list);
            Log.c(com.whatsapp.contact.f.z[23], null, new Object[] { System.currentTimeMillis() - currentTimeMillis });
            return true;
        }
        catch (Exception ex) {
            Log.b(com.whatsapp.contact.f.z[28], ex);
            Log.c(com.whatsapp.contact.f.z[26], null, new Object[] { System.currentTimeMillis() - currentTimeMillis });
            return false;
        }
    }
    
    private static long b(final Context context) {
        long n = com.whatsapp.contact.f.b.get();
        if (n == -1L) {
            com.whatsapp.contact.f.b.compareAndSet(-1L, a(context, com.whatsapp.contact.f.z[55], 0L));
            n = com.whatsapp.contact.f.b.get();
        }
        return n;
    }
    
    public static k b(final Context context, final h h) {
        boolean b = true;
        final long currentTimeMillis = System.currentTimeMillis();
        final k a = a(context, h, b);
        if (h != h.REGISTRATION_FULL) {
            b = false;
        }
        aam.a(context, b, a, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }
    
    private static String b(final String s) {
        return s + '_' + UUID.randomUUID().toString();
    }
    
    private static void b(final List list, final Collection collection) {
        final boolean f = com.whatsapp.contact.f.f;
        for (final a_9 a_9 : list) {
            final bo bo = com.whatsapp.contact.f.a.get(a_9.e.a());
            if (bo == null) {
                Log.a(com.whatsapp.contact.f.z[22], null, new Object[] { a_9.e.a() });
                if (!f) {
                    continue;
                }
            }
            final boolean b = bo.b == 0;
            final String c = bo.c;
            if (a_9.b != b || !TextUtils.equals((CharSequence)a_9.u, (CharSequence)c)) {
                a_9.b = b;
                a_9.u = c;
                if (collection != null) {
                    collection.add(a_9);
                }
            }
            if (f) {
                break;
            }
        }
    }
    
    public static boolean b() {
        return com.whatsapp.contact.f.g.compareAndSet(false, true);
    }
    
    public static long c(final Context context) {
        long n = com.whatsapp.contact.f.e.get();
        if (n == -1L) {
            com.whatsapp.contact.f.e.compareAndSet(-1L, a(context, com.whatsapp.contact.f.z[54], 85800000L));
            n = com.whatsapp.contact.f.e.get();
        }
        return n;
    }
    
    public static void c(final String s) {
        com.whatsapp.contact.f.h.put(s, new m(0L, null));
    }
    
    public static boolean c() {
        return com.whatsapp.contact.f.g.get();
    }
    
    private static boolean c(final Context p0, final h p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/contact/f.f:Z
        //     3: istore_2       
        //     4: invokestatic    java/lang/System.currentTimeMillis:()J
        //     7: lstore_3       
        //     8: aload_0        
        //     9: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //    12: bipush          36
        //    14: aaload         
        //    15: invokestatic    com/whatsapp/contact/f.a:(Landroid/content/Context;Ljava/lang/String;)Lcom/whatsapp/contact/i;
        //    18: astore          8
        //    20: getstatic       com/whatsapp/contact/f.d:Landroid/os/ConditionVariable;
        //    23: invokevirtual   android/os/ConditionVariable.close:()V
        //    26: aload_1        
        //    27: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //    30: bipush          32
        //    32: aaload         
        //    33: invokestatic    com/whatsapp/contact/f.b:(Ljava/lang/String;)Ljava/lang/String;
        //    36: iconst_0       
        //    37: iconst_1       
        //    38: aload           8
        //    40: invokevirtual   com/whatsapp/contact/i.a:()Ljava/util/ArrayList;
        //    43: aconst_null    
        //    44: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/contact/h;Ljava/lang/String;IZLjava/util/ArrayList;Ljava/util/ArrayList;)Z
        //    47: ifne            130
        //    50: getstatic       com/whatsapp/App.u:Ljava/lang/Object;
        //    53: astore          38
        //    55: aload           38
        //    57: monitorenter   
        //    58: getstatic       com/whatsapp/App.d:Lcom/whatsapp/contact/h;
        //    61: aload_1        
        //    62: invokestatic    com/whatsapp/contact/h.combine:(Lcom/whatsapp/contact/h;Lcom/whatsapp/contact/h;)Lcom/whatsapp/contact/h;
        //    65: putstatic       com/whatsapp/App.d:Lcom/whatsapp/contact/h;
        //    68: aload           38
        //    70: monitorexit    
        //    71: iconst_0       
        //    72: ireturn        
        //    73: astore          39
        //    75: aload           38
        //    77: monitorexit    
        //    78: aload           39
        //    80: athrow         
        //    81: astore          5
        //    83: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //    86: bipush          35
        //    88: aaload         
        //    89: aload           5
        //    91: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    94: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //    97: bipush          34
        //    99: aaload         
        //   100: astore          6
        //   102: iconst_1       
        //   103: anewarray       Ljava/lang/Object;
        //   106: astore          7
        //   108: aload           7
        //   110: iconst_0       
        //   111: invokestatic    java/lang/System.currentTimeMillis:()J
        //   114: lload_3        
        //   115: lsub           
        //   116: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   119: aastore        
        //   120: aload           6
        //   122: aconst_null    
        //   123: aload           7
        //   125: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   128: iconst_0       
        //   129: ireturn        
        //   130: getstatic       com/whatsapp/contact/f.d:Landroid/os/ConditionVariable;
        //   133: ldc2_w          64000
        //   136: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //   139: ifne            153
        //   142: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   145: bipush          33
        //   147: aaload         
        //   148: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   151: iconst_0       
        //   152: ireturn        
        //   153: aload           8
        //   155: invokevirtual   com/whatsapp/contact/i.g:()Ljava/util/List;
        //   158: aconst_null    
        //   159: invokestatic    com/whatsapp/contact/f.b:(Ljava/util/List;Ljava/util/Collection;)V
        //   162: aload           8
        //   164: invokevirtual   com/whatsapp/contact/i.f:()Ljava/util/List;
        //   167: aconst_null    
        //   168: invokestatic    com/whatsapp/contact/f.b:(Ljava/util/List;Ljava/util/Collection;)V
        //   171: new             Ljava/util/ArrayList;
        //   174: dup            
        //   175: invokespecial   java/util/ArrayList.<init>:()V
        //   178: astore          9
        //   180: aload           8
        //   182: invokevirtual   com/whatsapp/contact/i.i:()Ljava/util/List;
        //   185: aload           9
        //   187: invokestatic    com/whatsapp/contact/f.b:(Ljava/util/List;Ljava/util/Collection;)V
        //   190: getstatic       com/whatsapp/contact/f.c:Landroid/os/ConditionVariable;
        //   193: invokevirtual   android/os/ConditionVariable.close:()V
        //   196: aload           8
        //   198: invokevirtual   com/whatsapp/contact/i.j:()[Lcom/whatsapp/a_9;
        //   201: astore          10
        //   203: aload           10
        //   205: arraylength    
        //   206: ifle            436
        //   209: aload           10
        //   211: invokestatic    com/whatsapp/App.a:([Lcom/whatsapp/a_9;)Z
        //   214: istore          25
        //   216: iload           25
        //   218: ifne            257
        //   221: getstatic       com/whatsapp/App.u:Ljava/lang/Object;
        //   224: astore          36
        //   226: aload           36
        //   228: monitorenter   
        //   229: getstatic       com/whatsapp/App.d:Lcom/whatsapp/contact/h;
        //   232: aload_1        
        //   233: invokestatic    com/whatsapp/contact/h.combine:(Lcom/whatsapp/contact/h;Lcom/whatsapp/contact/h;)Lcom/whatsapp/contact/h;
        //   236: putstatic       com/whatsapp/App.d:Lcom/whatsapp/contact/h;
        //   239: aload           36
        //   241: monitorexit    
        //   242: iconst_0       
        //   243: ireturn        
        //   244: astore          11
        //   246: aload           11
        //   248: athrow         
        //   249: astore          37
        //   251: aload           36
        //   253: monitorexit    
        //   254: aload           37
        //   256: athrow         
        //   257: new             Ljava/util/HashSet;
        //   260: dup            
        //   261: invokespecial   java/util/HashSet.<init>:()V
        //   264: astore          26
        //   266: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   269: invokevirtual   com/whatsapp/wc.l:()Ljava/util/ArrayList;
        //   272: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   275: astore          27
        //   277: aload           27
        //   279: invokeinterface java/util/Iterator.hasNext:()Z
        //   284: ifeq            327
        //   287: aload           27
        //   289: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   294: checkcast       Lcom/whatsapp/a_9;
        //   297: astore          33
        //   299: aload           33
        //   301: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   304: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   307: ifne            323
        //   310: aload           26
        //   312: aload           33
        //   314: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   317: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   322: pop            
        //   323: iload_2        
        //   324: ifeq            277
        //   327: aload           10
        //   329: arraylength    
        //   330: istore          28
        //   332: iconst_0       
        //   333: istore          29
        //   335: iload           29
        //   337: iload           28
        //   339: if_icmpge       380
        //   342: aload           10
        //   344: iload           29
        //   346: aaload         
        //   347: astore          30
        //   349: aload           30
        //   351: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   354: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   357: ifne            373
        //   360: aload           26
        //   362: aload           30
        //   364: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   367: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   372: pop            
        //   373: iinc            29, 1
        //   376: iload_2        
        //   377: ifeq            335
        //   380: aload           26
        //   382: aload           26
        //   384: invokeinterface java/util/Set.size:()I
        //   389: anewarray       Ljava/lang/String;
        //   392: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   397: checkcast       [Ljava/lang/String;
        //   400: invokestatic    com/whatsapp/App.a:([Ljava/lang/String;)V
        //   403: getstatic       com/whatsapp/contact/f.c:Landroid/os/ConditionVariable;
        //   406: ldc2_w          64000
        //   409: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //   412: ifne            436
        //   415: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   418: bipush          37
        //   420: aaload         
        //   421: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   424: iconst_0       
        //   425: ireturn        
        //   426: astore          34
        //   428: aload           34
        //   430: athrow         
        //   431: astore          31
        //   433: aload           31
        //   435: athrow         
        //   436: aload           8
        //   438: invokevirtual   com/whatsapp/contact/i.g:()Ljava/util/List;
        //   441: aconst_null    
        //   442: invokestatic    com/whatsapp/contact/f.a:(Ljava/util/List;Ljava/util/Collection;)V
        //   445: aload           8
        //   447: invokevirtual   com/whatsapp/contact/i.f:()Ljava/util/List;
        //   450: aconst_null    
        //   451: invokestatic    com/whatsapp/contact/f.a:(Ljava/util/List;Ljava/util/Collection;)V
        //   454: new             Ljava/util/ArrayList;
        //   457: dup            
        //   458: invokespecial   java/util/ArrayList.<init>:()V
        //   461: astore          12
        //   463: aload           8
        //   465: invokevirtual   com/whatsapp/contact/i.i:()Ljava/util/List;
        //   468: aload           12
        //   470: invokestatic    com/whatsapp/contact/f.a:(Ljava/util/List;Ljava/util/Collection;)V
        //   473: aload           8
        //   475: invokevirtual   com/whatsapp/contact/i.g:()Ljava/util/List;
        //   478: invokeinterface java/util/List.isEmpty:()Z
        //   483: ifne            497
        //   486: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   489: aload           8
        //   491: invokevirtual   com/whatsapp/contact/i.g:()Ljava/util/List;
        //   494: invokevirtual   com/whatsapp/wc.f:(Ljava/util/Collection;)V
        //   497: aload           8
        //   499: invokevirtual   com/whatsapp/contact/i.f:()Ljava/util/List;
        //   502: invokeinterface java/util/List.isEmpty:()Z
        //   507: ifne            521
        //   510: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   513: aload           8
        //   515: invokevirtual   com/whatsapp/contact/i.f:()Ljava/util/List;
        //   518: invokevirtual   com/whatsapp/wc.b:(Ljava/util/Collection;)V
        //   521: aload           9
        //   523: invokeinterface java/util/Collection.isEmpty:()Z
        //   528: ifne            539
        //   531: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   534: aload           9
        //   536: invokevirtual   com/whatsapp/wc.b:(Ljava/util/Collection;)V
        //   539: aload           12
        //   541: invokeinterface java/util/Collection.isEmpty:()Z
        //   546: ifne            557
        //   549: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   552: aload           12
        //   554: invokevirtual   com/whatsapp/wc.b:(Ljava/util/Collection;)V
        //   557: aload           8
        //   559: invokevirtual   com/whatsapp/contact/i.e:()Ljava/util/List;
        //   562: invokeinterface java/util/List.isEmpty:()Z
        //   567: ifne            581
        //   570: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   573: aload           8
        //   575: invokevirtual   com/whatsapp/contact/i.e:()Ljava/util/List;
        //   578: invokevirtual   com/whatsapp/wc.e:(Ljava/util/Collection;)V
        //   581: getstatic       com/whatsapp/contact/f.z:[Ljava/lang/String;
        //   584: bipush          38
        //   586: aaload         
        //   587: astore          20
        //   589: iconst_1       
        //   590: anewarray       Ljava/lang/Object;
        //   593: astore          21
        //   595: aload           21
        //   597: iconst_0       
        //   598: invokestatic    java/lang/System.currentTimeMillis:()J
        //   601: lload_3        
        //   602: lsub           
        //   603: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   606: aastore        
        //   607: aload           20
        //   609: aconst_null    
        //   610: aload           21
        //   612: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   615: aload           8
        //   617: invokevirtual   com/whatsapp/contact/i.d:()Z
        //   620: ifeq            637
        //   623: aload           9
        //   625: invokeinterface java/util/Collection.isEmpty:()Z
        //   630: istore          24
        //   632: iload           24
        //   634: ifne            645
        //   637: getstatic       com/whatsapp/App.av:Landroid/os/Handler;
        //   640: iconst_1       
        //   641: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   644: pop            
        //   645: getstatic       com/whatsapp/App.aP:Landroid/os/Handler;
        //   648: iconst_0       
        //   649: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   652: pop            
        //   653: iconst_1       
        //   654: ireturn        
        //   655: astore          13
        //   657: aload           13
        //   659: athrow         
        //   660: astore          14
        //   662: aload           14
        //   664: athrow         
        //   665: astore          15
        //   667: aload           15
        //   669: athrow         
        //   670: astore          16
        //   672: aload           16
        //   674: athrow         
        //   675: astore          17
        //   677: aload           17
        //   679: athrow         
        //   680: astore          18
        //   682: aload           18
        //   684: athrow         
        //   685: astore          19
        //   687: aload           19
        //   689: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      58     81     130    Ljava/lang/Exception;
        //  58     71     73     81     Any
        //  75     78     73     81     Any
        //  78     81     81     130    Ljava/lang/Exception;
        //  130    151    81     130    Ljava/lang/Exception;
        //  153    203    81     130    Ljava/lang/Exception;
        //  203    216    244    249    Ljava/lang/Exception;
        //  221    229    81     130    Ljava/lang/Exception;
        //  229    242    249    257    Any
        //  246    249    81     130    Ljava/lang/Exception;
        //  251    254    249    257    Any
        //  254    257    81     130    Ljava/lang/Exception;
        //  257    277    81     130    Ljava/lang/Exception;
        //  277    299    81     130    Ljava/lang/Exception;
        //  299    323    426    431    Ljava/lang/Exception;
        //  327    332    81     130    Ljava/lang/Exception;
        //  342    349    81     130    Ljava/lang/Exception;
        //  349    373    431    436    Ljava/lang/Exception;
        //  380    424    81     130    Ljava/lang/Exception;
        //  428    431    81     130    Ljava/lang/Exception;
        //  433    436    81     130    Ljava/lang/Exception;
        //  436    463    81     130    Ljava/lang/Exception;
        //  463    497    655    660    Ljava/lang/Exception;
        //  497    521    660    665    Ljava/lang/Exception;
        //  521    539    665    670    Ljava/lang/Exception;
        //  539    557    670    675    Ljava/lang/Exception;
        //  557    581    675    680    Ljava/lang/Exception;
        //  581    632    680    685    Ljava/lang/Exception;
        //  637    645    685    690    Ljava/lang/Exception;
        //  645    653    81     130    Ljava/lang/Exception;
        //  657    660    81     130    Ljava/lang/Exception;
        //  662    665    81     130    Ljava/lang/Exception;
        //  667    670    81     130    Ljava/lang/Exception;
        //  672    675    81     130    Ljava/lang/Exception;
        //  677    680    81     130    Ljava/lang/Exception;
        //  682    685    685    690    Ljava/lang/Exception;
        //  687    690    81     130    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 308, Size: 308
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
    
    public static k d(final Context context, final h h) {
        final long currentTimeMillis = System.currentTimeMillis();
        final k a = a(context, h, false);
        final h registration_FULL = h.REGISTRATION_FULL;
        boolean b = false;
        if (h == registration_FULL) {
            b = true;
        }
        aam.a(context, b, a, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }
    
    public static boolean d() {
        return com.whatsapp.contact.f.g.compareAndSet(true, false);
    }
}
