// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.database.Cursor;
import com.twitter.library.api.PromotedEvent;
import android.widget.AdapterView;
import com.twitter.library.api.by;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.UserView;
import com.twitter.library.widget.BaseUserView;
import java.util.List;
import android.support.v4.content.Loader;
import android.support.v4.app.LoaderManager;
import java.io.Serializable;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListAdapter;
import android.view.ViewConfiguration;
import android.content.Context;
import com.twitter.library.util.FriendshipCache;
import android.widget.ListView;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.Session;
import android.app.Activity;
import com.twitter.library.client.as;
import com.twitter.library.widget.c;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.widget.al;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class yc extends z
{
    final /* synthetic */ ya a;
    private final long b;
    
    public yc(final ya a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        if (!((aa)y.l().b()).a()) {
            this.a.o.c(this.b);
            this.a.j.notifyDataSetChanged();
        }
    }
}
