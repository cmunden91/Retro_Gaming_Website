package cmunden.retrogamingwebiste.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@RestController
class GameController {
    @GetMapping("/getGames")
    @ResponseBody
    public fun getGames(): Array<Game> {
        val exampleGame = Game(1, "Test Game", 1991, "Placeholder")
        val exampleGame2 = Game(3, "Test Game: The Sequel", 1995, "Placeholder")
        val Games = arrayOf (exampleGame, exampleGame2)
        return(Games);
    }
}

class Game(var gameId: Int, var name: String, var year: Int, var imgLocation: String) {

}