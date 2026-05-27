package com.example.a30daysofmovie.data

import com.example.a30daysofmovie.R
import com.example.a30daysofmovie.model.Movie

class MovieDataSource {
    object MoviesRespository{
        val movies = listOf(
            Movie(
                titleRes = R.string.movie1,
                imageRes = R.drawable.cadena_perpetua,
                descriptionRes = R.string.description1
            ),
            Movie(
                titleRes = R.string.movie2,
                imageRes = R.drawable.el_padrino,
                descriptionRes = R.string.description2
            ),
            Movie(
                titleRes = R.string.movie3,
                imageRes = R.drawable.el_caballero_oscuro,
                descriptionRes = R.string.description3
            ),
            Movie(
                titleRes = R.string.movie4,
                imageRes = R.drawable.el_padrino_2,
                descriptionRes = R.string.description4
            ),
            Movie(
                titleRes = R.string.movie5,
                imageRes = R.drawable._2_hombre_sin_piedad,
                descriptionRes = R.string.description5
            ),
            Movie(
                titleRes = R.string.movie6,
                imageRes = R.drawable.el_senior_de_los_anillos_1,
                descriptionRes = R.string.description6
            ),
            Movie(
                titleRes = R.string.movie7,
                imageRes = R.drawable.la_lista_de_schindler,
                descriptionRes = R.string.description7
            ),
            Movie(
                titleRes = R.string.movie8,
                imageRes = R.drawable.el_senior_de_los_anillos_2,
                descriptionRes = R.string.description8
            ),
            Movie(
                titleRes = R.string.movie9,
                imageRes = R.drawable.pulp_fiction,
                descriptionRes = R.string.description9
            ),
            Movie(
                titleRes = R.string.movie10,
                imageRes = R.drawable.el_bueno_el_feo_y_el_malo,
                descriptionRes = R.string.description10
            ),
            Movie(
                titleRes = R.string.movie11,
                imageRes = R.drawable.el_senior_de_los_anillos_3,
                descriptionRes = R.string.description11
            ),
            Movie(
                titleRes = R.string.movie12,
                imageRes = R.drawable.el_club_de_la_lucha,
                descriptionRes = R.string.description12
            ),
            Movie(
                titleRes = R.string.movie13,
                imageRes = R.drawable.origen,
                descriptionRes = R.string.description13
            ),
            Movie(
                titleRes = R.string.movie14,
                imageRes = R.drawable.matrix,
                descriptionRes = R.string.description14
            ),
            Movie(
                titleRes = R.string.movie15,
                imageRes = R.drawable.uno_de_los_nuestros,
                descriptionRes = R.string.description15
            )
        )
    }
}