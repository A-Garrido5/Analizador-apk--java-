// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.twitter.library.api.moments.ThemeData;
import com.twitter.library.api.moments.CropData;
import com.twitter.model.common.c;
import com.twitter.model.common.a;
import com.twitter.library.api.moments.MomentPageType;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentPage extends b
{
    @JsonField
    public long a;
    @JsonField
    public JsonMomentMedia b;
    @JsonField
    public JsonRenderData c;
    @JsonField(typeConverter = "Lcom/twitter/model/json/moments/b;")
    public MomentPageType d;
    
    @Override
    public a a() {
        final nl nl = (nl)wy.a(this.b);
        CropData cropData;
        ThemeData themeData;
        if (this.c != null) {
            if (this.c.a != null && nl != null) {
                cropData = (CropData)this.c.a.c().a(nl.b).f();
            }
            else {
                cropData = null;
            }
            themeData = (ThemeData)wy.a(this.c.b);
        }
        else {
            themeData = null;
            cropData = null;
        }
        return new nr().a(this.d).a(cropData).a(themeData).a(nl).a(this.a);
    }
}
