import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.30
// 

package java.lang;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class b
{
    private static final Set a;
    private static final Map r;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final String n;
    private final String o;
    private StringBuilder p;
    private boolean q;
    
    static {
        a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("vnd.android.cursor.item/nickname", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/relation")));
        (r = new HashMap()).put(1, 0);
        b.r.put(2, 1);
        b.r.put(3, 2);
        b.r.put(0, 3);
    }
    
    public b(final int b, final String n) {
        this.b = b;
        if (c.c(b)) {
            Log.w("vCard", "Should not use vCard 4.0 when building vCard. It is not officially published yet.");
        }
        this.c = (c.b(b) || c.c(b));
        this.g = c.d(b);
        this.f = c.n(b);
        this.d = c.l(b);
        this.e = c.m(b);
        this.h = c.f(b);
        this.i = c.g(b);
        this.k = c.h(b);
        this.j = c.i(b);
        this.l = c.l(b);
        boolean m = false;
        Label_0143: {
            if (c.b(b)) {
                final boolean equalsIgnoreCase = "UTF-8".equalsIgnoreCase(n);
                m = false;
                if (equalsIgnoreCase) {
                    break Label_0143;
                }
            }
            m = true;
        }
        this.m = m;
        if (c.n(b)) {
            if (!"SHIFT_JIS".equalsIgnoreCase(n)) {
                if (TextUtils.isEmpty((CharSequence)n)) {
                    this.n = "SHIFT_JIS";
                }
                else {
                    this.n = n;
                }
            }
            else {
                this.n = n;
            }
            this.o = "CHARSET=SHIFT_JIS";
        }
        else if (TextUtils.isEmpty((CharSequence)n)) {
            Log.i("vCard", "Use the charset \"UTF-8\" for export.");
            this.n = "UTF-8";
            this.o = "CHARSET=UTF-8";
        }
        else {
            this.n = n;
            this.o = "CHARSET=" + n;
        }
        this.a();
    }
    
    private List a(final String s) {
        final ArrayList<String> list = new ArrayList<String>();
        final StringBuilder sb = new StringBuilder();
        final int length = s.length();
        StringBuilder sb2 = sb;
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '\n' && sb2.length() > 0) {
                list.add(sb2.toString());
                sb2 = new StringBuilder();
            }
            else {
                sb2.append(char1);
            }
        }
        if (sb2.length() > 0) {
            list.add(sb2.toString());
        }
        return list;
    }
    
    private void a(final StringBuilder sb, final Integer n) {
        if (this.f) {
            sb.append("VOICE");
            return;
        }
        final String a = e.a(n);
        if (a != null) {
            this.b(a);
            return;
        }
        Log.e("vCard", "Unknown or unsupported (by vCard) Phone type: " + n);
    }
    
    private void a(final StringBuilder sb, final String s) {
        if (c.c(this.b) || ((c.b(this.b) || this.j) && !this.f)) {
            sb.append("TYPE").append("=");
        }
        sb.append(s);
    }
    
    private boolean a(final ContentValues contentValues) {
        final String asString = contentValues.getAsString("data3");
        final String asString2 = contentValues.getAsString("data5");
        final String asString3 = contentValues.getAsString("data2");
        final String asString4 = contentValues.getAsString("data4");
        final String asString5 = contentValues.getAsString("data6");
        final String asString6 = contentValues.getAsString("data9");
        final String asString7 = contentValues.getAsString("data8");
        final String asString8 = contentValues.getAsString("data7");
        final String asString9 = contentValues.getAsString("data1");
        return !TextUtils.isEmpty((CharSequence)asString) || !TextUtils.isEmpty((CharSequence)asString2) || !TextUtils.isEmpty((CharSequence)asString3) || !TextUtils.isEmpty((CharSequence)asString4) || !TextUtils.isEmpty((CharSequence)asString5) || !TextUtils.isEmpty((CharSequence)asString6) || !TextUtils.isEmpty((CharSequence)asString7) || !TextUtils.isEmpty((CharSequence)asString8) || !TextUtils.isEmpty((CharSequence)asString9);
    }
    
    private boolean a(final String... array) {
        if (this.m) {
            for (int length = array.length, i = 0; i < length; ++i) {
                if (!e.a(new String[] { array[i] })) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void b(final ContentValues contentValues) {
        String s = contentValues.getAsString("data9");
        String s2 = contentValues.getAsString("data8");
        String s3 = contentValues.getAsString("data7");
        if (this.l) {
            s = e.f(s);
            s2 = e.f(s2);
            s3 = e.f(s3);
        }
        if (TextUtils.isEmpty((CharSequence)s) && TextUtils.isEmpty((CharSequence)s2) && TextUtils.isEmpty((CharSequence)s3)) {
            if (this.f) {
                this.p.append("SOUND");
                this.p.append(";");
                this.p.append("X-IRMC-N");
                this.p.append(":");
                this.p.append(";");
                this.p.append(";");
                this.p.append(";");
                this.p.append(";");
                this.p.append("\r\n");
            }
        }
        else {
            if (!c.c(this.b)) {
                if (c.b(this.b)) {
                    final String b = e.b(this.b, s, s2, s3);
                    this.p.append("SORT-STRING");
                    if (c.b(this.b) && this.a(new String[] { b })) {
                        this.p.append(";");
                        this.p.append(this.o);
                    }
                    this.p.append(":");
                    this.p.append(this.d(b));
                    this.p.append("\r\n");
                }
                else if (this.d) {
                    this.p.append("SOUND");
                    this.p.append(";");
                    this.p.append("X-IRMC-N");
                    int n;
                    if (!this.k && (!e.b(new String[] { s }) || !e.b(new String[] { s2 }) || !e.b(new String[] { s3 }))) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    String s4;
                    String s5;
                    String s6;
                    if (n != 0) {
                        s4 = this.c(s);
                        s5 = this.c(s2);
                        s6 = this.c(s3);
                    }
                    else {
                        s4 = this.d(s);
                        s5 = this.d(s2);
                        s6 = this.d(s3);
                    }
                    if (this.a(s4, s5, s6)) {
                        this.p.append(";");
                        this.p.append(this.o);
                    }
                    this.p.append(":");
                    int n2;
                    if (!TextUtils.isEmpty((CharSequence)s4)) {
                        this.p.append(s4);
                        n2 = 0;
                    }
                    else {
                        n2 = 1;
                    }
                    if (!TextUtils.isEmpty((CharSequence)s5)) {
                        if (n2 != 0) {
                            n2 = 0;
                        }
                        else {
                            this.p.append(' ');
                        }
                        this.p.append(s5);
                    }
                    if (!TextUtils.isEmpty((CharSequence)s6)) {
                        if (n2 == 0) {
                            this.p.append(' ');
                        }
                        this.p.append(s6);
                    }
                    this.p.append(";");
                    this.p.append(";");
                    this.p.append(";");
                    this.p.append(";");
                    this.p.append("\r\n");
                }
            }
            if (this.i) {
                if (!TextUtils.isEmpty((CharSequence)s3)) {
                    boolean b2;
                    if (this.g && !e.b(new String[] { s3 })) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    String s7;
                    if (b2) {
                        s7 = this.c(s3);
                    }
                    else {
                        s7 = this.d(s3);
                    }
                    this.p.append("X-PHONETIC-FIRST-NAME");
                    if (this.a(new String[] { s3 })) {
                        this.p.append(";");
                        this.p.append(this.o);
                    }
                    if (b2) {
                        this.p.append(";");
                        this.p.append("ENCODING=QUOTED-PRINTABLE");
                    }
                    this.p.append(":");
                    this.p.append(s7);
                    this.p.append("\r\n");
                }
                if (!TextUtils.isEmpty((CharSequence)s2)) {
                    boolean b3;
                    if (this.g && !e.b(new String[] { s2 })) {
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    String s8;
                    if (b3) {
                        s8 = this.c(s2);
                    }
                    else {
                        s8 = this.d(s2);
                    }
                    this.p.append("X-PHONETIC-MIDDLE-NAME");
                    if (this.a(new String[] { s2 })) {
                        this.p.append(";");
                        this.p.append(this.o);
                    }
                    if (b3) {
                        this.p.append(";");
                        this.p.append("ENCODING=QUOTED-PRINTABLE");
                    }
                    this.p.append(":");
                    this.p.append(s8);
                    this.p.append("\r\n");
                }
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    boolean b4;
                    if (this.g && !e.b(new String[] { s })) {
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    String s9;
                    if (b4) {
                        s9 = this.c(s);
                    }
                    else {
                        s9 = this.d(s);
                    }
                    this.p.append("X-PHONETIC-LAST-NAME");
                    if (this.a(new String[] { s })) {
                        this.p.append(";");
                        this.p.append(this.o);
                    }
                    if (b4) {
                        this.p.append(";");
                        this.p.append("ENCODING=QUOTED-PRINTABLE");
                    }
                    this.p.append(":");
                    this.p.append(s9);
                    this.p.append("\r\n");
                }
            }
        }
    }
    
    private void b(final String s) {
        this.a(this.p, s);
    }
    
    private void b(final String s, final String s2) {
        boolean b;
        if (!this.k && !e.b(new String[] { s2 })) {
            b = true;
        }
        else {
            b = false;
        }
        String s3;
        if (b) {
            s3 = this.c(s2);
        }
        else {
            s3 = this.d(s2);
        }
        this.p.append(s);
        if (this.a(new String[] { s2 })) {
            this.p.append(";");
            this.p.append(this.o);
        }
        if (b) {
            this.p.append(";");
            this.p.append("ENCODING=QUOTED-PRINTABLE");
        }
        this.p.append(":");
        this.p.append(s3);
    }
    
    private ContentValues c(final List list) {
        ContentValues contentValues = null;
        final Iterator<ContentValues> iterator = list.iterator();
        ContentValues contentValues2 = null;
        while (true) {
        Label_0119_Outer:
            while (iterator.hasNext()) {
                ContentValues contentValues3 = iterator.next();
                if (contentValues3 != null) {
                    final Integer asInteger = contentValues3.getAsInteger("is_super_primary");
                    if (asInteger == null || asInteger <= 0) {
                        while (true) {
                            Label_0160: {
                                if (contentValues2 != null) {
                                    break Label_0160;
                                }
                                final Integer asInteger2 = contentValues3.getAsInteger("is_primary");
                                ContentValues contentValues5;
                                if (asInteger2 != null && asInteger2 > 0 && this.a(contentValues3)) {
                                    final ContentValues contentValues4 = contentValues;
                                    contentValues5 = contentValues3;
                                    contentValues3 = contentValues4;
                                }
                                else {
                                    if (contentValues != null || !this.a(contentValues3)) {
                                        break Label_0160;
                                    }
                                    contentValues5 = contentValues2;
                                }
                                contentValues2 = contentValues5;
                                contentValues = contentValues3;
                                continue Label_0119_Outer;
                            }
                            contentValues3 = contentValues;
                            ContentValues contentValues5 = contentValues2;
                            continue;
                        }
                    }
                    if (contentValues3 != null) {
                        return contentValues3;
                    }
                    if (contentValues != null) {
                        return contentValues;
                    }
                    return new ContentValues();
                }
            }
            ContentValues contentValues3 = contentValues2;
            continue;
        }
    }
    
    private String c(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                final byte[] array = s.getBytes(this.n);
                int n = 0;
                int i = 0;
                while (i < array.length) {
                    sb.append(String.format("=%02X", array[i]));
                    ++i;
                    n += 3;
                    if (n >= 67) {
                        sb.append("=\r\n");
                        n = 0;
                    }
                }
                return sb.toString();
            }
            catch (UnsupportedEncodingException ex) {
                Log.e("vCard", "Charset " + this.n + " cannot be used. " + "Try default charset");
                final byte[] array = s.getBytes();
                final int n = 0;
                final int i = 0;
                continue;
            }
            continue;
        }
    }
    
    private b d(final List list) {
        if (this.f || this.l) {
            Log.w("vCard", "Invalid flag is used in vCard 4.0 construction. Ignored.");
        }
        if (list == null || list.isEmpty()) {
            this.a("FN", "");
            return this;
        }
        final ContentValues c = this.c(list);
        String asString = c.getAsString("data3");
        final String asString2 = c.getAsString("data5");
        final String asString3 = c.getAsString("data2");
        final String asString4 = c.getAsString("data4");
        final String asString5 = c.getAsString("data6");
        final String asString6 = c.getAsString("data1");
        if (TextUtils.isEmpty((CharSequence)asString) && TextUtils.isEmpty((CharSequence)asString3) && TextUtils.isEmpty((CharSequence)asString2) && TextUtils.isEmpty((CharSequence)asString4) && TextUtils.isEmpty((CharSequence)asString5)) {
            if (TextUtils.isEmpty((CharSequence)asString6)) {
                this.a("FN", "");
                return this;
            }
            asString = asString6;
        }
        final String asString7 = c.getAsString("data9");
        final String asString8 = c.getAsString("data8");
        final String asString9 = c.getAsString("data7");
        final String d = this.d(asString);
        final String d2 = this.d(asString3);
        final String d3 = this.d(asString2);
        final String d4 = this.d(asString4);
        final String d5 = this.d(asString5);
        this.p.append("N");
        if (!TextUtils.isEmpty((CharSequence)asString7) || !TextUtils.isEmpty((CharSequence)asString8) || !TextUtils.isEmpty((CharSequence)asString9)) {
            this.p.append(";");
            this.p.append("SORT-AS=").append(e.e(this.d(asString7) + ';' + this.d(asString9) + ';' + this.d(asString8)));
        }
        this.p.append(":");
        this.p.append(d);
        this.p.append(";");
        this.p.append(d2);
        this.p.append(";");
        this.p.append(d3);
        this.p.append(";");
        this.p.append(d4);
        this.p.append(";");
        this.p.append(d5);
        this.p.append("\r\n");
        if (TextUtils.isEmpty((CharSequence)asString6)) {
            Log.w("vCard", "DISPLAY_NAME is empty.");
            this.a("FN", this.d(e.a(c.e(this.b), asString, asString2, asString3, asString4, asString5)));
        }
        else {
            final String d6 = this.d(asString6);
            this.p.append("FN");
            this.p.append(":");
            this.p.append(d6);
            this.p.append("\r\n");
        }
        this.b(c);
        return this;
    }
    
    private String d(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            Label_0157: {
                switch (char1) {
                    default: {
                        sb.append(char1);
                        break;
                    }
                    case 59: {
                        sb.append('\\');
                        sb.append(';');
                        break;
                    }
                    case 13: {
                        if (i + 1 >= length || s.charAt(i) != '\n') {
                            break Label_0157;
                        }
                        break;
                    }
                    case 10: {
                        sb.append("\\n");
                        break;
                    }
                    case 92: {
                        if (this.c) {
                            sb.append("\\\\");
                            break;
                        }
                    }
                    case 60:
                    case 62: {
                        if (this.f) {
                            sb.append('\\');
                            sb.append(char1);
                            break;
                        }
                        sb.append(char1);
                        break;
                    }
                    case 44: {
                        if (this.c) {
                            sb.append("\\,");
                            break;
                        }
                        sb.append(char1);
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }
    
    private void e(final List list) {
        final Iterator<String> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            int n2;
            if (c.b(this.b) || c.c(this.b)) {
                String s2;
                if (c.c(this.b)) {
                    s2 = e.e(s);
                }
                else {
                    s2 = e.d(s);
                }
                if (TextUtils.isEmpty((CharSequence)s2)) {
                    continue;
                }
                if (n != 0) {
                    n = 0;
                }
                else {
                    this.p.append(";");
                }
                this.b(s2);
                n2 = n;
            }
            else {
                if (!e.c(s)) {
                    continue;
                }
                if (n != 0) {
                    n = 0;
                }
                else {
                    this.p.append(";");
                }
                this.b(s);
                n2 = n;
            }
            n = n2;
        }
    }
    
    public b a(final List list) {
        if (c.c(this.b)) {
            this = this.d(list);
        }
        else {
            if (list != null && !list.isEmpty()) {
                final ContentValues c = this.c(list);
                final String asString = c.getAsString("data3");
                final String asString2 = c.getAsString("data5");
                final String asString3 = c.getAsString("data2");
                final String asString4 = c.getAsString("data4");
                final String asString5 = c.getAsString("data6");
                String s = c.getAsString("data1");
                if (!TextUtils.isEmpty((CharSequence)asString) || !TextUtils.isEmpty((CharSequence)asString3)) {
                    final boolean a = this.a(asString, asString3, asString2, asString4, asString5);
                    boolean b;
                    if (!this.k && (!e.b(new String[] { asString }) || !e.b(new String[] { asString3 }) || !e.b(new String[] { asString2 }) || !e.b(new String[] { asString4 }) || !e.b(new String[] { asString5 }))) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    if (TextUtils.isEmpty((CharSequence)s)) {
                        s = e.a(c.e(this.b), asString, asString2, asString3, asString4, asString5);
                    }
                    final boolean a2 = this.a(new String[] { s });
                    boolean b2;
                    if (!this.k && !e.b(new String[] { s })) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    String s2;
                    String s3;
                    String s4;
                    String s5;
                    String s6;
                    if (b) {
                        final String c2 = this.c(asString);
                        final String c3 = this.c(asString3);
                        final String c4 = this.c(asString2);
                        final String c5 = this.c(asString4);
                        final String c6 = this.c(asString5);
                        s2 = c4;
                        s3 = c3;
                        s4 = c5;
                        s5 = c2;
                        s6 = c6;
                    }
                    else {
                        final String d = this.d(asString);
                        final String d2 = this.d(asString3);
                        final String d3 = this.d(asString2);
                        final String d4 = this.d(asString4);
                        final String d5 = this.d(asString5);
                        s2 = d3;
                        s3 = d2;
                        s4 = d4;
                        s5 = d;
                        s6 = d5;
                    }
                    String s7;
                    if (b2) {
                        s7 = this.c(s);
                    }
                    else {
                        s7 = this.d(s);
                    }
                    this.p.append("N");
                    if (this.f) {
                        if (a) {
                            this.p.append(";");
                            this.p.append(this.o);
                        }
                        if (b) {
                            this.p.append(";");
                            this.p.append("ENCODING=QUOTED-PRINTABLE");
                        }
                        this.p.append(":");
                        this.p.append(s);
                        this.p.append(";");
                        this.p.append(";");
                        this.p.append(";");
                        this.p.append(";");
                    }
                    else {
                        if (a) {
                            this.p.append(";");
                            this.p.append(this.o);
                        }
                        if (b) {
                            this.p.append(";");
                            this.p.append("ENCODING=QUOTED-PRINTABLE");
                        }
                        this.p.append(":");
                        this.p.append(s5);
                        this.p.append(";");
                        this.p.append(s3);
                        this.p.append(";");
                        this.p.append(s2);
                        this.p.append(";");
                        this.p.append(s4);
                        this.p.append(";");
                        this.p.append(s6);
                    }
                    this.p.append("\r\n");
                    this.p.append("FN");
                    if (a2) {
                        this.p.append(";");
                        this.p.append(this.o);
                    }
                    if (b2) {
                        this.p.append(";");
                        this.p.append("ENCODING=QUOTED-PRINTABLE");
                    }
                    this.p.append(":");
                    this.p.append(s7);
                    this.p.append("\r\n");
                }
                else if (!TextUtils.isEmpty((CharSequence)s)) {
                    this.b("N", s);
                    this.p.append(";");
                    this.p.append(";");
                    this.p.append(";");
                    this.p.append(";");
                    this.p.append("\r\n");
                    this.b("FN", s);
                    this.p.append("\r\n");
                }
                else if (c.b(this.b)) {
                    this.a("N", "");
                    this.a("FN", "");
                }
                else if (this.f) {
                    this.a("N", "");
                }
                this.b(c);
                return this;
            }
            if (c.b(this.b)) {
                this.a("N", "");
                this.a("FN", "");
                return this;
            }
            if (this.f) {
                this.a("N", "");
                return this;
            }
        }
        return this;
    }
    
    public b a(final List list, final d d) {
        int n;
        if (list != null) {
            final HashSet<String> set = new HashSet<String>();
            final Iterator<ContentValues> iterator = list.iterator();
            n = 0;
        Label_0189_Outer:
            while (iterator.hasNext()) {
                final ContentValues contentValues = iterator.next();
                final Integer asInteger = contentValues.getAsInteger("data2");
                final String asString = contentValues.getAsString("data3");
                final Integer asInteger2 = contentValues.getAsInteger("is_primary");
                final boolean b = asInteger2 != null && asInteger2 > 0;
                String s = contentValues.getAsString("data1");
                if (s != null) {
                    s = s.trim();
                }
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    int intValue;
                    if (asInteger != null) {
                        intValue = asInteger;
                    }
                    else {
                        intValue = 1;
                    }
                    while (true) {
                        Label_0566: {
                            int n2;
                            if (d != null) {
                                final String a = d.a(s, intValue, asString, b);
                                if (set.contains(a)) {
                                    break Label_0566;
                                }
                                set.add(a);
                                this.a(Integer.valueOf(intValue), asString, a, b);
                                n2 = n;
                            }
                            else if (intValue == 6 || c.k(this.b)) {
                                n = 1;
                                if (set.contains(s)) {
                                    break Label_0566;
                                }
                                set.add(s);
                                this.a(Integer.valueOf(intValue), asString, s, b);
                                n2 = n;
                            }
                            else {
                                final List a2 = this.a(s);
                                if (a2.isEmpty()) {
                                    continue Label_0189_Outer;
                                }
                                for (final String s2 : a2) {
                                    if (!set.contains(s2)) {
                                        String s3 = s2.replace(',', 'p').replace(';', 'w');
                                        if (TextUtils.equals((CharSequence)s3, (CharSequence)s2)) {
                                            final StringBuilder sb = new StringBuilder();
                                            for (int length = s2.length(), i = 0; i < length; ++i) {
                                                final char char1 = s2.charAt(i);
                                                if (Character.isDigit(char1) || char1 == '+') {
                                                    sb.append(char1);
                                                }
                                            }
                                            s3 = f.a(sb.toString(), e.a(this.b));
                                        }
                                        if (c.c(this.b) && !TextUtils.isEmpty((CharSequence)s3) && !s3.startsWith("tel:")) {
                                            s3 = "tel:" + s3;
                                        }
                                        set.add(s2);
                                        this.a(Integer.valueOf(intValue), asString, s3, b);
                                    }
                                }
                                n2 = 1;
                            }
                            n = n2;
                            continue Label_0189_Outer;
                        }
                        int n2 = n;
                        continue;
                    }
                }
            }
        }
        else {
            n = 0;
        }
        if (n == 0 && this.f) {
            this.a(Integer.valueOf(1), "", "", false);
        }
        return this;
    }
    
    public void a() {
        this.p = new StringBuilder();
        this.q = false;
        this.a("BEGIN", "VCARD");
        if (c.c(this.b)) {
            this.a("VERSION", "4.0");
            return;
        }
        if (c.b(this.b)) {
            this.a("VERSION", "3.0");
            return;
        }
        if (!c.a(this.b)) {
            Log.w("vCard", "Unknown vCard version detected.");
        }
        this.a("VERSION", "2.1");
    }
    
    public void a(final int n, final String s, final String s2, final boolean b) {
        String string = null;
        while (true) {
            switch (n) {
                default: {
                    Log.e("vCard", "Unknown Email type: " + n);
                    break Label_0066;
                }
                case 4: {
                    string = "CELL";
                    break Label_0066;
                }
                case 2: {
                    string = "WORK";
                    break Label_0066;
                }
                case 1: {
                    string = "HOME";
                }
                case 3: {
                    final ArrayList<String> list = new ArrayList<String>();
                    if (b) {
                        list.add("PREF");
                    }
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        list.add(string);
                    }
                    this.a("EMAIL", list, s2);
                }
                case 0: {
                    if (e.a(s)) {
                        string = "CELL";
                        continue;
                    }
                    final boolean empty = TextUtils.isEmpty((CharSequence)s);
                    string = null;
                    if (empty) {
                        continue;
                    }
                    final boolean c = e.c(new String[] { s });
                    string = null;
                    if (c) {
                        string = "X-" + s;
                    }
                    continue;
                }
            }
            break;
        }
    }
    
    public void a(final Integer n, final String s, final String s2, boolean b) {
        this.p.append("TEL");
        this.p.append(";");
        int intValue;
        if (n == null) {
            intValue = 7;
        }
        else {
            intValue = n;
        }
        final ArrayList<String> list = new ArrayList<String>();
        switch (intValue) {
            case 1: {
                list.addAll(Arrays.asList("HOME"));
                break;
            }
            case 3: {
                list.addAll(Arrays.asList("WORK"));
                break;
            }
            case 5: {
                list.addAll(Arrays.asList("HOME", "FAX"));
                break;
            }
            case 4: {
                list.addAll(Arrays.asList("WORK", "FAX"));
                break;
            }
            case 2: {
                list.add("CELL");
                break;
            }
            case 6: {
                if (this.f) {
                    list.add("VOICE");
                    break;
                }
                list.add("PAGER");
                break;
            }
            case 7: {
                list.add("VOICE");
                break;
            }
            case 9: {
                list.add("CAR");
                break;
            }
            case 10: {
                list.add("WORK");
                b = true;
                break;
            }
            case 11: {
                list.add("ISDN");
                break;
            }
            case 12: {
                b = true;
                break;
            }
            case 13: {
                list.add("FAX");
                break;
            }
            case 15: {
                list.add("TLX");
                break;
            }
            case 17: {
                list.addAll(Arrays.asList("WORK", "CELL"));
                break;
            }
            case 18: {
                list.add("WORK");
                if (this.f) {
                    list.add("VOICE");
                    break;
                }
                list.add("PAGER");
                break;
            }
            case 20: {
                list.add("MSG");
                break;
            }
            case 0: {
                if (TextUtils.isEmpty((CharSequence)s)) {
                    list.add("VOICE");
                    break;
                }
                if (e.a(s)) {
                    list.add("CELL");
                    break;
                }
                if (this.c) {
                    list.add(s);
                    break;
                }
                final String upperCase = s.toUpperCase();
                if (e.b(upperCase)) {
                    list.add(upperCase);
                    break;
                }
                if (e.c(new String[] { s })) {
                    list.add("X-" + s);
                    break;
                }
                break;
            }
        }
        if (b) {
            list.add("PREF");
        }
        if (list.isEmpty()) {
            this.a(this.p, Integer.valueOf(intValue));
        }
        else {
            this.e(list);
        }
        this.p.append(":");
        this.p.append(s2);
        this.p.append("\r\n");
    }
    
    public void a(final String s, final String s2) {
        this.a(s, s2, false, false);
    }
    
    public void a(final String s, final String s2, final boolean b, final boolean b2) {
        this.a(s, null, s2, b, b2);
    }
    
    public void a(final String s, final List list, final String s2) {
        this.a(s, list, s2, !e.a(new String[] { s2 }), this.g && !e.b(new String[] { s2 }));
    }
    
    public void a(final String s, final List list, final String s2, final boolean b, final boolean b2) {
        this.p.append(s);
        if (list != null && list.size() > 0) {
            this.p.append(";");
            this.e(list);
        }
        if (b) {
            this.p.append(";");
            this.p.append(this.o);
        }
        String s3;
        if (b2) {
            this.p.append(";");
            this.p.append("ENCODING=QUOTED-PRINTABLE");
            s3 = this.c(s2);
        }
        else {
            s3 = this.d(s2);
        }
        this.p.append(":");
        this.p.append(s3);
        this.p.append("\r\n");
    }
    
    public b b(final List list) {
        boolean b;
        if (list != null) {
            final HashSet<String> set = new HashSet<String>();
            final Iterator<ContentValues> iterator = list.iterator();
            b = false;
            while (iterator.hasNext()) {
                final ContentValues contentValues = iterator.next();
                String s = contentValues.getAsString("data1");
                if (s != null) {
                    s = s.trim();
                }
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    final Integer asInteger = contentValues.getAsInteger("data2");
                    int intValue;
                    if (asInteger != null) {
                        intValue = asInteger;
                    }
                    else {
                        intValue = 3;
                    }
                    final String asString = contentValues.getAsString("data3");
                    final Integer asInteger2 = contentValues.getAsInteger("is_primary");
                    final boolean b2 = asInteger2 != null && asInteger2 > 0;
                    if (!set.contains(s)) {
                        set.add(s);
                        this.a(intValue, asString, s, b2);
                    }
                    b = true;
                }
            }
        }
        else {
            b = false;
        }
        if (!b && this.f) {
            this.a(1, "", "", false);
        }
        return this;
    }
    
    @Override
    public String toString() {
        if (!this.q) {
            if (this.f) {
                this.a("X-CLASS", "PUBLIC");
                this.a("X-REDUCTION", "");
                this.a("X-NO", "");
                this.a("X-DCM-HMN-MODE", "");
            }
            this.a("END", "VCARD");
            this.q = true;
        }
        return this.p.toString();
    }
}
