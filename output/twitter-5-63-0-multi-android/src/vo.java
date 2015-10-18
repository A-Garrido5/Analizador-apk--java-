import java.util.Iterator;
import com.twitter.library.card.property.ImageSpec;
import com.twitter.library.card.instance.UserValue;
import com.twitter.library.card.instance.BindingValue;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.30
// 

class vo extends vc
{
    public vo() {
    }
    
    public vo(final HashMap hashMap) {
        if (hashMap != null) {
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                final String s = entry.getKey();
                final BindingValue bindingValue = (BindingValue)entry.getValue();
                if (bindingValue.value instanceof UserValue) {
                    this.a(s, ((UserValue)bindingValue.value).id);
                }
                else if (bindingValue.value instanceof ImageSpec) {
                    this.a(s, new vj((ImageSpec)bindingValue.value));
                }
                else {
                    this.a(s, bindingValue.value);
                }
            }
        }
    }
    
    public void a(final String s, final Object o) {
        if (s != null && o != null) {
            this.a.put(s, o);
        }
    }
}
