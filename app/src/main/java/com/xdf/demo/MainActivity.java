package com.xdf.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xdf.demo.github.activity.GitHubActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button githubBtn = (Button) findViewById(R.id.btn_github);
        githubBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_github:
                Intent githubIntent = new Intent(this, GitHubActivity.class);
                startActivity(githubIntent);
                break;
        }
    }
}
