// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import android.net.Uri;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;
import android.view.SurfaceHolder$Callback;
import android.media.MediaPlayer$OnInfoListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnErrorListener;
import android.view.SurfaceHolder;
import android.media.MediaPlayer$OnCompletionListener;
import android.widget.MediaController$MediaPlayerControl;
import android.view.SurfaceView;

public class VideoView extends SurfaceView implements MediaController$MediaPlayerControl
{
    private static final String[] B;
    private MediaPlayer$OnCompletionListener A;
    private SurfaceHolder a;
    private int b;
    private boolean c;
    private int d;
    private MediaPlayer$OnErrorListener e;
    private boolean f;
    private int g;
    private MediaPlayer$OnBufferingUpdateListener h;
    private MediaPlayer$OnInfoListener i;
    SurfaceHolder$Callback j;
    private boolean k;
    private int l;
    private MediaPlayer$OnCompletionListener m;
    private int n;
    private MediaPlayer$OnPreparedListener o;
    private int p;
    private String q;
    private int r;
    private MediaPlayer s;
    private int t;
    MediaPlayer$OnVideoSizeChangedListener u;
    private MediaPlayer$OnErrorListener v;
    MediaPlayer$OnPreparedListener w;
    private Uri x;
    private int y;
    private Map z;
    
    static {
        final String[] b = new String[7];
        String s = "\u0011v\u0003 |\u0011v\u00022";
        int n = -1;
        String[] array = b;
        int n2 = 0;
        String intern = null;
    Label_0207:
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
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = 'g';
                        break;
                    }
                    case 3: {
                        c2 = 'E';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011v\u0003 |\u0011v\u00022";
                    n2 = 1;
                    array = b;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "1v\u0003 |1v\u00022<gJ\t$q+zG1|gp\u0017 }g|\b+g\"q\u0013\u007f3";
                    n2 = 2;
                    array = b;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "$p\nkr){\u0015*z#1\n0`.|I(f4v\u00046v5i\u000e&v$p\n(r){";
                    n2 = 3;
                    array = b;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "$p\n(r){";
                    n2 = 4;
                    array = b;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = b;
                    s = "7~\u00126v";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "1v\u0003 |1v\u00022<gJ\t$q+zG1|gp\u0017 }g|\b+g\"q\u0013\u007f3";
                    n = 5;
                    array = b;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        B = b;
    }
    
    public VideoView(final Context context) {
        super(context);
        this.q = VideoView.B[1];
        this.b = 0;
        this.n = 0;
        this.a = null;
        this.s = null;
        this.u = (MediaPlayer$OnVideoSizeChangedListener)new kl(this);
        this.w = (MediaPlayer$OnPreparedListener)new qm(this);
        this.m = (MediaPlayer$OnCompletionListener)new ku(this);
        this.v = (MediaPlayer$OnErrorListener)new aha(this);
        this.h = (MediaPlayer$OnBufferingUpdateListener)new alx(this);
        this.j = (SurfaceHolder$Callback)new a26(this);
        this.d();
    }
    
    public VideoView(final Context context, final AttributeSet set) {
        this(context, set, 0);
        this.d();
    }
    
    public VideoView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.q = VideoView.B[0];
        this.b = 0;
        this.n = 0;
        this.a = null;
        this.s = null;
        this.u = (MediaPlayer$OnVideoSizeChangedListener)new kl(this);
        this.w = (MediaPlayer$OnPreparedListener)new qm(this);
        this.m = (MediaPlayer$OnCompletionListener)new ku(this);
        this.v = (MediaPlayer$OnErrorListener)new aha(this);
        this.h = (MediaPlayer$OnBufferingUpdateListener)new alx(this);
        this.j = (SurfaceHolder$Callback)new a26(this);
        this.d();
    }
    
    static int a(final VideoView videoView, final int t) {
        return videoView.t = t;
    }
    
    static MediaPlayer$OnCompletionListener a(final VideoView videoView) {
        return videoView.A;
    }
    
    static SurfaceHolder a(final VideoView videoView, final SurfaceHolder a) {
        return videoView.a = a;
    }
    
    private void a(final boolean b) {
        try {
            if (this.s == null) {
                return;
            }
            final VideoView videoView = this;
            final MediaPlayer mediaPlayer = videoView.s;
            mediaPlayer.reset();
            final VideoView videoView2 = this;
            final MediaPlayer mediaPlayer2 = videoView2.s;
            mediaPlayer2.release();
            final VideoView videoView3 = this;
            final MediaPlayer mediaPlayer3 = null;
            videoView3.s = mediaPlayer3;
            final VideoView videoView4 = this;
            final boolean b2 = false;
            videoView4.b = (b2 ? 1 : 0);
            final boolean b3 = b;
            if (b3) {
                final VideoView videoView5 = this;
                final boolean b4 = false;
                videoView5.n = (b4 ? 1 : 0);
            }
            return;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final VideoView videoView = this;
            final MediaPlayer mediaPlayer = videoView.s;
            mediaPlayer.reset();
            final VideoView videoView2 = this;
            final MediaPlayer mediaPlayer2 = videoView2.s;
            mediaPlayer2.release();
            final VideoView videoView3 = this;
            final MediaPlayer mediaPlayer3 = null;
            videoView3.s = mediaPlayer3;
            final VideoView videoView4 = this;
            final boolean b2 = false;
            videoView4.b = (b2 ? 1 : 0);
            final boolean b3 = b;
            if (b3) {
                final VideoView videoView5 = this;
                final boolean b4 = false;
                videoView5.n = (b4 ? 1 : 0);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    static boolean a(final VideoView videoView, final boolean k) {
        return videoView.k = k;
    }
    
    static int b(final VideoView videoView) {
        return videoView.d;
    }
    
    static int b(final VideoView videoView, final int d) {
        return videoView.d = d;
    }
    
    private boolean b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          62
        //    11: aload_0        
        //    12: getfield        com/whatsapp/VideoView.b:I
        //    15: istore          6
        //    17: iload           6
        //    19: iconst_m1      
        //    20: if_icmpeq       62
        //    23: aload_0        
        //    24: getfield        com/whatsapp/VideoView.b:I
        //    27: istore          7
        //    29: iload           7
        //    31: ifeq            62
        //    34: aload_0        
        //    35: getfield        com/whatsapp/VideoView.b:I
        //    38: istore          8
        //    40: iload           8
        //    42: iconst_1       
        //    43: if_icmpeq       62
        //    46: iconst_1       
        //    47: ireturn        
        //    48: astore_1       
        //    49: aload_1        
        //    50: athrow         
        //    51: astore_2       
        //    52: aload_2        
        //    53: athrow         
        //    54: astore_3       
        //    55: aload_3        
        //    56: athrow         
        //    57: astore          4
        //    59: aload           4
        //    61: athrow         
        //    62: iconst_0       
        //    63: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      48     51     Ljava/lang/IllegalArgumentException;
        //  11     17     51     54     Ljava/lang/IllegalArgumentException;
        //  23     29     54     57     Ljava/lang/IllegalArgumentException;
        //  34     40     57     62     Ljava/lang/IllegalArgumentException;
        //  49     51     51     54     Ljava/lang/IllegalArgumentException;
        //  52     54     54     57     Ljava/lang/IllegalArgumentException;
        //  55     57     57     62     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 38, Size: 38
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
    
    static boolean b(final VideoView videoView, final boolean c) {
        return videoView.c = c;
    }
    
    static int c(final VideoView videoView, final int r) {
        return videoView.r = r;
    }
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/VideoView.x:Landroid/net/Uri;
        //     4: ifnull          16
        //     7: aload_0        
        //     8: getfield        com/whatsapp/VideoView.a:Landroid/view/SurfaceHolder;
        //    11: astore_3       
        //    12: aload_3        
        //    13: ifnonnull       23
        //    16: return         
        //    17: astore_1       
        //    18: aload_1        
        //    19: athrow         
        //    20: astore_2       
        //    21: aload_2        
        //    22: athrow         
        //    23: new             Landroid/content/Intent;
        //    26: dup            
        //    27: getstatic       com/whatsapp/VideoView.B:[Ljava/lang/String;
        //    30: iconst_3       
        //    31: aaload         
        //    32: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    35: astore          4
        //    37: aload           4
        //    39: getstatic       com/whatsapp/VideoView.B:[Ljava/lang/String;
        //    42: iconst_4       
        //    43: aaload         
        //    44: getstatic       com/whatsapp/VideoView.B:[Ljava/lang/String;
        //    47: iconst_5       
        //    48: aaload         
        //    49: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    52: pop            
        //    53: aload_0        
        //    54: invokevirtual   com/whatsapp/VideoView.getContext:()Landroid/content/Context;
        //    57: aload           4
        //    59: invokevirtual   android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
        //    62: aload_0        
        //    63: iconst_0       
        //    64: invokespecial   com/whatsapp/VideoView.a:(Z)V
        //    67: aload_0        
        //    68: new             Landroid/media/MediaPlayer;
        //    71: dup            
        //    72: invokespecial   android/media/MediaPlayer.<init>:()V
        //    75: putfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //    78: aload_0        
        //    79: getfield        com/whatsapp/VideoView.p:I
        //    82: istore          10
        //    84: iload           10
        //    86: ifeq            106
        //    89: aload_0        
        //    90: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //    93: aload_0        
        //    94: getfield        com/whatsapp/VideoView.p:I
        //    97: invokevirtual   android/media/MediaPlayer.setAudioSessionId:(I)V
        //   100: getstatic       com/whatsapp/App.I:Z
        //   103: ifeq            129
        //   106: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   109: istore          13
        //   111: iload           13
        //   113: bipush          9
        //   115: if_icmplt       129
        //   118: aload_0        
        //   119: aload_0        
        //   120: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   123: invokevirtual   android/media/MediaPlayer.getAudioSessionId:()I
        //   126: putfield        com/whatsapp/VideoView.p:I
        //   129: aload_0        
        //   130: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   133: aload_0        
        //   134: getfield        com/whatsapp/VideoView.w:Landroid/media/MediaPlayer$OnPreparedListener;
        //   137: invokevirtual   android/media/MediaPlayer.setOnPreparedListener:(Landroid/media/MediaPlayer$OnPreparedListener;)V
        //   140: aload_0        
        //   141: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   144: aload_0        
        //   145: getfield        com/whatsapp/VideoView.u:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
        //   148: invokevirtual   android/media/MediaPlayer.setOnVideoSizeChangedListener:(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
        //   151: aload_0        
        //   152: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   155: aload_0        
        //   156: getfield        com/whatsapp/VideoView.m:Landroid/media/MediaPlayer$OnCompletionListener;
        //   159: invokevirtual   android/media/MediaPlayer.setOnCompletionListener:(Landroid/media/MediaPlayer$OnCompletionListener;)V
        //   162: aload_0        
        //   163: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   166: aload_0        
        //   167: getfield        com/whatsapp/VideoView.v:Landroid/media/MediaPlayer$OnErrorListener;
        //   170: invokevirtual   android/media/MediaPlayer.setOnErrorListener:(Landroid/media/MediaPlayer$OnErrorListener;)V
        //   173: aload_0        
        //   174: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   177: aload_0        
        //   178: getfield        com/whatsapp/VideoView.i:Landroid/media/MediaPlayer$OnInfoListener;
        //   181: invokevirtual   android/media/MediaPlayer.setOnInfoListener:(Landroid/media/MediaPlayer$OnInfoListener;)V
        //   184: aload_0        
        //   185: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   188: aload_0        
        //   189: getfield        com/whatsapp/VideoView.h:Landroid/media/MediaPlayer$OnBufferingUpdateListener;
        //   192: invokevirtual   android/media/MediaPlayer.setOnBufferingUpdateListener:(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
        //   195: aload_0        
        //   196: iconst_0       
        //   197: putfield        com/whatsapp/VideoView.r:I
        //   200: aload_0        
        //   201: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   204: aload_0        
        //   205: invokevirtual   com/whatsapp/VideoView.getContext:()Landroid/content/Context;
        //   208: aload_0        
        //   209: getfield        com/whatsapp/VideoView.x:Landroid/net/Uri;
        //   212: aload_0        
        //   213: getfield        com/whatsapp/VideoView.z:Ljava/util/Map;
        //   216: invokevirtual   android/media/MediaPlayer.setDataSource:(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V
        //   219: aload_0        
        //   220: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   223: aload_0        
        //   224: getfield        com/whatsapp/VideoView.a:Landroid/view/SurfaceHolder;
        //   227: invokevirtual   android/media/MediaPlayer.setDisplay:(Landroid/view/SurfaceHolder;)V
        //   230: aload_0        
        //   231: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   234: iconst_3       
        //   235: invokevirtual   android/media/MediaPlayer.setAudioStreamType:(I)V
        //   238: aload_0        
        //   239: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   242: iconst_1       
        //   243: invokevirtual   android/media/MediaPlayer.setScreenOnWhilePlaying:(Z)V
        //   246: aload_0        
        //   247: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   250: invokevirtual   android/media/MediaPlayer.prepareAsync:()V
        //   253: aload_0        
        //   254: iconst_1       
        //   255: putfield        com/whatsapp/VideoView.b:I
        //   258: return         
        //   259: astore          8
        //   261: new             Ljava/lang/StringBuilder;
        //   264: dup            
        //   265: invokespecial   java/lang/StringBuilder.<init>:()V
        //   268: getstatic       com/whatsapp/VideoView.B:[Ljava/lang/String;
        //   271: bipush          6
        //   273: aaload         
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: aload_0        
        //   278: getfield        com/whatsapp/VideoView.x:Landroid/net/Uri;
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   284: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   287: aload           8
        //   289: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   292: aload_0        
        //   293: iconst_m1      
        //   294: putfield        com/whatsapp/VideoView.b:I
        //   297: aload_0        
        //   298: iconst_m1      
        //   299: putfield        com/whatsapp/VideoView.n:I
        //   302: aload_0        
        //   303: getfield        com/whatsapp/VideoView.v:Landroid/media/MediaPlayer$OnErrorListener;
        //   306: aload_0        
        //   307: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   310: iconst_1       
        //   311: iconst_0       
        //   312: invokeinterface android/media/MediaPlayer$OnErrorListener.onError:(Landroid/media/MediaPlayer;II)Z
        //   317: pop            
        //   318: return         
        //   319: astore          11
        //   321: aload           11
        //   323: athrow         
        //   324: astore          12
        //   326: aload           12
        //   328: athrow         
        //   329: astore          6
        //   331: new             Ljava/lang/StringBuilder;
        //   334: dup            
        //   335: invokespecial   java/lang/StringBuilder.<init>:()V
        //   338: getstatic       com/whatsapp/VideoView.B:[Ljava/lang/String;
        //   341: iconst_2       
        //   342: aaload         
        //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   346: aload_0        
        //   347: getfield        com/whatsapp/VideoView.x:Landroid/net/Uri;
        //   350: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   353: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   356: aload           6
        //   358: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   361: aload_0        
        //   362: iconst_m1      
        //   363: putfield        com/whatsapp/VideoView.b:I
        //   366: aload_0        
        //   367: iconst_m1      
        //   368: putfield        com/whatsapp/VideoView.n:I
        //   371: aload_0        
        //   372: getfield        com/whatsapp/VideoView.v:Landroid/media/MediaPlayer$OnErrorListener;
        //   375: aload_0        
        //   376: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //   379: iconst_1       
        //   380: iconst_0       
        //   381: invokeinterface android/media/MediaPlayer$OnErrorListener.onError:(Landroid/media/MediaPlayer;II)Z
        //   386: pop            
        //   387: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      12     17     23     Ljava/io/IOException;
        //  18     20     20     23     Ljava/io/IOException;
        //  67     84     259    319    Ljava/io/IOException;
        //  67     84     329    388    Ljava/lang/IllegalArgumentException;
        //  89     106    319    324    Ljava/io/IOException;
        //  89     106    329    388    Ljava/lang/IllegalArgumentException;
        //  106    111    319    324    Ljava/io/IOException;
        //  106    111    329    388    Ljava/lang/IllegalArgumentException;
        //  118    129    324    329    Ljava/io/IOException;
        //  118    129    329    388    Ljava/lang/IllegalArgumentException;
        //  129    258    259    319    Ljava/io/IOException;
        //  129    258    329    388    Ljava/lang/IllegalArgumentException;
        //  321    324    324    329    Ljava/io/IOException;
        //  321    324    329    388    Ljava/lang/IllegalArgumentException;
        //  326    329    259    319    Ljava/io/IOException;
        //  326    329    329    388    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 191, Size: 191
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
    
    static void c(final VideoView videoView) {
        videoView.c();
    }
    
    static void c(final VideoView videoView, final boolean b) {
        videoView.a(b);
    }
    
    static int d(final VideoView videoView) {
        return videoView.t;
    }
    
    static int d(final VideoView videoView, final int y) {
        return videoView.y = y;
    }
    
    private void d() {
        this.t = 0;
        this.l = 0;
        this.getHolder().addCallback(this.j);
        this.getHolder().setType(3);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.requestFocus();
        this.b = 0;
        this.n = 0;
    }
    
    static boolean d(final VideoView videoView, final boolean f) {
        return videoView.f = f;
    }
    
    static int e(final VideoView videoView) {
        return videoView.g;
    }
    
    static int e(final VideoView videoView, final int b) {
        return videoView.b = b;
    }
    
    static int f(final VideoView videoView, final int n) {
        return videoView.n = n;
    }
    
    static MediaPlayer f(final VideoView videoView) {
        return videoView.s;
    }
    
    static int g(final VideoView videoView) {
        return videoView.l;
    }
    
    static int g(final VideoView videoView, final int l) {
        return videoView.l = l;
    }
    
    static MediaPlayer$OnPreparedListener h(final VideoView videoView) {
        return videoView.o;
    }
    
    static int i(final VideoView videoView) {
        return videoView.y;
    }
    
    static int j(final VideoView videoView) {
        return videoView.n;
    }
    
    static MediaPlayer$OnErrorListener k(final VideoView videoView) {
        return videoView.e;
    }
    
    public void a() {
        this.a(false);
    }
    
    public boolean canPause() {
        return this.k;
    }
    
    public boolean canSeekBackward() {
        return this.f;
    }
    
    public boolean canSeekForward() {
        return this.c;
    }
    
    public int getAudioSessionId() {
        if (this.p == 0) {
            final MediaPlayer mediaPlayer = new MediaPlayer();
            this.p = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.p;
    }
    
    public int getBufferPercentage() {
        try {
            if (this.s != null) {
                return this.r;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return 0;
    }
    
    public int getCurrentPosition() {
        try {
            if (this.b()) {
                return this.s.getCurrentPosition();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return 0;
    }
    
    public int getDuration() {
        try {
            if (this.b()) {
                return this.s.getDuration();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return -1;
    }
    
    public boolean isPlaying() {
        try {
            if (!this.b()) {
                return false;
            }
            final VideoView videoView = this;
            final MediaPlayer mediaPlayer = videoView.s;
            final boolean b = mediaPlayer.isPlaying();
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final VideoView videoView = this;
            final MediaPlayer mediaPlayer = videoView.s;
            final boolean b = mediaPlayer.isPlaying();
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)VideoView.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)VideoView.class.getName());
    }
    
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/VideoView.t:I
        //     8: iload_1        
        //     9: invokestatic    com/whatsapp/VideoView.getDefaultSize:(II)I
        //    12: istore          4
        //    14: aload_0        
        //    15: getfield        com/whatsapp/VideoView.l:I
        //    18: iload_2        
        //    19: invokestatic    com/whatsapp/VideoView.getDefaultSize:(II)I
        //    22: istore          5
        //    24: aload_0        
        //    25: getfield        com/whatsapp/VideoView.t:I
        //    28: ifle            320
        //    31: aload_0        
        //    32: getfield        com/whatsapp/VideoView.l:I
        //    35: istore          7
        //    37: iload           7
        //    39: ifle            320
        //    42: iload_1        
        //    43: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    46: istore          8
        //    48: iload_1        
        //    49: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //    52: istore          9
        //    54: iload_2        
        //    55: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    58: istore          10
        //    60: iload_2        
        //    61: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //    64: istore          5
        //    66: iload           8
        //    68: ldc_w           1073741824
        //    71: if_icmpne       164
        //    74: iload           10
        //    76: ldc_w           1073741824
        //    79: if_icmpne       164
        //    82: iload           5
        //    84: aload_0        
        //    85: getfield        com/whatsapp/VideoView.t:I
        //    88: imul           
        //    89: iload           9
        //    91: aload_0        
        //    92: getfield        com/whatsapp/VideoView.l:I
        //    95: imul           
        //    96: if_icmpge       386
        //    99: iload           5
        //   101: aload_0        
        //   102: getfield        com/whatsapp/VideoView.t:I
        //   105: imul           
        //   106: aload_0        
        //   107: getfield        com/whatsapp/VideoView.l:I
        //   110: idiv           
        //   111: istore          4
        //   113: iload_3        
        //   114: ifeq            320
        //   117: iload           4
        //   119: istore          14
        //   121: iload           5
        //   123: aload_0        
        //   124: getfield        com/whatsapp/VideoView.t:I
        //   127: imul           
        //   128: istore          16
        //   130: aload_0        
        //   131: getfield        com/whatsapp/VideoView.l:I
        //   134: istore          17
        //   136: iload           16
        //   138: iload           17
        //   140: iload           14
        //   142: imul           
        //   143: if_icmple       379
        //   146: iload           14
        //   148: aload_0        
        //   149: getfield        com/whatsapp/VideoView.l:I
        //   152: imul           
        //   153: aload_0        
        //   154: getfield        com/whatsapp/VideoView.t:I
        //   157: idiv           
        //   158: istore          18
        //   160: iload_3        
        //   161: ifeq            368
        //   164: iload           8
        //   166: ldc_w           1073741824
        //   169: if_icmpne       205
        //   172: iload           9
        //   174: aload_0        
        //   175: getfield        com/whatsapp/VideoView.l:I
        //   178: imul           
        //   179: aload_0        
        //   180: getfield        com/whatsapp/VideoView.t:I
        //   183: idiv           
        //   184: istore          13
        //   186: iload           10
        //   188: ldc_w           -2147483648
        //   191: if_icmpne       357
        //   194: iload           13
        //   196: iload           5
        //   198: if_icmple       357
        //   201: iload_3        
        //   202: ifeq            350
        //   205: iload           10
        //   207: ldc_w           1073741824
        //   210: if_icmpne       246
        //   213: iload           5
        //   215: aload_0        
        //   216: getfield        com/whatsapp/VideoView.t:I
        //   219: imul           
        //   220: aload_0        
        //   221: getfield        com/whatsapp/VideoView.l:I
        //   224: idiv           
        //   225: istore          4
        //   227: iload           8
        //   229: ldc_w           -2147483648
        //   232: if_icmpne       320
        //   235: iload           4
        //   237: iload           9
        //   239: if_icmple       320
        //   242: iload_3        
        //   243: ifeq            350
        //   246: aload_0        
        //   247: getfield        com/whatsapp/VideoView.t:I
        //   250: istore          11
        //   252: aload_0        
        //   253: getfield        com/whatsapp/VideoView.l:I
        //   256: istore          12
        //   258: iload           10
        //   260: ldc_w           -2147483648
        //   263: if_icmpne       339
        //   266: iload           12
        //   268: iload           5
        //   270: if_icmple       339
        //   273: iload           5
        //   275: aload_0        
        //   276: getfield        com/whatsapp/VideoView.t:I
        //   279: imul           
        //   280: aload_0        
        //   281: getfield        com/whatsapp/VideoView.l:I
        //   284: idiv           
        //   285: istore          4
        //   287: iload           8
        //   289: ldc_w           -2147483648
        //   292: if_icmpne       320
        //   295: iload           4
        //   297: iload           9
        //   299: if_icmple       320
        //   302: iload           9
        //   304: aload_0        
        //   305: getfield        com/whatsapp/VideoView.l:I
        //   308: imul           
        //   309: aload_0        
        //   310: getfield        com/whatsapp/VideoView.t:I
        //   313: idiv           
        //   314: istore          5
        //   316: iload           9
        //   318: istore          4
        //   320: aload_0        
        //   321: iload           4
        //   323: iload           5
        //   325: invokevirtual   com/whatsapp/VideoView.setMeasuredDimension:(II)V
        //   328: return         
        //   329: astore          6
        //   331: aload           6
        //   333: athrow         
        //   334: astore          15
        //   336: aload           15
        //   338: athrow         
        //   339: iload           12
        //   341: istore          5
        //   343: iload           11
        //   345: istore          4
        //   347: goto            287
        //   350: iload           9
        //   352: istore          4
        //   354: goto            320
        //   357: iload           13
        //   359: istore          5
        //   361: iload           9
        //   363: istore          4
        //   365: goto            320
        //   368: iload           18
        //   370: istore          5
        //   372: iload           14
        //   374: istore          4
        //   376: goto            320
        //   379: iload           14
        //   381: istore          4
        //   383: goto            320
        //   386: iload           9
        //   388: istore          14
        //   390: goto            121
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  24     37     329    334    Ljava/lang/IllegalArgumentException;
        //  121    136    334    339    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
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
    
    public void pause() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/VideoView.b:()Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            31
        //     9: aload_0        
        //    10: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //    13: invokevirtual   android/media/MediaPlayer.isPlaying:()Z
        //    16: ifeq            31
        //    19: aload_0        
        //    20: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //    23: invokevirtual   android/media/MediaPlayer.pause:()V
        //    26: aload_0        
        //    27: iconst_4       
        //    28: putfield        com/whatsapp/VideoView.b:I
        //    31: aload_0        
        //    32: iconst_4       
        //    33: putfield        com/whatsapp/VideoView.n:I
        //    36: return         
        //    37: astore_1       
        //    38: aload_1        
        //    39: athrow         
        //    40: astore_2       
        //    41: aload_2        
        //    42: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      37     40     Ljava/lang/IllegalArgumentException;
        //  9      31     40     43     Ljava/lang/IllegalArgumentException;
        //  38     40     40     43     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
    
    public void seekTo(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/VideoView.b:()Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            30
        //    11: aload_0        
        //    12: getfield        com/whatsapp/VideoView.s:Landroid/media/MediaPlayer;
        //    15: iload_1        
        //    16: invokevirtual   android/media/MediaPlayer.seekTo:(I)V
        //    19: aload_0        
        //    20: iconst_0       
        //    21: putfield        com/whatsapp/VideoView.g:I
        //    24: getstatic       com/whatsapp/App.I:Z
        //    27: ifeq            42
        //    30: aload_0        
        //    31: iload_1        
        //    32: putfield        com/whatsapp/VideoView.g:I
        //    35: return         
        //    36: astore_2       
        //    37: aload_2        
        //    38: athrow         
        //    39: astore_3       
        //    40: aload_3        
        //    41: athrow         
        //    42: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      36     39     Ljava/lang/IllegalArgumentException;
        //  11     30     39     42     Ljava/lang/IllegalArgumentException;
        //  30     35     39     42     Ljava/lang/IllegalArgumentException;
        //  37     39     39     42     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    public void setOnPreparedListener(final MediaPlayer$OnPreparedListener o) {
        this.o = o;
    }
    
    public void setVideoPath(final String s) {
        this.setVideoURI(Uri.parse(s));
    }
    
    public void setVideoURI(final Uri uri) {
        this.setVideoURI(uri, null);
    }
    
    public void setVideoURI(final Uri x, final Map z) {
        this.x = x;
        this.z = z;
        this.g = 0;
        this.c();
        this.requestLayout();
        this.invalidate();
    }
    
    public void start() {
        try {
            if (this.b()) {
                this.s.start();
                this.b = 3;
            }
            this.n = 3;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
}
