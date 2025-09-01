package org.sjhstudio.diary.custom;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.sjhstudio.diary.R;

public class CustomDeleteDialog extends Dialog {
    ImageButton cancelButton;
    Button deleteButton;
    Button cancelButton2;
    TextView titleTextView;
    TextView deleteTextView;

    public CustomDeleteDialog(@NonNull Context context) {
        super(context);
    }

    public CustomDeleteDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_delete_photo);

        titleTextView = (TextView)findViewById(R.id.titleTextView);
        deleteTextView = (TextView)findViewById(R.id.deleteTextView);

        cancelButton = (ImageButton)findViewById(R.id.cancelButton);
        deleteButton = (Button)findViewById(R.id.deleteButton);
        cancelButton2 = (Button)findViewById(R.id.cancelButton2);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        cancelButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    public void setTitleTextView(String text) {
        titleTextView.setText(text);
    }

    public void setDeleteTextView(String text) {
        deleteTextView.setText(text);
    }

    public void setDeleteButtonText(String text) {
        deleteButton.setText(text);
    }

    public void setCancelButton2Text(String text) {
        cancelButton2.setText(text);
    }

    public void setDeleteButtonOnClickListener(View.OnClickListener listener) {
        deleteButton.setOnClickListener(listener);
    }
}
