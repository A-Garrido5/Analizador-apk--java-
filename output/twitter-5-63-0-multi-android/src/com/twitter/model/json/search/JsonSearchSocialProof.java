// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.twitter.model.json.core.c;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.bo;
import com.twitter.model.common.a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSearchSocialProof extends b
{
    static final /* synthetic */ boolean d;
    @JsonField
    public Map a;
    @JsonField
    public boolean b;
    @JsonField
    public boolean c;
    
    static {
        d = !JsonSearchSocialProof.class.desiredAssertionStatus();
    }
    
    public bo c() {
        final bo bo = new bo();
        if (this.b) {
            bo.f(1);
            bo.a(26);
        }
        if (this.c) {
            bo.f(2);
        }
        if (this.b && this.c) {
            bo.a(25);
        }
        if (!CollectionUtils.a(this.a)) {
            final String s = (String)CollectionUtils.a((Iterable)this.a.keySet());
            if (!JsonSearchSocialProof.d && s == null) {
                throw new AssertionError();
            }
            final int b = ((com.twitter.model.json.core.b)com.twitter.model.json.core.c.a.getFromString(s)).b;
            if (b != -1) {
                bo.a(b);
                final JsonSearchSocialProof$Users jsonSearchSocialProof$Users = this.a.get(s);
                if (jsonSearchSocialProof$Users != null) {
                    final JsonSearchSocialProof$Users$Name jsonSearchSocialProof$Users$Name = (JsonSearchSocialProof$Users$Name)CollectionUtils.b(jsonSearchSocialProof$Users.a);
                    String a;
                    if (jsonSearchSocialProof$Users$Name != null) {
                        a = jsonSearchSocialProof$Users$Name.a;
                    }
                    else {
                        a = null;
                    }
                    bo.a(a);
                }
            }
        }
        return bo;
    }
}
