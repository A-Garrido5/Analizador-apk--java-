// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.TwitterUser;
import android.text.TextUtils;
import com.twitter.library.widget.UserView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

class k extends ArrayAdapter
{
    private final String a;
    
    public k(final Context context, final UserAccount[] array, final String a) {
        super(context, 0, (Object[])array);
        this.a = a;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate;
        ImageView imageView;
        if (view == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2130968577, viewGroup, false);
            final ImageView tag = (ImageView)inflate.findViewById(2131886223);
            inflate.setTag((Object)tag);
            imageView = tag;
        }
        else {
            imageView = (ImageView)view.getTag();
            inflate = view;
        }
        final UserView userView = (UserView)inflate;
        final UserAccount userAccount = (UserAccount)this.getItem(n);
        final TwitterUser b = userAccount.b;
        userView.setUser(b);
        String string = "";
        if (!TextUtils.isEmpty((CharSequence)b.name)) {
            string = string + b.name + ". ";
        }
        final String string2 = string + "@" + b.username + ".";
        String string3;
        if (userAccount.a.name.equals(this.a)) {
            imageView.setVisibility(0);
            string3 = this.getContext().getString(2131297664) + ". " + string2;
        }
        else {
            imageView.setVisibility(4);
            string3 = string2;
        }
        userView.setContentDescription((CharSequence)string3);
        return inflate;
    }
}
