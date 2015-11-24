// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.card.property.ImageSpec;
import com.twitter.internal.android.util.Size;
import com.twitter.library.card.instance.CardInstanceData;
import java.io.Externalizable;

@Deprecated
public class TwitterStatusCard implements Externalizable
{
    private static final String[] a;
    private static final long serialVersionUID = 2885193802322867224L;
    public CardInstanceData cardInstanceData;
    public TweetClassicCard classicCard;
    
    static {
        a = new String[] { "promo_app", "promo_image_app" };
    }
    
    public TwitterStatusCard() {
        this(null, null);
    }
    
    public TwitterStatusCard(final TweetClassicCard tweetClassicCard) {
        this(tweetClassicCard, null);
    }
    
    private TwitterStatusCard(final TweetClassicCard classicCard, final CardInstanceData cardInstanceData) {
        this.classicCard = classicCard;
        this.cardInstanceData = cardInstanceData;
    }
    
    public TwitterStatusCard(final CardInstanceData cardInstanceData) {
        if (cardInstanceData.m()) {
            this.classicCard = a(cardInstanceData, 1);
        }
        else if (cardInstanceData.k()) {
            this.classicCard = b(cardInstanceData, 2);
        }
        this.cardInstanceData = cardInstanceData;
    }
    
    private static TweetClassicCard a(final CardInstanceData cardInstanceData, final int n) {
        final String a = cardInstanceData.a("title");
        final ImageSpec j = cardInstanceData.j();
        final String a2 = cardInstanceData.a("description");
        final String a3 = cardInstanceData.a("card_url");
        final TwitterUser c = cardInstanceData.c();
        String url;
        if (j != null) {
            url = j.url;
        }
        else {
            url = null;
        }
        Size size;
        if (j != null) {
            size = Size.a(j.size.x, j.size.y);
        }
        else {
            size = Size.a;
        }
        return new TweetClassicCard(n, a, a2, a3, url, null, size, 0, null, null, c, null);
    }
    
    public static boolean a(final String s) {
        final String[] a = TwitterStatusCard.a;
        final int length = a.length;
        int n = 0;
        boolean b;
        while (true) {
            b = false;
            if (n >= length) {
                break;
            }
            if (a[n].equals(s)) {
                b = true;
                break;
            }
            ++n;
        }
        return b;
    }
    
    private static TweetClassicCard b(final CardInstanceData cardInstanceData, final int n) {
        final String a = cardInstanceData.a("player_url");
        final TweetClassicCard a2 = a(cardInstanceData, n);
        a2.playerType = 1;
        a2.playerStreamUrl = cardInstanceData.a("player_stream_url");
        a2.playerUrl = a;
        if (a2.url == null) {
            a2.url = cardInstanceData.url;
        }
        return a2;
    }
    
    public static boolean b(final String s) {
        return "appplayer".equals(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof TwitterStatusCard)) {
                return false;
            }
            final TwitterStatusCard twitterStatusCard = (TwitterStatusCard)o;
            Label_0051: {
                if (this.cardInstanceData != null) {
                    if (this.cardInstanceData.equals(twitterStatusCard.cardInstanceData)) {
                        break Label_0051;
                    }
                }
                else if (twitterStatusCard.cardInstanceData == null) {
                    break Label_0051;
                }
                return false;
            }
            if (this.classicCard != null) {
                if (this.classicCard.equals(twitterStatusCard.classicCard)) {
                    return true;
                }
            }
            else if (twitterStatusCard.classicCard == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.classicCard != null) {
            hashCode = this.classicCard.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        final CardInstanceData cardInstanceData = this.cardInstanceData;
        int hashCode2 = 0;
        if (cardInstanceData != null) {
            hashCode2 = this.cardInstanceData.hashCode();
        }
        return n + hashCode2;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        if (objectInput.readInt() == 1) {
            this.cardInstanceData = (CardInstanceData)objectInput.readObject();
        }
        if (objectInput.readInt() == 1) {
            this.classicCard = (TweetClassicCard)objectInput.readObject();
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        if (this.cardInstanceData != null) {
            objectOutput.writeInt(1);
            objectOutput.writeObject(this.cardInstanceData);
        }
        else {
            objectOutput.writeInt(0);
        }
        if (this.classicCard != null) {
            objectOutput.writeInt(1);
            objectOutput.writeObject(this.classicCard);
            return;
        }
        objectOutput.writeInt(0);
    }
}
