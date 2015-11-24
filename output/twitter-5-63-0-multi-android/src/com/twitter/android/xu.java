// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import android.widget.TextView;
import com.twitter.library.media.widget.UserImageView;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.content.res.Resources;
import com.twitter.library.util.bj;
import com.twitter.library.api.z;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.database.Cursor;
import java.util.ArrayList;
import android.view.LayoutInflater;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.client.az;
import android.content.Context;
import android.view.View;
import com.twitter.library.api.PromotedContent;
import android.view.View$OnClickListener;

class xu implements View$OnClickListener
{
    final /* synthetic */ xx a;
    final /* synthetic */ long b;
    final /* synthetic */ PromotedContent c;
    final /* synthetic */ xz d;
    final /* synthetic */ xq e;
    
    xu(final xq e, final xx a, final long b, final PromotedContent c, final xz d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void onClick(final View view) {
        this.a.a(this.b, this.c, this.e.e, this.d);
    }
}
