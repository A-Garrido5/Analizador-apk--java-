// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListView;
import com.twitter.library.scribe.ScribeLog;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.support.v4.content.Loader;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.refresh.widget.a;
import com.twitter.library.api.TwitterTopic;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.y;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.os.Parcelable;
import android.content.Intent;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

class hl implements View$OnClickListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ EventGridFragment b;
    
    hl(final EventGridFragment b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent((Context)this.b.getActivity(), (Class)TweetActivity.class).putExtra("tw", (Parcelable)((nx)view.getTag()).b).putExtra("association", (Parcelable)this.b.Z));
        this.b.a(this.b.B + ":photo_grid:photo::click");
    }
}
