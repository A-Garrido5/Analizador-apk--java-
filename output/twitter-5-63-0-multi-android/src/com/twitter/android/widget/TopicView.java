// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public abstract class TopicView extends RelativeLayout
{
    private TopicView$TopicData a;
    
    public TopicView(final Context context) {
        super(context);
        this.a(context, null, 0);
    }
    
    public TopicView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context, set, 0);
    }
    
    public TopicView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context, set, n);
    }
    
    protected static void a(final TextView textView, final String s) {
        a(textView, s, 0);
    }
    
    protected static void a(final TextView textView, final String text, final int n) {
        if (textView != null) {
            if (TextUtils.isEmpty((CharSequence)text)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText((CharSequence)text);
            textView.setTypeface((Typeface)null, n);
            textView.setVisibility(0);
        }
    }
    
    protected abstract void a(final Context p0, final AttributeSet p1, final int p2);
    
    public void a(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final String s6, final int n2, final long n3, final String s7, final String s8, final byte[] array, final boolean b, final boolean b2, final Long n4, final String s9, final String s10, final String s11, final String s12) {
        this.a = new TopicView$TopicData(s, n, s3, s4, s2, s6, s7, s8, s5, n2, n3, array, s12);
    }
    
    public void a(final String s, final String s2, final String s3, final int n, final byte[] array, final String s4, final long n2, final String s5) {
    }
    
    public abstract String getSeedHashtag();
    
    public TopicView$TopicData getTopicData() {
        return this.a;
    }
    
    public abstract String getTopicId();
    
    public abstract int getTopicType();
}
