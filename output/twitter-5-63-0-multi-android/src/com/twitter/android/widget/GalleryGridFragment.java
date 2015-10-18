// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.AbsListView;
import android.os.Parcelable;
import android.widget.AbsListView$RecyclerListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ListAdapter;
import com.twitter.library.media.util.v;
import com.twitter.library.media.util.aq;
import java.util.Iterator;
import com.twitter.library.featureswitch.d;
import java.util.HashMap;
import com.twitter.eventreporter.EventReporter;
import android.graphics.Typeface;
import android.view.View$OnClickListener;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.view.LayoutInflater;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.support.v4.content.Loader;
import android.net.Uri;
import android.widget.Scroller;
import android.os.AsyncTask;
import java.util.concurrent.Callable;
import com.twitter.util.concurrent.m;
import com.twitter.util.concurrent.b;
import com.twitter.util.concurrent.i;
import android.os.Bundle;
import android.content.res.Resources;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.content.Context;
import android.database.Cursor;
import com.twitter.library.media.model.EditableImage;
import java.util.Map;
import android.widget.TextView;
import android.widget.GridView;
import android.view.View;
import com.twitter.android.gh;
import android.widget.AbsListView$OnScrollListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.client.AbsFragment;

public class GalleryGridFragment extends AbsFragment implements LoaderManager$LoaderCallbacks, AbsListView$OnScrollListener, gh, ce, cf, cg
{
    protected bz a;
    protected boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private View[] g;
    private View[] h;
    private GridView i;
    private View j;
    private TextView k;
    private co l;
    private Map m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private EditableImage r;
    private boolean s;
    private Cursor t;
    private int u;
    
    public static int a(final Context context) {
        return context.getResources().getInteger(2131623939);
    }
    
    private void a(final int n, final int n2, final int backgroundColor) {
        if (n2 > 0) {
            final AbsListView$LayoutParams layoutParams = new AbsListView$LayoutParams(-1, n);
            final FragmentActivity activity = this.getActivity();
            for (int i = 0; i < n2; ++i) {
                final View view = new View((Context)activity);
                view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                view.setBackgroundColor(backgroundColor);
                this.a.a(view);
            }
        }
    }
    
    private void a(final View[] array, final View view) {
        if (array != null && array.length > 0) {
            final int length = array.length;
            final ViewGroup viewGroup = (ViewGroup)view.findViewById(2131886774);
            viewGroup.setVisibility(0);
            final Resources resources = this.getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131558659);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131558658);
            final int color = resources.getColor(2131689597);
            for (int i = 0; i < length; ++i) {
                final View view2 = array[i];
                viewGroup.addView(view2);
                final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)view2.getLayoutParams();
                linearLayout$LayoutParams.height = -1;
                linearLayout$LayoutParams.weight = 1.0f;
                if (i != length - 1) {
                    final View view3 = new View(view2.getContext());
                    view3.setBackgroundColor(color);
                    viewGroup.addView(view3);
                    final LinearLayout$LayoutParams linearLayout$LayoutParams2 = (LinearLayout$LayoutParams)view3.getLayoutParams();
                    linearLayout$LayoutParams2.width = dimensionPixelSize;
                    linearLayout$LayoutParams2.height = dimensionPixelSize2;
                    linearLayout$LayoutParams2.gravity = 16;
                }
            }
        }
    }
    
    public static GalleryGridFragment b(final int n, final int n2, final int n3, final boolean b, final int n4, final boolean b2) {
        final GalleryGridFragment galleryGridFragment = new GalleryGridFragment();
        final Bundle arguments = new Bundle(3);
        arguments.putInt("color", n);
        arguments.putInt("header_text_color", n2);
        arguments.putInt("header", n4);
        arguments.putInt("scroll_header", n3);
        arguments.putBoolean("show_expand", b);
        arguments.putBoolean("new_media_flow", b2);
        galleryGridFragment.setArguments(arguments);
        return galleryGridFragment;
    }
    
    private void c() {
        if (this.k != null) {
            int n;
            if (this.a != null) {
                n = this.a.a();
            }
            else if (this.m != null) {
                n = this.m.size();
            }
            else {
                n = 0;
            }
            final Resources resources = this.getResources();
            String text;
            if (n == 0) {
                text = resources.getString(2131297029);
            }
            else {
                text = resources.getQuantityString(2131427350, n, new Object[] { n });
            }
            this.k.setText((CharSequence)text);
        }
    }
    
    private void d(final View[] array) {
        if (array != null) {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.a.a(array[i]);
            }
        }
    }
    
    public i a(final int n) {
        if (!this.s) {
            return new b().a(com.twitter.util.concurrent.m.a).a(new cn(this)).a();
        }
        if (this.t == null) {
            return new b().a(com.twitter.util.concurrent.m.a).a(new cm(this)).a();
        }
        this.t.moveToPosition(n);
        final com.twitter.library.media.model.m m = new com.twitter.library.media.model.m(this.t);
        final EditableImage editableImage = (EditableImage)this.a.b(m.c);
        if (editableImage != null) {
            return new b().a(com.twitter.util.concurrent.m.a).a(new ck(this, editableImage)).a();
        }
        return new b().a(AsyncTask.THREAD_POOL_EXECUTOR).a(new cl(this, m)).a();
    }
    
    public void a(final float n) {
        final Scroller scroller = new Scroller((Context)this.getActivity());
        scroller.fling(0, 0, 0, (int)n, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.i.smoothScrollBy(Math.min(-scroller.getFinalY(), this.getResources().getDisplayMetrics().heightPixels), scroller.getDuration());
    }
    
    public void a(final Uri uri) {
        if (this.a == null) {
            if (this.m != null) {
                this.m.remove(uri);
            }
        }
        else {
            this.a.a(uri);
        }
        this.c();
    }
    
    public void a(final Loader loader, final Cursor t) {
        switch (loader.getId()) {
            case 0: {
                this.a.swapCursor(t);
                if (this.p > 0 && this.p < this.a.getCount()) {
                    this.i.post((Runnable)new ci(this));
                }
                final FragmentActivity activity = this.getActivity();
                if (activity != null && t != null) {
                    ScribeService.a((Context)activity, ((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { "composition::photo_gallery::load_finished" })).a((long)t.getCount()));
                    return;
                }
                break;
            }
            case 1: {
                this.t = t;
            }
        }
    }
    
    public void a(final View view, final EditableMedia editableMedia) {
        if (editableMedia != null) {
            this.l.c(editableMedia);
        }
    }
    
    public void a(final DraggableDrawerLayout draggableDrawerLayout) {
        draggableDrawerLayout.setDrawerDraggable(true);
        draggableDrawerLayout.setDispatchDragToChildren(true);
        if (this.j == null) {
            this.j = LayoutInflater.from((Context)this.getActivity()).inflate(2130968690, (ViewGroup)draggableDrawerLayout, false);
            final TypefacesTextView typefacesTextView = (TypefacesTextView)this.j.findViewById(2131886581);
            typefacesTextView.setOnClickListener((View$OnClickListener)new cj(this));
            typefacesTextView.setTextColor(this.d);
            (this.k = (TextView)this.j.findViewById(2131886580)).setTextColor(this.d);
            if (this.b) {
                this.k.setTypeface(Typeface.DEFAULT_BOLD);
            }
            this.c();
            this.j.setBackgroundColor(this.c);
        }
        draggableDrawerLayout.setFullScreenHeaderView(this.j);
    }
    
    public void a(final co l) {
        this.l = l;
    }
    
    public void a(final EditableMedia editableMedia) {
        if (this.l != null) {
            this.p = this.i.getFirstVisiblePosition();
            this.q = true;
            final View a = this.a.a(editableMedia);
            if (editableMedia instanceof EditableImage) {
                this.r = (EditableImage)editableMedia;
            }
            if (a != null) {
                this.l.a(editableMedia, a);
            }
        }
    }
    
    protected void a(final boolean b) {
        this.a = new bz((Context)this.getActivity(), new cp().a(this.getActivity()).a(), 0, b, 0, this.b);
    }
    
    public void a(final View[] g) {
        this.g = g;
    }
    
    public boolean a(final EditableImage editableImage) {
        return this.a.c(editableImage);
    }
    
    public void b() {
        this.getLoaderManager().restartLoader(0, null, this);
    }
    
    public void b(final View view, final EditableMedia editableMedia) {
        if (editableMedia != null) {
            EventReporter.a(new TwitterScribeLog(this.aF().g()).b("", "", "photo_gallery", "thumbnail", "long_press"));
            this.a(editableMedia);
        }
    }
    
    public void b(final EditableImage editableImage) {
        this.a.a(editableImage);
    }
    
    public void b(final EditableMedia editableMedia) {
        if (this.a == null) {
            if (this.m == null) {
                this.m = new HashMap();
            }
            this.m.put(editableMedia.c(), editableMedia);
        }
        else {
            this.a.b(editableMedia);
        }
        this.c();
    }
    
    public void b(final boolean b) {
        if (this.a == null) {
            this.n = !b;
            return;
        }
        this.a.a(b);
    }
    
    public void b(final View[] h) {
        this.h = h;
    }
    
    public void c(final boolean o) {
        if (this.a == null) {
            this.o = o;
            return;
        }
        this.a.b(o);
    }
    
    public void c(final View[] array) {
        if (this.a == null) {
            this.a(array);
            return;
        }
        this.d(array);
    }
    
    public int getCount() {
        if (!this.s) {
            return 1;
        }
        if (this.t != null) {
            return this.t.getCount();
        }
        return this.u;
    }
    
    public int getInitialPosition() {
        if (this.s && this.t != null) {
            final View a = this.a.a((EditableMedia)this.r);
            if (a != null && a.getTag() instanceof MediaStoreItemView) {
                final com.twitter.library.media.model.m mediaStoreItem = ((MediaStoreItemView)a.getTag()).getMediaStoreItem();
                if (this.t.moveToFirst()) {
                    while (!mediaStoreItem.a(new com.twitter.library.media.model.m(this.t))) {
                        if (!this.t.moveToNext()) {
                            return -1;
                        }
                    }
                    return this.t.getPosition();
                }
            }
            return -1;
        }
        return 0;
    }
    
    public int getSelectedCount() {
        return 0;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        int int1 = -1;
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        this.b = arguments.getBoolean("new_media_flow");
        this.c = arguments.getInt("color");
        this.d = arguments.getInt("header_text_color");
        this.e = arguments.getInt("header");
        this.f = arguments.getInt("scroll_header");
        if (bundle != null) {
            int1 = bundle.getInt("first_visible_position", int1);
        }
        this.p = int1;
        this.q = (bundle != null && bundle.getBoolean("disable_grid_reload", false));
        EditableImage r;
        if (bundle != null) {
            r = (EditableImage)bundle.getParcelable("expanded_image");
        }
        else {
            r = null;
        }
        this.r = r;
        int int2;
        if (bundle != null) {
            int2 = bundle.getInt("images_count");
        }
        else {
            int2 = 0;
        }
        this.u = int2;
        this.s = com.twitter.library.featureswitch.d.f("enhanced_media_flow_swipe_photos_gallery_enabled");
        final boolean boolean1 = arguments.getBoolean("show_expand", false);
        this.a(boolean1);
        this.a.a((ce)this);
        if (this.b) {
            this.a.a((cg)this);
        }
        if (this.m != null) {
            final Iterator<Uri> iterator = this.m.keySet().iterator();
            while (iterator.hasNext()) {
                this.a.b((EditableMedia)this.m.get(iterator.next()));
            }
            this.m = null;
        }
        if (boolean1) {
            this.a.a((cf)this);
        }
        if (this.n) {
            this.a.a(false);
            this.n = false;
        }
        if (this.o) {
            this.a.b(true);
            this.o = false;
        }
        this.getLoaderManager().initLoader(0, null, this);
        if (this.s) {
            this.getLoaderManager().initLoader(1, null, this);
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return new v(this.getActivity().getApplicationContext(), true, aq.a());
            }
            case 1: {
                return new v(this.getActivity().getApplicationContext(), false, false);
            }
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968779, viewGroup, false);
        inflate.setBackgroundColor(this.c);
        final View viewById = inflate.findViewById(2131886772);
        if (this.e > 0) {
            final ViewGroup$LayoutParams layoutParams = viewById.getLayoutParams();
            layoutParams.height = this.e;
            viewById.setLayoutParams(layoutParams);
        }
        else {
            viewById.setVisibility(8);
        }
        viewById.setBackgroundColor(this.c);
        final GridView i = (GridView)inflate.findViewById(2131886773);
        i.setAdapter((ListAdapter)this.a);
        i.setOnScrollListener((AbsListView$OnScrollListener)this);
        if (this.b) {
            final int round = Math.round(this.getResources().getDimension(2131558596));
            i.setVerticalSpacing(round);
            i.setHorizontalSpacing(round);
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)i.getLayoutParams();
            viewGroup$MarginLayoutParams.leftMargin = 0;
            viewGroup$MarginLayoutParams.rightMargin = 0;
            inflate.findViewById(2131886109).setVisibility(8);
        }
        i.setRecyclerListener((AbsListView$RecyclerListener)this.a);
        this.i = i;
        return inflate;
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.a = null;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        this.a.d();
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        this.a.swapCursor(null);
        this.t = null;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("first_visible_position", this.i.getFirstVisiblePosition());
        bundle.putBoolean("disable_grid_reload", this.getActivity().getChangingConfigurations() != 0);
        bundle.putParcelable("expanded_image", (Parcelable)this.r);
        if (this.t != null) {
            bundle.putInt("images_count", this.t.getCount());
        }
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        if (this.l != null) {
            final View child = absListView.getChildAt(0);
            final co l = this.l;
            boolean b = false;
            if (child != null) {
                b = false;
                if (n == 0) {
                    final int top = child.getTop();
                    b = false;
                    if (top >= 0) {
                        b = true;
                    }
                }
            }
            l.a(b);
        }
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        if (n == 2 || n == 0) {
            this.a.c(n == 2);
        }
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.a.b();
        if (!this.q) {
            this.b();
            return;
        }
        this.q = false;
    }
    
    @Override
    public void onStop() {
        this.a.c();
        super.onStop();
    }
    
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.a(this.f, a((Context)this.getActivity()), this.c);
        this.d(this.g);
        this.a(this.h, view);
    }
}
