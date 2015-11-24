// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.instance;

import com.twitter.library.card.CardDebugLog;
import com.twitter.library.card.property.d;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonParser;

public class a
{
    private boolean a;
    private JsonParser b;
    private HashMap c;
    
    public boolean a() {
        return this.a;
    }
    
    public boolean a(final JsonParser b) {
        this.a = true;
        this.b = b;
        this.c = new HashMap();
        JsonToken jsonToken = this.b.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (b.a[jsonToken.ordinal()]) {
                case 1: {
                    final BindingValue c = this.c();
                    if (c != null) {
                        this.c.put(g, c);
                        break;
                    }
                    break;
                }
                case 2: {
                    this.b.c();
                    break;
                }
                case 3: {
                    g = this.b.g();
                    break;
                }
            }
            jsonToken = this.b.a();
        }
        return this.a;
    }
    
    public HashMap b() {
        return this.c;
    }
    
    protected BindingValue c() {
        final BindingValue bindingValue = new BindingValue();
        JsonToken jsonToken = this.b.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (com.twitter.library.card.instance.b.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("image_value".equalsIgnoreCase(g)) {
                        final d d = new d();
                        if (d.a(this.b)) {
                            bindingValue.value = d.a();
                            break;
                        }
                        CardDebugLog.d("invalid image spec", null);
                        this.a = false;
                        break;
                    }
                    else {
                        if ("user_value".equalsIgnoreCase(g)) {
                            bindingValue.value = this.d();
                            break;
                        }
                        this.b.c();
                        break;
                    }
                    break;
                }
                case 2: {
                    this.b.c();
                    break;
                }
                case 4: {
                    if ("string_value".equalsIgnoreCase(g)) {
                        bindingValue.value = this.b.g();
                        break;
                    }
                    if ("scribe_key".equalsIgnoreCase(g)) {
                        bindingValue.scribeKey = this.b.g();
                        break;
                    }
                    break;
                }
                case 5:
                case 6: {
                    if ("boolean_value".equalsIgnoreCase(g)) {
                        bindingValue.value = this.b.l();
                        break;
                    }
                    break;
                }
                case 3: {
                    g = this.b.g();
                    break;
                }
            }
            jsonToken = this.b.a();
        }
        if (bindingValue.value == null) {
            this.a = false;
        }
        return bindingValue;
    }
    
    protected UserValue d() {
        final UserValue userValue = new UserValue();
        JsonToken jsonToken = this.b.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (com.twitter.library.card.instance.b.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    this.b.c();
                    break;
                }
                case 4: {
                    if ("id_str".equalsIgnoreCase(g)) {
                        userValue.id = this.b.g();
                        break;
                    }
                    break;
                }
                case 3: {
                    g = this.b.g();
                    break;
                }
            }
            jsonToken = this.b.a();
        }
        return userValue;
    }
}
