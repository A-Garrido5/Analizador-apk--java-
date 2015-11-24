// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import java.util.concurrent.Future;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import android.app.Activity;
import android.support.v4.app.NavUtils;
import android.os.Bundle;
import com.twitter.library.util.bq;
import android.os.Parcelable;
import com.twitter.library.util.ReferenceList;
import android.content.Intent;
import java.util.ArrayList;
import com.twitter.internal.android.widget.ToolBar;
import java.util.LinkedHashSet;
import com.twitter.android.BaseFragmentActivity;
import java.util.Iterator;
import com.twitter.internal.android.widget.aq;

class a implements aq
{
    final /* synthetic */ AbsFragmentActivity a;
    
    a(final AbsFragmentActivity a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final jx jx) {
        final Iterator<aq> iterator = this.a.e.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a(jx)) {
                return true;
            }
        }
        return this.a.a(jx);
    }
}
