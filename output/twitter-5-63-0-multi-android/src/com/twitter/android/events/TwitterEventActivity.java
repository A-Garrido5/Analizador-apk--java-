// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import android.os.Build$VERSION;
import com.twitter.library.client.Session$LoginStatus;
import java.util.Collection;
import android.content.Intent;
import android.content.res.Resources;
import com.twitter.library.util.bq;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import android.view.LayoutInflater;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import java.util.ArrayList;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.widget.UnboundedFrameLayout;
import com.twitter.android.SearchFragment;
import java.io.Serializable;
import com.twitter.util.q;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.kg;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.view.View;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import android.text.TextUtils;
import android.support.v4.app.Fragment;
import android.graphics.Bitmap;
import com.twitter.library.util.af;
import android.content.Context;
import android.annotation.TargetApi;
import com.twitter.library.provider.bg;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.io.File;
import android.widget.TextView;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.qi;
import java.util.HashMap;
import com.twitter.android.mn;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.media.widget.BackgroundImageView;
import android.net.Uri;
import com.twitter.library.media.manager.m;
import com.twitter.android.rp;
import com.twitter.android.hm;
import android.view.View$OnClickListener;
import com.twitter.android.ScrollingHeaderActivity;

public abstract class TwitterEventActivity extends ScrollingHeaderActivity implements View$OnClickListener, hm, rp, m
{
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    public static final Uri f;
    private BackgroundImageView A;
    private boolean B;
    private TopicView$TopicData F;
    private mn G;
    private HashMap H;
    private qi I;
    private String J;
    private int K;
    private String L;
    private ToolBar M;
    private TextView N;
    private String O;
    private boolean P;
    private File Q;
    private String R;
    private long S;
    private long T;
    private ViewGroup U;
    private ViewGroup V;
    private boolean W;
    private int X;
    protected boolean g;
    protected Drawable h;
    protected String i;
    protected String j;
    private bg y;
    private ViewGroup z;
    
    static {
        a = Uri.parse("twitter://events/default");
        b = Uri.parse("twitter://events/commentary");
        c = Uri.parse("twitter://events/media");
        d = Uri.parse("twitter://events/photos");
        e = Uri.parse("twitter://events/videos");
        f = Uri.parse("twitter://events/matches");
    }
    
    public TwitterEventActivity() {
        this.W = false;
        this.X = 0;
    }
    
    @TargetApi(21)
    private void X() {
        this.getWindow().setStatusBarColor(-16777216);
    }
    
    private int Y() {
        if (this.M != null && this.M.getVisibility() == 0) {
            return this.M.getMeasuredHeight();
        }
        return 0;
    }
    
    private int Z() {
        if (this.A != null && this.A.getVisibility() == 0) {
            return this.A.getMeasuredHeight();
        }
        return 0;
    }
    
    public static File a(final Context context, final long n) {
        final File b = af.b(context);
        if (b == null) {
            return null;
        }
        return new File(b, n + "_" + context.getResources().getConfiguration().orientation + "_event_header.jpg");
    }
    
    private void a(final Bitmap p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileOutputStream;
        //     3: dup            
        //     4: aload_2        
        //     5: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //     8: astore_3       
        //     9: aload_1        
        //    10: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //    13: bipush          100
        //    15: aload_3        
        //    16: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //    19: pop            
        //    20: aload_3        
        //    21: ifnull          28
        //    24: aload_3        
        //    25: invokevirtual   java/io/FileOutputStream.close:()V
        //    28: return         
        //    29: astore          4
        //    31: aconst_null    
        //    32: astore_3       
        //    33: aload           4
        //    35: invokevirtual   java/lang/Exception.printStackTrace:()V
        //    38: aload_3        
        //    39: ifnull          28
        //    42: aload_3        
        //    43: invokevirtual   java/io/FileOutputStream.close:()V
        //    46: return         
        //    47: astore          7
        //    49: return         
        //    50: astore          5
        //    52: aconst_null    
        //    53: astore_3       
        //    54: aload_3        
        //    55: ifnull          62
        //    58: aload_3        
        //    59: invokevirtual   java/io/FileOutputStream.close:()V
        //    62: aload           5
        //    64: athrow         
        //    65: astore          9
        //    67: return         
        //    68: astore          6
        //    70: goto            62
        //    73: astore          5
        //    75: goto            54
        //    78: astore          4
        //    80: goto            33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      9      29     33     Ljava/lang/Exception;
        //  0      9      50     54     Any
        //  9      20     78     83     Ljava/lang/Exception;
        //  9      20     73     78     Any
        //  24     28     65     68     Ljava/io/IOException;
        //  33     38     73     78     Any
        //  42     46     47     50     Ljava/io/IOException;
        //  58     62     68     73     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    private void a(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.A.a((k)null);
        }
        else {
            final long n = string.hashCode();
            if (this.T != n) {
                this.T = n;
                this.S = n;
                this.Q = a(this.getApplicationContext(), this.S);
                this.P = (this.Q != null && this.Q.exists());
                if (this.P) {
                    string = Uri.fromFile(this.Q).toString();
                }
                this.A.a((k)com.twitter.library.media.manager.j.a(string).a(this));
            }
        }
    }
    
    protected int A() {
        return this.o.getBottom() + (int)this.o.getTranslationY() - this.p;
    }
    
    @Override
    protected String K_() {
        return null;
    }
    
    @Override
    protected int a(final ToolBar toolBar) {
        super.a(toolBar);
        toolBar.a(2131887418).b(false);
        toolBar.a(2131887461).b(true);
        this.N.setVisibility(0);
        toolBar.setCustomView((View)this.N);
        return 1;
    }
    
    @Override
    protected PagerAdapter a(final List list, final ViewPager viewPager) {
        return new f(this, this, list, viewPager, this.n, this.G);
    }
    
    @Override
    protected BaseAdapter a(final List list) {
        return this.G = new mn(list);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        boolean b = true;
        super.a(bundle, bn);
        bn.e(b);
        if (kg.a((Context)this)) {
            b = false;
        }
        bn.d(b);
        return bn;
    }
    
    protected gm a(final Uri uri, final int n, final String s, final String s2) {
        int n2 = 1;
        final Bundle a = TwitterListFragment.a(this.getIntent(), n2 != 0);
        Serializable s3;
        String s4;
        String s5;
        int int1;
        if (uri.equals((Object)TwitterEventActivity.a)) {
            s3 = EventLandingFragment.class;
            s4 = "";
            s5 = "";
            int1 = 0;
        }
        else if (uri.equals((Object)TwitterEventActivity.b)) {
            s3 = EventLandingFragment.class;
            s4 = "official";
            int1 = n2;
            s5 = null;
        }
        else if (uri.equals((Object)TwitterEventActivity.d)) {
            int1 = 3;
            s4 = "photo";
            s3 = ScrollableEventGridFragment.class;
            s5 = null;
        }
        else if (uri.equals((Object)TwitterEventActivity.c)) {
            int1 = 7;
            s4 = "photo";
            s3 = ScrollableEventGridFragment.class;
            s5 = null;
        }
        else if (uri.equals((Object)TwitterEventActivity.e)) {
            int1 = -1;
            s4 = "video";
            s3 = EventLandingFragment.class;
            s5 = null;
        }
        else if (uri.equals((Object)TwitterEventActivity.f)) {
            int1 = 8;
            s3 = EventLandingFragment.class;
            s4 = "schedule";
            s5 = "schedule";
        }
        else {
            int1 = a.getInt("search_type");
            s3 = EventLandingFragment.class;
            s5 = null;
            s4 = null;
        }
        String s6 = null;
        switch (this.K) {
            default: {
                s6 = "unknown";
                break;
            }
            case 2: {
                s6 = "spev";
                break;
            }
        }
        final go go = new go(uri, (Class)s3);
        go.a((CharSequence)s);
        go.a(s2);
        a.putInt("search_type", int1);
        a.putInt("fetch_type", 5);
        a.putString("scribe_page", this.L);
        a.putString("scribe_section", s2);
        a.putString("scribe_component", this.O);
        if (this.g) {
            n2 = 0;
        }
        a.putBoolean("event_header_available", (boolean)(n2 != 0));
        a.putString("q_source", s6);
        a.putString("event_id", this.J);
        a.putInt("event_type", this.K);
        a.putInt("empty_title", 2131297635);
        a.putInt("empty_desc", 2131297636);
        a.putInt("fragment_page_number", n);
        a.putBoolean("should_shim", false);
        if (!TextUtils.isEmpty((CharSequence)s4)) {
            a.putString("query_rewrite_id", s4);
        }
        if (!TextUtils.isEmpty((CharSequence)s5)) {
            a.putString("data_lookup_id", s5);
        }
        long n3;
        if (this.H.get(int1) != null) {
            n3 = this.H.get(int1);
        }
        else {
            n3 = com.twitter.util.q.a.nextLong();
        }
        this.y.i(n3);
        a.putLong("search_id", n3);
        this.H.put(int1, n3);
        go.a(a);
        return go.a();
    }
    
    @Override
    protected void a(final int currentItem) {
        super.a(currentItem);
        if (currentItem == this.G.b()) {
            final SearchFragment searchFragment = (SearchFragment)this.k.get(currentItem).a(this.getSupportFragmentManager());
            if (searchFragment != null) {
                searchFragment.r();
            }
            return;
        }
        this.l.setCurrentItem(currentItem);
        this.G.a(currentItem);
    }
    
    @Override
    protected void a(final Drawable backgroundDrawable) {
        if (this.A != null) {
            this.A.setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    protected void a(final d d) {
        if (d.f() == this.l.getCurrentItem() && d.b() != -1 && this.m != null && this.M != null && this.A != null && this.o != null && d.e() != 0) {
            final int z = this.Z();
            final int y = this.Y();
            int measuredHeight;
            if (this.o.getVisibility() != 0) {
                measuredHeight = 0;
            }
            else {
                measuredHeight = this.o.getMeasuredHeight();
            }
            int measuredHeight2;
            if (this.U == null || this.U.getVisibility() != 0) {
                measuredHeight2 = 0;
            }
            else {
                measuredHeight2 = this.U.getMeasuredHeight();
            }
            int measuredHeight3;
            if (this.V == null || this.V.getVisibility() != 0) {
                measuredHeight3 = 0;
            }
            else {
                measuredHeight3 = this.V.getMeasuredHeight();
            }
            if (d.b() == 0) {
                if (d.a() > 0) {
                    this.X = Math.max(this.X, d.c());
                }
                else if (d.a() < 0) {
                    this.X = Math.min(this.X, d.c());
                }
            }
            else {
                final int x = -z - measuredHeight2 - measuredHeight3 - measuredHeight;
                this.X += d.a();
                if (this.X > 0) {
                    this.X = 0;
                }
                else if (this.X < x) {
                    this.X = x;
                }
            }
            final int x2 = y - measuredHeight3 - z;
            final int n = y - z;
            final int n2 = z - y + this.X;
            if (this.X > x2 && (d.b() == 0 || !this.W)) {
                final UnboundedFrameLayout m = this.m;
                float translationY;
                if (this.X < n) {
                    translationY = n;
                }
                else {
                    translationY = this.X;
                }
                m.setTranslationY(translationY);
                this.M.setTranslationY(0.0f);
                this.A.setTranslationY(0.0f);
                if (this.U != null) {
                    this.U.setTranslationY(0.0f);
                }
                if (this.V != null) {
                    final ViewGroup v = this.V;
                    float translationY2;
                    if (n2 > 0) {
                        translationY2 = 0.0f;
                    }
                    else {
                        translationY2 = n2;
                    }
                    v.setTranslationY(translationY2);
                }
                this.o.setTranslationY((float)this.X);
                this.W = false;
                return;
            }
            if (150 + this.X > x2 && (d.b() == 0 || !this.W)) {
                this.W = true;
                this.m.setTranslationY((float)n);
                this.M.setTranslationY(0.0f);
                this.A.setTranslationY(0.0f);
                if (this.U != null) {
                    this.U.setTranslationY(0.0f);
                }
                if (this.V != null) {
                    this.V.setTranslationY((float)n2);
                }
                this.o.setTranslationY((float)x2);
                return;
            }
            this.W = true;
            if (d.a() > 0 && this.X > x2) {
                this.X = x2;
            }
            if (!this.z() && (d.b() <= 0 || (this.M.getTranslationY() != -y && this.M.getTranslationY() != 0.0f) || d.e() != 2)) {
                int n3 = (int)(this.M.getTranslationY() + d.a() / 2.0f);
                if (n3 < -y) {
                    n3 = -y;
                }
                int n4 = 0;
                if (n3 <= 0) {
                    n4 = n3;
                }
                this.m.setTranslationY((float)n);
                this.M.setTranslationY((float)n4);
                this.A.setTranslationY((float)n4);
                if (this.U != null) {
                    this.U.setTranslationY((float)n4);
                }
                if (this.V != null) {
                    this.V.setTranslationY((float)n2);
                }
                this.o.setTranslationY((float)(n4 + x2));
            }
        }
    }
    
    public void a(final TopicView$TopicData f) {
        if (f.a != null) {
            final long g = this.U().g();
            final TwitterScribeItem a = TwitterScribeItem.a(this.J, this.K);
            final ArrayList<ScribeLog> list = new ArrayList<ScribeLog>(2);
            if (this.z != null) {
                list.add(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(this.L, "event_card", this.O, null, "pull_to_refresh")).d("query")).a(a));
                this.G().a(list);
            }
            else {
                this.setHeaderView((View)(this.z = (ViewGroup)LayoutInflater.from((Context)this).inflate(2130968760, (ViewGroup)this.m, false)));
                this.A = (BackgroundImageView)this.z.findViewById(2131886732);
                if (this.n()) {
                    this.A.setAspectRatio(3.0f);
                    File a2;
                    if (this.S != 0L) {
                        a2 = a((Context)this, this.S);
                    }
                    else {
                        a2 = null;
                    }
                    if (a2 != null && a2.exists()) {
                        this.A.setDefaultDrawable(Drawable.createFromPath(a2.getAbsolutePath()));
                    }
                    else if (this.R != null && new File(this.R).exists()) {
                        this.A.setDefaultDrawable(Drawable.createFromPath(this.R));
                    }
                    else {
                        this.p();
                        this.A.setDefaultDrawable(this.h);
                    }
                }
                this.U = (ViewGroup)this.z.findViewById(2131886730);
                this.V = (ViewGroup)this.z.findViewById(2131886731);
                final View k = this.k();
                final View l = this.l();
                if (this.U != null && k != null) {
                    this.U.addView(k);
                }
                if (this.V != null && l != null) {
                    this.V.addView(l);
                }
            }
            if (this.n()) {
                this.a(f.e);
            }
            else {
                this.p();
                this.A.a((k)null);
                this.A.setDefaultDrawable(this.h);
                this.A.getLayoutParams().height = this.p;
                this.A.requestLayout();
            }
            if (this.F == null) {
                this.e(this.c());
                this.d(true);
            }
            this.b(f);
            if (this.m()) {
                list.add(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(this.L, "event_card", this.O, null, "impression")).d("query")).a(a));
                this.G().a(list);
                this.F = f;
            }
        }
    }
    
    public void a(final TwitterTopic$SportsEvent twitterTopic$SportsEvent) {
        if (this.F != null) {
            this.F.m = com.twitter.util.f.a(twitterTopic$SportsEvent);
            this.a(this.F);
        }
    }
    
    public void a(final p p) {
        final Bitmap bitmap = (Bitmap)p.c();
        if (bitmap != null) {
            this.b(bitmap);
            if (!this.P && this.Q != null) {
                this.a(bitmap, this.Q);
            }
            return;
        }
        if (this.P && this.Q != null) {
            this.Q.delete();
            this.a(((j)p.b()).a());
            return;
        }
        this.x.b();
    }
    
    public void a(final boolean b, final ListView listView) {
    }
    
    public boolean a(final String j, final long n, final TwitterTopic twitterTopic, final String s) {
        this.j = j;
        return false;
    }
    
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951658, toolBar);
        return true;
    }
    
    public boolean a(final jx jx) {
        final long g = this.U().g();
        final String stringExtra = this.getIntent().getStringExtra("query");
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887461: {
                bq.a((Context)this, stringExtra, stringExtra);
                this.G().a(g, this.L, null, this.O, "query", "share");
                return true;
            }
        }
    }
    
    @Override
    protected int b(final Resources resources) {
        return resources.getColor(17170445);
    }
    
    @Override
    protected String b() {
        return null;
    }
    
    @Override
    protected void b(final int n) {
        super.b(n);
        this.B = true;
        this.I = null;
    }
    
    protected void b(final Bitmap bitmap) {
        try {
            this.a(bitmap);
            if (!this.B) {
                if (this.I != null) {
                    this.I.cancel(true);
                }
                (this.I = new qi(this, false)).execute((Object[])new Bitmap[] { bitmap });
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.x.b();
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.y = bg.a((Context)this, this.U().g());
        if (bundle == null) {
            this.H = new HashMap();
            this.R = null;
            this.O = this.h();
            this.S = 0L;
        }
        else {
            this.H = (HashMap)bundle.getSerializable("search_ids");
            this.O = bundle.getString("scribe_component");
            this.R = bundle.getString("prev_header_image");
            this.S = bundle.getLong("header_image_id", 0L);
        }
        final Intent intent = this.getIntent();
        final long longExtra = intent.getLongExtra("search_id", -1L);
        if (longExtra != -1L) {
            this.H.put(0, longExtra);
        }
        final Intent intent2 = (Intent)intent.getParcelableExtra("EXTRA_PARENT_EVENT");
        if (intent2 != null) {
            this.c(intent2);
        }
        this.y.a(this.H.values());
        this.F = (TopicView$TopicData)intent.getParcelableExtra("topic_data");
        final TopicView$TopicData f = this.F;
        this.i = intent.getStringExtra("event_page_type");
        this.g = "LEAGUE".equals(this.i);
        if (!this.g && f != null) {
            this.J = f.a;
            this.K = f.b;
        }
        else {
            this.J = intent.getStringExtra("event_id");
            this.K = intent.getIntExtra("event_type", -1);
        }
        this.L = "search";
        super.b(bundle, bn);
        this.m.setOnClickListener((View$OnClickListener)this);
        if (f != null) {
            this.a(f);
        }
        (this.N = (TextView)LayoutInflater.from((Context)this).inflate(2130969096, (ViewGroup)null)).setText((CharSequence)intent.getStringExtra("query"));
        this.N.setOnClickListener((View$OnClickListener)this);
        final long g = this.U().g();
        final TwitterScribeItem a = TwitterScribeItem.a(this.J, this.K);
        final ArrayList<ScribeLog> list = new ArrayList<ScribeLog>(2);
        final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(g);
        final String[] array = new String[5];
        array[0] = this.L;
        String s;
        if (this.g) {
            s = null;
        }
        else {
            s = "games";
        }
        array[1] = s;
        array[2] = this.O;
        array[3] = null;
        array[4] = "takeover";
        list.add(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)twitterScribeLog.b(array)).d("query")).c(intent.getStringExtra("search_src_ref"))).a(a));
        if (this.k != null && this.k.size() > 0 && this.l.getCurrentItem() == 0) {
            list.add(((TwitterScribeLog)new TwitterScribeLog(g).b(this.L, this.k.get(0).h, this.O, null, "impression")).a(a));
        }
        this.G().a(list);
    }
    
    protected abstract void b(final TopicView$TopicData p0);
    
    protected String c() {
        final String l_ = this.l_();
        if (l_.length() > 1 && (l_.charAt(1) == '#' || l_.charAt(1) == '$')) {
            return this.getResources().getString(2131297985) + l_;
        }
        return super.c();
    }
    
    @Override
    protected abstract List d();
    
    @Override
    protected void f(final int n) {
        if (this.q()) {
            if (this.u != null) {
                this.g(n);
            }
            return;
        }
        super.f(n);
    }
    
    protected abstract String h();
    
    protected View k() {
        return null;
    }
    
    protected View l() {
        return null;
    }
    
    protected String l_() {
        final String stringExtra = this.getIntent().getStringExtra("query");
        if (!TextUtils.isEmpty((CharSequence)stringExtra) && stringExtra.charAt(0) == '#') {
            return " " + stringExtra;
        }
        if (this.F != null && !TextUtils.isEmpty((CharSequence)this.F.i)) {
            return " " + this.F.i;
        }
        return super.c();
    }
    
    protected boolean m() {
        if (this.g) {
            if (this.U != null) {
                this.U.setVisibility(8);
            }
            if (this.V != null) {
                this.V.setVisibility(8);
            }
        }
        else {
            if (this.getResources().getConfiguration().orientation != 2 && (this.U == null || this.U.getVisibility() != 8)) {
                return true;
            }
            if (this.V != null) {
                this.V.setVisibility(8);
                return false;
            }
        }
        return false;
    }
    
    protected abstract boolean n();
    
    public void onClick(final View view) {
        if (view.getId() == 2131887142) {
            this.D();
            this.H().b(this.N.getText());
        }
    }
    
    @Override
    protected void onDestroy() {
        if (this.I != null) {
            this.I.cancel(true);
            this.I = null;
        }
        if (this.U().b() == Session$LoginStatus.c) {
            this.y.b(this.H.values());
        }
        this.A = null;
        super.onDestroy();
    }
    
    protected void onRestart() {
        super.onRestart();
        if (this.A != null) {
            this.A.e();
        }
    }
    
    protected void onResume() {
        super.onResume();
        if (Build$VERSION.SDK_INT >= 21) {
            this.X();
        }
        this.M = this.M();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        bundle.putSerializable("search_ids", (Serializable)this.H);
        if (this.Q != null) {
            bundle.putString("prev_header_image", this.Q.getAbsolutePath());
        }
        if (this.S != 0L) {
            bundle.putLong("header_image_id", this.S);
        }
        bundle.putString("scribe_component", this.O);
        super.onSaveInstanceState(bundle);
    }
    
    @Override
    protected void onStop() {
        if (this.z != null) {
            this.A.f();
        }
        super.onStop();
    }
    
    protected void p() {
        this.h = this.getResources().getDrawable(2130839533);
    }
    
    protected boolean q() {
        return true;
    }
    
    @Override
    public float r() {
        final int n = this.Z() - this.Y();
        if (n > 0) {
            return Math.min(1.0f, Math.abs(this.X / n));
        }
        return 0.0f;
    }
    
    protected int[] u_() {
        final String l_ = this.l_();
        if (l_.length() > 1 && (l_.charAt(1) == '#' || l_.charAt(1) == '$')) {
            return new int[] { 0, 0 };
        }
        return super.u_();
    }
    
    protected boolean z() {
        return false;
    }
}
