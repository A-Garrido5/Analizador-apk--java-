// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.player;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import android.net.Uri;
import android.widget.MediaController;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView$SurfaceTextureListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.widget.MediaController$MediaPlayerControl;
import android.view.TextureView;

public class InlineVideoView extends TextureView implements MediaController$MediaPlayerControl
{
    private static final String a;
    private boolean A;
    private boolean B;
    private MediaPlayer$OnVideoSizeChangedListener C;
    private MediaPlayer$OnPreparedListener D;
    private MediaPlayer$OnCompletionListener E;
    private MediaPlayer$OnErrorListener F;
    private MediaPlayer$OnBufferingUpdateListener G;
    private TextureView$SurfaceTextureListener H;
    private int b;
    private int c;
    private Surface d;
    private MediaPlayer e;
    private int f;
    private int g;
    private MediaController h;
    private MediaPlayer$OnCompletionListener i;
    private MediaPlayer$OnPreparedListener j;
    private int k;
    private MediaPlayer$OnErrorListener l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private Uri s;
    private Map t;
    private int u;
    private Context v;
    private String w;
    private AttributeSet x;
    private boolean y;
    private final int[] z;
    
    static {
        a = InlineVideoView.class.getSimpleName();
    }
    
    public InlineVideoView(final Context context) {
        super(context);
        this.e = null;
        this.q = 0;
        this.r = 0;
        this.z = new int[0];
        this.A = false;
        this.B = false;
        this.C = (MediaPlayer$OnVideoSizeChangedListener)new a(this);
        this.D = (MediaPlayer$OnPreparedListener)new b(this);
        this.E = (MediaPlayer$OnCompletionListener)new c(this);
        this.F = (MediaPlayer$OnErrorListener)new d(this);
        this.G = (MediaPlayer$OnBufferingUpdateListener)new e(this);
        this.H = (TextureView$SurfaceTextureListener)new f(this);
        this.f();
    }
    
    public InlineVideoView(final Context context, final AttributeSet x) {
        super(context, x);
        this.e = null;
        this.q = 0;
        this.r = 0;
        this.z = new int[0];
        this.A = false;
        this.B = false;
        this.C = (MediaPlayer$OnVideoSizeChangedListener)new a(this);
        this.D = (MediaPlayer$OnPreparedListener)new b(this);
        this.E = (MediaPlayer$OnCompletionListener)new c(this);
        this.F = (MediaPlayer$OnErrorListener)new d(this);
        this.G = (MediaPlayer$OnBufferingUpdateListener)new e(this);
        this.H = (TextureView$SurfaceTextureListener)new f(this);
        this.x = x;
        this.f();
    }
    
    public InlineVideoView(final Context context, final AttributeSet x, final int n) {
        super(context, x, n);
        this.e = null;
        this.q = 0;
        this.r = 0;
        this.z = new int[0];
        this.A = false;
        this.B = false;
        this.C = (MediaPlayer$OnVideoSizeChangedListener)new a(this);
        this.D = (MediaPlayer$OnPreparedListener)new b(this);
        this.E = (MediaPlayer$OnCompletionListener)new c(this);
        this.F = (MediaPlayer$OnErrorListener)new d(this);
        this.G = (MediaPlayer$OnBufferingUpdateListener)new e(this);
        this.H = (TextureView$SurfaceTextureListener)new f(this);
        this.x = x;
        this.f();
    }
    
    private void b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/twitter/library/media/player/InlineVideoView.z:[I
        //     6: astore_3       
        //     7: aload_3        
        //     8: monitorenter   
        //     9: aload_0        
        //    10: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    13: astore          5
        //    15: aload           5
        //    17: ifnull          75
        //    20: aload_0        
        //    21: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    24: invokevirtual   android/media/MediaPlayer.isPlaying:()Z
        //    27: ifeq            37
        //    30: aload_0        
        //    31: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    34: invokevirtual   android/media/MediaPlayer.stop:()V
        //    37: aload_0        
        //    38: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    41: invokevirtual   android/media/MediaPlayer.reset:()V
        //    44: aload_0        
        //    45: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    48: invokevirtual   android/media/MediaPlayer.release:()V
        //    51: aload_0        
        //    52: aconst_null    
        //    53: putfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    56: aload_0        
        //    57: iconst_0       
        //    58: putfield        com/twitter/library/media/player/InlineVideoView.q:I
        //    61: iload_1        
        //    62: ifeq            75
        //    65: aload_0        
        //    66: iconst_0       
        //    67: putfield        com/twitter/library/media/player/InlineVideoView.r:I
        //    70: aload_0        
        //    71: aconst_null    
        //    72: putfield        com/twitter/library/media/player/InlineVideoView.w:Ljava/lang/String;
        //    75: aload_0        
        //    76: iconst_0       
        //    77: invokevirtual   com/twitter/library/media/player/InlineVideoView.setKeepScreenOn:(Z)V
        //    80: aload_3        
        //    81: monitorexit    
        //    82: aload_0        
        //    83: monitorexit    
        //    84: return         
        //    85: astore          4
        //    87: aload_3        
        //    88: monitorexit    
        //    89: aload           4
        //    91: athrow         
        //    92: astore_2       
        //    93: aload_0        
        //    94: monitorexit    
        //    95: aload_2        
        //    96: athrow         
        //    97: astore          6
        //    99: goto            37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      9      92     97     Any
        //  9      15     85     92     Any
        //  20     37     97     102    Ljava/lang/IllegalStateException;
        //  20     37     85     92     Any
        //  37     61     85     92     Any
        //  65     75     85     92     Any
        //  75     82     85     92     Any
        //  87     89     85     92     Any
        //  89     92     92     97     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    private void f() {
        this.v = this.getContext();
        this.b = 0;
        this.c = 0;
        this.setSurfaceTextureListener(this.H);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.requestFocus();
        this.q = 0;
        this.r = 0;
    }
    
    private void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/library/media/player/InlineVideoView.z:[I
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/twitter/library/media/player/InlineVideoView.s:Landroid/net/Uri;
        //    11: ifnull          21
        //    14: aload_0        
        //    15: getfield        com/twitter/library/media/player/InlineVideoView.d:Landroid/view/Surface;
        //    18: ifnonnull       24
        //    21: aload_1        
        //    22: monitorexit    
        //    23: return         
        //    24: new             Landroid/content/Intent;
        //    27: dup            
        //    28: ldc             "com.android.music.musicservicecommand"
        //    30: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    33: astore_3       
        //    34: aload_3        
        //    35: ldc             "command"
        //    37: ldc             "pause"
        //    39: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    42: pop            
        //    43: aload_0        
        //    44: getfield        com/twitter/library/media/player/InlineVideoView.v:Landroid/content/Context;
        //    47: aload_3        
        //    48: invokevirtual   android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
        //    51: aload_0        
        //    52: iconst_0       
        //    53: invokespecial   com/twitter/library/media/player/InlineVideoView.b:(Z)V
        //    56: aload_0        
        //    57: new             Landroid/media/MediaPlayer;
        //    60: dup            
        //    61: invokespecial   android/media/MediaPlayer.<init>:()V
        //    64: putfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    67: aload_0        
        //    68: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    71: aload_0        
        //    72: getfield        com/twitter/library/media/player/InlineVideoView.D:Landroid/media/MediaPlayer$OnPreparedListener;
        //    75: invokevirtual   android/media/MediaPlayer.setOnPreparedListener:(Landroid/media/MediaPlayer$OnPreparedListener;)V
        //    78: aload_0        
        //    79: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    82: aload_0        
        //    83: getfield        com/twitter/library/media/player/InlineVideoView.C:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
        //    86: invokevirtual   android/media/MediaPlayer.setOnVideoSizeChangedListener:(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
        //    89: aload_0        
        //    90: iconst_m1      
        //    91: putfield        com/twitter/library/media/player/InlineVideoView.u:I
        //    94: aload_0        
        //    95: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //    98: aload_0        
        //    99: getfield        com/twitter/library/media/player/InlineVideoView.E:Landroid/media/MediaPlayer$OnCompletionListener;
        //   102: invokevirtual   android/media/MediaPlayer.setOnCompletionListener:(Landroid/media/MediaPlayer$OnCompletionListener;)V
        //   105: aload_0        
        //   106: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //   109: aload_0        
        //   110: getfield        com/twitter/library/media/player/InlineVideoView.F:Landroid/media/MediaPlayer$OnErrorListener;
        //   113: invokevirtual   android/media/MediaPlayer.setOnErrorListener:(Landroid/media/MediaPlayer$OnErrorListener;)V
        //   116: aload_0        
        //   117: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //   120: aload_0        
        //   121: getfield        com/twitter/library/media/player/InlineVideoView.G:Landroid/media/MediaPlayer$OnBufferingUpdateListener;
        //   124: invokevirtual   android/media/MediaPlayer.setOnBufferingUpdateListener:(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
        //   127: aload_0        
        //   128: iconst_0       
        //   129: putfield        com/twitter/library/media/player/InlineVideoView.k:I
        //   132: aload_0        
        //   133: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //   136: aload_0        
        //   137: getfield        com/twitter/library/media/player/InlineVideoView.v:Landroid/content/Context;
        //   140: aload_0        
        //   141: getfield        com/twitter/library/media/player/InlineVideoView.s:Landroid/net/Uri;
        //   144: aload_0        
        //   145: getfield        com/twitter/library/media/player/InlineVideoView.t:Ljava/util/Map;
        //   148: invokevirtual   android/media/MediaPlayer.setDataSource:(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V
        //   151: aload_0        
        //   152: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //   155: aload_0        
        //   156: getfield        com/twitter/library/media/player/InlineVideoView.d:Landroid/view/Surface;
        //   159: invokevirtual   android/media/MediaPlayer.setSurface:(Landroid/view/Surface;)V
        //   162: aload_0        
        //   163: iconst_1       
        //   164: invokevirtual   com/twitter/library/media/player/InlineVideoView.setKeepScreenOn:(Z)V
        //   167: aload_0        
        //   168: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //   171: iconst_3       
        //   172: invokevirtual   android/media/MediaPlayer.setAudioStreamType:(I)V
        //   175: aload_0        
        //   176: getfield        com/twitter/library/media/player/InlineVideoView.A:Z
        //   179: ifeq            191
        //   182: aload_0        
        //   183: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //   186: fconst_0       
        //   187: fconst_0       
        //   188: invokevirtual   android/media/MediaPlayer.setVolume:(FF)V
        //   191: aload_0        
        //   192: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //   195: invokevirtual   android/media/MediaPlayer.prepareAsync:()V
        //   198: aload_0        
        //   199: iconst_1       
        //   200: putfield        com/twitter/library/media/player/InlineVideoView.q:I
        //   203: aload_0        
        //   204: invokespecial   com/twitter/library/media/player/InlineVideoView.h:()V
        //   207: aload_1        
        //   208: monitorexit    
        //   209: return         
        //   210: astore_2       
        //   211: aload_1        
        //   212: monitorexit    
        //   213: aload_2        
        //   214: athrow         
        //   215: astore          5
        //   217: getstatic       com/twitter/library/media/player/InlineVideoView.a:Ljava/lang/String;
        //   220: new             Ljava/lang/StringBuilder;
        //   223: dup            
        //   224: invokespecial   java/lang/StringBuilder.<init>:()V
        //   227: ldc_w           "Unable to open content "
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: aload_0        
        //   234: getfield        com/twitter/library/media/player/InlineVideoView.s:Landroid/net/Uri;
        //   237: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   240: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   243: aload           5
        //   245: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   248: pop            
        //   249: aload_0        
        //   250: iconst_m1      
        //   251: putfield        com/twitter/library/media/player/InlineVideoView.q:I
        //   254: aload_0        
        //   255: iconst_m1      
        //   256: putfield        com/twitter/library/media/player/InlineVideoView.r:I
        //   259: aload_0        
        //   260: getfield        com/twitter/library/media/player/InlineVideoView.F:Landroid/media/MediaPlayer$OnErrorListener;
        //   263: aload_0        
        //   264: getfield        com/twitter/library/media/player/InlineVideoView.e:Landroid/media/MediaPlayer;
        //   267: iconst_1       
        //   268: iconst_0       
        //   269: invokeinterface android/media/MediaPlayer$OnErrorListener.onError:(Landroid/media/MediaPlayer;II)Z
        //   274: pop            
        //   275: goto            207
        //   278: astore          5
        //   280: goto            217
        //   283: astore          5
        //   285: goto            217
        //   288: astore          5
        //   290: goto            217
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  7      21     210    215    Any
        //  21     23     210    215    Any
        //  24     56     210    215    Any
        //  56     191    215    217    Ljava/io/IOException;
        //  56     191    288    293    Ljava/lang/IllegalArgumentException;
        //  56     191    278    283    Ljava/lang/IllegalStateException;
        //  56     191    283    288    Ljava/lang/SecurityException;
        //  56     191    210    215    Any
        //  191    207    215    217    Ljava/io/IOException;
        //  191    207    288    293    Ljava/lang/IllegalArgumentException;
        //  191    207    278    283    Ljava/lang/IllegalStateException;
        //  191    207    283    288    Ljava/lang/SecurityException;
        //  191    207    210    215    Any
        //  207    209    210    215    Any
        //  211    213    210    215    Any
        //  217    275    210    215    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0191:
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
    
    private void h() {
        if (this.e != null && this.h != null) {
            this.h.setMediaPlayer((MediaController$MediaPlayerControl)this);
            Object anchorView;
            if (this.getParent() instanceof View) {
                anchorView = this.getParent();
            }
            else {
                anchorView = this;
            }
            this.h.setAnchorView((View)anchorView);
            this.h.setEnabled(this.d());
        }
    }
    
    private void i() {
        if (this.h.isShowing()) {
            this.h.hide();
            return;
        }
        this.h.show();
    }
    
    private void setVideoURI(final Uri uri) {
        this.a(uri, null);
    }
    
    public void a() {
        this.b(true);
    }
    
    public void a(final Uri s, final Map t) {
        this.s = s;
        this.t = t;
        this.m = 0;
        this.g();
        this.requestLayout();
        this.invalidate();
    }
    
    public void a(final boolean b) {
        if (b || !this.y) {
            this.y = true;
            this.g();
        }
    }
    
    public boolean b() {
        return this.q == 4;
    }
    
    public void c() {
        this.B = !this.A;
        this.setMute(this.A);
        this.start();
    }
    
    public boolean canPause() {
        return this.n;
    }
    
    public boolean canSeekBackward() {
        return this.o;
    }
    
    public boolean canSeekForward() {
        return this.p;
    }
    
    public boolean d() {
        return this.e != null && this.q != -1 && this.q != 0 && this.q != 1;
    }
    
    public AttributeSet getAttributes() {
        return this.x;
    }
    
    public int getAudioSessionId() {
        return this.hashCode() % 10;
    }
    
    public int getBufferPercentage() {
        if (this.e != null) {
            return this.k;
        }
        return 0;
    }
    
    public int getCurrentPosition() {
        try {
            if (this.d() && this.e != null) {
                return this.e.getCurrentPosition();
            }
        }
        catch (Exception ex) {
            return -1;
        }
        return 0;
    }
    
    public int getDuration() {
        if (!this.d()) {
            return this.u = -1;
        }
        if (this.u > 0) {
            return this.u;
        }
        return this.u = this.e.getDuration();
    }
    
    public String getPath() {
        return this.w;
    }
    
    public boolean isPlaying() {
        return this.d() && this.e.isPlaying();
    }
    
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        }
        catch (Exception ex2) {
            SurfaceTexture surfaceTexture = null;
            boolean b = true;
            try {
                surfaceTexture = this.getSurfaceTexture();
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                Log.w(InlineVideoView.a, "Failed to detach from window: " + b + ", " + surfaceTexture);
            }
            catch (Exception ex) {
                Log.w(InlineVideoView.a, "Failed to release", (Throwable)ex);
                b = false;
            }
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)InlineVideoView.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)InlineVideoView.class.getName());
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        boolean b;
        if (n != 4 && n != 24 && n != 25 && n != 164 && n != 82 && n != 5 && n != 6) {
            b = true;
        }
        else {
            b = false;
        }
        if (this.d() && b && this.h != null) {
            if (n == 79 || n == 85) {
                if (!this.e.isPlaying()) {
                    this.start();
                    this.h.hide();
                    return true;
                }
                this.pause();
                this.h.show();
            }
            else if (n == 126) {
                if (!this.e.isPlaying()) {
                    this.start();
                    this.h.hide();
                    return true;
                }
            }
            else {
                if (n != 86 && n != 127) {
                    this.i();
                    return super.onKeyDown(n, keyEvent);
                }
                if (this.e.isPlaying()) {
                    this.pause();
                    this.h.show();
                    return true;
                }
            }
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    protected void onMeasure(final int n, final int n2) {
        int defaultSize = getDefaultSize(this.b, n);
        int defaultSize2 = getDefaultSize(this.c, n2);
        if (this.b > 0 && this.c > 0) {
            if (defaultSize2 * this.b > defaultSize * this.c) {
                defaultSize2 = defaultSize * this.c / this.b;
            }
            else if (defaultSize2 * this.b < defaultSize * this.c) {
                defaultSize = defaultSize2 * this.b / this.c;
            }
        }
        this.setMeasuredDimension(defaultSize, defaultSize2);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.d() && this.h != null) {
            this.i();
        }
        return false;
    }
    
    public boolean onTrackballEvent(final MotionEvent motionEvent) {
        if (this.d() && this.h != null) {
            this.i();
        }
        return false;
    }
    
    public void pause() {
        if (this.d() && this.e.isPlaying()) {
            this.e.pause();
            this.q = 4;
        }
        this.r = 4;
    }
    
    public void seekTo(final int m) {
        if (this.d()) {
            this.e.seekTo(m);
            this.m = 0;
            return;
        }
        this.m = m;
    }
    
    public void setMute(final boolean a) {
        this.A = a;
        if (this.d() && this.B != this.A) {
            if (this.A) {
                this.e.setVolume(0.0f, 0.0f);
            }
            else {
                this.e.setVolume(1.0f, 1.0f);
            }
        }
        this.B = this.A;
    }
    
    public void setOnCompletionListener(final MediaPlayer$OnCompletionListener i) {
        this.i = i;
    }
    
    public void setOnErrorListener(final MediaPlayer$OnErrorListener l) {
        this.l = l;
    }
    
    public void setOnPreparedListener(final MediaPlayer$OnPreparedListener j) {
        this.j = j;
    }
    
    public void setVideoPath(final String w) {
        this.w = w;
        this.setVideoURI(Uri.parse(w));
    }
    
    public void start() {
        if (this.getVisibility() != 0) {
            this.setVisibility(0);
        }
        if (this.d()) {
            this.e.start();
            this.q = 3;
        }
        this.r = 3;
    }
}
