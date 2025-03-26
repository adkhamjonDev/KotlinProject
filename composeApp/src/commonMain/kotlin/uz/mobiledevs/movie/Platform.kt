package uz.mobiledevs.movie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform