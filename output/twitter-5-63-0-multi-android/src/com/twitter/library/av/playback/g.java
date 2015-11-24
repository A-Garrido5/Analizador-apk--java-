// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.av.model.a;
import com.twitter.library.av.l;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.net.Uri;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.twitter.library.client.App;
import java.lang.ref.WeakReference;
import android.os.Handler;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnInfoListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;

public class g extends ax implements MediaPlayer$OnCompletionListener, MediaPlayer$OnErrorListener, MediaPlayer$OnInfoListener, MediaPlayer$OnPreparedListener, MediaPlayer$OnSeekCompleteListener, MediaPlayer$OnVideoSizeChangedListener
{
    private static final boolean l;
    MediaPlayer a;
    private Handler m;
    private WeakReference n;
    private WeakReference o;
    private final int[] p;
    private int q;
    private String r;
    private int s;
    
    static {
        l = (App.l() && Log.isLoggable("AVMediaPlayerCompat", 3));
    }
    
    public g(final f f) {
        super(f);
        this.n = new WeakReference(null);
        this.o = new WeakReference(null);
        this.p = new int[0];
        this.m = new Handler(Looper.getMainLooper());
    }
    
    private void a() {
        if (this.v() == AVMediaPlayer$PlayerState.f) {
            this.a.seekTo(this.a.getCurrentPosition());
        }
    }
    
    private void a(final g g) {
        if (this.a != null) {
            this.a.setOnPreparedListener((MediaPlayer$OnPreparedListener)g);
            this.a.setOnVideoSizeChangedListener((MediaPlayer$OnVideoSizeChangedListener)g);
            this.a.setOnCompletionListener((MediaPlayer$OnCompletionListener)g);
            this.a.setOnErrorListener((MediaPlayer$OnErrorListener)g);
            this.a.setOnInfoListener((MediaPlayer$OnInfoListener)g);
            this.a.setOnSeekCompleteListener((MediaPlayer$OnSeekCompleteListener)g);
        }
    }
    
    private void a(final Exception ex) {
        final String format = String.format("Unable to open content %s %s", this.g, ex.getMessage());
        if (g.l) {
            Log.e("AVMediaPlayerCompat", format);
        }
        this.a(AVMediaPlayer$PlayerState.a);
        this.b(AVMediaPlayer$PlayerState.a);
        this.a(this.a, 1, 0, format);
    }
    
    private MediaPlayer b() {
        return (MediaPlayer)new h(this).a(this.m, 10);
    }
    
    private void b(final Context context) {
        if (this.h != null) {
            this.a.setDataSource(context, Uri.parse(this.g), this.h);
            return;
        }
        this.a.setDataSource(context, Uri.parse(this.g));
    }
    
    public void a(final float n) {
        if (this.a != null) {
            this.a.setVolume(n, n);
        }
    }
    
    @Override
    protected void a(final int n) {
        this.a.seekTo(n);
    }
    
    @Override
    protected void a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       5
        //     4: return         
        //     5: aload_0        
        //     6: getfield        com/twitter/library/av/playback/g.p:[I
        //     9: astore_2       
        //    10: aload_2        
        //    11: monitorenter   
        //    12: aload_0        
        //    13: iconst_0       
        //    14: invokevirtual   com/twitter/library/av/playback/g.a:(Z)V
        //    17: aload_0        
        //    18: aload_0        
        //    19: invokespecial   com/twitter/library/av/playback/g.b:()Landroid/media/MediaPlayer;
        //    22: putfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    25: aload_0        
        //    26: aload_0        
        //    27: invokespecial   com/twitter/library/av/playback/g.a:(Lcom/twitter/library/av/playback/g;)V
        //    30: aload_0        
        //    31: aload_1        
        //    32: invokespecial   com/twitter/library/av/playback/g.b:(Landroid/content/Context;)V
        //    35: invokestatic    com/twitter/library/util/bq.a:()Z
        //    38: ifeq            98
        //    41: aload_0        
        //    42: getfield        com/twitter/library/av/playback/g.n:Ljava/lang/ref/WeakReference;
        //    45: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //    48: ifnull          68
        //    51: aload_0        
        //    52: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    55: aload_0        
        //    56: getfield        com/twitter/library/av/playback/g.n:Ljava/lang/ref/WeakReference;
        //    59: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //    62: checkcast       Landroid/view/Surface;
        //    65: invokevirtual   android/media/MediaPlayer.setSurface:(Landroid/view/Surface;)V
        //    68: aload_0        
        //    69: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    72: iconst_3       
        //    73: invokevirtual   android/media/MediaPlayer.setAudioStreamType:(I)V
        //    76: aload_0        
        //    77: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    80: invokevirtual   android/media/MediaPlayer.prepareAsync:()V
        //    83: aload_0        
        //    84: getstatic       com/twitter/library/av/playback/AVMediaPlayer$PlayerState.c:Lcom/twitter/library/av/playback/AVMediaPlayer$PlayerState;
        //    87: invokevirtual   com/twitter/library/av/playback/g.a:(Lcom/twitter/library/av/playback/AVMediaPlayer$PlayerState;)V
        //    90: aload_2        
        //    91: monitorexit    
        //    92: return         
        //    93: astore_3       
        //    94: aload_2        
        //    95: monitorexit    
        //    96: aload_3        
        //    97: athrow         
        //    98: aload_0        
        //    99: getfield        com/twitter/library/av/playback/g.o:Ljava/lang/ref/WeakReference;
        //   102: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //   105: ifnull          68
        //   108: aload_0        
        //   109: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //   112: aload_0        
        //   113: getfield        com/twitter/library/av/playback/g.o:Ljava/lang/ref/WeakReference;
        //   116: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //   119: checkcast       Landroid/view/SurfaceHolder;
        //   122: invokevirtual   android/media/MediaPlayer.setDisplay:(Landroid/view/SurfaceHolder;)V
        //   125: aload_0        
        //   126: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //   129: iconst_1       
        //   130: invokevirtual   android/media/MediaPlayer.setScreenOnWhilePlaying:(Z)V
        //   133: goto            68
        //   136: astore          4
        //   138: aload_0        
        //   139: aload           4
        //   141: invokespecial   com/twitter/library/av/playback/g.a:(Ljava/lang/Exception;)V
        //   144: goto            90
        //   147: astore          4
        //   149: goto            138
        //   152: astore          4
        //   154: goto            138
        //   157: astore          4
        //   159: goto            138
        //   162: astore          4
        //   164: goto            138
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     17     93     98     Any
        //  17     68     136    138    Ljava/io/IOException;
        //  17     68     162    167    Ljava/lang/IllegalArgumentException;
        //  17     68     152    157    Ljava/lang/IllegalStateException;
        //  17     68     157    162    Ljava/lang/SecurityException;
        //  17     68     147    152    Ljava/lang/InterruptedException;
        //  17     68     93     98     Any
        //  68     90     136    138    Ljava/io/IOException;
        //  68     90     162    167    Ljava/lang/IllegalArgumentException;
        //  68     90     152    157    Ljava/lang/IllegalStateException;
        //  68     90     157    162    Ljava/lang/SecurityException;
        //  68     90     147    152    Ljava/lang/InterruptedException;
        //  68     90     93     98     Any
        //  90     92     93     98     Any
        //  94     96     93     98     Any
        //  98     133    136    138    Ljava/io/IOException;
        //  98     133    162    167    Ljava/lang/IllegalArgumentException;
        //  98     133    152    157    Ljava/lang/IllegalStateException;
        //  98     133    157    162    Ljava/lang/SecurityException;
        //  98     133    147    152    Ljava/lang/InterruptedException;
        //  98     133    93     98     Any
        //  138    144    93     98     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    public void a(final SurfaceHolder display) {
        this.o = new WeakReference((T)display);
        if (this.a != null) {
            this.a.setDisplay(display);
            this.a();
        }
    }
    
    public boolean a(final MediaPlayer mediaPlayer, final int q, final int s, String format) {
        final int s2 = this.s;
        this.s = s;
        if (format == null) {
            format = String.format("Error: %d, %d", q, s);
        }
        if (g.l) {
            Log.e("AVMediaPlayerCompat", format);
        }
        this.a(AVMediaPlayer$PlayerState.a);
        this.b(AVMediaPlayer$PlayerState.a);
        this.b(false);
        if (s2 == s) {
            return true;
        }
        if (this.c != null) {
            this.c.a(q, format);
            return true;
        }
        this.q = q;
        this.r = format;
        return true;
    }
    
    public void b(final Surface surface) {
        this.n = new WeakReference((T)surface);
        if (this.a != null) {
            this.a.setSurface(surface);
            this.a();
        }
    }
    
    @Override
    protected int d() {
        return this.a.getVideoWidth();
    }
    
    @Override
    protected int e() {
        return this.a.getVideoHeight();
    }
    
    @Override
    protected long f() {
        return this.a.getDuration();
    }
    
    @Override
    protected long g() {
        return this.a.getCurrentPosition();
    }
    
    @Override
    protected int h() {
        return this.q;
    }
    
    @Override
    protected String i() {
        return this.r;
    }
    
    @Override
    protected boolean j() {
        return this.a != null;
    }
    
    @Override
    protected void k() {
        this.a.start();
    }
    
    @Override
    protected void l() {
        this.a.pause();
    }
    
    @Override
    protected void m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        com/twitter/library/av/playback/g.p:[I
        //     6: astore_2       
        //     7: aload_2        
        //     8: monitorenter   
        //     9: aload_0        
        //    10: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    13: ifnull          61
        //    16: aload_0        
        //    17: aconst_null    
        //    18: invokespecial   com/twitter/library/av/playback/g.a:(Lcom/twitter/library/av/playback/g;)V
        //    21: aload_0        
        //    22: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    25: invokevirtual   android/media/MediaPlayer.isPlaying:()Z
        //    28: ifeq            38
        //    31: aload_0        
        //    32: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    35: invokevirtual   android/media/MediaPlayer.stop:()V
        //    38: new             Lcom/twitter/library/av/playback/i;
        //    41: dup            
        //    42: aload_0        
        //    43: getfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    46: invokespecial   com/twitter/library/av/playback/i.<init>:(Landroid/media/MediaPlayer;)V
        //    49: iconst_0       
        //    50: anewarray       Ljava/lang/Void;
        //    53: invokevirtual   com/twitter/library/av/playback/i.a:([Ljava/lang/Object;)V
        //    56: aload_0        
        //    57: aconst_null    
        //    58: putfield        com/twitter/library/av/playback/g.a:Landroid/media/MediaPlayer;
        //    61: aload_2        
        //    62: monitorexit    
        //    63: aload_0        
        //    64: monitorexit    
        //    65: return         
        //    66: astore_3       
        //    67: aload_2        
        //    68: monitorexit    
        //    69: aload_3        
        //    70: athrow         
        //    71: astore_1       
        //    72: aload_0        
        //    73: monitorexit    
        //    74: aload_1        
        //    75: athrow         
        //    76: astore          4
        //    78: goto            38
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      9      71     76     Any
        //  9      21     66     71     Any
        //  21     38     76     81     Ljava/lang/IllegalStateException;
        //  21     38     66     71     Any
        //  38     61     66     71     Any
        //  61     63     66     71     Any
        //  67     69     66     71     Any
        //  69     71     71     76     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    protected void n() {
        this.a(this.i);
        if (this.c != null) {
            this.c.a(this.i);
        }
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        this.a(AVMediaPlayer$PlayerState.g);
        this.b(true);
        if (this.d != null) {
            this.d.onCompletion(this.a);
        }
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        return this.a(mediaPlayer, n, n2, null);
    }
    
    public boolean onInfo(final MediaPlayer mediaPlayer, final int n, final int n2) {
        if (this.e != null) {
            if (n == 701) {
                this.e.b();
            }
            else if (n == 702) {
                this.e.a();
            }
        }
        final l c = this.c;
        boolean b = false;
        if (c != null) {
            this.c.b(n, n2);
            b = true;
        }
        return b;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        this.a(AVMediaPlayer$PlayerState.d);
        if (this.c != null) {
            this.c.a(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight(), false, false);
        }
        if (this.v() != AVMediaPlayer$PlayerState.e && this.w() == AVMediaPlayer$PlayerState.e) {
            this.a(null, false);
        }
    }
    
    public void onSeekComplete(final MediaPlayer mediaPlayer) {
        if (this.e != null && this.x()) {
            this.e.a();
        }
    }
    
    public void onVideoSizeChanged(final MediaPlayer mediaPlayer, final int n, final int n2) {
        if (this.c != null) {
            this.c.a(n, n2);
        }
    }
}
