// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.twitter.library.api.moments.d;
import com.twitter.model.common.a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMoment extends b
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public boolean d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField
    public boolean g;
    @JsonField
    public boolean h;
    @JsonField
    public int i;
    
    @Override
    public a a() {
        return new d().a(this.a).a(this.b).d(this.c).b(this.d).b(this.e).c(this.f).a(this.g).c(this.h).a(this.i);
    }
}
