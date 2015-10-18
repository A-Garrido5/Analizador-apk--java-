// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.util.aj;
import android.text.TextUtils;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;

public class EventView extends TopicView
{
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private String e;
    private String f;
    private int g;
    private int h;
    private String i;
    private Context j;
    
    public EventView(final Context context) {
        super(context);
    }
    
    public EventView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public EventView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected static String a(final String s, final int n, final Resources resources) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        if (n > 0) {
            return resources.getString(2131296947, new Object[] { aj.b(resources, n) });
        }
        return null;
    }
    
    @Override
    protected void a(final Context j, final AttributeSet set, final int n) {
        this.j = j;
    }
    
    @Override
    public void a(final String e, final int g, final String s, final String s2, final String s3, final String i, final String s4, final int h, final long n, final String s5, final String f, final byte[] array, final boolean b, final boolean b2, final Long n2, final String s6, final String s7, final String s8, final String s9) {
        super.a(e, g, s, s2, s3, i, s4, h, n, s5, f, array, b, b2, n2, s6, s7, s8, s9);
        this.e = e;
        this.g = g;
        this.i = i;
        this.f = f;
        this.h = h;
        final Resources resources = this.getResources();
        final String a = a(s4, h, resources);
        TopicView.a(this.a, s2);
        TopicView.a(this.b, s3);
        TopicView.a(this.c, a);
        if (this.d != null) {
            if (!b) {
                this.d.setVisibility(8);
                return;
            }
            String text;
            if (s2 != null && s2.length() <= 20) {
                text = resources.getString(2131296949, new Object[] { s2 });
            }
            else {
                text = resources.getString(2131296948);
            }
            this.d.setText((CharSequence)text);
            this.d.setVisibility(0);
        }
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final int n, final byte[] array, final String s4, final long n2, final String s5) {
        super.a(s, s2, s3, n, array, s4, n2, s5);
        final String a = a(s3, n, this.getResources());
        TopicView.a(this.a, s);
        TopicView.a(this.b, s2);
        TopicView.a(this.c, a);
    }
    
    @Override
    public String getSeedHashtag() {
        return this.i;
    }
    
    @Override
    public String getTopicId() {
        return this.e;
    }
    
    @Override
    public int getTopicType() {
        return this.g;
    }
    
    public int getTweetCount() {
        return this.h;
    }
    
    public String getViewUrl() {
        return this.f;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131886739);
        this.b = (TextView)this.findViewById(2131886740);
        this.c = (TextView)this.findViewById(2131886741);
        this.d = (TextView)this.findViewById(2131886737);
    }
}
