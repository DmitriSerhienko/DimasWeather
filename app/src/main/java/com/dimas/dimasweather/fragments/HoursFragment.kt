package com.dimas.dimasweather.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dimas.dimasweather.R
import com.dimas.dimasweather.adapters.WeatherAdapter
import com.dimas.dimasweather.adapters.WeatherModel
import com.dimas.dimasweather.databinding.FragmentHoursBinding

class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }
    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel("", "12:00", "Sunny", "25C", "" , "", "" , ""),
            WeatherModel("", "14:00", "Sunny", "35C", "" , "", "" , ""),
            WeatherModel("", "16:00", "Sunny", "45C", "" , "", "" , "")
        )
        adapter.submitList(list)
    }


    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }

}