package com.example.gouree.implicitintentdemo;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);


    }

    public void dosomething(View v)
    {
        EditText text1 = (EditText)findViewById(R.id.text1);

        /*Intent intent=new Intent(Intent.ACTION_VIEW);
        opening google engine without search string
          intent.setData(Uri.parse("http://www.google.com"));*/


        //String searchval = text1.getText().toString();
        //intent.setData(Uri.parse("https://www.google.co.in/search?searchval"));

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, text1.getText().toString()); // query contains search string*/
        startActivity(intent);

        
    }
}
