// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class bw extends bq
{
    private static final String[] z;
    public byte[] l;
    
    static {
        final String[] z2 = new String[51];
        String s = "\u00186\u000e8@\u0001=";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ')';
                        break;
                    }
                    case 0: {
                        c2 = 'n';
                        break;
                    }
                    case 1: {
                        c2 = 'S';
                        break;
                    }
                    case 2: {
                        c2 = '|';
                        break;
                    }
                    case 3: {
                        c2 = 'K';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u00196\u001e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "^}H";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u00036\u001f#H\u0000:\u000f&";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u001e2\u000f8@\u00186";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u001a!\t.";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "9\u0012)\u001faCa";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "9\u0012)\u001faCa";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001b \u00199";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000f&\b#";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u00036\u001f#H\u0000:\u000f&";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u001b \u00199";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\r;\u001d'E\u000b=\u001b.";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u001d&\u001f(L\u001d ";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u000b+\f.J\u001a6\u0018k^\u000b1\\9L\u001e?\u0005g\t\f&\bkD\u0007 \u000f\"G\t\u007f\\\"GN!\u0019*M(6\u001d?\\\u001c6\u000f\nG\n\u0010\u0014*E\u00026\u0012,L";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\b2\u0015'\\\u001c6";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\b6\u0010'\t\u0001&\bkF\bs\u0010$F\u001es\u0015%\t\u001c6\u001d/o\u000b2\b>[\u000b =%M-;\u001d'E\u000b=\u001b.";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u00196\u001e";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\r<\u0018.";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u00196\u001e";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u000b!\u000e$[";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u001c6\u000f;F\u0000 \u0019";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\r<\u0018.";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u001c6\b9P";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u000b+\f\"[\u000b";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0007=\n*E\u00077\\.Q\u001e:\u000e.\t\u001a:\u0011.\t\u0001&\bq\t";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0007=\n*E\u00077\\(F\n6Fk";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0007=\n*E\u00077\\9L\u001a!\u0005q\t";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0000<\bfH\u001b'\u0014$[\u0007)\u0019/";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\b2\u0015'\\\u001c6";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0007=\n*E\u00077\\;[\u0001#\u000fk_\u000b!\u000f\"F\u0000i\\";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u001d&\u001f(L\u001d ";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\b!\u0019.";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u000b+\f\"[\u000b7";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u000b+\f\"[\u000f'\u0015$G";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u001e!\u0013;Z";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u0007=\n*E\u00077\\.Q\u001e:\u000e.\t\n2\b.\u0013N";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u001e2\u0015/";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u000f0\b\"_\u000bs\u001d(J\u0001&\u0012?\t\u0019:\b#\t\u0000<\\.Q\u001e:\u000e*]\u0007<\u0012";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u001d'\u001d?\\\u001d";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u000f0\b\"_\u000b";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    s = "\u0005:\u0012/";
                    n = 40;
                    n2 = 41;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    array = z2;
                    s = "\u0007=\n*E\u00077\\8L\u001c%\u00199\t\u001a:\u0011.\u0013N";
                    n = 41;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\t!\u0013>Y\u001d\f\ny";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\u001c6\u001d/[\u000b0\u0019\"Y\u001a ";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\u001e!\u00198L\u00000\u0019";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "\u001e!\u0015=H\r*";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\u001d'\u000e.H\u0003i\u001a.H\u001a&\u000e.Z";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\b2\u0015'\\\u001c6";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\u000b+\f.J\u001a6\u0018k^\u000b1\\9L\u001e?\u0005g\t\f&\bkD\u0007 \u000f\"G\t\u007f\\\"GN!\u0019*M96\u001e";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\u00196\u001e";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    break Label_1307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public bw(final bc bc, final co co, final b6 b6, final byte[] l) {
        super(b6, bc, co);
        this.l = l;
    }
    
    private void a() {
        try {
            if (this.b.f != null) {
                this.j.a(new c0(bw.z[1], new bm[] { new bm(bw.z[0], bw.z[2]) }, this.b.f), false);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    private void a(final c0 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/protocol/bi.O:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //     8: bipush          31
        //    10: aaload         
        //    11: invokestatic    com/whatsapp/protocol/c0.b:(Lcom/whatsapp/protocol/c0;Ljava/lang/String;)V
        //    14: aload_1        
        //    15: ldc             "t"
        //    17: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    20: astore_3       
        //    21: aload_3        
        //    22: ifnull          50
        //    25: aload_0        
        //    26: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //    29: aload_3        
        //    30: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    33: putfield        com/whatsapp/protocol/bf.h:J
        //    36: aload_0        
        //    37: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //    40: invokestatic    java/lang/System.currentTimeMillis:()J
        //    43: ldc2_w          1000
        //    46: ldiv           
        //    47: putfield        com/whatsapp/protocol/bf.q:J
        //    50: aload_1        
        //    51: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    54: bipush          34
        //    56: aaload         
        //    57: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    60: astore          4
        //    62: aload           4
        //    64: ifnull          79
        //    67: aload_0        
        //    68: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //    71: aload           4
        //    73: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    76: putfield        com/whatsapp/protocol/bf.H:J
        //    79: aload_1        
        //    80: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    83: bipush          35
        //    85: aaload         
        //    86: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    89: astore          5
        //    91: aload           5
        //    93: ifnull          115
        //    96: aload_0        
        //    97: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //   100: new             Ljava/lang/Integer;
        //   103: dup            
        //   104: aload           5
        //   106: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   109: invokespecial   java/lang/Integer.<init>:(I)V
        //   112: putfield        com/whatsapp/protocol/bf.s:Ljava/lang/Integer;
        //   115: aload_1        
        //   116: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   119: bipush          41
        //   121: aaload         
        //   122: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   125: astore          6
        //   127: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   130: bipush          37
        //   132: aaload         
        //   133: aload           6
        //   135: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   138: istore          11
        //   140: iload           11
        //   142: ifeq            157
        //   145: aload_0        
        //   146: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //   149: iconst_1       
        //   150: putfield        com/whatsapp/protocol/bf.e:I
        //   153: iload_2        
        //   154: ifeq            195
        //   157: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   160: bipush          32
        //   162: aaload         
        //   163: aload           6
        //   165: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   168: istore          12
        //   170: iload           12
        //   172: ifeq            187
        //   175: aload_0        
        //   176: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //   179: iconst_0       
        //   180: putfield        com/whatsapp/protocol/bf.e:I
        //   183: iload_2        
        //   184: ifeq            195
        //   187: aload_0        
        //   188: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //   191: iconst_m1      
        //   192: putfield        com/whatsapp/protocol/bf.e:I
        //   195: aload_1        
        //   196: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   199: bipush          39
        //   201: aaload         
        //   202: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //   205: astore          13
        //   207: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   210: bipush          33
        //   212: aaload         
        //   213: aload           13
        //   215: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   218: istore          18
        //   220: iload           18
        //   222: ifeq            237
        //   225: aload_0        
        //   226: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //   229: iconst_1       
        //   230: putfield        com/whatsapp/protocol/bf.j:I
        //   233: iload_2        
        //   234: ifeq            431
        //   237: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   240: bipush          40
        //   242: aaload         
        //   243: aload           13
        //   245: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   248: istore          19
        //   250: iload           19
        //   252: ifeq            423
        //   255: aload_0        
        //   256: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //   259: iconst_0       
        //   260: putfield        com/whatsapp/protocol/bf.j:I
        //   263: aload           4
        //   265: ifnonnull       431
        //   268: new             Ljava/io/IOException;
        //   271: dup            
        //   272: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   275: bipush          38
        //   277: aaload         
        //   278: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   281: athrow         
        //   282: astore          17
        //   284: aload           17
        //   286: athrow         
        //   287: astore          22
        //   289: new             Ljava/io/IOException;
        //   292: dup            
        //   293: new             Ljava/lang/StringBuilder;
        //   296: dup            
        //   297: invokespecial   java/lang/StringBuilder.<init>:()V
        //   300: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   303: bipush          42
        //   305: aaload         
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: aload_3        
        //   310: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   313: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   316: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   319: athrow         
        //   320: astore          21
        //   322: new             Ljava/io/IOException;
        //   325: dup            
        //   326: new             Ljava/lang/StringBuilder;
        //   329: dup            
        //   330: invokespecial   java/lang/StringBuilder.<init>:()V
        //   333: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   336: bipush          36
        //   338: aaload         
        //   339: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   342: aload           4
        //   344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   347: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   350: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   353: athrow         
        //   354: astore          20
        //   356: new             Ljava/io/IOException;
        //   359: dup            
        //   360: new             Ljava/lang/StringBuilder;
        //   363: dup            
        //   364: invokespecial   java/lang/StringBuilder.<init>:()V
        //   367: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   370: bipush          30
        //   372: aaload         
        //   373: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   376: aload           5
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   381: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   384: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   387: athrow         
        //   388: astore          7
        //   390: aload           7
        //   392: athrow         
        //   393: astore          8
        //   395: aload           8
        //   397: athrow         
        //   398: astore          9
        //   400: aload           9
        //   402: athrow         
        //   403: astore          10
        //   405: aload           10
        //   407: athrow         
        //   408: astore          14
        //   410: aload           14
        //   412: athrow         
        //   413: astore          15
        //   415: aload           15
        //   417: athrow         
        //   418: astore          16
        //   420: aload           16
        //   422: athrow         
        //   423: aload_0        
        //   424: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //   427: iconst_m1      
        //   428: putfield        com/whatsapp/protocol/bf.e:I
        //   431: aload_0        
        //   432: aload_1        
        //   433: getfield        com/whatsapp/protocol/c0.a:[B
        //   436: putfield        com/whatsapp/protocol/bw.l:[B
        //   439: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  25     50     287    320    Ljava/lang/NumberFormatException;
        //  67     79     320    354    Ljava/lang/NumberFormatException;
        //  96     115    354    388    Ljava/lang/NumberFormatException;
        //  127    140    388    393    Ljava/lang/NumberFormatException;
        //  145    153    393    398    Ljava/lang/NumberFormatException;
        //  157    170    398    403    Ljava/lang/NumberFormatException;
        //  175    183    403    408    Ljava/lang/NumberFormatException;
        //  187    195    403    408    Ljava/lang/NumberFormatException;
        //  207    220    408    413    Ljava/lang/NumberFormatException;
        //  225    233    413    418    Ljava/lang/NumberFormatException;
        //  237    250    418    423    Ljava/lang/NumberFormatException;
        //  255    263    282    287    Ljava/lang/NumberFormatException;
        //  268    282    282    287    Ljava/lang/NumberFormatException;
        //  390    393    393    398    Ljava/lang/NumberFormatException;
        //  395    398    398    403    Ljava/lang/NumberFormatException;
        //  400    403    403    408    Ljava/lang/NumberFormatException;
        //  410    413    413    418    Ljava/lang/NumberFormatException;
        //  415    418    418    423    Ljava/lang/NumberFormatException;
        //  420    423    282    287    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 210, Size: 210
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
    
    private void a(final byte[] array) {
        this.j.a(new c0(bw.z[21], null, this.a(array)));
    }
    
    private void b(final c0 c0) {
        c0.b(c0, bw.z[19]);
        final c0 b = c0.b(bw.z[20]);
        if (b != null) {
            final String c2 = b.c(bw.z[18]);
            int int1 = 500;
            if (c2 != null) {
                int1 = Integer.parseInt(c2);
            }
            this.b.w.c(this.b.f, int1);
        }
    }
    
    private void b(final boolean b) {
        byte[] a;
        if (this.l != null) {
            this.c(this.l);
            a = this.a(this.l);
        }
        else {
            a = null;
        }
        while (true) {
            while (true) {
                try {
                    final String s = bw.z[9];
                    if (b) {
                        final bm[] array = { new bm(bw.z[8], this.b.A), new bm(bw.z[10], bw.z[6]) };
                        this.j.a(new c0(s, array, a));
                        return;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final bm[] array = { new bm(bw.z[11], this.b.A), new bm(bw.z[4], bw.z[5]), new bm(bw.z[3], bw.z[7]) };
                continue;
            }
        }
    }
    
    private byte[] b() {
        while (true) {
            boolean b = false;
            final int o = bi.O;
            c0 d = null;
        Label_0170:
            while (true) {
                boolean b2 = false;
                Label_0066: {
                    try {
                        if (this.b.f == null) {
                            break Label_0066;
                        }
                        b2 = true;
                        d = this.a.d();
                        if (d == null) {
                            break;
                        }
                        final c0 c0 = d;
                        final String[] array = bw.z;
                        final int n = 12;
                        final String s = array[n];
                        final boolean b3 = com.whatsapp.protocol.c0.a(c0, s);
                        if (b3) {
                            final c0 c2 = d;
                            final byte[] a = c2.a;
                            return a;
                        }
                        break Label_0066;
                    }
                    catch (NumberFormatException ex) {
                        throw ex;
                    }
                    try {
                        final c0 c0 = d;
                        final String[] array = bw.z;
                        final int n = 12;
                        final String s = array[n];
                        final boolean b3 = com.whatsapp.protocol.c0.a(c0, s);
                        if (b3) {
                            final c0 c2 = d;
                            final byte[] a2;
                            final byte[] a = a2 = c2.a;
                            return a2;
                        }
                        break Label_0066;
                        b2 = false;
                        b = false;
                        continue;
                    }
                    catch (NumberFormatException ex2) {
                        throw ex2;
                    }
                }
                if (c0.a(d, bw.z[17])) {
                    this.b(d);
                    if (o == 0) {
                        b = true;
                        continue;
                    }
                    b = true;
                }
                Label_0178: {
                    try {
                        if (!c0.a(d, bw.z[13])) {
                            break Label_0178;
                        }
                        if (b2 && !b) {
                            try {
                                throw new cz(bw.z[14], this.a.b());
                            }
                            catch (NumberFormatException ex3) {
                                throw ex3;
                            }
                        }
                    }
                    catch (NumberFormatException ex4) {
                        try {
                            throw ex4;
                        }
                        catch (NumberFormatException ex5) {
                            throw ex5;
                        }
                    }
                    break Label_0170;
                }
                if (!c0.a(d, bw.z[15])) {
                    continue;
                }
                this.c(d);
                if (o != 0) {
                    break;
                }
                continue;
            }
            this.a(d);
            return null;
        }
        throw new cz(bw.z[16], this.a.b());
    }
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //     4: getfield        com/whatsapp/protocol/bf.f:Ljava/lang/String;
        //     7: ifnull          104
        //    10: aload_0        
        //    11: getfield        com/whatsapp/protocol/bw.a:Lcom/whatsapp/protocol/bc;
        //    14: invokeinterface com/whatsapp/protocol/bc.d:()Lcom/whatsapp/protocol/c0;
        //    19: astore_1       
        //    20: aload_1        
        //    21: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    24: bipush          48
        //    26: aaload         
        //    27: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;Ljava/lang/String;)Z
        //    30: istore          5
        //    32: iload           5
        //    34: ifeq            52
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokespecial   com/whatsapp/protocol/bw.c:(Lcom/whatsapp/protocol/c0;)V
        //    42: getstatic       com/whatsapp/protocol/bi.O:I
        //    45: istore          6
        //    47: iload           6
        //    49: ifeq            104
        //    52: aload_1        
        //    53: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    56: bipush          50
        //    58: aaload         
        //    59: invokestatic    com/whatsapp/protocol/c0.a:(Lcom/whatsapp/protocol/c0;Ljava/lang/String;)Z
        //    62: ifne            99
        //    65: new             Lcom/whatsapp/protocol/cz;
        //    68: dup            
        //    69: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    72: bipush          49
        //    74: aaload         
        //    75: aload_0        
        //    76: getfield        com/whatsapp/protocol/bw.a:Lcom/whatsapp/protocol/bc;
        //    79: invokeinterface com/whatsapp/protocol/bc.b:()Ljava/lang/String;
        //    84: invokespecial   com/whatsapp/protocol/cz.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    87: athrow         
        //    88: astore          4
        //    90: aload           4
        //    92: athrow         
        //    93: astore_2       
        //    94: aload_2        
        //    95: athrow         
        //    96: astore_3       
        //    97: aload_3        
        //    98: athrow         
        //    99: aload_0        
        //   100: aload_1        
        //   101: invokespecial   com/whatsapp/protocol/bw.b:(Lcom/whatsapp/protocol/c0;)V
        //   104: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  20     32     93     96     Ljava/lang/NumberFormatException;
        //  37     47     96     99     Ljava/lang/NumberFormatException;
        //  52     88     88     93     Ljava/lang/NumberFormatException;
        //  94     96     96     99     Ljava/lang/NumberFormatException;
        //  97     99     88     93     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
    
    private void c(final c0 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //     4: bipush          28
        //     6: aaload         
        //     7: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //    10: astore_2       
        //    11: aload_2        
        //    12: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    15: bipush          24
        //    17: aaload         
        //    18: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    21: astore_3       
        //    22: aload_3        
        //    23: ifnonnull       42
        //    26: new             Lcom/whatsapp/protocol/a4;
        //    29: dup            
        //    30: iconst_0       
        //    31: invokespecial   com/whatsapp/protocol/a4.<init>:(I)V
        //    34: astore          4
        //    36: getstatic       com/whatsapp/protocol/bi.O:I
        //    39: ifeq            110
        //    42: new             Lcom/whatsapp/protocol/a4;
        //    45: dup            
        //    46: iconst_2       
        //    47: invokespecial   com/whatsapp/protocol/a4.<init>:(I)V
        //    50: astore          4
        //    52: aload           4
        //    54: aload_3        
        //    55: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    58: putfield        com/whatsapp/protocol/a4.f:I
        //    61: aload_2        
        //    62: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    65: bipush          22
        //    67: aaload         
        //    68: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    71: astore          6
        //    73: aload           4
        //    75: aload           6
        //    77: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    80: putfield        com/whatsapp/protocol/a4.b:I
        //    83: aload_2        
        //    84: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    87: bipush          23
        //    89: aaload         
        //    90: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    93: astore          8
        //    95: aload           8
        //    97: ifnull          110
        //   100: aload           4
        //   102: aload           8
        //   104: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   107: putfield        com/whatsapp/protocol/a4.c:I
        //   110: aload           4
        //   112: athrow         
        //   113: astore          5
        //   115: new             Ljava/io/IOException;
        //   118: dup            
        //   119: new             Ljava/lang/StringBuilder;
        //   122: dup            
        //   123: invokespecial   java/lang/StringBuilder.<init>:()V
        //   126: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   129: bipush          25
        //   131: aaload         
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: aload_3        
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   142: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   145: athrow         
        //   146: astore          7
        //   148: new             Ljava/io/IOException;
        //   151: dup            
        //   152: new             Ljava/lang/StringBuilder;
        //   155: dup            
        //   156: invokespecial   java/lang/StringBuilder.<init>:()V
        //   159: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   162: bipush          26
        //   164: aaload         
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: aload           6
        //   170: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   173: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   176: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   179: athrow         
        //   180: astore          9
        //   182: new             Ljava/io/IOException;
        //   185: dup            
        //   186: new             Ljava/lang/StringBuilder;
        //   189: dup            
        //   190: invokespecial   java/lang/StringBuilder.<init>:()V
        //   193: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   196: bipush          27
        //   198: aaload         
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: aload_3        
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   209: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   212: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  52     61     113    146    Ljava/lang/NumberFormatException;
        //  73     83     146    180    Ljava/lang/NumberFormatException;
        //  100    110    180    213    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 99, Size: 99
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
    
    private void c(final byte[] array) {
        this.b.D = this.b.i.a(this.b.u, array);
        this.a.a(this.b.D);
    }
    
    private void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/util/Vector;
        //     3: dup            
        //     4: invokespecial   java/util/Vector.<init>:()V
        //     7: astore_1       
        //     8: aload_0        
        //     9: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //    12: getfield        com/whatsapp/protocol/bf.L:Z
        //    15: ifeq            36
        //    18: aload_1        
        //    19: new             Lcom/whatsapp/protocol/c0;
        //    22: dup            
        //    23: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    26: bipush          46
        //    28: aaload         
        //    29: aconst_null    
        //    30: invokespecial   com/whatsapp/protocol/c0.<init>:(Ljava/lang/String;[Lcom/whatsapp/protocol/bm;)V
        //    33: invokevirtual   java/util/Vector.addElement:(Ljava/lang/Object;)V
        //    36: aload_0        
        //    37: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //    40: getfield        com/whatsapp/protocol/bf.v:Z
        //    43: ifeq            64
        //    46: aload_1        
        //    47: new             Lcom/whatsapp/protocol/c0;
        //    50: dup            
        //    51: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    54: bipush          44
        //    56: aaload         
        //    57: aconst_null    
        //    58: invokespecial   com/whatsapp/protocol/c0.<init>:(Ljava/lang/String;[Lcom/whatsapp/protocol/bm;)V
        //    61: invokevirtual   java/util/Vector.addElement:(Ljava/lang/Object;)V
        //    64: aload_0        
        //    65: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //    68: getfield        com/whatsapp/protocol/bf.G:Z
        //    71: ifeq            92
        //    74: aload_1        
        //    75: new             Lcom/whatsapp/protocol/c0;
        //    78: dup            
        //    79: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //    82: bipush          43
        //    84: aaload         
        //    85: aconst_null    
        //    86: invokespecial   com/whatsapp/protocol/c0.<init>:(Ljava/lang/String;[Lcom/whatsapp/protocol/bm;)V
        //    89: invokevirtual   java/util/Vector.addElement:(Ljava/lang/Object;)V
        //    92: aload_0        
        //    93: getfield        com/whatsapp/protocol/bw.b:Lcom/whatsapp/protocol/bf;
        //    96: getfield        com/whatsapp/protocol/bf.g:Z
        //    99: ifeq            120
        //   102: aload_1        
        //   103: new             Lcom/whatsapp/protocol/c0;
        //   106: dup            
        //   107: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   110: bipush          45
        //   112: aaload         
        //   113: aconst_null    
        //   114: invokespecial   com/whatsapp/protocol/c0.<init>:(Ljava/lang/String;[Lcom/whatsapp/protocol/bm;)V
        //   117: invokevirtual   java/util/Vector.addElement:(Ljava/lang/Object;)V
        //   120: aload_1        
        //   121: invokevirtual   java/util/Vector.size:()I
        //   124: anewarray       Lcom/whatsapp/protocol/c0;
        //   127: astore          6
        //   129: aload_1        
        //   130: aload           6
        //   132: invokevirtual   java/util/Vector.copyInto:([Ljava/lang/Object;)V
        //   135: aload_0        
        //   136: getfield        com/whatsapp/protocol/bw.j:Lcom/whatsapp/protocol/co;
        //   139: astore          8
        //   141: getstatic       com/whatsapp/protocol/bw.z:[Ljava/lang/String;
        //   144: bipush          47
        //   146: aaload         
        //   147: astore          9
        //   149: aload           6
        //   151: arraylength    
        //   152: istore          10
        //   154: iload           10
        //   156: ifne            162
        //   159: aconst_null    
        //   160: astore          6
        //   162: aload           8
        //   164: new             Lcom/whatsapp/protocol/c0;
        //   167: dup            
        //   168: aload           9
        //   170: aconst_null    
        //   171: aload           6
        //   173: checkcast       [Lcom/whatsapp/protocol/c0;
        //   176: invokespecial   com/whatsapp/protocol/c0.<init>:(Ljava/lang/String;[Lcom/whatsapp/protocol/bm;[Lcom/whatsapp/protocol/c0;)V
        //   179: iconst_0       
        //   180: invokeinterface com/whatsapp/protocol/co.a:(Lcom/whatsapp/protocol/c0;Z)V
        //   185: return         
        //   186: astore_2       
        //   187: aload_2        
        //   188: athrow         
        //   189: astore_3       
        //   190: aload_3        
        //   191: athrow         
        //   192: astore          4
        //   194: aload           4
        //   196: athrow         
        //   197: astore          5
        //   199: aload           5
        //   201: athrow         
        //   202: astore          7
        //   204: aload           7
        //   206: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      36     186    189    Ljava/lang/NumberFormatException;
        //  36     64     189    192    Ljava/lang/NumberFormatException;
        //  64     92     192    197    Ljava/lang/NumberFormatException;
        //  92     120    197    202    Ljava/lang/NumberFormatException;
        //  129    154    202    207    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 103, Size: 103
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
    
    private void e() {
        final c0 d = this.a.d();
        try {
            if (c0.a(d, bw.z[29])) {
                this.c(d);
            }
            this.a(d);
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public void a(final boolean b) {
        try {
            if (this.b.u == null) {
                throw new a4(0);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        this.j.a(this.b.K, this.b.m);
        this.d();
        this.a();
        this.b(b);
        this.a.a();
        final byte[] b2 = this.b();
        Label_0094: {
            if (b2 == null) {
                break Label_0094;
            }
            try {
                this.c(b2);
                this.a(b2);
                this.c();
                this.e();
                this.a.c();
                this.j.a(this.b.D);
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
    }
}
