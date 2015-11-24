// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.transition.Transition;
import android.view.Window;
import android.widget.ListAdapter;
import android.graphics.drawable.ColorDrawable;
import com.whatsapp.util.m;
import com.whatsapp.App;
import android.transition.TransitionInflater;
import android.os.Bundle;
import com.whatsapp.util.Log;
import android.graphics.BitmapFactory;
import android.content.Context;
import android.os.Build$VERSION;
import com.whatsapp.alm;
import android.widget.GridView;
import android.os.Handler;
import android.database.ContentObserver;
import java.util.ArrayList;
import android.os.AsyncTask;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import com.whatsapp.DialogToastActivity;

public abstract class MediaGalleryBase extends DialogToastActivity
{
    private static final String[] E;
    private static Bitmap q;
    private static boolean t;
    public static int v;
    private static Bitmap w;
    private static Bitmap x;
    private int A;
    protected int B;
    private Drawable C;
    private final ac D;
    private View k;
    private AsyncTask l;
    private ArrayList m;
    private int n;
    protected aa o;
    private ContentObserver p;
    private Handler r;
    protected u s;
    private a_ u;
    protected GridView y;
    private int z;
    
    static {
        int t = 1;
        final String[] e = new String[4];
        String s = "\u000bNwF\b\u0001J\u007fC\f\u0014R<K\f\u0015_a@\u0010";
        int n = -1;
        String[] array = e;
        int n2 = 0;
        String intern = null;
    Label_0143:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = 'f';
                        break;
                    }
                    case 1: {
                        c2 = '+';
                        break;
                    }
                    case 2: {
                        c2 = '\u0013';
                        break;
                    }
                    case 3: {
                        c2 = '/';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "FXpN\u0007\bB}HS";
                    n2 = t;
                    array = e;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000bNwF\b\u0001J\u007fC\f\u0014R<]\f\u0004JxJI\u0013E~@\u001c\b_vKS";
                    n2 = 2;
                    array = e;
                    n = t;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = e;
                    s = "\u000bNwF\b\u0001J\u007fC\f\u0014R<]\f\u0015^~J";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0143;
                }
            }
        }
        array[n2] = intern;
        E = e;
        if (!alm.c || Build$VERSION.SDK_INT >= 21) {
            t = 0;
        }
        MediaGalleryBase.t = (t != 0);
    }
    
    public MediaGalleryBase() {
        this.D = new ac();
        this.m = new ArrayList();
        this.r = new Handler();
        this.p = new ar(this, this.r);
    }
    
    public static Bitmap a(final bj bj, final Context context) {
        if (bd.b(bj)) {
            if (MediaGalleryBase.w == null) {
                MediaGalleryBase.w = BitmapFactory.decodeResource(context.getResources(), 2130838809);
            }
            return MediaGalleryBase.w;
        }
        if (bd.a(bj)) {
            if (MediaGalleryBase.q == null) {
                MediaGalleryBase.q = BitmapFactory.decodeResource(context.getResources(), 2130838808);
            }
            return MediaGalleryBase.q;
        }
        if (bd.c(bj)) {
            if (MediaGalleryBase.x == null) {
                MediaGalleryBase.x = BitmapFactory.decodeResource(context.getResources(), 2130838696);
            }
            return MediaGalleryBase.x;
        }
        return null;
    }
    
    static ArrayList a(final MediaGalleryBase mediaGalleryBase) {
        return mediaGalleryBase.m;
    }
    
    static Drawable b(final MediaGalleryBase mediaGalleryBase) {
        return mediaGalleryBase.C;
    }
    
    static int c(final MediaGalleryBase mediaGalleryBase) {
        return mediaGalleryBase.z;
    }
    
    static boolean c() {
        return MediaGalleryBase.t;
    }
    
    static int d(final MediaGalleryBase mediaGalleryBase) {
        return mediaGalleryBase.A;
    }
    
    static a_ e(final MediaGalleryBase mediaGalleryBase) {
        return mediaGalleryBase.u;
    }
    
    static ac f(final MediaGalleryBase mediaGalleryBase) {
        return mediaGalleryBase.D;
    }
    
    static int g(final MediaGalleryBase mediaGalleryBase) {
        return mediaGalleryBase.n;
    }
    
    protected abstract MediaGalleryBase$MediaItemView a();
    
    protected abstract aa a(final boolean p0);
    
    protected void a(final boolean b, final boolean b2) {
        int supportProgressBarIndeterminateVisibility = 1;
        Log.i(MediaGalleryBase.E[2] + b + MediaGalleryBase.E[supportProgressBarIndeterminateVisibility] + b2);
        if (this.l != null) {
            this.l.cancel((boolean)(supportProgressBarIndeterminateVisibility != 0));
        }
        if (this.o != null) {
            this.o.a(this.p);
            this.o.a();
            this.o = null;
        }
        this.setSupportProgressBarIndeterminateVisibility(supportProgressBarIndeterminateVisibility != 0);
        if (b) {
            supportProgressBarIndeterminateVisibility = 0;
        }
        this.o = this.a(supportProgressBarIndeterminateVisibility != 0);
        this.m.clear();
        this.o.b(this.p);
        final View k = this.k;
        int visibility;
        if (this.o.e() > 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        k.setVisibility(visibility);
        this.B = 0;
        this.s.notifyDataSetChanged();
        (this.l = new w(this, b, b2)).execute((Object[])new Void[0]);
    }
    
    protected abstract boolean a(final int p0);
    
    public void onCreate(final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 21) {
            final Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.requestFeature(13);
            window.requestFeature(12);
            final Transition inflateTransition = TransitionInflater.from((Context)this).inflateTransition(17760259);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setEnterTransition(inflateTransition);
            final Transition inflateTransition2 = TransitionInflater.from((Context)this).inflateTransition(17760258);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            window.setExitTransition(inflateTransition2);
            final Transition inflateTransition3 = TransitionInflater.from((Context)this).inflateTransition(17760258);
            inflateTransition3.excludeTarget(16908335, true);
            inflateTransition3.excludeTarget(16908336, true);
            window.setReturnTransition(inflateTransition3);
            final Transition inflateTransition4 = TransitionInflater.from((Context)this).inflateTransition(17760257);
            window.setSharedElementEnterTransition(inflateTransition4);
            window.setSharedElementExitTransition(inflateTransition4);
            this.supportPostponeEnterTransition();
        }
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!App.ak()) {
            this.getSupportActionBar().setHomeAsUpIndicator((Drawable)new m(this.getResources().getDrawable(2130838739)));
        }
        this.setContentView(2130903172);
        this.A = this.getResources().getColor(2131623999);
        this.C = (Drawable)new ColorDrawable(this.A);
        this.z = this.getResources().getDimensionPixelSize(2131361915);
        this.k = this.findViewById(2131755581);
        this.y = (GridView)this.findViewById(2131755619);
        if (MediaGalleryBase.t && !App.ak()) {
            this.y.setHorizontalSpacing(0);
        }
        this.s = new u(this);
        this.y.setAdapter((ListAdapter)this.s);
        final int height = this.getWindowManager().getDefaultDisplay().getHeight();
        final int width = this.getWindowManager().getDefaultDisplay().getWidth();
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361915);
        this.n = 1 + height * width / (dimensionPixelSize * dimensionPixelSize);
        this.u = new a_(this.getContentResolver(), new Handler());
    }
    
    public void onDestroy() {
        Log.i(MediaGalleryBase.E[0]);
        super.onDestroy();
        if (this.l != null) {
            this.l.cancel(true);
            this.l = null;
        }
        if (this.u != null) {
            this.u.d();
            this.u = null;
        }
        if (this.o != null) {
            this.o.a(this.p);
            this.o.a();
            this.o = null;
        }
        this.B = 0;
    }
    
    public void onResume() {
        Log.i(MediaGalleryBase.E[3]);
        super.onResume();
        this.y.requestFocus();
    }
}
