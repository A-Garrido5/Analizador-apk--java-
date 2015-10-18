// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.media.widget.e;
import android.view.View$OnClickListener;
import com.twitter.library.media.model.MediaType;
import android.view.animation.Animation$AnimationListener;
import java.util.concurrent.Callable;
import com.twitter.util.concurrent.m;
import com.twitter.util.concurrent.b;
import java.util.NoSuchElementException;
import com.twitter.util.concurrent.i;
import android.net.Uri;
import android.animation.LayoutTransition$TransitionListener;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.view.animation.AnimationUtils;
import com.twitter.library.featureswitch.d;
import android.view.LayoutInflater;
import android.view.View;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.widget.EditableMediaView;
import com.twitter.library.media.model.EditableMedia;
import android.view.animation.Animation;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.twitter.android.gh;
import android.widget.LinearLayout;

public class MediaAttachmentsView extends LinearLayout implements gh
{
    static final /* synthetic */ boolean a;
    private final aj b;
    private final ViewGroup c;
    private final LayoutTransition d;
    private final Animation e;
    private final Animation f;
    private final boolean g;
    private int h;
    private EditableMedia i;
    private boolean j;
    private int k;
    private int l;
    private EditableMediaView m;
    private int n;
    private boolean o;
    private boolean p;
    private af q;
    private EditableImage r;
    
    static {
        a = !MediaAttachmentsView.class.desiredAssertionStatus();
    }
    
    public MediaAttachmentsView(final Context context) {
        this(context, null);
    }
    
    public MediaAttachmentsView(final Context context, final AttributeSet set) {
        this(context, set, 2130772038);
    }
    
    public MediaAttachmentsView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.MediaAttachmentsView, n, 0);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.l = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        obtainStyledAttributes.recycle();
        final aj b = new aj(context);
        b.setHorizontalScrollBarEnabled(false);
        this.addView((View)b);
        final ViewGroup c = (ViewGroup)LayoutInflater.from(this.getContext()).inflate(2130968872, (ViewGroup)b, false);
        b.addView((View)c);
        this.b = b;
        this.c = c;
        this.g = com.twitter.library.featureswitch.d.f("enhanced_media_flow_swipe_photos_composer_enabled");
        this.h = (int)context.getResources().getDimension(2131558586);
        this.e = AnimationUtils.loadAnimation(context, 2131034138);
        this.f = AnimationUtils.loadAnimation(context, 2131034139);
        if (Build$VERSION.SDK_INT >= 16) {
            final LayoutTransition d = new LayoutTransition();
            d.disableTransitionType(2);
            d.disableTransitionType(0);
            d.disableTransitionType(3);
            this.d = d;
            this.c();
            return;
        }
        this.d = null;
    }
    
    private void a(final View view) {
        if (view == this.m) {
            this.removeView(view);
            this.m = null;
            return;
        }
        this.c.removeView(view);
        final LayoutTransition layoutTransition = this.c.getLayoutTransition();
        if (layoutTransition != null) {
            if (this.getMediaCount() == 1) {
                layoutTransition.addTransitionListener((LayoutTransition$TransitionListener)new aa(this, this.c, layoutTransition));
                return;
            }
            layoutTransition.addTransitionListener((LayoutTransition$TransitionListener)new ab(this, this.b, layoutTransition));
        }
        else {
            if (this.getMediaCount() == 1) {
                final View child = this.c.getChildAt(0);
                this.c.removeView(child);
                this.addView(child, 0);
                this.m = (EditableMediaView)child;
                this.a((EditableMediaView)child, false);
                return;
            }
            this.j = true;
        }
    }
    
    private void a(final EditableMediaView m) {
        if (this.n == 0) {
            this.addView((View)m, 0);
            this.m = m;
        }
        else {
            if (this.n == 1) {
                if (!MediaAttachmentsView.a && this.m == null) {
                    throw new AssertionError();
                }
                final EditableMediaView i = this.m;
                this.m = null;
                this.a(i, true);
                this.removeView((View)i);
                this.c.addView((View)i, 0);
            }
            this.c.addView((View)m, this.c.getChildCount());
        }
        ++this.n;
    }
    
    public EditableMediaView a(final Uri uri) {
        if (uri != null) {
            Label_0060: {
                if (this.m == null) {
                    break Label_0060;
                }
                final EditableMedia editableMedia = this.m.getEditableMedia();
                if (!MediaAttachmentsView.a && editableMedia == null) {
                    throw new AssertionError();
                }
                if (!uri.equals((Object)editableMedia.c())) {
                    break Label_0060;
                }
                return this.m;
            }
            for (int i = 0; i < this.c.getChildCount(); ++i) {
                final View child = this.c.getChildAt(i);
                if (child instanceof EditableMediaView) {
                    final EditableMediaView m = (EditableMediaView)child;
                    final EditableMedia editableMedia2 = m.getEditableMedia();
                    if (!MediaAttachmentsView.a && editableMedia2 == null) {
                        throw new AssertionError();
                    }
                    if (uri.equals((Object)editableMedia2.c())) {
                        return m;
                    }
                }
            }
        }
        return null;
    }
    
    public i a(final int n) {
        Callable callable;
        if (this.g) {
            if (this.m != null) {
                if (n != 0) {
                    throw new NoSuchElementException();
                }
                callable = new ac(this);
            }
            else {
                callable = new ad(this, (EditableMediaView)this.c.getChildAt(n));
            }
        }
        else {
            callable = new ae(this);
        }
        return new b().a(com.twitter.util.concurrent.m.a).a(callable).a();
    }
    
    public void a() {
        this.c.removeAllViews();
    }
    
    public void a(final Uri uri, final boolean b) {
        final EditableMediaView a = this.a(uri);
        if (a == null) {
            return;
        }
        --this.n;
        if (b) {
            this.f.setAnimationListener((Animation$AnimationListener)new x(this, (View)a));
            ((View)a).startAnimation(this.f);
            this.o = true;
            return;
        }
        if (a == this.m) {
            ((View)a).setVisibility(4);
            return;
        }
        this.a((View)a);
    }
    
    public void a(final EditableMedia editableMedia) {
        for (int i = 0; i < this.c.getChildCount(); ++i) {
            final EditableMediaView editableMediaView = (EditableMediaView)this.c.getChildAt(i);
            final EditableMedia editableMedia2 = editableMediaView.getEditableMedia();
            if (editableMedia2 != null && editableMedia2.c().equals((Object)editableMedia.c())) {
                this.b.scrollTo(editableMediaView.getLeft(), 0);
                if (i != -1 + this.c.getChildCount()) {
                    this.b.a();
                }
            }
        }
    }
    
    public void a(final EditableMedia i, final boolean b) {
        EditableMediaView a = this.a(i.c());
        if (a == null) {
            a = new EditableMediaView(this.getContext());
            final ag ag = new ag(this, a);
            if (i.e() != MediaType.c) {
                LayoutInflater.from(this.getContext()).inflate(2130968687, (ViewGroup)a);
                a.findViewById(2131886573).setOnClickListener((View$OnClickListener)ag);
            }
            this.a(a);
            a.setOnClickListener((View$OnClickListener)ag);
            final View dismissView = a.getDismissView();
            if (dismissView != null) {
                dismissView.setOnClickListener((View$OnClickListener)new ah(this, a));
            }
        }
        else {
            a.c();
        }
        a.a(this.i = i, b);
        this.a(a, true);
        a.setAspectRatio(i.a());
        if (this.i != null && a == this.m) {
            if (b && !a.i()) {
                a.setOnImageLoadedListener(new w(this));
            }
            else {
                a.clearAnimation();
            }
        }
        a.setId(2131886135);
    }
    
    void a(final EditableMediaView editableMediaView, final boolean b) {
        int n = -2;
        LinearLayout$LayoutParams layoutParams;
        if (b) {
            int h;
            if (editableMediaView == this.m) {
                if (editableMediaView.getTag(2131886086) != null) {
                    editableMediaView.setMaxAspectRatio((float)editableMediaView.getTag(2131886086));
                    h = n;
                    n = -1;
                }
                else {
                    h = n;
                    n = -1;
                }
            }
            else {
                h = this.h;
                editableMediaView.setTag(2131886086, (Object)editableMediaView.getMaxAspectRatio());
                if (this.getMeasuredWidth() > 0) {
                    editableMediaView.setMaxAspectRatio((this.getMeasuredWidth() - 2 * this.l) / h);
                }
                else {
                    editableMediaView.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new z(this, this.l, editableMediaView, h));
                }
            }
            layoutParams = new LinearLayout$LayoutParams(n, h);
        }
        else {
            layoutParams = (LinearLayout$LayoutParams)editableMediaView.getLayoutParams();
        }
        if (editableMediaView == this.m) {
            layoutParams.leftMargin = this.l;
            layoutParams.rightMargin = this.l;
        }
        else {
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = this.k;
        }
        editableMediaView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public boolean a(final EditableImage editableImage) {
        return true;
    }
    
    public void b() {
        if (this.o) {
            this.p = true;
            return;
        }
        if (this.m != null) {
            this.a((View)this.m);
        }
        this.setVisibility(4);
        this.p = false;
    }
    
    public final void c() {
        this.c.setLayoutTransition(this.d);
    }
    
    public void d() {
        this.c.setLayoutTransition((LayoutTransition)null);
    }
    
    public void e() {
        if (this.m != null) {
            this.m.e();
        }
        else {
            for (int i = 0; i < this.c.getChildCount(); ++i) {
                ((EditableMediaView)this.c.getChildAt(i)).g();
            }
        }
    }
    
    public int getCount() {
        if (this.g) {
            return this.n;
        }
        return 1;
    }
    
    public int getInitialPosition() {
        if (this.g) {
            if (this.r != null) {
                if (this.m != null) {
                    final boolean b = this.r.b(this.m.getEditableMedia());
                    int n = 0;
                    if (!b) {
                        n = -1;
                    }
                    return n;
                }
                for (int childCount = this.c.getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = this.c.getChildAt(i);
                    if (child instanceof EditableMediaView && this.r.b(((EditableMediaView)child).getEditableMedia())) {
                        return i;
                    }
                }
            }
            return -1;
        }
        return 0;
    }
    
    public int getMediaCount() {
        return this.n;
    }
    
    public int getSelectedCount() {
        return this.n;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.i != null) {
            this.a(this.i);
            this.i = null;
        }
        else if (this.j) {
            this.b.a();
            this.j = false;
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final MediaAttachmentsView$SavedState mediaAttachmentsView$SavedState = (MediaAttachmentsView$SavedState)parcelable;
        super.onRestoreInstanceState(mediaAttachmentsView$SavedState.getSuperState());
        this.r = mediaAttachmentsView$SavedState.a;
    }
    
    public Parcelable onSaveInstanceState() {
        final MediaAttachmentsView$SavedState mediaAttachmentsView$SavedState = new MediaAttachmentsView$SavedState(super.onSaveInstanceState());
        mediaAttachmentsView$SavedState.a = this.r;
        return (Parcelable)mediaAttachmentsView$SavedState;
    }
    
    public void setActionListener(final af q) {
        this.q = q;
    }
    
    public void setError(final Uri uri) {
        final EditableMediaView a = this.a(uri);
        if (a == null) {
            return;
        }
        a.h();
    }
    
    public void setSelectedImage(final EditableImage r) {
        this.r = r;
    }
}
