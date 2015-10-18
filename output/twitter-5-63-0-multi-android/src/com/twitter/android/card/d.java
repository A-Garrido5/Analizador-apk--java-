// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import android.graphics.drawable.Drawable;
import com.twitter.android.client.t;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.api.TwitterUser;
import android.app.AlertDialog$Builder;
import com.twitter.library.api.z;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.view.View;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.client.az;
import com.twitter.library.card.j;
import com.twitter.library.card.Card;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.card.element.FollowButtonElement$Kind;
import com.twitter.library.card.element.FollowButtonElement;
import android.content.Context;
import com.twitter.android.client.s;
import android.view.View$OnClickListener;
import com.twitter.library.card.element.e;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class d implements DialogInterface$OnClickListener
{
    final /* synthetic */ b a;
    
    d(final b a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == -1) {
            this.a.k();
        }
    }
}
