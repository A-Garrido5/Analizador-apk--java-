// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.t;
import com.twitter.library.api.aa;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonHashtagEntity extends JsonEntity
{
    @JsonField
    public String b;
    
    public aa a() {
        return ((aa)this.a(new aa())).a(this.b);
    }
}
