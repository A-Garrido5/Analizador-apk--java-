// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import android.os.Parcelable;
import java.io.Serializable;
import com.twitter.library.api.bk;
import android.os.Bundle;
import java.util.HashMap;
import com.twitter.library.api.geo.TwitterPlace$PlaceInfo;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.android.client.c;

public class g implements f
{
    private final k a;
    private final sx b;
    private final e c;
    private final m d;
    private final c e;
    private final long f;
    private String g;
    private TwitterPlace h;
    private TwitterPlace i;
    private PlaceLandingActivity$PageType j;
    private boolean k;
    private boolean l;
    private final sy m;
    
    public g(final sx b, final e c, final m d, final TwitterPlace h, final k a, final c e, final long f) {
        this.j = PlaceLandingActivity$PageType.a;
        this.m = new h(this);
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
    }
    
    private void a(final int n) {
        String s = null;
        switch (n) {
            default: {
                return;
            }
            case 0: {
                s = "tweets_timeline";
                break;
            }
            case 1: {
                s = "photo_grid";
                break;
            }
        }
        this.e.a(((TwitterScribeLog)new TwitterScribeLog(this.f).b(new String[] { ScribeLog.a("place_page", s, "", "", "impression") })).c(this.h.placeId));
    }
    
    private void a(final TwitterPlace h) {
        this.h = h;
        this.a.a(this.h.fullName);
        final TwitterPlace$PlaceInfo placeInfo = this.h.placeInfo;
        if (placeInfo != null) {
            final HashMap attributes = placeInfo.attributes;
            if (attributes != null) {
                this.a.b((CharSequence)attributes.get("street_address"));
            }
            if (h.placeType == TwitterPlace$PlaceType.a && placeInfo.centroid != null) {
                if (!this.l) {
                    this.b.a(placeInfo.centroid, this.m);
                    this.l = true;
                }
                if (this.i != null) {
                    this.a.c(this.i.fullName);
                    return;
                }
                this.d.a(placeInfo.centroid, new i(this));
            }
            else if (h.placeType != TwitterPlace$PlaceType.a && !this.l && placeInfo.boundingCoordinates != null) {
                this.b.a(si.a(placeInfo), si.b(placeInfo), this.m);
                this.l = true;
            }
        }
    }
    
    private void a(final String s, final String s2, final boolean b) {
        if (this.h.placeId != null) {
            String g;
            if ("all".equals(s2)) {
                g = null;
            }
            else {
                g = this.g;
            }
            this.c.a(this.h.placeId, this, g, s, s2, b);
        }
    }
    
    private String j() {
        switch (com.twitter.android.geo.places.j.a[this.j.ordinal()]) {
            default: {
                return null;
            }
            case 1: {
                return "tweets";
            }
            case 2: {
                return "media";
            }
        }
    }
    
    public TwitterPlace a() {
        return this.h;
    }
    
    public void a(final int n, final boolean b) {
        switch (n) {
            case 0: {
                this.j = PlaceLandingActivity$PageType.a;
                break;
            }
            case 1: {
                this.j = PlaceLandingActivity$PageType.b;
                break;
            }
        }
        if (b) {
            this.a.a(n);
        }
        this.a(n);
    }
    
    public void a(final Bundle bundle) {
        if (bundle != null) {
            this.k = bundle.getBoolean("state_fetched_all");
            this.j = (PlaceLandingActivity$PageType)bundle.getSerializable("state_page_type");
            this.g = bundle.getString("state_tweet_cursor");
            this.h = (TwitterPlace)bundle.getParcelable("state_place");
            this.i = (TwitterPlace)bundle.getParcelable("state_city_place");
        }
        final sx b = this.b;
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = null;
        }
        else {
            bundle2 = bundle.getBundle("state_map_bundle");
        }
        b.a(bundle2);
        this.a(this.h);
    }
    
    @Override
    public void a(final bk bk) {
        if (bk != null) {
            TwitterPlace a;
            if (bk.a == null) {
                a = null;
            }
            else {
                a = bk.a.a;
            }
            if (a != null) {
                this.a(a);
            }
            if (bk.c != null) {
                this.g = bk.c.a;
            }
            this.k = true;
        }
        else {
            this.a.a();
        }
        this.a.a(false);
    }
    
    public void b() {
        this.a(this.j(), "refresh", false);
    }
    
    public void b(final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        this.b.b(bundle2);
        bundle.putBundle("state_map_bundle", bundle2);
        bundle.putBoolean("state_fetched_all", this.k);
        bundle.putSerializable("state_page_type", (Serializable)this.j);
        bundle.putString("state_tweet_cursor", this.g);
        bundle.putParcelable("state_place", (Parcelable)this.h);
        bundle.putParcelable("state_city_place", (Parcelable)this.i);
    }
    
    public void c() {
        this.a(this.j(), "scroll", false);
    }
    
    public void d() {
        if (!this.k) {
            this.e();
        }
    }
    
    public void e() {
        this.a("all", null, true);
    }
    
    public void f() {
        this.b.a();
    }
    
    public void g() {
        this.b.b();
    }
    
    public void h() {
        this.b.d();
    }
    
    public void i() {
        this.b.c();
        this.d.a();
        this.c.a();
    }
}
