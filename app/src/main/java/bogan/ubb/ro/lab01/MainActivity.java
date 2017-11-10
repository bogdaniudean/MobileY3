package bogan.ubb.ro.lab01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listElements(View view)
    {
        Intent intent = new Intent(this, ListElements.class);
        startActivity(intent);
    }

    public void inputForm(View view)
    {
        Intent intent = new Intent(this, InputForm.class);
        startActivity(intent);
    }

}
