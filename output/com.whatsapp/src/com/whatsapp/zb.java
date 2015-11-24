// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.whatsapp.protocol.bi;
import android.widget.Filter;
import java.util.ArrayList;
import android.widget.Filterable;
import android.widget.BaseAdapter;

class zb extends BaseAdapter implements Filterable
{
    private static final String[] z;
    private String a;
    final ConversationsFragment b;
    private ArrayList c;
    private Filter d;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u000bK\u001fE<\nX\u0003P";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = 'i';
                        break;
                    }
                    case 1: {
                        c2 = '9';
                        break;
                    }
                    case 2: {
                        c2 = 'p';
                        break;
                    }
                    case 3: {
                        c2 = '$';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "S\u0019";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\nV\u001eR=\u001bJ\u0011P1\u0006W\u0003{*\u0006N_I1\u001aJ\u0019J?6K\u001dP\u0007\u001aK\u0013\u001e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "I\u0003";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000bK\u001fE<\nX\u0003P";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0003P\u0014\u00045\u001cJ\u0004\u00046\u0006MPF=I\\\u001dT,\u0010";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000bK\u001fE<\nX\u0003P";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0005X\tK-\u001df\u0019J>\u0005X\u0004A*";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    zb(final ConversationsFragment b) {
        this.b = b;
        this.d = new adj(this, null);
        this.c = new ArrayList();
    }
    
    private int a(final bi bi) {
        int n = 2130838940;
        try {
            if (!bi.a.b) {
                return 0;
            }
            final bi bi2 = bi;
            final int n2 = bi2.c;
            switch (n2) {
                case 4: {
                    return 2130838946;
                }
                case 5: {
                    return 2130838939;
                }
                case 8:
                case 13: {
                    return 2130838938;
                }
                default: {
                    return n;
                }
            }
        }
        catch (IllegalStateException ex) {
            try {
                throw ex;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        try {
            final bi bi2 = bi;
            final int n2 = bi2.c;
            switch (n2) {
                case 4: {
                    break;
                }
                case 5: {
                    return 2130838939;
                }
                case 8:
                case 13: {
                    return 2130838938;
                }
                default: {
                    return n;
                }
            }
        }
        catch (IllegalStateException ex3) {}
        return 2130838946;
        n = 0;
        return n;
    }
    
    static String a(final zb zb) {
        return zb.a;
    }
    
    static String a(final zb zb, final String a) {
        return zb.a = a;
    }
    
    static ArrayList a(final zb zb, final ArrayList c) {
        return zb.c = c;
    }
    
    private final void a(final Context p0, final View p1, final al_ p2, final ef p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //     8: aload_3        
        //     9: getfield        com/whatsapp/al_.a:Ljava/lang/String;
        //    12: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    15: astore          6
        //    17: aload           6
        //    19: ifnonnull       1136
        //    22: new             Lcom/whatsapp/a_9;
        //    25: dup            
        //    26: aload_3        
        //    27: getfield        com/whatsapp/al_.a:Ljava/lang/String;
        //    30: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //    33: astore          7
        //    35: aload           7
        //    37: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    40: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    43: ifeq            64
        //    46: new             Ljava/lang/IllegalStateException;
        //    49: dup            
        //    50: getstatic       com/whatsapp/zb.z:[Ljava/lang/String;
        //    53: iconst_5       
        //    54: aaload         
        //    55: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    58: athrow         
        //    59: astore          8
        //    61: aload           8
        //    63: athrow         
        //    64: aload_0        
        //    65: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //    68: invokestatic    com/whatsapp/ConversationsFragment.i:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/a9q;
        //    71: aload           7
        //    73: aload           4
        //    75: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //    78: invokevirtual   com/whatsapp/a9q.b:(Lcom/whatsapp/a_9;Landroid/widget/ImageView;)V
        //    81: getstatic       com/whatsapp/zb.z:[Ljava/lang/String;
        //    84: bipush          6
        //    86: aaload         
        //    87: aload           7
        //    89: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    92: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    95: ifne            165
        //    98: aload           7
        //   100: invokevirtual   com/whatsapp/a_9.o:()Z
        //   103: istore          57
        //   105: iload           57
        //   107: ifne            165
        //   110: aload           4
        //   112: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   115: iconst_1       
        //   116: invokevirtual   android/widget/ImageView.setEnabled:(Z)V
        //   119: new             Lcom/whatsapp/a0e;
        //   122: dup            
        //   123: aload           7
        //   125: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   128: aload_0        
        //   129: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   132: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   135: invokespecial   com/whatsapp/a0e.<init>:(Ljava/lang/String;Landroid/content/Context;)V
        //   138: astore          58
        //   140: aload           4
        //   142: getfield        com/whatsapp/ef.n:Landroid/view/View;
        //   145: aload           58
        //   147: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   150: aload           4
        //   152: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   155: aload           58
        //   157: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   160: iload           5
        //   162: ifeq            192
        //   165: aload           4
        //   167: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   170: iconst_0       
        //   171: invokevirtual   android/widget/ImageView.setEnabled:(Z)V
        //   174: aload           4
        //   176: getfield        com/whatsapp/ef.n:Landroid/view/View;
        //   179: aconst_null    
        //   180: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   183: aload           4
        //   185: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   188: aconst_null    
        //   189: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   192: aload           4
        //   194: getfield        com/whatsapp/ef.n:Landroid/view/View;
        //   197: iconst_0       
        //   198: invokevirtual   android/view/View.setVisibility:(I)V
        //   201: aload           4
        //   203: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   206: iconst_0       
        //   207: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   210: aload           4
        //   212: getfield        com/whatsapp/ef.j:Landroid/widget/TextView;
        //   215: iconst_0       
        //   216: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   219: aload           4
        //   221: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //   224: iconst_0       
        //   225: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   228: aload           4
        //   230: getfield        com/whatsapp/ef.h:Landroid/widget/TextView;
        //   233: iconst_0       
        //   234: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   237: aload           4
        //   239: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   242: iconst_0       
        //   243: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   246: aload           4
        //   248: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   251: iconst_0       
        //   252: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   255: aload           4
        //   257: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   260: iconst_0       
        //   261: iconst_0       
        //   262: iconst_0       
        //   263: iconst_0       
        //   264: invokevirtual   android/widget/TextView.setPadding:(IIII)V
        //   267: aload           7
        //   269: invokevirtual   com/whatsapp/a_9.k:()Z
        //   272: ifeq            305
        //   275: aload           7
        //   277: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   280: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   283: istore          56
        //   285: iload           56
        //   287: ifeq            305
        //   290: aload           7
        //   292: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   295: invokestatic    com/whatsapp/adc.h:(Ljava/lang/String;)Ljava/lang/String;
        //   298: astore          12
        //   300: iload           5
        //   302: ifeq            313
        //   305: aload           7
        //   307: aload_1        
        //   308: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   311: astore          12
        //   313: aload           12
        //   315: aload_0        
        //   316: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   319: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   322: invokevirtual   android/support/v4/app/FragmentActivity.getBaseContext:()Landroid/content/Context;
        //   325: aload           4
        //   327: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   330: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   333: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;)Landroid/text/SpannableStringBuilder;
        //   336: astore          13
        //   338: aload           4
        //   340: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   343: aload_0        
        //   344: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   347: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   350: aload           13
        //   352: aload           12
        //   354: aload_0        
        //   355: getfield        com/whatsapp/zb.c:Ljava/util/ArrayList;
        //   358: invokestatic    com/whatsapp/util/aa.a:(Landroid/content/Context;Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/util/List;)Ljava/lang/CharSequence;
        //   361: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   364: aload           7
        //   366: getfield        com/whatsapp/a_9.l:I
        //   369: istore          16
        //   371: iload           16
        //   373: ifle            410
        //   376: aload           4
        //   378: getfield        com/whatsapp/ef.h:Landroid/widget/TextView;
        //   381: invokestatic    java/text/NumberFormat.getInstance:()Ljava/text/NumberFormat;
        //   384: aload           7
        //   386: getfield        com/whatsapp/a_9.l:I
        //   389: i2l            
        //   390: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //   393: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   396: aload           4
        //   398: getfield        com/whatsapp/ef.h:Landroid/widget/TextView;
        //   401: iconst_0       
        //   402: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   405: iload           5
        //   407: ifeq            420
        //   410: aload           4
        //   412: getfield        com/whatsapp/ef.h:Landroid/widget/TextView;
        //   415: bipush          8
        //   417: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   420: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   423: aload           7
        //   425: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   428: invokevirtual   com/whatsapp/vy.C:(Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //   431: astore          17
        //   433: aload           17
        //   435: ifnull          491
        //   438: aload           17
        //   440: getfield        com/whatsapp/protocol/bi.I:B
        //   443: istore          53
        //   445: iload           53
        //   447: ifne            491
        //   450: aload           17
        //   452: getfield        com/whatsapp/protocol/bi.L:J
        //   455: lstore          54
        //   457: lload           54
        //   459: ldc2_w          2
        //   462: lcmp           
        //   463: ifeq            478
        //   466: aload           17
        //   468: getfield        com/whatsapp/protocol/bi.L:J
        //   471: ldc2_w          3
        //   474: lcmp           
        //   475: ifne            491
        //   478: aload           4
        //   480: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   483: aload           17
        //   485: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //   488: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   491: aload_0        
        //   492: aload           17
        //   494: aload           7
        //   496: aload           4
        //   498: aconst_null    
        //   499: invokespecial   com/whatsapp/zb.a:(Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;Lcom/whatsapp/ef;Ljava/util/ArrayList;)V
        //   502: aload           4
        //   504: getfield        com/whatsapp/ef.g:Landroid/widget/ImageView;
        //   507: astore          20
        //   509: aload           20
        //   511: ifnull          547
        //   514: aload           4
        //   516: getfield        com/whatsapp/ef.g:Landroid/widget/ImageView;
        //   519: astore          47
        //   521: aload_1        
        //   522: aload           7
        //   524: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   527: invokestatic    com/whatsapp/notification/y.d:(Landroid/content/Context;Ljava/lang/String;)Z
        //   530: istore          48
        //   532: iload           48
        //   534: ifeq            1065
        //   537: iconst_0       
        //   538: istore          49
        //   540: aload           47
        //   542: iload           49
        //   544: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   547: aload           4
        //   549: getfield        com/whatsapp/ef.l:Landroid/widget/ImageView;
        //   552: astore          23
        //   554: aload           23
        //   556: ifnull          594
        //   559: aload           4
        //   561: getfield        com/whatsapp/ef.l:Landroid/widget/ImageView;
        //   564: astore          44
        //   566: getstatic       com/whatsapp/dt.c:Lcom/whatsapp/dt;
        //   569: aload           7
        //   571: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   574: invokevirtual   com/whatsapp/dt.a:(Ljava/lang/String;)Z
        //   577: istore          45
        //   579: iload           45
        //   581: ifeq            1082
        //   584: iconst_0       
        //   585: istore          46
        //   587: aload           44
        //   589: iload           46
        //   591: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   594: aload           4
        //   596: getfield        com/whatsapp/ef.a:Landroid/view/View;
        //   599: astore          26
        //   601: aload           26
        //   603: ifnull          641
        //   606: aload           4
        //   608: getfield        com/whatsapp/ef.a:Landroid/view/View;
        //   611: astore          41
        //   613: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   616: aload           7
        //   618: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   621: invokevirtual   com/whatsapp/vy.n:(Ljava/lang/String;)Z
        //   624: istore          42
        //   626: iload           42
        //   628: ifeq            1099
        //   631: iconst_0       
        //   632: istore          43
        //   634: aload           41
        //   636: iload           43
        //   638: invokevirtual   android/view/View.setVisibility:(I)V
        //   641: aload           7
        //   643: invokevirtual   com/whatsapp/a_9.k:()Z
        //   646: istore          27
        //   648: aconst_null    
        //   649: astore          28
        //   651: iload           27
        //   653: ifne            698
        //   656: aload           7
        //   658: invokevirtual   com/whatsapp/a_9.a:()Ljava/lang/String;
        //   661: astore          28
        //   663: aload           28
        //   665: ifnull          698
        //   668: aload           4
        //   670: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   673: aload           28
        //   675: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   678: aload           4
        //   680: getfield        com/whatsapp/ef.j:Landroid/widget/TextView;
        //   683: bipush          8
        //   685: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   688: aload           4
        //   690: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   693: bipush          8
        //   695: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   698: aload           4
        //   700: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   703: invokestatic    com/whatsapp/vc.b:(Landroid/widget/TextView;)V
        //   706: aload           7
        //   708: getfield        com/whatsapp/a_9.l:I
        //   711: istore          31
        //   713: iload           31
        //   715: ifle            744
        //   718: aload           4
        //   720: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //   723: aload_0        
        //   724: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   727: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   730: ldc_w           2131623979
        //   733: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   736: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   739: iload           5
        //   741: ifeq            765
        //   744: aload           4
        //   746: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //   749: aload_0        
        //   750: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   753: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   756: ldc_w           2131624011
        //   759: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   762: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   765: aload           28
        //   767: ifnull          806
        //   770: aload           4
        //   772: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   775: bipush          8
        //   777: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   780: aload           4
        //   782: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   785: aload_0        
        //   786: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   789: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   792: ldc_w           2131623979
        //   795: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   798: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   801: iload           5
        //   803: ifeq            827
        //   806: aload           4
        //   808: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   811: aload_0        
        //   812: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   815: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   818: ldc_w           2131624011
        //   821: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   824: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   827: getstatic       com/whatsapp/zb.z:[Ljava/lang/String;
        //   830: iconst_4       
        //   831: aaload         
        //   832: aload           7
        //   834: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   837: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   840: ifeq            903
        //   843: aload           4
        //   845: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   848: bipush          8
        //   850: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   853: aload           4
        //   855: getfield        com/whatsapp/ef.j:Landroid/widget/TextView;
        //   858: bipush          8
        //   860: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   863: aload           4
        //   865: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //   868: bipush          8
        //   870: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   873: aload           4
        //   875: getfield        com/whatsapp/ef.h:Landroid/widget/TextView;
        //   878: bipush          8
        //   880: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   883: aload           4
        //   885: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   888: bipush          8
        //   890: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   893: aload           4
        //   895: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   898: bipush          8
        //   900: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   903: aload_0        
        //   904: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   907: invokestatic    com/whatsapp/ConversationsFragment.m:(Lcom/whatsapp/ConversationsFragment;)Ljava/lang/String;
        //   910: ifnull          1014
        //   913: aload_0        
        //   914: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   917: invokestatic    com/whatsapp/ConversationsFragment.m:(Lcom/whatsapp/ConversationsFragment;)Ljava/lang/String;
        //   920: aload           7
        //   922: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   925: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   928: istore          35
        //   930: iload           35
        //   932: ifeq            1014
        //   935: aload_0        
        //   936: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   939: aconst_null    
        //   940: invokestatic    com/whatsapp/ConversationsFragment.a:(Lcom/whatsapp/ConversationsFragment;Ljava/lang/String;)Ljava/lang/String;
        //   943: pop            
        //   944: new             Landroid/view/animation/AnimationSet;
        //   947: dup            
        //   948: iconst_1       
        //   949: invokespecial   android/view/animation/AnimationSet.<init>:(Z)V
        //   952: astore          37
        //   954: new             Landroid/view/animation/ScaleAnimation;
        //   957: dup            
        //   958: fconst_0       
        //   959: fconst_1       
        //   960: fconst_0       
        //   961: fconst_1       
        //   962: iconst_1       
        //   963: ldc_w           0.5
        //   966: iconst_1       
        //   967: ldc_w           0.5
        //   970: invokespecial   android/view/animation/ScaleAnimation.<init>:(FFFFIFIF)V
        //   973: astore          38
        //   975: new             Landroid/view/animation/AlphaAnimation;
        //   978: dup            
        //   979: fconst_0       
        //   980: fconst_1       
        //   981: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //   984: astore          39
        //   986: aload           37
        //   988: aload           38
        //   990: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   993: aload           37
        //   995: aload           39
        //   997: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //  1000: aload           37
        //  1002: ldc2_w          300
        //  1005: invokevirtual   android/view/animation/AnimationSet.setDuration:(J)V
        //  1008: aload_2        
        //  1009: aload           37
        //  1011: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //  1014: return         
        //  1015: astore          9
        //  1017: aload           9
        //  1019: athrow         
        //  1020: astore          10
        //  1022: aload           10
        //  1024: athrow         
        //  1025: astore          11
        //  1027: aload           11
        //  1029: athrow         
        //  1030: astore          14
        //  1032: aload           14
        //  1034: athrow         
        //  1035: astore          15
        //  1037: aload           15
        //  1039: athrow         
        //  1040: astore          50
        //  1042: aload           50
        //  1044: athrow         
        //  1045: astore          51
        //  1047: aload           51
        //  1049: athrow         
        //  1050: astore          52
        //  1052: aload           52
        //  1054: athrow         
        //  1055: astore          18
        //  1057: aload           18
        //  1059: athrow         
        //  1060: astore          19
        //  1062: aload           19
        //  1064: athrow         
        //  1065: bipush          8
        //  1067: istore          49
        //  1069: goto            540
        //  1072: astore          21
        //  1074: aload           21
        //  1076: athrow         
        //  1077: astore          22
        //  1079: aload           22
        //  1081: athrow         
        //  1082: bipush          8
        //  1084: istore          46
        //  1086: goto            587
        //  1089: astore          24
        //  1091: aload           24
        //  1093: athrow         
        //  1094: astore          25
        //  1096: aload           25
        //  1098: athrow         
        //  1099: bipush          8
        //  1101: istore          43
        //  1103: goto            634
        //  1106: astore          40
        //  1108: aload           40
        //  1110: athrow         
        //  1111: astore          29
        //  1113: aload           29
        //  1115: athrow         
        //  1116: astore          30
        //  1118: aload           30
        //  1120: athrow         
        //  1121: astore          32
        //  1123: aload           32
        //  1125: athrow         
        //  1126: astore          33
        //  1128: aload           33
        //  1130: athrow         
        //  1131: astore          34
        //  1133: aload           34
        //  1135: athrow         
        //  1136: aload           6
        //  1138: astore          7
        //  1140: goto            35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  35     59     59     64     Ljava/lang/IllegalStateException;
        //  64     105    1015   1020   Ljava/lang/IllegalStateException;
        //  140    160    1020   1025   Ljava/lang/IllegalStateException;
        //  165    192    1020   1025   Ljava/lang/IllegalStateException;
        //  192    285    1025   1030   Ljava/lang/IllegalStateException;
        //  338    371    1030   1035   Ljava/lang/IllegalStateException;
        //  376    405    1035   1040   Ljava/lang/IllegalStateException;
        //  410    420    1035   1040   Ljava/lang/IllegalStateException;
        //  438    445    1040   1045   Ljava/lang/IllegalStateException;
        //  450    457    1045   1050   Ljava/lang/IllegalStateException;
        //  466    478    1050   1055   Ljava/lang/IllegalStateException;
        //  478    491    1050   1055   Ljava/lang/IllegalStateException;
        //  491    509    1055   1060   Ljava/lang/IllegalStateException;
        //  514    532    1060   1065   Ljava/lang/IllegalStateException;
        //  547    554    1072   1077   Ljava/lang/IllegalStateException;
        //  559    579    1077   1082   Ljava/lang/IllegalStateException;
        //  594    601    1089   1094   Ljava/lang/IllegalStateException;
        //  606    626    1094   1099   Ljava/lang/IllegalStateException;
        //  668    698    1106   1111   Ljava/lang/IllegalStateException;
        //  698    713    1111   1116   Ljava/lang/IllegalStateException;
        //  718    739    1116   1121   Ljava/lang/IllegalStateException;
        //  744    765    1116   1121   Ljava/lang/IllegalStateException;
        //  770    801    1121   1126   Ljava/lang/IllegalStateException;
        //  806    827    1121   1126   Ljava/lang/IllegalStateException;
        //  827    903    1126   1131   Ljava/lang/IllegalStateException;
        //  903    930    1131   1136   Ljava/lang/IllegalStateException;
        //  1032   1035   1035   1040   Ljava/lang/IllegalStateException;
        //  1042   1045   1045   1050   Ljava/lang/IllegalStateException;
        //  1047   1050   1050   1055   Ljava/lang/IllegalStateException;
        //  1057   1060   1060   1065   Ljava/lang/IllegalStateException;
        //  1074   1077   1077   1082   Ljava/lang/IllegalStateException;
        //  1091   1094   1094   1099   Ljava/lang/IllegalStateException;
        //  1113   1116   1116   1121   Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 507, Size: 507
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
    
    private final void a(final Context p0, final View p1, final atv p2, final ef p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //     8: aload_3        
        //     9: getfield        com/whatsapp/atv.a:Ljava/lang/String;
        //    12: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    15: astore          6
        //    17: aload           6
        //    19: ifnonnull       524
        //    22: new             Lcom/whatsapp/a_9;
        //    25: dup            
        //    26: aload_3        
        //    27: getfield        com/whatsapp/atv.a:Ljava/lang/String;
        //    30: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //    33: astore          7
        //    35: aload_0        
        //    36: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //    39: invokestatic    com/whatsapp/ConversationsFragment.i:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/a9q;
        //    42: aload           7
        //    44: aload           4
        //    46: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //    49: invokevirtual   com/whatsapp/a9q.b:(Lcom/whatsapp/a_9;Landroid/widget/ImageView;)V
        //    52: getstatic       com/whatsapp/zb.z:[Ljava/lang/String;
        //    55: iconst_0       
        //    56: aaload         
        //    57: aload           7
        //    59: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    62: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    65: ifne            135
        //    68: aload           7
        //    70: invokevirtual   com/whatsapp/a_9.o:()Z
        //    73: istore          18
        //    75: iload           18
        //    77: ifne            135
        //    80: aload           4
        //    82: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //    85: iconst_1       
        //    86: invokevirtual   android/widget/ImageView.setEnabled:(Z)V
        //    89: new             Lcom/whatsapp/a0e;
        //    92: dup            
        //    93: aload           7
        //    95: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    98: aload_0        
        //    99: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   102: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   105: invokespecial   com/whatsapp/a0e.<init>:(Ljava/lang/String;Landroid/content/Context;)V
        //   108: astore          19
        //   110: aload           4
        //   112: getfield        com/whatsapp/ef.n:Landroid/view/View;
        //   115: aload           19
        //   117: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   120: aload           4
        //   122: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   125: aload           19
        //   127: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   130: iload           5
        //   132: ifeq            162
        //   135: aload           4
        //   137: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   140: iconst_0       
        //   141: invokevirtual   android/widget/ImageView.setEnabled:(Z)V
        //   144: aload           4
        //   146: getfield        com/whatsapp/ef.n:Landroid/view/View;
        //   149: aconst_null    
        //   150: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   153: aload           4
        //   155: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   158: aconst_null    
        //   159: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   162: aload           4
        //   164: getfield        com/whatsapp/ef.n:Landroid/view/View;
        //   167: iconst_0       
        //   168: invokevirtual   android/view/View.setVisibility:(I)V
        //   171: aload           4
        //   173: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   176: iconst_0       
        //   177: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   180: aload           4
        //   182: getfield        com/whatsapp/ef.j:Landroid/widget/TextView;
        //   185: bipush          8
        //   187: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   190: aload           4
        //   192: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //   195: iconst_0       
        //   196: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   199: aload           4
        //   201: getfield        com/whatsapp/ef.h:Landroid/widget/TextView;
        //   204: bipush          8
        //   206: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   209: aload           4
        //   211: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   214: bipush          8
        //   216: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   219: aload           4
        //   221: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   224: bipush          8
        //   226: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   229: aload           4
        //   231: getfield        com/whatsapp/ef.e:Landroid/view/View;
        //   234: bipush          8
        //   236: invokevirtual   android/view/View.setVisibility:(I)V
        //   239: aload           4
        //   241: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   244: bipush          8
        //   246: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   249: aload           4
        //   251: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   254: bipush          8
        //   256: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   259: aload           4
        //   261: getfield        com/whatsapp/ef.l:Landroid/widget/ImageView;
        //   264: bipush          8
        //   266: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   269: aload           4
        //   271: getfield        com/whatsapp/ef.a:Landroid/view/View;
        //   274: bipush          8
        //   276: invokevirtual   android/view/View.setVisibility:(I)V
        //   279: aload           4
        //   281: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //   284: aload_0        
        //   285: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   288: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   291: ldc_w           2131624011
        //   294: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   297: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   300: aload           4
        //   302: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   305: aload_0        
        //   306: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   309: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   312: ldc_w           2131624011
        //   315: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   318: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   321: aload           7
        //   323: invokevirtual   com/whatsapp/a_9.k:()Z
        //   326: ifeq            359
        //   329: aload           7
        //   331: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   334: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   337: istore          17
        //   339: iload           17
        //   341: ifeq            359
        //   344: aload           7
        //   346: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   349: invokestatic    com/whatsapp/adc.h:(Ljava/lang/String;)Ljava/lang/String;
        //   352: astore          11
        //   354: iload           5
        //   356: ifeq            367
        //   359: aload           7
        //   361: aload_1        
        //   362: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   365: astore          11
        //   367: aload           11
        //   369: aload_0        
        //   370: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   373: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   376: invokevirtual   android/support/v4/app/FragmentActivity.getBaseContext:()Landroid/content/Context;
        //   379: aload           4
        //   381: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   384: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   387: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;)Landroid/text/SpannableStringBuilder;
        //   390: astore          12
        //   392: aload           4
        //   394: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   397: aload_0        
        //   398: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   401: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   404: aload           12
        //   406: aload           11
        //   408: aload_0        
        //   409: getfield        com/whatsapp/zb.c:Ljava/util/ArrayList;
        //   412: invokestatic    com/whatsapp/util/aa.a:(Landroid/content/Context;Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/util/List;)Ljava/lang/CharSequence;
        //   415: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   418: aload           7
        //   420: aload_0        
        //   421: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   424: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   427: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/res/Resources;)Ljava/lang/CharSequence;
        //   430: astore          13
        //   432: aload           13
        //   434: ifnull          447
        //   437: aload           4
        //   439: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //   442: aload           13
        //   444: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   447: aload           7
        //   449: getfield        com/whatsapp/a_9.d:Ljava/lang/String;
        //   452: ifnull          516
        //   455: aload           7
        //   457: getfield        com/whatsapp/a_9.d:Ljava/lang/String;
        //   460: astore          15
        //   462: aload           4
        //   464: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   467: aload           15
        //   469: aload_0        
        //   470: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   473: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   476: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //   479: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   482: aload           4
        //   484: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   487: invokestatic    com/whatsapp/vc.b:(Landroid/widget/TextView;)V
        //   490: return         
        //   491: astore          8
        //   493: aload           8
        //   495: athrow         
        //   496: astore          9
        //   498: aload           9
        //   500: athrow         
        //   501: astore          10
        //   503: aload           10
        //   505: athrow         
        //   506: astore          16
        //   508: aload           16
        //   510: athrow         
        //   511: astore          14
        //   513: aload           14
        //   515: athrow         
        //   516: ldc_w           ""
        //   519: astore          15
        //   521: goto            462
        //   524: aload           6
        //   526: astore          7
        //   528: goto            35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  35     75     491    496    Ljava/lang/IllegalStateException;
        //  110    130    496    501    Ljava/lang/IllegalStateException;
        //  135    162    496    501    Ljava/lang/IllegalStateException;
        //  162    339    501    506    Ljava/lang/IllegalStateException;
        //  437    447    506    511    Ljava/lang/IllegalStateException;
        //  447    462    511    516    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 224, Size: 224
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
    
    private final void a(final Context p0, final View p1, final ce p2, final ef p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload           4
        //     2: getfield        com/whatsapp/ef.n:Landroid/view/View;
        //     5: bipush          8
        //     7: invokevirtual   android/view/View.setVisibility:(I)V
        //    10: aload           4
        //    12: getfield        com/whatsapp/ef.h:Landroid/widget/TextView;
        //    15: bipush          8
        //    17: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    20: aload           4
        //    22: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //    25: bipush          8
        //    27: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    30: aload           4
        //    32: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //    35: bipush          8
        //    37: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    40: aload           4
        //    42: getfield        com/whatsapp/ef.g:Landroid/widget/ImageView;
        //    45: bipush          8
        //    47: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    50: aload           4
        //    52: getfield        com/whatsapp/ef.l:Landroid/widget/ImageView;
        //    55: bipush          8
        //    57: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    60: aload           4
        //    62: getfield        com/whatsapp/ef.a:Landroid/view/View;
        //    65: bipush          8
        //    67: invokevirtual   android/view/View.setVisibility:(I)V
        //    70: aload           4
        //    72: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //    75: aload_0        
        //    76: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //    79: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //    82: ldc_w           2131624011
        //    85: invokevirtual   android/content/res/Resources.getColor:(I)I
        //    88: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //    91: aload           4
        //    93: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //    96: aload_0        
        //    97: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   100: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   103: ldc_w           2131624011
        //   106: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   109: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   112: aload           4
        //   114: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   117: iconst_0       
        //   118: invokevirtual   android/widget/ImageView.setEnabled:(Z)V
        //   121: aload           4
        //   123: getfield        com/whatsapp/ef.n:Landroid/view/View;
        //   126: aconst_null    
        //   127: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   130: aload           4
        //   132: getfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   135: aconst_null    
        //   136: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   139: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   142: aload_3        
        //   143: getfield        com/whatsapp/ce.b:Lcom/whatsapp/protocol/bi;
        //   146: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   149: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   152: invokevirtual   com/whatsapp/wc.d:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   155: astore          5
        //   157: aload           5
        //   159: ifnonnull       314
        //   162: new             Lcom/whatsapp/a_9;
        //   165: dup            
        //   166: aload_3        
        //   167: getfield        com/whatsapp/ce.b:Lcom/whatsapp/protocol/bi;
        //   170: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   173: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   176: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //   179: astore          6
        //   181: aload           6
        //   183: invokevirtual   com/whatsapp/a_9.k:()Z
        //   186: ifeq            220
        //   189: aload           6
        //   191: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   194: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   197: istore          12
        //   199: iload           12
        //   201: ifeq            220
        //   204: aload           6
        //   206: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   209: invokestatic    com/whatsapp/adc.h:(Ljava/lang/String;)Ljava/lang/String;
        //   212: astore          8
        //   214: getstatic       com/whatsapp/App.I:Z
        //   217: ifeq            228
        //   220: aload           6
        //   222: aload_1        
        //   223: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   226: astore          8
        //   228: aload           8
        //   230: aload_0        
        //   231: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   234: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   237: invokevirtual   android/support/v4/app/FragmentActivity.getBaseContext:()Landroid/content/Context;
        //   240: aload           4
        //   242: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   245: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   248: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;)Landroid/text/SpannableStringBuilder;
        //   251: astore          9
        //   253: aload           4
        //   255: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   258: astore          11
        //   260: aload           9
        //   262: ifnonnull       307
        //   265: aload           11
        //   267: aload           8
        //   269: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   272: aload_0        
        //   273: aload_3        
        //   274: getfield        com/whatsapp/ce.b:Lcom/whatsapp/protocol/bi;
        //   277: aload           6
        //   279: aload           4
        //   281: aload_0        
        //   282: getfield        com/whatsapp/zb.c:Ljava/util/ArrayList;
        //   285: invokespecial   com/whatsapp/zb.a:(Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;Lcom/whatsapp/ef;Ljava/util/ArrayList;)V
        //   288: aload           4
        //   290: getfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   293: invokestatic    com/whatsapp/vc.b:(Landroid/widget/TextView;)V
        //   296: return         
        //   297: astore          7
        //   299: aload           7
        //   301: athrow         
        //   302: astore          10
        //   304: aload           10
        //   306: athrow         
        //   307: aload           9
        //   309: astore          8
        //   311: goto            265
        //   314: aload           5
        //   316: astore          6
        //   318: goto            181
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  181    199    297    302    Ljava/lang/IllegalStateException;
        //  253    260    302    307    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0265:
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
    
    private final void a(final bi p0, final a_9 p1, final ef p2, final ArrayList p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: ldc_w           ""
        //     8: astore          6
        //    10: ldc_w           ""
        //    13: astore          7
        //    15: aload_3        
        //    16: getfield        com/whatsapp/ef.e:Landroid/view/View;
        //    19: bipush          8
        //    21: invokevirtual   android/view/View.setVisibility:(I)V
        //    24: aload_3        
        //    25: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //    28: iconst_0       
        //    29: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    32: aload_3        
        //    33: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //    36: bipush          8
        //    38: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    41: aload_1        
        //    42: ifnull          857
        //    45: aload_1        
        //    46: getfield        com/whatsapp/protocol/bi.I:B
        //    49: istore          35
        //    51: iload           35
        //    53: ifne            132
        //    56: aload_1        
        //    57: getfield        com/whatsapp/protocol/bi.c:I
        //    60: istore          77
        //    62: iload           77
        //    64: bipush          6
        //    66: if_icmpeq       80
        //    69: aload_1        
        //    70: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //    73: astore          36
        //    75: iload           5
        //    77: ifeq            756
        //    80: aload_1        
        //    81: getfield        com/whatsapp/protocol/bi.L:J
        //    84: lstore          79
        //    86: lload           79
        //    88: l2i            
        //    89: tableswitch {
        //                4: 1340
        //                5: 1314
        //          default: 112
        //        }
        //   112: aload_1        
        //   113: invokestatic    com/whatsapp/ConversationRowDivider.a:(Lcom/whatsapp/protocol/bi;)Ljava/lang/String;
        //   116: astore          36
        //   118: aload_3        
        //   119: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   122: bipush          8
        //   124: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   127: iload           5
        //   129: ifeq            756
        //   132: iload           35
        //   134: iconst_1       
        //   135: if_icmpne       198
        //   138: aload_3        
        //   139: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   142: iconst_0       
        //   143: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   146: aload_3        
        //   147: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   150: ldc_w           2130838937
        //   153: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   156: aload_1        
        //   157: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   160: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   163: istore          75
        //   165: iload           75
        //   167: ifeq            187
        //   170: aload_0        
        //   171: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   174: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //   177: getfield        com/whatsapp/aqv.d:Ljava/lang/String;
        //   180: astore          36
        //   182: iload           5
        //   184: ifeq            756
        //   187: aload_1        
        //   188: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   191: astore          36
        //   193: iload           5
        //   195: ifeq            756
        //   198: iload           35
        //   200: iconst_2       
        //   201: if_icmpne       406
        //   204: aload_1        
        //   205: getfield        com/whatsapp/protocol/bi.E:I
        //   208: iconst_1       
        //   209: if_icmpne       371
        //   212: aload_1        
        //   213: getfield        com/whatsapp/protocol/bi.D:I
        //   216: istore          62
        //   218: iload           62
        //   220: ifeq            238
        //   223: aload_1        
        //   224: getfield        com/whatsapp/protocol/bi.D:I
        //   227: i2l            
        //   228: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   231: astore          36
        //   233: iload           5
        //   235: ifeq            250
        //   238: aload_0        
        //   239: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   242: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //   245: getfield        com/whatsapp/aqv.g:Ljava/lang/String;
        //   248: astore          36
        //   250: aload_3        
        //   251: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   254: iconst_0       
        //   255: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   258: aload_1        
        //   259: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   262: getfield        com/whatsapp/protocol/c6.b:Z
        //   265: istore          70
        //   267: iload           70
        //   269: ifeq            315
        //   272: aload_1        
        //   273: getfield        com/whatsapp/protocol/bi.c:I
        //   276: istore          73
        //   278: iload           73
        //   280: bipush          8
        //   282: if_icmpne       300
        //   285: aload_3        
        //   286: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   289: ldc_w           2130838942
        //   292: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   295: iload           5
        //   297: ifeq            756
        //   300: aload_3        
        //   301: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   304: ldc_w           2130838944
        //   307: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   310: iload           5
        //   312: ifeq            756
        //   315: aload_1        
        //   316: getfield        com/whatsapp/protocol/bi.c:I
        //   319: istore          71
        //   321: iload           71
        //   323: bipush          9
        //   325: if_icmpeq       341
        //   328: aload_1        
        //   329: getfield        com/whatsapp/protocol/bi.c:I
        //   332: istore          72
        //   334: iload           72
        //   336: bipush          10
        //   338: if_icmpne       356
        //   341: aload_3        
        //   342: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   345: ldc_w           2130838942
        //   348: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   351: iload           5
        //   353: ifeq            756
        //   356: aload_3        
        //   357: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   360: ldc_w           2130838943
        //   363: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   366: iload           5
        //   368: ifeq            756
        //   371: aload_0        
        //   372: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   375: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //   378: getfield        com/whatsapp/aqv.c:Ljava/lang/String;
        //   381: astore          36
        //   383: aload_3        
        //   384: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   387: iconst_0       
        //   388: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   391: aload_3        
        //   392: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   395: ldc_w           2130838936
        //   398: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   401: iload           5
        //   403: ifeq            756
        //   406: iload           35
        //   408: iconst_3       
        //   409: if_icmpne       480
        //   412: aload_3        
        //   413: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   416: iconst_0       
        //   417: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   420: aload_3        
        //   421: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   424: iconst_0       
        //   425: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   428: aload_3        
        //   429: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   432: ldc_w           2130838948
        //   435: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   438: aload_1        
        //   439: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   442: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   445: istore          59
        //   447: iload           59
        //   449: ifeq            469
        //   452: aload_0        
        //   453: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   456: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //   459: getfield        com/whatsapp/aqv.a:Ljava/lang/String;
        //   462: astore          36
        //   464: iload           5
        //   466: ifeq            756
        //   469: aload_1        
        //   470: getfield        com/whatsapp/protocol/bi.M:Ljava/lang/String;
        //   473: astore          36
        //   475: iload           5
        //   477: ifeq            756
        //   480: iload           35
        //   482: iconst_4       
        //   483: if_icmpne       503
        //   486: aload_0        
        //   487: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   490: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //   493: getfield        com/whatsapp/aqv.e:Ljava/lang/String;
        //   496: astore          36
        //   498: iload           5
        //   500: ifeq            756
        //   503: iload           35
        //   505: iconst_5       
        //   506: if_icmpne       603
        //   509: aload_0        
        //   510: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   513: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //   516: getfield        com/whatsapp/aqv.f:Ljava/lang/String;
        //   519: astore          36
        //   521: aload_1        
        //   522: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   525: ifnull          580
        //   528: aload_1        
        //   529: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   532: invokevirtual   java/lang/String.length:()I
        //   535: istore          54
        //   537: iload           54
        //   539: ifle            580
        //   542: aload_1        
        //   543: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //   546: ldc_w           "\n"
        //   549: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   552: astore          55
        //   554: aload           55
        //   556: arraylength    
        //   557: ifle            580
        //   560: aload           55
        //   562: iconst_0       
        //   563: aaload         
        //   564: invokevirtual   java/lang/String.length:()I
        //   567: istore          57
        //   569: iload           57
        //   571: ifle            580
        //   574: aload           55
        //   576: iconst_0       
        //   577: aaload         
        //   578: astore          36
        //   580: aload_3        
        //   581: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   584: iconst_0       
        //   585: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   588: aload_3        
        //   589: getfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   592: ldc_w           2130838941
        //   595: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   598: iload           5
        //   600: ifeq            756
        //   603: iload           35
        //   605: bipush          8
        //   607: if_icmpne       744
        //   610: aload_1        
        //   611: getfield        com/whatsapp/protocol/bi.D:I
        //   614: ifne            648
        //   617: aload_1        
        //   618: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   621: getfield        com/whatsapp/protocol/c6.b:Z
        //   624: istore          50
        //   626: iload           50
        //   628: ifne            648
        //   631: aload_0        
        //   632: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   635: ldc_w           2131230973
        //   638: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   641: astore          36
        //   643: iload           5
        //   645: ifeq            756
        //   648: aload_1        
        //   649: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   652: getfield        com/whatsapp/protocol/c6.b:Z
        //   655: istore          45
        //   657: iload           45
        //   659: ifeq            703
        //   662: aload_0        
        //   663: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   666: astore          48
        //   668: iconst_1       
        //   669: anewarray       Ljava/lang/Object;
        //   672: astore          49
        //   674: aload           49
        //   676: iconst_0       
        //   677: aload_1        
        //   678: getfield        com/whatsapp/protocol/bi.D:I
        //   681: i2l            
        //   682: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   685: aastore        
        //   686: aload           48
        //   688: ldc_w           2131230974
        //   691: aload           49
        //   693: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   696: astore          36
        //   698: iload           5
        //   700: ifeq            756
        //   703: aload_0        
        //   704: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   707: astore          46
        //   709: iconst_1       
        //   710: anewarray       Ljava/lang/Object;
        //   713: astore          47
        //   715: aload           47
        //   717: iconst_0       
        //   718: aload_1        
        //   719: getfield        com/whatsapp/protocol/bi.D:I
        //   722: i2l            
        //   723: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   726: aastore        
        //   727: aload           46
        //   729: ldc_w           2131230972
        //   732: aload           47
        //   734: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   737: astore          36
        //   739: iload           5
        //   741: ifeq            756
        //   744: aload_0        
        //   745: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   748: ldc_w           2131230978
        //   751: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   754: astore          36
        //   756: aload_0        
        //   757: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   760: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   763: aload_1        
        //   764: invokestatic    com/whatsapp/App.i:(Lcom/whatsapp/protocol/bi;)J
        //   767: invokestatic    com/whatsapp/util/b6.k:(Landroid/content/Context;J)Ljava/lang/String;
        //   770: astore          37
        //   772: aload_0        
        //   773: aload_1        
        //   774: invokespecial   com/whatsapp/zb.a:(Lcom/whatsapp/protocol/bi;)I
        //   777: istore          38
        //   779: iload           38
        //   781: ifeq            835
        //   784: aload_1        
        //   785: getfield        com/whatsapp/protocol/bi.c:I
        //   788: istore          42
        //   790: iload           42
        //   792: bipush          6
        //   794: if_icmpne       811
        //   797: aload_3        
        //   798: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   801: bipush          8
        //   803: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   806: iload           5
        //   808: ifeq            844
        //   811: aload_3        
        //   812: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   815: aload_0        
        //   816: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   819: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   822: iload           38
        //   824: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   827: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   830: iload           5
        //   832: ifeq            844
        //   835: aload_3        
        //   836: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   839: bipush          8
        //   841: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   844: iload           5
        //   846: ifeq            1540
        //   849: aload           36
        //   851: astore          6
        //   853: aload           37
        //   855: astore          7
        //   857: aload_3        
        //   858: getfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   861: bipush          8
        //   863: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //   866: aload           7
        //   868: astore          9
        //   870: aload_3        
        //   871: getfield        com/whatsapp/ef.j:Landroid/widget/TextView;
        //   874: bipush          8
        //   876: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   879: aload_2        
        //   880: invokevirtual   com/whatsapp/a_9.m:()Z
        //   883: istore          16
        //   885: iload           16
        //   887: ifne            901
        //   890: aload_2        
        //   891: invokevirtual   com/whatsapp/a_9.k:()Z
        //   894: istore          34
        //   896: iload           34
        //   898: ifeq            1178
        //   901: aload           6
        //   903: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   906: istore          17
        //   908: iload           17
        //   910: ifne            1178
        //   913: aload_1        
        //   914: getfield        com/whatsapp/protocol/bi.c:I
        //   917: istore          21
        //   919: iload           21
        //   921: bipush          6
        //   923: if_icmpeq       1178
        //   926: aload_1        
        //   927: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   930: astore          22
        //   932: aload           22
        //   934: ifnull          1140
        //   937: aload_1        
        //   938: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   941: getfield        com/whatsapp/protocol/c6.b:Z
        //   944: ifeq            960
        //   947: aload_1        
        //   948: getfield        com/whatsapp/protocol/bi.c:I
        //   951: istore          33
        //   953: iload           33
        //   955: bipush          6
        //   957: if_icmpne       1140
        //   960: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   963: aload_1        
        //   964: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   967: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   970: astore          24
        //   972: aload           24
        //   974: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   977: invokestatic    com/whatsapp/App.au:()Ljava/lang/String;
        //   980: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   983: ifeq            1003
        //   986: aload_0        
        //   987: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   990: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //   993: getfield        com/whatsapp/aqv.j:Ljava/lang/String;
        //   996: astore          25
        //   998: iload           5
        //  1000: ifeq            1010
        //  1003: aload           24
        //  1005: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //  1008: astore          25
        //  1010: invokestatic    com/whatsapp/App.ak:()Z
        //  1013: istore          29
        //  1015: iload           29
        //  1017: ifeq            1032
        //  1020: aload           25
        //  1022: invokestatic    com/whatsapp/alm.a:(Ljava/lang/CharSequence;)Z
        //  1025: istore          32
        //  1027: iload           32
        //  1029: ifne            1050
        //  1032: invokestatic    com/whatsapp/App.ak:()Z
        //  1035: ifne            1080
        //  1038: aload           25
        //  1040: invokestatic    com/whatsapp/alm.a:(Ljava/lang/CharSequence;)Z
        //  1043: istore          31
        //  1045: iload           31
        //  1047: ifne            1080
        //  1050: new             Ljava/lang/StringBuilder;
        //  1053: dup            
        //  1054: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1057: aload           25
        //  1059: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1062: getstatic       com/whatsapp/zb.z:[Ljava/lang/String;
        //  1065: iconst_1       
        //  1066: aaload         
        //  1067: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1070: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1073: astore          25
        //  1075: iload           5
        //  1077: ifeq            1105
        //  1080: new             Ljava/lang/StringBuilder;
        //  1083: dup            
        //  1084: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1087: getstatic       com/whatsapp/zb.z:[Ljava/lang/String;
        //  1090: iconst_3       
        //  1091: aaload         
        //  1092: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1095: aload           25
        //  1097: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1100: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1103: astore          25
        //  1105: aload_3        
        //  1106: getfield        com/whatsapp/ef.j:Landroid/widget/TextView;
        //  1109: aload           25
        //  1111: aload_0        
        //  1112: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //  1115: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //  1118: invokevirtual   android/support/v4/app/FragmentActivity.getBaseContext:()Landroid/content/Context;
        //  1121: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //  1124: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //  1127: aload_3        
        //  1128: getfield        com/whatsapp/ef.j:Landroid/widget/TextView;
        //  1131: iconst_0       
        //  1132: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //  1135: iload           5
        //  1137: ifeq            1178
        //  1140: aload_1        
        //  1141: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //  1144: getfield        com/whatsapp/protocol/c6.b:Z
        //  1147: ifne            1178
        //  1150: new             Ljava/lang/StringBuilder;
        //  1153: dup            
        //  1154: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1157: getstatic       com/whatsapp/zb.z:[Ljava/lang/String;
        //  1160: iconst_2       
        //  1161: aaload         
        //  1162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1165: aload_1        
        //  1166: invokestatic    com/whatsapp/util/Log.a:(Lcom/whatsapp/protocol/bi;)Ljava/lang/String;
        //  1169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1172: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1175: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1178: aload_0        
        //  1179: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //  1182: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //  1185: invokevirtual   android/support/v4/app/FragmentActivity.getWindow:()Landroid/view/Window;
        //  1188: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //  1191: invokevirtual   android/view/View.getWidth:()I
        //  1194: i2f            
        //  1195: ldc_w           3.0
        //  1198: aload_0        
        //  1199: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //  1202: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //  1205: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //  1208: getfield        android/util/DisplayMetrics.density:F
        //  1211: fmul           
        //  1212: aload_0        
        //  1213: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //  1216: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //  1219: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //  1222: getfield        android/content/res/Configuration.fontScale:F
        //  1225: fmul           
        //  1226: fdiv           
        //  1227: f2i            
        //  1228: istore          18
        //  1230: aload           6
        //  1232: invokevirtual   java/lang/String.length:()I
        //  1235: iload           18
        //  1237: if_icmple       1533
        //  1240: aload           6
        //  1242: iconst_0       
        //  1243: iload           18
        //  1245: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1248: astore          19
        //  1250: aload           19
        //  1252: aload_0        
        //  1253: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //  1256: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //  1259: aload_3        
        //  1260: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //  1263: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //  1266: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;)Landroid/text/SpannableStringBuilder;
        //  1269: astore          20
        //  1271: aload_3        
        //  1272: getfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //  1275: aload_0        
        //  1276: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //  1279: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //  1282: aload           20
        //  1284: aload           19
        //  1286: aload           4
        //  1288: invokestatic    com/whatsapp/util/aa.a:(Landroid/content/Context;Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/util/List;)Ljava/lang/CharSequence;
        //  1291: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //  1294: aload_3        
        //  1295: getfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //  1298: aload           9
        //  1300: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //  1303: return         
        //  1304: astore          76
        //  1306: aload           76
        //  1308: athrow         
        //  1309: astore          78
        //  1311: aload           78
        //  1313: athrow         
        //  1314: aload_0        
        //  1315: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //  1318: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //  1321: getfield        com/whatsapp/aqv.h:Ljava/lang/String;
        //  1324: astore          36
        //  1326: aload_3        
        //  1327: getfield        com/whatsapp/ef.e:Landroid/view/View;
        //  1330: bipush          8
        //  1332: invokevirtual   android/view/View.setVisibility:(I)V
        //  1335: iload           5
        //  1337: ifeq            118
        //  1340: aload_0        
        //  1341: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //  1344: invokestatic    com/whatsapp/ConversationsFragment.h:(Lcom/whatsapp/ConversationsFragment;)Lcom/whatsapp/aqv;
        //  1347: getfield        com/whatsapp/aqv.b:Ljava/lang/String;
        //  1350: astore          36
        //  1352: aload_3        
        //  1353: getfield        com/whatsapp/ef.e:Landroid/view/View;
        //  1356: iconst_0       
        //  1357: invokevirtual   android/view/View.setVisibility:(I)V
        //  1360: iload           5
        //  1362: ifeq            118
        //  1365: goto            112
        //  1368: astore          81
        //  1370: aload           81
        //  1372: athrow         
        //  1373: astore          74
        //  1375: aload           74
        //  1377: athrow         
        //  1378: astore          60
        //  1380: aload           60
        //  1382: athrow         
        //  1383: astore          63
        //  1385: aload           63
        //  1387: athrow         
        //  1388: astore          64
        //  1390: aload           64
        //  1392: athrow         
        //  1393: astore          65
        //  1395: aload           65
        //  1397: athrow         
        //  1398: astore          66
        //  1400: aload           66
        //  1402: athrow         
        //  1403: astore          67
        //  1405: aload           67
        //  1407: athrow         
        //  1408: astore          68
        //  1410: aload           68
        //  1412: athrow         
        //  1413: astore          69
        //  1415: aload           69
        //  1417: athrow         
        //  1418: astore          61
        //  1420: aload           61
        //  1422: athrow         
        //  1423: astore          58
        //  1425: aload           58
        //  1427: athrow         
        //  1428: astore          51
        //  1430: aload           51
        //  1432: athrow         
        //  1433: astore          56
        //  1435: aload           56
        //  1437: athrow         
        //  1438: astore          52
        //  1440: aload           52
        //  1442: athrow         
        //  1443: astore          53
        //  1445: aload           53
        //  1447: athrow         
        //  1448: astore          43
        //  1450: aload           43
        //  1452: athrow         
        //  1453: astore          44
        //  1455: aload           44
        //  1457: athrow         
        //  1458: astore          40
        //  1460: aload           40
        //  1462: athrow         
        //  1463: astore          41
        //  1465: aload           41
        //  1467: athrow         
        //  1468: astore          39
        //  1470: aload           39
        //  1472: athrow         
        //  1473: astore          8
        //  1475: aload           8
        //  1477: athrow         
        //  1478: astore          10
        //  1480: aload           10
        //  1482: athrow         
        //  1483: astore          11
        //  1485: aload           11
        //  1487: athrow         
        //  1488: astore          12
        //  1490: aload           12
        //  1492: athrow         
        //  1493: astore          13
        //  1495: aload           13
        //  1497: athrow         
        //  1498: astore          14
        //  1500: aload           14
        //  1502: athrow         
        //  1503: astore          15
        //  1505: aload           15
        //  1507: athrow         
        //  1508: astore          26
        //  1510: aload           26
        //  1512: athrow         
        //  1513: astore          27
        //  1515: aload           27
        //  1517: athrow         
        //  1518: astore          28
        //  1520: aload           28
        //  1522: athrow         
        //  1523: astore          30
        //  1525: aload           30
        //  1527: athrow         
        //  1528: astore          23
        //  1530: aload           23
        //  1532: athrow         
        //  1533: aload           6
        //  1535: astore          19
        //  1537: goto            1250
        //  1540: aload           37
        //  1542: astore          9
        //  1544: aload           36
        //  1546: astore          6
        //  1548: goto            870
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  56     62     1304   1309   Ljava/lang/IllegalStateException;
        //  80     86     1309   1314   Ljava/lang/IllegalStateException;
        //  118    127    1368   1373   Ljava/lang/IllegalStateException;
        //  138    165    1373   1378   Ljava/lang/IllegalStateException;
        //  204    218    1378   1383   Ljava/lang/IllegalStateException;
        //  250    267    1383   1388   Ljava/lang/IllegalStateException;
        //  272    278    1388   1393   Ljava/lang/IllegalStateException;
        //  285    295    1393   1398   Ljava/lang/IllegalStateException;
        //  300    310    1398   1403   Ljava/lang/IllegalStateException;
        //  315    321    1403   1408   Ljava/lang/IllegalStateException;
        //  328    334    1408   1413   Ljava/lang/IllegalStateException;
        //  341    351    1413   1418   Ljava/lang/IllegalStateException;
        //  356    366    1413   1418   Ljava/lang/IllegalStateException;
        //  383    401    1418   1423   Ljava/lang/IllegalStateException;
        //  412    447    1423   1428   Ljava/lang/IllegalStateException;
        //  521    537    1428   1433   Ljava/lang/IllegalStateException;
        //  554    569    1433   1438   Ljava/lang/IllegalStateException;
        //  580    598    1438   1448   Ljava/lang/IllegalStateException;
        //  610    626    1448   1453   Ljava/lang/IllegalStateException;
        //  648    657    1453   1458   Ljava/lang/IllegalStateException;
        //  784    790    1458   1463   Ljava/lang/IllegalStateException;
        //  797    806    1463   1468   Ljava/lang/IllegalStateException;
        //  811    830    1468   1473   Ljava/lang/IllegalStateException;
        //  835    844    1468   1473   Ljava/lang/IllegalStateException;
        //  857    866    1473   1478   Ljava/lang/IllegalStateException;
        //  870    885    1478   1483   Ljava/lang/IllegalStateException;
        //  890    896    1483   1488   Ljava/lang/IllegalStateException;
        //  901    908    1488   1493   Ljava/lang/IllegalStateException;
        //  913    919    1493   1498   Ljava/lang/IllegalStateException;
        //  926    932    1498   1503   Ljava/lang/IllegalStateException;
        //  937    953    1503   1508   Ljava/lang/IllegalStateException;
        //  1010   1015   1508   1513   Ljava/lang/IllegalStateException;
        //  1020   1027   1513   1518   Ljava/lang/IllegalStateException;
        //  1032   1045   1518   1523   Ljava/lang/IllegalStateException;
        //  1105   1135   1523   1528   Ljava/lang/IllegalStateException;
        //  1140   1178   1528   1533   Ljava/lang/IllegalStateException;
        //  1370   1373   1373   1378   Ljava/lang/IllegalStateException;
        //  1385   1388   1388   1393   Ljava/lang/IllegalStateException;
        //  1390   1393   1393   1398   Ljava/lang/IllegalStateException;
        //  1395   1398   1398   1403   Ljava/lang/IllegalStateException;
        //  1400   1403   1403   1408   Ljava/lang/IllegalStateException;
        //  1405   1408   1408   1413   Ljava/lang/IllegalStateException;
        //  1410   1413   1413   1418   Ljava/lang/IllegalStateException;
        //  1420   1423   1423   1428   Ljava/lang/IllegalStateException;
        //  1440   1443   1443   1448   Ljava/lang/IllegalStateException;
        //  1445   1448   1448   1453   Ljava/lang/IllegalStateException;
        //  1460   1463   1463   1468   Ljava/lang/IllegalStateException;
        //  1465   1468   1468   1473   Ljava/lang/IllegalStateException;
        //  1480   1483   1483   1488   Ljava/lang/IllegalStateException;
        //  1485   1488   1488   1493   Ljava/lang/IllegalStateException;
        //  1490   1493   1493   1498   Ljava/lang/IllegalStateException;
        //  1495   1498   1498   1503   Ljava/lang/IllegalStateException;
        //  1500   1503   1503   1508   Ljava/lang/IllegalStateException;
        //  1510   1513   1513   1518   Ljava/lang/IllegalStateException;
        //  1515   1518   1518   1523   Ljava/lang/IllegalStateException;
        //  1525   1528   1528   1533   Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 704, Size: 704
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
    
    static void a(final zb zb, final Context context, final View view, final al_ al_, final ef ef) {
        zb.a(context, view, al_, ef);
    }
    
    public d7 a(final int n) {
        return ConversationsFragment.l(this.b).get(n);
    }
    
    public int getCount() {
        return ConversationsFragment.l(this.b).size();
    }
    
    public Filter getFilter() {
        return this.d;
    }
    
    public Object getItem(final int n) {
        return this.a(n);
    }
    
    public long getItemId(final int n) {
        return ConversationsFragment.l(this.b).get(n).hashCode();
    }
    
    public int getItemViewType(final int n) {
        try {
            if (this.a(n) instanceof aro) {
                return 1;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return 0;
    }
    
    public View getView(final int p0, final View p1, final ViewGroup p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: iload_1        
        //     7: invokevirtual   com/whatsapp/zb.a:(I)Lcom/whatsapp/d7;
        //    10: astore          5
        //    12: aload           5
        //    14: instanceof      Lcom/whatsapp/aro;
        //    17: istore          7
        //    19: iload           7
        //    21: ifeq            84
        //    24: aload_2        
        //    25: ifnonnull       47
        //    28: aload_0        
        //    29: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //    32: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    35: invokevirtual   android/support/v4/app/FragmentActivity.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    38: ldc_w           2130903140
        //    41: aconst_null    
        //    42: iconst_0       
        //    43: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    46: astore_2       
        //    47: aload_2        
        //    48: ldc_w           2131755086
        //    51: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    54: checkcast       Landroid/widget/TextView;
        //    57: astore          18
        //    59: aload           18
        //    61: invokestatic    com/whatsapp/vc.b:(Landroid/widget/TextView;)V
        //    64: aload           18
        //    66: aload           5
        //    68: checkcast       Lcom/whatsapp/aro;
        //    71: getfield        com/whatsapp/aro.a:Ljava/lang/String;
        //    74: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    77: aload_2        
        //    78: areturn        
        //    79: astore          6
        //    81: aload           6
        //    83: athrow         
        //    84: aload_2        
        //    85: ifnonnull       334
        //    88: aload_0        
        //    89: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //    92: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    95: getstatic       com/whatsapp/zb.z:[Ljava/lang/String;
        //    98: bipush          7
        //   100: aaload         
        //   101: invokevirtual   android/support/v4/app/FragmentActivity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   104: checkcast       Landroid/view/LayoutInflater;
        //   107: astore          16
        //   109: new             Lcom/whatsapp/ef;
        //   112: dup            
        //   113: invokespecial   com/whatsapp/ef.<init>:()V
        //   116: astore          8
        //   118: aload           16
        //   120: ldc_w           2130903139
        //   123: aload_3        
        //   124: iconst_0       
        //   125: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   128: astore          17
        //   130: aload           8
        //   132: aload           17
        //   134: ldc_w           2131755507
        //   137: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   140: checkcast       Landroid/widget/TextView;
        //   143: putfield        com/whatsapp/ef.b:Landroid/widget/TextView;
        //   146: aload           8
        //   148: aload           17
        //   150: ldc_w           2131755513
        //   153: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   156: putfield        com/whatsapp/ef.e:Landroid/view/View;
        //   159: aload           8
        //   161: aload           17
        //   163: ldc_w           2131755295
        //   166: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   169: checkcast       Landroid/widget/ImageView;
        //   172: putfield        com/whatsapp/ef.f:Landroid/widget/ImageView;
        //   175: aload           8
        //   177: aload           17
        //   179: ldc_w           2131755316
        //   182: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   185: putfield        com/whatsapp/ef.n:Landroid/view/View;
        //   188: aload           8
        //   190: aload           17
        //   192: ldc_w           2131755518
        //   195: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   198: checkcast       Landroid/widget/TextView;
        //   201: putfield        com/whatsapp/ef.m:Landroid/widget/TextView;
        //   204: aload           8
        //   206: aload           17
        //   208: ldc_w           2131755508
        //   211: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   214: checkcast       Landroid/widget/TextView;
        //   217: putfield        com/whatsapp/ef.j:Landroid/widget/TextView;
        //   220: aload           8
        //   222: aload           17
        //   224: ldc_w           2131755522
        //   227: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   230: checkcast       Landroid/widget/TextView;
        //   233: putfield        com/whatsapp/ef.h:Landroid/widget/TextView;
        //   236: aload           8
        //   238: aload           17
        //   240: ldc_w           2131755516
        //   243: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   246: checkcast       Landroid/widget/ImageView;
        //   249: putfield        com/whatsapp/ef.i:Landroid/widget/ImageView;
        //   252: aload           8
        //   254: aload           17
        //   256: ldc_w           2131755517
        //   259: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   262: checkcast       Landroid/widget/ImageView;
        //   265: putfield        com/whatsapp/ef.d:Landroid/widget/ImageView;
        //   268: aload           8
        //   270: aload           17
        //   272: ldc_w           2131755519
        //   275: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   278: checkcast       Landroid/widget/ImageView;
        //   281: putfield        com/whatsapp/ef.g:Landroid/widget/ImageView;
        //   284: aload           8
        //   286: aload           17
        //   288: ldc_w           2131755520
        //   291: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   294: checkcast       Landroid/widget/ImageView;
        //   297: putfield        com/whatsapp/ef.l:Landroid/widget/ImageView;
        //   300: aload           8
        //   302: aload           17
        //   304: ldc_w           2131755521
        //   307: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   310: putfield        com/whatsapp/ef.a:Landroid/view/View;
        //   313: aload           8
        //   315: aload           17
        //   317: ldc_w           2131755515
        //   320: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   323: checkcast       Landroid/widget/TextView;
        //   326: putfield        com/whatsapp/ef.k:Landroid/widget/TextView;
        //   329: iload           4
        //   331: ifeq            482
        //   334: aload_2        
        //   335: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   338: checkcast       Lcom/whatsapp/ef;
        //   341: astore          8
        //   343: aload           8
        //   345: aload           5
        //   347: putfield        com/whatsapp/ef.c:Lcom/whatsapp/d7;
        //   350: aload_2        
        //   351: aload           8
        //   353: invokevirtual   android/view/View.setTag:(Ljava/lang/Object;)V
        //   356: aload           5
        //   358: instanceof      Lcom/whatsapp/al_;
        //   361: istore          14
        //   363: iload           14
        //   365: ifeq            392
        //   368: aload_0        
        //   369: aload_0        
        //   370: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   373: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   376: aload_2        
        //   377: aload           5
        //   379: checkcast       Lcom/whatsapp/al_;
        //   382: aload           8
        //   384: invokespecial   com/whatsapp/zb.a:(Landroid/content/Context;Landroid/view/View;Lcom/whatsapp/al_;Lcom/whatsapp/ef;)V
        //   387: iload           4
        //   389: ifeq            77
        //   392: aload           5
        //   394: instanceof      Lcom/whatsapp/atv;
        //   397: istore          15
        //   399: iload           15
        //   401: ifeq            428
        //   404: aload_0        
        //   405: aload_0        
        //   406: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   409: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   412: aload_2        
        //   413: aload           5
        //   415: checkcast       Lcom/whatsapp/atv;
        //   418: aload           8
        //   420: invokespecial   com/whatsapp/zb.a:(Landroid/content/Context;Landroid/view/View;Lcom/whatsapp/atv;Lcom/whatsapp/ef;)V
        //   423: iload           4
        //   425: ifeq            77
        //   428: aload           5
        //   430: instanceof      Lcom/whatsapp/ce;
        //   433: ifeq            77
        //   436: aload_0        
        //   437: aload_0        
        //   438: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //   441: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   444: aload_2        
        //   445: aload           5
        //   447: checkcast       Lcom/whatsapp/ce;
        //   450: aload           8
        //   452: invokespecial   com/whatsapp/zb.a:(Landroid/content/Context;Landroid/view/View;Lcom/whatsapp/ce;Lcom/whatsapp/ef;)V
        //   455: aload_2        
        //   456: areturn        
        //   457: astore          13
        //   459: aload           13
        //   461: athrow         
        //   462: astore          9
        //   464: aload           9
        //   466: athrow         
        //   467: astore          10
        //   469: aload           10
        //   471: athrow         
        //   472: astore          11
        //   474: aload           11
        //   476: athrow         
        //   477: astore          12
        //   479: aload           12
        //   481: athrow         
        //   482: aload           17
        //   484: astore_2       
        //   485: goto            343
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  12     19     79     84     Ljava/lang/IllegalStateException;
        //  343    363    462    467    Ljava/lang/IllegalStateException;
        //  368    387    467    472    Ljava/lang/IllegalStateException;
        //  392    399    472    477    Ljava/lang/IllegalStateException;
        //  404    423    477    482    Ljava/lang/IllegalStateException;
        //  428    455    457    462    Ljava/lang/IllegalStateException;
        //  464    467    467    472    Ljava/lang/IllegalStateException;
        //  469    472    472    477    Ljava/lang/IllegalStateException;
        //  474    477    477    482    Ljava/lang/IllegalStateException;
        //  479    482    457    462    Ljava/lang/IllegalStateException;
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
    
    public int getViewTypeCount() {
        return 2;
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    public boolean isEmpty() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   android/widget/BaseAdapter.isEmpty:()Z
        //     4: istore          4
        //     6: iconst_0       
        //     7: istore          5
        //     9: iload           4
        //    11: ifeq            48
        //    14: aload_0        
        //    15: getfield        com/whatsapp/zb.b:Lcom/whatsapp/ConversationsFragment;
        //    18: invokestatic    com/whatsapp/ConversationsFragment.d:(Lcom/whatsapp/ConversationsFragment;)I
        //    21: istore          6
        //    23: iload           6
        //    25: ifeq            45
        //    28: aload_0        
        //    29: getfield        com/whatsapp/zb.a:Ljava/lang/String;
        //    32: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    35: istore          7
        //    37: iconst_0       
        //    38: istore          5
        //    40: iload           7
        //    42: ifne            48
        //    45: iconst_1       
        //    46: istore          5
        //    48: iload           5
        //    50: ireturn        
        //    51: astore_1       
        //    52: aload_1        
        //    53: athrow         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      51     54     Ljava/lang/IllegalStateException;
        //  14     23     54     57     Ljava/lang/IllegalStateException;
        //  28     37     57     60     Ljava/lang/IllegalStateException;
        //  52     54     54     57     Ljava/lang/IllegalStateException;
        //  55     57     57     60     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 34, Size: 34
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
