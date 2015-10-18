// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import android.content.Intent;
import java.io.File;
import android.net.Uri;
import com.whatsapp.protocol.bi;
import android.content.Context;
import com.whatsapp.util.m;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.ar;
import android.graphics.drawable.Drawable;

public class ConversationRowImage extends ConversationRowMedia
{
    public static final Drawable O;
    private static ar P;
    private static final Drawable Q;
    public static final Drawable T;
    private static final String[] U;
    private final TextView J;
    private final View K;
    private final ConversationRowImage$RowImageView L;
    private final TextEmojiLabel M;
    private final View N;
    private final CircularProgressBar R;
    private ar S;
    
    static {
        final String[] u = new String[16];
        String s = "Jp*\u000erqc7\u0002sk";
        int n = -1;
        String[] array = u;
        int n2 = 0;
        String intern = null;
    Label_0432:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = '\u0005';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'k';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "ng:";
                    n2 = 1;
                    array = u;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "%d*\u0007y?";
                    n2 = 2;
                    array = u;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "%r1\u0004{wg0\u0018&";
                    n2 = 3;
                    array = u;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = u;
                    s = "%v:\u001by?";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "%o&\u000fud]0\u0002f`8";
                    n = 4;
                    n2 = 5;
                    array = u;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = u;
                    s = "%v*\u0006yvv\"\u0006l?";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "ok'";
                    n = 6;
                    array = u;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "sk&\u001cq`q0\n{`-c\rnjo\u001c\u0006y?";
                    n = 7;
                    array = u;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "%l\"\u0006y?";
                    n = 8;
                    array = u;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "%d*\u0007yVk9\u000e&";
                    n = 9;
                    array = u;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "dn&\u0019h";
                    n = 10;
                    array = u;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "%v1\nrvd&\u0019n`fy";
                    n = 11;
                    array = u;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "%w1\u0007&";
                    n = 12;
                    array = u;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "%v1\nrvd&\u0019nll$Q";
                    n = 13;
                    array = u;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "um0";
                    n = 14;
                    array = u;
                    continue;
                }
                case 14: {
                    break Label_0432;
                }
            }
        }
        array[n2] = intern;
        U = u;
        T = (Drawable)new m(App.aq.getApplicationContext().getResources().getDrawable(2130837608));
        O = (Drawable)new m(App.aq.getApplicationContext().getResources().getDrawable(2130837615));
        Q = (Drawable)new m(App.aq.getApplicationContext().getResources().getDrawable(2130837614));
        ConversationRowImage.P = new a60();
    }
    
    public ConversationRowImage(final Context context, final bi bi) {
        super(context, bi);
        this.S = new g8(this);
        this.J = (TextView)this.findViewById(2131755468);
        this.L = (ConversationRowImage$RowImageView)this.findViewById(2131755082);
        (this.R = (CircularProgressBar)this.findViewById(2131755163)).setProgressBarBackgroundColor(0);
        this.N = this.findViewById(2131755209);
        this.K = this.findViewById(2131755485);
        (this.M = (TextEmojiLabel)this.findViewById(2131755486)).setLinkHandler(new aav());
        this.M.setAutoLinkMask(0);
        this.M.setLinksClickable(false);
        this.M.setFocusable(false);
        this.M.setClickable(false);
        this.M.setLongClickable(false);
        this.b(bi);
    }
    
    static Drawable a() {
        return ConversationRowImage.Q;
    }
    
    static ConversationRowImage$RowImageView a(final ConversationRowImage conversationRowImage) {
        return conversationRowImage.L;
    }
    
    private void b(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: aload_1        
        //     7: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    10: checkcast       Lcom/whatsapp/MediaData;
        //    13: astore          4
        //    15: aload_0        
        //    16: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //    19: aconst_null    
        //    20: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.a:(Lcom/whatsapp/ConversationRowImage$RowImageView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
        //    23: pop            
        //    24: aload_0        
        //    25: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //    28: aload           4
        //    30: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.a:(Lcom/whatsapp/ConversationRowImage$RowImageView;Lcom/whatsapp/MediaData;)Lcom/whatsapp/MediaData;
        //    33: pop            
        //    34: aload           4
        //    36: getfield        com/whatsapp/MediaData.transferring:Z
        //    39: ifeq            267
        //    42: aload_0        
        //    43: getfield        com/whatsapp/ConversationRowImage.K:Landroid/view/View;
        //    46: iconst_0       
        //    47: invokevirtual   android/view/View.setVisibility:(I)V
        //    50: aload_0        
        //    51: getfield        com/whatsapp/ConversationRowImage.R:Lcom/whatsapp/CircularProgressBar;
        //    54: iconst_0       
        //    55: invokevirtual   com/whatsapp/CircularProgressBar.setVisibility:(I)V
        //    58: aload_0        
        //    59: getfield        com/whatsapp/ConversationRowImage.N:Landroid/view/View;
        //    62: iconst_0       
        //    63: invokevirtual   android/view/View.setVisibility:(I)V
        //    66: aload_0        
        //    67: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //    70: ldc             ""
        //    72: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    75: aload_0        
        //    76: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //    79: bipush          8
        //    81: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    84: aload_1        
        //    85: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    88: getfield        com/whatsapp/protocol/c6.b:Z
        //    91: istore          80
        //    93: iload           80
        //    95: ifeq            110
        //    98: aload_0        
        //    99: aload_0        
        //   100: getfield        com/whatsapp/ConversationRowImage.G:Lcom/whatsapp/util/co;
        //   103: invokevirtual   com/whatsapp/ConversationRowImage.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   106: iload_3        
        //   107: ifeq            115
        //   110: aload_0        
        //   111: aconst_null    
        //   112: invokevirtual   com/whatsapp/ConversationRowImage.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   115: aload_0        
        //   116: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   119: aload_0        
        //   120: getfield        com/whatsapp/ConversationRowImage.H:Lcom/whatsapp/util/co;
        //   123: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   126: aload_0        
        //   127: getfield        com/whatsapp/ConversationRowImage.R:Lcom/whatsapp/CircularProgressBar;
        //   130: aload_0        
        //   131: getfield        com/whatsapp/ConversationRowImage.H:Lcom/whatsapp/util/co;
        //   134: invokevirtual   com/whatsapp/CircularProgressBar.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   137: aload           4
        //   139: getfield        com/whatsapp/MediaData.progress:J
        //   142: l2i            
        //   143: istore          81
        //   145: aload           4
        //   147: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   150: ifnull          1544
        //   153: aload           4
        //   155: getfield        com/whatsapp/MediaData.transcoder:Lcom/whatsapp/wm;
        //   158: invokevirtual   com/whatsapp/wm.g:()Z
        //   161: istore          92
        //   163: iload           92
        //   165: ifeq            1544
        //   168: aload           4
        //   170: getfield        com/whatsapp/MediaData.uploader:Lcom/whatsapp/a9;
        //   173: astore          93
        //   175: aload           93
        //   177: ifnonnull       190
        //   180: iload           81
        //   182: iconst_2       
        //   183: idiv           
        //   184: istore          81
        //   186: iload_3        
        //   187: ifeq            1544
        //   190: bipush          50
        //   192: iload           81
        //   194: iconst_2       
        //   195: idiv           
        //   196: iadd           
        //   197: istore          84
        //   199: aload_0        
        //   200: getfield        com/whatsapp/ConversationRowImage.R:Lcom/whatsapp/CircularProgressBar;
        //   203: astore          86
        //   205: iload           84
        //   207: ifne            1311
        //   210: iload_2        
        //   211: istore          87
        //   213: aload           86
        //   215: iload           87
        //   217: invokevirtual   com/whatsapp/CircularProgressBar.setIndeterminate:(Z)V
        //   220: aload_0        
        //   221: getfield        com/whatsapp/ConversationRowImage.R:Lcom/whatsapp/CircularProgressBar;
        //   224: astore          89
        //   226: iload           84
        //   228: ifne            1322
        //   231: aload_0        
        //   232: invokevirtual   com/whatsapp/ConversationRowImage.getResources:()Landroid/content/res/Resources;
        //   235: ldc_w           2131624020
        //   238: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   241: istore          90
        //   243: iload           90
        //   245: istore          91
        //   247: aload           89
        //   249: iload           91
        //   251: invokevirtual   com/whatsapp/CircularProgressBar.setProgressBarColor:(I)V
        //   254: aload_0        
        //   255: getfield        com/whatsapp/ConversationRowImage.R:Lcom/whatsapp/CircularProgressBar;
        //   258: iload           84
        //   260: invokevirtual   com/whatsapp/CircularProgressBar.setProgress:(I)V
        //   263: iload_3        
        //   264: ifeq            586
        //   267: aload           4
        //   269: getfield        com/whatsapp/MediaData.transferred:Z
        //   272: istore          19
        //   274: iload           19
        //   276: ifne            321
        //   279: aload_1        
        //   280: getfield        com/whatsapp/protocol/bi.x:Z
        //   283: istore          77
        //   285: iload           77
        //   287: ifeq            390
        //   290: aload_1        
        //   291: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   294: getfield        com/whatsapp/protocol/c6.b:Z
        //   297: istore          78
        //   299: iload           78
        //   301: ifeq            390
        //   304: aload_1        
        //   305: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   308: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   311: invokestatic    com/whatsapp/a_9.f:(Ljava/lang/String;)Z
        //   314: istore          79
        //   316: iload           79
        //   318: ifne            390
        //   321: aload_0        
        //   322: getfield        com/whatsapp/ConversationRowImage.K:Landroid/view/View;
        //   325: bipush          8
        //   327: invokevirtual   android/view/View.setVisibility:(I)V
        //   330: aload_0        
        //   331: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   334: ldc_w           2131231484
        //   337: invokevirtual   android/widget/TextView.setText:(I)V
        //   340: aload_0        
        //   341: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   344: bipush          8
        //   346: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   349: aload_0        
        //   350: getfield        com/whatsapp/ConversationRowImage.R:Lcom/whatsapp/CircularProgressBar;
        //   353: bipush          8
        //   355: invokevirtual   com/whatsapp/CircularProgressBar.setVisibility:(I)V
        //   358: aload_0        
        //   359: getfield        com/whatsapp/ConversationRowImage.N:Landroid/view/View;
        //   362: bipush          8
        //   364: invokevirtual   android/view/View.setVisibility:(I)V
        //   367: aload_0        
        //   368: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   371: aload_0        
        //   372: getfield        com/whatsapp/ConversationRowImage.G:Lcom/whatsapp/util/co;
        //   375: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   378: aload_0        
        //   379: aload_0        
        //   380: getfield        com/whatsapp/ConversationRowImage.G:Lcom/whatsapp/util/co;
        //   383: invokevirtual   com/whatsapp/ConversationRowImage.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   386: iload_3        
        //   387: ifeq            586
        //   390: aload_0        
        //   391: getfield        com/whatsapp/ConversationRowImage.K:Landroid/view/View;
        //   394: iconst_0       
        //   395: invokevirtual   android/view/View.setVisibility:(I)V
        //   398: aload_0        
        //   399: getfield        com/whatsapp/ConversationRowImage.R:Lcom/whatsapp/CircularProgressBar;
        //   402: bipush          8
        //   404: invokevirtual   com/whatsapp/CircularProgressBar.setVisibility:(I)V
        //   407: aload_0        
        //   408: getfield        com/whatsapp/ConversationRowImage.N:Landroid/view/View;
        //   411: bipush          8
        //   413: invokevirtual   android/view/View.setVisibility:(I)V
        //   416: aload_0        
        //   417: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   420: iconst_0       
        //   421: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   424: aload_1        
        //   425: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   428: getfield        com/whatsapp/protocol/c6.b:Z
        //   431: istore          69
        //   433: iload           69
        //   435: ifeq            1382
        //   438: aload           4
        //   440: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   443: astore          75
        //   445: aload           75
        //   447: ifnonnull       1382
        //   450: aload_1        
        //   451: getfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   454: astore          76
        //   456: aload           76
        //   458: ifnull          1382
        //   461: iload_2        
        //   462: istore          70
        //   464: aload_1        
        //   465: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   468: getfield        com/whatsapp/protocol/c6.b:Z
        //   471: istore          74
        //   473: iload           74
        //   475: ifeq            529
        //   478: iload           70
        //   480: ifne            529
        //   483: aload_0        
        //   484: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   487: ldc_w           2131231609
        //   490: invokevirtual   android/widget/TextView.setText:(I)V
        //   493: aload_0        
        //   494: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   497: ldc_w           2130837687
        //   500: iconst_0       
        //   501: iconst_0       
        //   502: iconst_0       
        //   503: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //   506: aload_0        
        //   507: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   510: aload_0        
        //   511: getfield        com/whatsapp/ConversationRowImage.F:Lcom/whatsapp/util/co;
        //   514: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   517: aload_0        
        //   518: aload_0        
        //   519: getfield        com/whatsapp/ConversationRowImage.G:Lcom/whatsapp/util/co;
        //   522: invokevirtual   com/whatsapp/ConversationRowImage.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   525: iload_3        
        //   526: ifeq            578
        //   529: aload_0        
        //   530: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   533: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   536: aload_1        
        //   537: getfield        com/whatsapp/protocol/bi.L:J
        //   540: invokestatic    android/text/format/Formatter.formatShortFileSize:(Landroid/content/Context;J)Ljava/lang/String;
        //   543: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   546: aload_0        
        //   547: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   550: ldc_w           2130837630
        //   553: iconst_0       
        //   554: iconst_0       
        //   555: iconst_0       
        //   556: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //   559: aload_0        
        //   560: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   563: aload_0        
        //   564: getfield        com/whatsapp/ConversationRowImage.I:Lcom/whatsapp/util/co;
        //   567: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   570: aload_0        
        //   571: aload_0        
        //   572: getfield        com/whatsapp/ConversationRowImage.I:Lcom/whatsapp/util/co;
        //   575: invokevirtual   com/whatsapp/ConversationRowImage.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   578: aload_0        
        //   579: getfield        com/whatsapp/ConversationRowImage.J:Landroid/widget/TextView;
        //   582: iconst_0       
        //   583: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   586: aload_0        
        //   587: ldc_w           2131755487
        //   590: invokevirtual   com/whatsapp/ConversationRowImage.findViewById:(I)Landroid/view/View;
        //   593: astore          20
        //   595: aload_1        
        //   596: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   599: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   602: ifne            801
        //   605: aload_0        
        //   606: getfield        com/whatsapp/ConversationRowImage.M:Lcom/whatsapp/TextEmojiLabel;
        //   609: iconst_0       
        //   610: invokevirtual   com/whatsapp/TextEmojiLabel.setVisibility:(I)V
        //   613: invokestatic    com/whatsapp/App.ak:()Z
        //   616: ifeq            1538
        //   619: aload_1        
        //   620: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   623: bipush          10
        //   625: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //   628: istore          65
        //   630: iload           65
        //   632: ifle            1408
        //   635: aload_1        
        //   636: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   639: iload           65
        //   641: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   644: astore          68
        //   646: aload           68
        //   648: astore          66
        //   650: getstatic       com/whatsapp/alm.a:Landroid/support/v4/text/BidiFormatter;
        //   653: aload           66
        //   655: invokevirtual   android/support/v4/text/BidiFormatter.isRtl:(Ljava/lang/String;)Z
        //   658: ifne            1538
        //   661: aload           20
        //   663: bipush          -2
        //   665: iconst_0       
        //   666: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   669: bipush          -2
        //   671: iconst_0       
        //   672: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //   675: invokevirtual   android/view/View.measure:(II)V
        //   678: aload           20
        //   680: invokevirtual   android/view/View.getMeasuredWidth:()I
        //   683: istore          62
        //   685: aload_1        
        //   686: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   689: astore          63
        //   691: iload           62
        //   693: ifne            719
        //   696: new             Ljava/lang/StringBuilder;
        //   699: dup            
        //   700: invokespecial   java/lang/StringBuilder.<init>:()V
        //   703: aload           63
        //   705: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   708: ldc_w           "\n"
        //   711: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   714: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   717: astore          63
        //   719: aload_0        
        //   720: aload           63
        //   722: aload_0        
        //   723: getfield        com/whatsapp/ConversationRowImage.M:Lcom/whatsapp/TextEmojiLabel;
        //   726: iload           62
        //   728: aload_1        
        //   729: invokevirtual   com/whatsapp/ConversationRowImage.setMessageText:(Ljava/lang/String;Lcom/whatsapp/TextEmojiLabel;ILcom/whatsapp/protocol/bi;)V
        //   732: aload_0        
        //   733: getfield        com/whatsapp/ConversationRowImage.D:Landroid/widget/TextView;
        //   736: aload_0        
        //   737: invokevirtual   com/whatsapp/ConversationRowImage.getContext:()Landroid/content/Context;
        //   740: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   743: ldc_w           2131623982
        //   746: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   749: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   752: aload           20
        //   754: aload_0        
        //   755: invokevirtual   com/whatsapp/ConversationRowImage.getResources:()Landroid/content/res/Resources;
        //   758: ldc_w           2131361891
        //   761: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   764: iconst_0       
        //   765: aload_0        
        //   766: invokevirtual   com/whatsapp/ConversationRowImage.getResources:()Landroid/content/res/Resources;
        //   769: ldc_w           2131361891
        //   772: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   775: aload_0        
        //   776: invokevirtual   com/whatsapp/ConversationRowImage.getResources:()Landroid/content/res/Resources;
        //   779: ldc_w           2131361889
        //   782: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   785: invokevirtual   android/view/View.setPadding:(IIII)V
        //   788: aload_0        
        //   789: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //   792: iconst_0       
        //   793: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.a:(Lcom/whatsapp/ConversationRowImage$RowImageView;Z)Z
        //   796: pop            
        //   797: iload_3        
        //   798: ifeq            875
        //   801: aload_0        
        //   802: getfield        com/whatsapp/ConversationRowImage.M:Lcom/whatsapp/TextEmojiLabel;
        //   805: bipush          8
        //   807: invokevirtual   com/whatsapp/TextEmojiLabel.setVisibility:(I)V
        //   810: aload_0        
        //   811: getfield        com/whatsapp/ConversationRowImage.D:Landroid/widget/TextView;
        //   814: aload_0        
        //   815: invokevirtual   com/whatsapp/ConversationRowImage.getContext:()Landroid/content/Context;
        //   818: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   821: ldc_w           2131623983
        //   824: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   827: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   830: aload           20
        //   832: aload_0        
        //   833: invokevirtual   com/whatsapp/ConversationRowImage.getResources:()Landroid/content/res/Resources;
        //   836: ldc_w           2131361892
        //   839: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   842: iconst_0       
        //   843: aload_0        
        //   844: invokevirtual   com/whatsapp/ConversationRowImage.getResources:()Landroid/content/res/Resources;
        //   847: ldc_w           2131361892
        //   850: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   853: aload_0        
        //   854: invokevirtual   com/whatsapp/ConversationRowImage.getResources:()Landroid/content/res/Resources;
        //   857: ldc_w           2131361890
        //   860: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   863: invokevirtual   android/view/View.setPadding:(IIII)V
        //   866: aload_0        
        //   867: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //   870: iconst_1       
        //   871: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.a:(Lcom/whatsapp/ConversationRowImage$RowImageView;Z)Z
        //   874: pop            
        //   875: aload_0        
        //   876: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //   879: aload_1        
        //   880: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   883: getfield        com/whatsapp/protocol/c6.b:Z
        //   886: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.b:(Lcom/whatsapp/ConversationRowImage$RowImageView;Z)Z
        //   889: pop            
        //   890: aload_0        
        //   891: getfield        com/whatsapp/ConversationRowImage.D:Landroid/widget/TextView;
        //   894: ifnull          967
        //   897: aload_1        
        //   898: getfield        com/whatsapp/protocol/bi.x:Z
        //   901: istore          59
        //   903: iload           59
        //   905: ifeq            956
        //   908: aload_1        
        //   909: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   912: getfield        com/whatsapp/protocol/c6.b:Z
        //   915: istore          60
        //   917: iload           60
        //   919: ifeq            956
        //   922: aload_1        
        //   923: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   926: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   929: invokestatic    com/whatsapp/a_9.h:(Ljava/lang/String;)Z
        //   932: istore          61
        //   934: iload           61
        //   936: ifne            956
        //   939: aload_0        
        //   940: getfield        com/whatsapp/ConversationRowImage.D:Landroid/widget/TextView;
        //   943: ldc_w           2130837625
        //   946: iconst_0       
        //   947: iconst_0       
        //   948: iconst_0       
        //   949: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //   952: iload_3        
        //   953: ifeq            967
        //   956: aload_0        
        //   957: getfield        com/whatsapp/ConversationRowImage.D:Landroid/widget/TextView;
        //   960: iconst_0       
        //   961: iconst_0       
        //   962: iconst_0       
        //   963: iconst_0       
        //   964: invokevirtual   android/widget/TextView.setCompoundDrawablesWithIntrinsicBounds:(IIII)V
        //   967: new             Landroid/graphics/BitmapFactory$Options;
        //   970: dup            
        //   971: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   974: astore          29
        //   976: aload           29
        //   978: iconst_1       
        //   979: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   982: aload           4
        //   984: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   987: ifnull          1457
        //   990: aload           4
        //   992: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   995: invokevirtual   java/io/File.exists:()Z
        //   998: istore          58
        //  1000: iload           58
        //  1002: ifeq            1457
        //  1005: iload_2        
        //  1006: ifeq            1027
        //  1009: aload           4
        //  1011: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //  1014: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  1017: aload           29
        //  1019: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //  1022: pop            
        //  1023: iload_3        
        //  1024: ifeq            1090
        //  1027: aload_1        
        //  1028: getfield        com/whatsapp/protocol/bi.n:I
        //  1031: ifne            1485
        //  1034: aload_1        
        //  1035: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //  1038: astore          50
        //  1040: aload           50
        //  1042: ifnull          1532
        //  1045: aload_1        
        //  1046: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //  1049: invokevirtual   java/lang/String.length:()I
        //  1052: istore          51
        //  1054: iload           51
        //  1056: ifle            1532
        //  1059: aload_1        
        //  1060: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //  1063: iconst_0       
        //  1064: invokestatic    android/backport/util/Base64.decode:(Ljava/lang/String;I)[B
        //  1067: astore          55
        //  1069: aload           55
        //  1071: astore          34
        //  1073: aload           34
        //  1075: ifnull          1090
        //  1078: aload           34
        //  1080: iconst_0       
        //  1081: aload           34
        //  1083: arraylength    
        //  1084: aload           29
        //  1086: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //  1089: pop            
        //  1090: aload           29
        //  1092: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //  1095: ifle            1233
        //  1098: aload           29
        //  1100: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //  1103: istore          39
        //  1105: iload           39
        //  1107: ifle            1233
        //  1110: iconst_0       
        //  1111: istore          40
        //  1113: iload_2        
        //  1114: ifeq            1147
        //  1117: new             Landroid/media/ExifInterface;
        //  1120: dup            
        //  1121: aload           4
        //  1123: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //  1126: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  1129: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //  1132: getstatic       com/whatsapp/ConversationRowImage.U:[Ljava/lang/String;
        //  1135: iconst_0       
        //  1136: aaload         
        //  1137: iconst_1       
        //  1138: invokevirtual   android/media/ExifInterface.getAttributeInt:(Ljava/lang/String;I)I
        //  1141: istore          47
        //  1143: iload           47
        //  1145: istore          40
        //  1147: iload           40
        //  1149: bipush          6
        //  1151: if_icmpeq       1161
        //  1154: iload           40
        //  1156: bipush          8
        //  1158: if_icmpne       1191
        //  1161: aload_0        
        //  1162: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1165: aload           29
        //  1167: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //  1170: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.a:(Lcom/whatsapp/ConversationRowImage$RowImageView;I)I
        //  1173: pop            
        //  1174: aload_0        
        //  1175: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1178: aload           29
        //  1180: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //  1183: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.b:(Lcom/whatsapp/ConversationRowImage$RowImageView;I)I
        //  1186: pop            
        //  1187: iload_3        
        //  1188: ifeq            1217
        //  1191: aload_0        
        //  1192: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1195: aload           29
        //  1197: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //  1200: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.a:(Lcom/whatsapp/ConversationRowImage$RowImageView;I)I
        //  1203: pop            
        //  1204: aload_0        
        //  1205: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1208: aload           29
        //  1210: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //  1213: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.b:(Lcom/whatsapp/ConversationRowImage$RowImageView;I)I
        //  1216: pop            
        //  1217: aload_1        
        //  1218: aload_0        
        //  1219: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1222: aload_0        
        //  1223: getfield        com/whatsapp/ConversationRowImage.S:Lcom/whatsapp/util/ar;
        //  1226: invokestatic    com/whatsapp/util/b.c:(Lcom/whatsapp/protocol/bi;Landroid/widget/ImageView;Lcom/whatsapp/util/ar;)V
        //  1229: iload_3        
        //  1230: ifeq            1273
        //  1233: aload_0        
        //  1234: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1237: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //  1240: getfield        com/whatsapp/vc.p:I
        //  1243: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.a:(Lcom/whatsapp/ConversationRowImage$RowImageView;I)I
        //  1246: pop            
        //  1247: aload_0        
        //  1248: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1251: aload_0        
        //  1252: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1255: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.a:(Lcom/whatsapp/ConversationRowImage$RowImageView;)I
        //  1258: invokestatic    com/whatsapp/ConversationRowImage$RowImageView.b:(Lcom/whatsapp/ConversationRowImage$RowImageView;I)I
        //  1261: pop            
        //  1262: aload_1        
        //  1263: aload_0        
        //  1264: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1267: getstatic       com/whatsapp/ConversationRowImage.P:Lcom/whatsapp/util/ar;
        //  1270: invokestatic    com/whatsapp/util/b.c:(Lcom/whatsapp/protocol/bi;Landroid/widget/ImageView;Lcom/whatsapp/util/ar;)V
        //  1273: aload_0        
        //  1274: getfield        com/whatsapp/ConversationRowImage.L:Lcom/whatsapp/ConversationRowImage$RowImageView;
        //  1277: invokevirtual   com/whatsapp/ConversationRowImage$RowImageView.requestLayout:()V
        //  1280: return         
        //  1281: astore          5
        //  1283: aload           5
        //  1285: athrow         
        //  1286: astore          6
        //  1288: aload           6
        //  1290: athrow         
        //  1291: astore          7
        //  1293: aload           7
        //  1295: athrow         
        //  1296: astore          82
        //  1298: aload           82
        //  1300: athrow         
        //  1301: astore          83
        //  1303: aload           83
        //  1305: athrow         
        //  1306: astore          85
        //  1308: aload           85
        //  1310: athrow         
        //  1311: iconst_0       
        //  1312: istore          87
        //  1314: goto            213
        //  1317: astore          88
        //  1319: aload           88
        //  1321: athrow         
        //  1322: aload_0        
        //  1323: invokevirtual   com/whatsapp/ConversationRowImage.getResources:()Landroid/content/res/Resources;
        //  1326: ldc_w           2131624019
        //  1329: invokevirtual   android/content/res/Resources.getColor:(I)I
        //  1332: istore          91
        //  1334: goto            247
        //  1337: astore          10
        //  1339: aload           10
        //  1341: athrow         
        //  1342: astore          11
        //  1344: aload           11
        //  1346: athrow         
        //  1347: astore          12
        //  1349: aload           12
        //  1351: athrow         
        //  1352: astore          13
        //  1354: aload           13
        //  1356: athrow         
        //  1357: astore          14
        //  1359: aload           14
        //  1361: athrow         
        //  1362: astore          15
        //  1364: aload           15
        //  1366: athrow         
        //  1367: astore          16
        //  1369: aload           16
        //  1371: athrow         
        //  1372: astore          17
        //  1374: aload           17
        //  1376: athrow         
        //  1377: astore          18
        //  1379: aload           18
        //  1381: athrow         
        //  1382: iconst_0       
        //  1383: istore          70
        //  1385: goto            464
        //  1388: astore          71
        //  1390: aload           71
        //  1392: athrow         
        //  1393: astore          72
        //  1395: aload           72
        //  1397: athrow         
        //  1398: astore          73
        //  1400: aload           73
        //  1402: athrow         
        //  1403: astore          67
        //  1405: aload           67
        //  1407: athrow         
        //  1408: aload_1        
        //  1409: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //  1412: astore          66
        //  1414: goto            650
        //  1417: astore          21
        //  1419: aload           21
        //  1421: athrow         
        //  1422: astore          23
        //  1424: aload           23
        //  1426: athrow         
        //  1427: astore          24
        //  1429: aload           24
        //  1431: athrow         
        //  1432: astore          25
        //  1434: aload           25
        //  1436: athrow         
        //  1437: astore          26
        //  1439: aload           26
        //  1441: athrow         
        //  1442: astore          27
        //  1444: aload           27
        //  1446: athrow         
        //  1447: astore          30
        //  1449: aload           30
        //  1451: athrow         
        //  1452: astore          31
        //  1454: aload           31
        //  1456: athrow         
        //  1457: iconst_0       
        //  1458: istore_2       
        //  1459: goto            1005
        //  1462: astore          56
        //  1464: aload           56
        //  1466: athrow         
        //  1467: astore          32
        //  1469: aload           32
        //  1471: athrow         
        //  1472: astore          33
        //  1474: aload           33
        //  1476: athrow         
        //  1477: astore          54
        //  1479: aconst_null    
        //  1480: astore          34
        //  1482: goto            1073
        //  1485: aload_1        
        //  1486: invokevirtual   com/whatsapp/protocol/bi.d:()[B
        //  1489: astore          34
        //  1491: goto            1073
        //  1494: astore          48
        //  1496: aload           48
        //  1498: athrow         
        //  1499: astore          35
        //  1501: aload           35
        //  1503: athrow         
        //  1504: astore          41
        //  1506: aload           41
        //  1508: athrow         
        //  1509: astore          36
        //  1511: aload           36
        //  1513: athrow         
        //  1514: astore          46
        //  1516: iconst_0       
        //  1517: istore          40
        //  1519: goto            1147
        //  1522: astore          53
        //  1524: goto            1479
        //  1527: astore          52
        //  1529: goto            1479
        //  1532: aconst_null    
        //  1533: astore          34
        //  1535: goto            1073
        //  1538: iconst_0       
        //  1539: istore          62
        //  1541: goto            685
        //  1544: iload           81
        //  1546: istore          84
        //  1548: goto            199
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  15     93     1281   1286   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  98     106    1286   1291   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  110    115    1291   1296   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  145    163    1296   1301   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  168    175    1301   1306   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  199    205    1306   1311   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  213    226    1317   1322   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  231    243    1317   1322   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  247    263    1337   1342   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  267    274    1337   1342   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  279    285    1342   1347   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  290    299    1347   1352   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  304    316    1352   1357   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  321    386    1357   1362   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  390    433    1362   1367   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  438    445    1367   1372   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  450    456    1372   1382   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  464    473    1388   1393   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  483    525    1393   1398   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  529    578    1398   1403   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  635    646    1403   1408   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  719    797    1417   1422   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  801    875    1417   1422   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  875    903    1422   1427   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  908    917    1427   1432   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  922    934    1432   1437   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  939    952    1437   1442   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  956    967    1442   1447   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  976    1000   1447   1457   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1009   1023   1462   1467   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1027   1040   1467   1472   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1045   1054   1472   1477   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1059   1069   1477   1479   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1059   1069   1527   1532   Ljava/lang/StringIndexOutOfBoundsException;
        //  1059   1069   1522   1527   Ljava/lang/IllegalArgumentException;
        //  1078   1090   1494   1499   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1090   1105   1499   1504   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1117   1143   1514   1522   Ljava/io/IOException;
        //  1161   1187   1504   1509   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1191   1217   1504   1509   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1217   1229   1509   1514   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1233   1273   1509   1514   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1283   1286   1286   1291   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1288   1291   1291   1296   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1298   1301   1301   1306   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1339   1342   1342   1347   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1344   1347   1347   1352   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1349   1352   1352   1357   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1354   1357   1357   1362   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1359   1362   1362   1367   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1364   1367   1367   1372   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1369   1372   1372   1382   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1374   1377   1377   1382   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1390   1393   1393   1398   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1395   1398   1398   1403   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1424   1427   1427   1432   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1429   1432   1432   1437   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1434   1437   1437   1442   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1439   1442   1442   1447   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1449   1452   1452   1457   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1469   1472   1472   1477   Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 735, Size: 735
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
    public void a(final bi p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_2        
        //     1: ifne            16
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ConversationRowImage.t:Lcom/whatsapp/protocol/bi;
        //     8: astore          6
        //    10: aload_1        
        //    11: aload           6
        //    13: if_acmpeq       39
        //    16: iconst_1       
        //    17: istore_3       
        //    18: aload_0        
        //    19: aload_1        
        //    20: iload_2        
        //    21: invokespecial   com/whatsapp/ConversationRowMedia.a:(Lcom/whatsapp/protocol/bi;Z)V
        //    24: iload_3        
        //    25: ifeq            33
        //    28: aload_0        
        //    29: aload_1        
        //    30: invokespecial   com/whatsapp/ConversationRowImage.b:(Lcom/whatsapp/protocol/bi;)V
        //    33: return         
        //    34: astore          5
        //    36: aload           5
        //    38: athrow         
        //    39: iconst_0       
        //    40: istore_3       
        //    41: goto            18
        //    44: astore          4
        //    46: aload           4
        //    48: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  4      10     34     39     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  18     24     44     49     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  28     33     44     49     Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
    protected int b() {
        return 2130903119;
    }
    
    @Override
    protected int b(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc_w           2130838926
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/App.I:Z
        //     7: istore_3       
        //     8: aload_0        
        //     9: getfield        com/whatsapp/ConversationRowImage.t:Lcom/whatsapp/protocol/bi;
        //    12: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //    15: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    18: ifne            38
        //    21: aload_0        
        //    22: iload_1        
        //    23: invokespecial   com/whatsapp/ConversationRowMedia.b:(I)I
        //    26: istore          12
        //    28: iload           12
        //    30: istore_2       
        //    31: iload_2        
        //    32: ireturn        
        //    33: astore          4
        //    35: aload           4
        //    37: athrow         
        //    38: iload_1        
        //    39: bipush          13
        //    41: invokestatic    com/whatsapp/protocol/b7.a:(II)I
        //    44: iflt            56
        //    47: ldc_w           2130838920
        //    50: istore          9
        //    52: iload_3        
        //    53: ifeq            101
        //    56: iload_1        
        //    57: iconst_5       
        //    58: invokestatic    com/whatsapp/protocol/b7.a:(II)I
        //    61: istore          6
        //    63: iload           6
        //    65: iflt            77
        //    68: ldc_w           2130838924
        //    71: istore          9
        //    73: iload_3        
        //    74: ifeq            101
        //    77: iload_1        
        //    78: iconst_4       
        //    79: invokestatic    com/whatsapp/protocol/b7.a:(II)I
        //    82: istore          8
        //    84: iload           8
        //    86: ifne            98
        //    89: ldc_w           2130838922
        //    92: istore          9
        //    94: iload_3        
        //    95: ifeq            101
        //    98: iload_2        
        //    99: istore          9
        //   101: getstatic       com/whatsapp/App.aV:I
        //   104: istore          11
        //   106: iload           11
        //   108: iconst_3       
        //   109: if_icmpne       118
        //   112: iload_1        
        //   113: bipush          7
        //   115: if_icmpeq       31
        //   118: iload           9
        //   120: ireturn        
        //   121: astore          5
        //   123: aload           5
        //   125: athrow         
        //   126: astore          7
        //   128: aload           7
        //   130: athrow         
        //   131: astore          10
        //   133: aload           10
        //   135: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      28     33     38     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  56     63     121    126    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  77     84     126    131    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  101    106    131    136    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 69, Size: 69
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
        super.d();
        this.b(this.t);
    }
    
    @Override
    protected void j() {
        final MediaData mediaData = (MediaData)this.t.N;
        Label_0042: {
            try {
                if (this.t.a.b) {
                    break Label_0042;
                }
                final MediaData mediaData2 = mediaData;
                final boolean b = mediaData2.transferred;
                if (!b) {
                    return;
                }
                break Label_0042;
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
            try {
                final MediaData mediaData2 = mediaData;
                final boolean b = mediaData2.transferred;
                if (!b) {
                    return;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex2) {
                throw ex2;
            }
        }
        final File file = mediaData.file;
        boolean exists = false;
        if (file != null) {
            exists = new File(Uri.fromFile(mediaData.file).getPath()).exists();
        }
        if (!exists) {
            final Intent intent = new Intent(this.getContext(), (Class)MediaGallery.class);
            intent.putExtra(ConversationRowImage.U[15], -1);
            intent.putExtra(ConversationRowImage.U[11], true);
            intent.putExtra(ConversationRowImage.U[7], this.t.a.a);
            intent.putExtra(ConversationRowImage.U[1], this.t.a.hashCode());
            this.getContext().startActivity(intent);
            return;
        }
        Log.i(ConversationRowImage.U[8] + this.t.a.b + ConversationRowImage.U[4] + this.t.I + ConversationRowImage.U[9] + this.t.k + ConversationRowImage.U[13] + br.c(this.t.d) + ConversationRowImage.U[2] + mediaData.file + ConversationRowImage.U[3] + mediaData.progress + ConversationRowImage.U[12] + mediaData.transferred + ConversationRowImage.U[14] + mediaData.transferring + ConversationRowImage.U[10] + mediaData.fileSize + ConversationRowImage.U[5] + this.t.L + ConversationRowImage.U[6] + this.t.u);
        final Intent a = MediaView.a(this.t, this.t.a.a, this.getContext(), (View)this.L);
        try {
            this.getContext().startActivity(a);
            if (MediaView.c()) {
                try {
                    if (this.getContext() instanceof Activity) {
                        ((Activity)this.getContext()).overridePendingTransition(0, 0);
                    }
                }
                catch (ArrayIndexOutOfBoundsException ex3) {
                    throw ex3;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException ex4) {
            throw ex4;
        }
    }
    
    @Override
    protected int p() {
        return 2130903120;
    }
}
