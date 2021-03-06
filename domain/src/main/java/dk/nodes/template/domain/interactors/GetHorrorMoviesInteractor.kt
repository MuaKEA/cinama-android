package dk.nodes.template.domain.interactors

import dk.nodes.template.models.Movie
import dk.nodes.template.repositories.MovieRepository
import javax.inject.Inject

class GetHorrorMoviesInteractor @Inject constructor(
        private val movieRepository: MovieRepository): BaseAsyncInteractor<ArrayList<Movie>> {
    override suspend fun invoke(): ArrayList<Movie> {
        return movieRepository.getHorrorMovies()

    }


}