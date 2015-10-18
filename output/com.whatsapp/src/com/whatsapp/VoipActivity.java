// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.text.TextUtils;
import java.util.Collection;
import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.os.AsyncTask;
import com.whatsapp.util.Log;
import android.content.ServiceConnection;
import android.os.Handler;
import android.widget.TextView;
import android.support.v4.app.DialogFragment;

public class VoipActivity extends DialogToastActivity implements aws, px
{
    private static final String[] z;
    private DialogFragment k;
    private TextView l;
    private boolean m;
    private String n;
    private final Runnable o;
    private TextView p;
    private Handler q;
    private boolean r;
    private VoiceService s;
    private boolean t;
    private ServiceConnection u;
    
    static {
        final String[] z2 = new String[44];
        String s = "~(n?#^(n?Mk3n9e|>(,md+(*bl";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1132:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = '\u0007';
                        break;
                    }
                    case 3: {
                        c2 = 'O';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "~(n?#^(n?Mk3n9e|>(:bj.i+_m5q&om";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "~(n?#^(n?Mk3n9e|>( bX&r<i";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "~(n?#^(n?Mk3n9e|>(,md+(.ok\"w;";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "~(n?#^(n?Mk3n9e|>(,md+(=ib\"d;";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "~(n?#^(n?Mk3n9e|>) b]4b=@m&q*Da)s";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "~(n?#^(n?Mk3n9e|>( bC\"~\u000bc\u007f)'*blgd.`dga=cegu*ag3boog)s=cd";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "~(n?#^(n?Mk3n9e|>( bC\"~\u000bc\u007f)'.ok\"w;,k&k#,n5h\",z\"j xmgd b|5h#";
                    n = 6;
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "~(n?#^(n?Mk3n9e|>( bC\"~\u000bc\u007f)'=ib\"d;,k&k#,n5h\",z\"j xmgd b|5h#";
                    n2 = 8;
                    array = z2;
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "~(n?#^(n?Mk3n9e|>( bC\"~\u000bc\u007f)'";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "~(n?#^(n?Mk3n9e|>(:|l&s*N}3s b[3f;i{hi:`d";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "~(n?#^(n?Mk3n9e|>(:|l&s*N}3s b[3f;i{hf!\u007f\u007f\"u\fmd+Q&i\u007fhq&\u007fa%k*";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    s = "~(n?#^(n?Mk3n9e|>(:|l&s*N}3s b[3f;i{";
                    n = 11;
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    array = z2;
                    s = "~(n?#^(n?Mk3n9e|>(,md+T;m|\"D'mf b+,a)a ,5z'\u0001YD\u000b')ef.t'ef ',yz5b!x(&d;e~.s6";
                    n = 12;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "{/h8Oi+k\tma+b+Am4t.km";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "~(n?#^(n?Mk3n9e|>( b[3f=x";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "~(n?#^(n?Mk3n9e|>( b[3f=x($f#`W)h;Si$s&zmk')ef.t'ef ";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "^(n?Mk3n9e|>'=iy2b<xa)`o|z(a&`mgn\"mo\"' j(4n5i2g";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "~(n?#^(n?Mk3n9e|>( b[3h?";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "~(n?#^(n?Mk3n9e|>( bL\"t;~g>";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "~(n?#^(n?Mk3n9e|>(!i\u007fjn!xm)somk3n9e|>'&\u007f(!n!e{/n!k$gc ,f(s'ef ";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "$gn<,n.i&\u007f`.i(,";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "k(ja{`&s<mx7)&b|\"i;\"i$s&cfiF\fOM\u0017S\u0010OI\u000bK";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "~(n?#^(n?Mk3n9e|>( bF\"p\u0006b|\"i;#F\"p\fmd+',`m&u&bogt;m|\"t";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "~(n?#^(n?Mk3n9e|>( bF\"p\u0006b|\"i;,";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "$gf,xa(io";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "f\"p\fmd+";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "~(n?#^(n?Mk3n9e|>(:|l&s*Oi+k\u001cxi3r<Ni5(!yd+";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "~(n?#^(n?Mk3n9e|>(:|l&s*Oi+k\u001cxi3r<Ni5(:bc)h8bK&k#_|&s*";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "a)w:xW*b;dg#";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "k&k#mj.k&xqgd'mf b+,n(uo";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "(0o&`mgq&i\u007f.i(,~(n?,i$s&za3~";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "~(n?#^(n?Mk3n9e|>(-ef#T*~~.d*";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "~(n?#^(n?Mk3n9e|>( bZ\"t:am";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "~(n?#^(n?Mk3n9e|>( bK5b.xm";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "k&k#Sn5h\"";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "b.c";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "n5h\"Oi+k\u0001c|.a&oi3n b";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "b.c";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "~(n?#^(n?Mk3n9e|>(,~m&s*#k&k#Sf(s\u0010mk3n9i";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "{3f=xW$f#`";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "~(n?#^(n?Mk3n9e|>(:|l&s*Ya\u0014s.xmga&ba4o&bogc ,f(soyx#f;i";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "~(n?#^(n?Mk3n9e|>(<dg0D.`d\u0001f&`m#J*\u007f{&`*";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "k&k#,n&n#ilgj*\u007f{&`*,f(sohm!n!il";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    break Label_1132;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public VoipActivity() {
        this.o = new g1(this);
        this.u = (ServiceConnection)new u2(this);
    }
    
    static VoiceService a(final VoipActivity voipActivity, final VoiceService s) {
        return voipActivity.s = s;
    }
    
    static void a(final VoipActivity voipActivity) {
        voipActivity.j();
    }
    
    public static boolean a(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 6:
            case 86: {
                return true;
            }
        }
    }
    
    static boolean a(final VoipActivity voipActivity, final boolean r) {
        return voipActivity.r = r;
    }
    
    private void b(final Voip$CallInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          95
        //     8: aload_1        
        //     9: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    12: astore          29
        //    14: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //    17: astore          30
        //    19: aload           29
        //    21: aload           30
        //    23: if_acmpeq       95
        //    26: iconst_1       
        //    27: istore_3       
        //    28: aload_0        
        //    29: ldc             2131755812
        //    31: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    34: astore          4
        //    36: aload_0        
        //    37: ldc             2131755813
        //    39: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    42: astore          5
        //    44: aload_0        
        //    45: ldc             2131755815
        //    47: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    50: astore          6
        //    52: aload_0        
        //    53: ldc             2131755818
        //    55: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    58: astore          7
        //    60: aload           4
        //    62: ifnull          80
        //    65: aload           5
        //    67: ifnull          80
        //    70: aload           6
        //    72: ifnull          80
        //    75: aload           7
        //    77: ifnonnull       105
        //    80: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    83: bipush          10
        //    85: aaload         
        //    86: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    89: return         
        //    90: astore          28
        //    92: aload           28
        //    94: athrow         
        //    95: iconst_0       
        //    96: istore_3       
        //    97: goto            28
        //   100: astore          8
        //   102: aload           8
        //   104: athrow         
        //   105: aload_1        
        //   106: ifnull          158
        //   109: aload_1        
        //   110: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //   113: getstatic       com/whatsapp/Voip$CallState.RECEIVED_CALL:Lcom/whatsapp/Voip$CallState;
        //   116: if_acmpne       158
        //   119: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   122: bipush          11
        //   124: aaload         
        //   125: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   128: aload           4
        //   130: iconst_0       
        //   131: invokevirtual   android/view/View.setVisibility:(I)V
        //   134: aload           5
        //   136: iconst_0       
        //   137: invokevirtual   android/view/View.setVisibility:(I)V
        //   140: aload           6
        //   142: bipush          8
        //   144: invokevirtual   android/view/View.setVisibility:(I)V
        //   147: aload           7
        //   149: bipush          8
        //   151: invokevirtual   android/view/View.setVisibility:(I)V
        //   154: iload_2        
        //   155: ifeq            89
        //   158: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   161: bipush          12
        //   163: aaload         
        //   164: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   167: aload           4
        //   169: bipush          8
        //   171: invokevirtual   android/view/View.setVisibility:(I)V
        //   174: aload           5
        //   176: bipush          8
        //   178: invokevirtual   android/view/View.setVisibility:(I)V
        //   181: aload           6
        //   183: iconst_0       
        //   184: invokevirtual   android/view/View.setVisibility:(I)V
        //   187: aload           7
        //   189: iconst_0       
        //   190: invokevirtual   android/view/View.setVisibility:(I)V
        //   193: aload_0        
        //   194: ldc             2131755817
        //   196: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   199: checkcast       Landroid/widget/ImageButton;
        //   202: astore          9
        //   204: aload_0        
        //   205: ldc             2131755816
        //   207: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   210: checkcast       Landroid/widget/ImageButton;
        //   213: astore          10
        //   215: iload_3        
        //   216: ifne            394
        //   219: iconst_1       
        //   220: istore          11
        //   222: aload           9
        //   224: iload           11
        //   226: invokevirtual   android/widget/ImageButton.setEnabled:(Z)V
        //   229: aload           10
        //   231: iload_3        
        //   232: invokevirtual   android/widget/ImageButton.setEnabled:(Z)V
        //   235: aload           9
        //   237: bipush          8
        //   239: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //   242: aload           10
        //   244: invokevirtual   android/widget/ImageButton.isEnabled:()Z
        //   247: istore          13
        //   249: iload           13
        //   251: ifeq            405
        //   254: iconst_0       
        //   255: istore          14
        //   257: aload           10
        //   259: iload           14
        //   261: invokevirtual   android/widget/ImageButton.setVisibility:(I)V
        //   264: aload           9
        //   266: invokevirtual   android/widget/ImageButton.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   269: checkcast       Landroid/widget/LinearLayout$LayoutParams;
        //   272: astore          15
        //   274: aload           9
        //   276: invokevirtual   android/widget/ImageButton.isEnabled:()Z
        //   279: ifeq            312
        //   282: aload           10
        //   284: invokevirtual   android/widget/ImageButton.isEnabled:()Z
        //   287: istore          25
        //   289: iload           25
        //   291: ifeq            312
        //   294: iconst_1       
        //   295: fconst_2       
        //   296: aload_0        
        //   297: invokevirtual   com/whatsapp/VoipActivity.getResources:()Landroid/content/res/Resources;
        //   300: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //   303: invokestatic    android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
        //   306: fstore          26
        //   308: iload_2        
        //   309: ifeq            435
        //   312: fconst_0       
        //   313: fstore          17
        //   315: getstatic       com/whatsapp/App.W:Z
        //   318: istore          19
        //   320: iload           19
        //   322: ifeq            422
        //   325: iconst_0       
        //   326: istore          20
        //   328: getstatic       com/whatsapp/App.W:Z
        //   331: istore          22
        //   333: iconst_0       
        //   334: istore          23
        //   336: iload           22
        //   338: ifeq            346
        //   341: fload           17
        //   343: f2i            
        //   344: istore          23
        //   346: aload           15
        //   348: iload           20
        //   350: aload           15
        //   352: getfield        android/widget/LinearLayout$LayoutParams.topMargin:I
        //   355: iload           23
        //   357: aload           15
        //   359: getfield        android/widget/LinearLayout$LayoutParams.bottomMargin:I
        //   362: invokevirtual   android/widget/LinearLayout$LayoutParams.setMargins:(IIII)V
        //   365: aload           9
        //   367: invokevirtual   android/widget/ImageButton.getParent:()Landroid/view/ViewParent;
        //   370: ifnull          89
        //   373: aload           9
        //   375: invokevirtual   android/widget/ImageButton.getParent:()Landroid/view/ViewParent;
        //   378: invokeinterface android/view/ViewParent.requestLayout:()V
        //   383: return         
        //   384: astore          24
        //   386: aload           24
        //   388: athrow         
        //   389: astore          27
        //   391: aload           27
        //   393: athrow         
        //   394: iconst_0       
        //   395: istore          11
        //   397: goto            222
        //   400: astore          12
        //   402: aload           12
        //   404: athrow         
        //   405: bipush          8
        //   407: istore          14
        //   409: goto            257
        //   412: astore          16
        //   414: aload           16
        //   416: athrow         
        //   417: astore          18
        //   419: aload           18
        //   421: athrow         
        //   422: fload           17
        //   424: f2i            
        //   425: istore          20
        //   427: goto            328
        //   430: astore          21
        //   432: aload           21
        //   434: athrow         
        //   435: fload           26
        //   437: fstore          17
        //   439: goto            315
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      19     90     95     Ljava/lang/IllegalArgumentException;
        //  80     89     100    105    Ljava/lang/IllegalArgumentException;
        //  109    154    389    394    Ljava/lang/IllegalArgumentException;
        //  222    249    400    405    Ljava/lang/IllegalArgumentException;
        //  274    289    412    417    Ljava/lang/IllegalArgumentException;
        //  315    320    417    422    Ljava/lang/IllegalArgumentException;
        //  328    333    430    435    Ljava/lang/IllegalArgumentException;
        //  346    383    384    389    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 209, Size: 209
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
    
    static void b(final VoipActivity voipActivity) {
        voipActivity.g();
    }
    
    public static boolean b(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 24:
            case 25:
            case 91:
            case 164: {
                return true;
            }
        }
    }
    
    private void c(final Voip$CallInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //     8: ifnonnull       24
        //    11: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    14: bipush          27
        //    16: aaload         
        //    17: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    20: return         
        //    21: astore_3       
        //    22: aload_3        
        //    23: athrow         
        //    24: aload_1        
        //    25: ifnull          89
        //    28: getstatic       com/whatsapp/a2k.a:[I
        //    31: aload_1        
        //    32: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    35: invokevirtual   com/whatsapp/Voip$CallState.ordinal:()I
        //    38: iaload         
        //    39: istore          22
        //    41: iload           22
        //    43: tableswitch {
        //                2: 103
        //                3: 273
        //                4: 273
        //                5: 287
        //                6: 374
        //          default: 76
        //        }
        //    76: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    79: bipush          28
        //    81: aaload         
        //    82: invokestatic    com/whatsapp/aol.a:(Ljava/lang/String;)V
        //    85: iload_2        
        //    86: ifeq            20
        //    89: aload_0        
        //    90: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //    93: aconst_null    
        //    94: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    97: return         
        //    98: astore          4
        //   100: aload           4
        //   102: athrow         
        //   103: aload_1        
        //   104: invokevirtual   com/whatsapp/Voip$CallInfo.isSelfInterrupted:()Z
        //   107: istore          27
        //   109: iload           27
        //   111: ifne            125
        //   114: aload_1        
        //   115: invokevirtual   com/whatsapp/Voip$CallInfo.isPeerInterrupted:()Z
        //   118: istore          34
        //   120: iload           34
        //   122: ifeq            139
        //   125: aload_0        
        //   126: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   129: ldc_w           2131231948
        //   132: invokevirtual   android/widget/TextView.setText:(I)V
        //   135: iload_2        
        //   136: ifeq            20
        //   139: aload_0        
        //   140: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   143: astore          28
        //   145: aload           28
        //   147: ifnull          179
        //   150: aload_0        
        //   151: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   154: aload_1        
        //   155: invokevirtual   com/whatsapp/VoiceService.a:(Lcom/whatsapp/Voip$CallInfo;)Z
        //   158: istore          33
        //   160: iload           33
        //   162: ifeq            179
        //   165: aload_0        
        //   166: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   169: ldc_w           2131231950
        //   172: invokevirtual   android/widget/TextView.setText:(I)V
        //   175: iload_2        
        //   176: ifeq            20
        //   179: aload_0        
        //   180: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   183: astore          29
        //   185: aload           29
        //   187: ifnull          251
        //   190: aload_0        
        //   191: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   194: invokevirtual   com/whatsapp/VoiceService.z:()Z
        //   197: istore          30
        //   199: iload           30
        //   201: ifeq            251
        //   204: aload_0        
        //   205: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   208: astore          31
        //   210: iconst_1       
        //   211: anewarray       Ljava/lang/Object;
        //   214: astore          32
        //   216: aload           32
        //   218: iconst_0       
        //   219: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   222: aload_1        
        //   223: invokevirtual   com/whatsapp/Voip$CallInfo.getPeerId:()Ljava/lang/String;
        //   226: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   229: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //   232: aastore        
        //   233: aload           31
        //   235: aload_0        
        //   236: ldc_w           2131231949
        //   239: aload           32
        //   241: invokevirtual   com/whatsapp/VoipActivity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   244: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   247: iload_2        
        //   248: ifeq            20
        //   251: aload_0        
        //   252: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   255: aload_1        
        //   256: invokevirtual   com/whatsapp/Voip$CallInfo.getCallDuration:()J
        //   259: ldc2_w          1000
        //   262: ldiv           
        //   263: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   266: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   269: iload_2        
        //   270: ifeq            20
        //   273: aload_0        
        //   274: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   277: ldc_w           2131231935
        //   280: invokevirtual   android/widget/TextView.setText:(I)V
        //   283: iload_2        
        //   284: ifeq            20
        //   287: aload_0        
        //   288: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   291: astore          23
        //   293: aload           23
        //   295: ifnull          360
        //   298: aload_0        
        //   299: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   302: invokevirtual   com/whatsapp/VoiceService.p:()Z
        //   305: istore          24
        //   307: iload           24
        //   309: ifeq            360
        //   312: aload_0        
        //   313: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   316: astore          25
        //   318: iconst_1       
        //   319: anewarray       Ljava/lang/Object;
        //   322: astore          26
        //   324: aload           26
        //   326: iconst_0       
        //   327: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   330: aload_1        
        //   331: invokevirtual   com/whatsapp/Voip$CallInfo.getPeerId:()Ljava/lang/String;
        //   334: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   337: aload_0        
        //   338: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   341: aastore        
        //   342: aload           25
        //   344: aload_0        
        //   345: ldc_w           2131231459
        //   348: aload           26
        //   350: invokevirtual   com/whatsapp/VoipActivity.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   353: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   356: iload_2        
        //   357: ifeq            20
        //   360: aload_0        
        //   361: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   364: ldc_w           2131231929
        //   367: invokevirtual   android/widget/TextView.setText:(I)V
        //   370: iload_2        
        //   371: ifeq            20
        //   374: aload_0        
        //   375: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   378: ldc_w           2131231926
        //   381: invokevirtual   android/widget/TextView.setText:(I)V
        //   384: iload_2        
        //   385: ifeq            20
        //   388: goto            76
        //   391: astore          5
        //   393: aload           5
        //   395: athrow         
        //   396: astore          6
        //   398: aload           6
        //   400: athrow         
        //   401: astore          7
        //   403: aload           7
        //   405: athrow         
        //   406: astore          8
        //   408: aload           8
        //   410: athrow         
        //   411: astore          9
        //   413: aload           9
        //   415: athrow         
        //   416: astore          10
        //   418: aload           10
        //   420: athrow         
        //   421: astore          11
        //   423: aload           11
        //   425: athrow         
        //   426: astore          12
        //   428: aload           12
        //   430: athrow         
        //   431: astore          13
        //   433: aload           13
        //   435: athrow         
        //   436: astore          14
        //   438: aload           14
        //   440: athrow         
        //   441: astore          15
        //   443: aload           15
        //   445: athrow         
        //   446: astore          16
        //   448: aload           16
        //   450: athrow         
        //   451: astore          17
        //   453: aload           17
        //   455: athrow         
        //   456: astore          18
        //   458: aload           18
        //   460: athrow         
        //   461: astore          19
        //   463: aload           19
        //   465: athrow         
        //   466: astore          20
        //   468: aload           20
        //   470: athrow         
        //   471: astore          21
        //   473: aload           21
        //   475: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      20     21     24     Ljava/lang/IllegalArgumentException;
        //  28     41     391    396    Ljava/lang/IllegalArgumentException;
        //  76     85     98     103    Ljava/lang/IllegalArgumentException;
        //  89     97     98     103    Ljava/lang/IllegalArgumentException;
        //  103    109    396    401    Ljava/lang/IllegalArgumentException;
        //  114    120    401    406    Ljava/lang/IllegalArgumentException;
        //  125    135    406    411    Ljava/lang/IllegalArgumentException;
        //  139    145    411    416    Ljava/lang/IllegalArgumentException;
        //  150    160    416    421    Ljava/lang/IllegalArgumentException;
        //  165    175    421    426    Ljava/lang/IllegalArgumentException;
        //  179    185    426    431    Ljava/lang/IllegalArgumentException;
        //  190    199    431    436    Ljava/lang/IllegalArgumentException;
        //  204    247    436    441    Ljava/lang/IllegalArgumentException;
        //  251    269    441    446    Ljava/lang/IllegalArgumentException;
        //  273    283    446    451    Ljava/lang/IllegalArgumentException;
        //  287    293    451    456    Ljava/lang/IllegalArgumentException;
        //  298    307    456    461    Ljava/lang/IllegalArgumentException;
        //  312    356    461    466    Ljava/lang/IllegalArgumentException;
        //  360    370    466    471    Ljava/lang/IllegalArgumentException;
        //  374    384    471    476    Ljava/lang/IllegalArgumentException;
        //  393    396    396    401    Ljava/lang/IllegalArgumentException;
        //  398    401    401    406    Ljava/lang/IllegalArgumentException;
        //  403    406    406    411    Ljava/lang/IllegalArgumentException;
        //  408    411    411    416    Ljava/lang/IllegalArgumentException;
        //  413    416    416    421    Ljava/lang/IllegalArgumentException;
        //  418    421    421    426    Ljava/lang/IllegalArgumentException;
        //  423    426    426    431    Ljava/lang/IllegalArgumentException;
        //  428    431    431    436    Ljava/lang/IllegalArgumentException;
        //  433    436    436    441    Ljava/lang/IllegalArgumentException;
        //  438    441    441    446    Ljava/lang/IllegalArgumentException;
        //  443    446    446    451    Ljava/lang/IllegalArgumentException;
        //  448    451    451    456    Ljava/lang/IllegalArgumentException;
        //  453    456    456    461    Ljava/lang/IllegalArgumentException;
        //  458    461    461    466    Ljava/lang/IllegalArgumentException;
        //  463    466    466    471    Ljava/lang/IllegalArgumentException;
        //  468    471    471    476    Ljava/lang/IllegalArgumentException;
        //  473    476    98     103    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 218, Size: 218
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
    
    public static boolean c(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 79:
            case 85: {
                return true;
            }
        }
    }
    
    static boolean c(final VoipActivity voipActivity) {
        return voipActivity.m;
    }
    
    static void d(final VoipActivity voipActivity) {
        voipActivity.h();
    }
    
    public static boolean d(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 5:
            case 126: {
                return true;
            }
        }
    }
    
    static Runnable e(final VoipActivity voipActivity) {
        return voipActivity.o;
    }
    
    private void e() {
        final int width = this.getWindowManager().getDefaultDisplay().getWidth();
        Log.i(VoipActivity.z[17] + width);
        a8s.a(new ath(this, width), new Void[0]);
    }
    
    static VoiceService f(final VoipActivity voipActivity) {
        return voipActivity.s;
    }
    
    private void g() {
        while (true) {
            try {
                if (this.isFinishing()) {
                    Log.i(VoipActivity.z[41]);
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final Voip$CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                return;
            }
            try {
                if (callInfo.getCallState() != Voip$CallState.NONE) {
                    this.l.setText((CharSequence)App.S.e(callInfo.getPeerId()).a((Context)this));
                    this.b(callInfo);
                    this.c(callInfo);
                    this.d(callInfo);
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
    }
    
    static void g(final VoipActivity voipActivity) {
        voipActivity.k();
    }
    
    private void h() {
        try {
            Log.i(VoipActivity.z[4]);
            if (this.s != null) {
                this.s.C();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    static void h(final VoipActivity voipActivity) {
        voipActivity.l();
    }
    
    static String i(final VoipActivity voipActivity) {
        return voipActivity.n;
    }
    
    private void j() {
        try {
            if (this.l != null && this.m) {
                ((InputMethodManager)this.getSystemService(VoipActivity.z[29])).hideSoftInputFromWindow(this.l.getWindowToken(), 0);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void k() {
        try {
            Log.i(VoipActivity.z[3]);
            if (this.s != null) {
                this.s.D();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void l() {
        try {
            Log.i(VoipActivity.z[0]);
            if (this.s != null) {
                this.s.w();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public Activity a() {
        return this;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final Voip$CallInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   com/whatsapp/VoipActivity.c:(Lcom/whatsapp/Voip$CallInfo;)V
        //     5: aload_0        
        //     6: ldc_w           2131755827
        //     9: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ifnull          53
        //    17: aload_2        
        //    18: invokevirtual   android/view/View.getVisibility:()I
        //    21: istore          4
        //    23: iload           4
        //    25: ifne            53
        //    28: aload_0        
        //    29: ldc_w           2131755828
        //    32: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    35: checkcast       Landroid/widget/TextView;
        //    38: astore          5
        //    40: aload           5
        //    42: ifnull          53
        //    45: aload           5
        //    47: invokestatic    com/whatsapp/Voip.getStreamStatistics:()Ljava/lang/String;
        //    50: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    53: return         
        //    54: astore_3       
        //    55: aload_3        
        //    56: athrow         
        //    57: astore          6
        //    59: aload           6
        //    61: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  17     23     54     57     Ljava/lang/IllegalArgumentException;
        //  45     53     57     62     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    public void a(final Voip$CallState voip$CallState, final Voip$CallInfo voip$CallInfo) {
        if (voip$CallInfo == null) {
            try {
                Log.w(VoipActivity.z[13]);
                this.finish();
                return;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.runOnUiThread((Runnable)new k3(this, voip$CallInfo.getCallState()));
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b() {
        this.d(Voip.getCallInfo());
    }
    
    @Override
    public void b(final String s) {
        final String peerJid = Voip.getPeerJid();
        if (peerJid == null) {
            return;
        }
        try {
            if (TextUtils.equals((CharSequence)s, (CharSequence)peerJid)) {
                this.e();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void c(final String s) {
        final String peerJid = Voip.getPeerJid();
        if (peerJid == null) {
            return;
        }
        try {
            if (TextUtils.equals((CharSequence)s, (CharSequence)peerJid)) {
                Log.w(VoipActivity.z[30] + s + VoipActivity.z[31]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean c() {
        return this.t;
    }
    
    public void d(final Voip$CallInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_1        
        //     3: ifnonnull       7
        //     6: return         
        //     7: aload_1        
        //     8: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    11: astore_3       
        //    12: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //    15: astore          6
        //    17: aload_3        
        //    18: aload           6
        //    20: if_acmpeq       6
        //    23: getstatic       com/whatsapp/Voip$CallState.RECEIVED_CALL:Lcom/whatsapp/Voip$CallState;
        //    26: astore          7
        //    28: aload_3        
        //    29: aload           7
        //    31: if_acmpeq       6
        //    34: aload_0        
        //    35: ldc_w           2131755819
        //    38: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    41: astore          8
        //    43: aload_0        
        //    44: ldc_w           2131755821
        //    47: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    50: astore          9
        //    52: aload_0        
        //    53: ldc_w           2131755823
        //    56: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    59: astore          10
        //    61: aload_0        
        //    62: ldc_w           2131755820
        //    65: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //    68: astore          11
        //    70: aload_0        
        //    71: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //    74: astore          14
        //    76: aload           14
        //    78: ifnull          240
        //    81: aload_0        
        //    82: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //    85: invokevirtual   com/whatsapp/VoiceService.e:()Z
        //    88: istore          32
        //    90: iload           32
        //    92: ifeq            240
        //    95: iload_2        
        //    96: istore          15
        //    98: aload           8
        //   100: iload           15
        //   102: invokevirtual   android/view/View.setSelected:(Z)V
        //   105: aload_0        
        //   106: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   109: astore          18
        //   111: aload           18
        //   113: ifnull          256
        //   116: aload_0        
        //   117: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   120: invokevirtual   com/whatsapp/VoiceService.A:()Z
        //   123: istore          31
        //   125: iload           31
        //   127: ifeq            256
        //   130: iload_2        
        //   131: istore          19
        //   133: aload           10
        //   135: iload           19
        //   137: invokevirtual   android/view/View.setSelected:(Z)V
        //   140: aload_0        
        //   141: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   144: astore          22
        //   146: aload           22
        //   148: ifnull          272
        //   151: aload_0        
        //   152: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   155: invokevirtual   com/whatsapp/VoiceService.t:()Z
        //   158: istore          30
        //   160: iload           30
        //   162: ifeq            272
        //   165: iload_2        
        //   166: istore          23
        //   168: iload           23
        //   170: ifeq            278
        //   173: iconst_0       
        //   174: istore          24
        //   176: aload           11
        //   178: iload           24
        //   180: invokevirtual   android/view/View.setVisibility:(I)V
        //   183: iload           23
        //   185: ifeq            6
        //   188: aload_0        
        //   189: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   192: astore          28
        //   194: aload           28
        //   196: ifnull          300
        //   199: aload_0        
        //   200: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //   203: invokevirtual   com/whatsapp/VoiceService.o:()Z
        //   206: istore          29
        //   208: iload           29
        //   210: ifeq            300
        //   213: aload           9
        //   215: iload_2        
        //   216: invokevirtual   android/view/View.setSelected:(Z)V
        //   219: return         
        //   220: astore          4
        //   222: aload           4
        //   224: athrow         
        //   225: astore          5
        //   227: aload           5
        //   229: athrow         
        //   230: astore          12
        //   232: aload           12
        //   234: athrow         
        //   235: astore          13
        //   237: aload           13
        //   239: athrow         
        //   240: iconst_0       
        //   241: istore          15
        //   243: goto            98
        //   246: astore          16
        //   248: aload           16
        //   250: athrow         
        //   251: astore          17
        //   253: aload           17
        //   255: athrow         
        //   256: iconst_0       
        //   257: istore          19
        //   259: goto            133
        //   262: astore          20
        //   264: aload           20
        //   266: athrow         
        //   267: astore          21
        //   269: aload           21
        //   271: athrow         
        //   272: iconst_0       
        //   273: istore          23
        //   275: goto            168
        //   278: bipush          8
        //   280: istore          24
        //   282: goto            176
        //   285: astore          25
        //   287: aload           25
        //   289: athrow         
        //   290: astore          26
        //   292: aload           26
        //   294: athrow         
        //   295: astore          27
        //   297: aload           27
        //   299: athrow         
        //   300: iconst_0       
        //   301: istore_2       
        //   302: goto            213
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     17     220    225    Ljava/lang/IllegalArgumentException;
        //  23     28     225    230    Ljava/lang/IllegalArgumentException;
        //  70     76     230    235    Ljava/lang/IllegalArgumentException;
        //  81     90     235    240    Ljava/lang/IllegalArgumentException;
        //  98     111    246    251    Ljava/lang/IllegalArgumentException;
        //  116    125    251    256    Ljava/lang/IllegalArgumentException;
        //  133    146    262    267    Ljava/lang/IllegalArgumentException;
        //  151    160    267    272    Ljava/lang/IllegalArgumentException;
        //  176    183    285    290    Ljava/lang/IllegalArgumentException;
        //  188    194    290    295    Ljava/lang/IllegalArgumentException;
        //  199    208    295    300    Ljava/lang/IllegalArgumentException;
        //  222    225    225    230    Ljava/lang/IllegalArgumentException;
        //  232    235    235    240    Ljava/lang/IllegalArgumentException;
        //  248    251    251    256    Ljava/lang/IllegalArgumentException;
        //  264    267    267    272    Ljava/lang/IllegalArgumentException;
        //  287    290    290    295    Ljava/lang/IllegalArgumentException;
        //  292    295    295    300    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 151, Size: 151
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
    public void d(final String s) {
    }
    
    public boolean dispatchTouchEvent(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          52
        //    11: aload_0        
        //    12: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //    15: invokevirtual   com/whatsapp/VoiceService.e:()Z
        //    18: istore          6
        //    20: iload           6
        //    22: ifne            52
        //    25: aload_0        
        //    26: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //    29: invokevirtual   com/whatsapp/VoiceService.s:()Z
        //    32: istore          7
        //    34: iload           7
        //    36: ifeq            52
        //    39: iconst_1       
        //    40: ireturn        
        //    41: astore_2       
        //    42: aload_2        
        //    43: athrow         
        //    44: astore_3       
        //    45: aload_3        
        //    46: athrow         
        //    47: astore          4
        //    49: aload           4
        //    51: athrow         
        //    52: aload_0        
        //    53: aload_1        
        //    54: invokespecial   com/whatsapp/DialogToastActivity.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
        //    57: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      41     44     Ljava/lang/IllegalArgumentException;
        //  11     20     44     47     Ljava/lang/IllegalArgumentException;
        //  25     34     47     52     Ljava/lang/IllegalArgumentException;
        //  42     44     44     47     Ljava/lang/IllegalArgumentException;
        //  45     47     47     52     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 32, Size: 32
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
    public void e(final String n) {
        this.n = n;
    }
    
    public void f() {
        try {
            if (this.k != null) {
                this.k.dismissAllowingStateLoss();
                this.k = null;
                this.n = null;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    10: bipush          42
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_0        
        //    17: getfield        com/whatsapp/VoipActivity.n:Ljava/lang/String;
        //    20: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    23: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    26: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    29: aload_0        
        //    30: getfield        com/whatsapp/VoipActivity.n:Ljava/lang/String;
        //    33: astore_3       
        //    34: aload_3        
        //    35: ifnull          71
        //    38: aload_0        
        //    39: invokevirtual   com/whatsapp/VoipActivity.f:()V
        //    42: aload_0        
        //    43: aload_0        
        //    44: getfield        com/whatsapp/VoipActivity.n:Ljava/lang/String;
        //    47: invokestatic    com/whatsapp/VoipActivity$MessageDialogFragment.a:(Ljava/lang/String;)Landroid/support/v4/app/DialogFragment;
        //    50: putfield        com/whatsapp/VoipActivity.k:Landroid/support/v4/app/DialogFragment;
        //    53: aload_0        
        //    54: getfield        com/whatsapp/VoipActivity.k:Landroid/support/v4/app/DialogFragment;
        //    57: aload_0        
        //    58: invokevirtual   com/whatsapp/VoipActivity.getSupportFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //    61: aconst_null    
        //    62: invokevirtual   android/support/v4/app/DialogFragment.show:(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
        //    65: getstatic       com/whatsapp/App.I:Z
        //    68: ifeq            87
        //    71: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    74: bipush          43
        //    76: aaload         
        //    77: invokestatic    com/whatsapp/aol.a:(Ljava/lang/String;)V
        //    80: return         
        //    81: astore_1       
        //    82: aload_1        
        //    83: athrow         
        //    84: astore_2       
        //    85: aload_2        
        //    86: athrow         
        //    87: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      34     81     84     Ljava/lang/IllegalArgumentException;
        //  38     71     84     87     Ljava/lang/IllegalArgumentException;
        //  71     80     84     87     Ljava/lang/IllegalArgumentException;
        //  82     84     84     87     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
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
    protected void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //     3: bipush          34
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //    14: invokestatic    com/whatsapp/CallRatingActivity.a:()V
        //    17: invokestatic    com/whatsapp/Voip.getCallInfo:()Lcom/whatsapp/Voip$CallInfo;
        //    20: astore_2       
        //    21: aload_2        
        //    22: ifnull          35
        //    25: aload_2        
        //    26: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    29: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //    32: if_acmpne       162
        //    35: aload_0        
        //    36: invokevirtual   com/whatsapp/VoipActivity.finish:()V
        //    39: aload_0        
        //    40: invokevirtual   com/whatsapp/VoipActivity.getIntent:()Landroid/content/Intent;
        //    43: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    46: bipush          37
        //    48: aaload         
        //    49: iconst_0       
        //    50: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //    53: istore          4
        //    55: iload           4
        //    57: ifeq            144
        //    60: invokestatic    com/whatsapp/notification/w.b:()Lcom/whatsapp/notification/w;
        //    63: invokevirtual   com/whatsapp/notification/w.c:()V
        //    66: new             Landroid/content/Intent;
        //    69: dup            
        //    70: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    73: bipush          40
        //    75: aaload         
        //    76: aconst_null    
        //    77: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    80: ldc_w           Lcom/whatsapp/VoiceService;.class
        //    83: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V
        //    86: astore          6
        //    88: aload           6
        //    90: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    93: bipush          38
        //    95: aaload         
        //    96: aload_0        
        //    97: invokevirtual   com/whatsapp/VoipActivity.getIntent:()Landroid/content/Intent;
        //   100: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   103: bipush          36
        //   105: aaload         
        //   106: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   109: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   112: pop            
        //   113: aload           6
        //   115: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   118: bipush          35
        //   120: aaload         
        //   121: getstatic       com/whatsapp/fieldstats/bq.NOTIFICATION_MISSED:Lcom/whatsapp/fieldstats/bq;
        //   124: invokevirtual   com/whatsapp/fieldstats/bq.getCode:()I
        //   127: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   130: pop            
        //   131: aload_0        
        //   132: aload           6
        //   134: invokevirtual   com/whatsapp/VoipActivity.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
        //   137: pop            
        //   138: getstatic       com/whatsapp/App.I:Z
        //   141: ifeq            153
        //   144: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   147: bipush          39
        //   149: aaload         
        //   150: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   153: return         
        //   154: astore_3       
        //   155: aload_3        
        //   156: athrow         
        //   157: astore          5
        //   159: aload           5
        //   161: athrow         
        //   162: aload_0        
        //   163: iconst_0       
        //   164: invokevirtual   com/whatsapp/VoipActivity.a:(Z)V
        //   167: aload_0        
        //   168: invokevirtual   com/whatsapp/VoipActivity.getWindow:()Landroid/view/Window;
        //   171: ldc_w           2621440
        //   174: invokevirtual   android/view/Window.addFlags:(I)V
        //   177: aload_2        
        //   178: ifnull          212
        //   181: aload_2        
        //   182: invokevirtual   com/whatsapp/Voip$CallInfo.isCaller:()Z
        //   185: istore          17
        //   187: iload           17
        //   189: ifne            212
        //   192: aload_2        
        //   193: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //   196: getstatic       com/whatsapp/Voip$CallState.RECEIVED_CALL:Lcom/whatsapp/Voip$CallState;
        //   199: if_acmpne       212
        //   202: aload_0        
        //   203: invokevirtual   com/whatsapp/VoipActivity.getWindow:()Landroid/view/Window;
        //   206: sipush          128
        //   209: invokevirtual   android/view/Window.addFlags:(I)V
        //   212: aload_0        
        //   213: aload_0        
        //   214: invokevirtual   com/whatsapp/VoipActivity.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   217: ldc_w           2130903234
        //   220: aconst_null    
        //   221: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)Landroid/view/View;
        //   224: invokevirtual   com/whatsapp/VoipActivity.setContentView:(Landroid/view/View;)V
        //   227: aload_0        
        //   228: aload_0        
        //   229: ldc_w           2131755810
        //   232: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   235: checkcast       Landroid/widget/TextView;
        //   238: putfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   241: aload_0        
        //   242: getfield        com/whatsapp/VoipActivity.p:Landroid/widget/TextView;
        //   245: invokestatic    com/whatsapp/vc.b:(Landroid/widget/TextView;)V
        //   248: aload_0        
        //   249: ldc_w           2131755809
        //   252: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   255: checkcast       Landroid/widget/TextView;
        //   258: invokestatic    com/whatsapp/vc.b:(Landroid/widget/TextView;)V
        //   261: aload_0        
        //   262: aload_0        
        //   263: ldc_w           2131755405
        //   266: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   269: checkcast       Landroid/widget/TextView;
        //   272: putfield        com/whatsapp/VoipActivity.l:Landroid/widget/TextView;
        //   275: aload_0        
        //   276: getfield        com/whatsapp/VoipActivity.l:Landroid/widget/TextView;
        //   279: new             Lcom/whatsapp/a0z;
        //   282: dup            
        //   283: aload_0        
        //   284: invokespecial   com/whatsapp/a0z.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   287: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   290: aload_0        
        //   291: ldc_w           2131755811
        //   294: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   297: checkcast       Landroid/widget/Button;
        //   300: astore          13
        //   302: aload           13
        //   304: ldc_w           2131231302
        //   307: invokevirtual   android/widget/Button.setText:(I)V
        //   310: aload           13
        //   312: new             Lcom/whatsapp/gk;
        //   315: dup            
        //   316: aload_0        
        //   317: invokespecial   com/whatsapp/gk.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   320: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   323: getstatic       com/whatsapp/App.aV:I
        //   326: istore          15
        //   328: iconst_0       
        //   329: istore          16
        //   331: iload           15
        //   333: iconst_3       
        //   334: if_icmplt       540
        //   337: aload           13
        //   339: iload           16
        //   341: invokevirtual   android/widget/Button.setVisibility:(I)V
        //   344: aload_0        
        //   345: ldc             2131755817
        //   347: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   350: new             Lcom/whatsapp/al9;
        //   353: dup            
        //   354: aload_0        
        //   355: invokespecial   com/whatsapp/al9.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   358: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   361: aload_0        
        //   362: ldc             2131755816
        //   364: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   367: new             Lcom/whatsapp/jc;
        //   370: dup            
        //   371: aload_0        
        //   372: invokespecial   com/whatsapp/jc.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   375: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   378: aload_0        
        //   379: ldc_w           2131755823
        //   382: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   385: new             Lcom/whatsapp/wu;
        //   388: dup            
        //   389: aload_0        
        //   390: invokespecial   com/whatsapp/wu.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   393: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   396: aload_0        
        //   397: ldc_w           2131755822
        //   400: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   403: new             Lcom/whatsapp/cl;
        //   406: dup            
        //   407: aload_0        
        //   408: invokespecial   com/whatsapp/cl.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   411: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   414: aload_0        
        //   415: ldc_w           2131755819
        //   418: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   421: new             Lcom/whatsapp/uy;
        //   424: dup            
        //   425: aload_0        
        //   426: invokespecial   com/whatsapp/uy.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   429: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   432: aload_0        
        //   433: ldc_w           2131755821
        //   436: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   439: new             Lcom/whatsapp/l8;
        //   442: dup            
        //   443: aload_0        
        //   444: invokespecial   com/whatsapp/l8.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   447: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   450: aload_0        
        //   451: ldc             2131755812
        //   453: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   456: checkcast       Lcom/whatsapp/AnswerCallView;
        //   459: new             Lcom/whatsapp/a8u;
        //   462: dup            
        //   463: aload_0        
        //   464: invokespecial   com/whatsapp/a8u.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   467: invokevirtual   com/whatsapp/AnswerCallView.setAnswerCallListener:(Lcom/whatsapp/ad2;)V
        //   470: aload_0        
        //   471: ldc_w           2131755814
        //   474: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   477: new             Lcom/whatsapp/gv;
        //   480: dup            
        //   481: aload_0        
        //   482: invokespecial   com/whatsapp/gv.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   485: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   488: aload_0        
        //   489: aload_0        
        //   490: invokevirtual   com/whatsapp/VoipActivity.getIntent:()Landroid/content/Intent;
        //   493: invokevirtual   com/whatsapp/VoipActivity.setIntent:(Landroid/content/Intent;)V
        //   496: aload_0        
        //   497: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //   500: aload_0        
        //   501: new             Landroid/os/Handler;
        //   504: dup            
        //   505: new             Lcom/whatsapp/_e;
        //   508: dup            
        //   509: aload_0        
        //   510: invokespecial   com/whatsapp/_e.<init>:(Lcom/whatsapp/VoipActivity;)V
        //   513: invokespecial   android/os/Handler.<init>:(Landroid/os/Handler$Callback;)V
        //   516: putfield        com/whatsapp/VoipActivity.q:Landroid/os/Handler;
        //   519: return         
        //   520: astore          10
        //   522: aload           10
        //   524: athrow         
        //   525: astore          11
        //   527: aload           11
        //   529: athrow         
        //   530: astore          12
        //   532: aload           12
        //   534: athrow         
        //   535: astore          14
        //   537: aload           14
        //   539: athrow         
        //   540: iconst_4       
        //   541: istore          16
        //   543: goto            337
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  25     35     154    157    Ljava/lang/IllegalArgumentException;
        //  35     55     154    157    Ljava/lang/IllegalArgumentException;
        //  88     144    157    162    Ljava/lang/IllegalArgumentException;
        //  144    153    157    162    Ljava/lang/IllegalArgumentException;
        //  162    177    520    525    Ljava/lang/IllegalArgumentException;
        //  181    187    525    530    Ljava/lang/IllegalArgumentException;
        //  192    212    530    535    Ljava/lang/IllegalArgumentException;
        //  302    328    535    540    Ljava/lang/IllegalArgumentException;
        //  522    525    525    530    Ljava/lang/IllegalArgumentException;
        //  527    530    530    535    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 253, Size: 253
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
    protected void onDestroy() {
        try {
            Log.i(VoipActivity.z[19]);
            super.onDestroy();
            App.a((aws)this);
            if (this.s != null) {
                this.s.a((px)null);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean onKeyDown(final int p0, final KeyEvent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    10: bipush          9
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_2        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    20: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    23: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    26: invokestatic    com/whatsapp/Voip.getCallInfo:()Lcom/whatsapp/Voip$CallInfo;
        //    29: astore_3       
        //    30: aload_0        
        //    31: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //    34: astore          9
        //    36: aload           9
        //    38: ifnull          251
        //    41: aload_3        
        //    42: ifnull          251
        //    45: aload_3        
        //    46: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    49: astore          10
        //    51: getstatic       com/whatsapp/Voip$CallState.NONE:Lcom/whatsapp/Voip$CallState;
        //    54: astore          11
        //    56: aload           10
        //    58: aload           11
        //    60: if_acmpeq       251
        //    63: aload_3        
        //    64: invokevirtual   com/whatsapp/Voip$CallInfo.getCallState:()Lcom/whatsapp/Voip$CallState;
        //    67: astore          12
        //    69: getstatic       com/whatsapp/Voip$CallState.RECEIVED_CALL:Lcom/whatsapp/Voip$CallState;
        //    72: astore          13
        //    74: aload           12
        //    76: aload           13
        //    78: if_acmpne       192
        //    81: iload_1        
        //    82: invokestatic    com/whatsapp/VoipActivity.b:(I)Z
        //    85: ifeq            122
        //    88: aload_0        
        //    89: getfield        com/whatsapp/VoipActivity.s:Lcom/whatsapp/VoiceService;
        //    92: invokevirtual   com/whatsapp/VoiceService.f:()V
        //    95: iconst_1       
        //    96: ireturn        
        //    97: astore          4
        //    99: aload           4
        //   101: athrow         
        //   102: astore          5
        //   104: aload           5
        //   106: athrow         
        //   107: astore          6
        //   109: aload           6
        //   111: athrow         
        //   112: astore          7
        //   114: aload           7
        //   116: athrow         
        //   117: astore          8
        //   119: aload           8
        //   121: athrow         
        //   122: iload_1        
        //   123: invokestatic    com/whatsapp/VoipActivity.d:(I)Z
        //   126: istore          21
        //   128: iload           21
        //   130: ifne            140
        //   133: iload_1        
        //   134: invokestatic    com/whatsapp/VoipActivity.c:(I)Z
        //   137: ifeq            165
        //   140: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   143: bipush          7
        //   145: aaload         
        //   146: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   149: aload_0        
        //   150: invokespecial   com/whatsapp/VoipActivity.k:()V
        //   153: iconst_1       
        //   154: ireturn        
        //   155: astore          20
        //   157: aload           20
        //   159: athrow         
        //   160: astore          19
        //   162: aload           19
        //   164: athrow         
        //   165: iload_1        
        //   166: invokestatic    com/whatsapp/VoipActivity.a:(I)Z
        //   169: ifeq            251
        //   172: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   175: bipush          8
        //   177: aaload         
        //   178: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   181: aload_0        
        //   182: invokespecial   com/whatsapp/VoipActivity.h:()V
        //   185: iconst_1       
        //   186: ireturn        
        //   187: astore          22
        //   189: aload           22
        //   191: athrow         
        //   192: iload_1        
        //   193: invokestatic    com/whatsapp/VoipActivity.a:(I)Z
        //   196: istore          17
        //   198: iload           17
        //   200: ifne            221
        //   203: iload_1        
        //   204: invokestatic    com/whatsapp/VoipActivity.c:(I)Z
        //   207: istore          18
        //   209: iload           18
        //   211: ifeq            251
        //   214: aload_2        
        //   215: invokevirtual   android/view/KeyEvent.getRepeatCount:()I
        //   218: ifne            251
        //   221: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   224: bipush          6
        //   226: aaload         
        //   227: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   230: aload_0        
        //   231: invokespecial   com/whatsapp/VoipActivity.l:()V
        //   234: iconst_1       
        //   235: ireturn        
        //   236: astore          16
        //   238: aload           16
        //   240: athrow         
        //   241: astore          14
        //   243: aload           14
        //   245: athrow         
        //   246: astore          15
        //   248: aload           15
        //   250: athrow         
        //   251: aload_0        
        //   252: iload_1        
        //   253: aload_2        
        //   254: invokespecial   com/whatsapp/DialogToastActivity.onKeyDown:(ILandroid/view/KeyEvent;)Z
        //   257: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  30     36     97     107    Ljava/lang/IllegalArgumentException;
        //  45     56     107    112    Ljava/lang/IllegalArgumentException;
        //  63     74     112    117    Ljava/lang/IllegalArgumentException;
        //  81     95     117    122    Ljava/lang/IllegalArgumentException;
        //  99     102    102    107    Ljava/lang/IllegalArgumentException;
        //  104    107    107    112    Ljava/lang/IllegalArgumentException;
        //  109    112    112    117    Ljava/lang/IllegalArgumentException;
        //  114    117    117    122    Ljava/lang/IllegalArgumentException;
        //  122    128    160    165    Ljava/lang/IllegalArgumentException;
        //  133    140    155    160    Ljava/lang/IllegalArgumentException;
        //  140    153    155    160    Ljava/lang/IllegalArgumentException;
        //  162    165    155    160    Ljava/lang/IllegalArgumentException;
        //  165    185    187    192    Ljava/lang/IllegalArgumentException;
        //  192    198    241    246    Ljava/lang/IllegalArgumentException;
        //  203    209    246    251    Ljava/lang/IllegalArgumentException;
        //  214    221    236    241    Ljava/lang/IllegalArgumentException;
        //  221    234    236    241    Ljava/lang/IllegalArgumentException;
        //  243    246    246    251    Ljava/lang/IllegalArgumentException;
        //  248    251    236    241    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 130, Size: 130
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
    protected void onNewIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //     4: astore_2       
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    15: bipush          24
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_1        
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    25: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    28: bipush          25
        //    30: aaload         
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: aload_2        
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    41: bipush          21
        //    43: aaload         
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: aload_0        
        //    48: invokevirtual   com/whatsapp/VoipActivity.isFinishing:()Z
        //    51: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    54: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    57: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    60: aload_0        
        //    61: aload_1        
        //    62: invokespecial   com/whatsapp/DialogToastActivity.onNewIntent:(Landroid/content/Intent;)V
        //    65: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    68: bipush          22
        //    70: aaload         
        //    71: aload_2        
        //    72: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    75: istore          6
        //    77: iload           6
        //    79: ifeq            96
        //    82: aload_0        
        //    83: invokespecial   com/whatsapp/VoipActivity.k:()V
        //    86: getstatic       com/whatsapp/App.I:Z
        //    89: istore          13
        //    91: iload           13
        //    93: ifeq            112
        //    96: aload_0        
        //    97: invokevirtual   com/whatsapp/VoipActivity.isFinishing:()Z
        //   100: ifeq            126
        //   103: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   106: bipush          20
        //   108: aaload         
        //   109: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   112: return         
        //   113: astore_3       
        //   114: aload_3        
        //   115: athrow         
        //   116: astore          4
        //   118: aload           4
        //   120: athrow         
        //   121: astore          5
        //   123: aload           5
        //   125: athrow         
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokevirtual   com/whatsapp/VoipActivity.setIntent:(Landroid/content/Intent;)V
        //   131: aload_0        
        //   132: invokespecial   com/whatsapp/VoipActivity.g:()V
        //   135: aload_0        
        //   136: invokespecial   com/whatsapp/VoipActivity.e:()V
        //   139: aload_1        
        //   140: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   143: bipush          26
        //   145: aaload         
        //   146: iconst_0       
        //   147: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   150: ifeq            112
        //   153: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //   156: bipush          23
        //   158: aaload         
        //   159: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   162: aload_0        
        //   163: ldc             2131755812
        //   165: invokevirtual   com/whatsapp/VoipActivity.findViewById:(I)Landroid/view/View;
        //   168: checkcast       Lcom/whatsapp/AnswerCallView;
        //   171: astore          7
        //   173: aload           7
        //   175: ifnull          183
        //   178: aload           7
        //   180: invokevirtual   com/whatsapp/AnswerCallView.a:()V
        //   183: aload_0        
        //   184: invokevirtual   com/whatsapp/VoipActivity.f:()V
        //   187: aload_0        
        //   188: getfield        com/whatsapp/VoipActivity.m:Z
        //   191: istore          10
        //   193: iload           10
        //   195: ifeq            112
        //   198: aload_0        
        //   199: getfield        com/whatsapp/VoipActivity.r:Z
        //   202: ifne            112
        //   205: aload_0        
        //   206: new             Landroid/content/Intent;
        //   209: dup            
        //   210: aload_0        
        //   211: ldc_w           Lcom/whatsapp/VoiceService;.class
        //   214: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   217: aload_0        
        //   218: getfield        com/whatsapp/VoipActivity.u:Landroid/content/ServiceConnection;
        //   221: iconst_1       
        //   222: invokevirtual   com/whatsapp/VoipActivity.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
        //   225: pop            
        //   226: return         
        //   227: astore          9
        //   229: aload           9
        //   231: athrow         
        //   232: astore          12
        //   234: aload           12
        //   236: athrow         
        //   237: astore          8
        //   239: aload           8
        //   241: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      77     113    116    Ljava/lang/IllegalArgumentException;
        //  82     91     116    121    Ljava/lang/IllegalArgumentException;
        //  96     112    121    126    Ljava/lang/IllegalArgumentException;
        //  114    116    116    121    Ljava/lang/IllegalArgumentException;
        //  118    121    121    126    Ljava/lang/IllegalArgumentException;
        //  178    183    232    237    Ljava/lang/IllegalArgumentException;
        //  183    193    237    242    Ljava/lang/IllegalArgumentException;
        //  198    226    227    232    Ljava/lang/IllegalArgumentException;
        //  239    242    227    232    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 119, Size: 119
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
    protected void onPause() {
        Log.i(VoipActivity.z[2]);
        super.onPause();
        Label_0040: {
            if (!this.r) {
                break Label_0040;
            }
            Log.i(VoipActivity.z[1]);
            while (true) {
                try {
                    this.unbindService(this.u);
                    this.r = false;
                    this.m = false;
                }
                catch (IllegalArgumentException ex) {
                    Log.b(ex);
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    protected void onResume() {
        try {
            Log.i(VoipActivity.z[33]);
            super.onResume();
            this.m = true;
            this.t = true;
            if (!Voip.d()) {
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.j();
        this.q.sendEmptyMessageDelayed(1, 500L);
        Log.i(VoipActivity.z[32]);
        this.bindService(new Intent((Context)this, (Class)VoiceService.class), this.u, 1);
    }
    
    @Override
    protected void onStart() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //     3: bipush          15
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: invokespecial   com/whatsapp/DialogToastActivity.onStart:()V
        //    13: invokestatic    com/whatsapp/Voip.d:()Z
        //    16: istore          4
        //    18: iload           4
        //    20: ifne            76
        //    23: aload_0        
        //    24: invokevirtual   com/whatsapp/VoipActivity.getIntent:()Landroid/content/Intent;
        //    27: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    30: bipush          14
        //    32: aaload         
        //    33: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //    36: istore          5
        //    38: iload           5
        //    40: ifeq            53
        //    43: aload_0        
        //    44: invokevirtual   com/whatsapp/VoipActivity.i:()V
        //    47: getstatic       com/whatsapp/App.I:Z
        //    50: ifeq            66
        //    53: aload_0        
        //    54: invokevirtual   com/whatsapp/VoipActivity.finish:()V
        //    57: getstatic       com/whatsapp/VoipActivity.z:[Ljava/lang/String;
        //    60: bipush          16
        //    62: aaload         
        //    63: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    66: return         
        //    67: astore_1       
        //    68: aload_1        
        //    69: athrow         
        //    70: astore_2       
        //    71: aload_2        
        //    72: athrow         
        //    73: astore_3       
        //    74: aload_3        
        //    75: athrow         
        //    76: aload_0        
        //    77: invokespecial   com/whatsapp/VoipActivity.g:()V
        //    80: aload_0        
        //    81: invokespecial   com/whatsapp/VoipActivity.e:()V
        //    84: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      18     67     70     Ljava/lang/IllegalArgumentException;
        //  23     38     70     73     Ljava/lang/IllegalArgumentException;
        //  43     53     73     76     Ljava/lang/IllegalArgumentException;
        //  53     66     73     76     Ljava/lang/IllegalArgumentException;
        //  68     70     70     73     Ljava/lang/IllegalArgumentException;
        //  71     73     73     76     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 44, Size: 44
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
    protected void onStop() {
        Log.i(VoipActivity.z[18]);
        super.onStop();
    }
    
    public void onUserInteraction() {
        this.t = true;
    }
    
    protected void onUserLeaveHint() {
        Log.i(VoipActivity.z[5]);
        this.t = false;
    }
}
