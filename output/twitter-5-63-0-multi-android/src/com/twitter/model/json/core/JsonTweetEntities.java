// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.HashtagEntity;
import com.twitter.library.api.MentionEntity;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.ax;
import com.twitter.model.common.a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetEntities extends b
{
    @JsonField
    public JsonUrlEntity[] a;
    @JsonField
    public JsonMediaEntity[] b;
    @JsonField
    public JsonMentionEntity[] c;
    @JsonField
    public JsonHashtagEntity[] d;
    @JsonField
    public JsonHashtagEntity[] e;
    
    public ax c() {
        int i = 0;
        final ax ax = new ax();
        if (this.a != null) {
            final JsonUrlEntity[] a = this.a;
            for (int length = a.length, j = 0; j < length; ++j) {
                ax.a((UrlEntity)a[j].b().f());
            }
        }
        if (this.c != null) {
            final JsonMentionEntity[] c = this.c;
            for (int length2 = c.length, k = 0; k < length2; ++k) {
                ax.a((MentionEntity)c[k].a().f());
            }
        }
        if (this.d != null) {
            final JsonHashtagEntity[] d = this.d;
            for (int length3 = d.length, l = 0; l < length3; ++l) {
                ax.a((HashtagEntity)d[l].a().f());
            }
        }
        if (this.e != null) {
            final JsonHashtagEntity[] e = this.e;
            for (int length4 = e.length, n = 0; n < length4; ++n) {
                ax.b((HashtagEntity)e[n].a().f());
            }
        }
        if (this.b != null) {
            for (JsonMediaEntity[] b = this.b; i < b.length; ++i) {
                ax.a((MediaEntity)b[i].a().f());
            }
        }
        return ax;
    }
}
