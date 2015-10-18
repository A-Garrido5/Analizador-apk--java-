// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.twitter.library.api.DiscoverStoryMetadata;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject
public class JsonDiscoverStoryMetadata extends c
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public DiscoverStoryMetadata a() {
        return new DiscoverStoryMetadata(this.a, this.b);
    }
}
