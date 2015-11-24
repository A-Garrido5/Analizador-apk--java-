// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class a2 extends Animation
{
    final AnswerCallView a;
    
    private a2(final AnswerCallView a) {
        this.a = a;
    }
    
    a2(final AnswerCallView answerCallView, final a80 a80) {
        this(answerCallView);
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        AnswerCallView.a(this.a, n);
        this.a.invalidate();
    }
}
