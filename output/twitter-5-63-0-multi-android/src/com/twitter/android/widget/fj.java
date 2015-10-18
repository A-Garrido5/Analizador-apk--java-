// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;
import android.preference.DialogPreference;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.tv.TvTimelineActivity;
import android.view.View;
import android.view.View$OnClickListener;

class fj implements View$OnClickListener
{
    final /* synthetic */ TvTimelineLaunchDebugPreference a;
    
    fj(final TvTimelineLaunchDebugPreference a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent(this.a.getContext(), (Class)TvTimelineActivity.class);
        intent.putExtra("show_id", (Serializable)Long.valueOf(this.a.a.getText().toString()));
        this.a.getContext().startActivity(intent);
    }
}
