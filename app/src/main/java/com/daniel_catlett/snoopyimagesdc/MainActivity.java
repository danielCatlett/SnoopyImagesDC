package com.daniel_catlett.snoopyimagesdc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    Integer[] sports = {R.drawable.baseball, R.drawable.football, R.drawable.hockey,
            R.drawable.soccer};
    Integer[] misc = {R.drawable.censustaker, R.drawable.helicoptor, R.drawable.detective,
            R.drawable.jazz};
    Integer[] ace = {R.drawable.ace1, R.drawable.ace2, R.drawable.ace3, R.drawable.ace4};


    ImageView pic;

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = (GridView)findViewById(R.id.gridView);
        grid.setAdapter(new ImageAdapter(this));

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

        }
    };


    Button.OnClickListener ab = new ImageButton.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {

        }
    };

    ImageButton.OnClickListener mb = new ImageButton.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {

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
            return sports.length;
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
            pic.setImageResource(sports[i]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,330));
            return pic;
        }
    }

    public class ImageAdapterAce extends BaseAdapter
    {
        private Context context;

        public ImageAdapterAce(Context c)
        {
            context = c;
        }

        @Override
        public int getCount()
        {
            return sports.length;
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
            pic.setImageResource(sports[i]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,330));
            return pic;
        }
    }

    public class ImageAdapterMisc extends BaseAdapter
    {
        private Context context;

        public ImageAdapterMisc(Context c)
        {
            context = c;
        }

        @Override
        public int getCount()
        {
            return sports.length;
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
            pic.setImageResource(sports[i]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,330));
            return pic;
        }
    }
}
