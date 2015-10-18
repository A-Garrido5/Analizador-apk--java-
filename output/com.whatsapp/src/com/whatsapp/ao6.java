// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import com.whatsapp.util.m;
import android.view.View;
import android.text.format.DateUtils;

class ao6 implements r7
{
    int a;
    final ConversationRowAudio b;
    
    ao6(final ConversationRowAudio b) {
        this.b = b;
        this.a = -1;
    }
    
    @Override
    public void a() {
        ConversationRowAudio.e(this.b).setImageResource(2130838859);
        ConversationRowAudio.d(this.b).setMax(ConversationRowAudio.c(this.b).r());
        ConversationRowAudio.c().remove(this.b.m.a);
        this.a = -1;
        ConversationRowAudio.a(this.b);
    }
    
    @Override
    public void a(final int progress) {
        if (this.a != progress / 1000) {
            this.a = progress / 1000;
            ConversationRowAudio.f(this.b).setText((CharSequence)DateUtils.formatElapsedTime((long)this.a));
        }
        ConversationRowAudio.d(this.b).setProgress(progress);
    }
    
    @Override
    public void a(final boolean b) {
        final Conversation f = this.b.f();
        if (f != null) {
            final View viewById = f.findViewById(2131755426);
            if (viewById != null) {
                int visibility;
                if (b) {
                    visibility = 0;
                }
                else {
                    visibility = 4;
                }
                viewById.setVisibility(visibility);
            }
        }
    }
    
    @Override
    public void b() {
        ConversationRowAudio.c().put(this.b.m.a, ConversationRowAudio.c(this.b).d());
        ConversationRowAudio.e(this.b).setImageDrawable((Drawable)new m(this.b.getContext().getResources().getDrawable(2130838862)));
        this.a = ConversationRowAudio.c(this.b).d() / 1000;
        ConversationRowAudio.f(this.b).setText((CharSequence)DateUtils.formatElapsedTime((long)this.a));
        ConversationRowAudio.d(this.b).setProgress(ConversationRowAudio.c(this.b).d());
        ConversationRowAudio.g(this.b);
    }
    
    @Override
    public void c() {
        ConversationRowAudio.e(this.b).setImageResource(2130838859);
        ConversationRowAudio.c().remove(this.b.m.a);
        ConversationRowAudio.a(this.b);
    }
    
    @Override
    public void d() {
        ConversationRowAudio.e(this.b).setImageDrawable((Drawable)new m(this.b.getContext().getResources().getDrawable(2130838862)));
        Label_0103: {
            if (this.b.m.D != 0) {
                ConversationRowAudio.f(this.b).setText((CharSequence)DateUtils.formatElapsedTime((long)this.b.m.D));
                if (!App.I) {
                    break Label_0103;
                }
            }
            ConversationRowAudio.f(this.b).setText((CharSequence)DateUtils.formatElapsedTime((long)(ConversationRowAudio.c(this.b).r() / 1000)));
        }
        if (!ConversationRowAudio.c().containsKey(this.b.m.a)) {
            ConversationRowAudio.d(this.b).setProgress(0);
            ConversationRowAudio.c().remove(this.b.m.a);
        }
        ConversationRowAudio.g(this.b);
    }
}
