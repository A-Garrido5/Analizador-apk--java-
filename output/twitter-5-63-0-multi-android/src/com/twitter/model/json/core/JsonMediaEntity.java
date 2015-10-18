// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.ca;
import com.twitter.library.api.af;
import com.twitter.library.api.MediaEntity$Type;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMediaEntity extends JsonUrlEntity
{
    @JsonField
    public long b;
    @JsonField(typeConverter = "Lcom/twitter/model/json/core/a;")
    public MediaEntity$Type c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public long f;
    @JsonField
    public JsonMediaSizes g;
    @JsonField
    public JsonMediaFeatures h;
    @JsonField
    public JsonMediaVideoInfo i;
    
    public JsonMediaEntity() {
        this.c = MediaEntity$Type.a;
    }
    
    public af a() {
        final af b = ((af)this.a(new af())).a(this.b).b(this.f);
        String s;
        if (this.d != null) {
            s = this.d;
        }
        else {
            s = this.e;
        }
        final af a = b.a(s).a(this.c);
        if (this.g != null) {
            a.a(this.g.a());
        }
        if (this.h != null) {
            if (this.h.a != null) {
                a.a(this.h.a.a());
            }
            if (this.h.b != null) {
                a.a(this.h.b.a());
            }
        }
        if (this.i != null) {
            a.a(this.i.a());
        }
        return a;
    }
}
