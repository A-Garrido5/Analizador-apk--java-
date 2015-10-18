// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.errorreporter.ErrorReporter;
import com.twitter.android.util.bd;
import com.twitter.library.provider.w;
import com.twitter.library.provider.bg;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.provider.ParcelableMatrixCursor;
import com.twitter.library.provider.cw;
import java.util.List;
import com.twitter.util.f;
import android.os.Bundle;
import com.twitter.library.util.bj;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.widget.BaseUserView;
import android.view.LayoutInflater;
import com.twitter.library.widget.UserView;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import android.view.View;
import com.twitter.library.api.z;
import android.view.animation.AnimationUtils;
import android.database.Cursor;
import android.content.Context;
import com.twitter.library.view.k;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.twitter.library.client.az;
import android.view.animation.Animation;
import java.util.HashMap;
import android.widget.Button;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.c;
import android.support.v4.widget.CursorAdapter;

public class yo extends CursorAdapter
{
    private final int a;
    private final int b;
    protected boolean c;
    protected final boolean d;
    protected boolean e;
    final c f;
    final FriendshipCache g;
    final boolean h;
    Button i;
    long j;
    private final int k;
    private final boolean l;
    private final HashMap m;
    private final Animation n;
    private final yp o;
    private final az p;
    private TextView q;
    private View$OnClickListener r;
    private mz s;
    private k t;
    private boolean u;
    private boolean v;
    
    public yo(final Context context, final int n, final int a, final c f, final FriendshipCache g, final int b, final int k, final boolean l, final boolean d) {
        super(context, null, n);
        this.a = a;
        this.f = f;
        this.g = g;
        this.b = b;
        this.k = k;
        this.h = (b > 0 || k > 0);
        this.p = az.a(context);
        this.j = this.p.b().g();
        this.u = false;
        this.l = l;
        this.d = d;
        this.c = true;
        this.e = true;
        this.m = new HashMap();
        this.n = AnimationUtils.loadAnimation(context, 2131034141);
        this.o = new yp(this);
    }
    
    private void a() {
        boolean enabled = true;
        if (this.h && this.i != null) {
            boolean b;
            if (this.mCursor.moveToFirst()) {
                do {
                    final long long1 = this.mCursor.getLong(2);
                    if (this.g.a(long1)) {
                        b = z.b(this.g.j(long1));
                    }
                    else {
                        b = z.b(this.mCursor.getInt(7));
                    }
                } while (b && this.mCursor.moveToNext());
            }
            else {
                b = enabled;
            }
            final Button i = this.i;
            if (b) {
                enabled = false;
            }
            i.setEnabled(enabled);
        }
    }
    
    private void a(final View view, final long n, final long n2) {
        view.clearAnimation();
        for (final Map.Entry<K, Long> entry : this.m.entrySet()) {
            if (n2 == entry.getValue()) {
                final Long n3 = (Long)entry.getKey();
                if (n != n3) {
                    this.m.remove(n3);
                    view.startAnimation(this.n);
                    break;
                }
                continue;
            }
        }
    }
    
    UserView a(final Context context, final ViewGroup viewGroup) {
        int n;
        if (this.d) {
            n = 2130968636;
        }
        else {
            n = 2130969184;
        }
        return this.a((UserView)LayoutInflater.from(context).inflate(n, viewGroup, false));
    }
    
    public UserView a(final View view) {
        return (UserView)view;
    }
    
    protected UserView a(final UserView userView) {
        if (this.d) {
            userView.setActionButtonClickListener(this.f);
            userView.setCheckBoxClickListener(this.f);
        }
        else if (this.a > 0) {
            userView.a(this.a, this.o);
            if (2130837600 == this.a) {
                userView.l.setBackgroundResource(2130837601);
            }
            else if (2130837610 == this.a) {
                userView.l.setBackgroundResource(2130837611);
            }
        }
        userView.setTag((Object)new yk(userView));
        return userView;
    }
    
    public Long a(final long n) {
        return this.m.get(n);
    }
    
    public void a(final long n, final long n2) {
        this.m.put(n, n2);
    }
    
    public void a(final View$OnClickListener r) {
        this.r = r;
    }
    
    public void a(final mz s) {
        this.s = s;
    }
    
    public void a(final k t) {
        if (this.t != null) {
            throw new IllegalStateException("Bio click listener already set");
        }
        this.t = t;
    }
    
    protected void a(final BaseUserView baseUserView, final long userId, final String userImageUrl, final String s, String g, final String s2, final TweetEntities tweetEntities, final PromotedContent promotedContent, final long c, final String f, final int e, final boolean protected1, final boolean verified, final int n) {
        baseUserView.setUserId(userId);
        baseUserView.a(s, g);
        baseUserView.setProtected(protected1);
        baseUserView.setVerified(verified);
        baseUserView.setUserImageUrl(userImageUrl);
        if (this.c) {
            baseUserView.a(s2, tweetEntities);
        }
        else {
            baseUserView.a(null, (TweetEntities)null);
        }
        baseUserView.a(promotedContent, bj.e);
        final yk yk = (yk)baseUserView.getTag();
        if (g == null) {
            g = s;
        }
        yk.g = g;
        yk.c = c;
        yk.f = f;
        if (this.s != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", n);
            this.s.a((View)baseUserView, promotedContent, bundle);
        }
        yk.e = e;
    }
    
    protected void a(final BaseUserView baseUserView, final Cursor cursor, final long n) {
        String string;
        if (cursor.getColumnIndex("token") != -1) {
            string = cursor.getString(15);
        }
        else {
            string = null;
        }
        final int int1 = cursor.getInt(6);
        this.a(baseUserView, n, cursor.getString(5), cursor.getString(4), cursor.getString(3), cursor.getString(8), TweetEntities.a(cursor.getBlob(9)), (PromotedContent)com.twitter.util.f.a(cursor.getBlob(10)), cursor.getInt(0), string, cursor.getInt(7), (int1 & 0x1) != 0x0, (int1 & 0x2) != 0x0, cursor.getPosition());
    }
    
    public void a(final List list) {
        final ParcelableMatrixCursor parcelableMatrixCursor = new ParcelableMatrixCursor(cw.a);
        final Iterator<TwitterUser> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final TwitterUser twitterUser = iterator.next();
            final w a = parcelableMatrixCursor.a();
            final int n2 = n + 1;
            a.a(n);
            a.a(0);
            a.a(twitterUser.userId);
            a.a(twitterUser.name);
            a.a(twitterUser.username);
            a.a(twitterUser.profileImageUrl);
            a.a(bg.a(twitterUser));
            a.a(twitterUser.friendship);
            a.a(twitterUser.profileDescription);
            Object a2;
            if (twitterUser.descriptionEntities == null) {
                a2 = null;
            }
            else {
                a2 = twitterUser.descriptionEntities.a();
            }
            a.a(a2);
            Object e;
            if (twitterUser.promotedContent == null) {
                e = null;
            }
            else {
                e = twitterUser.promotedContent.e();
            }
            a.a(e);
            a.a(0);
            n = n2;
        }
        this.swapCursor((Cursor)parcelableMatrixCursor);
    }
    
    public boolean areAllItemsEnabled() {
        return !this.h && super.areAllItemsEnabled();
    }
    
    public Long b(final long n) {
        return this.m.remove(n);
    }
    
    public void b() {
        this.m.clear();
    }
    
    public void b(final boolean u) {
        this.u = u;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final long long1 = cursor.getLong(2);
        this.a(view, long1, cursor.getLong(0));
        final UserView a = this.a(view);
        final yk yk = (yk)a.getTag();
        this.a(a, cursor, long1);
        if (this.a > 0) {
            if (!this.e || (!this.u && this.j == long1)) {
                a.l.setVisibility(4);
            }
            else {
                a.l.setVisibility(0);
                final FriendshipCache g = this.g;
                if (g != null) {
                    if (!g.a(long1)) {
                        g.b(long1, yk.e);
                    }
                    a.l.setChecked(g.k(long1));
                    if (this.v) {
                        a.setMuted(bd.a(g.j(long1)));
                    }
                }
            }
        }
    }
    
    public void c(final boolean c) {
        this.c = c;
    }
    
    public void d(final boolean e) {
        this.e = e;
    }
    
    public void e(final boolean v) {
        this.v = v;
    }
    
    @Override
    public int getCount() {
        int count = super.getCount();
        if (this.h) {
            if (count <= 0) {
                return 0;
            }
            ++count;
        }
        return count;
    }
    
    @Override
    public Object getItem(final int n) {
        if (!this.h) {
            return super.getItem(n);
        }
        if (n == 0) {
            return null;
        }
        return super.getItem(n - 1);
    }
    
    @Override
    public long getItemId(final int n) {
        int n2;
        if (this.h) {
            if (n == 0) {
                return 0L;
            }
            n2 = n - 1;
        }
        else {
            n2 = n;
        }
        if (n2 >= this.getCount()) {
            return 0L;
        }
        if (this.mCursor != null && this.mCursor.isClosed()) {
            ErrorReporter.a(new IllegalStateException("UsersAdapter.getItemId(" + n + ") called after the cursor was closed"));
        }
        else {
            final Cursor cursor = (Cursor)super.getItem(n2);
            if (cursor != null) {
                return cursor.getLong(2);
            }
        }
        return 0L;
    }
    
    public int getItemViewType(final int n) {
        if (this.h && n == 0) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        if (!this.h) {
            return super.getView(n, inflate, viewGroup);
        }
        if (n != 0) {
            return super.getView(n - 1, inflate, viewGroup);
        }
        final Context context = viewGroup.getContext();
        if (inflate == null) {
            inflate = LayoutInflater.from(context).inflate(2130968772, viewGroup, false);
            this.i = (Button)inflate.findViewById(2131886714);
            this.a();
            if (this.r != null) {
                this.i.setOnClickListener(this.r);
            }
            this.q = (TextView)inflate.findViewById(2131886764);
            if (!this.l) {
                inflate.findViewById(2131886714).setVisibility(8);
            }
        }
        final int count = super.getCount();
        final TextView textView = (TextView)inflate.findViewById(2131886391);
        if (this.k > 0) {
            textView.setText(this.k);
        }
        else {
            textView.setText((CharSequence)null);
            textView.setVisibility(8);
        }
        if (this.b > 0) {
            this.q.setText((CharSequence)context.getResources().getString(this.b, new Object[] { count }));
            return inflate;
        }
        this.q.setText((CharSequence)null);
        this.q.setVisibility(8);
        return inflate;
    }
    
    public int getViewTypeCount() {
        return 2;
    }
    
    public boolean isEnabled(final int n) {
        if (this.h) {
            return n != 0 && super.isEnabled(n - 1);
        }
        return super.isEnabled(n);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return (View)this.a(context, viewGroup);
    }
    
    @Override
    public Cursor swapCursor(final Cursor cursor) {
        this.j = this.p.b().g();
        return super.swapCursor(cursor);
    }
}
