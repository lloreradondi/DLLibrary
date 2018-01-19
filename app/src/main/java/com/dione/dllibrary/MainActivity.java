package com.dione.dllibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dione.icontextdialog.IconTextDialog;
import com.dione.icontextdialog.IconTextDialogImpl;

public class MainActivity extends AppCompatActivity implements IconTextDialogImpl {
    private IconTextDialog mIconTextDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIconTextDialog = new IconTextDialog(this, this);
        mIconTextDialog.show();
    }

    @Override
    public void buttonClicked(int index, String text) {
        Log.d("TESTLOG", String.valueOf(index) + "--" + text);
    }
}
