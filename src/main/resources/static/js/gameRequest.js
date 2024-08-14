//Fed a routing URL for dynamic retrieval of game information.
function getGamesForView(url){
    fetch(url).then(response => {
    if (response.ok) {
        return response.json();
    }
    else {
        throw new Error('Improper response' + response.statusText);
    }
    })
    .then(data => {
        addGamesToView(data)
    })
    .catch(error => {
    console.error("Problem reading data",  error)})
};
//Recursive function that will call upon itself multiple games are retrieved from controller.
function addGamesToView(games) {
    if(games.constructor == Array) {
        for (game of games) {
            addGamesToView(game)
        }
    }
    else {
    var newDiv = document.createElement("div")
    var newImg = document.createElement("img")
    var gameDiv = document.getElementsByClassName("game-container")
    newDiv.setAttribute("class", "game-card")
    newDiv.setAttribute("data-title", games.name)
    newImg.setAttribute("src", games.imgLocation)
    newDiv.appendChild(newImg)
    gameDiv[0].appendChild(newDiv)
   }
}
