import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import java.util.Locale;
import java.util.Iterator;
import java.util.Collection;
import java.security.cert.CertificateParsingException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.security.cert.X509Certificate;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

// 
// Decompiled by Procyon v0.5.30
// 

public final class cg implements HostnameVerifier
{
    public static final cg a;
    private static final Pattern b;
    
    static {
        a = new cg();
        b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }
    
    private List a(final X509Certificate x509Certificate, final int n) {
        final ArrayList<String> list = new ArrayList<String>();
        try {
            final Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (final List<Integer> list2 : subjectAlternativeNames) {
                if (list2 != null && list2.size() >= 2) {
                    final Integer n2 = list2.get(0);
                    if (n2 == null || n2 != n) {
                        continue;
                    }
                    final String s = (String)list2.get(1);
                    if (s == null) {
                        continue;
                    }
                    list.add(s);
                }
            }
        }
        catch (CertificateParsingException ex) {
            return Collections.emptyList();
        }
        return list;
    }
    
    static boolean a(final String s) {
        return cg.b.matcher(s).matches();
    }
    
    private boolean b(final String s, final X509Certificate x509Certificate) {
        final Iterator<String> iterator = this.a(x509Certificate, 7).iterator();
        while (iterator.hasNext()) {
            if (s.equalsIgnoreCase(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    private boolean c(final String s, final X509Certificate x509Certificate) {
        final String lowerCase = s.toLowerCase(Locale.US);
        final Iterator<String> iterator = (Iterator<String>)this.a(x509Certificate, 2).iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            if (this.a(lowerCase, iterator.next())) {
                return true;
            }
            b = true;
        }
        if (!b) {
            final String a = new cf(x509Certificate.getSubjectX500Principal()).a("cn");
            if (a != null) {
                return this.a(lowerCase, a);
            }
        }
        return false;
    }
    
    public boolean a(final String s, final String s2) {
        boolean b = true;
        if (s == null || s.length() == 0 || s2 == null || s2.length() == 0) {
            b = false;
        }
        else {
            final String lowerCase = s2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return s.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || !s.regionMatches(0, lowerCase, 2, -2 + lowerCase.length())) {
                final int index = lowerCase.indexOf(42);
                if (index > lowerCase.indexOf(46)) {
                    return false;
                }
                if (!s.regionMatches(0, lowerCase, 0, index)) {
                    return false;
                }
                final int n = lowerCase.length() - (index + 1);
                final int n2 = s.length() - n;
                if (s.indexOf(46, index) < n2 && !s.endsWith(".clients.google.com")) {
                    return false;
                }
                if (!s.regionMatches(n2, lowerCase, index + 1, n)) {
                    return false;
                }
            }
        }
        return b;
    }
    
    public boolean a(final String s, final X509Certificate x509Certificate) {
        if (a(s)) {
            return this.b(s, x509Certificate);
        }
        return this.c(s, x509Certificate);
    }
    
    @Override
    public boolean verify(final String s, final SSLSession sslSession) {
        try {
            return this.a(s, (X509Certificate)sslSession.getPeerCertificates()[0]);
        }
        catch (SSLException ex) {
            return false;
        }
    }
}
