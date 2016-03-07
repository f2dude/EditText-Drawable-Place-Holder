package org.rbt.edittextplaceholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et;
    TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            //The below logic is important.
            if (!s.toString().contains("$")) {

                et.setText("$" + s.toString());//Setting the text to dollar symbol with space
                et.setSelection(1);//Always setting the cursor position to index 1
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.edit_text);
        et.setSelection(et.getText().length());//Always settings the cursor position to index 2
        et.addTextChangedListener(watcher);//Interface listener for text watcher
    }

    private void getLog(String logMsg) {

        Log.i("Edit Text", logMsg);
    }
}
