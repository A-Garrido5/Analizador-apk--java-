// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import com.whatsapp.fieldstats.b0;
import org.whispersystems.V;
import org.whispersystems.F;

final class vx implements F
{
    private static final String[] z;
    private final a8p a;
    private final V b;
    private final b0 c;
    final a9v d;
    private final bi e;
    private final a_9 f;
    
    static {
        final String[] z2 = new String[11];
        String s = "E\u0006\u0017\r&P\u0012X\u0013,G\u001b\u0011\u0017,@^\u0011\u000f*K\u0013\b\r,P\u001bX\u0012,J\u001a\u001d\u0013iO\u001b\u0001A-M\r\f\u0013 F\u000b\f\b&J^\u0015\u0004:W\u001f\u001f\u0004r\u0004\u0013\u001d\u0012:E\u0019\u001dO\"A\u0007E";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'I';
                        break;
                    }
                    case 0: {
                        c2 = '$';
                        break;
                    }
                    case 1: {
                        c2 = '~';
                        break;
                    }
                    case 2: {
                        c2 = 'x';
                        break;
                    }
                    case 3: {
                        c2 = 'a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "E\u0006\u0017\r&P\u0012X\u0005,V\u0017\u000e\u0004-\u0004\u000e\u0014\u0000 J\n\u001d\u0019=\u0004\u0016\u0019\u0012iM\u0010\u000e\u0000%M\u001aX\u0011(@\u001a\u0011\u000f.\u001f^\u0015\u0004:W\u001f\u001f\u0004gO\u001b\u0001\\";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0004\u000b\u0016\n'K\t\u00165(C\rE";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "E\u0006\u0017\r&P\u0012X\u0013,G\u001b\u0011\u0017,@^\u0014\u0004.E\u001d\u0001A:A\u0010\u001c\u0004;\u0004\u0015\u001d\u0018i@\u0017\u000b\u0015;M\u001c\r\u0015 K\u0010X\f,W\r\u0019\u0006,\u001f^\u0015\u0004:W\u001f\u001f\u0004gO\u001b\u0001\\";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "E\u0006\u0017\r&P\u0012X\u0013,G\u001b\u0011\u0017,@^\u000b\u0004'@\u001b\nA\"A\u0007X\u0005 W\n\n\b+Q\n\u0011\u000e'\u0004\u0013\u001d\u0012:E\u0019\u001dZiI\u001b\u000b\u0012(C\u001bV\n,]C";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "E\u0006\u0017\r&P\u0012X\u0005,V\u0017\u000e\u0004-\u0004\u0010\r\r%\u0004\u0011\nA,I\u000e\f\u0018iT\u0012\u0019\b'P\u001b\u0000\u0015iB\f\u0017\fiI\u001b\u000b\u0012(C\u001bCA$A\r\u000b\u0000.AP\u0013\u00040\u0019";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "C\f\u0017\u00149\u0004\u0017\u001cA&J^\u0015\u0004:W\u001f\u001f\u0004iE\u0010\u001cA.V\u0011\r\u0011iM\u001aX\b'\u0004\u001d\u0011\u0011!A\f\f\u00041P^\u001c\u000eiJ\u0011\fA$E\n\u001b\tr\u0004\u0013\u001d\u0012:E\u0019\u001dO\"A\u0007E";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "E\u0006\u0017\r&P\u0012X\u0005&A\r\u0016F=\u0004\u0015\u0016\u000e>\u0004\u0016\u0017\u0016iP\u0011X\t(J\u001a\u0014\u0004iP\u0016\u001dA?\u0016^\b\u0013&P\u0011\u001b\u000e%\u0004\u001c\r\u0007/A\fX\b=\u0004\f\u001d\u0002,M\b\u001d\u0005r\u0004\u0013\u001d\u0012:E\u0019\u001dO\"A\u0007E";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "E\u0006\u0017\r&P\u0012X\u0005,V\u0017\u000e\u0004-\u0004\u001b\u0016\u0015 V\u001bX\u0011%E\u0017\u0016\u0015,\\\nX\u0000:\u0004\u000e\u0019\u0005-M\u0010\u001fZiI\u001b\u000b\u0012(C\u001bV\n,]C";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "E\u0006\u0017\r&P\u0012X\u0005,V\u0017\u000e\u0004-\u0004\u000e\u0014\u0000 J\n\u001d\u0019=\u0004\u001a\u0017\u0004:\u0004\u0010\u0017\u0015iV\u001b\b\u0013,W\u001b\u0016\u0015iR\u001f\u0014\b-\u0004\u000e\n\u000e=K\u001d\u0017\riF\u000b\u001e\u0007,VEX\f,W\r\u0019\u0006,\n\u0015\u001d\u0018t";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "E\u0006\u0017\r&P\u0012X\u0013,G\u001b\u0011\u0017,@^\u0011\u000f?E\u0012\u0011\u0005iW\u001b\u0016\u0005,V^\u0013\u00040\u0004\u001a\u0011\u0012=V\u0017\u001a\u0014=M\u0011\u0016A$A\r\u000b\u0000.AEX\f,W\r\u0019\u0006,\n\u0015\u001d\u0018t";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public vx(final a9v d, final bi e, final a8p a, final a_9 f, final V b, final b0 c) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          17
        //     8: aload_1        
        //     9: arraylength    
        //    10: istore          5
        //    12: iload           5
        //    14: ifne            64
        //    17: new             Ljava/lang/StringBuilder;
        //    20: dup            
        //    21: invokespecial   java/lang/StringBuilder.<init>:()V
        //    24: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //    27: iconst_5       
        //    28: aaload         
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: aload_0        
        //    33: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //    36: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    42: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    45: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    48: aload_0        
        //    49: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //    52: invokestatic    com/whatsapp/App.f:(Lcom/whatsapp/protocol/bi;)V
        //    55: return         
        //    56: astore          4
        //    58: aload           4
        //    60: athrow         
        //    61: astore_3       
        //    62: aload_3        
        //    63: athrow         
        //    64: sipush          255
        //    67: aload_1        
        //    68: iconst_m1      
        //    69: aload_1        
        //    70: arraylength    
        //    71: iadd           
        //    72: baload         
        //    73: iand           
        //    74: istore          6
        //    76: iload           6
        //    78: ifne            153
        //    81: new             Ljava/lang/StringBuilder;
        //    84: dup            
        //    85: invokespecial   java/lang/StringBuilder.<init>:()V
        //    88: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //    91: iconst_1       
        //    92: aaload         
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: aload_0        
        //    97: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   100: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   106: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   109: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   112: aload_0        
        //   113: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   116: invokestatic    com/whatsapp/App.f:(Lcom/whatsapp/protocol/bi;)V
        //   119: aload_0        
        //   120: getfield        com/whatsapp/vx.c:Lcom/whatsapp/fieldstats/b0;
        //   123: dconst_0       
        //   124: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   127: putfield        com/whatsapp/fieldstats/b0.e:Ljava/lang/Double;
        //   130: aload_0        
        //   131: getfield        com/whatsapp/vx.c:Lcom/whatsapp/fieldstats/b0;
        //   134: getstatic       com/whatsapp/fieldstats/e.INVALID_PADDING:Lcom/whatsapp/fieldstats/e;
        //   137: invokevirtual   com/whatsapp/fieldstats/e.getCode:()I
        //   140: i2d            
        //   141: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   144: putfield        com/whatsapp/fieldstats/b0.c:Ljava/lang/Double;
        //   147: return         
        //   148: astore          38
        //   150: aload           38
        //   152: athrow         
        //   153: iload           6
        //   155: aload_1        
        //   156: arraylength    
        //   157: if_icmplt       233
        //   160: new             Ljava/lang/StringBuilder;
        //   163: dup            
        //   164: invokespecial   java/lang/StringBuilder.<init>:()V
        //   167: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   170: bipush          8
        //   172: aaload         
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: aload_0        
        //   177: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   180: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   186: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   189: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   192: aload_0        
        //   193: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   196: invokestatic    com/whatsapp/App.f:(Lcom/whatsapp/protocol/bi;)V
        //   199: aload_0        
        //   200: getfield        com/whatsapp/vx.c:Lcom/whatsapp/fieldstats/b0;
        //   203: dconst_0       
        //   204: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   207: putfield        com/whatsapp/fieldstats/b0.e:Ljava/lang/Double;
        //   210: aload_0        
        //   211: getfield        com/whatsapp/vx.c:Lcom/whatsapp/fieldstats/b0;
        //   214: getstatic       com/whatsapp/fieldstats/e.INVALID_PADDING:Lcom/whatsapp/fieldstats/e;
        //   217: invokevirtual   com/whatsapp/fieldstats/e.getCode:()I
        //   220: i2d            
        //   221: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   224: putfield        com/whatsapp/fieldstats/b0.c:Ljava/lang/Double;
        //   227: return         
        //   228: astore          7
        //   230: aload           7
        //   232: athrow         
        //   233: aload_1        
        //   234: arraylength    
        //   235: iload           6
        //   237: isub           
        //   238: newarray        B
        //   240: astore          8
        //   242: aload_1        
        //   243: iconst_0       
        //   244: aload           8
        //   246: iconst_0       
        //   247: aload           8
        //   249: arraylength    
        //   250: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   253: aload           8
        //   255: invokestatic    com/whatsapp/proto/E2E$Message.parseFrom:([B)Lcom/whatsapp/proto/E2E$Message;
        //   258: astore          10
        //   260: aload           10
        //   262: invokevirtual   com/whatsapp/proto/E2E$Message.hasConversation:()Z
        //   265: ifeq            369
        //   268: aload_0        
        //   269: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   272: aload           10
        //   274: invokevirtual   com/whatsapp/proto/E2E$Message.getConversation:()Ljava/lang/String;
        //   277: invokevirtual   com/whatsapp/protocol/bi.b:(Ljava/lang/String;)V
        //   280: invokestatic    com/whatsapp/Conversation.p:()Lcom/whatsapp/v1;
        //   283: astore          30
        //   285: aload           30
        //   287: invokevirtual   com/whatsapp/v1.a:()Z
        //   290: ifeq            358
        //   293: aload_0        
        //   294: getfield        com/whatsapp/vx.a:Lcom/whatsapp/a8p;
        //   297: invokevirtual   com/whatsapp/a8p.a:()Z
        //   300: istore          35
        //   302: iload           35
        //   304: ifne            358
        //   307: aload           30
        //   309: invokevirtual   com/whatsapp/v1.b:()Lcom/whatsapp/Conversation;
        //   312: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   315: aload_0        
        //   316: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   319: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   322: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   325: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   328: istore          36
        //   330: iload           36
        //   332: ifeq            358
        //   335: aload_0        
        //   336: getfield        com/whatsapp/vx.f:Lcom/whatsapp/a_9;
        //   339: getfield        com/whatsapp/a_9.l:I
        //   342: istore          37
        //   344: iload           37
        //   346: ifne            358
        //   349: aload_0        
        //   350: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   353: bipush          13
        //   355: putfield        com/whatsapp/protocol/bi.c:I
        //   358: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   361: aload_0        
        //   362: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   365: iconst_m1      
        //   366: invokevirtual   com/whatsapp/vy.e:(Lcom/whatsapp/protocol/bi;I)V
        //   369: aload           10
        //   371: invokevirtual   com/whatsapp/proto/E2E$Message.hasSenderKeyDistributionMessage:()Z
        //   374: ifeq            623
        //   377: new             Ljava/lang/StringBuilder;
        //   380: dup            
        //   381: invokespecial   java/lang/StringBuilder.<init>:()V
        //   384: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   387: iconst_4       
        //   388: aaload         
        //   389: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   392: aload_0        
        //   393: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   396: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   399: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   402: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   405: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   408: aload           10
        //   410: invokevirtual   com/whatsapp/proto/E2E$Message.getSenderKeyDistributionMessage:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //   413: astore          17
        //   415: aload           17
        //   417: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.hasGroupId:()Z
        //   420: ifeq            435
        //   423: aload           17
        //   425: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.hasAxolotlSenderKeyDistributionMessage:()Z
        //   428: istore          29
        //   430: iload           29
        //   432: ifne            470
        //   435: new             Ljava/lang/StringBuilder;
        //   438: dup            
        //   439: invokespecial   java/lang/StringBuilder.<init>:()V
        //   442: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   445: iconst_0       
        //   446: aaload         
        //   447: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   450: aload_0        
        //   451: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   454: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   460: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   463: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   466: iload_2        
        //   467: ifeq            616
        //   470: aload_0        
        //   471: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   474: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   477: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   480: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //   483: istore          23
        //   485: iload           23
        //   487: ifeq            551
        //   490: aload_0        
        //   491: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   494: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   497: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   500: aload           17
        //   502: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getGroupId:()Ljava/lang/String;
        //   505: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   508: istore          28
        //   510: iload           28
        //   512: ifne            551
        //   515: new             Ljava/lang/StringBuilder;
        //   518: dup            
        //   519: invokespecial   java/lang/StringBuilder.<init>:()V
        //   522: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   525: bipush          6
        //   527: aaload         
        //   528: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   531: aload_0        
        //   532: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   535: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   538: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   541: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   544: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   547: iload_2        
        //   548: ifeq            616
        //   551: new             Lorg/whispersystems/p;
        //   554: dup            
        //   555: aload_0        
        //   556: getfield        com/whatsapp/vx.d:Lcom/whatsapp/a9v;
        //   559: getfield        com/whatsapp/a9v.a:Lcom/whatsapp/ie;
        //   562: invokestatic    com/whatsapp/ie.a:(Lcom/whatsapp/ie;)Lcom/whatsapp/App;
        //   565: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //   568: invokevirtual   com/whatsapp/ha.h:()Lcom/whatsapp/ni;
        //   571: invokespecial   org/whispersystems/p.<init>:(Lorg/whispersystems/d;)V
        //   574: astore          24
        //   576: new             Lorg/whispersystems/aq;
        //   579: dup            
        //   580: aload           17
        //   582: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getGroupId:()Ljava/lang/String;
        //   585: aload_0        
        //   586: getfield        com/whatsapp/vx.b:Lorg/whispersystems/V;
        //   589: invokespecial   org/whispersystems/aq.<init>:(Ljava/lang/String;Lorg/whispersystems/V;)V
        //   592: astore          25
        //   594: aload           24
        //   596: aload           25
        //   598: new             Lorg/whispersystems/aV;
        //   601: dup            
        //   602: aload           17
        //   604: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getAxolotlSenderKeyDistributionMessage:()Lcom/google/hv;
        //   607: invokevirtual   com/google/hv.a:()[B
        //   610: invokespecial   org/whispersystems/aV.<init>:([B)V
        //   613: invokevirtual   org/whispersystems/p.a:(Lorg/whispersystems/aq;Lorg/whispersystems/aV;)V
        //   616: aload_0        
        //   617: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   620: invokestatic    com/whatsapp/App.f:(Lcom/whatsapp/protocol/bi;)V
        //   623: aload           10
        //   625: invokevirtual   com/whatsapp/proto/E2E$Message.getUnknownFields:()Lcom/google/ce;
        //   628: invokevirtual   com/google/ce.e:()Ljava/util/Map;
        //   631: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   636: astore          11
        //   638: aload           11
        //   640: invokeinterface java/util/Set.isEmpty:()Z
        //   645: ifne            970
        //   648: aload           11
        //   650: invokeinterface java/util/Set.size:()I
        //   655: newarray        I
        //   657: astore          12
        //   659: aload           11
        //   661: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   666: astore          13
        //   668: iconst_0       
        //   669: istore          14
        //   671: aload           13
        //   673: invokeinterface java/util/Iterator.hasNext:()Z
        //   678: ifeq            713
        //   681: aload           13
        //   683: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   688: checkcast       Ljava/lang/Integer;
        //   691: astore          15
        //   693: iload           14
        //   695: iconst_1       
        //   696: iadd           
        //   697: istore          16
        //   699: aload           12
        //   701: iload           14
        //   703: aload           15
        //   705: invokevirtual   java/lang/Integer.intValue:()I
        //   708: iastore        
        //   709: iload_2        
        //   710: ifeq            963
        //   713: new             Ljava/lang/StringBuilder;
        //   716: dup            
        //   717: invokespecial   java/lang/StringBuilder.<init>:()V
        //   720: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   723: bipush          7
        //   725: aaload         
        //   726: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   729: aload_0        
        //   730: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   733: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   736: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   739: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   742: iconst_2       
        //   743: aaload         
        //   744: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   747: aload           12
        //   749: invokestatic    java/util/Arrays.toString:([I)Ljava/lang/String;
        //   752: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   755: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   758: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   761: aload_0        
        //   762: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   765: aload           12
        //   767: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/protocol/bi;[I)V
        //   770: return         
        //   771: astore          9
        //   773: new             Ljava/lang/StringBuilder;
        //   776: dup            
        //   777: invokespecial   java/lang/StringBuilder.<init>:()V
        //   780: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   783: bipush          9
        //   785: aaload         
        //   786: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   789: aload_0        
        //   790: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   793: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   796: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   799: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   802: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   805: aload_0        
        //   806: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   809: invokestatic    com/whatsapp/App.f:(Lcom/whatsapp/protocol/bi;)V
        //   812: aload_0        
        //   813: getfield        com/whatsapp/vx.c:Lcom/whatsapp/fieldstats/b0;
        //   816: dconst_0       
        //   817: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   820: putfield        com/whatsapp/fieldstats/b0.e:Ljava/lang/Double;
        //   823: aload_0        
        //   824: getfield        com/whatsapp/vx.c:Lcom/whatsapp/fieldstats/b0;
        //   827: getstatic       com/whatsapp/fieldstats/e.INVALID_PROTOCOL_BUFFER:Lcom/whatsapp/fieldstats/e;
        //   830: invokevirtual   com/whatsapp/fieldstats/e.getCode:()I
        //   833: i2d            
        //   834: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   837: putfield        com/whatsapp/fieldstats/b0.c:Ljava/lang/Double;
        //   840: return         
        //   841: astore          31
        //   843: aload           31
        //   845: athrow         
        //   846: astore          32
        //   848: aload           32
        //   850: athrow         
        //   851: astore          33
        //   853: aload           33
        //   855: athrow         
        //   856: astore          34
        //   858: aload           34
        //   860: athrow         
        //   861: astore          18
        //   863: aload           18
        //   865: athrow         
        //   866: astore          19
        //   868: aload           19
        //   870: athrow         
        //   871: astore          20
        //   873: aload           20
        //   875: athrow         
        //   876: astore          21
        //   878: aload           21
        //   880: athrow         
        //   881: astore          22
        //   883: aload           22
        //   885: athrow         
        //   886: astore          27
        //   888: new             Ljava/lang/StringBuilder;
        //   891: dup            
        //   892: invokespecial   java/lang/StringBuilder.<init>:()V
        //   895: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   898: bipush          10
        //   900: aaload         
        //   901: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   904: aload_0        
        //   905: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   908: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   911: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   914: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   917: aload           27
        //   919: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   922: goto            616
        //   925: astore          26
        //   927: new             Ljava/lang/StringBuilder;
        //   930: dup            
        //   931: invokespecial   java/lang/StringBuilder.<init>:()V
        //   934: getstatic       com/whatsapp/vx.z:[Ljava/lang/String;
        //   937: iconst_3       
        //   938: aaload         
        //   939: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   942: aload_0        
        //   943: getfield        com/whatsapp/vx.e:Lcom/whatsapp/protocol/bi;
        //   946: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   949: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   952: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   955: aload           26
        //   957: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   960: goto            616
        //   963: iload           16
        //   965: istore          14
        //   967: goto            671
        //   970: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  8      12     56     61     Lcom/google/bg;
        //  17     55     61     64     Lcom/google/bg;
        //  58     61     61     64     Lcom/google/bg;
        //  81     147    148    153    Lcom/google/bg;
        //  153    227    228    233    Lcom/google/bg;
        //  253    260    771    841    Lcom/google/bg;
        //  285    302    841    846    Lcom/google/bg;
        //  307    330    846    851    Lcom/google/bg;
        //  335    344    851    856    Lcom/google/bg;
        //  349    358    856    861    Lcom/google/bg;
        //  415    430    861    866    Lcom/google/bg;
        //  435    466    866    871    Lcom/google/bg;
        //  470    485    871    876    Lcom/google/bg;
        //  490    510    876    881    Lcom/google/bg;
        //  515    547    881    886    Lcom/google/bg;
        //  594    616    886    925    Lorg/whispersystems/I;
        //  594    616    925    963    Lorg/whispersystems/bW;
        //  843    846    846    851    Lcom/google/bg;
        //  848    851    851    856    Lcom/google/bg;
        //  853    856    856    861    Lcom/google/bg;
        //  863    866    866    871    Lcom/google/bg;
        //  868    871    871    876    Lcom/google/bg;
        //  873    876    876    881    Lcom/google/bg;
        //  878    881    881    886    Lcom/google/bg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 430, Size: 430
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
