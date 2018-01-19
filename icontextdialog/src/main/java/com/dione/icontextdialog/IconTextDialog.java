package com.dione.icontextdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Dione on 1/19/2018.
 */

public class IconTextDialog extends Dialog{
    private IconTextDialogImpl mIconTextDialogImpl;

    public IconTextDialog(@NonNull Context context) {
        super(context);
    }

    public IconTextDialog(@NonNull Context context, IconTextDialogImpl mIconTextDialogImpl) {
        super(context);
        this.mIconTextDialogImpl = mIconTextDialogImpl;
    }


    public IconTextDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_icon_text);
        mIconTextDialogImpl.buttonClicked(0, "teest");

    }



}
