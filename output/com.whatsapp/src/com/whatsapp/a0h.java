// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.Events$Call;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.util.co;

class a0h extends co
{
    final CallRatingActivity b;
    
    a0h(final CallRatingActivity b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        if (CallRatingActivity.d(this.b) != null) {
            CallRatingActivity.d(this.b).userRating = (double)CallRatingActivity.c(this.b).getRating();
            String trim = CallRatingActivity.a(this.b).getText().toString().trim();
            final Events$Call d = CallRatingActivity.d(this.b);
            if (TextUtils.isEmpty((CharSequence)trim)) {
                trim = null;
            }
            d.userDescription = trim;
        }
        this.b.finish();
    }
}
