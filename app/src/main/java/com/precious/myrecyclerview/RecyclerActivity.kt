package com.precious.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.precious.myrecyclerview.adapters.CountryAdapter
import com.precious.myrecyclerview.databinding.ActivityRecyclerBinding
import com.precious.myrecyclerview.models.Country

class RecyclerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerBinding
    private lateinit var myCountryAdapter: CountryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*When initializing the binding variable, make sure you initialize it immediately
       after your super.onCreate function */
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
//        end of initializing the binding variable

        setContentView(binding.root)
        val countries : List<Country> = listOf(
            Country(
                R.drawable.ic_brazil,
                "Brazil",
                "South America",
                12L
            ),
            Country(
                R.drawable.ic_china,
                "China",
                "Asia",
                134L
            ),
            Country(
                R.drawable.ic_usa,
                "United States",
                "North America",
                495L
            ),
            Country(
                R.drawable.ic_nigeria,
                "Nigeria",
                "Africa",
                200L
            ),
            Country(
                R.drawable.ic_uk,
                "United Kingdom",
                "Europe",
                48L
            )


        )

        myCountryAdapter = CountryAdapter(countries)
        binding.countryRecyclerView.adapter = myCountryAdapter
    }
}