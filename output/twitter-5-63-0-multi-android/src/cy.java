import java.util.Iterator;
import com.twitter.library.util.text.d;
import com.twitter.library.api.search.TwitterTypeAhead;
import com.twitter.android.provider.a;
import java.util.Collection;
import java.util.regex.Pattern;
import com.twitter.library.util.bq;
import java.util.HashSet;
import com.twitter.library.api.TwitterUser;
import android.text.TextUtils;
import com.twitter.android.provider.SuggestionsProvider;
import com.twitter.library.api.search.TwitterTypeAheadGroup;
import android.database.Cursor;
import com.twitter.android.cw;
import com.twitter.library.provider.c;
import com.twitter.library.api.conversations.aa;
import java.util.ArrayList;
import com.twitter.library.provider.bg;
import com.twitter.android.client.bz;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class cy extends dn
{
    private final long c;
    private List d;
    
    public cy(final Context context, final dj dj, final long c) {
        super(context, 1, bz.g(), true, dj);
        this.c = c;
    }
    
    public static String a(final String s) {
        return s.substring(0, -1 + s.length());
    }
    
    public static String a(final String s, final boolean b) {
        final StringBuilder append = new StringBuilder().append(s);
        char c;
        if (b) {
            c = '0';
        }
        else {
            c = '1';
        }
        return append.append(c).toString();
    }
    
    private void a(final bg bg) {
        Label_0121: {
            final c c;
            synchronized (this) {
                if (this.d != null) {
                    break Label_0121;
                }
                this.d = new ArrayList();
                final Cursor query = bg.getReadableDatabase().query("dm_inbox", aa.a, (String)null, (String[])null, (String)null, (String)null, "sort_event_id DESC");
                if (query == null) {
                    break Label_0121;
                }
                c = new c(query, this.c, this.a, null, false);
                try {
                    while (c.moveToNext()) {
                        this.d.add(new cw(this.a, c, this.c));
                    }
                }
                finally {
                    c.close();
                }
            }
            c.close();
        }
    }
    // monitorexit(this)
    
    public static boolean b(final String s) {
        return s.charAt(-1 + s.length()) == '1';
    }
    
    protected void a(final String s, final TwitterTypeAheadGroup twitterTypeAheadGroup) {
        SuggestionsProvider.a(this.d(s), twitterTypeAheadGroup.a);
    }
    
    protected ln b(final String s, final boolean b) {
        final bg a = bg.a(this.a, this.c);
        this.a(a);
        final boolean b2 = b(s);
        final String a2 = a(s);
        final boolean empty = TextUtils.isEmpty((CharSequence)a2);
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        final HashSet<Long> set = new HashSet<Long>();
        if (b2) {
            final ArrayList<TwitterUser> list2 = new ArrayList<TwitterUser>();
            final ArrayList<TwitterUser> list3 = new ArrayList<TwitterUser>();
            for (final cw cw : this.d) {
                int n = 0;
                int n2 = 0;
                Label_0263: {
                    if (!empty) {
                        final Pattern compile = Pattern.compile("(?i:.*\\b" + bq.a(a2) + ".*)");
                        final String d = cw.d;
                        while (true) {
                            for (final TwitterUser twitterUser : cw.l) {
                                if (twitterUser.a() != this.c && (compile.matcher(twitterUser.name).matches() || compile.matcher(twitterUser.username).matches())) {
                                    final int n3 = 1;
                                    final boolean matches = compile.matcher(d).matches();
                                    n2 = n3;
                                    n = (matches ? 1 : 0);
                                    break Label_0263;
                                }
                            }
                            final int n3 = 0;
                            continue;
                        }
                    }
                }
                if (cw.k && (empty || n2 != 0 || n != 0)) {
                    list2.add((TwitterUser)cw);
                }
                else if (cw.l.size() > 0 && (empty || n2 != 0)) {
                    final TwitterUser twitterUser2 = cw.l.get(0);
                    list3.add(twitterUser2);
                    set.add(twitterUser2.userId);
                }
                if (list2.size() + list3.size() == this.b) {
                    break;
                }
            }
            list.addAll((Collection<?>)list3);
            list.addAll((Collection<?>)list2);
        }
        if (list.size() < this.b) {
            for (final TwitterUser twitterUser3 : a.a(a2, 8, this.b - list.size())) {
                if (!set.contains(twitterUser3.userId)) {
                    list.add(twitterUser3);
                    set.add(twitterUser3.userId);
                }
            }
        }
        final List b3 = SuggestionsProvider.b(a2);
        if (b3 != null) {
            for (final TwitterTypeAhead twitterTypeAhead : xy.a(b3, new a())) {
                if (list.size() < this.b && !set.contains(twitterTypeAhead.e.userId)) {
                    list.add(twitterTypeAhead.e);
                }
            }
        }
        final String a3 = bq.a(a2);
        if (!TextUtils.isEmpty((CharSequence)a3) && com.twitter.library.util.text.d.b.matcher(a3).matches()) {
            list.add((TwitterUser)a3);
        }
        return new lq(list);
    }
    
    protected boolean c(final String s) {
        return !TextUtils.isEmpty((CharSequence)s);
    }
    
    protected String d(final String s) {
        return a(s);
    }
}
