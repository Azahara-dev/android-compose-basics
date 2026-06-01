package com.example.a30daysofmovie.data

import com.example.a30daysofmovie.R
import com.example.a30daysofmovie.model.Movie

class MovieDataSource {
    object MoviesRespository{
        val movies = listOf(
            Movie(
                day = R.string.day1,
                titleRes = R.string.movie1,
                imageRes = R.drawable.cadena_perpetua,
                descriptionRes = R.string.description1
            ),
            Movie(
                day = R.string.day2,
                titleRes = R.string.movie2,
                imageRes = R.drawable.el_padrino,
                descriptionRes = R.string.description2
            ),
            Movie(
                day = R.string.day3,
                titleRes = R.string.movie3,
                imageRes = R.drawable.el_caballero_oscuro,
                descriptionRes = R.string.description3
            ),
            Movie(
                day = R.string.day4,
                titleRes = R.string.movie4,
                imageRes = R.drawable.el_padrino_2,
                descriptionRes = R.string.description4
            ),
            Movie(
                day = R.string.day5,
                titleRes = R.string.movie5,
                imageRes = R.drawable._2_hombre_sin_piedad,
                descriptionRes = R.string.description5
            ),
            Movie(
                day = R.string.day6,
                titleRes = R.string.movie6,
                imageRes = R.drawable.el_senior_de_los_anillos_1,
                descriptionRes = R.string.description6
            ),
            Movie(
                day = R.string.day7,
                titleRes = R.string.movie7,
                imageRes = R.drawable.la_lista_de_schindler,
                descriptionRes = R.string.description7
            ),
            Movie(
                day = R.string.day8,
                titleRes = R.string.movie8,
                imageRes = R.drawable.el_senior_de_los_anillos_2,
                descriptionRes = R.string.description8
            ),
            Movie(
                day = R.string.day9,
                titleRes = R.string.movie9,
                imageRes = R.drawable.pulp_fiction,
                descriptionRes = R.string.description9
            ),
            Movie(
                day = R.string.day10,
                titleRes = R.string.movie10,
                imageRes = R.drawable.el_bueno_el_feo_y_el_malo,
                descriptionRes = R.string.description10
            ),
            Movie(
                day = R.string.day11,
                titleRes = R.string.movie11,
                imageRes = R.drawable.el_senior_de_los_anillos_3,
                descriptionRes = R.string.description11
            ),
            Movie(
                day = R.string.day12,
                titleRes = R.string.movie12,
                imageRes = R.drawable.el_club_de_la_lucha,
                descriptionRes = R.string.description12
            ),
            Movie(
                day = R.string.day13,
                titleRes = R.string.movie13,
                imageRes = R.drawable.origen,
                descriptionRes = R.string.description13
            ),
            Movie(
                day = R.string.day14,
                titleRes = R.string.movie14,
                imageRes = R.drawable.matrix,
                descriptionRes = R.string.description14
            ),
            Movie(
                day = R.string.day15,
                titleRes = R.string.movie15,
                imageRes = R.drawable.uno_de_los_nuestros,
                descriptionRes = R.string.description15
            )
        )
    }
}