// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import java.util.Collection;
import java.util.ArrayList;
import android.net.Uri;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.media.manager.k;
import com.twitter.library.api.bh;
import android.content.res.ColorStateList;
import com.twitter.android.WidgetSettingsActivity;
import android.appwidget.AppWidgetManager;
import com.twitter.library.api.PromotedContent;
import android.content.res.Resources;
import com.twitter.library.provider.ae;
import com.twitter.android.TweetActivity;
import com.twitter.library.util.bk;
import com.twitter.library.api.UrlEntity;
import android.text.SpannableStringBuilder;
import android.graphics.Bitmap;
import com.twitter.android.composer.au;
import android.app.PendingIntent;
import com.twitter.library.client.az;
import com.twitter.android.util.aj;
import android.os.Parcelable;
import com.twitter.android.MainActivity;
import com.twitter.android.DispatchActivity;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.library.api.TwitterUser;
import java.util.Iterator;
import com.twitter.library.provider.Tweet;
import com.twitter.util.SynchronizedDateFormat;
import com.twitter.library.client.App;
import com.twitter.library.media.manager.q;
import java.util.concurrent.atomic.AtomicBoolean;
import android.text.style.TextAppearanceSpan;
import java.text.SimpleDateFormat;
import android.widget.RemoteViews;
import android.content.Context;
import android.widget.RemoteViewsService$RemoteViewsFactory;

public class ci implements RemoteViewsService$RemoteViewsFactory
{
    private final Context a;
    private final ch[] b;
    private WidgetControl$WidgetList c;
    private int d;
    private WidgetControl e;
    private long f;
    private String g;
    
    public ci(final Context a, final int d, final long f, final String g) {
        this.b = new ch[20];
        this.a = a;
        this.d = d;
        this.f = f;
        this.g = g;
        this.e = cj.a(a).a(f);
    }
    
    public int getCount() {
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    public RemoteViews getLoadingView() {
        return null;
    }
    
    public RemoteViews getViewAt(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/android/client/ci.c:Lcom/twitter/android/client/WidgetControl$WidgetList;
        //     4: ifnull          18
        //     7: aload_0        
        //     8: getfield        com/twitter/android/client/ci.c:Lcom/twitter/android/client/WidgetControl$WidgetList;
        //    11: invokevirtual   com/twitter/android/client/WidgetControl$WidgetList.size:()I
        //    14: iload_1        
        //    15: if_icmpgt       20
        //    18: aconst_null    
        //    19: areturn        
        //    20: aload_0        
        //    21: getfield        com/twitter/android/client/ci.c:Lcom/twitter/android/client/WidgetControl$WidgetList;
        //    24: iload_1        
        //    25: invokevirtual   com/twitter/android/client/WidgetControl$WidgetList.get:(I)Ljava/lang/Object;
        //    28: checkcast       Lcom/twitter/library/provider/Tweet;
        //    31: astore_2       
        //    32: aload_0        
        //    33: getfield        com/twitter/android/client/ci.b:[Lcom/twitter/android/client/ch;
        //    36: astore_3       
        //    37: aload_3        
        //    38: monitorenter   
        //    39: aload_0        
        //    40: getfield        com/twitter/android/client/ci.b:[Lcom/twitter/android/client/ch;
        //    43: iload_1        
        //    44: aaload         
        //    45: ifnonnull       77
        //    48: aload_0        
        //    49: getfield        com/twitter/android/client/ci.b:[Lcom/twitter/android/client/ch;
        //    52: iload_1        
        //    53: new             Lcom/twitter/android/client/ch;
        //    56: dup            
        //    57: new             Landroid/widget/RemoteViews;
        //    60: dup            
        //    61: aload_0        
        //    62: getfield        com/twitter/android/client/ci.a:Landroid/content/Context;
        //    65: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    68: ldc             2130969083
        //    70: invokespecial   android/widget/RemoteViews.<init>:(Ljava/lang/String;I)V
        //    73: invokespecial   com/twitter/android/client/ch.<init>:(Landroid/widget/RemoteViews;)V
        //    76: aastore        
        //    77: aload_0        
        //    78: getfield        com/twitter/android/client/ci.b:[Lcom/twitter/android/client/ch;
        //    81: iload_1        
        //    82: aaload         
        //    83: aload_2        
        //    84: putfield        com/twitter/android/client/ch.b:Lcom/twitter/library/provider/Tweet;
        //    87: aload_0        
        //    88: getfield        com/twitter/android/client/ci.b:[Lcom/twitter/android/client/ch;
        //    91: iload_1        
        //    92: aaload         
        //    93: getfield        com/twitter/android/client/ch.a:Landroid/widget/RemoteViews;
        //    96: astore          5
        //    98: aload_3        
        //    99: monitorexit    
        //   100: aload_0        
        //   101: getfield        com/twitter/android/client/ci.e:Lcom/twitter/android/client/WidgetControl;
        //   104: invokevirtual   com/twitter/android/client/WidgetControl.c:()Lcom/twitter/library/media/manager/q;
        //   107: astore          6
        //   109: aload_2        
        //   110: getfield        com/twitter/library/provider/Tweet.B:Ljava/lang/String;
        //   113: iconst_m1      
        //   114: invokestatic    com/twitter/library/media/manager/UserImageRequest.a:(Ljava/lang/String;I)Lcom/twitter/library/media/manager/k;
        //   117: astore          7
        //   119: aload           6
        //   121: aload           7
        //   123: invokevirtual   com/twitter/library/media/manager/q.a:(Lcom/twitter/library/media/manager/k;)Ljava/util/concurrent/Future;
        //   126: invokestatic    com/twitter/util/concurrent/g.a:(Ljava/util/concurrent/Future;)Ljava/lang/Object;
        //   129: checkcast       Lcom/twitter/library/media/manager/p;
        //   132: astore          10
        //   134: aload           10
        //   136: ifnull          227
        //   139: aload           10
        //   141: invokevirtual   com/twitter/library/media/manager/p.c:()Ljava/lang/Object;
        //   144: checkcast       Landroid/graphics/Bitmap;
        //   147: astore          11
        //   149: aload           11
        //   151: astore          9
        //   153: aload_0        
        //   154: getfield        com/twitter/android/client/ci.a:Landroid/content/Context;
        //   157: aload           5
        //   159: aload_2        
        //   160: aload           9
        //   162: aload_0        
        //   163: getfield        com/twitter/android/client/ci.f:J
        //   166: aload_0        
        //   167: getfield        com/twitter/android/client/ci.g:Ljava/lang/String;
        //   170: invokestatic    com/twitter/android/client/WidgetControl.a:(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/twitter/library/provider/Tweet;Landroid/graphics/Bitmap;JLjava/lang/String;)V
        //   173: aload           5
        //   175: ldc             2131886305
        //   177: new             Landroid/content/Intent;
        //   180: dup            
        //   181: invokespecial   android/content/Intent.<init>:()V
        //   184: aload_2        
        //   185: getfield        com/twitter/library/provider/Tweet.E:J
        //   188: aload_0        
        //   189: getfield        com/twitter/android/client/ci.f:J
        //   192: invokestatic    com/twitter/library/provider/ae.a:(JJ)Landroid/net/Uri;
        //   195: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   198: ldc             "AbsFragmentActivity_account_name"
        //   200: aload_0        
        //   201: getfield        com/twitter/android/client/ci.g:Ljava/lang/String;
        //   204: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   207: ldc             "ref_event"
        //   209: ldc             "widget::::click"
        //   211: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   214: invokevirtual   android/widget/RemoteViews.setOnClickFillInIntent:(ILandroid/content/Intent;)V
        //   217: aload           5
        //   219: areturn        
        //   220: astore          4
        //   222: aload_3        
        //   223: monitorexit    
        //   224: aload           4
        //   226: athrow         
        //   227: aconst_null    
        //   228: astore          11
        //   230: goto            149
        //   233: astore          8
        //   235: aconst_null    
        //   236: astore          9
        //   238: goto            153
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  39     77     220    227    Any
        //  77     100    220    227    Any
        //  119    134    233    241    Ljava/lang/Throwable;
        //  139    149    233    241    Ljava/lang/Throwable;
        //  222    224    220    227    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0149:
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
    
    public int getViewTypeCount() {
        return 1;
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    public void onCreate() {
        if (this.e != null) {
            this.c = new WidgetControl$WidgetList(this.e.e(this.d));
        }
    }
    
    public void onDataSetChanged() {
        if (this.e != null) {
            this.c = new WidgetControl$WidgetList(this.e.e(this.d));
        }
    }
    
    public void onDestroy() {
    }
}
