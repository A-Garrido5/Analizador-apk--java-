// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session;
import com.twitter.android.client.WebsiteDwellMonitor;
import com.twitter.library.client.az;
import java.util.HashMap;
import com.twitter.android.commerce.view.ProductSummaryActivity;
import com.twitter.android.commerce.view.OfferSummaryActivity;
import com.twitter.android.commerce.view.CommerceCollectionActivity;
import com.twitter.library.commerce.model.Product;
import android.os.Parcelable;
import java.io.Serializable;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.commerce.view.ProductPageActivity;
import com.twitter.android.commerce.util.e;
import android.app.Activity;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.NativeCardUserAction;
import com.twitter.library.provider.Tweet;
import android.text.TextUtils;
import android.content.Context;

public class CardActionHelper
{
    private final Context a;
    private final g b;
    private final t c;
    private final String d;
    
    public CardActionHelper(final Context a, final g b, final t c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public CardActionHelper$AppStatus a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return CardActionHelper$AppStatus.a;
        }
        if (this.b.c(s)) {
            return CardActionHelper$AppStatus.b;
        }
        return CardActionHelper$AppStatus.c;
    }
    
    public void a(final Tweet tweet, final NativeCardUserAction nativeCardUserAction) {
        this.c.b("show", this.d, nativeCardUserAction);
        this.c.a(PromotedEvent.g, nativeCardUserAction);
        this.b.a(tweet, this.c.a());
    }
    
    public void a(final NativeCardUserAction nativeCardUserAction, final Tweet tweet, final vc vc, Activity a) {
        if (a == null) {
            a = (Activity)this.a;
        }
        this.c.a(PromotedEvent.at, nativeCardUserAction);
        this.c.a("open_product_page", this.d, nativeCardUserAction);
        final Product b = e.b(vc);
        final Intent intent = new Intent((Context)a, (Class)ProductPageActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putSerializable("commerce_product_values", (Serializable)b);
        bundle.putParcelable("commerce_product_tweet", (Parcelable)tweet);
        intent.putExtras(bundle);
        ((Context)a).startActivity(intent);
    }
    
    public void a(final NativeCardUserAction nativeCardUserAction, final vc vc) {
        this.c.a(PromotedEvent.au, nativeCardUserAction);
        this.c.a("open_product_ad", this.d, nativeCardUserAction);
        final String a = wb.a("product_url", vc);
        if (a != null) {
            this.a(a, nativeCardUserAction);
        }
    }
    
    public void a(final NativeCardUserAction nativeCardUserAction, final vc vc, final Activity activity) {
        final String a = wb.a("id", vc);
        final Long a2 = vn.a("id", vc);
        long longValue;
        if (a2 == null) {
            longValue = 0L;
        }
        else {
            longValue = a2;
        }
        this.c.a(PromotedEvent.av, nativeCardUserAction);
        this.c.a(longValue, this.d, nativeCardUserAction);
        if (!TextUtils.isEmpty((CharSequence)a) && longValue > 0L) {
            activity.startActivity(new Intent((Context)activity, (Class)CommerceCollectionActivity.class).putExtra("type", 31).putExtra("collection_id", longValue).putExtra("timeline_tag", "custom-" + a));
        }
    }
    
    public void a(final NativeCardUserAction nativeCardUserAction, final vc vc, final Activity activity, final String s, final CardActionHelper$CommerceCardType cardActionHelper$CommerceCardType, final Tweet tweet) {
        boolean b;
        if (cardActionHelper$CommerceCardType == CardActionHelper$CommerceCardType.b) {
            b = true;
        }
        else {
            b = false;
        }
        PromotedEvent promotedEvent;
        if (b) {
            promotedEvent = PromotedEvent.ay;
        }
        else {
            promotedEvent = PromotedEvent.as;
        }
        this.c.a(promotedEvent, nativeCardUserAction);
        this.c.a(s, this.d, nativeCardUserAction);
        final HashMap a = e.a(vc);
        Serializable s2;
        if (b) {
            s2 = OfferSummaryActivity.class;
        }
        else {
            s2 = ProductSummaryActivity.class;
        }
        final Intent intent = new Intent((Context)activity, (Class)s2);
        final Bundle bundle = new Bundle();
        bundle.putParcelable("commerce_buynow_tweet", (Parcelable)tweet);
        bundle.putSerializable("commerce_product_values", (Serializable)a);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }
    
    public void a(final String s, final NativeCardUserAction nativeCardUserAction) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.c.b("open_link", this.d, nativeCardUserAction);
            this.c.a(PromotedEvent.n, nativeCardUserAction);
            final Tweet b = this.c.b();
            if (b != null) {
                if (b.h()) {
                    final Session b2 = az.a(this.a).b();
                    if (b2 != null) {
                        this.c.b(s);
                        this.b.a(b2, b, s, false);
                    }
                }
                else {
                    this.b.a(s, b);
                    if (b.j != null) {
                        WebsiteDwellMonitor.a(this.a, b.j, s);
                    }
                }
            }
        }
    }
    
    public void a(final String s, final String s2, final String s3, final NativeCardUserAction nativeCardUserAction) {
        switch (k.a[this.a(s2).ordinal()]) {
            default: {
                this.a(s3, nativeCardUserAction);
                break;
            }
            case 1: {
                this.c.b("open_app", this.d, nativeCardUserAction);
                this.c.a(PromotedEvent.q, nativeCardUserAction);
                this.b.b(s, s2);
            }
            case 2: {
                this.c.b("install_app", this.d, nativeCardUserAction);
                this.c.a(PromotedEvent.r, nativeCardUserAction);
                if (this.b.b(s2)) {
                    this.c.b("open_link", this.d, nativeCardUserAction);
                }
                if (com.twitter.library.featureswitch.d.f("post_installed_logging_enabled")) {
                    this.c.e(s2, this.d);
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final um um, final String s, final String s2, final NativeCardUserAction nativeCardUserAction) {
        String s3;
        if (um.c()) {
            s3 = um.b();
        }
        else {
            s3 = um.a();
        }
        this.a(s3, s, s2, nativeCardUserAction);
    }
    
    public void b(final String s) {
        this.a(s, null);
    }
}
