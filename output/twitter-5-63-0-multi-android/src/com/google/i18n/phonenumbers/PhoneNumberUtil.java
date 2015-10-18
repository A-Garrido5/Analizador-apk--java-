// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.InputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.regex.Matcher;
import java.util.logging.Level;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class PhoneNumberUtil
{
    private static final Pattern A;
    private static PhoneNumberUtil B;
    static final c a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final String e;
    static final Pattern f;
    private static final Logger g;
    private static final Map h;
    private static final Map i;
    private static final Map j;
    private static final Map k;
    private static final Map l;
    private static final Pattern m;
    private static final String n;
    private static final Pattern o;
    private static final Pattern p;
    private static final Pattern q;
    private static final Pattern r;
    private static final String s;
    private static final String t;
    private static final Pattern u;
    private static final Pattern v;
    private static final Pattern w;
    private static final Pattern x;
    private static final Pattern y;
    private static final Pattern z;
    private final Map C;
    private final Set D;
    private final Map E;
    private final Map F;
    private final f G;
    private final Set H;
    private final Set I;
    private final String J;
    private final c K;
    
    static {
        a = new d();
        g = Logger.getLogger(PhoneNumberUtil.class.getName());
        final HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(52, "1");
        hashMap.put(54, "9");
        h = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap<Character, Character> hashMap2 = new HashMap<Character, Character>();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        final HashMap<Character, Character> hashMap3 = new HashMap<Character, Character>(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        j = Collections.unmodifiableMap((Map<?, ?>)hashMap3);
        final HashMap<Object, Object> hashMap4 = new HashMap<Object, Object>(100);
        hashMap4.putAll(PhoneNumberUtil.j);
        hashMap4.putAll(hashMap2);
        k = Collections.unmodifiableMap((Map<?, ?>)hashMap4);
        final HashMap<Character, Character> hashMap5 = new HashMap<Character, Character>();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        i = Collections.unmodifiableMap((Map<?, ?>)hashMap5);
        final HashMap<Character, Character> hashMap6 = new HashMap<Character, Character>();
        for (final char charValue : PhoneNumberUtil.j.keySet()) {
            hashMap6.put(Character.toLowerCase(charValue), charValue);
            hashMap6.put(charValue, charValue);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put('\uff0d', '-');
        hashMap6.put('\u2010', '-');
        hashMap6.put('\u2011', '-');
        hashMap6.put('\u2012', '-');
        hashMap6.put('\u2013', '-');
        hashMap6.put('\u2014', '-');
        hashMap6.put('\u2015', '-');
        hashMap6.put('\u2212', '-');
        hashMap6.put('/', '/');
        hashMap6.put('\uff0f', '/');
        hashMap6.put(' ', ' ');
        hashMap6.put('\u3000', ' ');
        hashMap6.put('\u2060', ' ');
        hashMap6.put('.', '.');
        hashMap6.put('\uff0e', '.');
        l = Collections.unmodifiableMap((Map<?, ?>)hashMap6);
        m = Pattern.compile("[\\d]+(?:[~\u2053\u223c\uff5e][\\d]+)?");
        final String value = String.valueOf(Arrays.toString(PhoneNumberUtil.j.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        final String value2 = String.valueOf(Arrays.toString(PhoneNumberUtil.j.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String concat;
        if (value2.length() != 0) {
            concat = value.concat(value2);
        }
        else {
            concat = new String(value);
        }
        n = concat;
        b = Pattern.compile("[+\uff0b]+");
        o = Pattern.compile("[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f  \u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]+");
        p = Pattern.compile("(\\p{Nd})");
        q = Pattern.compile("[+\uff0b\\p{Nd}]");
        c = Pattern.compile("[\\\\/] *x");
        d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        r = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        final String value3 = String.valueOf(String.valueOf("\\p{Nd}{2}|[+\uff0b]*+(?:[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f  \u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f  \u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*"));
        final String value4 = String.valueOf(String.valueOf(PhoneNumberUtil.n));
        final String value5 = String.valueOf(String.valueOf("\\p{Nd}"));
        s = new StringBuilder(2 + value3.length() + value4.length() + value5.length()).append(value3).append(value4).append(value5).append("]*").toString();
        final String value6 = String.valueOf("x\uff58#\uff03~\uff5e");
        String concat2;
        if (value6.length() != 0) {
            concat2 = ",".concat(value6);
        }
        else {
            concat2 = new String(",");
        }
        t = i(concat2);
        e = i("x\uff58#\uff03~\uff5e");
        final String value7 = String.valueOf(String.valueOf(PhoneNumberUtil.t));
        u = Pattern.compile(new StringBuilder(5 + value7.length()).append("(?:").append(value7).append(")$").toString(), 66);
        final String value8 = String.valueOf(String.valueOf(PhoneNumberUtil.s));
        final String value9 = String.valueOf(String.valueOf(PhoneNumberUtil.t));
        v = Pattern.compile(new StringBuilder(5 + value8.length() + value9.length()).append(value8).append("(?:").append(value9).append(")?").toString(), 66);
        f = Pattern.compile("(\\D+)");
        w = Pattern.compile("(\\$\\d)");
        x = Pattern.compile("\\$NP");
        y = Pattern.compile("\\$FG");
        z = Pattern.compile("\\$CC");
        A = Pattern.compile("\\(?\\$1\\)?");
        PhoneNumberUtil.B = null;
    }
    
    PhoneNumberUtil(final String j, final c k, final Map c) {
        this.D = new HashSet(35);
        this.E = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.F = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.G = new f(100);
        this.H = new HashSet(320);
        this.I = new HashSet();
        this.J = j;
        this.K = k;
        this.C = c;
        for (final Map.Entry<K, List> entry : c.entrySet()) {
            final List<Object> list = entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.I.add(entry.getKey());
            }
            else {
                this.H.addAll(list);
            }
        }
        if (this.H.remove("001")) {
            PhoneNumberUtil.g.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.D.addAll(c.get(1));
    }
    
    private PhoneNumberUtil$PhoneNumberType a(final String s, final Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        if (!this.b(s, phonemetadata$PhoneMetadata.a())) {
            return PhoneNumberUtil$PhoneNumberType.l;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.e())) {
            return PhoneNumberUtil$PhoneNumberType.e;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.d())) {
            return PhoneNumberUtil$PhoneNumberType.d;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.f())) {
            return PhoneNumberUtil$PhoneNumberType.f;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.h())) {
            return PhoneNumberUtil$PhoneNumberType.g;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.g())) {
            return PhoneNumberUtil$PhoneNumberType.h;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.i())) {
            return PhoneNumberUtil$PhoneNumberType.i;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.j())) {
            return PhoneNumberUtil$PhoneNumberType.j;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.k())) {
            return PhoneNumberUtil$PhoneNumberType.k;
        }
        if (this.b(s, phonemetadata$PhoneMetadata.b())) {
            if (phonemetadata$PhoneMetadata.t()) {
                return PhoneNumberUtil$PhoneNumberType.c;
            }
            if (this.b(s, phonemetadata$PhoneMetadata.c())) {
                return PhoneNumberUtil$PhoneNumberType.c;
            }
            return PhoneNumberUtil$PhoneNumberType.a;
        }
        else {
            if (!phonemetadata$PhoneMetadata.t() && this.b(s, phonemetadata$PhoneMetadata.c())) {
                return PhoneNumberUtil$PhoneNumberType.b;
            }
            return PhoneNumberUtil$PhoneNumberType.l;
        }
    }
    
    private PhoneNumberUtil$ValidationResult a(final Pattern pattern, final String s) {
        final Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            return PhoneNumberUtil$ValidationResult.a;
        }
        if (matcher.lookingAt()) {
            return PhoneNumberUtil$ValidationResult.d;
        }
        return PhoneNumberUtil$ValidationResult.c;
    }
    
    public static PhoneNumberUtil a() {
        synchronized (PhoneNumberUtil.class) {
            if (PhoneNumberUtil.B == null) {
                a(a(PhoneNumberUtil.a));
            }
            return PhoneNumberUtil.B;
        }
    }
    
    public static PhoneNumberUtil a(final c c) {
        if (c == null) {
            throw new IllegalArgumentException("metadataLoader could not be null.");
        }
        return new PhoneNumberUtil("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", c, com.google.i18n.phonenumbers.b.a());
    }
    
    private Phonemetadata$PhoneMetadata a(final int n, final String s) {
        if ("001".equals(s)) {
            return this.a(n);
        }
        return this.f(s);
    }
    
    private static Phonemetadata$PhoneMetadataCollection a(final ObjectInputStream objectInputStream) {
        final Phonemetadata$PhoneMetadataCollection collection = new Phonemetadata$PhoneMetadataCollection();
        try {
            collection.readExternal(objectInputStream);
        }
        catch (IOException ex) {
            PhoneNumberUtil.g.log(Level.WARNING, "error reading input (ignored)", ex);
            try {
                objectInputStream.close();
            }
            catch (IOException ex2) {
                PhoneNumberUtil.g.log(Level.WARNING, "error closing input stream (ignored)", ex2);
            }
            finally {
                return collection;
            }
        }
        finally {
            try {
                objectInputStream.close();
            }
            catch (IOException ex3) {
                PhoneNumberUtil.g.log(Level.WARNING, "error closing input stream (ignored)", ex3);
                return collection;
            }
            finally {
                return collection;
            }
        }
    }
    
    private String a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber, final List list) {
        final String a = this.a(phonenumber$PhoneNumber);
        for (final String s : list) {
            final Phonemetadata$PhoneMetadata f = this.f(s);
            if (f.y()) {
                if (this.G.a(f.z()).matcher(a).lookingAt()) {
                    return s;
                }
                continue;
            }
            else {
                if (this.a(a, f) != PhoneNumberUtil$PhoneNumberType.l) {
                    return s;
                }
                continue;
            }
        }
        return null;
    }
    
    static String a(final String s) {
        final Matcher matcher = PhoneNumberUtil.q.matcher(s);
        if (matcher.find()) {
            String s2 = s.substring(matcher.start());
            final Matcher matcher2 = PhoneNumberUtil.d.matcher(s2);
            if (matcher2.find()) {
                final String substring = s2.substring(0, matcher2.start());
                final Logger g = PhoneNumberUtil.g;
                final Level finer = Level.FINER;
                final String value = String.valueOf(substring);
                String concat;
                if (value.length() != 0) {
                    concat = "Stripped trailing characters: ".concat(value);
                }
                else {
                    concat = new String("Stripped trailing characters: ");
                }
                g.log(finer, concat);
                s2 = substring;
            }
            final Matcher matcher3 = PhoneNumberUtil.c.matcher(s2);
            if (matcher3.find()) {
                s2 = s2.substring(0, matcher3.start());
            }
            return s2;
        }
        return "";
    }
    
    private String a(final String s, final Phonemetadata$NumberFormat phonemetadata$NumberFormat, final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat, final String s2) {
        final String b = phonemetadata$NumberFormat.b();
        final Matcher matcher = this.G.a(phonemetadata$NumberFormat.a()).matcher(s);
        String s3;
        if (phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.c && s2 != null && s2.length() > 0 && phonemetadata$NumberFormat.f().length() > 0) {
            s3 = matcher.replaceAll(PhoneNumberUtil.w.matcher(b).replaceFirst(PhoneNumberUtil.z.matcher(phonemetadata$NumberFormat.f()).replaceFirst(s2)));
        }
        else {
            final String d = phonemetadata$NumberFormat.d();
            if (phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.c && d != null && d.length() > 0) {
                s3 = matcher.replaceAll(PhoneNumberUtil.w.matcher(b).replaceFirst(d));
            }
            else {
                s3 = matcher.replaceAll(b);
            }
        }
        if (phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.d) {
            final Matcher matcher2 = PhoneNumberUtil.o.matcher(s3);
            if (matcher2.lookingAt()) {
                s3 = matcher2.replaceFirst("");
            }
            s3 = matcher2.reset(s3).replaceAll("-");
        }
        return s3;
    }
    
    private String a(final String s, final Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat) {
        return this.a(s, phonemetadata$PhoneMetadata, phoneNumberUtil$PhoneNumberFormat, null);
    }
    
    private String a(final String s, final Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat, final String s2) {
        List list;
        if (phonemetadata$PhoneMetadata.w().size() == 0 || phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.c) {
            list = phonemetadata$PhoneMetadata.u();
        }
        else {
            list = phonemetadata$PhoneMetadata.w();
        }
        final Phonemetadata$NumberFormat a = this.a(list, s);
        if (a == null) {
            return s;
        }
        return this.a(s, a, phoneNumberUtil$PhoneNumberFormat, s2);
    }
    
    private static String a(final String s, final Map map, final boolean b) {
        final StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            final Character c = map.get(Character.toUpperCase(char1));
            if (c != null) {
                sb.append(c);
            }
            else if (!b) {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    static StringBuilder a(final String s, final boolean b) {
        final StringBuilder sb = new StringBuilder(s.length());
        for (final char c : s.toCharArray()) {
            final int digit = Character.digit(c, 10);
            if (digit != -1) {
                sb.append(digit);
            }
            else if (b) {
                sb.append(c);
            }
        }
        return sb;
    }
    
    private void a(final int n, final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat, final StringBuilder sb) {
        switch (com.google.i18n.phonenumbers.e.b[phoneNumberUtil$PhoneNumberFormat.ordinal()]) {
            default: {}
            case 1: {
                sb.insert(0, n).insert(0, '+');
            }
            case 2: {
                sb.insert(0, " ").insert(0, n).insert(0, '+');
            }
            case 3: {
                sb.insert(0, "-").insert(0, n).insert(0, '+').insert(0, "tel:");
            }
        }
    }
    
    static void a(final PhoneNumberUtil b) {
        synchronized (PhoneNumberUtil.class) {
            PhoneNumberUtil.B = b;
        }
    }
    
    private void a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber, final Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat, final StringBuilder sb) {
        if (phonenumber$PhoneNumber.c() && phonenumber$PhoneNumber.d().length() > 0) {
            if (phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.d) {
                sb.append(";ext=").append(phonenumber$PhoneNumber.d());
            }
            else {
                if (phonemetadata$PhoneMetadata.o()) {
                    sb.append(phonemetadata$PhoneMetadata.p()).append(phonenumber$PhoneNumber.d());
                    return;
                }
                sb.append(" ext. ").append(phonenumber$PhoneNumber.d());
            }
        }
    }
    
    static void a(final String s, final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            phonenumber$PhoneNumber.a(true);
            int n;
            for (n = 1; n < -1 + s.length() && s.charAt(n) == '0'; ++n) {}
            if (n != 1) {
                phonenumber$PhoneNumber.b(n);
            }
        }
    }
    
    private void a(final String s, final String s2, final boolean b, final boolean b2, final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (s == null) {
            throw new NumberParseException(NumberParseException$ErrorType.b, "The phone number supplied was null.");
        }
        if (s.length() > 250) {
            throw new NumberParseException(NumberParseException$ErrorType.e, "The string supplied was too long to parse.");
        }
        final StringBuilder sb = new StringBuilder();
        this.a(s, sb);
        if (!b(sb.toString())) {
            throw new NumberParseException(NumberParseException$ErrorType.b, "The string supplied did not seem to be a phone number.");
        }
        if (b2 && !this.b(sb.toString(), s2)) {
            throw new NumberParseException(NumberParseException$ErrorType.a, "Missing or invalid default region.");
        }
        if (b) {
            phonenumber$PhoneNumber.b(s);
        }
        final String b3 = this.b(sb);
        if (b3.length() > 0) {
            phonenumber$PhoneNumber.a(b3);
        }
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = null;
        StringBuilder sb2 = null;
    Label_0220_Outer:
        while (true) {
            phonemetadata$PhoneMetadata = this.f(s2);
            sb2 = new StringBuilder();
            while (true) {
                while (true) {
                    try {
                        final int n = this.a(sb.toString(), phonemetadata$PhoneMetadata, sb2, b, phonenumber$PhoneNumber);
                        if (n != 0) {
                            final String b4 = this.b(n);
                            if (!b4.equals(s2)) {
                                phonemetadata$PhoneMetadata = this.a(n, b4);
                            }
                            if (sb2.length() < 2) {
                                throw new NumberParseException(NumberParseException$ErrorType.d, "The string supplied is too short to be a phone number.");
                            }
                            break;
                        }
                    }
                    catch (NumberParseException ex) {
                        final Matcher matcher = PhoneNumberUtil.b.matcher(sb.toString());
                        if (ex.a() != NumberParseException$ErrorType.a || !matcher.lookingAt()) {
                            throw new NumberParseException(ex.a(), ex.getMessage());
                        }
                        final int n = this.a(sb.substring(matcher.end()), phonemetadata$PhoneMetadata, sb2, b, phonenumber$PhoneNumber);
                        if (n == 0) {
                            throw new NumberParseException(NumberParseException$ErrorType.a, "Could not interpret numbers after plus-sign.");
                        }
                        continue Label_0220_Outer;
                    }
                    break;
                }
                a(sb);
                sb2.append((CharSequence)sb);
                if (s2 != null) {
                    phonenumber$PhoneNumber.a(phonemetadata$PhoneMetadata.l());
                    continue;
                }
                if (b) {
                    phonenumber$PhoneNumber.m();
                    continue;
                }
                continue;
            }
        }
        if (phonemetadata$PhoneMetadata != null) {
            final StringBuilder sb3 = new StringBuilder();
            final StringBuilder sb4 = new StringBuilder(sb2);
            this.a(sb4, phonemetadata$PhoneMetadata, sb3);
            if (!this.a(phonemetadata$PhoneMetadata, sb4.toString())) {
                if (b) {
                    phonenumber$PhoneNumber.c(sb3.toString());
                }
                sb2 = sb4;
            }
        }
        final int length = sb2.length();
        if (length < 2) {
            throw new NumberParseException(NumberParseException$ErrorType.d, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new NumberParseException(NumberParseException$ErrorType.e, "The string supplied is too long to be a phone number.");
        }
        a(sb2.toString(), phonenumber$PhoneNumber);
        phonenumber$PhoneNumber.a(Long.parseLong(sb2.toString()));
    }
    
    private void a(final String s, final StringBuilder sb) {
        final int index = s.indexOf(";phone-context=");
        if (index > 0) {
            final int n = index + ";phone-context=".length();
            if (s.charAt(n) == '+') {
                final int index2 = s.indexOf(59, n);
                if (index2 > 0) {
                    sb.append(s.substring(n, index2));
                }
                else {
                    sb.append(s.substring(n));
                }
            }
            final int index3 = s.indexOf("tel:");
            int n2;
            if (index3 >= 0) {
                n2 = index3 + "tel:".length();
            }
            else {
                n2 = 0;
            }
            sb.append(s.substring(n2, index));
        }
        else {
            sb.append(a(s));
        }
        final int index4 = sb.indexOf(";isub=");
        if (index4 > 0) {
            sb.delete(index4, sb.length());
        }
    }
    
    static void a(final StringBuilder sb) {
        sb.replace(0, sb.length(), c(sb.toString()));
    }
    
    private boolean a(final Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, final String s) {
        return this.a(this.G.a(phonemetadata$PhoneMetadata.a().b()), s) == PhoneNumberUtil$ValidationResult.c;
    }
    
    private boolean a(final Pattern pattern, final StringBuilder sb) {
        final Matcher matcher = pattern.matcher(sb);
        if (matcher.lookingAt()) {
            final int end = matcher.end();
            final Matcher matcher2 = PhoneNumberUtil.p.matcher(sb.substring(end));
            if (!matcher2.find() || !d(matcher2.group(1)).equals("0")) {
                sb.delete(0, end);
                return true;
            }
        }
        return false;
    }
    
    static boolean b(final String s) {
        return s.length() >= 2 && PhoneNumberUtil.v.matcher(s).matches();
    }
    
    private boolean b(final String s, final String s2) {
        return this.j(s2) || (s != null && s.length() != 0 && PhoneNumberUtil.b.matcher(s).lookingAt());
    }
    
    static String c(final String s) {
        if (PhoneNumberUtil.r.matcher(s).matches()) {
            return a(s, PhoneNumberUtil.k, true);
        }
        return d(s);
    }
    
    private boolean c(final int n) {
        return this.C.containsKey(n);
    }
    
    public static String d(final String s) {
        return a(s, false).toString();
    }
    
    static boolean e(final String s) {
        return s.length() == 0 || PhoneNumberUtil.A.matcher(s).matches();
    }
    
    private static String i(final String s) {
        final String value = String.valueOf(String.valueOf(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:o\u0301?|\u00f3))?n?|\uff45?\uff58\uff54\uff4e?|["));
        final String value2 = String.valueOf(String.valueOf(s));
        final String value3 = String.valueOf(String.valueOf("(\\p{Nd}{1,7})"));
        final String value4 = String.valueOf(String.valueOf("\\p{Nd}"));
        return new StringBuilder(48 + value.length() + value2.length() + value3.length() + value4.length()).append(value).append(value2).append("]|int|anexo|\uff49\uff4e\uff54)").append("[:\\.\uff0e]?[  \\t,-]*").append(value3).append("#?|").append("[- ]+(").append(value4).append("{1,5})#").toString();
    }
    
    private boolean j(final String s) {
        return s != null && this.H.contains(s);
    }
    
    private int k(final String s) {
        final Phonemetadata$PhoneMetadata f = this.f(s);
        if (f == null) {
            final String value = String.valueOf(s);
            String concat;
            if (value.length() != 0) {
                concat = "Invalid region code: ".concat(value);
            }
            else {
                concat = new String("Invalid region code: ");
            }
            throw new IllegalArgumentException(concat);
        }
        return f.l();
    }
    
    int a(final String s, final Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, final StringBuilder sb, final boolean b, final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (s.length() == 0) {
            return 0;
        }
        final StringBuilder sb2 = new StringBuilder(s);
        String m = "NonMatch";
        if (phonemetadata$PhoneMetadata != null) {
            m = phonemetadata$PhoneMetadata.m();
        }
        final Phonenumber$PhoneNumber$CountryCodeSource a = this.a(sb2, m);
        if (b) {
            phonenumber$PhoneNumber.a(a);
        }
        if (a == Phonenumber$PhoneNumber$CountryCodeSource.d) {
            if (phonemetadata$PhoneMetadata != null) {
                final int l = phonemetadata$PhoneMetadata.l();
                final String value = String.valueOf(l);
                final String string = sb2.toString();
                if (string.startsWith(value)) {
                    final StringBuilder sb3 = new StringBuilder(string.substring(value.length()));
                    final Phonemetadata$PhoneNumberDesc a2 = phonemetadata$PhoneMetadata.a();
                    final Pattern a3 = this.G.a(a2.a());
                    this.a(sb3, phonemetadata$PhoneMetadata, null);
                    final Pattern a4 = this.G.a(a2.b());
                    if ((!a3.matcher(sb2).matches() && a3.matcher(sb3).matches()) || this.a(a4, sb2.toString()) == PhoneNumberUtil$ValidationResult.d) {
                        sb.append((CharSequence)sb3);
                        if (b) {
                            phonenumber$PhoneNumber.a(Phonenumber$PhoneNumber$CountryCodeSource.c);
                        }
                        phonenumber$PhoneNumber.a(l);
                        return l;
                    }
                }
            }
            phonenumber$PhoneNumber.a(0);
            return 0;
        }
        if (sb2.length() <= 2) {
            throw new NumberParseException(NumberParseException$ErrorType.c, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        final int a5 = this.a(sb2, sb);
        if (a5 != 0) {
            phonenumber$PhoneNumber.a(a5);
            return a5;
        }
        throw new NumberParseException(NumberParseException$ErrorType.a, "Country calling code supplied was not recognised.");
    }
    
    int a(final StringBuilder sb, final StringBuilder sb2) {
        if (sb.length() == 0 || sb.charAt(0) == '0') {
            return 0;
        }
        for (int length = sb.length(), n = 1; n <= 3 && n <= length; ++n) {
            final int int1 = Integer.parseInt(sb.substring(0, n));
            if (this.C.containsKey(int1)) {
                sb2.append(sb.substring(n));
                return int1;
            }
        }
        return 0;
    }
    
    Phonemetadata$NumberFormat a(final List list, final String s) {
        for (final Phonemetadata$NumberFormat phonemetadata$NumberFormat : list) {
            final int c = phonemetadata$NumberFormat.c();
            if ((c == 0 || this.G.a(phonemetadata$NumberFormat.a(c - 1)).matcher(s).lookingAt()) && this.G.a(phonemetadata$NumberFormat.a()).matcher(s).matches()) {
                return phonemetadata$NumberFormat;
            }
        }
        return null;
    }
    
    Phonemetadata$PhoneMetadata a(final int n) {
        synchronized (this.F) {
            if (!this.C.containsKey(n)) {
                return null;
            }
            if (!this.F.containsKey(n)) {
                this.a(this.J, "001", n, this.K);
            }
            // monitorexit(this.F)
            return this.F.get(n);
        }
    }
    
    Phonenumber$PhoneNumber$CountryCodeSource a(final StringBuilder sb, final String s) {
        if (sb.length() == 0) {
            return Phonenumber$PhoneNumber$CountryCodeSource.d;
        }
        final Matcher matcher = PhoneNumberUtil.b.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            a(sb);
            return Phonenumber$PhoneNumber$CountryCodeSource.a;
        }
        final Pattern a = this.G.a(s);
        a(sb);
        if (this.a(a, sb)) {
            return Phonenumber$PhoneNumber$CountryCodeSource.b;
        }
        return Phonenumber$PhoneNumber$CountryCodeSource.d;
    }
    
    public Phonenumber$PhoneNumber a(final String s, final String s2) {
        final Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
        this.a(s, s2, phonenumber$PhoneNumber);
        return phonenumber$PhoneNumber;
    }
    
    public String a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        final StringBuilder sb = new StringBuilder();
        if (phonenumber$PhoneNumber.f()) {
            final char[] array = new char[phonenumber$PhoneNumber.h()];
            Arrays.fill(array, '0');
            sb.append(new String(array));
        }
        sb.append(phonenumber$PhoneNumber.b());
        return sb.toString();
    }
    
    public String a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber, final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat) {
        if (phonenumber$PhoneNumber.b() == 0L && phonenumber$PhoneNumber.i()) {
            final String j = phonenumber$PhoneNumber.j();
            if (j.length() > 0) {
                return j;
            }
        }
        final StringBuilder sb = new StringBuilder(20);
        this.a(phonenumber$PhoneNumber, phoneNumberUtil$PhoneNumberFormat, sb);
        return sb.toString();
    }
    
    public void a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber, final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat, final StringBuilder sb) {
        sb.setLength(0);
        final int a = phonenumber$PhoneNumber.a();
        final String a2 = this.a(phonenumber$PhoneNumber);
        if (phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.a) {
            sb.append(a2);
            this.a(a, PhoneNumberUtil$PhoneNumberFormat.a, sb);
            return;
        }
        if (!this.c(a)) {
            sb.append(a2);
            return;
        }
        final Phonemetadata$PhoneMetadata a3 = this.a(a, this.b(a));
        sb.append(this.a(a2, a3, phoneNumberUtil$PhoneNumberFormat));
        this.a(phonenumber$PhoneNumber, a3, phoneNumberUtil$PhoneNumberFormat, sb);
        this.a(a, phoneNumberUtil$PhoneNumberFormat, sb);
    }
    
    void a(final String s, final String s2, final int n, final c c) {
        final boolean equals = "001".equals(s2);
        final String value = String.valueOf(String.valueOf(s));
        String value2;
        if (equals) {
            value2 = String.valueOf(n);
        }
        else {
            value2 = s2;
        }
        final String value3 = String.valueOf(String.valueOf(value2));
        final String string = new StringBuilder(1 + value.length() + value3.length()).append(value).append("_").append(value3).toString();
        final InputStream a = c.a(string);
        if (a == null) {
            final Logger g = PhoneNumberUtil.g;
            final Level severe = Level.SEVERE;
            final String value4 = String.valueOf(string);
            String concat;
            if (value4.length() != 0) {
                concat = "missing metadata: ".concat(value4);
            }
            else {
                concat = new String("missing metadata: ");
            }
            g.log(severe, concat);
            final String value5 = String.valueOf(string);
            String concat2;
            if (value5.length() != 0) {
                concat2 = "missing metadata: ".concat(value5);
            }
            else {
                concat2 = new String("missing metadata: ");
            }
            throw new IllegalStateException(concat2);
        }
        List a2;
        Logger g2;
        Level severe2;
        String value6;
        String concat3;
        String value7;
        String concat4;
        Logger g3;
        Level severe3;
        String value8;
        String concat5;
        String value9;
        String concat6;
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata;
        Logger g4;
        Level warning;
        String value10;
        String concat7;
        Block_14_Outer:Label_0487_Outer:
        while (true) {
            Label_0417: {
                try {
                    a2 = a(new ObjectInputStream(a)).a();
                    if (!a2.isEmpty()) {
                        break Block_14_Outer;
                    }
                    g2 = PhoneNumberUtil.g;
                    severe2 = Level.SEVERE;
                    value6 = String.valueOf(string);
                    if (value6.length() == 0) {
                        break Block_14_Outer;
                    }
                    concat3 = "empty metadata: ".concat(value6);
                    g2.log(severe2, concat3);
                    value7 = String.valueOf(string);
                    if (value7.length() != 0) {
                        concat4 = "empty metadata: ".concat(value7);
                        throw new IllegalStateException(concat4);
                    }
                    break Label_0417;
                }
                catch (IOException ex) {
                    g3 = PhoneNumberUtil.g;
                    severe3 = Level.SEVERE;
                    value8 = String.valueOf(string);
                    if (value8.length() != 0) {
                        concat5 = "cannot load/parse metadata: ".concat(value8);
                    }
                    else {
                        concat5 = new String("cannot load/parse metadata: ");
                    }
                    g3.log(severe3, concat5, ex);
                    value9 = String.valueOf(string);
                    if (value9.length() != 0) {
                        concat6 = "cannot load/parse metadata: ".concat(value9);
                    }
                    else {
                        concat6 = new String("cannot load/parse metadata: ");
                    }
                    throw new RuntimeException(concat6, ex);
                    concat3 = new String("empty metadata: ");
                    continue Block_14_Outer;
                    concat4 = new String("empty metadata: ");
                    throw new IllegalStateException(concat4);
                    // iftrue(Label_0537:, !equals)
                Block_12_Outer:
                    while (true) {
                        while (true) {
                            this.F.put(n, phonemetadata$PhoneMetadata);
                            return;
                            phonemetadata$PhoneMetadata = a2.get(0);
                            continue Label_0487_Outer;
                        }
                        Label_0537: {
                            this.E.put(s2, phonemetadata$PhoneMetadata);
                        }
                        return;
                    Label_0478:
                        while (true) {
                            g4 = PhoneNumberUtil.g;
                            warning = Level.WARNING;
                            value10 = String.valueOf(string);
                            concat7 = "invalid metadata (too many entries): ".concat(value10);
                            break Label_0478;
                            Label_0522:
                            concat7 = new String("invalid metadata (too many entries): ");
                            break Label_0478;
                            continue;
                        }
                        g4.log(warning, concat7);
                        continue Block_12_Outer;
                    }
                }
                // iftrue(Label_0522:, value10.length() == 0)
                // iftrue(Label_0487:, a2.size() <= 1)
            }
            break;
        }
    }
    
    public void a(final String s, final String s2, final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        this.a(s, s2, false, true, phonenumber$PhoneNumber);
    }
    
    public boolean a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber, final String s) {
        final int a = phonenumber$PhoneNumber.a();
        final Phonemetadata$PhoneMetadata a2 = this.a(a, s);
        return a2 != null && ("001".equals(s) || a == this.k(s)) && this.a(this.a(phonenumber$PhoneNumber), a2) != PhoneNumberUtil$PhoneNumberType.l;
    }
    
    boolean a(final String s, final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        return this.G.a(phonemetadata$PhoneNumberDesc.b()).matcher(s).matches();
    }
    
    boolean a(final StringBuilder sb, final Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, final StringBuilder sb2) {
        final int length = sb.length();
        final String r = phonemetadata$PhoneMetadata.r();
        if (length != 0 && r.length() != 0) {
            final Matcher matcher = this.G.a(r).matcher(sb);
            if (matcher.lookingAt()) {
                final Pattern a = this.G.a(phonemetadata$PhoneMetadata.a().a());
                final boolean matches = a.matcher(sb).matches();
                final int groupCount = matcher.groupCount();
                final String s = phonemetadata$PhoneMetadata.s();
                if (s == null || s.length() == 0 || matcher.group(groupCount) == null) {
                    if (!matches || a.matcher(sb.substring(matcher.end())).matches()) {
                        if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                            sb2.append(matcher.group(1));
                        }
                        sb.delete(0, matcher.end());
                        return true;
                    }
                }
                else {
                    final StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(s));
                    if (!matches || a.matcher(sb3.toString()).matches()) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public String b(final int n) {
        final List<String> list = this.C.get(n);
        if (list == null) {
            return "ZZ";
        }
        return list.get(0);
    }
    
    String b(final StringBuilder sb) {
        final Matcher matcher = PhoneNumberUtil.u.matcher(sb);
        if (matcher.find() && b(sb.substring(0, matcher.start()))) {
            for (int i = 1; i <= matcher.groupCount(); ++i) {
                if (matcher.group(i) != null) {
                    final String group = matcher.group(i);
                    sb.delete(matcher.start(), sb.length());
                    return group;
                }
            }
        }
        return "";
    }
    
    public boolean b(final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        return this.a(phonenumber$PhoneNumber, this.c(phonenumber$PhoneNumber));
    }
    
    boolean b(final String s, final Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        final Matcher matcher = this.G.a(phonemetadata$PhoneNumberDesc.a()).matcher(s);
        return this.a(s, phonemetadata$PhoneNumberDesc) && matcher.matches();
    }
    
    public String c(final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        final int a = phonenumber$PhoneNumber.a();
        final List<String> list = this.C.get(a);
        if (list == null) {
            final String a2 = this.a(phonenumber$PhoneNumber);
            final Logger g = PhoneNumberUtil.g;
            final Level warning = Level.WARNING;
            final String value = String.valueOf(String.valueOf(a2));
            g.log(warning, new StringBuilder(54 + value.length()).append("Missing/invalid country_code (").append(a).append(") for number ").append(value).toString());
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return this.a(phonenumber$PhoneNumber, list);
    }
    
    Phonemetadata$PhoneMetadata f(final String s) {
        if (!this.j(s)) {
            return null;
        }
        synchronized (this.E) {
            if (!this.E.containsKey(s)) {
                this.a(this.J, s, 0, this.K);
            }
            // monitorexit(this.E)
            return this.E.get(s);
        }
    }
    
    public int g(String s) {
        if (!this.j(s)) {
            final Logger g = PhoneNumberUtil.g;
            final Level warning = Level.WARNING;
            if (s == null) {
                s = "null";
            }
            final String value = String.valueOf(String.valueOf(s));
            g.log(warning, new StringBuilder(43 + value.length()).append("Invalid or missing region code (").append(value).append(") provided.").toString());
            return 0;
        }
        return this.k(s);
    }
    
    public a h(final String s) {
        return new a(s);
    }
}
