// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.twitter.model.common.a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCropData extends b
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public int d;
    
    public com.twitter.library.api.moments.b c() {
        return new com.twitter.library.api.moments.b().a(this.a).b(this.b).c(this.c).d(this.d);
    }
}
