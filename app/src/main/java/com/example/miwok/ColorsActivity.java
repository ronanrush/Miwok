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


import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.miwok.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word>numbers = new ArrayList<>();
        numbers.add(new Word("Red", "weṭeṭṭi", R.drawable.color_red));
        numbers.add(new Word("Green", "chokokki", R.drawable.color_green));
        numbers.add(new Word("Brown", "ṭakaakki",R.drawable.color_brown));
        numbers.add(new Word("Grey", "ṭopoppi", R.drawable.color_gray));
        numbers.add(new Word("Black", "kululli",R.drawable.color_black));
        numbers.add(new Word("White", "kelelli", R.drawable.color_white));
        numbers.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));


        WordAdaptor adapter = new WordAdaptor(this, numbers, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        Toast toast = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT);
        toast.show();
    }
}

