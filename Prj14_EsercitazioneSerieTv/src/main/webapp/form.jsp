<form action="serie" method="post">

    <input type="number" name="id" id="id" placeholder="id">
    <input type="text" name="titolo" id="titolo" placeholder="titolo">
    <input type="text" name="immagine" id="immagine" placeholder="immagine">
    <input type="text" name="genere" id="genere" placeholder="genere">
    <input type="number" name="rating" id="rating" placeholder="rating">
    <input type="text" name="visto" id="visto" placeholder="visto">
    <input type="submit" value="aggiungi">

</form>

<script>

const URL = "https://api.tvmaze.com/singlesearch/shows?q=";
const CAMPO = document.getElementById("titolo");
const CAMPOIMG = document.getElementById("immagine");
const CAMPOGENERE = document.getElementById("genere");
CAMPO.onblur = function () {
    let parola = this.value;
    fetch(URL+parola)
        .then(serie => serie.json())
        .then(serie => {
            console.log(serie);
            console.log(serie.image.medium);
            CAMPOIMG.value = serie.image.medium;
            //CAMPOGENERE.value = serie.generes.Array(0);

        })
}


</script>