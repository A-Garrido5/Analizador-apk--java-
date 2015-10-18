// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.by;
import com.whatsapp.util.Log;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat$Action;
import com.whatsapp.App;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat$Builder;
import android.support.v4.app.NotificationManagerCompat;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import android.content.BroadcastReceiver;

public final class ae implements cs
{
    private static final String[] z;
    private int a;
    private final Object b;
    private long c;
    private BroadcastReceiver d;
    private BroadcastReceiver e;
    private int f;
    private BroadcastReceiver g;
    private BroadcastReceiver h;
    private final AtomicReference i;
    private final Context j;
    private final NotificationManagerCompat k;
    private boolean l;
    private int m;
    private NotificationCompat$Builder n;
    
    static {
        final String[] z2 = new String[32];
        String s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0007y\\QP\u00135OMGZkMAT\u0005|\u0004W[\u001aw\\LA\u0012|";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0832:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = 'w';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = ')';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0007jLR\u0018\u0007jFEG\u0012kZ\u0002\u0010\u00137\fF\u0015_=M\u0007\u0010^";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0012vH@Y\u0012GKCV\u001cmY}Z\u0001}[}V\u0012tEWY\u0016j";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0007y\\QP\u00135^KS\u001e5\\LT\u0001y@NT\u0015tL";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0012vH@Y\u0012GKCV\u001cmY}Z\u0001}[}V\u0012tEWY\u0016j";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0004{[WWZk]CG\u0003";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006PP\u0004lFPPZhHWF\u0012|\u0004QQ\u0014y[F\u0018\u0002vDM@\u0019lLF";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006OP\u0013qH\u000fG\u0012k]MG\u00125LPG\u0018j\u0006";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0012vH@Y\u0012G[GF\u0003w[Gj\u0018nLPj\u001bw^}W\u0016l]GG\u000e";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006PP\u0004lFPPZhHWF\u0012|\u0004DZ\u00055KCA\u0003}[[";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0012vH@Y\u0012G[GF\u0003w[Gj\u0018nLPj\u001bw^}W\u0016l]GG\u000e";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006PP\u0004lFPPZhHWF\u0012|\u0004QQ\u0014y[F\u0018\u001aqZQ\\\u0019\u007f";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0007y\\QP\u00135OMGZkMAT\u0005|\u0004O\\\u0004k@LR";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0012j[MGX";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0012vH@Y\u0012GKCV\u001cmY}Z\u0001}[}Y\u0018ov@T\u0003lLPL";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0012vH@Y\u0012GKCV\u001cmY}Z\u0001}[}Y\u0018ov@T\u0003lLPL";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0007y\\QP\u00135OMGZtFU\u0018\u0015y]VP\u0005a";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0007jLR\u0018\u0004lHPA";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0007y\\QP\u00135OMGZ|HVTZ{FL[\u0012{]KZ\u0019";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006PP\u0004lFPPZhHWF\u0012|\u0004FT\u0003y\u0004W[\u0016nHKY\u0016zEG";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0012vM";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006PP\u0004lFPPZh[MR\u0005}ZQ\u0015";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "WzPVP\u00048\u0001";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "WzPVP\u00048OC\\\u001b}M\u000b\u001b";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006PP\u0004lFPPZhHWF\u0012|\u0004U\\\u0011q\u0004W[\u0016nHKY\u0016zEG";
                    n = 23;
                    n2 = 24;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    array = z2;
                    s = "\u0012vH@Y\u0012G[GF\u0003w[Gj\u0018nLPj\u0014}EN@\u001by[";
                    n = 24;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0012vH@Y\u0012G[GF\u0003w[Gj\u0018nLPj\u0014}EN@\u001by[";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0002vLZE\u0012{]GQWnHN@\u00128OMGWh[MR\u0005}ZQ\u0015\u0015y[\u0002F\u0003aEG";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0011y@NP\u0013";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0004mJAP\u0004k";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006PP\u0004lFPPZ}GF\u001a";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u0010|[KC\u00125GMA\u001e~@AT\u0003qFL\u0018\u001ayGCR\u0012j\u0006@T\u0014s\\R\u0018\u0007jFEG\u0012kZ\u0002\u0010\u00137\fF\u0015_=M\u0007\u0010^";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    break Label_0832;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ae(@NonNull final Context j) {
        this.i = new AtomicReference((V)10);
        this.b = new bz(this);
        this.j = j;
        this.k = NotificationManagerCompat.from((Context)App.aq);
        this.i();
    }
    
    static int a(final ae ae) {
        return ae.m;
    }
    
    private void a(@NonNull final String p0, @NonNull final String p1, @ch final int p2, final int p3, final boolean p4, final boolean p5, final boolean p6, @Nullable final NotificationCompat$Action p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //     3: istore          9
        //     5: iload           5
        //     7: ifeq            23
        //    10: aload_0        
        //    11: getfield        com/whatsapp/gdrive/ae.k:Landroid/support/v4/app/NotificationManagerCompat;
        //    14: bipush          8
        //    16: invokevirtual   android/support/v4/app/NotificationManagerCompat.cancel:(I)V
        //    19: aload_0        
        //    20: invokespecial   com/whatsapp/gdrive/ae.i:()V
        //    23: iload_3        
        //    24: tableswitch {
        //                2: 93
        //                3: 127
        //                4: 109
        //          default: 52
        //        }
        //    52: new             Ljava/lang/IllegalStateException;
        //    55: dup            
        //    56: new             Ljava/lang/StringBuilder;
        //    59: dup            
        //    60: invokespecial   java/lang/StringBuilder.<init>:()V
        //    63: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    66: bipush          27
        //    68: aaload         
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: iload_3        
        //    73: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    79: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    82: athrow         
        //    83: astore          17
        //    85: aload           17
        //    87: athrow         
        //    88: astore          22
        //    90: aload           22
        //    92: athrow         
        //    93: aload_0        
        //    94: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //    97: iconst_0       
        //    98: iconst_0       
        //    99: iconst_0       
        //   100: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setProgress:(IIZ)Landroid/support/v4/app/NotificationCompat$Builder;
        //   103: pop            
        //   104: iload           9
        //   106: ifeq            145
        //   109: aload_0        
        //   110: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //   113: bipush          100
        //   115: iload           4
        //   117: iconst_0       
        //   118: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setProgress:(IIZ)Landroid/support/v4/app/NotificationCompat$Builder;
        //   121: pop            
        //   122: iload           9
        //   124: ifeq            145
        //   127: aload_0        
        //   128: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //   131: bipush          100
        //   133: iload           4
        //   135: iconst_1       
        //   136: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setProgress:(IIZ)Landroid/support/v4/app/NotificationCompat$Builder;
        //   139: pop            
        //   140: iload           9
        //   142: ifne            52
        //   145: aload_0        
        //   146: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //   149: iload           7
        //   151: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setAutoCancel:(Z)Landroid/support/v4/app/NotificationCompat$Builder;
        //   154: pop            
        //   155: aload_0        
        //   156: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //   159: iload           6
        //   161: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setOngoing:(Z)Landroid/support/v4/app/NotificationCompat$Builder;
        //   164: pop            
        //   165: aload_0        
        //   166: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //   169: aload_1        
        //   170: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentTitle:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   173: pop            
        //   174: aload_0        
        //   175: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //   178: aload_2        
        //   179: invokevirtual   android/support/v4/app/NotificationCompat$Builder.setContentText:(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   182: pop            
        //   183: aload           8
        //   185: ifnull          198
        //   188: aload_0        
        //   189: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //   192: aload           8
        //   194: invokevirtual   android/support/v4/app/NotificationCompat$Builder.addAction:(Landroid/support/v4/app/NotificationCompat$Action;)Landroid/support/v4/app/NotificationCompat$Builder;
        //   197: pop            
        //   198: aload_0        
        //   199: getfield        com/whatsapp/gdrive/ae.k:Landroid/support/v4/app/NotificationManagerCompat;
        //   202: bipush          8
        //   204: aload_0        
        //   205: getfield        com/whatsapp/gdrive/ae.n:Landroid/support/v4/app/NotificationCompat$Builder;
        //   208: invokevirtual   android/support/v4/app/NotificationCompat$Builder.build:()Landroid/app/Notification;
        //   211: invokevirtual   android/support/v4/app/NotificationManagerCompat.notify:(ILandroid/app/Notification;)V
        //   214: return         
        //   215: astore          20
        //   217: aload           20
        //   219: athrow         
        //   220: astore          18
        //   222: aload           18
        //   224: athrow         
        //   225: astore          11
        //   227: aload           11
        //   229: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  10     23     88     93     Ljava/lang/IllegalStateException;
        //  52     83     83     88     Ljava/lang/IllegalStateException;
        //  93     104    215    220    Ljava/lang/IllegalStateException;
        //  109    122    220    225    Ljava/lang/IllegalStateException;
        //  127    140    83     88     Ljava/lang/IllegalStateException;
        //  145    183    225    230    Ljava/lang/IllegalStateException;
        //  188    198    225    230    Ljava/lang/IllegalStateException;
        //  217    220    220    225    Ljava/lang/IllegalStateException;
        //  222    225    83     88     Ljava/lang/IllegalStateException;
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
    
    static Context b(final ae ae) {
        return ae.j;
    }
    
    static AtomicReference c(final ae ae) {
        return ae.i;
    }
    
    static NotificationManagerCompat d(final ae ae) {
        return ae.k;
    }
    
    private void i() {
        (this.n = new NotificationCompat$Builder((Context)App.aq)).setSmallIcon(2130838963);
        this.n.setContentIntent(PendingIntent.getActivity((Context)App.aq, 0, new Intent((Context)App.aq, (Class)SettingsGoogleDrive.class), 0));
        this.n.setColor(this.j.getResources().getColor(2131624025));
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(@ct final int n) {
    }
    
    @Override
    public void a(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifne            17
        //    11: return         
        //    12: astore          5
        //    14: aload           5
        //    16: athrow         
        //    17: aload_0        
        //    18: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    21: bipush          18
        //    23: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    26: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    29: checkcast       Ljava/lang/Integer;
        //    32: invokevirtual   java/lang/Integer.intValue:()I
        //    35: istore          8
        //    37: iload           8
        //    39: bipush          18
        //    41: if_icmpeq       11
        //    44: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    47: bipush          16
        //    49: aaload         
        //    50: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    53: aload_0        
        //    54: getfield        com/whatsapp/gdrive/ae.g:Landroid/content/BroadcastReceiver;
        //    57: ifnonnull       97
        //    60: aload_0        
        //    61: new             Lcom/whatsapp/gdrive/GoogleDriveNotificationManager$3;
        //    64: dup            
        //    65: aload_0        
        //    66: invokespecial   com/whatsapp/gdrive/GoogleDriveNotificationManager$3.<init>:(Lcom/whatsapp/gdrive/ae;)V
        //    69: putfield        com/whatsapp/gdrive/ae.g:Landroid/content/BroadcastReceiver;
        //    72: aload_0        
        //    73: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    76: aload_0        
        //    77: getfield        com/whatsapp/gdrive/ae.g:Landroid/content/BroadcastReceiver;
        //    80: new             Landroid/content/IntentFilter;
        //    83: dup            
        //    84: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    87: bipush          14
        //    89: aaload         
        //    90: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //    93: invokevirtual   android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //    96: pop            
        //    97: new             Landroid/content/Intent;
        //   100: dup            
        //   101: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //   104: bipush          15
        //   106: aaload         
        //   107: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   110: astore          10
        //   112: aload_0        
        //   113: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   116: iconst_0       
        //   117: aload           10
        //   119: iconst_0       
        //   120: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   123: astore          11
        //   125: new             Landroid/support/v4/app/NotificationCompat$Action;
        //   128: dup            
        //   129: ldc_w           2130838729
        //   132: aload_0        
        //   133: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   136: ldc_w           2131232042
        //   139: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   142: aload           11
        //   144: invokespecial   android/support/v4/app/NotificationCompat$Action.<init>:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
        //   147: astore          12
        //   149: lload_3        
        //   150: lconst_0       
        //   151: lcmp           
        //   152: ifle            221
        //   155: ldc2_w          100
        //   158: lload_1        
        //   159: lmul           
        //   160: lstore          14
        //   162: lload           14
        //   164: lload_3        
        //   165: ldiv           
        //   166: lstore          17
        //   168: lload           17
        //   170: l2i            
        //   171: istore          13
        //   173: aload_0        
        //   174: aload_0        
        //   175: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   178: ldc_w           2131232029
        //   181: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   184: aload_0        
        //   185: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   188: ldc_w           2131232047
        //   191: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   194: iconst_3       
        //   195: iload           13
        //   197: iconst_0       
        //   198: iconst_0       
        //   199: iconst_0       
        //   200: aload           12
        //   202: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   205: return         
        //   206: astore          7
        //   208: aload           7
        //   210: athrow         
        //   211: astore          9
        //   213: aload           9
        //   215: athrow         
        //   216: astore          16
        //   218: aload           16
        //   220: athrow         
        //   221: iconst_m1      
        //   222: istore          13
        //   224: goto            173
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      12     17     Ljava/lang/IllegalStateException;
        //  17     37     206    211    Ljava/lang/IllegalStateException;
        //  44     97     211    216    Ljava/lang/IllegalStateException;
        //  162    168    216    221    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 113, Size: 113
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
    public void a(final long p0, final long p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //     6: ldc_w           2131232057
        //     9: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    12: astore          8
        //    14: ldc2_w          100
        //    17: lload_1        
        //    18: lmul           
        //    19: lstore          9
        //    21: aload_0        
        //    22: lload           9
        //    24: lload           5
        //    26: ldiv           
        //    27: l2i            
        //    28: putfield        com/whatsapp/gdrive/ae.m:I
        //    31: aload_0        
        //    32: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    35: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    38: checkcast       Ljava/lang/Integer;
        //    41: invokevirtual   java/lang/Integer.intValue:()I
        //    44: istore          13
        //    46: iload           13
        //    48: bipush          24
        //    50: if_icmpne       96
        //    53: invokestatic    java/lang/System.currentTimeMillis:()J
        //    56: lstore          27
        //    58: aload_0        
        //    59: getfield        com/whatsapp/gdrive/ae.c:J
        //    62: lstore          29
        //    64: lload           27
        //    66: lload           29
        //    68: lsub           
        //    69: ldc2_w          500
        //    72: lcmp           
        //    73: ifge            96
        //    76: aload_0        
        //    77: monitorexit    
        //    78: return         
        //    79: astore          11
        //    81: aload           11
        //    83: athrow         
        //    84: astore          12
        //    86: aload           12
        //    88: athrow         
        //    89: astore          7
        //    91: aload_0        
        //    92: monitorexit    
        //    93: aload           7
        //    95: athrow         
        //    96: aload_0        
        //    97: invokestatic    java/lang/System.currentTimeMillis:()J
        //   100: putfield        com/whatsapp/gdrive/ae.c:J
        //   103: aload_0        
        //   104: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //   107: bipush          24
        //   109: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   112: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //   115: checkcast       Ljava/lang/Integer;
        //   118: invokevirtual   java/lang/Integer.intValue:()I
        //   121: istore          14
        //   123: iconst_0       
        //   124: istore          15
        //   126: iload           14
        //   128: bipush          24
        //   130: if_icmpeq       195
        //   133: iconst_1       
        //   134: istore          15
        //   136: new             Ljava/lang/StringBuilder;
        //   139: dup            
        //   140: invokespecial   java/lang/StringBuilder.<init>:()V
        //   143: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //   146: bipush          21
        //   148: aaload         
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: lload_1        
        //   153: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   156: ldc_w           "/"
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: lload           5
        //   164: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   167: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //   170: bipush          22
        //   172: aaload         
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: lload_3        
        //   177: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   180: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //   183: bipush          23
        //   185: aaload         
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   192: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   195: lload           5
        //   197: lconst_0       
        //   198: lcmp           
        //   199: ifle            389
        //   202: ldc2_w          100
        //   205: lload_1        
        //   206: lmul           
        //   207: lstore          22
        //   209: lload           22
        //   211: lload           5
        //   213: ldiv           
        //   214: lstore          25
        //   216: lload           25
        //   218: l2i            
        //   219: istore          16
        //   221: lload_3        
        //   222: lconst_0       
        //   223: lcmp           
        //   224: ifle            305
        //   227: aload_0        
        //   228: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   231: astore          20
        //   233: iconst_4       
        //   234: anewarray       Ljava/lang/Object;
        //   237: astore          21
        //   239: aload           21
        //   241: iconst_0       
        //   242: aload_0        
        //   243: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   246: lload_1        
        //   247: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   250: aastore        
        //   251: aload           21
        //   253: iconst_1       
        //   254: aload_0        
        //   255: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   258: lload           5
        //   260: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   263: aastore        
        //   264: aload           21
        //   266: iconst_2       
        //   267: aload_0        
        //   268: getfield        com/whatsapp/gdrive/ae.m:I
        //   271: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   274: aastore        
        //   275: aload           21
        //   277: iconst_3       
        //   278: aload_0        
        //   279: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   282: lload_3        
        //   283: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   286: aastore        
        //   287: aload           20
        //   289: ldc_w           2131232052
        //   292: aload           21
        //   294: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   297: astore          19
        //   299: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //   302: ifeq            365
        //   305: aload_0        
        //   306: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   309: astore          17
        //   311: iconst_3       
        //   312: anewarray       Ljava/lang/Object;
        //   315: astore          18
        //   317: aload           18
        //   319: iconst_0       
        //   320: aload_0        
        //   321: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   324: lload_1        
        //   325: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   328: aastore        
        //   329: aload           18
        //   331: iconst_1       
        //   332: aload_0        
        //   333: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   336: lload           5
        //   338: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   341: aastore        
        //   342: aload           18
        //   344: iconst_2       
        //   345: aload_0        
        //   346: getfield        com/whatsapp/gdrive/ae.m:I
        //   349: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   352: aastore        
        //   353: aload           17
        //   355: ldc_w           2131232046
        //   358: aload           18
        //   360: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   363: astore          19
        //   365: aload_0        
        //   366: aload           8
        //   368: aload           19
        //   370: iconst_3       
        //   371: iload           16
        //   373: iload           15
        //   375: iconst_1       
        //   376: iconst_0       
        //   377: aconst_null    
        //   378: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   381: goto            76
        //   384: astore          24
        //   386: aload           24
        //   388: athrow         
        //   389: iconst_m1      
        //   390: istore          16
        //   392: goto            221
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      14     89     96     Any
        //  21     46     79     84     Ljava/lang/IllegalStateException;
        //  21     46     89     96     Any
        //  53     64     84     89     Ljava/lang/IllegalStateException;
        //  53     64     89     96     Any
        //  81     84     84     89     Ljava/lang/IllegalStateException;
        //  81     84     89     96     Any
        //  86     89     89     96     Any
        //  96     123    89     96     Any
        //  136    195    89     96     Any
        //  209    216    384    389    Ljava/lang/IllegalStateException;
        //  209    216    89     96     Any
        //  227    305    89     96     Any
        //  305    365    89     96     Any
        //  365    381    89     96     Any
        //  386    389    89     96     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
    
    @Override
    public void a(final boolean b) {
    }
    
    @Override
    public void a(final boolean b, final long n, final long n2) {
        boolean b2 = false;
        Label_0069: {
            if (this.i.getAndSet(31) == 31) {
                b2 = false;
                break Label_0069;
            }
            while (true) {
                while (true) {
                    try {
                        final StringBuilder append = new StringBuilder().append(ae.z[30]);
                        if (b) {
                            final String s = ae.z[29];
                            Log.i(append.append(s).toString());
                            b2 = true;
                            if (n2 == 0L) {
                                return;
                            }
                            break;
                        }
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                    final String s = ae.z[28];
                    continue;
                }
            }
        }
        final String string = this.j.getString(2131232054);
        String s2 = null;
        Label_0203: {
            if (n > 0L) {
                s2 = this.j.getString(2131232045, new Object[] { by.a(this.j, n2), by.a(this.j, n) });
                if (GoogleDriveService.F == 0) {
                    break Label_0203;
                }
            }
            s2 = this.j.getString(2131232044, new Object[] { by.a(this.j, n2) });
        }
        this.a(string, s2, 1, -1, b2, false, true, null);
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public void b(@ct final int n) {
        if (n != 10) {
            try {
                if (this.i.getAndSet(25) != 25) {
                    Log.i(ae.z[7] + n);
                    this.a(this.j.getString(2131232053), this.j.getString(2131232043), 1, -1, false, false, true, null);
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public void b(final long n, final long n2) {
    }
    
    @Override
    public void b(final boolean b) {
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void c(@ct final int n) {
        while (true) {
            try {
                if (!this.l) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (this.i.getAndSet(15) != 15 && n != 10) {
                    Log.i(ae.z[13] + n);
                    this.a(this.j.getString(2131232017), this.j.getString(2131232010), 1, -1, false, false, true, null);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public void c(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifne            17
        //    11: return         
        //    12: astore          5
        //    14: aload           5
        //    16: athrow         
        //    17: aload_0        
        //    18: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    21: bipush          17
        //    23: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    26: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    29: checkcast       Ljava/lang/Integer;
        //    32: invokevirtual   java/lang/Integer.intValue:()I
        //    35: istore          8
        //    37: iload           8
        //    39: bipush          17
        //    41: if_icmpeq       11
        //    44: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    47: bipush          18
        //    49: aaload         
        //    50: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    53: lload_3        
        //    54: lconst_0       
        //    55: lcmp           
        //    56: ifle            115
        //    59: ldc2_w          100
        //    62: lload_1        
        //    63: lmul           
        //    64: lload_3        
        //    65: ldiv           
        //    66: lstore          10
        //    68: lload           10
        //    70: l2i            
        //    71: istore          12
        //    73: aload_0        
        //    74: aload_0        
        //    75: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    78: ldc_w           2131232029
        //    81: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    84: aload_0        
        //    85: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    88: ldc_w           2131232048
        //    91: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    94: iconst_3       
        //    95: iload           12
        //    97: iconst_0       
        //    98: iconst_0       
        //    99: iconst_0       
        //   100: aconst_null    
        //   101: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   104: return         
        //   105: astore          7
        //   107: aload           7
        //   109: athrow         
        //   110: astore          9
        //   112: aload           9
        //   114: athrow         
        //   115: iconst_m1      
        //   116: istore          12
        //   118: goto            73
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      12     17     Ljava/lang/IllegalStateException;
        //  17     37     105    110    Ljava/lang/IllegalStateException;
        //  44     53     110    115    Ljava/lang/IllegalStateException;
        //  59     68     110    115    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0073:
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
    
    @Override
    public void c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifne            13
        //     9: return         
        //    10: astore_2       
        //    11: aload_2        
        //    12: athrow         
        //    13: aload_0        
        //    14: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    17: bipush          23
        //    19: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    22: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    25: checkcast       Ljava/lang/Integer;
        //    28: invokevirtual   java/lang/Integer.intValue:()I
        //    31: istore          5
        //    33: iload           5
        //    35: bipush          23
        //    37: if_icmpeq       9
        //    40: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    43: bipush          20
        //    45: aaload         
        //    46: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    49: aload_0        
        //    50: iconst_0       
        //    51: putfield        com/whatsapp/gdrive/ae.a:I
        //    54: aload_0        
        //    55: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    58: astore          7
        //    60: iload_1        
        //    61: ifeq            107
        //    64: ldc_w           2131232018
        //    67: istore          8
        //    69: aload_0        
        //    70: aload           7
        //    72: iload           8
        //    74: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    77: aload_0        
        //    78: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    81: ldc_w           2131232010
        //    84: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    87: iconst_1       
        //    88: iconst_m1      
        //    89: iconst_0       
        //    90: iconst_0       
        //    91: iconst_1       
        //    92: aconst_null    
        //    93: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //    96: return         
        //    97: astore          4
        //    99: aload           4
        //   101: athrow         
        //   102: astore          6
        //   104: aload           6
        //   106: athrow         
        //   107: ldc_w           2131232017
        //   110: istore          8
        //   112: goto            69
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      10     13     Ljava/lang/IllegalStateException;
        //  13     33     97     102    Ljava/lang/IllegalStateException;
        //  40     60     102    107    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    @Override
    public void d() {
        this.k.cancel(8);
    }
    
    @Override
    public void d(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifne            13
        //     9: return         
        //    10: astore_2       
        //    11: aload_2        
        //    12: athrow         
        //    13: aload_0        
        //    14: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    17: bipush          22
        //    19: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    22: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    25: checkcast       Ljava/lang/Integer;
        //    28: invokevirtual   java/lang/Integer.intValue:()I
        //    31: istore          6
        //    33: iload           6
        //    35: bipush          22
        //    37: if_icmpne       63
        //    40: invokestatic    java/lang/System.currentTimeMillis:()J
        //    43: lstore          10
        //    45: aload_0        
        //    46: getfield        com/whatsapp/gdrive/ae.c:J
        //    49: lstore          12
        //    51: lload           10
        //    53: lload           12
        //    55: lsub           
        //    56: ldc2_w          500
        //    59: lcmp           
        //    60: iflt            9
        //    63: aload_0        
        //    64: invokestatic    java/lang/System.currentTimeMillis:()J
        //    67: putfield        com/whatsapp/gdrive/ae.c:J
        //    70: iload_1        
        //    71: bipush          10
        //    73: irem           
        //    74: ifne            77
        //    77: aload_0        
        //    78: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    81: ldc_w           2131232028
        //    84: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    87: astore          7
        //    89: aload_0        
        //    90: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    93: astore          8
        //    95: iconst_1       
        //    96: anewarray       Ljava/lang/Object;
        //    99: astore          9
        //   101: aload           9
        //   103: iconst_0       
        //   104: iload_1        
        //   105: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   108: aastore        
        //   109: aload_0        
        //   110: aload           7
        //   112: aload           8
        //   114: ldc_w           2131232101
        //   117: aload           9
        //   119: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   122: iconst_2       
        //   123: iload_1        
        //   124: iconst_0       
        //   125: iconst_1       
        //   126: iconst_0       
        //   127: aconst_null    
        //   128: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   131: return         
        //   132: astore          4
        //   134: aload           4
        //   136: athrow         
        //   137: astore          5
        //   139: aload           5
        //   141: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      10     13     Ljava/lang/IllegalStateException;
        //  13     33     132    137    Ljava/lang/IllegalStateException;
        //  40     51     137    142    Ljava/lang/IllegalStateException;
        //  134    137    137    142    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
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
    
    @Override
    public void d(final long n, final long n2) {
        try {
            if (this.i.getAndSet(27) == 27) {
                return;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Log.i(ae.z[19]);
        final String string = this.j.getString(2131232055);
        final String string2 = this.j.getString(2131232048);
        while (true) {
            Label_0111: {
                if (n2 <= 0L) {
                    break Label_0111;
                }
                final long n3 = 100L * n;
                try {
                    final int n4 = (int)(n3 / n2);
                    this.a(string, string2, 3, n4, true, false, true, null);
                    return;
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    public void d(final boolean l) {
        this.l = l;
    }
    
    @Override
    public void e() {
        while (true) {
            try {
                if (!this.l) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (this.i.getAndSet(11) != 11) {
                    Log.i(ae.z[17]);
                    this.a(this.j.getString(2131232028), this.j.getString(2131232015), 2, -1, false, true, false, null);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public void e(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: bipush          26
        //     6: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //     9: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    12: checkcast       Ljava/lang/Integer;
        //    15: invokevirtual   java/lang/Integer.intValue:()I
        //    18: istore          6
        //    20: iload           6
        //    22: bipush          26
        //    24: if_icmpne       33
        //    27: return         
        //    28: astore          5
        //    30: aload           5
        //    32: athrow         
        //    33: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    36: bipush          24
        //    38: aaload         
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/gdrive/ae.d:Landroid/content/BroadcastReceiver;
        //    46: ifnonnull       86
        //    49: aload_0        
        //    50: new             Lcom/whatsapp/gdrive/GoogleDriveNotificationManager$4;
        //    53: dup            
        //    54: aload_0        
        //    55: invokespecial   com/whatsapp/gdrive/GoogleDriveNotificationManager$4.<init>:(Lcom/whatsapp/gdrive/ae;)V
        //    58: putfield        com/whatsapp/gdrive/ae.d:Landroid/content/BroadcastReceiver;
        //    61: aload_0        
        //    62: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    65: aload_0        
        //    66: getfield        com/whatsapp/gdrive/ae.d:Landroid/content/BroadcastReceiver;
        //    69: new             Landroid/content/IntentFilter;
        //    72: dup            
        //    73: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    76: bipush          25
        //    78: aaload         
        //    79: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //    82: invokevirtual   android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //    85: pop            
        //    86: new             Landroid/content/Intent;
        //    89: dup            
        //    90: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    93: bipush          26
        //    95: aaload         
        //    96: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    99: astore          8
        //   101: aload_0        
        //   102: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   105: iconst_0       
        //   106: aload           8
        //   108: iconst_0       
        //   109: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   112: astore          9
        //   114: invokestatic    com/whatsapp/App.j:()I
        //   117: istore          10
        //   119: aconst_null    
        //   120: astore          11
        //   122: iload           10
        //   124: iconst_2       
        //   125: if_icmpne       152
        //   128: new             Landroid/support/v4/app/NotificationCompat$Action;
        //   131: dup            
        //   132: ldc_w           2130838729
        //   135: aload_0        
        //   136: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   139: ldc_w           2131232042
        //   142: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   145: aload           9
        //   147: invokespecial   android/support/v4/app/NotificationCompat$Action.<init>:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
        //   150: astore          11
        //   152: aload_0        
        //   153: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   156: ldc_w           2131232055
        //   159: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   162: astore          12
        //   164: aload_0        
        //   165: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   168: ldc_w           2131232051
        //   171: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   174: astore          13
        //   176: lload_3        
        //   177: lconst_0       
        //   178: lcmp           
        //   179: ifle            227
        //   182: ldc2_w          100
        //   185: lload_1        
        //   186: lmul           
        //   187: lstore          15
        //   189: lload           15
        //   191: lload_3        
        //   192: ldiv           
        //   193: lstore          18
        //   195: lload           18
        //   197: l2i            
        //   198: istore          14
        //   200: aload_0        
        //   201: aload           12
        //   203: aload           13
        //   205: iconst_3       
        //   206: iload           14
        //   208: iconst_1       
        //   209: iconst_0       
        //   210: iconst_1       
        //   211: aload           11
        //   213: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   216: return         
        //   217: astore          7
        //   219: aload           7
        //   221: athrow         
        //   222: astore          17
        //   224: aload           17
        //   226: athrow         
        //   227: iconst_m1      
        //   228: istore          14
        //   230: goto            200
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      20     28     33     Ljava/lang/IllegalStateException;
        //  33     86     217    222    Ljava/lang/IllegalStateException;
        //  189    195    222    227    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0200:
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
    
    @Override
    public void f() {
        while (true) {
            try {
                if (!this.l) {
                    return;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (this.i.getAndSet(21) != 21) {
                    Log.i(ae.z[5]);
                    this.a(this.j.getString(2131232028), this.j.getString(2131232100), 2, -1, false, true, false, null);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public void f(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifne            17
        //    11: return         
        //    12: astore          5
        //    14: aload           5
        //    16: athrow         
        //    17: aload_0        
        //    18: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    21: bipush          20
        //    23: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    26: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    29: checkcast       Ljava/lang/Integer;
        //    32: invokevirtual   java/lang/Integer.intValue:()I
        //    35: istore          8
        //    37: iload           8
        //    39: bipush          20
        //    41: if_icmpeq       11
        //    44: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    47: bipush          12
        //    49: aaload         
        //    50: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    53: lload_3        
        //    54: lconst_0       
        //    55: lcmp           
        //    56: ifle            115
        //    59: ldc2_w          100
        //    62: lload_1        
        //    63: lmul           
        //    64: lload_3        
        //    65: ldiv           
        //    66: lstore          10
        //    68: lload           10
        //    70: l2i            
        //    71: istore          12
        //    73: aload_0        
        //    74: aload_0        
        //    75: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    78: ldc_w           2131232029
        //    81: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    84: aload_0        
        //    85: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    88: ldc_w           2131232049
        //    91: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    94: iconst_3       
        //    95: iload           12
        //    97: iconst_0       
        //    98: iconst_0       
        //    99: iconst_0       
        //   100: aconst_null    
        //   101: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   104: return         
        //   105: astore          7
        //   107: aload           7
        //   109: athrow         
        //   110: astore          9
        //   112: aload           9
        //   114: athrow         
        //   115: iconst_m1      
        //   116: istore          12
        //   118: goto            73
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      12     17     Ljava/lang/IllegalStateException;
        //  17     37     105    110    Ljava/lang/IllegalStateException;
        //  44     53     110    115    Ljava/lang/IllegalStateException;
        //  59     68     110    115    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0073:
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
    
    public void g() {
        this.k.cancel(8);
    }
    
    @Override
    public void g(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifne            17
        //    11: return         
        //    12: astore          5
        //    14: aload           5
        //    16: athrow         
        //    17: aload_0        
        //    18: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    21: bipush          16
        //    23: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    26: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    29: checkcast       Ljava/lang/Integer;
        //    32: invokevirtual   java/lang/Integer.intValue:()I
        //    35: istore          8
        //    37: iload           8
        //    39: bipush          16
        //    41: if_icmpeq       11
        //    44: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    47: iconst_3       
        //    48: aaload         
        //    49: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    52: aload_0        
        //    53: getfield        com/whatsapp/gdrive/ae.e:Landroid/content/BroadcastReceiver;
        //    56: ifnonnull       95
        //    59: aload_0        
        //    60: new             Lcom/whatsapp/gdrive/GoogleDriveNotificationManager$2;
        //    63: dup            
        //    64: aload_0        
        //    65: invokespecial   com/whatsapp/gdrive/GoogleDriveNotificationManager$2.<init>:(Lcom/whatsapp/gdrive/ae;)V
        //    68: putfield        com/whatsapp/gdrive/ae.e:Landroid/content/BroadcastReceiver;
        //    71: aload_0        
        //    72: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    75: aload_0        
        //    76: getfield        com/whatsapp/gdrive/ae.e:Landroid/content/BroadcastReceiver;
        //    79: new             Landroid/content/IntentFilter;
        //    82: dup            
        //    83: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    86: iconst_4       
        //    87: aaload         
        //    88: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //    91: invokevirtual   android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //    94: pop            
        //    95: new             Landroid/content/Intent;
        //    98: dup            
        //    99: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //   102: iconst_2       
        //   103: aaload         
        //   104: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   107: astore          10
        //   109: aload_0        
        //   110: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   113: iconst_0       
        //   114: aload           10
        //   116: iconst_0       
        //   117: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   120: astore          11
        //   122: invokestatic    com/whatsapp/App.j:()I
        //   125: istore          12
        //   127: aconst_null    
        //   128: astore          13
        //   130: iload           12
        //   132: iconst_2       
        //   133: if_icmpne       160
        //   136: new             Landroid/support/v4/app/NotificationCompat$Action;
        //   139: dup            
        //   140: ldc_w           2130838729
        //   143: aload_0        
        //   144: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   147: ldc_w           2131232042
        //   150: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   153: aload           11
        //   155: invokespecial   android/support/v4/app/NotificationCompat$Action.<init>:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
        //   158: astore          13
        //   160: lload_3        
        //   161: lconst_0       
        //   162: lcmp           
        //   163: ifle            232
        //   166: ldc2_w          100
        //   169: lload_1        
        //   170: lmul           
        //   171: lstore          15
        //   173: lload           15
        //   175: lload_3        
        //   176: ldiv           
        //   177: lstore          18
        //   179: lload           18
        //   181: l2i            
        //   182: istore          14
        //   184: aload_0        
        //   185: aload_0        
        //   186: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   189: ldc_w           2131232029
        //   192: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   195: aload_0        
        //   196: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   199: ldc_w           2131232014
        //   202: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   205: iconst_3       
        //   206: iload           14
        //   208: iconst_1       
        //   209: iconst_0       
        //   210: iconst_0       
        //   211: aload           13
        //   213: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   216: return         
        //   217: astore          7
        //   219: aload           7
        //   221: athrow         
        //   222: astore          9
        //   224: aload           9
        //   226: athrow         
        //   227: astore          17
        //   229: aload           17
        //   231: athrow         
        //   232: iconst_m1      
        //   233: istore          14
        //   235: goto            184
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      12     17     Ljava/lang/IllegalStateException;
        //  17     37     217    222    Ljava/lang/IllegalStateException;
        //  44     95     222    227    Ljava/lang/IllegalStateException;
        //  173    179    227    232    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 120, Size: 120
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
    
    public void h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.d:Landroid/content/BroadcastReceiver;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          20
        //     9: aload_0        
        //    10: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    13: aload_0        
        //    14: getfield        com/whatsapp/gdrive/ae.d:Landroid/content/BroadcastReceiver;
        //    17: invokevirtual   android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    20: aload_0        
        //    21: getfield        com/whatsapp/gdrive/ae.g:Landroid/content/BroadcastReceiver;
        //    24: astore          4
        //    26: aload           4
        //    28: ifnull          42
        //    31: aload_0        
        //    32: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    35: aload_0        
        //    36: getfield        com/whatsapp/gdrive/ae.g:Landroid/content/BroadcastReceiver;
        //    39: invokevirtual   android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/gdrive/ae.h:Landroid/content/BroadcastReceiver;
        //    46: astore          6
        //    48: aload           6
        //    50: ifnull          64
        //    53: aload_0        
        //    54: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    57: aload_0        
        //    58: getfield        com/whatsapp/gdrive/ae.h:Landroid/content/BroadcastReceiver;
        //    61: invokevirtual   android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
        //    64: return         
        //    65: astore_1       
        //    66: aload_1        
        //    67: athrow         
        //    68: astore_3       
        //    69: aload_3        
        //    70: athrow         
        //    71: astore          5
        //    73: aload           5
        //    75: athrow         
        //    76: astore          7
        //    78: return         
        //    79: astore          8
        //    81: goto            42
        //    84: astore          9
        //    86: goto            20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      65     68     Ljava/lang/IllegalStateException;
        //  9      20     84     89     Ljava/lang/IllegalArgumentException;
        //  9      20     65     68     Ljava/lang/IllegalStateException;
        //  20     26     68     71     Ljava/lang/IllegalStateException;
        //  31     42     79     84     Ljava/lang/IllegalArgumentException;
        //  31     42     68     71     Ljava/lang/IllegalStateException;
        //  42     48     71     76     Ljava/lang/IllegalStateException;
        //  53     64     76     79     Ljava/lang/IllegalArgumentException;
        //  53     64     71     76     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
    
    @Override
    public void h(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifne            17
        //    11: return         
        //    12: astore          5
        //    14: aload           5
        //    16: athrow         
        //    17: aload_0        
        //    18: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    21: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    24: checkcast       Ljava/lang/Integer;
        //    27: invokevirtual   java/lang/Integer.intValue:()I
        //    30: bipush          12
        //    32: if_icmpeq       266
        //    35: iconst_1       
        //    36: istore          7
        //    38: aload_0        
        //    39: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    42: bipush          12
        //    44: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    47: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    50: checkcast       Ljava/lang/Integer;
        //    53: invokevirtual   java/lang/Integer.intValue:()I
        //    56: istore          10
        //    58: iload           10
        //    60: bipush          12
        //    62: if_icmpne       88
        //    65: invokestatic    java/lang/System.currentTimeMillis:()J
        //    68: lstore          23
        //    70: aload_0        
        //    71: getfield        com/whatsapp/gdrive/ae.c:J
        //    74: lstore          25
        //    76: lload           23
        //    78: lload           25
        //    80: lsub           
        //    81: ldc2_w          500
        //    84: lcmp           
        //    85: iflt            11
        //    88: aload_0        
        //    89: invokestatic    java/lang/System.currentTimeMillis:()J
        //    92: putfield        com/whatsapp/gdrive/ae.c:J
        //    95: aload_0        
        //    96: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    99: ldc_w           2131232028
        //   102: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   105: astore          11
        //   107: lload_3        
        //   108: lconst_0       
        //   109: lcmp           
        //   110: ifle            255
        //   113: ldc2_w          100
        //   116: lload_1        
        //   117: lmul           
        //   118: lstore          18
        //   120: lload           18
        //   122: lload_3        
        //   123: ldiv           
        //   124: lstore          21
        //   126: lload           21
        //   128: l2i            
        //   129: istore          12
        //   131: iload           12
        //   133: aload_0        
        //   134: getfield        com/whatsapp/gdrive/ae.f:I
        //   137: isub           
        //   138: ifle            195
        //   141: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //   144: iconst_1       
        //   145: aaload         
        //   146: astore          16
        //   148: iconst_3       
        //   149: anewarray       Ljava/lang/Object;
        //   152: astore          17
        //   154: aload           17
        //   156: iconst_0       
        //   157: lload_1        
        //   158: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   161: aastore        
        //   162: aload           17
        //   164: iconst_1       
        //   165: lload_3        
        //   166: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   169: aastore        
        //   170: aload           17
        //   172: iconst_2       
        //   173: iload           12
        //   175: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   178: aastore        
        //   179: aload           16
        //   181: aload           17
        //   183: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   186: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   189: aload_0        
        //   190: iload           12
        //   192: putfield        com/whatsapp/gdrive/ae.f:I
        //   195: aload_0        
        //   196: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   199: astore          14
        //   201: iconst_1       
        //   202: anewarray       Ljava/lang/Object;
        //   205: astore          15
        //   207: aload           15
        //   209: iconst_0       
        //   210: iload           12
        //   212: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   215: aastore        
        //   216: aload_0        
        //   217: aload           11
        //   219: aload           14
        //   221: ldc_w           2131232016
        //   224: aload           15
        //   226: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   229: iconst_2       
        //   230: iconst_m1      
        //   231: iload           7
        //   233: iconst_1       
        //   234: iconst_0       
        //   235: aconst_null    
        //   236: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   239: return         
        //   240: astore          8
        //   242: aload           8
        //   244: athrow         
        //   245: astore          9
        //   247: aload           9
        //   249: athrow         
        //   250: astore          20
        //   252: aload           20
        //   254: athrow         
        //   255: iconst_0       
        //   256: istore          12
        //   258: goto            131
        //   261: astore          13
        //   263: aload           13
        //   265: athrow         
        //   266: iconst_0       
        //   267: istore          7
        //   269: goto            38
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      12     17     Ljava/lang/IllegalStateException;
        //  38     58     240    245    Ljava/lang/IllegalStateException;
        //  65     76     245    250    Ljava/lang/IllegalStateException;
        //  120    126    250    255    Ljava/lang/IllegalStateException;
        //  131    195    261    266    Ljava/lang/IllegalStateException;
        //  242    245    245    250    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 140, Size: 140
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
    public void i(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifne            17
        //    11: return         
        //    12: astore          5
        //    14: aload           5
        //    16: athrow         
        //    17: aload_0        
        //    18: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    21: bipush          19
        //    23: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    26: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    29: checkcast       Ljava/lang/Integer;
        //    32: invokevirtual   java/lang/Integer.intValue:()I
        //    35: istore          8
        //    37: iload           8
        //    39: bipush          19
        //    41: if_icmpeq       11
        //    44: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    47: iconst_0       
        //    48: aaload         
        //    49: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    52: lload_3        
        //    53: lconst_0       
        //    54: lcmp           
        //    55: ifle            114
        //    58: ldc2_w          100
        //    61: lload_1        
        //    62: lmul           
        //    63: lload_3        
        //    64: ldiv           
        //    65: lstore          10
        //    67: lload           10
        //    69: l2i            
        //    70: istore          12
        //    72: aload_0        
        //    73: aload_0        
        //    74: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    77: ldc_w           2131232029
        //    80: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    83: aload_0        
        //    84: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    87: ldc_w           2131232050
        //    90: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    93: iconst_3       
        //    94: iload           12
        //    96: iconst_0       
        //    97: iconst_0       
        //    98: iconst_0       
        //    99: aconst_null    
        //   100: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   103: return         
        //   104: astore          7
        //   106: aload           7
        //   108: athrow         
        //   109: astore          9
        //   111: aload           9
        //   113: athrow         
        //   114: iconst_m1      
        //   115: istore          12
        //   117: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      12     17     Ljava/lang/IllegalStateException;
        //  17     37     104    109    Ljava/lang/IllegalStateException;
        //  44     52     109    114    Ljava/lang/IllegalStateException;
        //  58     67     109    114    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0072:
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
    
    @Override
    public void j(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.l:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifne            17
        //    11: return         
        //    12: astore          5
        //    14: aload           5
        //    16: athrow         
        //    17: aload_0        
        //    18: iconst_0       
        //    19: putfield        com/whatsapp/gdrive/ae.f:I
        //    22: aload_0        
        //    23: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    26: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    29: checkcast       Ljava/lang/Integer;
        //    32: invokevirtual   java/lang/Integer.intValue:()I
        //    35: bipush          14
        //    37: if_icmpeq       293
        //    40: iconst_1       
        //    41: istore          7
        //    43: aload_0        
        //    44: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //    47: bipush          14
        //    49: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    52: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    55: checkcast       Ljava/lang/Integer;
        //    58: invokevirtual   java/lang/Integer.intValue:()I
        //    61: istore          10
        //    63: iload           10
        //    65: bipush          14
        //    67: if_icmpeq       93
        //    70: invokestatic    java/lang/System.currentTimeMillis:()J
        //    73: lstore          21
        //    75: aload_0        
        //    76: getfield        com/whatsapp/gdrive/ae.c:J
        //    79: lstore          23
        //    81: lload           21
        //    83: lload           23
        //    85: lsub           
        //    86: ldc2_w          500
        //    89: lcmp           
        //    90: iflt            11
        //    93: aload_0        
        //    94: invokestatic    java/lang/System.currentTimeMillis:()J
        //    97: putfield        com/whatsapp/gdrive/ae.c:J
        //   100: lload_3        
        //   101: lconst_0       
        //   102: lcmp           
        //   103: ifle            282
        //   106: ldc2_w          100
        //   109: lload_1        
        //   110: lmul           
        //   111: lload_3        
        //   112: ldiv           
        //   113: lstore          12
        //   115: lload           12
        //   117: l2i            
        //   118: istore          14
        //   120: iload           14
        //   122: aload_0        
        //   123: getfield        com/whatsapp/gdrive/ae.a:I
        //   126: isub           
        //   127: ifle            185
        //   130: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //   133: bipush          31
        //   135: aaload         
        //   136: astore          19
        //   138: iconst_3       
        //   139: anewarray       Ljava/lang/Object;
        //   142: astore          20
        //   144: aload           20
        //   146: iconst_0       
        //   147: lload_1        
        //   148: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   151: aastore        
        //   152: aload           20
        //   154: iconst_1       
        //   155: lload_3        
        //   156: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   159: aastore        
        //   160: aload           20
        //   162: iconst_2       
        //   163: iload           14
        //   165: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   168: aastore        
        //   169: aload           19
        //   171: aload           20
        //   173: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   176: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   179: aload_0        
        //   180: iload           14
        //   182: putfield        com/whatsapp/gdrive/ae.a:I
        //   185: aload_0        
        //   186: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   189: ldc_w           2131232028
        //   192: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   195: astore          16
        //   197: aload_0        
        //   198: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   201: astore          17
        //   203: iconst_3       
        //   204: anewarray       Ljava/lang/Object;
        //   207: astore          18
        //   209: aload           18
        //   211: iconst_0       
        //   212: aload_0        
        //   213: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   216: lload_1        
        //   217: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   220: aastore        
        //   221: aload           18
        //   223: iconst_1       
        //   224: aload_0        
        //   225: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   228: lload_3        
        //   229: invokestatic    com/whatsapp/util/by.a:(Landroid/content/Context;J)Ljava/lang/String;
        //   232: aastore        
        //   233: aload           18
        //   235: iconst_2       
        //   236: iload           14
        //   238: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   241: aastore        
        //   242: aload_0        
        //   243: aload           16
        //   245: aload           17
        //   247: ldc_w           2131232124
        //   250: aload           18
        //   252: invokevirtual   android/content/Context.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   255: iconst_3       
        //   256: iload           14
        //   258: iload           7
        //   260: iconst_1       
        //   261: iconst_0       
        //   262: aconst_null    
        //   263: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   266: return         
        //   267: astore          8
        //   269: aload           8
        //   271: athrow         
        //   272: astore          9
        //   274: aload           9
        //   276: athrow         
        //   277: astore          11
        //   279: aload           11
        //   281: athrow         
        //   282: iconst_0       
        //   283: istore          14
        //   285: goto            120
        //   288: astore          15
        //   290: aload           15
        //   292: athrow         
        //   293: iconst_0       
        //   294: istore          7
        //   296: goto            43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      12     17     Ljava/lang/IllegalStateException;
        //  43     63     267    272    Ljava/lang/IllegalStateException;
        //  70     81     272    277    Ljava/lang/IllegalStateException;
        //  93     100    277    282    Ljava/lang/IllegalStateException;
        //  106    115    277    282    Ljava/lang/IllegalStateException;
        //  120    185    288    293    Ljava/lang/IllegalStateException;
        //  269    272    272    277    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 155, Size: 155
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
    public void k(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/ae.i:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: bipush          28
        //     6: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //     9: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //    12: checkcast       Ljava/lang/Integer;
        //    15: invokevirtual   java/lang/Integer.intValue:()I
        //    18: istore          6
        //    20: iload           6
        //    22: bipush          28
        //    24: if_icmpne       33
        //    27: return         
        //    28: astore          5
        //    30: aload           5
        //    32: athrow         
        //    33: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    36: bipush          9
        //    38: aaload         
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/gdrive/ae.h:Landroid/content/BroadcastReceiver;
        //    46: ifnonnull       86
        //    49: aload_0        
        //    50: new             Lcom/whatsapp/gdrive/GoogleDriveNotificationManager$5;
        //    53: dup            
        //    54: aload_0        
        //    55: invokespecial   com/whatsapp/gdrive/GoogleDriveNotificationManager$5.<init>:(Lcom/whatsapp/gdrive/ae;)V
        //    58: putfield        com/whatsapp/gdrive/ae.h:Landroid/content/BroadcastReceiver;
        //    61: aload_0        
        //    62: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //    65: aload_0        
        //    66: getfield        com/whatsapp/gdrive/ae.h:Landroid/content/BroadcastReceiver;
        //    69: new             Landroid/content/IntentFilter;
        //    72: dup            
        //    73: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    76: bipush          10
        //    78: aaload         
        //    79: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //    82: invokevirtual   android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //    85: pop            
        //    86: new             Landroid/content/Intent;
        //    89: dup            
        //    90: getstatic       com/whatsapp/gdrive/ae.z:[Ljava/lang/String;
        //    93: bipush          8
        //    95: aaload         
        //    96: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    99: astore          8
        //   101: aload_0        
        //   102: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   105: iconst_0       
        //   106: aload           8
        //   108: iconst_0       
        //   109: invokestatic    android/app/PendingIntent.getBroadcast:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //   112: astore          9
        //   114: new             Landroid/support/v4/app/NotificationCompat$Action;
        //   117: dup            
        //   118: ldc_w           2130838729
        //   121: aload_0        
        //   122: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   125: ldc_w           2131232042
        //   128: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   131: aload           9
        //   133: invokespecial   android/support/v4/app/NotificationCompat$Action.<init>:(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
        //   136: astore          10
        //   138: aload_0        
        //   139: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   142: ldc_w           2131232055
        //   145: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   148: astore          11
        //   150: aload_0        
        //   151: getfield        com/whatsapp/gdrive/ae.j:Landroid/content/Context;
        //   154: ldc_w           2131232047
        //   157: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   160: astore          12
        //   162: lload_3        
        //   163: lconst_0       
        //   164: lcmp           
        //   165: ifle            213
        //   168: ldc2_w          100
        //   171: lload_1        
        //   172: lmul           
        //   173: lstore          14
        //   175: lload           14
        //   177: lload_3        
        //   178: ldiv           
        //   179: lstore          17
        //   181: lload           17
        //   183: l2i            
        //   184: istore          13
        //   186: aload_0        
        //   187: aload           11
        //   189: aload           12
        //   191: iconst_3       
        //   192: iload           13
        //   194: iconst_0       
        //   195: iconst_0       
        //   196: iconst_1       
        //   197: aload           10
        //   199: invokespecial   com/whatsapp/gdrive/ae.a:(Ljava/lang/String;Ljava/lang/String;IIZZZLandroid/support/v4/app/NotificationCompat$Action;)V
        //   202: return         
        //   203: astore          7
        //   205: aload           7
        //   207: athrow         
        //   208: astore          16
        //   210: aload           16
        //   212: athrow         
        //   213: iconst_m1      
        //   214: istore          13
        //   216: goto            186
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      20     28     33     Ljava/lang/IllegalStateException;
        //  33     86     203    208    Ljava/lang/IllegalStateException;
        //  175    181    208    213    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0186:
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
    
    @Override
    public void l(final long n, final long n2) {
    }
    
    @Override
    public void m(final long n, final long n2) {
        try {
            if (this.i.getAndSet(29) == 29) {
                return;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Log.i(ae.z[6]);
        this.k.cancel(8);
        final String string = this.j.getString(2131232055);
        final String string2 = this.j.getString(2131232050);
        while (true) {
            Label_0120: {
                if (n2 <= 0L) {
                    break Label_0120;
                }
                final long n3 = 100L * n;
                try {
                    final int n4 = (int)(n3 / n2);
                    this.a(string, string2, 3, n4, true, false, true, null);
                    return;
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    @Override
    public void n(final long n, final long n2) {
        try {
            if (this.i.getAndSet(30) == 30) {
                return;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Log.i(ae.z[11]);
        final String string = this.j.getString(2131232055);
        final String string2 = this.j.getString(2131232049);
        while (true) {
            Label_0111: {
                if (n2 <= 0L) {
                    break Label_0111;
                }
                final long n3 = 100L * n;
                try {
                    final int n4 = (int)(n3 / n2);
                    this.a(string, string2, 3, n4, true, false, true, null);
                    return;
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
}
