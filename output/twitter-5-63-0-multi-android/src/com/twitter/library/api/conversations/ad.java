// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

public class ad
{
    public final boolean a;
    public final boolean b;
    public final int c;
    
    protected ad(final boolean a, final boolean b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected static ad a(final JsonParser jsonParser) {
        boolean l = false;
        JsonToken jsonToken = jsonParser.a();
        int h = -1;
        boolean i = false;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (ae.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    final String e = jsonParser.e();
                    if ("can_dm".equals(e)) {
                        l = jsonParser.l();
                        break;
                    }
                    if ("full_permission".equals(e)) {
                        i = jsonParser.l();
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("error_code".equals(jsonParser.e())) {
                        h = jsonParser.h();
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new ad(l, i, h);
    }
}
