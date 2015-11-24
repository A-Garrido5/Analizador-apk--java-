// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline;

import com.twitter.model.common.a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject
public class JsonSuggestsInfo extends b
{
    @JsonField(name = { "suggestion_type" })
    public String a;
    @JsonField(name = { "controller_data" })
    public String b;
    @JsonField(name = { "source_data" })
    public String c;
    @JsonField(name = { "scribe_component" })
    public String d;
    @JsonField(name = { "type_id" })
    public String e;
    
    @Override
    public a a() {
        return new com.twitter.model.timeline.b().a(this.a).b(this.b).d(this.c).c(this.d).e(this.e);
    }
}
