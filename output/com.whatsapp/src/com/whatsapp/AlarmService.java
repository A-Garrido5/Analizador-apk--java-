// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.app.AlarmManager;
import android.os.PowerManager$WakeLock;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import android.support.annotation.Nullable;
import android.content.Intent;
import android.app.IntentService;

public class AlarmService extends IntentService
{
    private static final String[] z;
    private String a;
    
    static {
        final String[] z2 = new String[61];
        String s = "z\u0017wPq{]cXqu\u0015sVgp\u0016,]sj\u0013.\\|\u007f\u0010m\\v>";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1557:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = 'r';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = '9';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "}\u001doWw}\u0006hO{j\u000b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"Q}k\u0000m@Ql\u001do\u00022w\u001cu\\|jO";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "}\u001dl\u0017uq\u001dfUw0\u0002sVq{\u0001r\u0017u\u007f\u0002qJ";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"[s}\u0019tI_{\u0001rXu{\u0001:\u0019{p\u0006dWf#";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "n\u001dv\\`";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Jyw\u0002qP|yRl\\am\u0013f\\2|\u0013bRgnReLw>\u0006n\u0019\u007fw\u0001rP|yRdAf{\u0000oX~>\u001fd]{\u007f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Jf\u007f\u0000uP|yRl\\am\u0013f\\2|\u0013bRgn";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Jyw\u0002qP|yRl\\am\u0013f\\2|\u0013bRgnReLw>\u0006n\u0019|q\u0006!@wjRs\\uw\u0001u\\`{\u0016";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"]sw\u001exz`q\u001c";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Jyw\u0002qP|yRl\\am\u0013f\\2|\u0013bRgnReLw>\u0006n\u0019`{\u0013e\u0014}p\u001ex\u0019wf\u0006dK|\u007f\u001e";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Jyw\u0002qP|yRl\\am\u0013f\\2|\u0013bRgnReLw>\u0006n\u0019|q\u0006!I~k\u0015f\\v>\u001bo\u0019sp\u0016!U}iRcXfj\u0017s@";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"]sw\u001exz`q\u001c\"Twz\u001b`z~{\u0013oLb";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = ",\\`Wvl\u001dh]<n\u001dnU<p\u0006q\u0017}l\u0015";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<V=Tk^G-Bk]P";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u007f\u001e`K\u007f";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "k\u001c`[~{RuV2l\u0017uK{{\u0004d\u0019|j\u0002!M{s\u0017!_`q\u001f!X|gRn_2j\u001ad\u0019`{\u0001nUd{\u0016!Xvz\u0000dJa{\u0001!_}lR";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    s = ">\u0013u\u0019`{\u0001nUd{\u0016!Xvz\u0000dJa>";
                    n = 17;
                    n2 = 18;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    array = z2;
                    s = "n\u001dv\\`";
                    n = 18;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "k\u001c`[~{RuV2l\u0017rV~h\u0017!WfnRr\\`h\u0017s\u0019";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"Lbz\u0013u\\\\j\u0002";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "k\u001c`[~{RuV2l\u0017uK{{\u0004d\u0019|j\u0002!M{s\u0017!_`q\u001f!";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"Lbz\u0013u\\\\j\u0002:\u0019{p\u0006dWf#";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "s\u0017uQ}zRrQ}k\u001ee\u0019|{\u0004dK2|\u0017!KgpRgK}sRuQw>'H\u0019fv\u0000dXv";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<\\3BrGN-L|AM3F|A";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u007f\u001e`K\u007f";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Jwj\u0006hWu>\u001cdAf>\u001fdJa\u007f\u0015d\u0019p\u007f\u0011jLb>\u0013mX`sI!X~\u007f\u0000lm{s\u0017LP~r\u001br\u0004";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"]sw\u001exz`q\u001c:\u0019{p\u0006dWf#";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"]sw\u001exz`q\u001c";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    s = "n\u001dv\\`";
                    n = 29;
                    n2 = 30;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    array = z2;
                    s = "\u007f\u001e`K\u007f";
                    n = 30;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Jwj\u0006hWu>\u001cdAf>\u0016`P~gRbK}pI!X~\u007f\u0000lm{s\u0017LP~r\u001br\u0004";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<Z3HuKA1Sv\\";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "u0";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = ">\u0006nMsrO";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "z\u0017wPq{]l\\\u007fq\u0000x\u0019bl\u001db\\am\u0017r\u0004";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u007f\u0011uPdw\u0006x";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "z\u0017wPq{]l\\\u007fq\u0000x\u0019bl\u001bwXf{-eP`j\u000b<";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "u0!Jz\u007f\u0000d]Mz\u001bsMk#";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "z\u0017wPq{]cXfj\u0017s@2";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "z\u0017wPq{]qK}}\u0017rJwm]dK`q\u0000!";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "u0!IamO";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "z\u0017wPq{]qK}}\u0017rJwm]oV|{";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "{\u001fqMk>\u001cuI2m\u0017sOwlRbV|x\u001bfL`\u007f\u0006hV|";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = ",\\`Wvl\u001dh]<n\u001dnU<p\u0006q\u0017}l\u0015";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "\u007f\u001ceK}w\u0016;Jfl\u001bo^=}\u001do_{y-oMbM\u0017sOwl";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = ",\\`Wvl\u001dh]<n\u001dnU<p\u0006q\u0017}l\u0015";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "k\u001cs\\aq\u001ewXpr\u0017!WfnRr\\`h\u0017s\u0019qq\u001cgPuk\u0000`M{q\u001c";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017\"Jwj\u0007q\u00022w\u001cu\\|jO";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = ",\\`Wvl\u001dh]<n\u001dnU<p\u0006q\u0017}l\u0015";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<K\"ExF[-OmB";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Kw}\u0017hOwzRtW`{\u0011n^|w\bd]2w\u001cu\\|jI!P|j\u0017oM/";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Kw}\u0017hOwzRoL~rRhWf{\u001cu";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<M7UlB";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<\\3BrGN-L|AM3F|A";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "_\u001e`K\u007fM\u0017sO{}\u0017!Kw}\u0017hOwzRoL~rR`Zfw\u001do\u0019{pRhWf{\u001cu";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<Z3HuKA1Sv\\";
                    n = 56;
                    n2 = 57;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    array = z2;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<V=Tk^G-Bk]P";
                    n = 57;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "}\u001dl\u0017ev\u0013uJsn\u0002/Xqj\u001bnW<K\"ExF[-OmB";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "\u007f\u001e`K\u007f";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    break Label_1557;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public AlarmService() {
        super(AlarmService.z[13]);
        this.a = AlarmService.z[14];
    }
    
    private void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //     3: astore_1       
        //     4: aload_1        
        //     5: bipush          11
        //     7: invokevirtual   java/util/Calendar.get:(I)I
        //    10: iconst_4       
        //    11: if_icmplt       20
        //    14: aload_1        
        //    15: iconst_5       
        //    16: iconst_1       
        //    17: invokevirtual   java/util/Calendar.add:(II)V
        //    20: aload_1        
        //    21: bipush          14
        //    23: iconst_0       
        //    24: invokevirtual   java/util/Calendar.set:(II)V
        //    27: aload_1        
        //    28: bipush          13
        //    30: iconst_0       
        //    31: invokevirtual   java/util/Calendar.set:(II)V
        //    34: aload_1        
        //    35: bipush          12
        //    37: iconst_0       
        //    38: invokevirtual   java/util/Calendar.set:(II)V
        //    41: aload_1        
        //    42: bipush          11
        //    44: iconst_4       
        //    45: invokevirtual   java/util/Calendar.set:(II)V
        //    48: aload_1        
        //    49: invokevirtual   java/util/Calendar.getTimeInMillis:()J
        //    52: lstore_3       
        //    53: new             Ljava/lang/StringBuilder;
        //    56: dup            
        //    57: invokespecial   java/lang/StringBuilder.<init>:()V
        //    60: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    63: bipush          27
        //    65: aaload         
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: new             Ljava/util/Date;
        //    72: dup            
        //    73: lload_3        
        //    74: invokespecial   java/util/Date.<init>:(J)V
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    80: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    83: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    86: aload_0        
        //    87: iconst_0       
        //    88: new             Landroid/content/Intent;
        //    91: dup            
        //    92: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    95: bipush          25
        //    97: aaload         
        //    98: aconst_null    
        //    99: aload_0        
        //   100: ldc             Lcom/whatsapp/AlarmBroadcastReceiver;.class
        //   102: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V
        //   105: iconst_0       
        //   106: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   109: astore          5
        //   111: aload_0        
        //   112: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   115: bipush          26
        //   117: aaload         
        //   118: invokevirtual   com/whatsapp/AlarmService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   121: checkcast       Landroid/app/AlarmManager;
        //   124: astore          6
        //   126: aload           6
        //   128: aload           5
        //   130: invokevirtual   android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
        //   133: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   136: istore          9
        //   138: iload           9
        //   140: bipush          19
        //   142: if_icmplt       160
        //   145: aload           6
        //   147: iconst_0       
        //   148: lload_3        
        //   149: aload           5
        //   151: invokevirtual   android/app/AlarmManager.setExact:(IJLandroid/app/PendingIntent;)V
        //   154: getstatic       com/whatsapp/App.I:Z
        //   157: ifeq            169
        //   160: aload           6
        //   162: iconst_0       
        //   163: lload_3        
        //   164: aload           5
        //   166: invokevirtual   android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
        //   169: return         
        //   170: astore_2       
        //   171: aload_2        
        //   172: athrow         
        //   173: astore          7
        //   175: aload           7
        //   177: athrow         
        //   178: astore          8
        //   180: aload           8
        //   182: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      20     170    173    Landroid/content/res/Resources$NotFoundException;
        //  126    138    173    178    Landroid/content/res/Resources$NotFoundException;
        //  145    160    178    183    Landroid/content/res/Resources$NotFoundException;
        //  160    169    178    183    Landroid/content/res/Resources$NotFoundException;
        //  175    178    178    183    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 95, Size: 95
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
    
    private void a(@Nullable final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    10: iconst_2       
        //    11: aaload         
        //    12: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    15: aload_1        
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    19: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    22: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    25: aload_0        
        //    26: invokespecial   com/whatsapp/AlarmService.c:()V
        //    29: invokestatic    com/whatsapp/App.aC:()Z
        //    32: ifeq            51
        //    35: new             Lcom/whatsapp/vq;
        //    38: dup            
        //    39: iconst_0       
        //    40: invokespecial   com/whatsapp/vq.<init>:(Z)V
        //    43: iconst_0       
        //    44: anewarray       Ljava/lang/Void;
        //    47: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //    50: pop            
        //    51: aload_0        
        //    52: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    55: iconst_1       
        //    56: aaload         
        //    57: invokevirtual   com/whatsapp/AlarmService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    60: checkcast       Landroid/net/ConnectivityManager;
        //    63: invokevirtual   android/net/ConnectivityManager.getBackgroundDataSetting:()Z
        //    66: istore_3       
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    77: iconst_0       
        //    78: aaload         
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: iload_3        
        //    83: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    92: iload_3        
        //    93: ifne            113
        //    96: aload_0        
        //    97: iconst_1       
        //    98: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Z)V
        //   101: aload_0        
        //   102: invokestatic    com/whatsapp/App.f:(Landroid/content/Context;)V
        //   105: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   108: iconst_3       
        //   109: aaload         
        //   110: invokestatic    com/whatsapp/App.B:(Ljava/lang/String;)V
        //   113: invokestatic    com/whatsapp/App.W:()V
        //   116: return         
        //   117: astore_2       
        //   118: aload_2        
        //   119: athrow         
        //   120: astore          4
        //   122: aload           4
        //   124: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      51     117    120    Landroid/content/res/Resources$NotFoundException;
        //  67     92     120    125    Landroid/content/res/Resources$NotFoundException;
        //  96     113    120    125    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0113:
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
    
    static void a(final AlarmService alarmService) {
        alarmService.b();
    }
    
    static void a(final AlarmService alarmService, final Intent intent) {
        alarmService.d(intent);
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //     3: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //     6: if_acmpne       26
        //     9: new             Ljava/lang/IllegalThreadStateException;
        //    12: dup            
        //    13: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    16: bipush          24
        //    18: aaload         
        //    19: invokespecial   java/lang/IllegalThreadStateException.<init>:(Ljava/lang/String;)V
        //    22: athrow         
        //    23: astore_1       
        //    24: aload_1        
        //    25: athrow         
        //    26: aload_0        
        //    27: getstatic       com/whatsapp/fieldstats/o.CLASS_COUNT:Lcom/whatsapp/fieldstats/o;
        //    30: invokestatic    com/whatsapp/al5.H:()I
        //    33: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    36: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //    39: invokestatic    com/whatsapp/al5.H:()I
        //    42: bipush          10
        //    44: if_icmpgt       64
        //    47: aload_0        
        //    48: getstatic       com/whatsapp/fieldstats/o.CLASS_NAMES:Lcom/whatsapp/fieldstats/o;
        //    51: invokestatic    com/whatsapp/al5.A:()Ljava/lang/String;
        //    54: iconst_0       
        //    55: sipush          1000
        //    58: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    61: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/String;)V
        //    64: aload_0        
        //    65: getstatic       com/whatsapp/fieldstats/o.IS_BLUESTACKS:Lcom/whatsapp/fieldstats/o;
        //    68: invokestatic    com/whatsapp/al5.g:()Z
        //    71: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    74: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //    77: aload_0        
        //    78: getstatic       com/whatsapp/fieldstats/o.IS_GENYMOTION:Lcom/whatsapp/fieldstats/o;
        //    81: invokestatic    com/whatsapp/al5.e:()Z
        //    84: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    87: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //    90: aload_0        
        //    91: getstatic       com/whatsapp/fieldstats/o.SIGNATURE_HASH:Lcom/whatsapp/fieldstats/o;
        //    94: aload_0        
        //    95: invokestatic    com/whatsapp/al5.a:(Landroid/content/Context;)Ljava/lang/String;
        //    98: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/String;)V
        //   101: invokestatic    com/whatsapp/al5.d:()Z
        //   104: ifeq            118
        //   107: aload_0        
        //   108: getstatic       com/whatsapp/fieldstats/o.IS_MONKEYRUNNER_RUNNING:Lcom/whatsapp/fieldstats/o;
        //   111: iconst_1       
        //   112: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   115: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //   118: aload_0        
        //   119: getstatic       com/whatsapp/fieldstats/o.IS_WHATSAPP_PLUS_USER:Lcom/whatsapp/fieldstats/o;
        //   122: invokestatic    com/whatsapp/al5.o:()Z
        //   125: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   128: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //   131: aload_0        
        //   132: getstatic       com/whatsapp/fieldstats/o.GOOGLE_ACCOUNT_COUNT:Lcom/whatsapp/fieldstats/o;
        //   135: invokestatic    com/whatsapp/al5.t:()I
        //   138: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   141: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //   144: aload_0        
        //   145: getstatic       com/whatsapp/fieldstats/o.ANDROID_HAS_SD_CARD:Lcom/whatsapp/fieldstats/o;
        //   148: invokestatic    com/whatsapp/al5.s:()Ljava/lang/Boolean;
        //   151: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //   154: aload_0        
        //   155: getstatic       com/whatsapp/fieldstats/o.ANDROID_IS_SD_CARD_REMOVABLE:Lcom/whatsapp/fieldstats/o;
        //   158: invokestatic    com/whatsapp/App.aw:()Z
        //   161: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   164: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //   167: getstatic       com/whatsapp/contact/b.BOTH:Lcom/whatsapp/contact/b;
        //   170: invokestatic    com/whatsapp/contact/j.b:(Lcom/whatsapp/contact/b;)Ljava/lang/Integer;
        //   173: astore          4
        //   175: aload           4
        //   177: ifnull          189
        //   180: aload_0        
        //   181: getstatic       com/whatsapp/fieldstats/o.ADDRESSBOOK_SIZE:Lcom/whatsapp/fieldstats/o;
        //   184: aload           4
        //   186: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //   189: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   192: invokevirtual   com/whatsapp/wc.d:()I
        //   195: istore          5
        //   197: iload           5
        //   199: iconst_m1      
        //   200: if_icmpeq       215
        //   203: aload_0        
        //   204: getstatic       com/whatsapp/fieldstats/o.ADDRESSBOOK_WHATSAPP_SIZE:Lcom/whatsapp/fieldstats/o;
        //   207: iload           5
        //   209: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   212: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //   215: invokestatic    com/whatsapp/aam.d:()V
        //   218: invokestatic    com/whatsapp/vy.a:()Ljava/lang/Long;
        //   221: astore          6
        //   223: aload           6
        //   225: ifnull          244
        //   228: aload_0        
        //   229: getstatic       com/whatsapp/fieldstats/o.CHAT_DATABASE_SIZE:Lcom/whatsapp/fieldstats/o;
        //   232: aload           6
        //   234: invokevirtual   java/lang/Long.longValue:()J
        //   237: l2d            
        //   238: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   241: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Double;)V
        //   244: invokestatic    com/whatsapp/aam.c:()V
        //   247: return         
        //   248: astore_2       
        //   249: aload_2        
        //   250: athrow         
        //   251: astore_3       
        //   252: aload_3        
        //   253: athrow         
        //   254: astore          9
        //   256: aload           9
        //   258: athrow         
        //   259: astore          8
        //   261: aload           8
        //   263: athrow         
        //   264: astore          7
        //   266: aload           7
        //   268: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      23     23     26     Landroid/content/res/Resources$NotFoundException;
        //  26     64     248    251    Landroid/content/res/Resources$NotFoundException;
        //  64     118    251    254    Landroid/content/res/Resources$NotFoundException;
        //  180    189    254    259    Landroid/content/res/Resources$NotFoundException;
        //  203    215    259    264    Landroid/content/res/Resources$NotFoundException;
        //  228    244    264    269    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 118, Size: 118
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
    
    private void b(@Nullable final Intent intent) {
        Log.i(AlarmService.z[28] + intent);
        final PowerManager$WakeLock wakeLock = ((PowerManager)this.getSystemService(AlarmService.z[30])).newWakeLock(1, AlarmService.z[29]);
        wakeLock.setReferenceCounted(false);
        wakeLock.acquire(600000L);
        try {
            if (Log.j()) {
                Log.i();
            }
            Log.h();
            App.ak.K();
            this.e();
        }
        finally {
            wakeLock.release();
        }
    }
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //     8: bipush          37
        //    10: aaload         
        //    11: invokevirtual   com/whatsapp/AlarmService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    14: checkcast       Landroid/app/ActivityManager;
        //    17: astore_2       
        //    18: new             Landroid/os/Debug$MemoryInfo;
        //    21: dup            
        //    22: invokespecial   android/os/Debug$MemoryInfo.<init>:()V
        //    25: astore_3       
        //    26: aload_3        
        //    27: invokestatic    android/os/Debug.getMemoryInfo:(Landroid/os/Debug$MemoryInfo;)V
        //    30: new             Ljava/lang/StringBuilder;
        //    33: dup            
        //    34: invokespecial   java/lang/StringBuilder.<init>:()V
        //    37: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    40: bipush          38
        //    42: aaload         
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: aload_3        
        //    47: invokevirtual   android/os/Debug$MemoryInfo.getTotalPrivateDirty:()I
        //    50: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    53: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    56: bipush          42
        //    58: aaload         
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: aload_3        
        //    63: invokevirtual   android/os/Debug$MemoryInfo.getTotalPss:()I
        //    66: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    69: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    72: bipush          39
        //    74: aaload         
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: aload_3        
        //    79: invokevirtual   android/os/Debug$MemoryInfo.getTotalSharedDirty:()I
        //    82: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    85: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    88: bipush          34
        //    90: aaload         
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    97: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   100: aload_2        
        //   101: invokevirtual   android/app/ActivityManager.getRunningAppProcesses:()Ljava/util/List;
        //   104: astore          4
        //   106: aload           4
        //   108: ifnonnull       124
        //   111: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   114: bipush          43
        //   116: aaload         
        //   117: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   120: iload_1        
        //   121: ifeq            273
        //   124: aload           4
        //   126: invokeinterface java/util/List.size:()I
        //   131: newarray        I
        //   133: astore          7
        //   135: iconst_0       
        //   136: istore          8
        //   138: iload           8
        //   140: aload           4
        //   142: invokeinterface java/util/List.size:()I
        //   147: if_icmpge       180
        //   150: aload           7
        //   152: iload           8
        //   154: aload           4
        //   156: iload           8
        //   158: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   163: checkcast       Landroid/app/ActivityManager$RunningAppProcessInfo;
        //   166: getfield        android/app/ActivityManager$RunningAppProcessInfo.pid:I
        //   169: iastore        
        //   170: iload           8
        //   172: iconst_1       
        //   173: iadd           
        //   174: istore          13
        //   176: iload_1        
        //   177: ifeq            356
        //   180: aload_2        
        //   181: aload           7
        //   183: invokevirtual   android/app/ActivityManager.getProcessMemoryInfo:([I)[Landroid/os/Debug$MemoryInfo;
        //   186: astore          9
        //   188: aload           9
        //   190: ifnull          273
        //   193: aload           9
        //   195: arraylength    
        //   196: istore          10
        //   198: iconst_0       
        //   199: istore          11
        //   201: iconst_0       
        //   202: istore          12
        //   204: iload           11
        //   206: iload           10
        //   208: if_icmpge       231
        //   211: iload           12
        //   213: aload           9
        //   215: iload           11
        //   217: aaload         
        //   218: invokevirtual   android/os/Debug$MemoryInfo.getTotalPss:()I
        //   221: iadd           
        //   222: istore          12
        //   224: iinc            11, 1
        //   227: iload_1        
        //   228: ifeq            204
        //   231: new             Ljava/lang/StringBuilder;
        //   234: dup            
        //   235: invokespecial   java/lang/StringBuilder.<init>:()V
        //   238: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   241: bipush          36
        //   243: aaload         
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: aload           9
        //   249: arraylength    
        //   250: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   253: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   256: bipush          35
        //   258: aaload         
        //   259: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   262: iload           12
        //   264: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   267: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   270: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   273: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //   276: ldc_w           Lcom/whatsapp/b5;.class
        //   279: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //   282: checkcast       Lcom/whatsapp/b5;
        //   285: astore          6
        //   287: new             Ljava/lang/StringBuilder;
        //   290: dup            
        //   291: invokespecial   java/lang/StringBuilder.<init>:()V
        //   294: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   297: bipush          40
        //   299: aaload         
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: aload           6
        //   305: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   308: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   311: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   314: aload_0        
        //   315: invokestatic    com/whatsapp/App.o:(Landroid/content/Context;)V
        //   318: return         
        //   319: astore          14
        //   321: aload           14
        //   323: athrow         
        //   324: astore          5
        //   326: new             Ljava/lang/StringBuilder;
        //   329: dup            
        //   330: invokespecial   java/lang/StringBuilder.<init>:()V
        //   333: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   336: bipush          41
        //   338: aaload         
        //   339: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   342: aload           5
        //   344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   347: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   350: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   353: goto            273
        //   356: iload           13
        //   358: istore          8
        //   360: goto            138
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  111    120    319    324    Ljava/lang/Exception;
        //  124    135    324    356    Ljava/lang/Exception;
        //  138    170    324    356    Ljava/lang/Exception;
        //  180    188    324    356    Ljava/lang/Exception;
        //  193    198    324    356    Ljava/lang/Exception;
        //  211    224    324    356    Ljava/lang/Exception;
        //  231    273    324    356    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
    
    private void c(@Nullable final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    10: bipush          49
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    20: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    23: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    26: aload_0        
        //    27: invokespecial   com/whatsapp/AlarmService.a:()V
        //    30: aload_0        
        //    31: invokespecial   com/whatsapp/AlarmService.e:()V
        //    34: aload_0        
        //    35: invokespecial   com/whatsapp/AlarmService.d:()V
        //    38: aload_0        
        //    39: invokespecial   com/whatsapp/AlarmService.f:()V
        //    42: invokestatic    android/content/res/Resources.getSystem:()Landroid/content/res/Resources;
        //    45: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    48: bipush          46
        //    50: aaload         
        //    51: aconst_null    
        //    52: aconst_null    
        //    53: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //    56: istore_2       
        //    57: iload_2        
        //    58: ifne            81
        //    61: aload_0        
        //    62: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    65: bipush          45
        //    67: aaload         
        //    68: putfield        com/whatsapp/AlarmService.a:Ljava/lang/String;
        //    71: getstatic       com/whatsapp/App.I:Z
        //    74: istore          6
        //    76: iload           6
        //    78: ifeq            122
        //    81: aload_0        
        //    82: invokevirtual   com/whatsapp/AlarmService.getResources:()Landroid/content/res/Resources;
        //    85: iload_2        
        //    86: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //    89: astore          4
        //    91: aload           4
        //    93: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    96: ifeq            116
        //    99: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   102: bipush          44
        //   104: aaload         
        //   105: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   108: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   111: bipush          50
        //   113: aaload         
        //   114: astore          4
        //   116: aload_0        
        //   117: aload           4
        //   119: putfield        com/whatsapp/AlarmService.a:Ljava/lang/String;
        //   122: new             Lcom/whatsapp/v9;
        //   125: dup            
        //   126: aload_0        
        //   127: invokespecial   com/whatsapp/v9.<init>:(Lcom/whatsapp/AlarmService;)V
        //   130: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //   133: return         
        //   134: astore          5
        //   136: aload           5
        //   138: athrow         
        //   139: astore_3       
        //   140: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   143: bipush          48
        //   145: aaload         
        //   146: aload_3        
        //   147: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   150: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   153: bipush          47
        //   155: aaload         
        //   156: astore          4
        //   158: goto            116
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  61     76     134    139    Landroid/content/res/Resources$NotFoundException;
        //  81     116    139    161    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0081:
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
    
    private void d() {
        ((AlarmManager)this.getSystemService(AlarmService.z[16])).setInexactRepeating(3, 0L, 3600000L, PendingIntent.getBroadcast((Context)this, 0, new Intent(AlarmService.z[15], (Uri)null, (Context)this, (Class)AlarmBroadcastReceiver.class), 0));
    }
    
    private void d(@Nullable final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    10: bipush          23
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    20: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    23: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    26: aload_0        
        //    27: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    30: bipush          19
        //    32: aaload         
        //    33: invokevirtual   com/whatsapp/AlarmService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    36: checkcast       Landroid/os/PowerManager;
        //    39: iconst_1       
        //    40: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    43: bipush          21
        //    45: aaload         
        //    46: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //    49: astore_2       
        //    50: aload_2        
        //    51: iconst_0       
        //    52: invokevirtual   android/os/PowerManager$WakeLock.setReferenceCounted:(Z)V
        //    55: aload_2        
        //    56: ldc2_w          300000
        //    59: invokevirtual   android/os/PowerManager$WakeLock.acquire:(J)V
        //    62: getstatic       com/whatsapp/App.g:Lcom/whatsapp/util/dns/b;
        //    65: aload_0        
        //    66: getfield        com/whatsapp/AlarmService.a:Ljava/lang/String;
        //    69: invokevirtual   com/whatsapp/util/dns/b.d:(Ljava/lang/String;)Ljava/util/List;
        //    72: astore          5
        //    74: new             Lorg/N;
        //    77: dup            
        //    78: invokespecial   org/N.<init>:()V
        //    81: astore          6
        //    83: aload           6
        //    85: sipush          20000
        //    88: invokevirtual   org/N.a:(I)V
        //    91: aconst_null    
        //    92: astore          7
        //    94: aload           5
        //    96: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   101: astore          8
        //   103: aload           8
        //   105: invokeinterface java/util/Iterator.hasNext:()Z
        //   110: ifeq            144
        //   113: aload           8
        //   115: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   120: checkcast       Ljava/net/InetAddress;
        //   123: astore          16
        //   125: aload           6
        //   127: invokevirtual   org/N.a:()V
        //   130: aload           6
        //   132: aload           16
        //   134: invokevirtual   org/N.a:(Ljava/net/InetAddress;)Lorg/O;
        //   137: astore          7
        //   139: aload           6
        //   141: invokevirtual   org/N.c:()V
        //   144: aload           7
        //   146: ifnonnull       277
        //   149: new             Ljava/lang/StringBuilder;
        //   152: dup            
        //   153: invokespecial   java/lang/StringBuilder.<init>:()V
        //   156: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   159: bipush          17
        //   161: aaload         
        //   162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   165: aload_0        
        //   166: getfield        com/whatsapp/AlarmService.a:Ljava/lang/String;
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   175: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   178: aload_2        
        //   179: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   182: return         
        //   183: astore          4
        //   185: new             Ljava/lang/StringBuilder;
        //   188: dup            
        //   189: invokespecial   java/lang/StringBuilder.<init>:()V
        //   192: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   195: bipush          20
        //   197: aaload         
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: aload_0        
        //   202: getfield        com/whatsapp/AlarmService.a:Ljava/lang/String;
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: aload           4
        //   213: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   216: aload_2        
        //   217: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   220: return         
        //   221: astore          17
        //   223: new             Ljava/lang/StringBuilder;
        //   226: dup            
        //   227: invokespecial   java/lang/StringBuilder.<init>:()V
        //   230: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   233: bipush          22
        //   235: aaload         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: aload_0        
        //   240: getfield        com/whatsapp/AlarmService.a:Ljava/lang/String;
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   246: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   249: bipush          18
        //   251: aaload         
        //   252: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: aload           16
        //   257: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   260: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   263: aload           17
        //   265: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   268: getstatic       com/whatsapp/App.I:Z
        //   271: ifeq            103
        //   274: goto            144
        //   277: aload           7
        //   279: invokevirtual   org/O.b:()V
        //   282: aload           7
        //   284: invokevirtual   org/O.a:()Ljava/lang/Long;
        //   287: astore          9
        //   289: aload           9
        //   291: ifnull          332
        //   294: invokestatic    java/lang/System.currentTimeMillis:()J
        //   297: lstore          10
        //   299: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   302: lstore          12
        //   304: lload           10
        //   306: aload           9
        //   308: invokevirtual   java/lang/Long.longValue:()J
        //   311: ladd           
        //   312: lload           12
        //   314: lsub           
        //   315: lstore          14
        //   317: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //   320: new             Lcom/whatsapp/i_;
        //   323: dup            
        //   324: lload           14
        //   326: invokespecial   com/whatsapp/i_.<init>:(J)V
        //   329: invokevirtual   de/greenrobot/event/m.c:(Ljava/lang/Object;)V
        //   332: aload_2        
        //   333: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   336: return         
        //   337: astore_3       
        //   338: aload_2        
        //   339: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   342: aload_3        
        //   343: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  62     74     183    221    Ljava/net/UnknownHostException;
        //  62     74     337    344    Any
        //  74     91     337    344    Any
        //  94     103    337    344    Any
        //  103    125    337    344    Any
        //  125    144    221    277    Ljava/io/IOException;
        //  125    144    337    344    Any
        //  149    178    337    344    Any
        //  185    216    337    344    Any
        //  223    274    337    344    Any
        //  277    289    337    344    Any
        //  294    332    337    344    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0144:
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
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //     3: astore_1       
        //     4: aload_1        
        //     5: iconst_5       
        //     6: iconst_1       
        //     7: invokevirtual   java/util/Calendar.add:(II)V
        //    10: aload_1        
        //    11: bipush          14
        //    13: iconst_0       
        //    14: invokevirtual   java/util/Calendar.set:(II)V
        //    17: aload_1        
        //    18: bipush          13
        //    20: iconst_0       
        //    21: invokevirtual   java/util/Calendar.set:(II)V
        //    24: aload_1        
        //    25: bipush          12
        //    27: iconst_0       
        //    28: invokevirtual   java/util/Calendar.set:(II)V
        //    31: aload_1        
        //    32: bipush          11
        //    34: iconst_0       
        //    35: invokevirtual   java/util/Calendar.set:(II)V
        //    38: aload_1        
        //    39: invokevirtual   java/util/Calendar.getTimeInMillis:()J
        //    42: lstore_2       
        //    43: new             Ljava/lang/StringBuilder;
        //    46: dup            
        //    47: invokespecial   java/lang/StringBuilder.<init>:()V
        //    50: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    53: bipush          32
        //    55: aaload         
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: new             Ljava/util/Date;
        //    62: dup            
        //    63: lload_2        
        //    64: invokespecial   java/util/Date.<init>:(J)V
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    70: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    73: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    76: aload_0        
        //    77: iconst_0       
        //    78: new             Landroid/content/Intent;
        //    81: dup            
        //    82: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    85: bipush          33
        //    87: aaload         
        //    88: aconst_null    
        //    89: aload_0        
        //    90: ldc             Lcom/whatsapp/AlarmBroadcastReceiver;.class
        //    92: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V
        //    95: iconst_0       
        //    96: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //    99: astore          4
        //   101: aload_0        
        //   102: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   105: bipush          31
        //   107: aaload         
        //   108: invokevirtual   com/whatsapp/AlarmService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   111: checkcast       Landroid/app/AlarmManager;
        //   114: astore          5
        //   116: aload           5
        //   118: aload           4
        //   120: invokevirtual   android/app/AlarmManager.cancel:(Landroid/app/PendingIntent;)V
        //   123: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   126: istore          8
        //   128: iload           8
        //   130: bipush          19
        //   132: if_icmplt       150
        //   135: aload           5
        //   137: iconst_0       
        //   138: lload_2        
        //   139: aload           4
        //   141: invokevirtual   android/app/AlarmManager.setExact:(IJLandroid/app/PendingIntent;)V
        //   144: getstatic       com/whatsapp/App.I:Z
        //   147: ifeq            170
        //   150: aload           5
        //   152: iconst_0       
        //   153: lload_2        
        //   154: aload           4
        //   156: invokevirtual   android/app/AlarmManager.set:(IJLandroid/app/PendingIntent;)V
        //   159: return         
        //   160: astore          6
        //   162: aload           6
        //   164: athrow         
        //   165: astore          7
        //   167: aload           7
        //   169: athrow         
        //   170: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  116    128    160    165    Landroid/content/res/Resources$NotFoundException;
        //  135    150    165    170    Landroid/content/res/Resources$NotFoundException;
        //  150    159    165    170    Landroid/content/res/Resources$NotFoundException;
        //  162    165    165    170    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0150:
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
    
    private void e(@Nullable final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    14: iconst_4       
        //    15: aaload         
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    19: aload_1        
        //    20: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    23: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    26: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    29: aload_0        
        //    30: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    33: iconst_5       
        //    34: aaload         
        //    35: invokevirtual   com/whatsapp/AlarmService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    38: checkcast       Landroid/os/PowerManager;
        //    41: astore_3       
        //    42: aload_3        
        //    43: iconst_1       
        //    44: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    47: bipush          9
        //    49: aaload         
        //    50: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //    53: astore          4
        //    55: aload           4
        //    57: iconst_0       
        //    58: invokevirtual   android/os/PowerManager$WakeLock.setReferenceCounted:(Z)V
        //    61: aload           4
        //    63: ldc2_w          600000
        //    66: invokevirtual   android/os/PowerManager$WakeLock.acquire:(J)V
        //    69: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //    72: astore          6
        //    74: aload           6
        //    76: ifnull          88
        //    79: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    82: invokevirtual   com/whatsapp/vy.f:()Z
        //    85: ifne            101
        //    88: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    91: bipush          8
        //    93: aaload         
        //    94: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    97: iload_2        
        //    98: ifeq            272
        //   101: getstatic       com/whatsapp/App.G:Z
        //   104: istore          12
        //   106: iload           12
        //   108: ifeq            128
        //   111: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   114: bipush          6
        //   116: aaload         
        //   117: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   120: iconst_1       
        //   121: putstatic       com/whatsapp/App.aJ:Z
        //   124: iload_2        
        //   125: ifeq            272
        //   128: getstatic       com/whatsapp/App.o:Z
        //   131: istore          13
        //   133: iload           13
        //   135: ifeq            155
        //   138: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   141: bipush          10
        //   143: aaload         
        //   144: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   147: iconst_0       
        //   148: putstatic       com/whatsapp/App.aJ:Z
        //   151: iload_2        
        //   152: ifeq            272
        //   155: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //   158: ldc_w           Lcom/whatsapp/b5;.class
        //   161: invokevirtual   de/greenrobot/event/m.a:(Ljava/lang/Class;)Ljava/lang/Object;
        //   164: checkcast       Lcom/whatsapp/b5;
        //   167: astore          14
        //   169: aload           14
        //   171: ifnull          203
        //   174: aload           14
        //   176: invokevirtual   com/whatsapp/b5.c:()Z
        //   179: istore          19
        //   181: iload           19
        //   183: ifne            203
        //   186: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   189: bipush          11
        //   191: aaload         
        //   192: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   195: iconst_1       
        //   196: putstatic       com/whatsapp/App.aJ:Z
        //   199: iload_2        
        //   200: ifeq            272
        //   203: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   206: bipush          7
        //   208: aaload         
        //   209: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   212: iconst_0       
        //   213: putstatic       com/whatsapp/App.aJ:Z
        //   216: new             Lcom/whatsapp/vq;
        //   219: dup            
        //   220: iconst_1       
        //   221: invokespecial   com/whatsapp/vq.<init>:(Z)V
        //   224: iconst_0       
        //   225: anewarray       Ljava/lang/Void;
        //   228: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   231: pop            
        //   232: aload_3        
        //   233: iconst_1       
        //   234: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   237: bipush          12
        //   239: aaload         
        //   240: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //   243: astore          16
        //   245: aload           16
        //   247: iconst_0       
        //   248: invokevirtual   android/os/PowerManager$WakeLock.setReferenceCounted:(Z)V
        //   251: aload           16
        //   253: ldc2_w          120000
        //   256: invokevirtual   android/os/PowerManager$WakeLock.acquire:(J)V
        //   259: new             Lcom/whatsapp/a01;
        //   262: dup            
        //   263: aload_0        
        //   264: aload           16
        //   266: invokespecial   com/whatsapp/a01.<init>:(Lcom/whatsapp/AlarmService;Landroid/os/PowerManager$WakeLock;)V
        //   269: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //   272: aload_0        
        //   273: invokespecial   com/whatsapp/AlarmService.a:()V
        //   276: aload           4
        //   278: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   281: return         
        //   282: astore          7
        //   284: aload           7
        //   286: athrow         
        //   287: astore          8
        //   289: aload           8
        //   291: athrow         
        //   292: astore          9
        //   294: aload           9
        //   296: athrow         
        //   297: astore          10
        //   299: aload           10
        //   301: athrow         
        //   302: astore          11
        //   304: aload           11
        //   306: athrow         
        //   307: astore          5
        //   309: aload           4
        //   311: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   314: aload           5
        //   316: athrow         
        //   317: astore          17
        //   319: aload           17
        //   321: athrow         
        //   322: astore          18
        //   324: aload           18
        //   326: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  69     74     307    317    Any
        //  79     88     282    287    Landroid/content/res/Resources$NotFoundException;
        //  79     88     307    317    Any
        //  88     97     282    287    Landroid/content/res/Resources$NotFoundException;
        //  88     97     307    317    Any
        //  101    106    287    292    Landroid/content/res/Resources$NotFoundException;
        //  101    106    307    317    Any
        //  111    124    292    297    Landroid/content/res/Resources$NotFoundException;
        //  111    124    307    317    Any
        //  128    133    297    302    Landroid/content/res/Resources$NotFoundException;
        //  128    133    307    317    Any
        //  138    151    302    307    Landroid/content/res/Resources$NotFoundException;
        //  138    151    307    317    Any
        //  155    169    307    317    Any
        //  174    181    317    322    Landroid/content/res/Resources$NotFoundException;
        //  174    181    307    317    Any
        //  186    199    322    327    Landroid/content/res/Resources$NotFoundException;
        //  186    199    307    317    Any
        //  203    272    307    317    Any
        //  272    276    307    317    Any
        //  284    287    287    292    Landroid/content/res/Resources$NotFoundException;
        //  284    287    307    317    Any
        //  289    292    292    297    Landroid/content/res/Resources$NotFoundException;
        //  289    292    307    317    Any
        //  294    297    297    302    Landroid/content/res/Resources$NotFoundException;
        //  294    297    307    317    Any
        //  299    302    302    307    Landroid/content/res/Resources$NotFoundException;
        //  299    302    307    317    Any
        //  304    307    307    317    Any
        //  319    322    322    327    Landroid/content/res/Resources$NotFoundException;
        //  319    322    307    317    Any
        //  324    327    307    317    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 154, Size: 154
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
    
    private void f() {
        ((AlarmManager)this.getSystemService(AlarmService.z[60])).setInexactRepeating(3, 0L, 43200000L, PendingIntent.getBroadcast((Context)this, 0, new Intent(AlarmService.z[59], (Uri)null, (Context)this, (Class)AlarmBroadcastReceiver.class), 0));
    }
    
    protected void onHandleIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnonnull       23
        //     8: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    11: bipush          53
        //    13: aaload         
        //    14: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    17: return         
        //    18: astore          24
        //    20: aload           24
        //    22: athrow         
        //    23: aload_1        
        //    24: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    27: ifnonnull       48
        //    30: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //    33: bipush          56
        //    35: aaload         
        //    36: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    39: aload_1        
        //    40: invokestatic    com/whatsapp/AlarmBroadcastReceiver.completeWakefulIntent:(Landroid/content/Intent;)Z
        //    43: pop            
        //    44: return         
        //    45: astore_3       
        //    46: aload_3        
        //    47: athrow         
        //    48: aload_1        
        //    49: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    52: astore          4
        //    54: iconst_m1      
        //    55: istore          5
        //    57: aload           4
        //    59: invokevirtual   java/lang/String.hashCode:()I
        //    62: istore          7
        //    64: iload           7
        //    66: lookupswitch {
        //          -1693714720: 184
        //          -1621475587: 209
        //          -1516858669: 234
        //          -452751660: 259
        //          822666429: 284
        //          default: 116
        //        }
        //   116: iload           5
        //   118: tableswitch {
        //                0: 333
        //                1: 342
        //                2: 351
        //                3: 360
        //                4: 369
        //          default: 152
        //        }
        //   152: new             Ljava/lang/StringBuilder;
        //   155: dup            
        //   156: invokespecial   java/lang/StringBuilder.<init>:()V
        //   159: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   162: bipush          52
        //   164: aaload         
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: aload_1        
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   172: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   175: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   178: aload_1        
        //   179: invokestatic    com/whatsapp/AlarmBroadcastReceiver.completeWakefulIntent:(Landroid/content/Intent;)Z
        //   182: pop            
        //   183: return         
        //   184: aload           4
        //   186: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   189: bipush          55
        //   191: aaload         
        //   192: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   195: istore          22
        //   197: iload           22
        //   199: ifeq            116
        //   202: iconst_0       
        //   203: istore          5
        //   205: iload_2        
        //   206: ifeq            116
        //   209: aload           4
        //   211: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   214: bipush          57
        //   216: aaload         
        //   217: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   220: istore          21
        //   222: iload           21
        //   224: ifeq            116
        //   227: iconst_1       
        //   228: istore          5
        //   230: iload_2        
        //   231: ifeq            116
        //   234: aload           4
        //   236: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   239: bipush          58
        //   241: aaload         
        //   242: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   245: istore          19
        //   247: iload           19
        //   249: ifeq            116
        //   252: iconst_2       
        //   253: istore          5
        //   255: iload_2        
        //   256: ifeq            116
        //   259: aload           4
        //   261: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   264: bipush          54
        //   266: aaload         
        //   267: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   270: istore          17
        //   272: iload           17
        //   274: ifeq            116
        //   277: iconst_3       
        //   278: istore          5
        //   280: iload_2        
        //   281: ifeq            116
        //   284: aload           4
        //   286: getstatic       com/whatsapp/AlarmService.z:[Ljava/lang/String;
        //   289: bipush          51
        //   291: aaload         
        //   292: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   295: istore          9
        //   297: iload           9
        //   299: ifeq            116
        //   302: iconst_4       
        //   303: istore          5
        //   305: goto            116
        //   308: astore          6
        //   310: aload           6
        //   312: athrow         
        //   313: astore          20
        //   315: aload           20
        //   317: athrow         
        //   318: astore          18
        //   320: aload           18
        //   322: athrow         
        //   323: astore          16
        //   325: aload           16
        //   327: athrow         
        //   328: astore          8
        //   330: aload           8
        //   332: athrow         
        //   333: aload_0        
        //   334: aload_1        
        //   335: invokespecial   com/whatsapp/AlarmService.e:(Landroid/content/Intent;)V
        //   338: iload_2        
        //   339: ifeq            178
        //   342: aload_0        
        //   343: aload_1        
        //   344: invokespecial   com/whatsapp/AlarmService.b:(Landroid/content/Intent;)V
        //   347: iload_2        
        //   348: ifeq            178
        //   351: aload_0        
        //   352: aload_1        
        //   353: invokespecial   com/whatsapp/AlarmService.a:(Landroid/content/Intent;)V
        //   356: iload_2        
        //   357: ifeq            178
        //   360: aload_0        
        //   361: aload_1        
        //   362: invokespecial   com/whatsapp/AlarmService.c:(Landroid/content/Intent;)V
        //   365: iload_2        
        //   366: ifeq            178
        //   369: aload_0        
        //   370: aload_1        
        //   371: invokespecial   com/whatsapp/AlarmService.d:(Landroid/content/Intent;)V
        //   374: iload_2        
        //   375: ifeq            178
        //   378: goto            152
        //   381: astore          15
        //   383: aload           15
        //   385: athrow         
        //   386: astore          14
        //   388: aload           14
        //   390: athrow         
        //   391: astore          13
        //   393: aload           13
        //   395: athrow         
        //   396: astore          12
        //   398: aload           12
        //   400: athrow         
        //   401: astore          10
        //   403: aload           10
        //   405: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  8      17     18     23     Landroid/content/res/Resources$NotFoundException;
        //  23     44     45     48     Landroid/content/res/Resources$NotFoundException;
        //  57     64     308    313    Landroid/content/res/Resources$NotFoundException;
        //  152    178    401    406    Landroid/content/res/Resources$NotFoundException;
        //  184    197    308    313    Landroid/content/res/Resources$NotFoundException;
        //  209    222    313    318    Landroid/content/res/Resources$NotFoundException;
        //  234    247    318    323    Landroid/content/res/Resources$NotFoundException;
        //  259    272    323    328    Landroid/content/res/Resources$NotFoundException;
        //  284    297    328    333    Landroid/content/res/Resources$NotFoundException;
        //  333    338    381    386    Landroid/content/res/Resources$NotFoundException;
        //  342    347    386    391    Landroid/content/res/Resources$NotFoundException;
        //  351    356    391    396    Landroid/content/res/Resources$NotFoundException;
        //  360    365    396    401    Landroid/content/res/Resources$NotFoundException;
        //  369    374    401    406    Landroid/content/res/Resources$NotFoundException;
        //  383    386    386    391    Landroid/content/res/Resources$NotFoundException;
        //  388    391    391    396    Landroid/content/res/Resources$NotFoundException;
        //  393    396    396    401    Landroid/content/res/Resources$NotFoundException;
        //  398    401    401    406    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 168, Size: 168
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
}
