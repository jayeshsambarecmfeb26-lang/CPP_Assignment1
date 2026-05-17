const searchBtn = document.getElementById("searchBtn");
const movieInput = document.getElementById("movieInput");
const movieContainer = document.getElementById("movieContainer");
const loader = document.getElementById("loader");
const errorDiv = document.getElementById("error");


const API_KEY = "abc12345";

searchBtn.addEventListener("click", () => {
  const movieName = movieInput.value.trim();

  if (movieName === "") {
    showError("Please enter a movie name.");
    return;
  }

  fetchMovie(movieName);
});

async function fetchMovie(movieName) {
  try {
    showLoader();
    clearError();
    movieContainer.innerHTML = "";

    const response = await fetch(
      `https://www.omdbapi.com/?t=${movieName}&apikey=${API_KEY}`
    );

    if (!response.ok) {
      throw new Error("Failed to fetch data.");
    }

    const data = await response.json();

    if (data.Response === "False") {
      throw new Error(data.Error);
    }

    displayMovie(data);

  } catch (error) {
    showError(error.message);
  } finally {
    hideLoader();
  }
}

function displayMovie(movie) {
  movieContainer.innerHTML = `
    <div class="card shadow">
      <div class="row g-0">
        <div class="col-md-4">
          <img src="${movie.Poster}" class="img-fluid rounded-start" />
        </div>

        <div class="col-md-8">
          <div class="card-body">
            <h3>${movie.Title}</h3>
            <p><strong>Year:</strong> ${movie.Year}</p>
            <p><strong>Genre:</strong> ${movie.Genre}</p>
            <p><strong>IMDB Rating:</strong> ${movie.imdbRating}</p>
            <p>${movie.Plot}</p>
          </div>
        </div>
      </div>
    </div>
  `;
}

function showLoader() {
  loader.classList.remove("d-none");
}

function hideLoader() {
  loader.classList.add("d-none");
}

function showError(message) {
  errorDiv.textContent = message;
}

function clearError() {
  errorDiv.textContent = "";
}