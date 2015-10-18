import com.whatsapp.DialogToastActivity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.30
// 

public class q
{
    public static boolean c;
    private static final String[] z;
    public byte[] a;
    public Set b;
    public String d;
    public Set e;
    public String f;
    public ContentValues g;
    public List h;
    
    static {
        final String[] z2 = new String[7];
        String s = "c.\u0015=\u001c.c(=\u001eu.";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'n';
                        break;
                    }
                    case 0: {
                        c2 = 'O';
                        break;
                    }
                    case 1: {
                        c2 = '\u000e';
                        break;
                    }
                    case 2: {
                        c2 = 'e';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "c.\u0015.\u0001?X\u00040\u001b*4E";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "?|\n, .c\u0000fN";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "c.\u0015.\u0001?X\u00040\u001b*Q\u0007%\u001a*}E/\u00075k_|";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "c.\u0015.\u0001?I\u00173\u001b?]\u0000(To";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "c.\u0015.\u0001?c(=\u001e\u0010Z<\f+u.";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "c.\u0015.\u0001?X\u00040\u001b*Q\u00139\r;a\u0017|\u001d&t\u0000fN";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public q() {
        this.d = "";
        this.f = "";
        this.h = new ArrayList();
        this.g = new ContentValues();
        this.b = new HashSet();
        this.e = new HashSet();
    }
    
    public void a(final String s) {
        this.b.add(s.toUpperCase());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof q) {
            final q q = (q)o;
            if (this.d != null && this.d.equals(q.d) && this.g.equals((Object)q.g) && this.b.equals(q.b) && this.e.equals(q.e)) {
                if (this.a != null && Arrays.equals(this.a, q.a)) {
                    return true;
                }
                if (this.f.equals(q.f) && (this.h.equals(q.h) || this.h.size() == 1 || q.h.size() == 1)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final boolean c = q.c;
        final StringBuilder sb = new StringBuilder();
        sb.append(q.z[2]);
        sb.append(this.d);
        sb.append(q.z[0]);
        sb.append(this.g.toString());
        sb.append(q.z[5]);
        sb.append(this.b.toString());
        sb.append(q.z[4]);
        sb.append(this.e.toString());
        if (this.h != null && this.h.size() > 1) {
            sb.append(q.z[6]);
            sb.append(this.h.size());
        }
        if (this.a != null) {
            sb.append(q.z[3]);
            sb.append(this.a.length);
        }
        sb.append(q.z[1]);
        sb.append(this.f);
        final String string = sb.toString();
        if (c) {
            final boolean h = DialogToastActivity.h;
            boolean h2 = false;
            if (!h) {
                h2 = true;
            }
            DialogToastActivity.h = h2;
        }
        return string;
    }
}
