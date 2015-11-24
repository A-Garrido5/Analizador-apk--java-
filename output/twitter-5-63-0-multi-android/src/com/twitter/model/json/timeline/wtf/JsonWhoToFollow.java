// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline.wtf;

import java.util.Collections;
import com.twitter.model.json.timeline.JsonSuggestsInfos;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonWhoToFollow
{
    @JsonField(name = { "users" })
    public String[] a;
    @JsonField(name = { "tweets" })
    public Map b;
    @JsonField(name = { "wtf_type" })
    public String c;
    @JsonField(name = { "social_proof" })
    public Map d;
    @JsonField(name = { "strings" })
    public JsonStrings e;
    @JsonField(name = { "suggests_info" })
    public JsonSuggestsInfos f;
    
    public JsonWhoToFollow() {
        this.a = new String[0];
        this.b = Collections.emptyMap();
        this.d = Collections.emptyMap();
    }
}
