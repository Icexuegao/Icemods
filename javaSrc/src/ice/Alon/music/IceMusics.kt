package ice.Alon.music

import arc.Core
import arc.audio.Music
import arc.func.Cons
import ice.Alon.AlonContentLoad

class IceMusics {
    companion object IceMusics {
        lateinit var expressOne: Music
        fun load() {
            Core.assets.load("music\\ExpressOne.sThanks.ogg", Music::class.java).loaded = Cons { a -> expressOne = a }
        }
    }
}