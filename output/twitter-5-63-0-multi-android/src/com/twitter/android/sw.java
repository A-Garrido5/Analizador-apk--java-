// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import android.widget.Toast;
import android.text.TextUtils;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.y;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import com.twitter.library.client.au;

public class sw implements au
{
    private WeakReference a;
    
    sw(final FlowActivity flowActivity) {
        this.a = new WeakReference((T)flowActivity);
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        final FlowActivity flowActivity = (FlowActivity)this.a.get();
        if (flowActivity != null && n == 1) {
            final boolean x = y.X();
            final int[] e = ((oj)y).e();
            if (!x && e != null) {
                String string;
                CharSequence charSequence;
                if (CollectionUtils.a(e, 285)) {
                    string = flowActivity.getString(2131297821);
                    charSequence = null;
                }
                else if (CollectionUtils.a(e, 295)) {
                    charSequence = flowActivity.getString(2131297820);
                    string = null;
                }
                else {
                    charSequence = flowActivity.getString(2131297818);
                    string = null;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    Toast.makeText((Context)flowActivity, charSequence, 1).show();
                }
                if (string != null) {
                    flowActivity.a(new ht(null, null, string, null, null));
                }
            }
        }
    }
    
    @Override
    public void b(final int n, final y y) {
    }
}
