import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.PromotedEvent;

// 
// Decompiled by Procyon v0.5.30
// 

public class wo
{
    private PromotedEvent a;
    private long b;
    private String c;
    private String d;
    private boolean e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    
    public wm a() {
        return new wm(this, null);
    }
    
    public wo a(final PromotedContent promotedContent) {
        this.d = promotedContent.impressionId;
        this.e = "earned".equals(promotedContent.disclosureType);
        this.b = promotedContent.promotedTrendId;
        return this;
    }
    
    public wo a(final PromotedEvent a) {
        this.a = a;
        return this;
    }
}
