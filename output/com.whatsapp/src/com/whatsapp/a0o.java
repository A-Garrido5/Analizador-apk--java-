// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.bq;
import android.view.View;
import com.whatsapp.util.co;

class a0o extends co
{
    final CallsFragment b;
    
    a0o(final CallsFragment b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        final e_ e_ = (e_)view.getTag();
        if (e_ != null) {
            final a_9 e = e_.e();
            bq bq = null;
            switch (ww.a[e_.b().ordinal()]) {
                default: {
                    bq = null;
                    break;
                }
                case 2: {
                    bq = com.whatsapp.fieldstats.bq.CALLS_TAB_INCOMING;
                    break;
                }
                case 1: {
                    bq = com.whatsapp.fieldstats.bq.CALLS_TAB_OUTGOING;
                    break;
                }
                case 3: {
                    bq = com.whatsapp.fieldstats.bq.CALLS_TAB_MISSED;
                    break;
                }
            }
            App.a(e, this.b.getActivity(), bq);
        }
    }
}
