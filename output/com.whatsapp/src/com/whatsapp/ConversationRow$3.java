// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;

class ConversationRow$3 extends View
{
    final ConversationRow a;
    private final Rect b;
    
    ConversationRow$3(final ConversationRow a, final Context context) {
        this.a = a;
        super(context);
        this.b = new Rect();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.isSelected()) {
            this.getDrawingRect(this.b);
            this.b.top = this.a.d.top - (int)(1.5f * vc.b().b);
            this.b.bottom = this.a.d.bottom + Math.max(1, (int)(0.5f * vc.b().b));
            canvas.drawRect(this.b, ConversationRow.g());
        }
    }
}
