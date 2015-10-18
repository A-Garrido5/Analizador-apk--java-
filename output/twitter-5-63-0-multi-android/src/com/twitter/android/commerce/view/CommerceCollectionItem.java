// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.util.collection.i;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import android.text.TextUtils;
import com.twitter.android.commerce.util.c;
import com.twitter.util.l;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import com.twitter.android.revenue.widget.media.MultiImageContainer;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.widget.LinearLayout;

public class CommerceCollectionItem extends LinearLayout
{
    private TypefacesTextView a;
    private TypefacesTextView b;
    private TypefacesTextView c;
    private MultiImageContainer d;
    private Tweet e;
    
    public CommerceCollectionItem(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void a() {
        this.d.a();
        this.b.setText((CharSequence)"");
        this.c.setText((CharSequence)"");
        this.a.setText((CharSequence)"");
        this.e = null;
    }
    
    public Tweet getTweet() {
        return this.e;
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TypefacesTextView)this.findViewById(2131886420);
        this.b = (TypefacesTextView)this.findViewById(2131886421);
        this.c = (TypefacesTextView)this.findViewById(2131886422);
        this.d = (MultiImageContainer)this.findViewById(2131886236);
    }
    
    public void setTweet(final Tweet e) {
        if (!l.a(e, this.e)) {
            this.a();
            this.e = e;
            if (this.e != null) {
                final HashMap a = com.twitter.android.commerce.util.c.a(e);
                final i b = com.twitter.android.commerce.util.c.b(e);
                if (!TextUtils.isEmpty((CharSequence)a.get("username"))) {
                    this.c.setText((CharSequence)("@" + a.get("username")));
                }
                else {
                    this.c.setVisibility(8);
                }
                if (!TextUtils.isEmpty((CharSequence)a.get("name"))) {
                    this.b.setText((CharSequence)a.get("name"));
                }
                else {
                    this.b.setVisibility(8);
                }
                if (!TextUtils.isEmpty((CharSequence)a.get("description"))) {
                    this.a.setText((CharSequence)a.get("description"));
                }
                else {
                    this.a.setVisibility(8);
                }
                if (!((List)b.a).isEmpty() && !((List)b.b).isEmpty()) {
                    final List list = (List)b.a;
                    final List list2 = (List)b.b;
                    if (list.size() == 1) {
                        this.d.a(list, list2, 0);
                        return;
                    }
                    if (list.size() == 2) {
                        final float n = 1.0f / list.size();
                        this.d.a(list, Arrays.asList(n, n), 0);
                        return;
                    }
                    if (list.size() == 3) {
                        this.d.a(list.subList(0, 2), Arrays.asList(0.5f, 0.5f), 0);
                        return;
                    }
                    if (list.size() == 4) {
                        this.d.a(list, Arrays.asList(1.0f, 1.0f, 1.0f, 1.0f), 2130969026);
                        return;
                    }
                    if (list.size() == 5) {
                        this.d.a(list.subList(0, 4), Arrays.asList(1.0f, 1.0f, 1.0f, 1.0f), 2130969026);
                    }
                }
            }
        }
    }
}
