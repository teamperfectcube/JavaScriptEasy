/*
 * MIT License
 *
 * Copyright (c) 2017 Perfect Cube
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.itsgaurav.javascripteasy.adapters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.itsgaurav.javascripteasy.R;
import com.itsgaurav.javascripteasy.activities.ChapterActivity;
import com.itsgaurav.javascripteasy.models.MainModel;
import com.zhukic.sectionedrecyclerview.SectionedRecyclerViewAdapter;

import java.util.List;

import static com.itsgaurav.javascripteasy.AppConstants.EXTRA_CHAPTER_NUMBER;
import static com.itsgaurav.javascripteasy.AppConstants.JS_CATEGORY_BASICS;
import static com.itsgaurav.javascripteasy.AppConstants.JS_CATEGORY_BROWSER_BOM;
import static com.itsgaurav.javascripteasy.AppConstants.JS_CATEGORY_FORMS;
import static com.itsgaurav.javascripteasy.AppConstants.JS_CATEGORY_FUNCTIONS;
import static com.itsgaurav.javascripteasy.AppConstants.JS_CATEGORY_HTML_DOM;
import static com.itsgaurav.javascripteasy.AppConstants.JS_CATEGORY_LIBRARY;
import static com.itsgaurav.javascripteasy.AppConstants.JS_CATEGORY_OBJECTS;


/**
 * Adapter class for providing data binding for MainActivity recyclerView.
 */

public class MainAdapter extends SectionedRecyclerViewAdapter<MainAdapter.HeaderItemViewHolder, MainAdapter.ItemViewHolder> {

    private List<MainModel> mList;
    private AppCompatActivity mContext;

    /**
     * Required constructor.
     *
     * @param list    List of main data.
     * @param context Context to use.
     */
    public MainAdapter(List<MainModel> list, AppCompatActivity context) {
        this.mList = list;
        this.mContext = context;
    }


    //For Header
    @Override
    public HeaderItemViewHolder onCreateSubheaderViewHolder(ViewGroup parent, int viewType) {
        return new HeaderItemViewHolder(LayoutInflater.
                from(parent.getContext())
                .inflate(R.layout.item_main_header
                        , parent
                        , false));
    }

    @Override
    public boolean onPlaceSubheaderBetweenItems(int position) {
        //return true if you want to place sub-header between two neighboring items
        MainModel data1 = mList.get(position);
        MainModel data2 = mList.get(position + 1);
        return !(data1.getChapterValue().equals(data2.getChapterValue()));
    }

    //For Content
    @Override
    public ItemViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_main
                        , parent
                        , false));
    }

    //For Header
    @Override
    public void onBindSubheaderViewHolder(HeaderItemViewHolder subHeaderHolder, int nextItemPosition) {
        MainModel data = mList.get(nextItemPosition);
        //Set header text
        switch (data.getChapterValue()) {
            case JS_CATEGORY_BASICS:
                subHeaderHolder.headerText.setText(JS_CATEGORY_BASICS);
                break;
            case JS_CATEGORY_FORMS:
                subHeaderHolder.headerText.setText(JS_CATEGORY_FORMS);
                break;
            case JS_CATEGORY_OBJECTS:
                subHeaderHolder.headerText.setText(JS_CATEGORY_OBJECTS);
                break;
            case JS_CATEGORY_FUNCTIONS:
                subHeaderHolder.headerText.setText(JS_CATEGORY_FUNCTIONS);
                break;
            case JS_CATEGORY_HTML_DOM:
                subHeaderHolder.headerText.setText(JS_CATEGORY_HTML_DOM);
                break;
            case JS_CATEGORY_BROWSER_BOM:
                subHeaderHolder.headerText.setText(JS_CATEGORY_BROWSER_BOM);
                break;
            case JS_CATEGORY_LIBRARY:
                subHeaderHolder.headerText.setText(JS_CATEGORY_LIBRARY);
                break;
        }
    }

    @Override
    public void onBindItemViewHolder(ItemViewHolder holder, int itemPosition) {
        final MainModel data = mList.get(itemPosition);
        //Set chapter name
        holder.chapterName.setText(data.getChapterName());

        //ItemView click functionality
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ChapterActivity.class);
                intent.putExtra(EXTRA_CHAPTER_NUMBER, data.getChapterNumber());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemSize() {
        return mList.size();
    }

    //Header ViewHolder class
    public static class HeaderItemViewHolder extends RecyclerView.ViewHolder {
        TextView headerText;

        public HeaderItemViewHolder(View itemView) {
            super(itemView);
            headerText = itemView.findViewById(R.id.textHeader);
        }
    }

    //Item ViewHolder class
    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView chapterName;

        public ItemViewHolder(View itemView) {
            super(itemView);
            chapterName = itemView.findViewById(R.id.textChapterName);
        }
    }

}
