// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Handler;

class x1 extends Thread
{
    private static final String[] z;
    private boolean a;
    private Handler b;
    final RegisterName c;
    private boolean d;
    private int e;
    
    static {
        final String[] z2 = new String[27];
        String s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0017\u0000Ph<\u0002\u0017Q5";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0707:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'e';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0016\fPh=\u001f\u000b[";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0016\fPh=\u001f\u000b[";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$\u0006\u0011\tL\"8\u0014\u001ca\"7\u0014\u0000Z";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u0000J$6\u001e\u000b[$-\u0019\nPh8\u0013\u0011W1<";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0016\fPh=\u001f\u000b[";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0016\fPh=\u001f\u000b[";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\rQ25\u0014\u0017[!+\u0015\u0016V+0\u0003\u0011M";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$\u0006\u0011\tL\"8\u0014\u001ca\"7\u0014\u0000Z";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0015\u0017L(+";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$v\u0014\u0000R& \u0015\u0001";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0016\fPh=\u001f\u000b[";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u0000J4 \u001e\u0006J.4\u0015";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$\u0006\u0011\tL\"8\u0014\u001ca\"7\u0014\u0000Z";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$\u0006\u0011\tL\"8\u0014\u001ca4-\u0011\u0017J\"=";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0016\fPh=\u001f\u000b[";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0002\u0010P7<\u0002\u0003Q54\u0003\u001cP$";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0016\fPh=\u001f\u000b[";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$\u0006\u0011\tL\"8\u0014\u001ca\"7\u0014\u0000Z";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$\u0006\u0011\tL\"8\u0014\u001ca\"7\u0014\u0000Z";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u001eo";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0013\nP38\u0013\u0011Mh:\u001f\u0010P3y";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0013\t[&+\u0003\u001cP$=\u0011\u0011_";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0019\u000bW30\u0011\tW=<\u0002JL27";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0019\u000bW30\u0011\tW=<\u0002JM>7\u0013JZ(7\u0015EL\"*\u0005\tJz";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$\u0006\u0011\tL\"8\u0014\u001ca\"7\u0014\u0000Z";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "L\">\u0019\u0016J\"+\u001e\u0004S\"v\u0003\u001cP$\u0006\u0011\tL\"8\u0014\u001ca\"7\u0014\u0000Z";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    break Label_0707;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public x1(final RegisterName c, final Handler b) {
        this.c = c;
        this.a = false;
        this.d = false;
        this.e = 0;
        this.b = b;
        this.start();
    }
    
    static int a(final x1 x1) {
        return x1.e;
    }
    
    static boolean b(final x1 x1) {
        return x1.a;
    }
    
    static boolean c(final x1 x1) {
        return x1.d;
    }
    
    public void a() {
        if (this.b != null) {
            this.b.removeMessages(0);
            this.b = null;
        }
    }
    
    public void a(final Handler b) {
        if (this.a) {
            b.sendEmptyMessage(0);
        }
        this.b = b;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //     7: bipush          23
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: invokestatic    com/whatsapp/contact/f.b:()Z
        //    16: ifne            28
        //    19: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //    22: bipush          14
        //    24: aaload         
        //    25: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    28: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    31: invokevirtual   com/whatsapp/wc.h:()I
        //    34: istore          14
        //    36: sipush          1001
        //    39: istore          15
        //    41: getstatic       com/whatsapp/contact/b.BOTH:Lcom/whatsapp/contact/b;
        //    44: invokestatic    com/whatsapp/contact/j.b:(Lcom/whatsapp/contact/b;)Ljava/lang/Integer;
        //    47: invokevirtual   java/lang/Integer.intValue:()I
        //    50: istore          51
        //    52: iload           51
        //    54: istore          15
        //    56: aload_0        
        //    57: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //    60: astore          18
        //    62: iload           15
        //    64: sipush          1000
        //    67: if_icmpgt       435
        //    70: iconst_1       
        //    71: istore          19
        //    73: aload           18
        //    75: iload           19
        //    77: invokestatic    com/whatsapp/App.d:(Landroid/content/Context;Z)V
        //    80: new             Ljava/lang/StringBuilder;
        //    83: dup            
        //    84: invokespecial   java/lang/StringBuilder.<init>:()V
        //    87: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //    90: bipush          21
        //    92: aaload         
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: iload           15
        //    98: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   101: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   104: bipush          20
        //   106: aaload         
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: aload_0        
        //   111: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //   114: invokestatic    com/whatsapp/App.w:(Landroid/content/Context;)Z
        //   117: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   120: ldc             ")"
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   128: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   131: aload_0        
        //   132: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //   135: invokevirtual   com/whatsapp/RegisterName.getApplicationContext:()Landroid/content/Context;
        //   138: invokestatic    com/whatsapp/contact/f.a:(Landroid/content/Context;)V
        //   141: aload_0        
        //   142: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //   145: invokevirtual   com/whatsapp/RegisterName.getApplicationContext:()Landroid/content/Context;
        //   148: getstatic       com/whatsapp/contact/h.REGISTRATION_FULL:Lcom/whatsapp/contact/h;
        //   151: invokestatic    com/whatsapp/contact/f.b:(Landroid/content/Context;Lcom/whatsapp/contact/h;)Lcom/whatsapp/contact/k;
        //   154: astore          20
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: invokespecial   java/lang/StringBuilder.<init>:()V
        //   163: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   166: bipush          24
        //   168: aaload         
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: aload           20
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   177: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   180: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   183: aload           20
        //   185: getstatic       com/whatsapp/contact/k.NETWORK_UNAVAILABLE:Lcom/whatsapp/contact/k;
        //   188: if_acmpne       446
        //   191: aload_0        
        //   192: iconst_1       
        //   193: putfield        com/whatsapp/x1.e:I
        //   196: aload_0        
        //   197: iconst_1       
        //   198: putfield        com/whatsapp/x1.a:Z
        //   201: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   204: bipush          11
        //   206: aaload         
        //   207: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   210: aload_0        
        //   211: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   214: ifnull          226
        //   217: aload_0        
        //   218: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   221: iconst_0       
        //   222: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   225: pop            
        //   226: invokestatic    com/whatsapp/contact/f.d:()Z
        //   229: ifne            241
        //   232: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   235: bipush          25
        //   237: aaload         
        //   238: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   241: return         
        //   242: astore          10
        //   244: aload           10
        //   246: athrow         
        //   247: astore          6
        //   249: aload_0        
        //   250: iconst_1       
        //   251: putfield        com/whatsapp/x1.a:Z
        //   254: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   257: bipush          17
        //   259: aaload         
        //   260: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   263: aload_0        
        //   264: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   267: ifnull          279
        //   270: aload_0        
        //   271: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   274: iconst_0       
        //   275: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   278: pop            
        //   279: invokestatic    com/whatsapp/contact/f.d:()Z
        //   282: ifne            241
        //   285: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   288: bipush          19
        //   290: aaload         
        //   291: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   294: return         
        //   295: astore          8
        //   297: aload           8
        //   299: athrow         
        //   300: astore          16
        //   302: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   305: bipush          9
        //   307: aaload         
        //   308: aload           16
        //   310: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   313: goto            56
        //   316: astore          11
        //   318: aload_0        
        //   319: iconst_3       
        //   320: putfield        com/whatsapp/x1.e:I
        //   323: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   326: iconst_0       
        //   327: aaload         
        //   328: aload           11
        //   330: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   333: aload_0        
        //   334: iconst_1       
        //   335: putfield        com/whatsapp/x1.a:Z
        //   338: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   341: iconst_1       
        //   342: aaload         
        //   343: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   346: aload_0        
        //   347: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   350: ifnull          362
        //   353: aload_0        
        //   354: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   357: iconst_0       
        //   358: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   361: pop            
        //   362: invokestatic    com/whatsapp/contact/f.d:()Z
        //   365: ifne            241
        //   368: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   371: bipush          26
        //   373: aaload         
        //   374: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   377: return         
        //   378: astore          12
        //   380: aload           12
        //   382: athrow         
        //   383: astore          17
        //   385: aload           17
        //   387: athrow         
        //   388: astore_2       
        //   389: aload_0        
        //   390: iconst_1       
        //   391: putfield        com/whatsapp/x1.a:Z
        //   394: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   397: iconst_5       
        //   398: aaload         
        //   399: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   402: aload_0        
        //   403: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   406: ifnull          418
        //   409: aload_0        
        //   410: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   413: iconst_0       
        //   414: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   417: pop            
        //   418: invokestatic    com/whatsapp/contact/f.d:()Z
        //   421: ifne            433
        //   424: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   427: bipush          18
        //   429: aaload         
        //   430: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   433: aload_2        
        //   434: athrow         
        //   435: iconst_0       
        //   436: istore          19
        //   438: goto            73
        //   441: astore          49
        //   443: aload           49
        //   445: athrow         
        //   446: aload           20
        //   448: getstatic       com/whatsapp/contact/k.FAILED:Lcom/whatsapp/contact/k;
        //   451: if_acmpne       509
        //   454: aload_0        
        //   455: iconst_3       
        //   456: putfield        com/whatsapp/x1.e:I
        //   459: aload_0        
        //   460: iconst_1       
        //   461: putfield        com/whatsapp/x1.a:Z
        //   464: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   467: iconst_2       
        //   468: aaload         
        //   469: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   472: aload_0        
        //   473: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   476: ifnull          488
        //   479: aload_0        
        //   480: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   483: iconst_0       
        //   484: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   487: pop            
        //   488: invokestatic    com/whatsapp/contact/f.d:()Z
        //   491: ifne            241
        //   494: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   497: bipush          8
        //   499: aaload         
        //   500: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   503: return         
        //   504: astore          47
        //   506: aload           47
        //   508: athrow         
        //   509: aload           20
        //   511: getstatic       com/whatsapp/contact/k.DELAYED:Lcom/whatsapp/contact/k;
        //   514: if_acmpne       581
        //   517: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   520: bipush          10
        //   522: aaload         
        //   523: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   526: aload_0        
        //   527: iconst_3       
        //   528: putfield        com/whatsapp/x1.e:I
        //   531: aload_0        
        //   532: iconst_1       
        //   533: putfield        com/whatsapp/x1.a:Z
        //   536: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   539: bipush          15
        //   541: aaload         
        //   542: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   545: aload_0        
        //   546: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   549: ifnull          561
        //   552: aload_0        
        //   553: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   556: iconst_0       
        //   557: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   560: pop            
        //   561: invokestatic    com/whatsapp/contact/f.d:()Z
        //   564: ifne            241
        //   567: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   570: iconst_3       
        //   571: aaload         
        //   572: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   575: return         
        //   576: astore          45
        //   578: aload           45
        //   580: athrow         
        //   581: aload           20
        //   583: getstatic       com/whatsapp/contact/k.USER_IS_EXPIRED:Lcom/whatsapp/contact/k;
        //   586: if_acmpeq       630
        //   589: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //   592: iconst_1       
        //   593: invokevirtual   com/whatsapp/m7.c:(Z)V
        //   596: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   599: bipush          12
        //   601: aaload         
        //   602: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   605: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   608: invokestatic    java/lang/System.currentTimeMillis:()J
        //   611: invokevirtual   com/whatsapp/App.a:(J)V
        //   614: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   617: bipush          22
        //   619: aaload         
        //   620: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   623: aload_0        
        //   624: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //   627: invokestatic    com/whatsapp/accountsync/PerformSyncManager.d:(Landroid/content/Context;)V
        //   630: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   633: iconst_4       
        //   634: aaload         
        //   635: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   638: iconst_1       
        //   639: invokestatic    com/whatsapp/App.e:(Z)V
        //   642: aload           20
        //   644: getstatic       com/whatsapp/contact/k.USER_IS_EXPIRED:Lcom/whatsapp/contact/k;
        //   647: if_acmpeq       666
        //   650: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   653: bipush          16
        //   655: aaload         
        //   656: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   659: aload_0        
        //   660: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //   663: invokestatic    com/whatsapp/accountsync/PerformSyncManager.b:(Landroid/content/Context;)V
        //   666: getstatic       com/whatsapp/contact/k.USER_IS_EXPIRED:Lcom/whatsapp/contact/k;
        //   669: astore          24
        //   671: aload           20
        //   673: aload           24
        //   675: if_acmpne       1040
        //   678: iconst_1       
        //   679: istore          25
        //   681: new             Lcom/whatsapp/qa;
        //   684: dup            
        //   685: aload_0        
        //   686: iload           25
        //   688: invokespecial   com/whatsapp/qa.<init>:(Lcom/whatsapp/x1;Z)V
        //   691: astore          26
        //   693: aload           26
        //   695: iconst_1       
        //   696: invokevirtual   java/lang/Thread.setPriority:(I)V
        //   699: aload           26
        //   701: invokevirtual   java/lang/Thread.start:()V
        //   704: aload           26
        //   706: invokevirtual   java/lang/Thread.join:()V
        //   709: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   712: bipush          7
        //   714: aaload         
        //   715: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   718: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   721: iconst_1       
        //   722: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;Z)V
        //   725: iload           25
        //   727: ifne            961
        //   730: invokestatic    com/whatsapp/App.ai:()V
        //   733: invokestatic    com/whatsapp/App.aS:()V
        //   736: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   739: invokevirtual   com/whatsapp/wc.i:()Ljava/util/ArrayList;
        //   742: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   745: astore          27
        //   747: iconst_0       
        //   748: istore          28
        //   750: aload           27
        //   752: invokeinterface java/util/Iterator.hasNext:()Z
        //   757: ifeq            812
        //   760: aload           27
        //   762: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   767: checkcast       Lcom/whatsapp/a_9;
        //   770: astore          40
        //   772: aload           40
        //   774: getfield        com/whatsapp/a_9.b:Z
        //   777: ifeq            1096
        //   780: aload           40
        //   782: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   785: iconst_0       
        //   786: iconst_2       
        //   787: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   790: iload           28
        //   792: iconst_1       
        //   793: iadd           
        //   794: istore          44
        //   796: iload           44
        //   798: sipush          250
        //   801: if_icmple       808
        //   804: iload_1        
        //   805: ifeq            812
        //   808: iload_1        
        //   809: ifeq            1089
        //   812: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   815: invokevirtual   com/whatsapp/wc.b:()Ljava/util/ArrayList;
        //   818: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   821: astore          29
        //   823: aload           29
        //   825: invokeinterface java/util/Iterator.hasNext:()Z
        //   830: ifeq            867
        //   833: aload           29
        //   835: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   840: checkcast       Lcom/whatsapp/a_9;
        //   843: astore          38
        //   845: aload           38
        //   847: invokevirtual   com/whatsapp/a_9.o:()Z
        //   850: ifne            863
        //   853: aload           38
        //   855: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   858: iconst_0       
        //   859: iconst_2       
        //   860: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   863: iload_1        
        //   864: ifeq            823
        //   867: aload_0        
        //   868: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //   871: invokestatic    com/whatsapp/RegisterName.j:(Lcom/whatsapp/RegisterName;)Lcom/whatsapp/a_9;
        //   874: getfield        com/whatsapp/a_9.v:I
        //   877: ifne            895
        //   880: aload_0        
        //   881: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //   884: invokestatic    com/whatsapp/RegisterName.j:(Lcom/whatsapp/RegisterName;)Lcom/whatsapp/a_9;
        //   887: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   890: iconst_0       
        //   891: iconst_1       
        //   892: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   895: iconst_0       
        //   896: istore          31
        //   898: getstatic       com/whatsapp/App.a7:Lcom/whatsapp/util/bw;
        //   901: invokevirtual   com/whatsapp/util/bw.b:()Z
        //   904: istore          33
        //   906: iload           33
        //   908: ifne            945
        //   911: iload           31
        //   913: sipush          20000
        //   916: if_icmpge       945
        //   919: iinc_w          31, 200
        //   925: ldc2_w          200
        //   928: invokestatic    java/lang/Thread.sleep:(J)V
        //   931: goto            898
        //   934: astore          37
        //   936: aload           37
        //   938: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //   941: iload_1        
        //   942: ifeq            898
        //   945: getstatic       com/whatsapp/App.aL:Lcom/whatsapp/m7;
        //   948: iload           14
        //   950: invokevirtual   com/whatsapp/m7.a:(I)V
        //   953: getstatic       com/whatsapp/App.av:Landroid/os/Handler;
        //   956: iconst_1       
        //   957: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //   960: pop            
        //   961: aload_0        
        //   962: iconst_1       
        //   963: putfield        com/whatsapp/x1.d:Z
        //   966: aload_0        
        //   967: getfield        com/whatsapp/x1.c:Lcom/whatsapp/RegisterName;
        //   970: iconst_3       
        //   971: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //   974: aload_0        
        //   975: iconst_1       
        //   976: putfield        com/whatsapp/x1.a:Z
        //   979: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //   982: bipush          6
        //   984: aaload         
        //   985: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   988: aload_0        
        //   989: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   992: ifnull          1004
        //   995: aload_0        
        //   996: getfield        com/whatsapp/x1.b:Landroid/os/Handler;
        //   999: iconst_0       
        //  1000: invokevirtual   android/os/Handler.sendEmptyMessage:(I)Z
        //  1003: pop            
        //  1004: invokestatic    com/whatsapp/contact/f.d:()Z
        //  1007: ifne            241
        //  1010: getstatic       com/whatsapp/x1.z:[Ljava/lang/String;
        //  1013: bipush          13
        //  1015: aaload         
        //  1016: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1019: return         
        //  1020: astore          35
        //  1022: aload           35
        //  1024: athrow         
        //  1025: astore          21
        //  1027: aload           21
        //  1029: athrow         
        //  1030: astore          22
        //  1032: aload           22
        //  1034: athrow         
        //  1035: astore          23
        //  1037: aload           23
        //  1039: athrow         
        //  1040: iconst_0       
        //  1041: istore          25
        //  1043: goto            681
        //  1046: astore          41
        //  1048: aload           41
        //  1050: athrow         
        //  1051: astore          42
        //  1053: aload           42
        //  1055: athrow         
        //  1056: astore          43
        //  1058: aload           43
        //  1060: athrow         
        //  1061: astore          39
        //  1063: aload           39
        //  1065: athrow         
        //  1066: astore          30
        //  1068: aload           30
        //  1070: athrow         
        //  1071: astore          32
        //  1073: aload           32
        //  1075: athrow         
        //  1076: astore          7
        //  1078: aload           7
        //  1080: athrow         
        //  1081: astore_3       
        //  1082: aload_3        
        //  1083: athrow         
        //  1084: astore          4
        //  1086: aload           4
        //  1088: athrow         
        //  1089: iload           44
        //  1091: istore          28
        //  1093: goto            750
        //  1096: iload           28
        //  1098: istore          44
        //  1100: goto            808
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      28     242    247    Ljava/lang/Exception;
        //  4      28     247    300    Ljava/lang/InterruptedException;
        //  4      28     388    1089   Any
        //  28     36     247    300    Ljava/lang/InterruptedException;
        //  28     36     316    383    Ljava/lang/Exception;
        //  28     36     388    1089   Any
        //  41     52     300    316    Ljava/lang/Exception;
        //  41     52     247    300    Ljava/lang/InterruptedException;
        //  41     52     388    1089   Any
        //  56     62     383    388    Ljava/lang/Exception;
        //  56     62     247    300    Ljava/lang/InterruptedException;
        //  56     62     388    1089   Any
        //  73     196    247    300    Ljava/lang/InterruptedException;
        //  73     196    316    383    Ljava/lang/Exception;
        //  73     196    388    1089   Any
        //  226    241    441    446    Ljava/lang/Exception;
        //  244    247    247    300    Ljava/lang/InterruptedException;
        //  244    247    316    383    Ljava/lang/Exception;
        //  244    247    388    1089   Any
        //  249    279    1076   1081   Ljava/lang/Exception;
        //  279    294    295    300    Ljava/lang/Exception;
        //  302    313    247    300    Ljava/lang/InterruptedException;
        //  302    313    316    383    Ljava/lang/Exception;
        //  302    313    388    1089   Any
        //  318    333    388    1089   Any
        //  362    377    378    383    Ljava/lang/Exception;
        //  385    388    247    300    Ljava/lang/InterruptedException;
        //  385    388    316    383    Ljava/lang/Exception;
        //  385    388    388    1089   Any
        //  389    418    1081   1084   Ljava/lang/Exception;
        //  418    433    1084   1089   Ljava/lang/Exception;
        //  446    459    247    300    Ljava/lang/InterruptedException;
        //  446    459    316    383    Ljava/lang/Exception;
        //  446    459    388    1089   Any
        //  488    503    504    509    Ljava/lang/Exception;
        //  509    531    247    300    Ljava/lang/InterruptedException;
        //  509    531    316    383    Ljava/lang/Exception;
        //  509    531    388    1089   Any
        //  561    575    576    581    Ljava/lang/Exception;
        //  581    630    1025   1030   Ljava/lang/Exception;
        //  581    630    247    300    Ljava/lang/InterruptedException;
        //  581    630    388    1089   Any
        //  630    666    1030   1035   Ljava/lang/Exception;
        //  630    666    247    300    Ljava/lang/InterruptedException;
        //  630    666    388    1089   Any
        //  666    671    1035   1040   Ljava/lang/Exception;
        //  666    671    247    300    Ljava/lang/InterruptedException;
        //  666    671    388    1089   Any
        //  681    725    247    300    Ljava/lang/InterruptedException;
        //  681    725    316    383    Ljava/lang/Exception;
        //  681    725    388    1089   Any
        //  730    747    247    300    Ljava/lang/InterruptedException;
        //  730    747    316    383    Ljava/lang/Exception;
        //  730    747    388    1089   Any
        //  750    772    247    300    Ljava/lang/InterruptedException;
        //  750    772    316    383    Ljava/lang/Exception;
        //  750    772    388    1089   Any
        //  772    790    1046   1061   Ljava/lang/Exception;
        //  772    790    247    300    Ljava/lang/InterruptedException;
        //  772    790    388    1089   Any
        //  812    823    247    300    Ljava/lang/InterruptedException;
        //  812    823    316    383    Ljava/lang/Exception;
        //  812    823    388    1089   Any
        //  823    845    247    300    Ljava/lang/InterruptedException;
        //  823    845    316    383    Ljava/lang/Exception;
        //  823    845    388    1089   Any
        //  845    863    1061   1066   Ljava/lang/Exception;
        //  845    863    247    300    Ljava/lang/InterruptedException;
        //  845    863    388    1089   Any
        //  867    895    1066   1071   Ljava/lang/Exception;
        //  867    895    247    300    Ljava/lang/InterruptedException;
        //  867    895    388    1089   Any
        //  898    906    1071   1076   Ljava/lang/Exception;
        //  898    906    247    300    Ljava/lang/InterruptedException;
        //  898    906    388    1089   Any
        //  925    931    934    945    Ljava/lang/InterruptedException;
        //  925    931    316    383    Ljava/lang/Exception;
        //  925    931    388    1089   Any
        //  936    941    247    300    Ljava/lang/InterruptedException;
        //  936    941    316    383    Ljava/lang/Exception;
        //  936    941    388    1089   Any
        //  945    961    247    300    Ljava/lang/InterruptedException;
        //  945    961    316    383    Ljava/lang/Exception;
        //  945    961    388    1089   Any
        //  961    974    247    300    Ljava/lang/InterruptedException;
        //  961    974    316    383    Ljava/lang/Exception;
        //  961    974    388    1089   Any
        //  1004   1019   1020   1025   Ljava/lang/Exception;
        //  1027   1030   247    300    Ljava/lang/InterruptedException;
        //  1027   1030   316    383    Ljava/lang/Exception;
        //  1027   1030   388    1089   Any
        //  1032   1035   247    300    Ljava/lang/InterruptedException;
        //  1032   1035   316    383    Ljava/lang/Exception;
        //  1032   1035   388    1089   Any
        //  1037   1040   247    300    Ljava/lang/InterruptedException;
        //  1037   1040   316    383    Ljava/lang/Exception;
        //  1037   1040   388    1089   Any
        //  1048   1051   1051   1061   Ljava/lang/Exception;
        //  1048   1051   247    300    Ljava/lang/InterruptedException;
        //  1048   1051   388    1089   Any
        //  1053   1056   1056   1061   Ljava/lang/Exception;
        //  1053   1056   247    300    Ljava/lang/InterruptedException;
        //  1053   1056   388    1089   Any
        //  1058   1061   247    300    Ljava/lang/InterruptedException;
        //  1058   1061   316    383    Ljava/lang/Exception;
        //  1058   1061   388    1089   Any
        //  1063   1066   247    300    Ljava/lang/InterruptedException;
        //  1063   1066   316    383    Ljava/lang/Exception;
        //  1063   1066   388    1089   Any
        //  1068   1071   247    300    Ljava/lang/InterruptedException;
        //  1068   1071   316    383    Ljava/lang/Exception;
        //  1068   1071   388    1089   Any
        //  1073   1076   247    300    Ljava/lang/InterruptedException;
        //  1073   1076   316    383    Ljava/lang/Exception;
        //  1073   1076   388    1089   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 508, Size: 508
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
