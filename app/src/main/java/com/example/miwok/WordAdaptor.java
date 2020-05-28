package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter {

    private int mColorResourceId;

    public WordAdaptor(Context context, ArrayList<Word> pWords, int colorResourceId) {
        super(context,0, pWords);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word local_word = (Word) getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(local_word.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(local_word.getDefaultTranslation());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(local_word.hasImage()){
            imageView.setImageResource(local_word.getMiwokImageId());
            imageView.setVisibility(View.VISIBLE);
        } else{
            //hides image view
            imageView.setVisibility(View.GONE);
        }

        View textBox = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textBox.setBackgroundColor(color);

        return listItemView;
    }

}
