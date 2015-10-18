// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonGuideResponse extends c
{
    @JsonField
    public List a;
    
    public nj a() {
        return new nj(wy.a(this.a));
    }
}
