// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.DiscoverStoryMetadata;
import com.twitter.library.api.TwitterSearchHighlight;
import android.text.TextUtils;
import com.twitter.library.api.TwitterSocialProof;
import com.twitter.library.api.u;
import com.twitter.util.collection.g;
import com.twitter.model.common.a;
import com.twitter.model.json.search.JsonDiscoverStoryMetadata;
import com.twitter.model.json.search.JsonTwitterClusterMetadata;
import com.twitter.model.json.search.JsonHighlightTimeRange;
import com.twitter.model.json.search.JsonTwitterStatusReason;
import com.twitter.model.json.search.JsonDiscoverSummaryContext;
import com.twitter.model.json.search.JsonSearchHighlightContext;
import com.twitter.model.json.search.JsonSearchSocialProof;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterStatusMetadata extends b
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public boolean c;
    @JsonField
    public boolean d;
    @JsonField
    public JsonEntity[] e;
    @JsonField
    public JsonSearchSocialProof f;
    @JsonField
    public JsonSearchHighlightContext g;
    @JsonField
    public JsonDiscoverSummaryContext h;
    @JsonField
    public JsonTwitterStatusReason i;
    @JsonField
    public JsonHighlightTimeRange j;
    @JsonField
    public JsonTwitterClusterMetadata k;
    @JsonField
    public JsonDiscoverStoryMetadata l;
    
    public xc c() {
        final xc b = new xc().a(this.a).a(this.c).b(this.d);
        xa a;
        if (this.k != null) {
            a = this.k.a();
        }
        else {
            a = null;
        }
        final xc a2 = b.a(a);
        DiscoverStoryMetadata a3;
        if (this.l != null) {
            a3 = this.l.a();
        }
        else {
            a3 = null;
        }
        final xc a4 = a2.a(a3);
        String a5;
        if (this.i != null) {
            a5 = this.i.a;
        }
        else {
            a5 = null;
        }
        final xc b2 = a4.b(a5);
        String b3;
        if (this.i != null) {
            b3 = this.i.b;
        }
        else {
            b3 = null;
        }
        final xc c = b2.c(b3);
        if (this.e != null) {
            final g a6 = com.twitter.util.collection.g.a();
            for (final JsonEntity jsonEntity : this.e) {
                final int n = jsonEntity.a[0];
                final int n2 = jsonEntity.a[1];
                if (n > -1 && n < n2) {
                    a6.a(((u)((u)new u().a(n)).b(n2)).f());
                }
            }
            c.a(a6.d());
        }
        TwitterSocialProof twitterSocialProof;
        if (this.f != null) {
            twitterSocialProof = (TwitterSocialProof)this.f.b();
        }
        else {
            twitterSocialProof = null;
        }
        if (this.g != null) {
            twitterSocialProof = (TwitterSocialProof)this.g.b();
        }
        if (this.h != null && twitterSocialProof == null) {
            twitterSocialProof = (TwitterSocialProof)this.h.b();
        }
        c.a(twitterSocialProof);
        final JsonHighlightTimeRange j = this.j;
        if (!TextUtils.isEmpty((CharSequence)this.b) && j != null && j.a != 0L && j.b != 0L) {
            c.a(new TwitterSearchHighlight(this.b, j.a, j.b));
        }
        return c;
    }
}
