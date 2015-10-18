// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView$BufferType;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;

class a implements View$OnClickListener
{
    final /* synthetic */ ExpandableTextView a;
    
    a(final ExpandableTextView a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.c = !this.a.c;
        this.a.b();
        this.a.requestFocusFromTouch();
    }
}
