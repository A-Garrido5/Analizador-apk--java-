// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSuggestsInfos
{
    @JsonField(name = { "module" })
    public JsonSuggestsInfo a;
    @JsonField(name = { "tweets" })
    public Map b;
    @JsonField(name = { "users" })
    public Map c;
}
