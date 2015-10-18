// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.cb;
import com.twitter.library.api.t;
import com.twitter.library.api.ca;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUrlEntity extends JsonEntity
{
    @JsonField(name = { "url_https" })
    public String j;
    @JsonField
    public String k;
    @JsonField
    public String l;
    @JsonField(name = { "url" })
    public String m;
    
    protected ca a(final ca ca) {
        final ca ca2 = (ca)super.a(ca);
        String s;
        if (this.j != null) {
            s = this.j;
        }
        else {
            s = this.m;
        }
        return ca2.b(s).c(this.k).d(this.l);
    }
    
    public cb b() {
        return (cb)this.a(new cb());
    }
}
