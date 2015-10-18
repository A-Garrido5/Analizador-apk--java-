// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.bo;
import com.twitter.model.common.a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSearchHighlightContext extends b
{
    @JsonField(typeConverter = "Lcom/twitter/model/json/core/c;")
    public com.twitter.model.json.core.b a;
    @JsonField
    public String[] b;
    
    public JsonSearchHighlightContext() {
        this.a = com.twitter.model.json.core.b.a;
    }
    
    public bo c() {
        return new bo().a(this.a.b).a((String)CollectionUtils.b(this.b));
    }
}
