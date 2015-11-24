// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.widget.PromptDialogFragment;
import android.widget.Button;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.ap;
import com.twitter.library.api.TwitterUser;
import com.twitter.ui.widget.TwitterButton;
import android.text.TextWatcher;
import com.twitter.ui.widget.PromptView;
import com.twitter.android.client.ca;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.ScrollView;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.View;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class gv implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ EditProfileOnboardingActivity a;
    
    gv(final EditProfileOnboardingActivity a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        final Rect rect = new Rect();
        final Resources resources = this.a.getResources();
        this.a.s.getWindowVisibleDisplayFrame(rect);
        final int n = this.a.s.getRootView().getHeight() - rect.bottom;
        if (this.a.j.hasFocus() && (n > resources.getDimensionPixelSize(2131558941) || !this.a.l.hasWindowFocus())) {
            final int[] array = new int[2];
            final int[] array2 = new int[2];
            final View currentFocus = this.a.getCurrentFocus();
            this.a.findViewById(2131886663).getLocationInWindow(array);
            if (currentFocus != null) {
                currentFocus.getLocationInWindow(array2);
            }
            this.a.s.postDelayed((Runnable)new gw(this, array2[1] - array[1]), 80L);
        }
    }
}
