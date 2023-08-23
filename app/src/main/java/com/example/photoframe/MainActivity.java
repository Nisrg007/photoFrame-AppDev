package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] names={"Spiderman With Goblin","Black Spidy","Andrew With Gwen","Spidy With Gwen","Black Suit"};
ImageButton pre,next;
ImageView pic;
TextView footerText;
int currentImage=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pre(View view) {
        footerText =findViewById(R.id.footerText);
        String idX="pic"+currentImage;
        int x=this.getResources().getIdentifier(idX,"id",getPackageName());
    pic=findViewById(x);
    pic.setAlpha(0f);

    currentImage=(5+currentImage-1)%5;
        String idY="pic"+currentImage;
        int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);

        footerText.setText(names[currentImage]);

    }

    public void next(View view) {
        footerText =findViewById(R.id.footerText);
        String idX="pic"+currentImage;
        int x=this.getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentImage=(currentImage+1)%5;
        String idY="pic"+currentImage;
        int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        footerText.setText(names[currentImage]);
    }
}