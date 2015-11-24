// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.twitter.library.util.bq;
import android.graphics.Bitmap;
import android.view.TouchDelegate;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.EditableVideo;
import com.twitter.library.media.model.VideoFile;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import java.util.concurrent.Future;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.model.m;
import android.widget.TextView;
import com.twitter.library.media.widget.VideoDurationView;
import android.view.View;
import android.widget.ImageView;
import com.twitter.library.widget.AspectRatioFrameLayout;

public class MediaStoreItemView extends AspectRatioFrameLayout
{
    private final int a;
    private ImageView c;
    private ImageView d;
    private View e;
    private View f;
    private ImageView g;
    private VideoDurationView h;
    private View i;
    private View j;
    private TextView k;
    private m l;
    private EditableMedia m;
    private Size n;
    private Future o;
    private boolean p;
    private dp q;
    
    public MediaStoreItemView(final Context context) {
        this(context, null, 0);
    }
    
    public MediaStoreItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MediaStoreItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.n = Size.a;
        this.a = context.getResources().getDimensionPixelSize(2131558594);
    }
    
    private Rect a(final View view) {
        final Rect rect = new Rect();
        final int width = view.getWidth();
        final int n = width - this.a;
        final int height = view.getHeight();
        rect.set(n, height - this.a, width, height);
        return rect;
    }
    
    private void b() {
        if (this.o != null) {
            this.o.cancel(false);
            this.o = null;
        }
    }
    
    private void d(final boolean b) {
        ObjectAnimator objectAnimator;
        if (b) {
            this.j.setVisibility(0);
            this.j.setAlpha(0.0f);
            objectAnimator = ObjectAnimator.ofFloat((Object)this.j, View.ALPHA, new float[] { 0.0f, 1.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)this.j, View.ALPHA, new float[] { 1.0f, 0.0f });
            objectAnimator.addListener((Animator$AnimatorListener)new dn(this));
        }
        objectAnimator.setDuration(100L);
        objectAnimator.start();
    }
    
    private void setEditableMedia(final EditableMedia m) {
        this.m = m;
        MediaType a = null;
        if (m != null) {
            final MediaType e = m.e();
            switch (do.a[e.ordinal()]) {
                default: {
                    a = e;
                    break;
                }
                case 1: {
                    this.g.setVisibility(4);
                    this.h.setVisibility(4);
                    a = e;
                    break;
                }
                case 2: {
                    this.g.setVisibility(0);
                    this.h.setVisibility(4);
                    a = e;
                    break;
                }
                case 3: {
                    this.g.setVisibility(4);
                    this.h.setDuration(((VideoFile)((EditableVideo)m).mediaFile).duration);
                    this.h.setVisibility(0);
                    a = e;
                    break;
                }
            }
        }
        else {
            a = MediaType.a;
            this.g.setVisibility(4);
            this.h.setVisibility(4);
        }
        boolean b;
        if (this.p && a != MediaType.a && a != MediaType.c) {
            b = true;
        }
        else {
            b = false;
        }
        final View i = this.i;
        int visibility = 0;
        if (!b) {
            visibility = 4;
        }
        i.setVisibility(visibility);
        final View view = (View)this.i.getParent();
        if (b) {
            view.post((Runnable)new dm(this, view));
            return;
        }
        view.setTouchDelegate((TouchDelegate)null);
    }
    
    public void a() {
        this.k.setVisibility(8);
        this.d(false);
    }
    
    public void a(final int n) {
        final int visibility = this.k.getVisibility();
        this.k.setVisibility(0);
        this.k.setText((CharSequence)String.valueOf(n));
        if (visibility != 0) {
            this.d(true);
        }
    }
    
    public void a(final Bitmap imageBitmap, final EditableMedia editableMedia) {
        this.b();
        if (imageBitmap == null) {
            try {
                this.g.setVisibility(4);
                this.c.setImageResource(2130839388);
                return;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                bq.a(outOfMemoryError);
                return;
            }
        }
        this.setEditableMedia(editableMedia);
        this.c.setImageBitmap(imageBitmap);
    }
    
    public void a(final boolean b) {
        final int visibility = this.d.getVisibility();
        final ImageView d = this.d;
        int visibility2;
        if (b) {
            visibility2 = 0;
        }
        else {
            visibility2 = 4;
        }
        d.setVisibility(visibility2);
        if (gr.a() && visibility != 0) {
            this.d(b);
        }
    }
    
    public void b(final boolean b) {
        final View e = this.e;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        e.setVisibility(visibility);
    }
    
    public void c(final boolean b) {
        final View f = this.f;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        f.setVisibility(visibility);
    }
    
    public EditableMedia getEditableMedia() {
        return this.m;
    }
    
    public m getMediaStoreItem() {
        return this.l;
    }
    
    public MediaType getMediaType() {
        if (this.m != null) {
            return this.m.e();
        }
        return MediaType.a;
    }
    
    public ImageView getSelectedMarkView() {
        return this.d;
    }
    
    public boolean isEnabled() {
        return super.isEnabled() && this.m != null && this.m.e() != MediaType.a;
    }
    
    public boolean isSelected() {
        return this.d.getVisibility() == 0 || this.k.getVisibility() == 0;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.q != null) {
            this.q.b(this);
        }
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView)this.findViewById(2131886627);
        this.d = (ImageView)this.findViewById(2131886628);
        this.e = this.findViewById(2131886778);
        this.f = this.findViewById(2131886780);
        this.g = (ImageView)this.findViewById(2131886775);
        this.h = (VideoDurationView)this.findViewById(2131886162);
        this.i = this.findViewById(2131886779);
        this.k = (TextView)this.findViewById(2131886777);
        this.j = this.findViewById(2131886776);
        this.i.setOnClickListener((View$OnClickListener)new dl(this));
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.q != null) {
            final Size a = Size.a(n3 - n, n4 - n2);
            if (!a.d(this.n)) {
                this.b();
                this.n = a;
                if (this.l != null) {
                    this.o = this.q.b(this, a);
                }
            }
        }
    }
    
    public void setCallback(final dp q) {
        this.q = q;
    }
    
    public void setMediaStoreItem(final m l) {
        this.b();
        this.l = l;
        this.c.setImageDrawable((Drawable)null);
        this.g.setVisibility(4);
        this.i.setVisibility(4);
        if (l == null) {
            this.setEditableMedia(null);
        }
        else if (!this.n.c() && this.q != null) {
            this.o = this.q.b(this, this.n);
        }
    }
    
    public void setShowExpand(final boolean p) {
        if (this.p != p) {
            final View view = (View)this.i.getParent();
            this.p = p;
            if (!p || this.m == null) {
                view.setTouchDelegate((TouchDelegate)null);
                this.i.setVisibility(4);
                return;
            }
            final MediaType e = this.m.e();
            boolean b;
            if (this.p && e != MediaType.a && e != MediaType.c) {
                b = true;
            }
            else {
                b = false;
            }
            final View i = this.i;
            int visibility = 0;
            if (!b) {
                visibility = 4;
            }
            i.setVisibility(visibility);
            if (b && view.getTouchDelegate() == null) {
                view.setTouchDelegate(new TouchDelegate(this.a(view), this.i));
            }
        }
    }
}
