// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.HashMap;
import android.view.View;
import android.view.View$OnClickListener;

class add implements View$OnClickListener
{
    final ConversationRow a;
    
    add(final ConversationRow a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.isLongClickable()) {
            final HashMap b = ConversationRow.b(this.a);
            if (b != null) {
                Label_0104: {
                    if (b.containsKey(this.a.t.a)) {
                        b.remove(this.a.t.a);
                        ConversationRow.a(this.a).setSelected(false);
                        if (!App.I) {
                            break Label_0104;
                        }
                    }
                    b.put(this.a.t.a, this.a.t);
                    ConversationRow.a(this.a).setSelected(true);
                }
                this.a.f().F();
            }
        }
    }
}
