// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.ae;
import java.util.List;
import com.twitter.library.commerce.model.Product;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.widget.Toast;
import android.os.Bundle;
import com.twitter.android.composer.au;
import com.twitter.android.commerce.util.e;
import android.text.TextUtils;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.timeline.ah;
import com.twitter.library.provider.Tweet;
import com.twitter.android.commerce.widget.form.ProductPhotoContainer;
import com.twitter.android.commerce.widget.form.ProductBriefContainer;
import com.twitter.android.commerce.widget.form.ProductSearchContainer;
import com.twitter.android.rp;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterFragmentActivity;

public class ProductPageActivity extends TwitterFragmentActivity implements LoaderManager$LoaderCallbacks, rp
{
    private static final int[] a;
    private ProductSearchContainer b;
    private ProductBriefContainer c;
    private ProductPhotoContainer d;
    private long e;
    private Tweet f;
    
    static {
        a = new int[] { 0, 0 };
    }
    
    private void a(final long n) {
        this.a(new ah((Context)this, this.U(), n), 0);
    }
    
    private void h() {
        String a;
        if (this.c.getProduct() != null) {
            a = this.c.getProduct().a((Context)this);
        }
        else {
            a = null;
        }
        if (!TextUtils.isEmpty((CharSequence)a)) {
            com.twitter.android.commerce.util.e.a((Context)this, this.f, "", "", "share", this.c.getProduct().k(), null);
            this.startActivity(com.twitter.android.composer.au.a((Context)this).a("\n" + a, ProductPageActivity.a).p());
        }
    }
    
    private void i() {
        this.getSupportLoaderManager().initLoader(1, null, this);
    }
    
    private void j() {
        Toast.makeText((Context)this, (CharSequence)this.getResources().getString(2131296666), 1).show();
        this.setResult(0);
        this.finish();
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.e(true);
        bn.c(2130968676);
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        switch (n) {
            case 0: {
                if (!aa.a()) {
                    break;
                }
                if (aa.c.getLong("status_id", -1L) == this.e) {
                    this.i();
                    return;
                }
                this.j();
            }
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        boolean b = false;
        if (cursor != null) {
            final boolean moveToFirst = cursor.moveToFirst();
            b = false;
            if (moveToFirst) {
                this.a(new ad(cursor).a());
                b = true;
            }
        }
        if (!b) {
            this.a(this.e);
        }
    }
    
    public void a(final Tweet productCTAFromTweet) {
        this.c.setProductCTAFromTweet(productCTAFromTweet);
    }
    
    @Override
    public void a(final boolean b, final ListView listView) {
        this.b.a(b, listView);
    }
    
    @Override
    public boolean a(final String s, final long n, final TwitterTopic twitterTopic, final String s2) {
        return this.b.a(s, n, twitterTopic, s2);
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        if (super.a(jv, toolBar)) {
            jv.a(2131951625, toolBar);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131887412) {
            this.h();
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.c = new ProductBriefContainer((Context)this);
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            this.f = (Tweet)extras.getParcelable("commerce_product_tweet");
        }
        final Product product = this.c.getProduct();
        if (product != null) {
            com.twitter.android.commerce.util.e.a((Context)this, this.f, "", "", "impression", product.k(), null);
            this.setTitle(product.c());
            if (!TextUtils.isEmpty((CharSequence)product.h())) {
                (this.d = new ProductPhotoContainer((Context)this)).a(this, this.f, product.k(), this.c.getPhotoGroup(), this.c.getPhotoViewMoreGroup(), this.c.getPhotoPageBreak(), this.U(), product.h());
            }
            if (!TextUtils.isEmpty((CharSequence)product.j())) {
                this.c.setProductCTAFromUrl(product.j());
            }
            else {
                final List i = product.i();
                if (i != null && i.size() > 0) {
                    this.e = i.get(0);
                    this.i();
                }
                else {
                    this.c.a();
                }
            }
            if (!TextUtils.isEmpty((CharSequence)product.g())) {
                this.b = new ProductSearchContainer((Context)this);
                ((ViewGroup)this.findViewById(2131886506)).addView((View)this.b);
                this.b.a(this, (View)this.c, this.U(), this.f, product.k(), product.g());
            }
            return;
        }
        this.j();
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this, ae.b(this.e, this.U().g()), Tweet.a, null, null, null);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
        if (this.d != null) {
            this.d.a();
            this.d = null;
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
}
