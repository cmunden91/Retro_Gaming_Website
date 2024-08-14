const url = "/getGames"

function getGameList(){
    fetch(url).then(response => {
    if (response.ok) {
        return response.json();
    }
    else {
        throw new Error('Improper response' + response.statusText);
    }
    })
    .then(data => {
        addGameToView(data)
    })
    .catch(error => {
    console.error("Problem reading data",  error)})
};

function addGameToView(game) {
    var newDiv = document.createElement("div")
    var newImg = document.createElement("img")
    var gameDiv = document.getElementsByClassName("game-container")
    newDiv.setAttribute("class", "game-card")
    newDiv.setAttribute("data-title", game.name)
    newImg.setAttribute("src", game.imgLocation)
    newDiv.appendChild(newImg)
    gameDiv[0].appendChild(newDiv)

}
