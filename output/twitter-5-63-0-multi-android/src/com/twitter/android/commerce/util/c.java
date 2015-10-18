// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import java.util.Iterator;
import com.twitter.library.card.property.ImageSpec;
import java.util.Collection;
import com.twitter.android.revenue.card.m;
import java.util.ArrayList;
import com.twitter.library.provider.i;
import com.twitter.library.provider.j;
import java.util.HashMap;
import com.twitter.library.commerce.model.Product;
import com.twitter.library.card.instance.CardInstanceData;
import android.os.Parcelable;
import com.twitter.android.commerce.view.ProductSummaryActivity;
import java.io.Serializable;
import android.os.Bundle;
import com.twitter.android.commerce.view.ProductPageActivity;
import android.text.TextUtils;
import android.content.Context;
import com.twitter.android.commerce.view.CommerceCollectionActivity;
import android.content.Intent;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import java.util.Arrays;
import java.util.List;

public class c
{
    public static final List a;
    
    static {
        a = Arrays.asList("2586390716:commerce_collection", "2586390716:product_page");
    }
    
    public static Intent a(final Activity activity, final Tweet tweet) {
        final CardInstanceData w = tweet.W();
        if (w != null) {
            final d d = new d(w.e());
            final String name = w.name;
            switch (name) {
                case "2586390716:commerce_collection": {
                    final Intent intent = new Intent((Context)activity, (Class)CommerceCollectionActivity.class);
                    final String a = w.a("id", "");
                    if (!TextUtils.isEmpty((CharSequence)a)) {
                        intent.putExtra("type", 31).putExtra("timeline_tag", "custom-" + a);
                        return intent;
                    }
                }
                case "2586390716:product_page": {
                    final Product b = e.b(d);
                    final Intent intent2 = new Intent((Context)activity, (Class)ProductPageActivity.class);
                    final Bundle bundle = new Bundle();
                    bundle.putSerializable("commerce_product_values", (Serializable)b);
                    intent2.putExtras(bundle);
                    return intent2;
                }
                case "2586390716:buy_now": {
                    final HashMap a2 = e.a(d);
                    final Intent intent3 = new Intent((Context)activity, (Class)ProductSummaryActivity.class);
                    final Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("commerce_buynow_tweet", (Parcelable)tweet);
                    bundle2.putSerializable("commerce_product_values", (Serializable)a2);
                    intent3.putExtras(bundle2);
                    return intent3;
                }
            }
        }
        return null;
    }
    
    public static HashMap a(final Tweet tweet) {
        final CardInstanceData w = tweet.W();
        final i a = new j(tweet).a(true).c(true).a();
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        if (w != null) {
            final String name = w.name;
            switch (name) {
                case "2586390716:commerce_collection": {
                    hashMap.put("name", w.a("title"));
                    hashMap.put("description", a.a);
                    hashMap.put("username", tweet.z);
                    return hashMap;
                }
                case "2586390716:product_page": {
                    hashMap.put("name", w.a("title"));
                    hashMap.put("description", a.a);
                    hashMap.put("username", tweet.z);
                    return hashMap;
                }
                case "2586390716:buy_now": {
                    hashMap.put("name", w.a("item_title"));
                    hashMap.put("description", a.a);
                    hashMap.put("username", tweet.z);
                    return hashMap;
                }
            }
        }
        return hashMap;
    }
    
    public static com.twitter.util.collection.i b(final Tweet tweet) {
        final ArrayList<String> list = new ArrayList<String>();
        final ArrayList<Float> list2 = new ArrayList<Float>();
        final CardInstanceData w = tweet.W();
        if (w != null) {
            final ArrayList<String> list3 = new ArrayList<String>();
            final String name = w.name;
            switch (name) {
                case "2586390716:commerce_collection": {
                    list3.addAll((Collection<?>)Arrays.asList(m.c));
                    break;
                }
                case "2586390716:product_page": {
                    list3.add(m.a[0]);
                    break;
                }
                case "2586390716:buy_now": {
                    list3.add("item_image");
                    break;
                }
            }
            final Iterator<Object> iterator = list3.iterator();
            while (iterator.hasNext()) {
                final ImageSpec imageSpec = (ImageSpec)w.a(iterator.next(), ImageSpec.class);
                if (imageSpec != null) {
                    list2.add(imageSpec.size.x / imageSpec.size.y);
                    list.add(imageSpec.url);
                }
            }
        }
        return new com.twitter.util.collection.i(list, list2);
    }
}
