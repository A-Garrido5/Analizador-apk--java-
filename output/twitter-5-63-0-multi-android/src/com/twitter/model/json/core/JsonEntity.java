// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.t;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonEntity
{
    @JsonField
    public int[] a;
    
    public JsonEntity() {
        this.a = new int[] { -1, -1 };
    }
    
    protected t a(final t t) {
        return t.a(this.a[0]).b(this.a[1]);
    }
}
