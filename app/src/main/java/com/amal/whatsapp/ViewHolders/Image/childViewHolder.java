package com.amal.whatsapp.ViewHolders.Image;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.amal.whatsapp.Adapters.gridAdapter;
import com.amal.whatsapp.Models.StorageSize;
import com.amal.whatsapp.Pojo.Media_File;
import com.amal.whatsapp.R;
import com.amal.whatsapp.Utils.StorageUtil;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.bumptech.glide.Glide;

/**
 * Created by amal on 04/05/16.
 */
public class childViewHolder extends ChildViewHolder {

    GridView gridView;
    gridAdapter gridadapter;
    TextView name, size;
    CheckBox checkBox;
    ImageView imageView;


    /**
     * Default constructor.
     *
     * @param itemView The {@link View} being hosted in this ViewHolder
     */
    public childViewHolder(View itemView) {
        super(itemView);
        //  gridView = (GridView) itemView.findViewById(R.id.child_grid);
        name = (TextView) itemView.findViewById(R.id.child_text_name);
        size = (TextView) itemView.findViewById(R.id.child_text_size);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        checkBox = (CheckBox) itemView.findViewById(R.id.child_checkbox);
    }

    public void bind(Context mContext, Media_File media_file) {
       /* gridadapter = new gridAdapter(mContext, childList.media_files);
        gridView.setAdapter(gridadapter);*/
        name.setText(media_file.file.getName());
        StorageSize mStorageSize = StorageUtil.convertStorageSize(media_file.file.length());
        size.setText(String.format("%.2f", mStorageSize.value) + " " + mStorageSize.suffix);
        checkBox.setChecked(media_file.checked);
        Glide.with(mContext).load(media_file.file).placeholder(R.drawable.image_thumnail).into(imageView);
    }
}