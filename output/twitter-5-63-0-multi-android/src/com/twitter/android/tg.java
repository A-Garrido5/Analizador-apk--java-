// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import android.view.View;
import com.twitter.android.client.TwitterFragmentActivity;
import android.widget.TabHost$TabContentFactory;

class tg implements TabHost$TabContentFactory
{
    private final TwitterFragmentActivity a;
    
    public tg(final TwitterFragmentActivity a) {
        this.a = a;
    }
    
    public View createTabContent(final String s) {
        final View view = new View((Context)this.a);
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
