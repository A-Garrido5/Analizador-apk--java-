// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.content.CursorLoader;
import android.widget.ListAdapter;
import com.twitter.android.client.u;
import android.os.Parcelable;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.refresh.widget.a;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.api.search.g;
import com.twitter.library.service.y;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.Serializable;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.content.Intent;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

class rd implements View$OnClickListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ SearchPhotosFragment b;
    
    rd(final SearchPhotosFragment b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final nx nx = (nx)view.getTag();
        this.a.startActivity(new Intent(this.a, (Class)GalleryActivity.class).setData(ae.a(aw.a, this.b.aF().g())).putExtra("prj", cc.a).putExtra("sel", "flags&1537 !=0 AND search_id=?").putExtra("selArgs", new String[] { String.valueOf(this.b.s) }).putExtra("orderBy", "type_id ASC, _id ASC").putExtra("id", nx.b.Q).putExtra("context", 2).putExtra("media", (Serializable)nx.e));
        this.b.a(this.b.B + ":photo_grid:photo::click");
    }
}
