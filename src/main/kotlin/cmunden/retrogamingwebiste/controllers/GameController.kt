package cmunden.retrogamingwebiste.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@RestController
class GameController {
    //TODO: Add SQL database and pull data from model to this controller to be sent to the view.
    //Below are two example routes for testing REST communication and UI elements.
    @GetMapping("/getExampleGames")
    @ResponseBody
    public fun getExampleGames(): Array<Game> {
        val exampleGame = Game(2, "Test Game: The First", 1991, "Placeholder")
        val exampleGame2 = Game(3, "Test Game: The Sequel", 1995, "Placeholder")
        val Games = arrayOf (exampleGame, exampleGame2)
        return(Games);
    }
    @GetMapping("/getExampleGame")
    @ResponseBody
    public fun getExampleGame(): Game {
        val exampleGame = Game(1, "Test Game: The Original", 1989, "Placeholder")
        return(exampleGame)
    }
}
//TODO: Create proper Spring entity for managing database entries.
class Game(var gameId: Int, var name: String, var year: Int, var imgLocation: String) {

}