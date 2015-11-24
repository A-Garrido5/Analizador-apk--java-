// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import com.whatsapp.util.b;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.content.Context;
import com.whatsapp.util.b6;
import com.whatsapp.protocol.bi;
import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

class po implements AbsListView$OnScrollListener
{
    final Conversation a;
    private int b;
    
    po(final Conversation a) {
        this.a = a;
    }
    
    public void onScroll(final AbsListView absListView, final int b, final int n, final int n2) {
        final boolean i = App.I;
        Conversation.c(this.a, b);
        Conversation.l(this.a, false);
        Label_0073: {
            if (b + n >= this.a.u.getCount()) {
                Conversation.l(this.a, true);
                if (!i) {
                    break Label_0073;
                }
            }
            Conversation.l(this.a, false);
            this.a.aI.setTranscriptMode(0);
        }
        Label_0534: {
            if (Conversation.B(this.a) != 0 && this.b != b && n != 0) {
                final int n3 = (int)(48.0f * Conversation.J(this.a).b);
                Label_0230: {
                    if (b > this.b && Conversation.I(this.a) != null) {
                        if (n2 - n == 0) {
                            Conversation.I(this.a).setVisibility(8);
                            if (!i) {
                                break Label_0230;
                            }
                        }
                        if (n3 + b * (absListView.getHeight() - n3) / (n2 - n) < absListView.getHeight() - n3) {
                            Conversation.I(this.a).setVisibility(0);
                            if (Conversation.F(this.a) == null) {
                                break Label_0230;
                            }
                            Conversation.F(this.a).setVisibility(8);
                            if (!i) {
                                break Label_0230;
                            }
                        }
                        Conversation.I(this.a).setVisibility(8);
                    }
                }
                Label_0341: {
                    if (b < this.b && Conversation.F(this.a) != null) {
                        if (n2 - n == 0) {
                            Conversation.F(this.a).setVisibility(8);
                            if (!i) {
                                break Label_0341;
                            }
                        }
                        if (b * (absListView.getHeight() - n3) / (n2 - n) > n3) {
                            Conversation.F(this.a).setVisibility(0);
                            if (Conversation.I(this.a) == null) {
                                break Label_0341;
                            }
                            Conversation.I(this.a).setVisibility(8);
                            if (!i) {
                                break Label_0341;
                            }
                        }
                        Conversation.F(this.a).setVisibility(8);
                    }
                }
                final int n4 = b - this.a.aI.getHeaderViewsCount();
                if (n4 >= 0) {
                    final bi bi = (bi)this.a.u.getItem(n4);
                    Label_0517: {
                        if (bi != null && !b6.b(bi.u, System.currentTimeMillis())) {
                            Conversation.n(this.a).setText((CharSequence)b6.f((Context)this.a, bi.u));
                            Conversation.n(this.a).setTextSize(ConversationRow.a(this.a.getResources()));
                            if (Conversation.n(this.a).getVisibility() == 0) {
                                break Label_0517;
                            }
                            Conversation.n(this.a).setVisibility(0);
                            final TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
                            ((Animation)translateAnimation).setDuration(200L);
                            Conversation.n(this.a).startAnimation((Animation)translateAnimation);
                            if (!i) {
                                break Label_0517;
                            }
                        }
                        Conversation.n(this.a).setVisibility(8);
                    }
                    if (!i) {
                        break Label_0534;
                    }
                }
                Conversation.n(this.a).setVisibility(8);
            }
        }
        if (this.b != b && Conversation.B(this.a) != 0) {
            b.a(true);
        }
        this.b = b;
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        boolean b = true;
        Label_0077: {
            if (n != 0) {
                this.a.aI.setFastScrollEnabled(Build$VERSION.SDK_INT < 11 && b);
                Conversation.q(this.a).removeCallbacks(Conversation.h(this.a));
                if (!App.I) {
                    break Label_0077;
                }
            }
            Conversation.q(this.a).postDelayed(Conversation.h(this.a), 1000L);
        }
        Conversation.a(this.a, n);
        if (n == 0) {
            b = false;
        }
        com.whatsapp.util.b.a(b);
    }
}
