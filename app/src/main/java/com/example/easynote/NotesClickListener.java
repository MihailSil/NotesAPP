package com.example.easynote;

import androidx.cardview.widget.CardView;

import com.example.easynote.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
