import java.io.InputStream;
import java.io.ByteArrayInputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class f
{
    private static final String[] z;
    g a;
    String b;
    
    static {
        final String[] z2 = new String[17];
        String s = "?}g";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '6';
                        break;
                    }
                    case 0: {
                        c2 = '\f';
                        break;
                    }
                    case 1: {
                        c2 = 'S';
                        break;
                    }
                    case 2: {
                        c2 = 'W';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "z06`R>}f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "z06`R>}f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ">}f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "z06`R>}f";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "z06`R?}g";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "z06`R>}f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "z06`R?}g";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0006\u0005\u0012@eE\u001c\u0019(";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Y\u0000zSeO\u001a\u001e";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0001Y";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0001Y";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    s = "\u0001Y";
                    n = 11;
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    array = z2;
                    s = "\u0001Y";
                    n = 12;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "z06`R>}f";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "|2%aS,56{Zi7y:Sz692C\u007f6w!\u0018<s'sD\u007f6%;";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "z06`R?}g";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    break Label_0457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public f() {
        this.a = null;
        this.b = null;
    }
    
    private void a(final String b) {
        this.b = b;
    }
    
    private String b(final String s) {
        final boolean b = o.b;
        this.c(s);
        final String[] split = s.replaceAll(f.z[13], "\n").split("\n");
        final StringBuilder sb = new StringBuilder("");
        int i = 0;
        while (i < split.length) {
            Label_0163: {
                if (split[i].indexOf(":") < 0) {
                    if (split[i].length() == 0 && i + 1 < split.length && split[i + 1].indexOf(":") > 0) {
                        sb.append(split[i]).append(f.z[10]);
                        if (!b) {
                            break Label_0163;
                        }
                    }
                    sb.append(" ").append(split[i]).append(f.z[12]);
                    if (!b) {
                        break Label_0163;
                    }
                }
                sb.append(split[i]).append(f.z[11]);
            }
            ++i;
            if (b) {
                break;
            }
        }
        return sb.toString();
    }
    
    private void c(final String s) {
        final boolean b = o.b;
        Label_0118: {
            if (this.b == null) {
                final int index = s.indexOf(f.z[8]);
                if (index == -1) {
                    this.b = f.z[6];
                    if (!b) {
                        break Label_0118;
                    }
                }
                final String substring = s.substring(index, s.indexOf("\n", index + 1));
                if (substring.indexOf(f.z[3]) > 0) {
                    this.b = f.z[2];
                    if (!b) {
                        break Label_0118;
                    }
                }
                if (substring.indexOf(f.z[0]) > 0) {
                    this.b = f.z[5];
                    if (!b) {
                        break Label_0118;
                    }
                }
                this.b = f.z[4];
            }
        }
        if (this.b.equals(f.z[1])) {
            this.a = new g();
        }
        if (this.b.equals(f.z[7])) {
            this.a = new h();
        }
    }
    
    public boolean a(final String s, final j j) {
        return this.a(s, f.z[9], j);
    }
    
    public boolean a(final String s, final String s2, final j j) {
        final String b = this.b(s);
        if (this.a.a(new ByteArrayInputStream(b.getBytes(s2)), s2, j)) {
            return true;
        }
        if (this.b.equals(f.z[14])) {
            this.a(f.z[16]);
            return this.a(b, j);
        }
        throw new a(f.z[15]);
    }
}
