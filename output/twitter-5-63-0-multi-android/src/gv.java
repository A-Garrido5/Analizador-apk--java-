import java.util.Collections;
import com.twitter.android.widget.TopicView$TopicData;
import java.util.Iterator;
import com.twitter.library.api.TwitterSearchFilter;
import com.twitter.android.hm;
import com.twitter.android.client.bh;
import com.twitter.library.api.TwitterSearchHighlight;
import com.twitter.library.api.TwitterSearchSummary;
import com.twitter.library.api.TwitterSearchSuggestion;
import com.twitter.util.f;
import com.twitter.android.events.b;
import android.preference.PreferenceManager;
import com.twitter.library.featureswitch.d;
import android.text.TextUtils;
import com.twitter.library.provider.cc;
import com.twitter.android.ro;
import java.util.ArrayList;
import android.database.Cursor;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class gv
{
    private final Context a;
    private final String b;
    private final String c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private boolean h;
    private long i;
    
    public gv(final Context a, final String b, final String c, final boolean f, final int d, final long i, final boolean h, final boolean g, final boolean e) {
        this.a = a;
        this.d = d;
        this.f = f;
        this.c = c;
        this.b = b;
        this.i = i;
        this.h = h;
        this.g = g;
        this.e = e;
    }
    
    private static int a(final int n) {
        switch (n) {
            default: {
                return n;
            }
            case 4: {
                return 0;
            }
            case 14: {
                return 6;
            }
            case 16: {
                return 3;
            }
            case 29:
            case 30: {
                return 12;
            }
            case 15: {
                return 9;
            }
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25: {
                return 17;
            }
            case 26: {
                return 7;
            }
            case 31:
            case 32: {
                return 10;
            }
        }
    }
    
    private ro a(final List list, final Cursor cursor, final ArrayList list2, final ro ro, final String s, final String s2, final int n, final boolean b, final boolean b2, final int n2, final int n3, int n4) {
        if (n3 >= n2 && !list2.isEmpty()) {
            xa k;
            if (!this.f && s2 != null && cursor.moveToPrevious()) {
                final xa xa = new xa(cursor.getString(cc.m), cursor.getInt(cc.n), cursor.getString(cc.o), cursor.getString(cc.p), cursor.getLong(cc.q), cursor.getLong(cc.r));
                xa.a = cursor.getLong(0);
                cursor.moveToNext();
                k = xa;
            }
            else {
                k = null;
            }
            if (s2 != null) {
                if (n4 == 7) {
                    n4 = 20;
                }
                else if (n4 == 6) {
                    n4 = 22;
                }
                else if (n4 == 10) {
                    n4 = 23;
                }
            }
            while (true) {
                Label_2000: {
                    if ((n4 != 0 && n4 != 23) || TextUtils.isEmpty((CharSequence)this.b) || !com.twitter.library.featureswitch.d.f("recommendations_opt_out_enabled") || !com.twitter.library.featureswitch.d.h("recommendations_opt_out_supported_types").contains(this.b) || PreferenceManager.getDefaultSharedPreferences(this.a).getInt(this.b + "_opt_out_count", 0) >= com.twitter.library.featureswitch.d.a("recommendations_opt_out_max_views", 0)) {
                        break Label_2000;
                    }
                    final long c = list2.get(0).c;
                    if (c != this.i && this.i != -1L) {
                        break Label_2000;
                    }
                    this.i = c;
                    final ro a = this.a(list, ro, s, -1L, 27, n, 0, 0);
                    ro ro2 = null;
                    Label_0348: {
                        if (b && k != null && k.d()) {
                            switch (n4) {
                                case 23: {
                                    final ro a2 = this.a(list, a, s, -1L, 18, n, 0, 0);
                                    a2.k = k;
                                    ro2 = a2;
                                    break Label_0348;
                                }
                                case 20: {
                                    final ro a3 = this.a(list, a, s, -1L, 19, n, 0, 0);
                                    a3.k = k;
                                    ro2 = a3;
                                    break Label_0348;
                                }
                                case 22: {
                                    final ro a4 = this.a(list, a, s, -1L, 19, n, 0, 0);
                                    a4.k = k;
                                    ro2 = a4;
                                    break Label_0348;
                                }
                            }
                        }
                        ro2 = a;
                    }
                    ro ro3 = null;
                    Label_0510: {
                        switch (n4) {
                            default: {
                                if (this.d != 8 || !b.b(this.c)) {
                                    ro2 = this.a(list, ro2, list2.get(0).b, n4, n, n2, n3);
                                    ro2.k = k;
                                    break;
                                }
                                break;
                            }
                            case 6: {
                                ro2 = this.a(list, ro2, list2.get(0).b, 6, n, n2, n3);
                                final Iterator<gw> iterator = list2.iterator();
                                int n5 = 0;
                                while (iterator.hasNext()) {
                                    final Boolean b3 = (Boolean)com.twitter.util.f.a(iterator.next().a);
                                    int n6;
                                    if (b3 != null && b3) {
                                        n6 = n5 + 1;
                                    }
                                    else {
                                        n6 = n5;
                                    }
                                    n5 = n6;
                                }
                                if (n5 != 0 && n5 == 1 + (n3 - n2)) {
                                    ro3 = this.a(list, ro2, -1L, 14, n, 0, 0);
                                    break Label_0510;
                                }
                                break;
                            }
                            case 8: {
                                ro3 = this.a(list, ro2, list2.get(0).b, 8, n, 0, 0);
                                break Label_0510;
                            }
                            case 3: {
                                ro ro4 = this.a(list, ro2, -1L, 16, n, 0, 0);
                                for (final gw gw : list2) {
                                    if (gw.a != null) {
                                        final String i = (String)com.twitter.util.f.a(gw.a);
                                        if (i == null) {
                                            continue;
                                        }
                                        ro4 = this.a(list, ro4, gw.b, 3, n, 0, 0);
                                        ro4.i = i;
                                    }
                                }
                                ro3 = ro4;
                                break Label_0510;
                            }
                            case 2: {
                                final gw gw2 = list2.get(0);
                                if (gw2.a != null) {
                                    final TwitterSearchSuggestion h = (TwitterSearchSuggestion)com.twitter.util.f.a(gw2.a);
                                    if (h != null) {
                                        ro2 = this.a(list, ro2, gw2.b, n4, n, n2, n3);
                                        ro2.h = h;
                                    }
                                    ro3 = ro2;
                                    break Label_0510;
                                }
                                break;
                            }
                            case 12: {
                                final gw gw3 = list2.get(0);
                                if (gw3.a != null) {
                                    final TwitterSearchSummary m = (TwitterSearchSummary)com.twitter.util.f.a(gw3.a);
                                    if (m != null) {
                                        if (m.b()) {
                                            ro2 = this.a(list, ro2, -1L, 29, n, 0, 0);
                                            ro2.m = m;
                                            for (int j = n2; j <= n3; ++j) {
                                                ro2 = this.a(list, ro2, list2.get(j - n2).b, 30, n, 0, 0);
                                                ro2.m = m;
                                            }
                                        }
                                        else {
                                            ro2 = this.a(list, ro2, gw3.b, n4, n, n2, n3);
                                            ro2.m = m;
                                        }
                                    }
                                    ro3 = ro2;
                                    break Label_0510;
                                }
                                break;
                            }
                            case 9: {
                                final gw gw4 = list2.get(0);
                                ro2 = this.a(list, ro2, gw4.b, n4, n, n2, n3);
                                if (gw4.a != null) {
                                    final TwitterSearchHighlight l = (TwitterSearchHighlight)com.twitter.util.f.a(gw4.a);
                                    if (l != null) {
                                        ro2 = this.a(list, ro2, -1L, 15, n, n2, n3);
                                        ro2.j = l;
                                    }
                                    ro3 = ro2;
                                    break Label_0510;
                                }
                                break;
                            }
                            case 10: {
                                ro3 = this.a(list, ro2, s, list2.get(0).b, 32, n, n2, n2);
                                for (int n7 = n2 + 1; n7 <= n3; ++n7) {
                                    ro3 = this.a(list, ro3, s, list2.get(n7 - n2).b, 32, n, n7, n7);
                                }
                                break Label_0510;
                            }
                            case 23: {
                                ro3 = this.a(list, ro2, s, list2.get(0).b, 24, n, n2, n2);
                                for (int n8 = n2 + 1; n8 <= n3; ++n8) {
                                    ro3 = this.a(list, ro3, s, list2.get(n8 - n2).b, 24, n, n8, n8);
                                }
                                break Label_0510;
                            }
                            case 7: {
                                if (!bh.a(this.a).c() || com.twitter.library.featureswitch.d.f("twitter_access_android_media_forward_enabled")) {
                                    ro3 = this.a(list, this.a(list, ro2, s, list2.get(0).b, n4, n, n2, n3), -1L, 26, n, 0, 0);
                                    break Label_0510;
                                }
                                break;
                            }
                            case 20: {
                                if (!bh.a(this.a).c() || com.twitter.library.featureswitch.d.f("twitter_access_android_media_forward_enabled")) {
                                    ro3 = this.a(list, ro2, s, list2.get(0).b, n4, n, n2, n3);
                                    break Label_0510;
                                }
                                break;
                            }
                            case 22: {
                                ro3 = this.a(list, ro2, s, list2.get(0).b, n4, n, n2, n3);
                                break Label_0510;
                            }
                            case 11: {
                                if (this.h || this.g) {
                                    final int position = cursor.getPosition();
                                    cursor.moveToPosition(n2);
                                    final TopicView$TopicData b4 = this.b(cursor);
                                    cursor.moveToPosition(position);
                                    if (this.h || this.c.equals(b4.a)) {
                                        if (this.a instanceof hm) {
                                            ((hm)this.a).a(b4);
                                            this.h = false;
                                        }
                                        if (this.e) {
                                            ro3 = ro2;
                                            break Label_0510;
                                        }
                                    }
                                }
                                int n9 = n2;
                                ro3 = ro2;
                                while (n9 <= n3) {
                                    if (cursor.moveToPosition(n9)) {
                                        final String string = cursor.getString(cc.y);
                                        if (this.d == 8 || (!b.b(string) && !b.d(string))) {
                                            ro3 = this.a(list, ro3, s, list2.get(n9 - n2).b, ro.a(cursor.getInt(cc.z)), n, n9, n9);
                                            final String string2 = cursor.getString(cc.F);
                                            if ("IN_PROGRESS".equals(string2) || "SCHEDULED".equals(string2)) {
                                                ro3.n = true;
                                            }
                                        }
                                    }
                                    ++n9;
                                }
                                cursor.moveToPosition(n3 + 1);
                                break Label_0510;
                            }
                            case 13: {
                                ro3 = ro2;
                                break Label_0510;
                            }
                        }
                        ro3 = ro2;
                    }
                    if (!b2) {
                        return ro3;
                    }
                    switch (n4) {
                        default: {
                            return ro3;
                        }
                        case 10: {
                            final ro a5 = this.a(list, ro3, s, -1L, 31, n, 0, 0);
                            a5.l = (TwitterSearchFilter)com.twitter.util.f.a(list2.get(0).a);
                            return a5;
                        }
                        case 20:
                        case 22:
                        case 23: {
                            final ro a6 = this.a(list, ro3, s, -1L, 25, n, 0, 0);
                            a6.k = k;
                            a6.l = (TwitterSearchFilter)com.twitter.util.f.a(list2.get(0).a);
                            return a6;
                        }
                    }
                }
                final ro a = ro;
                continue;
            }
        }
        return ro;
    }
    
    private ro a(final List list, final ro ro, final long n, final int n2, final int n3, final int n4, final int n5) {
        return this.a(list, ro, null, n, n2, n3, n4, n5);
    }
    
    private ro a(final List list, final ro ro, final String s, final long n, final int n2, final int n3, final int n4, final int n5) {
        final ro ro2 = new ro(n, n2, n3, n4, n5, s);
        a(ro2, ro, this.d);
        list.add(ro2);
        return ro2;
    }
    
    private static void a(final ro ro) {
        if (ro != null) {
            if (ro.g != 1) {
                ro.g = 3;
                return;
            }
            ro.g = 4;
        }
    }
    
    private static void a(final ro ro, final ro ro2, final int n) {
        final int b = ro.b;
        final String f = ro.f;
        int b2;
        String f2;
        if (ro2 != null) {
            b2 = ro2.b;
            f2 = ro2.f;
        }
        else {
            b2 = -1;
            f2 = null;
        }
        if (b == 24) {
            ro.g = 0;
            return;
        }
        if (b == 7) {
            ro.g = 5;
            a(ro2);
            return;
        }
        if (b == 29) {
            ro.g = 3;
            return;
        }
        if (b2 == 27) {
            ro.g = 2;
            return;
        }
        if (b2 != -1 && !a(f2, f, b, b2)) {
            ro.g = 1;
            a(ro2);
            return;
        }
        if (n == 8 && ro2 != null) {
            ro.g = 1;
            return;
        }
        ro.g = 2;
    }
    
    private static boolean a(final String s, final String s2, final int n, final int n2) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            final boolean empty = TextUtils.isEmpty((CharSequence)s2);
            boolean b = false;
            if (empty) {
                final int a = a(n2);
                final int a2 = a(n);
                b = false;
                if (a == a2) {
                    b = true;
                }
            }
            return b;
        }
        return s.equals(s2);
    }
    
    private TopicView$TopicData b(final Cursor cursor) {
        return new TopicView$TopicData(cursor.getString(cc.y), cursor.getInt(cc.z), cursor.getString(cc.B), cursor.getString(cc.C), cursor.getString(cc.G), cursor.getString(cc.H), cursor.getString(cc.A), cursor.getString(cc.E), cursor.getString(cc.D), cursor.getInt(cc.I), cursor.getLong(cc.J), cursor.getBlob(cc.K), cursor.getString(cc.F));
    }
    
    public List a(final Cursor cursor) {
        ro ro = null;
        if (cursor != null && cursor.moveToFirst()) {
            final ArrayList list = new ArrayList(cursor.getCount());
            int n = 0;
            final ArrayList<gw> list2 = new ArrayList<gw>();
            int n2 = -1;
            int n3 = -1;
            String s = null;
            String s2 = null;
            boolean b = true;
            int n4 = 0;
            int int1;
            int int2;
            String string;
            String s3;
            ro a;
            boolean b3;
            int n5;
            while (true) {
                int1 = cursor.getInt(cc.c);
                int2 = cursor.getInt(cc.d);
                string = cursor.getString(cc.m);
                if (int1 == 10 || int1 == 7 || int1 == 6) {
                    s3 = string;
                }
                else {
                    s3 = null;
                }
                if (n3 != int2) {
                    final boolean b2 = !a(s, s3, int1, n2);
                    a = this.a(list, cursor, list2, ro, s, s2, n3, b, b2, n, n4 - 1, n2);
                    list2.clear();
                    b3 = b2;
                    n = n4;
                }
                else {
                    b3 = b;
                    a = ro;
                }
                list2.add(new gw(cursor.getBlob(cc.e), cursor.getLong(0), cursor.getLong(1)));
                n5 = n4 + 1;
                if (!cursor.moveToNext()) {
                    break;
                }
                b = b3;
                s2 = string;
                s = s3;
                n3 = int2;
                n4 = n5;
                ro = a;
                n2 = int1;
            }
            a(this.a(list, cursor, list2, a, s3, string, int2, b3, false, n, n5 - 1, int1));
            return list;
        }
        return Collections.EMPTY_LIST;
    }
}
