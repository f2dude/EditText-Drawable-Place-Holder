package org.rbt.edittextplaceholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et = (EditText) findViewById(R.id.edit_text);

        String code = "$";
        et.setCompoundDrawablesWithIntrinsicBounds(new TextDrawable(code), null, null, null);
        et.setCompoundDrawablePadding(code.length() * 34); //This method is only used for drawable padding. Increase or decrease it accordingly.
    }
}
