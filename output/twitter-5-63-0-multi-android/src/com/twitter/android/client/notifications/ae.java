// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import java.util.ArrayList;
import android.content.Intent;
import android.annotation.TargetApi;
import android.content.res.Resources;
import java.util.Iterator;
import android.os.Build$VERSION;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.Notification;
import com.twitter.android.highlights.StoriesActivity;
import com.twitter.android.client.NotificationService;
import com.twitter.android.highlights.StoryScribeItem;
import android.app.PendingIntent;
import com.twitter.android.client.ab;
import com.twitter.library.media.manager.j;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.HashMap;
import com.twitter.library.platform.d;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import android.database.Cursor;
import com.twitter.library.provider.ad;
import com.twitter.library.provider.cm;
import com.twitter.library.provider.ba;
import com.twitter.library.provider.Tweet;
import android.content.ContentResolver;
import com.twitter.util.t;
import android.view.WindowManager;
import com.twitter.library.media.decoder.h;
import com.twitter.android.client.x;
import com.twitter.library.media.manager.l;
import com.twitter.internal.android.util.Size;
import android.content.Context;
import com.twitter.android.client.ag;

class ae extends ag
{
    private final Context a;
    private final long e;
    private final Size f;
    private final l g;
    private boolean h;
    private int i;
    
    public ae(final x x, final StoriesNotif storiesNotif, final Context a, final long e) {
        super("PrepareStoriesOperation", x, storiesNotif);
        this.a = a;
        this.e = e;
        this.g = new h(a.getResources().getColor(2131689477));
        this.f = Size.a(t.a((WindowManager)a.getSystemService("window")).x / 2, a.getResources().getDimensionPixelSize(2131558689));
    }
    
    private Tweet a(final ContentResolver contentResolver, final String s, final int n) {
        final Cursor query = contentResolver.query(com.twitter.library.provider.ae.a(ba.a, this.e), cm.a, "data_type=? AND story_id=?", new String[] { String.valueOf(4), s }, (String)null);
        Tweet a = null;
        if (query == null) {
            return a;
        }
        try {
            final boolean moveToPosition = query.moveToPosition(n);
            a = null;
            if (moveToPosition) {
                a = new ad(query).a();
            }
            return a;
        }
        finally {
            query.close();
        }
    }
    
    protected List a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             "homescreen_recs_story_count"
        //     2: bipush          14
        //     4: invokestatic    com/twitter/library/featureswitch/d.a:(Ljava/lang/String;I)I
        //     7: istore_1       
        //     8: aload_0        
        //     9: getfield        com/twitter/android/client/notifications/ae.a:Landroid/content/Context;
        //    12: invokestatic    com/twitter/library/client/az.a:(Landroid/content/Context;)Lcom/twitter/library/client/az;
        //    15: aload_0        
        //    16: getfield        com/twitter/android/client/notifications/ae.e:J
        //    19: invokevirtual   com/twitter/library/client/az.b:(J)Lcom/twitter/library/client/Session;
        //    22: astore_2       
        //    23: new             Lmv;
        //    26: dup            
        //    27: aload_0        
        //    28: getfield        com/twitter/android/client/notifications/ae.a:Landroid/content/Context;
        //    31: aload_2        
        //    32: iload_1        
        //    33: invokespecial   mv.<init>:(Landroid/content/Context;Lcom/twitter/library/client/Session;I)V
        //    36: astore_3       
        //    37: aload_3        
        //    38: ldc             "Started due to notification send-to-sync."
        //    40: invokevirtual   mv.j:(Ljava/lang/String;)Lcom/twitter/library/service/y;
        //    43: pop            
        //    44: aload_3        
        //    45: invokevirtual   mv.S:()Lcom/twitter/library/service/aa;
        //    48: astore          5
        //    50: aload           5
        //    52: invokevirtual   com/twitter/library/service/aa.a:()Z
        //    55: ifne            97
        //    58: invokestatic    com/twitter/android/client/notifications/StoriesNotif.n:()Z
        //    61: ifeq            93
        //    64: ldc             "StoriesNotif"
        //    66: new             Ljava/lang/StringBuilder;
        //    69: dup            
        //    70: invokespecial   java/lang/StringBuilder.<init>:()V
        //    73: ldc             "Failed to fetch stories: "
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: aload           5
        //    80: invokevirtual   com/twitter/library/service/aa.d:()Ljava/lang/String;
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    92: pop            
        //    93: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    96: areturn        
        //    97: aload_0        
        //    98: getfield        com/twitter/android/client/notifications/ae.a:Landroid/content/Context;
        //   101: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   104: astore          6
        //   106: getstatic       com/twitter/library/provider/ba.a:Landroid/net/Uri;
        //   109: aload_0        
        //   110: getfield        com/twitter/android/client/notifications/ae.e:J
        //   113: invokestatic    com/twitter/library/provider/ae.a:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   116: astore          7
        //   118: getstatic       com/twitter/library/provider/cm.a:[Ljava/lang/String;
        //   121: astore          8
        //   123: iconst_2       
        //   124: anewarray       Ljava/lang/String;
        //   127: astore          9
        //   129: aload           9
        //   131: iconst_0       
        //   132: iconst_1       
        //   133: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   136: aastore        
        //   137: aload           9
        //   139: iconst_1       
        //   140: iconst_0       
        //   141: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   144: aastore        
        //   145: aload           6
        //   147: aload           7
        //   149: aload           8
        //   151: ldc             "data_type=? AND story_is_read=?"
        //   153: aload           9
        //   155: aconst_null    
        //   156: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   159: astore          10
        //   161: aload           10
        //   163: ifnull          184
        //   166: aload_0        
        //   167: aload           10
        //   169: invokeinterface android/database/Cursor.getCount:()I
        //   174: putfield        com/twitter/android/client/notifications/ae.i:I
        //   177: aload           10
        //   179: invokeinterface android/database/Cursor.close:()V
        //   184: getstatic       com/twitter/library/provider/ba.a:Landroid/net/Uri;
        //   187: aload_0        
        //   188: getfield        com/twitter/android/client/notifications/ae.e:J
        //   191: invokestatic    com/twitter/library/provider/ae.a:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   194: astore          11
        //   196: getstatic       com/twitter/library/provider/cm.a:[Ljava/lang/String;
        //   199: astore          12
        //   201: iconst_3       
        //   202: anewarray       Ljava/lang/String;
        //   205: astore          13
        //   207: aload           13
        //   209: iconst_0       
        //   210: iconst_1       
        //   211: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   214: aastore        
        //   215: aload           13
        //   217: iconst_1       
        //   218: iconst_2       
        //   219: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   222: aastore        
        //   223: aload           13
        //   225: iconst_2       
        //   226: iconst_0       
        //   227: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   230: aastore        
        //   231: aload           6
        //   233: aload           11
        //   235: aload           12
        //   237: ldc             "data_type=? AND story_type=? AND story_is_read=?"
        //   239: aload           13
        //   241: aconst_null    
        //   242: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   245: astore          14
        //   247: new             Ljava/util/ArrayList;
        //   250: dup            
        //   251: iconst_2       
        //   252: invokespecial   java/util/ArrayList.<init>:(I)V
        //   255: astore          15
        //   257: aload           14
        //   259: ifnull          439
        //   262: aload           14
        //   264: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   269: ifeq            432
        //   272: aload           14
        //   274: getstatic       com/twitter/library/provider/cm.r:I
        //   277: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   282: astore          17
        //   284: aload           14
        //   286: getstatic       com/twitter/library/provider/cm.A:I
        //   289: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   294: astore          18
        //   296: aload           14
        //   298: getstatic       com/twitter/library/provider/cm.B:I
        //   301: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   306: astore          19
        //   308: aload_0        
        //   309: aload           6
        //   311: aload           17
        //   313: iconst_0       
        //   314: invokespecial   com/twitter/android/client/notifications/ae.a:(Landroid/content/ContentResolver;Ljava/lang/String;I)Lcom/twitter/library/provider/Tweet;
        //   317: astore          20
        //   319: aload           20
        //   321: ifnull          411
        //   324: aload           20
        //   326: getfield        com/twitter/library/provider/Tweet.G:Lcom/twitter/library/api/TweetEntities;
        //   329: getfield        com/twitter/library/api/TweetEntities.media:Lcom/twitter/library/api/MediaEntityList;
        //   332: astore          21
        //   334: aload           21
        //   336: invokevirtual   com/twitter/library/api/EntityList.c:()Z
        //   339: ifne            411
        //   342: aload           21
        //   344: iconst_0       
        //   345: invokevirtual   com/twitter/library/api/EntityList.a:(I)Lcom/twitter/library/api/Entity;
        //   348: checkcast       Lcom/twitter/library/api/MediaEntity;
        //   351: invokestatic    com/twitter/library/media/util/l.a:(Lcom/twitter/library/api/MediaEntity;)Lcom/twitter/library/media/manager/k;
        //   354: aload_0        
        //   355: getfield        com/twitter/android/client/notifications/ae.g:Lcom/twitter/library/media/manager/l;
        //   358: invokevirtual   com/twitter/library/media/manager/k.a:(Lcom/twitter/library/media/manager/l;)Lcom/twitter/library/media/manager/k;
        //   361: aload_0        
        //   362: getfield        com/twitter/android/client/notifications/ae.f:Lcom/twitter/internal/android/util/Size;
        //   365: invokevirtual   com/twitter/library/media/manager/k.a:(Lcom/twitter/internal/android/util/Size;)Lcom/twitter/library/media/manager/k;
        //   368: astore          23
        //   370: aload           15
        //   372: new             Lcom/twitter/android/client/notifications/ad;
        //   375: dup            
        //   376: aload           17
        //   378: aload           18
        //   380: aload           19
        //   382: aload           20
        //   384: invokevirtual   com/twitter/library/provider/Tweet.a:()Ljava/lang/String;
        //   387: aload           20
        //   389: getfield        com/twitter/library/provider/Tweet.A:J
        //   392: aload           20
        //   394: getfield        com/twitter/library/provider/Tweet.X:Ljava/lang/String;
        //   397: aload           23
        //   399: invokevirtual   com/twitter/library/media/manager/k.a:()Lcom/twitter/library/media/manager/j;
        //   402: invokespecial   com/twitter/android/client/notifications/ad.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/twitter/library/media/manager/j;)V
        //   405: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   410: pop            
        //   411: aload           14
        //   413: invokeinterface android/database/Cursor.moveToNext:()Z
        //   418: ifeq            432
        //   421: aload_0        
        //   422: getfield        com/twitter/android/client/notifications/ae.h:Z
        //   425: istore          22
        //   427: iload           22
        //   429: ifeq            272
        //   432: aload           14
        //   434: invokeinterface android/database/Cursor.close:()V
        //   439: aload           15
        //   441: new             Lcom/twitter/android/client/notifications/af;
        //   444: dup            
        //   445: aconst_null    
        //   446: invokespecial   com/twitter/android/client/notifications/af.<init>:(Lcom/twitter/android/client/notifications/ac;)V
        //   449: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   452: aload           15
        //   454: iconst_0       
        //   455: iconst_2       
        //   456: aload           15
        //   458: invokeinterface java/util/List.size:()I
        //   463: invokestatic    java/lang/Math.min:(II)I
        //   466: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //   471: areturn        
        //   472: astore          25
        //   474: aload           10
        //   476: invokeinterface android/database/Cursor.close:()V
        //   481: aload           25
        //   483: athrow         
        //   484: astore          16
        //   486: aload           14
        //   488: invokeinterface android/database/Cursor.close:()V
        //   493: aload           16
        //   495: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  166    177    472    484    Any
        //  262    272    484    496    Any
        //  272    319    484    496    Any
        //  324    411    484    496    Any
        //  411    427    484    496    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0272:
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
    protected boolean a(final StatusBarNotif statusBarNotif, final com.twitter.internal.android.service.x x) {
        final StoriesNotif storiesNotif = (StoriesNotif)statusBarNotif;
        storiesNotif.g = (List)x.b();
        storiesNotif.h = this.i;
        return true;
    }
    
    protected List b() {
        this.h = true;
        return Collections.emptyList();
    }
}
