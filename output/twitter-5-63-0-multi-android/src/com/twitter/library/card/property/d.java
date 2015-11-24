// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.net.MalformedURLException;
import com.twitter.library.card.CardDebugLog;
import com.twitter.library.card.k;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

public class d
{
    private boolean a;
    private ImageSpec b;
    
    public ImageSpec a() {
        return this.b;
    }
    
    public boolean a(final JsonParser jsonParser) {
        String g = null;
        this.a = true;
        this.b = new ImageSpec();
        this.b.url = null;
        this.b.size = Vector2F.b();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (e.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("url".equalsIgnoreCase(g)) {
                        try {
                            this.b.url = k.a(jsonParser.g());
                        }
                        catch (MalformedURLException ex) {
                            this.a = false;
                            CardDebugLog.d("Malformed URL", ex.getMessage());
                        }
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    final float a = k.a(jsonParser.j());
                    if ("width".equalsIgnoreCase(g)) {
                        this.b.size.x = a;
                        break;
                    }
                    if ("height".equalsIgnoreCase(g)) {
                        this.b.size.y = a;
                        break;
                    }
                    break;
                }
                case 6: {
                    g = jsonParser.g();
                    break;
                }
            }
        }
        if (this.b.url == null || Float.isNaN(this.b.size.x) || Float.isNaN(this.b.size.y)) {
            this.a = false;
        }
        return this.a;
    }
}
