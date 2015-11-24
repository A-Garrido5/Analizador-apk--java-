// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.twitter.library.api.bo;
import com.twitter.model.common.a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.core.JsonUserName;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject
public class JsonDiscoverSummaryContext extends b
{
    @JsonField
    public JsonUserName a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    
    public bo c() {
        int n = 1;
        final bo c = new bo().b(this.b).c(this.c);
        if (this.d != null) {
            c.a(21).a(this.d);
        }
        if (this.e != null) {
            c.a(20);
        }
        int n2;
        if (this.b > 0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (this.c <= 0) {
            n = 0;
        }
        if (this.a != null) {
            c.a(this.a.a);
            if (n2 != 0) {
                c.a(16);
            }
            else if (n != 0) {
                c.a(18);
                return c;
            }
        }
        else if (c.c() == -1) {
            if (n2 != 0 && n != 0) {
                int n3;
                if (this.b > this.c) {
                    n3 = 14;
                }
                else {
                    n3 = 15;
                }
                c.a(n3);
                return c;
            }
            if (n != 0) {
                c.a(19);
                return c;
            }
            if (n2 != 0) {
                c.a(17);
                return c;
            }
        }
        return c;
    }
}
