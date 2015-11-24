// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.ui.widget.PromptView;
import android.support.v4.content.CursorLoader;
import com.twitter.library.util.k;
import com.twitter.library.provider.ae;
import com.twitter.android.client.bv;
import com.twitter.android.widget.ec;
import android.app.Activity;
import android.widget.AbsListView;
import com.twitter.library.widget.BaseUserView;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import com.twitter.library.service.ab;
import java.util.Iterator;
import com.twitter.library.api.g;
import com.twitter.library.api.l;
import com.twitter.android.client.x;
import com.twitter.library.platform.PushService;
import com.twitter.library.util.bq;
import android.widget.Toast;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.util.collection.CollectionUtils;
import java.util.Collection;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.twitter.android.util.am;
import android.widget.Button;
import com.twitter.android.util.ap;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.database.Cursor;
import com.twitter.library.api.PromotedEvent;
import java.io.Serializable;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.api.z;
import com.twitter.library.service.y;
import com.twitter.android.widget.al;
import android.widget.ListView;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.Session;
import android.widget.ListAdapter;
import com.twitter.android.widget.fb;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
import android.content.Intent;
import java.util.Map;
import android.widget.BaseAdapter;
import android.text.TextUtils;
import com.twitter.library.provider.az;
import com.twitter.library.provider.ao;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import com.twitter.library.provider.cw;
import com.twitter.library.featureswitch.d;
import android.content.Context;
import com.twitter.library.util.n;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.widget.ez;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.UserView;
import com.twitter.library.api.PromotedContent;
import java.util.HashMap;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import android.net.Uri;
import java.util.HashSet;
import android.content.BroadcastReceiver;
import com.twitter.ui.dialog.e;
import com.twitter.library.widget.c;
import com.twitter.android.widget.eb;
import android.view.View$OnClickListener;
import com.twitter.android.widget.ScrollingHeaderListFragment;

public class UsersFragment extends ScrollingHeaderListFragment implements View$OnClickListener, hj, mz, td, te, eb, c, e
{
    private static BroadcastReceiver B;
    boolean A;
    private final HashSet C;
    private Uri D;
    private long[] E;
    private boolean F;
    private FollowFlowController G;
    private String[] H;
    private String I;
    private String J;
    private String[] K;
    private String L;
    private ArrayList M;
    private HashSet N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    protected boolean a;
    private int aA;
    private TextView aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean ao;
    private boolean ap;
    private ArrayList aq;
    private int ar;
    private View as;
    private boolean at;
    private int au;
    private int av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private yy az;
    protected int b;
    final HashMap c;
    long d;
    String e;
    PromotedContent f;
    UserView g;
    long h;
    boolean i;
    HashSet j;
    ArrayList k;
    FriendshipCache l;
    HashMap m;
    yw n;
    yu o;
    String p;
    ez q;
    sx r;
    TwitterUser s;
    int t;
    int u;
    int v;
    boolean w;
    boolean x;
    int y;
    boolean z;
    
    public UsersFragment() {
        this.a = true;
        this.c = new HashMap();
        this.i = true;
        this.j = new HashSet();
        this.o = new yx(null);
        this.t = -1;
        this.C = new HashSet();
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.au = 0;
        this.av = 0;
    }
    
    private void P() {
        this.aw = com.twitter.library.util.n.a((Context)this.getActivity()).b();
    }
    
    private boolean Q() {
        return this.u == 21;
    }
    
    private boolean R() {
        return com.twitter.library.featureswitch.d.f("profile_follows_sms_enabled") && this.aA > 0;
    }
    
    private void S() {
        if (this.q == null) {
            final Session af = this.aF();
            final boolean d = af.d();
            final FragmentActivity activity = this.getActivity();
            final Bundle arguments = this.getArguments();
            final ListView y = this.Y();
            String[] h = cw.a;
            String i;
            if (y.getChoiceMode() != 0) {
                i = "LOWER(username) ASC";
            }
            else {
                i = "_id ASC";
            }
            int n = 0;
            final long g = af.g();
            switch (this.u) {
                default: {
                    this.D = ContentUris.withAppendedId(be.j, this.X);
                    break;
                }
                case 0: {
                    this.D = ContentUris.withAppendedId(be.g, this.X);
                    h = cw.b;
                    n = 0;
                    break;
                }
                case 1: {
                    this.D = ContentUris.withAppendedId(be.h, this.X);
                    h = cw.b;
                    n = 0;
                    break;
                }
                case 29: {
                    this.D = ContentUris.withAppendedId(be.i, this.X);
                    h = cw.b;
                    n = 0;
                    break;
                }
                case 2: {
                    this.D = ContentUris.withAppendedId(be.f, this.X);
                    n = 0;
                    break;
                }
                case 10: {
                    this.D = ContentUris.withAppendedId(be.y, this.X);
                    h = cw.b;
                    n = 0;
                    break;
                }
                case 4: {
                    if (this.h > 0L && this.X > 0L) {
                        this.D = ContentUris.withAppendedId(be.c, this.X);
                    }
                    n = 0;
                    if (!d) {
                        break;
                    }
                    final long n2 = lcmp(this.X, g);
                    n = 0;
                    if (n2 == 0) {
                        n = 2130838839;
                        break;
                    }
                    break;
                }
                case 32: {
                    String[] b;
                    if (this.K != null) {
                        this.D = ContentUris.withAppendedId(be.n, this.X);
                        b = h;
                    }
                    else {
                        this.D = ContentUris.withAppendedId(be.A, this.X);
                        b = cw.b;
                    }
                    h = b;
                    i = "LOWER(name) ASC";
                    n = 0;
                    break;
                }
                case 6: {
                    this.D = ContentUris.withAppendedId(be.n, this.X);
                    n = 0;
                    break;
                }
                case 5: {
                    this.D = ContentUris.withAppendedId(be.b, this.X);
                    n = 0;
                    break;
                }
                case 7: {
                    this.D = ContentUris.withAppendedId(be.k, this.X);
                    i = "(friendship & 1) ASC, LOWER(name) ASC";
                    n = 0;
                    break;
                }
                case 28: {
                    this.D = ContentUris.withAppendedId(be.w, this.X);
                    i = "(friendship & 1) ASC, LOWER(name) ASC";
                    n = 0;
                    break;
                }
                case 9: {
                    this.D = ContentUris.withAppendedId(com.twitter.library.provider.ao.b, this.X);
                    h = cw.d;
                    n = 0;
                    break;
                }
                case 21: {
                    this.D = ContentUris.withAppendedId(be.x, this.X);
                    h = cw.b;
                    n = 0;
                    break;
                }
                case 27: {
                    this.D = com.twitter.library.provider.az.b.buildUpon().appendQueryParameter("limit", "20").build();
                    i = "preview_draft_id DESC, updated_at DESC, _id ASC";
                    h = cw.c;
                    n = 0;
                    break;
                }
                case 19: {
                    this.D = ContentUris.withAppendedId(be.v, this.X);
                    h = cw.b;
                    n = 0;
                    break;
                }
                case 8: {
                    this.D = ContentUris.withAppendedId(be.o, this.X);
                    n = 0;
                    break;
                }
                case 13: {
                    this.D = ContentUris.withAppendedId(be.p, this.X);
                    n = 0;
                    break;
                }
                case 17: {
                    this.D = be.e;
                    n = 0;
                    break;
                }
                case 11: {
                    this.D = ContentUris.withAppendedId(be.q, this.X);
                    n = 0;
                    break;
                }
                case 12: {
                    this.D = ContentUris.withAppendedId(be.r, this.X);
                    n = 0;
                    break;
                }
                case 18: {
                    this.D = ContentUris.withAppendedId(be.t, this.X);
                    int n3;
                    if (d && this.X == g) {
                        n3 = 2130837600;
                    }
                    else {
                        n3 = 0;
                    }
                    final String string = arguments.getString("follow_request_sender");
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        final String format = String.format("CASE username WHEN \"%s\" THEN -1 ELSE LOWER(username) END ASC", string);
                        final int n4 = n3;
                        i = format;
                        n = n4;
                        break;
                    }
                    final int n5 = n3;
                    i = "LOWER(username) ASC";
                    n = n5;
                    break;
                }
                case 20: {
                    this.D = ContentUris.withAppendedId(be.z, this.X);
                    h = cw.b;
                    n = 0;
                    break;
                }
                case 16: {
                    this.D = ContentUris.withAppendedId(be.m, this.X);
                    h = cw.b;
                    i = "friendship_time DESC";
                    n = 0;
                    break;
                }
            }
            this.H = h;
            this.I = i;
            if (this.b != -1) {
                this.D = this.D.buildUpon().appendQueryParameter("limit", Integer.toString(this.b)).build();
            }
            if ((d || this.ae) && arguments.getBoolean("follow", false)) {
                n = 2130837600;
            }
            switch (this.u) {
                default: {
                    final yo a = this.a(arguments, n);
                    a.a((View$OnClickListener)this);
                    a.a(this);
                    this.W = (ListAdapter)a;
                    this.q = new ez(new BaseAdapter[] { (BaseAdapter)this.W }, 1);
                    break;
                }
                case 0:
                case 16: {
                    final pg a2 = this.a(arguments, n, false);
                    if (this.X == g) {
                        a2.e(true);
                    }
                    a2.a(this);
                    a2.a((View$OnClickListener)this);
                    this.W = (ListAdapter)a2;
                    this.q = new ez(new BaseAdapter[] { (BaseAdapter)this.W }, 1);
                    break;
                }
                case 9:
                case 10:
                case 19:
                case 20:
                case 21: {
                    final pg a3 = this.a(arguments, n, true);
                    a3.a(this);
                    a3.a((View$OnClickListener)this);
                    this.W = (ListAdapter)a3;
                    this.q = new ez(new BaseAdapter[] { (BaseAdapter)this.W }, 1);
                    break;
                }
                case 27: {
                    final com.twitter.android.widget.al b2 = this.b(arguments, n);
                    b2.a(this);
                    b2.a((View$OnClickListener)this);
                    this.W = (ListAdapter)b2;
                    this.q = new ez(new BaseAdapter[] { (BaseAdapter)this.W }, 1);
                    break;
                }
                case 18: {
                    final jl w = new jl((Context)activity, 2, new yt(this), this.m);
                    w.a((View$OnClickListener)this);
                    this.W = (ListAdapter)w;
                    this.q = new ez(new BaseAdapter[] { (BaseAdapter)this.W }, 1);
                    break;
                }
                case 1:
                case 29: {
                    final pg a4 = this.a(arguments, n, false);
                    a4.a(this);
                    a4.a((View$OnClickListener)this);
                    this.W = (ListAdapter)a4;
                    final TwitterUser f = af.f();
                    if (f != null && f.userId == this.X) {
                        a4.e(true);
                    }
                    if (f != null && this.u == 1 && f.userId == this.X && f.isProtected) {
                        final sx r = new sx(new sy(activity.getString(2131297013), new Intent((Context)activity, (Class)UsersActivity.class).putExtra("type", 18)));
                        this.q = new ez(new BaseAdapter[] { r, (BaseAdapter)this.W }, 1);
                        this.t = 0;
                        this.r = r;
                        break;
                    }
                    this.q = new ez(new BaseAdapter[] { (BaseAdapter)this.W }, 1);
                    break;
                }
                case 4: {
                    final yo a5 = this.a(arguments, n);
                    a5.b(true);
                    a5.a((View$OnClickListener)this);
                    a5.a(this);
                    this.W = (ListAdapter)a5;
                    this.q = new ez(new BaseAdapter[] { (BaseAdapter)this.W }, 1);
                    break;
                }
            }
            if (y instanceof PinnedHeaderRefreshableListView && !TextUtils.isEmpty((CharSequence)this.getArguments().getString("check_all_header"))) {
                this.q.a(this);
                final View inflate = LayoutInflater.from((Context)activity).inflate(2130969100, (ViewGroup)y, false);
                this.a((CheckBox)this.as.findViewById(2131887271), (CheckBox)inflate.findViewById(2131887271));
                this.d(this.as);
                this.d(inflate);
                ((TextView)this.as.findViewById(2131887270)).addTextChangedListener((TextWatcher)new yr(this, (TextView)inflate.findViewById(2131887270)));
                this.q.a(0, new fb(inflate));
                this.q.a(2);
            }
        }
        this.Y().setAdapter((ListAdapter)this.q);
        this.t();
    }
    
    private CheckBox U() {
        if (this.as != null) {
            return (CheckBox)this.as.findViewById(2131887271);
        }
        return null;
    }
    
    private boolean V() {
        boolean b;
        if (!this.ap && (0x1 & this.v) == 0x0) {
            this.B();
            this.v |= 0x1;
            b = true;
        }
        else {
            this.R = true;
            this.j(-1 + this.I());
            b = false;
        }
        if (!this.ao) {
            this.j(-1 + this.I());
        }
        else {
            if (this.aw().c()) {
                this.z();
                return true;
            }
            if (!this.ap) {
                return true;
            }
        }
        return b;
    }
    
    private pg a(final Bundle bundle, final int n, final boolean b) {
        final pg pg = new pg((Context)this.getActivity(), 2, n, this, this.l, bundle.getInt("follow_all_subtitle", 0), b, bundle.getBoolean("user_checkbox", false), false);
        pg.c(this.aL());
        pg.a(this.aM());
        final boolean e = this.G.e("follow_friends");
        boolean b2 = false;
        if (!e) {
            b2 = true;
        }
        pg.d(b2);
        return pg;
    }
    
    private void a(final long n, final PromotedContent promotedContent, final yk yk) {
        final long c = yk.c;
        final String f = yk.f;
        final int e = yk.e;
        if (this.A() || promotedContent != null) {
            if (this.A()) {
                this.c.put(n, c);
            }
            this.a(new pb((Context)this.getActivity(), this.aF(), n, promotedContent), 9, 0);
        }
        else {
            this.j.add(n);
        }
        this.l.b(n);
        this.o.T_();
        this.a(n, promotedContent, f, "follow");
        if (com.twitter.library.api.z.c(e)) {
            this.a(n, promotedContent, f, "follow_back");
        }
        this.x = true;
    }
    
    private void a(final long d, final UserView g) {
        final yk yk = (yk)g.getTag();
        final PromptDialogFragment b = PromptDialogFragment.b(3);
        b.a(this.getResources().getString(2131298057));
        b.b(this.getResources().getString(2131298059, new Object[] { g.getBestName() }));
        b.h(2131298158);
        b.j(2131297303);
        this.d = d;
        this.f = g.getPromotedContent();
        if (yk != null) {
            this.e = yk.f;
        }
        this.g = g;
        b.setTargetFragment(this, 0);
        b.a(this.getActivity().getSupportFragmentManager());
    }
    
    public static void a(final Context context) {
        if (UsersFragment.B != null) {
            context.getApplicationContext().unregisterReceiver(UsersFragment.B);
            UsersFragment.B = null;
        }
    }
    
    private void a(final View view, final long n, final String s) {
        final com.twitter.android.client.c aw = this.aw();
        final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", n).putExtra("type", this.u);
        if (this.getArguments().getBoolean("override_home")) {
            putExtra.putExtra("override_home", true);
        }
        if (this.Z != null) {
            putExtra.putExtra("association", (Parcelable)this.Z);
        }
        final CharSequence userName = ((yk)view.getTag()).b.getUserName();
        if (!TextUtils.isEmpty(userName)) {
            int n2;
            if (userName.charAt(0) == '@') {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            putExtra.putExtra("screen_name", userName.subSequence(n2, userName.length()));
        }
        if (18 == this.u) {
            final Integer n3 = this.m.get(n);
            if (n3 != null) {
                switch (n3) {
                    case 1: {
                        putExtra.putExtra("friendship", 2);
                        break;
                    }
                    case 3: {
                        putExtra.putExtra("friendship", 3);
                        break;
                    }
                    case 2: {
                        putExtra.putExtra("friendship", 0);
                        break;
                    }
                }
            }
            else {
                putExtra.putExtra("friendship", 32);
            }
        }
        else {
            final Integer j = this.l.j(n);
            if (j != null) {
                putExtra.putExtra("friendship", (Serializable)j);
            }
            else if (2 == this.u) {
                putExtra.putExtra("friendship", 4);
            }
        }
        final PromotedContent promotedContent = ((yk)view.getTag()).b.getPromotedContent();
        if (promotedContent != null) {
            aw.a(PromotedEvent.d, promotedContent);
            putExtra.putExtra("pc", (Serializable)promotedContent);
        }
        this.a(s, n, promotedContent, ((yk)view.getTag()).f);
        this.startActivityForResult(putExtra, 1);
    }
    
    private void a(final CheckBox checkBox, final CheckBox checkBox2) {
        this.b(checkBox, checkBox2);
        this.b(checkBox2, checkBox);
    }
    
    private void a(final UserView userView, final int n) {
        if (n == 2131886080) {
            userView.l.toggle();
            kg.a(this.getActivity(), 4, userView.getBestName().toString());
        }
    }
    
    private void aG() {
        if (this.W == null) {
            return;
        }
        final Cursor t = this.T();
        if (t != null && t.moveToFirst()) {
            final FriendshipCache l = this.l;
            this.j.clear();
            do {
                final long long1 = t.getLong(2);
                l.b(long1, 0x1 | t.getInt(7));
                this.j.add(long1);
            } while (t.moveToNext());
            ((yo)this.W).notifyDataSetChanged();
        }
        this.o.T_();
    }
    
    private boolean aH() {
        return this.au == this.av;
    }
    
    private void aI() {
        final com.twitter.android.client.c aw = this.aw();
        if (this.u == 7 || this.u == 28) {
            aw.a(this.aF().g(), new String[] { this.m(), "follow_friends:::follow_all" });
        }
    }
    
    private void aJ() {
        String s = null;
        String s2 = null;
        switch (this.u) {
            default: {
                s = null;
                s2 = null;
                break;
            }
            case 0: {
                s2 = "following";
                s = null;
                break;
            }
            case 1: {
                s2 = "follower";
                s = null;
                break;
            }
            case 29: {
                s2 = "followers";
                s = "vit_verified_followers";
                break;
            }
            case 2: {
                s2 = "blocked";
                s = null;
                break;
            }
            case 4: {
                s2 = "list";
                s = "users";
                break;
            }
            case 6: {
                if (this.aq != null) {
                    s2 = "explore_email";
                    s = "category";
                    break;
                }
                s2 = "category";
                s = null;
                break;
            }
            case 32: {
                s2 = "categories";
                s = null;
                break;
            }
            case 7:
            case 28: {
                s2 = "matches";
                s = null;
                break;
            }
            case 9:
            case 19:
            case 21:
            case 27: {
                s2 = "who_to_follow";
                s = null;
                break;
            }
            case 10: {
                s2 = "similar_to";
                s = null;
                break;
            }
            case 11: {
                s2 = "favorited_by";
                s = null;
                break;
            }
            case 12: {
                s2 = "retweeted_by";
                s = null;
                break;
            }
            case 17: {
                s2 = "events";
                s = "users";
                break;
            }
            case 18: {
                s2 = "friendships";
                s = null;
                break;
            }
        }
        if (s2 != null) {
            this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.X)).b(s2)).c(s));
        }
    }
    
    private yo aK() {
        return (yo)this.W;
    }
    
    private boolean aL() {
        return !this.ay && this.u != 19 && this.u != 7 && this.u != 28 && this.u != 27 && this.u != 32;
    }
    
    private boolean aM() {
        return this.u != 19 && this.u != 27;
    }
    
    private String aN() {
        final String m = this.m();
        if ("error".equals(m)) {
            return "who_to_follow:::";
        }
        return m + ":who_to_follow::";
    }
    
    private com.twitter.android.widget.al b(final Bundle bundle, final int n) {
        final com.twitter.android.widget.al al = new com.twitter.android.widget.al((Context)this.getActivity(), 2, n, this, this.l, bundle.getInt("follow_all_subtitle"));
        al.c(this.aL());
        return al;
    }
    
    private void b(final int n, final int n2, final int n3) {
        final boolean g = this.g(n2);
        this.H();
        this.a(n3, -1, -1);
        this.a(n, n3, g);
    }
    
    private void b(final Cursor cursor) {
        if (this.u == 7 || this.u == 28 || (((yo)this.W).isEmpty() && this.u != 17) || ((this.u == 6 || this.u == 32) && !this.w)) {
            this.e(3);
            return;
        }
        this.y = cursor.getCount();
        if (this.n != null) {
            this.n.a(cursor.getCount(), -1, -1);
        }
        this.c_(3);
        final CheckBox u = this.U();
        if (u != null && u.getVisibility() == 0 && u.isChecked()) {
            this.aG();
        }
        this.t();
    }
    
    private void b(final View view) {
        if (!this.Q()) {
            return;
        }
        final com.twitter.android.util.al a = com.twitter.android.util.ap.a((Context)this.getActivity());
        final View viewById = view.findViewById(2131886634);
        final View viewById2 = view.findViewById(2131886759);
        final View viewById3 = view.findViewById(2131886109);
        final TextView textView = (TextView)view.findViewById(2131886760);
        final TextView textView2 = (TextView)view.findViewById(2131886761);
        final Button button = (Button)view.findViewById(2131886762);
        if (a.m()) {
            a.a(new yq(this));
        }
        viewById3.setVisibility(0);
        if (this.aw && a.l()) {
            viewById.setVisibility(0);
            viewById2.setVisibility(8);
            return;
        }
        viewById.setVisibility(8);
        viewById2.setVisibility(0);
        button.setOnClickListener((View$OnClickListener)this);
        textView.setText(2131297003);
        int text;
        if (a.l()) {
            text = 2131297606;
        }
        else {
            text = 2131297607;
        }
        textView2.setText(text);
        button.setText(2131296717);
    }
    
    private void b(final CheckBox checkBox, final CheckBox checkBox2) {
        checkBox.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new ys(this, checkBox2));
    }
    
    private void b(final y y) {
        final boolean g = this.g(((aa)y.l().b()).c());
        final Bundle o = y.o;
        final int int1 = o.getInt("count");
        final int int2 = o.getInt("num_users");
        if (int1 > 0) {
            this.T = true;
        }
        this.H();
        if (!this.R) {
            ++this.au;
            this.R = true;
        }
        this.a(int1, -1, -1);
        this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { this.m(), "follow_friends::reverse_lookup:count" })).a((long)int2));
        if (this.aH()) {
            this.getLoaderManager().initLoader(2, null, this);
            this.a(3, int1, g);
        }
    }
    
    private void c(final y y) {
        final aa aa = (aa)y.l().b();
        final int r = y.R();
        final boolean g = this.g(aa.c());
        final pm pm = (pm)y;
        final int l = pm.l;
        Label_0123: {
            if (!aa.a()) {
                this.r(2131298068);
                break Label_0123;
            }
            final long e = pm.e;
            if (e > 0L && l > 0) {
                if (!this.l.k(e)) {
                    return;
                }
                ((yo)this.W).notifyDataSetChanged();
            }
            else {
                this.H();
            }
            if (this.p() && this.u == 21) {
                this.a("no_results");
            }
            if (l < 20) {
                this.i = false;
            }
            break Label_0123;
        }
        if (!this.S) {
            ++this.au;
            this.S = true;
        }
        this.a(l, -1, -1);
        this.a(r, l, g);
        if (this.aH()) {
            this.getLoaderManager().initLoader(2, null, this);
        }
    }
    
    private int d(final int n) {
        int n2 = 0;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + n);
            }
            case 1: {
                final Cursor t = this.T();
                n2 = 0;
                if (t == null) {
                    return n2;
                }
                final int count = t.getCount();
                n2 = 0;
                if (count > 0) {
                    n2 = 1;
                    return n2;
                }
                return n2;
            }
            case 2:
            case 3: {
                return n2;
            }
        }
    }
    
    private void d(final View view) {
        final CheckBox checkBox = (CheckBox)view.findViewById(2131887271);
        final TextView textView = (TextView)view.findViewById(2131887272);
        checkBox.setChecked(this.F);
        checkBox.setOnClickListener((View$OnClickListener)this);
        textView.setOnClickListener((View$OnClickListener)this);
    }
    
    private long[] d(final boolean b) {
        final HashSet<Object> set = new HashSet<Object>();
        if (b) {
            final Cursor t = this.T();
            if (t != null && t.moveToFirst()) {
                do {
                    set.add(t.getLong(2));
                } while (t.moveToNext());
            }
        }
        set.addAll(this.j);
        return CollectionUtils.c(set);
    }
    
    private void e(final String s) {
        String s2 = null;
        switch (this.u) {
            default: {
                s2 = null;
                break;
            }
            case 19:
            case 27: {
                s2 = "welcome:who_to_follow::" + s + ":click";
                break;
            }
            case 9:
            case 21: {
                s2 = "who_to_follow:contacts::" + s + ":click";
                break;
            }
        }
        if (s2 != null) {
            this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { s2 })).a(this.Z));
        }
    }
    
    private void f(final String s) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(s, null, null, null, "impression")).a(this.Z);
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.a = this.X;
        twitterScribeItem.b = this.J;
        twitterScribeItem.g = 1 + this.O;
        twitterScribeLog.a(twitterScribeItem);
        this.aw().a(twitterScribeLog);
    }
    
    private void r(final int n) {
        if (!this.aD) {
            Toast.makeText((Context)this.getActivity(), n, 1).show();
        }
    }
    
    private boolean r() {
        return this.u == 10 || this.u == 9 || this.u == 19 || this.u == 27 || this.u == 21 || this.u == 6;
    }
    
    boolean A() {
        return this.u == 10 || this.u == 20 || this.u == 19;
    }
    
    public void B() {
        if (this.aD() && !this.T && !this.o(7)) {
            this.a(new ml((Context)this.getActivity(), this.aF()), 10, 7);
            return;
        }
        this.R = true;
        this.j(-1 + this.I());
    }
    
    public int F() {
        return this.j.size();
    }
    
    void H() {
        Cursor t;
        if (this.W != null) {
            t = this.T();
        }
        else {
            t = null;
        }
        if (t != null) {
            t.requery();
        }
    }
    
    public int I() {
        return this.av;
    }
    
    public boolean K() {
        return this.av > 0;
    }
    
    public int L() {
        return this.au;
    }
    
    public boolean M() {
        return this.Q;
    }
    
    void N() {
        final com.twitter.android.client.c aw = this.aw();
        switch (this.u) {
            default: {}
            case 0: {
                aw.a(this.aF().g(), "following::::impression");
            }
            case 1: {
                aw.a(this.aF().g(), "followers::::impression");
            }
            case 9: {
                aw.a(this.aF().g(), new String[] { this.m(), "discover:::impression" });
            }
            case 19:
            case 21:
            case 27: {
                aw.a(this.aF().g(), new String[] { this.aN(), "impression" });
            }
            case 7:
            case 28: {
                aw.a(this.aF().g(), new String[] { this.m(), "follow_friends:::impression" });
            }
            case 17: {
                aw.a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { "events:people:::impression" })).e(bq.b(this.getArguments().getString("event_name"))));
            }
            case 10: {
                aw.a(this.aF().g(), "similar_to::::impression");
            }
            case 6: {
                this.f("category");
            }
            case 32: {
                aw.a(this.aF().g(), new String[] { this.m(), "follow_interest_suggestions:::impression" });
            }
            case 18: {
                aw.a(this.aF().g(), "follower_requests::::impression");
            }
        }
    }
    
    protected int N_() {
        if (TextUtils.isEmpty((CharSequence)this.getArguments().getString("check_all_header"))) {
            return 2130968852;
        }
        return 2130968975;
    }
    
    protected void O() {
        final com.twitter.android.client.c aw = this.aw();
        final ArrayList m = this.M;
        if (!m.isEmpty()) {
            String string = null;
            switch (this.u) {
                default: {
                    string = null;
                    break;
                }
                case 10: {
                    string = "similar_to::stream::results";
                    break;
                }
                case 6: {
                    string = "category:who_to_follow:::results";
                    break;
                }
                case 9:
                case 21: {
                    string = "who_to_follow::stream::results";
                    break;
                }
                case 19:
                case 27: {
                    string = this.m() + ":who_to_follow:stream::results";
                    break;
                }
            }
            if (string != null) {
                aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { string })).b(m)).h(String.valueOf(this.X)));
            }
            m.clear();
        }
    }
    
    yo a(final Bundle bundle, final int n) {
        final yo yo = new yo((Context)this.getActivity(), 2, n, this, this.l, bundle.getInt("follow_all_title", 0), bundle.getInt("follow_all_subtitle", 0), bundle.getBoolean("show_follow_all_button", true), bundle.getBoolean("user_checkbox", false));
        yo.c(this.aL());
        yo.d(!this.G.e("follow_friends") && !this.G.e("follow_interest_suggestions"));
        return yo;
    }
    
    TwitterScribeLog a(final long n, final PromotedContent promotedContent, final String s, final String s2, final String s3) {
        return this.a(n, promotedContent, s, s2, "user", s3);
    }
    
    TwitterScribeLog a(final long n, final PromotedContent promotedContent, final String s, final String... array) {
        return (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(n, promotedContent, s).b(array)).a(this.Z);
    }
    
    public void a() {
        final Cursor t = this.T();
        if (t != null && t.moveToFirst()) {
            final FriendshipCache l = this.l;
            do {
                l.b(Long.valueOf(t.getLong(2)), com.twitter.library.api.z.a(t.getInt(7), 1));
            } while (t.moveToNext());
            ((yo)this.W).notifyDataSetChanged();
        }
    }
    
    void a(final int n, final int n2, final int n3) {
        final CheckBox u = this.U();
        if (u != null && u.getVisibility() == 0 && u.isChecked()) {
            this.aG();
        }
        if (this.n == null || this.W == null || this.T() == null) {
            return;
        }
        if (n > 0) {
            this.n.a(((yo)this.W).getCount(), n2, n3);
        }
        else {
            this.n.a(0, n2, n3);
        }
        this.y = ((yo)this.W).getCount();
        this.t();
    }
    
    protected void a(final int n, final int n2, final boolean b) {
        if (!this.U || !b || n2 == 0) {
            super.c_(n);
        }
    }
    
    @Override
    public void a(final int n, final y y) {
        boolean b = true;
        super.a(n, y);
        this.c(y.b);
        final aa aa = (aa)y.l().b();
        final int r = y.R();
        switch (n) {
            case 3:
            case 4:
            case 5:
            case 13: {
                if ((n == 13 || n == 3) && this.aB != null && this.R()) {
                    this.aB.setVisibility(0);
                    this.aC = b;
                }
                final int c = aa.c();
                final boolean g = this.g(c);
                if (aa.a()) {
                    this.H();
                }
                final oy oy = (oy)y;
                final int b2 = oy.b();
                this.a(b2, -1, -1);
                this.a(r, b2, g);
                if (c == 401) {
                    this.r(2131297497);
                    return;
                }
                if (c != 200) {
                    this.r(2131298068);
                    return;
                }
                if (this.l != null) {
                    for (final TwitterUser twitterUser : oy.a()) {
                        this.l.b(twitterUser.a(), twitterUser.friendship);
                    }
                    break;
                }
                break;
            }
            case 6: {
                this.c(y);
            }
            case 7: {
                final ng ng = (ng)y;
                final boolean g2 = this.g(aa.f().a);
                if (aa.f().a == 200) {
                    this.H();
                }
                this.a(ng.b(), -1, -1);
                this.a(r, ng.b(), g2);
                if (aa.f().a != 200) {
                    this.r(2131298068);
                    return;
                }
                break;
            }
            case 8: {
                this.g(aa.c());
                if (aa.f().a == 200) {
                    this.H();
                    return;
                }
                this.r(2131298079);
            }
            case 10: {
                this.b(y);
            }
            case 9: {
                final Session a = this.aE().a(y);
                if (a == null) {
                    break;
                }
                this.g(aa.c());
                final long u = ((pb)y).u();
                if (!aa.a()) {
                    this.l.c(u);
                    ((yo)this.W).notifyDataSetChanged();
                    return;
                }
                if (!this.A()) {
                    break;
                }
                final Long b3 = this.b(u);
                if (b3 != null) {
                    if (this.a) {
                        this.aK().a(u, b3);
                    }
                    this.a(new pv(this.an, a, this.X, this.u, this.h, u, null), 18, 0);
                    return;
                }
                break;
            }
            case 11: {
                if (this.aE().a(y) == null) {
                    break;
                }
                this.g(aa.c());
                final long f = ((pe)y).f();
                this.c.remove(f);
                if (!aa.a()) {
                    this.l.b(f);
                    ((yo)this.W).notifyDataSetChanged();
                    return;
                }
                break;
            }
            case 12: {
                final FragmentActivity activity = this.getActivity();
                final py py = (py)y;
                final String e = py.P().e;
                final boolean g3 = PushService.g((Context)activity, e);
                final int c2 = aa.c();
                this.g(c2);
                if (aa.a() && g3) {
                    break;
                }
                if (c2 == 1001 || !g3) {
                    com.twitter.android.client.x.a((Context)activity).a(e, !g3 && b);
                    return;
                }
                final long a2 = py.a.a();
                if (this.l.k(a2)) {
                    if (com.twitter.library.api.z.i(py.a.friendship)) {
                        this.l.d(a2);
                    }
                    else {
                        this.l.e(a2);
                    }
                    ((yo)this.W).notifyDataSetChanged();
                    this.r(2131296784);
                    return;
                }
                break;
            }
            case 14: {
                this.b(r, aa.c(), ((oz)y).a.a());
            }
            case 1: {
                final long[] e2 = ((po)y).e();
                final boolean g4 = this.g(aa.c());
                int length = 0;
                if (e2 != null) {
                    length = e2.length;
                }
                this.a(r, length, g4);
                if (aa.a()) {
                    if (18 == this.u) {
                        this.H();
                        return;
                    }
                    break;
                }
                else {
                    if (this.getActivity() != null) {
                        this.r(2131297102);
                        return;
                    }
                    break;
                }
                break;
            }
            case 15: {
                final int c3 = aa.c();
                final boolean g5 = this.g(c3);
                final l l = (l)y;
                final int f2 = l.f();
                this.w = b;
                if (c3 == 200 || this.aq != null) {
                    this.H();
                }
                if (this.aE && this.getActivity() != null) {
                    this.getActivity().setTitle((CharSequence)l.g());
                }
                this.a(r, f2, g5);
            }
            case 17: {
                final int c4 = aa.c();
                final boolean g6 = this.g(c4);
                final int a3 = ((g)y).a();
                this.w = b;
                if (c4 == 200) {
                    this.H();
                }
                this.a(a3, -1, -1);
                this.a(r, a3, g6);
            }
            case 16: {
                final boolean g7 = this.g(aa.c());
                final int i = ((pm)y).l;
                this.w = b;
                if (aa.a()) {
                    this.H();
                }
                this.a(i, -1, -1);
                this.a(r, i, g7);
            }
            case 18: {
                this.g(aa.c());
                final pv pv = (pv)y;
                if (pv.f() == null || !pv.g()) {
                    b = false;
                }
                final ab p2 = pv.P();
                if (p2 == null || !p2.a(this.aF())) {
                    break;
                }
                if (b) {
                    this.H();
                }
                final yo ak = this.aK();
                final Long a4 = ak.a(pv.t());
                if (a4 != null && (!b || !yj.a(this.Y(), a4))) {
                    ak.b(pv.t());
                    return;
                }
                break;
            }
        }
    }
    
    void a(final long n, final PromotedContent promotedContent, final String s, final String s2) {
        String s3 = null;
        switch (this.u) {
            default: {
                s3 = null;
                break;
            }
            case 0: {
                s3 = "following:following:";
                break;
            }
            case 1: {
                s3 = "followers:followers:";
                break;
            }
            case 17: {
                s3 = "events:people:";
                break;
            }
            case 11: {
                s3 = "favorited_by::";
                break;
            }
            case 12: {
                s3 = "retweeted_by::";
                break;
            }
            case 7:
            case 28: {
                s3 = this.m() + ":follow_friends:";
                break;
            }
            case 19:
            case 27: {
                s3 = this.m() + ":who_to_follow:";
                break;
            }
            case 9:
            case 21: {
                s3 = "who_to_follow::";
                break;
            }
            case 6: {
                if (this.G.b()) {
                    s3 = "welcome:category:";
                    break;
                }
                if (this.aq != null) {
                    s3 = "explore_email:category:";
                    break;
                }
                s3 = "category::";
                break;
            }
            case 32: {
                if (this.G.b()) {
                    s3 = "welcome:categories:";
                    break;
                }
                s3 = "categories::";
                break;
            }
            case 10: {
                s3 = "similar_to::";
                break;
            }
        }
        if (s3 != null) {
            final TwitterScribeLog a = this.a(n, promotedContent, s, s3, s2);
            if (this.u == 17) {
                a.e(bq.b(this.getArguments().getString("event_name")));
            }
            else if (this.u == 10) {
                a.h(String.valueOf(this.X));
            }
            this.aw().a(a);
        }
    }
    
    void a(final long n, final String s, final PromotedContent promotedContent) {
        int n2;
        if (this.A()) {
            this.b(n);
            n2 = 1;
        }
        else if (!this.j.remove(n)) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            this.a(new pe((Context)this.getActivity(), this.aF(), n, promotedContent), 11, 0);
        }
        this.l.c(n);
        this.o.T_();
        this.a(n, promotedContent, s, "unfollow");
        this.x = true;
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        switch (n) {
            case 1: {
                if (n2 == -1) {
                    this.a(new nh(this.getActivity().getApplicationContext(), this.aF(), this.X, this.d, this.h, 4), 8, 0);
                    this.aw().a(this.aF().g(), "me:lists:list:people:remove");
                    return;
                }
                break;
            }
            case 2: {
                if (n2 == -1) {
                    this.getActivity().finish();
                    return;
                }
                break;
            }
            case 3: {
                if (n2 != -1) {
                    break;
                }
                this.a(this.d, this.e, this.f);
                if (this.g != null && this.g.l != null) {
                    this.g.l.setChecked(false);
                    this.g.a(true);
                    return;
                }
                break;
            }
        }
    }
    
    protected void a(final Cursor cursor) {
        if (this.au() && cursor.getInt(1) == 0 && cursor.getCount() < 400 && this.u != 27 && (this.u != 19 || this.i) && this.e(1)) {
            this.a("get_older");
        }
        if (this.aB != null && this.R()) {
            if (cursor.getInt(1) != 1) {
                this.aB.setVisibility(8);
                this.aC = false;
                return;
            }
            this.aB.setVisibility(0);
            this.aC = true;
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        switch (loader.getId()) {
            default: {
                super.a(loader, cursor);
                this.b(cursor);
                break;
            }
            case 1: {
                if (cursor != null && this.r != null) {
                    this.r.a(this.t, cursor.getCount());
                    return;
                }
                break;
            }
            case 2: {
                if (cursor != null) {
                    this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { this.m(), "follow_friends:not_followed::followable" })).a((long)cursor.getCount()));
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final View view, final int n, final int n2, final int n3) {
    }
    
    public void a(final ListView listView, final View view, final int n, final long n2) {
        int n3 = 1;
        final int headerViewsCount = listView.getHeaderViewsCount();
        final int footerViewsCount = listView.getFooterViewsCount();
        int n4;
        if (this.q.c(n - headerViewsCount) == this.t || (headerViewsCount > 0 && n < headerViewsCount)) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (footerViewsCount <= 0 || n <= -1 + (listView.getCount() - footerViewsCount)) {
            n3 = 0;
        }
        if (n4 != 0) {
            this.c(listView, view, n, n2);
            return;
        }
        if (n3 != 0) {
            this.b(listView, view, n, n2);
            return;
        }
        UserView userView;
        if (view instanceof UserView) {
            userView = (UserView)view;
        }
        else {
            userView = null;
        }
        if (userView != null && userView.m != null && this.getArguments().getBoolean("user_checkbox")) {
            userView.m.toggle();
            this.a(userView, n2);
            return;
        }
        this.a(view, n2, "user");
    }
    
    public void a(final yu o) {
        this.o = o;
    }
    
    void a(final yw n) {
        this.n = n;
    }
    
    public void a(final BaseUserView baseUserView, final PromotedContent promotedContent, final Bundle bundle) {
        final Long value = baseUserView.getUserId();
        if (this.r() && this.N.add(value)) {
            final TwitterScribeItem a = TwitterScribeItem.a(value, baseUserView.getPromotedContent(), ((yk)baseUserView.getTag()).f, null);
            a.g = 1 + bundle.getInt("position");
            this.M.add(a);
        }
        if (promotedContent != null && this.C.add(promotedContent.impressionId)) {
            this.aw().a(PromotedEvent.a, promotedContent);
        }
        if (baseUserView instanceof UserView) {
            final UserView g = (UserView)baseUserView;
            if (g.m != null) {
                g.m.setChecked(this.j.contains(g.getUserId()));
            }
            if (g.l != null && g.getUserId() == this.d) {
                this.g = g;
            }
        }
    }
    
    public void a(final UserView userView, final long n) {
        final CheckBox u = this.U();
        if (userView.m.isChecked()) {
            this.j.add(n);
            this.l.b(n);
            if (u != null) {
                u.setChecked(this.j.size() == ((yo)this.W).getCount());
            }
        }
        else {
            this.j.remove(n);
            this.l.c(n);
            if (u != null) {
                u.setChecked(false);
            }
        }
        this.o.T_();
        this.Y().invalidate();
    }
    
    public void a(final UserView userView, final long n, final int n2) {
        if (this.ae) {
            this.a(userView, n2);
        }
        else {
            if (n2 == 2131886080) {
                this.b(userView, n);
                return;
            }
            if (n2 == 2131886158) {
                this.a(userView, n);
            }
        }
    }
    
    void a(final String s) {
        String an = null;
        switch (this.u) {
            default: {
                an = null;
                break;
            }
            case 1: {
                an = "followers:::";
                break;
            }
            case 0: {
                an = "following:::";
                break;
            }
            case 21: {
                an = this.aN();
                break;
            }
            case 6: {
                an = "category:::user";
                break;
            }
        }
        if (an != null && s != null) {
            this.aw().a(this.aF().g(), new String[] { an, s });
        }
    }
    
    void a(final String s, final long n, final PromotedContent promotedContent, final String s2) {
        final int u = this.u;
        String s3 = null;
        switch (u) {
            case 17: {
                s3 = "events:people::" + s + ":profile_click";
                break;
            }
            case 6: {
                if (this.aq != null) {
                    s3 = "explore_email:category::" + s + ":profile_click";
                    break;
                }
                s3 = "category:::" + s + ":profile_click";
                break;
            }
            case 19:
            case 27: {
                s3 = "welcome:who_to_follow::" + s + ":profile_click";
                break;
            }
            case 9:
            case 21: {
                s3 = "who_to_follow:::" + s + ":profile_click";
                break;
            }
            case 10: {
                s3 = "similar_to:::" + s + ":profile_click";
                break;
            }
            case 1: {
                s3 = "followers:::" + s + ":profile_click";
                break;
            }
        }
        if (s3 != null) {
            final TwitterScribeLog a = this.a(n, promotedContent, s2, new String[] { s3 });
            if (this.u == 17) {
                a.e(bq.b(this.getArguments().getString("event_name")));
            }
            else if (this.u == 10) {
                a.h(String.valueOf(this.X));
            }
            this.aw().a(a);
        }
    }
    
    protected void a(final boolean b) {
        super.a(b);
        if (b) {
            this.a_(3);
            this.A_();
        }
        else {
            if (this.T() == null) {
                this.a_(3);
                this.q();
                return;
            }
            if (((yo)this.W).isEmpty()) {
                this.e(3);
            }
        }
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        if (absListView instanceof PinnedHeaderRefreshableListView) {
            ((PinnedHeaderRefreshableListView)absListView).a(n);
        }
        return super.a(absListView, n, n2, n3, b);
    }
    
    public int a_(final int n, final int n2) {
        if (n > 0) {
            return 1;
        }
        return 0;
    }
    
    public void ac_() {
    }
    
    public void ad_() {
        final Cursor t = this.T();
        if (t != null && t.moveToFirst()) {
            final FriendshipCache l = this.l;
            do {
                l.c(Long.valueOf(t.getLong(2)));
            } while (t.moveToNext());
            ((yo)this.W).notifyDataSetChanged();
        }
    }
    
    Long b(final long n) {
        this.aK().b(n);
        return this.c.remove(n);
    }
    
    public void b() {
        this.g(200);
        this.H();
    }
    
    public void b(final int n, final int n2, final boolean b) {
        this.H();
        if (b && !this.Q) {
            this.Q = true;
            ++this.au;
            if (this.aH()) {
                this.getLoaderManager().initLoader(2, null, this);
            }
        }
        int count;
        if (this.W != null) {
            count = ((yo)this.W).getCount();
        }
        else {
            count = 0;
        }
        this.a(count, n, n2);
    }
    
    protected void b(final ListView listView, final View view, final int n, final long n2) {
        final Object itemAtPosition = listView.getItemAtPosition(n);
        if (itemAtPosition instanceof Intent) {
            this.startActivity((Intent)itemAtPosition);
        }
    }
    
    public void b(final UserView userView, final long d) {
        if (this.u == 4) {
            this.d = d;
            final PromptDialogFragment j = PromptDialogFragment.b(1).c(2131298078).d(2131298077).h(2131298158).j(2131297303);
            j.setTargetFragment(this, 0);
            j.a(this.getActivity().getSupportFragmentManager());
            return;
        }
        final yk yk = (yk)userView.getTag();
        if (userView.l.isChecked()) {
            userView.a(false);
            this.a(d, userView);
            return;
        }
        userView.a(true);
        this.a(d, userView.getPromotedContent(), yk);
    }
    
    public void b(final boolean z) {
        this.z = z;
    }
    
    protected void c(final ListView listView, final View view, final int n, final long n2) {
        final Object itemAtPosition = listView.getItemAtPosition(n);
        if (itemAtPosition instanceof Intent) {
            this.startActivity((Intent)itemAtPosition);
        }
    }
    
    public void c(final boolean b) {
        if (b) {
            this.a("get_newer");
        }
        super.c(b);
    }
    
    public void d() {
        this.g(200);
        this.H();
    }
    
    public void e() {
        this.A = false;
        this.N();
    }
    
    protected boolean e(final int n) {
        if (!this.o(n)) {
            switch (this.u) {
                default: {
                    this.a(new oy((Context)this.getActivity(), this.aF(), 0).a(this.L, this.X).d(this.d(n)), 4, n);
                    break;
                }
                case 1: {
                    this.a(new oy((Context)this.getActivity(), this.aF(), 1).a(this.L, this.X).d(this.d(n)), 3, n);
                    this.a(new po((Context)this.getActivity(), this.aF(), this.d(n)), 1, n);
                    break;
                }
                case 29: {
                    this.a(new oy((Context)this.getActivity(), this.aF(), 29).a(this.L, this.X).d(this.d(n)), 13, n);
                    break;
                }
                case 6: {
                    if (this.aq != null) {
                        new yv(this, this.getActivity(), this.aq, null).execute((Object[])new Void[0]);
                        break;
                    }
                    this.a(new l((Context)this.getActivity(), this.aF(), this.X, this.J, -1), 15, n);
                    break;
                }
                case 32: {
                    if (this.K != null) {
                        this.a(new g((Context)this.getActivity(), this.aF(), this.X, this.K, 40), 17, n);
                        break;
                    }
                    final pm pm = new pm((Context)this.getActivity(), this.aF(), 33);
                    pm.f = this.d(n);
                    boolean b = false;
                    if (n == 1) {
                        b = true;
                    }
                    pm.i = this.d(b);
                    pm.j = 40;
                    this.a(pm, 16, n);
                    break;
                }
                case 4: {
                    boolean b2;
                    boolean b3;
                    if (this.getArguments().getBoolean("list_members_abridged")) {
                        b2 = false;
                        b3 = true;
                    }
                    else {
                        b2 = true;
                        b3 = false;
                    }
                    this.a(new ng((Context)this.getActivity(), this.aF(), this.u, this.X, this.h, this.d(n), b2, b3), 7, n);
                    break;
                }
                case 5: {
                    this.a(new ng((Context)this.getActivity(), this.aF(), this.u, this.X, this.h, this.d(n), true, false), 7, n);
                    break;
                }
                case 9:
                case 19:
                case 21: {
                    final pm pm2 = new pm((Context)this.getActivity(), this.aF(), this.u);
                    pm2.f = this.d(n);
                    pm2.j = this.b;
                    boolean b4 = false;
                    if (n == 1) {
                        b4 = true;
                    }
                    pm2.i = this.d(b4);
                    this.a(pm2, 6, n);
                    break;
                }
                case 10:
                case 20: {
                    final pm pm3 = new pm((Context)this.getActivity(), this.aF(), this.u);
                    pm3.f = 0;
                    pm3.j = 6;
                    pm3.e = this.X;
                    this.a(pm3, 6, n);
                    break;
                }
                case 28: {
                    if (this.aH()) {
                        this.a(0, -1, -1);
                        return false;
                    }
                    int n2;
                    if ((0x2 & this.v) == 0x0) {
                        this.i(n);
                        this.v |= 0x2;
                        n2 = 1;
                    }
                    else {
                        this.S = true;
                        this.j(-1 + this.I());
                        n2 = 0;
                    }
                    if (n == 3) {
                        if (this.V() || n2 != 0) {
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                    }
                    if (n2 == 0) {
                        this.a(0, -1, -1);
                        return false;
                    }
                    break;
                }
                case 7: {
                    if (n == 3) {
                        this.V();
                        break;
                    }
                    return false;
                }
                case 11:
                case 12: {
                    final oz oz = new oz((Context)this.getActivity(), this.aF());
                    oz.a.a(this.E).a(this.u).a(this.h);
                    this.a(oz, 14, n);
                    break;
                }
                case 18: {
                    this.a(new po((Context)this.getActivity(), this.aF(), this.d(n)), 1, n);
                    break;
                }
                case 16: {
                    this.a(new oy((Context)this.getActivity(), this.aF(), 16).a(this.L, this.X).d(this.d(n)), 5, n);
                    break;
                }
            }
            return true;
        }
        return false;
    }
    
    protected void g() {
    }
    
    boolean g(final int n) {
        if (!this.at && this.U && n == 200) {
            this.at = true;
            this.q();
            return true;
        }
        return false;
    }
    
    public void i() {
        this.e(2);
    }
    
    void i(final int n) {
        final pm pm = new pm((Context)this.getActivity(), this.aF(), 19);
        pm.f = this.d(n);
        pm.j = 100;
        pm.i = this.d(true);
        this.a(pm, 6, n);
    }
    
    public void j(final int av) {
        this.av = av;
    }
    
    public void k(final int u) {
        this.u = u;
        this.W = null;
        this.q = null;
        this.S();
        this.A_();
    }
    
    protected String m() {
        return this.G.f();
    }
    
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.S();
        this.aB = (TextView)this.Y().findViewById(2131886890);
        if (this.aB != null && this.R()) {
            this.aB.setText((CharSequence)this.getResources().getQuantityString(2131427377, this.aA, new Object[] { this.aA }));
            final TextView ab = this.aB;
            int visibility;
            if (this.aC) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ab.setVisibility(visibility);
        }
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        Label_0024: {
            switch (n) {
                case 1: {
                    if (-1 != n2 || intent == null) {
                        break;
                    }
                    final long longExtra = intent.getLongExtra("user_id", 0L);
                    if (longExtra <= 0L || !intent.hasExtra("friendship")) {
                        break;
                    }
                    final int intExtra = intent.getIntExtra("friendship", 0);
                    if (18 == this.u) {
                        final Integer n3 = this.m.get(longExtra);
                        if (n3 != null) {
                            switch (n3) {
                                default: {
                                    return;
                                }
                                case 1: {
                                    if (com.twitter.library.api.z.b(intExtra)) {
                                        this.m.put(longExtra, 3);
                                        ((yo)this.W).notifyDataSetChanged();
                                        return;
                                    }
                                    break Label_0024;
                                }
                                case 3: {
                                    if (!com.twitter.library.api.z.b(intExtra)) {
                                        this.m.put(longExtra, 1);
                                        ((yo)this.W).notifyDataSetChanged();
                                        return;
                                    }
                                    break Label_0024;
                                }
                            }
                        }
                        else if (com.twitter.library.api.z.c(intExtra)) {
                            if (com.twitter.library.api.z.b(intExtra)) {
                                this.m.put(longExtra, 3);
                                ((yo)this.W).notifyDataSetChanged();
                                return;
                            }
                            this.m.put(longExtra, 1);
                            ((yo)this.W).notifyDataSetChanged();
                            return;
                        }
                        else {
                            if (!com.twitter.library.api.z.j(intExtra)) {
                                this.m.put(longExtra, 2);
                                ((yo)this.W).notifyDataSetChanged();
                                return;
                            }
                            break;
                        }
                    }
                    else {
                        final FriendshipCache l = this.l;
                        if (!l.a(longExtra, intExtra)) {
                            l.b(longExtra, intExtra);
                            ((yo)this.W).notifyDataSetChanged();
                            this.x = true;
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    if (n2 == 0) {
                        this.aw().a(new TwitterScribeLog(this.aF().g()).b(new String[] { "who_to_follow:contacts::find_friends:cancel" }));
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.P();
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131886762 || id == 2131886634) {
            if (id == 2131886762) {
                this.e("find_friends");
            }
            else if (id == 2131886634) {
                this.e("find_more_friends");
            }
            final com.twitter.android.util.al a = com.twitter.android.util.ap.a((Context)this.getActivity());
            final Bundle arguments = this.getArguments();
            final FollowFlowController a2 = new FollowFlowController("who_to_follow").d(arguments.getBoolean("follow_flow_clear_stack", false)).a(true);
            if (arguments.getBoolean("follow_flow_people_button_intent", false)) {
                a2.a(new Intent((Context)this.getActivity(), (Class)RootTabbedFindPeopleActivity.class));
            }
            if (!a.l()) {
                if (a.b()) {
                    a2.a(new String[] { "follow_friends" });
                    if (a.e()) {
                        er.a(a2.f(), this.getActivity().getApplicationContext()).a();
                    }
                }
                else {
                    a2.a(new String[] { "phone_entry", "follow_friends" });
                }
            }
            else {
                a2.a(new String[] { "follow_friends" });
            }
            a2.b(this.getActivity());
            this.ax = true;
        }
        else if (id == 2131886714) {
            if (this.W != null) {
                final Cursor t = this.T();
                if (t != null && t.moveToFirst()) {
                    final FriendshipCache l = this.l;
                    do {
                        final Long value = t.getLong(2);
                        l.b(value, 0x1 | t.getInt(7));
                        this.j.add(value);
                    } while (t.moveToNext());
                    ((yo)this.W).notifyDataSetChanged();
                    this.aI();
                }
                view.setEnabled(false);
            }
        }
        else if (id == 2131887271 || id == 2131887272) {
            if (this.W != null) {
                CheckBox u;
                if (id == 2131887272) {
                    u = this.U();
                    u.toggle();
                }
                else {
                    u = (CheckBox)view;
                }
                final Cursor t2 = this.T();
                if (t2 != null && t2.moveToFirst()) {
                    do {
                        final Long value2 = t2.getLong(2);
                        if (u.isChecked()) {
                            this.l.b(value2);
                            this.j.add(value2);
                        }
                        else {
                            this.l.c(value2);
                            this.j.remove(value2);
                        }
                    } while (t2.moveToNext());
                    ((yo)this.W).notifyDataSetChanged();
                    this.o.T_();
                }
            }
        }
        else if (id == 2131886635) {
            new FollowFlowController("discover").a(new String[] { "follow_friends" }).b(this.getActivity());
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        this.u = arguments.getInt("type", -1);
        this.aq = arguments.getParcelableArrayList("explore_email_users");
        this.aJ();
        new ec((Context)this.getActivity(), this.Z);
        this.J = arguments.getString("category");
        final String[] stringArray = arguments.getStringArray("multiple_categories");
        if (stringArray != null && stringArray.length > 0) {
            this.K = stringArray;
        }
        this.h = arguments.getLong("tag", -1L);
        final long[] longArray = arguments.getLongArray("user_ids");
        if (longArray != null && longArray.length > 0) {
            this.E = longArray;
        }
        this.F = arguments.getBoolean("preselect_all");
        this.L = arguments.getString("owner_name");
        this.O = arguments.getInt("category_position", 0);
        this.b = arguments.getInt("limit", -1);
        this.U = arguments.getBoolean("fetch_always", false);
        this.ao = arguments.getBoolean("upload_contacts", false);
        this.ap = arguments.getBoolean("contacts_uploaded", false);
        this.ay = arguments.getBoolean("hide_bio", false);
        this.aA = arguments.getInt("fast_follow");
        this.aD = arguments.getBoolean("disable_toast_error_messages", false);
        this.aE = arguments.getBoolean("show_category_name", false);
        if (bundle != null) {
            this.G = (FollowFlowController)bundle.getParcelable("state_flow_controller");
            this.v = bundle.getInt("state_load_flags");
            this.d = bundle.getLong("state_dialog_user");
            this.f = (PromotedContent)bundle.getSerializable("state_dialog_pc");
            this.e = (String)bundle.getSerializable("state_dialog_user_token");
            this.k = bundle.getStringArrayList("state_checked_users");
            this.j = (HashSet)bundle.getSerializable("state_pending_follows");
            this.z = bundle.getBoolean("state_sync_follow_state", true);
            this.P = bundle.getInt("state_lookup_complete_pages");
            this.Q = bundle.getBoolean("state_lookup_complete");
            this.R = bundle.getBoolean("state_reverse_lookup_complete");
            this.S = bundle.getBoolean("state_wtf_complete");
            this.au = bundle.getInt("state_completed_components");
            this.av = bundle.getInt("state_total_progress_components");
            this.E = bundle.getLongArray("state_user_ids");
            this.s = (TwitterUser)bundle.getParcelable("state_mediator");
            if (bundle.containsKey("state_friendship_cache")) {
                this.l = (FriendshipCache)bundle.getSerializable("state_friendship_cache");
            }
            else {
                this.l = new FriendshipCache();
            }
            if (bundle.containsKey("state_incoming_friendship_cache")) {
                this.m = (HashMap)bundle.getSerializable("state_incoming_friendship_cache");
            }
            else {
                this.m = new HashMap();
            }
            this.p = bundle.getString("state_search_id");
            this.y = bundle.getInt("state_total_users");
            if ((this.u == 6 || this.u == 32) && bundle.containsKey("state_fetched_category_users")) {
                this.w = bundle.getBoolean("state_fetched_category_users");
            }
            if (bundle.containsKey("state_loader_initialized")) {
                this.at = bundle.getBoolean("state_loader_initialized");
            }
            this.ax = bundle.getBoolean("state_hide_contacts_import_cta");
            this.A = bundle.getBoolean("is_hidden", false);
            this.aC = bundle.getBoolean("fast_follow_visible", false);
        }
        else {
            this.G = (FollowFlowController)arguments.getParcelable("flow_controller");
            this.v = 0;
            if (arguments.containsKey("friendship_cache")) {
                this.l = (FriendshipCache)arguments.getSerializable("friendship_cache");
            }
            else {
                this.l = new FriendshipCache();
            }
            this.j = new HashSet();
            this.z = arguments.getBoolean("sync_follow_state", true);
            if (this.u == 18) {
                this.m = new HashMap();
            }
            this.ax = arguments.getBoolean("hide_contacts_import_cta", false);
            this.A = arguments.getBoolean("is_hidden", false);
        }
        if (this.G == null) {
            this.G = new FollowFlowController(arguments.getString("scribe_item"));
        }
        if (this.r()) {
            this.M = new ArrayList();
            this.N = new HashSet();
        }
        this.ar = arguments.getInt("matches_count_format_id", 2131297248);
        if (this.u == 28) {
            this.a(this.az = new yy(this, null));
        }
        if (!TextUtils.isEmpty((CharSequence)arguments.getString("check_all_header"))) {
            this.a((bv)this);
        }
        if (bundle == null && !this.A) {
            this.N();
        }
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        switch (n) {
            default: {
                String s;
                String[] array;
                if (this.h > 0L) {
                    s = "type=? AND tag=?";
                    array = new String[] { Integer.toString(this.u), Long.toString(this.h) };
                }
                else if (this.E != null) {
                    final long[] e = this.E;
                    final int length = e.length;
                    array = new String[length];
                    final StringBuilder append = new StringBuilder("user_id").append(" IN (?");
                    array[0] = String.valueOf(e[0]);
                    for (int i = 1; i < length; ++i) {
                        append.append(", ?");
                        array[i] = String.valueOf(e[i]);
                    }
                    append.append(")");
                    s = append.toString();
                }
                else {
                    switch (this.u) {
                        default: {
                            s = null;
                            array = null;
                            break;
                        }
                        case 19: {
                            if (this.l.a()) {
                                s = "(friendship IS NULL OR (friendship & 1 == 0)) AND user_id!=?";
                                array = new String[] { Long.toString(this.X) };
                                break;
                            }
                            s = null;
                            array = null;
                            break;
                        }
                        case 7: {
                            s = "(friendship IS NULL OR (friendship & 1 == 0)) AND user_id!=?";
                            array = new String[] { Long.toString(this.X) };
                            break;
                        }
                        case 28: {
                            s = "(friendship IS NULL OR (friendship & 1 == 0)) AND user_id!=?";
                            array = new String[] { Long.toString(this.X) };
                            break;
                        }
                        case 9: {
                            if (this.l.a()) {
                                s = "(u_friendship IS NULL OR (u_friendship & 1 == 0)) AND u_user_id!=?";
                                array = new String[] { Long.toString(this.X) };
                                break;
                            }
                            s = null;
                            array = null;
                            break;
                        }
                        case 17: {
                            s = "type=? AND tag=?";
                            array = new String[] { Integer.toString(17), "-1" };
                            break;
                        }
                        case 6: {
                            s = "type=? AND tag=?";
                            array = new String[] { String.valueOf(6), String.valueOf(this.J.hashCode()) };
                            break;
                        }
                        case 32: {
                            if (this.K != null) {
                                final StringBuilder append2 = new StringBuilder("(friendship IS NULL OR (friendship & 1 == 0)) AND user_id!=?").append(" AND ").append("type").append("=? AND (");
                                array = new String[2 + this.K.length];
                                array[0] = Long.toString(this.X);
                                array[1] = String.valueOf(6);
                                for (int j = 0; j < -1 + this.K.length; ++j) {
                                    append2.append("tag=?").append(" OR ");
                                    array[j + 2] = String.valueOf(this.K[j].hashCode());
                                }
                                append2.append("tag=?").append(")");
                                array[1 + this.K.length] = String.valueOf(this.K[-1 + this.K.length].hashCode());
                                s = append2.toString();
                                break;
                            }
                            s = "(friendship IS NULL OR (friendship & 1 == 0)) AND user_id!=?";
                            array = new String[] { Long.toString(this.X) };
                            break;
                        }
                    }
                }
                long long1;
                if (this.u == 27) {
                    long1 = 0L;
                }
                else {
                    long1 = this.getArguments().getLong("session_owner_id", this.aF().g());
                }
                return new k((Context)this.getActivity(), com.twitter.library.provider.ae.a(this.D, long1), this.H, s, array, this.I);
            }
            case 1: {
                return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(ContentUris.withAppendedId(be.t, this.X), this.X), cw.a, null, null, null);
            }
            case 2: {
                return new k((Context)this.getActivity(), com.twitter.library.provider.ae.a(this.D, this.getArguments().getLong("session_owner_id", this.aF().g())), this.H, "(friendship IS NULL OR (friendship & 1 == 0)) AND user_id!=?", new String[] { Long.toString(this.X) }, this.I);
            }
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        if (this.az != null) {
            this.b(this.az);
        }
    }
    
    public void onResume() {
        super.onResume();
        this.P();
        if (this.D != null) {
            if (this.U) {
                if (this.at) {
                    this.a_(3);
                    this.q();
                }
                else {
                    this.e(3);
                }
            }
            else if ((this.u != 17 && this.T() == null) || this.p != null || this.s != null) {
                this.a_(3);
                this.q();
            }
            else if (((yo)this.W).isEmpty()) {
                this.e(3);
            }
        }
        else {
            this.c_(3);
        }
        final TwitterUser f = this.aF().f();
        if (f != null && f.userId == this.X && f.isProtected && this.u == 1) {
            this.getLoaderManager().initLoader(1, null, this);
        }
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("state_dialog_user", this.d);
        if (this.f != null) {
            bundle.putSerializable("state_dialog_pc", (Serializable)this.f);
        }
        if (this.k != null) {
            bundle.putStringArrayList("state_checked_users", this.k);
        }
        if (this.e != null) {
            bundle.putString("state_dialog_user_token", this.e);
        }
        if (this.j != null) {
            bundle.putSerializable("state_pending_follows", (Serializable)this.j);
        }
        if (this.E != null) {
            bundle.putLongArray("state_user_ids", this.E);
        }
        if (!this.l.a()) {
            bundle.putSerializable("state_friendship_cache", (Serializable)this.l);
        }
        if (this.m != null && !this.m.isEmpty()) {
            bundle.putSerializable("state_incoming_friendship_cache", (Serializable)this.m);
        }
        bundle.putString("state_search_id", this.p);
        bundle.putParcelable("state_mediator", (Parcelable)this.s);
        if (this.u == 6 || this.u == 32) {
            bundle.putBoolean("state_fetched_category_users", this.w);
        }
        bundle.putInt("state_load_flags", this.v);
        if (this.U) {
            bundle.putBoolean("state_loader_initialized", this.at);
        }
        bundle.putInt("state_lookup_complete_pages", this.P);
        bundle.putBoolean("state_lookup_complete", this.Q);
        bundle.putBoolean("state_reverse_lookup_complete", this.R);
        bundle.putBoolean("state_wtf_complete", this.S);
        bundle.putInt("state_completed_components", this.au);
        bundle.putInt("state_total_progress_components", this.av);
        bundle.putBoolean("state_sync_follow_state", this.z);
        bundle.putParcelable("state_flow_controller", (Parcelable)this.G);
        bundle.putInt("state_total_users", this.y);
        bundle.putBoolean("state_hide_contacts_import_cta", this.ax);
        bundle.putBoolean("is_hidden", this.A);
        bundle.putBoolean("fast_follow_visible", this.aC);
    }
    
    public void onStop() {
        final com.twitter.android.client.c aw = this.aw();
        final Session af = this.aF();
        if (!this.c.isEmpty()) {
            final Iterator<Long> iterator = this.c.keySet().iterator();
            while (iterator.hasNext()) {
                this.a(new pv(this.an, af, this.X, this.u, this.h, iterator.next(), null), 18, 0);
            }
            this.c.clear();
        }
        if (this.aK() != null) {
            this.aK().b();
        }
        if (this.z) {
            final long[] c = CollectionUtils.c(this.j);
            if (c != null) {
                this.a(new pd(this.an, af, c, !this.G.b()), 0, 0);
                this.j.clear();
                aw.a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { this.m(), "follow_friends:::follow_many" })).a((long)c.length));
            }
        }
        if (this.r()) {
            this.O();
        }
        super.onStop();
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final FragmentActivity activity = this.getActivity();
        final Bundle arguments = this.getArguments();
        final ListView y = this.Y();
        final LayoutInflater from = LayoutInflater.from((Context)activity);
        final ViewGroup viewGroup = (ViewGroup)from.inflate(2130969189, (ViewGroup)null);
        final View viewById = viewGroup.findViewById(2131886634);
        viewById.setOnClickListener((View$OnClickListener)this);
        if (this.ax) {
            viewGroup.findViewById(2131886759).setVisibility(8);
            viewById.setVisibility(8);
            viewGroup.findViewById(2131886109).setVisibility(8);
        }
        if (this.Q()) {
            this.b((View)viewGroup);
        }
        else if (arguments.getBoolean("find_friends", false)) {
            viewById.setVisibility(0);
        }
        y.setHeaderDividersEnabled(false);
        y.addHeaderView((View)viewGroup, (Object)"UsersFragmentHeader", true);
        final String string = arguments.getString("check_all_header");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            final PromptView promptView = new PromptView((Context)activity);
            promptView.setIsHeader(true);
            promptView.setTitle(string);
            viewGroup.addView((View)promptView);
            if (this.u == 28 && this.av == 0) {
                this.j(3);
            }
            if (y instanceof PinnedHeaderRefreshableListView) {
                final PinnedHeaderRefreshableListView pinnedHeaderRefreshableListView = (PinnedHeaderRefreshableListView)y;
                (this.as = from.inflate(2130969101, (ViewGroup)y, false)).setBackgroundResource(2131689637);
                pinnedHeaderRefreshableListView.a(this.as, 0);
                pinnedHeaderRefreshableListView.setRedrawOnDirtyHeaderView(this.as.findViewById(2131887271));
            }
        }
    }
    
    void t() {
        TextView textView;
        if (this.as != null) {
            textView = (TextView)this.as.findViewById(2131887270);
        }
        else {
            textView = null;
        }
        if (textView != null) {
            final int w = this.w();
            textView.setText((CharSequence)this.getActivity().getResources().getString(this.ar, new Object[] { w }));
            if (w > 0) {
                this.U().setChecked(this.j.size() == w);
            }
        }
    }
    
    public void v_() {
        this.A = true;
    }
    
    int w() {
        return this.y;
    }
    
    public FriendshipCache y() {
        return this.l;
    }
    
    public void z() {
        this.b(-1, -1, true);
    }
}
