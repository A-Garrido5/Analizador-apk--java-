// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.support.v4.app.Fragment;
import java.util.Iterator;
import android.content.Context;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import java.util.concurrent.Future;
import com.twitter.library.service.z;
import com.twitter.internal.android.widget.aq;
import com.twitter.library.service.y;
import com.twitter.internal.android.service.a;
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

final class c extends ay
{
    final /* synthetic */ AbsFragmentActivity a;
    
    public c(final AbsFragmentActivity a) {
        this.a = a;
    }
    
    @Override
    public void c(final Session session, final boolean b) {
        if (this.a.m.k) {
            this.a.S_();
        }
    }
}
