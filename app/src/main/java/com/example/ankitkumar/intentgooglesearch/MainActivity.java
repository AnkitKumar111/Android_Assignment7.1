package com.example.ankitkumar.intentgooglesearch;

        import android.app.Activity;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;


public class MainActivity extends Activity {

    EditText textSearch;
    Button btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textSearch=(EditText)findViewById(R.id.textEntered);
        btnSearch=(Button)findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                String data=textSearch.getText().toString();

                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com?q="+data));
                startActivity(intent);
            }
        });
    }
}

