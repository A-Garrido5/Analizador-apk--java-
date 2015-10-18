// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import com.whatsapp.util.b;
import android.view.Menu;
import android.transition.Transition;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.os.Build$VERSION;
import java.util.Collection;
import com.whatsapp.util.Log;
import java.util.UnknownFormatConversionException;
import android.text.TextUtils;
import android.text.format.DateUtils;
import java.text.NumberFormat;
import android.widget.TextView;
import android.os.Bundle;
import android.content.ActivityNotFoundException;
import android.support.v4.app.ActivityCompat;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.app.Activity;
import java.util.List;
import java.util.ArrayList;
import android.widget.ListView;
import android.widget.LinearLayout;
import android.os.Handler;
import android.widget.ImageView;
import android.view.View;

public class ContactInfo extends ChatInfoActivity implements aws
{
    private static final String[] G;
    private View A;
    private ImageView B;
    private View C;
    Handler D;
    private ChatInfoLayout E;
    Runnable F;
    private l_ q;
    private LinearLayout r;
    private a9q s;
    private LinearLayout t;
    private CharSequence u;
    private View v;
    private ListView w;
    private final sj x;
    private a_9 y;
    private c5 z;
    
    static {
        final String[] g = new String[23];
        String s = "\u0005fMSf\nnMog\u0014nQCz\u0012fP^";
        int n = -1;
        String[] array = g;
        int n2 = 0;
        String intern = null;
    Label_0607:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = 'f';
                        break;
                    }
                    case 1: {
                        c2 = '\u000f';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = '0';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0005`QDr\u0005{V^u\t \\Bv\u0007{Z";
                    n2 = 1;
                    array = g;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\ff[";
                    n2 = 2;
                    array = g;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = g;
                    s = "\u0007a[B|\u000fk\u0011Y}\u0012jQD=\u0007lKY|\b!iyV1";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\ff[";
                    n = 3;
                    array = g;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0007a[B|\u000fk\u0011Y}\u0012jQD=\u0007lKY|\b!v~@#]k";
                    n = 4;
                    array = g;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0010a[\u001er\bkM_z\u0002!\\Ea\u0015`M\u001ez\u0012jR\u001fp\taKQp\u0012";
                    n = 5;
                    array = g;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0005`QDr\u0005{V^u\t P@gF|FCg\u0003b\u001fS|\b{^SgFcVCgFlPE\u007f\u0002/Q_gFiPE}\u0002";
                    n = 6;
                    array = g;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0007a[B|\u000fk\u0011Y}\u0012jQD=\u0007lKY|\b!v~@#]ko\\4PztZ2";
                    n = 7;
                    array = g;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0016gP^v";
                    n = 8;
                    array = g;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0016gP^v";
                    n = 9;
                    array = g;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0016gP^v9{F@v";
                    n = 10;
                    array = g;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0005`QDr\u0005{V^u\t J@w\u0007{Z";
                    n = 11;
                    array = g;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\ff[";
                    n = 12;
                    array = g;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\ff[";
                    n = 13;
                    array = g;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    s = "\ff[";
                    n = 14;
                    n2 = 15;
                    array = g;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    array = g;
                    s = "\u0005`QDr\u0005{V^u\t MU`\u0013cK\u001f`\rfO\u001fp\taKQp\u0012/Q_gFn[Tv\u0002/";
                    n = 15;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0005`QDr\u0005{V^u\t MU`\u0013cK\u001fp\taKQp\u0012/Q_gFn[Tv\u0002/";
                    n = 16;
                    array = g;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0005`QDr\u0005{V^u\t [U`\u0012}PI";
                    n = 17;
                    array = g;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "\u0005fMSf\nnMog\u0014nQCz\u0012fP^";
                    n = 18;
                    n2 = 19;
                    array = g;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = g;
                    s = "\ff[";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\ff[";
                    n = 20;
                    array = g;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\nnF_f\u0012PV^u\nnKUa";
                    n = 21;
                    array = g;
                    continue;
                }
                case 21: {
                    break Label_0607;
                }
            }
        }
        array[n2] = intern;
        G = g;
    }
    
    public ContactInfo() {
        this.s = new a9q();
        this.D = new Handler();
        this.F = new qw(this);
        this.x = new sb(this);
    }
    
    static l_ a(final ContactInfo contactInfo) {
        return contactInfo.q;
    }
    
    static void a(final ContactInfo contactInfo, final ArrayList list) {
        contactInfo.a(list);
    }
    
    static void a(final ContactInfo contactInfo, final List list) {
        contactInfo.a(list);
    }
    
    public static void a(final a_9 a_9, final Activity activity) {
        a(a_9, activity, null);
    }
    
    public static void a(final a_9 a_9, final Activity activity, final ActivityOptionsCompat activityOptionsCompat) {
        while (true) {
            final Intent intent = new Intent((Context)activity, (Class)ContactInfo.class);
            while (true) {
                try {
                    intent.putExtra(ContactInfo.G[20], a_9.u);
                    intent.putExtra(ContactInfo.G[19], true);
                    if (activityOptionsCompat == null) {
                        final Bundle bundle = null;
                        ActivityCompat.startActivity(activity, intent, bundle);
                        return;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                final Bundle bundle = activityOptionsCompat.toBundle();
                continue;
            }
        }
    }
    
    private void a(final ArrayList list) {
        while (true) {
            while (true) {
                try {
                    if (this.y == null) {
                        final String u = null;
                        this.a(list, u);
                        return;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                final String u = this.y.u;
                continue;
            }
        }
    }
    
    private void a(final List list) {
        try {
            this.q.a(list);
            if (this.q.getCount() == 0) {
                this.findViewById(2131755390).setVisibility(8);
                if (!App.I) {
                    return;
                }
            }
            this.findViewById(2131755390).setVisibility(0);
            ((TextView)this.findViewById(2131755392)).setText((CharSequence)NumberFormat.getInstance().format(this.q.getCount()));
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static long b(final ContactInfo contactInfo) {
        return contactInfo.g();
    }
    
    static void b(final ContactInfo contactInfo, final ArrayList list) {
        contactInfo.b(list);
    }
    
    private void b(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/ContactInfo.getBaseContext:()Landroid/content/Context;
        //     8: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //    11: bipush          22
        //    13: aaload         
        //    14: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    17: checkcast       Landroid/view/LayoutInflater;
        //    20: astore_3       
        //    21: aload_0        
        //    22: getfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //    25: invokevirtual   android/widget/LinearLayout.removeAllViews:()V
        //    28: new             Landroid/view/View;
        //    31: dup            
        //    32: aload_0        
        //    33: invokespecial   android/view/View.<init>:(Landroid/content/Context;)V
        //    36: astore          4
        //    38: aload_0        
        //    39: getfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //    42: aload           4
        //    44: iconst_m1      
        //    45: aload_0        
        //    46: invokevirtual   com/whatsapp/ContactInfo.getResources:()Landroid/content/res/Resources;
        //    49: ldc             2131361875
        //    51: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    54: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;II)V
        //    57: aload_1        
        //    58: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    61: astore          5
        //    63: iconst_0       
        //    64: istore          6
        //    66: aload           5
        //    68: invokeinterface java/util/Iterator.hasNext:()Z
        //    73: ifeq            470
        //    76: aload           5
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: checkcast       Lcom/whatsapp/adg;
        //    86: astore          8
        //    88: aload_3        
        //    89: ldc_w           2130903096
        //    92: aconst_null    
        //    93: iconst_0       
        //    94: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    97: astore          9
        //    99: aload_1        
        //   100: invokevirtual   java/util/ArrayList.size:()I
        //   103: istore          14
        //   105: iload           14
        //   107: iconst_1       
        //   108: if_icmpne       123
        //   111: aload           9
        //   113: ldc_w           2130838966
        //   116: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   119: iload_2        
        //   120: ifeq            239
        //   123: iload           6
        //   125: ifne            140
        //   128: aload           9
        //   130: ldc_w           2130838966
        //   133: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   136: iload_2        
        //   137: ifeq            239
        //   140: iload           6
        //   142: iconst_1       
        //   143: if_icmpne       204
        //   146: new             Landroid/view/View;
        //   149: dup            
        //   150: aload_0        
        //   151: invokespecial   android/view/View.<init>:(Landroid/content/Context;)V
        //   154: astore          15
        //   156: aload_0        
        //   157: getfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //   160: aload           15
        //   162: iconst_m1      
        //   163: aload_0        
        //   164: invokevirtual   com/whatsapp/ContactInfo.getResources:()Landroid/content/res/Resources;
        //   167: ldc             2131361875
        //   169: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   172: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;II)V
        //   175: aload           9
        //   177: ldc_w           2130838972
        //   180: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   183: aload           9
        //   185: ldc_w           2131755374
        //   188: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   191: checkcast       Landroid/widget/TextView;
        //   194: ldc_w           2131230930
        //   197: invokevirtual   android/widget/TextView.setText:(I)V
        //   200: iload_2        
        //   201: ifeq            239
        //   204: aload_1        
        //   205: invokevirtual   java/util/ArrayList.size:()I
        //   208: istore          31
        //   210: iload           6
        //   212: iload           31
        //   214: iconst_1       
        //   215: isub           
        //   216: if_icmpne       231
        //   219: aload           9
        //   221: ldc_w           2130838967
        //   224: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   227: iload_2        
        //   228: ifeq            239
        //   231: aload           9
        //   233: ldc_w           2130838971
        //   236: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   239: aload_0        
        //   240: getfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //   243: aload           9
        //   245: iconst_m1      
        //   246: bipush          -2
        //   248: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;II)V
        //   251: aload           9
        //   253: ldc_w           2131755262
        //   256: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   259: iconst_0       
        //   260: invokevirtual   android/view/View.setVisibility:(I)V
        //   263: aload           9
        //   265: ldc_w           2131755373
        //   268: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   271: astore          19
        //   273: aload           9
        //   275: ldc_w           2131755375
        //   278: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   281: astore          20
        //   283: iload           6
        //   285: ifeq            294
        //   288: iload           6
        //   290: iconst_1       
        //   291: if_icmpne       304
        //   294: aload           19
        //   296: iconst_0       
        //   297: invokevirtual   android/view/View.setVisibility:(I)V
        //   300: iload_2        
        //   301: ifeq            311
        //   304: aload           19
        //   306: bipush          8
        //   308: invokevirtual   android/view/View.setVisibility:(I)V
        //   311: aload           9
        //   313: ldc_w           2131755309
        //   316: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   319: astore          22
        //   321: aload_1        
        //   322: invokevirtual   java/util/ArrayList.size:()I
        //   325: istore          26
        //   327: iload           6
        //   329: iload           26
        //   331: iconst_1       
        //   332: isub           
        //   333: if_icmpeq       341
        //   336: iload           6
        //   338: ifne            352
        //   341: aload           22
        //   343: bipush          8
        //   345: invokevirtual   android/view/View.setVisibility:(I)V
        //   348: iload_2        
        //   349: ifeq            358
        //   352: aload           22
        //   354: iconst_0       
        //   355: invokevirtual   android/view/View.setVisibility:(I)V
        //   358: aload           8
        //   360: invokestatic    com/whatsapp/adg.d:(Lcom/whatsapp/adg;)Ljava/lang/String;
        //   363: astore          29
        //   365: aload           29
        //   367: ifnonnull       380
        //   370: aload           20
        //   372: iconst_4       
        //   373: invokevirtual   android/view/View.setVisibility:(I)V
        //   376: iload_2        
        //   377: ifeq            401
        //   380: aload           20
        //   382: iconst_0       
        //   383: invokevirtual   android/view/View.setVisibility:(I)V
        //   386: aload           20
        //   388: new             Lcom/whatsapp/lt;
        //   391: dup            
        //   392: aload_0        
        //   393: aload           8
        //   395: invokespecial   com/whatsapp/lt.<init>:(Lcom/whatsapp/ContactInfo;Lcom/whatsapp/adg;)V
        //   398: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   401: aload           9
        //   403: ldc_w           2131755376
        //   406: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   409: checkcast       Landroid/widget/TextView;
        //   412: aload           8
        //   414: invokestatic    com/whatsapp/adg.c:(Lcom/whatsapp/adg;)Ljava/lang/String;
        //   417: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   420: aload           9
        //   422: ldc_w           2131755377
        //   425: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   428: checkcast       Landroid/widget/TextView;
        //   431: aload           8
        //   433: invokestatic    com/whatsapp/adg.a:(Lcom/whatsapp/adg;)Ljava/lang/String;
        //   436: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   439: aload           9
        //   441: ldc_w           2131755378
        //   444: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   447: new             Lcom/whatsapp/zj;
        //   450: dup            
        //   451: aload_0        
        //   452: aload           8
        //   454: invokespecial   com/whatsapp/zj.<init>:(Lcom/whatsapp/ContactInfo;Lcom/whatsapp/adg;)V
        //   457: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   460: iload           6
        //   462: iconst_1       
        //   463: iadd           
        //   464: istore          30
        //   466: iload_2        
        //   467: ifeq            588
        //   470: new             Landroid/view/View;
        //   473: dup            
        //   474: aload_0        
        //   475: invokespecial   android/view/View.<init>:(Landroid/content/Context;)V
        //   478: astore          7
        //   480: aload_0        
        //   481: getfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //   484: aload           7
        //   486: iconst_m1      
        //   487: aload_0        
        //   488: invokevirtual   com/whatsapp/ContactInfo.getResources:()Landroid/content/res/Resources;
        //   491: ldc             2131361875
        //   493: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   496: invokevirtual   android/widget/LinearLayout.addView:(Landroid/view/View;II)V
        //   499: aload_0        
        //   500: getfield        com/whatsapp/ContactInfo.E:Lcom/whatsapp/ChatInfoLayout;
        //   503: aload_0        
        //   504: getfield        com/whatsapp/ContactInfo.A:Landroid/view/View;
        //   507: aload_0        
        //   508: getfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //   511: aload_0        
        //   512: getfield        com/whatsapp/ContactInfo.t:Landroid/widget/LinearLayout;
        //   515: aload_0        
        //   516: getfield        com/whatsapp/ContactInfo.q:Lcom/whatsapp/l_;
        //   519: invokevirtual   com/whatsapp/ChatInfoLayout.a:(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/Adapter;)V
        //   522: return         
        //   523: astore          10
        //   525: aload           10
        //   527: athrow         
        //   528: astore          11
        //   530: aload           11
        //   532: athrow         
        //   533: astore          12
        //   535: aload           12
        //   537: athrow         
        //   538: astore          13
        //   540: aload           13
        //   542: athrow         
        //   543: astore          16
        //   545: aload           16
        //   547: athrow         
        //   548: astore          17
        //   550: aload           17
        //   552: athrow         
        //   553: astore          18
        //   555: aload           18
        //   557: athrow         
        //   558: astore          21
        //   560: aload           21
        //   562: athrow         
        //   563: astore          23
        //   565: aload           23
        //   567: athrow         
        //   568: astore          24
        //   570: aload           24
        //   572: athrow         
        //   573: astore          25
        //   575: aload           25
        //   577: athrow         
        //   578: astore          27
        //   580: aload           27
        //   582: athrow         
        //   583: astore          28
        //   585: aload           28
        //   587: athrow         
        //   588: iload           30
        //   590: istore          6
        //   592: goto            66
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  99     105    523    528    Landroid/content/ActivityNotFoundException;
        //  111    119    528    538    Landroid/content/ActivityNotFoundException;
        //  128    136    538    543    Landroid/content/ActivityNotFoundException;
        //  156    200    543    548    Landroid/content/ActivityNotFoundException;
        //  204    210    548    553    Landroid/content/ActivityNotFoundException;
        //  219    227    553    558    Landroid/content/ActivityNotFoundException;
        //  231    239    553    558    Landroid/content/ActivityNotFoundException;
        //  294    300    558    563    Landroid/content/ActivityNotFoundException;
        //  304    311    558    563    Landroid/content/ActivityNotFoundException;
        //  321    327    563    573    Landroid/content/ActivityNotFoundException;
        //  341    348    573    578    Landroid/content/ActivityNotFoundException;
        //  352    358    573    578    Landroid/content/ActivityNotFoundException;
        //  358    365    578    583    Landroid/content/ActivityNotFoundException;
        //  370    376    583    588    Landroid/content/ActivityNotFoundException;
        //  380    401    583    588    Landroid/content/ActivityNotFoundException;
        //  525    528    528    538    Landroid/content/ActivityNotFoundException;
        //  530    533    533    538    Landroid/content/ActivityNotFoundException;
        //  535    538    538    543    Landroid/content/ActivityNotFoundException;
        //  545    548    548    553    Landroid/content/ActivityNotFoundException;
        //  550    553    553    558    Landroid/content/ActivityNotFoundException;
        //  565    568    568    573    Landroid/content/ActivityNotFoundException;
        //  570    573    573    578    Landroid/content/ActivityNotFoundException;
        //  580    583    583    588    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 278, Size: 278
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
    
    static a_9 c(final ContactInfo contactInfo) {
        return contactInfo.y;
    }
    
    static ImageView d(final ContactInfo contactInfo) {
        return contactInfo.B;
    }
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          8
        //     2: istore_1       
        //     3: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //     6: bipush          12
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: aload_0        
        //    13: aload_0        
        //    14: invokevirtual   com/whatsapp/ContactInfo.getIntent:()Landroid/content/Intent;
        //    17: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //    20: bipush          13
        //    22: aaload         
        //    23: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    26: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    29: putfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    32: aload_0        
        //    33: ldc_w           2131755391
        //    36: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //    39: checkcast       Landroid/widget/TextView;
        //    42: astore_2       
        //    43: iconst_1       
        //    44: anewarray       Ljava/lang/Object;
        //    47: astore_3       
        //    48: aload_3        
        //    49: iconst_0       
        //    50: aload_0        
        //    51: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    54: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //    57: aastore        
        //    58: aload_2        
        //    59: aload_0        
        //    60: ldc_w           2131231233
        //    63: aload_3        
        //    64: invokevirtual   com/whatsapp/ContactInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    67: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    70: aload_0        
        //    71: ldc_w           2131755361
        //    74: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //    77: checkcast       Landroid/widget/TextView;
        //    80: astore          4
        //    82: aload           4
        //    84: aload_0        
        //    85: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    88: aload_0        
        //    89: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    92: aload_0        
        //    93: invokevirtual   com/whatsapp/ContactInfo.getBaseContext:()Landroid/content/Context;
        //    96: aload           4
        //    98: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   101: ldc_w           0.82
        //   104: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;F)Ljava/lang/CharSequence;
        //   107: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   110: aload_0        
        //   111: ldc_w           2131755362
        //   114: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   117: checkcast       Landroid/widget/TextView;
        //   120: astore          5
        //   122: aload_0        
        //   123: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   126: invokevirtual   com/whatsapp/a_9.n:()Ljava/lang/String;
        //   129: astore          6
        //   131: aload           5
        //   133: aload           6
        //   135: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   138: aload           6
        //   140: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   143: istore          8
        //   145: iload           8
        //   147: ifeq            318
        //   150: aload           5
        //   152: iload_1        
        //   153: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   156: aload_0        
        //   157: ldc_w           2131755383
        //   160: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   163: checkcast       Landroid/widget/TextView;
        //   166: astore          9
        //   168: aload_0        
        //   169: ldc_w           2131755379
        //   172: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   175: astore          10
        //   177: aload_0        
        //   178: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   181: getfield        com/whatsapp/a_9.d:Ljava/lang/String;
        //   184: astore          13
        //   186: aload           13
        //   188: ifnull          265
        //   191: aload           10
        //   193: iconst_0       
        //   194: invokevirtual   android/view/View.setVisibility:(I)V
        //   197: aload_0        
        //   198: invokespecial   com/whatsapp/ContactInfo.f:()V
        //   201: aload_0        
        //   202: getfield        com/whatsapp/ContactInfo.D:Landroid/os/Handler;
        //   205: aload_0        
        //   206: getfield        com/whatsapp/ContactInfo.F:Ljava/lang/Runnable;
        //   209: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   212: aload_0        
        //   213: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   216: getfield        com/whatsapp/a_9.s:J
        //   219: lconst_0       
        //   220: lcmp           
        //   221: ifeq            240
        //   224: aload_0        
        //   225: getfield        com/whatsapp/ContactInfo.D:Landroid/os/Handler;
        //   228: aload_0        
        //   229: getfield        com/whatsapp/ContactInfo.F:Ljava/lang/Runnable;
        //   232: aload_0        
        //   233: invokespecial   com/whatsapp/ContactInfo.g:()J
        //   236: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   239: pop            
        //   240: aload           9
        //   242: aload_0        
        //   243: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   246: getfield        com/whatsapp/a_9.d:Ljava/lang/String;
        //   249: aload_0        
        //   250: invokevirtual   com/whatsapp/ContactInfo.getBaseContext:()Landroid/content/Context;
        //   253: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //   256: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   259: getstatic       com/whatsapp/App.I:Z
        //   262: ifeq            272
        //   265: aload           10
        //   267: bipush          8
        //   269: invokevirtual   android/view/View.setVisibility:(I)V
        //   272: aload_0        
        //   273: getfield        com/whatsapp/ContactInfo.z:Lcom/whatsapp/c5;
        //   276: ifnull          288
        //   279: aload_0        
        //   280: getfield        com/whatsapp/ContactInfo.z:Lcom/whatsapp/c5;
        //   283: iconst_1       
        //   284: invokevirtual   com/whatsapp/c5.cancel:(Z)Z
        //   287: pop            
        //   288: aload_0        
        //   289: new             Lcom/whatsapp/c5;
        //   292: dup            
        //   293: aload_0        
        //   294: invokespecial   com/whatsapp/c5.<init>:(Lcom/whatsapp/ContactInfo;)V
        //   297: putfield        com/whatsapp/ContactInfo.z:Lcom/whatsapp/c5;
        //   300: aload_0        
        //   301: getfield        com/whatsapp/ContactInfo.z:Lcom/whatsapp/c5;
        //   304: iconst_0       
        //   305: anewarray       Ljava/lang/Void;
        //   308: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   311: pop            
        //   312: return         
        //   313: astore          7
        //   315: aload           7
        //   317: athrow         
        //   318: iconst_0       
        //   319: istore_1       
        //   320: goto            150
        //   323: astore          11
        //   325: aload           11
        //   327: athrow         
        //   328: astore          12
        //   330: aload           12
        //   332: athrow         
        //   333: astore          14
        //   335: aload           14
        //   337: athrow         
        //   338: astore          15
        //   340: aload           15
        //   342: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  131    145    313    318    Landroid/content/ActivityNotFoundException;
        //  177    186    323    328    Landroid/content/ActivityNotFoundException;
        //  191    240    328    333    Landroid/content/ActivityNotFoundException;
        //  240    265    333    338    Landroid/content/ActivityNotFoundException;
        //  265    272    333    338    Landroid/content/ActivityNotFoundException;
        //  272    288    338    343    Landroid/content/ActivityNotFoundException;
        //  325    328    328    333    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 163, Size: 163
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
    
    static void e(final ContactInfo contactInfo) {
        contactInfo.e();
    }
    
    private void f() {
        final TextView textView = (TextView)this.findViewById(2131755381);
        Label_0093: {
            if (this.y.s == 0L) {
                break Label_0093;
            }
            try {
                final CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(App.b(this.y.s), System.currentTimeMillis(), 0L, 0);
                try {
                    if (!TextUtils.equals(this.u, relativeTimeSpanString)) {
                        textView.setText(this.u = relativeTimeSpanString);
                    }
                    return;
                }
                catch (UnknownFormatConversionException ex) {
                    throw ex;
                }
            }
            catch (UnknownFormatConversionException ex3) {
                final UnknownFormatConversionException ex2 = ex3;
                Log.b(ex2);
                final TextView textView2 = textView;
                final String s = "";
                textView2.setText((CharSequence)s);
                final boolean b = App.I;
                if (!b) {
                    return;
                }
            }
            try {
                final UnknownFormatConversionException ex3;
                final UnknownFormatConversionException ex2 = ex3;
                Log.b(ex2);
                final TextView textView2 = textView;
                final String s = "";
                textView2.setText((CharSequence)s);
                final boolean b = App.I;
                if (b) {
                    textView.setText((CharSequence)"");
                }
            }
            catch (UnknownFormatConversionException ex4) {
                throw ex4;
            }
        }
    }
    
    static void f(final ContactInfo contactInfo) {
        contactInfo.f();
    }
    
    private long g() {
        try {
            if (this.y.s == 0L) {
                return 60000L;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        final long n = System.currentTimeMillis() - App.b(this.y.s);
        if (n < 60000L) {
            return 500L;
        }
        if (n < 3600000L) {
            return 5000L;
        }
        return 20000L;
    }
    
    static a9q g(final ContactInfo contactInfo) {
        return contactInfo.s;
    }
    
    @Override
    public void a() {
        this.e();
        this.supportInvalidateOptionsMenu();
    }
    
    @Override
    public void a(final String s) {
        if (!s.equals(this.getIntent().getStringExtra(ContactInfo.G[2]))) {
            return;
        }
        while (true) {
            final TextView textView = (TextView)this.findViewById(2131755362);
            final String n = this.y.n();
            while (true) {
                try {
                    textView.setText((CharSequence)n);
                    if (TextUtils.isEmpty((CharSequence)n)) {
                        final int visibility = 8;
                        textView.setVisibility(visibility);
                        return;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                final int visibility = 0;
                continue;
            }
        }
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: aload_0        
        //     2: invokevirtual   com/whatsapp/ContactInfo.getIntent:()Landroid/content/Intent;
        //     5: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //     8: bipush          15
        //    10: aaload         
        //    11: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    14: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    17: ifeq            34
        //    20: aload_0        
        //    21: invokespecial   com/whatsapp/ContactInfo.e:()V
        //    24: getstatic       com/whatsapp/App.I:Z
        //    27: istore          8
        //    29: iload           8
        //    31: ifeq            89
        //    34: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    37: aload_1        
        //    38: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    41: astore_3       
        //    42: aload_3        
        //    43: ifnull          89
        //    46: new             Lcom/whatsapp/rq;
        //    49: dup            
        //    50: aload_3        
        //    51: invokespecial   com/whatsapp/rq.<init>:(Lcom/whatsapp/a_9;)V
        //    54: astore          4
        //    56: aload_0        
        //    57: getfield        com/whatsapp/ContactInfo.q:Lcom/whatsapp/l_;
        //    60: astore          7
        //    62: aload           7
        //    64: ifnull          89
        //    67: aload_0        
        //    68: getfield        com/whatsapp/ContactInfo.q:Lcom/whatsapp/l_;
        //    71: getfield        com/whatsapp/l_.b:Ljava/util/List;
        //    74: aload           4
        //    76: invokestatic    com/whatsapp/a_9.a:(Ljava/util/List;Lcom/whatsapp/w2;)Z
        //    79: ifeq            89
        //    82: aload_0        
        //    83: getfield        com/whatsapp/ContactInfo.q:Lcom/whatsapp/l_;
        //    86: invokevirtual   com/whatsapp/l_.notifyDataSetChanged:()V
        //    89: return         
        //    90: astore_2       
        //    91: aload_2        
        //    92: athrow         
        //    93: astore          5
        //    95: aload           5
        //    97: athrow         
        //    98: astore          6
        //   100: aload           6
        //   102: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      29     90     93     Landroid/content/ActivityNotFoundException;
        //  56     62     93     98     Landroid/content/ActivityNotFoundException;
        //  67     89     98     103    Landroid/content/ActivityNotFoundException;
        //  95     98     98     103    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 50, Size: 50
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
    public void c(final String s) {
        try {
            if (s.equals(this.getIntent().getStringExtra(ContactInfo.G[14]))) {
                this.e();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void d(final String s) {
        try {
            if (s.equals(this.getIntent().getStringExtra(ContactInfo.G[21]))) {
                this.e();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    public void finishAfterTransition() {
        if (Build$VERSION.SDK_INT >= 21) {
            this.v.setTransitionName((String)null);
            final TransitionSet returnTransition = new TransitionSet();
            final Slide slide = new Slide(48);
            ((Transition)slide).addTarget(this.v);
            returnTransition.addTransition((Transition)slide);
            final Slide slide2 = new Slide(80);
            ((Transition)slide2).addTarget((View)this.w);
            returnTransition.addTransition((Transition)slide2);
            this.getWindow().setReturnTransition((Transition)returnTransition);
        }
        super.finishAfterTransition();
    }
    
    @Override
    protected void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: iload_1        
        //     6: tableswitch {
        //               20: 29
        //               21: 142
        //          default: 28
        //        }
        //    28: return         
        //    29: iload_2        
        //    30: iconst_m1      
        //    31: if_icmpne       108
        //    34: aload_0        
        //    35: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    38: astore          14
        //    40: aload           14
        //    42: ifnull          108
        //    45: aload_3        
        //    46: ifnull          79
        //    49: aload_3        
        //    50: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    53: astore          16
        //    55: aload           16
        //    57: ifnull          79
        //    60: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    63: aload_3        
        //    64: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    67: aload_0        
        //    68: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    71: invokevirtual   com/whatsapp/wc.a:(Landroid/net/Uri;Lcom/whatsapp/a_9;)V
        //    74: iload           4
        //    76: ifeq            89
        //    79: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    82: aload_0        
        //    83: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    86: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //    89: aload_0        
        //    90: invokevirtual   com/whatsapp/ContactInfo.supportInvalidateOptionsMenu:()V
        //    93: aload_0        
        //    94: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    97: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   100: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   103: iload           4
        //   105: ifeq            28
        //   108: new             Ljava/lang/StringBuilder;
        //   111: dup            
        //   112: invokespecial   java/lang/StringBuilder.<init>:()V
        //   115: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   118: bipush          17
        //   120: aaload         
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: aload_0        
        //   125: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   128: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   131: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   134: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   137: iload           4
        //   139: ifeq            28
        //   142: iload_2        
        //   143: iconst_m1      
        //   144: if_icmpne       187
        //   147: aload_0        
        //   148: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   151: astore          7
        //   153: aload           7
        //   155: ifnull          187
        //   158: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   161: aload_0        
        //   162: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   165: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   168: aload_0        
        //   169: invokevirtual   com/whatsapp/ContactInfo.supportInvalidateOptionsMenu:()V
        //   172: aload_0        
        //   173: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   176: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   179: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   182: iload           4
        //   184: ifeq            28
        //   187: new             Ljava/lang/StringBuilder;
        //   190: dup            
        //   191: invokespecial   java/lang/StringBuilder.<init>:()V
        //   194: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   197: bipush          16
        //   199: aaload         
        //   200: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   203: aload_0        
        //   204: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   210: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   213: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   216: return         
        //   217: astore          5
        //   219: aload           5
        //   221: athrow         
        //   222: astore          10
        //   224: aload           10
        //   226: athrow         
        //   227: astore          11
        //   229: aload           11
        //   231: athrow         
        //   232: astore          12
        //   234: aload           12
        //   236: athrow         
        //   237: astore          13
        //   239: aload           13
        //   241: athrow         
        //   242: astore          15
        //   244: aload           15
        //   246: athrow         
        //   247: astore          8
        //   249: aload           8
        //   251: athrow         
        //   252: astore          9
        //   254: aload           9
        //   256: athrow         
        //   257: astore          6
        //   259: aload           6
        //   261: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  34     40     222    232    Landroid/content/ActivityNotFoundException;
        //  49     55     232    237    Landroid/content/ActivityNotFoundException;
        //  60     74     237    242    Landroid/content/ActivityNotFoundException;
        //  79     89     237    242    Landroid/content/ActivityNotFoundException;
        //  89     103    242    247    Landroid/content/ActivityNotFoundException;
        //  108    137    247    257    Landroid/content/ActivityNotFoundException;
        //  147    153    257    262    Landroid/content/ActivityNotFoundException;
        //  158    182    217    222    Landroid/content/ActivityNotFoundException;
        //  187    216    217    222    Landroid/content/ActivityNotFoundException;
        //  224    227    227    232    Landroid/content/ActivityNotFoundException;
        //  229    232    232    237    Landroid/content/ActivityNotFoundException;
        //  234    237    237    242    Landroid/content/ActivityNotFoundException;
        //  244    247    247    257    Landroid/content/ActivityNotFoundException;
        //  249    252    252    257    Landroid/content/ActivityNotFoundException;
        //  254    257    257    262    Landroid/content/ActivityNotFoundException;
        //  259    262    217    222    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 114, Size: 114
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
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //     3: iconst_1       
        //     4: aaload         
        //     5: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: aload_1        
        //    10: invokespecial   com/whatsapp/ChatInfoActivity.onCreate:(Landroid/os/Bundle;)V
        //    13: aload_0        
        //    14: invokevirtual   com/whatsapp/ContactInfo.supportPostponeEnterTransition:()V
        //    17: aload_0        
        //    18: aload_0        
        //    19: invokevirtual   com/whatsapp/ContactInfo.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    22: ldc_w           2130903095
        //    25: aconst_null    
        //    26: iconst_0       
        //    27: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    30: checkcast       Lcom/whatsapp/ChatInfoLayout;
        //    33: putfield        com/whatsapp/ContactInfo.E:Lcom/whatsapp/ChatInfoLayout;
        //    36: aload_0        
        //    37: aload_0        
        //    38: getfield        com/whatsapp/ContactInfo.E:Lcom/whatsapp/ChatInfoLayout;
        //    41: invokevirtual   com/whatsapp/ContactInfo.setContentView:(Landroid/view/View;)V
        //    44: aload_0        
        //    45: ldc_w           2131755371
        //    48: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //    51: checkcast       Landroid/support/v7/widget/Toolbar;
        //    54: astore_2       
        //    55: aload_2        
        //    56: ldc_w           ""
        //    59: invokevirtual   android/support/v7/widget/Toolbar.setTitle:(Ljava/lang/CharSequence;)V
        //    62: aload_2        
        //    63: iconst_0       
        //    64: iconst_0       
        //    65: invokevirtual   android/support/v7/widget/Toolbar.setContentInsetsAbsolute:(II)V
        //    68: aload_0        
        //    69: aload_2        
        //    70: invokevirtual   com/whatsapp/ContactInfo.setSupportActionBar:(Landroid/support/v7/widget/Toolbar;)V
        //    73: aload_0        
        //    74: invokevirtual   com/whatsapp/ContactInfo.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    77: iconst_1       
        //    78: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    81: aload_2        
        //    82: new             Lcom/whatsapp/util/m;
        //    85: dup            
        //    86: aload_0        
        //    87: invokevirtual   com/whatsapp/ContactInfo.getResources:()Landroid/content/res/Resources;
        //    90: ldc_w           2130838738
        //    93: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    96: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //    99: invokevirtual   android/support/v7/widget/Toolbar.setNavigationIcon:(Landroid/graphics/drawable/Drawable;)V
        //   102: aload_0        
        //   103: aload_0        
        //   104: invokevirtual   com/whatsapp/ContactInfo.c:()Landroid/widget/ListView;
        //   107: putfield        com/whatsapp/ContactInfo.w:Landroid/widget/ListView;
        //   110: aload_0        
        //   111: aload_0        
        //   112: invokevirtual   com/whatsapp/ContactInfo.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   115: ldc_w           2130903097
        //   118: aload_0        
        //   119: getfield        com/whatsapp/ContactInfo.w:Landroid/widget/ListView;
        //   122: iconst_0       
        //   123: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   126: putfield        com/whatsapp/ContactInfo.A:Landroid/view/View;
        //   129: aload_0        
        //   130: getfield        com/whatsapp/ContactInfo.w:Landroid/widget/ListView;
        //   133: aload_0        
        //   134: getfield        com/whatsapp/ContactInfo.A:Landroid/view/View;
        //   137: aconst_null    
        //   138: iconst_0       
        //   139: invokevirtual   android/widget/ListView.addHeaderView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   142: aload_0        
        //   143: aload_0        
        //   144: ldc_w           2131755280
        //   147: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   150: putfield        com/whatsapp/ContactInfo.v:Landroid/view/View;
        //   153: aload_0        
        //   154: getfield        com/whatsapp/ContactInfo.E:Lcom/whatsapp/ChatInfoLayout;
        //   157: invokevirtual   com/whatsapp/ChatInfoLayout.b:()V
        //   160: aload_0        
        //   161: getfield        com/whatsapp/ContactInfo.E:Lcom/whatsapp/ChatInfoLayout;
        //   164: aload_0        
        //   165: invokevirtual   com/whatsapp/ContactInfo.getResources:()Landroid/content/res/Resources;
        //   168: ldc_w           2131361822
        //   171: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   174: iconst_0       
        //   175: invokevirtual   com/whatsapp/ChatInfoLayout.setCollapsedPadding:(II)V
        //   178: aload_0        
        //   179: new             Landroid/widget/LinearLayout;
        //   182: dup            
        //   183: aload_0        
        //   184: invokespecial   android/widget/LinearLayout.<init>:(Landroid/content/Context;)V
        //   187: putfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //   190: aload_0        
        //   191: getfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //   194: iconst_1       
        //   195: invokevirtual   android/widget/LinearLayout.setOrientation:(I)V
        //   198: aload_0        
        //   199: getfield        com/whatsapp/ContactInfo.w:Landroid/widget/ListView;
        //   202: aload_0        
        //   203: getfield        com/whatsapp/ContactInfo.r:Landroid/widget/LinearLayout;
        //   206: aconst_null    
        //   207: iconst_0       
        //   208: invokevirtual   android/widget/ListView.addFooterView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   211: aload_0        
        //   212: new             Landroid/widget/LinearLayout;
        //   215: dup            
        //   216: aload_0        
        //   217: invokespecial   android/widget/LinearLayout.<init>:(Landroid/content/Context;)V
        //   220: putfield        com/whatsapp/ContactInfo.t:Landroid/widget/LinearLayout;
        //   223: aload_0        
        //   224: invokevirtual   com/whatsapp/ContactInfo.getWindowManager:()Landroid/view/WindowManager;
        //   227: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   232: invokevirtual   android/view/Display.getHeight:()I
        //   235: istore_3       
        //   236: aload_0        
        //   237: getfield        com/whatsapp/ContactInfo.t:Landroid/widget/LinearLayout;
        //   240: iconst_0       
        //   241: iconst_0       
        //   242: iconst_0       
        //   243: iload_3        
        //   244: invokevirtual   android/widget/LinearLayout.setPadding:(IIII)V
        //   247: aload_0        
        //   248: getfield        com/whatsapp/ContactInfo.w:Landroid/widget/ListView;
        //   251: aload_0        
        //   252: getfield        com/whatsapp/ContactInfo.t:Landroid/widget/LinearLayout;
        //   255: aconst_null    
        //   256: iconst_0       
        //   257: invokevirtual   android/widget/ListView.addFooterView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   260: aload_0        
        //   261: aload_0        
        //   262: ldc_w           2131755367
        //   265: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   268: checkcast       Landroid/widget/ImageView;
        //   271: putfield        com/whatsapp/ContactInfo.B:Landroid/widget/ImageView;
        //   274: aload_0        
        //   275: ldc_w           2131755370
        //   278: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   281: new             Lcom/whatsapp/un;
        //   284: dup            
        //   285: aload_0        
        //   286: invokespecial   com/whatsapp/un.<init>:(Lcom/whatsapp/ContactInfo;)V
        //   289: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   292: aload_0        
        //   293: aload_0        
        //   294: ldc_w           2131755358
        //   297: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   300: putfield        com/whatsapp/ContactInfo.C:Landroid/view/View;
        //   303: new             Lcom/whatsapp/xz;
        //   306: dup            
        //   307: aload_0        
        //   308: invokespecial   com/whatsapp/xz.<init>:(Lcom/whatsapp/ContactInfo;)V
        //   311: astore          4
        //   313: aload_0        
        //   314: ldc_w           2131755385
        //   317: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   320: aload           4
        //   322: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   325: aload_0        
        //   326: ldc_w           2131755386
        //   329: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   332: aload           4
        //   334: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   337: aload_0        
        //   338: getfield        com/whatsapp/ContactInfo.w:Landroid/widget/ListView;
        //   341: new             Lcom/whatsapp/ne;
        //   344: dup            
        //   345: aload_0        
        //   346: invokespecial   com/whatsapp/ne.<init>:(Lcom/whatsapp/ContactInfo;)V
        //   349: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   352: aload_0        
        //   353: new             Lcom/whatsapp/l_;
        //   356: dup            
        //   357: aload_0        
        //   358: aload_0        
        //   359: invokespecial   com/whatsapp/l_.<init>:(Lcom/whatsapp/ContactInfo;Landroid/content/Context;)V
        //   362: putfield        com/whatsapp/ContactInfo.q:Lcom/whatsapp/l_;
        //   365: aload_0        
        //   366: getfield        com/whatsapp/ContactInfo.w:Landroid/widget/ListView;
        //   369: aload_0        
        //   370: getfield        com/whatsapp/ContactInfo.q:Lcom/whatsapp/l_;
        //   373: invokevirtual   android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
        //   376: aload_0        
        //   377: aconst_null    
        //   378: invokespecial   com/whatsapp/ContactInfo.a:(Ljava/util/List;)V
        //   381: aload_0        
        //   382: aconst_null    
        //   383: invokespecial   com/whatsapp/ContactInfo.a:(Ljava/util/ArrayList;)V
        //   386: aload_0        
        //   387: iconst_1       
        //   388: invokevirtual   com/whatsapp/ContactInfo.setSupportProgressBarIndeterminateVisibility:(Z)V
        //   391: aload_0        
        //   392: invokespecial   com/whatsapp/ContactInfo.e:()V
        //   395: aload_0        
        //   396: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   399: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   402: invokestatic    com/whatsapp/util/b.a:(Ljava/lang/String;)V
        //   405: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   408: aload_0        
        //   409: getfield        com/whatsapp/ContactInfo.x:Lcom/whatsapp/sj;
        //   412: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/sj;)V
        //   415: aload_0        
        //   416: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //   419: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   422: istore          8
        //   424: iload           8
        //   426: bipush          21
        //   428: if_icmplt       488
        //   431: aload_0        
        //   432: invokevirtual   com/whatsapp/ContactInfo.getIntent:()Landroid/content/Intent;
        //   435: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   438: iconst_0       
        //   439: aaload         
        //   440: iconst_0       
        //   441: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   444: istore          9
        //   446: iload           9
        //   448: ifeq            471
        //   451: aload_0        
        //   452: getfield        com/whatsapp/ContactInfo.v:Landroid/view/View;
        //   455: aload_0        
        //   456: ldc_w           2131232142
        //   459: invokevirtual   com/whatsapp/ContactInfo.getString:(I)Ljava/lang/String;
        //   462: invokevirtual   android/view/View.setTransitionName:(Ljava/lang/String;)V
        //   465: getstatic       com/whatsapp/App.I:Z
        //   468: ifeq            488
        //   471: aload_0        
        //   472: ldc_w           2131755367
        //   475: invokevirtual   com/whatsapp/ContactInfo.findViewById:(I)Landroid/view/View;
        //   478: aload_0        
        //   479: ldc_w           2131232142
        //   482: invokevirtual   com/whatsapp/ContactInfo.getString:(I)Ljava/lang/String;
        //   485: invokevirtual   android/view/View.setTransitionName:(Ljava/lang/String;)V
        //   488: return         
        //   489: astore          5
        //   491: aload           5
        //   493: athrow         
        //   494: astore          6
        //   496: aload           6
        //   498: athrow         
        //   499: astore          7
        //   501: aload           7
        //   503: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  313    424    489    494    Landroid/content/ActivityNotFoundException;
        //  431    446    494    499    Landroid/content/ActivityNotFoundException;
        //  451    471    499    504    Landroid/content/ActivityNotFoundException;
        //  471    488    499    504    Landroid/content/ActivityNotFoundException;
        //  491    494    494    499    Landroid/content/ActivityNotFoundException;
        //  496    499    499    504    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 242, Size: 242
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
    public boolean onCreateOptionsMenu(final Menu p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          130
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    15: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    18: astore          6
        //    20: aload           6
        //    22: ifnull          96
        //    25: aload_1        
        //    26: iconst_0       
        //    27: iconst_1       
        //    28: iconst_0       
        //    29: ldc_w           2131231909
        //    32: invokeinterface android/view/Menu.add:(IIII)Landroid/view/MenuItem;
        //    37: ldc_w           2130838784
        //    40: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //    45: pop            
        //    46: iconst_1       
        //    47: anewarray       Ljava/lang/Object;
        //    50: astore          10
        //    52: aload           10
        //    54: iconst_0       
        //    55: aload_0        
        //    56: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    59: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //    62: aastore        
        //    63: aload_1        
        //    64: iconst_0       
        //    65: iconst_2       
        //    66: iconst_0       
        //    67: aload_0        
        //    68: ldc_w           2131231450
        //    71: aload           10
        //    73: invokevirtual   com/whatsapp/ContactInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    76: invokeinterface android/view/Menu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //    81: ldc_w           2130838797
        //    84: invokeinterface android/view/MenuItem.setIcon:(I)Landroid/view/MenuItem;
        //    89: pop            
        //    90: getstatic       com/whatsapp/App.I:Z
        //    93: ifeq            130
        //    96: aload_1        
        //    97: iconst_0       
        //    98: iconst_3       
        //    99: iconst_0       
        //   100: aload_0        
        //   101: ldc_w           2131230790
        //   104: invokevirtual   com/whatsapp/ContactInfo.getString:(I)Ljava/lang/String;
        //   107: invokeinterface android/view/Menu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   112: pop            
        //   113: aload_1        
        //   114: iconst_0       
        //   115: iconst_4       
        //   116: iconst_0       
        //   117: aload_0        
        //   118: ldc_w           2131230792
        //   121: invokevirtual   com/whatsapp/ContactInfo.getString:(I)Ljava/lang/String;
        //   124: invokeinterface android/view/Menu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   129: pop            
        //   130: aload_0        
        //   131: aload_1        
        //   132: invokespecial   com/whatsapp/ChatInfoActivity.onCreateOptionsMenu:(Landroid/view/Menu;)Z
        //   135: ireturn        
        //   136: astore_2       
        //   137: aload_2        
        //   138: athrow         
        //   139: astore_3       
        //   140: aload_3        
        //   141: athrow         
        //   142: astore          4
        //   144: aload           4
        //   146: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      136    139    Landroid/content/ActivityNotFoundException;
        //  11     20     139    142    Landroid/content/ActivityNotFoundException;
        //  25     96     142    147    Landroid/content/ActivityNotFoundException;
        //  96     130    142    147    Landroid/content/ActivityNotFoundException;
        //  137    139    139    142    Landroid/content/ActivityNotFoundException;
        //  140    142    142    147    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 74, Size: 74
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
    
    public void onDestroy() {
        try {
            super.onDestroy();
            Log.i(ContactInfo.G[18]);
            if (this.z != null) {
                this.z.cancel(true);
            }
            App.a((aws)this);
            App.ak.b(this.x);
            this.s.a();
            com.whatsapp.util.b.c(this.y.u);
            this.D.removeCallbacks(this.F);
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_1        
        //     3: invokeinterface android/view/MenuItem.getItemId:()I
        //     8: lookupswitch {
        //                1: 60
        //                2: 174
        //                3: 213
        //                4: 266
        //          16908332: 352
        //          default: 358
        //        }
        //    60: aload_0        
        //    61: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    64: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    67: astore          15
        //    69: aload           15
        //    71: ifnull          360
        //    74: aload_0        
        //    75: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //    78: aload_0        
        //    79: invokevirtual   com/whatsapp/ContactInfo.getContentResolver:()Landroid/content/ContentResolver;
        //    82: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/ContentResolver;)Landroid/net/Uri;
        //    85: astore          16
        //    87: aload           16
        //    89: ifnull          360
        //    92: new             Landroid/content/Intent;
        //    95: dup            
        //    96: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //    99: iconst_3       
        //   100: aaload         
        //   101: aload           16
        //   103: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //   106: astore          17
        //   108: aload           17
        //   110: aload           17
        //   112: aload_0        
        //   113: invokevirtual   com/whatsapp/ContactInfo.getPackageManager:()Landroid/content/pm/PackageManager;
        //   116: invokevirtual   android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
        //   119: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //   122: pop            
        //   123: aload           17
        //   125: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //   128: ifnull          147
        //   131: aload_0        
        //   132: aload           17
        //   134: invokevirtual   com/whatsapp/ContactInfo.startActivity:(Landroid/content/Intent;)V
        //   137: getstatic       com/whatsapp/App.I:Z
        //   140: istore          21
        //   142: iload           21
        //   144: ifeq            360
        //   147: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   150: bipush          7
        //   152: aaload         
        //   153: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   156: invokestatic    com/whatsapp/App.N:()V
        //   159: iload_2        
        //   160: ireturn        
        //   161: astore          19
        //   163: aload           19
        //   165: athrow         
        //   166: astore_3       
        //   167: aload_3        
        //   168: athrow         
        //   169: astore          18
        //   171: aload           18
        //   173: athrow         
        //   174: new             Landroid/content/Intent;
        //   177: dup            
        //   178: aload_0        
        //   179: ldc_w           Lcom/whatsapp/AccountInfoActivity;.class
        //   182: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   185: astore          13
        //   187: aload           13
        //   189: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   192: iconst_4       
        //   193: aaload         
        //   194: aload_0        
        //   195: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   198: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   201: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   204: pop            
        //   205: aload_0        
        //   206: aload           13
        //   208: invokevirtual   com/whatsapp/ContactInfo.startActivity:(Landroid/content/Intent;)V
        //   211: iload_2        
        //   212: ireturn        
        //   213: new             Landroid/content/Intent;
        //   216: dup            
        //   217: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   220: iconst_5       
        //   221: aaload         
        //   222: getstatic       android/provider/ContactsContract$Contacts.CONTENT_URI:Landroid/net/Uri;
        //   225: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //   228: astore          10
        //   230: aload           10
        //   232: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   235: bipush          9
        //   237: aaload         
        //   238: aload_0        
        //   239: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   242: invokevirtual   com/whatsapp/a_9.f:()Ljava/lang/String;
        //   245: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   248: pop            
        //   249: aload_0        
        //   250: aload           10
        //   252: bipush          10
        //   254: invokevirtual   com/whatsapp/ContactInfo.startActivityForResult:(Landroid/content/Intent;I)V
        //   257: iload_2        
        //   258: ireturn        
        //   259: astore          12
        //   261: invokestatic    com/whatsapp/App.N:()V
        //   264: iload_2        
        //   265: ireturn        
        //   266: new             Landroid/content/Intent;
        //   269: dup            
        //   270: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   273: bipush          8
        //   275: aaload         
        //   276: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   279: astore          4
        //   281: aload           4
        //   283: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   286: bipush          6
        //   288: aaload         
        //   289: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   292: pop            
        //   293: aload           4
        //   295: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   298: bipush          10
        //   300: aaload         
        //   301: aload_0        
        //   302: getfield        com/whatsapp/ContactInfo.y:Lcom/whatsapp/a_9;
        //   305: aload_0        
        //   306: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   309: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   312: pop            
        //   313: aload           4
        //   315: getstatic       com/whatsapp/ContactInfo.G:[Ljava/lang/String;
        //   318: bipush          11
        //   320: aaload         
        //   321: iconst_2       
        //   322: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   325: pop            
        //   326: aload           4
        //   328: ldc_w           524288
        //   331: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   334: pop            
        //   335: aload_0        
        //   336: aload           4
        //   338: bipush          11
        //   340: invokevirtual   com/whatsapp/ContactInfo.startActivityForResult:(Landroid/content/Intent;I)V
        //   343: iload_2        
        //   344: ireturn        
        //   345: astore          9
        //   347: invokestatic    com/whatsapp/App.N:()V
        //   350: iload_2        
        //   351: ireturn        
        //   352: aload_0        
        //   353: invokestatic    android/support/v4/app/ActivityCompat.finishAfterTransition:(Landroid/app/Activity;)V
        //   356: iload_2        
        //   357: ireturn        
        //   358: iconst_0       
        //   359: istore_2       
        //   360: iload_2        
        //   361: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  2      60     166    169    Landroid/content/ActivityNotFoundException;
        //  60     69     166    169    Landroid/content/ActivityNotFoundException;
        //  108    142    169    174    Landroid/content/ActivityNotFoundException;
        //  147    159    161    166    Landroid/content/ActivityNotFoundException;
        //  171    174    161    166    Landroid/content/ActivityNotFoundException;
        //  249    257    259    266    Landroid/content/ActivityNotFoundException;
        //  335    343    345    352    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0147:
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
    
    public void onResume() {
        super.onResume();
        App.c(this.y);
    }
}
