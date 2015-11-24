// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import android.graphics.Bitmap$Config;
import com.twitter.library.media.decoder.ImageDecoder;
import android.graphics.Bitmap;
import java.io.File;
import com.twitter.library.util.ak;
import java.util.concurrent.ExecutorService;
import java.lang.ref.WeakReference;
import android.os.Handler;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.model.m;
import android.content.Context;
import java.lang.ref.Reference;
import com.twitter.library.media.manager.g;
import com.twitter.library.media.manager.f;

class cc implements f, g, Runnable
{
    final Reference a;
    private final Context b;
    private final m c;
    private final Size d;
    private final Handler e;
    private final WeakReference f;
    private final WeakReference g;
    private final ExecutorService h;
    
    public cc(final Context context, final m c, final Size d, final bz bz, final Handler e, final ak ak, final Reference a, final ExecutorService h) {
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new WeakReference((T)bz);
        this.g = new WeakReference((T)ak);
        this.a = a;
        this.h = h;
    }
    
    public Bitmap a(final File file) {
        return ImageDecoder.a(file).a(Bitmap$Config.RGB_565).b();
    }
    
    public boolean a(final Bitmap bitmap, final OutputStream outputStream) {
        return bitmap.compress(Bitmap$CompressFormat.JPEG, 90, outputStream);
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/android/widget/cc.a:Ljava/lang/ref/Reference;
        //     4: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //     7: ifnonnull       11
        //    10: return         
        //    11: aload_0        
        //    12: getfield        com/twitter/android/widget/cc.b:Landroid/content/Context;
        //    15: invokestatic    com/twitter/android/widget/bz.a:(Landroid/content/Context;)Lcom/twitter/library/media/manager/a;
        //    18: astore_1       
        //    19: new             Ljava/lang/StringBuilder;
        //    22: dup            
        //    23: invokespecial   java/lang/StringBuilder.<init>:()V
        //    26: aload_0        
        //    27: getfield        com/twitter/android/widget/cc.c:Lcom/twitter/library/media/model/m;
        //    30: getfield        com/twitter/library/media/model/m.b:J
        //    33: bipush          36
        //    35: invokestatic    java/lang/Long.toString:(JI)Ljava/lang/String;
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: ldc             "_"
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: aload_0        
        //    47: getfield        com/twitter/android/widget/cc.d:Lcom/twitter/internal/android/util/Size;
        //    50: invokevirtual   com/twitter/internal/android/util/Size.a:()I
        //    53: bipush          36
        //    55: invokestatic    java/lang/Integer.toString:(II)Ljava/lang/String;
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: ldc             "_"
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    66: aload_0        
        //    67: getfield        com/twitter/android/widget/cc.d:Lcom/twitter/internal/android/util/Size;
        //    70: invokevirtual   com/twitter/internal/android/util/Size.b:()I
        //    73: bipush          36
        //    75: invokestatic    java/lang/Integer.toString:(II)Ljava/lang/String;
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    84: astore_2       
        //    85: aload_1        
        //    86: aload_2        
        //    87: aload_0        
        //    88: invokevirtual   com/twitter/library/media/manager/a.a:(Ljava/lang/String;Lcom/twitter/library/media/manager/f;)Ljava/lang/Object;
        //    91: checkcast       Landroid/graphics/Bitmap;
        //    94: astore          4
        //    96: aload_0        
        //    97: getfield        com/twitter/android/widget/cc.c:Lcom/twitter/library/media/model/m;
        //   100: ldc             "gallery"
        //   102: invokevirtual   com/twitter/library/media/model/m.a:(Ljava/lang/String;)Lcom/twitter/library/media/model/EditableMedia;
        //   105: astore          5
        //   107: aload           5
        //   109: ifnull          10
        //   112: aload           4
        //   114: ifnonnull       320
        //   117: aload_0        
        //   118: getfield        com/twitter/android/widget/cc.b:Landroid/content/Context;
        //   121: invokestatic    com/twitter/library/media/manager/q.a:(Landroid/content/Context;)Lcom/twitter/library/media/manager/q;
        //   124: aload           5
        //   126: getfield        com/twitter/library/media/model/EditableMedia.mediaFile:Lcom/twitter/library/media/model/MediaFile;
        //   129: invokestatic    com/twitter/library/media/manager/j.a:(Lcom/twitter/library/media/model/MediaFile;)Lcom/twitter/library/media/manager/k;
        //   132: aload_0        
        //   133: getfield        com/twitter/android/widget/cc.d:Lcom/twitter/internal/android/util/Size;
        //   136: invokevirtual   com/twitter/library/media/manager/k.a:(Lcom/twitter/internal/android/util/Size;)Lcom/twitter/library/media/manager/k;
        //   139: invokevirtual   com/twitter/library/media/manager/q.a:(Lcom/twitter/library/media/manager/k;)Ljava/util/concurrent/Future;
        //   142: astore          10
        //   144: aload           10
        //   146: invokestatic    com/twitter/util/concurrent/g.a:(Ljava/util/concurrent/Future;)Ljava/lang/Object;
        //   149: checkcast       Lcom/twitter/library/media/manager/p;
        //   152: astore          14
        //   154: aload           14
        //   156: ifnull          306
        //   159: aload           14
        //   161: invokevirtual   com/twitter/library/media/manager/p.c:()Ljava/lang/Object;
        //   164: checkcast       Landroid/graphics/Bitmap;
        //   167: astore          12
        //   169: aload           12
        //   171: ifnull          196
        //   174: aload_0        
        //   175: getfield        com/twitter/android/widget/cc.h:Ljava/util/concurrent/ExecutorService;
        //   178: new             Lcom/twitter/android/widget/cd;
        //   181: dup            
        //   182: aload_0        
        //   183: aload_1        
        //   184: aload_2        
        //   185: aload           12
        //   187: invokespecial   com/twitter/android/widget/cd.<init>:(Lcom/twitter/android/widget/cc;Lcom/twitter/library/media/manager/a;Ljava/lang/String;Landroid/graphics/Bitmap;)V
        //   190: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
        //   195: pop            
        //   196: aload           12
        //   198: astore          6
        //   200: aload_0        
        //   201: getfield        com/twitter/android/widget/cc.g:Ljava/lang/ref/WeakReference;
        //   204: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //   207: checkcast       Lcom/twitter/library/util/ak;
        //   210: astore          7
        //   212: aload           7
        //   214: ifnull          251
        //   217: aload           6
        //   219: ifnull          251
        //   222: aload           7
        //   224: aload_0        
        //   225: getfield        com/twitter/android/widget/cc.c:Lcom/twitter/library/media/model/m;
        //   228: getfield        com/twitter/library/media/model/m.b:J
        //   231: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   234: new             Lcom/twitter/android/widget/cq;
        //   237: dup            
        //   238: aload           6
        //   240: aload           5
        //   242: invokespecial   com/twitter/android/widget/cq.<init>:(Landroid/graphics/Bitmap;Lcom/twitter/library/media/model/EditableMedia;)V
        //   245: invokeinterface com/twitter/library/util/ak.a:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   250: pop            
        //   251: aload_0        
        //   252: getfield        com/twitter/android/widget/cc.a:Ljava/lang/ref/Reference;
        //   255: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //   258: ifnull          10
        //   261: aload_0        
        //   262: getfield        com/twitter/android/widget/cc.f:Ljava/lang/ref/WeakReference;
        //   265: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //   268: ifnull          10
        //   271: aload_0        
        //   272: getfield        com/twitter/android/widget/cc.e:Landroid/os/Handler;
        //   275: new             Lcom/twitter/android/widget/ch;
        //   278: dup            
        //   279: aload_0        
        //   280: getfield        com/twitter/android/widget/cc.f:Ljava/lang/ref/WeakReference;
        //   283: aload           5
        //   285: aload           6
        //   287: invokespecial   com/twitter/android/widget/ch.<init>:(Ljava/lang/ref/WeakReference;Lcom/twitter/library/media/model/EditableMedia;Landroid/graphics/Bitmap;)V
        //   290: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   293: pop            
        //   294: return         
        //   295: astore_3       
        //   296: aload_3        
        //   297: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //   300: aconst_null    
        //   301: astore          4
        //   303: goto            96
        //   306: aconst_null    
        //   307: astore          12
        //   309: goto            169
        //   312: astore          11
        //   314: aconst_null    
        //   315: astore          12
        //   317: goto            169
        //   320: aload           4
        //   322: astore          6
        //   324: goto            200
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  85     96     295    306    Ljava/lang/Exception;
        //  144    154    312    320    Ljava/lang/Exception;
        //  159    169    312    320    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0169:
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
}
