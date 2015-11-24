// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation;
import com.twitter.android.widget.TextSwitcherView;
import java.util.Collection;
import java.util.Iterator;
import android.widget.ImageButton;
import com.twitter.internal.android.widget.TypefacesSpan;
import android.text.SpannableString;
import com.twitter.util.f;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.widget.UserSocialView;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.view.ViewParent;
import android.view.ViewConfiguration;
import com.twitter.android.widget.PipView;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import com.twitter.android.widget.TopicView;
import android.widget.TextView;
import android.widget.ListAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import com.twitter.library.provider.Tweet;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.android.client.bh;
import com.twitter.library.provider.ad;
import com.twitter.library.util.bj;
import com.twitter.library.util.bo;
import android.text.TextUtils;
import com.twitter.library.provider.cc;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.errorreporter.a;
import android.view.LayoutInflater;
import com.twitter.internal.android.widget.GroupedRowView;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.android.events.b;
import com.twitter.library.featureswitch.d;
import android.content.Context;
import java.util.LinkedList;
import java.util.ArrayList;
import android.database.Cursor;
import com.twitter.library.view.z;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.util.ReferenceList;
import java.util.List;
import android.view.View$OnClickListener;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.client.TwitterFragmentActivity;
import java.util.HashSet;
import java.util.HashMap;
import com.twitter.android.client.u;
import android.widget.BaseAdapter;

public class rf extends BaseAdapter implements u, gu
{
    private static final HashMap a;
    private static final HashMap b;
    private boolean A;
    private boolean B;
    private long C;
    private boolean D;
    private boolean E;
    private boolean F;
    private String G;
    private HashSet H;
    private final String I;
    private final mx J;
    private final gv K;
    private final xy L;
    private final TwitterFragmentActivity c;
    private final c d;
    private final az e;
    private final vf f;
    private final FriendshipCache g;
    private final mz h;
    private final AdapterView$OnItemClickListener i;
    private final xx j;
    private final View$OnClickListener k;
    private final List l;
    private final ReferenceList m;
    private final List n;
    private final String o;
    private final int p;
    private final int q;
    private final TwitterScribeAssociation r;
    private final boolean s;
    private final boolean t;
    private z u;
    private z v;
    private z w;
    private z x;
    private z y;
    private Cursor z;
    
    static {
        a = new HashMap(1);
        b = new HashMap(5);
        rf.a.put("event_parrot", 2131296950);
        rf.b.put("map_pin", 2130839019);
        rf.b.put("newspaper", 2130838679);
        rf.b.put("speech_bubble", 2130838680);
        rf.b.put("head", 2130838677);
        rf.b.put("megaphone", 2130838683);
    }
    
    public rf(final TwitterFragmentActivity c, final c d, final String o, final vf f, final FriendshipCache g, final mz h, final AdapterView$OnItemClickListener i, final xx j, final mx k, final int p21, final boolean b, final boolean s, final boolean b2, final String g2, final HashSet h2, final String l, final boolean t, final boolean a, final boolean e, final int q, final View$OnClickListener m) {
        this.l = new ArrayList();
        this.m = ReferenceList.a();
        this.n = new LinkedList();
        this.C = -1L;
        this.L = new rk();
        this.c = c;
        this.d = d;
        this.e = az.a((Context)c);
        this.o = o;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = m;
        this.p = p21;
        this.q = q;
        this.I = l;
        this.t = t;
        if (this.p == 2) {
            this.r = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.e.b().g())).b("search")).c("people");
        }
        else {
            this.r = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b("search")).c("universal");
        }
        this.z = null;
        this.s = s;
        this.G = g2;
        this.E = e;
        this.D = (e || (this.G != null && c instanceof hm));
        this.J = k;
        this.H = h2;
        this.A = a;
        this.B = com.twitter.library.featureswitch.d.f("context_reason_in_timeline_enabled");
        this.K = new gv((Context)this.c, this.I, this.G, b, this.p, this.C, this.E, this.D, b2);
    }
    
    private int a(final int n, final String s) {
        if (this.s && n == 2) {
            if (!com.twitter.android.events.b.c(s)) {
                if (com.twitter.android.events.b.f(s)) {
                    return 2130968787;
                }
                return 2130968801;
            }
        }
        else {
            switch (n) {
                default: {
                    return 2130969090;
                }
                case 2: {
                    if (com.twitter.android.events.b.c(s)) {
                        break;
                    }
                    if (com.twitter.android.events.b.f(s)) {
                        return 2130968787;
                    }
                    return 2130968801;
                }
            }
        }
        return 2130968797;
    }
    
    private View a(final Context context, final int n, final ro m, final View view, final ViewGroup viewGroup) {
        View view2;
        rh rh;
        if (view == null) {
            final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968804, viewGroup, false);
            final rh tag = new rh(new xb((View)groupedRowView));
            switch (m.b) {
                default: {
                    tag.a.f.setOnTweetViewClickListener(this.u);
                    break;
                }
                case 4: {
                    tag.a.f.setOnTweetViewClickListener(this.v);
                    break;
                }
                case 9: {
                    tag.a.f.setOnTweetViewClickListener(this.w);
                    break;
                }
                case 30: {
                    if (m.m.type == 2) {
                        tag.a.f.setOnTweetViewClickListener(this.x);
                        break;
                    }
                    if (m.m.type == 3) {
                        tag.a.f.setOnTweetViewClickListener(this.y);
                        break;
                    }
                    break;
                }
            }
            this.m.b(tag.a);
            groupedRowView.setTag((Object)tag);
            view2 = (View)groupedRowView;
            rh = tag;
        }
        else {
            if (!(view instanceof GroupedRowView)) {
                final IllegalStateException ex = new IllegalStateException("All views in the SearchResultAdapter are defined to be of type GroupedRowView but this view was of type " + view.getClass());
                ErrorReporter.b(new a().a("item type", m.b).a("item style", m.g).a("row position", n).a("view class", view.getClass()).a(ex));
                throw ex;
            }
            final GroupedRowView groupedRowView2 = (GroupedRowView)view;
            final rh rh2 = (rh)view.getTag();
            view2 = (View)groupedRowView2;
            rh = rh2;
        }
        rh.m = m;
        final Cursor z = this.z;
        if (z.moveToPosition(m.d)) {
            final String string = z.getString(cc.L);
            final Integer n2 = rf.b.get(z.getString(cc.M));
            if (this.B && !TextUtils.isEmpty((CharSequence)string) && n2 != null) {
                rh.a.f.setReason(string);
                rh.a.f.setReasonIconResId(n2);
            }
            else {
                rh.a.f.setReason(null);
                rh.a.f.setReasonIconResId(0);
            }
            rh.a.f.setContentSize(bo.a);
            rh.a.f.setRenderRtl(bj.e);
            final Tweet a = new ad(z).a();
            final bh a2 = bh.a(context);
            final boolean a3 = a2.a(a);
            final boolean b = a3 && a.n();
            rh.a.f.setAlwaysExpand(b);
            rh.a.f.setAlwaysExpandMedia(b);
            if (b) {
                rh.a.f.setExpandCardMediaType(3);
            }
            rh.a.f.setDisplayTranslationBadge(com.twitter.library.util.text.c.a(context, a));
            if (!a3) {
                a.i &= 0xFFFFFFF7;
            }
            if (m.b == 24) {
                a.q = null;
            }
            if (this.g != null) {
                this.g.a(a);
            }
            rh.a.f.setFriendshipCache(this.g);
            rh.a.f.a(a, this.F, new g(com.twitter.library.featureswitch.d.f("cards_forward_in_search_enabled") && b && a.a(false, a2.c()), this.c, a, DisplayMode.a, this.r, null));
            if (this.h != null) {
                Bundle bundle;
                if (this.B) {
                    bundle = new Bundle(2);
                    bundle.putString("reason_text", string);
                }
                else {
                    bundle = new Bundle(1);
                }
                bundle.putInt("position", n);
                this.h.a(view2, null, bundle);
            }
            if (this.f != null) {
                this.f.b(rh.a, m.c);
            }
        }
        return view2;
    }
    
    private View a(final Context context, final int n, final ro ro, final View view, final ViewGroup viewGroup, final int n2) {
        Object o;
        rh rh;
        if (view == null) {
            final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(n2, viewGroup, false);
            final rh tag = new rh((HorizontalListView)groupedRowView.findViewById(2131886392));
            groupedRowView.setTag((Object)tag);
            o = groupedRowView;
            rh = tag;
        }
        else {
            o = view;
            rh = (rh)((GroupedRowView)o).getTag();
        }
        rh.m = ro;
        tj adapter = (tj)rh.h.getAdapter();
        if (adapter == null) {
            adapter = new tj(context, true);
            rh.h.setAdapter((ListAdapter)adapter);
            rh.h.setOnItemClickListener(this.i);
            this.n.add(adapter);
        }
        adapter.swapCursor((Cursor)new com.twitter.library.provider.z(this.z, ro.d, ro.e));
        rh.h.setTag((Object)ro);
        if (this.h != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", n);
            this.h.a((View)o, null, bundle);
        }
        return (View)o;
    }
    
    private View a(final Context context, final ro m, View inflate, final ViewGroup viewGroup, final String text) {
        rh rh;
        if (inflate == null) {
            inflate = LayoutInflater.from(context).inflate(2130968795, viewGroup, false);
            final rh tag = new rh((TextView)inflate.findViewById(2131886291), inflate.findViewById(2131886793));
            inflate.setTag((Object)tag);
            rh = tag;
        }
        else {
            rh = (rh)inflate.getTag();
        }
        rh.m = m;
        rh.f.setText((CharSequence)text);
        return inflate;
    }
    
    private View a(View view, final ViewGroup viewGroup, final ro m, final Context context, final int n) {
        rh rh;
        if (view == null) {
            final Object o = LayoutInflater.from(context).inflate(n, viewGroup, false);
            final rh tag = new rh((TextView)((GroupedRowView)o).findViewById(2131886291), (TextView)((GroupedRowView)o).findViewById(2131886391));
            ((GroupedRowView)o).setTag((Object)tag);
            view = (View)o;
            rh = tag;
        }
        else {
            rh = (rh)view.getTag();
        }
        this.a(rh.f, m.k.d);
        this.a(rh.g, m.k.e);
        rh.m = m;
        return view;
    }
    
    private View a(final View view, final ViewGroup viewGroup, final ro m, final Context context, final Cursor cursor) {
        final int int1 = cursor.getInt(cc.z);
        final String string = cursor.getString(cc.y);
        GroupedRowView groupedRowView;
        TopicView j;
        rh tag;
        if (view == null) {
            groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(this.a(int1, string), viewGroup, false);
            j = (TopicView)groupedRowView.findViewById(2131886242);
            tag = new rh(j);
            groupedRowView.setTag((Object)tag);
        }
        else {
            final GroupedRowView groupedRowView2 = (GroupedRowView)view;
            final rh rh = (rh)groupedRowView2.getTag();
            j = rh.j;
            tag = rh;
            groupedRowView = groupedRowView2;
        }
        tag.m = m;
        this.a(j, cursor);
        if (this.h != null && m != null) {
            this.h.a((View)groupedRowView, null, Bundle.EMPTY);
        }
        return (View)groupedRowView;
    }
    
    private View a(final ro m, View view, final ViewGroup viewGroup) {
        rh tag;
        if (view == null) {
            view = new View(viewGroup.getContext());
            tag = new rh();
            view.setTag((Object)tag);
        }
        else {
            tag = (rh)view.getTag();
        }
        tag.m = m;
        return view;
    }
    
    private void a(final TextView textView, final String text) {
        if (!TextUtils.isEmpty((CharSequence)text)) {
            textView.setText((CharSequence)text);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
    
    private void a(final TopicView topicView, final Cursor cursor) {
        topicView.a(cursor.getString(cc.y), cursor.getInt(cc.z), cursor.getString(cc.G), cursor.getString(cc.B), cursor.getString(cc.C), cursor.getString(cc.D), cursor.getString(cc.H), cursor.getInt(cc.I), cursor.getLong(cc.J), cursor.getString(cc.A), cursor.getString(cc.E), cursor.getBlob(cc.K), !this.s, !this.s, cursor.getLong(cc.f), cursor.getString(cc.h), cursor.getString(cc.i), cursor.getString(cc.g), cursor.getString(cc.F));
    }
    
    private void a(final GroupedRowView groupedRowView, final int n) {
        switch (n) {
            default: {}
            case 1: {
                groupedRowView.setSingle(false);
                groupedRowView.setStyle(1);
            }
            case 5: {
                groupedRowView.setSingle(false);
                groupedRowView.setStyle(1);
                groupedRowView.a();
            }
            case 2: {
                groupedRowView.setSingle(false);
                groupedRowView.setStyle(2);
            }
            case 3: {
                groupedRowView.setSingle(false);
                groupedRowView.setStyle(3);
            }
            case 4: {
                groupedRowView.setSingle(true);
            }
            case 0: {
                groupedRowView.setSingle(false);
                groupedRowView.setStyle(0);
            }
        }
    }
    
    private View b(final Context context, final int n, final ro m, final View view, final ViewGroup viewGroup) {
        GroupedRowView groupedRowView;
        xq adapter;
        rh tag;
        if (view == null) {
            groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968805, viewGroup, false);
            final ViewPager viewPager = (ViewPager)groupedRowView.findViewById(2131886367);
            adapter = new xq((Context)this.c, this.g, n, this.L, this.j, LayoutInflater.from(context));
            viewPager.setAdapter(adapter);
            this.n.add(adapter);
            final PipView pipView = (PipView)groupedRowView.findViewById(2131886794);
            pipView.setPipOnPosition(0);
            viewPager.setOnPageChangeListener(new rg(this, (ViewParent)viewGroup, ViewConfiguration.get(context).getScaledTouchSlop(), n, groupedRowView, pipView));
            tag = new rh(viewPager, pipView);
            groupedRowView.setTag((Object)tag);
        }
        else {
            final GroupedRowView groupedRowView2 = (GroupedRowView)view;
            final rh rh = (rh)groupedRowView2.getTag();
            final xq xq = (xq)rh.d.getAdapter();
            groupedRowView = groupedRowView2;
            tag = rh;
            adapter = xq;
        }
        tag.m = m;
        adapter.swapCursor((Cursor)new com.twitter.library.provider.z(this.z, m.d, m.e));
        final int count = adapter.getCount();
        if (count > 1) {
            tag.e.setPipCount(count);
            tag.e.setVisibility(0);
        }
        else {
            tag.e.setVisibility(8);
        }
        if (this.h != null) {
            final Bundle bundle = new Bundle(2);
            bundle.putInt("position", n);
            bundle.putInt("page", 0);
            this.h.a((View)groupedRowView, null, bundle);
        }
        return (View)groupedRowView;
    }
    
    private View c(final Context context, final int n, final ro m, final View view, final ViewGroup viewGroup) {
        rh tag;
        Object o;
        UserSocialView userSocialView2;
        if (view == null) {
            final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968806, viewGroup, false);
            final UserSocialView userSocialView = (UserSocialView)groupedRowView.getChildAt(0);
            userSocialView.l.setBackgroundResource(2130837601);
            tag = new rh(new yk(userSocialView), new ri(this));
            groupedRowView.setTag((Object)tag);
            o = groupedRowView;
            userSocialView2 = userSocialView;
        }
        else {
            o = view;
            userSocialView2 = (UserSocialView)((GroupedRowView)o).getChildAt(0);
            tag = (rh)((GroupedRowView)o).getTag();
        }
        tag.m = m;
        final Cursor z = this.z;
        if (z.moveToPosition(m.d)) {
            final long long1 = z.getLong(cc.f);
            userSocialView2.setUserId(long1);
            tag.b.d = long1;
            userSocialView2.setUserImageUrl(z.getString(cc.i));
            userSocialView2.a(z.getString(cc.g), z.getString(cc.h));
            final int int1 = z.getInt(cc.j);
            userSocialView2.setProtected((int1 & 0x1) != 0x0);
            userSocialView2.setVerified((int1 & 0x2) != 0x0);
            final String string = z.getString(cc.w);
            String replaceAll;
            if (string != null) {
                replaceAll = string.replaceAll("[^\\S]", " ");
            }
            else {
                replaceAll = null;
            }
            userSocialView2.a(replaceAll, TweetEntities.a(z.getBlob(cc.x)));
            final PromotedContent promotedContent = (PromotedContent)com.twitter.util.f.a(z.getBlob(cc.l));
            userSocialView2.a(promotedContent, bj.e);
            if (this.h != null) {
                final Bundle bundle = new Bundle(1);
                bundle.putInt("position", n);
                this.h.a((View)o, null, bundle);
            }
            if (long1 == this.e.b().g()) {
                userSocialView2.l.setVisibility(8);
            }
            else {
                userSocialView2.l.setVisibility(0);
                tag.c.a(promotedContent);
                tag.c.a(n);
                userSocialView2.l.setBackgroundResource(2130837601);
                userSocialView2.a(2130837600, tag.c);
                final FriendshipCache g = this.g;
                final int int2 = z.getInt(cc.k);
                if (g != null) {
                    if (g.a(long1)) {
                        userSocialView2.l.setChecked(g.k(long1));
                    }
                    else {
                        userSocialView2.l.setChecked(com.twitter.library.api.z.b(int2));
                    }
                }
                tag.b.e = int2;
                if (com.twitter.library.api.z.c(int2)) {
                    userSocialView2.a(2130838677, int2, bj.e);
                    return (View)o;
                }
                userSocialView2.a(1, 2130838677, z.getString(cc.u), 0, bj.e);
                return (View)o;
            }
        }
        return (View)o;
    }
    
    private View d(final Context context, final int n, final ro m, final View view, final ViewGroup viewGroup) {
        GroupedRowView groupedRowView;
        rh rh;
        if (view == null) {
            groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968800, viewGroup, false);
            final rh tag = new rh((TextView)groupedRowView.findViewById(2131886291));
            groupedRowView.setTag((Object)tag);
            rh = tag;
        }
        else {
            final GroupedRowView groupedRowView2 = (GroupedRowView)view;
            rh = (rh)groupedRowView2.getTag();
            groupedRowView = groupedRowView2;
        }
        rh.m = m;
        rh.f.setText((CharSequence)m.i);
        if (this.h != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", n);
            this.h.a((View)groupedRowView, null, bundle);
        }
        return (View)groupedRowView;
    }
    
    private View e(final Context context, final int n, final ro m, View inflate, final ViewGroup viewGroup) {
        rh rh;
        if (inflate == null) {
            inflate = LayoutInflater.from(context).inflate(2130969114, viewGroup, false);
            final rh tag = new rh((TextView)inflate.findViewById(2131887282), (TextView)inflate.findViewById(2131887283));
            inflate.setTag((Object)tag);
            rh = tag;
        }
        else {
            rh = (rh)inflate.getTag();
        }
        rh.m = m;
        final SpannableString spannableString = new SpannableString((CharSequence)m.h.query);
        if (!m.h.correctionIndices.isEmpty()) {
            final int[] array = m.h.correctionIndices.get(0);
            spannableString.setSpan((Object)new TypefacesSpan(context, 3), array[0], array[1], 0);
        }
        rh.f.setText((CharSequence)context.getString(2131297887, new Object[] { spannableString }));
        rh.g.setText((CharSequence)context.getString(2131297888, new Object[] { this.o }));
        if (this.h != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", n);
            this.h.a(inflate, null, bundle);
        }
        return inflate;
    }
    
    private View f(final Context context, final int n, final ro m, View inflate, final ViewGroup viewGroup) {
        rh rh;
        if (inflate == null) {
            inflate = LayoutInflater.from(context).inflate(2130969094, viewGroup, false);
            final rh tag = new rh((TextView)inflate.findViewById(2131887267), (TextView)inflate.findViewById(2131887269), (ImageButton)inflate.findViewById(2131887268));
            inflate.setTag((Object)tag);
            rh = tag;
        }
        else {
            rh = (rh)inflate.getTag();
        }
        final String string = context.getString(2131297649, new Object[] { m.m.title });
        final int index = string.indexOf(m.m.title);
        final int n2 = index + m.m.title.length();
        final SpannableString text = new SpannableString((CharSequence)string);
        text.setSpan((Object)new TypefacesSpan(context, 2), index, n2, 0);
        rh.m = m;
        rh.f.setText((CharSequence)m.m.query);
        rh.g.setText((CharSequence)text);
        rh.l.setOnClickListener(this.k);
        rh.l.setTag((Object)m.m.a());
        if (this.h != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", n);
            this.h.a(inflate, null, bundle);
        }
        return inflate;
    }
    
    private View g(final Context context, final int n, final ro m, View inflate, final ViewGroup viewGroup) {
        rh rh;
        if (inflate == null) {
            inflate = LayoutInflater.from(context).inflate(2130969095, viewGroup, false);
            final rh tag = new rh((TextView)inflate.findViewById(2131886291));
            inflate.setTag((Object)tag);
            rh = tag;
        }
        else {
            rh = (rh)inflate.getTag();
        }
        rh.m = m;
        if (m.m.type == 2) {
            rh.f.setText(2131297654);
        }
        else if (m.m.type == 3) {
            rh.f.setText(2131297655);
        }
        if (this.h != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", n);
            this.h.a(inflate, null, bundle);
        }
        return inflate;
    }
    
    public int a(final long n) {
        final Iterator<ro> iterator = (Iterator<ro>)this.l.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            if (iterator.next().c == n) {
                return n2;
            }
            ++n2;
        }
        return 0;
    }
    
    public ro a(final int n) {
        return this.l.get(n);
    }
    
    public void a() {
        this.l.clear();
        this.l.addAll(this.K.a(this.z));
        this.notifyDataSetChanged();
    }
    
    public void a(final z u, final z v, final z w, final z x, final z y) {
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public Cursor b() {
        return this.z;
    }
    
    public void b(final boolean f) {
        if (this.F != f && !(this.F = f)) {
            final Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                iterator.next().f.q();
            }
        }
    }
    
    public int getCount() {
        return this.l.size();
    }
    
    public long getItemId(final int n) {
        return this.l.get(n).c;
    }
    
    public int getItemViewType(final int n) {
        return this.a(n).b;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final ro a = this.a(n);
        final TwitterFragmentActivity c = this.c;
        Object o = null;
        switch (a.b) {
            default: {
                o = this.a(a, view, viewGroup);
                break;
            }
            case 0:
            case 4:
            case 9:
            case 24:
            case 30:
            case 32: {
                o = this.a((Context)c, n, a, view, viewGroup);
                break;
            }
            case 15: {
                o = this.a((Context)c, a, view, viewGroup, ((Context)c).getString(2131297658));
                break;
            }
            case 6: {
                o = this.b((Context)c, n, a, view, viewGroup);
                break;
            }
            case 1: {
                o = this.c((Context)c, n, a, view, viewGroup);
                break;
            }
            case 14: {
                o = this.a((Context)c, a, view, viewGroup, ((Context)c).getString(2131297660));
                break;
            }
            case 8: {
                o = this.a((Context)c, a, view, viewGroup, ((Context)c).getString(2131297637, new Object[] { this.o }));
                break;
            }
            case 7: {
                o = this.a((Context)c, n, a, view, viewGroup, 2130968794);
                break;
            }
            case 26: {
                o = this.a((Context)c, a, view, viewGroup, ((Context)c).getString(2131297661));
                break;
            }
            case 20: {
                o = this.a((Context)c, n, a, view, viewGroup, 2130968643);
                break;
            }
            case 22: {
                o = this.b((Context)c, n, a, view, viewGroup);
                break;
            }
            case 16: {
                rh rh;
                if (view == null) {
                    final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from((Context)c).inflate(2130968791, viewGroup, false);
                    ((TextView)groupedRowView.findViewById(2131886291)).setText(2131297531);
                    final rh tag = new rh();
                    groupedRowView.setTag((Object)tag);
                    view = (View)groupedRowView;
                    rh = tag;
                }
                else {
                    rh = (rh)view.getTag();
                }
                rh.m = a;
                o = view;
                break;
            }
            case 18: {
                o = this.a(view, viewGroup, a, (Context)c, 2130968641);
                break;
            }
            case 19: {
                o = this.a(view, viewGroup, a, (Context)c, 2130968642);
                break;
            }
            case 25:
            case 31: {
                String s;
                if (a.k != null) {
                    s = ((Context)c).getString(2131296457, new Object[] { a.k.d });
                }
                else if (a.l != null) {
                    if (a.l.follow) {
                        s = ((Context)c).getString(2131297657);
                    }
                    else if (a.l.nearby) {
                        s = ((Context)c).getString(2131297659);
                    }
                    else {
                        s = ((Context)c).getString(2131296457);
                    }
                }
                else {
                    s = ((Context)c).getString(2131296457);
                }
                o = this.a((Context)c, a, view, viewGroup, s);
                break;
            }
            case 3: {
                o = this.d((Context)c, n, a, view, viewGroup);
                break;
            }
            case 2: {
                o = this.e((Context)c, n, a, view, viewGroup);
                break;
            }
            case 12: {
                o = this.f((Context)c, n, a, view, viewGroup);
                break;
            }
            case 29: {
                o = this.g((Context)c, n, a, view, viewGroup);
                break;
            }
            case 33: {
                rh rh2;
                if (view == null) {
                    final GroupedRowView groupedRowView2 = (GroupedRowView)LayoutInflater.from((Context)c).inflate(2130968800, viewGroup, false);
                    ((TextView)groupedRowView2.findViewById(2131886291)).setText(2131297635);
                    final rh tag2 = new rh();
                    groupedRowView2.setTag((Object)tag2);
                    view = (View)groupedRowView2;
                    rh2 = tag2;
                }
                else {
                    rh2 = (rh)view.getTag();
                }
                rh2.m = a;
                o = view;
                break;
            }
            case 11:
            case 28: {
                final Cursor z = this.z;
                Label_0883: {
                    if (z.moveToPosition(a.d)) {
                        switch (z.getInt(cc.z)) {
                            case 2: {
                                o = this.a(view, viewGroup, a, (Context)c, z);
                                break Label_0883;
                            }
                        }
                    }
                    o = view;
                }
                if (o == null) {
                    o = this.a(a, null, viewGroup);
                    break;
                }
                break;
            }
            case 27: {
                final Integer n2 = rf.a.get(this.I);
                boolean b;
                if (n2 == null) {
                    b = true;
                }
                else {
                    b = false;
                }
                rh tag3;
                if (view == null) {
                    o = LayoutInflater.from((Context)c).inflate(2130969015, (ViewGroup)null);
                    final TextSwitcherView textSwitcherView = (TextSwitcherView)((GroupedRowView)o).findViewById(2131887227);
                    int text;
                    if (n2 == null) {
                        text = 2131297239;
                    }
                    else {
                        ((TextView)textSwitcherView.findViewById(2131887228)).setText((int)n2);
                        textSwitcherView.setOnClickListener((View$OnClickListener)this.J);
                        text = 2131297498;
                    }
                    ((TextView)textSwitcherView.findViewById(2131887229)).setText(text);
                    tag3 = new rh(textSwitcherView);
                    ((GroupedRowView)o).setTag((Object)tag3);
                }
                else {
                    tag3 = (rh)view.getTag();
                    o = view;
                }
                tag3.m = a;
                final TextSwitcherView k = tag3.k;
                k.a();
                k.setOutAnimation((Animation)null);
                k.setInAnimation((Animation)null);
                if (this.A || b || this.H.contains(a.a) || this.t) {
                    k.setDisplayedChild(1);
                }
                else {
                    this.H.add(a.a);
                    k.setDisplayedChild(0);
                    k.setInAnimation((Context)this.c, 2131034152);
                    k.setOutAnimation((Context)this.c, 2131034151);
                    k.a(new rj(k), 3000L);
                }
                if (this.h != null) {
                    final Bundle bundle = new Bundle(1);
                    bundle.putInt("position", n);
                    bundle.putString("notification_setting_key", this.I);
                    this.h.a((View)o, null, bundle);
                    break;
                }
                break;
            }
        }
        this.a((GroupedRowView)o, a.g);
        return (View)o;
    }
    
    public int getViewTypeCount() {
        return 34;
    }
    
    public Cursor swapCursor(final Cursor z) {
        final Cursor z2 = this.z;
        this.z = z;
        final Iterator<gu> iterator = (Iterator<gu>)this.n.iterator();
        while (iterator.hasNext()) {
            iterator.next().swapCursor(null);
        }
        this.a();
        return z2;
    }
}
