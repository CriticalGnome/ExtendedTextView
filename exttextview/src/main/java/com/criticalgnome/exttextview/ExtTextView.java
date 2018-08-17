package com.criticalgnome.exttextview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExtTextView extends LinearLayout {

    private TextView mainText;
    private TextView additionalText;

    public ExtTextView(Context context) {
        super(context);
        init();
    }

    public ExtTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ExtTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public ExtTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.ext_text_view, this, true);
        mainText = view.findViewById(R.id.mainText);
        additionalText = view.findViewById(R.id.additionalText);
    }

    public void setMainText(String text) {
        mainText.setText(text);
    }

    public void setMainText(@StringRes int res) {
        mainText.setText(getContext().getString(res));
    }

    public void setAdditionalText(String text) {
        if (text != null && text.length() > 0) {
            additionalText.setText(text);
            additionalText.setVisibility(View.VISIBLE);
        } else {
            additionalText.setVisibility(View.GONE);
        }
    }

    public void setAdditionalText(@StringRes int res) {
        additionalText.setText(getContext().getString(res));
        additionalText.setVisibility(View.VISIBLE);
    }
}
