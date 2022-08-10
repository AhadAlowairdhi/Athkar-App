package com.example.athkariapp.data

import com.example.athkariapp.R
import com.example.athkariapp.model.Athkar

class DataSource {
    // list of items
    fun loadAthkat() : List<Athkar> {
        return listOf(
            Athkar(R.string.athkar1, R.drawable.image1),
            Athkar(R.string.athkar2, R.drawable.image2),
            Athkar(R.string.athkar3, R.drawable.image3),
            Athkar(R.string.athkar4, R.drawable.image4),
            Athkar(R.string.athkar5, R.drawable.image5),
            Athkar(R.string.athkar6, R.drawable.image6),
            Athkar(R.string.athkar7, R.drawable.image7),
            Athkar(R.string.athkar8, R.drawable.image8),
            Athkar(R.string.athkar9, R.drawable.image9),
            Athkar(R.string.athkar10, R.drawable.image10)
        )
    }
}