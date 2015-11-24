// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.Collections;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

public class a4 implements Future, Runnable
{
    private static final String[] b;
    private static final String[] e;
    private static final String[] z;
    private final CountDownLatch a;
    private final AtomicReference c;
    private final Context d;
    
    static {
        final String[] array = new String[3];
        String s = "}\u001fh$d\u007f\u0014,=d~\u0006,\"la\u0001d;";
        int n = -1;
        String[] array2 = array;
        String[] e2 = array;
        int n2 = 0;
        String intern = null;
    Label_1701:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0005';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = 'm';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = 'I';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "~\bb&ki\fs0(y\fr\"(f\u0004m%`\u007f";
                    n2 = 1;
                    array2 = e2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "h\u0015b,uy\u0004n'%i\u0018s kjMu(vf@j ia\bsikl\u0000diib\u0002j<u7M";
                    n2 = 2;
                    array2 = e2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    z = e2;
                    array2 = (e2 = new String[46]);
                    s = "o\u0004{gvy\fb!lo\fo(+Y\fr\"Nd\u0001m,w";
                    n = 2;
                    n2 = 0;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    s = "n\u0003/*j`C`'a\u007f\u0002h-+b\u001de(+y\fr\"hl\u0003";
                    n2 = 1;
                    array2 = e2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    s = "n\u0002lgd\u007f\u001fn'+y\fr\"Hl\u0003`.`\u007f";
                    n = 4;
                    n2 = 2;
                    array2 = e2;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    s = "n\u0002lgd\u007f\u001fn'+y\fr\"Hl\u0003`.`\u007f+s,`";
                    n2 = 3;
                    array2 = e2;
                    n = 5;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    n2 = 4;
                    s = "n\u0002lgg\u007f\u0004f!q#\u0019`:nn\u0001d(kh\u001f/(fy\u0004w qt";
                    n = 6;
                    array2 = e2;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    s = "n\u0002lgfb\u0002mgql\u001ej\"la\u0001d;";
                    n = 7;
                    n2 = 5;
                    array2 = e2;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "n\u0002lg`a\u0003v(whC@*qd\u001bd\bu}\u001e@-v";
                    n = 8;
                    array2 = e2;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "n\u0002lg`~\u0019s&kj\u001e/(ki\u001fn a#\u0019`:n`\fo(bh\u001f";
                    n = 9;
                    array2 = e2;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "n\u0002lgbl\u0018/.j#\u0001`<kn\u0005d;`uCf&rd\tf,q#\u0019`:n`\fo(bh\u001fd1";
                    n = 10;
                    array2 = e2;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "n\u0002lglg\u0004o:ml\u0003/\"gl\u0019u,wt\tn*qb\u001f";
                    n = 11;
                    array2 = e2;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "n\u0002lglg\u0004o:ml\u0003/\"gl\u0019u,wt\tn*qb\u001f^,k";
                    n = 12;
                    array2 = e2;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "n\u0002lglb\u000fh=+`\u0002c ih\u000e`;`";
                    n = 13;
                    array2 = e2;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "n\u0002lgol\u0000d:+^\u0000`;qY\fr\"Hl\u0003`.`\u007f";
                    n = 14;
                    array2 = e2;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "n\u0002lgol\u0000d:+^\u0000`;qY\fr\"Hl\u0003`.`\u007f!h=`";
                    n = 15;
                    array2 = e2;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "n\u0002lgol\u0000d:+^\u0000`;qY\fr\"Hl\u0003`.`\u007f=s&";
                    n = 16;
                    array2 = e2;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "n\u0002lgil\u0019d-wb\u0004egox\u0004b,ah\u000bd'ah\u001f";
                    n = 17;
                    array2 = e2;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "n\u0002lgil\u0019d-wb\u0004egox\u0004b,ah\u000bd'ah\u001f/+`y\f";
                    n = 18;
                    array2 = e2;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "n\u0002lgil\u0019d-wb\u0004egox\u0004b,ah\u000bd'ah\u001f/9ix\u001e";
                    n = 19;
                    array2 = e2;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = "n\u0002lgil\u0019d-wb\u0004egpa\u0019h$dy\bk<ln\b";
                    n = 20;
                    array2 = e2;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    n2 = 19;
                    s = "n\u0002lgil\u0019d-wb\u0004egpa\u0019h$dy\bk<ln\b/;jb\u0019";
                    n = 21;
                    array2 = e2;
                    continue;
                }
                case 21: {
                    array2[n2] = intern;
                    n2 = 20;
                    s = "n\u0002lgib\u0002j&pyC{(u}\bs";
                    n = 22;
                    array2 = e2;
                    continue;
                }
                case 22: {
                    array2[n2] = intern;
                    n2 = 21;
                    s = "n\u0002lghb\u000fngql\u001ejgnd\u0001m,w";
                    n = 23;
                    array2 = e2;
                    continue;
                }
                case 23: {
                    array2[n2] = intern;
                    n2 = 22;
                    s = "n\u0002lgkh\u0019p k#\fn=nd\u0001m,w";
                    n = 24;
                    array2 = e2;
                    continue;
                }
                case 24: {
                    array2[n2] = intern;
                    n2 = 23;
                    s = "n\u0002lgkh\u0019p k#\u0000n+la\bf<d\u007f\t";
                    n = 25;
                    array2 = e2;
                    continue;
                }
                case 25: {
                    array2[n2] = intern;
                    n2 = 24;
                    s = "n\u0002lgwh\u000ei iiC`-sl\u0003b,ay\fr\"nd\u0001m,w";
                    n = 26;
                    array2 = e2;
                    continue;
                }
                case 26: {
                    array2[n2] = intern;
                    n2 = 25;
                    s = "n\u0002lgwh\u000ei iiC`-sl\u0003b,ay\fr\"nd\u0001m,wk\u001fn0j";
                    n = 27;
                    array2 = e2;
                    continue;
                }
                case 27: {
                    array2[n2] = intern;
                    n2 = 26;
                    s = "n\u0002lgwh\u000ei iiC`-sl\u0003b,ay\fr\"nd\u0001m,w}\u001fn";
                    n = 28;
                    array2 = e2;
                    continue;
                }
                case 28: {
                    array2[n2] = intern;
                    n2 = 27;
                    s = "n\u0002lgwh\u000ei iiCb%`l\u0003d;";
                    n = 29;
                    array2 = e2;
                    continue;
                }
                case 29: {
                    array2[n2] = intern;
                    n2 = 28;
                    s = "n\u0002lgwe\u0014u!h#\u0005d1l~\b/=d~\u0006";
                    n = 30;
                    array2 = e2;
                    continue;
                }
                case 30: {
                    array2[n2] = intern;
                    n2 = 29;
                    s = "n\u0002lgvl\u0003egql\u001ej$dc\ff,w";
                    n = 31;
                    array2 = e2;
                    continue;
                }
                case 31: {
                    array2[n2] = intern;
                    n2 = 30;
                    s = "n\u0002lgvy\f^+`h\u001frgdx\u0019n\u0016ql\u001ej";
                    n = 32;
                    array2 = e2;
                    continue;
                }
                case 32: {
                    array2[n2] = intern;
                    n2 = 31;
                    s = "n\u0002lgvt\u0000`'qh\u000e/$jc\u0004u&w";
                    n = 33;
                    array2 = e2;
                    continue;
                }
                case 33: {
                    array2[n2] = intern;
                    n2 = 32;
                    s = "n\u0002lgql\u001ejgnd\u0001m,w";
                    n = 34;
                    array2 = e2;
                    continue;
                }
                case 34: {
                    array2[n2] = intern;
                    n2 = 33;
                    s = "n\u0002lgqc\u0004/\u001dd~&h%ih\u001f";
                    n = 35;
                    array2 = e2;
                    continue;
                }
                case 35: {
                    array2[n2] = intern;
                    n2 = 34;
                    s = "n\u0002lg\u007fi\u001an;n~C`'a\u007f\u0002h-+y\u0002n%gb\u0015";
                    n = 36;
                    array2 = e2;
                    continue;
                }
                case 36: {
                    array2[n2] = intern;
                    n2 = 35;
                    s = "n\u0002lg\u007fb\u0000t=+z\fu*mi\u0002f";
                    n = 37;
                    array2 = e2;
                    continue;
                }
                case 37: {
                    array2[n2] = intern;
                    n2 = 36;
                    s = "n\u0002lg\u007fb\u0000t=+z\fu*mi\u0002f%ly\b";
                    n = 38;
                    array2 = e2;
                    continue;
                }
                case 38: {
                    array2[n2] = intern;
                    n2 = 37;
                    s = "j\u001dbght\u001ad++e\u0004o,q#\u0003d=+Y\fr\"Hl\u0003`.`\u007f";
                    n = 39;
                    array2 = e2;
                    continue;
                }
                case 39: {
                    array2[n2] = intern;
                    n2 = 38;
                    s = "d\u0000n+id\u000bdghh\u0000n;|o\u0002n:qh\u001f/%ly\b";
                    n = 40;
                    array2 = e2;
                    continue;
                }
                case 40: {
                    array2[n2] = intern;
                    n2 = 39;
                    s = "g\u001d/*j#\fq%lbCr h}\u0001d=d~\u0006j ia\bs";
                    n = 41;
                    array2 = e2;
                    continue;
                }
                case 41: {
                    array2[n2] = intern;
                    n2 = 40;
                    s = "g\u001d/*j#\fq%lbCr h}\u0001d=d~\u0006j ia\bs/wh\b";
                    n = 42;
                    array2 = e2;
                    continue;
                }
                case 42: {
                    array2[n2] = intern;
                    n2 = 41;
                    s = "g\u001d/:hl\u001di&+|\u0018h*ny\fr\"nd\u0001m,w";
                    n = 43;
                    array2 = e2;
                    continue;
                }
                case 43: {
                    array2[n2] = intern;
                    n2 = 42;
                    s = "`\u0002c +d\u0003g&id\u000bdgql\u001ej$dc\ff,w";
                    n = 44;
                    array2 = e2;
                    continue;
                }
                case 44: {
                    array2[n2] = intern;
                    n2 = 43;
                    s = "`\u0002c +d\u0003g&id\u000bdgql\u001ej$dc\ff,w}\u001fn";
                    n = 45;
                    array2 = e2;
                    continue;
                }
                case 45: {
                    array2[n2] = intern;
                    n2 = 44;
                    s = "c\bugih\u001dd'b#\u000f`=qh\u001fx-jn\u0019n;";
                    n = 46;
                    array2 = e2;
                    continue;
                }
                case 46: {
                    array2[n2] = intern;
                    n2 = 45;
                    s = "c\bugih\u001dd'b#\u001et9`\u007f\u000fn1v~";
                    n = 47;
                    array2 = e2;
                    continue;
                }
                case 47: {
                    array2[n2] = intern;
                    b = e2;
                    final String[] array3 = new String[11];
                    s = "n\u0002lgdj\u0004m,vb\u000bu;`~\u0002t;fh";
                    n = 48;
                    array2 = array3;
                    e2 = array3;
                    n2 = 0;
                    continue;
                }
                case 48: {
                    array2[n2] = intern;
                    s = "n\u0002lgdc\u0019h?l\u007f\u0018r";
                    n = 49;
                    n2 = 1;
                    array2 = e2;
                    continue;
                }
                case 49: {
                    array2[n2] = intern;
                    s = "n\u0002lgfa\b`'hl\u001eu,w#\u0000f<d\u007f\t";
                    n = 50;
                    n2 = 2;
                    array2 = e2;
                    continue;
                }
                case 50: {
                    array2[n2] = intern;
                    s = "n\u0002lg`a\bb=wd\u000er!`h\u001d/(vd";
                    n = 51;
                    n2 = 3;
                    array2 = e2;
                    continue;
                }
                case 51: {
                    array2[n2] = intern;
                    n2 = 4;
                    s = "n\u0002lg`~\u0019s&kj\u001e/(ki\u001fn a#\u001dn9";
                    n = 52;
                    array2 = e2;
                    continue;
                }
                case 52: {
                    array2[n2] = intern;
                    s = "n\u0002lg`~\u0019s&kj\u001e/(ki\u001fn a#\u001dn9+n\u0018q*df\b";
                    n = 53;
                    n2 = 5;
                    array2 = e2;
                    continue;
                }
                case 53: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "n\u0002lghh\u0019`.j#\fr=wb";
                    n = 54;
                    array2 = e2;
                    continue;
                }
                case 54: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "n\u0002lgv`\fs=re\u0002/\u001ahl\u001fu\u000fla\bL(kl\nd;";
                    n = 55;
                    array2 = e2;
                    continue;
                }
                case 55: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "n\u0002lgv`\fs=re\u0002/\u001ahl\u001fu\u000fla\bL(kl\nd;U\u007f\u0002";
                    n = 56;
                    array2 = e2;
                    continue;
                }
                case 56: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "c\by=d}\u001d/:|~\u0019d$ul\u0003d%";
                    n = 57;
                    array2 = e2;
                    continue;
                }
                case 57: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "c\by=d}\u001d/:|~\u0019d$ul\u0003d%+\u007f\\";
                    n = 58;
                    array2 = e2;
                    continue;
                }
                case 58: {
                    break Label_1701;
                }
            }
        }
        array2[n2] = intern;
        e = e2;
    }
    
    public a4(final Context d) {
        this.a = new CountDownLatch(1);
        this.c = new AtomicReference((V)new bs(null, null));
        this.d = d;
    }
    
    private static Set a(final Context p0, final String[] p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //     8: astore          4
        //    10: aload           4
        //    12: ifnonnull       17
        //    15: aconst_null    
        //    16: areturn        
        //    17: new             Ljava/util/HashSet;
        //    20: dup            
        //    21: invokespecial   java/util/HashSet.<init>:()V
        //    24: astore          5
        //    26: aload_1        
        //    27: arraylength    
        //    28: istore          6
        //    30: iconst_0       
        //    31: istore          7
        //    33: iload           7
        //    35: iload           6
        //    37: if_icmpge       125
        //    40: aload_1        
        //    41: iload           7
        //    43: aaload         
        //    44: astore          10
        //    46: aload           4
        //    48: aload           10
        //    50: iconst_0       
        //    51: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    54: astore          14
        //    56: aload           14
        //    58: aload           4
        //    60: invokevirtual   android/content/pm/ApplicationInfo.loadLabel:(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
        //    63: astore          18
        //    65: aload           18
        //    67: astore          16
        //    69: new             Ljava/lang/StringBuilder;
        //    72: dup            
        //    73: invokespecial   java/lang/StringBuilder.<init>:()V
        //    76: aload_2        
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: bipush          32
        //    82: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    85: aload           10
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    93: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    96: aload           5
        //    98: new             Lcom/whatsapp/util/bp;
        //   101: dup            
        //   102: aload           16
        //   104: aload           10
        //   106: invokespecial   com/whatsapp/util/bp.<init>:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
        //   109: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   114: pop            
        //   115: iload           7
        //   117: iconst_1       
        //   118: iadd           
        //   119: istore          12
        //   121: iload_3        
        //   122: ifeq            222
        //   125: aload           5
        //   127: invokeinterface java/util/Set.isEmpty:()Z
        //   132: istore          9
        //   134: iload           9
        //   136: ifne            15
        //   139: aload           5
        //   141: areturn        
        //   142: astore          15
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: getstatic       com/whatsapp/util/a4.z:[Ljava/lang/String;
        //   154: iconst_2       
        //   155: aaload         
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: aload           15
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   170: aload           10
        //   172: astore          16
        //   174: goto            69
        //   177: astore          13
        //   179: new             Ljava/lang/StringBuilder;
        //   182: dup            
        //   183: invokespecial   java/lang/StringBuilder.<init>:()V
        //   186: aload_2        
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: bipush          32
        //   192: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   195: aload           13
        //   197: invokevirtual   java/lang/RuntimeException.getMessage:()Ljava/lang/String;
        //   200: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   203: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   206: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   209: goto            115
        //   212: astore          8
        //   214: aload           8
        //   216: athrow         
        //   217: astore          11
        //   219: goto            115
        //   222: iload           12
        //   224: istore          7
        //   226: goto            33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  46     56     217    222    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  46     56     177    212    Ljava/lang/RuntimeException;
        //  56     65     142    177    Ljava/lang/Exception;
        //  56     65     217    222    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  56     65     177    212    Ljava/lang/RuntimeException;
        //  69     115    217    222    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  69     115    177    212    Ljava/lang/RuntimeException;
        //  125    134    212    217    Ljava/lang/Exception;
        //  144    170    217    222    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  144    170    177    212    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0125:
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
    
    public bs a() {
        this.a.await();
        return this.c.get();
    }
    
    public bs a(final long n, final TimeUnit timeUnit) {
        try {
            if (this.a.await(n, timeUnit)) {
                return this.c.get();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        throw new TimeoutException();
    }
    
    @Override
    public boolean cancel(final boolean b) {
        return false;
    }
    
    @Override
    public Object get() {
        return this.a();
    }
    
    @Override
    public Object get(final long n, final TimeUnit timeUnit) {
        return this.a(n, timeUnit);
    }
    
    @Override
    public boolean isCancelled() {
        return false;
    }
    
    @Override
    public boolean isDone() {
        try {
            if (this.a.getCount() == 0L) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public void run() {
        while (true) {
            final Set a = a(this.d, a4.b, a4.z[0]);
            final Set a2 = a(this.d, a4.e, a4.z[1]);
            while (true) {
                try {
                    final AtomicReference c = this.c;
                    if (a != null) {
                        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)a);
                        Set<Object> unmodifiableSet2 = null;
                        if (a2 != null) {
                            unmodifiableSet2 = Collections.unmodifiableSet((Set<?>)a2);
                        }
                        c.set(new bs(unmodifiableSet, unmodifiableSet2));
                        this.a.countDown();
                        return;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                final Set<Object> unmodifiableSet = null;
                continue;
            }
        }
    }
}
