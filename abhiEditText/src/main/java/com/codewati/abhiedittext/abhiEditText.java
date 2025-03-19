package com.codewati.abhiedittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class abhiEditText extends ConstraintLayout {

    private EditText editText;
    private TextView headingTextView;
    private ImageView iconImageView;

    public abhiEditText(Context context) {
        super(context);
        init(context, null);
    }

    public abhiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public abhiEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.custom_edittext, this, true);

        editText = findViewById(R.id.customEditText);
        headingTextView = findViewById(R.id.headingText);
        iconImageView = findViewById(R.id.iconImage);

        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.abhiEditText);

            // Set Hint Text
            String hint = typedArray.getString(R.styleable.abhiEditText_hintText);
            if (hint != null) editText.setHint(hint);

            // Set Heading Text
            String heading = typedArray.getString(R.styleable.abhiEditText_headingText);
            if (heading != null) headingTextView.setText(heading);

            // Set Icon
            Drawable icon = typedArray.getDrawable(R.styleable.abhiEditText_iconSrc);
            if (icon != null) iconImageView.setImageDrawable(icon);

            // Set Input Type
            int inputType = typedArray.getInt(R.styleable.abhiEditText_inputType, 1);
            editText.setInputType(getInputType(inputType));

            typedArray.recycle();
        }
    }

    private int getInputType(int type) {
        switch (type) {
            case 1: // Text
                return InputType.TYPE_CLASS_TEXT;
            case 2: // Number
                return InputType.TYPE_CLASS_NUMBER;
            case 3: // Email
                return InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS;
            case 4: // Password
                return InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD;
            case 5: // Phone
                return InputType.TYPE_CLASS_PHONE;
            case 6: // Date
                return InputType.TYPE_CLASS_DATETIME | InputType.TYPE_DATETIME_VARIATION_DATE;
            case 7: // Time
                return InputType.TYPE_CLASS_DATETIME | InputType.TYPE_DATETIME_VARIATION_TIME;
            case 8: // Multiline Text
                return InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE;
            case 9: // Decimal Number
                return InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL;
            case 10: // Text with Cap Sentences
                return InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES;
            case 11: // Text with Cap Words
                return InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_WORDS;
            case 12: // Text with Auto Correct
                return InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_AUTO_CORRECT;
            case 13: // Text with No Suggestions
                return InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            case 14: // Text with IME Multi Line
                return InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            case 15: // Text with Shortcut
                return InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_ENABLE_TEXT_CONVERSION_SUGGESTIONS;
            default: // Default to Text
                return InputType.TYPE_CLASS_TEXT;
        }
    }

    public EditText getEditText() {
        return editText;
    }

    public void setText(String text) {
        editText.setText(text);
    }

    public String getText() {
        return editText.getText().toString();
    }
}