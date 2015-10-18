// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.View$OnTouchListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.twitter.library.media.model.EditableImage;
import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.model.EditableMedia;
import java.util.Iterator;
import android.net.Uri;
import com.twitter.library.media.model.m;
import com.twitter.library.media.model.MediaType;
import android.view.View;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import android.content.res.Resources$Theme;
import android.view.animation.AnimationUtils;
import android.os.Looper;
import android.database.Cursor;
import android.view.animation.Animation;
import com.twitter.library.util.aq;
import android.os.Handler;
import android.support.annotation.LayoutRes;
import com.twitter.library.util.ReferenceMap;
import java.util.LinkedHashMap;
import com.twitter.library.util.ak;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.media.manager.a;
import android.widget.AbsListView$RecyclerListener;
import android.support.v4.widget.CursorAdapter;

public class bz extends CursorAdapter implements AbsListView$RecyclerListener, dp
{
    private static a b;
    protected final ArrayList a;
    private final Context c;
    private final ak d;
    private final LinkedHashMap e;
    private final ReferenceMap f;
    private final boolean g;
    @LayoutRes
    private final int h;
    private final Handler i;
    private final int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private cf n;
    private boolean o;
    private boolean p;
    private aq q;
    private boolean r;
    private Animation s;
    private Animation t;
    private ce u;
    private cg v;
    
    public bz(final Context context, final ak d, final int j, final boolean g, @LayoutRes final int h, final boolean r) {
        super(context, null, 0);
        this.a = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = ReferenceMap.b();
        this.i = new Handler(Looper.getMainLooper());
        this.l = false;
        this.m = true;
        this.p = gr.b();
        this.c = context.getApplicationContext();
        this.j = j;
        this.g = g;
        this.d = d;
        this.h = h;
        this.r = r;
        final Resources$Theme theme = context.getTheme();
        int n;
        if (this.r) {
            n = 2131493037;
        }
        else {
            n = 2131493036;
        }
        theme.applyStyle(n, true);
        if (this.r) {
            this.s = AnimationUtils.loadAnimation(context, 2131034168);
            this.t = AnimationUtils.loadAnimation(context, 2131034169);
        }
    }
    
    private GestureDetector a(final Context context, final MediaStoreItemView mediaStoreItemView) {
        return new GestureDetector(context, (GestureDetector$OnGestureListener)new cb(this, mediaStoreItemView));
    }
    
    private static a b(final Context context) {
        synchronized (bz.class) {
            if (bz.b == null) {
                bz.b = new a(context, "gallery", 1, 5242880, 1048576);
            }
            return bz.b;
        }
    }
    
    private void b(final View view) {
        final MediaStoreItemView mediaStoreItemView = (MediaStoreItemView)view.getTag();
        final boolean b = !mediaStoreItemView.isSelected() && ((this.o && mediaStoreItemView.getMediaType() != MediaType.b) || this.l);
        mediaStoreItemView.c(b);
        boolean enabled = false;
        Label_0067: {
            if (b) {
                final boolean m = this.m;
                enabled = false;
                if (m) {
                    break Label_0067;
                }
            }
            enabled = true;
        }
        mediaStoreItemView.setEnabled(enabled);
    }
    
    private void c(final View view) {
        final MediaStoreItemView mediaStoreItemView = (MediaStoreItemView)view.getTag();
        if (this.e.containsKey(d(mediaStoreItemView))) {
            if (!this.p) {
                mediaStoreItemView.a(true);
            }
            if (this.r) {
                mediaStoreItemView.setShowExpand(this.g);
                mediaStoreItemView.b(true);
            }
        }
        else {
            mediaStoreItemView.a(false);
            mediaStoreItemView.a();
            if (this.r) {
                mediaStoreItemView.setShowExpand(false);
                mediaStoreItemView.b(false);
            }
        }
        if (this.p) {
            this.e();
        }
    }
    
    private void c(final MediaStoreItemView mediaStoreItemView) {
        final Uri d = d(mediaStoreItemView);
        final View view = (View)this.f.a(d);
        if (view != null && view.getTag() == mediaStoreItemView) {
            this.f.c(d);
        }
        mediaStoreItemView.setMediaStoreItem(null);
    }
    
    private static Uri d(final MediaStoreItemView mediaStoreItemView) {
        final m mediaStoreItem = mediaStoreItemView.getMediaStoreItem();
        if (mediaStoreItem == null) {
            return null;
        }
        return mediaStoreItem.c;
    }
    
    private void e() {
        final Iterator<Uri> iterator = this.e.keySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final View view = (View)this.f.a(iterator.next());
            if (view != null) {
                ((MediaStoreItemView)view.getTag()).a(n);
            }
            ++n;
        }
    }
    
    private void f() {
        for (final View view : this.f.h()) {
            this.c(view);
            this.b(view);
        }
    }
    
    public int a() {
        return this.e.size();
    }
    
    public View a(final EditableMedia editableMedia) {
        return (View)this.f.a(editableMedia.c());
    }
    
    protected Future a(final MediaStoreItemView mediaStoreItemView, final Size size) {
        if (this.q != null) {
            final m mediaStoreItem = mediaStoreItemView.getMediaStoreItem();
            if (mediaStoreItem != null) {
                final Reference b = this.f.b(mediaStoreItem.c);
                if (b != null) {
                    return this.q.submit(new cc(this.c, mediaStoreItem, size, this, this.i, this.d, b, this.q));
                }
            }
        }
        return null;
    }
    
    public void a(final Uri uri) {
        this.e.remove(uri);
        final View view = (View)this.f.a(uri);
        if (view != null) {
            this.c(view);
        }
    }
    
    public void a(final View view) {
        this.a.add(view);
    }
    
    public void a(final MediaStoreItemView mediaStoreItemView) {
        if (mediaStoreItemView.isEnabled() && this.n != null) {
            this.n.a(mediaStoreItemView.getEditableMedia());
        }
    }
    
    public void a(final ce u) {
        this.u = u;
    }
    
    public void a(final cf n) {
        this.n = n;
    }
    
    public void a(final cg v) {
        this.v = v;
    }
    
    void a(EditableMedia editableMedia, final Bitmap bitmap) {
        final View a = this.a(editableMedia);
        if (a != null) {
            if (this.e.containsKey(editableMedia.c())) {
                editableMedia = this.e.get(editableMedia.c());
            }
            ((MediaStoreItemView)a.getTag()).a(bitmap, editableMedia);
            this.b(a);
        }
    }
    
    public void a(final boolean l) {
        if (this.l != l) {
            this.l = l;
            this.f();
        }
    }
    
    public boolean a(final EditableImage editableImage) {
        this.e.put(editableImage.c(), editableImage);
        final View a = this.a((EditableMedia)editableImage);
        if (a != null && a.getTag() instanceof MediaStoreItemView) {
            final EditableImage editableImage2 = (EditableImage)((MediaStoreItemView)a.getTag()).getEditableMedia();
            if (editableImage2 != null) {
                editableImage2.enhanced = editableImage.enhanced;
                editableImage2.filterId = editableImage.filterId;
                editableImage2.intensity = editableImage.intensity;
                editableImage2.cropRect = editableImage.cropRect;
                editableImage2.rotation = editableImage.rotation;
                return true;
            }
        }
        return false;
    }
    
    public EditableMedia b(final Uri uri) {
        if (this.e.containsKey(uri)) {
            return this.e.get(uri);
        }
        return null;
    }
    
    public Future b(final MediaStoreItemView mediaStoreItemView, final Size size) {
        final m mediaStoreItem = mediaStoreItemView.getMediaStoreItem();
        cq cq;
        if (this.d != null) {
            cq = (cq)this.d.b(mediaStoreItem.b);
        }
        else {
            cq = null;
        }
        if (cq != null) {
            this.a(cq.b, cq.a);
        }
        else if (mediaStoreItem != null && this.q != null) {
            return this.a(mediaStoreItemView, size);
        }
        return null;
    }
    
    public void b() {
        this.q = new aq(1, 2, 8L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }
    
    public void b(final MediaStoreItemView mediaStoreItemView) {
        this.c(mediaStoreItemView);
    }
    
    public void b(final EditableMedia editableMedia) {
        final Uri c = editableMedia.c();
        this.e.put(c, editableMedia);
        final View view = (View)this.f.a(c);
        if (view != null) {
            this.c(view);
        }
    }
    
    public void b(final boolean o) {
        if (this.o != o) {
            this.o = o;
            this.f();
        }
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final MediaStoreItemView mediaStoreItemView = (MediaStoreItemView)view.getTag();
        this.f.c(d(mediaStoreItemView));
        final m mediaStoreItem = new m(cursor);
        this.f.a(mediaStoreItem.c, view);
        mediaStoreItemView.setMediaStoreItem(mediaStoreItem);
        this.c(view);
        this.b(view);
    }
    
    public void c() {
        this.q.shutdownNow();
        this.q = null;
    }
    
    void c(final boolean k) {
        if (this.k != k && this.q != null) {
            this.k = k;
            if (!k) {
                this.q.b();
                return;
            }
            this.q.a();
        }
    }
    
    public boolean c(final EditableMedia editableMedia) {
        return this.e.containsKey(editableMedia.c());
    }
    
    public void d() {
        final Iterator<View> iterator = this.f.h().iterator();
        while (iterator.hasNext()) {
            ((MediaStoreItemView)iterator.next().getTag()).setMediaStoreItem(null);
        }
        this.f.c();
    }
    
    @Override
    public int getCount() {
        return super.getCount() + this.a.size();
    }
    
    public int getItemViewType(final int n) {
        if (n < this.a.size()) {
            return -1;
        }
        return 0;
    }
    
    @Override
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final int size = this.a.size();
        if (n < size) {
            return this.a.get(n);
        }
        if (!(view instanceof MediaStoreItemView)) {
            view = null;
        }
        return super.getView(n - size, view, viewGroup);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        View view;
        MediaStoreItemView tag;
        if (this.h != 0) {
            view = LayoutInflater.from(context).inflate(this.h, viewGroup, false);
            tag = (MediaStoreItemView)view.findViewById(2131886130);
        }
        else {
            view = LayoutInflater.from(context).inflate(2130968780, viewGroup, false);
            tag = (MediaStoreItemView)view;
        }
        if (this.j > 0) {
            final ViewGroup$LayoutParams layoutParams = tag.getLayoutParams();
            layoutParams.width = this.j;
            layoutParams.height = this.j;
        }
        view.setOnTouchListener((View$OnTouchListener)new ca(this, this.a(context, tag), view));
        tag.setCallback(this);
        final boolean g = this.g;
        boolean showExpand = false;
        if (g) {
            final boolean r = this.r;
            showExpand = false;
            if (!r) {
                showExpand = true;
            }
        }
        tag.setShowExpand(showExpand);
        view.setTag((Object)tag);
        return view;
    }
    
    public void onMovedToScrapHeap(final View view) {
        this.c((MediaStoreItemView)view.getTag());
    }
}
