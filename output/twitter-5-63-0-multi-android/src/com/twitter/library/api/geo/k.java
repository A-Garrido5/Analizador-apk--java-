// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import com.twitter.library.api.bh;
import java.util.ArrayList;
import com.twitter.model.json.geo.JsonTwitterPlace;
import com.fasterxml.jackson.core.JsonToken;
import java.util.List;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ad;

public class k extends ad
{
    static List c(final JsonParser jsonParser) {
        Object o = null;
        JsonToken jsonToken = jsonParser.a();
        List c = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 3: {
                    if ("result".equals(o)) {
                        while (jsonToken != null && jsonToken != JsonToken.c) {
                            switch (l.a[jsonToken.ordinal()]) {
                                case 1: {
                                    if ("places".equals(o)) {
                                        c = wx.c(jsonParser, JsonTwitterPlace.class);
                                        break;
                                    }
                                    jsonParser.c();
                                    break;
                                }
                                case 2: {
                                    o = jsonParser.g();
                                    break;
                                }
                            }
                            jsonToken = jsonParser.a();
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    o = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return com.twitter.util.k.a(c);
    }
    
    protected com.twitter.library.api.geo.j b(final JsonParser jsonParser) {
        return new com.twitter.library.api.geo.j(c(jsonParser));
    }
    
    protected ArrayList b(final JsonParser jsonParser, final int n) {
        return bh.G(jsonParser);
    }
}
