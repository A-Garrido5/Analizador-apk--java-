import com.fasterxml.jackson.core.io.g;
import java.io.InputStreamReader;
import com.fasterxml.jackson.core.io.d;
import java.io.ByteArrayInputStream;
import java.io.Reader;
import com.fasterxml.jackson.core.JsonFactory$Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonEncoding;
import java.io.CharConversionException;
import java.io.InputStream;
import com.fasterxml.jackson.core.io.b;

// 
// Decompiled by Procyon v0.5.30
// 

public final class k
{
    protected final b a;
    protected final InputStream b;
    protected final byte[] c;
    protected int d;
    protected boolean e;
    protected int f;
    private int g;
    private int h;
    private final boolean i;
    
    public k(final b a, final InputStream b) {
        this.e = true;
        this.f = 0;
        this.a = a;
        this.b = b;
        this.c = a.e();
        this.g = 0;
        this.h = 0;
        this.d = 0;
        this.i = true;
    }
    
    public k(final b a, final byte[] c, final int g, final int n) {
        this.e = true;
        this.f = 0;
        this.a = a;
        this.b = null;
        this.c = c;
        this.g = g;
        this.h = g + n;
        this.d = -g;
        this.i = false;
    }
    
    private void a(final String s) {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + s + ") detected");
    }
    
    private boolean b(final int n) {
        switch (n) {
            case 65279: {
                this.e = true;
                this.g += 4;
                this.f = 4;
                return true;
            }
            case -131072: {
                this.g += 4;
                this.f = 4;
                this.e = false;
                return true;
            }
            case 65534: {
                this.a("2143");
            }
            case -16842752: {
                this.a("3412");
                break;
            }
        }
        final int n2 = n >>> 16;
        if (n2 == 65279) {
            this.g += 2;
            this.f = 2;
            return this.e = true;
        }
        if (n2 == 65534) {
            this.g += 2;
            this.f = 2;
            this.e = false;
            return true;
        }
        if (n >>> 8 == 15711167) {
            this.g += 3;
            this.f = 1;
            return this.e = true;
        }
        return false;
    }
    
    private boolean c(final int n) {
        if (n >> 8 == 0) {
            this.e = true;
        }
        else if ((0xFFFFFF & n) == 0x0) {
            this.e = false;
        }
        else if ((0xFF00FFFF & n) == 0x0) {
            this.a("3412");
        }
        else {
            final int n2 = 0xFFFF00FF & n;
            final boolean b = false;
            if (n2 != 0) {
                return b;
            }
            this.a("2143");
        }
        this.f = 4;
        return true;
    }
    
    private boolean d(final int n) {
        if ((0xFF00 & n) == 0x0) {
            this.e = true;
        }
        else {
            final int n2 = n & 0xFF;
            final boolean b = false;
            if (n2 != 0) {
                return b;
            }
            this.e = false;
        }
        this.f = 2;
        return true;
    }
    
    public JsonEncoding a() {
        int n = 1;
        while (true) {
            Label_0122: {
                if (this.a(4)) {
                    final int n2 = this.c[this.g] << 24 | (0xFF & this.c[1 + this.g]) << 16 | (0xFF & this.c[2 + this.g]) << 8 | (0xFF & this.c[3 + this.g]);
                    if (!this.b(n2) && !this.c(n2) && !this.d(n2 >>> 16)) {
                        break Label_0122;
                    }
                }
                else if (!this.a(2) || !this.d((0xFF & this.c[this.g]) << 8 | (0xFF & this.c[1 + this.g]))) {
                    break Label_0122;
                }
                JsonEncoding jsonEncoding = null;
                if (n == 0) {
                    jsonEncoding = JsonEncoding.a;
                }
                else {
                    switch (this.f) {
                        default: {
                            throw new RuntimeException("Internal error");
                        }
                        case 1: {
                            jsonEncoding = JsonEncoding.a;
                            break;
                        }
                        case 2: {
                            if (this.e) {
                                jsonEncoding = JsonEncoding.b;
                                break;
                            }
                            jsonEncoding = JsonEncoding.c;
                            break;
                        }
                        case 4: {
                            if (this.e) {
                                jsonEncoding = JsonEncoding.d;
                                break;
                            }
                            jsonEncoding = JsonEncoding.e;
                            break;
                        }
                    }
                }
                this.a.a(jsonEncoding);
                return jsonEncoding;
            }
            n = 0;
            continue;
        }
    }
    
    public JsonParser a(final int n, final com.fasterxml.jackson.core.b b, final t t, final w w, final int n2) {
        if (this.a() == JsonEncoding.a && JsonFactory$Feature.b.a(n2)) {
            return new r(this.a, n, this.b, b, t.b(n2), this.c, this.g, this.h, this.i);
        }
        return new p(this.a, n, this.b(), b, w.b(n2));
    }
    
    protected boolean a(final int n) {
        int n2 = 1;
        int read;
        for (int i = this.h - this.g; i < n; i += read) {
            if (this.b == null) {
                read = -1;
            }
            else {
                read = this.b.read(this.c, this.h, this.c.length - this.h);
            }
            if (read < n2) {
                n2 = 0;
                break;
            }
            this.h += read;
        }
        return n2 != 0;
    }
    
    public Reader b() {
        final JsonEncoding b = this.a.b();
        switch (b.c()) {
            default: {
                throw new RuntimeException("Internal error");
            }
            case 8:
            case 16: {
                final InputStream b2 = this.b;
                InputStream inputStream;
                if (b2 == null) {
                    inputStream = new ByteArrayInputStream(this.c, this.g, this.h);
                }
                else if (this.g < this.h) {
                    inputStream = new d(this.a, b2, this.c, this.g, this.h);
                }
                else {
                    inputStream = b2;
                }
                return new InputStreamReader(inputStream, b.a());
            }
            case 32: {
                return new g(this.a, this.b, this.c, this.g, this.h, this.a.b().b());
            }
        }
    }
}
