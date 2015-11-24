// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import com.whatsapp.eu;
import android.app.Activity;
import android.text.TextWatcher;
import android.widget.TextView$OnEditorActionListener;
import com.whatsapp.aw8;
import android.text.InputFilter;
import android.view.View$OnTouchListener;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import com.whatsapp.util.cq;
import com.whatsapp.alm;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.whatsapp.ym;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.Main;
import android.os.Bundle;
import com.whatsapp.util.av;
import java.io.IOException;
import com.whatsapp.App;
import android.content.Intent$ShortcutIconResource;
import android.os.Parcelable;
import android.content.Intent;
import com.whatsapp.VideoView;
import android.hardware.Camera;
import android.os.Build$VERSION;
import java.util.List;
import android.content.Context;
import com.whatsapp.util.br;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import com.whatsapp.util.Log;
import android.view.ViewGroup;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.a_9;
import android.widget.ImageButton;
import com.whatsapp.ConversationTextEntry;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import android.widget.ProgressBar;
import com.whatsapp.l1;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Handler;
import android.view.View;
import com.whatsapp.PhotoView;
import com.whatsapp.DialogToastActivity;

public class CameraActivity extends DialogToastActivity
{
    private static final String[] P;
    public static boolean m;
    private PhotoView A;
    private View B;
    private Handler C;
    private ViewTreeObserver$OnGlobalLayoutListener D;
    private l1 E;
    private ProgressBar F;
    private File G;
    private long H;
    private CameraView I;
    private TextView J;
    private ZoomOverlay K;
    private ImageView L;
    private boolean M;
    private int N;
    private ConversationTextEntry O;
    private ImageButton k;
    private ImageButton l;
    private TextView n;
    private AutofocusOverlay o;
    private View p;
    private a_9 q;
    private Uri r;
    private View s;
    private File t;
    private ShutterOverlay u;
    private View v;
    private Rect w;
    private ViewGroup x;
    private View y;
    private View z;
    
    static {
        final String[] p = new String[38];
        String s = "\u0012N\u000eA\u001f\u001aDDZ\u001e\u0007E\u0004G^\u0016X\u001eA\u0011]S\u0002\\\u0002\u0007C\u001fG^:c%}/!e9|%!c/";
        int n = -1;
        String[] array = p;
        int n2 = 0;
        String intern = null;
    Label_0982:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = 's';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = 'j';
                        break;
                    }
                    case 3: {
                        c2 = '3';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0012N\u000eA\u001f\u001aDDZ\u001e\u0007E\u0004G^\u0016X\u001eA\u0011]S\u0002\\\u0002\u0007C\u001fG^=a'v";
                    n2 = 1;
                    array = p;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0012N\u000eA\u001f\u001aDDZ\u001e\u0007E\u0004G^\u0016X\u001eA\u0011]S\u0002\\\u0002\u0007C\u001fG^:n>v>'";
                    n2 = 2;
                    array = p;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000E\u001eF\u0000\u0003H\u0005G\u001f\u0003R\u000fE\u0019\u0016W";
                    n2 = 3;
                    array = p;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = p;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000E\u001eF\u0000\u0003R\u000fE\u0019\u0016WD]\u0005\u001fL\bZ\u0004\u001eA\u001a";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000E\u001eF\u0000\u0003R\u000fE\u0019\u0016W";
                    n = 4;
                    array = p;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0015L\u0003C]\u001b";
                    n = 5;
                    array = p;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0001E\tG";
                    n = 6;
                    array = p;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000E\u001eF\u0000\u0003R\u000fE\u0019\u0016W";
                    n = 7;
                    array = p;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0015L\u0003C]\u001b";
                    n = 8;
                    array = p;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000E\u001eF\u0000\u0003R\u000fE\u0019\u0016WD]\u0005\u001fL\bZ\u0004\u001eA\u001a";
                    n = 9;
                    array = p;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0010A\u0007V\u0002\u0012";
                    n = 10;
                    array = p;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0005I\u000eV\u001f\u0003R\u000fE\u0019\u0016WET\u0015\u0007V\u0003W\u0015\u001cT\u0002F\u001d\u0011";
                    n = 11;
                    array = p;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000E\u001eF\u0000\u0005I\u000eV\u001f\u0003R\u000fE\u0019\u0016W";
                    n = 12;
                    array = p;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0005I\u000eV\u001f\u0003R\u000fE\u0019\u0016WET\u0015\u0007V\u0003W\u0015\u001cT\u0002F\u001d\u0011";
                    n = 13;
                    array = p;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000T\u0005C\u0006\u001aD\u000f\\\u0013\u0012P\u001eF\u0002\u0016\u0000";
                    n = 14;
                    array = p;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0012N\u000eA\u001f\u001aDDZ\u001e\u0007E\u0004G^\u0016X\u001eA\u0011]s>a52m";
                    n = 15;
                    array = p;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000T\u0005C\u0006\u001aD\u000f\\\u0013\u0012P\u001eF\u0002\u0016\u0000";
                    n = 16;
                    array = p;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0005I\bA\u0011\u0007O\u0018";
                    n = 17;
                    array = p;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0000K\u0003C/\u0003R\u000fE\u0019\u0016W";
                    n = 18;
                    array = p;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000T\u0005C\u0006\u001aD\u000f\\\u0013\u0012P\u001eF\u0002\u0016";
                    n = 19;
                    array = p;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u001bA\u001aG\u0019\u0010\u007f\fV\u0015\u0017B\u000bP\u001b,E\u0004R\u0012\u001fE\u000e";
                    n = 20;
                    array = p;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0005I\u000eV\u001f\\\n";
                    n = 21;
                    array = p;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "=OJ@\u0000\u0012C\u000f";
                    n = 22;
                    array = p;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0017E\u0019G\u0002\u001cY";
                    n = 23;
                    array = p;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0010R\u000fR\u0004\u0016";
                    n = 24;
                    array = p;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0010R\u000fR\u0004\u0016\u000f\u0004\\]\u001eEG\\\u0002^M\u0019T\u0003\u0007O\u0018V]\u0017B";
                    n = 25;
                    array = p;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0003R\u000fE\u0019\u0016W";
                    n = 26;
                    array = p;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0012B\u0005A\u0004\u001aN\r\u0013\u0014\u0006EJG\u001fSN\u000bG\u0019\u0005EJ_\u0019\u0011R\u000bA\u0019\u0016SJ^\u0019\u0000S\u0003]\u0017";
                    n = 27;
                    array = p;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0012N\u000eA\u001f\u001aDDZ\u001e\u0007E\u0004G^\u0012C\u001eZ\u001f\u001d\u000e)a52t/l#;o8g3&t";
                    n = 28;
                    array = p;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJP\u0011O\u001f]\u0013\u0016\u0000\u001e\\P\u001eA\u0003]";
                    n = 29;
                    array = p;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u0019I\u000e";
                    n = 30;
                    array = p;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    s = "\u001cF\f";
                    n = 31;
                    n2 = 32;
                    array = p;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    array = p;
                    s = "\u001cN";
                    n = 32;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0001E\u0019G\u0011\u0001T";
                    n = 33;
                    array = p;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0007A\u0001V\u0011\u001dD\u0019V\u001e\u0017P\u0003P\u0004\u0006R\u000f";
                    n = 34;
                    array = p;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "]M\u001a\u0007";
                    n = 35;
                    array = p;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0010A\u0007V\u0002\u0012A\tG\u0019\u0005I\u001eJ_\u0000T\u000bA\u0004\u0005I\u000eV\u001f\u0010A\u001aG\u0005\u0001E";
                    n = 36;
                    array = p;
                    continue;
                }
                case 36: {
                    break Label_0982;
                }
            }
        }
        array[n2] = intern;
        P = p;
    }
    
    public CameraActivity() {
        this.M = true;
        this.C = new u(this);
        this.D = (ViewTreeObserver$OnGlobalLayoutListener)new j(this);
    }
    
    static int a(final CameraActivity cameraActivity, final int n) {
        return cameraActivity.N = n;
    }
    
    static ZoomOverlay a(final CameraActivity cameraActivity) {
        return cameraActivity.K;
    }
    
    private void a() {
        Log.i(CameraActivity.P[35]);
        this.L.setEnabled(false);
        this.B.setEnabled(false);
        this.l.setEnabled(false);
        this.I.a(new a(this));
    }
    
    private void a(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //     3: iconst_3       
        //     4: aaload         
        //     5: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: getfield        com/whatsapp/camera/CameraActivity.q:Lcom/whatsapp/a_9;
        //    12: ifnonnull       24
        //    15: aload_0        
        //    16: getfield        com/whatsapp/camera/CameraActivity.n:Landroid/widget/TextView;
        //    19: ldc             2131230867
        //    21: invokevirtual   android/widget/TextView.setText:(I)V
        //    24: aload_0        
        //    25: aload_1        
        //    26: putfield        com/whatsapp/camera/CameraActivity.r:Landroid/net/Uri;
        //    29: aload_0        
        //    30: new             Ljava/io/File;
        //    33: dup            
        //    34: aload_1        
        //    35: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    38: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    41: putfield        com/whatsapp/camera/CameraActivity.t:Ljava/io/File;
        //    44: aload_1        
        //    45: invokestatic    com/whatsapp/util/br.g:(Landroid/net/Uri;)Landroid/graphics/Bitmap;
        //    48: astore          6
        //    50: aload           6
        //    52: astore          4
        //    54: aload           4
        //    56: ifnonnull       78
        //    59: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //    62: iconst_4       
        //    63: aaload         
        //    64: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    67: aload_0        
        //    68: ldc             2131230866
        //    70: iconst_1       
        //    71: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    74: aload_0        
        //    75: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //    78: aload_0        
        //    79: getfield        com/whatsapp/camera/CameraActivity.x:Landroid/view/ViewGroup;
        //    82: aload_0        
        //    83: getfield        com/whatsapp/camera/CameraActivity.I:Lcom/whatsapp/camera/CameraView;
        //    86: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //    89: aload_0        
        //    90: getfield        com/whatsapp/camera/CameraActivity.s:Landroid/view/View;
        //    93: iconst_0       
        //    94: invokevirtual   android/view/View.setVisibility:(I)V
        //    97: aload_0        
        //    98: getfield        com/whatsapp/camera/CameraActivity.p:Landroid/view/View;
        //   101: iconst_0       
        //   102: invokevirtual   android/view/View.setVisibility:(I)V
        //   105: aload_0        
        //   106: getfield        com/whatsapp/camera/CameraActivity.z:Landroid/view/View;
        //   109: iconst_0       
        //   110: invokevirtual   android/view/View.setVisibility:(I)V
        //   113: aload_0        
        //   114: getfield        com/whatsapp/camera/CameraActivity.v:Landroid/view/View;
        //   117: bipush          8
        //   119: invokevirtual   android/view/View.setVisibility:(I)V
        //   122: aload_0        
        //   123: ldc_w           2131755328
        //   126: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   129: bipush          8
        //   131: invokevirtual   android/view/View.setVisibility:(I)V
        //   134: aload_0        
        //   135: getfield        com/whatsapp/camera/CameraActivity.A:Lcom/whatsapp/PhotoView;
        //   138: iconst_0       
        //   139: invokevirtual   com/whatsapp/PhotoView.setVisibility:(I)V
        //   142: aload_0        
        //   143: getfield        com/whatsapp/camera/CameraActivity.A:Lcom/whatsapp/PhotoView;
        //   146: iconst_1       
        //   147: invokevirtual   com/whatsapp/PhotoView.a:(Z)V
        //   150: aload_0        
        //   151: getfield        com/whatsapp/camera/CameraActivity.A:Lcom/whatsapp/PhotoView;
        //   154: aload           4
        //   156: invokevirtual   com/whatsapp/PhotoView.a:(Landroid/graphics/Bitmap;)V
        //   159: aload_0        
        //   160: getfield        com/whatsapp/camera/CameraActivity.p:Landroid/view/View;
        //   163: new             Lcom/whatsapp/camera/aw;
        //   166: dup            
        //   167: aload_0        
        //   168: aload_1        
        //   169: invokespecial   com/whatsapp/camera/aw.<init>:(Lcom/whatsapp/camera/CameraActivity;Landroid/net/Uri;)V
        //   172: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   175: aload_0        
        //   176: getfield        com/whatsapp/camera/CameraActivity.z:Landroid/view/View;
        //   179: new             Lcom/whatsapp/camera/n;
        //   182: dup            
        //   183: aload_0        
        //   184: invokespecial   com/whatsapp/camera/n.<init>:(Lcom/whatsapp/camera/CameraActivity;)V
        //   187: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   190: aload_0        
        //   191: ldc_w           2131755337
        //   194: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   197: new             Lcom/whatsapp/camera/a6;
        //   200: dup            
        //   201: aload_0        
        //   202: aload_1        
        //   203: invokespecial   com/whatsapp/camera/a6.<init>:(Lcom/whatsapp/camera/CameraActivity;Landroid/net/Uri;)V
        //   206: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   209: aload_0        
        //   210: ldc_w           2131755303
        //   213: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   216: new             Lcom/whatsapp/camera/a_;
        //   219: dup            
        //   220: aload_0        
        //   221: invokespecial   com/whatsapp/camera/a_.<init>:(Lcom/whatsapp/camera/CameraActivity;)V
        //   224: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   227: return         
        //   228: astore_2       
        //   229: aload_2        
        //   230: athrow         
        //   231: astore_3       
        //   232: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   235: iconst_5       
        //   236: aaload         
        //   237: aload_3        
        //   238: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   241: aload_0        
        //   242: ldc             2131230866
        //   244: iconst_1       
        //   245: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   248: aload_0        
        //   249: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //   252: aconst_null    
        //   253: astore          4
        //   255: goto            54
        //   258: astore          5
        //   260: aload           5
        //   262: athrow         
        //   263: astore_3       
        //   264: goto            232
        //   267: astore_3       
        //   268: goto            232
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      24     228    231    Ljava/lang/OutOfMemoryError;
        //  44     50     231    232    Ljava/lang/OutOfMemoryError;
        //  44     50     263    267    Ljava/io/IOException;
        //  44     50     267    271    Lcom/whatsapp/util/av;
        //  59     78     258    263    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 134, Size: 134
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
    
    static void a(final CameraActivity cameraActivity, final Uri uri) {
        cameraActivity.a(uri);
    }
    
    static void a(final CameraActivity cameraActivity, final String s) {
        cameraActivity.a(s);
    }
    
    static void a(final CameraActivity cameraActivity, final boolean b) {
        cameraActivity.b(b);
    }
    
    static void a(final CameraActivity cameraActivity, final boolean b, final View view) {
        cameraActivity.a(b, view);
    }
    
    private void a(final String s) {
        final boolean m = CameraActivity.m;
        if (CameraActivity.P[32].equals(s)) {
            this.l.setImageResource(2130837635);
            if (!m) {
                return;
            }
        }
        if (CameraActivity.P[33].equals(s)) {
            this.l.setImageResource(2130837636);
            if (!m) {
                return;
            }
        }
        this.l.setImageResource(2130837634);
    }
    
    private void a(final boolean b, final View view) {
        if (b && view.getVisibility() != 0) {
            view.setVisibility(0);
            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ((Animation)alphaAnimation).setDuration(300L);
            view.startAnimation((Animation)alphaAnimation);
            if (!CameraActivity.m) {
                return;
            }
        }
        if (!b && view.getVisibility() != 8) {
            view.setVisibility(8);
            final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            ((Animation)alphaAnimation2).setDuration(300L);
            view.startAnimation((Animation)alphaAnimation2);
        }
    }
    
    private void b() {
        final boolean m = CameraActivity.m;
        Log.i(CameraActivity.P[37]);
        this.G = br.a((Context)this, (byte)3, CameraActivity.P[36]);
        final int orientation = this.getWindowManager().getDefaultDisplay().getOrientation();
        Label_0209: {
            switch (this.getResources().getConfiguration().orientation) {
                case 1: {
                    if (orientation == 0 || orientation == 1) {
                        this.setRequestedOrientation(1);
                        if (!m) {
                            break;
                        }
                    }
                    this.setRequestedOrientation(9);
                    if (m) {
                        break Label_0209;
                    }
                    break;
                }
                case 2: {
                    if (orientation == 0 || orientation == 1) {
                        this.setRequestedOrientation(0);
                        if (!m) {
                            break;
                        }
                    }
                    this.setRequestedOrientation(8);
                    break;
                }
            }
        }
        this.I.setKeepScreenOn(true);
        this.I.a(this.G);
        this.C.sendEmptyMessage(0);
        this.J.setVisibility(0);
        this.F.setVisibility(0);
        if (!this.M) {
            this.y.setVisibility(0);
        }
        this.B.setVisibility(8);
        this.l.setVisibility(8);
        this.H = System.currentTimeMillis();
        if (this.M && this.q == null) {
            this.n.setText((CharSequence)"");
        }
    }
    
    static void b(final CameraActivity cameraActivity) {
        cameraActivity.g();
    }
    
    private void b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.m:Z
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //    14: bipush          17
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: iload_1        
        //    21: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    24: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    27: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    30: aload_0        
        //    31: getfield        com/whatsapp/camera/CameraActivity.I:Lcom/whatsapp/camera/CameraView;
        //    34: invokevirtual   com/whatsapp/camera/CameraView.i:()V
        //    37: aload_0        
        //    38: iconst_m1      
        //    39: invokevirtual   com/whatsapp/camera/CameraActivity.setRequestedOrientation:(I)V
        //    42: aload_0        
        //    43: invokevirtual   com/whatsapp/camera/CameraActivity.getContentResolver:()Landroid/content/ContentResolver;
        //    46: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //    49: bipush          21
        //    51: aaload         
        //    52: invokestatic    android/provider/Settings$System.getInt:(Landroid/content/ContentResolver;Ljava/lang/String;)I
        //    55: ifeq            77
        //    58: aload_0        
        //    59: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //    62: bipush          18
        //    64: aaload         
        //    65: invokevirtual   com/whatsapp/camera/CameraActivity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    68: checkcast       Landroid/os/Vibrator;
        //    71: ldc2_w          75
        //    74: invokevirtual   android/os/Vibrator.vibrate:(J)V
        //    77: iload_1        
        //    78: ifeq            233
        //    81: aload_0        
        //    82: getfield        com/whatsapp/camera/CameraActivity.M:Z
        //    85: istore          10
        //    87: iload           10
        //    89: ifeq            100
        //    92: aload_0        
        //    93: invokespecial   com/whatsapp/camera/CameraActivity.f:()V
        //    96: iload_2        
        //    97: ifeq            245
        //   100: aload_0        
        //   101: getfield        com/whatsapp/camera/CameraActivity.q:Lcom/whatsapp/a_9;
        //   104: astore          11
        //   106: aload           11
        //   108: ifnull          148
        //   111: aload_0        
        //   112: aload_0        
        //   113: getfield        com/whatsapp/camera/CameraActivity.q:Lcom/whatsapp/a_9;
        //   116: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   119: aload_0        
        //   120: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   123: iconst_3       
        //   124: iconst_0       
        //   125: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;BZ)Z
        //   128: pop            
        //   129: aload_0        
        //   130: aload_0        
        //   131: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   134: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   137: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //   140: aload_0        
        //   141: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //   144: iload_2        
        //   145: ifeq            245
        //   148: new             Landroid/content/Intent;
        //   151: dup            
        //   152: aload_0        
        //   153: invokevirtual   com/whatsapp/camera/CameraActivity.getBaseContext:()Landroid/content/Context;
        //   156: ldc_w           Lcom/whatsapp/ContactPicker;.class
        //   159: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   162: astore          12
        //   164: aload           12
        //   166: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   169: bipush          22
        //   171: aaload         
        //   172: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   175: pop            
        //   176: aload           12
        //   178: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   181: bipush          16
        //   183: aaload         
        //   184: aload_0        
        //   185: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   188: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   191: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   194: pop            
        //   195: aload           12
        //   197: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   200: bipush          19
        //   202: aaload         
        //   203: iconst_1       
        //   204: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   207: pop            
        //   208: aload_0        
        //   209: aload           12
        //   211: invokevirtual   com/whatsapp/camera/CameraActivity.startActivity:(Landroid/content/Intent;)V
        //   214: aload_0        
        //   215: aload_0        
        //   216: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   219: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   222: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //   225: aload_0        
        //   226: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //   229: iload_2        
        //   230: ifeq            245
        //   233: aload_0        
        //   234: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   237: invokevirtual   java/io/File.delete:()Z
        //   240: pop            
        //   241: aload_0        
        //   242: invokevirtual   com/whatsapp/camera/CameraActivity.finish:()V
        //   245: return         
        //   246: astore_3       
        //   247: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   250: bipush          20
        //   252: aaload         
        //   253: aload_3        
        //   254: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   257: goto            77
        //   260: astore          6
        //   262: aload           6
        //   264: athrow         
        //   265: astore          7
        //   267: aload           7
        //   269: athrow         
        //   270: astore          8
        //   272: aload           8
        //   274: athrow         
        //   275: astore          9
        //   277: aload           9
        //   279: athrow         
        //   280: astore          16
        //   282: aload           16
        //   284: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   287: astore          20
        //   289: aload           20
        //   291: ifnull          330
        //   294: aload           16
        //   296: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   299: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   302: bipush          23
        //   304: aaload         
        //   305: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   308: istore          21
        //   310: iload           21
        //   312: ifeq            330
        //   315: aload_0        
        //   316: aload_0        
        //   317: ldc_w           2131231078
        //   320: invokevirtual   com/whatsapp/camera/CameraActivity.getString:(I)Ljava/lang/String;
        //   323: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/gu;Ljava/lang/String;)V
        //   326: iload_2        
        //   327: ifeq            341
        //   330: aload_0        
        //   331: invokevirtual   com/whatsapp/camera/CameraActivity.getBaseContext:()Landroid/content/Context;
        //   334: ldc_w           2131231735
        //   337: iconst_0       
        //   338: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   341: new             Ljava/lang/StringBuilder;
        //   344: dup            
        //   345: invokespecial   java/lang/StringBuilder.<init>:()V
        //   348: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   351: bipush          15
        //   353: aaload         
        //   354: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   357: aload           16
        //   359: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   365: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   368: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   371: goto            129
        //   374: astore          17
        //   376: aload           17
        //   378: athrow         
        //   379: astore          18
        //   381: aload           18
        //   383: athrow         
        //   384: astore          19
        //   386: aload           19
        //   388: athrow         
        //   389: astore          4
        //   391: aload           4
        //   393: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                
        //  -----  -----  -----  -----  ----------------------------------------------------
        //  42     77     246    260    Landroid/provider/Settings$SettingNotFoundException;
        //  81     87     260    265    Landroid/provider/Settings$SettingNotFoundException;
        //  92     96     265    270    Landroid/provider/Settings$SettingNotFoundException;
        //  100    106    270    275    Landroid/provider/Settings$SettingNotFoundException;
        //  111    129    280    389    Ljava/io/IOException;
        //  111    129    275    280    Landroid/provider/Settings$SettingNotFoundException;
        //  164    229    389    394    Landroid/provider/Settings$SettingNotFoundException;
        //  233    245    389    394    Landroid/provider/Settings$SettingNotFoundException;
        //  262    265    265    270    Landroid/provider/Settings$SettingNotFoundException;
        //  267    270    270    275    Landroid/provider/Settings$SettingNotFoundException;
        //  272    275    275    280    Landroid/provider/Settings$SettingNotFoundException;
        //  282    289    374    379    Landroid/provider/Settings$SettingNotFoundException;
        //  294    310    379    384    Landroid/provider/Settings$SettingNotFoundException;
        //  315    326    384    389    Landroid/provider/Settings$SettingNotFoundException;
        //  330    341    384    389    Landroid/provider/Settings$SettingNotFoundException;
        //  376    379    379    384    Landroid/provider/Settings$SettingNotFoundException;
        //  381    384    384    389    Landroid/provider/Settings$SettingNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    static void c(final CameraActivity cameraActivity) {
        cameraActivity.b();
    }
    
    static PhotoView d(final CameraActivity cameraActivity) {
        return cameraActivity.A;
    }
    
    static ShutterOverlay e(final CameraActivity cameraActivity) {
        return cameraActivity.u;
    }
    
    private void e() {
        final List e = this.I.e();
        if (e == null || e.size() <= 1) {
            this.l.setVisibility(8);
            if (!CameraActivity.m) {
                return;
            }
        }
        this.l.setVisibility(0);
        this.a(this.I.j());
    }
    
    private void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //     3: bipush          13
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: getfield        com/whatsapp/camera/CameraActivity.q:Lcom/whatsapp/a_9;
        //    13: ifnonnull       26
        //    16: aload_0        
        //    17: getfield        com/whatsapp/camera/CameraActivity.n:Landroid/widget/TextView;
        //    20: ldc_w           2131230870
        //    23: invokevirtual   android/widget/TextView.setText:(I)V
        //    26: aload_0        
        //    27: getfield        com/whatsapp/camera/CameraActivity.x:Landroid/view/ViewGroup;
        //    30: aload_0        
        //    31: getfield        com/whatsapp/camera/CameraActivity.I:Lcom/whatsapp/camera/CameraView;
        //    34: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //    37: aload_0        
        //    38: getfield        com/whatsapp/camera/CameraActivity.v:Landroid/view/View;
        //    41: bipush          8
        //    43: invokevirtual   android/view/View.setVisibility:(I)V
        //    46: aload_0        
        //    47: getfield        com/whatsapp/camera/CameraActivity.s:Landroid/view/View;
        //    50: iconst_0       
        //    51: invokevirtual   android/view/View.setVisibility:(I)V
        //    54: aload_0        
        //    55: getfield        com/whatsapp/camera/CameraActivity.p:Landroid/view/View;
        //    58: bipush          8
        //    60: invokevirtual   android/view/View.setVisibility:(I)V
        //    63: aload_0        
        //    64: getfield        com/whatsapp/camera/CameraActivity.z:Landroid/view/View;
        //    67: bipush          8
        //    69: invokevirtual   android/view/View.setVisibility:(I)V
        //    72: aload_0        
        //    73: getfield        com/whatsapp/camera/CameraActivity.A:Lcom/whatsapp/PhotoView;
        //    76: bipush          8
        //    78: invokevirtual   com/whatsapp/PhotoView.setVisibility:(I)V
        //    81: aload_0        
        //    82: ldc_w           2131755328
        //    85: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //    88: astore_2       
        //    89: aload_2        
        //    90: iconst_0       
        //    91: invokevirtual   android/view/View.setVisibility:(I)V
        //    94: aload_0        
        //    95: ldc_w           2131755329
        //    98: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   101: checkcast       Lcom/whatsapp/VideoView;
        //   104: astore_3       
        //   105: aload_3        
        //   106: iconst_0       
        //   107: invokevirtual   com/whatsapp/VideoView.setVisibility:(I)V
        //   110: aload_3        
        //   111: aload_0        
        //   112: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   115: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   118: invokevirtual   com/whatsapp/VideoView.setVideoPath:(Ljava/lang/String;)V
        //   121: aload_3        
        //   122: invokevirtual   com/whatsapp/VideoView.requestFocus:()Z
        //   125: pop            
        //   126: aload_3        
        //   127: iconst_1       
        //   128: invokevirtual   com/whatsapp/VideoView.seekTo:(I)V
        //   131: invokestatic    java/lang/System.currentTimeMillis:()J
        //   134: aload_0        
        //   135: getfield        com/whatsapp/camera/CameraActivity.H:J
        //   138: lsub           
        //   139: lstore          5
        //   141: new             Landroid/media/MediaMetadataRetriever;
        //   144: dup            
        //   145: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //   148: astore          7
        //   150: aload           7
        //   152: aload_0        
        //   153: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   156: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   159: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/lang/String;)V
        //   162: aload           7
        //   164: bipush          9
        //   166: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   169: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   172: lstore          5
        //   174: aload           7
        //   176: lconst_0       
        //   177: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:(J)Landroid/graphics/Bitmap;
        //   180: astore          19
        //   182: aload           19
        //   184: astore          9
        //   186: lload           5
        //   188: lstore          10
        //   190: aload           9
        //   192: ifnull          212
        //   195: aload_3        
        //   196: new             Landroid/graphics/drawable/BitmapDrawable;
        //   199: dup            
        //   200: aload_0        
        //   201: invokevirtual   com/whatsapp/camera/CameraActivity.getResources:()Landroid/content/res/Resources;
        //   204: aload           9
        //   206: invokespecial   android/graphics/drawable/BitmapDrawable.<init>:(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
        //   209: invokevirtual   com/whatsapp/VideoView.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   212: aload           7
        //   214: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   217: aload_0        
        //   218: ldc_w           2131755330
        //   221: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   224: astore          12
        //   226: aload_0        
        //   227: ldc_w           2131755337
        //   230: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   233: new             Lcom/whatsapp/camera/as;
        //   236: dup            
        //   237: aload_0        
        //   238: invokespecial   com/whatsapp/camera/as.<init>:(Lcom/whatsapp/camera/CameraActivity;)V
        //   241: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   244: aload_0        
        //   245: ldc_w           2131755303
        //   248: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   251: new             Lcom/whatsapp/camera/ah;
        //   254: dup            
        //   255: aload_0        
        //   256: invokespecial   com/whatsapp/camera/ah.<init>:(Lcom/whatsapp/camera/CameraActivity;)V
        //   259: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   262: aload_0        
        //   263: ldc_w           2131755333
        //   266: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   269: checkcast       Landroid/widget/SeekBar;
        //   272: astore          13
        //   274: aload           13
        //   276: iconst_0       
        //   277: invokevirtual   android/widget/SeekBar.setProgress:(I)V
        //   280: aload           13
        //   282: lload           10
        //   284: l2i            
        //   285: invokevirtual   android/widget/SeekBar.setMax:(I)V
        //   288: aload           13
        //   290: iconst_0       
        //   291: invokevirtual   android/widget/SeekBar.setVisibility:(I)V
        //   294: aload_0        
        //   295: ldc_w           2131755332
        //   298: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   301: checkcast       Landroid/widget/TextView;
        //   304: astore          14
        //   306: aload_0        
        //   307: ldc_w           2131755334
        //   310: invokevirtual   com/whatsapp/camera/CameraActivity.findViewById:(I)Landroid/view/View;
        //   313: checkcast       Landroid/widget/TextView;
        //   316: astore          15
        //   318: aload           14
        //   320: lconst_0       
        //   321: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   324: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   327: aload           15
        //   329: lload           10
        //   331: ldc2_w          1000
        //   334: ldiv           
        //   335: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   338: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   341: aload           13
        //   343: new             Lcom/whatsapp/camera/e;
        //   346: dup            
        //   347: aload_0        
        //   348: aload_3        
        //   349: aload           14
        //   351: invokespecial   com/whatsapp/camera/e.<init>:(Lcom/whatsapp/camera/CameraActivity;Lcom/whatsapp/VideoView;Landroid/widget/TextView;)V
        //   354: invokevirtual   android/widget/SeekBar.setOnSeekBarChangeListener:(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
        //   357: new             Lcom/whatsapp/camera/q;
        //   360: dup            
        //   361: aload_0        
        //   362: aload_3        
        //   363: aload           12
        //   365: new             Lcom/whatsapp/camera/d;
        //   368: dup            
        //   369: aload_0        
        //   370: aload_3        
        //   371: aload           13
        //   373: aload           12
        //   375: invokespecial   com/whatsapp/camera/d.<init>:(Lcom/whatsapp/camera/CameraActivity;Lcom/whatsapp/VideoView;Landroid/widget/SeekBar;Landroid/view/View;)V
        //   378: invokespecial   com/whatsapp/camera/q.<init>:(Lcom/whatsapp/camera/CameraActivity;Lcom/whatsapp/VideoView;Landroid/view/View;Ljava/lang/Runnable;)V
        //   381: astore          16
        //   383: aload_2        
        //   384: aload           16
        //   386: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   389: aload           12
        //   391: aload           16
        //   393: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   396: return         
        //   397: astore_1       
        //   398: aload_1        
        //   399: athrow         
        //   400: astore          18
        //   402: new             Ljava/lang/StringBuilder;
        //   405: dup            
        //   406: invokespecial   java/lang/StringBuilder.<init>:()V
        //   409: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   412: bipush          14
        //   414: aaload         
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   418: aload           18
        //   420: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   423: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   426: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   429: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   432: aload_0        
        //   433: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   436: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   439: invokestatic    com/whatsapp/util/br.b:(Ljava/lang/String;)Landroid/graphics/Bitmap;
        //   442: astore          9
        //   444: lload           5
        //   446: lstore          10
        //   448: goto            190
        //   451: astore          8
        //   453: new             Ljava/lang/StringBuilder;
        //   456: dup            
        //   457: invokespecial   java/lang/StringBuilder.<init>:()V
        //   460: getstatic       com/whatsapp/camera/CameraActivity.P:[Ljava/lang/String;
        //   463: bipush          12
        //   465: aaload         
        //   466: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   469: aload           8
        //   471: invokevirtual   java/lang/NoSuchMethodError.toString:()Ljava/lang/String;
        //   474: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   477: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   480: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   483: aload_0        
        //   484: getfield        com/whatsapp/camera/CameraActivity.G:Ljava/io/File;
        //   487: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   490: invokestatic    com/whatsapp/util/br.b:(Ljava/lang/String;)Landroid/graphics/Bitmap;
        //   493: astore          9
        //   495: lload           5
        //   497: lstore          10
        //   499: goto            190
        //   502: astore          17
        //   504: aload           17
        //   506: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  0      26     397    400    Ljava/lang/Exception;
        //  150    182    400    451    Ljava/lang/Exception;
        //  150    182    451    502    Ljava/lang/NoSuchMethodError;
        //  195    212    502    507    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 233, Size: 233
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
    
    static boolean f(final CameraActivity cameraActivity) {
        return cameraActivity.M;
    }
    
    static ImageView g(final CameraActivity cameraActivity) {
        return cameraActivity.L;
    }
    
    private void g() {
        Log.i(CameraActivity.P[34]);
        if (this.q == null) {
            this.n.setText(2131230869);
        }
        this.L.setImageResource(2130837677);
        this.v.setVisibility(0);
        this.s.setVisibility(8);
        this.p.setVisibility(8);
        this.z.setVisibility(8);
        this.x.addView((View)this.I, 0);
        this.L.setEnabled(true);
        this.B.setEnabled(true);
        this.l.setEnabled(true);
        this.J.setVisibility(8);
        this.F.setVisibility(8);
        this.y.setVisibility(8);
        Label_0172: {
            if (Build$VERSION.SDK_INT < 9 || Camera.getNumberOfCameras() <= 1) {
                this.B.setVisibility(8);
                if (!CameraActivity.m) {
                    break Label_0172;
                }
            }
            this.B.setVisibility(0);
        }
        this.l.setVisibility(0);
        this.y.setVisibility(8);
        ((VideoView)this.findViewById(2131755329)).setVisibility(8);
        if (this.G != null) {
            this.G.delete();
            this.G = null;
        }
        if (this.t != null) {
            this.t.delete();
            this.t = null;
        }
        this.N = 0;
        this.w = null;
        this.A.setRotation(0.0f, false);
    }
    
    private Intent h() {
        final Intent intent = new Intent((Context)this, (Class)CameraActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.addFlags(8388608);
        intent.addFlags(1073741824);
        final Intent intent2 = new Intent();
        intent2.putExtra(CameraActivity.P[2], (Parcelable)intent);
        intent2.putExtra(CameraActivity.P[1], this.getString(2131230868));
        intent2.putExtra(CameraActivity.P[0], (Parcelable)Intent$ShortcutIconResource.fromContext((Context)this, 2130838887));
        return intent2;
    }
    
    static View h(final CameraActivity cameraActivity) {
        return cameraActivity.s;
    }
    
    static ConversationTextEntry i(final CameraActivity cameraActivity) {
        return cameraActivity.O;
    }
    
    static CameraView j(final CameraActivity cameraActivity) {
        return cameraActivity.I;
    }
    
    static l1 k(final CameraActivity cameraActivity) {
        return cameraActivity.E;
    }
    
    static File l(final CameraActivity cameraActivity) {
        return cameraActivity.G;
    }
    
    static ProgressBar m(final CameraActivity cameraActivity) {
        return cameraActivity.F;
    }
    
    static AutofocusOverlay n(final CameraActivity cameraActivity) {
        return cameraActivity.o;
    }
    
    static Handler o(final CameraActivity cameraActivity) {
        return cameraActivity.C;
    }
    
    static long p(final CameraActivity cameraActivity) {
        return cameraActivity.H;
    }
    
    static void q(final CameraActivity cameraActivity) {
        cameraActivity.a();
    }
    
    static View r(final CameraActivity cameraActivity) {
        return cameraActivity.y;
    }
    
    static ImageButton s(final CameraActivity cameraActivity) {
        return cameraActivity.k;
    }
    
    static TextView t(final CameraActivity cameraActivity) {
        return cameraActivity.J;
    }
    
    static Rect u(final CameraActivity cameraActivity) {
        return cameraActivity.w;
    }
    
    static void v(final CameraActivity cameraActivity) {
        cameraActivity.e();
    }
    
    static int w(final CameraActivity cameraActivity) {
        return cameraActivity.N;
    }
    
    static a_9 x(final CameraActivity cameraActivity) {
        return cameraActivity.q;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            case 1: {
                if (n2 != -1) {
                    break;
                }
                Uri uri = Uri.fromFile(App.D(CameraActivity.P[11]));
                if (this.r.getQueryParameter(CameraActivity.P[9]) != null) {
                    uri = uri.buildUpon().appendQueryParameter(CameraActivity.P[6], "1").build();
                }
                try {
                    if (br.g(uri) != null) {
                        goto Label_0133;
                    }
                    try {
                        Log.e(CameraActivity.P[10]);
                        App.a((Context)this, 2131230866, 1);
                        return;
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        throw outOfMemoryError;
                    }
                }
                catch (OutOfMemoryError outOfMemoryError2) {}
                catch (IOException ex) {
                    goto Label_0114;
                }
                catch (av ex) {
                    goto Label_0114;
                }
                break;
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.s.getVisibility() == 0) {
            this.g();
            return;
        }
        super.onBackPressed();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean m = CameraActivity.m;
        super.onCreate(bundle);
        Log.i(CameraActivity.P[25]);
        if (App.aX == null || !App.ak.l() || App.c((Context)this) != 3) {
            Log.i(CameraActivity.P[26]);
            App.F(CameraActivity.P[30]);
            this.startActivity(new Intent((Context)this, (Class)Main.class));
            this.finish();
            return;
        }
        if (!WhatsAppLibLoader.a(null)) {
            Log.i(CameraActivity.P[28]);
            this.finish();
            return;
        }
        if (CameraActivity.P[29].equals(this.getIntent().getAction())) {
            this.setResult(-1, this.h());
            this.finish();
            return;
        }
        if (App.C() < 1024 * (1024 * ym.k)) {
            final App aq = App.aq;
            App.b(this.getApplicationContext(), 2131231078, 1);
            this.finish();
            return;
        }
        this.getWindow().setFlags(1024, 1024);
        if (Build$VERSION.SDK_INT < 21) {
            this.getWindow().clearFlags(256);
        }
        this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(-16777216));
        final CameraLayout contentView = new CameraLayout((Context)this);
        alm.a(this.getWindow().getLayoutInflater(), 2130903089, (ViewGroup)contentView, true);
        this.setContentView((View)contentView);
        this.M = this.getIntent().getBooleanExtra(CameraActivity.P[27], true);
        final String stringExtra = this.getIntent().getStringExtra(CameraActivity.P[31]);
        CharSequence string = null;
        Label_0402: {
            if (stringExtra != null) {
                this.q = App.S.e(stringExtra);
                if (this.q.m() || this.q.k()) {
                    final CharSequence c = cq.c(this.getString(2131231642, new Object[] { this.q.a((Context)this) }), this.getBaseContext());
                    if (!m) {
                        string = c;
                        break Label_0402;
                    }
                }
                final String string2 = this.getString(2131231643, new Object[] { this.q.a((Context)this) });
                if (!m) {
                    string = string2;
                    break Label_0402;
                }
            }
            string = this.getString(2131230869);
        }
        (this.n = (TextView)this.findViewById(2131755086)).setText(string);
        this.s = this.findViewById(2131755326);
        this.v = this.findViewById(2131755320);
        this.A = (PhotoView)this.findViewById(2131755327);
        (this.I = (CameraView)this.findViewById(2131755322)).setCameraCallback(new t(this));
        this.x = (ViewGroup)this.findViewById(2131755321);
        (this.o = new AutofocusOverlay((Context)this)).setVisibility(8);
        this.x.addView((View)this.o, -1, -1);
        (this.K = new ZoomOverlay((Context)this)).setVisibility(8);
        this.x.addView((View)this.K, -1, -1);
        this.u = new ShutterOverlay((Context)this);
        this.x.addView((View)this.u, -1, -1);
        this.J = (TextView)this.findViewById(2131755340);
        (this.F = (ProgressBar)this.findViewById(2131755341)).setMax(100);
        this.y = this.findViewById(2131755342);
        this.B = this.findViewById(2131755324);
        Label_0699: {
            if (Build$VERSION.SDK_INT < 9 || Camera.getNumberOfCameras() <= 1) {
                this.B.setVisibility(8);
                if (!m) {
                    break Label_0699;
                }
            }
            this.B.setOnClickListener((View$OnClickListener)new z(this));
        }
        (this.l = (ImageButton)this.findViewById(2131755325)).setOnClickListener((View$OnClickListener)new ao(this));
        (this.L = (ImageView)this.findViewById(2131755323)).setOnClickListener((View$OnClickListener)new al(this));
        if (Build$VERSION.SDK_INT >= 8) {
            this.L.setOnLongClickListener((View$OnLongClickListener)new k(this));
        }
        this.L.setOnTouchListener((View$OnTouchListener)new h(this));
        (this.k = (ImageButton)this.findViewById(2131755446)).setOnClickListener((View$OnClickListener)new aq(this));
        (this.O = (ConversationTextEntry)this.findViewById(2131755486)).setInputEnterDone(true);
        this.O.setFilters(new InputFilter[] { new aw8(160) });
        this.O.setOnEditorActionListener((TextView$OnEditorActionListener)new v(this));
        this.O.addTextChangedListener((TextWatcher)new r(this, (TextView)this.findViewById(2131755648)));
        (this.E = new g(this, this)).a(new w(this));
        this.p = this.findViewById(2131755338);
        this.z = this.findViewById(2131755339);
        this.s.getViewTreeObserver().addOnGlobalLayoutListener(this.D);
    }
    
    @Override
    protected void onDestroy() {
        Log.i(CameraActivity.P[24]);
        super.onDestroy();
        if (this.s != null) {
            this.s.getViewTreeObserver().removeGlobalOnLayoutListener(this.D);
        }
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        if (this.I.g()) {
            this.b(System.currentTimeMillis() - this.H > 1000L);
        }
    }
}
