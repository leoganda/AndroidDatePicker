package net.leoganda.datepicker;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by leoganda on 4/5/17.
 */

public class DatetimePickerView extends DialogFragment {

    DatePicker mDatePicker;
    TimePicker mTimePicker;
    Button mBtnNext;
    Calendar calendar;
    DateTimePickerViewSelected callback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.layout_datetimepicker, container, false);
//        getDialog().setTitle("Simple Dialog");
//
//        mDatePicker = (DatePicker) rootView.findViewById(R.id.date_picker);
//        mTimePicker = (TimePicker) rootView.findViewById(R.id.time_picker);
//        mBtnNext = (Button) rootView.findViewById(R.id.btn_next);
//
//        mTimePicker.setVisibility(View.GONE);
//        mTimePicker.setIs24HourView(true);
//
//
//        mBtnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if(mTimePicker.getVisibility()== View.GONE) {
//                    mDatePicker.setVisibility(View.GONE);
//                    mTimePicker.setVisibility(View.VISIBLE);
//                    mBtnNext.setText("SET");
//                }else{
//
//                    calendar = new GregorianCalendar(mDatePicker.getYear(),
//                            mDatePicker.getMonth(),
//                            mDatePicker.getDayOfMonth(),
//                            mTimePicker.getCurrentHour(),
//                            mTimePicker.getCurrentMinute());
//
//                    callback.onDateTimeSelected(calendar);
//                    dismiss();
//                }
//            }
//        });


//        return rootView;
        return null;
    }


    public void setOnDateSelected(DateTimePickerViewSelected listener) {
        callback = listener;
    }
}
