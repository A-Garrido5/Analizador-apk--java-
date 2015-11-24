// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.widget.BaseUserView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.twitter.library.util.bj;
import com.twitter.library.api.z;
import com.twitter.android.yk;
import com.twitter.library.widget.UserSocialView;
import com.twitter.library.scribe.TwitterScribeItem;
import android.view.View;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import com.twitter.library.featureswitch.d;
import android.database.Cursor;
import android.content.Context;
import com.twitter.android.mz;
import android.view.View$OnClickListener;
import android.util.SparseIntArray;
import android.support.v4.widget.CursorAdapter;

public class ba extends CursorAdapter
{
    private static final SparseIntArray a;
    private final c b;
    private final View$OnClickListener c;
    private final mz d;
    private String e;
    private final boolean f;
    private final boolean g;
    
    static {
        (a = new SparseIntArray(4)).put(6, 2131296706);
        ba.a.put(3, 2131296711);
        ba.a.put(5, 2131296714);
        ba.a.put(2, 2131296709);
    }
    
    ba(final Context context, final View$OnClickListener c, final mz d) {
        super(context, null, 0);
        this.b = com.twitter.android.client.c.a(context);
        this.c = c;
        this.d = d;
        this.g = com.twitter.library.featureswitch.d.f("search_features_reverse_bolding_enabled");
        this.f = com.twitter.library.featureswitch.d.f("search_features_tap_ahead_enabled");
    }
    
    private int a(final int n) {
        switch (n) {
            default: {
                return 2130839227;
            }
            case 6: {
                return 2130839230;
            }
            case 2: {
                return 2130839233;
            }
            case 3: {
                return 2130839236;
            }
            case 5: {
                return 2130839239;
            }
        }
    }
    
    private void a(final TextView textView, final String text) {
        if (this.g && !TextUtils.isEmpty((CharSequence)this.e)) {
            final SpannableString text2 = new SpannableString((CharSequence)text);
            final int length = text.length();
            final int length2 = this.e.length();
            final int index = text.toLowerCase().indexOf(this.e);
            if (index > -1 && index + length2 < length) {
                text2.setSpan((Object)new StyleSpan(1), length2 + index, length, 33);
            }
            textView.setText((CharSequence)text2);
            return;
        }
        textView.setText((CharSequence)text);
    }
    
    private void a(final bb bb, final String s) {
        this.a(bb, s, 0);
    }
    
    private void a(final bb bb, final String tag, final int n) {
        if (this.f && n == 0) {
            bb.c.setVisibility(0);
            bb.c.setOnClickListener(this.c);
            bb.c.setTag((Object)tag);
        }
        else if (this.f) {
            bb.c.setVisibility(8);
        }
    }
    
    public void a(final String s) {
        String lowerCase;
        if (s == null) {
            lowerCase = null;
        }
        else {
            lowerCase = s.toLowerCase();
        }
        this.e = lowerCase;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final int int1 = cursor.getInt(1);
        final int n = 1 + cursor.getPosition();
        TwitterScribeItem twitterScribeItem = null;
        switch (int1) {
            default: {
                final String string = cursor.getString(2);
                final bb bb = (bb)view.getTag();
                if (int1 != 1) {
                    this.a(bb.a, string);
                    if (this.f) {
                        this.a(bb, string);
                    }
                }
                else {
                    bb.a.setText((CharSequence)string);
                    bb.c.setVisibility(8);
                }
                twitterScribeItem = TwitterScribeItem.a(string, 12, n);
                break;
            }
            case 6:
            case 7: {
                final UserSocialView userSocialView = (UserSocialView)view;
                final yk yk = (yk)userSocialView.getTag();
                final long long1 = cursor.getLong(11);
                userSocialView.setUserId(long1);
                yk.d = long1;
                userSocialView.setUserImageUrl(cursor.getString(12));
                final String string2 = cursor.getString(2);
                userSocialView.a(cursor.getString(3), string2);
                userSocialView.setVerified((0x2 & cursor.getInt(13)) != 0x0);
                final int int2 = cursor.getInt(14);
                yk.e = int2;
                if (z.c(int2) || z.b(int2)) {
                    userSocialView.a(2130838677, int2, bj.e);
                }
                else {
                    userSocialView.a(1, 2130838677, cursor.getString(15), 0, bj.e);
                }
                twitterScribeItem = TwitterScribeItem.a(string2, 3, n);
                break;
            }
            case 8: {
                final bd bd = (bd)view.getTag();
                final String string3 = cursor.getString(2);
                bd.a.setText((CharSequence)string3);
                bd.b.setText((CharSequence)cursor.getString(5));
                twitterScribeItem = TwitterScribeItem.a(string3, 8, n);
                break;
            }
            case 5: {
                final String string4 = cursor.getString(2);
                final bb bb2 = (bb)view.getTag();
                this.a(bb2.a, string4);
                this.a(bb2, string4);
                twitterScribeItem = TwitterScribeItem.a(string4, 13, n);
                break;
            }
            case 4: {
                final String string5 = cursor.getString(2);
                final bc bc = (bc)view.getTag();
                final String string6 = cursor.getString(3);
                this.a(bc.b, string5);
                bc.a.setOnClickListener(this.c);
                bc.a.setTag((Object)string6);
                twitterScribeItem = TwitterScribeItem.a(string5, 12, n);
                break;
            }
            case 9: {
                final String string7 = cursor.getString(2);
                final int int3 = cursor.getInt(8);
                final bb bb3 = (bb)view.getTag();
                final int a = this.a(int3);
                this.a(bb3.a, string7);
                bb3.b.setImageResource(a);
                this.a(bb3, string7, int3);
                twitterScribeItem = TwitterScribeItem.a(string7, 12, n);
                break;
            }
            case 2: {
                final String string8 = cursor.getString(2);
                final int int4 = cursor.getInt(8);
                final bb bb4 = (bb)view.getTag();
                final int value = ba.a.get(int4, 0);
                final int a2 = this.a(int4);
                if (value > 0) {
                    final String string9 = context.getString(value, new Object[] { string8 });
                    final SpannableString text = new SpannableString((CharSequence)string9);
                    final int index = string9.indexOf(string8);
                    if (index > 0) {
                        text.setSpan((Object)new StyleSpan(1), index, string9.length(), 33);
                    }
                    bb4.a.setText((CharSequence)text);
                }
                else {
                    this.a(bb4.a, string8);
                }
                bb4.b.setImageResource(a2);
                this.a(bb4, string8, int4);
                twitterScribeItem = TwitterScribeItem.a(string8, 12, n);
                break;
            }
        }
        if (this.d != null) {
            final Bundle bundle = new Bundle(1);
            bundle.putInt("position", cursor.getPosition());
            this.d.a(view, twitterScribeItem, bundle);
        }
    }
    
    public int getItemViewType(final int n) {
        switch (((Cursor)this.getItem(n)).getInt(1)) {
            default: {
                return 0;
            }
            case 6:
            case 7: {
                return 1;
            }
            case 8: {
                return 2;
            }
            case 4: {
                return 3;
            }
            case 2:
            case 9: {
                return 5;
            }
        }
    }
    
    public int getViewTypeCount() {
        return 6;
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        switch (cursor.getInt(1)) {
            default: {
                final View inflate = LayoutInflater.from(context).inflate(2130969124, viewGroup, false);
                inflate.setTag((Object)new bb(inflate));
                return inflate;
            }
            case 6:
            case 7: {
                final UserSocialView userSocialView = (UserSocialView)LayoutInflater.from(context).inflate(2130969172, (ViewGroup)null);
                userSocialView.setTag((Object)new yk(userSocialView));
                return (View)userSocialView;
            }
            case 8: {
                final View inflate2 = LayoutInflater.from(context).inflate(2130969093, (ViewGroup)null);
                final bd tag = new bd(inflate2);
                inflate2.findViewById(2131886138).setVisibility(8);
                tag.b.setVisibility(0);
                inflate2.setTag((Object)tag);
                return inflate2;
            }
            case 4: {
                final View inflate3 = LayoutInflater.from(context).inflate(2130969017, viewGroup, false);
                inflate3.setTag((Object)new bc(inflate3));
                return inflate3;
            }
        }
    }
}
