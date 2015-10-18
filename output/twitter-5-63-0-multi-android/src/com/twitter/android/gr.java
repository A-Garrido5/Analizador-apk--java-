// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Filter$FilterResults;
import android.widget.Filter;

class gr extends Filter
{
    final /* synthetic */ EditProfileActivity a;
    
    gr(final EditProfileActivity a) {
        this.a = a;
    }
    
    public CharSequence convertResultToString(final Object o) {
        return this.a.n.getText().toString();
    }
    
    protected Filter$FilterResults performFiltering(final CharSequence charSequence) {
        return null;
    }
    
    protected void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
    }
}
