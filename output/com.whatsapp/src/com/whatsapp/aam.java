// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.o;
import com.whatsapp.fieldstats.af;
import java.io.File;
import java.lang.reflect.Field;
import com.whatsapp.fieldstats.bp;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.aq;
import com.whatsapp.fieldstats.bt;
import com.whatsapp.fieldstats.b5;
import com.whatsapp.fieldstats.bj;
import com.whatsapp.fieldstats.bh;
import com.whatsapp.fieldstats.bn;
import com.whatsapp.fieldstats.p;
import com.whatsapp.fieldstats.b9;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.be;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.at;
import com.whatsapp.fieldstats.aa;
import com.whatsapp.fieldstats.b_;
import com.whatsapp.util.Log;
import com.whatsapp.fieldstats.w;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.fieldstats.bw;
import com.whatsapp.contact.k;
import android.net.NetworkInfo;
import com.whatsapp.fieldstats.an;
import android.telephony.TelephonyManager;
import android.net.ConnectivityManager;
import com.whatsapp.fieldstats.i;
import com.whatsapp.protocol.bi;
import com.whatsapp.fieldstats.Events$Call;

public class aam
{
    public static Events$Call a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "kJ\u001e1\u0018";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '}';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = 'q';
                        break;
                    }
                    case 3: {
                        c2 = '_';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "xM\u001f1\u0018xV\u0018)\u0014o[";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "mM\u0018/RkJ\u001e1\u0018uW\u001c=\u0018i\r\u001b6\u00194L\u00043\u0011";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ";K\u001f\u007f\u001brG\u001d;\u000eoC\u0005,]~T\u00141\t7\u0002\u001e1\u0011b\u000250\byN\u0014\u007f\u0012i\u0002\"+\u000frL\u0016\u007f\u0010~O\u0013:\u000fh\u0002\u0010-\u0018;Q\u0004/\rtP\u0005:\u0019";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "nL\u0014'\r~A\u0005:\u0019;O\u00142\u001f~PQ";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "vG\u00156\u001c}M\u001d;\u0018iQ\u0018%\u0018;N\u0018,\t~F76\u0011~QQ6\u000e;L\u00043\u0011;D\u001e-]}M\u001d;\u0018i\u0002";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "}K\u00143\u0019hV\u0010+\u0015~N\u0001:\u000fh\r\u0004/\u0019zV\u00142\u0018\u007fK\u00109\u0012wF\u0014-\u001brG\u001d;\u000eoC\u0005,R~P\u00030\u000f4Q\u0005>\u001epM\u0007:\u000f}N\u001e(";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "}K\u00143\u0019hV\u0010+\u0015~N\u0001:\u000fh\r\u0004/\u0019zV\u00142\u0018\u007fK\u00109\u0012wF\u0014-\u001brG\u001d;\u000eoC\u0005,R~P\u00030\u000f4M\u0004+\u0012}O\u00142\u0012i[";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "mM\u0018/RkJ\u001e1\u0018uW\u001c=\u0018i\r\u0014-\u000ftPQ9\u001crN\u0014;]oMQ/\u001ciQ\u0014\u007f";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        aam.a = null;
    }
    
    private static double a(final bi bi) {
        Label_0071: {
            try {
                switch (bi.I) {
                    default: {
                        return i.NONE.getCode();
                    }
                    case 1: {
                        return i.PHOTO.getCode();
                    }
                    case 3: {
                        break;
                    }
                    case 2: {
                        break Label_0071;
                    }
                    case 5: {
                        return i.LOCATION.getCode();
                    }
                    case 4: {
                        return i.CONTACT.getCode();
                    }
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            return i.VIDEO.getCode();
            try {
                if (bi.E == 1) {
                    return i.PTT.getCode();
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
        return i.AUDIO.getCode();
    }
    
    public static int a() {
        final boolean i = App.I;
        final ConnectivityManager connectivityManager = (ConnectivityManager)App.aq.getSystemService(aam.z[1]);
        if (connectivityManager != null) {
            final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                final int type = activeNetworkInfo.getType();
                int n = 0;
                if (type == 0) {
                    final TelephonyManager telephonyManager = (TelephonyManager)App.aq.getSystemService(aam.z[0]);
                    Label_0160: {
                        if (telephonyManager != null) {
                            Label_0148: {
                                Label_0324: {
                                    switch (telephonyManager.getNetworkType()) {
                                        case 2: {
                                            n = an.CELLULAR_EDGE.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 1: {
                                            n = an.CELLULAR_GPRS.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 3: {
                                            n = an.CELLULAR_UMTS.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 8: {
                                            n = an.CELLULAR_HSDPA.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 9: {
                                            n = an.CELLULAR_HSUPA.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 10: {
                                            n = an.CELLULAR_HSPA.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 4: {
                                            n = an.CELLULAR_CDMA.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 5:
                                        case 6:
                                        case 12: {
                                            n = an.CELLULAR_EVDO.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 7: {
                                            n = an.CELLULAR_1XRTT.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 13: {
                                            n = an.CELLULAR_LTE.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 14: {
                                            n = an.CELLULAR_EHRPD.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 11: {
                                            n = an.CELLULAR_IDEN.getCode();
                                            if (i) {
                                                break Label_0324;
                                            }
                                            break Label_0148;
                                        }
                                        case 15: {
                                            n = an.CELLULAR_HSPAP.getCode();
                                            if (i) {
                                                break;
                                            }
                                            break Label_0148;
                                        }
                                    }
                                }
                                n = an.CELLULAR_UNKNOWN.getCode();
                            }
                            if (!i) {
                                break Label_0160;
                            }
                        }
                        n = an.CELLULAR_UNKNOWN.getCode();
                    }
                    if (!i) {
                        return n;
                    }
                }
                else {
                    n = -1;
                }
                if (type == 1) {
                    n = an.WIFI_UNKNOWN.getCode();
                }
                return n;
            }
        }
        return -1;
    }
    
    private static int a(final k k) {
        try {
            if (k == k.NETWORK_UNAVAILABLE) {
                return bw.NETWORK_UNAVAILABLE.getCode();
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            if (k == k.IN_PROGRESS) {
                return bw.IN_PROGRESS.getCode();
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        try {
            if (k == k.UP_TO_DATE) {
                return bw.UP_TO_DATE.getCode();
            }
        }
        catch (NumberFormatException ex3) {
            throw ex3;
        }
        try {
            if (k == k.FAILED) {
                return bw.FAILED.getCode();
            }
        }
        catch (NumberFormatException ex4) {
            throw ex4;
        }
        try {
            if (k == k.DELAYED) {
                return bw.DELAYED.getCode();
            }
        }
        catch (NumberFormatException ex5) {
            throw ex5;
        }
        try {
            if (k == k.USER_IS_EXPIRED) {
                return bw.USER_IS_EXPIRED.getCode();
            }
        }
        catch (NumberFormatException ex6) {
            throw ex6;
        }
        return 0;
    }
    
    public static Bundle a(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Landroid/os/Bundle;
        //     7: dup            
        //     8: invokespecial   android/os/Bundle.<init>:()V
        //    11: astore_2       
        //    12: aload_0        
        //    13: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    16: invokevirtual   java/lang/Class.getDeclaredFields:()[Ljava/lang/reflect/Field;
        //    19: astore_3       
        //    20: aload_3        
        //    21: arraylength    
        //    22: istore          4
        //    24: iconst_0       
        //    25: istore          5
        //    27: iload           5
        //    29: iload           4
        //    31: if_icmpge       161
        //    34: aload_3        
        //    35: iload           5
        //    37: aaload         
        //    38: astore          6
        //    40: aload           6
        //    42: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    45: astore          7
        //    47: aload           6
        //    49: aload_0        
        //    50: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    53: astore          9
        //    55: aload           9
        //    57: ifnull          151
        //    60: aload           9
        //    62: instanceof      Ljava/lang/Double;
        //    65: istore          16
        //    67: iload           16
        //    69: ifeq            90
        //    72: aload_2        
        //    73: aload           7
        //    75: aload           9
        //    77: checkcast       Ljava/lang/Double;
        //    80: invokevirtual   java/lang/Double.doubleValue:()D
        //    83: invokevirtual   android/os/Bundle.putDouble:(Ljava/lang/String;D)V
        //    86: iload_1        
        //    87: ifeq            151
        //    90: aload           9
        //    92: instanceof      Ljava/lang/String;
        //    95: istore          17
        //    97: iload           17
        //    99: ifeq            117
        //   102: aload_2        
        //   103: aload           7
        //   105: aload           9
        //   107: checkcast       Ljava/lang/String;
        //   110: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   113: iload_1        
        //   114: ifeq            151
        //   117: new             Ljava/lang/StringBuilder;
        //   120: dup            
        //   121: invokespecial   java/lang/StringBuilder.<init>:()V
        //   124: getstatic       com/whatsapp/aam.z:[Ljava/lang/String;
        //   127: iconst_4       
        //   128: aaload         
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: aload           7
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: getstatic       com/whatsapp/aam.z:[Ljava/lang/String;
        //   140: iconst_3       
        //   141: aaload         
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   148: invokestatic    com/whatsapp/aol.a:(Ljava/lang/String;)V
        //   151: iload           5
        //   153: iconst_1       
        //   154: iadd           
        //   155: istore          10
        //   157: iload_1        
        //   158: ifeq            200
        //   161: aload_2        
        //   162: areturn        
        //   163: astore          11
        //   165: aload           11
        //   167: athrow         
        //   168: astore          12
        //   170: aload           12
        //   172: athrow         
        //   173: astore          13
        //   175: aload           13
        //   177: athrow         
        //   178: astore          14
        //   180: aload           14
        //   182: athrow         
        //   183: astore          15
        //   185: aload           15
        //   187: athrow         
        //   188: astore          8
        //   190: new             Ljava/lang/IllegalArgumentException;
        //   193: dup            
        //   194: aload           8
        //   196: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/Throwable;)V
        //   199: athrow         
        //   200: iload           10
        //   202: istore          5
        //   204: goto            27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  47     55     188    200    Ljava/lang/IllegalAccessException;
        //  60     67     163    168    Ljava/lang/IllegalAccessException;
        //  72     86     168    173    Ljava/lang/IllegalAccessException;
        //  90     97     173    178    Ljava/lang/IllegalAccessException;
        //  102    113    178    183    Ljava/lang/IllegalAccessException;
        //  117    151    183    188    Ljava/lang/IllegalAccessException;
        //  165    168    168    173    Ljava/lang/IllegalAccessException;
        //  170    173    173    178    Ljava/lang/IllegalAccessException;
        //  175    178    178    183    Ljava/lang/IllegalAccessException;
        //  180    183    183    188    Ljava/lang/IllegalAccessException;
        //  185    188    188    200    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 103, Size: 103
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
    
    public static Events$Call a(final Context p0, final Events$Call p1, final String p2, final Double p3, final Double p4, final Integer p5, final w p6, final String p7, final String p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          9
        //     5: aload_1        
        //     6: aload_2        
        //     7: invokestatic    com/whatsapp/aam.b:(Ljava/lang/String;)Ljava/lang/Double;
        //    10: putfield        com/whatsapp/fieldstats/Events$Call.peerUserId:Ljava/lang/Double;
        //    13: getstatic       com/whatsapp/App.z:Z
        //    16: istore          14
        //    18: iload           14
        //    20: ifeq            46
        //    23: aload_1        
        //    24: new             Ljava/lang/Double;
        //    27: dup            
        //    28: getstatic       com/whatsapp/fieldstats/l.CONNECTED:Lcom/whatsapp/fieldstats/l;
        //    31: invokevirtual   com/whatsapp/fieldstats/l.getCode:()I
        //    34: i2d            
        //    35: invokespecial   java/lang/Double.<init>:(D)V
        //    38: putfield        com/whatsapp/fieldstats/Events$Call.xmppStatus:Ljava/lang/Double;
        //    41: iload           9
        //    43: ifeq            97
        //    46: getstatic       com/whatsapp/App.y:Z
        //    49: istore          15
        //    51: iload           15
        //    53: ifeq            79
        //    56: aload_1        
        //    57: new             Ljava/lang/Double;
        //    60: dup            
        //    61: getstatic       com/whatsapp/fieldstats/l.CONNECTING:Lcom/whatsapp/fieldstats/l;
        //    64: invokevirtual   com/whatsapp/fieldstats/l.getCode:()I
        //    67: i2d            
        //    68: invokespecial   java/lang/Double.<init>:(D)V
        //    71: putfield        com/whatsapp/fieldstats/Events$Call.xmppStatus:Ljava/lang/Double;
        //    74: iload           9
        //    76: ifeq            97
        //    79: aload_1        
        //    80: new             Ljava/lang/Double;
        //    83: dup            
        //    84: getstatic       com/whatsapp/fieldstats/l.DISCONNECTED:Lcom/whatsapp/fieldstats/l;
        //    87: invokevirtual   com/whatsapp/fieldstats/l.getCode:()I
        //    90: i2d            
        //    91: invokespecial   java/lang/Double.<init>:(D)V
        //    94: putfield        com/whatsapp/fieldstats/Events$Call.xmppStatus:Ljava/lang/Double;
        //    97: invokestatic    com/whatsapp/Voip.j:()Z
        //   100: istore          17
        //   102: iload           17
        //   104: ifeq            357
        //   107: dconst_1       
        //   108: dstore          18
        //   110: aload_1        
        //   111: dload           18
        //   113: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   116: putfield        com/whatsapp/fieldstats/Events$Call.builtinAecAvailable:Ljava/lang/Double;
        //   119: invokestatic    com/whatsapp/Voip.g:()Z
        //   122: istore          21
        //   124: iload           21
        //   126: ifeq            368
        //   129: dconst_1       
        //   130: dstore          22
        //   132: aload_1        
        //   133: dload           22
        //   135: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   138: putfield        com/whatsapp/fieldstats/Events$Call.builtinAgcAvailable:Ljava/lang/Double;
        //   141: invokestatic    com/whatsapp/Voip.b:()Z
        //   144: istore          25
        //   146: iload           25
        //   148: ifeq            379
        //   151: dconst_1       
        //   152: dstore          26
        //   154: aload_1        
        //   155: dload           26
        //   157: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   160: putfield        com/whatsapp/fieldstats/Events$Call.builtinNsAvailable:Ljava/lang/Double;
        //   163: aload_1        
        //   164: aload_3        
        //   165: putfield        com/whatsapp/fieldstats/Events$Call.callOfferElapsedT:Ljava/lang/Double;
        //   168: aload_1        
        //   169: aload           4
        //   171: putfield        com/whatsapp/fieldstats/Events$Call.callFromUi:Ljava/lang/Double;
        //   174: aload           6
        //   176: ifnonnull       390
        //   179: aconst_null    
        //   180: astore          29
        //   182: aload_1        
        //   183: aload           29
        //   185: putfield        com/whatsapp/fieldstats/Events$Call.callWakeupSource:Ljava/lang/Double;
        //   188: aload_1        
        //   189: aload           7
        //   191: putfield        com/whatsapp/fieldstats/Events$Call.callPeerPlatform:Ljava/lang/String;
        //   194: aload_1        
        //   195: aload           8
        //   197: putfield        com/whatsapp/fieldstats/Events$Call.callPeerAppVersion:Ljava/lang/String;
        //   200: getstatic       com/whatsapp/App.s:Lcom/whatsapp/a04;
        //   203: aload_2        
        //   204: invokevirtual   com/whatsapp/a04.e:(Ljava/lang/String;)J
        //   207: lstore          30
        //   209: lload           30
        //   211: lconst_0       
        //   212: lcmp           
        //   213: ifne            239
        //   216: aload_1        
        //   217: new             Ljava/lang/Double;
        //   220: dup            
        //   221: getstatic       com/whatsapp/fieldstats/l.UNKNOWN:Lcom/whatsapp/fieldstats/l;
        //   224: invokevirtual   com/whatsapp/fieldstats/l.getCode:()I
        //   227: i2d            
        //   228: invokespecial   java/lang/Double.<init>:(D)V
        //   231: putfield        com/whatsapp/fieldstats/Events$Call.peerXmppStatus:Ljava/lang/Double;
        //   234: iload           9
        //   236: ifeq            287
        //   239: lload           30
        //   241: lconst_1       
        //   242: lcmp           
        //   243: ifne            269
        //   246: aload_1        
        //   247: new             Ljava/lang/Double;
        //   250: dup            
        //   251: getstatic       com/whatsapp/fieldstats/l.CONNECTED:Lcom/whatsapp/fieldstats/l;
        //   254: invokevirtual   com/whatsapp/fieldstats/l.getCode:()I
        //   257: i2d            
        //   258: invokespecial   java/lang/Double.<init>:(D)V
        //   261: putfield        com/whatsapp/fieldstats/Events$Call.peerXmppStatus:Ljava/lang/Double;
        //   264: iload           9
        //   266: ifeq            287
        //   269: aload_1        
        //   270: new             Ljava/lang/Double;
        //   273: dup            
        //   274: getstatic       com/whatsapp/fieldstats/l.DISCONNECTED:Lcom/whatsapp/fieldstats/l;
        //   277: invokevirtual   com/whatsapp/fieldstats/l.getCode:()I
        //   280: i2d            
        //   281: invokespecial   java/lang/Double.<init>:(D)V
        //   284: putfield        com/whatsapp/fieldstats/Events$Call.peerXmppStatus:Ljava/lang/Double;
        //   287: aload           5
        //   289: ifnull          304
        //   292: aload_1        
        //   293: aload           5
        //   295: invokevirtual   java/lang/Integer.doubleValue:()D
        //   298: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   301: putfield        com/whatsapp/fieldstats/Events$Call.callAndroidAudioMode:Ljava/lang/Double;
        //   304: getstatic       com/whatsapp/ym.a:Z
        //   307: istore          34
        //   309: iload           34
        //   311: ifeq            433
        //   314: dconst_1       
        //   315: dstore          35
        //   317: aload_1        
        //   318: dload           35
        //   320: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   323: putfield        com/whatsapp/fieldstats/Events$Call.longConnect:Ljava/lang/Double;
        //   326: aload_1        
        //   327: putstatic       com/whatsapp/aam.a:Lcom/whatsapp/fieldstats/Events$Call;
        //   330: aload_1        
        //   331: areturn        
        //   332: astore          10
        //   334: aload           10
        //   336: athrow         
        //   337: astore          11
        //   339: aload           11
        //   341: athrow         
        //   342: astore          12
        //   344: aload           12
        //   346: athrow         
        //   347: astore          13
        //   349: aload           13
        //   351: athrow         
        //   352: astore          16
        //   354: aload           16
        //   356: athrow         
        //   357: dconst_0       
        //   358: dstore          18
        //   360: goto            110
        //   363: astore          20
        //   365: aload           20
        //   367: athrow         
        //   368: dconst_0       
        //   369: dstore          22
        //   371: goto            132
        //   374: astore          24
        //   376: aload           24
        //   378: athrow         
        //   379: dconst_0       
        //   380: dstore          26
        //   382: goto            154
        //   385: astore          28
        //   387: aload           28
        //   389: athrow         
        //   390: new             Ljava/lang/Double;
        //   393: dup            
        //   394: aload           6
        //   396: invokevirtual   com/whatsapp/fieldstats/w.getCode:()I
        //   399: i2d            
        //   400: invokespecial   java/lang/Double.<init>:(D)V
        //   403: astore          29
        //   405: goto            182
        //   408: astore          38
        //   410: aload           38
        //   412: athrow         
        //   413: astore          39
        //   415: aload           39
        //   417: athrow         
        //   418: astore          32
        //   420: aload           32
        //   422: athrow         
        //   423: astore          37
        //   425: aload           37
        //   427: athrow         
        //   428: astore          33
        //   430: aload           33
        //   432: athrow         
        //   433: dconst_0       
        //   434: dstore          35
        //   436: goto            317
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      18     332    337    Ljava/lang/NumberFormatException;
        //  23     41     337    342    Ljava/lang/NumberFormatException;
        //  46     51     342    347    Ljava/lang/NumberFormatException;
        //  56     74     347    352    Ljava/lang/NumberFormatException;
        //  79     97     347    352    Ljava/lang/NumberFormatException;
        //  97     102    352    357    Ljava/lang/NumberFormatException;
        //  110    124    363    368    Ljava/lang/NumberFormatException;
        //  132    146    374    379    Ljava/lang/NumberFormatException;
        //  154    174    385    390    Ljava/lang/NumberFormatException;
        //  216    234    408    418    Ljava/lang/NumberFormatException;
        //  246    264    418    423    Ljava/lang/NumberFormatException;
        //  269    287    418    423    Ljava/lang/NumberFormatException;
        //  292    304    423    428    Ljava/lang/NumberFormatException;
        //  304    309    428    433    Ljava/lang/NumberFormatException;
        //  334    337    337    342    Ljava/lang/NumberFormatException;
        //  339    342    342    347    Ljava/lang/NumberFormatException;
        //  344    347    347    352    Ljava/lang/NumberFormatException;
        //  410    413    413    418    Ljava/lang/NumberFormatException;
        //  415    418    418    423    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 211, Size: 211
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
    
    private static String a(final String s) {
        while (true) {
            Label_0017: {
                if (s != null) {
                    break Label_0017;
                }
                try {
                    Log.w(aam.z[2]);
                    return null;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
            }
            final int index = s.indexOf(64);
            if (index != -1) {
                return s.substring(0, index);
            }
            continue;
        }
    }
    
    public static void a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: invokestatic    com/whatsapp/App.j:()I
        //     5: istore_2       
        //     6: getstatic       com/whatsapp/fieldstats/o.NETWORK_IS_WIFI:Lcom/whatsapp/fieldstats/o;
        //     9: astore          4
        //    11: iload_2        
        //    12: iload_1        
        //    13: if_icmpne       81
        //    16: iload_1        
        //    17: istore          5
        //    19: aload_0        
        //    20: aload           4
        //    22: iload           5
        //    24: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    27: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //    30: getstatic       com/whatsapp/fieldstats/o.NETWORK_IS_ROAMING:Lcom/whatsapp/fieldstats/o;
        //    33: astore          7
        //    35: iload_2        
        //    36: iconst_3       
        //    37: if_icmpne       92
        //    40: aload_0        
        //    41: aload           7
        //    43: iload_1        
        //    44: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    47: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //    50: invokestatic    com/whatsapp/aam.a:()I
        //    53: istore          8
        //    55: getstatic       com/whatsapp/fieldstats/o.NETWORK_RADIO_TYPE:Lcom/whatsapp/fieldstats/o;
        //    58: astore          10
        //    60: iload           8
        //    62: iconst_m1      
        //    63: if_icmpne       102
        //    66: aconst_null    
        //    67: astore          11
        //    69: aload_0        
        //    70: aload           10
        //    72: aload           11
        //    74: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //    77: return         
        //    78: astore_3       
        //    79: aload_3        
        //    80: athrow         
        //    81: iconst_0       
        //    82: istore          5
        //    84: goto            19
        //    87: astore          6
        //    89: aload           6
        //    91: athrow         
        //    92: iconst_0       
        //    93: istore_1       
        //    94: goto            40
        //    97: astore          9
        //    99: aload           9
        //   101: athrow         
        //   102: iload           8
        //   104: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   107: astore          11
        //   109: goto            69
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  6      11     78     81     Ljava/lang/NumberFormatException;
        //  19     35     87     92     Ljava/lang/NumberFormatException;
        //  55     60     97     102    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
    
    public static void a(final Context p0, final b_ p1, final aa p2, final at p3, final boolean p4, final boolean p5, final int p6, final int p7, final long p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/whatsapp/fieldstats/b3;
        //     3: dup            
        //     4: invokespecial   com/whatsapp/fieldstats/b3.<init>:()V
        //     7: astore          10
        //     9: aload           10
        //    11: aload_1        
        //    12: invokevirtual   com/whatsapp/fieldstats/b_.getCode:()I
        //    15: i2d            
        //    16: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    19: putfield        com/whatsapp/fieldstats/b3.c:Ljava/lang/Double;
        //    22: aload           10
        //    24: aload_2        
        //    25: invokevirtual   com/whatsapp/fieldstats/aa.getCode:()I
        //    28: i2d            
        //    29: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    32: putfield        com/whatsapp/fieldstats/b3.h:Ljava/lang/Double;
        //    35: aload           10
        //    37: aload_3        
        //    38: invokevirtual   com/whatsapp/fieldstats/at.getCode:()I
        //    41: i2d            
        //    42: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    45: putfield        com/whatsapp/fieldstats/b3.e:Ljava/lang/Double;
        //    48: iload           4
        //    50: ifeq            129
        //    53: dconst_1       
        //    54: dstore          12
        //    56: aload           10
        //    58: dload           12
        //    60: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    63: putfield        com/whatsapp/fieldstats/b3.g:Ljava/lang/Double;
        //    66: iload           5
        //    68: ifeq            140
        //    71: dconst_1       
        //    72: dstore          15
        //    74: aload           10
        //    76: dload           15
        //    78: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    81: putfield        com/whatsapp/fieldstats/b3.b:Ljava/lang/Double;
        //    84: aload           10
        //    86: iload           6
        //    88: i2d            
        //    89: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    92: putfield        com/whatsapp/fieldstats/b3.a:Ljava/lang/Double;
        //    95: aload           10
        //    97: iload           7
        //    99: i2d            
        //   100: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   103: putfield        com/whatsapp/fieldstats/b3.f:Ljava/lang/Double;
        //   106: aload           10
        //   108: lload           8
        //   110: l2d            
        //   111: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   114: putfield        com/whatsapp/fieldstats/b3.d:Ljava/lang/Double;
        //   117: aload_0        
        //   118: aload           10
        //   120: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //   123: return         
        //   124: astore          11
        //   126: aload           11
        //   128: athrow         
        //   129: dconst_0       
        //   130: dstore          12
        //   132: goto            56
        //   135: astore          14
        //   137: aload           14
        //   139: athrow         
        //   140: dconst_0       
        //   141: dstore          15
        //   143: goto            74
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  9      48     124    129    Ljava/lang/NumberFormatException;
        //  56     66     135    140    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    
    static void a(final Context context, final i i, final boolean b, final al al, final long n, final long n2) {
        while (true) {
            final be be = new be();
            while (true) {
                try {
                    be.f = (double)i.getCode();
                    if (b) {
                        final double n3 = 1.0;
                        be.a = n3;
                        be.e = (double)al.getCode();
                        be.d = (double)n;
                        be.b = (double)n2;
                        a5.a(context, be);
                        return;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final double n3 = 0.0;
                continue;
            }
        }
    }
    
    static void a(final Context context, final p p3, final long n) {
        final bn bn = new bn();
        bn.b = (double)p3.getCode();
        bn.a = (double)n;
        a5.a(context, bn);
    }
    
    static void a(final Context context, final bi bi, final bh bh, final long n, final long n2, final boolean b) {
        while (true) {
            final bj bj = new bj();
            while (true) {
                try {
                    bj.c = a(bi);
                    bj.e = (double)bh.getCode();
                    bj.b = (double)n;
                    if (n2 > 0L) {
                        bj.a = (double)n2;
                    }
                    if (b) {
                        final double n3 = 1.0;
                        bj.f = n3;
                        a5.a(context, bj);
                        return;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final double n3 = 0.0;
                continue;
            }
        }
    }
    
    public static void a(final Context context, final boolean b, final int n, final long n2) {
        final b5 b2 = new b5();
        while (true) {
            Label_0068: {
                if (!b) {
                    break Label_0068;
                }
                try {
                    final int n3 = com.whatsapp.fieldstats.bi.OK.getCode();
                    b2.c = (double)n3;
                    b2.a = (double)n;
                    b2.b = (double)n2;
                    a5.a(context, b2);
                    return;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
            }
            final int n3 = com.whatsapp.fieldstats.bi.ERROR_UNKNOWN.getCode();
            continue;
        }
    }
    
    public static void a(final Context context, final boolean b, final k k, final long n) {
        final bt bt = new bt();
        Label_0069: {
            if (!b) {
                break Label_0069;
            }
            double n2 = 1.0;
            while (true) {
                bt.b = n2;
                final int a = a(k);
                Label_0052: {
                    if (a == 0) {
                        break Label_0052;
                    }
                    final double n3 = a;
                    try {
                        bt.c = n3;
                        bt.d = (double)n;
                        a5.a(context, bt);
                        return;
                        n2 = 0.0;
                        continue;
                    }
                    catch (NumberFormatException ex) {
                        throw ex;
                    }
                }
                break;
            }
        }
    }
    
    public static void a(final Context context, final boolean b, final Events$Call events$Call, final String s, final Double n, final Double n2, final Integer n3, final w w, final String s2, final String s3) {
        final Events$Call a = a(context, events$Call, s, n, n2, n3, w, s2, s3);
        try {
            a5.a(context, a);
            if (b) {
                b();
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public static void a(final aq aq) {
        a(aq, null);
    }
    
    static void a(final aq aq, final ag ag) {
        final bp bp = new bp();
        try {
            bp.b = (double)aq.getCode();
            if (ag != null) {
                bp.a = (double)ag.getCode();
            }
            a5.a((Context)App.aq, bp);
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public static void a(final bi p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: dconst_0       
        //     1: dstore_3       
        //     2: aload_0        
        //     3: ifnonnull       7
        //     6: return         
        //     7: new             Lcom/whatsapp/fieldstats/bb;
        //    10: dup            
        //    11: invokespecial   com/whatsapp/fieldstats/bb.<init>:()V
        //    14: astore          5
        //    16: aload           5
        //    18: lload_1        
        //    19: l2d            
        //    20: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    23: putfield        com/whatsapp/fieldstats/bb.f:Ljava/lang/Double;
        //    26: aload           5
        //    28: aload_0        
        //    29: invokestatic    com/whatsapp/aam.a:(Lcom/whatsapp/protocol/bi;)D
        //    32: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    35: putfield        com/whatsapp/fieldstats/bb.e:Ljava/lang/Double;
        //    38: aload           5
        //    40: aload_0        
        //    41: invokestatic    com/whatsapp/aam.c:(Lcom/whatsapp/protocol/bi;)D
        //    44: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    47: putfield        com/whatsapp/fieldstats/bb.b:Ljava/lang/Double;
        //    50: aload           5
        //    52: getfield        com/whatsapp/fieldstats/bb.b:Ljava/lang/Double;
        //    55: invokevirtual   java/lang/Double.doubleValue:()D
        //    58: getstatic       com/whatsapp/fieldstats/af.INDIVIDUAL:Lcom/whatsapp/fieldstats/af;
        //    61: invokevirtual   com/whatsapp/fieldstats/af.getCode:()I
        //    64: i2d            
        //    65: dcmpl          
        //    66: ifne            105
        //    69: aload_0        
        //    70: invokestatic    com/whatsapp/aam.b:(Lcom/whatsapp/protocol/bi;)Ljava/lang/Boolean;
        //    73: astore          8
        //    75: aload           8
        //    77: ifnull          105
        //    80: aload           8
        //    82: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    85: istore          10
        //    87: iload           10
        //    89: ifeq            145
        //    92: dconst_1       
        //    93: dstore          11
        //    95: aload           5
        //    97: dload           11
        //    99: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   102: putfield        com/whatsapp/fieldstats/bb.c:Ljava/lang/Double;
        //   105: aload_0        
        //   106: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   109: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   112: istore          7
        //   114: iload           7
        //   116: ifeq            156
        //   119: aload           5
        //   121: dload_3        
        //   122: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   125: putfield        com/whatsapp/fieldstats/bb.h:Ljava/lang/Double;
        //   128: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   131: invokevirtual   com/whatsapp/App.getApplicationContext:()Landroid/content/Context;
        //   134: aload           5
        //   136: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //   139: return         
        //   140: astore          9
        //   142: aload           9
        //   144: athrow         
        //   145: dload_3        
        //   146: dstore          11
        //   148: goto            95
        //   151: astore          6
        //   153: aload           6
        //   155: athrow         
        //   156: dconst_1       
        //   157: dstore_3       
        //   158: goto            119
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  80     87     140    145    Ljava/lang/NumberFormatException;
        //  105    114    151    156    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0105:
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
    
    public static void a(final Object o, final Bundle bundle) {
        final boolean i = App.I;
        final Field[] declaredFields = o.getClass().getDeclaredFields();
        final int length = declaredFields.length;
        int n = 0;
        while (true) {
            if (n >= length) {
                return;
            }
            final Field field = declaredFields[n];
            final Object value = bundle.get(field.getName());
            try {
                field.set(o, value);
                ++n;
                if (i) {
                    return;
                }
                continue;
            }
            catch (IllegalAccessException ex) {
                throw new IllegalArgumentException(ex);
            }
        }
    }
    
    private static long[] a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: iconst_2       
        //     5: newarray        J
        //     7: dup            
        //     8: iconst_0       
        //     9: lconst_0       
        //    10: lastore        
        //    11: dup            
        //    12: iconst_1       
        //    13: lconst_0       
        //    14: lastore        
        //    15: astore_2       
        //    16: aload_0        
        //    17: ifnonnull       22
        //    20: aload_2        
        //    21: areturn        
        //    22: aload_0        
        //    23: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    26: astore_3       
        //    27: aload_3        
        //    28: ifnull          139
        //    31: aload_3        
        //    32: arraylength    
        //    33: istore          5
        //    35: iconst_0       
        //    36: istore          6
        //    38: iload           6
        //    40: iload           5
        //    42: if_icmpge       135
        //    45: aload_3        
        //    46: iload           6
        //    48: aaload         
        //    49: astore          7
        //    51: aload           7
        //    53: invokevirtual   java/io/File.isFile:()Z
        //    56: istore          10
        //    58: iload           10
        //    60: ifeq            87
        //    63: aload_2        
        //    64: iconst_0       
        //    65: aload_2        
        //    66: iconst_0       
        //    67: laload         
        //    68: aload           7
        //    70: invokevirtual   java/io/File.length:()J
        //    73: ladd           
        //    74: lastore        
        //    75: aload_2        
        //    76: iconst_1       
        //    77: lconst_1       
        //    78: aload_2        
        //    79: iconst_1       
        //    80: laload         
        //    81: ladd           
        //    82: lastore        
        //    83: iload_1        
        //    84: ifeq            128
        //    87: aload           7
        //    89: invokevirtual   java/io/File.isDirectory:()Z
        //    92: istore          11
        //    94: iload           11
        //    96: ifeq            128
        //    99: aload           7
        //   101: invokestatic    com/whatsapp/aam.a:(Ljava/io/File;)[J
        //   104: astore          12
        //   106: aload_2        
        //   107: iconst_0       
        //   108: aload_2        
        //   109: iconst_0       
        //   110: laload         
        //   111: aload           12
        //   113: iconst_0       
        //   114: laload         
        //   115: ladd           
        //   116: lastore        
        //   117: aload_2        
        //   118: iconst_1       
        //   119: aload_2        
        //   120: iconst_1       
        //   121: laload         
        //   122: aload           12
        //   124: iconst_1       
        //   125: laload         
        //   126: ladd           
        //   127: lastore        
        //   128: iinc            6, 1
        //   131: iload_1        
        //   132: ifeq            38
        //   135: iload_1        
        //   136: ifeq            20
        //   139: new             Ljava/lang/StringBuilder;
        //   142: dup            
        //   143: invokespecial   java/lang/StringBuilder.<init>:()V
        //   146: getstatic       com/whatsapp/aam.z:[Ljava/lang/String;
        //   149: iconst_5       
        //   150: aaload         
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: aload_0        
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   158: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   161: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   164: aload_2        
        //   165: areturn        
        //   166: astore          4
        //   168: aload           4
        //   170: athrow         
        //   171: astore          8
        //   173: aload           8
        //   175: athrow         
        //   176: astore          9
        //   178: aload           9
        //   180: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  51     58     171    176    Ljava/lang/NumberFormatException;
        //  63     83     176    181    Ljava/lang/NumberFormatException;
        //  87     94     176    181    Ljava/lang/NumberFormatException;
        //  139    164    166    171    Ljava/lang/NumberFormatException;
        //  173    176    176    181    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    private static Boolean b(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //     3: astore          4
        //     5: aload           4
        //     7: ifnull          100
        //    10: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //    13: getfield        com/whatsapp/App$Me.cc:Ljava/lang/String;
        //    16: astore          5
        //    18: aload           5
        //    20: ifnull          100
        //    23: aload_0        
        //    24: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    27: ifnull          100
        //    30: aload_0        
        //    31: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    34: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    37: astore          6
        //    39: aload           6
        //    41: ifnull          100
        //    44: aload_0        
        //    45: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    48: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //    51: astore          7
        //    53: aload           7
        //    55: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //    58: getfield        com/whatsapp/App$Me.cc:Ljava/lang/String;
        //    61: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    64: istore          9
        //    66: iload           9
        //    68: ifne            94
        //    71: iconst_1       
        //    72: istore          10
        //    74: iload           10
        //    76: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    79: areturn        
        //    80: astore_1       
        //    81: aload_1        
        //    82: athrow         
        //    83: astore_2       
        //    84: aload_2        
        //    85: athrow         
        //    86: astore_3       
        //    87: aload_3        
        //    88: athrow         
        //    89: astore          8
        //    91: aload           8
        //    93: athrow         
        //    94: iconst_0       
        //    95: istore          10
        //    97: goto            74
        //   100: aconst_null    
        //   101: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      80     83     Ljava/lang/NumberFormatException;
        //  10     18     83     86     Ljava/lang/NumberFormatException;
        //  23     39     86     89     Ljava/lang/NumberFormatException;
        //  53     66     89     94     Ljava/lang/NumberFormatException;
        //  81     83     83     86     Ljava/lang/NumberFormatException;
        //  84     86     86     89     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 51, Size: 51
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
    
    private static Double b(final String s) {
        final String a = a(s);
        if (a == null) {
            return null;
        }
        try {
            return new Double(Double.parseDouble(a));
        }
        catch (NumberFormatException ex) {
            Log.e(aam.z[8] + s);
            return null;
        }
    }
    
    public static void b() {
        try {
            if (Voip.d()) {
                return;
            }
            final App app = App.aq;
            final Context context = app.getApplicationContext();
            final boolean b = a5.m(context);
            if (b) {
                final App app2 = App.aq;
                app2.aL();
            }
            return;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            final App app = App.aq;
            final Context context = app.getApplicationContext();
            final boolean b = a5.m(context);
            if (b) {
                final App app2 = App.aq;
                app2.aL();
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
    }
    
    private static double c(final bi bi) {
        try {
            if (bi.x) {
                return af.BROADCAST.getCode();
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            if (adc.b(bi.a.a)) {
                return af.GROUP.getCode();
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return af.INDIVIDUAL.getCode();
    }
    
    static void c() {
        final File a = qf.a((byte)0, 0, false);
        try {
            if (!a.exists() || !a.isDirectory()) {
                return;
            }
        }
        catch (StackOverflowError stackOverflowError) {
            try {
                throw stackOverflowError;
            }
            catch (StackOverflowError stackOverflowError2) {
                throw stackOverflowError2;
            }
        }
        try {
            final long[] a2 = a(a);
            a5.a((Context)App.aq, o.MEDIA_FOLDER_SIZE, Double.valueOf(a2[0]));
            a5.a((Context)App.aq, o.MEDIA_FOLDER_FILE_COUNT, Double.valueOf(a2[1]));
        }
        catch (StackOverflowError stackOverflowError3) {
            Log.e(aam.z[6]);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            Log.e(aam.z[7]);
        }
    }
    
    public static void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_0       
        //     4: invokestatic    com/whatsapp/z8.b:()Ljava/util/ArrayList;
        //     7: astore_1       
        //     8: iconst_0       
        //     9: istore_2       
        //    10: iconst_0       
        //    11: istore_3       
        //    12: iconst_0       
        //    13: istore          4
        //    15: iconst_0       
        //    16: istore          5
        //    18: iload_2        
        //    19: aload_1        
        //    20: invokevirtual   java/util/ArrayList.size:()I
        //    23: if_icmpge       91
        //    26: aload_1        
        //    27: iload_2        
        //    28: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    31: checkcast       Ljava/lang/String;
        //    34: astore          6
        //    36: aload           6
        //    38: ifnull          82
        //    41: aload           6
        //    43: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //    46: istore          12
        //    48: iload           12
        //    50: ifeq            60
        //    53: iinc            4, 1
        //    56: iload_0        
        //    57: ifeq            82
        //    60: aload           6
        //    62: invokestatic    com/whatsapp/a_9.h:(Ljava/lang/String;)Z
        //    65: istore          13
        //    67: iload           13
        //    69: ifeq            79
        //    72: iinc            3, 1
        //    75: iload_0        
        //    76: ifeq            82
        //    79: iinc            5, 1
        //    82: iload_2        
        //    83: iconst_1       
        //    84: iadd           
        //    85: istore          7
        //    87: iload_0        
        //    88: ifeq            153
        //    91: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    94: getstatic       com/whatsapp/fieldstats/o.INDIVIDUAL_CHAT_COUNT:Lcom/whatsapp/fieldstats/o;
        //    97: iload           5
        //    99: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   102: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //   105: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   108: getstatic       com/whatsapp/fieldstats/o.GROUP_CHAT_COUNT:Lcom/whatsapp/fieldstats/o;
        //   111: iload           4
        //   113: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   116: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //   119: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   122: getstatic       com/whatsapp/fieldstats/o.BROADCAST_CHAT_COUNT:Lcom/whatsapp/fieldstats/o;
        //   125: iload_3        
        //   126: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   129: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //   132: return         
        //   133: astore          8
        //   135: aload           8
        //   137: athrow         
        //   138: astore          9
        //   140: aload           9
        //   142: athrow         
        //   143: astore          10
        //   145: aload           10
        //   147: athrow         
        //   148: astore          11
        //   150: aload           11
        //   152: athrow         
        //   153: iload           7
        //   155: istore_2       
        //   156: goto            18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  41     48     133    143    Ljava/lang/NumberFormatException;
        //  60     67     143    153    Ljava/lang/NumberFormatException;
        //  135    138    138    143    Ljava/lang/NumberFormatException;
        //  140    143    143    153    Ljava/lang/NumberFormatException;
        //  145    148    148    153    Ljava/lang/NumberFormatException;
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
    
    static void d(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: dconst_1       
        //     1: dstore_1       
        //     2: aload_0        
        //     3: ifnonnull       7
        //     6: return         
        //     7: new             Lcom/whatsapp/fieldstats/bg;
        //    10: dup            
        //    11: invokespecial   com/whatsapp/fieldstats/bg.<init>:()V
        //    14: astore_3       
        //    15: aload_3        
        //    16: aload_0        
        //    17: invokestatic    com/whatsapp/aam.a:(Lcom/whatsapp/protocol/bi;)D
        //    20: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    23: putfield        com/whatsapp/fieldstats/bg.d:Ljava/lang/Double;
        //    26: aload_3        
        //    27: aload_0        
        //    28: invokestatic    com/whatsapp/aam.c:(Lcom/whatsapp/protocol/bi;)D
        //    31: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    34: putfield        com/whatsapp/fieldstats/bg.e:Ljava/lang/Double;
        //    37: aload_3        
        //    38: getfield        com/whatsapp/fieldstats/bg.e:Ljava/lang/Double;
        //    41: invokevirtual   java/lang/Double.doubleValue:()D
        //    44: getstatic       com/whatsapp/fieldstats/af.INDIVIDUAL:Lcom/whatsapp/fieldstats/af;
        //    47: invokevirtual   com/whatsapp/fieldstats/af.getCode:()I
        //    50: i2d            
        //    51: dcmpl          
        //    52: ifeq            81
        //    55: aload_3        
        //    56: getfield        com/whatsapp/fieldstats/bg.e:Ljava/lang/Double;
        //    59: invokevirtual   java/lang/Double.doubleValue:()D
        //    62: dstore          12
        //    64: getstatic       com/whatsapp/fieldstats/af.BROADCAST:Lcom/whatsapp/fieldstats/af;
        //    67: invokevirtual   com/whatsapp/fieldstats/af.getCode:()I
        //    70: istore          14
        //    72: dload           12
        //    74: iload           14
        //    76: i2d            
        //    77: dcmpl          
        //    78: ifne            116
        //    81: aload_0        
        //    82: invokestatic    com/whatsapp/aam.b:(Lcom/whatsapp/protocol/bi;)Ljava/lang/Boolean;
        //    85: astore          5
        //    87: aload           5
        //    89: ifnull          116
        //    92: aload           5
        //    94: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    97: istore          9
        //    99: iload           9
        //   101: ifeq            156
        //   104: dload_1        
        //   105: dstore          10
        //   107: aload_3        
        //   108: dload           10
        //   110: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   113: putfield        com/whatsapp/fieldstats/bg.c:Ljava/lang/Double;
        //   116: aload_0        
        //   117: getfield        com/whatsapp/protocol/bi.b:Ljava/lang/Integer;
        //   120: astore          7
        //   122: aload           7
        //   124: ifnull          167
        //   127: aload_3        
        //   128: dload_1        
        //   129: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   132: putfield        com/whatsapp/fieldstats/bg.b:Ljava/lang/Double;
        //   135: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   138: invokevirtual   com/whatsapp/App.getApplicationContext:()Landroid/content/Context;
        //   141: aload_3        
        //   142: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/b9;)V
        //   145: return         
        //   146: astore          4
        //   148: aload           4
        //   150: athrow         
        //   151: astore          8
        //   153: aload           8
        //   155: athrow         
        //   156: dconst_0       
        //   157: dstore          10
        //   159: goto            107
        //   162: astore          6
        //   164: aload           6
        //   166: athrow         
        //   167: dconst_0       
        //   168: dstore_1       
        //   169: goto            127
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  15     72     146    151    Ljava/lang/NumberFormatException;
        //  92     99     151    156    Ljava/lang/NumberFormatException;
        //  116    122    162    167    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 84, Size: 84
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
