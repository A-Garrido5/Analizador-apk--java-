// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import com.twitter.library.card.property.Vector2F;
import com.twitter.library.util.bj;
import com.twitter.android.revenue.card.m;
import com.twitter.library.client.App;
import com.twitter.util.k;
import com.twitter.library.commerce.model.Product;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.android.profiles.ah;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeLog;
import android.text.TextUtils;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import com.twitter.android.commerce.view.CommerceCollectionActivity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.commerce.network.c;
import android.os.Parcelable;
import java.io.Serializable;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.commerce.view.ProfileEntryActivity;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.commerce.model.Email;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
import com.twitter.library.card.property.ImageSpec;
import com.twitter.library.card.instance.UserValue;
import com.twitter.library.card.instance.BindingValue;
import java.util.Map;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.NumberFormat;
import java.util.Locale;
import java.math.BigDecimal;
import com.twitter.library.commerce.model.CreditCard$Type;
import java.util.List;
import android.content.Context;
import java.util.Iterator;
import com.twitter.library.featureswitch.d;
import com.twitter.library.commerce.model.Address;
import com.twitter.library.commerce.model.Profile;
import com.twitter.library.commerce.model.CreditCard;

public class e
{
    public static Address a(final CreditCard creditCard, final Profile profile) {
        if (profile != null) {
            final Address[] g = profile.g();
            if (g != null) {
                for (final Address address : g) {
                    if (address.h().equals(creditCard.o())) {
                        return address;
                    }
                }
            }
        }
        return null;
    }
    
    public static CreditCard a(final Profile profile) {
        if (profile != null) {
            return profile.a();
        }
        return null;
    }
    
    public static String a(final long n) {
        if (d.f("commerce_discovery_vit_collections_enabled")) {
            final Iterator<String> iterator = d.h("commerce_discovery_vit_collections").iterator();
            while (iterator.hasNext()) {
                final String[] split = iterator.next().split(":");
                if (split.length != 2) {
                    return null;
                }
                if (Long.toString(n).equals(split[0].trim())) {
                    return split[1].trim();
                }
            }
        }
        return null;
    }
    
    public static String a(final Context context, final List list) {
        if (list != null) {
            final StringBuilder sb = new StringBuilder();
            final Iterator<CreditCard$Type> iterator = list.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final CreditCard$Type creditCard$Type = iterator.next();
                if (n > 0) {
                    sb.append("/");
                }
                sb.append(CreditCard$Type.a(context, creditCard$Type));
                ++n;
            }
            return sb.toString();
        }
        return null;
    }
    
    public static String a(final Object o) {
        final boolean b = o instanceof String;
        String a = null;
        if (!b) {
            return a;
        }
        final String s = (String)o;
        try {
            a = a(new BigDecimal(s));
            return a;
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    public static String a(final BigDecimal bigDecimal) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(bigDecimal.divide(new BigDecimal(1000000L)));
    }
    
    public static String a(final Calendar calendar) {
        Calendar.getInstance().setTimeInMillis(calendar.getTimeInMillis());
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        return simpleDateFormat.format(calendar.getTime());
    }
    
    public static String a(final HashMap hashMap, final String s) {
        try {
            return hashMap.get(s);
        }
        catch (ClassCastException ex) {
            return null;
        }
    }
    
    public static String a(final boolean b, final String s) {
        if (b) {
            return "settings:payment_settings:" + s;
        }
        return "buy_now::" + s;
    }
    
    public static HashMap a(final HashMap hashMap) {
        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
        if (hashMap != null) {
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                final String s = entry.getKey();
                final BindingValue bindingValue = (BindingValue)entry.getValue();
                if (s != null && bindingValue.value != null) {
                    if (bindingValue.value instanceof UserValue) {
                        hashMap2.put(s, ((UserValue)bindingValue.value).id);
                    }
                    else if (bindingValue.value instanceof ImageSpec) {
                        hashMap2.put(s, ((ImageSpec)bindingValue.value).url);
                    }
                    else {
                        hashMap2.put(s, (String)bindingValue.value);
                    }
                }
            }
        }
        return hashMap2;
    }
    
    public static HashMap a(final vc vc) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final String s : vc.a()) {
            final Object a = vc.a(s);
            if (a instanceof vj) {
                hashMap.put(s, ((vj)a).a);
            }
            else {
                hashMap.put(s, (String)a);
            }
        }
        return hashMap;
    }
    
    public static List a(final String s) {
        if (s != null) {
            return Arrays.asList(s.replace(" ", "").split(","));
        }
        return new ArrayList();
    }
    
    public static List a(final vc vc, final String[] array) {
        final ArrayList<String> list = new ArrayList<String>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            final vj a = vj.a(array[i], vc);
            if (a != null && a.a != null) {
                list.add(a.a);
            }
        }
        return list;
    }
    
    public static void a(final Activity activity, final Tweet tweet, final String s, final Address address, final Email email, final String s2, final CreditCard creditCard, final List list, final int n, final boolean b) {
        if (tweet != null && s != null) {
            a((Context)activity, tweet, a(b, "store_profile:payment_method:start"), s);
            a((Context)activity, tweet, PromotedEvent.ai);
        }
        final Intent intent = new Intent((Context)activity, (Class)ProfileEntryActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putSerializable("commerce_address_object", (Serializable)address);
        bundle.putSerializable("commerce_profile_email", (Serializable)email);
        bundle.putParcelable("commerce_buynow_tweet", (Parcelable)tweet);
        bundle.putBoolean("commerce_launched_from_settings", b);
        if (list != null && list instanceof Serializable) {
            bundle.putSerializable("commerce_allowed_states_for_item", (Serializable)list);
        }
        if (creditCard != null && e()) {
            bundle.putSerializable("commerce_partial_card_object", (Serializable)creditCard);
        }
        c.a(bundle, s2);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, n);
    }
    
    public static void a(final Context context, final long n, final String s, final TwitterUser twitterUser, final PromotedContent promotedContent, final TwitterScribeAssociation twitterScribeAssociation) {
        final Iterator<String> iterator = (Iterator<String>)d.h("commerce_discovery_vit_collections").iterator();
        while (iterator.hasNext()) {
            final String[] split = iterator.next().split(":");
            final String trim = split[0].trim();
            final String trim2 = split[1].trim();
            if (Long.toString(n).equals(trim)) {
                a(context, s, n, twitterUser, promotedContent, twitterScribeAssociation, trim2);
                try {
                    final long long1 = Long.parseLong(trim2);
                    if (long1 <= 0L) {
                        continue;
                    }
                    context.startActivity(new Intent(context, (Class)CommerceCollectionActivity.class).putExtra("type", 27).putExtra("collection_id", long1).putExtra("timeline_tag", "custom-" + trim2));
                }
                catch (NumberFormatException ex) {}
            }
        }
    }
    
    public static void a(final Context context, final View view) {
        final InputMethodManager inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
        if (view != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
    
    public static void a(final Context context, final ViewGroup viewGroup, final Integer n, final int n2, final boolean b) {
        a(context, viewGroup, n, n2, b, false);
    }
    
    public static void a(final Context context, final ViewGroup viewGroup, final Integer n, final int n2, final boolean b, final boolean b2) {
        a(context, viewGroup, n, context.getString(n2), b, b2);
    }
    
    public static void a(final Context context, final ViewGroup viewGroup, final Integer n, final String s, final boolean b) {
        a(context, viewGroup, n, s, b, false);
    }
    
    public static void a(final Context context, final ViewGroup viewGroup, final Integer n, final String text, final boolean b, final boolean b2) {
        ((TextView)viewGroup.findViewById(2131886448)).setText((CharSequence)text);
        final ImageView imageView = (ImageView)viewGroup.findViewById(2131886447);
        if (n != null) {
            imageView.setImageResource((int)n);
        }
        else {
            imageView.setVisibility(8);
        }
        if (!b) {
            viewGroup.findViewById(2131886445).setVisibility(8);
        }
        if (b2) {
            viewGroup.findViewById(2131886446).setVisibility(0);
        }
    }
    
    public static void a(final Context context, final Tweet tweet, final PromotedEvent promotedEvent) {
        if ((promotedEvent == PromotedEvent.as || promotedEvent == PromotedEvent.ao || promotedEvent == PromotedEvent.aw || promotedEvent == PromotedEvent.ay) && tweet != null && tweet.j != null) {
            com.twitter.android.client.c.a(context).a(promotedEvent, tweet.j);
        }
    }
    
    public static void a(final Context context, final Tweet tweet, final String s, final String s2) {
        a(context, tweet, s, s2, null);
    }
    
    public static void a(final Context context, final Tweet tweet, final String s, final String s2, final String s3) {
        final Session b = az.a(context).b();
        if (b != null) {
            final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(b.g()).a(context, tweet, null, null).b(new String[] { s })).e(null);
            if (!TextUtils.isEmpty((CharSequence)s2)) {
                twitterScribeLog.b(s2, s3);
            }
            com.twitter.android.client.c.a(context).a(twitterScribeLog);
        }
    }
    
    public static void a(final Context context, final Tweet tweet, final String s, final String s2, final String s3, final String s4, final String s5) {
        final TwitterScribeLog b = b(context, tweet, s, s2, s3, s4, s5);
        if (b != null) {
            com.twitter.android.client.c.a(context).a(b);
        }
    }
    
    public static void a(final Context context, final String s, final long n, final TwitterUser twitterUser, final PromotedContent promotedContent, final TwitterScribeAssociation twitterScribeAssociation, final String s2) {
        final Session b = az.a(context).b();
        if (b != null) {
            com.twitter.android.client.c.a(context).a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(b.g()).b(n, promotedContent, ah.b(twitterUser)).b(new String[] { s })).a(twitterScribeAssociation)).b(TwitterScribeItem.b(s2, -1)));
        }
    }
    
    public static boolean a() {
        return b("commerce_enabled");
    }
    
    public static boolean a(final HashMap hashMap, final String s, boolean b) {
        final String a = a(hashMap, s);
        if (!TextUtils.isEmpty((CharSequence)a)) {
            if (a.toLowerCase().equals("false")) {
                b = false;
            }
            else if (a.toLowerCase().equals("true")) {
                return true;
            }
        }
        else {
            final Boolean value = hashMap.get(s);
            if (value != null && value instanceof Boolean) {
                return value;
            }
        }
        return b;
    }
    
    public static CreditCard b(final Profile profile) {
        if (profile != null) {
            for (final CreditCard creditCard : profile.d()) {
                if (creditCard.m()) {
                    return creditCard;
                }
            }
        }
        return null;
    }
    
    public static Product b(final vc vc) {
        final String a = wb.a("title", vc);
        final String a2 = wb.a("description", vc);
        final String a3 = wb.a("id", vc);
        final List d = d(vc);
        final String a4 = wb.a("price", vc);
        final List c = c(vc);
        final String a5 = wb.a("search_string", vc);
        final String a6 = wb.a("media_search_string", vc);
        final String a7 = wb.a("destination", vc);
        final String a8 = wb.a("card_url", vc);
        final Product product = new Product();
        product.a(a3);
        product.b(a);
        product.c(a2);
        product.a(d);
        product.b(c);
        product.e(a5);
        product.f(a6);
        product.g(a7);
        product.h(a8);
        if (a4 == null) {
            return product;
        }
        try {
            product.a(new BigDecimal(a4));
            return product;
        }
        catch (NumberFormatException ex) {
            return product;
        }
    }
    
    public static TwitterScribeLog b(final Context context, final Tweet tweet, final String s, final String s2, final String s3, final String s4, final String s5) {
        final Session b = az.a(context).b();
        if (b != null) {
            final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(b.g());
            final TwitterScribeAssociation twitterScribeAssociation = (TwitterScribeAssociation)new TwitterScribeAssociation().b("commerce_product");
            if (tweet != null) {
                twitterScribeLog.a(context, tweet, twitterScribeAssociation, s5);
            }
            if (!TextUtils.isEmpty((CharSequence)s)) {
                twitterScribeAssociation.c(s);
            }
            twitterScribeLog.b(new String[] { TwitterScribeLog.a(twitterScribeAssociation, "commerce", k.a(s2), k.a(s3)) });
            if (!TextUtils.isEmpty((CharSequence)s4)) {
                twitterScribeLog.b(s4, s5);
            }
            return twitterScribeLog;
        }
        return null;
    }
    
    public static boolean b() {
        return b("commerce_allow_unverified_email_address");
    }
    
    private static boolean b(final String s) {
        final boolean f = d.f(s);
        int n;
        if (App.b() || App.a()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            final boolean b = false;
            if (!f) {
                return b;
            }
        }
        return true;
    }
    
    public static Email c(final Profile profile) {
        if (profile != null) {
            return profile.c();
        }
        return null;
    }
    
    private static List c(final vc vc) {
        final ArrayList<Long> list = new ArrayList<Long>(m.b.length);
        final String[] b = m.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            final Long a = vn.a(b[i], vc);
            if (a != null) {
                list.add(a);
            }
        }
        return list;
    }
    
    public static boolean c() {
        return b("commerce_order_history_enabled");
    }
    
    private static List d(final vc vc) {
        final ArrayList<ImageSpec> list = new ArrayList<ImageSpec>(m.a.length);
        final String[] a = m.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            final vj a2 = vj.a(a[i], vc);
            if (a2 != null) {
                final ImageSpec imageSpec = new ImageSpec();
                imageSpec.url = a2.a;
                imageSpec.size = new Vector2F(a2.b * bj.a, a2.c * bj.a);
                list.add(imageSpec);
            }
        }
        return list;
    }
    
    public static boolean d() {
        return d.f("commerce_offers_enabled");
    }
    
    public static boolean e() {
        final boolean f = d.f("commerce_upgrade_profile");
        int n;
        if (App.b() || App.a()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            final boolean b = false;
            if (!f) {
                return b;
            }
        }
        return true;
    }
    
    public static boolean f() {
        return d.f("commerce_use_v2_api");
    }
}
