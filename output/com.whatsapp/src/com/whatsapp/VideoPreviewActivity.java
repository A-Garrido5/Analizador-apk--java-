// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import com.whatsapp.util.Log;
import android.media.MediaMetadataRetriever;
import android.graphics.Bitmap;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.app.Activity;
import android.content.Intent;
import android.text.format.DateUtils;
import android.content.Context;
import android.text.format.Formatter;
import com.whatsapp.util.br;
import java.io.File;
import android.widget.SeekBar;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.ImageButton;
import com.whatsapp.util.ak;
import android.widget.FrameLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class VideoPreviewActivity extends DialogToastActivity
{
    private static final String[] K;
    private long A;
    private boolean B;
    private TextView C;
    private ImageView D;
    private TextView E;
    private long F;
    private ImageView G;
    private u_ H;
    private VideoView I;
    private View J;
    private boolean k;
    private FrameLayout l;
    private ak m;
    private l1 n;
    private long o;
    private VideoTimelineView p;
    private float q;
    private TextView r;
    private ImageButton s;
    private RangeSeekBar t;
    private ViewTreeObserver$OnGlobalLayoutListener u;
    private int v;
    private SeekBar w;
    private File x;
    private FrameLayout y;
    private ConversationTextEntry z;
    
    static {
        final String[] k = new String[10];
        String s = "\u0010>y\u0013\u000b\u0016%x\u0000\r\u0003 2\u0011\u0001\u0012!t\u0012\u0001\t#u\u0003\t\u0004";
        int n = -1;
        String[] array = k;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'd';
                        break;
                    }
                    case 0: {
                        c2 = 'f';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = 'v';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0010>y\u0013\u000b\u0016%x\u0000\r\u0003 2\u0011\u0001\u0012!t\u0012\u0001\t#u\u0003\t\u0004";
                    n2 = 1;
                    array = k;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0000>q\u0013;\u00166i\u001e";
                    n2 = 2;
                    array = k;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0012>i\u001a\u0001";
                    n2 = 3;
                    array = k;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0000>q\u0013;\u00166i\u001e";
                    n2 = 4;
                    array = k;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = k;
                    s = "\u0000>q\u0013;\u00166i\u001e";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0012>i\u001a\u0001";
                    n = 5;
                    array = k;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0010>y\u0013\u000b\u0016%x\u0000\r\u0003 2\u0014\u0005\u0002wk\u001f\u0000\u00038";
                    n = 6;
                    array = k;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0010>y\u0013\u000b\u0016%x\u0000\r\u0003 2\u0015\u0016\u00036i\u0013";
                    n = 7;
                    array = k;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0010>y\u0013\u000b\u0016%x\u0000\r\u0003 2\u0012\u0001\u0015#o\u0019\u001d";
                    n = 8;
                    array = k;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        K = k;
    }
    
    public VideoPreviewActivity() {
        this.v = 640;
        this.q = 3.0f;
        this.u = (ViewTreeObserver$OnGlobalLayoutListener)new pm(this);
    }
    
    private long a(final long n, final long n2) {
        final boolean i = App.I;
        final long n3 = n2 - n;
        long n4;
        if (n3 < 1000L) {
            n4 = 1000L;
        }
        else {
            n4 = n3;
        }
        long length = 0L;
        Label_0271: {
            if (n == 0L && n2 == this.m.e() && this.x.length() <= 1048576L * ym.k) {
                length = this.x.length();
                if (!i) {
                    break Label_0271;
                }
            }
            if (wm.b(this.x)) {
                if (!this.m.f() && wm.a(this.x)) {
                    length = n4 * this.x.length() / this.m.e();
                    if (!i) {
                        break Label_0271;
                    }
                }
                final int b = this.m.b();
                final int d = this.m.d();
                int v = 0;
                int v2 = 0;
                Label_0192: {
                    if (b >= d) {
                        v = this.v;
                        v2 = d * v / b;
                        if (!i) {
                            break Label_0192;
                        }
                    }
                    v2 = this.v;
                    v = b * v2 / d;
                }
                this.q = br.a(v, v2, n4);
                length = (long)(v2 * v * this.q * (n4 / 1000L) / 8.0f + 96000L * (n4 / 1000L) / 8L);
                if (!i) {
                    break Label_0271;
                }
            }
            length = n4 * this.x.length() / this.m.e();
        }
        this.C.setText((CharSequence)Formatter.formatShortFileSize((Context)this, length));
        this.E.setText((CharSequence)DateUtils.formatElapsedTime(n4 / 1000L));
        return length;
    }
    
    static long a(final VideoPreviewActivity videoPreviewActivity, final long f) {
        return videoPreviewActivity.F = f;
    }
    
    static long a(final VideoPreviewActivity videoPreviewActivity, final long n, final long n2) {
        return videoPreviewActivity.a(n, n2);
    }
    
    private void a() {
        final Intent intent = new Intent();
        intent.putExtra(VideoPreviewActivity.K[2], this.x.getAbsolutePath());
        this.setResult(1, intent);
        this.finish();
    }
    
    public static void a(final Activity activity, final a_9 a_9, final File file) {
        final Intent intent = new Intent((Context)activity, (Class)VideoPreviewActivity.class);
        intent.putExtra(VideoPreviewActivity.K[4], file.getAbsolutePath());
        String s = null;
        Label_0088: {
            if (a_9.m()) {
                s = activity.getString(2131231158, new Object[] { a_9.a((Context)activity) });
                if (!App.I) {
                    break Label_0088;
                }
            }
            s = activity.getString(2131231643, new Object[] { a_9.a((Context)activity) });
        }
        intent.putExtra(VideoPreviewActivity.K[3], s);
        activity.startActivityForResult(intent, 24);
    }
    
    static boolean a(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.k;
    }
    
    static boolean a(final VideoPreviewActivity videoPreviewActivity, final boolean k) {
        return videoPreviewActivity.k = k;
    }
    
    static long b(final VideoPreviewActivity videoPreviewActivity, final long o) {
        return videoPreviewActivity.o = o;
    }
    
    static u_ b(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.H;
    }
    
    static void b(final VideoPreviewActivity videoPreviewActivity, final boolean b) {
        videoPreviewActivity.b(b);
    }
    
    private void b(final boolean b) {
        if (b && this.D.getVisibility() != 0) {
            this.D.setVisibility(0);
            this.C.setVisibility(0);
            this.E.setVisibility(0);
            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ((Animation)alphaAnimation).setDuration(300L);
            this.D.startAnimation((Animation)alphaAnimation);
            this.C.startAnimation((Animation)alphaAnimation);
            this.E.startAnimation((Animation)alphaAnimation);
            if (!App.I) {
                return;
            }
        }
        if (!b && this.D.getVisibility() != 8) {
            this.D.setVisibility(8);
            this.C.setVisibility(8);
            this.E.setVisibility(8);
            final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            ((Animation)alphaAnimation2).setDuration(300L);
            this.D.startAnimation((Animation)alphaAnimation2);
            this.C.startAnimation((Animation)alphaAnimation2);
            this.E.startAnimation((Animation)alphaAnimation2);
        }
    }
    
    static VideoView c(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.I;
    }
    
    static boolean c(final VideoPreviewActivity videoPreviewActivity, final boolean b) {
        return videoPreviewActivity.B = b;
    }
    
    static ImageView d(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.D;
    }
    
    static l1 e(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.n;
    }
    
    static ConversationTextEntry f(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.z;
    }
    
    static long g(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.o;
    }
    
    static SeekBar h(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.w;
    }
    
    static ImageButton i(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.s;
    }
    
    static RangeSeekBar j(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.t;
    }
    
    static long k(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.F;
    }
    
    static boolean l(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.B;
    }
    
    static ak m(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.m;
    }
    
    static File n(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.x;
    }
    
    static View o(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.J;
    }
    
    static TextView p(final VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.r;
    }
    
    public Bitmap a(final long n) {
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        while (true) {
            try {
                mediaMetadataRetriever.setDataSource(this.x.getAbsolutePath());
                final Bitmap bitmap = mediaMetadataRetriever.getFrameAtTime(n);
                mediaMetadataRetriever.release();
                return bitmap;
            }
            catch (Exception ex) {
                Log.e(VideoPreviewActivity.K[1] + ex.toString());
                final Bitmap bitmap = br.b(this.x.getAbsolutePath());
                continue;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                Log.e(VideoPreviewActivity.K[0] + noSuchMethodError.toString());
                final Bitmap bitmap = br.b(this.x.getAbsolutePath());
                continue;
            }
            break;
        }
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/VideoPreviewActivity.K:[Ljava/lang/String;
        //     3: bipush          8
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //    14: aload_0        
        //    15: invokevirtual   com/whatsapp/VideoPreviewActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    18: iconst_1       
        //    19: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    22: aload_0        
        //    23: aload_0        
        //    24: invokevirtual   com/whatsapp/VideoPreviewActivity.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    27: ldc_w           2130903230
        //    30: aconst_null    
        //    31: iconst_0       
        //    32: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    35: putfield        com/whatsapp/VideoPreviewActivity.J:Landroid/view/View;
        //    38: aload_0        
        //    39: aload_0        
        //    40: getfield        com/whatsapp/VideoPreviewActivity.J:Landroid/view/View;
        //    43: invokevirtual   com/whatsapp/VideoPreviewActivity.setContentView:(Landroid/view/View;)V
        //    46: aload_0        
        //    47: new             Ljava/io/File;
        //    50: dup            
        //    51: aload_0        
        //    52: invokevirtual   com/whatsapp/VideoPreviewActivity.getIntent:()Landroid/content/Intent;
        //    55: getstatic       com/whatsapp/VideoPreviewActivity.K:[Ljava/lang/String;
        //    58: iconst_5       
        //    59: aaload         
        //    60: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    63: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    66: putfield        com/whatsapp/VideoPreviewActivity.x:Ljava/io/File;
        //    69: aload_0        
        //    70: invokevirtual   com/whatsapp/VideoPreviewActivity.getIntent:()Landroid/content/Intent;
        //    73: getstatic       com/whatsapp/VideoPreviewActivity.K:[Ljava/lang/String;
        //    76: bipush          6
        //    78: aaload         
        //    79: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    82: astore_2       
        //    83: aload_2        
        //    84: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    87: ifne            105
        //    90: aload_0        
        //    91: invokevirtual   com/whatsapp/VideoPreviewActivity.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    94: aload_2        
        //    95: aload_0        
        //    96: invokevirtual   com/whatsapp/VideoPreviewActivity.getBaseContext:()Landroid/content/Context;
        //    99: invokestatic    com/whatsapp/util/cq.c:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //   102: invokevirtual   android/support/v7/app/ActionBar.setTitle:(Ljava/lang/CharSequence;)V
        //   105: aload_0        
        //   106: new             Lcom/whatsapp/util/ak;
        //   109: dup            
        //   110: aload_0        
        //   111: getfield        com/whatsapp/VideoPreviewActivity.x:Ljava/io/File;
        //   114: invokespecial   com/whatsapp/util/ak.<init>:(Ljava/io/File;)V
        //   117: putfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   120: aload_0        
        //   121: aload_0        
        //   122: ldc_w           2131755393
        //   125: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   128: checkcast       Landroid/widget/ImageView;
        //   131: putfield        com/whatsapp/VideoPreviewActivity.G:Landroid/widget/ImageView;
        //   134: aload_0        
        //   135: aload_0        
        //   136: ldc_w           2131755793
        //   139: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   142: checkcast       Landroid/widget/TextView;
        //   145: putfield        com/whatsapp/VideoPreviewActivity.r:Landroid/widget/TextView;
        //   148: aload_0        
        //   149: aload_0        
        //   150: ldc_w           2131755794
        //   153: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   156: checkcast       Landroid/widget/TextView;
        //   159: putfield        com/whatsapp/VideoPreviewActivity.C:Landroid/widget/TextView;
        //   162: aload_0        
        //   163: aload_0        
        //   164: ldc_w           2131755477
        //   167: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   170: checkcast       Landroid/widget/TextView;
        //   173: putfield        com/whatsapp/VideoPreviewActivity.E:Landroid/widget/TextView;
        //   176: aload_0        
        //   177: lconst_0       
        //   178: putfield        com/whatsapp/VideoPreviewActivity.F:J
        //   181: aload_0        
        //   182: aload_0        
        //   183: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   186: invokevirtual   com/whatsapp/util/ak.e:()J
        //   189: putfield        com/whatsapp/VideoPreviewActivity.o:J
        //   192: aload_0        
        //   193: sipush          640
        //   196: aload_0        
        //   197: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   200: invokevirtual   com/whatsapp/util/ak.b:()I
        //   203: aload_0        
        //   204: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   207: invokevirtual   com/whatsapp/util/ak.d:()I
        //   210: invokestatic    java/lang/Math.max:(II)I
        //   213: invokestatic    java/lang/Math.min:(II)I
        //   216: putfield        com/whatsapp/VideoPreviewActivity.v:I
        //   219: aload_0        
        //   220: aload_0        
        //   221: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   224: invokevirtual   com/whatsapp/util/ak.e:()J
        //   227: putfield        com/whatsapp/VideoPreviewActivity.A:J
        //   230: aload_0        
        //   231: aload_0        
        //   232: getfield        com/whatsapp/VideoPreviewActivity.F:J
        //   235: aload_0        
        //   236: getfield        com/whatsapp/VideoPreviewActivity.o:J
        //   239: invokespecial   com/whatsapp/VideoPreviewActivity.a:(JJ)J
        //   242: lstore          5
        //   244: lload           5
        //   246: ldc2_w          1048576
        //   249: getstatic       com/whatsapp/ym.k:I
        //   252: i2l            
        //   253: lmul           
        //   254: lcmp           
        //   255: ifle            281
        //   258: aload_0        
        //   259: ldc2_w          1048576
        //   262: aload_0        
        //   263: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   266: invokevirtual   com/whatsapp/util/ak.e:()J
        //   269: getstatic       com/whatsapp/ym.k:I
        //   272: i2l            
        //   273: lmul           
        //   274: lmul           
        //   275: lload           5
        //   277: ldiv           
        //   278: putfield        com/whatsapp/VideoPreviewActivity.A:J
        //   281: aload_0        
        //   282: aload_0        
        //   283: ldc_w           2131755797
        //   286: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   289: checkcast       Landroid/widget/FrameLayout;
        //   292: putfield        com/whatsapp/VideoPreviewActivity.y:Landroid/widget/FrameLayout;
        //   295: lconst_0       
        //   296: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   299: astore          9
        //   301: aload_0        
        //   302: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   305: invokevirtual   com/whatsapp/util/ak.e:()J
        //   308: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   311: astore          10
        //   313: aload_0        
        //   314: getfield        com/whatsapp/VideoPreviewActivity.A:J
        //   317: aload_0        
        //   318: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   321: invokevirtual   com/whatsapp/util/ak.e:()J
        //   324: lcmp           
        //   325: ifge            978
        //   328: aload_0        
        //   329: getfield        com/whatsapp/VideoPreviewActivity.A:J
        //   332: lstore          11
        //   334: aload_0        
        //   335: new             Lcom/whatsapp/RangeSeekBar;
        //   338: dup            
        //   339: aload           9
        //   341: aload           10
        //   343: lload           11
        //   345: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   348: aload_0        
        //   349: invokespecial   com/whatsapp/RangeSeekBar.<init>:(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Landroid/content/Context;)V
        //   352: putfield        com/whatsapp/VideoPreviewActivity.t:Lcom/whatsapp/RangeSeekBar;
        //   355: aload_0        
        //   356: getfield        com/whatsapp/VideoPreviewActivity.A:J
        //   359: aload_0        
        //   360: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   363: invokevirtual   com/whatsapp/util/ak.e:()J
        //   366: lcmp           
        //   367: ifge            405
        //   370: aload_0        
        //   371: aload_0        
        //   372: getfield        com/whatsapp/VideoPreviewActivity.A:J
        //   375: putfield        com/whatsapp/VideoPreviewActivity.o:J
        //   378: aload_0        
        //   379: getfield        com/whatsapp/VideoPreviewActivity.t:Lcom/whatsapp/RangeSeekBar;
        //   382: aload_0        
        //   383: getfield        com/whatsapp/VideoPreviewActivity.o:J
        //   386: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   389: invokevirtual   com/whatsapp/RangeSeekBar.setSelectedMaxValue:(Ljava/lang/Number;)V
        //   392: aload_0        
        //   393: aload_0        
        //   394: getfield        com/whatsapp/VideoPreviewActivity.F:J
        //   397: aload_0        
        //   398: getfield        com/whatsapp/VideoPreviewActivity.o:J
        //   401: invokespecial   com/whatsapp/VideoPreviewActivity.a:(JJ)J
        //   404: pop2           
        //   405: aload_0        
        //   406: getfield        com/whatsapp/VideoPreviewActivity.t:Lcom/whatsapp/RangeSeekBar;
        //   409: ldc_w           72.0
        //   412: aload_0        
        //   413: invokevirtual   com/whatsapp/VideoPreviewActivity.getResources:()Landroid/content/res/Resources;
        //   416: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //   419: getfield        android/util/DisplayMetrics.density:F
        //   422: fmul           
        //   423: invokevirtual   com/whatsapp/RangeSeekBar.setSlowScrubStep:(F)V
        //   426: aload_0        
        //   427: getfield        com/whatsapp/VideoPreviewActivity.t:Lcom/whatsapp/RangeSeekBar;
        //   430: ldc_w           38.0
        //   433: aload_0        
        //   434: invokevirtual   com/whatsapp/VideoPreviewActivity.getResources:()Landroid/content/res/Resources;
        //   437: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //   440: getfield        android/util/DisplayMetrics.density:F
        //   443: fmul           
        //   444: f2i            
        //   445: invokevirtual   com/whatsapp/RangeSeekBar.setTopExtension:(I)V
        //   448: aload_0        
        //   449: getfield        com/whatsapp/VideoPreviewActivity.t:Lcom/whatsapp/RangeSeekBar;
        //   452: new             Lcom/whatsapp/t9;
        //   455: dup            
        //   456: aload_0        
        //   457: invokespecial   com/whatsapp/t9.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   460: invokevirtual   com/whatsapp/RangeSeekBar.setOnRangeSeekBarChangeListener:(Lcom/whatsapp/z4;)V
        //   463: aload_0        
        //   464: getfield        com/whatsapp/VideoPreviewActivity.t:Lcom/whatsapp/RangeSeekBar;
        //   467: iconst_1       
        //   468: invokevirtual   com/whatsapp/RangeSeekBar.setNotifyWhileDragging:(Z)V
        //   471: aload_0        
        //   472: getfield        com/whatsapp/VideoPreviewActivity.y:Landroid/widget/FrameLayout;
        //   475: aload_0        
        //   476: getfield        com/whatsapp/VideoPreviewActivity.t:Lcom/whatsapp/RangeSeekBar;
        //   479: invokevirtual   android/widget/FrameLayout.addView:(Landroid/view/View;)V
        //   482: aload_0        
        //   483: aload_0        
        //   484: ldc_w           2131755796
        //   487: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   490: checkcast       Landroid/widget/FrameLayout;
        //   493: putfield        com/whatsapp/VideoPreviewActivity.l:Landroid/widget/FrameLayout;
        //   496: aload_0        
        //   497: new             Lcom/whatsapp/VideoTimelineView;
        //   500: dup            
        //   501: aload_0        
        //   502: invokespecial   com/whatsapp/VideoTimelineView.<init>:(Landroid/content/Context;)V
        //   505: putfield        com/whatsapp/VideoPreviewActivity.p:Lcom/whatsapp/VideoTimelineView;
        //   508: aload_0        
        //   509: getfield        com/whatsapp/VideoPreviewActivity.p:Lcom/whatsapp/VideoTimelineView;
        //   512: aload_0        
        //   513: getfield        com/whatsapp/VideoPreviewActivity.x:Ljava/io/File;
        //   516: invokevirtual   com/whatsapp/VideoTimelineView.setVideoFile:(Ljava/io/File;)V
        //   519: aload_0        
        //   520: getfield        com/whatsapp/VideoPreviewActivity.l:Landroid/widget/FrameLayout;
        //   523: aload_0        
        //   524: getfield        com/whatsapp/VideoPreviewActivity.p:Lcom/whatsapp/VideoTimelineView;
        //   527: invokevirtual   android/widget/FrameLayout.addView:(Landroid/view/View;)V
        //   530: aload_0        
        //   531: ldc_w           2131755546
        //   534: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   537: checkcast       Landroid/widget/Button;
        //   540: astore          13
        //   542: aload           13
        //   544: ldc_w           2131231632
        //   547: invokevirtual   android/widget/Button.setText:(I)V
        //   550: aload           13
        //   552: new             Lcom/whatsapp/a65;
        //   555: dup            
        //   556: aload_0        
        //   557: invokespecial   com/whatsapp/a65.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   560: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   563: aload_0        
        //   564: ldc_w           2131755547
        //   567: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   570: checkcast       Landroid/widget/Button;
        //   573: new             Lcom/whatsapp/_h;
        //   576: dup            
        //   577: aload_0        
        //   578: invokespecial   com/whatsapp/_h.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   581: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   584: aload_0        
        //   585: aload_0        
        //   586: ldc_w           2131755329
        //   589: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   592: checkcast       Lcom/whatsapp/VideoView;
        //   595: putfield        com/whatsapp/VideoPreviewActivity.I:Lcom/whatsapp/VideoView;
        //   598: aload_0        
        //   599: ldc_w           2131755799
        //   602: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   605: iconst_0       
        //   606: invokevirtual   android/view/View.setVisibility:(I)V
        //   609: aload_0        
        //   610: getfield        com/whatsapp/VideoPreviewActivity.I:Lcom/whatsapp/VideoView;
        //   613: new             Lcom/whatsapp/cw;
        //   616: dup            
        //   617: aload_0        
        //   618: invokespecial   com/whatsapp/cw.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   621: invokevirtual   com/whatsapp/VideoView.setOnPreparedListener:(Landroid/media/MediaPlayer$OnPreparedListener;)V
        //   624: aload_0        
        //   625: getfield        com/whatsapp/VideoPreviewActivity.I:Lcom/whatsapp/VideoView;
        //   628: aload_0        
        //   629: getfield        com/whatsapp/VideoPreviewActivity.x:Ljava/io/File;
        //   632: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   635: invokevirtual   com/whatsapp/VideoView.setVideoPath:(Ljava/lang/String;)V
        //   638: aload_0        
        //   639: getfield        com/whatsapp/VideoPreviewActivity.I:Lcom/whatsapp/VideoView;
        //   642: invokevirtual   com/whatsapp/VideoView.requestFocus:()Z
        //   645: pop            
        //   646: aload_0        
        //   647: getfield        com/whatsapp/VideoPreviewActivity.I:Lcom/whatsapp/VideoView;
        //   650: iconst_1       
        //   651: invokevirtual   com/whatsapp/VideoView.seekTo:(I)V
        //   654: aload_0        
        //   655: new             Lcom/whatsapp/u_;
        //   658: dup            
        //   659: aload_0        
        //   660: invokespecial   com/whatsapp/u_.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   663: putfield        com/whatsapp/VideoPreviewActivity.H:Lcom/whatsapp/u_;
        //   666: aload_0        
        //   667: getfield        com/whatsapp/VideoPreviewActivity.H:Lcom/whatsapp/u_;
        //   670: iconst_4       
        //   671: invokevirtual   com/whatsapp/u_.setPriority:(I)V
        //   674: aload_0        
        //   675: getfield        com/whatsapp/VideoPreviewActivity.H:Lcom/whatsapp/u_;
        //   678: invokevirtual   com/whatsapp/u_.start:()V
        //   681: aload_0        
        //   682: getfield        com/whatsapp/VideoPreviewActivity.H:Lcom/whatsapp/u_;
        //   685: lconst_0       
        //   686: invokevirtual   com/whatsapp/u_.a:(J)V
        //   689: aload_0        
        //   690: aload_0        
        //   691: ldc_w           2131755333
        //   694: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   697: checkcast       Landroid/widget/SeekBar;
        //   700: putfield        com/whatsapp/VideoPreviewActivity.w:Landroid/widget/SeekBar;
        //   703: aload_0        
        //   704: getfield        com/whatsapp/VideoPreviewActivity.w:Landroid/widget/SeekBar;
        //   707: aload_0        
        //   708: getfield        com/whatsapp/VideoPreviewActivity.m:Lcom/whatsapp/util/ak;
        //   711: invokevirtual   com/whatsapp/util/ak.e:()J
        //   714: l2i            
        //   715: invokevirtual   android/widget/SeekBar.setMax:(I)V
        //   718: aload_0        
        //   719: getfield        com/whatsapp/VideoPreviewActivity.w:Landroid/widget/SeekBar;
        //   722: new             Lcom/whatsapp/g4;
        //   725: dup            
        //   726: aload_0        
        //   727: invokespecial   com/whatsapp/g4.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   730: invokevirtual   android/widget/SeekBar.setOnSeekBarChangeListener:(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
        //   733: aload_0        
        //   734: aload_0        
        //   735: ldc_w           2131755330
        //   738: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   741: checkcast       Landroid/widget/ImageView;
        //   744: putfield        com/whatsapp/VideoPreviewActivity.D:Landroid/widget/ImageView;
        //   747: new             Lcom/whatsapp/aos;
        //   750: dup            
        //   751: aload_0        
        //   752: invokespecial   com/whatsapp/aos.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   755: astore          15
        //   757: aload_0        
        //   758: ldc_w           2131755328
        //   761: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   764: aload           15
        //   766: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   769: aload_0        
        //   770: getfield        com/whatsapp/VideoPreviewActivity.D:Landroid/widget/ImageView;
        //   773: aload           15
        //   775: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   778: aload_0        
        //   779: aload_0        
        //   780: ldc_w           2131755446
        //   783: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   786: checkcast       Landroid/widget/ImageButton;
        //   789: putfield        com/whatsapp/VideoPreviewActivity.s:Landroid/widget/ImageButton;
        //   792: aload_0        
        //   793: getfield        com/whatsapp/VideoPreviewActivity.s:Landroid/widget/ImageButton;
        //   796: new             Lcom/whatsapp/ar1;
        //   799: dup            
        //   800: aload_0        
        //   801: invokespecial   com/whatsapp/ar1.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   804: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   807: aload_0        
        //   808: aload_0        
        //   809: ldc_w           2131755486
        //   812: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   815: checkcast       Lcom/whatsapp/ConversationTextEntry;
        //   818: putfield        com/whatsapp/VideoPreviewActivity.z:Lcom/whatsapp/ConversationTextEntry;
        //   821: aload_0        
        //   822: getfield        com/whatsapp/VideoPreviewActivity.z:Lcom/whatsapp/ConversationTextEntry;
        //   825: iconst_1       
        //   826: invokevirtual   com/whatsapp/ConversationTextEntry.setInputEnterDone:(Z)V
        //   829: aload_0        
        //   830: getfield        com/whatsapp/VideoPreviewActivity.z:Lcom/whatsapp/ConversationTextEntry;
        //   833: astore          16
        //   835: iconst_1       
        //   836: anewarray       Landroid/text/InputFilter;
        //   839: astore          17
        //   841: aload           17
        //   843: iconst_0       
        //   844: new             Lcom/whatsapp/aw8;
        //   847: dup            
        //   848: sipush          160
        //   851: invokespecial   com/whatsapp/aw8.<init>:(I)V
        //   854: aastore        
        //   855: aload           16
        //   857: aload           17
        //   859: invokevirtual   com/whatsapp/ConversationTextEntry.setFilters:([Landroid/text/InputFilter;)V
        //   862: aload_0        
        //   863: getfield        com/whatsapp/VideoPreviewActivity.z:Lcom/whatsapp/ConversationTextEntry;
        //   866: new             Lcom/whatsapp/xd;
        //   869: dup            
        //   870: aload_0        
        //   871: invokespecial   com/whatsapp/xd.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   874: invokevirtual   com/whatsapp/ConversationTextEntry.setOnEditorActionListener:(Landroid/widget/TextView$OnEditorActionListener;)V
        //   877: aload_0        
        //   878: ldc_w           2131755648
        //   881: invokevirtual   com/whatsapp/VideoPreviewActivity.findViewById:(I)Landroid/view/View;
        //   884: checkcast       Landroid/widget/TextView;
        //   887: astore          18
        //   889: aload_0        
        //   890: getfield        com/whatsapp/VideoPreviewActivity.z:Lcom/whatsapp/ConversationTextEntry;
        //   893: new             Lcom/whatsapp/aaz;
        //   896: dup            
        //   897: aload_0        
        //   898: aload           18
        //   900: invokespecial   com/whatsapp/aaz.<init>:(Lcom/whatsapp/VideoPreviewActivity;Landroid/widget/TextView;)V
        //   903: invokevirtual   com/whatsapp/ConversationTextEntry.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   906: aload_0        
        //   907: new             Lcom/whatsapp/lx;
        //   910: dup            
        //   911: aload_0        
        //   912: aload_0        
        //   913: invokespecial   com/whatsapp/lx.<init>:(Lcom/whatsapp/VideoPreviewActivity;Landroid/app/Activity;)V
        //   916: putfield        com/whatsapp/VideoPreviewActivity.n:Lcom/whatsapp/l1;
        //   919: aload_0        
        //   920: getfield        com/whatsapp/VideoPreviewActivity.n:Lcom/whatsapp/l1;
        //   923: new             Lcom/whatsapp/a_0;
        //   926: dup            
        //   927: aload_0        
        //   928: invokespecial   com/whatsapp/a_0.<init>:(Lcom/whatsapp/VideoPreviewActivity;)V
        //   931: invokevirtual   com/whatsapp/l1.a:(Lcom/whatsapp/eu;)V
        //   934: aload_0        
        //   935: getfield        com/whatsapp/VideoPreviewActivity.J:Landroid/view/View;
        //   938: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //   941: aload_0        
        //   942: getfield        com/whatsapp/VideoPreviewActivity.u:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
        //   945: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //   948: return         
        //   949: astore_3       
        //   950: aload_3        
        //   951: athrow         
        //   952: astore          4
        //   954: getstatic       com/whatsapp/VideoPreviewActivity.K:[Ljava/lang/String;
        //   957: bipush          7
        //   959: aaload         
        //   960: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   963: aload_0        
        //   964: invokespecial   com/whatsapp/VideoPreviewActivity.a:()V
        //   967: return         
        //   968: astore          7
        //   970: aload           7
        //   972: athrow         
        //   973: astore          8
        //   975: aload           8
        //   977: athrow         
        //   978: lconst_0       
        //   979: lstore          11
        //   981: goto            334
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                  
        //  -----  -----  -----  -----  ----------------------
        //  83     105    949    952    Lcom/whatsapp/util/ag;
        //  105    120    952    968    Lcom/whatsapp/util/ag;
        //  244    281    968    973    Lcom/whatsapp/util/ag;
        //  281    334    973    978    Lcom/whatsapp/util/ag;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 459, Size: 459
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
        Log.i(VideoPreviewActivity.K[9]);
        super.onDestroy();
        if (this.H != null) {
            this.H.interrupt();
            this.H = null;
        }
        if (this.J != null) {
            this.J.getViewTreeObserver().removeGlobalOnLayoutListener(this.u);
        }
    }
}
