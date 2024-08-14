package cmunden.retrogamingwebiste.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@RestController
class GameController {
    @GetMapping("/getGames")
    @ResponseBody
    public fun getGames(): Game {
        val exampleGame = Game(1, "Test Game", 1991, "Placeholder")
        return(exampleGame);
    }
}

class Game(var gameId: Int, var name: String, var year: Int, var imgLocation: String) {

}