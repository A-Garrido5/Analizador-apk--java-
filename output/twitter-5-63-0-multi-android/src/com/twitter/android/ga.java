// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeService;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.widget.Toast;
import com.twitter.android.widget.RevealClipFrameLayout;
import android.os.Bundle;
import java.util.WeakHashMap;
import android.widget.TextView;
import android.widget.ImageButton;
import java.util.Map;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;
import com.twitter.util.concurrent.i;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Iterator;
import android.content.SharedPreferences;
import com.twitter.library.util.bk;
import android.preference.PreferenceManager;
import com.twitter.android.media.widget.FilterFilmstripView;
import android.view.View;
import com.twitter.library.media.widget.g;
import com.twitter.library.media.util.ImageOrientation;
import com.twitter.library.media.widget.CroppableImageView;
import com.twitter.media.filters.Filters;
import com.twitter.library.media.widget.e;
import com.twitter.media.filters.d;
import com.twitter.library.media.manager.l;
import com.twitter.library.media.decoder.c;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.widget.FilteredImageView;
import java.util.ArrayList;
import android.graphics.RectF;
import java.util.List;
import com.twitter.library.util.ReferenceMap;
import android.content.Context;
import com.twitter.android.media.widget.t;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.PagerAdapter;

class ga extends PagerAdapter implements ViewPager$OnPageChangeListener, t
{
    final /* synthetic */ EditImageFragment a;
    private final Context b;
    private gh c;
    private int d;
    private ReferenceMap e;
    private List f;
    private boolean g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private RectF l;
    
    private ga(final EditImageFragment a, final Context b) {
        this.a = a;
        this.e = ReferenceMap.a(7);
        this.f = new ArrayList();
        this.b = b;
    }
    
    private void a(final gg gg) {
        final EditableImage c = gg.c;
        gg.b.a(com.twitter.library.media.manager.j.a(c.c().toString()).a(new c(this.a.getActivity().getApplicationContext(), c.filterId, c.enhanced, this.a.e.getIntensity(), this.a.f)), false);
    }
    
    private void a(final gg gg, final int n) {
        final int abs = Math.abs(this.d - n);
        if (abs > 1) {
            gg.b.f();
            return;
        }
        final MediaImageView b = gg.b;
        float scaleFactor;
        if (abs == 0) {
            scaleFactor = 2.0f;
        }
        else {
            scaleFactor = 1.0f;
        }
        b.setScaleFactor(scaleFactor);
        this.a(gg);
    }
    
    private void a(final FilteredImageView filteredImageView, final EditableImage editableImage, final boolean b) {
        filteredImageView.a(com.twitter.library.media.manager.j.a(editableImage.c().toString()).a(editableImage.cropRect).a(editableImage.rotation));
        filteredImageView.setFilterRenderListener(new ge(this, filteredImageView));
        if (b) {
            if (filteredImageView.a()) {
                this.g = true;
            }
            else {
                filteredImageView.setOnImageLoadedListener(new gf(this, filteredImageView));
            }
        }
        if (!this.f.isEmpty()) {
            filteredImageView.setFilters(this.f.remove(0));
            filteredImageView.a(editableImage.filterId, editableImage.enhanced);
            return;
        }
        new gm(this, (Context)this.a.getActivity(), null).execute((Object[])new Void[0]);
    }
    
    private void a(final MediaImageView mediaImageView, final EditableImage editableImage) {
        final CroppableImageView croppableImageView = (CroppableImageView)mediaImageView.getImageView();
        int rotation;
        if (this.k != 0) {
            rotation = this.k;
        }
        else {
            rotation = editableImage.rotation;
        }
        if ((this.l != null && !this.l.isEmpty()) || (editableImage.cropRect != null && !editableImage.cropRect.isEmpty())) {
            RectF rectF;
            if (this.l != null) {
                rectF = this.l;
            }
            else {
                rectF = editableImage.cropRect;
            }
            croppableImageView.setImageSelection(ImageOrientation.a(rotation).b().a(rectF, 0.5f, 0.5f));
        }
        else {
            croppableImageView.setImageSelection(new RectF(0.0f, 0.0f, 1.0f, 1.0f));
        }
        croppableImageView.setRotation(rotation);
        croppableImageView.setCropListener(new gd(this));
        this.l = null;
        this.k = 0;
    }
    
    private gg k() {
        final View view = (View)this.e.a((Object)this.d);
        if (view != null) {
            return (gg)view.getTag();
        }
        return null;
    }
    
    public void a(final float cropAspectRatio) {
        final gg k = this.k();
        if (k != null) {
            ((CroppableImageView)k.b.getImageView()).setCropAspectRatio(cropAspectRatio);
        }
    }
    
    public void a(final int n) {
        final gg k = this.k();
        if (k != null) {
            ((CroppableImageView)k.b.getImageView()).a(n, true);
        }
    }
    
    public void a(final RectF l) {
        this.l = l;
    }
    
    public void a(final gh c) {
        this.c = c;
        this.notifyDataSetChanged();
    }
    
    @Override
    public void a(final FilterFilmstripView filterFilmstripView) {
        final float intensity = filterFilmstripView.getIntensity();
        final gg gg = (gg)((View)this.e.a((Object)this.d)).getTag();
        gg.a.setFilterIntensity(intensity);
        gg.a.a(filterFilmstripView.getSelectedFilter(), gg.c.enhanced);
        if (this.a.l && filterFilmstripView.getSelectedFilter() != 0) {
            this.a.i();
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this.a.getActivity());
            defaultSharedPreferences.edit().putInt("filters_tooltip_times_shown", defaultSharedPreferences.getInt("filters_tooltip_times_shown", 0) + 1).putLong("filters_tooltip_last_time_shown", bk.a()).apply();
            this.a.l = false;
        }
        final int filterId = gg.c.filterId;
        gg.c.filterId = filterFilmstripView.getSelectedFilter();
        gg.c.intensity = intensity;
        if (gg.c.filterId != filterId) {
            this.a(gg);
        }
    }
    
    public void a(final Filters filters) {
        if (this.a.k) {
            if (filters != null) {
                filters.b();
            }
        }
        else {
            if (filters == null) {
                this.a.h();
                return;
            }
            final Iterator<View> iterator = (Iterator<View>)this.e.h().iterator();
            while (true) {
                while (iterator.hasNext()) {
                    final gg gg = (gg)iterator.next().getTag();
                    if (gg != null && gg.a.getFilters() == null) {
                        gg.a.setFilters(filters);
                        gg.a.a(gg.c.filterId, gg.c.enhanced);
                        final int n = 1;
                        if (n == 0) {
                            this.f.add(filters);
                        }
                        return;
                    }
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    public void a(final boolean b) {
        final gg k = this.k();
        if (k != null) {
            k.a.setVisibility(0);
            k.b.setVisibility(4);
            if (b) {
                this.a(k.b, k.c);
                return;
            }
            final CroppableImageView croppableImageView = (CroppableImageView)k.b.getImageView();
            final int imageRotation = croppableImageView.getImageRotation();
            k.c.cropRect = ImageOrientation.a(imageRotation).a(croppableImageView.getNormalizedImageSelection(), 0.5f, 0.5f);
            k.c.rotation = imageRotation;
            k.a.a(com.twitter.library.media.manager.j.a(k.c.c().toString()).a(k.c.cropRect).a(k.c.rotation));
            final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.a.aF().g()).b("", this.a.g, "image_attachment", "crop", "success");
            if (this.a.b == 2) {
                twitterScribeLog.d("free_aspect");
            }
            else if (this.a.b == 1) {
                twitterScribeLog.d("original_aspect");
            }
            else if (this.a.b == 3) {
                twitterScribeLog.d("wide_aspect");
            }
            else if (this.a.b == 4) {
                twitterScribeLog.d("square_aspect");
            }
            com.twitter.android.client.c.a((Context)this.a.getActivity()).a(twitterScribeLog);
        }
    }
    
    public boolean a() {
        final EditableImage c = ((gg)((View)this.e.a((Object)this.d)).getTag()).c;
        c.enhanced = !c.enhanced;
        this.a(this.a.e);
        final gg k = this.k();
        if (k != null) {
            this.a(k);
        }
        return c.enhanced;
    }
    
    public void b() {
        final gg k = this.k();
        if (k != null) {
            k.a.setVisibility(8);
            k.b.setVisibility(0);
            return;
        }
        this.j = true;
    }
    
    public void b(final int k) {
        this.k = k;
    }
    
    @Override
    public void b(final FilterFilmstripView filterFilmstripView) {
        final gg k = this.k();
        if (k != null) {
            this.a(k);
        }
    }
    
    public void c() {
        final gg k = this.k();
        if (k != null) {
            this.a(((ImageFile)k.c.mediaFile).size.e());
        }
    }
    
    public void d() {
        if (this.k() != null) {
            this.k().a.g();
        }
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        final View view = (View)o;
        final gg gg = (gg)view.getTag();
        this.f.add(gg.a.getFilters());
        gg.a.i();
        viewGroup.removeView(view);
        this.e.c(n);
    }
    
    public void e() {
        final gg k = this.k();
        if (k != null) {
            k.a.h();
        }
    }
    
    public void f() {
        final gg k = this.k();
        if (k != null) {
            k.a.i();
        }
    }
    
    public EditableImage g() {
        final gg k = this.k();
        if (k != null) {
            return k.c;
        }
        return null;
    }
    
    @Override
    public int getCount() {
        int count;
        if (this.c != null) {
            count = this.c.getCount();
        }
        else {
            count = 0;
        }
        if (count != this.h) {
            this.h = count;
            this.notifyDataSetChanged();
        }
        return count;
    }
    
    public void h() {
        final Iterator<Filters> iterator = this.f.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
        final Iterator<View> iterator2 = this.e.h().iterator();
        while (iterator2.hasNext()) {
            final gg gg = (gg)iterator2.next().getTag();
            if (gg != null) {
                gg.a.i();
                final Filters filters = gg.a.getFilters();
                if (filters == null) {
                    continue;
                }
                filters.b();
            }
        }
    }
    
    public boolean i() {
        final gg k = this.k();
        return k != null && k.b.getVisibility() == 0;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final View inflate = LayoutInflater.from(this.b).inflate(2130968741, viewGroup, false);
        final FilteredImageView filteredImageView = (FilteredImageView)inflate.findViewById(2131886686);
        final MediaImageView mediaImageView = (MediaImageView)inflate.findViewById(2131886687);
        this.e.a(n, inflate);
        final i a = this.c.a(n);
        a.a(new com.twitter.util.concurrent.e().a(EditImageFragment.a).a(new gb(this, filteredImageView, mediaImageView, inflate, n)));
        this.a.a(a);
        viewGroup.addView(inflate);
        return inflate;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return view == o;
    }
    
    public boolean j() {
        return this.i;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        this.i = (n != 0);
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
    }
    
    @Override
    public void onPageSelected(final int d) {
        final gg k = this.k();
        if (k != null) {
            k.a.g();
        }
        this.d = d;
        final gg i = this.k();
        if (i != null) {
            i.a.h();
            this.a.a(i.c);
        }
        for (final int intValue : this.e.g()) {
            final View view = (View)this.e.a((Object)intValue);
            if (view != null && view.getTag() != null) {
                this.a((gg)view.getTag(), intValue);
            }
        }
    }
}
