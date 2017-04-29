package com.google.firebase.quickstart.database.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.quickstart.database.R;
import com.google.firebase.quickstart.database.models.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView authorView;
    public ImageView starView;
    public TextView bodyView;
    public FrameLayout commentCountContainer;

    public PostViewHolder(View itemView) {
        super(itemView);

        authorView = (TextView) itemView.findViewById(R.id.post_author);
        starView = (ImageView) itemView.findViewById(R.id.star);
        bodyView = (TextView) itemView.findViewById(R.id.post_body);
        commentCountContainer = (FrameLayout)itemView.findViewById(R.id.comment_count_container);
    }

    public void bindToPost(Post post, View.OnClickListener starClickListener) {
        authorView.setText(post.author);
        bodyView.setText(post.body);

        starView.setOnClickListener(starClickListener);
    }
}
