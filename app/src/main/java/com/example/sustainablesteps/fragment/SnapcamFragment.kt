package com.example.sustainablesteps.fragment

import android.app.DatePickerDialog
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.sustainablesteps.R
import com.example.sustainablesteps.databinding.FragmentScheduleBinding
import com.example.sustainablesteps.databinding.FragmentSnapcamBinding
import java.util.Locale

class SnapcamFragment : Fragment() {

    private lateinit var binding: FragmentSnapcamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSnapcamBinding.inflate(inflater, container, false)
        return binding.root
    }

    private lateinit var  tvDate : Button
    private lateinit var  tvtext : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvDate = binding.DateV
        tvtext = binding.TextV

        val myCalendar = Calendar.getInstance()
        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            myCalendar.set(Calendar.YEAR,year)
            myCalendar.set(Calendar.MONTH,month)
            myCalendar.set(Calendar.DAY_OF_MONTH,dayOfMonth)
            updateLable(myCalendar)
        }
        tvDate.setOnClickListener{
            DatePickerDialog(requireContext(), datePicker , myCalendar.get(Calendar.YEAR) , myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show()
        }

    }

    private fun updateLable(myCalendar: Calendar?) {
        val myFormat = "MM/dd/yyyy" // Change as you need
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
        tvtext.text = sdf.format(myCalendar?.time)
    }


    companion object {

    }
}