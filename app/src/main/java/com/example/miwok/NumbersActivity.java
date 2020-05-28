/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.miwok;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word>numbers = new ArrayList<>();
        numbers.add(new Word("one", "lutti", R.drawable.number_one, R.raw.numberone));
        numbers.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.numbertwo));
        numbers.add(new Word("three", "tolookosu", R.drawable.number_three,R.raw.numberthree));
        numbers.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.numberfour));
        numbers.add(new Word("five", "massokka", R.drawable.number_five,R.raw.numberfive));
        numbers.add(new Word("six", "temmokka", R.drawable.number_six,R.raw.numbersix));
        numbers.add(new Word("seven", "kenekaku", R.drawable.number_seven,R.raw.numberseven));
        numbers.add(new Word("eight", "kawinta", R.drawable.number_eight,R.raw.numbereight));
        numbers.add(new Word("nine", "wo’e", R.drawable.number_nine,R.raw.numbernine));
        numbers.add(new Word("ten", "na’aacha", R.drawable.number_ten,R.raw.numberten));


        WordAdaptor adapter = new WordAdaptor(this, numbers,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word number = numbers.get(position);
                mediaPlayer =  MediaPlayer.create(NumbersActivity.this, number.getAudioresourceId());
                mediaPlayer.start();
                Toast toast = Toast.makeText(NumbersActivity.this, "Hello", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}

