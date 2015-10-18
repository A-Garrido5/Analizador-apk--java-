// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.twitter.model.common.c;
import com.twitter.library.api.moments.Moment;
import com.twitter.model.common.a;
import java.util.List;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentModule extends b
{
    @JsonField
    public JsonMoment a;
    @JsonField
    public Map b;
    @JsonField
    public List c;
    @JsonField
    public int d;
    @JsonField
    public JsonMomentPage e;
    @JsonField
    public JsonMomentPage f;
    @JsonField
    public JsonMomentPage g;
    
    @Override
    public a a() {
        return new no().a((Moment)this.a.b()).a(wy.a(this.b)).a(wy.a(this.c)).a(this.d).a((np)wy.a(this.e)).b((np)wy.a(this.f)).c((np)wy.a(this.g));
    }
}
