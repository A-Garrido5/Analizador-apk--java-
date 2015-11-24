// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.security.MessageDigest;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Key;
import javax.crypto.Mac;
import com.google.hv;
import javax.crypto.spec.SecretKeySpec;

public class aH implements ai
{
    private static final String[] z;
    private final byte[] a;
    private final int b;
    private final int c;
    private final ak d;
    private final byte[] e;
    private final int f;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u001d/ `\r?/kx\u0007:2\"a\fra";
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
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = 'H';
                        break;
                    }
                    case 1: {
                        c2 = 'A';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = '\u000e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001/(a\u000f8-.z\u0007h,.}\u0011)&. ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0004$,o\u00011a&k\u0011; ,kXh";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\n /./)\"j";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0000,*m1\u0000\u0000y;T";
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
    
    public aH(final int c, final SecretKeySpec secretKeySpec, final ak d, final int b, final int f, final byte[] e, final o o, final o o2) {
        final byte[] array = { m.a(c, 3) };
        final byte[] a = aB.o().b(hv.a(d.a())).b(b).a(f).a(hv.a(e)).h().a();
        this.a = m.a(new byte[][] { array, a, this.a(c, o, o2, secretKeySpec, m.a(new byte[][] { array, a })) });
        this.d = d;
        this.b = b;
        this.f = f;
        this.e = e;
        this.c = c;
    }
    
    public aH(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_1        
        //     5: iconst_1       
        //     6: bipush          -8
        //     8: iconst_m1      
        //     9: aload_1        
        //    10: arraylength    
        //    11: iadd           
        //    12: iadd           
        //    13: bipush          8
        //    15: invokestatic    org/whispersystems/m.a:([BIII)[[B
        //    18: astore_3       
        //    19: aload_3        
        //    20: iconst_0       
        //    21: aaload         
        //    22: iconst_0       
        //    23: baload         
        //    24: istore          4
        //    26: aload_3        
        //    27: iconst_1       
        //    28: aaload         
        //    29: astore          5
        //    31: aload_3        
        //    32: iconst_2       
        //    33: aaload         
        //    34: pop            
        //    35: iload           4
        //    37: invokestatic    org/whispersystems/m.a:(B)I
        //    40: iconst_1       
        //    41: if_icmpgt       93
        //    44: new             Lorg/whispersystems/bW;
        //    47: dup            
        //    48: new             Ljava/lang/StringBuilder;
        //    51: dup            
        //    52: invokespecial   java/lang/StringBuilder.<init>:()V
        //    55: getstatic       org/whispersystems/aH.z:[Ljava/lang/String;
        //    58: iconst_2       
        //    59: aaload         
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: iload           4
        //    65: invokestatic    org/whispersystems/m.a:(B)I
        //    68: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: invokespecial   org/whispersystems/bW.<init>:(Ljava/lang/String;)V
        //    77: athrow         
        //    78: astore          7
        //    80: aload           7
        //    82: athrow         
        //    83: astore_2       
        //    84: new             Lorg/whispersystems/I;
        //    87: dup            
        //    88: aload_2        
        //    89: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/Throwable;)V
        //    92: athrow         
        //    93: iload           4
        //    95: invokestatic    org/whispersystems/m.a:(B)I
        //    98: iconst_3       
        //    99: if_icmple       141
        //   102: new             Lorg/whispersystems/I;
        //   105: dup            
        //   106: new             Ljava/lang/StringBuilder;
        //   109: dup            
        //   110: invokespecial   java/lang/StringBuilder.<init>:()V
        //   113: getstatic       org/whispersystems/aH.z:[Ljava/lang/String;
        //   116: iconst_0       
        //   117: aaload         
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: iload           4
        //   123: invokestatic    org/whispersystems/m.a:(B)I
        //   126: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   132: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/String;)V
        //   135: athrow         
        //   136: astore          8
        //   138: aload           8
        //   140: athrow         
        //   141: aload           5
        //   143: invokestatic    org/whispersystems/aB.a:([B)Lorg/whispersystems/aB;
        //   146: astore          9
        //   148: aload           9
        //   150: invokevirtual   org/whispersystems/aB.n:()Z
        //   153: ifeq            180
        //   156: aload           9
        //   158: invokevirtual   org/whispersystems/aB.d:()Z
        //   161: istore          13
        //   163: iload           13
        //   165: ifeq            180
        //   168: aload           9
        //   170: invokevirtual   org/whispersystems/aB.m:()Z
        //   173: istore          14
        //   175: iload           14
        //   177: ifne            212
        //   180: new             Lorg/whispersystems/I;
        //   183: dup            
        //   184: getstatic       org/whispersystems/aH.z:[Ljava/lang/String;
        //   187: iconst_1       
        //   188: aaload         
        //   189: invokespecial   org/whispersystems/I.<init>:(Ljava/lang/String;)V
        //   192: athrow         
        //   193: astore          12
        //   195: aload           12
        //   197: athrow         
        //   198: astore_2       
        //   199: goto            84
        //   202: astore          10
        //   204: aload           10
        //   206: athrow         
        //   207: astore          11
        //   209: aload           11
        //   211: athrow         
        //   212: aload_0        
        //   213: aload_1        
        //   214: putfield        org/whispersystems/aH.a:[B
        //   217: aload_0        
        //   218: aload           9
        //   220: invokevirtual   org/whispersystems/aB.f:()Lcom/google/hv;
        //   223: invokevirtual   com/google/hv.a:()[B
        //   226: iconst_0       
        //   227: invokestatic    org/whispersystems/s.a:([BI)Lorg/whispersystems/ak;
        //   230: putfield        org/whispersystems/aH.d:Lorg/whispersystems/ak;
        //   233: aload_0        
        //   234: iload           4
        //   236: invokestatic    org/whispersystems/m.a:(B)I
        //   239: putfield        org/whispersystems/aH.c:I
        //   242: aload_0        
        //   243: aload           9
        //   245: invokevirtual   org/whispersystems/aB.q:()I
        //   248: putfield        org/whispersystems/aH.b:I
        //   251: aload_0        
        //   252: aload           9
        //   254: invokevirtual   org/whispersystems/aB.i:()I
        //   257: putfield        org/whispersystems/aH.f:I
        //   260: aload_0        
        //   261: aload           9
        //   263: invokevirtual   org/whispersystems/aB.c:()Lcom/google/hv;
        //   266: invokevirtual   com/google/hv.a:()[B
        //   269: putfield        org/whispersystems/aH.e:[B
        //   272: return         
        //   273: astore_2       
        //   274: goto            84
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  4      35     83     84     Lcom/google/bg;
        //  4      35     273    277    Lorg/whispersystems/aA;
        //  4      35     198    202    Ljava/text/ParseException;
        //  35     78     78     83     Lcom/google/bg;
        //  35     78     273    277    Lorg/whispersystems/aA;
        //  35     78     198    202    Ljava/text/ParseException;
        //  80     83     83     84     Lcom/google/bg;
        //  80     83     273    277    Lorg/whispersystems/aA;
        //  80     83     198    202    Ljava/text/ParseException;
        //  93     136    136    141    Lcom/google/bg;
        //  93     136    273    277    Lorg/whispersystems/aA;
        //  93     136    198    202    Ljava/text/ParseException;
        //  138    141    83     84     Lcom/google/bg;
        //  138    141    273    277    Lorg/whispersystems/aA;
        //  138    141    198    202    Ljava/text/ParseException;
        //  141    148    83     84     Lcom/google/bg;
        //  141    148    273    277    Lorg/whispersystems/aA;
        //  141    148    198    202    Ljava/text/ParseException;
        //  148    163    202    207    Lcom/google/bg;
        //  148    163    273    277    Lorg/whispersystems/aA;
        //  148    163    198    202    Ljava/text/ParseException;
        //  168    175    207    212    Lcom/google/bg;
        //  168    175    273    277    Lorg/whispersystems/aA;
        //  168    175    198    202    Ljava/text/ParseException;
        //  180    193    193    198    Lcom/google/bg;
        //  180    193    273    277    Lorg/whispersystems/aA;
        //  180    193    198    202    Ljava/text/ParseException;
        //  195    198    83     84     Lcom/google/bg;
        //  195    198    273    277    Lorg/whispersystems/aA;
        //  195    198    198    202    Ljava/text/ParseException;
        //  204    207    207    212    Lcom/google/bg;
        //  204    207    273    277    Lorg/whispersystems/aA;
        //  204    207    198    202    Ljava/text/ParseException;
        //  209    212    193    198    Lcom/google/bg;
        //  209    212    273    277    Lorg/whispersystems/aA;
        //  209    212    198    202    Ljava/text/ParseException;
        //  212    272    83     84     Lcom/google/bg;
        //  212    272    273    277    Lorg/whispersystems/aA;
        //  212    272    198    202    Ljava/text/ParseException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 141, Size: 141
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    private byte[] a(final int n, final o o, final o o2, final SecretKeySpec secretKeySpec, final byte[] array) {
        try {
            final Mac instance = Mac.getInstance(aH.z[4]);
            try {
                instance.init(secretKeySpec);
                if (n >= 3) {
                    instance.update(o.a().a());
                    instance.update(o2.a().a());
                }
                return m.c(instance.doFinal(array), 8);
            }
            catch (NoSuchAlgorithmException ex) {
                try {
                    throw ex;
                }
                catch (NoSuchAlgorithmException ex2) {}
                catch (InvalidKeyException ex3) {}
            }
        }
        catch (NoSuchAlgorithmException ex4) {}
        catch (InvalidKeyException ex5) {}
    }
    
    public ak a() {
        return this.d;
    }
    
    public void a(final int n, final o o, final o o2, final SecretKeySpec secretKeySpec) {
        final byte[][] b = m.b(this.a, -8 + this.a.length, 8);
        if (!MessageDigest.isEqual(this.a(n, o, o2, secretKeySpec, b[0]), b[1])) {
            throw new I(aH.z[3]);
        }
    }
    
    @Override
    public byte[] a() {
        return this.a;
    }
    
    @Override
    public int b() {
        return 2;
    }
    
    public int c() {
        return this.c;
    }
    
    public int d() {
        return this.b;
    }
    
    public byte[] e() {
        return this.e;
    }
}
