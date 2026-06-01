package com.example.a30daysofmovie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30daysofmovie.data.MovieDataSource
import com.example.a30daysofmovie.model.Movie
import com.example.a30daysofmovie.ui.theme._30DaysOfMovieTheme

@Composable
fun MovieList(
    movies: List<Movie>
) {
    LazyColumn() {
        itemsIndexed(movies) { index, movie ->
            MovieListItem(
                movie = movie,
            )
        }
    }

}

@Composable
fun MovieListItem(
    movie: Movie,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(24.dp),
        //elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Column(
            modifier = modifier.padding(20.dp)
        ) {
            Text(
                text = stringResource(movie.day),
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = stringResource(movie.titleRes),
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                verticalAlignment = Alignment.Top
            ) {
                Image(
                    painter = painterResource(movie.imageRes),
                    contentDescription = "null",
                    modifier = modifier
                        .width(120.dp)
                        .height(180.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = stringResource(movie.descriptionRes),
                    modifier = modifier.weight(1f),
                    style = MaterialTheme.typography.bodyLarge,
                    lineHeight = 24.sp
                )
            }

        }
    }

}

@Preview
@Composable
fun MoviePreview() {
    _30DaysOfMovieTheme {
        MovieListItem(movie = MovieDataSource.MoviesRespository.movies[0])
    }
}

@Preview
@Composable
fun MovieListPreview() {
    _30DaysOfMovieTheme {
        MovieList(movies = MovieDataSource.MoviesRespository.movies)
    }
}
