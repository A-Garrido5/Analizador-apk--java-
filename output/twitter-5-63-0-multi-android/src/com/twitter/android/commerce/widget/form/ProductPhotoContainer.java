// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.content.Intent;
import com.twitter.android.GalleryActivity;
import android.widget.AdapterView;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.commerce.util.e;
import com.twitter.util.q;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterFragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.LinearLayout;

public class ProductPhotoContainer extends LinearLayout implements AdapterView$OnItemClickListener, b
{
    private c a;
    private ViewGroup b;
    private ViewGroup c;
    private View d;
    private TwitterFragmentActivity e;
    private Session f;
    private long g;
    private Tweet h;
    private String i;
    
    public ProductPhotoContainer(final Context context) {
        super(context);
    }
    
    private static void a(final ViewGroup viewGroup, final View view, final int id) {
        viewGroup.removeAllViews();
        viewGroup.setVisibility(0);
        if (id != 0) {
            view.setId(id);
        }
        viewGroup.addView(view);
    }
    
    public void a() {
        if (this.a != null) {
            this.a.b();
        }
    }
    
    public void a(final View view) {
        a(this.b, view, 0);
    }
    
    public void a(final TwitterFragmentActivity e, final Tweet h, final String i, final ViewGroup b, final ViewGroup c, final View d, final Session f, final String s) {
        this.h = h;
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = q.a.nextLong();
        (this.a = new c(e, s, this.g, f, this, (AdapterView$OnItemClickListener)this)).a();
    }
    
    public void a(final ViewMoreContainer viewMoreContainer) {
        a(this.c, (View)viewMoreContainer, 2131886099);
        this.d.setVisibility(0);
        viewMoreContainer.setClickScribeLog(com.twitter.android.commerce.util.e.b((Context)this.e, this.h, "media", "view_more_button", "click", this.i, null));
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.e.startActivity(new Intent((Context)this.e, (Class)GalleryActivity.class).setData(ae.a(aw.a, this.f.g())).putExtra("prj", cc.a).putExtra("sel", "flags&1537 !=0 AND search_id=?").putExtra("selArgs", new String[] { String.valueOf(this.g) }).putExtra("orderBy", "type_id ASC, _id ASC").putExtra("id", n2));
    }
}
