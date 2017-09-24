package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.londonappbrewery.destini.R.string.T1_Ans1;
import static com.londonappbrewery.destini.R.string.T1_Ans2;
import static com.londonappbrewery.destini.R.string.T1_Story;
import static com.londonappbrewery.destini.R.string.T2_Ans1;
import static com.londonappbrewery.destini.R.string.T2_Ans2;
import static com.londonappbrewery.destini.R.string.T2_Story;
import static com.londonappbrewery.destini.R.string.T3_Ans1;
import static com.londonappbrewery.destini.R.string.T3_Ans2;
import static com.londonappbrewery.destini.R.string.T3_Story;
import static com.londonappbrewery.destini.R.string.T4_End;
import static com.londonappbrewery.destini.R.string.T5_End;
import static com.londonappbrewery.destini.R.string.T6_End;

public class MainActivity extends AppCompatActivity {

// TODO: Steps 4 & 8 - Declare member variables here:
Button mButtonTop;
Button mButtonBottom;
TextView mStoryTextView;
int mStoryIndex;

@Override
protected void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (savedInstanceState != null) {
        mStoryIndex = savedInstanceState.getInt("IndexKey");
    } else {
        mStoryIndex = 0;
    }


    // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
    mButtonTop = (Button) findViewById(R.id.buttonTop);
    mButtonBottom = (Button) findViewById(R.id.buttonBottom);
    mStoryTextView = (TextView) findViewById(R.id.storyTextView);
    mStoryIndex = (mStoryIndex + 1);

    // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

    mButtonTop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (mStoryIndex == 1 || mStoryIndex == 2) {
                mStoryTextView.setText(T3_Story);
                mButtonTop.setText(T3_Ans1);
                mButtonBottom.setText(T3_Ans2);
            } else {
                mStoryTextView.setText(T6_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
            updateStory();
            updateStory();
        }

    });

    // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

    mButtonBottom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (mStoryIndex == 1) {
                mStoryTextView.setText(T2_Story);
                mButtonTop.setText(T2_Ans1);
                mButtonBottom.setText(T2_Ans2);
            } else if (mStoryIndex == 2) {
                mStoryTextView.setText(T4_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            } else {
                mStoryTextView.setText(T5_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
            updateStory();
        }


    });
}


private void updateStory() {
    mStoryIndex = mStoryIndex + 1;

}

}












