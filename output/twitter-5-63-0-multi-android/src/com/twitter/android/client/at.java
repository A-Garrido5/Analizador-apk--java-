// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.nativecards.i;
import com.twitter.android.nativecards.ConsumerPollCard$Configuration;
import com.twitter.android.nativecards.y;
import com.twitter.android.nativecards.z;
import com.twitter.android.nativecards.PollCard$Configuration;
import com.twitter.android.nativecards.l;
import com.twitter.android.nativecards.s;
import com.twitter.android.nativecards.a;
import com.twitter.android.nativecards.ab;
import com.twitter.android.nativecards.o;
import com.twitter.android.revenue.card.v;
import com.twitter.android.nativecards.q;
import com.twitter.android.revenue.card.h;
import com.twitter.android.revenue.card.k;
import com.twitter.android.revenue.card.ak;
import com.twitter.android.revenue.card.au;
import com.twitter.android.revenue.card.ao;
import com.twitter.android.nativecards.ai;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.android.nativecards.ag;

public abstract class at
{
    public static void a() {
        b();
        c();
    }
    
    public static void b() {
        final vu a = vu.a();
        a.a("summary", new ag(), DisplayMode.b, DisplayMode.a, DisplayMode.d);
        a.a("summary_large_image", new ai(), DisplayMode.b, DisplayMode.a, DisplayMode.d);
        a.a("appplayer", new ao(), DisplayMode.b, DisplayMode.a);
        a.a("promo_website", new ak(new au()), DisplayMode.b, DisplayMode.a);
        a.a("promo_image_app", new com.twitter.android.revenue.card.ai(), DisplayMode.b, DisplayMode.a);
        a.a("promo_app", new ak(new h()), DisplayMode.b, DisplayMode.a);
        a.a("2586390716:buy_now", new ak(new et()), DisplayMode.b, DisplayMode.a);
        a.a("2586390716:buy_now_offers", new ak(new ez()), DisplayMode.b, DisplayMode.a);
        a.a("2586390716:product_page", new ak(new ff()), DisplayMode.b, DisplayMode.a);
        a.a("2586390716:product_ad", new ak(new fc()), DisplayMode.b, DisplayMode.a);
        a.a("2586390716:commerce_collection", new ak(new ew()), DisplayMode.b, DisplayMode.a);
        a.a("2586390716:authenticated_web_view", new ak(new eq()), DisplayMode.b, DisplayMode.a);
        a.a("photo", new q(), DisplayMode.b);
        a.a("promotion", new ak(new v()), DisplayMode.b, DisplayMode.a);
        a.a("gallery", new o(), DisplayMode.b);
        a.a("product", new ab(), DisplayMode.b);
        a.a("app", new a(new h()), DisplayMode.b);
        a.a("app", new a(new com.twitter.android.revenue.card.ab()), DisplayMode.c);
        a.a("audio", new ec(), DisplayMode.b, DisplayMode.a);
        a.a("amplify", new ef(), DisplayMode.b, DisplayMode.a);
        a.a("player", new s(), DisplayMode.b, DisplayMode.a);
        a.a("direct_store_link_app", new l(new h()), DisplayMode.b);
        final PollCard$Configuration a2 = PollCard$Configuration.a;
        a.a(a2.name, new z(a2), DisplayMode.b, DisplayMode.a);
        final PollCard$Configuration b = PollCard$Configuration.b;
        a.a(b.name, new z(b), DisplayMode.b, DisplayMode.a);
        final PollCard$Configuration d = PollCard$Configuration.d;
        a.a(d.name, new z(d), DisplayMode.b, DisplayMode.a);
        final PollCard$Configuration c = PollCard$Configuration.c;
        a.a(c.name, new z(c), DisplayMode.b, DisplayMode.a);
        a.a("2427656750:poll_choice4_rc", new y(), DisplayMode.b, DisplayMode.a);
        for (final ConsumerPollCard$Configuration consumerPollCard$Configuration : new ConsumerPollCard$Configuration[] { ConsumerPollCard$Configuration.a }) {
            a.a(consumerPollCard$Configuration.modelName, new i(consumerPollCard$Configuration), DisplayMode.b, DisplayMode.a);
        }
    }
    
    private static void c() {
        final vh a = vh.a();
        a.a("summary", DisplayMode.a, "card_registry_native_summary_to_website_android_2882", "interim_summary_and_website", "final_summary_and_website");
        a.a("summary_large_image", DisplayMode.a, "card_registry_native_summary_to_website_android_2882", "interim_summary_and_website", "final_summary_and_website");
        a.a("audio", DisplayMode.a, "card_registry_native_audio_card_android_2758", "native_audio");
        a.a("audio", DisplayMode.b, "card_registry_native_audio_card_android_2758", "native_audio");
        a.a("amplify", DisplayMode.b, "card_registry_native_amplify_card_android_2798", "native_amplify_enabled");
        a.a("amplify", DisplayMode.a, "card_registry_native_amplify_card_android_2798", "native_amplify_enabled");
        a.a("2586390716:buy_now", DisplayMode.a, "card_registry_commerce_native_cards_android_2836", "native_buy_now");
        a.a("2586390716:buy_now", DisplayMode.b, "card_registry_commerce_native_cards_android_2836", "native_buy_now");
        a.a("2586390716:buy_now_offers", DisplayMode.a, "card_registry_commerce_native_cards_android_2836", "native_offer");
        a.a("2586390716:buy_now_offers", DisplayMode.b, "card_registry_commerce_native_cards_android_2836", "native_offer");
    }
}
