package com.daniel_catlett.snoopyimagesdc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Ace extends AppCompatActivity
{
    Integer[] ace = {R.drawable.ace1, R.drawable.ace2, R.drawable.ace3, R.drawable.ace4};
    ImageView pic;
    GridView gridAce;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridAce = (GridView)findViewById(R.id.gridViewSports);
        gridAce.setAdapter(new Ace.ImageAdapter(this));

        ImageButton sportsBtn = (ImageButton)findViewById(R.id.imgButtonSports);
        ImageButton aceBtn = (ImageButton)findViewById(R.id.imgButtonAce);
        ImageButton miscBtn = (ImageButton)findViewById(R.id.imgButtonMisc);

        sportsBtn.setOnClickListener(sb);
        aceBtn.setOnClickListener(ab);
        miscBtn.setOnClickListener(mb);
    }

    Button.OnClickListener sb = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            startActivity(new Intent(Ace.this, MainActivity.class));
        }
    };

    Button.OnClickListener ab = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            Toast.makeText(Ace.this, "You are already viewing the Flying Ace album", Toast.LENGTH_SHORT).show();
        }
    };

    Button.OnClickListener mb = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            startActivity(new Intent(Ace.this, Misc.class));
        }
    };

    public class ImageAdapter extends BaseAdapter
    {
        private Context context;

        public ImageAdapter(Context c)
        {
            context = c;
        }

        @Override
        public int getCount()
        {
            return ace.length;
        }

        @Override
        public Object getItem(int i)
        {
            return null;
        }

        @Override
        public long getItemId(int i)
        {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            pic = new ImageView(context);
            pic.setImageResource(ace[i]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,330));
            return pic;
        }
    }
}
