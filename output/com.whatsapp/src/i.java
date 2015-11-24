import com.whatsapp.DialogToastActivity;
import android.provider.ContactsContract$CommonDataKinds$Phone;
import android.backport.util.Base64;
import com.whatsapp.util.Log;
import java.util.Iterator;
import android.provider.ContactsContract$CommonDataKinds$StructuredPostal;
import android.provider.ContactsContract$CommonDataKinds$Email;
import java.util.List;
import android.content.Context;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.5.30
// 

public class i
{
    private static final HashSet b;
    private static final HashSet d;
    private static final String[] z;
    private StringBuilder a;
    private String c;
    private int e;
    
    static {
        final String[] z2 = new String[81];
        String s = "7s]\u0005\\\\yS\u0002VQ\u000f(";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_2057:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = 'g';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = '\u0012';
                        break;
                    }
                    case 3: {
                        c2 = 'Q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0013Bb4.";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0013Bb4./t_\u0014";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "I~_\u0010Z+\u0000f(c\u0002\u0006[\u001fG\"i\\\u0014G]";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000eOw<";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ".uF\u0014A)~F";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000eOw<";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0006Kb4}\u0003lS\u0014~\u0006R~\u0002g\u0015\u0001";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Ic?\u0010Q+Zp4\u007f]";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\"vS\u0018_\\oK\u0001VZ";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\"vS\u0018_\\";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "m\u001b";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "j1";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "j12";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "j1";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0011Xs#wHUs<v]";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "!u(";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = ")\u0001";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u000eOw<";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "3~^j";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "IoW\u001d)";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "3~^jg\u001eKwl";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "Ic?\u0010Q+Zp4\u007f]";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u000eOw<";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u000eOw<";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u000eOw<";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "Ic?\u0010Q&\u007f@k";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "Ic?\u0010Q&\u007f@k";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u000eOw<";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "Ic?\u0010Q+Zp4\u007f]";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "IzV\u0003)\\\u0000";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u0006Kb4}\u0003lS\u0001|\u0014Os=@\u0013I(";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u000eOw<";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "]\u0000)";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "IzV\u0003(\u0013Bb4.";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u000eOw<";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u0006Kb4}\u0003lS\u0001|\u0014Os=@\u0013I20w\u0003IM5r\u0013Z28`GuG\u001d_";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0011Xs#w\u0004T\u007f!|\u0014^`~r\u0017Kw?w\u0010Zb>`\u0013Z~\"g\u0015\u001bt0z\u000b^vq\u007f\bTy$c$Tg?g\u0015BS3q\u0015yk\u001fr\n^";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u0011Xs#w\u0004T\u007f!|\u0014^`~r\u0017Kw?w\u0010Zb>`\u0013Z~\"g\u0015\u001bt0z\u000b^vq\u007f\bTy$c$Tg?g\u0015BS3q\u0015yk\u001fr\n^";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "(iUk";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "3rF\u001dV]";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "1~@\u0002Z(u(c=V";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "?\u0016B\u0019\\)~F\u0018PJwS\u0002GJuS\u001cV]";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "?\u0016B\u0019\\)~F\u0018PJ}[\u0003@3\u0016\\\u0010^\"\u0001";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "%\u007fS\b";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "%~U\u0018]]mQ\u0010A#";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = ")rQ\u001a]&vW";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "%\u007fS\b";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = ")tF\u0014)";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = ")rQ\u001a]&vWk";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "1~@\u0002Z(u(b=W";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "GMw#`\u000eT|q}\bO2<r\u0013XzqE\"iA\u0018\\)dD\u0012R5\u007f `3\bI2\u0007V5h[\u001e]8mQ\u0010A#\b\"\u007f";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = ")rQ\u001a]&vW";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "%\u007fS\b(\u0011Z~$vZ_s%v]";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "\"uVkE$z@\u0015";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "&t^";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "!zJ";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "*tV\u0014^";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = ".hV\u001f";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "?\u000f\"a";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "1rV\u0014\\";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "7tE\u0014A4sS\u0003V";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "7i]\u0015Z b";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "7iW\u0017";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "0t@\u001a";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "1t[\u0012V";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "\"l]\u0003_#";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = ".y_\u001cR.w";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "/t_\u0014";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "*hU";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "$z@";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "%yA";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = ".uF\u0014A)~F";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "&oF\u001cR.w";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "$rA";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "3wJ";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "7zU\u0014A";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "$~^\u001d";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "*x[\u001cR.w";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "&kB\u001dV+r\\\u001a";
                    n = 78;
                    array = z2;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "$~^\u001d";
                    n = 79;
                    array = z2;
                    continue;
                }
                case 79: {
                    break Label_2057;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        d = new HashSet((Collection<? extends E>)Arrays.asList(i.z[77], i.z[55], i.z[79], i.z[73], i.z[74], i.z[66], i.z[72], i.z[67], i.z[78], i.z[61], i.z[62], i.z[75], i.z[59]));
        b = new HashSet((Collection<? extends E>)Arrays.asList(i.z[63], i.z[64], i.z[68], i.z[65], i.z[56], i.z[69], i.z[80], i.z[76], i.z[71], i.z[57], i.z[70], i.z[58], i.z[60]));
    }
    
    public i() {
        this.e = 0;
    }
    
    private String a(String s, final int n) {
        final boolean b = o.b;
        Label_0061: {
            if (s.endsWith(i.z[12])) {
                s = s.substring(0, -2 + s.length());
                if (!b) {
                    break Label_0061;
                }
            }
            if (s.endsWith("\n")) {
                s = s.substring(0, -1 + s.length());
                if (!b) {
                    break Label_0061;
                }
            }
            return null;
        }
        final String replaceAll = s.replaceAll(i.z[14], "\n");
        if (n == 1) {
            return replaceAll.replaceAll("\n", i.z[13]);
        }
        if (n == 2) {
            return replaceAll.replaceAll("\n", i.z[11]);
        }
        return null;
    }
    
    private void a(final Context context, final List list, final int n) {
        final boolean b = o.b;
        for (final m m : list) {
            Label_0076: {
                if (m.b == ContactsContract$CommonDataKinds$Email.class) {
                    this.a(context, m, n);
                    if (!b) {
                        break Label_0076;
                    }
                }
                if (m.b == ContactsContract$CommonDataKinds$StructuredPostal.class) {
                    this.b(context, m, n);
                }
            }
            if (b) {
                break;
            }
        }
    }
    
    private void a(final Context context, final m m, final int n) {
        final boolean b = o.b;
        final String s = i.z[5];
        if (!this.a(m.e)) {
            if (m.f == 0) {
                Log.v(i.z[7] + m);
                ++this.e;
                this.a.append(i.z[4]).append(this.e).append(i.z[3]).append(m.e).append(this.c);
                this.a.append(i.z[6]).append(this.e).append(i.z[8]).append(m.c).append(this.c);
                if (!b) {
                    return;
                }
            }
            final String string = context.getString(ContactsContract$CommonDataKinds$Email.getTypeLabelResource(m.f));
            Label_0207: {
                if (n == 1) {
                    this.a.append(i.z[10]);
                    if (!b) {
                        break Label_0207;
                    }
                }
                this.a.append(i.z[9]);
            }
            this.a.append(string).append(":").append(m.e).append(this.c);
        }
    }
    
    private void a(final k k) {
        final boolean b = o.b;
        Log.v(i.z[15] + k);
        this.a.append(i.z[17]);
        Label_0084: {
            if (k.h != null) {
                this.a.append(k.h).append(";");
                if (!b) {
                    break Label_0084;
                }
            }
            this.a.append(";");
        }
        Label_0124: {
            if (k.d != null) {
                this.a.append(k.d).append(";");
                if (!b) {
                    break Label_0124;
                }
            }
            this.a.append(";");
        }
        Label_0164: {
            if (k.b != null) {
                this.a.append(k.b).append(";");
                if (!b) {
                    break Label_0164;
                }
            }
            this.a.append(";");
        }
        Label_0204: {
            if (k.g != null) {
                this.a.append(k.g).append(";");
                if (!b) {
                    break Label_0204;
                }
            }
            this.a.append(";");
        }
        if (k.c != null) {
            this.a.append(k.c);
        }
        this.a.append(this.c);
        this.a.append(i.z[16]).append(k.e).append(this.c);
    }
    
    private void a(final o o) {
        final boolean b = o.b;
        if (o.h != null) {
            for (final String s : o.h.keySet()) {
                if (o.a.containsKey(s)) {
                    final q q = o.h.get(s).get(0);
                    this.a.append(s).append(";");
                    Label_0176: {
                        if (q.b != null && q.b.size() > 0) {
                            this.a.append(i.z[1]).append(q.b.toArray()[0]).append(":");
                            if (!b) {
                                break Label_0176;
                            }
                        }
                        this.a.append(i.z[2]).append(":");
                    }
                    this.a.append(q.f).append(this.c);
                }
                if (b) {
                    break;
                }
            }
        }
    }
    
    private void a(final byte[] array, final String s, final int n) {
        this.a.append(i.z[0]).append(Base64.encodeToString(array, 2)).append(this.c);
    }
    
    private boolean a(final String s) {
        return s == null || s.trim().equals("");
    }
    
    private void b(final Context context, final List list, final int n) {
        final boolean b = o.b;
        for (final d d : list) {
            Label_0273: {
                if (!this.a(d.d)) {
                    if (d.b == 0) {
                        ++this.e;
                        this.a.append(i.z[18]).append(this.e).append(i.z[20]).append(d.d).append(this.c);
                        this.a.append(i.z[23]).append(this.e).append(i.z[22]).append(d.c).append(this.c);
                        if (!b) {
                            break Label_0273;
                        }
                    }
                    String s = context.getString(ContactsContract$CommonDataKinds$Phone.getTypeLabelResource(d.b));
                    if (n == 2 && s.indexOf(";") != -1) {
                        s = s.replace(";", ",");
                    }
                    Label_0242: {
                        if (n == 1) {
                            this.a.append(i.z[19]);
                            if (!b) {
                                break Label_0242;
                            }
                        }
                        this.a.append(i.z[21]);
                    }
                    this.a.append(s).append(":").append(d.d).append(this.c);
                }
            }
            if (b) {
                break;
            }
        }
    }
    
    private void b(final Context p0, final m p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       o.b:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: iconst_1       
        //     7: aload_0        
        //     8: getfield        i.e:I
        //    11: iadd           
        //    12: putfield        i.e:I
        //    15: aload_2        
        //    16: getfield        m.a:Ll;
        //    19: ifnull          384
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: getstatic       i.z:[Ljava/lang/String;
        //    32: bipush          31
        //    34: aaload         
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: aload_2        
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    42: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    45: invokestatic    com/whatsapp/util/Log.v:(Ljava/lang/String;)V
        //    48: aload_2        
        //    49: getfield        m.f:I
        //    52: istore          8
        //    54: iload           8
        //    56: ifne            232
        //    59: aload_0        
        //    60: getfield        i.a:Ljava/lang/StringBuilder;
        //    63: getstatic       i.z:[Ljava/lang/String;
        //    66: bipush          28
        //    68: aaload         
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: aload_0        
        //    73: getfield        i.e:I
        //    76: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    79: getstatic       i.z:[Ljava/lang/String;
        //    82: bipush          30
        //    84: aaload         
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: aload_2        
        //    89: getfield        m.a:Ll;
        //    92: invokevirtual   l.b:()Ljava/lang/String;
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: aload_0        
        //    99: getfield        i.c:Ljava/lang/String;
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload_0        
        //   107: getfield        i.a:Ljava/lang/StringBuilder;
        //   110: getstatic       i.z:[Ljava/lang/String;
        //   113: bipush          32
        //   115: aaload         
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: aload_0        
        //   120: getfield        i.e:I
        //   123: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   126: getstatic       i.z:[Ljava/lang/String;
        //   129: bipush          26
        //   131: aaload         
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: pop            
        //   136: aload_2        
        //   137: getfield        m.a:Ll;
        //   140: getfield        l.b:Ljava/lang/String;
        //   143: astore          17
        //   145: aload           17
        //   147: ifnull          171
        //   150: aload_0        
        //   151: getfield        i.a:Ljava/lang/StringBuilder;
        //   154: aload_2        
        //   155: getfield        m.a:Ll;
        //   158: getfield        l.b:Ljava/lang/String;
        //   161: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //   164: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: pop            
        //   171: aload_0        
        //   172: getfield        i.a:Ljava/lang/StringBuilder;
        //   175: aload_0        
        //   176: getfield        i.c:Ljava/lang/String;
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: pop            
        //   183: aload_0        
        //   184: getfield        i.a:Ljava/lang/StringBuilder;
        //   187: getstatic       i.z:[Ljava/lang/String;
        //   190: bipush          25
        //   192: aaload         
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: aload_0        
        //   197: getfield        i.e:I
        //   200: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   203: getstatic       i.z:[Ljava/lang/String;
        //   206: bipush          29
        //   208: aaload         
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   212: aload_2        
        //   213: getfield        m.c:Ljava/lang/String;
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: aload_0        
        //   220: getfield        i.c:Ljava/lang/String;
        //   223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   226: pop            
        //   227: iload           4
        //   229: ifeq            393
        //   232: aload_1        
        //   233: aload_2        
        //   234: getfield        m.f:I
        //   237: invokestatic    android/provider/ContactsContract$CommonDataKinds$StructuredPostal.getTypeLabelResource:(I)I
        //   240: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   243: astore          9
        //   245: aload_0        
        //   246: getfield        i.a:Ljava/lang/StringBuilder;
        //   249: getstatic       i.z:[Ljava/lang/String;
        //   252: bipush          24
        //   254: aaload         
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   258: aload_0        
        //   259: getfield        i.e:I
        //   262: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   265: getstatic       i.z:[Ljava/lang/String;
        //   268: bipush          34
        //   270: aaload         
        //   271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   274: aload           9
        //   276: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   279: getstatic       i.z:[Ljava/lang/String;
        //   282: bipush          33
        //   284: aaload         
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   288: aload_2        
        //   289: getfield        m.a:Ll;
        //   292: invokevirtual   l.b:()Ljava/lang/String;
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: aload_0        
        //   299: getfield        i.c:Ljava/lang/String;
        //   302: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   305: pop            
        //   306: aload_0        
        //   307: getfield        i.a:Ljava/lang/StringBuilder;
        //   310: getstatic       i.z:[Ljava/lang/String;
        //   313: bipush          35
        //   315: aaload         
        //   316: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   319: aload_0        
        //   320: getfield        i.e:I
        //   323: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   326: getstatic       i.z:[Ljava/lang/String;
        //   329: bipush          27
        //   331: aaload         
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   335: pop            
        //   336: aload_2        
        //   337: getfield        m.a:Ll;
        //   340: getfield        l.b:Ljava/lang/String;
        //   343: ifnull          367
        //   346: aload_0        
        //   347: getfield        i.a:Ljava/lang/StringBuilder;
        //   350: aload_2        
        //   351: getfield        m.a:Ll;
        //   354: getfield        l.b:Ljava/lang/String;
        //   357: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //   360: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   363: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   366: pop            
        //   367: aload_0        
        //   368: getfield        i.a:Ljava/lang/StringBuilder;
        //   371: aload_0        
        //   372: getfield        i.c:Ljava/lang/String;
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: pop            
        //   379: iload           4
        //   381: ifeq            393
        //   384: getstatic       i.z:[Ljava/lang/String;
        //   387: bipush          36
        //   389: aaload         
        //   390: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   393: return         
        //   394: astore          5
        //   396: aload           5
        //   398: athrow         
        //   399: astore          6
        //   401: aload           6
        //   403: athrow         
        //   404: astore          20
        //   406: getstatic       i.z:[Ljava/lang/String;
        //   409: bipush          38
        //   411: aaload         
        //   412: aload           20
        //   414: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   417: goto            171
        //   420: astore          13
        //   422: getstatic       i.z:[Ljava/lang/String;
        //   425: bipush          37
        //   427: aaload         
        //   428: aload           13
        //   430: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   433: goto            367
        //   436: astore          7
        //   438: aload           7
        //   440: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      54     394    399    Ljava/io/IOException;
        //  59     145    399    404    Ljava/io/IOException;
        //  150    171    404    420    Ljava/io/IOException;
        //  346    367    420    436    Ljava/io/IOException;
        //  367    379    436    441    Ljava/io/IOException;
        //  384    393    436    441    Ljava/io/IOException;
        //  396    399    399    404    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 201, Size: 201
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public String a(final Context context, final o o, final int n) {
        final boolean b = o.b;
        this.a = new StringBuilder();
        if (o.f != null && o.f.e == null) {
            o.f.e = "";
        }
        Label_0089: {
            if (n == 1) {
                this.c = "\n";
                if (!b) {
                    break Label_0089;
                }
            }
            if (n == 2) {
                this.c = "\n";
                if (!b) {
                    break Label_0089;
                }
            }
            throw new a(i.z[51]);
        }
        this.a.append(i.z[45]).append(this.c);
        Label_0162: {
            if (n == 1) {
                this.a.append(i.z[41]).append(this.c);
                if (!b) {
                    break Label_0162;
                }
            }
            this.a.append(i.z[50]).append(this.c);
        }
        if (o.f != null) {
            this.a(o.f);
        }
        if (o.h != null && o.h.containsKey(i.z[46])) {
            this.a.append(i.z[49]).append(o.h.get(i.z[52]).get(0).f).append(this.c);
        }
        if (o.f != null) {
            if (o.f.f != null) {
                this.a.append(i.z[43]).append(o.f.f).append(this.c);
            }
            if (o.f.a != null) {
                this.a.append(i.z[42]).append(o.f.a).append(this.c);
            }
        }
        if (o.j != null && o.j.size() > 0) {
            final String c = o.j.get(0).c;
            final String d = o.j.get(0).d;
            if (c != null) {
                this.a.append(i.z[39]).append(c).append(this.c);
            }
            if (d != null) {
                this.a.append(i.z[40]).append(d).append(this.c);
            }
        }
        if (o.g.size() > 0 && !this.a(o.g.get(0))) {
            this.a.append(i.z[48]).append(this.a(o.g.get(0), n)).append(this.c);
        }
        if (o.e != null) {
            this.b(context, o.e, n);
        }
        if (o.d != null) {
            this.a(context, o.d, n);
        }
        if (o.h != null && o.h.containsKey(i.z[47])) {
            this.a.append(i.z[53]).append(o.h.get(i.z[44]).get(0).f).append(this.c);
        }
        this.a(o);
        if (o.i != null) {
            this.a(o.i, o.k, n);
        }
        this.a.append(i.z[54]);
        final String string = this.a.toString();
        if (DialogToastActivity.h) {
            o.b = !b;
        }
        return string;
    }
}
