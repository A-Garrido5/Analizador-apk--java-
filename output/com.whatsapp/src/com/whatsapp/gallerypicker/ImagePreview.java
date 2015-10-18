// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.io.Serializable;
import android.graphics.Bitmap$CompressFormat;
import android.os.Parcelable;
import com.whatsapp.ym;
import com.whatsapp.wallpaper.CropImage;
import android.view.MenuItem;
import android.view.KeyEvent;
import com.whatsapp.util.b_;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import com.whatsapp.eu;
import android.app.Activity;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.PagerAdapter;
import android.widget.ImageView$ScaleType;
import com.whatsapp.util.cq;
import java.util.Map;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.graphics.Rect;
import android.content.Intent;
import android.view.animation.LinearInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.MotionEvent;
import com.whatsapp.App;
import com.whatsapp.PhotoView;
import java.util.Iterator;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.os.Handler;
import android.widget.TextView;
import com.whatsapp.l1;
import java.util.ArrayList;
import android.net.Uri;
import android.view.View;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.u;
import com.whatsapp.DialogToastActivity;

public class ImagePreview extends DialogToastActivity
{
    private static u G;
    private static final String[] S;
    private Drawable A;
    private ImageView B;
    private boolean C;
    private a5 D;
    private int E;
    private ViewTreeObserver$OnGlobalLayoutListener F;
    private ViewGroup H;
    private HashMap I;
    private HashMap J;
    private ImagePreview$ThumbsGrid K;
    private float L;
    private View M;
    private Uri N;
    private Runnable O;
    private ArrayList P;
    private int Q;
    private int[] R;
    private l1 k;
    private ViewGroup l;
    private HashMap m;
    private HashMap n;
    private a_ o;
    private TextView p;
    private View q;
    private Drawable r;
    private ImageView s;
    private Handler t;
    private float u;
    private int v;
    private View w;
    private Handler x;
    private boolean y;
    private ViewPager z;
    
    static {
        final String[] s = new String[25];
        String s2 = "+\u0018yV\u00152\u0007}G\u0019'\u00027U\u00151\u0001j^\t";
        int n = -1;
        String[] array = s;
        int n2 = 0;
        String intern = null;
    Label_0657:
        while (true) {
            final char[] charArray = s2.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = 'u';
                        break;
                    }
                    case 2: {
                        c2 = '\u0018';
                        break;
                    }
                    case 3: {
                        c2 = '1';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s2 = "!\u0007wA\u0002'\u0016lB";
                    n2 = 1;
                    array = s;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s2 = "7\u0007qB";
                    n2 = 2;
                    array = s;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s2 = "0\u001alP\u0004+\u001avB";
                    n2 = 3;
                    array = s;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s2 = "!\u0007wA\u00050\u001ck";
                    n2 = 4;
                    array = s;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = s;
                    s2 = "!\u0014hE\u0019-\u001bk";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s2 = "0\u001alP\u0004+\u001avB";
                    n = 5;
                    array = s;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s2 = "!\u0007wA\u0002'\u0016lB";
                    n = 6;
                    array = s;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s2 = "!\u0007wA\u00050\u001ck";
                    n = 7;
                    array = s;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s2 = "!\u0014hE\u0019-\u001bk";
                    n = 8;
                    array = s;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s2 = "+\u0018yV\u00152\u0007}G\u0019'\u00027R\u0002'\u0014lT";
                    n = 9;
                    array = s;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s2 = "!\u0014hE\u0019-\u001b";
                    n = 10;
                    array = s;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s2 = "/\u0014`n\u00196\u0010uB";
                    n = 11;
                    array = s;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s2 = "7\u0007qB";
                    n = 12;
                    array = s;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s2 = "#\u001b|C\u001f+\u00116X\u001e6\u0010vE^'\rlC\u0011l&Lc5\u00038";
                    n = 13;
                    array = s;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s2 = "0\u0010{X\u0000+\u0010vE";
                    n = 14;
                    array = s;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s2 = "0\u0010{E";
                    n = 15;
                    array = s;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s2 = "-\u0000lA\u00056";
                    n = 16;
                    array = s;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s2 = "-\u0000lA\u000563wC\u001d#\u0001";
                    n = 17;
                    array = s;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s2 = "+\u001bqE\u0019#\u0019JT\u00136";
                    n = 18;
                    array = s;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s2 = "0\u001alP\u0004+\u001av";
                    n = 19;
                    array = s;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s2 = "!\u0007wA2;:mE\u00007\u0001KX\n'";
                    n = 20;
                    array = s;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s2 = "1\u0016y]\u0015\u0017\u0005QW>'\u0010|T\u0014";
                    n = 21;
                    array = s;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s2 = "/\u0014`r\u0002-\u0005";
                    n = 22;
                    array = s;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s2 = "$\u0019yE\u0004'\u001bJ^\u0004#\u0001q^\u001e";
                    n = 23;
                    array = s;
                    continue;
                }
                case 23: {
                    break Label_0657;
                }
            }
        }
        array[n2] = intern;
        S = s;
        ImagePreview.G = new u(256);
    }
    
    public ImagePreview() {
        this.m = new HashMap();
        this.J = new HashMap();
        this.n = new HashMap();
        this.I = new HashMap();
        this.t = new Handler();
        this.R = new int[2];
        this.F = (ViewTreeObserver$OnGlobalLayoutListener)new bg(this);
        this.x = new Handler();
        this.O = new a(this);
    }
    
    static float a(final ImagePreview imagePreview, final float u) {
        return imagePreview.u = u;
    }
    
    static Uri a(final ImagePreview imagePreview, final Uri n) {
        return imagePreview.N = n;
    }
    
    static View a(final ImagePreview imagePreview, final View w) {
        return imagePreview.w = w;
    }
    
    static ViewGroup a(final ImagePreview imagePreview) {
        return imagePreview.l;
    }
    
    private void a() {
        final int v = MediaGalleryBase.v;
        this.K.removeAllViews();
        final Iterator<Uri> iterator = (Iterator<Uri>)this.P.iterator();
        while (iterator.hasNext()) {
            this.K.addView((View)new ImagePreview$ThumbImageView(this, (Context)this, iterator.next()));
            if (v != 0) {
                break;
            }
        }
        if (this.P.size() < this.E) {
            this.K.addView((View)this.B);
        }
    }
    
    private void a(final Uri uri, final View view) {
        this.P.remove(uri);
        this.m.remove(uri);
        this.J.remove(uri);
        this.n.remove(uri);
        this.I.remove(uri);
        this.K.removeView(view);
        this.D.notifyDataSetChanged();
        if (this.v >= this.P.size()) {
            this.v = -1 + this.P.size();
        }
        if (this.v >= 0) {
            this.z.setCurrentItem(this.v);
            this.d(this.v);
        }
        if (this.P.size() == -1 + this.E) {
            this.K.addView((View)this.B);
        }
        if (this.P.isEmpty()) {
            this.finish();
        }
    }
    
    private void a(final PhotoView photoView, final Uri tag) {
        photoView.setTag((Object)tag);
        Uri uri;
        if (this.J.containsKey(tag)) {
            uri = this.J.get(tag);
        }
        else {
            uri = tag;
        }
        this.o.a(new bo(this, Math.max(this.z.getMeasuredHeight(), this.z.getMeasuredWidth()), uri, tag), new x(this, photoView, tag));
        if (this.m.containsKey(tag)) {
            photoView.setRotation(this.m.get(tag), false);
        }
    }
    
    static void a(final ImagePreview imagePreview, final int n) {
        imagePreview.d(n);
    }
    
    static void a(final ImagePreview imagePreview, final PhotoView photoView, final Uri uri) {
        imagePreview.a(photoView, uri);
    }
    
    static boolean a(final ImagePreview imagePreview, final boolean y) {
        return imagePreview.y = y;
    }
    
    static float b(final ImagePreview imagePreview, final float l) {
        return imagePreview.L = l;
    }
    
    static int b(final ImagePreview imagePreview, final int q) {
        return imagePreview.Q = q;
    }
    
    static ViewPager b(final ImagePreview imagePreview) {
        return imagePreview.z;
    }
    
    private void b() {
        final int v = MediaGalleryBase.v;
        if (this.o != null) {
            this.o.d();
            this.o = null;
        }
        a_.a();
        if (this.z != null) {
            int n;
            for (int i = 0; i < this.z.getChildCount(); i = n) {
                final View child = this.z.getChildAt(i);
                if (child instanceof PhotoView) {
                    ((PhotoView)child).g();
                }
                n = i + 1;
                if (v != 0) {
                    break;
                }
            }
        }
        App.y();
    }
    
    static int c(final ImagePreview imagePreview) {
        return imagePreview.Q;
    }
    
    private void d(final int v) {
        final int v2 = MediaGalleryBase.v;
        this.v = v;
        int n;
        for (int childCount = this.K.getChildCount(), i = 0; i < childCount; i = n) {
            this.K.getChildAt(i).setSelected(i == v);
            n = i + 1;
            if (v2 != 0) {
                break;
            }
        }
    }
    
    static int[] d(final ImagePreview imagePreview) {
        return imagePreview.R;
    }
    
    static HashMap e(final ImagePreview imagePreview) {
        return imagePreview.I;
    }
    
    static HashMap f(final ImagePreview imagePreview) {
        return imagePreview.n;
    }
    
    static boolean g(final ImagePreview imagePreview) {
        return imagePreview.C;
    }
    
    static Runnable h(final ImagePreview imagePreview) {
        return imagePreview.O;
    }
    
    static Drawable i(final ImagePreview imagePreview) {
        return imagePreview.A;
    }
    
    static ImageView j(final ImagePreview imagePreview) {
        return imagePreview.s;
    }
    
    static HashMap k(final ImagePreview imagePreview) {
        return imagePreview.J;
    }
    
    static View l(final ImagePreview imagePreview) {
        return imagePreview.q;
    }
    
    static void m(final ImagePreview imagePreview) {
        imagePreview.b();
    }
    
    static Handler n(final ImagePreview imagePreview) {
        return imagePreview.x;
    }
    
    static boolean o(final ImagePreview imagePreview) {
        return imagePreview.y;
    }
    
    static ImagePreview$ThumbsGrid p(final ImagePreview imagePreview) {
        return imagePreview.K;
    }
    
    static ArrayList q(final ImagePreview imagePreview) {
        return imagePreview.P;
    }
    
    static View r(final ImagePreview imagePreview) {
        return imagePreview.M;
    }
    
    static View s(final ImagePreview imagePreview) {
        return imagePreview.w;
    }
    
    static int t(final ImagePreview imagePreview) {
        return imagePreview.v;
    }
    
    static HashMap u(final ImagePreview imagePreview) {
        return imagePreview.m;
    }
    
    static l1 v(final ImagePreview imagePreview) {
        return imagePreview.k;
    }
    
    static ViewGroup w(final ImagePreview imagePreview) {
        return imagePreview.H;
    }
    
    static TextView x(final ImagePreview imagePreview) {
        return imagePreview.p;
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final int v = MediaGalleryBase.v;
        if (this.w != null) {
            if (motionEvent.getAction() == 2) {
                this.l.setVisibility(0);
                this.H.getLocationOnScreen(this.R);
                this.H.setPadding((int)motionEvent.getX() - this.R[0] - (int)this.L, (int)motionEvent.getY() - this.R[1] - (int)this.u, 0, 0);
                this.q.setPadding(0, 0, 0, this.l.getHeight() - this.z.getHeight());
                this.p.getLocationOnScreen(this.R);
                final int n = this.R[1] + this.p.getHeight();
                final int n2 = this.H.getHeight() - n;
                int n3 = 0;
                Label_0185: {
                    if (n2 > 0) {
                        n3 = (int)Math.min(100.0f, 100.0f * (n2 - (motionEvent.getY() - n)) / n2);
                        if (v == 0) {
                            break Label_0185;
                        }
                    }
                    n3 = 0;
                }
                if (n3 < 0) {
                    n3 = 0;
                }
                if (n3 > 70) {
                    this.q.setBackgroundColor(255 * (n3 * 2 / 3) / 100 << 24);
                    if (!this.C) {
                        final int alpha = n3 * 255 / 100;
                        this.p.setTextColor(0xFFFFFF | alpha << 24);
                        this.A.setAlpha(alpha);
                    }
                    this.q.clearAnimation();
                    this.x.removeCallbacks(this.O);
                }
                boolean b;
                if (n3 == 100) {
                    b = true;
                }
                else {
                    b = false;
                }
                Label_0568: {
                    if (b && !this.C) {
                        this.C = true;
                        this.p.setTextColor(-65536);
                        this.p.setCompoundDrawablesWithIntrinsicBounds(this.r, (Drawable)null, (Drawable)null, (Drawable)null);
                        final float n4 = 0.5f * this.H.getWidth() / this.p.getWidth();
                        final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, n4, 1.0f, n4, 1, 0.5f, 1, 0.5f);
                        ((Animation)scaleAnimation).setInterpolator((Interpolator)new BounceInterpolator());
                        ((Animation)scaleAnimation).setDuration(800L);
                        ((Animation)scaleAnimation).setFillAfter(true);
                        this.p.clearAnimation();
                        this.p.startAnimation((Animation)scaleAnimation);
                        this.s.invalidate();
                        if (v == 0) {
                            break Label_0568;
                        }
                    }
                    if (!b && this.C) {
                        this.C = false;
                        this.p.setTextColor(-1);
                        this.p.setCompoundDrawablesWithIntrinsicBounds(this.A, (Drawable)null, (Drawable)null, (Drawable)null);
                        final float n5 = 0.5f * this.H.getWidth() / this.p.getWidth();
                        final ScaleAnimation scaleAnimation2 = new ScaleAnimation(n5, 1.0f, n5, 1.0f, 1, 0.5f, 1, 0.5f);
                        ((Animation)scaleAnimation2).setInterpolator((Interpolator)new LinearInterpolator());
                        ((Animation)scaleAnimation2).setDuration(500L);
                        ((Animation)scaleAnimation2).setFillAfter(true);
                        this.p.clearAnimation();
                        this.p.startAnimation((Animation)scaleAnimation2);
                        this.s.invalidate();
                    }
                }
                this.w.invalidate();
                return true;
            }
            Label_0621: {
                if (motionEvent.getAction() == 1 && this.C) {
                    this.a(this.N, this.w);
                    if (v == 0) {
                        break Label_0621;
                    }
                }
                this.w.invalidate();
            }
            this.C = false;
            this.N = null;
            this.w = null;
            this.l.setVisibility(8);
            this.A.setAlpha(255);
            this.p.clearAnimation();
            this.p.setTextColor(16777215);
            this.p.setCompoundDrawablesWithIntrinsicBounds(this.A, (Drawable)null, (Drawable)null, (Drawable)null);
            this.x.removeCallbacks(this.O);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            case 1: {
                if (n2 == -1) {
                    final Uri uri = this.P.get(this.v);
                    this.J.put(uri, Uri.fromFile(App.D(uri.getLastPathSegment())));
                    final Rect rect = (Rect)intent.getParcelableExtra(ImagePreview.S[16]);
                    if (rect != null) {
                        this.n.put(uri, rect);
                    }
                    a_.a(uri.toString());
                    final PhotoView photoView = (PhotoView)this.z.findViewWithTag((Object)uri);
                    if (photoView != null) {
                        this.a(photoView, uri);
                    }
                    ImagePreview$ThumbImageView.a((ImagePreview$ThumbImageView)this.K.getChildAt(this.v), uri);
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final int v = MediaGalleryBase.v;
        Log.i(ImagePreview.S[10]);
        super.onCreate(bundle);
        App.y();
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(false);
        Bundle extras = null;
        Label_0084: {
            if (bundle == null) {
                this.P = this.getIntent().getParcelableArrayListExtra(ImagePreview.S[14]);
                extras = this.getIntent().getExtras();
                if (v == 0) {
                    break Label_0084;
                }
            }
            else {
                extras = bundle;
            }
            this.P = bundle.getParcelableArrayList(ImagePreview.S[13]);
        }
        final Bundle bundle2 = extras;
        this.I = new HashMap();
        for (final Uri uri : this.P) {
            final String queryParameter = uri.getQueryParameter(ImagePreview.S[11]);
            if (!TextUtils.isEmpty((CharSequence)queryParameter)) {
                this.I.put(uri, queryParameter);
            }
            if (v != 0) {
                break;
            }
        }
        if (bundle2 != null) {
            this.m = (HashMap)bundle2.getSerializable(ImagePreview.S[6]);
            if (this.m == null) {
                this.m = new HashMap();
            }
            this.J = (HashMap)bundle2.getSerializable(ImagePreview.S[8]);
            if (this.J == null) {
                this.J = new HashMap();
            }
            this.n = (HashMap)bundle2.getSerializable(ImagePreview.S[7]);
            if (this.n == null) {
                this.n = new HashMap();
            }
            final HashMap i = (HashMap)bundle2.getSerializable(ImagePreview.S[9]);
            if (i != null) {
                this.I = i;
            }
        }
        this.m.putAll(ImagePreview.G);
        final String stringExtra = this.getIntent().getStringExtra(ImagePreview.S[15]);
        if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
            this.getSupportActionBar().setTitle(cq.c(stringExtra, this.getBaseContext()));
        }
        this.E = this.getIntent().getIntExtra(ImagePreview.S[12], Integer.MAX_VALUE);
        if (this.P == null) {
            this.finish();
            return;
        }
        this.A = this.getResources().getDrawable(2130838827);
        this.r = this.getResources().getDrawable(2130838826);
        this.setContentView(2130903175);
        this.l = (ViewGroup)this.findViewById(2131755625);
        this.p = (TextView)this.findViewById(2131755627);
        this.q = this.findViewById(2131755626);
        this.H = (ViewGroup)this.findViewById(2131755628);
        (this.s = new ImagePreview$2(this, (Context)this)).setSelected(true);
        this.s.setScaleType(ImageView$ScaleType.CENTER_CROP);
        this.H.addView((View)this.s);
        (this.z = (ViewPager)this.findViewById(2131755397)).setPageMargin((int)(12.0f * this.getResources().getDisplayMetrics().density));
        this.D = new a5(this, null);
        this.z.setAdapter(this.D);
        this.z.setOnPageChangeListener(new b7(this));
        final Button button = (Button)this.findViewById(2131755546);
        button.setText(2131231632);
        button.setOnClickListener((View$OnClickListener)new bh(this));
        (this.B = new ImagePreview$5(this, (Context)this)).setScaleType(ImageView$ScaleType.CENTER);
        this.B.setImageResource(2130838707);
        this.B.setBackgroundResource(2130839068);
        this.B.setOnClickListener((View$OnClickListener)new j(this));
        (this.k = new v(this, this)).a(new at(this));
        ((Button)this.findViewById(2131755547)).setOnClickListener((View$OnClickListener)new a8(this));
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131755624);
        viewGroup.addView((View)(this.K = new ImagePreview$ThumbsGrid(this, (Context)this)));
        if (this.E == 0 && this.P.size() == 1) {
            viewGroup.setVisibility(4);
        }
        this.M = this.findViewById(2131755621);
        this.M.getViewTreeObserver().addOnGlobalLayoutListener(this.F);
        this.a();
        this.d(0);
        this.o = new a_(this.getContentResolver(), this.t);
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131230986).setIcon(2130838717), 2);
        MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131231611).setIcon(2130838730), 2);
        if (App.aS == 3) {
            b_.c(this);
        }
        return true;
    }
    
    @Override
    protected void onDestroy() {
        Log.i(ImagePreview.S[0]);
        super.onDestroy();
        this.M.getViewTreeObserver().removeGlobalOnLayoutListener(this.F);
        ImagePreview.G.putAll(this.m);
        if (this.o != null) {
            this.o.d();
            this.o = null;
        }
    }
    
    @Override
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (App.aS == 3 && n == 84) {
            b_.a(this, false);
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: {
                this.finish();
                return true;
            }
            case 0: {
                final Intent intent = new Intent((Context)this, (Class)CropImage.class);
                final Uri data = this.P.get(this.v);
                intent.putExtra(ImagePreview.S[22], false);
                intent.putExtra(ImagePreview.S[21], false);
                intent.putExtra(ImagePreview.S[24], false);
                intent.putExtra(ImagePreview.S[23], ym.j);
                intent.putExtra(ImagePreview.S[17], (Parcelable)Uri.fromFile(App.D(data.getLastPathSegment())));
                intent.putExtra(ImagePreview.S[18], Bitmap$CompressFormat.JPEG.toString());
                intent.setData(data);
                if (this.n.containsKey(data)) {
                    intent.putExtra(ImagePreview.S[19], (Parcelable)this.n.get(data));
                }
                if (this.m.containsKey(data)) {
                    intent.putExtra(ImagePreview.S[20], (Serializable)this.m.get(data));
                }
                this.startActivityForResult(intent, 1);
                return true;
            }
            case 1: {
                if (this.v >= 0) {
                    final Uri uri = this.P.get(this.v);
                    Integer value = this.m.get(uri);
                    if (value == null) {
                        value = 0;
                    }
                    Integer n = 90 + value;
                    if (n >= 360) {
                        n -= 360;
                    }
                    Label_0383: {
                        if (n == 0) {
                            this.m.remove(uri);
                            if (MediaGalleryBase.v == 0) {
                                break Label_0383;
                            }
                        }
                        this.m.put(uri, n);
                    }
                    this.K.getChildAt(this.v).invalidate();
                    final PhotoView photoView = (PhotoView)this.z.findViewWithTag((Object)uri);
                    if (photoView != null) {
                        photoView.f();
                    }
                }
                return true;
            }
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList(ImagePreview.S[2], this.P);
        bundle.putSerializable(ImagePreview.S[3], (Serializable)this.m);
        bundle.putSerializable(ImagePreview.S[4], (Serializable)this.J);
        bundle.putSerializable(ImagePreview.S[1], (Serializable)this.n);
        bundle.putSerializable(ImagePreview.S[5], (Serializable)this.I);
    }
}
