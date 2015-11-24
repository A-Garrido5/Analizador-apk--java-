// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.annotation.TargetApi;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.RotateAnimation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.media.AudioManager;
import android.os.Build$VERSION;
import android.view.animation.ScaleAnimation;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import com.facebook.rebound.o;
import com.facebook.rebound.q;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.ClippingLayout;
import android.content.Context;
import android.os.PowerManager;
import android.widget.TextView;
import android.app.Activity;
import android.widget.Toast;
import com.facebook.rebound.m;
import android.view.View;
import android.os.PowerManager$WakeLock;
import android.os.Handler;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.media.SoundPool;

public class ps
{
    private static SoundPool i;
    private static int l;
    private static Boolean m;
    private static int n;
    private static int u;
    private static final String[] z;
    private gu a;
    private float b;
    private long c;
    private AudioManager$OnAudioFocusChangeListener d;
    private Handler e;
    private PowerManager$WakeLock f;
    private int g;
    private Runnable h;
    private View j;
    private m k;
    private int o;
    private ad p;
    private Toast q;
    private String r;
    private long s;
    private int t;
    private Activity v;
    private float w;
    private od x;
    private TextView y;
    
    static {
        final String[] z2 = new String[19];
        String s = "%0\u001c\u001aU";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0507:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ':';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = 'x';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0017\u0003L+,\u001b\u0016T+1\u001d\\H!)\u001d\u0012I!";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0017\u0003L+,\u001b\u0016T+1\u001d\\I0*\bS";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "2,\u001a\u0001[0*\n";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0017\u0003L+,\u001b\u0016T+1\u001d\\I0*\bS";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ",$\b\u0007S'\u001a\u001e\u0016_ '\u0019\u0010Q\u001b \u0016\u0012X( \u001c";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0017\u0003L+,\u001b\u0016T+1\u001dS^17\u0019\u0007S++B";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0017\u0003L+,\u001b\u0016T+1\u001dS";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0017\u0003L+,\u001b\u0016T+1\u001d";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0019\u0001N2*\u0011\u0010_**\f\u0016";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "%0\u001c\u001aUk*\u001f\u0014\u0001d&\u0017\u0017_'6E\u001cJ16";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "2,\u001a\u0001[0*\n";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = ",$\b\u0007S'\u001a\u001e\u0016_ '\u0019\u0010Q\u001b \u0016\u0012X( \u001c";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0019\u0001N2*\u0011\u0010_**\f\u0016";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "2*\u0011\u0010_**\f\u0016\u001571\u0019\u0001N2*\u0011\u0010_**\f\u0016\u0015-+\b\u0001U#7\u001d\u0000I";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = ")*\r\u001dN!!";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "2*\u0011\u0010_**\f\u0016";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "4*\u000f\u0016H";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "%0\u001c\u001aU";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    break Label_0507;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ps(final Activity v, final gu a) {
        this.e = new a92(this);
        this.h = new s5(this);
        this.v = v;
        this.a = a;
        this.y = (TextView)this.v.findViewById(2131755452);
        this.j = this.v.findViewById(2131755459);
        this.f = ((PowerManager)v.getSystemService(ps.z[17])).newWakeLock(6, ps.z[16]);
        if (ps.i == null) {
            ps.i = new SoundPool(1, 1, 0);
            ps.n = ps.i.load((Context)App.aq, 2131165189, 0);
            ps.l = ps.i.load((Context)App.aq, 2131165190, 0);
            ps.u = ps.i.load((Context)App.aq, 2131165188, 0);
        }
        final TextView textView = (TextView)this.v.findViewById(2131755447);
        final View viewById = this.v.findViewById(2131755457);
        final TextView textView2 = (TextView)this.v.findViewById(2131755454);
        final View viewById2 = this.v.findViewById(2131755444);
        final ClippingLayout clippingLayout = (ClippingLayout)this.v.findViewById(2131755421);
        Label_0271: {
            if (App.ak()) {
                textView2.setCompoundDrawablesWithIntrinsicBounds(2130839110, 0, 0, 0);
                if (!App.I) {
                    break Label_0271;
                }
            }
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)new com.whatsapp.util.m(this.v.getResources().getDrawable(2130839110)), (Drawable)null);
        }
        final float b = vc.b().b;
        viewById.setOnTouchListener((View$OnTouchListener)new xh(this, textView, textView2, viewById, viewById2, clippingLayout));
        final View viewById3 = this.v.findViewById(2131755453);
        viewById3.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new s2(this, viewById3, textView2));
        ((ViewGroup)this.v.findViewById(2131755423)).addView((View)new VoiceNoteRecordingUi$4(this, (Context)this.v), -1, -1);
        (this.k = com.facebook.rebound.q.a().a()).a(new o(440.0, 21.0));
    }
    
    static float a(final ps ps, final float w) {
        return ps.w = w;
    }
    
    static long a(final ps ps, final long c) {
        return ps.c = c;
    }
    
    static View a(final ps ps) {
        return ps.j;
    }
    
    public static Animation a(final boolean b) {
        final AnimationSet set = new AnimationSet(true);
        AlphaAnimation alphaAnimation;
        if (b) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        }
        else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        ((Animation)alphaAnimation).setDuration(160L);
        set.addAnimation((Animation)alphaAnimation);
        ScaleAnimation scaleAnimation;
        if (b) {
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        }
        else {
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        }
        scaleAnimation.setDuration(160L);
        set.addAnimation((Animation)scaleAnimation);
        set.setDuration(160L);
        return (Animation)set;
    }
    
    static ad a(final ps ps, final ad p2) {
        return ps.p = p2;
    }
    
    static float b(final ps ps) {
        return ps.b;
    }
    
    static float b(final ps ps, final float b) {
        return ps.b = b;
    }
    
    private void b() {
        if (Build$VERSION.SDK_INT > 7) {
            ((AudioManager)this.v.getSystemService(ps.z[0])).requestAudioFocus(this.g(), 3, 2);
        }
    }
    
    static String c(final ps ps) {
        return ps.r;
    }
    
    static int d(final ps ps) {
        return ps.t;
    }
    
    static SoundPool d() {
        return ps.i;
    }
    
    static od e(final ps ps) {
        return ps.x;
    }
    
    private void e() {
        this.v.findViewById(2131755451).setVisibility(4);
        final View viewById = this.v.findViewById(2131755460);
        viewById.setVisibility(0);
        final TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        ((Animation)translateAnimation).setDuration(213L);
        ((Animation)translateAnimation).setStartOffset(640L);
        ((Animation)translateAnimation).setFillBefore(true);
        viewById.startAnimation((Animation)translateAnimation);
        final View viewById2 = this.v.findViewById(2131755458);
        viewById2.setVisibility(0);
        final AnimationSet set = new AnimationSet(true);
        set.setInterpolator((Interpolator)new DecelerateInterpolator(1.1f));
        final TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        ((Animation)translateAnimation2).setDuration(640L);
        ((Animation)translateAnimation2).setRepeatMode(2);
        ((Animation)translateAnimation2).setRepeatCount(1);
        final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        ((Animation)rotateAnimation).setDuration(640L);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.61f, 1.0f, 0.61f, 1, 0.5f, 1, 0.5f);
        ((Animation)scaleAnimation).setDuration(320L);
        ((Animation)scaleAnimation).setStartOffset(960L);
        set.addAnimation((Animation)scaleAnimation);
        set.addAnimation((Animation)rotateAnimation);
        set.addAnimation((Animation)translateAnimation2);
        final View viewById3 = this.v.findViewById(2131755461);
        final AnimationSet set2 = new AnimationSet(true);
        final TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        ((Animation)translateAnimation3).setDuration(160L);
        ((Animation)translateAnimation3).setStartOffset(746L);
        ((Animation)translateAnimation3).setFillAfter(true);
        final RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        ((Animation)rotateAnimation2).setDuration(160L);
        ((Animation)rotateAnimation2).setStartOffset(746L);
        ((Animation)rotateAnimation2).setFillAfter(true);
        set2.addAnimation((Animation)rotateAnimation2);
        set2.addAnimation((Animation)translateAnimation3);
        set2.setFillAfter(true);
        viewById3.setVisibility(0);
        viewById3.startAnimation((Animation)set2);
        final View viewById4 = this.v.findViewById(2131755446);
        viewById4.setVisibility(4);
        viewById2.startAnimation((Animation)set);
        set.setAnimationListener((Animation$AnimationListener)new bf(this, viewById2, viewById, viewById3, viewById4));
    }
    
    static Activity f(final ps ps) {
        return ps.v;
    }
    
    private void f() {
        if (Build$VERSION.SDK_INT > 7) {
            ((AudioManager)this.v.getSystemService(ps.z[18])).abandonAudioFocus(this.g());
        }
    }
    
    @TargetApi(8)
    private AudioManager$OnAudioFocusChangeListener g() {
        if (this.d == null) {
            this.d = (AudioManager$OnAudioFocusChangeListener)new a_5(this);
        }
        return this.d;
    }
    
    static Handler g(final ps ps) {
        return ps.e;
    }
    
    static float h(final ps ps) {
        return ps.w;
    }
    
    static ad i(final ps ps) {
        return ps.p;
    }
    
    static gu j(final ps ps) {
        return ps.a;
    }
    
    static long k(final ps ps) {
        return ps.c;
    }
    
    static TextView l(final ps ps) {
        return ps.y;
    }
    
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/Voip.d:()Z
        //     7: ifeq            25
        //    10: aload_0        
        //    11: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //    14: ldc_w           2131231093
        //    17: iconst_0       
        //    18: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    21: return         
        //    22: astore_2       
        //    23: aload_2        
        //    24: athrow         
        //    25: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //    28: bipush          9
        //    30: aaload         
        //    31: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    34: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //    37: astore_3       
        //    38: aload_3        
        //    39: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //    42: bipush          15
        //    44: aaload         
        //    45: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    48: ifne            66
        //    51: aload_0        
        //    52: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //    55: bipush          15
        //    57: invokevirtual   android/app/Activity.showDialog:(I)V
        //    60: return         
        //    61: astore          4
        //    63: aload           4
        //    65: athrow         
        //    66: invokestatic    com/whatsapp/App.C:()J
        //    69: sipush          1024
        //    72: sipush          1024
        //    75: getstatic       com/whatsapp/ym.k:I
        //    78: imul           
        //    79: imul           
        //    80: i2l            
        //    81: lcmp           
        //    82: ifge            103
        //    85: aload_0        
        //    86: getfield        com/whatsapp/ps.a:Lcom/whatsapp/gu;
        //    89: ldc_w           2131231078
        //    92: invokeinterface com/whatsapp/gu.a:(I)V
        //    97: return         
        //    98: astore          5
        //   100: aload           5
        //   102: athrow         
        //   103: aload_0        
        //   104: getfield        com/whatsapp/ps.r:Ljava/lang/String;
        //   107: invokestatic    com/whatsapp/App.p:(Ljava/lang/String;)Z
        //   110: ifeq            128
        //   113: aload_0        
        //   114: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   117: bipush          106
        //   119: invokevirtual   android/app/Activity.showDialog:(I)V
        //   122: return         
        //   123: astore          6
        //   125: aload           6
        //   127: athrow         
        //   128: aload_0        
        //   129: getfield        com/whatsapp/ps.x:Lcom/whatsapp/od;
        //   132: ifnull          150
        //   135: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //   138: bipush          14
        //   140: aaload         
        //   141: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   144: return         
        //   145: astore          7
        //   147: aload           7
        //   149: athrow         
        //   150: invokestatic    com/whatsapp/up.h:()V
        //   153: aload_0        
        //   154: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   157: invokevirtual   android/app/Activity.getWindowManager:()Landroid/view/WindowManager;
        //   160: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   165: invokevirtual   android/view/Display.getOrientation:()I
        //   168: istore          8
        //   170: aload_0        
        //   171: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   174: invokevirtual   android/app/Activity.getResources:()Landroid/content/res/Resources;
        //   177: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   180: getfield        android/content/res/Configuration.orientation:I
        //   183: istore          17
        //   185: iload           17
        //   187: tableswitch {
        //                2: 1162
        //                3: 1198
        //          default: 208
        //        }
        //   208: aload_0        
        //   209: getfield        com/whatsapp/ps.f:Landroid/os/PowerManager$WakeLock;
        //   212: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //   215: aload_0        
        //   216: invokespecial   com/whatsapp/ps.b:()V
        //   219: aload_0        
        //   220: invokevirtual   com/whatsapp/ps.c:()V
        //   223: aload_0        
        //   224: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   227: invokevirtual   android/app/Activity.getContentResolver:()Landroid/content/ContentResolver;
        //   230: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //   233: bipush          12
        //   235: aaload         
        //   236: invokestatic    android/provider/Settings$System.getInt:(Landroid/content/ContentResolver;Ljava/lang/String;)I
        //   239: ifeq            264
        //   242: aload_0        
        //   243: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   246: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //   249: bipush          11
        //   251: aaload         
        //   252: invokevirtual   android/app/Activity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   255: checkcast       Landroid/os/Vibrator;
        //   258: ldc2_w          75
        //   261: invokevirtual   android/os/Vibrator.vibrate:(J)V
        //   264: aload_0        
        //   265: getstatic       com/whatsapp/ps.i:Landroid/media/SoundPool;
        //   268: getstatic       com/whatsapp/ps.n:I
        //   271: fconst_1       
        //   272: fconst_1       
        //   273: iconst_0       
        //   274: iconst_0       
        //   275: fconst_1       
        //   276: invokevirtual   android/media/SoundPool.play:(IFFIIF)I
        //   279: putfield        com/whatsapp/ps.t:I
        //   282: aload_0        
        //   283: getfield        com/whatsapp/ps.y:Landroid/widget/TextView;
        //   286: lconst_0       
        //   287: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   290: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   293: aload_0        
        //   294: fconst_1       
        //   295: putfield        com/whatsapp/ps.w:F
        //   298: aload_0        
        //   299: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   302: ldc_w           2131755451
        //   305: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   308: astore          19
        //   310: aload           19
        //   312: iconst_0       
        //   313: invokevirtual   android/view/View.setVisibility:(I)V
        //   316: new             Landroid/view/animation/AlphaAnimation;
        //   319: dup            
        //   320: fconst_0       
        //   321: fconst_1       
        //   322: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //   325: astore          20
        //   327: aload           20
        //   329: new             Lcom/whatsapp/bt;
        //   332: dup            
        //   333: aload_0        
        //   334: invokespecial   com/whatsapp/bt.<init>:(Lcom/whatsapp/ps;)V
        //   337: invokevirtual   android/view/animation/Animation.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //   340: aload           20
        //   342: ldc2_w          500
        //   345: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   348: aload           20
        //   350: iconst_2       
        //   351: invokevirtual   android/view/animation/Animation.setRepeatMode:(I)V
        //   354: aload           20
        //   356: iconst_m1      
        //   357: invokevirtual   android/view/animation/Animation.setRepeatCount:(I)V
        //   360: aload           19
        //   362: aload           20
        //   364: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   367: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   370: bipush          11
        //   372: if_icmpge       526
        //   375: new             Landroid/view/animation/ScaleAnimation;
        //   378: dup            
        //   379: ldc_w           0.5
        //   382: fconst_1       
        //   383: ldc_w           0.5
        //   386: fconst_1       
        //   387: iconst_1       
        //   388: ldc_w           0.5
        //   391: iconst_1       
        //   392: ldc_w           0.5
        //   395: invokespecial   android/view/animation/ScaleAnimation.<init>:(FFFFIFIF)V
        //   398: astore          21
        //   400: invokestatic    com/whatsapp/App.ak:()Z
        //   403: istore          23
        //   405: iload           23
        //   407: ifeq            1294
        //   410: ldc_w           0.25
        //   413: fstore          24
        //   415: invokestatic    com/whatsapp/App.ak:()Z
        //   418: ifeq            1302
        //   421: ldc_w           0.25
        //   424: fstore          25
        //   426: new             Landroid/view/animation/TranslateAnimation;
        //   429: dup            
        //   430: iconst_1       
        //   431: fload           24
        //   433: iconst_1       
        //   434: fload           25
        //   436: iconst_1       
        //   437: ldc_w           0.25
        //   440: iconst_1       
        //   441: ldc_w           0.25
        //   444: invokespecial   android/view/animation/TranslateAnimation.<init>:(IFIFIFIF)V
        //   447: astore          26
        //   449: new             Landroid/view/animation/AnimationSet;
        //   452: dup            
        //   453: iconst_1       
        //   454: invokespecial   android/view/animation/AnimationSet.<init>:(Z)V
        //   457: astore          27
        //   459: aload           27
        //   461: aload           21
        //   463: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   466: aload           27
        //   468: aload           26
        //   470: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   473: aload           27
        //   475: ldc2_w          160
        //   478: invokevirtual   android/view/animation/AnimationSet.setDuration:(J)V
        //   481: aload           27
        //   483: iconst_1       
        //   484: invokevirtual   android/view/animation/AnimationSet.setFillBefore:(Z)V
        //   487: aload           27
        //   489: iconst_1       
        //   490: invokevirtual   android/view/animation/AnimationSet.setFillAfter:(Z)V
        //   493: aload           27
        //   495: new             Landroid/view/animation/OvershootInterpolator;
        //   498: dup            
        //   499: invokespecial   android/view/animation/OvershootInterpolator.<init>:()V
        //   502: invokevirtual   android/view/animation/AnimationSet.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //   505: aload_0        
        //   506: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   509: iconst_0       
        //   510: invokevirtual   android/view/View.setVisibility:(I)V
        //   513: aload_0        
        //   514: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   517: aload           27
        //   519: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   522: iload_1        
        //   523: ifeq            637
        //   526: aload_0        
        //   527: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   530: iconst_0       
        //   531: invokevirtual   android/view/View.setVisibility:(I)V
        //   534: aload_0        
        //   535: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   538: invokevirtual   android/view/View.getWidth:()I
        //   541: iconst_4       
        //   542: idiv           
        //   543: istore          61
        //   545: getstatic       com/whatsapp/App.W:Z
        //   548: ifeq            556
        //   551: iload           61
        //   553: ineg           
        //   554: istore          61
        //   556: aload_0        
        //   557: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   560: iload           61
        //   562: i2f            
        //   563: invokevirtual   android/view/View.setTranslationX:(F)V
        //   566: aload_0        
        //   567: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   570: aload_0        
        //   571: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   574: invokevirtual   android/view/View.getHeight:()I
        //   577: iconst_4       
        //   578: idiv           
        //   579: i2f            
        //   580: invokevirtual   android/view/View.setTranslationY:(F)V
        //   583: aload_0        
        //   584: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   587: ldc_w           0.5
        //   590: invokevirtual   android/view/View.setScaleX:(F)V
        //   593: aload_0        
        //   594: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   597: ldc_w           0.5
        //   600: invokevirtual   android/view/View.setScaleY:(F)V
        //   603: aload_0        
        //   604: getfield        com/whatsapp/ps.k:Lcom/facebook/rebound/m;
        //   607: invokevirtual   com/facebook/rebound/m.i:()Lcom/facebook/rebound/m;
        //   610: pop            
        //   611: aload_0        
        //   612: getfield        com/whatsapp/ps.k:Lcom/facebook/rebound/m;
        //   615: new             Lcom/whatsapp/a8t;
        //   618: dup            
        //   619: aload_0        
        //   620: iconst_0       
        //   621: invokespecial   com/whatsapp/a8t.<init>:(Lcom/whatsapp/ps;I)V
        //   624: invokevirtual   com/facebook/rebound/m.a:(Lcom/facebook/rebound/j;)Lcom/facebook/rebound/m;
        //   627: pop            
        //   628: aload_0        
        //   629: getfield        com/whatsapp/ps.k:Lcom/facebook/rebound/m;
        //   632: dconst_1       
        //   633: invokevirtual   com/facebook/rebound/m.d:(D)Lcom/facebook/rebound/m;
        //   636: pop            
        //   637: aload_0        
        //   638: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   641: ldc_w           2131755443
        //   644: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   647: iconst_4       
        //   648: invokevirtual   android/view/View.setVisibility:(I)V
        //   651: aload_0        
        //   652: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   655: ldc_w           2131755446
        //   658: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   661: iconst_0       
        //   662: invokevirtual   android/view/View.setVisibility:(I)V
        //   665: aload_0        
        //   666: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   669: ldc_w           2131755460
        //   672: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   675: astore          28
        //   677: aload           28
        //   679: invokevirtual   android/view/View.clearAnimation:()V
        //   682: aload           28
        //   684: bipush          8
        //   686: invokevirtual   android/view/View.setVisibility:(I)V
        //   689: aload_0        
        //   690: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   693: ldc_w           2131755458
        //   696: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   699: astore          29
        //   701: aload           29
        //   703: invokevirtual   android/view/View.clearAnimation:()V
        //   706: aload           29
        //   708: bipush          8
        //   710: invokevirtual   android/view/View.setVisibility:(I)V
        //   713: aload_0        
        //   714: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   717: ldc_w           2131755461
        //   720: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   723: astore          30
        //   725: aload           30
        //   727: invokevirtual   android/view/View.clearAnimation:()V
        //   730: aload           30
        //   732: bipush          8
        //   734: invokevirtual   android/view/View.setVisibility:(I)V
        //   737: new             Landroid/view/animation/AnimationSet;
        //   740: dup            
        //   741: iconst_1       
        //   742: invokespecial   android/view/animation/AnimationSet.<init>:(Z)V
        //   745: astore          31
        //   747: invokestatic    com/whatsapp/App.ak:()Z
        //   750: istore          33
        //   752: iload           33
        //   754: ifeq            1315
        //   757: iconst_2       
        //   758: istore          34
        //   760: iload           34
        //   762: i2f            
        //   763: fstore          35
        //   765: invokestatic    com/whatsapp/App.ak:()Z
        //   768: ifeq            1322
        //   771: iconst_m1      
        //   772: istore          36
        //   774: new             Landroid/view/animation/TranslateAnimation;
        //   777: dup            
        //   778: iconst_1       
        //   779: fload           35
        //   781: iconst_1       
        //   782: iload           36
        //   784: i2f            
        //   785: iconst_1       
        //   786: fconst_0       
        //   787: iconst_1       
        //   788: fconst_0       
        //   789: invokespecial   android/view/animation/TranslateAnimation.<init>:(IFIFIFIF)V
        //   792: astore          37
        //   794: aload           37
        //   796: ldc2_w          1600
        //   799: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   802: aload           37
        //   804: iconst_m1      
        //   805: invokevirtual   android/view/animation/Animation.setRepeatCount:(I)V
        //   808: new             Landroid/view/animation/AlphaAnimation;
        //   811: dup            
        //   812: fconst_1       
        //   813: fconst_0       
        //   814: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //   817: astore          38
        //   819: aload           38
        //   821: ldc2_w          1600
        //   824: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   827: aload           38
        //   829: iconst_m1      
        //   830: invokevirtual   android/view/animation/Animation.setRepeatCount:(I)V
        //   833: aload           31
        //   835: aload           37
        //   837: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   840: aload           31
        //   842: aload           38
        //   844: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   847: aload           31
        //   849: ldc2_w          1600
        //   852: invokevirtual   android/view/animation/AnimationSet.setDuration:(J)V
        //   855: aload           31
        //   857: iconst_m1      
        //   858: invokevirtual   android/view/animation/AnimationSet.setRepeatCount:(I)V
        //   861: aload           31
        //   863: new             Landroid/view/animation/DecelerateInterpolator;
        //   866: dup            
        //   867: invokespecial   android/view/animation/DecelerateInterpolator.<init>:()V
        //   870: invokevirtual   android/view/animation/AnimationSet.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //   873: aload_0        
        //   874: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   877: ldc_w           2131755455
        //   880: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   883: aload           31
        //   885: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   888: aload_0        
        //   889: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   892: ldc_w           2131755449
        //   895: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   898: astore          39
        //   900: aload           39
        //   902: iconst_0       
        //   903: invokevirtual   android/view/View.setVisibility:(I)V
        //   906: aload           39
        //   908: iconst_1       
        //   909: invokevirtual   android/view/View.setClickable:(Z)V
        //   912: invokestatic    com/whatsapp/App.ak:()Z
        //   915: istore          41
        //   917: iload           41
        //   919: ifeq            1333
        //   922: iconst_1       
        //   923: istore          42
        //   925: new             Landroid/view/animation/TranslateAnimation;
        //   928: dup            
        //   929: iconst_1       
        //   930: iload           42
        //   932: i2f            
        //   933: iconst_1       
        //   934: fconst_0       
        //   935: iconst_1       
        //   936: fconst_0       
        //   937: iconst_1       
        //   938: fconst_0       
        //   939: invokespecial   android/view/animation/TranslateAnimation.<init>:(IFIFIFIF)V
        //   942: astore          43
        //   944: aload           43
        //   946: ldc2_w          160
        //   949: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   952: aload           39
        //   954: aload           43
        //   956: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   959: aload_0        
        //   960: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   963: ldc_w           2131755445
        //   966: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   969: astore          44
        //   971: aload           44
        //   973: invokevirtual   android/view/View.clearAnimation:()V
        //   976: new             Landroid/view/animation/AlphaAnimation;
        //   979: dup            
        //   980: fconst_1       
        //   981: fconst_0       
        //   982: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //   985: astore          45
        //   987: aload           45
        //   989: ldc2_w          160
        //   992: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   995: aload           45
        //   997: iconst_1       
        //   998: invokevirtual   android/view/animation/Animation.setFillBefore:(Z)V
        //  1001: aload           45
        //  1003: iconst_1       
        //  1004: invokevirtual   android/view/animation/Animation.setFillAfter:(Z)V
        //  1007: aload           44
        //  1009: aload           45
        //  1011: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //  1014: aload_0        
        //  1015: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //  1018: ldc             2131755423
        //  1020: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //  1023: iconst_0       
        //  1024: invokevirtual   android/view/View.setVisibility:(I)V
        //  1027: invokestatic    com/whatsapp/util/br.c:()Ljava/lang/String;
        //  1030: iconst_2       
        //  1031: iconst_1       
        //  1032: iconst_1       
        //  1033: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;BIZ)Ljava/io/File;
        //  1036: astore          46
        //  1038: getstatic       com/whatsapp/ps.m:Ljava/lang/Boolean;
        //  1041: ifnonnull       1061
        //  1044: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //  1047: putstatic       com/whatsapp/ps.m:Ljava/lang/Boolean;
        //  1050: getstatic       com/whatsapp/App.aV:I
        //  1053: istore          60
        //  1055: iload           60
        //  1057: iconst_3       
        //  1058: if_icmpne       1061
        //  1061: aload           46
        //  1063: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  1066: astore          49
        //  1068: getstatic       com/whatsapp/ps.m:Ljava/lang/Boolean;
        //  1071: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1074: ifeq            1349
        //  1077: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //  1080: bipush          10
        //  1082: aaload         
        //  1083: astore          50
        //  1085: aload_0        
        //  1086: aload           49
        //  1088: aload           50
        //  1090: invokestatic    com/whatsapp/od.a:(Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/od;
        //  1093: putfield        com/whatsapp/ps.x:Lcom/whatsapp/od;
        //  1096: aload_0        
        //  1097: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1100: putfield        com/whatsapp/ps.c:J
        //  1103: aload_0        
        //  1104: getfield        com/whatsapp/ps.x:Lcom/whatsapp/od;
        //  1107: invokevirtual   com/whatsapp/od.c:()V
        //  1110: aload_0        
        //  1111: getfield        com/whatsapp/ps.y:Landroid/widget/TextView;
        //  1114: aload_0        
        //  1115: getfield        com/whatsapp/ps.h:Ljava/lang/Runnable;
        //  1118: invokevirtual   android/widget/TextView.removeCallbacks:(Ljava/lang/Runnable;)Z
        //  1121: pop            
        //  1122: aload_0        
        //  1123: getfield        com/whatsapp/ps.y:Landroid/widget/TextView;
        //  1126: astore          54
        //  1128: aload_0        
        //  1129: getfield        com/whatsapp/ps.h:Ljava/lang/Runnable;
        //  1132: astore          55
        //  1134: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1137: istore          56
        //  1139: iload           56
        //  1141: bipush          16
        //  1143: if_icmplt       1384
        //  1146: ldc2_w          340
        //  1149: lstore          57
        //  1151: aload           54
        //  1153: aload           55
        //  1155: lload           57
        //  1157: invokevirtual   android/widget/TextView.postDelayed:(Ljava/lang/Runnable;J)Z
        //  1160: pop            
        //  1161: return         
        //  1162: iload           8
        //  1164: ifeq            1173
        //  1167: iload           8
        //  1169: iconst_1       
        //  1170: if_icmpne       1185
        //  1173: aload_0        
        //  1174: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //  1177: iconst_1       
        //  1178: invokevirtual   android/app/Activity.setRequestedOrientation:(I)V
        //  1181: iload_1        
        //  1182: ifeq            208
        //  1185: aload_0        
        //  1186: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //  1189: bipush          9
        //  1191: invokevirtual   android/app/Activity.setRequestedOrientation:(I)V
        //  1194: iload_1        
        //  1195: ifeq            208
        //  1198: iload           8
        //  1200: ifeq            1209
        //  1203: iload           8
        //  1205: iconst_1       
        //  1206: if_icmpne       1221
        //  1209: aload_0        
        //  1210: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //  1213: iconst_0       
        //  1214: invokevirtual   android/app/Activity.setRequestedOrientation:(I)V
        //  1217: iload_1        
        //  1218: ifeq            208
        //  1221: aload_0        
        //  1222: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //  1225: bipush          8
        //  1227: invokevirtual   android/app/Activity.setRequestedOrientation:(I)V
        //  1230: goto            208
        //  1233: astore          16
        //  1235: aload           16
        //  1237: athrow         
        //  1238: astore          9
        //  1240: aload           9
        //  1242: athrow         
        //  1243: astore          10
        //  1245: aload           10
        //  1247: athrow         
        //  1248: astore          11
        //  1250: aload           11
        //  1252: athrow         
        //  1253: astore          12
        //  1255: aload           12
        //  1257: athrow         
        //  1258: astore          13
        //  1260: aload           13
        //  1262: athrow         
        //  1263: astore          14
        //  1265: aload           14
        //  1267: athrow         
        //  1268: astore          15
        //  1270: aload           15
        //  1272: athrow         
        //  1273: astore          18
        //  1275: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //  1278: bipush          13
        //  1280: aaload         
        //  1281: aload           18
        //  1283: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1286: goto            264
        //  1289: astore          22
        //  1291: aload           22
        //  1293: athrow         
        //  1294: ldc_w           -0.25
        //  1297: fstore          24
        //  1299: goto            415
        //  1302: ldc_w           -0.25
        //  1305: fstore          25
        //  1307: goto            426
        //  1310: astore          32
        //  1312: aload           32
        //  1314: athrow         
        //  1315: bipush          -2
        //  1317: istore          34
        //  1319: goto            760
        //  1322: iconst_1       
        //  1323: istore          36
        //  1325: goto            774
        //  1328: astore          40
        //  1330: aload           40
        //  1332: athrow         
        //  1333: iconst_m1      
        //  1334: istore          42
        //  1336: goto            925
        //  1339: astore          47
        //  1341: aload           47
        //  1343: athrow         
        //  1344: astore          48
        //  1346: aload           48
        //  1348: athrow         
        //  1349: ldc_w           ""
        //  1352: astore          50
        //  1354: goto            1085
        //  1357: astore          51
        //  1359: aload_0        
        //  1360: iconst_0       
        //  1361: invokevirtual   com/whatsapp/ps.b:(Z)V
        //  1364: aload_0        
        //  1365: getfield        com/whatsapp/ps.a:Lcom/whatsapp/gu;
        //  1368: ldc_w           2131231088
        //  1371: invokeinterface com/whatsapp/gu.a:(I)V
        //  1376: goto            1110
        //  1379: astore          52
        //  1381: aload           52
        //  1383: athrow         
        //  1384: ldc2_w          160
        //  1387: lstore          57
        //  1389: goto            1151
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                
        //  -----  -----  -----  -----  ----------------------------------------------------
        //  4      21     22     25     Landroid/provider/Settings$SettingNotFoundException;
        //  38     60     61     66     Landroid/provider/Settings$SettingNotFoundException;
        //  66     97     98     103    Landroid/provider/Settings$SettingNotFoundException;
        //  103    122    123    128    Landroid/provider/Settings$SettingNotFoundException;
        //  128    144    145    150    Landroid/provider/Settings$SettingNotFoundException;
        //  170    185    1238   1248   Landroid/provider/Settings$SettingNotFoundException;
        //  223    264    1273   1289   Landroid/provider/Settings$SettingNotFoundException;
        //  400    405    1289   1294   Landroid/provider/Settings$SettingNotFoundException;
        //  747    752    1310   1315   Landroid/provider/Settings$SettingNotFoundException;
        //  900    917    1328   1333   Landroid/provider/Settings$SettingNotFoundException;
        //  1038   1055   1339   1344   Landroid/provider/Settings$SettingNotFoundException;
        //  1061   1085   1344   1349   Landroid/provider/Settings$SettingNotFoundException;
        //  1103   1110   1357   1379   Ljava/lang/Exception;
        //  1110   1139   1379   1384   Landroid/provider/Settings$SettingNotFoundException;
        //  1173   1181   1248   1253   Landroid/provider/Settings$SettingNotFoundException;
        //  1185   1194   1253   1268   Landroid/provider/Settings$SettingNotFoundException;
        //  1209   1217   1268   1273   Landroid/provider/Settings$SettingNotFoundException;
        //  1221   1230   1233   1238   Landroid/provider/Settings$SettingNotFoundException;
        //  1240   1243   1243   1248   Landroid/provider/Settings$SettingNotFoundException;
        //  1245   1248   1248   1253   Landroid/provider/Settings$SettingNotFoundException;
        //  1250   1253   1253   1268   Landroid/provider/Settings$SettingNotFoundException;
        //  1255   1258   1258   1268   Landroid/provider/Settings$SettingNotFoundException;
        //  1260   1263   1263   1268   Landroid/provider/Settings$SettingNotFoundException;
        //  1265   1268   1268   1273   Landroid/provider/Settings$SettingNotFoundException;
        //  1270   1273   1233   1238   Landroid/provider/Settings$SettingNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 643, Size: 643
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
    
    public void a(final int g) {
        this.g = g;
    }
    
    public void a(final String r) {
        this.r = r;
    }
    
    public void b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/ps.c:()V
        //     8: aload_0        
        //     9: getfield        com/whatsapp/ps.x:Lcom/whatsapp/od;
        //    12: ifnull          26
        //    15: aload_0        
        //    16: getfield        com/whatsapp/ps.r:Ljava/lang/String;
        //    19: astore          5
        //    21: aload           5
        //    23: ifnonnull       35
        //    26: return         
        //    27: astore_3       
        //    28: aload_3        
        //    29: athrow         
        //    30: astore          4
        //    32: aload           4
        //    34: athrow         
        //    35: new             Ljava/lang/StringBuilder;
        //    38: dup            
        //    39: invokespecial   java/lang/StringBuilder.<init>:()V
        //    42: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //    45: bipush          7
        //    47: aaload         
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: iload_1        
        //    52: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    55: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    58: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    61: aload_0        
        //    62: getfield        com/whatsapp/ps.r:Ljava/lang/String;
        //    65: invokestatic    com/whatsapp/App.k:(Ljava/lang/String;)V
        //    68: aload_0        
        //    69: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //    72: ldc             2131755423
        //    74: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //    77: bipush          8
        //    79: invokevirtual   android/view/View.setVisibility:(I)V
        //    82: iconst_0       
        //    83: sipush          160
        //    86: sipush          960
        //    89: aload_0        
        //    90: getfield        com/whatsapp/ps.b:F
        //    93: f2i            
        //    94: imul           
        //    95: aload_0        
        //    96: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //    99: ldc             2131755421
        //   101: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   104: invokevirtual   android/view/View.getWidth:()I
        //   107: idiv           
        //   108: isub           
        //   109: invokestatic    java/lang/Math.max:(II)I
        //   112: istore          6
        //   114: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   117: bipush          11
        //   119: if_icmpge       308
        //   122: new             Landroid/view/animation/ScaleAnimation;
        //   125: dup            
        //   126: fconst_1       
        //   127: ldc_w           0.5
        //   130: fconst_1       
        //   131: ldc_w           0.5
        //   134: iconst_1       
        //   135: ldc_w           0.5
        //   138: iconst_1       
        //   139: ldc_w           0.5
        //   142: invokespecial   android/view/animation/ScaleAnimation.<init>:(FFFFIFIF)V
        //   145: astore          7
        //   147: aload           7
        //   149: ldc2_w          160
        //   152: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   155: aload_0        
        //   156: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   159: invokevirtual   android/view/View.getWidth:()I
        //   162: iconst_4       
        //   163: idiv           
        //   164: istore          8
        //   166: getstatic       com/whatsapp/App.W:Z
        //   169: ifeq            1417
        //   172: iload           8
        //   174: ineg           
        //   175: istore          9
        //   177: new             Landroid/view/animation/TranslateAnimation;
        //   180: dup            
        //   181: iconst_0       
        //   182: aload_0        
        //   183: getfield        com/whatsapp/ps.b:F
        //   186: iload           9
        //   188: i2f            
        //   189: fadd           
        //   190: iconst_0       
        //   191: iload           9
        //   193: i2f            
        //   194: iconst_1       
        //   195: ldc_w           0.25
        //   198: iconst_1       
        //   199: ldc_w           0.25
        //   202: invokespecial   android/view/animation/TranslateAnimation.<init>:(IFIFIFIF)V
        //   205: astore          10
        //   207: new             Landroid/view/animation/AnimationSet;
        //   210: dup            
        //   211: iconst_1       
        //   212: invokespecial   android/view/animation/AnimationSet.<init>:(Z)V
        //   215: astore          11
        //   217: aload           11
        //   219: aload           7
        //   221: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   224: aload           11
        //   226: aload           10
        //   228: invokevirtual   android/view/animation/AnimationSet.addAnimation:(Landroid/view/animation/Animation;)V
        //   231: aload           11
        //   233: iload           6
        //   235: i2l            
        //   236: invokevirtual   android/view/animation/AnimationSet.setDuration:(J)V
        //   239: aload           11
        //   241: iconst_1       
        //   242: invokevirtual   android/view/animation/AnimationSet.setFillBefore:(Z)V
        //   245: aload           11
        //   247: iconst_0       
        //   248: invokevirtual   android/view/animation/AnimationSet.setFillAfter:(Z)V
        //   251: aload           11
        //   253: new             Landroid/view/animation/AnticipateOvershootInterpolator;
        //   256: dup            
        //   257: ldc_w           1.5
        //   260: invokespecial   android/view/animation/AnticipateOvershootInterpolator.<init>:(F)V
        //   263: invokevirtual   android/view/animation/AnimationSet.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //   266: aload_0        
        //   267: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   270: invokevirtual   android/view/View.clearAnimation:()V
        //   273: aload_0        
        //   274: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   277: bipush          8
        //   279: invokevirtual   android/view/View.setVisibility:(I)V
        //   282: aload           11
        //   284: new             Lcom/whatsapp/g0;
        //   287: dup            
        //   288: aload_0        
        //   289: invokespecial   com/whatsapp/g0.<init>:(Lcom/whatsapp/ps;)V
        //   292: invokevirtual   android/view/animation/AnimationSet.setAnimationListener:(Landroid/view/animation/Animation$AnimationListener;)V
        //   295: aload_0        
        //   296: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   299: aload           11
        //   301: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   304: iload_2        
        //   305: ifeq            388
        //   308: aload_0        
        //   309: getfield        com/whatsapp/ps.k:Lcom/facebook/rebound/m;
        //   312: invokevirtual   com/facebook/rebound/m.i:()Lcom/facebook/rebound/m;
        //   315: pop            
        //   316: aload_0        
        //   317: getfield        com/whatsapp/ps.k:Lcom/facebook/rebound/m;
        //   320: invokevirtual   com/facebook/rebound/m.e:()D
        //   323: dstore          58
        //   325: dload           58
        //   327: dconst_0       
        //   328: dcmpl          
        //   329: ifeq            366
        //   332: aload_0        
        //   333: getfield        com/whatsapp/ps.k:Lcom/facebook/rebound/m;
        //   336: new             Lcom/whatsapp/a8d;
        //   339: dup            
        //   340: aload_0        
        //   341: aload_0        
        //   342: getfield        com/whatsapp/ps.b:F
        //   345: f2i            
        //   346: invokespecial   com/whatsapp/a8d.<init>:(Lcom/whatsapp/ps;I)V
        //   349: invokevirtual   com/facebook/rebound/m.a:(Lcom/facebook/rebound/j;)Lcom/facebook/rebound/m;
        //   352: pop            
        //   353: aload_0        
        //   354: getfield        com/whatsapp/ps.k:Lcom/facebook/rebound/m;
        //   357: dconst_0       
        //   358: invokevirtual   com/facebook/rebound/m.d:(D)Lcom/facebook/rebound/m;
        //   361: pop            
        //   362: iload_2        
        //   363: ifeq            388
        //   366: aload_0        
        //   367: getfield        com/whatsapp/ps.j:Landroid/view/View;
        //   370: iconst_4       
        //   371: invokevirtual   android/view/View.setVisibility:(I)V
        //   374: aload_0        
        //   375: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   378: ldc_w           2131755443
        //   381: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   384: iconst_0       
        //   385: invokevirtual   android/view/View.setVisibility:(I)V
        //   388: aload_0        
        //   389: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   392: ldc_w           2131755449
        //   395: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   398: astore          14
        //   400: aload           14
        //   402: bipush          8
        //   404: invokevirtual   android/view/View.setVisibility:(I)V
        //   407: new             Landroid/view/animation/AlphaAnimation;
        //   410: dup            
        //   411: fconst_1       
        //   412: fconst_0       
        //   413: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //   416: astore          15
        //   418: aload           15
        //   420: ldc2_w          160
        //   423: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   426: aload           14
        //   428: aload           15
        //   430: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   433: aload_0        
        //   434: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   437: ldc_w           2131755445
        //   440: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   443: astore          16
        //   445: aload           16
        //   447: invokevirtual   android/view/View.clearAnimation:()V
        //   450: new             Landroid/view/animation/AlphaAnimation;
        //   453: dup            
        //   454: fconst_0       
        //   455: fconst_1       
        //   456: invokespecial   android/view/animation/AlphaAnimation.<init>:(FF)V
        //   459: astore          17
        //   461: aload           17
        //   463: ldc2_w          160
        //   466: invokevirtual   android/view/animation/Animation.setDuration:(J)V
        //   469: aload           17
        //   471: iconst_1       
        //   472: invokevirtual   android/view/animation/Animation.setFillBefore:(Z)V
        //   475: aload           17
        //   477: iconst_1       
        //   478: invokevirtual   android/view/animation/Animation.setFillAfter:(Z)V
        //   481: aload           16
        //   483: aload           17
        //   485: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   488: aload_0        
        //   489: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   492: ldc             2131755421
        //   494: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   497: checkcast       Lcom/whatsapp/util/ClippingLayout;
        //   500: aconst_null    
        //   501: invokevirtual   com/whatsapp/util/ClippingLayout.setClipBounds:(Landroid/graphics/Rect;)V
        //   504: aload_0        
        //   505: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   508: ldc_w           2131755451
        //   511: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   514: astore          18
        //   516: aload           18
        //   518: invokevirtual   android/view/View.clearAnimation:()V
        //   521: aload           18
        //   523: checkcast       Landroid/widget/ImageView;
        //   526: invokevirtual   android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
        //   529: sipush          255
        //   532: invokevirtual   android/graphics/drawable/Drawable.setAlpha:(I)V
        //   535: aload_0        
        //   536: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   539: ldc_w           2131755455
        //   542: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   545: invokevirtual   android/view/View.clearAnimation:()V
        //   548: invokestatic    java/lang/System.currentTimeMillis:()J
        //   551: aload_0        
        //   552: getfield        com/whatsapp/ps.c:J
        //   555: lsub           
        //   556: lstore          19
        //   558: new             Ljava/lang/StringBuilder;
        //   561: dup            
        //   562: invokespecial   java/lang/StringBuilder.<init>:()V
        //   565: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //   568: bipush          6
        //   570: aaload         
        //   571: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   574: lload           19
        //   576: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   579: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   582: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   585: iload_1        
        //   586: ifne            602
        //   589: lload           19
        //   591: ldc2_w          1000
        //   594: lcmp           
        //   595: iflt            602
        //   598: aload_0        
        //   599: invokespecial   com/whatsapp/ps.e:()V
        //   602: aload_0        
        //   603: getfield        com/whatsapp/ps.x:Lcom/whatsapp/od;
        //   606: invokevirtual   com/whatsapp/od.a:()Ljava/io/File;
        //   609: astore          23
        //   611: aload_0        
        //   612: getfield        com/whatsapp/ps.x:Lcom/whatsapp/od;
        //   615: invokevirtual   com/whatsapp/od.e:()V
        //   618: aload_0        
        //   619: getfield        com/whatsapp/ps.x:Lcom/whatsapp/od;
        //   622: invokevirtual   com/whatsapp/od.f:()V
        //   625: aload_0        
        //   626: aconst_null    
        //   627: putfield        com/whatsapp/ps.x:Lcom/whatsapp/od;
        //   630: aload_0        
        //   631: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   634: iconst_m1      
        //   635: invokevirtual   android/app/Activity.setRequestedOrientation:(I)V
        //   638: aload_0        
        //   639: invokespecial   com/whatsapp/ps.f:()V
        //   642: aload_0        
        //   643: getfield        com/whatsapp/ps.f:Landroid/os/PowerManager$WakeLock;
        //   646: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //   649: ifeq            659
        //   652: aload_0        
        //   653: getfield        com/whatsapp/ps.f:Landroid/os/PowerManager$WakeLock;
        //   656: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   659: aload_0        
        //   660: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   663: invokevirtual   android/app/Activity.getContentResolver:()Landroid/content/ContentResolver;
        //   666: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //   669: iconst_5       
        //   670: aaload         
        //   671: invokestatic    android/provider/Settings$System.getInt:(Landroid/content/ContentResolver;Ljava/lang/String;)I
        //   674: ifeq            698
        //   677: aload_0        
        //   678: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   681: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //   684: iconst_3       
        //   685: aaload         
        //   686: invokevirtual   android/app/Activity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   689: checkcast       Landroid/os/Vibrator;
        //   692: ldc2_w          75
        //   695: invokevirtual   android/os/Vibrator.vibrate:(J)V
        //   698: iload_1        
        //   699: ifeq            1124
        //   702: lload           19
        //   704: ldc2_w          1000
        //   707: lcmp           
        //   708: iflt            823
        //   711: ldc2_w          50
        //   714: invokestatic    java/lang/Thread.sleep:(J)V
        //   717: getstatic       com/whatsapp/ps.i:Landroid/media/SoundPool;
        //   720: getstatic       com/whatsapp/ps.l:I
        //   723: fconst_1       
        //   724: fconst_1       
        //   725: iconst_0       
        //   726: iconst_0       
        //   727: fconst_1       
        //   728: invokevirtual   android/media/SoundPool.play:(IFFIIF)I
        //   731: pop            
        //   732: aload_0        
        //   733: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   736: getstatic       com/whatsapp/fieldstats/p.SENT:Lcom/whatsapp/fieldstats/p;
        //   739: aload           23
        //   741: invokevirtual   java/io/File.length:()J
        //   744: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/p;J)V
        //   747: aload_0        
        //   748: iconst_0       
        //   749: putfield        com/whatsapp/ps.o:I
        //   752: aload_0        
        //   753: getfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //   756: astore          49
        //   758: aload           49
        //   760: ifnull          797
        //   763: aload_0        
        //   764: getfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //   767: invokevirtual   com/whatsapp/ad.e:()Lcom/whatsapp/protocol/bi;
        //   770: lload           19
        //   772: ldc2_w          1000
        //   775: ldiv           
        //   776: l2i            
        //   777: putfield        com/whatsapp/protocol/bi.D:I
        //   780: aload_0        
        //   781: getfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //   784: iconst_1       
        //   785: invokevirtual   com/whatsapp/ad.b:(Z)V
        //   788: aload_0        
        //   789: aconst_null    
        //   790: putfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //   793: iload_2        
        //   794: ifeq            1180
        //   797: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   800: aload_0        
        //   801: getfield        com/whatsapp/ps.r:Ljava/lang/String;
        //   804: aload           23
        //   806: iconst_2       
        //   807: iconst_1       
        //   808: iconst_1       
        //   809: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;BIZ)Z
        //   812: pop            
        //   813: aload           23
        //   815: invokevirtual   java/io/File.delete:()Z
        //   818: pop            
        //   819: iload_2        
        //   820: ifeq            1180
        //   823: aload_0        
        //   824: getfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //   827: ifnull          843
        //   830: aload_0        
        //   831: getfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //   834: iconst_0       
        //   835: invokevirtual   com/whatsapp/ad.b:(Z)V
        //   838: aload_0        
        //   839: aconst_null    
        //   840: putfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //   843: getstatic       com/whatsapp/ps.i:Landroid/media/SoundPool;
        //   846: getstatic       com/whatsapp/ps.u:I
        //   849: fconst_1       
        //   850: fconst_1       
        //   851: iconst_0       
        //   852: iconst_0       
        //   853: fconst_1       
        //   854: invokevirtual   android/media/SoundPool.play:(IFFIIF)I
        //   857: pop            
        //   858: aload_0        
        //   859: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   862: getstatic       com/whatsapp/fieldstats/p.TOO_SHORT:Lcom/whatsapp/fieldstats/p;
        //   865: aload           23
        //   867: invokevirtual   java/io/File.length:()J
        //   870: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/p;J)V
        //   873: aload           23
        //   875: invokevirtual   java/io/File.delete:()Z
        //   878: pop            
        //   879: new             Landroid/widget/TextView;
        //   882: dup            
        //   883: aload_0        
        //   884: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   887: invokespecial   android/widget/TextView.<init>:(Landroid/content/Context;)V
        //   890: astore          37
        //   892: aload_0        
        //   893: iconst_1       
        //   894: aload_0        
        //   895: getfield        com/whatsapp/ps.o:I
        //   898: iadd           
        //   899: putfield        com/whatsapp/ps.o:I
        //   902: aload           37
        //   904: ldc_w           2131230836
        //   907: invokevirtual   android/widget/TextView.setText:(I)V
        //   910: aload           37
        //   912: iconst_m1      
        //   913: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   916: aload           37
        //   918: new             Lcom/whatsapp/util/m;
        //   921: dup            
        //   922: aload_0        
        //   923: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   926: invokevirtual   android/app/Activity.getResources:()Landroid/content/res/Resources;
        //   929: ldc_w           2130839008
        //   932: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   935: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   938: invokevirtual   android/widget/TextView.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   941: iconst_2       
        //   942: newarray        I
        //   944: astore          38
        //   946: aload_0        
        //   947: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   950: ldc             2131755457
        //   952: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   955: astore          39
        //   957: aload           39
        //   959: aload           38
        //   961: invokevirtual   android/view/View.getLocationOnScreen:([I)V
        //   964: aload_0        
        //   965: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //   968: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //   971: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   974: invokevirtual   android/view/View.getHeight:()I
        //   977: aload           38
        //   979: iconst_1       
        //   980: iaload         
        //   981: isub           
        //   982: istore          40
        //   984: invokestatic    java/lang/System.currentTimeMillis:()J
        //   987: aload_0        
        //   988: getfield        com/whatsapp/ps.s:J
        //   991: lsub           
        //   992: ldc2_w          3500
        //   995: lcmp           
        //   996: ifle            1120
        //   999: aload_0        
        //  1000: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1003: putfield        com/whatsapp/ps.s:J
        //  1006: aload_0        
        //  1007: new             Landroid/widget/Toast;
        //  1010: dup            
        //  1011: aload_0        
        //  1012: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //  1015: invokevirtual   android/app/Activity.getApplicationContext:()Landroid/content/Context;
        //  1018: invokespecial   android/widget/Toast.<init>:(Landroid/content/Context;)V
        //  1021: putfield        com/whatsapp/ps.q:Landroid/widget/Toast;
        //  1024: invokestatic    com/whatsapp/App.ak:()Z
        //  1027: istore          42
        //  1029: iload           42
        //  1031: ifeq            1077
        //  1034: aload_0        
        //  1035: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //  1038: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //  1041: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //  1044: invokevirtual   android/view/View.getWidth:()I
        //  1047: aload           38
        //  1049: iconst_0       
        //  1050: iaload         
        //  1051: isub           
        //  1052: aload           39
        //  1054: invokevirtual   android/view/View.getWidth:()I
        //  1057: isub           
        //  1058: istore          44
        //  1060: aload_0        
        //  1061: getfield        com/whatsapp/ps.q:Landroid/widget/Toast;
        //  1064: bipush          85
        //  1066: iload           44
        //  1068: iload           40
        //  1070: invokevirtual   android/widget/Toast.setGravity:(III)V
        //  1073: iload_2        
        //  1074: ifeq            1096
        //  1077: aload           38
        //  1079: iconst_0       
        //  1080: iaload         
        //  1081: istore          43
        //  1083: aload_0        
        //  1084: getfield        com/whatsapp/ps.q:Landroid/widget/Toast;
        //  1087: bipush          83
        //  1089: iload           43
        //  1091: iload           40
        //  1093: invokevirtual   android/widget/Toast.setGravity:(III)V
        //  1096: aload_0        
        //  1097: getfield        com/whatsapp/ps.q:Landroid/widget/Toast;
        //  1100: iconst_1       
        //  1101: invokevirtual   android/widget/Toast.setDuration:(I)V
        //  1104: aload_0        
        //  1105: getfield        com/whatsapp/ps.q:Landroid/widget/Toast;
        //  1108: aload           37
        //  1110: invokevirtual   android/widget/Toast.setView:(Landroid/view/View;)V
        //  1113: aload_0        
        //  1114: getfield        com/whatsapp/ps.q:Landroid/widget/Toast;
        //  1117: invokevirtual   android/widget/Toast.show:()V
        //  1120: iload_2        
        //  1121: ifeq            1180
        //  1124: aload_0        
        //  1125: getfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //  1128: ifnull          1144
        //  1131: aload_0        
        //  1132: getfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //  1135: iconst_0       
        //  1136: invokevirtual   com/whatsapp/ad.b:(Z)V
        //  1139: aload_0        
        //  1140: aconst_null    
        //  1141: putfield        com/whatsapp/ps.p:Lcom/whatsapp/ad;
        //  1144: aload           23
        //  1146: ifnull          1180
        //  1149: aload           23
        //  1151: invokevirtual   java/io/File.length:()J
        //  1154: lconst_0       
        //  1155: lcmp           
        //  1156: ifle            1174
        //  1159: aload_0        
        //  1160: getfield        com/whatsapp/ps.v:Landroid/app/Activity;
        //  1163: getstatic       com/whatsapp/fieldstats/p.CANCELLED:Lcom/whatsapp/fieldstats/p;
        //  1166: aload           23
        //  1168: invokevirtual   java/io/File.length:()J
        //  1171: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/p;J)V
        //  1174: aload           23
        //  1176: invokevirtual   java/io/File.delete:()Z
        //  1179: pop            
        //  1180: aload_0        
        //  1181: getfield        com/whatsapp/ps.g:I
        //  1184: ifeq            26
        //  1187: aload_0        
        //  1188: getfield        com/whatsapp/ps.g:I
        //  1191: istore          30
        //  1193: aload_0        
        //  1194: getfield        com/whatsapp/ps.y:Landroid/widget/TextView;
        //  1197: new             Lcom/whatsapp/_f;
        //  1200: dup            
        //  1201: aload_0        
        //  1202: iload           30
        //  1204: invokespecial   com/whatsapp/_f.<init>:(Lcom/whatsapp/ps;I)V
        //  1207: ldc2_w          2000
        //  1210: invokevirtual   android/widget/TextView.postDelayed:(Ljava/lang/Runnable;J)Z
        //  1213: pop            
        //  1214: aload_0        
        //  1215: iconst_0       
        //  1216: putfield        com/whatsapp/ps.g:I
        //  1219: return         
        //  1220: astore          12
        //  1222: aload           12
        //  1224: athrow         
        //  1225: astore          13
        //  1227: aload           13
        //  1229: athrow         
        //  1230: astore          21
        //  1232: aload           21
        //  1234: athrow         
        //  1235: astore          22
        //  1237: aload           22
        //  1239: athrow         
        //  1240: astore          24
        //  1242: iload_1        
        //  1243: ifeq            1269
        //  1246: lload           19
        //  1248: ldc2_w          1000
        //  1251: lcmp           
        //  1252: iflt            1269
        //  1255: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //  1258: iconst_4       
        //  1259: aaload         
        //  1260: aload           24
        //  1262: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1265: iload_2        
        //  1266: ifeq            618
        //  1269: new             Ljava/lang/StringBuilder;
        //  1272: dup            
        //  1273: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1276: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //  1279: iconst_2       
        //  1280: aaload         
        //  1281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1284: aload           24
        //  1286: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //  1289: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1292: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1295: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1298: goto            618
        //  1301: astore          25
        //  1303: aload           25
        //  1305: athrow         
        //  1306: astore          56
        //  1308: aload           56
        //  1310: athrow         
        //  1311: astore          26
        //  1313: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //  1316: iconst_1       
        //  1317: aaload         
        //  1318: aload           26
        //  1320: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1323: goto            625
        //  1326: astore          27
        //  1328: aload           27
        //  1330: athrow         
        //  1331: astore          28
        //  1333: getstatic       com/whatsapp/ps.z:[Ljava/lang/String;
        //  1336: bipush          8
        //  1338: aaload         
        //  1339: aload           28
        //  1341: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1344: goto            698
        //  1347: astore          55
        //  1349: aload           55
        //  1351: athrow         
        //  1352: astore          45
        //  1354: aload           45
        //  1356: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //  1359: goto            717
        //  1362: astore          46
        //  1364: aload           46
        //  1366: athrow         
        //  1367: astore          47
        //  1369: aload           47
        //  1371: athrow         
        //  1372: astore          53
        //  1374: aload           53
        //  1376: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  1379: goto            813
        //  1382: astore          50
        //  1384: aload           50
        //  1386: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //  1389: goto            813
        //  1392: astore          51
        //  1394: aload           51
        //  1396: athrow         
        //  1397: astore          34
        //  1399: aload           34
        //  1401: athrow         
        //  1402: astore          41
        //  1404: aload           41
        //  1406: athrow         
        //  1407: astore          29
        //  1409: aload           29
        //  1411: athrow         
        //  1412: astore          32
        //  1414: aload           32
        //  1416: athrow         
        //  1417: iload           8
        //  1419: istore          9
        //  1421: goto            177
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                
        //  -----  -----  -----  -----  ----------------------------------------------------
        //  4      21     27     35     Ljava/lang/Exception;
        //  28     30     30     35     Ljava/lang/Exception;
        //  217    304    1220   1225   Ljava/lang/Exception;
        //  308    325    1220   1225   Ljava/lang/Exception;
        //  332    362    1225   1230   Ljava/lang/Exception;
        //  558    585    1230   1235   Ljava/lang/Exception;
        //  598    602    1235   1240   Ljava/lang/Exception;
        //  611    618    1240   1311   Ljava/lang/Exception;
        //  618    625    1311   1326   Ljava/lang/Exception;
        //  625    659    1326   1331   Ljava/lang/Exception;
        //  659    698    1331   1347   Landroid/provider/Settings$SettingNotFoundException;
        //  711    717    1352   1362   Ljava/lang/InterruptedException;
        //  711    717    1347   1352   Landroid/provider/Settings$SettingNotFoundException;
        //  717    758    1362   1367   Ljava/lang/Exception;
        //  763    793    1362   1367   Ljava/lang/Exception;
        //  763    793    1367   1372   Landroid/provider/Settings$SettingNotFoundException;
        //  797    813    1372   1382   Ljava/io/FileNotFoundException;
        //  797    813    1382   1392   Ljava/io/IOException;
        //  797    813    1367   1372   Landroid/provider/Settings$SettingNotFoundException;
        //  813    819    1392   1397   Ljava/lang/Exception;
        //  823    843    1397   1402   Ljava/lang/Exception;
        //  984    1029   1402   1407   Ljava/lang/Exception;
        //  1124   1144   1407   1412   Ljava/lang/Exception;
        //  1149   1174   1412   1417   Ljava/lang/Exception;
        //  1222   1225   1225   1230   Ljava/lang/Exception;
        //  1232   1235   1235   1240   Ljava/lang/Exception;
        //  1255   1265   1306   1311   Ljava/lang/Exception;
        //  1269   1298   1301   1306   Ljava/lang/Exception;
        //  1308   1311   1301   1306   Ljava/lang/Exception;
        //  1364   1367   1367   1372   Landroid/provider/Settings$SettingNotFoundException;
        //  1394   1397   1397   1402   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 675, Size: 675
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
    
    public void c() {
        if (this.q != null) {
            this.q.cancel();
            this.q = null;
        }
    }
    
    public void h() {
    }
    
    public boolean i() {
        return this.x != null;
    }
}
