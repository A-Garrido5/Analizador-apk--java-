// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.t;
import com.twitter.library.api.ah;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMentionEntity extends JsonEntity
{
    @JsonField
    public String b;
    @JsonField(name = { "id" })
    public long c;
    @JsonField
    public String d;
    
    public ah a() {
        return ((ah)this.a(new ah())).a(this.b).a(this.c).b(this.d);
    }
}
