// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import android.widget.TextView;
import com.twitter.library.media.widget.UserImageView;
import android.text.TextUtils;
import android.widget.LinearLayout;
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
import android.content.res.Resources;
import com.twitter.library.api.PromotedContent;
import android.view.View$OnClickListener;

class xr implements View$OnClickListener
{
    final /* synthetic */ xx a;
    final /* synthetic */ long b;
    final /* synthetic */ PromotedContent c;
    final /* synthetic */ xz d;
    final /* synthetic */ xw e;
    final /* synthetic */ Resources f;
    final /* synthetic */ xq g;
    
    xr(final xq g, final xx a, final long b, final PromotedContent c, final xz d, final xw e, final Resources f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void onClick(final View view) {
        final int b = this.a.b(this.b, this.c, this.g.e, this.d);
        this.e.a(b, this.f);
        this.d.b = b;
    }
}
