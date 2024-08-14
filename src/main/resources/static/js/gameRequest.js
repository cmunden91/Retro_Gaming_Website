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
        console.log("This is the part where the data is read :3")
        console.log(data);
    })
    .catch(error => {
    console.error("Problem reading data",  error)})
};
