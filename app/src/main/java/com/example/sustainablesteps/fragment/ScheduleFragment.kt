package com.example.sustainablesteps.fragment

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import com.example.sustainablesteps.R
import com.example.sustainablesteps.databinding.FragmentScheduleBinding
import java.util.*

class ScheduleFragment : Fragment() {

    private lateinit var binding: FragmentScheduleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScheduleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val wasteCategoriesList: Array<String> = arrayOf(
            "Biodegradable Waste",
            "Non-BioDegradable Waste",
            "Construction Waste",
            "E-Waste"
        )

        val checkedCategories = BooleanArray(wasteCategoriesList.size)
        val selectedItems = mutableListOf(*wasteCategoriesList)

        binding.segregationCategoriesButton.setOnClickListener {
            binding.selectedItemsText.text = null
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Choose categories of waste")
            builder.setIcon(R.drawable.homeicon)
            builder.setMultiChoiceItems(wasteCategoriesList, checkedCategories) { _, which, isChecked ->
                checkedCategories[which] = isChecked
                val currentItem = wasteCategoriesList[which]
                if (isChecked) {
                    selectedItems.add(currentItem)
                } else if (selectedItems.contains(currentItem)) {
                    selectedItems.remove(currentItem)
                }
            }

            builder.setCancelable(false)

            builder.setPositiveButton("Done") { _, _ ->
//                binding.selectedItemsText.text = selectedItems.joinToString(", ")
                // Update the UI or perform actions with the selected items text
                // For example:
                for (i in checkedCategories.indices) {
                    if (checkedCategories[i]) {
                        binding.selectedItemsText.text = String.format("%s%s, ", binding.selectedItemsText.text, selectedItems[i])
                    }
                }
            }

            builder.setNegativeButton("CANCEL") { dialog, _ ->
                dialog.dismiss()
            }

            builder.setNeutralButton("CLEAR ALL") { _, _ ->
                Arrays.fill(checkedCategories, false)
                selectedItems.clear()
            }

            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}
