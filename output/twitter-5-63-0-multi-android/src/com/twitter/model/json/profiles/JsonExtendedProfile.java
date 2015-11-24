// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.profiles;

import com.twitter.library.api.x;
import com.twitter.model.common.a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.b;

@JsonObject
public class JsonExtendedProfile extends b
{
    @JsonField
    public long a;
    @JsonField
    public JsonBirthdate b;
    
    public x c() {
        boolean b;
        if (this.b == null) {
            b = true;
        }
        else {
            b = false;
        }
        final x a = new x().a(this.a);
        int a2;
        if (b) {
            a2 = 0;
        }
        else {
            a2 = this.b.a;
        }
        final x a3 = a.a(a2);
        int b2;
        if (b) {
            b2 = 0;
        }
        else {
            b2 = this.b.b;
        }
        final x b3 = a3.b(b2);
        int c = 0;
        if (!b) {
            c = this.b.c;
        }
        return b3.c(c);
    }
}
