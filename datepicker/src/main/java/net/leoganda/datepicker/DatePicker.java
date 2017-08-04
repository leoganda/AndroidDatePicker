package net.leoganda.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;


/**
 * Created by leoganda on 8/4/17.
 */

public class DatePicker extends View {

    private final LayoutInflater mInflater;


    public DatePicker(Context context) {
        super(context);
        mInflater = LayoutInflater.from(context);
    }


    public static void assign(final Context context, final EditText editText) {
        final Calendar c = Calendar.getInstance();

        editText.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                DatePickerDialog dp = new DatePickerDialog(context, android.R.style.Theme_Holo_Dialog_MinWidth, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int dayOfMonth) {
                        editText.setText(Integer.toString(month + 1) + "/" + Integer.toString(dayOfMonth) + "/" + Integer.toString(year));
                    }
                }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
                dp.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dp.show();
            }
        });

        editText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dp = new DatePickerDialog(context, android.R.style.Theme_Holo_Dialog_MinWidth, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int dayOfMonth) {
                        editText.setText(Integer.toString(month + 1) + "/" + Integer.toString(dayOfMonth) + "/" + Integer.toString(year));
                    }
                }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
                dp.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dp.show();
            }
        });
    }


}
