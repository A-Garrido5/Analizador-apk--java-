// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.os.Parcelable;
import com.twitter.library.client.as;
import com.twitter.library.api.ao;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.os.Bundle;
import android.content.Context;
import com.twitter.android.oy;
import java.util.HashMap;
import android.support.v4.widget.CursorAdapter;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.client.au;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.dialog.TakeoverDialogFragment;
import com.twitter.android.dialog.TakeoverPromptDialogFragment;
import com.twitter.library.api.Prompt;

public class az implements ay
{
    final /* synthetic */ av a;
    
    public az(final av a) {
        this.a = a;
    }
    
    @Override
    public void a(final Prompt prompt) {
        if (this.a.a.h_()) {
            ((TakeoverPromptDialogFragment)TakeoverDialogFragment.a(TakeoverPromptDialogFragment.class)).b(prompt).a(this.a.a);
        }
    }
}
