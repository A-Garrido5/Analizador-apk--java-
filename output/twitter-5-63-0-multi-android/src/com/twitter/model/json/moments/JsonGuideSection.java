// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import java.util.List;
import com.twitter.library.api.moments.MomentGuideSectionType;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonGuideSection extends c
{
    @JsonField
    public String a;
    @JsonField(typeConverter = "Lcom/twitter/model/json/moments/a;")
    public MomentGuideSectionType b;
    @JsonField
    public List c;
    
    public nk a() {
        return new nk(this.a, this.b, wy.a(this.c));
    }
}
