// 
// Decompiled by Procyon v0.5.30
// 

public class l
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    
    public static String a(final String s) {
        final boolean b = o.b;
        final StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            Label_0104: {
                if (char1 == '\\' && i < -3 + s.length()) {
                    if (s.charAt(i + 1) != 'r' || s.charAt(i + 2) != '\\' || s.charAt(i + 3) != 'n') {
                        break Label_0104;
                    }
                    sb.append('\n');
                    i += 3;
                    if (!b) {
                        break Label_0104;
                    }
                }
                sb.append(char1);
            }
            ++i;
            if (b) {
                break;
            }
        }
        return sb.toString();
    }
    
    public String a() {
        final StringBuilder sb = new StringBuilder();
        if (this.a != null && this.a.length() > 0) {
            sb.append(a(this.a)).append('\n');
        }
        final String f = this.f;
        int n = 0;
        if (f != null) {
            final int length = this.f.length();
            n = 0;
            if (length > 0) {
                sb.append(this.f);
                n = 1;
            }
        }
        if (this.d != null && this.d.length() > 0) {
            if (n != 0) {
                sb.append(" ");
            }
            sb.append(this.d);
            n = 1;
        }
        if (this.e != null && this.e.length() > 0) {
            if (n != 0) {
                sb.append(" ");
            }
            sb.append(this.e);
            n = 1;
        }
        if (this.b != null && this.b.length() > 0) {
            if (n != 0) {
                sb.append(" ");
            }
            sb.append(this.b);
        }
        return sb.toString();
    }
    
    public String b() {
        final StringBuilder sb = new StringBuilder();
        if (this.a != null) {
            sb.append(this.a);
        }
        sb.append(";");
        if (this.f != null) {
            sb.append(this.f);
        }
        sb.append(";");
        if (this.d != null) {
            sb.append(this.d);
        }
        sb.append(";");
        if (this.e != null) {
            sb.append(this.e);
        }
        sb.append(";");
        if (this.b != null) {
            sb.append(this.b);
        }
        return sb.toString();
    }
    
    public String c() {
        return a(this.a);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(a(this.a)).append(" ").append(this.f).append(" ").append(this.d).append(" ").append(this.e).append(" ").append(this.b);
        return sb.toString();
    }
}
