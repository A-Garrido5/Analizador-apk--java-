// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import java.util.TimerTask;
import java.util.Timer;
import com.twitter.library.media.manager.q;
import java.util.ArrayList;
import com.twitter.library.util.bk;
import com.twitter.library.featureswitch.d;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.graphics.drawable.BitmapDrawable;
import com.twitter.library.media.manager.p;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.k;
import android.text.SpannableStringBuilder;
import com.twitter.library.provider.Tweet;
import java.util.LinkedHashMap;
import com.twitter.library.featureswitch.n;
import android.content.Context;
import com.twitter.internal.android.util.Size;
import java.util.Map;

public class e
{
    private static final String[] d;
    private static final Map e;
    private static final Size f;
    private static boolean g;
    private static Context h;
    private static String i;
    private static String j;
    private static int k;
    private static final n l;
    public final String a;
    public int b;
    public final String c;
    
    static {
        d = new String[] { "_mdpi", "_hdpi", "_xhdpi", "_xxhdpi" };
        e = new LinkedHashMap();
        f = Size.a(200, 200);
        com.twitter.library.view.e.k = 0;
        l = new f();
    }
    
    public e(final String a, final int b) {
        this.a = a;
        this.b = b;
        this.c = com.twitter.library.view.e.e.get(a.toLowerCase()).b;
    }
    
    public static CharSequence a(final Context context, final Tweet tweet, final CharSequence charSequence, final boolean b) {
        return a(context, tweet, charSequence, b, new i(null));
    }
    
    public static CharSequence a(final Context context, final Tweet tweet, final CharSequence charSequence, final boolean b, final j j) {
        int n = 0;
        List list;
        if (b) {
            list = tweet.ah();
        }
        else {
            list = tweet.ag();
        }
        if (list.size() <= 0) {
            return charSequence;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
    Label_0262_Outer:
        for (final e e : list) {
            final int n2 = n + e.b;
            while (true) {
                Label_0286: {
                    if (e.c == null || n2 > spannableStringBuilder.length()) {
                        break Label_0286;
                    }
                    final Future a = j.a(new k(e.c).a(com.twitter.library.view.e.f).a());
                    if (!a.isDone()) {
                        break Label_0286;
                    }
                    try {
                        final BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), (Bitmap)a.get().c());
                        ((Drawable)bitmapDrawable).setBounds(0, 0, ((Drawable)bitmapDrawable).getIntrinsicWidth(), ((Drawable)bitmapDrawable).getIntrinsicHeight());
                        spannableStringBuilder.insert(n2, (CharSequence)"\u200a");
                        spannableStringBuilder.insert(n2, (CharSequence)"\u200a");
                        spannableStringBuilder.setSpan((Object)new ImageSpan((Drawable)bitmapDrawable, 1), n2, n2 + "\u200a".length(), 33);
                        spannableStringBuilder.insert(n2, (CharSequence)"\u200a");
                        final int n3 = n + "\u200a".length() * 3;
                        n = n3;
                        continue Label_0262_Outer;
                    }
                    catch (InterruptedException ex) {}
                    catch (ExecutionException ex2) {
                        goto Label_0271;
                    }
                }
                final int n3 = n;
                continue;
            }
        }
        goto Label_0278;
    }
    
    public static void a(final Context h) {
        com.twitter.library.view.e.h = h;
        com.twitter.library.view.e.k = com.twitter.library.featureswitch.d.a("hashflags_settings_version", 0);
        com.twitter.library.view.e.g = com.twitter.library.featureswitch.d.f("hashflags_settings_enabled");
        com.twitter.library.view.e.i = com.twitter.library.featureswitch.d.g("hashflags_settings_location_prefix");
        final int densityDpi = com.twitter.library.view.e.h.getResources().getDisplayMetrics().densityDpi;
        if (densityDpi <= 160) {
            com.twitter.library.view.e.j = com.twitter.library.view.e.d[0];
        }
        else if (densityDpi <= 240) {
            com.twitter.library.view.e.j = com.twitter.library.view.e.d[1];
        }
        else if (densityDpi <= 320) {
            com.twitter.library.view.e.j = com.twitter.library.view.e.d[2];
        }
        else {
            com.twitter.library.view.e.j = com.twitter.library.view.e.d[3];
        }
        g();
        h();
        com.twitter.library.featureswitch.d.a(com.twitter.library.view.e.l);
    }
    
    public static boolean a() {
        synchronized (e.class) {
            return com.twitter.library.view.e.e.size() > 0;
        }
    }
    
    public static boolean a(final String s) {
        synchronized (e.class) {
            final String lowerCase = s.toLowerCase();
            boolean b;
            if (com.twitter.library.view.e.e.containsKey(lowerCase)) {
                final h h = com.twitter.library.view.e.e.get(lowerCase);
                final long n = bk.a() / 1000L;
                b = (n > h.c && n < h.d);
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    public static ArrayList b() {
        final ArrayList<Object> list;
        synchronized (e.class) {
            list = new ArrayList<Object>(com.twitter.library.view.e.e.size());
            final Iterator<Object> iterator = com.twitter.library.view.e.e.keySet().iterator();
            while (iterator.hasNext()) {
                list.add(com.twitter.library.view.e.e.get(iterator.next()));
            }
        }
        // monitorexit(e.class)
        return list;
    }
    
    private static void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/twitter/library/view/e;.class
        //     2: monitorenter   
        //     3: getstatic       com/twitter/library/view/e.e:Ljava/util/Map;
        //     6: invokeinterface java/util/Map.clear:()V
        //    11: getstatic       com/twitter/library/view/e.g:Z
        //    14: ifeq            28
        //    17: ldc_w           "hashflags_settings_groups"
        //    20: invokestatic    com/twitter/library/featureswitch/d.h:(Ljava/lang/String;)Ljava/util/ArrayList;
        //    23: astore_1       
        //    24: aload_1        
        //    25: ifnonnull       32
        //    28: ldc             Lcom/twitter/library/view/e;.class
        //    30: monitorexit    
        //    31: return         
        //    32: aload_1        
        //    33: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    38: astore_2       
        //    39: aload_2        
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: ifeq            28
        //    48: aload_2        
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: checkcast       Ljava/lang/String;
        //    57: astore_3       
        //    58: new             Ljava/lang/StringBuilder;
        //    61: dup            
        //    62: invokespecial   java/lang/StringBuilder.<init>:()V
        //    65: ldc_w           "hashflags_settings_group_"
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: aload_3        
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: ldc_w           "_enabled"
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    84: invokestatic    com/twitter/library/featureswitch/d.f:(Ljava/lang/String;)Z
        //    87: istore          4
        //    89: iload           4
        //    91: ifeq            39
        //    94: new             Ljava/lang/StringBuilder;
        //    97: dup            
        //    98: invokespecial   java/lang/StringBuilder.<init>:()V
        //   101: ldc_w           "hashflags_settings_group_"
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: aload_3        
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: ldc_w           "_start"
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   120: invokestatic    com/twitter/library/featureswitch/d.g:(Ljava/lang/String;)Ljava/lang/String;
        //   123: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   126: lstore          6
        //   128: new             Ljava/lang/StringBuilder;
        //   131: dup            
        //   132: invokespecial   java/lang/StringBuilder.<init>:()V
        //   135: ldc_w           "hashflags_settings_group_"
        //   138: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   141: aload_3        
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: ldc_w           "_end"
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   154: invokestatic    com/twitter/library/featureswitch/d.g:(Ljava/lang/String;)Ljava/lang/String;
        //   157: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   160: lstore          8
        //   162: new             Ljava/lang/StringBuilder;
        //   165: dup            
        //   166: invokespecial   java/lang/StringBuilder.<init>:()V
        //   169: ldc_w           "hashflags_settings_group_"
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: aload_3        
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: ldc_w           "_keys"
        //   182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   185: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   188: invokestatic    com/twitter/library/featureswitch/d.h:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   191: astore          10
        //   193: new             Ljava/lang/StringBuilder;
        //   196: dup            
        //   197: invokespecial   java/lang/StringBuilder.<init>:()V
        //   200: ldc_w           "hashflags_settings_group_"
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: aload_3        
        //   207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   210: ldc_w           "_values"
        //   213: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   216: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   219: invokestatic    com/twitter/library/featureswitch/d.h:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   222: astore          11
        //   224: aload           10
        //   226: ifnull          39
        //   229: aload           11
        //   231: ifnull          39
        //   234: aload           10
        //   236: invokeinterface java/util/List.size:()I
        //   241: aload           11
        //   243: invokeinterface java/util/List.size:()I
        //   248: if_icmpne       39
        //   251: iconst_0       
        //   252: istore          12
        //   254: aload           10
        //   256: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   261: astore          13
        //   263: aload           13
        //   265: invokeinterface java/util/Iterator.hasNext:()Z
        //   270: ifeq            39
        //   273: aload           13
        //   275: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   280: astore          14
        //   282: iload           12
        //   284: iconst_1       
        //   285: iadd           
        //   286: istore          15
        //   288: aload           11
        //   290: iload           12
        //   292: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   297: checkcast       Ljava/lang/String;
        //   300: astore          16
        //   302: aload           16
        //   304: bipush          46
        //   306: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //   309: istore          17
        //   311: iload           17
        //   313: iconst_m1      
        //   314: if_icmpne       324
        //   317: iload           15
        //   319: istore          12
        //   321: goto            263
        //   324: aload           16
        //   326: iload           17
        //   328: aload           16
        //   330: invokevirtual   java/lang/String.length:()I
        //   333: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   336: astore          18
        //   338: new             Ljava/lang/StringBuilder;
        //   341: dup            
        //   342: invokespecial   java/lang/StringBuilder.<init>:()V
        //   345: getstatic       com/twitter/library/view/e.i:Ljava/lang/String;
        //   348: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   351: aload_3        
        //   352: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   355: ldc_w           "/"
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: aload           16
        //   363: iconst_0       
        //   364: iload           17
        //   366: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   369: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   372: getstatic       com/twitter/library/view/e.j:Ljava/lang/String;
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: aload           18
        //   380: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   383: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   386: astore          19
        //   388: getstatic       com/twitter/library/view/e.e:Ljava/util/Map;
        //   391: aload           14
        //   393: checkcast       Ljava/lang/String;
        //   396: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   399: new             Lcom/twitter/library/view/h;
        //   402: dup            
        //   403: aload           14
        //   405: checkcast       Ljava/lang/String;
        //   408: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   411: aload           19
        //   413: lload           6
        //   415: lload           8
        //   417: invokespecial   com/twitter/library/view/h.<init>:(Ljava/lang/String;Ljava/lang/String;JJ)V
        //   420: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   425: pop            
        //   426: iload           15
        //   428: istore          12
        //   430: goto            263
        //   433: astore_0       
        //   434: ldc             Lcom/twitter/library/view/e;.class
        //   436: monitorexit    
        //   437: aload_0        
        //   438: athrow         
        //   439: astore          5
        //   441: goto            39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      24     433    439    Any
        //  32     39     433    439    Any
        //  39     89     433    439    Any
        //  94     162    439    444    Ljava/lang/NumberFormatException;
        //  94     162    433    439    Any
        //  162    224    433    439    Any
        //  234    251    433    439    Any
        //  254    263    433    439    Any
        //  263    282    433    439    Any
        //  288    311    433    439    Any
        //  324    426    433    439    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0263:
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
    
    private static void h() {
        if (com.twitter.library.featureswitch.d.f("hashflags_settings_preload_images")) {
            final com.twitter.library.media.manager.h d = q.a(com.twitter.library.view.e.h).d();
            final Timer timer = new Timer();
            timer.schedule(new g(b().iterator(), d, timer), 70000L, 200L);
        }
    }
}
