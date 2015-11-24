// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.os.Message;
import android.content.DialogInterface$OnClickListener;
import android.view.KeyEvent;
import android.os.Bundle;
import android.widget.Button;
import android.support.v7.appcompat.R$attr;
import android.util.TypedValue;
import android.content.Context;
import android.content.DialogInterface;

public class AlertDialog extends AppCompatDialog implements DialogInterface
{
    private AlertController mAlert;
    
    AlertDialog(final Context context, final int n, final boolean b) {
        super(context, resolveDialogTheme(context, n));
        this.mAlert = new AlertController(this.getContext(), this, this.getWindow());
    }
    
    static AlertController access$000(final AlertDialog alertDialog) {
        return alertDialog.mAlert;
    }
    
    static int resolveDialogTheme(final Context context, final int n) {
        if (n >= 16777216) {
            return n;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }
    
    public Button getButton(final int n) {
        return this.mAlert.getButton(n);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.mAlert.onKeyDown(n, keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return this.mAlert.onKeyUp(n, keyEvent) || super.onKeyUp(n, keyEvent);
    }
    
    public void setButton(final int n, final CharSequence charSequence, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.mAlert.setButton(n, charSequence, dialogInterface$OnClickListener, null);
    }
    
    public void setMessage(final CharSequence message) {
        this.mAlert.setMessage(message);
    }
    
    @Override
    public void setTitle(final CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }
}
