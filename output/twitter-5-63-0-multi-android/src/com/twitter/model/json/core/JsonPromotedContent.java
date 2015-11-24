// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.HashMap;
import java.util.Iterator;
import com.twitter.library.api.PromotedContent;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPromotedContent extends c
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public long d;
    @JsonField
    public Map e;
    @JsonField
    public JsonPromotedContent$PromotedContentAdvertiser f;
    @JsonField
    public JsonPromotedContent$PromotedContentTrend g;
    @JsonField
    public JsonUserName[] h;
    
    public PromotedContent a() {
        final PromotedContent promotedContent = new PromotedContent();
        promotedContent.impressionId = this.a;
        promotedContent.disclosureType = this.b;
        promotedContent.advertiserName = this.c;
        promotedContent.promotedTrendId = this.d;
        final Map e = this.e;
        if (e != null) {
            for (final Map.Entry<String, V> entry : e.entrySet()) {
                final String s = entry.getKey();
                String s2 = (String)entry.getValue();
                switch (s) {
                    default: {
                        final HashMap experimentValues = promotedContent.experimentValues;
                        if (s2 == null) {
                            s2 = "0";
                        }
                        experimentValues.put(s, s2);
                        continue;
                    }
                    case "pac_in_timeline": {
                        promotedContent.isPAcInTimeline = "true".equals(s2);
                        continue;
                    }
                    case "suppress_media_forward": {
                        promotedContent.isSuppressMediaForward = "true".equals(s2);
                        continue;
                    }
                }
            }
        }
        if (this.f != null) {
            promotedContent.advertiserId = this.f.a;
        }
        final JsonPromotedContent$PromotedContentTrend g = this.g;
        if (g != null) {
            promotedContent.isPromotedTrend = true;
            promotedContent.promotedTrendId = g.a;
            promotedContent.socialContext = g.b;
        }
        final JsonUserName[] h = this.h;
        if (h != null) {
            for (final JsonUserName jsonUserName : h) {
                if (promotedContent.socialContext == null) {
                    promotedContent.socialContext = jsonUserName.a();
                }
            }
        }
        return promotedContent;
    }
}
