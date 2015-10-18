// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.widget.ImageView$ScaleType;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.util.SparseBooleanArray;
import com.tonicartos.widget.stickygridheaders.t;
import android.widget.BaseAdapter;

public class u extends BaseAdapter implements t
{
    private SparseBooleanArray a;
    private boolean b;
    private long c;
    final MediaGalleryBase d;
    
    public u(final MediaGalleryBase d) {
        this.d = d;
        this.a = new SparseBooleanArray();
    }
    
    static long a(final u u, final long c) {
        return u.c = c;
    }
    
    static SparseBooleanArray a(final u u) {
        return u.a;
    }
    
    private boolean a(final int n) {
        return false;
    }
    
    static boolean a(final u u, final int n) {
        return u.a(n);
    }
    
    static long b(final u u) {
        return u.c;
    }
    
    public int a() {
        return MediaGalleryBase.a(this.d).size();
    }
    
    public int a(final int n) {
        return MediaGalleryBase.a(this.d).get(n).b;
    }
    
    public View a(final int n, final View view, final ViewGroup viewGroup) {
        ViewGroup viewGroup2 = null;
        TextView textView2 = null;
        Label_0068: {
            if (view != null) {
                viewGroup2 = (ViewGroup)view;
                final TextView textView = (TextView)viewGroup2.getChildAt(0);
                if (MediaGalleryBase.v == 0) {
                    textView2 = textView;
                    break Label_0068;
                }
            }
            final ViewGroup viewGroup3 = (ViewGroup)this.d.getLayoutInflater().inflate(2130903181, (ViewGroup)null, true);
            viewGroup3.setClickable(false);
            textView2 = (TextView)viewGroup3.findViewById(2131755651);
            viewGroup2 = viewGroup3;
        }
        textView2.setText((CharSequence)MediaGalleryBase.a(this.d).get(n).toString());
        return (View)viewGroup2;
    }
    
    public int getCount() {
        return this.d.B;
    }
    
    public Object getItem(final int n) {
        return n;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final bj a = this.d.o.a(n);
        Object a2;
        if (view == null) {
            a2 = this.d.a();
        }
        else {
            a2 = view;
        }
        final MediaGalleryBase$MediaItemView mediaGalleryBase$MediaItemView = (MediaGalleryBase$MediaItemView)a2;
        mediaGalleryBase$MediaItemView.setMediaItem(a);
        mediaGalleryBase$MediaItemView.setScaleType(ImageView$ScaleType.CENTER_CROP);
        MediaGalleryBase.e(this.d).a((b8)mediaGalleryBase$MediaItemView.getTag());
        Label_0197: {
            if (a != null) {
                final q tag = new q(this, mediaGalleryBase$MediaItemView, a);
                mediaGalleryBase$MediaItemView.setTag((Object)tag);
                if (this.a(n)) {
                    mediaGalleryBase$MediaItemView.setVisibility(4);
                }
                MediaGalleryBase.e(this.d).a(tag, new ai(this, mediaGalleryBase$MediaItemView, tag, a, n));
                mediaGalleryBase$MediaItemView.setSelected(this.d.a(n));
                ViewCompat.setTransitionName((View)mediaGalleryBase$MediaItemView, a.b());
                if (MediaGalleryBase.v == 0) {
                    break Label_0197;
                }
            }
            mediaGalleryBase$MediaItemView.setScaleType(ImageView$ScaleType.CENTER);
            mediaGalleryBase$MediaItemView.setBackgroundColor(MediaGalleryBase.d(this.d));
            mediaGalleryBase$MediaItemView.setImageDrawable((Drawable)null);
        }
        if (!this.b) {
            this.b = true;
            mediaGalleryBase$MediaItemView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new af(this, mediaGalleryBase$MediaItemView));
        }
        return (View)mediaGalleryBase$MediaItemView;
    }
}
