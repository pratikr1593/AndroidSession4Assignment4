package com.example.pratikratnaparkhi.session4assignment3;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView listview=(GridView)findViewById(R.id.listView);

        BaseAaptorLearn learnadaptor=new BaseAaptorLearn(this);

        listview.setAdapter(learnadaptor);
    }

   /* public class listItems{
        Drawable name=null;
    }
    public List<listItems> getItems(){
        List<listItems> items=new ArrayList<listItems>();
        for(i=0;i<10;i++){
            listItems ob=new listItems();
            ob.name= getResources().getDrawable(R.drawable.and1);
            //ob.phno="PhoneNumber"+i;
            items.add(ob);
        }
        return items;
    }*/
}