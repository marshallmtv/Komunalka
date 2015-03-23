package com.example.andrew.kom;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.inputValue);
/*TextWatcherP inputTextWatcher= new TextWatcherP(e1);
e1.addTextChangedListener(inputTextWatcher);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class TextWatcherP implements TextWatcher {

        public EditText editText;

        public TextWatcherP(EditText et) {
            super();
            editText = et;
        }

        public void afterTextChanged(Editable s) {
            editText.setText(editText.getText() + " m3");

        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }
    }

    public void Go(View v) {
        double i1, i2;
        i1 = Integer.parseInt(e1.getText().toString());
        i2 = i1 * 5.2;
        TextView t = (TextView) findViewById(R.id.Result);
        t.setText(Double.toString(i2) + " грн.");
    }
}
