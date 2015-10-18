// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.content.Context;
import android.widget.ImageView;

public class ConversationRowVoiceNote extends ConversationRowAudio
{
    private static a9q U;
    private final VoiceNoteSeekBar V;
    private final ImageView W;
    private final ImageView X;
    private final ImageView Y;
    
    static {
        ConversationRowVoiceNote.U = new a9q();
    }
    
    ConversationRowVoiceNote(final Context context, final bi bi) {
        super(context, bi);
        this.W = (ImageView)this.findViewById(2131755367);
        this.Y = (ImageView)this.findViewById(2131755475);
        this.X = (ImageView)this.findViewById(2131755498);
        this.V = (VoiceNoteSeekBar)this.findViewById(2131755470);
        this.c(bi);
    }
    
    private void c(final bi bi) {
        final boolean i = App.I;
        Label_0165: {
            if (bi.a.b) {
                if (bi.c == 8) {
                    this.X.setImageResource(2130838934);
                    this.V.setProgressColor(this.getContext().getResources().getColor(2131624052));
                    if (!i) {
                        break Label_0165;
                    }
                }
                this.X.setImageResource(2130838927);
                this.V.setProgressColor(this.getContext().getResources().getColor(2131624054));
                if (!i) {
                    break Label_0165;
                }
            }
            if (bi.c == 9 || bi.c == 10) {
                this.X.setImageResource(2130838934);
                this.V.setProgressColor(this.getContext().getResources().getColor(2131624052));
                if (!i) {
                    break Label_0165;
                }
            }
            this.X.setImageResource(2130838933);
            this.V.setProgressColor(this.getContext().getResources().getColor(2131624053));
        }
        final MediaData mediaData = (MediaData)bi.N;
        if (!mediaData.transferring && !mediaData.transferred && (!bi.x || !bi.a.b || a_9.f(bi.a.a))) {
            this.V.setProgressColor(0);
        }
        ImageView imageView = this.W;
        Label_0298: {
            if (!bi.a.b) {
                if (this.i) {
                    this.Y.setVisibility(0);
                    this.W.setVisibility(8);
                    imageView = this.Y;
                    if (!i) {
                        break Label_0298;
                    }
                }
                this.Y.setVisibility(8);
                this.W.setVisibility(0);
                imageView = this.W;
            }
        }
        if (bi.a.b) {
            ConversationRowVoiceNote.U.b(App.S.e(), imageView);
            if (!i) {
                return;
            }
        }
        String s;
        if (this.i) {
            s = bi.t;
        }
        else {
            s = this.m.a.a;
        }
        ConversationRowVoiceNote.U.b(App.S.e(s), imageView);
    }
    
    @Override
    public void a(final bi bi, final boolean b) {
        boolean b2;
        if (bi != this.t) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        super.a(bi, b);
        if (b2 || b) {
            this.c(bi);
        }
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    protected int b() {
        return 2130903130;
    }
    
    @Override
    public void d() {
        super.d();
        this.c(this.t);
    }
    
    @Override
    protected int p() {
        return 2130903132;
    }
}
