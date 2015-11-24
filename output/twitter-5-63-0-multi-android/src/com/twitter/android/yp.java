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
import android.view.LayoutInflater;
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
import android.support.v4.widget.CursorAdapter;
import com.twitter.library.widget.UserView;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.widget.c;

class yp implements c
{
    final /* synthetic */ yo a;
    
    public yp(final yo a) {
        this.a = a;
    }
    
    public void a(final UserView userView, final long n, final int n2) {
        this.a.f.a(userView, n, n2);
        this.a.a();
    }
}
