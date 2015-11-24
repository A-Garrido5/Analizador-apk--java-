// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.instance;

import java.net.MalformedURLException;
import com.twitter.library.card.CardDebugLog;
import com.twitter.library.card.k;
import com.twitter.library.api.bh;
import com.twitter.library.api.TwitterUser;
import java.util.HashMap;
import com.twitter.errorreporter.a;
import com.fasterxml.jackson.core.JsonToken;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonParser;

public class c
{
    private boolean a;
    private JsonParser b;
    private CardInstanceData c;
    
    private boolean a(final CardInstanceData cardInstanceData) {
        return !TextUtils.isEmpty((CharSequence)cardInstanceData.name) || !TextUtils.isEmpty((CharSequence)cardInstanceData.forwardName);
    }
    
    private f b() {
        String g = null;
        final f f = new f(null);
        for (JsonToken jsonToken = this.b.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = this.b.a()) {
            switch (d.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("platform".equalsIgnoreCase(g)) {
                        f.a = this.c();
                        break;
                    }
                    this.b.c();
                    break;
                }
                case 2: {
                    this.b.c();
                    break;
                }
                case 4: {
                    g = this.b.g();
                    break;
                }
            }
        }
        return f;
    }
    
    private h c() {
        String g = null;
        final h h = new h(null);
        for (JsonToken jsonToken = this.b.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = this.b.a()) {
            switch (d.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("audience".equalsIgnoreCase(g)) {
                        h.a = this.d();
                        break;
                    }
                    this.b.c();
                    break;
                }
                case 2: {
                    this.b.c();
                    break;
                }
                case 4: {
                    g = this.b.g();
                    break;
                }
            }
        }
        return h;
    }
    
    private e d() {
        String g = null;
        final e e = new e(null);
        for (JsonToken jsonToken = this.b.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = this.b.a()) {
            switch (d.a[jsonToken.ordinal()]) {
                case 1: {
                    this.b.c();
                    break;
                }
                case 2: {
                    this.b.c();
                    break;
                }
                case 3: {
                    if ("name".equalsIgnoreCase(g)) {
                        e.a = this.b.g();
                        break;
                    }
                    if ("bucket".equalsIgnoreCase(g)) {
                        e.b = this.b.g();
                        break;
                    }
                    break;
                }
                case 4: {
                    g = this.b.g();
                    break;
                }
            }
        }
        return e;
    }
    
    public CardInstanceData a() {
        return this.c;
    }
    
    protected HashMap a(final a a) {
        final HashMap<String, TwitterUser> hashMap = new HashMap<String, TwitterUser>();
        JsonToken jsonToken = this.b.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (d.a[jsonToken.ordinal()]) {
                case 1: {
                    final TwitterUser a2 = bh.a(this.b, true, a);
                    if (a2 != null) {
                        hashMap.put(g, a2);
                        break;
                    }
                    break;
                }
                case 2: {
                    this.b.c();
                    break;
                }
                case 4: {
                    g = this.b.g();
                    break;
                }
            }
            jsonToken = this.b.a();
        }
        return hashMap;
    }
    
    public boolean a(final JsonParser b, final a a) {
        boolean b2 = true;
        this.a = b2;
        this.b = b;
        this.c = new CardInstanceData();
        JsonToken jsonToken = this.b.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (d.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("binding_values".equalsIgnoreCase(g)) {
                        final com.twitter.library.card.instance.a a2 = new com.twitter.library.card.instance.a();
                        if (a2.a(this.b)) {
                            this.c.a(a2.b());
                        }
                        this.a = (this.a && a2.a() && b2);
                        break;
                    }
                    if ("users".equalsIgnoreCase(g)) {
                        this.c.users = this.a(a);
                        break;
                    }
                    if ("forward_card".equalsIgnoreCase(g)) {
                        final g b3 = this.b(a);
                        this.c.forwardName = b3.a;
                        this.c.forwardCardTypeURL = b3.b;
                        this.c.b(b3.c);
                        this.c.forwardUsers = b3.d;
                        if (b3.e == null) {
                            break;
                        }
                        final f e = b3.e;
                        if (e.a == null) {
                            break;
                        }
                        final h a3 = e.a;
                        if (a3.a != null) {
                            this.c.forwardAudienceName = a3.a.a;
                            this.c.forwardAudienceBucket = a3.a.b;
                            break;
                        }
                        break;
                    }
                    else {
                        if (!"card_platform".equalsIgnoreCase(g)) {
                            this.b.c();
                            break;
                        }
                        final f b4 = this.b();
                        if (b4 == null) {
                            break;
                        }
                        final h a4 = b4.a;
                        if (a4 != null && a4.a != null) {
                            this.c.audienceName = a4.a.a;
                            this.c.audienceBucket = a4.a.b;
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    this.b.c();
                    break;
                }
                case 3: {
                    if ("name".equalsIgnoreCase(g)) {
                        this.c.name = this.b.g();
                        break;
                    }
                    Label_0510: {
                        try {
                            if (!"url".equalsIgnoreCase(g)) {
                                break Label_0510;
                            }
                            this.c.url = k.a(this.b.g());
                        }
                        catch (MalformedURLException ex) {
                            this.a = false;
                            CardDebugLog.d("Malformed URL", ex.getMessage());
                        }
                        break;
                    }
                    if ("card_type_url".equalsIgnoreCase(g)) {
                        this.c.cardTypeURL = k.a(this.b.g());
                        break;
                    }
                    break;
                }
                case 4: {
                    g = this.b.g();
                    break;
                }
            }
            jsonToken = this.b.a();
        }
        if (!this.a || !this.a(this.c)) {
            b2 = false;
        }
        return this.a = b2;
    }
    
    protected g b(final a a) {
        String g = null;
        final g g2 = new g(null);
        for (JsonToken jsonToken = this.b.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = this.b.a()) {
            switch (d.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("binding_values".equalsIgnoreCase(g)) {
                        final com.twitter.library.card.instance.a a2 = new com.twitter.library.card.instance.a();
                        if (a2.a(this.b)) {
                            g2.c = a2.b();
                        }
                        this.a = (this.a && a2.a());
                        break;
                    }
                    if ("users".equalsIgnoreCase(g)) {
                        g2.d = this.a(a);
                        break;
                    }
                    if ("card_platform".equalsIgnoreCase(g)) {
                        g2.e = this.b();
                        break;
                    }
                    this.b.c();
                    break;
                }
                case 2: {
                    this.b.c();
                    break;
                }
                case 3: {
                    if ("name".equalsIgnoreCase(g)) {
                        g2.a = this.b.g();
                        break;
                    }
                    if ("card_type_url".equalsIgnoreCase(g)) {
                        try {
                            g2.b = k.a(this.b.g());
                        }
                        catch (MalformedURLException ex) {
                            CardDebugLog.d("Malformed URL", ex.getMessage());
                        }
                        break;
                    }
                    break;
                }
                case 4: {
                    g = this.b.g();
                    break;
                }
            }
        }
        return g2;
    }
}
