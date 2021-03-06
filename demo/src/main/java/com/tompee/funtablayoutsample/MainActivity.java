package com.tompee.funtablayoutsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tompee.funtablayout.BubbleTabAdapter;
import com.tompee.funtablayoutsample.bubbletablayout.BubbleTabLayoutActivity;
import com.tompee.funtablayoutsample.fliptablayout.FlipTabLayoutActivity;
import com.tompee.funtablayoutsample.poptablayout.PopTabLayoutActivity;
import com.tompee.funtablayoutsample.simpletablayout.SimpleTabLayoutActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.simple_tab:
                intent = new Intent(this, SimpleTabLayoutActivity.class);
                break;
            case R.id.bubble_tab:
                intent = new Intent(this, BubbleTabLayoutActivity.class);
                break;
            case R.id.pop_tab:
                intent = new Intent(this, PopTabLayoutActivity.class);
                break;
            case R.id.flip_tab:
                intent = new Intent(this, FlipTabLayoutActivity.class);
                break;
            default:
                intent = null;
        }
        startActivity(intent);
    }
}
