// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.OutputStream;
import java.io.InputStream;
import android.media.MediaRecorder;

class oa extends od
{
    private static boolean e;
    private static final String[] z;
    private String d;
    private z6 f;
    private uq g;
    private String h;
    private MediaRecorder i;
    
    static {
        final String[] z2 = new String[17];
        String s = "&\u001dPt\u0011\"\u0017Zx\u00064\u0017K8\u0007$\u0013Kc\u00121\u001bUr\u0010\u007f\u0000\\{\u00111\u0001\\";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 't';
                        break;
                    }
                    case 0: {
                        c2 = 'P';
                        break;
                    }
                    case 1: {
                        c2 = 'r';
                        break;
                    }
                    case 2: {
                        c2 = '9';
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
                    s = "&\u001dPt\u0011\"\u0017Zx\u00064\u0017K8\u0007$\u0013Kc\u00121\u001bUr\u0010";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "~\u0013Te";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "&\u001dPt\u0011\"\u0017Zx\u00064\u0017K8\u0007$\u0013Kc\u00121\u001bUr\u0010\u007f\u0001Mv\u0006$\u0014X~\u00185\u0016";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "&\u001dPt\u0011\"\u0017Zx\u00064\u0017K8\u0007$\u0013Kc\u00121\u001bUr\u0010\u007f\u0002Kr\u00041\u0000\\";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "&\u001dPt\u0011\"\u0017Zx\u00064\u0017K8\u00129\nXv\u0017\u007f\u0017Tg\u0000)H\u0019";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "&\u001dPt\u0011\"\u0017Zx\u00064\u0017K8\u00129\nXv\u0017\u007f\u0010XsT=\u0002\\pYdRXb\u00109\u001d\u0019x\u0016:\u0017ZcT$\u000bIrN";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "&\u001dPt\u0011\"\u0017Zx\u00064\u0017K8\u0004\"\u0017Iv\u00065";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "&\u001dPt\u0011\"\u0017Zx\u00064\u0017K8\u0004\"\u0017Iv\u00065\u0014X~\u00185\u0016\u0016e\u0011<\u0017Xd\u0011";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "~\u0013Xt";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "1\u0007]~\u001b\u007fA^g\u0004";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "~\u0013Te";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "~A^g";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "~C";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "~\u0013Te";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "~\u0013Xt";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "~\u0013Te";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    break Label_0457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public oa(final String d, final String h) {
        this.d = d;
        this.h = h;
    }
    
    static MediaRecorder a(final oa oa) {
        return oa.i;
    }
    
    static uq a(final oa oa, final uq g) {
        return oa.g = g;
    }
    
    public static void a(final InputStream p0, final OutputStream p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/od.b:I
        //     5: istore_3       
        //     6: bipush          7
        //     8: newarray        B
        //    10: astore          4
        //    12: sipush          8192
        //    15: newarray        B
        //    17: astore          5
        //    19: iconst_0       
        //    20: istore          6
        //    22: aload_0        
        //    23: aload           4
        //    25: invokevirtual   java/io/InputStream.read:([B)I
        //    28: aload           4
        //    30: arraylength    
        //    31: if_icmpne       192
        //    34: iconst_3       
        //    35: aload           4
        //    37: iconst_3       
        //    38: baload         
        //    39: iand           
        //    40: bipush          11
        //    42: ishl           
        //    43: sipush          255
        //    46: aload           4
        //    48: iconst_4       
        //    49: baload         
        //    50: iand           
        //    51: iconst_3       
        //    52: ishl           
        //    53: ior            
        //    54: sipush          224
        //    57: aload           4
        //    59: iconst_5       
        //    60: baload         
        //    61: iand           
        //    62: iconst_5       
        //    63: ishr           
        //    64: ior            
        //    65: istore          8
        //    67: aload           4
        //    69: iconst_2       
        //    70: baload         
        //    71: istore          10
        //    73: iload           10
        //    75: sipush          192
        //    78: iand           
        //    79: bipush          64
        //    81: if_icmpeq       143
        //    84: iload           6
        //    86: ifne            128
        //    89: iconst_1       
        //    90: istore          6
        //    92: new             Ljava/lang/StringBuilder;
        //    95: dup            
        //    96: invokespecial   java/lang/StringBuilder.<init>:()V
        //    99: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   102: bipush          6
        //   104: aaload         
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: sipush          192
        //   111: aload           4
        //   113: iconst_2       
        //   114: baload         
        //   115: iand           
        //   116: bipush          6
        //   118: ishr           
        //   119: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   122: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   128: aload           4
        //   130: iconst_2       
        //   131: bipush          64
        //   133: bipush          60
        //   135: aload           4
        //   137: iconst_2       
        //   138: baload         
        //   139: iand           
        //   140: ior            
        //   141: i2b            
        //   142: bastore        
        //   143: iload           8
        //   145: aload           4
        //   147: arraylength    
        //   148: isub           
        //   149: istore          11
        //   151: iload           11
        //   153: ifle            185
        //   156: aload_1        
        //   157: aload           4
        //   159: invokevirtual   java/io/OutputStream.write:([B)V
        //   162: aload_0        
        //   163: aload           5
        //   165: iconst_0       
        //   166: iload           11
        //   168: invokevirtual   java/io/InputStream.read:([BII)I
        //   171: pop            
        //   172: aload_1        
        //   173: aload           5
        //   175: iconst_0       
        //   176: iload           11
        //   178: invokevirtual   java/io/OutputStream.write:([BII)V
        //   181: iload_3        
        //   182: ifeq            188
        //   185: iinc            2, 1
        //   188: iload_3        
        //   189: ifeq            22
        //   192: iload_2        
        //   193: ifle            221
        //   196: new             Ljava/lang/StringBuilder;
        //   199: dup            
        //   200: invokespecial   java/lang/StringBuilder.<init>:()V
        //   203: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   206: iconst_5       
        //   207: aaload         
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: iload_2        
        //   212: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   215: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   218: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   221: return         
        //   222: astore          9
        //   224: aload           9
        //   226: athrow         
        //   227: astore          12
        //   229: aload           12
        //   231: athrow         
        //   232: astore          7
        //   234: aload           7
        //   236: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  67     73     222    227    Ljava/lang/RuntimeException;
        //  156    181    227    232    Ljava/lang/RuntimeException;
        //  196    221    232    237    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 132, Size: 132
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
    
    static uq b(final oa oa) {
        return oa.g;
    }
    
    static String c(final oa oa) {
        return oa.d;
    }
    
    @Override
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/od.b:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: new             Landroid/media/MediaRecorder;
        //     8: dup            
        //     9: invokespecial   android/media/MediaRecorder.<init>:()V
        //    12: putfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    15: aload_0        
        //    16: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    19: iconst_1       
        //    20: invokevirtual   android/media/MediaRecorder.setAudioSource:(I)V
        //    23: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //    26: bipush          10
        //    28: aaload         
        //    29: aload_0        
        //    30: getfield        com/whatsapp/oa.h:Ljava/lang/String;
        //    33: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    36: ifeq            106
        //    39: aload_0        
        //    40: new             Ljava/io/File;
        //    43: dup            
        //    44: new             Ljava/lang/StringBuilder;
        //    47: dup            
        //    48: invokespecial   java/lang/StringBuilder.<init>:()V
        //    51: aload_0        
        //    52: getfield        com/whatsapp/oa.d:Ljava/lang/String;
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //    61: bipush          12
        //    63: aaload         
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    70: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    73: putfield        com/whatsapp/oa.a:Ljava/io/File;
        //    76: aload_0        
        //    77: sipush          12200
        //    80: putfield        com/whatsapp/oa.c:I
        //    83: aload_0        
        //    84: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    87: iconst_1       
        //    88: invokevirtual   android/media/MediaRecorder.setOutputFormat:(I)V
        //    91: aload_0        
        //    92: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    95: iconst_1       
        //    96: invokevirtual   android/media/MediaRecorder.setAudioEncoder:(I)V
        //    99: aconst_null    
        //   100: astore          7
        //   102: iload_1        
        //   103: ifeq            372
        //   106: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   109: istore          6
        //   111: iload           6
        //   113: bipush          10
        //   115: if_icmplt       128
        //   118: getstatic       com/whatsapp/oa.e:Z
        //   121: istore          24
        //   123: iload           24
        //   125: ifeq            195
        //   128: aload_0        
        //   129: new             Ljava/io/File;
        //   132: dup            
        //   133: new             Ljava/lang/StringBuilder;
        //   136: dup            
        //   137: invokespecial   java/lang/StringBuilder.<init>:()V
        //   140: aload_0        
        //   141: getfield        com/whatsapp/oa.d:Ljava/lang/String;
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   150: bipush          11
        //   152: aaload         
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   159: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   162: putfield        com/whatsapp/oa.a:Ljava/io/File;
        //   165: aload_0        
        //   166: sipush          12200
        //   169: putfield        com/whatsapp/oa.c:I
        //   172: aload_0        
        //   173: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   176: iconst_3       
        //   177: invokevirtual   android/media/MediaRecorder.setOutputFormat:(I)V
        //   180: aload_0        
        //   181: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   184: iconst_1       
        //   185: invokevirtual   android/media/MediaRecorder.setAudioEncoder:(I)V
        //   188: aconst_null    
        //   189: astore          7
        //   191: iload_1        
        //   192: ifeq            372
        //   195: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   198: bipush          14
        //   200: if_icmplt       471
        //   203: sipush          22050
        //   206: iconst_1       
        //   207: iconst_2       
        //   208: invokestatic    android/media/AudioRecord.getMinBufferSize:(III)I
        //   211: istore          21
        //   213: iload           21
        //   215: ifle            471
        //   218: aload_0        
        //   219: new             Ljava/io/File;
        //   222: dup            
        //   223: new             Ljava/lang/StringBuilder;
        //   226: dup            
        //   227: invokespecial   java/lang/StringBuilder.<init>:()V
        //   230: aload_0        
        //   231: getfield        com/whatsapp/oa.d:Ljava/lang/String;
        //   234: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   237: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   240: bipush          15
        //   242: aaload         
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   249: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   252: putfield        com/whatsapp/oa.a:Ljava/io/File;
        //   255: aload_0        
        //   256: sipush          32000
        //   259: putfield        com/whatsapp/oa.c:I
        //   262: aload_0        
        //   263: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   266: bipush          6
        //   268: invokevirtual   android/media/MediaRecorder.setOutputFormat:(I)V
        //   271: aload_0        
        //   272: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   275: iconst_3       
        //   276: invokevirtual   android/media/MediaRecorder.setAudioEncoder:(I)V
        //   279: aload_0        
        //   280: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   283: sipush          22050
        //   286: invokevirtual   android/media/MediaRecorder.setAudioSamplingRate:(I)V
        //   289: aload_0        
        //   290: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   293: sipush          32000
        //   296: invokevirtual   android/media/MediaRecorder.setAudioEncodingBitRate:(I)V
        //   299: new             Ljava/io/File;
        //   302: dup            
        //   303: new             Ljava/lang/StringBuilder;
        //   306: dup            
        //   307: invokespecial   java/lang/StringBuilder.<init>:()V
        //   310: aload_0        
        //   311: getfield        com/whatsapp/oa.d:Ljava/lang/String;
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   320: bipush          13
        //   322: aaload         
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   329: bipush          9
        //   331: aaload         
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   335: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   338: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   341: astore          20
        //   343: aload_0        
        //   344: new             Lcom/whatsapp/z6;
        //   347: dup            
        //   348: aload_0        
        //   349: aconst_null    
        //   350: invokespecial   com/whatsapp/z6.<init>:(Lcom/whatsapp/oa;Lcom/whatsapp/yi;)V
        //   353: putfield        com/whatsapp/oa.f:Lcom/whatsapp/z6;
        //   356: aload_0        
        //   357: getfield        com/whatsapp/oa.f:Lcom/whatsapp/z6;
        //   360: iconst_0       
        //   361: ldc2_w          50
        //   364: invokevirtual   com/whatsapp/z6.sendEmptyMessageDelayed:(IJ)Z
        //   367: pop            
        //   368: aload           20
        //   370: astore          7
        //   372: aload           7
        //   374: ifnull          393
        //   377: aload_0        
        //   378: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   381: aload           7
        //   383: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   386: invokevirtual   android/media/MediaRecorder.setOutputFile:(Ljava/lang/String;)V
        //   389: iload_1        
        //   390: ifeq            407
        //   393: aload_0        
        //   394: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   397: aload_0        
        //   398: getfield        com/whatsapp/oa.a:Ljava/io/File;
        //   401: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   404: invokevirtual   android/media/MediaRecorder.setOutputFile:(Ljava/lang/String;)V
        //   407: aload_0        
        //   408: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   411: ldc2_w          1048576
        //   414: getstatic       com/whatsapp/ym.k:I
        //   417: i2l            
        //   418: lmul           
        //   419: invokevirtual   android/media/MediaRecorder.setMaxFileSize:(J)V
        //   422: aload_0        
        //   423: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   426: invokevirtual   android/media/MediaRecorder.prepare:()V
        //   429: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   432: ifeq            441
        //   435: iload_1        
        //   436: iconst_1       
        //   437: iadd           
        //   438: putstatic       com/whatsapp/od.b:I
        //   441: return         
        //   442: astore_2       
        //   443: aload_2        
        //   444: athrow         
        //   445: astore_3       
        //   446: aload_3        
        //   447: athrow         
        //   448: astore          4
        //   450: aload           4
        //   452: athrow         
        //   453: astore          5
        //   455: aload           5
        //   457: athrow         
        //   458: astore          16
        //   460: aload           16
        //   462: athrow         
        //   463: astore          17
        //   465: aconst_null    
        //   466: astore          7
        //   468: goto            372
        //   471: aload_0        
        //   472: new             Ljava/io/File;
        //   475: dup            
        //   476: new             Ljava/lang/StringBuilder;
        //   479: dup            
        //   480: invokespecial   java/lang/StringBuilder.<init>:()V
        //   483: aload_0        
        //   484: getfield        com/whatsapp/oa.d:Ljava/lang/String;
        //   487: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   490: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   493: bipush          16
        //   495: aaload         
        //   496: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   499: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   502: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   505: putfield        com/whatsapp/oa.a:Ljava/io/File;
        //   508: sipush          16000
        //   511: iconst_1       
        //   512: iconst_2       
        //   513: invokestatic    android/media/AudioRecord.getMinBufferSize:(III)I
        //   516: ifle            556
        //   519: aload_0        
        //   520: sipush          12650
        //   523: putfield        com/whatsapp/oa.c:I
        //   526: aload_0        
        //   527: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   530: iconst_4       
        //   531: invokevirtual   android/media/MediaRecorder.setOutputFormat:(I)V
        //   534: aload_0        
        //   535: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   538: iconst_2       
        //   539: invokevirtual   android/media/MediaRecorder.setAudioEncoder:(I)V
        //   542: aload_0        
        //   543: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   546: sipush          16000
        //   549: invokevirtual   android/media/MediaRecorder.setAudioSamplingRate:(I)V
        //   552: iload_1        
        //   553: ifeq            819
        //   556: aload_0        
        //   557: sipush          12200
        //   560: putfield        com/whatsapp/oa.c:I
        //   563: aload_0        
        //   564: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   567: iconst_3       
        //   568: invokevirtual   android/media/MediaRecorder.setOutputFormat:(I)V
        //   571: aload_0        
        //   572: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   575: iconst_1       
        //   576: invokevirtual   android/media/MediaRecorder.setAudioEncoder:(I)V
        //   579: aconst_null    
        //   580: astore          20
        //   582: goto            368
        //   585: astore          18
        //   587: aload           18
        //   589: athrow         
        //   590: astore          19
        //   592: aload           19
        //   594: athrow         
        //   595: astore          15
        //   597: aload           15
        //   599: athrow         
        //   600: astore          8
        //   602: aload           8
        //   604: athrow         
        //   605: astore          9
        //   607: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   610: bipush          7
        //   612: aaload         
        //   613: aload           9
        //   615: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   618: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   621: bipush          10
        //   623: if_icmplt       766
        //   626: getstatic       com/whatsapp/oa.e:Z
        //   629: istore          12
        //   631: iload           12
        //   633: ifne            766
        //   636: aload_0        
        //   637: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   640: invokevirtual   android/media/MediaRecorder.release:()V
        //   643: iconst_1       
        //   644: putstatic       com/whatsapp/oa.e:Z
        //   647: aload_0        
        //   648: new             Landroid/media/MediaRecorder;
        //   651: dup            
        //   652: invokespecial   android/media/MediaRecorder.<init>:()V
        //   655: putfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   658: aload_0        
        //   659: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   662: iconst_1       
        //   663: invokevirtual   android/media/MediaRecorder.setAudioSource:(I)V
        //   666: aload_0        
        //   667: new             Ljava/io/File;
        //   670: dup            
        //   671: new             Ljava/lang/StringBuilder;
        //   674: dup            
        //   675: invokespecial   java/lang/StringBuilder.<init>:()V
        //   678: aload_0        
        //   679: getfield        com/whatsapp/oa.d:Ljava/lang/String;
        //   682: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   685: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   688: bipush          14
        //   690: aaload         
        //   691: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   694: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   697: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   700: putfield        com/whatsapp/oa.a:Ljava/io/File;
        //   703: aload_0        
        //   704: sipush          12200
        //   707: putfield        com/whatsapp/oa.c:I
        //   710: aload_0        
        //   711: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   714: iconst_3       
        //   715: invokevirtual   android/media/MediaRecorder.setOutputFormat:(I)V
        //   718: aload_0        
        //   719: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   722: iconst_1       
        //   723: invokevirtual   android/media/MediaRecorder.setAudioEncoder:(I)V
        //   726: aload_0        
        //   727: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   730: aload_0        
        //   731: getfield        com/whatsapp/oa.a:Ljava/io/File;
        //   734: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   737: invokevirtual   android/media/MediaRecorder.setOutputFile:(Ljava/lang/String;)V
        //   740: aload_0        
        //   741: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   744: ldc2_w          1048576
        //   747: getstatic       com/whatsapp/ym.k:I
        //   750: i2l            
        //   751: lmul           
        //   752: invokevirtual   android/media/MediaRecorder.setMaxFileSize:(J)V
        //   755: aload_0        
        //   756: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   759: invokevirtual   android/media/MediaRecorder.prepare:()V
        //   762: iload_1        
        //   763: ifeq            429
        //   766: new             Ljava/io/IOException;
        //   769: dup            
        //   770: aload           9
        //   772: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   775: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   778: athrow         
        //   779: astore          11
        //   781: aload           11
        //   783: athrow         
        //   784: astore          10
        //   786: aload           10
        //   788: athrow         
        //   789: astore          13
        //   791: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   794: bipush          8
        //   796: aaload         
        //   797: aload           13
        //   799: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   802: goto            643
        //   805: astore          14
        //   807: aload           14
        //   809: athrow         
        //   810: astore          22
        //   812: aload           20
        //   814: astore          7
        //   816: goto            372
        //   819: aconst_null    
        //   820: astore          20
        //   822: goto            368
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  23     99     442    445    Ljava/lang/Exception;
        //  106    111    445    448    Ljava/lang/Exception;
        //  118    123    448    453    Ljava/lang/Exception;
        //  128    188    453    458    Ljava/lang/Exception;
        //  195    213    458    463    Ljava/lang/Exception;
        //  218    343    463    471    Ljava/lang/Exception;
        //  343    368    810    819    Ljava/lang/Exception;
        //  377    389    595    600    Ljava/lang/Exception;
        //  393    407    600    605    Ljava/lang/Exception;
        //  422    429    605    805    Ljava/lang/Exception;
        //  429    441    805    810    Ljava/lang/Exception;
        //  443    445    445    448    Ljava/lang/Exception;
        //  446    448    448    453    Ljava/lang/Exception;
        //  450    453    453    458    Ljava/lang/Exception;
        //  460    463    463    471    Ljava/lang/Exception;
        //  471    552    585    590    Ljava/lang/Exception;
        //  556    579    590    595    Ljava/lang/Exception;
        //  587    590    590    595    Ljava/lang/Exception;
        //  592    595    463    471    Ljava/lang/Exception;
        //  597    600    600    605    Ljava/lang/Exception;
        //  607    631    784    789    Ljava/lang/Exception;
        //  636    643    789    805    Ljava/lang/RuntimeException;
        //  643    762    779    784    Ljava/lang/Exception;
        //  766    779    779    784    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 384, Size: 384
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
    public void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //     4: invokevirtual   android/media/MediaRecorder.start:()V
        //     7: return         
        //     8: astore_1       
        //     9: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //    12: iconst_1       
        //    13: aaload         
        //    14: aload_1        
        //    15: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    18: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    21: istore          4
        //    23: iload           4
        //    25: bipush          10
        //    27: if_icmplt       224
        //    30: getstatic       com/whatsapp/oa.e:Z
        //    33: istore          5
        //    35: iload           5
        //    37: ifne            224
        //    40: aload_0        
        //    41: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    44: invokevirtual   android/media/MediaRecorder.release:()V
        //    47: aload_0        
        //    48: new             Landroid/media/MediaRecorder;
        //    51: dup            
        //    52: invokespecial   android/media/MediaRecorder.<init>:()V
        //    55: putfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    58: aload_0        
        //    59: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    62: iconst_1       
        //    63: invokevirtual   android/media/MediaRecorder.setAudioSource:(I)V
        //    66: aload_0        
        //    67: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    70: iconst_3       
        //    71: invokevirtual   android/media/MediaRecorder.setOutputFormat:(I)V
        //    74: aload_0        
        //    75: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    78: iconst_1       
        //    79: invokevirtual   android/media/MediaRecorder.setAudioEncoder:(I)V
        //    82: aload_0        
        //    83: new             Ljava/io/File;
        //    86: dup            
        //    87: new             Ljava/lang/StringBuilder;
        //    90: dup            
        //    91: invokespecial   java/lang/StringBuilder.<init>:()V
        //    94: aload_0        
        //    95: getfield        com/whatsapp/oa.d:Ljava/lang/String;
        //    98: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   101: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   104: iconst_2       
        //   105: aaload         
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   112: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   115: putfield        com/whatsapp/oa.a:Ljava/io/File;
        //   118: aload_0        
        //   119: sipush          12200
        //   122: putfield        com/whatsapp/oa.c:I
        //   125: aload_0        
        //   126: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   129: aload_0        
        //   130: getfield        com/whatsapp/oa.a:Ljava/io/File;
        //   133: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   136: invokevirtual   android/media/MediaRecorder.setOutputFile:(Ljava/lang/String;)V
        //   139: aload_0        
        //   140: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   143: ldc2_w          1048576
        //   146: getstatic       com/whatsapp/ym.k:I
        //   149: i2l            
        //   150: lmul           
        //   151: invokevirtual   android/media/MediaRecorder.setMaxFileSize:(J)V
        //   154: aload_0        
        //   155: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   158: invokevirtual   android/media/MediaRecorder.prepare:()V
        //   161: aload_0        
        //   162: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //   165: invokevirtual   android/media/MediaRecorder.start:()V
        //   168: iconst_1       
        //   169: putstatic       com/whatsapp/oa.e:Z
        //   172: return         
        //   173: astore          8
        //   175: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   178: iconst_3       
        //   179: aaload         
        //   180: aload           8
        //   182: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   185: aload           8
        //   187: athrow         
        //   188: astore          7
        //   190: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   193: iconst_4       
        //   194: aaload         
        //   195: aload           7
        //   197: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   200: aload           7
        //   202: athrow         
        //   203: astore_2       
        //   204: aload_2        
        //   205: athrow         
        //   206: astore_3       
        //   207: aload_3        
        //   208: athrow         
        //   209: astore          6
        //   211: getstatic       com/whatsapp/oa.z:[Ljava/lang/String;
        //   214: iconst_0       
        //   215: aaload         
        //   216: aload           6
        //   218: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   221: goto            47
        //   224: aload_1        
        //   225: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      7      8      226    Ljava/lang/RuntimeException;
        //  9      23     203    206    Ljava/lang/RuntimeException;
        //  30     35     203    206    Ljava/lang/RuntimeException;
        //  30     35     206    209    Ljava/io/IOException;
        //  40     47     209    224    Ljava/lang/RuntimeException;
        //  40     47     206    209    Ljava/io/IOException;
        //  154    161    188    203    Ljava/io/IOException;
        //  161    172    173    188    Ljava/lang/RuntimeException;
        //  161    172    188    203    Ljava/io/IOException;
        //  175    188    188    203    Ljava/io/IOException;
        //  204    206    206    209    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 111, Size: 111
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
    
    @Override
    public void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //     4: ifnull          14
        //     7: aload_0        
        //     8: getfield        com/whatsapp/oa.i:Landroid/media/MediaRecorder;
        //    11: invokevirtual   android/media/MediaRecorder.stop:()V
        //    14: aload_0        
        //    15: getfield        com/whatsapp/oa.f:Lcom/whatsapp/z6;
        //    18: ifnull          29
        //    21: aload_0        
        //    22: getfield        com/whatsapp/oa.f:Lcom/whatsapp/z6;
        //    25: iconst_0       
        //    26: invokevirtual   com/whatsapp/z6.removeMessages:(I)V
        //    29: aload_0        
        //    30: getfield        com/whatsapp/oa.g:Lcom/whatsapp/uq;
        //    33: ifnull          43
        //    36: aload_0        
        //    37: getfield        com/whatsapp/oa.g:Lcom/whatsapp/uq;
        //    40: invokevirtual   com/whatsapp/uq.a:()V
        //    43: return         
        //    44: astore_1       
        //    45: aload_1        
        //    46: athrow         
        //    47: astore_2       
        //    48: aload_2        
        //    49: athrow         
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      14     44     47     Ljava/lang/RuntimeException;
        //  14     29     47     50     Ljava/lang/RuntimeException;
        //  29     43     50     53     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 29, Size: 29
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
    public void f() {
        try {
            if (this.i != null) {
                this.i.release();
                this.i = null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
}
