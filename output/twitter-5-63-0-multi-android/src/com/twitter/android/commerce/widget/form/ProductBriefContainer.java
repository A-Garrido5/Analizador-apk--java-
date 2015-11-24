// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.j;
import android.widget.TextView$BufferType;
import android.app.Activity;
import com.twitter.android.card.h;
import android.text.TextUtils;
import com.twitter.android.commerce.view.ProductSummaryActivity;
import android.content.Intent;
import com.twitter.android.GalleryActivity;
import com.twitter.library.card.property.ImageSpec;
import android.os.Parcelable;
import java.io.Serializable;
import android.os.Bundle;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import com.twitter.library.commerce.model.Product;
import android.view.View;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.ui.widget.TwitterButton;
import android.view.ViewGroup;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public class ProductBriefContainer extends LinearLayout implements View$OnClickListener, e
{
    private MediaImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private ViewGroup e;
    private TwitterButton f;
    private TwitterButton g;
    private TwitterFragmentActivity h;
    private ViewGroup i;
    private ViewGroup j;
    private View k;
    private Product l;
    private Tweet m;
    private ProductBriefContainer$CTAType n;
    private Tweet o;
    private String p;
    private boolean q;
    
    public ProductBriefContainer(final Context context) {
        super(context);
        View.inflate(context, 2130968677, (ViewGroup)this);
        this.a = (MediaImageView)this.findViewById(2131886507);
        this.b = (TextView)this.findViewById(2131886509);
        this.c = (TextView)this.findViewById(2131886510);
        this.d = (TextView)this.findViewById(2131886511);
        this.f = (TwitterButton)this.findViewById(2131886513);
        this.g = (TwitterButton)this.findViewById(2131886514);
        this.i = (ViewGroup)this.findViewById(2131886515);
        this.j = (ViewGroup)this.findViewById(2131886516);
        this.k = this.findViewById(2131886517);
        this.e = (ViewGroup)this.findViewById(2131886518);
        this.h = (TwitterFragmentActivity)context;
        this.a.setOnClickListener((View$OnClickListener)this);
        this.f.setOnClickListener((View$OnClickListener)this);
        this.g.setOnClickListener((View$OnClickListener)this);
        final Bundle extras = this.h.getIntent().getExtras();
        if (extras != null) {
            final Serializable serializable = extras.getSerializable("commerce_product_values");
            if (serializable instanceof Product) {
                this.l = (Product)serializable;
            }
            final Parcelable parcelable = extras.getParcelable("commerce_product_tweet");
            if (parcelable instanceof Tweet) {
                this.m = (Tweet)parcelable;
            }
            if (this.l != null) {
                this.b();
            }
        }
    }
    
    private void b() {
        this.setImageModel("");
        this.b.setText((CharSequence)"");
        this.c.setText((CharSequence)"");
        this.d.setText((CharSequence)"");
        if (this.l.b() != null && this.l.b().size() > 0) {
            this.setImageModel(this.l.b().get(0).url);
            final TextView textView = (TextView)this.findViewById(2131886508);
            if (this.l.b().size() > 1) {
                textView.setText((CharSequence)String.format(this.h.getString(2131297439), 1, this.l.b().size()));
                textView.setVisibility(0);
            }
            else {
                textView.setVisibility(8);
            }
        }
        this.g.setText(2131297168);
        this.g.setEnabled(false);
        this.b.setText((CharSequence)this.getProduct().c());
        this.c.setText((CharSequence)this.getProduct().f());
        if (this.getProduct().e() != null) {
            this.d.setText((CharSequence)com.twitter.android.commerce.util.e.a(this.getProduct().e()));
        }
    }
    
    private void c() {
        if (this.l.b() != null && this.l.b().size() > 0) {
            this.h.startActivityForResult(new Intent((Context)this.h, (Class)GalleryActivity.class).putExtra("li", (Serializable)this.l.b()).putExtra("list_starting_index", 0).putExtra("etc", false).putExtra("cv", false), 1);
        }
    }
    
    private void d() {
        if (this.n == ProductBriefContainer$CTAType.b) {
            final Intent intent = new Intent((Context)this.h, (Class)ProductSummaryActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putParcelable("commerce_buynow_tweet", (Parcelable)this.o);
            bundle.putSerializable("commerce_product_values", (Serializable)com.twitter.android.commerce.util.e.a(this.o.W().e()));
            intent.putExtras(bundle);
            this.h.startActivity(intent);
        }
        else if (this.n == ProductBriefContainer$CTAType.c) {
            String s;
            if (!TextUtils.isEmpty((CharSequence)this.p)) {
                s = this.p;
            }
            else if (this.o != null) {
                s = this.o.W().a("website_url", "");
            }
            else {
                s = null;
            }
            if (!TextUtils.isEmpty((CharSequence)s)) {
                new h(this.h).e(s);
            }
        }
        if (this.n != ProductBriefContainer$CTAType.a) {
            com.twitter.android.commerce.util.e.a(this.getContext(), this.m, "", "button", "click", this.getProduct().k(), null);
        }
    }
    
    private void setDescription(final String s) {
        View.inflate(this.getContext(), 2130968678, (ViewGroup)this.findViewById(2131886512));
        ((ExpandableTextView)this.findViewById(2131886519)).setText(s, TextView$BufferType.SPANNABLE);
    }
    
    private void setImageModel(final String s) {
        final MediaImageView a = this.a;
        k a2;
        if (s != null) {
            a2 = com.twitter.library.media.manager.j.a(s);
        }
        else {
            a2 = null;
        }
        a.a(a2);
        this.a.setAspectRatio(1.0f);
    }
    
    public void a() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
    }
    
    public void a(final int visibility) {
        this.e.setVisibility(visibility);
    }
    
    public ViewGroup getPhotoGroup() {
        return this.i;
    }
    
    public View getPhotoPageBreak() {
        return this.k;
    }
    
    public ViewGroup getPhotoViewMoreGroup() {
        return this.j;
    }
    
    public Product getProduct() {
        return this.l;
    }
    
    public void onClick(final View view) {
        if (view.getId() == this.a.getId()) {
            this.c();
        }
        else if (view.getId() == this.f.getId() || view.getId() == this.g.getId()) {
            this.d();
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (!this.q) {
            this.q = true;
            this.setDescription(this.getProduct().d());
        }
    }
    
    public void setProductCTAFromTweet(final Tweet o) {
        if (o != null && o.W() != null) {
            this.n = ProductBriefContainer$CTAType.a;
            final CardInstanceData w = o.W();
            while (true) {
                Label_0180: {
                    if (TextUtils.isEmpty((CharSequence)w.name)) {
                        break Label_0180;
                    }
                    int n;
                    if (w.name.equals("2586390716:buy_now")) {
                        this.n = ProductBriefContainer$CTAType.b;
                        n = 2131296685;
                    }
                    else {
                        if (!w.name.equals("promo_website")) {
                            break Label_0180;
                        }
                        this.n = ProductBriefContainer$CTAType.c;
                        n = 2131296687;
                    }
                    if (this.n != ProductBriefContainer$CTAType.a) {
                        this.o = o;
                        this.f.setVisibility(4);
                        this.g.setVisibility(4);
                        if (this.n != ProductBriefContainer$CTAType.b) {
                            this.g.setText(n);
                            this.g.setEnabled(true);
                            this.g.setVisibility(0);
                            return;
                        }
                        this.f.setText(n);
                        this.f.setEnabled(true);
                        this.f.setVisibility(0);
                    }
                    return;
                }
                int n = 0;
                continue;
            }
        }
        this.a();
    }
    
    public void setProductCTAFromUrl(final String p) {
        this.p = p;
        this.n = ProductBriefContainer$CTAType.c;
        this.g.setText(2131296687);
        this.g.setEnabled(true);
        this.f.setVisibility(8);
        this.g.setVisibility(0);
    }
}
