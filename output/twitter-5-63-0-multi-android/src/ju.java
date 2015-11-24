import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.view.InflateException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ju
{
    protected final int a;
    protected final Context b;
    protected AttributeSet c;
    
    public ju(final Context b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void a() {
    Label_0077:
        while (true) {
            int n2 = 0;
            while (true) {
                final Context b = this.b;
                String s = null;
                int n4 = 0;
                boolean b2 = false;
                while (true) {
                    Label_0429: {
                        int n = 0;
                        Label_0416: {
                            try {
                                XmlResourceParser layout = b.getResources().getLayout(this.a);
                                try {
                                    this.c = Xml.asAttributeSet((XmlPullParser)layout);
                                    n = layout.getEventType();
                                    if (n != 2) {
                                        goto Label_0164;
                                    }
                                    final String name = layout.getName();
                                    if (name.equals("menu")) {
                                        n = layout.next();
                                        break Label_0416;
                                    }
                                    throw new RuntimeException("Expecting menu, got " + name);
                                    final int next = layout.next();
                                    final int n3;
                                    n2 = n3;
                                    final String s2;
                                    s = s2;
                                    n4 = next;
                                    break Label_0429;
                                }
                                catch (XmlPullParserException ex) {
                                    layout = layout;
                                    throw new InflateException("Error inflating menu items", (Throwable)ex);
                                }
                                catch (IOException ex) {
                                    throw new InflateException("Error inflating menu items", (Throwable)ex);
                                }
                                if (layout != null) {
                                    layout.close();
                                }
                                return;
                            }
                            catch (IOException ex) {}
                            catch (XmlPullParserException ex) {}
                            finally {
                                final XmlResourceParser layout = null;
                                goto Label_0149;
                            }
                        }
                        n2 = 0;
                        b2 = false;
                        n4 = n;
                        s = null;
                    }
                    if (n2 != 0) {
                        continue;
                    }
                    break;
                }
                switch (n4) {
                    case 3: {
                        goto Label_0286;
                        goto Label_0286;
                    }
                    case 1: {
                        goto Label_0368;
                        goto Label_0368;
                    }
                    default: {
                        final String s2 = s;
                        final int n3 = n2;
                        continue Label_0077;
                    }
                    case 2: {
                        if (b2) {
                            final String s2 = s;
                            final int n3 = n2;
                            continue Label_0077;
                        }
                        goto Label_0182;
                    }
                }
            }
            final String s3;
            String s = s3;
            boolean b2 = true;
            final String s2 = s;
            final int n3 = n2;
            continue Label_0077;
        }
    }
    
    protected void b() {
    }
    
    protected void c() {
    }
    
    protected void d() {
    }
}
