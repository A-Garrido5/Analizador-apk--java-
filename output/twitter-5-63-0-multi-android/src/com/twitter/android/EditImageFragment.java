// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.concurrent.Executor;
import com.twitter.library.media.widget.g;
import com.twitter.library.media.widget.e;
import com.twitter.media.filters.d;
import com.twitter.library.media.manager.l;
import com.twitter.library.media.decoder.c;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.widget.FilteredImageView;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.util.ReferenceMap;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.PagerAdapter;
import android.os.Parcelable;
import com.twitter.library.media.util.ImageOrientation;
import com.twitter.library.media.widget.CroppableImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.SharedPreferences;
import com.twitter.library.util.bk;
import android.preference.PreferenceManager;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.android.media.widget.t;
import android.content.Context;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import com.twitter.library.media.model.ImageFile;
import android.graphics.Rect;
import android.graphics.RectF;
import com.twitter.library.media.model.EditableImage;
import com.twitter.util.concurrent.i;
import java.util.concurrent.Future;
import android.widget.Toast;
import com.twitter.android.widget.RevealClipFrameLayout;
import android.os.Bundle;
import java.util.WeakHashMap;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageButton;
import com.twitter.media.filters.Filters;
import com.twitter.android.media.widget.FilterFilmstripView;
import java.util.Map;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;

public class EditImageFragment extends AbsFragment implements View$OnClickListener
{
    public static final gl a;
    private static final int[] c;
    private static final int[] d;
    private Map A;
    int b;
    private FilterFilmstripView e;
    private Filters f;
    private String g;
    private ImageButton h;
    private ImageButton i;
    private gh j;
    private boolean k;
    private boolean l;
    private gn m;
    private View n;
    private gi o;
    private gj p;
    private ga q;
    private LockableViewPager r;
    private TextView s;
    private TextView t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    
    static {
        a = new gl();
        c = new int[] { 2131886676, 2131886675, 2131886677, 2131886682, 2131886679, 2131886680, 2131886681 };
        d = new int[] { 2131886682, 2131886679, 2131886680, 2131886681 };
    }
    
    public EditImageFragment() {
        this.b = 1;
        this.A = new WeakHashMap();
        this.u = gr.a();
    }
    
    public static Bundle a(final String s, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putString("scribe_section", s);
        bundle.putInt("initial_position", n);
        return bundle;
    }
    
    public static EditImageFragment a(final gh gh, final gi gi, final View view, final RevealClipFrameLayout revealClipFrameLayout, final String s) {
        final int initialPosition = gh.getInitialPosition();
        if (initialPosition == -1) {
            Toast.makeText(view.getContext().getApplicationContext(), 2131298215, 0).show();
            return null;
        }
        revealClipFrameLayout.setVisibility(0);
        revealClipFrameLayout.setAlpha(0.0f);
        final EditImageFragment editImageFragment = new EditImageFragment();
        editImageFragment.setArguments(a(s, initialPosition));
        editImageFragment.a(gi);
        editImageFragment.a(gh);
        final i a = gh.a(initialPosition);
        editImageFragment.a(new fw(a, editImageFragment, view, revealClipFrameLayout));
        editImageFragment.a(a);
        return editImageFragment;
    }
    
    private void a(final Filters f) {
        this.m = null;
        if (this.k) {
            if (f != null) {
                f.b();
            }
            return;
        }
        if (f == null) {
            this.h();
            return;
        }
        this.f = f;
        this.j();
    }
    
    private void a(final boolean b, final RectF rectF, final int n) {
        this.b(b);
        this.q.a(rectF);
        this.q.b(n);
    }
    
    private static void b(final View view, final EditableImage editableImage, final RevealClipFrameLayout revealClipFrameLayout, final EditImageFragment editImageFragment) {
        final int[] array = { 0, 0 };
        view.getLocationInWindow(array);
        final int[] array2 = { 0, 0 };
        revealClipFrameLayout.getLocationInWindow(array2);
        array[0] -= array2[0];
        array[1] -= array2[1];
        final Rect rect = new Rect(0, 0, revealClipFrameLayout.getMeasuredWidth(), revealClipFrameLayout.getMeasuredHeight());
        final Rect rect2 = new Rect(0, 0, ((ImageFile)editableImage.mediaFile).size.a(), ((ImageFile)editableImage.mediaFile).size.b());
        final Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(rect2), new RectF(rect), Matrix$ScaleToFit.CENTER);
        final RectF rectF = new RectF(rect2);
        matrix.mapRect(rectF);
        revealClipFrameLayout.setPivotX(0.0f);
        revealClipFrameLayout.setPivotY(0.0f);
        final int round = Math.round(rect.width() - rectF.width());
        final int round2 = Math.round(rect.height() - rectF.height());
        float n;
        if (editableImage.a() > 1.0f) {
            n = view.getMeasuredWidth() / (revealClipFrameLayout.getMeasuredWidth() - round);
        }
        else {
            n = view.getMeasuredHeight() / (revealClipFrameLayout.getMeasuredHeight() - round2);
        }
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)revealClipFrameLayout, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("clipX", new int[] { round, 0 }), PropertyValuesHolder.ofInt("clipY", new int[] { round2, 0 }) });
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)revealClipFrameLayout, View.SCALE_X, new float[] { n, 1.0f });
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)revealClipFrameLayout, View.SCALE_Y, new float[] { n, 1.0f });
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)revealClipFrameLayout, View.TRANSLATION_X, new float[] { array[0] - n * (round / 2), 0.0f });
        final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)revealClipFrameLayout, View.TRANSLATION_Y, new float[] { array[1] - n * (round2 / 2), 0.0f });
        final AnimatorSet set = new AnimatorSet();
        set.playTogether(new Animator[] { ofFloat, ofFloat2, ofFloat3, ofFloat4, ofPropertyValuesHolder });
        set.setDuration(250L);
        set.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
        final ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((Object)revealClipFrameLayout, View.ALPHA, new float[] { 0.0f, 1.0f });
        ofFloat5.setDuration(200L);
        set.addListener((Animator$AnimatorListener)new fy(editImageFragment));
        ofFloat5.start();
        set.start();
    }
    
    private void b(final boolean b) {
        TextView textView;
        if (this.getView() != null) {
            textView = (TextView)this.getView().findViewById(2131886249);
        }
        else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(2131296345);
        }
        this.a(false, b);
        this.q.b();
        this.n.setVisibility(0);
        this.getView().findViewById(2131886674).setVisibility(8);
        this.r.setPagingEnabled(false);
        this.s.setText(2131297434);
    }
    
    private void b(final boolean b, final boolean b2) {
        TextView textView;
        if (this.getView() != null) {
            textView = (TextView)this.getView().findViewById(2131886249);
        }
        else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(2131296895);
        }
        this.n.setVisibility(8);
        this.a(true, b);
        this.q.a(b2);
        this.getView().findViewById(2131886674).setVisibility(0);
        this.r.setPagingEnabled(true);
        this.f();
    }
    
    private void d() {
        for (final Map.Entry<EditableImage, V> entry : this.A.entrySet()) {
            final EditableImage editableImage = entry.getKey();
            final gk gk = (gk)entry.getValue();
            editableImage.filterId = gk.a;
            editableImage.cropRect = gk.b;
            editableImage.enhanced = gk.c;
        }
        this.o.ao_();
    }
    
    private void e() {
        ScribeService.a(this.getActivity().getApplicationContext(), new TwitterScribeLog(this.aF().g()).b("", this.g, "editor", "filters", "click"));
    }
    
    private void f() {
        if (this.j != null && this.j.getSelectedCount() != 0) {
            this.s.setText((CharSequence)this.getResources().getString(2131297435, new Object[] { String.valueOf(this.j.getSelectedCount()) }));
            return;
        }
        if (this.u) {
            String string = this.getResources().getString(2131297437);
            final TextView s = this.s;
            if (this.j.getCount() <= 1) {
                string = "";
            }
            s.setText((CharSequence)string);
            return;
        }
        this.s.setText(2131296373);
    }
    
    private void g() {
        final boolean a = this.q.a();
        final ImageButton h = this.h;
        int imageResource;
        if (a) {
            imageResource = this.x;
        }
        else {
            imageResource = this.y;
        }
        h.setImageResource(imageResource);
    }
    
    private void h() {
        ErrorReporter.a(new IllegalStateException("Filters failed to load"));
        Toast.makeText((Context)this.getActivity(), 2131297093, 1).show();
    }
    
    private void i() {
        this.e.postDelayed((Runnable)new fz(this, (View)this.e.getActivePreview()), 250L);
    }
    
    private void j() {
        final EditableImage g = this.q.g();
        if (g != null) {
            this.e.setFilterListener(null);
            this.e.a(this.f, g.c().toString());
            this.e.setSelectedFilter(g.filterId);
            this.e.setIntensity(g.intensity);
            this.e.setFilterListener(this.q);
            this.e.a(false);
            this.q.a(this.e);
        }
    }
    
    public void a(final gh j) {
        this.j = j;
        if (this.q != null) {
            this.q.a(j);
        }
    }
    
    public void a(final gi o) {
        this.o = o;
    }
    
    public void a(final gj p) {
        this.p = p;
    }
    
    public void a(final EditableImage editableImage) {
        final ImageButton h = this.h;
        int imageResource;
        if (editableImage.enhanced) {
            imageResource = this.x;
        }
        else {
            imageResource = this.y;
        }
        h.setImageResource(imageResource);
        final TextView t = this.t;
        int text;
        if (this.j.a(editableImage)) {
            text = 2131296895;
        }
        else {
            text = 2131297662;
        }
        t.setText(text);
        this.j();
        this.o.a(editableImage);
        if (!this.A.containsKey(editableImage)) {
            final Map a = this.A;
            final int filterId = editableImage.filterId;
            RectF rectF;
            if (editableImage.cropRect != null) {
                rectF = new RectF(editableImage.cropRect);
            }
            else {
                rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
            }
            a.put(editableImage, new gk(this, filterId, rectF, editableImage.enhanced));
        }
    }
    
    void a(final boolean enabled) {
        final View view = this.getView();
        if (view != null) {
            final int[] d = EditImageFragment.d;
            for (int length = d.length, i = 0; i < length; ++i) {
                view.findViewById(d[i]).setEnabled(enabled);
            }
        }
    }
    
    public void a(final boolean b, final boolean b2) {
        if (this.e.a(b, b2)) {
            final ImageButton i = this.i;
            int imageResource;
            if (b) {
                imageResource = this.v;
            }
            else {
                imageResource = this.w;
            }
            i.setImageResource(imageResource);
            if (this.u) {
                final TransitionDrawable transitionDrawable = (TransitionDrawable)this.getView().findViewById(2131886674).getBackground();
                if (b) {
                    transitionDrawable.startTransition(250);
                }
                else {
                    transitionDrawable.reverseTransition(250);
                }
            }
            if (!b || !this.u) {
                this.f();
                return;
            }
            this.s.setText(2131297436);
        }
    }
    
    public gh b() {
        return this.j;
    }
    
    public void c() {
        if (this.q != null && this.q.i()) {
            this.b(true, true);
        }
        else if (this.o != null) {
            this.d();
        }
    }
    
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        (this.m = new go(this, null)).execute((Object[])new Void[0]);
        boolean b;
        if (bundle != null && bundle.getBoolean("is_cropping")) {
            b = true;
        }
        else {
            b = false;
        }
        RectF rectF = null;
        if (b) {
            rectF = (RectF)bundle.getParcelable("crop_rect");
        }
        if (b && rectF != null) {
            this.a(false, rectF, bundle.getInt("rotation"));
        }
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this.getActivity());
        this.l = (defaultSharedPreferences.getInt("filters_tooltip_times_shown", 0) < 3 && 86400000L + defaultSharedPreferences.getLong("filters_tooltip_last_time_shown", 0L) < bk.a());
    }
    
    public void onClick(final View view) {
        if (!this.q.j()) {
            switch (view.getId()) {
                default: {}
                case 2131886249: {
                    if (this.o != null && !this.q.i()) {
                        final EditableImage g = this.q.g();
                        if (g != null) {
                            final gi o = this.o;
                            String b;
                            if (this.f != null) {
                                b = this.f.b(g.filterId);
                            }
                            else {
                                b = null;
                            }
                            o.a(g, b);
                            return;
                        }
                        break;
                    }
                    else {
                        if (this.q.i()) {
                            this.b(true, false);
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 2131886683: {
                    if (this.o != null && !this.q.i()) {
                        this.d();
                        return;
                    }
                    if (this.q.i()) {
                        this.b(true, true);
                        return;
                    }
                    break;
                }
                case 2131886675: {
                    this.g();
                }
                case 2131886676: {
                    this.e();
                    final int visibility = this.e.getVisibility();
                    boolean b2 = false;
                    if (visibility != 0) {
                        b2 = true;
                    }
                    this.a(b2, true);
                }
                case 2131886677: {
                    this.b(false);
                }
                case 2131886682: {
                    this.q.a(-90);
                }
                case 2131886679: {
                    this.q.c();
                    this.b = 1;
                }
                case 2131886680: {
                    this.q.a(1.7777778f);
                    this.b = 3;
                }
                case 2131886681: {
                    this.q.a(1.0f);
                    this.b = 4;
                }
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.g = this.getArguments().getString("scribe_section");
        this.z = this.getArguments().getInt("initial_position");
        (this.q = new ga(this, (Context)this.getActivity(), null)).a(this.j);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2130968740, viewGroup, false);
    }
    
    @Override
    public void onDestroy() {
        this.k = true;
        if (this.m != null) {
            this.m.cancel(false);
        }
        this.q.f();
        if (this.f != null) {
            this.f.b();
        }
        this.q.h();
        EditImageFragment.a.a();
        super.onDestroy();
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.q.d();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.q.e();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.q.i()) {
            final gg a = this.q.k();
            if (a != null) {
                bundle.putBoolean("is_cropping", true);
                final CroppableImageView croppableImageView = (CroppableImageView)a.b.getImageView();
                final int imageRotation = croppableImageView.getImageRotation();
                bundle.putInt("rotation", imageRotation);
                bundle.putParcelable("crop_rect", (Parcelable)ImageOrientation.a(imageRotation).a(croppableImageView.getNormalizedImageSelection(), 0.5f, 0.5f));
            }
        }
    }
    
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final TypedArray obtainStyledAttributes = this.getActivity().obtainStyledAttributes(new int[] { 2130772022, 2130772023, 2130772025, 2130772026 });
        this.y = obtainStyledAttributes.getResourceId(0, 0);
        this.x = obtainStyledAttributes.getResourceId(1, 0);
        this.w = obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(3, 0);
        obtainStyledAttributes.recycle();
        this.i = (ImageButton)view.findViewById(2131886676);
        this.h = (ImageButton)view.findViewById(2131886675);
        final LockableViewPager r = (LockableViewPager)view.findViewById(2131886672);
        this.e = (FilterFilmstripView)view.findViewById(2131886673);
        (this.s = (TextView)view.findViewById(2131886251)).setAllCaps(!this.u);
        this.n = view.findViewById(2131886678);
        final int[] c = EditImageFragment.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            view.findViewById(c[i]).setOnClickListener((View$OnClickListener)this);
        }
        (this.t = (TextView)view.findViewById(2131886249)).setOnClickListener((View$OnClickListener)this);
        view.findViewById(2131886683).setOnClickListener((View$OnClickListener)this);
        this.a(false);
        if (!this.u) {
            this.i.setImageResource(this.v);
        }
        else {
            view.findViewById(2131886684).setVisibility(8);
            view.findViewById(2131886685).setVisibility(0);
            this.s.setText((CharSequence)"");
        }
        r.setAdapter(this.q);
        r.setOnPageChangeListener(this.q);
        r.setCurrentItem(this.z, false);
        r.setOffscreenPageLimit(3);
        this.r = r;
        this.a(true, false);
    }
}
