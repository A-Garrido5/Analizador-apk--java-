// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.PromotedEvent;
import android.widget.AbsListView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.util.bk;
import android.os.Bundle;
import com.twitter.library.client.Session;
import com.twitter.internal.android.service.a;
import java.util.Collection;
import com.twitter.library.api.timeline.z;
import com.twitter.library.client.as;
import android.widget.ListView;
import com.twitter.library.provider.Tweet;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.App;
import java.util.HashSet;
import java.util.Iterator;
import com.twitter.library.api.b;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.widget.cz;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import java.util.HashMap;
import java.util.ArrayList;
import com.twitter.android.client.bv;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

class wv implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ View a;
    final /* synthetic */ wt b;
    
    wv(final wt b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onPreDraw() {
        final Object tag = this.a.getTag();
        if (tag instanceof xb && ((xb)tag).f.p()) {
            this.b.o = true;
        }
        this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        return true;
    }
}
