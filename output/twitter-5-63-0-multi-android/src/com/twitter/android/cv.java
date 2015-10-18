// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import com.twitter.android.client.bz;
import android.text.Editable;
import android.content.Intent;
import android.text.TextUtils;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.conversations.ak;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.client.Session;
import android.os.Bundle;
import java.util.HashSet;
import com.twitter.library.client.as;
import java.util.Collection;
import java.util.Collections;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.twitter.util.k;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.autocomplete.c;
import com.twitter.internal.android.service.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.twitter.library.api.conversations.ad;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.api.conversations.af;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class cv extends z
{
    final /* synthetic */ DMComposeFragment a;
    
    private cv(final DMComposeFragment a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (this.a.getActivity() != null) {
            final af af = (af)y;
            final aa aa = (aa)af.l().b();
            if (af.b.equals(this.a.k)) {
                if (!aa.a()) {
                    Toast.makeText((Context)this.a.getActivity(), 2131296784, 0).show();
                    return;
                }
                final Map b = af.a.b;
                final List c = af.a.c;
                if (c.isEmpty()) {
                    Toast.makeText((Context)this.a.getActivity(), 2131296840, 0).show();
                }
                for (final TwitterUser twitterUser : c) {
                    final ad ad = b.get(twitterUser.username.toLowerCase());
                    if (ad != null) {
                        this.a.a(twitterUser, ad);
                    }
                }
            }
        }
    }
}
