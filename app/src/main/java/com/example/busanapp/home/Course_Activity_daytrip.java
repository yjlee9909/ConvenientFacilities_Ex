package com.example.busanapp.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.busanapp.R;

public class Course_Activity_daytrip extends AppCompatActivity {
    private TextView tvtitle,tvtitle2, tvdescription, tvcategory,tvdescription2,tvdescription3,tvdescription4,tvdescription5 ;
    private ImageView img, img2, img3,img4,img5,img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_daytrip);

        tvtitle = (TextView) findViewById(R.id.tvtitle);
        tvtitle2 = (TextView) findViewById(R.id.tvtitle2);

        tvdescription = (TextView) findViewById(R.id.tvdescription);
        tvdescription2 = (TextView) findViewById(R.id.tvdescription2);
        tvdescription3 = (TextView)findViewById(R.id.tvdescription3);
        tvdescription4 = (TextView) findViewById(R.id.tvdescription4);
        tvdescription5 = (TextView) findViewById(R.id.tvdescription5);

        tvcategory = (TextView) findViewById(R.id.tvcategory);

        img = (ImageView) findViewById(R.id.coursethumbnail);
        img2 = (ImageView) findViewById(R.id.coursethumbnail2);
        img3 = (ImageView)findViewById(R.id.coursethumbnail3);
        img4 = (ImageView) findViewById(R.id.coursethumbnail4);
        img5 = (ImageView) findViewById(R.id.coursethumbnail5);
        img6 = (ImageView) findViewById(R.id.coursethumbnail6);


        // Receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Title2 = intent.getExtras().getString("Title2");
        String Description = intent.getExtras().getString("Description");
        String Description2 = intent.getExtras().getString("Description2");
        String Description3 = intent.getExtras().getString("Description3");
        String Description4 = intent.getExtras().getString("Description4");
        String Description5 = intent.getExtras().getString("Description5");


        String Category = intent.getExtras().getString("Category");

        int image = intent.getExtras().getInt("Thumbnail");
        int image2 = intent.getExtras().getInt("Thumbnail2");
        int image3 = intent.getExtras().getInt("Thumbnail3");
        int image4 = intent.getExtras().getInt("Thumbnail4");
        int image5 = intent.getExtras().getInt("Thumbnail5");
        int image6 = intent.getExtras().getInt("Thumbnail6");




        // Setting values

        tvtitle.setText(Title);
        tvtitle2.setText(Title2);

        tvdescription.setText(Description);
        tvdescription2.setText(Description2);
        tvdescription3.setText(Description3);
        tvdescription4.setText(Description4);
        tvdescription5.setText(Description5);

        tvcategory.setText(Category);

        img.setImageResource(image);
        img2.setImageResource(image2);
        img3.setImageResource(image3);
        img4.setImageResource(image4);
        img5.setImageResource(image5);
        img6.setImageResource(image6);
    }
}
