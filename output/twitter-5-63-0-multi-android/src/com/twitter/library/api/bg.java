// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.internal.network.l;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.errorreporter.a;
import java.io.Closeable;
import com.twitter.model.json.profiles.JsonExtendedProfile;
import com.twitter.library.api.conversations.b;
import com.twitter.internal.network.q;
import java.io.OutputStream;
import com.twitter.internal.network.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.twitter.library.network.t;
import com.twitter.library.network.OAuthToken;
import java.io.ByteArrayOutputStream;
import com.twitter.library.service.d;

public class bg extends d
{
    private final int a;
    private final TwitterUser b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private Object f;
    private boolean g;
    
    private bg(final TwitterUser b, final boolean c, final boolean d, final int a, final int e) {
        this.g = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
    }
    
    public static bg a(final int n) {
        return new bg(null, false, false, n, 0);
    }
    
    public static bg a(final int n, final TwitterUser twitterUser) {
        return new bg(twitterUser, false, false, n, 0);
    }
    
    public static bg a(final TwitterUser twitterUser, final boolean b, final boolean b2) {
        return new bg(twitterUser, b, b2, 1, 0);
    }
    
    public static bg a(final boolean b, final int n) {
        int n2;
        if (b) {
            n2 = 8;
        }
        else {
            n2 = 20;
        }
        return new bg(null, false, false, n2, n);
    }
    
    private OAuthToken a(final ByteArrayOutputStream byteArrayOutputStream) {
        final List a = t.a(new String(byteArrayOutputStream.toByteArray()), true);
        return new OAuthToken(t.a(a, "oauth_token"), t.a(a, "oauth_token_secret"));
    }
    
    public Object a() {
        return this.f;
    }
    
    @Override
    public void a(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        if (s == null) {
            return;
        }
        if (this.a == 82) {
            if (n >= 200 && n < 300) {
                this.f = "";
                return;
            }
            this.f = bh.G(bh.a(inputStream));
        }
        else {
            if (!s.startsWith("application/json") && this.a != 34 && this.a != 45 && this.a != 36) {
                throw new IOException("Reader could not validate. content-type=[" + s + "], or encoding=[" + s2 + "]");
            }
            JsonParser jsonParser2 = null;
            if (n == 200) {
                final a d = this.d();
                JsonParser jsonParser = null;
                switch (this.a) {
                    default: {
                        jsonParser = null;
                        break;
                    }
                    case 1: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.a(jsonParser, d, this.b, this.c, this.d);
                        break;
                    }
                    case 2: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.b(jsonParser, true, d);
                        break;
                    }
                    case 37: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.a(jsonParser, true);
                        break;
                    }
                    case 38: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.c(jsonParser, true, d);
                        break;
                    }
                    case 3: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.d(jsonParser, d);
                        break;
                    }
                    case 4: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.t(jsonParser);
                        break;
                    }
                    case 5: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.g(jsonParser, d);
                        break;
                    }
                    case 89: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.h(jsonParser, d);
                        break;
                    }
                    case 96: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.v(jsonParser);
                        break;
                    }
                    case 7: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.q(jsonParser, d);
                        break;
                    }
                    case 8: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.b(jsonParser, this.e, d);
                        break;
                    }
                    case 9: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.w(jsonParser);
                        break;
                    }
                    case 10: {
                        jsonParser = bh.a(inputStream);
                        this.f = UserSettings.a(jsonParser);
                        break;
                    }
                    case 11: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.u(jsonParser);
                        break;
                    }
                    case 13: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.C(jsonParser);
                        break;
                    }
                    case 14: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.F(jsonParser);
                        break;
                    }
                    case 15: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.J(jsonParser);
                        break;
                    }
                    case 16: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.H(jsonParser);
                        break;
                    }
                    case 39: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.I(jsonParser);
                        break;
                    }
                    case 17:
                    case 60: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.a(jsonParser, true, d);
                        break;
                    }
                    case 18: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.l(jsonParser);
                        break;
                    }
                    case 19: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.j(jsonParser);
                        break;
                    }
                    case 20: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.a(jsonParser, this.e, d);
                        break;
                    }
                    case 21: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.a(jsonParser, d);
                        break;
                    }
                    case 22: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.b(jsonParser, d);
                        break;
                    }
                    case 57: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.b(jsonParser, d, this.b);
                        break;
                    }
                    case 63: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.s(jsonParser, d);
                        break;
                    }
                    case 66: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.t(jsonParser, d);
                        break;
                    }
                    case 67: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.a(jsonParser, d, this.b);
                        break;
                    }
                    case 24: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.a(jsonParser, this.b, d);
                        break;
                    }
                    case 91: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.s(jsonParser);
                        break;
                    }
                    case 93: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.p(jsonParser);
                        break;
                    }
                    case 94: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.q(jsonParser);
                        break;
                    }
                    case 27: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.i(jsonParser, d);
                        break;
                    }
                    case 28: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.n(jsonParser, d);
                        break;
                    }
                    case 29: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.E(jsonParser);
                        break;
                    }
                    case 30: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.o(jsonParser);
                        break;
                    }
                    case 55: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.g(jsonParser);
                        break;
                    }
                    case 33: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.h(jsonParser);
                        break;
                    }
                    case 34: {
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                        new c(byteArrayOutputStream, null).a(n, inputStream, n2, s, s2);
                        this.f = this.a(byteArrayOutputStream);
                        jsonParser = null;
                        break;
                    }
                    case 35: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.c(jsonParser, d);
                        break;
                    }
                    case 42: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.d(jsonParser);
                        break;
                    }
                    case 46: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.b(jsonParser);
                        break;
                    }
                    case 80: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.e(jsonParser);
                        break;
                    }
                    case 51: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.f(jsonParser);
                        break;
                    }
                    case 36: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.L(jsonParser);
                        break;
                    }
                    case 40: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.M(jsonParser);
                        break;
                    }
                    case 41: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.y(jsonParser);
                        break;
                    }
                    case 44: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.a(jsonParser, d, this.b);
                        break;
                    }
                    case 45: {
                        final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        new c(byteArrayOutputStream2, null).a(n, inputStream, n2, s, s2);
                        this.f = bh.d(byteArrayOutputStream2.toString());
                        jsonParser = null;
                        break;
                    }
                    case 48: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.n(jsonParser);
                        break;
                    }
                    case 76: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.m(jsonParser);
                        break;
                    }
                    case 50: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.u(jsonParser, d);
                        break;
                    }
                    case 52: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.U(jsonParser);
                        break;
                    }
                    case 53: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.Y(jsonParser);
                        break;
                    }
                    case 54: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.Z(jsonParser);
                        break;
                    }
                    case 56: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.e(jsonParser, d);
                        break;
                    }
                    case 58: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.ab(jsonParser);
                        break;
                    }
                    case 59: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.m(jsonParser, d);
                        break;
                    }
                    case 70:
                    case 71:
                    case 72:
                    case 75:
                    case 77: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.A(jsonParser);
                        break;
                    }
                    case 73: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.B(jsonParser);
                        break;
                    }
                    case 86: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.ac(jsonParser);
                        break;
                    }
                    case 87: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.ad(jsonParser);
                        break;
                    }
                    case 79: {
                        jsonParser = bh.a(inputStream);
                        this.f = com.twitter.library.api.conversations.b.a(jsonParser);
                        break;
                    }
                    case 85: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.O(jsonParser);
                        break;
                    }
                    case 88: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.P(jsonParser);
                        break;
                    }
                    case 90: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.af(jsonParser);
                        break;
                    }
                    case 92: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.Q(jsonParser);
                        break;
                    }
                    case 95: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.r(jsonParser);
                        break;
                    }
                    case 97: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.ae(jsonParser);
                        break;
                    }
                    case 98: {
                        jsonParser = bh.a(inputStream);
                        this.f = uu.a(jsonParser, d);
                        break;
                    }
                    case 102: {
                        jsonParser = bh.a(inputStream);
                        this.f = uu.b(jsonParser, d);
                        break;
                    }
                    case 99: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.v(jsonParser, d);
                        break;
                    }
                    case 100: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.w(jsonParser, d);
                        break;
                    }
                    case 101: {
                        jsonParser = bh.a(inputStream);
                        this.f = bh.x(jsonParser, this.d());
                        break;
                    }
                    case 103: {
                        jsonParser = bh.a(inputStream);
                        this.f = wx.b(jsonParser, JsonExtendedProfile.class);
                        break;
                    }
                }
                jsonParser2 = jsonParser;
            }
            else {
                switch (this.a) {
                    default: {
                        jsonParser2 = bh.a(inputStream);
                        this.f = bh.G(jsonParser2);
                        this.g = true;
                        break;
                    }
                    case 34: {
                        jsonParser2 = bh.a(inputStream);
                        this.f = bh.K(jsonParser2);
                        break;
                    }
                    case 60: {
                        jsonParser2 = bh.a(inputStream);
                        final ArrayList g = bh.G(jsonParser2);
                        if (n == 403 && g != null && ((bd)g.get(0)).a == 85) {
                            this.f = bh.a(g);
                            break;
                        }
                        this.f = g;
                        this.g = true;
                        break;
                    }
                    case 49: {
                        jsonParser2 = bh.a(inputStream);
                        this.f = bh.x(jsonParser2);
                        break;
                    }
                    case 55: {
                        jsonParser2 = null;
                        if (n < 200) {
                            break;
                        }
                        jsonParser2 = null;
                        if (n < 300) {
                            jsonParser2 = bh.a(inputStream);
                            this.f = bh.g(jsonParser2);
                            break;
                        }
                        break;
                    }
                }
            }
            yh.a(jsonParser2);
        }
    }
    
    @Override
    public void a(final l l) {
        if (this.g) {
            final ArrayList list = (ArrayList)this.f;
            if (list != null && !list.isEmpty()) {
                l.j = list.get(0).a;
            }
        }
    }
    
    @Override
    public com.twitter.library.service.b ax_() {
        if (this.g) {
            return new com.twitter.library.service.b((List)this.f);
        }
        return null;
    }
}
